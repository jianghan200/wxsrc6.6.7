package com.tencent.liteav.videoencoder;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.liteav.basic.f.b;
import com.tencent.liteav.basic.module.a;
import java.nio.ByteBuffer;

public class c
  extends a
{
  protected com.tencent.liteav.basic.d.d mEncodeFilter;
  private boolean mEncodeFirstGOP = false;
  protected Object mGLContextExternal = null;
  protected boolean mInit;
  protected com.tencent.liteav.basic.d.d mInputFilter;
  protected int mInputHeight = 0;
  protected int mInputTextureID = -1;
  protected int mInputWidth = 0;
  protected d mListener = null;
  protected int mOutputHeight = 0;
  protected int mOutputWidth = 0;
  private long mVideoGOPEncode = 0L;
  
  protected void callDelegate(int paramInt)
  {
    callDelegate(null, 0, 0L, 0L, 0L, 0L, 0L, 0L, paramInt, null, null);
  }
  
  protected void callDelegate(MediaFormat paramMediaFormat)
  {
    if (this.mListener != null) {
      this.mListener.a(paramMediaFormat);
    }
  }
  
  protected void callDelegate(byte[] paramArrayOfByte, int paramInt1, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt2, ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    MediaCodec.BufferInfo localBufferInfo;
    if (paramByteBuffer == null)
    {
      paramByteBuffer = null;
      if (paramBufferInfo != null) {
        break label223;
      }
      localBufferInfo = null;
      label16:
      if (localBufferInfo != null) {
        localBufferInfo.set(paramBufferInfo.offset, paramBufferInfo.size, paramBufferInfo.presentationTimeUs, paramBufferInfo.flags);
      }
      if (this.mListener != null)
      {
        paramBufferInfo = new b();
        paramBufferInfo.a = paramArrayOfByte;
        paramBufferInfo.b = paramInt1;
        paramBufferInfo.c = paramLong1;
        paramBufferInfo.d = paramLong2;
        paramBufferInfo.e = paramLong3;
        paramBufferInfo.f = paramLong4;
        paramBufferInfo.g = paramLong5;
        paramBufferInfo.h = paramLong6;
        paramBufferInfo.j = paramByteBuffer;
        paramBufferInfo.k = localBufferInfo;
        this.mListener.a(paramBufferInfo, paramInt2);
        setStatusValue(4002, Integer.valueOf((int)getRealBitrate()));
        setStatusValue(4001, Double.valueOf(getRealFPS()));
        if (paramInt1 != 0) {
          break label235;
        }
        if (this.mVideoGOPEncode != 0L)
        {
          this.mEncodeFirstGOP = true;
          setStatusValue(4003, Long.valueOf(this.mVideoGOPEncode));
        }
        this.mVideoGOPEncode = 1L;
      }
    }
    label223:
    label235:
    do
    {
      return;
      paramByteBuffer = paramByteBuffer.asReadOnlyBuffer();
      break;
      localBufferInfo = new MediaCodec.BufferInfo();
      break label16;
      this.mVideoGOPEncode += 1L;
    } while (this.mEncodeFirstGOP);
    setStatusValue(4003, Long.valueOf(this.mVideoGOPEncode));
  }
  
  public long getRealBitrate()
  {
    return 0L;
  }
  
  public long getRealFPS()
  {
    return 0L;
  }
  
  public int getVideoHeight()
  {
    return this.mOutputHeight;
  }
  
  public int getVideoWidth()
  {
    return this.mOutputWidth;
  }
  
  public long pushVideoFrame(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    return 10000002L;
  }
  
  public long pushVideoFrameSync(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    return 10000002L;
  }
  
  public void setBitrate(int paramInt) {}
  
  public void setFPS(int paramInt) {}
  
  public void setListener(d paramd)
  {
    this.mListener = paramd;
  }
  
  public void signalEOSAndFlush() {}
  
  public int start(TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    if (paramTXSVideoEncoderParam != null)
    {
      this.mOutputWidth = paramTXSVideoEncoderParam.width;
      this.mOutputHeight = paramTXSVideoEncoderParam.height;
      this.mGLContextExternal = paramTXSVideoEncoderParam.glContext;
    }
    this.mVideoGOPEncode = 0L;
    this.mEncodeFirstGOP = false;
    return 10000002;
  }
  
  public void stop() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/liteav/videoencoder/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */