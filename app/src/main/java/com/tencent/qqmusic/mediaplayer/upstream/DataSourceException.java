package com.tencent.qqmusic.mediaplayer.upstream;

public class DataSourceException
  extends Exception
{
  private final int errorCode;
  
  public DataSourceException(int paramInt, String paramString)
  {
    super(paramString);
    this.errorCode = paramInt;
  }
  
  public int getErrorCode()
  {
    return this.errorCode;
  }
  
  public String toString()
  {
    return "DataSourceException{errorCode=" + this.errorCode + "\nmessage=" + getMessage() + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/upstream/DataSourceException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */