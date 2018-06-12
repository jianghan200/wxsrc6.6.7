package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  implements g.a
{
  private AcousticEchoCanceler daR = null;
  
  @TargetApi(16)
  public e(AudioRecord paramAudioRecord)
  {
    boolean bool = AcousticEchoCanceler.isAvailable();
    x.d("MicroMsg.MMAcousticEchoCanceler", "available  " + bool);
    if (bool) {
      this.daR = AcousticEchoCanceler.create(paramAudioRecord.getAudioSessionId());
    }
  }
  
  @TargetApi(16)
  public final boolean isAvailable()
  {
    return AcousticEchoCanceler.isAvailable();
  }
  
  @TargetApi(16)
  public final boolean yy()
  {
    if (this.daR != null) {}
    try
    {
      int i = this.daR.setEnabled(true);
      if (i == 0) {
        return true;
      }
      x.d("MicroMsg.MMAcousticEchoCanceler", "setEnabled failed " + i);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.MMAcousticEchoCanceler", localException, "", new Object[0]);
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/compatible/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */