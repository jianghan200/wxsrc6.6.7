package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.x5.sdk.d;
import java.util.HashMap;
import org.json.JSONObject;

public final class p
{
  public static int a(Context paramContext, String paramString1, String paramString2, String paramString3, ValueCallback<String> paramValueCallback)
  {
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("local", "true");
    localHashMap.put("style", "1");
    String str = "";
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("path", paramString1);
      localJSONObject.put("ext", paramString2);
      localJSONObject.put("token", paramString3);
      paramString1 = localJSONObject.toString();
      return d.startMiniQBToLoadUrl(paramContext, paramString1, localHashMap, paramValueCallback);
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.QbReaderLogic", paramString1, "openReadFile", new Object[0]);
        paramString1 = str;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/model/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */