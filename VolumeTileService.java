package com.yourname.volumequick;

import android.content.Context;
import android.media.AudioManager;
import android.service.quicksettings.TileService;

/**
 * Quick Settings Tile service to show the system volume UI.
 * The user must add the tile manually in Quick Settings edit mode.
 */
public class VolumeTileService extends TileService {
    @Override
    public void onClick() {
        super.onClick();

        AudioManager am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        if (am != null) {
            am.adjustVolume(AudioManager.ADJUST_SAME, AudioManager.FLAG_SHOW_UI);
        }

        // TileService is transient; no forced exit needed.
    }
}
