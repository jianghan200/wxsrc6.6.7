package com.tencent.mm.plugin.webview.modeltools;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  public static final String pTG = Integer.toString(100028);
  
  private static void a(String paramString, List<String> paramList, com.tencent.xweb.b paramb)
  {
    if (!bi.cX(paramList))
    {
      String str = Uri.parse(paramString).getHost();
      Object localObject = str.split("\\.");
      if (localObject.length <= 1) {}
      for (localObject = "";; localObject = localObject[(localObject.length - 2)] + "." + localObject[(localObject.length - 1)])
      {
        x.d("MicroMsg.WebView.CookiesCleanup", "host(%s)", new Object[] { str });
        x.d("MicroMsg.WebView.CookiesCleanup", "domain(%s)", new Object[] { localObject });
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          str = (String)paramList.next();
          if (!bi.oW(str))
          {
            paramb.setCookie(paramString, str + "=");
            paramb.setCookie(paramString, str + "=;path=/");
            if (!bi.oW((String)localObject)) {
              paramb.setCookie((String)localObject, str + "=;domain=." + (String)localObject + ";path=/");
            }
          }
        }
      }
    }
  }
  
  private static void cN(List<String> paramList)
  {
    com.tencent.xweb.b localb = com.tencent.xweb.b.cIi();
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      x.i("MicroMsg.WebView.CookiesCleanup", "cookies cleanup: url(%s)", new Object[] { str1 });
      paramList = localb.getCookie(str1);
      if (bi.oW(paramList)) {
        paramList = null;
      }
      for (;;)
      {
        a(str1, paramList, localb);
        break;
        paramList = paramList.split(";");
        int j = paramList.length;
        int i = 0;
        while (i < j)
        {
          paramList[i] = paramList[i].trim();
          i += 1;
        }
        LinkedList localLinkedList = new LinkedList();
        j = paramList.length;
        i = 0;
        while (i < j)
        {
          String str2 = paramList[i];
          if ((!bi.oW(str2)) && (str2.contains("="))) {
            localLinkedList.add(str2.split("=")[0]);
          }
          i += 1;
        }
        paramList = localLinkedList;
        if (localLinkedList.isEmpty()) {
          paramList = null;
        }
      }
    }
  }
  
  public static void d(d paramd)
  {
    try
    {
      paramd = paramd.g(24, new Bundle(0));
      if (paramd == null)
      {
        x.i("MicroMsg.WebView.CookiesCleanup", "bundle is null, skip cookies cleanup");
        return;
      }
    }
    catch (RemoteException paramd)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.WebView.CookiesCleanup", paramd, "", new Object[0]);
        paramd = null;
      }
      paramd = paramd.getStringArrayList("cookies_cleanup_url_list");
      if (bi.cX(paramd))
      {
        x.i("MicroMsg.WebView.CookiesCleanup", "url list is empty, skip cookies cleanup");
        return;
      }
      cN(paramd);
      c.ij(ad.getContext());
      c.sync();
      x.i("MicroMsg.WebView.CookiesCleanup", "cleanup cookies end");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/modeltools/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */