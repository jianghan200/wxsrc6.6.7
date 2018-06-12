package com.tencent.xweb;

import java.io.InputStream;
import java.util.Map;

public class m
{
  public String mEncoding;
  public InputStream mInputStream;
  public String mMimeType;
  public String mReasonPhrase;
  public Map<String, String> mResponseHeaders;
  public int mStatusCode;
  
  public m() {}
  
  public m(String paramString1, String paramString2, int paramInt, String paramString3, Map<String, String> paramMap, InputStream paramInputStream)
  {
    this(paramString1, paramString2, paramInputStream);
    setStatusCodeAndReasonPhrase(paramInt, paramString3);
    this.mResponseHeaders = paramMap;
  }
  
  public m(String paramString1, String paramString2, InputStream paramInputStream)
  {
    this.mMimeType = paramString1;
    this.mEncoding = paramString2;
    this.mInputStream = paramInputStream;
  }
  
  public final void setStatusCodeAndReasonPhrase(int paramInt, String paramString)
  {
    this.mStatusCode = paramInt;
    this.mReasonPhrase = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/xweb/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */