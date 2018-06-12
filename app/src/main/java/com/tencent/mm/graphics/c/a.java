package com.tencent.mm.graphics.c;

import com.tencent.mm.graphics.b.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends Enum<a>
{
  public static void a(long paramLong, a parama)
  {
    if (parama == null) {
      return;
    }
    x.i("MicroMsg.ImageReporter", "alvinluo reportImageDecodeInfo sessionId: %d, from: %s, imageType: %d, w: %d, h: %d, fileSize: %d, orientation: %d, decodeResult: %d, decodeTime: %d, fullSampleSzie: %d, onlyDecodeTime: %d", new Object[] { Long.valueOf(paramLong), parama.bXS, Integer.valueOf(parama.djw), Integer.valueOf(parama.width), Integer.valueOf(parama.height), Integer.valueOf(parama.fileSize), Integer.valueOf(parama.orientation), Integer.valueOf(parama.djx), Integer.valueOf(parama.djy), Integer.valueOf(parama.Zk), Integer.valueOf(parama.djz) });
    h.mEJ.h(15467, new Object[] { Long.valueOf(paramLong), parama.bXS, Integer.valueOf(parama.djw), Integer.valueOf(parama.width), Integer.valueOf(parama.height), Integer.valueOf(parama.fileSize), Integer.valueOf(parama.orientation), Integer.valueOf(parama.djx), Integer.valueOf(parama.djy), Integer.valueOf(parama.Zk), Integer.valueOf(parama.djz) });
  }
  
  public static void a(b paramb)
  {
    long l = System.currentTimeMillis();
    if (paramb != null)
    {
      x.i("MicroMsg.ImageReporter", "alvinluo reportPerformance sessionId: %d, fps.maxFps: %f, fps.minFps: %f, fps.averageFps: %f, memory.memoryUsedWhenInit: %f, memory.currentMaxUsedMemory: %f, memory.currentMinUsedMemory: %f, memory.averUsed: %f, memory.currentVarianceSum: %f", new Object[] { Long.valueOf(l), Double.valueOf(0.0D), Double.valueOf(0.0D), Double.valueOf(0.0D), Double.valueOf(paramb.djc), Double.valueOf(paramb.djd), Double.valueOf(paramb.dje), Double.valueOf(paramb.djg), Double.valueOf(paramb.djf) });
      h.mEJ.h(15471, new Object[] { Long.valueOf(l), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf((int)paramb.djc), Integer.valueOf((int)paramb.djd), Integer.valueOf((int)paramb.djg), Integer.valueOf((int)paramb.djf), Integer.valueOf(1) });
    }
  }
  
  public static final class a
  {
    public int Zk;
    public String bXS;
    public int djw;
    public int djx;
    public int djy;
    public int djz;
    public int fileSize;
    public int height;
    public String imagePath;
    public int orientation;
    public int width;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/graphics/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */