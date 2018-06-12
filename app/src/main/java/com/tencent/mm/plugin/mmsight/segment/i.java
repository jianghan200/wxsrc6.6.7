package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;

public class i
  implements e
{
  protected long aBL;
  protected String elA = null;
  private int frameCount = 0;
  protected MediaExtractor ldo;
  protected MediaCodec ldq;
  protected MediaCodec.BufferInfo ljD = new MediaCodec.BufferInfo();
  protected e.a lkS;
  protected long lkn;
  protected int lkp;
  protected int llF;
  private byte[] llL;
  protected MediaFormat lll;
  protected int sampleSize;
  
  public i(MediaExtractor paramMediaExtractor, MediaFormat paramMediaFormat, int paramInt)
  {
    x.i("MicroMsg.MediaCodecTranscodeDecoder", "create MediaCodecTranscodeDecoder: %s, %s, %s", new Object[] { paramMediaExtractor, paramMediaFormat, Integer.valueOf(paramInt) });
    this.ldo = paramMediaExtractor;
    this.lll = paramMediaFormat;
    this.llF = paramInt;
  }
  
  private static MediaCodecInfo Hv(String paramString)
  {
    int k = MediaCodecList.getCodecCount();
    int i = 0;
    while (i < k)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
      if (!localMediaCodecInfo.isEncoder())
      {
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        int j = 0;
        while (j < arrayOfString.length)
        {
          if (arrayOfString[j].equalsIgnoreCase(paramString)) {
            return localMediaCodecInfo;
          }
          j += 1;
        }
      }
      i += 1;
    }
    return null;
  }
  
  public final void F(Runnable paramRunnable)
  {
    this.frameCount = 0;
    Object localObject1 = this.ldo;
    if (this.ldq == null) {
      x.i("MicroMsg.MediaCodecTranscodeDecoder", "input decoder is null");
    }
    Object localObject2;
    long l;
    for (boolean bool1 = true;; bool1 = false)
    {
      if (!bool1)
      {
        this.ldo.advance();
        if (this.ldo.getSampleTrackIndex() == this.llF) {
          break;
        }
        x.i("MicroMsg.MediaCodecTranscodeDecoder", "track index not match, break");
      }
      localObject1 = this.ldo;
      x.i("MicroMsg.MediaCodecTranscodeDecoder", "sendDecoderEOS");
      localObject2 = this.ldq.getInputBuffers();
      i = this.ldq.dequeueInputBuffer(60000L);
      if (i < 0)
      {
        x.i("MicroMsg.MediaCodecTranscodeDecoder", "check decoder input buffer index = %d count = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
        if (beX()) {}
      }
      else
      {
        if (i >= 0)
        {
          localObject2 = localObject2[i];
          ((ByteBuffer)localObject2).clear();
          this.sampleSize = ((MediaExtractor)localObject1).readSampleData((ByteBuffer)localObject2, 0);
          ((ByteBuffer)localObject2).position(0);
          l = ((MediaExtractor)localObject1).getSampleTime();
          if (i < 0) {
            break label549;
          }
          x.i("MicroMsg.MediaCodecTranscodeDecoder", "send EOS, decoderInputBufferIndex: %s", new Object[] { Integer.valueOf(i) });
          this.ldq.queueInputBuffer(i, 0, 0, l * 1000L, 4);
        }
        label212:
        beX();
      }
      ah.i(new i.1(this), 500L);
      paramRunnable.run();
      return;
      localObject2 = this.ldq.getInputBuffers();
      if (localObject2 != null) {
        break label258;
      }
    }
    label258:
    x.i("MicroMsg.MediaCodecTranscodeDecoder", "decoderInputByteBuffers size: %d", new Object[] { Integer.valueOf(localObject2.length) });
    int i = 0;
    int j;
    for (;;)
    {
      j = this.ldq.dequeueInputBuffer(60000L);
      if ((j >= 0) || (i >= 15)) {
        break label352;
      }
      l = bi.VG();
      bool1 = beX();
      x.i("MicroMsg.MediaCodecTranscodeDecoder", "drain cost1 %d", new Object[] { Long.valueOf(bi.bI(l)) });
      if (bool1)
      {
        bool1 = true;
        break;
      }
      i += 1;
    }
    label352:
    if (j >= 0)
    {
      localObject2 = localObject2[j];
      ((ByteBuffer)localObject2).clear();
      this.sampleSize = ((MediaExtractor)localObject1).readSampleData((ByteBuffer)localObject2, 0);
      ((ByteBuffer)localObject2).position(0);
      l = ((MediaExtractor)localObject1).getSampleTime();
      x.i("MicroMsg.MediaCodecTranscodeDecoder", "sampleTime: %s", new Object[] { Long.valueOf(l) });
      if ((this.sampleSize >= 0) && (l < this.lkn * 1000L)) {
        break label559;
      }
    }
    label475:
    label549:
    label559:
    for (bool1 = true;; bool1 = false)
    {
      x.i("MicroMsg.MediaCodecTranscodeDecoder", "sawInputEOS: %s", new Object[] { Boolean.valueOf(bool1) });
      localObject1 = this.ldq;
      int k = this.sampleSize;
      if (bool1)
      {
        i = 4;
        ((MediaCodec)localObject1).queueInputBuffer(j, 0, k, l, i);
      }
      for (;;)
      {
        l = bi.VG();
        boolean bool2 = beX();
        x.i("MicroMsg.MediaCodecTranscodeDecoder", "drain cost2 %d", new Object[] { Long.valueOf(bi.bI(l)) });
        if (!bool2) {
          break;
        }
        bool1 = true;
        break;
        i = 0;
        break label475;
        x.w("MicroMsg.MediaCodecTranscodeDecoder", "input buffer not available");
        bool1 = false;
      }
      x.w("MicroMsg.MediaCodecTranscodeDecoder", "input buffer not available");
      break label212;
    }
  }
  
  protected int a(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    x.i("MicroMsg.MediaCodecTranscodeDecoder", "selectColorFormat, mimeType: %s, codecInfo: %s", new Object[] { paramString, paramMediaCodecInfo });
    long l = bi.VG();
    paramString = paramMediaCodecInfo.getCapabilitiesForType(paramString);
    x.i("MicroMsg.MediaCodecTranscodeDecoder", "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bi.bI(l)) });
    x.i("MicroMsg.MediaCodecTranscodeDecoder", "color format length: %s", new Object[] { Integer.valueOf(paramString.colorFormats.length) });
    int i = 0;
    int k;
    for (int j = 0; i < paramString.colorFormats.length; j = k)
    {
      int m = paramString.colorFormats[i];
      x.i("MicroMsg.MediaCodecTranscodeDecoder", "capabilities colorFormat: %s", new Object[] { Integer.valueOf(m) });
      k = j;
      if (sW(m)) {
        if (m <= j)
        {
          k = j;
          if (m != 21) {}
        }
        else
        {
          k = m;
        }
      }
      i += 1;
    }
    x.i("MicroMsg.MediaCodecTranscodeDecoder", "codec: %s, colorFormat: %s", new Object[] { paramMediaCodecInfo.getName(), Integer.valueOf(j) });
    return j;
  }
  
  public final void a(e.a parama)
  {
    this.lkS = parama;
  }
  
  public final Point beI()
  {
    return new Point(this.lll.getInteger("width"), this.lll.getInteger("height"));
  }
  
  public int beL()
  {
    int i = this.lll.getInteger("color-format");
    x.i("MicroMsg.MediaCodecTranscodeDecoder", "src color format: %s", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    case 21: 
    case 2130706688: 
    default: 
      return 1;
    }
    return 2;
  }
  
  protected boolean beX()
  {
    if (this.ldq == null)
    {
      x.e("MicroMsg.MediaCodecTranscodeDecoder", "drainDecoder, decoder is null");
      return true;
    }
    Object localObject1 = this.ldq.getOutputBuffers();
    x.i("MicroMsg.MediaCodecTranscodeDecoder", "decoderOutputByteBuffers length: %s", new Object[] { Integer.valueOf(localObject1.length) });
    int i = this.ldq.dequeueOutputBuffer(this.ljD, 60000L);
    x.i("MicroMsg.MediaCodecTranscodeDecoder", "outputBufferIndex-->" + i);
    if (i == -1)
    {
      x.i("MicroMsg.MediaCodecTranscodeDecoder", "no output from decoder available, break");
      label97:
      return false;
    }
    if (i == -3)
    {
      localObject1 = this.ldq.getOutputBuffers();
      x.i("MicroMsg.MediaCodecTranscodeDecoder", "decoder output buffers changed");
    }
    for (;;)
    {
      int j = this.ldq.dequeueOutputBuffer(this.ljD, 60000L);
      i = j;
      if (j >= 0) {
        break;
      }
      break label97;
      if (i == -2)
      {
        this.lll = this.ldq.getOutputFormat();
        x.i("MicroMsg.MediaCodecTranscodeDecoder", "decoder output format changed: " + this.lll);
      }
      else if (i < 0)
      {
        x.w("MicroMsg.MediaCodecTranscodeDecoder", "unexpected result from decoder.dequeueOutputBuffer: " + i);
      }
      else
      {
        x.v("MicroMsg.MediaCodecTranscodeDecoder", "perform decoding");
        Object localObject2 = localObject1[i];
        if (localObject2 == null) {
          break label97;
        }
        long l1 = this.ljD.presentationTimeUs;
        if ((l1 < this.aBL * 1000L) && ((this.ljD.flags & 0x4) == 0))
        {
          this.ldq.releaseOutputBuffer(i, false);
          x.i("MicroMsg.MediaCodecTranscodeDecoder", "decoder pts: %s, not reach start: %s", new Object[] { Long.valueOf(l1), Long.valueOf(this.aBL * 1000L) });
          return false;
        }
        if (this.ljD.size != 0)
        {
          ((ByteBuffer)localObject2).position(this.ljD.offset);
          ((ByteBuffer)localObject2).limit(this.ljD.offset + this.ljD.size);
          long l2 = bi.VG();
          localObject1 = this.ljD;
          if (localObject2 == null) {
            x.e("MicroMsg.MediaCodecTranscodeDecoder", "processDecodeOutputBuffer error! byteBuffer is null");
          }
          for (;;)
          {
            x.v("MicroMsg.MediaCodecTranscodeDecoder", "processDecodeOutputBuffer %s", new Object[] { Long.valueOf(bi.bI(l2)) });
            this.ldq.releaseOutputBuffer(i, false);
            if ((this.lkn != 1L) && (l1 >= this.lkn * 1000L))
            {
              x.e("MicroMsg.MediaCodecTranscodeDecoder", "exceed endTimeMs");
              return true;
              this.frameCount += 1;
              if ((this.lkp > 1) && (this.frameCount % this.lkp == 0)) {
                continue;
              }
              if (this.llL == null) {
                this.llL = new byte[((ByteBuffer)localObject2).remaining()];
              }
              long l3 = bi.VG();
              try
              {
                this.lll = this.ldq.getOutputFormat();
                ((ByteBuffer)localObject2).get(this.llL, 0, ((ByteBuffer)localObject2).remaining());
                x.i("MicroMsg.MediaCodecTranscodeDecoder", "processDecodeOutputBuffer, byteBuffer: %s, bufferInfo: %s, size: %d cost %d", new Object[] { localObject2, localObject1, Integer.valueOf(((MediaCodec.BufferInfo)localObject1).size), Long.valueOf(bi.bI(l3)) });
                if (this.lkS != null) {
                  this.lkS.aB(this.llL);
                }
              }
              catch (Exception localException2)
              {
                for (;;)
                {
                  x.e("MicroMsg.MediaCodecTranscodeDecoder", "get output format error");
                }
              }
            }
          }
          if ((this.ljD.flags & 0x4) != 0)
          {
            x.i("MicroMsg.MediaCodecTranscodeDecoder", "receive end of stream");
            try
            {
              this.ldq.stop();
              this.ldq.release();
              this.ldq = null;
              return true;
            }
            catch (Exception localException1)
            {
              for (;;)
              {
                x.e("MicroMsg.MediaCodecTranscodeDecoder", "stop and release decoder error: %s", new Object[] { localException1.getMessage() });
              }
            }
          }
          return false;
        }
        this.ldq.releaseOutputBuffer(i, false);
      }
    }
  }
  
  public final void sV(int paramInt)
  {
    x.i("MicroMsg.MediaCodecTranscodeDecoder", "setFrameDropInterval: %s", new Object[] { Integer.valueOf(paramInt) });
    this.lkp = paramInt;
  }
  
  protected boolean sW(int paramInt)
  {
    switch (paramInt)
    {
    case 20: 
    default: 
      return false;
    }
    return true;
  }
  
  public final void stop()
  {
    if (this.ldq != null) {}
    try
    {
      x.i("MicroMsg.MediaCodecTranscodeDecoder", "stop decoder");
      this.ldq.stop();
      this.ldq.release();
      this.ldq = null;
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", localException, "stop decoder error: %s", new Object[] { localException.getMessage() });
    }
  }
  
  public final int t(String paramString, long paramLong1, long paramLong2)
  {
    this.elA = paramString;
    this.aBL = paramLong1;
    this.lkn = paramLong2;
    x.i("MicroMsg.MediaCodecTranscodeDecoder", "initDecoder() called with: format = [" + this.lll + "]");
    try
    {
      paramString = this.lll.getString("mime");
      this.ldq = MediaCodec.createDecoderByType(paramString);
      MediaCodecInfo localMediaCodecInfo = Hv(paramString);
      x.i("MicroMsg.MediaCodecTranscodeDecoder", "found codec: %s", new Object[] { localMediaCodecInfo });
      if (localMediaCodecInfo != null)
      {
        x.i("MicroMsg.MediaCodecTranscodeDecoder", "codec name: %s", new Object[] { localMediaCodecInfo.getName() });
        int i = a(localMediaCodecInfo, paramString);
        x.i("MicroMsg.MediaCodecTranscodeDecoder", "found colorFormat: %s", new Object[] { Integer.valueOf(i) });
        this.lll.setInteger("color-format", i);
      }
      this.ldq.configure(this.lll, null, null, 0);
      this.ldq.start();
      return 0;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", paramString, "Init decoder failed : %s", new Object[] { paramString.getMessage() });
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/mmsight/segment/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */