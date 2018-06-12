package com.tencent.mm.plugin.mmsight.model;

public final class p
{
  public static int lgO = 480;
  public static int lgP = 640;
  public int bYE;
  public int enM;
  public int fps;
  public int iSp;
  public int iSq;
  public int lgQ;
  public int lgR;
  public int lgS;
  public int lgT;
  public int lgU;
  public String lgV;
  public String lgW;
  public String lgX;
  public String lgY;
  public String lgZ;
  public int lha;
  public int lhb;
  
  public static p bec()
  {
    p localp = new p();
    localp.fps = 30;
    localp.bYE = 0;
    localp.lgR = lgP;
    localp.lgS = lgO;
    localp.iSq = lgP;
    localp.iSp = lgO;
    localp.lgQ = 327680;
    localp.lgT = 4;
    localp.lgU = 1;
    localp.lgV = "/sdcard/2.yuv";
    localp.lgZ = "/sdcard/2.mp4";
    localp.lgW = "/sdcard/2.pcm";
    localp.lgY = "/sdcard/2.x264";
    localp.lha = 0;
    localp.enM = 0;
    localp.lhb = 0;
    return localp;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("fps=").append(this.fps).append('\n');
    localStringBuilder.append("width=").append(this.iSp).append('\n');
    localStringBuilder.append("height=").append(this.iSq).append('\n');
    localStringBuilder.append("bitrate=").append(this.lgQ).append('\n');
    localStringBuilder.append("rotate=").append(this.bYE).append('\n');
    localStringBuilder.append("yuvWidth=").append(this.lgS).append('\n');
    localStringBuilder.append("yuvHeight=").append(this.lgR).append('\n');
    localStringBuilder.append("x264Speed=").append(this.lgT).append('\n');
    localStringBuilder.append("x264Quality=").append(this.lgU).append('\n');
    localStringBuilder.append("yuvFile=").append(this.lgV).append('\n');
    localStringBuilder.append("pcmFile=").append(this.lgW).append('\n');
    localStringBuilder.append("thuFile=").append(this.lgX).append('\n');
    localStringBuilder.append("x264File=").append(this.lgY).append('\n');
    localStringBuilder.append("mp4File=").append(this.lgZ).append('\n');
    localStringBuilder.append("videoFrameCnt=").append(this.lha).append('\n');
    localStringBuilder.append("videoLength=").append(this.enM).append('\n');
    localStringBuilder.append("cameraCount=").append(this.lhb).append('\n');
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */