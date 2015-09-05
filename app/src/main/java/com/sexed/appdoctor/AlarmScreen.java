package com.sexed.appdoctor;

import java.util.Random;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;

public class AlarmScreen extends Activity {
	
	static int n=0,k=0;
	public final String TAG = this.getClass().getSimpleName();

	private WakeLock mWakeLock;
	private MediaPlayer mPlayer;

	private static final int WAKELOCK_TIMEOUT = 60 * 1000;
	
	private NotificationManager mNManager;
	private static final int NOTIFY_ID=1100;
	
	TextView tv0,tv,tv2;
	
	@SuppressWarnings( "deprecation" )
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alarm_screen);
		tv=(TextView)findViewById(R.id.quote2);
		tv0=(TextView)findViewById(R.id.quote1);
		tv2=(TextView)findViewById(R.id.quote3);

		
		tv0.setTextColor(Color.argb(240, 219, 69, 4));
		tv.setTextColor(Color.argb(240, 219, 69, 4));
		tv2.setTextColor(Color.argb(240, 219, 69, 4));
    
		//generating ramdom count
		Random r=new Random();
		int k= r.nextInt(40-0)+0;
		
		tv.setText(inspQuoteData.quotes[k]);
		
        String ns = Context.NOTIFICATION_SERVICE;
		mNManager = (NotificationManager) getSystemService(ns);
		final Notification msg = new Notification(R.drawable.ic_launcher,"your daily quote:)",System.currentTimeMillis());
		Context context = getApplicationContext();
		CharSequence contentTitle = "Your daily quote";
		CharSequence contentText = inspQuoteData.quotes[k];
		Intent msgIntent = new Intent(context,SetNotification.class);
		
		//sending count data to SetNotification 
		msgIntent.putExtra("xcount", k);
		msgIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);
		
		PendingIntent intent =PendingIntent.getActivity(AlarmScreen.this,0, msgIntent,PendingIntent.FLAG_UPDATE_CURRENT);
		
		msg.defaults |= Notification.DEFAULT_SOUND;
		msg.flags |= Notification.FLAG_AUTO_CANCEL;
		msg.setLatestEventInfo(context,contentTitle, contentText, intent);
		mNManager.notify(NOTIFY_ID, msg);
		
		String tone = getIntent().getStringExtra(AlarmManagerHelper.TONE);
		
		
	
		//Play alarm tone
		mPlayer = new MediaPlayer();
		try {
			if (tone != null && !tone.equals("")) {
				Uri toneUri = Uri.parse(tone);
				if (toneUri != null) {
					mPlayer.setDataSource(this, toneUri);
					mPlayer.setAudioStreamType(AudioManager.STREAM_ALARM);
					mPlayer.setLooping(true);
					mPlayer.prepare();
					mPlayer.start();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Ensure wakelock release
		Runnable releaseWakelock = new Runnable() {

			@Override
			public void run() {
				getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
				getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
				getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
				getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);

				if (mWakeLock != null && mWakeLock.isHeld()) {
					mWakeLock.release();
				}
			}
		};

		new Handler().postDelayed(releaseWakelock, WAKELOCK_TIMEOUT);
		
		//delay for stopping media player 
		new CountDownTimer(5000,1000) {
					
		    @Override
			public void onTick(long millisUntilFinished) {
						
						
			}
					
			@Override
			public void onFinish() {
					
				mPlayer.stop();
				}
			}.start();
				
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected void onResume() {
		super.onResume();

		// Set the window to keep screen on
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);

		// Acquire wakelock
		PowerManager pm = (PowerManager) getApplicationContext().getSystemService(Context.POWER_SERVICE);
		if (mWakeLock == null) {
			mWakeLock = pm.newWakeLock((PowerManager.FULL_WAKE_LOCK | PowerManager.SCREEN_BRIGHT_WAKE_LOCK | PowerManager.ACQUIRE_CAUSES_WAKEUP), TAG);
		}

		if (!mWakeLock.isHeld()) {
			mWakeLock.acquire();
			Log.i(TAG, "Wakelock aquired!!");
		}

	}

	@Override
	protected void onPause() {
		super.onPause();

		if (mWakeLock != null && mWakeLock.isHeld()) {
			mWakeLock.release();
		}
	}
}