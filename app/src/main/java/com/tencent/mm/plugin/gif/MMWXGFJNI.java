package com.tencent.mm.plugin.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.loader.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public class MMWXGFJNI
{
  private static final String TAG = "MicroMsg.JNI.MMWXGF";
  static int mECode;
  static boolean mIsInit = false;
  
  static
  {
    mECode = -1;
    x.i("MicroMsg.JNI.MMWXGF", "static MMWXGFJNI");
    if (!mIsInit)
    {
      int i = m.zj();
      x.i("MicroMsg.JNI.MMWXGF", "loadVoipCodecLib cpuFlag:" + i);
      String str;
      if ((i & 0x400) != 0)
      {
        d.y(ad.getContext(), "libvoipCodec_v7a.so");
        str = new File(ad.getContext().getDir("lib", 0), "libvoipCodec_v7a.so").getAbsolutePath();
        i = nativeInit(str);
        mECode = i;
        if (i < 0) {
          break label170;
        }
      }
      label170:
      for (boolean bool = true;; bool = false)
      {
        mIsInit = bool;
        x.i("MicroMsg.JNI.MMWXGF", "native init MMWXGF mECode:%d result:%b :%s", new Object[] { Integer.valueOf(mECode), Boolean.valueOf(mIsInit), str });
        return;
        if ((i & 0x200) != 0)
        {
          d.y(ad.getContext(), "libvoipCodec.so");
          break;
        }
        d.y(ad.getContext(), "libvoipCodec_v5.so");
        break;
      }
    }
    x.d("MicroMsg.JNI.MMWXGF", "MMWXGF has init.");
  }
  
  public static int getErrorCode()
  {
    return mECode;
  }
  
  public static native int nativeAV2Gif(String paramString1, String paramString2);
  
  public static native int nativeAV2Gif(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static native int nativeDecodeBufferFrame(long paramLong, byte[] paramArrayOfByte, int paramInt, Bitmap paramBitmap, int[] paramArrayOfInt);
  
  public static native int nativeDecodeBufferHeader(long paramLong, byte[] paramArrayOfByte, int paramInt);
  
  public static native int nativeGetOption(long paramLong, byte[] paramArrayOfByte, int paramInt, int[] paramArrayOfInt);
  
  public static native int nativeInit(String paramString);
  
  public static native long nativeInitWxAMDecoder();
  
  public static native boolean nativeIsWXGF(byte[] paramArrayOfByte, int paramInt);
  
  public static native int nativeRewindBuffer(long paramLong);
  
  public static native int nativeUninit(long paramLong);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/gif/MMWXGFJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */