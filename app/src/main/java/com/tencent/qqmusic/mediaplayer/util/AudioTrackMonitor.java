package com.tencent.qqmusic.mediaplayer.util;

import android.media.AudioTrack;
import java.lang.ref.WeakReference;

public class AudioTrackMonitor
{
  private static final boolean ENABLE = false;
  private static final String TAG = "AudioTrackMonitor";
  private WeakReference<AudioTrack> mAudioTrackRef = null;
  private StringBuilder mBuilder = new StringBuilder(100);
  private long mLastPosition = 0L;
  private long mLastTime = System.nanoTime();
  private int mLooperTime = 200;
  private Thread mMonitorThread = new AudioTrackMonitor.1(this, "Monitor-AudioTrack");
  private boolean mStop = false;
  
  public AudioTrackMonitor(AudioTrack paramAudioTrack)
  {
    this.mAudioTrackRef = new WeakReference(paramAudioTrack);
  }
  
  public void start() {}
  
  public void stop() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/util/AudioTrackMonitor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */