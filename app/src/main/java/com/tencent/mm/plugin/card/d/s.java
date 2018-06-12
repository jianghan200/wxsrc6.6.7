package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.mm.plugin.card.sharecard.model.l;
import com.tencent.mm.plugin.card.sharecard.model.m;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class s
{
  public static l yf(String paramString)
  {
    int m = 1;
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutData jsonContent is null");
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).optJSONObject("list");
      if (paramString == null)
      {
        x.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutData resultJson is null");
        return null;
      }
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.ShareCardLayoutDataParser", paramString, "", new Object[0]);
      return null;
    }
    l locall = new l();
    locall.hyv = paramString.optString("local_city");
    locall.hyt = yg(paramString.optString("local_city_list"));
    locall.hyu = yg(paramString.optString("other_city_list"));
    locall.hyw = paramString.optBoolean("local_end");
    locall.hyx = paramString.optBoolean("other_end");
    locall.cal = paramString.optBoolean("show_red_dot");
    locall.cam = paramString.optBoolean("show_new");
    locall.hyz = paramString.optString("tips");
    locall.hyy = yh(paramString.optString("icons"));
    locall.hyA = paramString.optInt("newest_sharecard_time_second");
    int i;
    int j;
    label209:
    int k;
    if (locall.hyw)
    {
      i = 1;
      if (!locall.hyx) {
        break label283;
      }
      j = 1;
      if (!locall.cal) {
        break label288;
      }
      k = 1;
      label219:
      if (!locall.cam) {
        break label293;
      }
    }
    for (;;)
    {
      x.i("MicroMsg.ShareCardLayoutDataParser", "localEnd:%d, otherEnd:%d, showRedDot:%d, showNew:%d, tips:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), locall.hyz });
      return locall;
      i = 0;
      break;
      label283:
      j = 0;
      break label209;
      label288:
      k = 0;
      break label219;
      label293:
      m = 0;
    }
  }
  
  private static LinkedList<m> yg(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutItem jsonContent is null");
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).optJSONArray("item_list");
      if ((paramString == null) || (paramString.length() == 0))
      {
        x.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutItem itemListJson is null");
        return null;
      }
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.ShareCardLayoutDataParser", paramString, "", new Object[0]);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramString.length())
    {
      JSONObject localJSONObject = paramString.optJSONObject(i);
      m localm = new m();
      localm.cac = localJSONObject.optString("card_id");
      localm.huU = localJSONObject.optString("card_tp_id");
      localm.hyB = localJSONObject.optString("announcement");
      localm.hyC = localJSONObject.optInt("end_time", 0);
      localm.hyD = localJSONObject.optInt("update_time", 0);
      localm.hyE = localJSONObject.optInt("item_type", 0);
      localm.top = localJSONObject.optInt("top", 0);
      x.i("MicroMsg.ShareCardLayoutDataParser", "ljd: card_tp_id:" + localm.huU + " top:" + localm.top);
      localLinkedList.add(localm);
      i += 1;
    }
    return localLinkedList;
  }
  
  private static LinkedList<String> yh(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardIcons jsonContent is null");
      return null;
    }
    try
    {
      paramString = new JSONArray(paramString);
      if (paramString.length() == 0)
      {
        x.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardIcons itemListJson is null");
        return null;
      }
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.ShareCardLayoutDataParser", paramString, "", new Object[0]);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramString.length())
    {
      localLinkedList.add(paramString.optString(i));
      i += 1;
    }
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/d/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */