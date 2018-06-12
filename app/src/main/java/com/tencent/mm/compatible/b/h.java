package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.audiofx.AutomaticGainControl;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  implements g.a
{
  private AutomaticGainControl dbr = null;
  
  @TargetApi(16)
  public h(AudioRecord paramAudioRecord)
  {
    boolean bool = AutomaticGainControl.isAvailable();
    x.d("MicroMsg.MMAutomaticGainControl", "available  " + bool);
    if (bool) {
      this.dbr = AutomaticGainControl.create(paramAudioRecord.getAudioSessionId());
    }
  }
  
  @TargetApi(16)
  public final boolean isAvailable()
  {
    return AutomaticGainControl.isAvailable();
  }
  
  @TargetApi(16)
  public final boolean yy()
  {
    if (this.dbr != null) {}
    try
    {
      int i = this.dbr.setEnabled(true);
      if (i == 0) {
        return true;
      }
      x.d("MicroMsg.MMAutomaticGainControl", "setEnabled failed " + i);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.MMAutomaticGainControl", localException, "", new Object[0]);
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/compatible/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */