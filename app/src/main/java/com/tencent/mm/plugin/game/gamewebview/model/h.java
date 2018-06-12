package com.tencent.mm.plugin.game.gamewebview.model;

import android.text.TextUtils;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.d;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URI;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public final class h
{
  public static void a(d paramd, JSONObject paramJSONObject)
  {
    int j = 1;
    String str1 = paramJSONObject.optString("link");
    Object localObject2 = paramd.getPreVerifyExtInfo();
    Object localObject1;
    int i;
    label99:
    String str3;
    if ((!TextUtils.isEmpty(str1)) && (localObject2 != null) && (((c.d)localObject2).qhi != null) && (((c.d)localObject2).qhi.size() > 0))
    {
      localObject1 = new LinkedList();
      int k = str1.indexOf("://");
      if (k == -1)
      {
        i = 1;
        String str2 = str1.substring(i + k);
        localObject2 = ((c.d)localObject2).qhi.iterator();
        do
        {
          i = j;
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          str3 = (String)((Iterator)localObject2).next();
        } while (TextUtils.isEmpty(str3));
        k = str3.indexOf("://");
        if (k != -1) {
          break label288;
        }
        i = 1;
        label148:
        str3 = str3.substring(i + k);
        if (!str2.startsWith(str3)) {
          break label293;
        }
        i = 0;
        if ((i == 0) || (((List)localObject1).isEmpty())) {
          break label330;
        }
        str1 = URI.create(str1).getHost();
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext()) {
          if (str1.endsWith((String)((Iterator)localObject1).next())) {
            i = 0;
          }
        }
      }
    }
    for (;;)
    {
      if (i != 0) {}
      try
      {
        localObject1 = paramd.getShareUrl();
        paramJSONObject.put("img_url", "");
        paramJSONObject.put("link", localObject1);
        paramJSONObject.put("desc", localObject1);
        paramJSONObject.put("title", paramd.getTitle());
        return;
      }
      catch (Exception paramd)
      {
        x.printErrStackTrace("MicroMsg.GameWebViewShareController", paramd, "", new Object[0]);
        return;
      }
      i = 3;
      break;
      label288:
      i = 3;
      break label148;
      label293:
      if (str3.contains("/")) {
        break label99;
      }
      ((List)localObject1).add(str3);
      break label99;
      label330:
      continue;
      i = 0;
    }
  }
  
  public static void c(d paramd)
  {
    paramd.Dr("sendAppMessage");
    if (paramd.bs("sendAppMessage", 89))
    {
      paramd.cW("menu:share:appmessage", "");
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      String str = paramd.getShareUrl();
      localJSONObject.put("link", str);
      localJSONObject.put("desc", str);
      localJSONObject.put("title", paramd.getTitle());
      paramd.cX("sendAppMessage", localJSONObject.toString());
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.GameWebViewShareController", localException, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */