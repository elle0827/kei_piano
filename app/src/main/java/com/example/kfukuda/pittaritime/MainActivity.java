package com.example.kfukuda.pittaritime;


import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool mSoundPool;
    private int[] mSoundID;
    private int[] mSoundResource= new int[]{
            R.raw.tho,
            R.raw.re,
            R.raw.mi,
            R.raw.fa,
            R.raw.so,
            R.raw.ra,
            R.raw.si,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    };
        protected void onResune() {
            super.onResume();

            mSoundPool = new SoundPool(mSoundResource.length, AudioManager.STREAM_MUSIC, 0);

            mSoundID = new int[mSoundResource.length];

            for (int i = 0; i < mSoundResource.length; i++) {
                mSoundID[i] = mSoundPool.load(getApplicationContext(), mSoundResource[i], 0);
            }
        }
    protected void onDestroy() {
        super.onDestroy();

        mSoundPool.release();
    }

        public void tho(View v){
            mSoundPool.play(mSoundID[0],1.0F,1.0F,0,0,1.0F);
        }
        public void re(View v){
            mSoundPool.play(mSoundID[1],1.0F,1.0F,0,0,1.0F);
        }
        public void mi(View v){ mSoundPool.play(mSoundID[2],1.0F,1.0F,0,0,1.0F); }
        public void fa(View v){
            mSoundPool.play(mSoundID[3],1.0F,1.0F,0,0,1.0F);
        }
        public void so(View v){
            mSoundPool.play(mSoundID[4],1.0F,1.0F,0,0,1.0F);
        }
        public void ra(View v){ mSoundPool.play(mSoundID[5],1.0F,1.0F,0,0,1.0F);
    }

    }







