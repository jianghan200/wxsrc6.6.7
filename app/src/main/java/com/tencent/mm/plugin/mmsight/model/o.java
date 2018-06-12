package com.tencent.mm.plugin.mmsight.model;

import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.x;

public final class o
{
  public int dfb = 1;
  public VideoTransPara lem;
  public int lfa = -1;
  public int lgI = -1;
  public boolean lgJ = false;
  public boolean lgK = false;
  public boolean lgL = true;
  public boolean lgM = false;
  g.b lgN;
  public boolean lgw = false;
  public int videoBitrate;
  
  public o() {}
  
  private o(int paramInt, VideoTransPara paramVideoTransPara)
  {
    this.lem = paramVideoTransPara;
    this.dfb = paramInt;
    this.videoBitrate = paramVideoTransPara.videoBitrate;
    this.lfa = paramVideoTransPara.width;
  }
  
  public static o a(int paramInt, VideoTransPara paramVideoTransPara)
  {
    Object localObject;
    switch (paramInt)
    {
    default: 
      localObject = null;
      return (o)localObject;
    case 1: 
      x.i("MicroMsg.RecoderParameter", "setToPresetConfig1");
      paramVideoTransPara = new o(2, paramVideoTransPara);
      paramVideoTransPara.lgK = false;
    }
    for (;;)
    {
      localObject = paramVideoTransPara;
      if (paramVideoTransPara == null) {
        break;
      }
      paramVideoTransPara.lgI = paramInt;
      return paramVideoTransPara;
      x.i("MicroMsg.RecoderParameter", "setToPresetConfig2");
      paramVideoTransPara = new o(2, paramVideoTransPara);
      paramVideoTransPara.lgK = false;
      paramVideoTransPara = paramVideoTransPara.bdZ().bdY();
      continue;
      x.i("MicroMsg.RecoderParameter", "setToPresetConfig3");
      paramVideoTransPara = new o(1, paramVideoTransPara);
      paramVideoTransPara.lgK = false;
      continue;
      x.i("MicroMsg.RecoderParameter", "setToPresetConfig4");
      paramVideoTransPara = new o(1, paramVideoTransPara);
      paramVideoTransPara.lgK = false;
      paramVideoTransPara = paramVideoTransPara.bdZ().bdY();
      continue;
      x.i("MicroMsg.RecoderParameter", "setToPresetConfig5");
      paramVideoTransPara = new o(2, paramVideoTransPara);
      paramVideoTransPara.lgK = true;
      paramVideoTransPara.lgJ = false;
      paramVideoTransPara = paramVideoTransPara.bdY();
      continue;
      x.i("MicroMsg.RecoderParameter", "setToPresetConfig6");
      paramVideoTransPara = new o(1, paramVideoTransPara);
      paramVideoTransPara.lgK = true;
      paramVideoTransPara = paramVideoTransPara.bdY();
      continue;
      x.i("MicroMsg.RecoderParameter", "setToPresetConfig7");
      paramVideoTransPara = new o(2, paramVideoTransPara);
      paramVideoTransPara.lgK = true;
      paramVideoTransPara = paramVideoTransPara.bea();
      paramVideoTransPara.lgJ = false;
      continue;
      x.i("MicroMsg.RecoderParameter", "setToPresetConfig8");
      paramVideoTransPara = new o(2, paramVideoTransPara);
      paramVideoTransPara.lgK = true;
      paramVideoTransPara = paramVideoTransPara.bea();
      paramVideoTransPara.lgJ = true;
      continue;
      paramVideoTransPara = new o(1, paramVideoTransPara);
      paramVideoTransPara.lgK = true;
      paramVideoTransPara = paramVideoTransPara.bea();
      paramVideoTransPara.lgJ = false;
      continue;
      x.i("MicroMsg.RecoderParameter", "setToPresetConfig10");
      paramVideoTransPara = new o(1, paramVideoTransPara);
      paramVideoTransPara.lgK = true;
      paramVideoTransPara = paramVideoTransPara.bea();
      paramVideoTransPara.lgJ = true;
      continue;
      x.i("MicroMsg.RecoderParameter", "setToPresetConfig10");
      paramVideoTransPara = new o(2, paramVideoTransPara);
      paramVideoTransPara.lgK = true;
      paramVideoTransPara = paramVideoTransPara.bea();
      paramVideoTransPara.lgJ = false;
      paramVideoTransPara = paramVideoTransPara.bdZ();
    }
  }
  
  public final o bdY()
  {
    this.lfa = 720;
    return this;
  }
  
  public final o bdZ()
  {
    this.videoBitrate = (this.lem.videoBitrate * 2);
    this.lgM = true;
    return this;
  }
  
  public final o bea()
  {
    this.lfa = (this.lem.width * 2);
    return this;
  }
  
  public final boolean beb()
  {
    return this.lem.width < this.lfa;
  }
  
  public final String toString()
  {
    return String.format("mediatype %s videoBitrate : %s isEnableLandscapeMode %s needRotateEachFrame %s isNeedRealtimeScale %s resolutionLimit %s videoParams %s", new Object[] { Integer.valueOf(this.dfb), Integer.valueOf(this.videoBitrate), Boolean.valueOf(this.lgw), Boolean.valueOf(this.lgJ), Boolean.valueOf(this.lgK), Integer.valueOf(this.lfa), this.lem });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */