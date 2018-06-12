package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.k;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aa.a;
import java.nio.ByteBuffer;

@TargetApi(16)
public class r
  implements f
{
  private ByteBuffer[] agE;
  private ByteBuffer[] apO;
  boolean bDs = false;
  boolean bTv = false;
  private int bitrate = 0;
  private long dkh = 0L;
  private int fau;
  private int fav;
  int frameCount;
  int kGn;
  int kGo;
  boolean lgJ = false;
  protected MediaCodec lhN;
  private int lhV = -1;
  private o lhZ;
  int lhv;
  a ljA = new a(this.ljI);
  protected MediaFormat ljB;
  private int ljC = -1;
  private MediaCodec.BufferInfo ljD;
  private boolean ljE = false;
  private int ljF;
  private int ljG;
  f.a ljH;
  private a.a ljI = new r.1(this);
  int ljw = -1;
  int ljx = -1;
  int ljy = -1;
  int ljz = -1;
  long startTime = 0L;
  
  public r(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
  {
    this.fau = paramInt1;
    this.fav = paramInt2;
    x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "create MMSightYUVMediaCodecRecorder, init targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "create MMSightYUVMediaCodecRecorder, after align 16, targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    this.kGn = paramInt3;
    this.kGo = paramInt4;
    this.ljG = paramInt7;
    this.ljF = paramInt6;
    this.lhZ = null;
    this.ljD = new MediaCodec.BufferInfo();
    this.bitrate = paramInt5;
    this.lgJ = paramBoolean;
    x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "create BigSightMediaCodecYUVRecorder, frameWidth: %s, frameHeight: %s, targetWidth: %s, targetHeight: %s, bitrate: %s, needRotateEachFrame: %s, muxer: %s", new Object[] { Integer.valueOf(this.fau), Integer.valueOf(this.fav), Integer.valueOf(this.kGn), Integer.valueOf(this.kGo), Integer.valueOf(paramInt5), Boolean.valueOf(paramBoolean), null });
  }
  
  private int beE()
  {
    long l1 = bi.VG();
    int k = MediaCodecList.getCodecCount();
    int i = 0;
    MediaCodecInfo localMediaCodecInfo;
    Object localObject1;
    int j;
    if (i < k)
    {
      localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
      if (localMediaCodecInfo.isEncoder())
      {
        localObject1 = localMediaCodecInfo.getSupportedTypes();
        j = 0;
        label39:
        if (j < localObject1.length) {
          if (!localObject1[j].equalsIgnoreCase("video/avc")) {}
        }
      }
    }
    for (;;)
    {
      if (localMediaCodecInfo != null) {
        break label95;
      }
      x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "Unable to find an appropriate codec for video/avc");
      k.bdW();
      return -1;
      j += 1;
      break label39;
      i += 1;
      break;
      localMediaCodecInfo = null;
    }
    label95:
    x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "found codec: %s, used %sms", new Object[] { localMediaCodecInfo.getName(), Long.valueOf(bi.bI(l1)) });
    l1 = bi.VG();
    if (CaptureMMProxy.getInstance() != null)
    {
      i = CaptureMMProxy.getInstance().getInt(aa.a.sUM, -1);
      x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "saveColorFormat: %s", new Object[] { Integer.valueOf(i) });
      if (i > 0)
      {
        this.lhv = i;
        l1 = bi.bI(l1);
        if ((this.lhv > 0) && (l1 > 200L) && (CaptureMMProxy.getInstance() != null)) {
          CaptureMMProxy.getInstance().set(aa.a.sUM, Integer.valueOf(this.lhv));
        }
        x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "found colorFormat: %s, used %sms", new Object[] { Integer.valueOf(this.lhv), Long.valueOf(l1) });
        l1 = bi.VG();
        if (!this.lgJ) {
          break label765;
        }
        if ((this.ljw != 180) && (this.ljw != 0)) {
          break label749;
        }
        i = this.kGn;
        label283:
        if ((this.ljw != 180) && (this.ljw != 0)) {
          break label757;
        }
        j = this.kGo;
        label305:
        this.ljB = MediaFormat.createVideoFormat("video/avc", i, j);
        label316:
        x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "createVideoFormat used %sms", new Object[] { Long.valueOf(bi.bI(l1)) });
        if ((localMediaCodecInfo != null) && (!d.fR(23))) {
          break label925;
        }
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = localMediaCodecInfo.getCapabilitiesForType("video/avc");
        MediaCodecInfo.CodecProfileLevel localCodecProfileLevel;
        int m;
        int n;
        if (localObject1 != null)
        {
          localObject1 = ((MediaCodecInfo.CodecCapabilities)localObject1).profileLevels;
          if (localObject1 != null)
          {
            localCodecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            localCodecProfileLevel.level = 0;
            localCodecProfileLevel.profile = 0;
            k = localObject1.length;
            i = 0;
            if (i < k)
            {
              Object localObject2 = localObject1[i];
              m = ((MediaCodecInfo.CodecProfileLevel)localObject2).profile;
              n = ((MediaCodecInfo.CodecProfileLevel)localObject2).level;
              x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "profile: %s, level: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(n) });
            }
          }
        }
        switch (m)
        {
        case 1: 
          if ((j != 0) && (m >= localCodecProfileLevel.profile) && (n >= localCodecProfileLevel.level))
          {
            localCodecProfileLevel.profile = m;
            localCodecProfileLevel.level = n;
          }
          i += 1;
          continue;
          long l2 = bi.VG();
          localObject1 = localMediaCodecInfo.getCapabilitiesForType("video/avc");
          x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bi.bI(l2)) });
          x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "color format length: %s", new Object[] { Integer.valueOf(((MediaCodecInfo.CodecCapabilities)localObject1).colorFormats.length) });
          i = 0;
          j = 0;
          if (j < ((MediaCodecInfo.CodecCapabilities)localObject1).colorFormats.length)
          {
            n = localObject1.colorFormats[j];
            x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "capabilities colorFormat: %s", new Object[] { Integer.valueOf(n) });
            switch (n)
            {
            default: 
              m = 0;
              k = i;
              if (m != 0) {
                if (n <= i)
                {
                  k = i;
                  if (n != 21) {}
                }
                else
                {
                  k = n;
                }
              }
              j += 1;
              i = k;
              break;
            case 19: 
            case 21: 
            case 2130706688: 
              m = 1;
              break;
            }
          }
          x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "codec: %s, colorFormat: %s", new Object[] { localMediaCodecInfo.getName(), Integer.valueOf(i) });
          break;
          i = this.kGo;
          break label283;
          j = this.kGn;
          break label305;
          if ((this.ljw == 180) || (this.ljw == 0))
          {
            i = this.kGo;
            if ((this.ljw != 180) && (this.ljw != 0)) {
              continue;
            }
            j = this.kGn;
            this.ljB = MediaFormat.createVideoFormat("video/avc", i, j);
            break label316;
          }
          i = this.kGn;
          continue;
          j = this.kGo;
          break;
        case 2: 
        case 8: 
          label749:
          label757:
          label765:
          j = 1;
          continue;
          x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "best profile: %s, level: %s", new Object[] { Integer.valueOf(localCodecProfileLevel.profile), Integer.valueOf(localCodecProfileLevel.level) });
          if ((localCodecProfileLevel.profile > 0) && (localCodecProfileLevel.level >= 256))
          {
            this.ljB.setInteger("profile", localCodecProfileLevel.profile);
            this.ljB.setInteger("level", 256);
          }
          label925:
          i = -1;
        }
      }
      catch (Exception localException1)
      {
        try
        {
          if (d.fR(21)) {
            this.ljB.setInteger("bitrate-mode", 1);
          }
          this.ljB.setInteger("bitrate", this.bitrate);
          this.ljB.setInteger("frame-rate", this.ljG);
          this.ljB.setInteger("color-format", this.lhv);
          this.ljB.setInteger("i-frame-interval", this.ljF);
          x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "mediaFormat: %s", new Object[] { this.ljB });
          this.lhN = MediaCodec.createByCodecName(localMediaCodecInfo.getName());
          this.lhN.configure(this.ljB, null, null, 1);
          this.lhN.start();
          return 0;
          localException1 = localException1;
          x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "trySetProfile error: %s", new Object[] { localException1.getMessage() });
          continue;
        }
        catch (Exception localException2)
        {
          x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "trySetBitRateMode error: %s", new Object[] { localException2.getMessage() });
          continue;
        }
      }
      break;
      j = 0;
    }
  }
  
  private void beF()
  {
    this.lhV = this.lhN.dequeueOutputBuffer(this.ljD, 100L);
    x.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "outputBufferIndex-->" + this.lhV);
    do
    {
      if (this.lhV != -1) {
        break label142;
      }
      x.d("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "no output from encoder available, break encoderEndStream %s", new Object[] { Boolean.valueOf(this.ljE) });
      if (!this.ljE) {
        break;
      }
      this.lhV = this.lhN.dequeueOutputBuffer(this.ljD, 100L);
      if (this.lhV <= 0) {
        x.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "get outputBufferIndex %d", new Object[] { Integer.valueOf(this.lhV) });
      }
    } while ((this.lhV >= 0) || (this.ljE));
    for (;;)
    {
      return;
      label142:
      if (this.lhV == -3)
      {
        this.agE = this.lhN.getOutputBuffers();
        x.d("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "encoder output buffers changed");
        break;
      }
      if (this.lhV == -2)
      {
        localObject = this.lhN.getOutputFormat();
        x.d("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "encoder output format changed: " + localObject);
        if (this.lhZ == null) {
          break;
        }
        this.lhZ.c((MediaFormat)localObject);
        break;
      }
      if (this.lhV < 0)
      {
        x.w("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "unexpected result from encoder.dequeueOutputBuffer: " + this.lhV);
        break;
      }
      x.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "perform encoding");
      Object localObject = this.agE[this.lhV];
      if (localObject == null) {
        throw new RuntimeException("encoderOutputBuffer " + this.lhV + " was null");
      }
      this.frameCount += 1;
      if ((this.ljD.flags & 0x2) != 0) {
        x.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "ignoring BUFFER_FLAG_CODEC_CONFIG, size: %s, %s", new Object[] { Integer.valueOf(this.ljD.size), Boolean.valueOf(false) });
      }
      if (this.ljD.size != 0)
      {
        if ((this.lhZ != null) && (!this.lhZ.bTv))
        {
          MediaFormat localMediaFormat = this.lhN.getOutputFormat();
          this.lhZ.c(localMediaFormat);
        }
        ((ByteBuffer)localObject).position(this.ljD.offset);
        ((ByteBuffer)localObject).limit(this.ljD.offset + this.ljD.size);
        e((ByteBuffer)localObject, this.ljD);
      }
      this.lhN.releaseOutputBuffer(this.lhV, false);
      if ((this.ljD.flags & 0x4) == 0) {
        break;
      }
      if (!this.bDs)
      {
        x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "reached end of stream unexpectedly");
        return;
      }
      x.w("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "do stop encoder");
      try
      {
        this.lhN.stop();
        this.lhN.release();
        this.ljA.stop();
        this.lhN = null;
        this.bTv = false;
        if (this.ljH != null)
        {
          this.ljH.bew();
          return;
        }
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "do stop encoder error: %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public final void a(f.a parama)
  {
    this.ljH = parama;
    this.bDs = true;
    boolean bool = this.ljA.bee();
    x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "!!!stop, isStart!!: %s %s isEnd %s", new Object[] { Boolean.valueOf(this.bTv), this.ljH, Boolean.valueOf(bool) });
    if (bool) {
      beG();
    }
  }
  
  public final long beD()
  {
    return System.currentTimeMillis() - this.startTime;
  }
  
  final void beG()
  {
    x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "stopImp %s", new Object[] { bi.cjd().toString() });
    try
    {
      if (this.bTv) {
        ah.i(new r.2(this), 500L);
      }
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "stop error: %s", new Object[] { localException.getMessage() });
    }
  }
  
  public int cQ(int paramInt1, int paramInt2)
  {
    try
    {
      this.ljw = paramInt2;
      paramInt1 = beE();
      return paramInt1;
    }
    catch (Exception localException1)
    {
      x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "init error: %s, try to re-init again", new Object[] { localException1.getMessage() });
      try
      {
        if (CaptureMMProxy.getInstance() != null) {
          CaptureMMProxy.getInstance().set(aa.a.sUM, Integer.valueOf(-1));
        }
        paramInt1 = beE();
        return paramInt1;
      }
      catch (Exception localException2)
      {
        x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "re-init again error: %s", new Object[] { localException2.getMessage() });
        k.bdW();
      }
    }
    return -1;
  }
  
  public void clear()
  {
    x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "clear");
    try
    {
      if (this.lhN != null)
      {
        x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "stop encoder");
        this.lhN.stop();
        this.lhN.release();
        this.lhN = null;
        this.bTv = false;
      }
      if (this.ljA != null) {
        this.ljA.stop();
      }
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "clear error: %s", new Object[] { localException.getMessage() });
    }
  }
  
  public final void d(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    try
    {
      if (!this.bTv)
      {
        x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "writeData, not start!");
        return;
      }
      if (this.lhN == null)
      {
        x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "encoder is null");
        return;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      k.bdX();
      x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "writeData error: %s", new Object[] { paramArrayOfByte.getMessage() });
      x.printErrStackTrace("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", paramArrayOfByte, "", new Object[0]);
      return;
    }
    if ((this.lhZ != null) && (this.lhZ.lju <= 0L)) {
      this.lhZ.lju = System.nanoTime();
    }
    long l2 = bi.VG();
    this.apO = this.lhN.getInputBuffers();
    this.agE = this.lhN.getOutputBuffers();
    int i = this.lhN.dequeueInputBuffer(100L);
    this.ljC = i;
    if (i < 0)
    {
      x.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "video no input available, drain first");
      beF();
    }
    if (this.lhN == null)
    {
      x.e("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "encoder is null");
      return;
    }
    x.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "inputBufferIndex: %s", new Object[] { Integer.valueOf(this.ljC) });
    long l3 = bi.VG();
    long l1;
    if (this.ljC >= 0)
    {
      long l4 = System.nanoTime();
      long l5 = paramArrayOfByte.length / 1600000 / 1000000000;
      if (this.lhZ != null)
      {
        l1 = this.lhZ.lju;
        l1 = (l4 - l5 - l1) / 1000L;
        x.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "presentationTime: " + l1);
        ByteBuffer localByteBuffer = this.apO[this.ljC];
        localByteBuffer.clear();
        localByteBuffer.put(paramArrayOfByte);
        localByteBuffer.position(0);
        if ((!this.bTv) || (paramBoolean)) {
          break label385;
        }
        this.lhN.queueInputBuffer(this.ljC, 0, paramArrayOfByte.length, l1, 0);
      }
    }
    for (;;)
    {
      beF();
      x.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "encoder used %sms %sms", new Object[] { Long.valueOf(bi.bI(l2)), Long.valueOf(bi.bI(l3)) });
      return;
      l1 = this.startTime;
      break;
      label385:
      x.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "end of stream");
      this.ljE = true;
      this.lhN.queueInputBuffer(this.ljC, 0, paramArrayOfByte.length, l1, 4);
      continue;
      x.v("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "input buffer not available");
    }
  }
  
  protected void e(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    if ((this.lhZ != null) && ((paramBufferInfo.flags & 0x4) == 0)) {
      this.lhZ.g(paramByteBuffer, paramBufferInfo);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */