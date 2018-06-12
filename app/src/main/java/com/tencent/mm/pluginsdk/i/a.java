package com.tencent.mm.pluginsdk.i;

@Deprecated
public final class a
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
  
  public static a ccN()
  {
    a locala = new a();
    locala.fps = 30;
    locala.bYE = 0;
    locala.lgR = 640;
    locala.lgS = 480;
    locala.iSq = 640;
    locala.iSp = 480;
    locala.lgQ = 1440000;
    locala.lgT = 1;
    locala.lgU = 4;
    locala.lgV = "/sdcard/1.yuv";
    locala.lgZ = "/sdcard/1.mp4";
    locala.lgW = "/sdcard/1.pcm";
    locala.lgY = "/sdcard/1.x264";
    locala.lha = 0;
    locala.enM = 0;
    locala.lhb = 0;
    return locala;
  }
  
  public static a ccO()
  {
    a locala = new a();
    locala.fps = 30;
    locala.bYE = 0;
    locala.lgR = lgP;
    locala.lgS = lgO;
    locala.iSq = lgP;
    locala.iSp = lgO;
    locala.lgQ = 327680;
    locala.lgT = 4;
    locala.lgU = 1;
    locala.lgV = "/sdcard/2.yuv";
    locala.lgZ = "/sdcard/2.mp4";
    locala.lgW = "/sdcard/2.pcm";
    locala.lgY = "/sdcard/2.x264";
    locala.lha = 0;
    locala.enM = 0;
    locala.lhb = 0;
    return locala;
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */