package com.tencent.mm.plugin.gif;

import android.graphics.Bitmap;
import java.io.FileDescriptor;
import java.io.InputStream;

public class MMGIFJNI
{
  static native byte[] decFile(String paramString1, String paramString2);
  
  static native boolean drawFrameBitmap(long paramLong, Bitmap paramBitmap, int[] paramArrayOfInt);
  
  static native boolean drawFramePixels(long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2);
  
  static native void encFile(String paramString1, String paramString2);
  
  static native String encodeString(String paramString);
  
  static native int getCurrentFrameDuration(long paramLong);
  
  static native int getCurrentFrameIndex(long paramLong);
  
  static native int getHeight(long paramLong);
  
  static native int getTotalFrameCount(long paramLong);
  
  static native int getWidth(long paramLong);
  
  static native void isEncFile(String paramString);
  
  static native boolean isGif(long paramLong);
  
  public static native void lockBitmap(Bitmap paramBitmap);
  
  static native long openByByteArray(byte[] paramArrayOfByte, int[] paramArrayOfInt);
  
  static native long openByFileDescroptor(FileDescriptor paramFileDescriptor, long paramLong, int[] paramArrayOfInt);
  
  static native long openByFilePath(String paramString, int[] paramArrayOfInt);
  
  static native long openByInputStrem(InputStream paramInputStream, int[] paramArrayOfInt);
  
  static native void recycle(long paramLong);
  
  static native void reset(long paramLong);
  
  static native void restoreRemainder(long paramLong);
  
  static native void saveRemainder(long paramLong);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/gif/MMGIFJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */