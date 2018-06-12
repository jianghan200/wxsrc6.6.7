package com.tencent.liteav.videoencoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.EncoderCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Range;
import android.view.Surface;
import com.tencent.liteav.basic.d.g;
import com.tencent.liteav.basic.d.h;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.ArrayDeque;
import javax.microedition.khronos.egl.EGL10;

public class a
  extends c
{
  private static final String a = a.class.getSimpleName();
  private boolean A = false;
  private ByteBuffer[] B = null;
  private byte[] C = null;
  private volatile long D = 0L;
  private long E = 0L;
  private long F = 0L;
  private int G;
  private int H;
  private boolean I;
  private int J = 0;
  private int K = 0;
  private int L = 0;
  private int M = -1;
  private int b = 0;
  private long c = 0L;
  private long d = 0L;
  private long e = 0L;
  private long f = 0L;
  private int g = 0;
  private boolean h = false;
  private boolean i = true;
  private long j = 0L;
  private long k = 0L;
  private long l = 0L;
  private long m = 0L;
  private long n = 0L;
  private boolean o;
  private long p = 0L;
  private long q = 0L;
  private MediaCodec r = null;
  private com.tencent.liteav.basic.util.b s = null;
  private Runnable t = new a.6(this);
  private Runnable u = new a.7(this);
  private ArrayDeque<Long> v = new ArrayDeque(10);
  private Object w;
  private Surface x = null;
  private boolean y = true;
  private boolean z = true;
  
  private int a(int paramInt1, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt3)
  {
    int i1 = paramInt3;
    if (paramInt2 > 0)
    {
      i1 = paramInt3;
      if (paramInt1 > paramInt2) {
        paramInt1 -= paramInt2;
      }
    }
    try
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[4]);
      localByteBuffer.asIntBuffer().put(paramInt1);
      localByteBuffer.order(ByteOrder.BIG_ENDIAN);
      System.arraycopy(localByteBuffer.array(), 0, paramArrayOfByte1, paramInt3, 4);
      System.arraycopy(paramArrayOfByte2, paramInt2, paramArrayOfByte1, paramInt3 + 4, paramInt1);
      i1 = paramInt3 + (paramInt1 + 4);
      return i1;
    }
    catch (Exception paramArrayOfByte1)
    {
      TXCLog.e(a, "setNalData exception");
    }
    return paramInt3;
  }
  
  private long a()
  {
    Long localLong = (Long)this.v.poll();
    if (localLong == null) {
      return 0L;
    }
    return localLong.longValue();
  }
  
  @TargetApi(16)
  private static MediaCodecInfo a(String paramString)
  {
    int i3 = MediaCodecList.getCodecCount();
    int i1 = 0;
    while (i1 < i3)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i1);
      if (localMediaCodecInfo.isEncoder())
      {
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        int i4 = arrayOfString.length;
        int i2 = 0;
        while (i2 < i4)
        {
          if (arrayOfString[i2].equalsIgnoreCase(paramString)) {
            return localMediaCodecInfo;
          }
          i2 += 1;
        }
      }
      i1 += 1;
    }
    return null;
  }
  
  @TargetApi(16)
  private MediaFormat a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0) || (paramInt3 == 0) || (paramInt4 == 0)) {
      return null;
    }
    MediaFormat localMediaFormat = MediaFormat.createVideoFormat("video/avc", paramInt1, paramInt2);
    localMediaFormat.setInteger("bitrate", paramInt3 * 1024);
    localMediaFormat.setInteger("frame-rate", paramInt4);
    localMediaFormat.setInteger("color-format", 2130708361);
    localMediaFormat.setInteger("i-frame-interval", paramInt5);
    return localMediaFormat;
  }
  
  @TargetApi(16)
  private MediaFormat a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    MediaFormat localMediaFormat = a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    if (localMediaFormat == null) {
      return null;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      Object localObject = a("video/avc");
      if (localObject == null) {
        return localMediaFormat;
      }
      localObject = ((MediaCodecInfo)localObject).getCapabilitiesForType("video/avc");
      MediaCodecInfo.EncoderCapabilities localEncoderCapabilities = ((MediaCodecInfo.CodecCapabilities)localObject).getEncoderCapabilities();
      if (localEncoderCapabilities.isBitrateModeSupported(paramInt6)) {
        localMediaFormat.setInteger("bitrate-mode", paramInt6);
      }
      for (;;)
      {
        localMediaFormat.setInteger("complexity", ((Integer)localEncoderCapabilities.getComplexityRange().clamp(Integer.valueOf(5))).intValue());
        if (Build.VERSION.SDK_INT < 23) {
          break;
        }
        localObject = ((MediaCodecInfo.CodecCapabilities)localObject).profileLevels;
        paramInt4 = localObject.length;
        paramInt1 = 0;
        for (paramInt2 = 0; paramInt1 < paramInt4; paramInt2 = paramInt3)
        {
          localEncoderCapabilities = localObject[paramInt1];
          paramInt3 = paramInt2;
          if (localEncoderCapabilities.profile <= paramInt7)
          {
            paramInt3 = paramInt2;
            if (localEncoderCapabilities.profile > paramInt2)
            {
              paramInt3 = localEncoderCapabilities.profile;
              localMediaFormat.setInteger("profile", localEncoderCapabilities.profile);
              localMediaFormat.setInteger("level", localEncoderCapabilities.level);
            }
          }
          paramInt1 += 1;
        }
        if (localEncoderCapabilities.isBitrateModeSupported(2)) {
          localMediaFormat.setInteger("bitrate-mode", 2);
        }
      }
    }
    return localMediaFormat;
  }
  
  private void a(int paramInt)
  {
    if (this.j == this.b) {}
    do
    {
      return;
      this.j = this.b;
    } while ((Build.VERSION.SDK_INT < 19) || (this.r == null));
    Bundle localBundle = new Bundle();
    localBundle.putInt("video-bitrate", this.b * 1024);
    this.r.setParameters(localBundle);
  }
  
  private void a(long paramLong)
  {
    this.v.add(Long.valueOf(paramLong));
  }
  
  private boolean a(Surface paramSurface, int paramInt1, int paramInt2)
  {
    if (paramSurface == null) {
      return false;
    }
    Object localObject2;
    Object localObject1;
    if (this.A)
    {
      localObject2 = (android.opengl.EGLContext)this.mGLContextExternal;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = EGL14.EGL_NO_CONTEXT;
      }
    }
    for (this.w = com.tencent.liteav.basic.d.c.a(null, (android.opengl.EGLContext)localObject1, paramSurface, paramInt1, paramInt2); this.w == null; this.w = com.tencent.liteav.basic.d.b.a(null, (javax.microedition.khronos.egl.EGLContext)localObject1, paramSurface, paramInt1, paramInt2))
    {
      return false;
      localObject2 = (javax.microedition.khronos.egl.EGLContext)this.mGLContextExternal;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = EGL10.EGL_NO_CONTEXT;
      }
    }
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    this.mEncodeFilter = new com.tencent.liteav.basic.d.d();
    this.mEncodeFilter.a(h.e, h.a(g.a, false, false));
    if (!this.mEncodeFilter.a())
    {
      this.mEncodeFilter = null;
      return false;
    }
    GLES20.glViewport(0, 0, paramInt1, paramInt2);
    return true;
  }
  
  @TargetApi(18)
  private boolean a(TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    int i2 = 2;
    this.z = false;
    this.y = false;
    this.c = 0L;
    this.d = 0L;
    this.e = 0L;
    this.f = 0L;
    this.g = 0;
    this.j = 0L;
    this.k = 0L;
    this.l = 0L;
    this.m = 0L;
    this.n = 0L;
    this.p = 0L;
    this.q = 0L;
    this.B = null;
    this.C = null;
    this.D = 0L;
    this.G = -1;
    this.mOutputWidth = paramTXSVideoEncoderParam.width;
    this.mOutputHeight = paramTXSVideoEncoderParam.height;
    this.H = paramTXSVideoEncoderParam.gop;
    this.I = paramTXSVideoEncoderParam.fullIFrame;
    this.o = paramTXSVideoEncoderParam.syncOutput;
    this.A = paramTXSVideoEncoderParam.enableEGL14;
    this.v.clear();
    if ((paramTXSVideoEncoderParam == null) || (paramTXSVideoEncoderParam.width == 0) || (paramTXSVideoEncoderParam.height == 0) || (paramTXSVideoEncoderParam.fps == 0) || (paramTXSVideoEncoderParam.gop == 0))
    {
      this.y = true;
      return false;
    }
    this.h = paramTXSVideoEncoderParam.annexb;
    this.i = paramTXSVideoEncoderParam.appendSpsPps;
    if (this.b == 0) {
      this.b = ((int)(Math.sqrt(paramTXSVideoEncoderParam.width * paramTXSVideoEncoderParam.width * 1.0D + paramTXSVideoEncoderParam.height * paramTXSVideoEncoderParam.height) * 1.2D));
    }
    this.j = this.b;
    this.g = paramTXSVideoEncoderParam.fps;
    int i1;
    switch (paramTXSVideoEncoderParam.encoderMode)
    {
    default: 
      i1 = 2;
      if (com.tencent.liteav.basic.e.b.a().c() == 1) {
        paramTXSVideoEncoderParam.encoderProfile = 1;
      }
      try
      {
        MediaFormat localMediaFormat = a(paramTXSVideoEncoderParam.width, paramTXSVideoEncoderParam.height, this.b, paramTXSVideoEncoderParam.fps, paramTXSVideoEncoderParam.gop, i1, 1);
        if (localMediaFormat == null)
        {
          this.y = true;
          return false;
        }
      }
      catch (Exception localException1)
      {
        i1 = 1;
      }
    }
    for (;;)
    {
      if ((i1 >= 5) && (this.r != null)) {
        this.r.stop();
      }
      this.r = null;
      if (this.x != null) {
        this.x.release();
      }
      this.x = null;
      for (;;)
      {
        if ((this.r == null) || (this.B == null) || (this.x == null))
        {
          this.y = true;
          return false;
          i1 = 2;
          break;
          i1 = 1;
          break;
          i1 = 0;
          break;
          this.r = MediaCodec.createEncoderByType("video/avc");
          try
          {
            this.r.configure(localException1, null, null, 1);
            i1 = 3;
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              try
              {
                this.x = this.r.createInputSurface();
                i1 = 4;
                this.r.start();
                i1 = 5;
                this.B = this.r.getOutputBuffers();
              }
              catch (Exception localException3) {}
              localException2 = localException2;
              i1 = i2;
              if (!(localException2 instanceof IllegalArgumentException))
              {
                i1 = i2;
                if (Build.VERSION.SDK_INT < 21) {
                  continue;
                }
                i1 = i2;
                if (!(localException2 instanceof MediaCodec.CodecException)) {
                  continue;
                }
              }
              i1 = i2;
              this.r.configure(a(paramTXSVideoEncoderParam.width, paramTXSVideoEncoderParam.height, this.b, paramTXSVideoEncoderParam.fps, paramTXSVideoEncoderParam.gop), null, null, 1);
            }
            i1 = i2;
            throw localException2;
          }
        }
      }
      if (!a(this.x, paramTXSVideoEncoderParam.width, paramTXSVideoEncoderParam.height))
      {
        this.y = true;
        return false;
      }
      this.mInit = true;
      return true;
    }
  }
  
  private byte[] a(byte[] paramArrayOfByte)
  {
    int i7 = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[i7 + 20];
    int i1 = 0;
    int i5 = 0;
    int i3;
    for (int i4 = 0;; i4 = i3)
    {
      int i6 = i1;
      int i2 = i5;
      i3 = i4;
      if (i1 < i7)
      {
        if ((paramArrayOfByte[i1] != 0) || (paramArrayOfByte[(i1 + 1)] != 0) || (paramArrayOfByte[(i1 + 2)] != 1)) {
          break label150;
        }
        i3 = a(i1, i5, arrayOfByte, paramArrayOfByte, i4);
        i2 = i1 + 3;
        i6 = i2;
      }
      while ((i6 == i7 - 4) && ((paramArrayOfByte[(i6 + 1)] != 0) || (paramArrayOfByte[(i6 + 2)] != 0) || (paramArrayOfByte[(i6 + 3)] != 1)))
      {
        i6 = i7;
        i1 = a(i6, i2, arrayOfByte, paramArrayOfByte, i3);
        paramArrayOfByte = new byte[i1];
        System.arraycopy(arrayOfByte, 0, paramArrayOfByte, 0, i1);
        return paramArrayOfByte;
        label150:
        i6 = i1;
        i2 = i5;
        i3 = i4;
        if (paramArrayOfByte[i1] == 0)
        {
          i6 = i1;
          i2 = i5;
          i3 = i4;
          if (paramArrayOfByte[(i1 + 1)] == 0)
          {
            i6 = i1;
            i2 = i5;
            i3 = i4;
            if (paramArrayOfByte[(i1 + 2)] == 0)
            {
              i6 = i1;
              i2 = i5;
              i3 = i4;
              if (paramArrayOfByte[(i1 + 3)] == 1)
              {
                i3 = a(i1, i5, arrayOfByte, paramArrayOfByte, i4);
                i2 = i1 + 4;
                i6 = i2;
              }
            }
          }
        }
      }
      i1 = i6 + 1;
      i5 = i2;
    }
  }
  
  private void b()
  {
    if (this.mEncodeFilter != null)
    {
      this.mEncodeFilter.d();
      this.mEncodeFilter = null;
    }
    if ((this.w instanceof com.tencent.liteav.basic.d.b))
    {
      ((com.tencent.liteav.basic.d.b)this.w).b();
      this.w = null;
    }
    if ((this.w instanceof com.tencent.liteav.basic.d.c))
    {
      ((com.tencent.liteav.basic.d.c)this.w).b();
      this.w = null;
    }
  }
  
  private void b(int paramInt) {}
  
  private int c()
  {
    if (this.r == null) {
      i2 = -1;
    }
    MediaCodec.BufferInfo localBufferInfo;
    ByteBuffer localByteBuffer;
    int i1;
    for (;;)
    {
      return i2;
      localBufferInfo = new MediaCodec.BufferInfo();
      int i4;
      try
      {
        i4 = this.r.dequeueOutputBuffer(localBufferInfo, 10000L);
        if (i4 == -1) {
          return 0;
        }
      }
      catch (IllegalStateException localIllegalStateException1)
      {
        return -1;
      }
      if (i4 == -3)
      {
        this.B = this.r.getOutputBuffers();
        return 1;
      }
      if (i4 == -2)
      {
        callDelegate(this.r.getOutputFormat());
        return 1;
      }
      if (i4 < 0) {
        return -1;
      }
      localByteBuffer = this.B[i4];
      if (localByteBuffer == null)
      {
        i1 = -1;
        i2 = i1;
        try
        {
          if (this.r != null)
          {
            this.r.releaseOutputBuffer(i4, false);
            return i1;
          }
        }
        catch (IllegalStateException localIllegalStateException2)
        {
          return i1;
        }
      }
    }
    byte[] arrayOfByte1 = new byte[localBufferInfo.size];
    localByteBuffer.position(localBufferInfo.offset);
    localByteBuffer.limit(localBufferInfo.offset + localBufferInfo.size);
    localByteBuffer.get(arrayOfByte1, 0, localBufferInfo.size);
    int i2 = arrayOfByte1.length;
    label242:
    int i3;
    label292:
    Object localObject;
    if ((localBufferInfo.size > 5) && (arrayOfByte1[0] == 0) && (arrayOfByte1[1] == 0) && (arrayOfByte1[2] == 0) && (arrayOfByte1[3] == 0) && (arrayOfByte1[4] == 0) && (arrayOfByte1[5] == 0))
    {
      i1 = 3;
      if (i1 < i2 - 4) {
        if ((arrayOfByte1[i1] == 0) && (arrayOfByte1[(i1 + 1)] == 0) && (arrayOfByte1[(i1 + 2)] == 0) && (arrayOfByte1[(i1 + 3)] == 1))
        {
          i3 = i2 - i1;
          i2 = i1;
          i1 = i3;
          localObject = new byte[i1];
          System.arraycopy(arrayOfByte1, i2, localObject, 0, i1);
        }
      }
    }
    for (;;)
    {
      if (localBufferInfo.size == 0)
      {
        if ((localBufferInfo.flags & 0x4) != 0)
        {
          if (this.mListener != null) {
            this.mListener.a(null, 0);
          }
          i1 = -2;
          break;
          i1 += 1;
          break label242;
        }
        i1 = -1;
        break;
      }
      i1 = 1;
      if ((localBufferInfo.flags & 0x2) == 2)
      {
        if (this.h) {}
        for (this.C = ((byte[])((byte[])localObject).clone());; this.C = a((byte[])((byte[])localObject).clone()))
        {
          i1 = 1;
          break;
        }
      }
      byte[] arrayOfByte2;
      if ((localBufferInfo.flags & 0x1) == 1)
      {
        i1 = 0;
        this.G = -1;
        if (this.h)
        {
          arrayOfByte2 = new byte[this.C.length + localObject.length];
          System.arraycopy(this.C, 0, arrayOfByte2, 0, this.C.length);
          System.arraycopy(localObject, 0, arrayOfByte2, this.C.length, localObject.length);
          localObject = arrayOfByte2;
        }
      }
      label491:
      label708:
      label987:
      label998:
      label1061:
      label1066:
      for (;;)
      {
        if (!this.I)
        {
          i2 = this.G + 1;
          this.G = i2;
          if (i2 == this.g * this.H) {
            f();
          }
        }
        long l2 = a();
        long l1 = localBufferInfo.presentationTimeUs / 1000L;
        if (this.F == 0L) {
          this.F = l2;
        }
        if (this.E == 0L) {
          this.E = l1;
        }
        long l3 = l1 + (this.F - this.E);
        l1 = l2;
        if (l2 <= this.n) {
          l1 = this.n + 1L;
        }
        l2 = l1;
        if (l1 > l3) {
          l2 = l3;
        }
        this.n = l2;
        l1 = TXCTimeUtil.getTimeTick();
        if (i1 == 0)
        {
          if (l1 > this.e + 1000L)
          {
            this.c = ((this.p * 8000.0D / (l1 - this.e) / 1024.0D));
            this.p = 0L;
            this.e = l1;
          }
          this.k += 1L;
          this.l = 0L;
          this.p += localObject.length;
          if (l1 > this.f + 2000L)
          {
            this.d = ((this.q * 1000.0D / (l1 - this.f)));
            this.q = 0L;
            this.f = l1;
          }
          this.q += 1L;
          localByteBuffer.position(localBufferInfo.offset);
          if (!this.i) {
            break label998;
          }
          l2 = this.k;
          l4 = this.l;
          l5 = this.m;
          if (i1 != 0) {
            break label987;
          }
        }
        for (l1 = 0L;; l1 = this.l - 1L)
        {
          callDelegate((byte[])localObject, i1, l2, l4, l5, l1, l3, l3, 0, localByteBuffer, localBufferInfo);
          this.m += 1L;
          this.L += 1;
          if ((localBufferInfo.flags & 0x4) == 0) {
            break label1061;
          }
          if (this.mListener != null) {
            this.mListener.a(null, 0);
          }
          i1 = -2;
          break;
          arrayOfByte2 = a((byte[])localObject);
          localObject = new byte[this.C.length + arrayOfByte2.length];
          System.arraycopy(this.C, 0, localObject, 0, this.C.length);
          System.arraycopy(arrayOfByte2, 0, localObject, this.C.length, arrayOfByte2.length);
          break label491;
          if (this.h) {
            break label1066;
          }
          localObject = a((byte[])localObject);
          break label491;
          this.l += 1L;
          break label708;
        }
        l2 = this.k;
        long l4 = this.l;
        long l5 = this.m;
        if (i1 == 0) {}
        for (l1 = 0L;; l1 = this.l - 1L)
        {
          callDelegate(arrayOfByte1, i1, l2, l4, l5, l1, l3, l3, 0, localByteBuffer, localBufferInfo);
          break;
        }
        i1 = 1;
        break;
      }
      i3 = 0;
      i1 = i2;
      i2 = i3;
      break label292;
      localObject = arrayOfByte1;
    }
  }
  
  @TargetApi(18)
  private void d()
  {
    if ((this.y == true) || (this.w == null)) {
      return;
    }
    a(this.D);
    this.mEncodeFilter.a(this.M);
    if ((this.w instanceof com.tencent.liteav.basic.d.c))
    {
      ((com.tencent.liteav.basic.d.c)this.w).a(this.D * 1000000L);
      ((com.tencent.liteav.basic.d.c)this.w).c();
    }
    if ((this.w instanceof com.tencent.liteav.basic.d.b)) {
      ((com.tencent.liteav.basic.d.b)this.w).a();
    }
    int i1;
    do
    {
      i1 = c();
    } while (i1 > 0);
    if ((i1 == -1) || (i1 == -2))
    {
      if (i1 == -1) {
        callDelegate(10000005);
      }
      this.y = true;
      e();
      return;
    }
    this.K += 1;
  }
  
  /* Error */
  private void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 526	com/tencent/liteav/videoencoder/a:mInit	Z
    //   4: ifne +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: iconst_1
    //   10: putfield 125	com/tencent/liteav/videoencoder/a:y	Z
    //   13: aload_0
    //   14: iconst_1
    //   15: putfield 127	com/tencent/liteav/videoencoder/a:z	Z
    //   18: aload_0
    //   19: invokespecial 641	com/tencent/liteav/videoencoder/a:b	()V
    //   22: aload_0
    //   23: getfield 100	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   26: invokevirtual 493	android/media/MediaCodec:stop	()V
    //   29: aload_0
    //   30: getfield 100	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   33: invokevirtual 642	android/media/MediaCodec:release	()V
    //   36: aload_0
    //   37: aconst_null
    //   38: putfield 100	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   41: aload_0
    //   42: iconst_m1
    //   43: putfield 147	com/tencent/liteav/videoencoder/a:M	I
    //   46: aload_0
    //   47: lconst_0
    //   48: putfield 72	com/tencent/liteav/videoencoder/a:c	J
    //   51: aload_0
    //   52: lconst_0
    //   53: putfield 74	com/tencent/liteav/videoencoder/a:d	J
    //   56: aload_0
    //   57: lconst_0
    //   58: putfield 76	com/tencent/liteav/videoencoder/a:e	J
    //   61: aload_0
    //   62: lconst_0
    //   63: putfield 78	com/tencent/liteav/videoencoder/a:f	J
    //   66: aload_0
    //   67: iconst_0
    //   68: putfield 80	com/tencent/liteav/videoencoder/a:g	I
    //   71: aload_0
    //   72: lconst_0
    //   73: putfield 86	com/tencent/liteav/videoencoder/a:j	J
    //   76: aload_0
    //   77: lconst_0
    //   78: putfield 88	com/tencent/liteav/videoencoder/a:k	J
    //   81: aload_0
    //   82: lconst_0
    //   83: putfield 90	com/tencent/liteav/videoencoder/a:l	J
    //   86: aload_0
    //   87: lconst_0
    //   88: putfield 92	com/tencent/liteav/videoencoder/a:m	J
    //   91: aload_0
    //   92: lconst_0
    //   93: putfield 94	com/tencent/liteav/videoencoder/a:n	J
    //   96: aload_0
    //   97: lconst_0
    //   98: putfield 96	com/tencent/liteav/videoencoder/a:p	J
    //   101: aload_0
    //   102: lconst_0
    //   103: putfield 98	com/tencent/liteav/videoencoder/a:q	J
    //   106: aload_0
    //   107: aconst_null
    //   108: putfield 357	com/tencent/liteav/videoencoder/a:mGLContextExternal	Ljava/lang/Object;
    //   111: aload_0
    //   112: aconst_null
    //   113: putfield 131	com/tencent/liteav/videoencoder/a:B	[Ljava/nio/ByteBuffer;
    //   116: aload_0
    //   117: aconst_null
    //   118: putfield 133	com/tencent/liteav/videoencoder/a:C	[B
    //   121: aload_0
    //   122: lconst_0
    //   123: putfield 135	com/tencent/liteav/videoencoder/a:D	J
    //   126: aload_0
    //   127: iconst_0
    //   128: putfield 431	com/tencent/liteav/videoencoder/a:mOutputWidth	I
    //   131: aload_0
    //   132: iconst_0
    //   133: putfield 437	com/tencent/liteav/videoencoder/a:mOutputHeight	I
    //   136: aload_0
    //   137: iconst_0
    //   138: putfield 526	com/tencent/liteav/videoencoder/a:mInit	Z
    //   141: aload_0
    //   142: aconst_null
    //   143: putfield 587	com/tencent/liteav/videoencoder/a:mListener	Lcom/tencent/liteav/videoencoder/d;
    //   146: aload_0
    //   147: getfield 121	com/tencent/liteav/videoencoder/a:v	Ljava/util/ArrayDeque;
    //   150: invokevirtual 458	java/util/ArrayDeque:clear	()V
    //   153: return
    //   154: astore_1
    //   155: aload_0
    //   156: getfield 100	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   159: invokevirtual 642	android/media/MediaCodec:release	()V
    //   162: goto -126 -> 36
    //   165: astore_1
    //   166: goto -130 -> 36
    //   169: astore_1
    //   170: aload_0
    //   171: getfield 100	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   174: invokevirtual 642	android/media/MediaCodec:release	()V
    //   177: aload_1
    //   178: athrow
    //   179: astore_2
    //   180: goto -3 -> 177
    //   183: astore_1
    //   184: goto -148 -> 36
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	187	0	this	a
    //   154	1	1	localIllegalStateException	IllegalStateException
    //   165	1	1	localException1	Exception
    //   169	9	1	localObject	Object
    //   183	1	1	localException2	Exception
    //   179	1	2	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   22	29	154	java/lang/IllegalStateException
    //   155	162	165	java/lang/Exception
    //   22	29	169	finally
    //   170	177	179	java/lang/Exception
    //   29	36	183	java/lang/Exception
  }
  
  private void f()
  {
    if ((Build.VERSION.SDK_INT >= 19) && (this.r != null))
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("request-sync", 0);
      this.r.setParameters(localBundle);
    }
  }
  
  public long getRealBitrate()
  {
    return this.c;
  }
  
  public long getRealFPS()
  {
    return this.d;
  }
  
  public long pushVideoFrame(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    if (this.z) {
      return 10000004L;
    }
    GLES20.glFinish();
    this.D = paramLong;
    this.M = paramInt1;
    this.J += 1;
    if (this.I) {
      f();
    }
    this.s.b(this.u);
    return 0L;
  }
  
  public long pushVideoFrameSync(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    if (this.z) {
      return 10000004L;
    }
    GLES20.glFinish();
    this.D = paramLong;
    this.M = paramInt1;
    this.J += 1;
    if (this.I) {
      f();
    }
    this.s.a(this.u);
    return 0L;
  }
  
  public void setBitrate(int paramInt)
  {
    this.b = paramInt;
    this.s.b(new a.4(this, paramInt));
  }
  
  public void setFPS(int paramInt)
  {
    this.s.b(new a.3(this, paramInt));
  }
  
  public void signalEOSAndFlush()
  {
    if (this.z) {
      return;
    }
    this.s.a(new a.5(this));
  }
  
  public int start(TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    super.start(paramTXSVideoEncoderParam);
    boolean[] arrayOfBoolean = new boolean[1];
    if (Build.VERSION.SDK_INT < 18) {
      arrayOfBoolean[0] = false;
    }
    for (;;)
    {
      if (arrayOfBoolean[0] == 0) {
        callDelegate(10000004);
      }
      if (arrayOfBoolean[0] != 0)
      {
        return 0;
        try
        {
          this.s.a(new a.1(this, arrayOfBoolean, paramTXSVideoEncoderParam));
        }
        finally {}
      }
    }
    return 10000004;
  }
  
  public void stop()
  {
    this.z = true;
    try
    {
      this.s.a(new a.2(this));
      return;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/liteav/videoencoder/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */