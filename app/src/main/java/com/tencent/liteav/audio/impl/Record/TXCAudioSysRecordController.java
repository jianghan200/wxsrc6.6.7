package com.tencent.liteav.audio.impl.Record;

import android.content.Context;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class TXCAudioSysRecordController
  extends c
  implements h, com.tencent.liteav.audio.impl.d
{
  private static final String TAG = "AudioCenter:" + TXCAudioSysRecordController.class.getSimpleName();
  private byte[] mBuf = null;
  private d mCustomRecord = null;
  private long mEffectorObj = 0L;
  private e mHWEcoder = null;
  private com.tencent.liteav.audio.impl.b mHeadsetMgr = null;
  private long mLastPTS = 0L;
  private int mPosition = 0;
  private int mRecordSampleRate = com.tencent.liteav.basic.a.a.e;
  private long mSoftEncObj = 0L;
  
  static {}
  
  private void doHWEncode(byte[] paramArrayOfByte, long paramLong)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0) || (this.mBuf == null) || (this.mHWEcoder == null)) {
      TXCLog.e(TAG, "doHWEncode failed! data = " + paramArrayOfByte + ", buf = " + this.mBuf + ", encoder = " + this.mHWEcoder);
    }
    do
    {
      return;
      int j = this.mBuf.length - this.mPosition;
      int i = j;
      if (j > paramArrayOfByte.length) {
        i = paramArrayOfByte.length;
      }
      System.arraycopy(paramArrayOfByte, 0, this.mBuf, this.mPosition, i);
      this.mPosition = (i + this.mPosition);
    } while (this.mPosition != this.mBuf.length);
    this.mPosition = 0;
    this.mHWEcoder.a(this.mBuf, paramLong);
  }
  
  private void initEffectAndEnc()
  {
    this.mEffectorObj = nativeCreateEffector(this.mSampleRate, this.mChannels, this.mBits);
    if (this.mSampleRate != this.mRecordSampleRate) {
      nativeSetInputInfo(this.mEffectorObj, this.mRecordSampleRate, this.mChannels, this.mBits);
    }
    if ((this.mIsEarphoneOn) || (this.mAECType == TXEAudioDef.TXE_AEC_SYSTEM)) {}
    for (boolean bool = true;; bool = false)
    {
      nativeSetReverbType(this.mEffectorObj, this.mReverbType);
      nativeMixBGM(this.mEffectorObj, bool);
      nativeSetNoiseSuppression(this.mEffectorObj, this.mNSMode);
      nativeSetChangerType(this.mEffectorObj, this.mVoiceKind, this.mVoiceEnvironment);
      Object localObject2;
      label226:
      StringBuilder localStringBuilder;
      if (this.mEnableHWEncoder)
      {
        this.mHWEcoder = new e();
        localObject1 = getListener();
        localObject2 = this.mHWEcoder;
        int i = TXEAudioDef.TXE_AUDIO_TYPE_AAC;
        int j = this.mSampleRate;
        int k = this.mChannels;
        int m = this.mBits;
        if (localObject1 != null)
        {
          localObject1 = new WeakReference(localObject1);
          ((e)localObject2).a(i, j, k, m, (WeakReference)localObject1);
          this.mBuf = new byte[this.mChannels * 1024 * this.mBits / 8];
          this.mPosition = 0;
          this.mLastPTS = 0L;
          localObject2 = TAG;
          localStringBuilder = new StringBuilder("初始化直播录制:录制模式 = ");
          if (this.mCustomRecord != null) {
            break label396;
          }
        }
      }
      label396:
      for (Object localObject1 = "麦克风录制";; localObject1 = "用户自定义录制")
      {
        TXCLog.i((String)localObject2, (String)localObject1 + ", 录制采样率 = " + this.mRecordSampleRate + ", 输出采样率 = " + this.mSampleRate + ", 是否混音 = " + bool + ", 混响模式 = " + this.mReverbType + ", 是否启动硬编码 = " + this.mEnableHWEncoder + ", 噪声抑制mode = " + this.mNSMode);
        this.mHeadsetMgr = new com.tencent.liteav.audio.impl.b(this.mContext);
        this.mHeadsetMgr.a(this);
        return;
        localObject1 = null;
        break;
        this.mSoftEncObj = nativeCreateSoftEncoder(this.mSampleRate, this.mChannels, this.mBits);
        break label226;
      }
    }
  }
  
  private native void nativeAddEffect(long paramLong, byte[] paramArrayOfByte);
  
  private native void nativeAddEffectAndSoftEnc(long paramLong1, long paramLong2, byte[] paramArrayOfByte);
  
  private native long nativeCreateEffector(int paramInt1, int paramInt2, int paramInt3);
  
  private native long nativeCreateSoftEncoder(int paramInt1, int paramInt2, int paramInt3);
  
  private native void nativeDestorySoftEncoder(long paramLong);
  
  private native void nativeDestroyEffector(long paramLong);
  
  private native void nativeEnableEncoder(long paramLong, boolean paramBoolean);
  
  private native void nativeMixBGM(long paramLong, boolean paramBoolean);
  
  private native byte[] nativeReadOneEncFrame();
  
  private native byte[] nativeReadOneFrame(long paramLong, int paramInt);
  
  private native void nativeSetChangerType(long paramLong, int paramInt1, int paramInt2);
  
  private native void nativeSetInputInfo(long paramLong, int paramInt1, int paramInt2, int paramInt3);
  
  private native void nativeSetNoiseSuppression(long paramLong, int paramInt);
  
  private native void nativeSetReverbParam(long paramLong, int paramInt, float paramFloat);
  
  private native void nativeSetReverbType(long paramLong, int paramInt);
  
  private native void nativeSetVolume(long paramLong, float paramFloat);
  
  private void onRecordPcmData(byte[] paramArrayOfByte)
  {
    com.tencent.liteav.audio.e locale = getListener();
    if (locale != null) {
      locale.a(paramArrayOfByte, TXCTimeUtil.getTimeTick(), this.mSampleRate, this.mChannels, this.mBits);
    }
  }
  
  private void uninitEffectAndEnc()
  {
    if (this.mEffectorObj != 0L)
    {
      nativeDestroyEffector(this.mEffectorObj);
      this.mEffectorObj = 0L;
    }
    if (this.mSoftEncObj != 0L)
    {
      nativeDestorySoftEncoder(this.mSoftEncObj);
      this.mSoftEncObj = 0L;
    }
    if (this.mHWEcoder != null)
    {
      this.mHWEcoder.a();
      this.mHWEcoder = null;
    }
  }
  
  public void OnHeadsetState(boolean paramBoolean)
  {
    setEarphoneOn(paramBoolean);
  }
  
  public boolean isRecording()
  {
    if (this.mCustomRecord != null) {
      return this.mCustomRecord.d();
    }
    return f.a().c();
  }
  
  public void onAudioRecordError(int paramInt, String paramString)
  {
    try
    {
      TXCLog.e(TAG, "sys audio record error: " + paramInt + ", " + paramString);
      f.a().a(null);
      uninitEffectAndEnc();
      if (this.mWeakRecordListener != null)
      {
        com.tencent.liteav.audio.e locale = (com.tencent.liteav.audio.e)this.mWeakRecordListener.get();
        if (locale != null) {
          locale.a(paramInt, paramString);
        }
      }
      return;
    }
    finally {}
  }
  
  public void onAudioRecordPCM(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    label239:
    label251:
    for (;;)
    {
      com.tencent.liteav.audio.e locale;
      try
      {
        if (this.mEffectorObj <= 0L) {
          break label239;
        }
        if (this.mIsMute) {
          Arrays.fill(paramArrayOfByte, (byte)0);
        }
        if (this.mLastPTS < paramLong) {
          break label251;
        }
        paramLong = this.mLastPTS + 2L;
        if (this.mHWEcoder != null)
        {
          nativeAddEffect(this.mEffectorObj, paramArrayOfByte);
          paramArrayOfByte = nativeReadOneFrame(this.mEffectorObj, this.mChannels * 1024 * this.mBits / 8);
          if (paramArrayOfByte != null)
          {
            this.mLastPTS = paramLong;
            if (this.mHWEcoder != null) {
              doHWEncode(paramArrayOfByte, paramLong);
            }
          }
          else
          {
            paramInt = 1024000 / this.mSampleRate;
            paramLong += paramInt;
            if (paramArrayOfByte != null) {
              continue;
            }
            return;
          }
          locale = getListener();
          if (locale == null) {
            continue;
          }
          locale.b(paramArrayOfByte, paramLong, this.mSampleRate, this.mChannels, this.mBits);
          continue;
        }
        nativeAddEffectAndSoftEnc(this.mEffectorObj, this.mSoftEncObj, paramArrayOfByte);
      }
      finally {}
      for (;;)
      {
        paramArrayOfByte = nativeReadOneEncFrame();
        if (paramArrayOfByte == null) {
          break;
        }
        this.mLastPTS = paramLong;
        locale = getListener();
        if (locale != null) {
          locale.b(paramArrayOfByte, paramLong, this.mSampleRate, this.mChannels, this.mBits);
        }
        paramLong += 1024000 / this.mSampleRate;
      }
      TXCLog.e(TAG, "effectorObj is null");
    }
  }
  
  public void onAudioRecordStart()
  {
    try
    {
      TXCLog.i(TAG, "sys audio record start");
      uninitEffectAndEnc();
      initEffectAndEnc();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void onAudioRecordStop()
  {
    try
    {
      TXCLog.i(TAG, "sys audio record stop");
      f.a().a(null);
      uninitEffectAndEnc();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void sendCustomPCMData(byte[] paramArrayOfByte)
  {
    if (this.mCustomRecord != null) {
      this.mCustomRecord.a(paramArrayOfByte);
    }
  }
  
  public void setChangerType(int paramInt1, int paramInt2)
  {
    super.setChangerType(paramInt1, paramInt2);
    if (this.mEffectorObj != 0L) {
      nativeSetChangerType(this.mEffectorObj, paramInt1, paramInt2);
    }
  }
  
  public void setEarphoneOn(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        super.setEarphoneOn(paramBoolean);
        if (this.mEffectorObj > 0L)
        {
          boolean bool = false;
          if (!paramBoolean)
          {
            paramBoolean = bool;
            if (this.mAECType != TXEAudioDef.TXE_AEC_SYSTEM) {
              nativeMixBGM(this.mEffectorObj, paramBoolean);
            }
          }
        }
        else
        {
          return;
        }
      }
      finally {}
      paramBoolean = true;
    }
  }
  
  public void setNoiseSuppression(int paramInt)
  {
    try
    {
      super.setNoiseSuppression(paramInt);
      if (this.mEffectorObj > 0L) {
        nativeSetNoiseSuppression(this.mEffectorObj, paramInt);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setReverbParam(int paramInt, float paramFloat)
  {
    try
    {
      super.setReverbParam(paramInt, paramFloat);
      if (this.mEffectorObj != 0L) {
        nativeSetReverbParam(this.mEffectorObj, paramInt, paramFloat);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setReverbType(int paramInt)
  {
    try
    {
      super.setReverbType(paramInt);
      if (this.mEffectorObj > 0L) {
        nativeSetReverbType(this.mEffectorObj, paramInt);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setVolume(float paramFloat)
  {
    super.setVolume(paramFloat);
    if (this.mEffectorObj != 0L) {
      nativeSetVolume(this.mEffectorObj, paramFloat);
    }
  }
  
  public int startRecord(Context paramContext)
  {
    TXCLog.i(TAG, "startRecord");
    super.startRecord(paramContext);
    if (!this.mIsCustomRecord) {
      if (this.mAECType == TXEAudioDef.TXE_AEC_SYSTEM) {
        if (this.mSampleRate > com.tencent.liteav.basic.e.b.a().h())
        {
          this.mRecordSampleRate = com.tencent.liteav.basic.e.b.a().i();
          if (this.mRecordSampleRate == 0) {
            this.mRecordSampleRate = 16000;
          }
          label69:
          f.a().a(this);
          f.a().a(this.mContext, this.mRecordSampleRate, this.mChannels, this.mBits, this.mAECType);
          label102:
          if ((this.mWeakRecordListener != null) && (this.mWeakRecordListener.get() != null)) {
            if (this.mAECType != TXEAudioDef.TXE_AEC_SYSTEM) {
              break label290;
            }
          }
        }
      }
    }
    label290:
    for (paramContext = "SYSTEM-AEC,";; paramContext = "NO-AEC,")
    {
      paramContext = paramContext + "采样率(" + this.mRecordSampleRate + "|" + this.mSampleRate + "),声道数" + this.mChannels;
      ((com.tencent.liteav.audio.e)this.mWeakRecordListener.get()).a(TXEAudioDef.TXE_AUDIO_NOTIFY_AUDIO_INFO, paramContext);
      return 0;
      this.mRecordSampleRate = com.tencent.liteav.basic.e.b.a().h();
      break;
      this.mRecordSampleRate = this.mSampleRate;
      break label69;
      setNoiseSuppression(-1);
      this.mRecordSampleRate = this.mSampleRate;
      this.mCustomRecord = new d();
      this.mCustomRecord.a(this);
      this.mCustomRecord.a(this.mContext, this.mRecordSampleRate, this.mChannels, this.mBits);
      break label102;
    }
  }
  
  public int stopRecord()
  {
    TXCLog.i(TAG, "stopRecord");
    if (this.mCustomRecord != null)
    {
      this.mCustomRecord.c();
      this.mCustomRecord = null;
    }
    f.a().b();
    if (this.mHeadsetMgr != null)
    {
      this.mHeadsetMgr.a();
      this.mHeadsetMgr = null;
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/liteav/audio/impl/Record/TXCAudioSysRecordController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */