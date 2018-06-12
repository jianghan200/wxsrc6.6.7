package com.tencent.mm.platformtools;

public class Mmap
{
  private String ewp = "";
  private int fileSize = 0;
  
  private static native int close(long paramLong);
  
  private static native long open(String paramString, int paramInt);
  
  private static native int read(long paramLong, int paramInt1, int paramInt2, Object paramObject);
  
  private static native int sync(long paramLong, int paramInt);
  
  private static native int write(long paramLong, int paramInt1, int paramInt2, Object paramObject);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/platformtools/Mmap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */