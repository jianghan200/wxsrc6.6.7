package com.tencent.smtt.sdk;

class bo
  extends Thread
{
  bo(WebView paramWebView, String paramString)
  {
    super(paramString);
  }
  
  public void run()
  {
    this.a.tbsWebviewDestroy(false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/smtt/sdk/bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */