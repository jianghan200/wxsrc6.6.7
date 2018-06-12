package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;

@Deprecated
@TargetApi(18)
public final class o
  implements e
{
  boolean bTv;
  private MediaMuxer ljr;
  private int ljs;
  private int ljt;
  long lju;
  
  public final boolean bev()
  {
    return false;
  }
  
  public final void c(MediaFormat paramMediaFormat)
  {
    try
    {
      if ((this.ljr != null) && (this.ljs == -1))
      {
        this.ljs = this.ljr.addTrack(paramMediaFormat);
        x.i("MicroMsg.MMSightSystemMediaMuxer", "addX264Track, x264TrackIndex: %s", new Object[] { Integer.valueOf(this.ljs) });
        if ((!this.bTv) && (this.ljs != -1) && (this.ljt != -1))
        {
          x.i("MicroMsg.MMSightSystemMediaMuxer", "start!");
          this.ljr.start();
          this.bTv = true;
        }
      }
      return;
    }
    catch (Exception paramMediaFormat)
    {
      for (;;)
      {
        x.e("MicroMsg.MMSightSystemMediaMuxer", "addX264Track error: %s", new Object[] { paramMediaFormat.getMessage() });
      }
    }
    finally {}
  }
  
  public final void d(MediaFormat paramMediaFormat)
  {
    try
    {
      if ((this.ljr != null) && (this.ljt == -1))
      {
        this.ljt = this.ljr.addTrack(paramMediaFormat);
        x.i("MicroMsg.MMSightSystemMediaMuxer", "addAACTrack, aacTrackIndex: %s", new Object[] { Integer.valueOf(this.ljt) });
        if ((!this.bTv) && (this.ljt != -1) && (this.ljs != -1))
        {
          x.i("MicroMsg.MMSightSystemMediaMuxer", "start!");
          this.ljr.start();
          this.bTv = true;
        }
      }
      return;
    }
    catch (Exception paramMediaFormat)
    {
      for (;;)
      {
        x.e("MicroMsg.MMSightSystemMediaMuxer", "addAACTrack error: %s", new Object[] { paramMediaFormat.getMessage() });
      }
    }
    finally {}
  }
  
  public final void f(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    try
    {
      if ((this.ljr != null) && (this.ljt != -1) && (this.bTv) && (paramByteBuffer != null) && (paramBufferInfo != null))
      {
        long l1 = paramBufferInfo.presentationTimeUs;
        paramBufferInfo.presentationTimeUs = ((System.nanoTime() - this.lju) / 1000L);
        long l2 = bi.VG();
        this.ljr.writeSampleData(this.ljt, paramByteBuffer, paramBufferInfo);
        x.v("MicroMsg.MMSightSystemMediaMuxer", "writeAACSampleData size: %s used %dms oldpts %s fix pts: %s", new Object[] { Integer.valueOf(paramBufferInfo.size), Long.valueOf(bi.bI(l2)), Long.valueOf(l1), Long.valueOf(paramBufferInfo.presentationTimeUs) });
      }
    }
    catch (Exception paramByteBuffer)
    {
      for (;;)
      {
        x.e("MicroMsg.MMSightSystemMediaMuxer", "writeAACSampleData error: %s", new Object[] { paramByteBuffer.getMessage() });
      }
    }
    finally {}
  }
  
  public final void g(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    int j = 1;
    for (;;)
    {
      try
      {
        if ((this.ljr == null) || (this.ljs == -1) || (!this.bTv)) {
          continue;
        }
        if (paramByteBuffer == null) {
          continue;
        }
        i = 1;
      }
      catch (Exception paramByteBuffer)
      {
        int i;
        long l1;
        long l2;
        x.e("MicroMsg.MMSightSystemMediaMuxer", "writeX264SampleData error: %s", new Object[] { paramByteBuffer.getMessage() });
        continue;
      }
      finally {}
      if ((j & i) != 0)
      {
        l1 = paramBufferInfo.presentationTimeUs;
        paramBufferInfo.presentationTimeUs = ((System.nanoTime() - this.lju) / 1000L);
        paramBufferInfo.flags = 1;
        l2 = bi.VG();
        this.ljr.writeSampleData(this.ljs, paramByteBuffer, paramBufferInfo);
        x.v("MicroMsg.MMSightSystemMediaMuxer", "writeAACSampleData size: %s used %dms oldpts %s fix pts: %s", new Object[] { Integer.valueOf(paramBufferInfo.size), Long.valueOf(bi.bI(l2)), Long.valueOf(l1), Long.valueOf(paramBufferInfo.presentationTimeUs) });
      }
      return;
      i = 0;
      break label179;
      j = 0;
      continue;
      label179:
      if (paramBufferInfo == null) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */