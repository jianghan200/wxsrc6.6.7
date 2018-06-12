package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.mm.modelvoice.k;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;

public final class o
{
  public k oFs = null;
  public al oFt = null;
  int oFu = 0;
  int oFv = 0;
  
  public final void reset()
  {
    this.oFs.we();
    x.d("MicroMsg.VoicePrintNoiseDetector", "stop record");
    this.oFt.SO();
    this.oFu = 0;
    this.oFv = 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */