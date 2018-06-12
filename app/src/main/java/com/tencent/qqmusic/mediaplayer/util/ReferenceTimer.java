package com.tencent.qqmusic.mediaplayer.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

public class ReferenceTimer
{
  private static final String TAG = "ReferenceTimer";
  private AtomicLong mBaseTime = new AtomicLong();
  
  public long getTimeInMs()
  {
    return SystemClock.uptimeMillis() - this.mBaseTime.get();
  }
  
  public void refreshTimeInMs(long paramLong)
  {
    this.mBaseTime.set(SystemClock.uptimeMillis());
    this.mBaseTime.addAndGet(-paramLong);
  }
  
  public void restart()
  {
    this.mBaseTime.set(SystemClock.uptimeMillis());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/util/ReferenceTimer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */