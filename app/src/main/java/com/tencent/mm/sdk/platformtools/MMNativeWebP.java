package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;

public final class MMNativeWebP
{
  public static native Bitmap nativeDecodeByteArray(byte[] paramArrayOfByte, BitmapFactory.Options paramOptions);
  
  public static native byte[] nativeEncodeBitmap(Bitmap paramBitmap, int paramInt);
  
  public static native boolean nativeIsWebPImage(byte[] paramArrayOfByte);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/sdk/platformtools/MMNativeWebP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */