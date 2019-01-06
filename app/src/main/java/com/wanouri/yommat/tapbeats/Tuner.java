package com.wanouri.yommat.tapbeats;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class Tuner {

    private int sound_id[];

    int[] ids = new int[] {R.raw.guitar1, R.raw.guitar2, R.raw.guitar3, R.raw.guitar4, R.raw.guitar5, R.raw.guitar6 };

    private SoundPool sp[] = new SoundPool[ids.length];

    /**
     * Constructor
     * @param context
     */
    public Tuner(Context context) {

        sound_id = new int[ids.length];

        for (int i = 0; i < ids.length; i++){
            sp[i] = new SoundPool( 1,AudioManager.STREAM_MUSIC, 0 );
            sound_id[i] = sp[i].load(context, (int)(ids[i]), 1 );
        }
    }

    /**
     * play
     * @param i
     */
    public void play(int i) {
        sp[i].play(sound_id[i], 1.0F, 1.0F, 0, 0, 1.0F);
    }
}
