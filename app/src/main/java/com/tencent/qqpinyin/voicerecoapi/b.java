package com.tencent.qqpinyin.voicerecoapi;

public final class b
  extends Exception
{
  private String fHW = "";
  private int mErrorCode;
  
  public b(int paramInt)
  {
    this.mErrorCode = paramInt;
    String str;
    switch (paramInt)
    {
    default: 
      str = "unknown error";
    }
    for (;;)
    {
      this.fHW = str;
      new StringBuilder("errorCode: ").append(this.mErrorCode).append("\t msg: ").append(this.fHW);
      return;
      str = "speex engine error";
      continue;
      str = "out of memory";
      continue;
      str = "should init at first";
      continue;
      str = "already init";
      continue;
      str = "null param or 0 length";
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/qqpinyin/voicerecoapi/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */