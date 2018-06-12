package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

public final class f
{
  public final String aBC;
  public final String appId;
  public final long cfA;
  public final String cfx;
  public final String cfy;
  public final int cfz;
  public final Exception exception;
  public final String filePath;
  public final String url;
  public final String version;
  
  public f(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt, String paramString7, long paramLong, Exception paramException)
  {
    this.url = paramString1;
    this.filePath = paramString2;
    this.version = paramString3;
    this.appId = paramString4;
    this.cfx = paramString5;
    this.cfy = paramString6;
    this.cfz = paramInt;
    this.aBC = paramString7;
    this.cfA = paramLong;
    this.exception = paramException;
  }
  
  public final String toString()
  {
    return "WebViewCacheResponseWrapper{url='" + this.url + '\'' + ", filePath='" + this.filePath + '\'' + ", version='" + this.version + '\'' + ", appId='" + this.appId + '\'' + ", domain='" + this.cfx + '\'' + ", packageId='" + this.cfy + '\'' + ", cacheType=" + this.cfz + ", contentType='" + this.aBC + '\'' + ", contentLength=" + this.cfA + ", exception=" + this.exception + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/modelcache/downloaderimpl/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */