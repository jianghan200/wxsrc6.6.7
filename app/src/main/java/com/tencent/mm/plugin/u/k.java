package com.tencent.mm.plugin.u;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;

public final class k
  extends h
{
  public Surface aeJ;
  boolean ldO = false;
  private boolean ldP = false;
  boolean ldQ = false;
  private long ldR = 0L;
  long ldS = -1L;
  private int videoHeight;
  private int videoWidth;
  
  public k(g paramg, ag paramag)
  {
    super(paramg, paramag);
  }
  
  protected final boolean B(int paramInt, long paramLong)
  {
    boolean bool2 = false;
    x.d("MicroMsg.VideoTrackDataSource", "%s reset extractor flag[%d] needReset[%b]", new Object[] { avA(), Integer.valueOf(paramInt), Boolean.valueOf(this.ldg.ldb) });
    boolean bool1 = bool2;
    if (this.ldg.ldb)
    {
      bool1 = bool2;
      if (paramInt == 1)
      {
        bool1 = bool2;
        if (this.ldS != paramLong)
        {
          bool1 = w(paramLong, -1L);
          this.ldS = paramLong;
        }
      }
    }
    return bool1;
  }
  
  final boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    x.d("MicroMsg.VideoTrackDataSource", "%s start to process output buffer state %d time[%d, %d] index %d", new Object[] { avA(), Integer.valueOf(this.state), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) });
    if (d.sD(this.state))
    {
      x.i("MicroMsg.VideoTrackDataSource", "%s video track flush surface", new Object[] { avA() });
      paramMediaCodec.releaseOutputBuffer(paramInt, true);
      setState(4);
      return true;
    }
    if (d.sC(this.state))
    {
      paramLong2 = paramBufferInfo.presentationTimeUs / 1000L;
      l1 = paramLong1 - paramLong2;
      x.d("MicroMsg.VideoTrackDataSource", "%s start to handle precision seek[%d, %d] diff[%d]", new Object[] { avA(), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Long.valueOf(l1) });
      int i;
      if (l1 <= 30L)
      {
        i = 1;
        if (i == 0) {
          break label232;
        }
        x.i("MicroMsg.VideoTrackDataSource", "%s precision seek done to surface", new Object[] { avA() });
        paramMediaCodec.releaseOutputBuffer(paramInt, true);
        if (this.ldP)
        {
          setState(7);
          this.ldP = false;
        }
        this.ldP = true;
      }
      for (;;)
      {
        return true;
        i = 0;
        break;
        label232:
        paramMediaCodec.releaseOutputBuffer(paramInt, false);
      }
    }
    if (!d.sE(this.state))
    {
      x.i("MicroMsg.VideoTrackDataSource", "%s it no need process buffer now state %d", new Object[] { avA(), Integer.valueOf(this.state) });
      return false;
    }
    long l1 = paramBufferInfo.presentationTimeUs / 1000L;
    long l2 = SystemClock.elapsedRealtime();
    long l3 = l2 - paramLong2;
    long l4 = l1 - paramLong1 - l3;
    x.d("MicroMsg.VideoTrackDataSource", "%s earlyMs[%d] time[%d, %d, %d] sample[%d %d]", new Object[] { avA(), Long.valueOf(l4), Long.valueOf(l3), Long.valueOf(l2), Long.valueOf(paramLong2), Long.valueOf(paramLong1), Long.valueOf(l1) });
    if (l4 < -30L)
    {
      x.d("MicroMsg.VideoTrackDataSource", "%s finish to process but it too late to show video frame. throw now", new Object[] { avA() });
      paramMediaCodec.releaseOutputBuffer(paramInt, false);
      this.ldg.lcZ = 0L;
      return true;
    }
    if (l4 < 30L)
    {
      this.ldg.lcW = paramBufferInfo.presentationTimeUs;
      if (l4 <= 11L) {}
    }
    try
    {
      Thread.sleep(l4 - 10L);
      if (!d.sE(this.state))
      {
        x.i("MicroMsg.VideoTrackDataSource", "%s it no need process buffer now state %d", new Object[] { avA(), Integer.valueOf(this.state) });
        return false;
      }
      if (Math.abs(l1 - this.ldR) > 1000L)
      {
        x.i("MicroMsg.VideoTrackDataSource", "%s finish to process index[%d] time[%d] to surface", new Object[] { avA(), Integer.valueOf(paramInt), Long.valueOf(l1) });
        this.ldR = l1;
      }
      paramMediaCodec.releaseOutputBuffer(paramInt, true);
      return true;
      x.d("MicroMsg.VideoTrackDataSource", "%s finish to process but it too early now do nothing.", new Object[] { avA() });
      return false;
    }
    catch (Exception paramByteBuffer)
    {
      for (;;) {}
    }
  }
  
  final boolean a(MediaCodec paramMediaCodec)
  {
    if (paramMediaCodec == null) {
      return false;
    }
    if (this.aeJ == null)
    {
      x.w("MicroMsg.VideoTrackDataSource", "%s decoder configure surface but surface is null.", new Object[] { avA() });
      this.ldO = false;
      x.i("MicroMsg.VideoTrackDataSource", "%s handleDecoderBeforeStart", new Object[] { avA() });
      if (this.ldo != null) {
        break label87;
      }
    }
    label87:
    for (MediaFormat localMediaFormat = this.ldl;; localMediaFormat = this.ldo.getTrackFormat(this.ldn))
    {
      paramMediaCodec.configure(localMediaFormat, this.aeJ, null, 0);
      return false;
      this.ldO = true;
      break;
    }
  }
  
  protected final void b(MediaCodec paramMediaCodec)
  {
    x.i("MicroMsg.VideoTrackDataSource", "%s output format changed", new Object[] { avA() });
    paramMediaCodec.setVideoScalingMode(1);
  }
  
  protected final void b(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    super.b(paramMediaFormat, paramString, paramInt);
    this.videoHeight = paramMediaFormat.getInteger("height");
    this.videoWidth = paramMediaFormat.getInteger("width");
    if (paramMediaFormat.containsKey("rotation-degrees")) {
      paramInt = paramMediaFormat.getInteger("rotation-degrees");
    }
    for (int i = 1;; i = 0)
    {
      if ((Math.abs(paramInt) == 90) || (Math.abs(paramInt) == 270))
      {
        int j = this.videoWidth;
        this.videoWidth = this.videoHeight;
        this.videoHeight = j;
      }
      if (i != 0) {
        paramInt = 0;
      }
      this.ldh.obtainMessage(4, this.videoWidth, this.videoHeight, Integer.valueOf(paramInt)).sendToTarget();
      x.i("MicroMsg.VideoTrackDataSource", "%s video size[%d, %d] degrees[%d]", new Object[] { avA(), Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoHeight), Integer.valueOf(paramInt) });
      return;
      paramInt = SightVideoJNI.getMp4Rotate(this.path);
      x.w("MicroMsg.VideoTrackDataSource", "%s it don't contains rotation key. degrees [%d]", new Object[] { avA(), Integer.valueOf(paramInt) });
    }
  }
  
  @TargetApi(23)
  public final void bdD()
  {
    try
    {
      if (this.ldq != null) {
        this.ldq.setOutputSurface(this.aeJ);
      }
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.VideoTrackDataSource", localException, "%s change surface23 error [%s]", new Object[] { avA(), localException.toString() });
      bdE();
    }
  }
  
  public final void bdE()
  {
    x.i("MicroMsg.VideoTrackDataSource", "%s change surface below 23", new Object[] { avA() });
    if (this.ldq != null)
    {
      ll();
      w(this.ldg.lcW, -1L);
      bdy();
    }
  }
  
  final String type()
  {
    return "video";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/u/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */