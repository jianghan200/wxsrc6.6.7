package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Point;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  implements e
{
  private long aBL;
  private boolean dRn = false;
  private int frameCount = 0;
  private e.a lkS;
  private String lkm;
  private long lkn;
  private byte[] lko = null;
  private int lkp;
  
  public final void F(Runnable paramRunnable)
  {
    x.i("MicroMsg.FFMpegTranscodeDecoder", "startDecodeBlockLoop");
    this.dRn = true;
    this.frameCount = 0;
    for (;;)
    {
      if (!this.dRn) {
        return;
      }
      long l = bi.VG();
      this.lko = MP4MuxerJNI.ffmpegGetNextVideoFrameData(this.lko);
      x.d("MicroMsg.FFMpegTranscodeDecoder", "ffmpegGetNextVideoFrameData used %sms", new Object[] { Long.valueOf(bi.bI(l)) });
      boolean bool = MP4MuxerJNI.ffmpegCheckIfReachEndTimestamp();
      if ((this.lko == null) || (bool))
      {
        x.e("MicroMsg.FFMpegTranscodeDecoder", "ret buffer is null or reachEnd? %s", new Object[] { Boolean.valueOf(bool) });
        this.dRn = false;
        paramRunnable.run();
        return;
      }
      this.frameCount += 1;
      if (((this.lkp <= 1) || (this.frameCount % this.lkp != 0)) && (this.lkS != null)) {
        this.lkS.aB(this.lko);
      }
    }
  }
  
  public final void a(e.a parama)
  {
    this.lkS = parama;
  }
  
  public final Point beI()
  {
    return new Point(MP4MuxerJNI.ffmpegGetVideoWidth(), MP4MuxerJNI.ffmpegGetVideoHeight());
  }
  
  public final int beL()
  {
    return 2;
  }
  
  public final void sV(int paramInt)
  {
    x.i("MicroMsg.FFMpegTranscodeDecoder", "setFrameDropInterval: %s", new Object[] { Integer.valueOf(paramInt) });
    this.lkp = paramInt;
  }
  
  public final void stop()
  {
    x.i("MicroMsg.FFMpegTranscodeDecoder", "stop, start: %s", new Object[] { Boolean.valueOf(this.dRn) });
    this.dRn = false;
  }
  
  public final int t(String paramString, long paramLong1, long paramLong2)
  {
    x.i("MicroMsg.FFMpegTranscodeDecoder", "initDecoder, srcFilePath: %s, start: %s, end: %s", new Object[] { paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    this.lkm = paramString;
    this.aBL = paramLong1;
    this.lkn = paramLong2;
    if (!bi.oW(paramString))
    {
      long l = bi.VG();
      int i = MP4MuxerJNI.ffmpegOpenAndSeekFile(paramString, paramLong1 * 1000.0D, paramLong2 * 1000.0D);
      x.i("MicroMsg.FFMpegTranscodeDecoder", "ffmpegOpenAndSeekFile used %sms", new Object[] { Long.valueOf(bi.bI(l)) });
      return i;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/mmsight/segment/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */