package com.tencent.mm.plugin.sight.base;

import com.tencent.mm.sdk.platformtools.bi;

public final class a
{
  public int dQF = 0;
  public int height = 0;
  public int jdD = 0;
  public int ljG = 0;
  public int nbS = 0;
  public int videoBitrate = 0;
  public int width = 0;
  
  public final int bvB()
  {
    return bi.ge(this.jdD);
  }
  
  public final String toString()
  {
    return "[ videoDuration: " + this.jdD + " videoBitrate: " + this.videoBitrate + " width: " + this.width + " height: " + this.height + " frameRate: " + this.ljG + " audioChannel: " + this.nbS + " audioBitrate: " + this.dQF + "]";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sight/base/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */