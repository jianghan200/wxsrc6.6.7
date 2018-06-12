package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.mm.sdk.platformtools.x;

public final class l
{
  final String appId;
  final String bVd;
  final String cfx;
  final String cfy;
  final int cfz;
  final String pTa;
  final a pTb;
  
  public l(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    this.appId = paramString1;
    this.cfx = paramString2;
    this.pTa = paramString3;
    this.cfz = paramInt;
    this.cfy = paramString4;
    x.i("MicroMsg.WebViewCacheResWriter", "init WebViewCacheResWriter, appId = %s, domain = %s, mainURL = %s, cacheType = %d", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt) });
    this.pTb = a.Qz(paramString1);
    if (this.pTb != null)
    {
      paramString1 = this.pTb;
      paramString2 = String.format("%d_%d_%d_%d", new Object[] { Integer.valueOf(paramString2.hashCode()), Integer.valueOf(paramInt), Integer.valueOf(paramString3.hashCode()), Integer.valueOf(paramString4.hashCode()) });
      this.bVd = (paramString1.path + "/" + paramString2);
      return;
    }
    this.bVd = null;
    x.e("MicroMsg.WebViewCacheResWriter", "get null appIdResDir");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/modelcache/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */