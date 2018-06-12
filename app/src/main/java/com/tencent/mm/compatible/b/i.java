package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.audiofx.NoiseSuppressor;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  implements g.a
{
  private NoiseSuppressor dbs = null;
  
  @TargetApi(16)
  public i(AudioRecord paramAudioRecord)
  {
    boolean bool = NoiseSuppressor.isAvailable();
    x.d("MicroMsg.MMNoiseSuppressor", "available  " + bool);
    if (bool) {
      this.dbs = NoiseSuppressor.create(paramAudioRecord.getAudioSessionId());
    }
  }
  
  @TargetApi(16)
  public final boolean isAvailable()
  {
    return NoiseSuppressor.isAvailable();
  }
  
  @TargetApi(16)
  public final boolean yy()
  {
    if (this.dbs != null) {}
    try
    {
      int i = this.dbs.setEnabled(true);
      if (i == 0) {
        return true;
      }
      x.d("MicroMsg.MMNoiseSuppressor", "setEnabled failed " + i);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.MMNoiseSuppressor", localException, "", new Object[0]);
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/compatible/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */