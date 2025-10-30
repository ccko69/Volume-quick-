package com.yourname.volumequick;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/**
 * Launches the system volume UI and then terminates shortly after so the app doesn't linger.
 */
public class MainActivity extends Activity {
    // Short delay to let the system show the volume UI before we terminate.
    private static final long KILL_DELAY_MS = 150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AudioManager am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        if (am != null) {
            am.adjustVolume(AudioManager.ADJUST_SAME, AudioManager.FLAG_SHOW_UI);
        }

        // Close the Activity immediately so it won't remain in Recents
        finish();

        // Best-effort terminate the process shortly after so the app does not linger.
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Process.killProcess(Process.myPid());
            System.exit(0);
        }, KILL_DELAY_MS);
    }
              }
