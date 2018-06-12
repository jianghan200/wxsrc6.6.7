package com.tencent.mm.plugin.webview.modelcache;

import android.database.Cursor;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends i<f>
{
  private static volatile k pSZ = null;
  private final e diF;
  public final boolean fAQ;
  
  private k(e parame)
  {
    super(parame, f.dhO, "WebViewResourceCache", null);
    this.diF = parame;
    if (parame != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.fAQ = bool;
      if (!this.fAQ) {
        x.e("MicroMsg.WebViewCacheResStorage", "storage can not work!!!");
      }
      return;
    }
  }
  
  static String Ap(int paramInt)
  {
    String str = "1=1";
    if ((!b.a.Am(paramInt)) || (!b.a.Al(paramInt))) {
      str = String.format(" %s=%s ", new Object[] { "protocol", Integer.valueOf(paramInt) });
    }
    return str;
  }
  
  private boolean a(f paramf)
  {
    if (!this.fAQ) {
      return false;
    }
    if (bi.oW(paramf.field_url))
    {
      x.d("MicroMsg.WebViewCacheResStorage", "insertWebViewCacheRes, url is null or nil");
      return false;
    }
    String str = ac.ce(paramf.field_url);
    if (bi.oW(str))
    {
      x.e("MicroMsg.WebViewCacheResStorage", "insertWebViewCacheRes, get md5 is null or nil , url = %s", new Object[] { paramf.field_url });
      return false;
    }
    paramf.field_urlMd5Hashcode = str.hashCode();
    long l = bi.VE();
    paramf.field_accessTime = l;
    paramf.field_createTime = l;
    return a(paramf, false);
  }
  
  public static List<d.a> bUH()
  {
    LinkedList localLinkedList = new LinkedList();
    String str = i.a(f.dhO, "WebViewResourceCache");
    localLinkedList.add(new d.a("WEBVIEW_RESOURCE_CACHE_TABLE".hashCode(), new String[] { str }));
    return localLinkedList;
  }
  
  public static k bUI()
  {
    if (!au.HX()) {
      return new k(null);
    }
    if (pSZ == null) {}
    try
    {
      if ((pSZ == null) || (!pSZ.fAQ))
      {
        au.HU();
        pSZ = new k(c.FO());
      }
      return pSZ;
    }
    finally {}
  }
  
  public final boolean b(f paramf)
  {
    if (!this.fAQ) {
      return false;
    }
    if (bi.oW(paramf.field_url))
    {
      x.d("MicroMsg.WebViewCacheResStorage", "updateWebViewCacheRes, url is null or nil");
      return false;
    }
    long l = bi.VE();
    paramf.field_accessTime = l;
    paramf.field_createTime = l;
    x.d("MicroMsg.WebViewCacheResStorage", "updateWebViewCacheRes, record = " + paramf);
    return b(paramf, false, new String[] { "urlMd5Hashcode", "appId", "domain", "cacheType", "packageId" });
  }
  
  public final boolean checkIsCached(String paramString, int paramInt)
  {
    if (!this.fAQ) {}
    do
    {
      do
      {
        return false;
      } while (bi.oW(paramString));
      paramString = rawQuery(String.format("select * from %s where %s=? and %s", new Object[] { "WebViewResourceCache", "urlMd5Hashcode", Ap(paramInt) }), new String[] { String.valueOf(ac.ce(paramString).hashCode()) });
    } while (paramString == null);
    if (paramString.getCount() > 0)
    {
      paramString.close();
      return true;
    }
    paramString.close();
    return false;
  }
  
  public final boolean insert(f paramf, int paramInt1, int paramInt2)
  {
    return a(paramf);
  }
  
  public final List<f> n(String paramString, String... paramVarArgs)
  {
    paramString = rawQuery(paramString, paramVarArgs);
    if (paramString == null) {
      return null;
    }
    if (paramString.moveToFirst())
    {
      paramVarArgs = new LinkedList();
      do
      {
        f localf = new f();
        localf.d(paramString);
        paramVarArgs.add(localf);
      } while (paramString.moveToNext());
      paramString.close();
      return paramVarArgs;
    }
    paramString.close();
    return null;
  }
  
  public final boolean update(f paramf, int paramInt1, int paramInt2)
  {
    return b(paramf);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/modelcache/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */