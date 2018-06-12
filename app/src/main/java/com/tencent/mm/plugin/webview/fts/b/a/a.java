package com.tencent.mm.plugin.webview.fts.b.a;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a
{
  public static final a pPM = new a();
  public Map<String, com.tencent.mm.plugin.webview.fts.b.a.a.a> pPL = new HashMap();
  
  public static com.tencent.mm.plugin.webview.fts.b.a.a.a Qg(String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (!paramString.startsWith("//test-widget-ui"))) {
      x.w("SearchWidgetTestUiMgr", "not test-widget-ui formate");
    }
    for (;;)
    {
      return null;
      paramString = paramString.split("\\s+");
      if (paramString.length != 2)
      {
        x.w("SearchWidgetTestUiMgr", "test-widget-ui arg length illegal");
        return null;
      }
      paramString = paramString[1];
      try
      {
        paramString = new com.tencent.mm.plugin.webview.fts.b.a.a.a(paramString);
        if (paramString == null) {
          continue;
        }
        pPM.pPL.put(paramString.bPS, paramString);
        x.i("SearchWidgetTestUiMgr", "test-widget-ui args %s, %s, %s, %s", new Object[] { paramString.pPR, paramString.bPS, paramString.pPP, paramString.pPQ });
        return paramString;
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          x.printErrStackTrace("SearchWidgetTestUiMgr", paramString, "", new Object[0]);
          paramString = null;
        }
      }
    }
  }
  
  public static Uri a(Uri paramUri, String paramString1, String paramString2)
  {
    Object localObject = paramUri.getQueryParameterNames();
    Uri.Builder localBuilder = paramUri.buildUpon().clearQuery();
    Iterator localIterator = ((Set)localObject).iterator();
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.equals(paramString1)) {}
      for (localObject = paramString2;; localObject = paramUri.getQueryParameter(str))
      {
        localBuilder.appendQueryParameter(str, (String)localObject);
        break;
      }
    }
    return localBuilder.build();
  }
  
  public static a bTN()
  {
    return pPM;
  }
  
  public final com.tencent.mm.plugin.webview.fts.b.a.a.a Qh(String paramString)
  {
    return (com.tencent.mm.plugin.webview.fts.b.a.a.a)this.pPL.get(paramString);
  }
  
  public final boolean Qi(String paramString)
  {
    return (this.pPL.containsKey(paramString)) && (!((com.tencent.mm.plugin.webview.fts.b.a.a.a)this.pPL.get(paramString)).pPV);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/webview/fts/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */