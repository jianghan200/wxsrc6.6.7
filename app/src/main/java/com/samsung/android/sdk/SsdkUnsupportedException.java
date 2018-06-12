package com.samsung.android.sdk;

public class SsdkUnsupportedException
  extends Exception
{
  public static final int DEVICE_NOT_SUPPORTED = 1;
  public static final int LIBRARY_NOT_INSTALLED = 2;
  public static final int LIBRARY_UPDATE_IS_RECOMMENDED = 4;
  public static final int LIBRARY_UPDATE_IS_REQUIRED = 3;
  public static final int VENDOR_NOT_SUPPORTED = 0;
  private int mErrorType = 0;
  
  public SsdkUnsupportedException(String paramString, int paramInt)
  {
    super(paramString);
    this.mErrorType = paramInt;
  }
  
  public int getType()
  {
    return this.mErrorType;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/samsung/android/sdk/SsdkUnsupportedException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */