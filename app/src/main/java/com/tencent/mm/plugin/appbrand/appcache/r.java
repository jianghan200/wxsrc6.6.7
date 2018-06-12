package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.sdk.platformtools.bi;

public final class r
{
  private final String appId;
  private final String fgp;
  private volatile String fgq;
  
  public r(String paramString)
  {
    this.appId = paramString;
    this.fgp = null;
  }
  
  public r(String paramString1, String paramString2)
  {
    this.appId = paramString1;
    if ((bi.oW(paramString2)) || ("__APP__".equals(paramString2)))
    {
      this.fgp = paramString2;
      return;
    }
    this.fgp = a.qC(paramString2);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder;
    if (bi.oW(this.fgq))
    {
      localStringBuilder = new StringBuilder().append(this.appId);
      if (!bi.oW(this.fgp)) {
        break label55;
      }
    }
    label55:
    for (String str = "";; str = "$" + this.fgp)
    {
      this.fgq = str;
      return this.fgq;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */