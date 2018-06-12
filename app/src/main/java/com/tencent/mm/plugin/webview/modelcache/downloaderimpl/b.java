package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.x;

final class b
{
  static void c(String paramString, m paramm)
  {
    s locals = q.a.ccH().Tn(paramString);
    if (locals == null)
    {
      x.e("MicroMsg.ResDownloader.WebViewCache.DoResponseLogic", "networkRequest already completed, but get null record with urlKey = %s", new Object[] { paramString });
      return;
    }
    if (!"WebViewCache".equals(locals.field_groupId1))
    {
      x.e("MicroMsg.ResDownloader.WebViewCache.DoResponseLogic", "mismatch groupId, urlKey = %s, record.groupId = %s", new Object[] { paramString, locals.field_groupId1 });
      return;
    }
    locals.field_contentType = paramm.aBC;
    q.a.ccH().g(locals);
    paramString = new f(locals.field_url, locals.field_filePath, locals.field_fileVersion, locals.field_appId, locals.field_groupId2, locals.field_packageId, locals.field_wvCacheType, paramm.aBC, paramm.cfA, paramm.qDk);
    WebViewCacheDownloadHelper.bUM();
    WebViewCacheDownloadHelper.a(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/webview/modelcache/downloaderimpl/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */