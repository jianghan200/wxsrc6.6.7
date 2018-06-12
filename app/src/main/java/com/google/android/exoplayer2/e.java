package com.google.android.exoplayer2;

import java.io.IOException;

public final class e
  extends Exception
{
  public final int acC;
  public final int type;
  
  private e(int paramInt1, Throwable paramThrowable, int paramInt2)
  {
    super(null, paramThrowable);
    this.type = paramInt1;
    this.acC = paramInt2;
  }
  
  public static e a(IOException paramIOException)
  {
    return new e(0, paramIOException, -1);
  }
  
  public static e a(Exception paramException, int paramInt)
  {
    return new e(1, paramException, paramInt);
  }
  
  static e b(RuntimeException paramRuntimeException)
  {
    return new e(2, paramRuntimeException, -1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */