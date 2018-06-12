package com.tencent.mm.plugin.mmsight.segment;

import android.annotation.TargetApi;
import android.graphics.ImageFormat;
import android.media.Image;
import android.media.Image.Plane;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;

@TargetApi(21)
public final class j
  extends i
{
  public static String TAG = "MicroMsg.MediaCodecTranscodeDecoder21";
  
  public j(MediaExtractor paramMediaExtractor, MediaFormat paramMediaFormat, int paramInt)
  {
    super(paramMediaExtractor, paramMediaFormat, paramInt);
    x.i(TAG, "init ");
  }
  
  private static byte[] a(Image paramImage)
  {
    int j = paramImage.getFormat();
    int i3 = paramImage.getWidth();
    int i4 = paramImage.getHeight();
    int i = 0;
    paramImage = paramImage.getPlanes();
    int k = i3 * i4 * ImageFormat.getBitsPerPixel(j) / 8;
    x.i(TAG, "planes len %d, datalen: %s width %d height %d format %d", new Object[] { Integer.valueOf(paramImage.length), Integer.valueOf(k), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(j) });
    byte[] arrayOfByte1 = com.tencent.mm.plugin.mmsight.model.a.j.lin.i(Integer.valueOf(k));
    k = 0;
    while (k < paramImage.length)
    {
      ByteBuffer localByteBuffer = paramImage[k].getBuffer();
      int i5 = paramImage[k].getRowStride();
      int i6 = paramImage[k].getPixelStride();
      int m;
      if (k == 0)
      {
        m = i3;
        if (k != 0) {
          break label292;
        }
      }
      byte[] arrayOfByte2;
      int i1;
      label292:
      for (int n = i4;; n = i4 / 2)
      {
        x.v(TAG, "row planes rowStride %d w %d h %d pixelStride %d", new Object[] { Integer.valueOf(i5), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i6) });
        arrayOfByte2 = com.tencent.mm.plugin.mmsight.model.a.j.lin.i(Integer.valueOf(i5));
        i1 = 0;
        for (;;)
        {
          if (i1 >= n) {
            break label379;
          }
          j = ImageFormat.getBitsPerPixel(35) / 8;
          if (i6 != j) {
            break;
          }
          j *= m;
          localByteBuffer.get(arrayOfByte1, i, j);
          if (n - i1 != 1) {
            localByteBuffer.position(localByteBuffer.position() + i5 - j);
          }
          i += j;
          i1 += 1;
        }
        m = i3 / 2;
        break;
      }
      if (n - i1 == 1) {
        localByteBuffer.get(arrayOfByte2, 0, i3 - i6 + 1);
      }
      for (;;)
      {
        int i2 = 0;
        j = i;
        for (;;)
        {
          i = j;
          if (i2 >= m) {
            break;
          }
          arrayOfByte1[j] = arrayOfByte2[(i2 * i6)];
          i2 += 1;
          j += 1;
        }
        localByteBuffer.get(arrayOfByte2, 0, i5);
      }
      label379:
      com.tencent.mm.plugin.mmsight.model.a.j.lin.F(arrayOfByte2);
      k += 1;
    }
    return arrayOfByte1;
  }
  
  protected final int a(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    x.i(TAG, "selectColorFormat, mimeType: %s, codecInfo: %s", new Object[] { paramString, paramMediaCodecInfo });
    long l = bi.VG();
    paramString = paramMediaCodecInfo.getCapabilitiesForType(paramString);
    x.i(TAG, "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bi.bI(l)) });
    x.i(TAG, "color format length: %s", new Object[] { Integer.valueOf(paramString.colorFormats.length) });
    int i = 0;
    int k;
    for (int j = 0; i < paramString.colorFormats.length; j = k)
    {
      int m = paramString.colorFormats[i];
      x.i(TAG, "capabilities colorFormat: %s", new Object[] { Integer.valueOf(m) });
      k = j;
      if (sW(m)) {
        if (m <= j)
        {
          k = j;
          if (m != 2135033992) {}
        }
        else
        {
          k = m;
        }
      }
      i += 1;
    }
    x.i(TAG, "codec: %s, colorFormat: %s", new Object[] { paramMediaCodecInfo.getName(), Integer.valueOf(j) });
    return j;
  }
  
  public final int beL()
  {
    return 2;
  }
  
  protected final boolean beX()
  {
    if (this.ldq == null)
    {
      x.e(TAG, "drainDecoder, decoder is null");
      return true;
    }
    int i = this.ldq.dequeueOutputBuffer(this.ljD, 60000L);
    x.i(TAG, "outputBufferIndex-->" + i);
    if (i == -1)
    {
      x.i(TAG, "no output from decoder available, break");
      label67:
      return false;
    }
    if (i == -3) {
      x.i(TAG, "decoder output buffers changed");
    }
    for (;;)
    {
      int j = this.ldq.dequeueOutputBuffer(this.ljD, 60000L);
      i = j;
      if (j >= 0) {
        break;
      }
      break label67;
      if (i == -2)
      {
        this.lll = this.ldq.getOutputFormat();
        x.i(TAG, "decoder output format changed: " + this.lll);
      }
      else if (i < 0)
      {
        x.w(TAG, "unexpected result from decoder.dequeueOutputBuffer: " + i);
      }
      else
      {
        x.v(TAG, "perform decoding");
        long l = bi.VG();
        byte[] arrayOfByte = a(this.ldq.getOutputImage(i));
        x.v(TAG, "perform decoding costImage %s", new Object[] { Long.valueOf(bi.bI(l)) });
        if (arrayOfByte == null) {
          break label67;
        }
        if (arrayOfByte.length != 0)
        {
          MediaCodec.BufferInfo localBufferInfo = this.ljD;
          if (arrayOfByte == null) {
            x.e(TAG, "processDecodeOutputBuffer error! byteBuffer is null");
          }
          for (;;)
          {
            this.ldq.releaseOutputBuffer(i, false);
            l = this.ljD.presentationTimeUs;
            if ((this.lkn == 1L) || (l < this.lkn * 1000L)) {
              break;
            }
            x.e(TAG, "exceed endTimeMs");
            return true;
            x.i(TAG, "processDecodeOutputBuffer, byteBuffer: %s, bufferInfo: %s, size: %d", new Object[] { arrayOfByte, localBufferInfo, Integer.valueOf(localBufferInfo.size) });
            this.lll = this.ldq.getOutputFormat();
            if (this.lkS != null) {
              this.lkS.aB(arrayOfByte);
            }
          }
          if ((this.ljD.flags & 0x4) != 0)
          {
            x.i(TAG, "receive end of stream");
            try
            {
              this.ldq.stop();
              this.ldq.release();
              this.ldq = null;
              return true;
            }
            catch (Exception localException)
            {
              x.e(TAG, "stop and release decoder error: %s", new Object[] { localException.getMessage() });
              return true;
            }
          }
          return false;
        }
        this.ldq.releaseOutputBuffer(i, false);
      }
    }
  }
  
  protected final boolean sW(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/mmsight/segment/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */