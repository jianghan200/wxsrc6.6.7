package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.mm.plugin.card.model.e;
import com.tencent.mm.protocal.c.ky;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

public final class h
{
  public static String a(LinkedList<e> paramLinkedList, boolean paramBoolean, int paramInt)
  {
    if (paramLinkedList.size() == 0)
    {
      x.e("MicroMsg.CardListItemParser", "parseCardListItemToJson list == null || list.size() == 0");
      return "";
    }
    x.i("MicroMsg.CardListItemParser", "parseCardListItemToJson is_succ:" + paramBoolean + " scene:" + paramInt);
    JSONStringer localJSONStringer = new JSONStringer();
    if (paramInt == 8) {}
    for (;;)
    {
      e locale;
      try
      {
        localJSONStringer.object();
        localJSONStringer.key("card_list");
        localJSONStringer.array();
        Iterator localIterator = paramLinkedList.iterator();
        if (!localIterator.hasNext()) {
          break label312;
        }
        locale = (e)localIterator.next();
        localJSONStringer.object();
        if (paramInt == 26)
        {
          paramLinkedList = "cardId";
          localJSONStringer.key(paramLinkedList);
          localJSONStringer.value(locale.huU);
          if (paramInt != 26) {
            break label335;
          }
          paramLinkedList = "cardExt";
          localJSONStringer.key(paramLinkedList);
          if (locale.cad != null) {
            break label258;
          }
          paramLinkedList = "";
          localJSONStringer.value(paramLinkedList);
          if (paramInt != 26) {
            break label341;
          }
          paramLinkedList = "isSuccess";
          localJSONStringer.key(paramLinkedList);
          if (!paramBoolean) {
            break label275;
          }
          if (paramInt != 26) {
            break label267;
          }
          paramLinkedList = Boolean.valueOf(true);
          localJSONStringer.value(paramLinkedList);
          localJSONStringer.key("code");
          if (locale.code != null) {
            break label303;
          }
          paramLinkedList = "";
          localJSONStringer.value(paramLinkedList);
          localJSONStringer.endObject();
          continue;
        }
        paramLinkedList = "card_id";
      }
      catch (Exception paramLinkedList)
      {
        x.printErrStackTrace("MicroMsg.CardListItemParser", paramLinkedList, "", new Object[0]);
        return "";
      }
      continue;
      label258:
      paramLinkedList = locale.cad;
      continue;
      label267:
      paramLinkedList = Integer.valueOf(1);
      continue;
      label275:
      if (paramInt == 26) {}
      for (paramLinkedList = Boolean.valueOf(false);; paramLinkedList = Integer.valueOf(0))
      {
        localJSONStringer.value(paramLinkedList);
        break;
      }
      label303:
      paramLinkedList = locale.code;
      continue;
      label312:
      localJSONStringer.endArray();
      if (paramInt == 8) {
        localJSONStringer.endObject();
      }
      paramLinkedList = localJSONStringer.toString();
      return paramLinkedList;
      label335:
      paramLinkedList = "card_ext";
      continue;
      label341:
      paramLinkedList = "is_succ";
    }
  }
  
  public static ArrayList<ky> aZ(String paramString, int paramInt)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.CardListItemParser", "parseCardListItemArray jsonContent is null");
      return null;
    }
    if ((paramInt == 8) || (paramInt == 0)) {}
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString).optJSONArray("card_list");
        if ((paramString != null) && (paramString.length() != 0)) {
          break;
        }
        x.e("MicroMsg.CardListItemParser", "parseCardListItemArray cardItemListJson is null");
        return null;
      }
      catch (JSONException paramString)
      {
        x.printErrStackTrace("MicroMsg.CardListItemParser", paramString, "", new Object[0]);
        return null;
      }
      if (paramInt == 26) {
        paramString = new JSONArray(paramString);
      } else {
        paramString = new JSONArray(paramString);
      }
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    JSONObject localJSONObject;
    ky localky;
    if (i < paramString.length())
    {
      localJSONObject = paramString.optJSONObject(i);
      localky = new ky();
      if (paramInt != 26) {
        break label204;
      }
    }
    label204:
    for (String str = "cardId";; str = "card_id")
    {
      localky.huU = localJSONObject.optString(str);
      if (paramInt == 26) {}
      for (str = "cardExt";; str = "card_ext")
      {
        localky.cad = localJSONObject.optString(str);
        localArrayList.add(localky);
        i += 1;
        break;
      }
      return localArrayList;
    }
  }
  
  public static String ba(String paramString, int paramInt)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.CardListItemParser", "parseCardListItemArray jsonContent is null");
      return null;
    }
    JSONArray localJSONArray;
    try
    {
      localJSONArray = new JSONObject(paramString).optJSONArray("card_list");
      if ((localJSONArray == null) || (localJSONArray.length() == 0))
      {
        x.e("MicroMsg.CardListItemParser", "parseCardListItemArray cardItemListJson is null");
        return null;
      }
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.CardListItemParser", paramString, "", new Object[0]);
      return "";
    }
    JSONStringer localJSONStringer = new JSONStringer();
    localJSONStringer.array();
    int i = 0;
    JSONObject localJSONObject;
    label113:
    label142:
    label171:
    label202:
    label236:
    StringBuilder localStringBuilder;
    if (i < localJSONArray.length())
    {
      localJSONObject = localJSONArray.optJSONObject(i);
      localJSONStringer.object();
      if (paramInt != 26) {
        break label354;
      }
      paramString = "cardId";
      localJSONStringer.key(paramString);
      localJSONStringer.value(localJSONObject.optString("card_id"));
      if (paramInt != 26) {
        break label360;
      }
      paramString = "cardExt";
      localJSONStringer.key(paramString);
      localJSONStringer.value(localJSONObject.optString("card_ext"));
      if (paramInt != 26) {
        break label366;
      }
      paramString = "isSuccess";
      localJSONStringer.key(paramString);
      if (paramInt == 26) {
        if (localJSONObject.optInt("is_succ") == 1)
        {
          localJSONStringer.value(true);
          localJSONStringer.key("code");
          if (TextUtils.isEmpty(localJSONObject.optString("encrypt_code"))) {
            break label324;
          }
          localJSONStringer.value(localJSONObject.optString("encrypt_code"));
          localJSONStringer.endObject();
          localStringBuilder = new StringBuilder("parseJsonToArray item").append(i).append("  is_succ:");
          if (paramInt != 26) {
            break label372;
          }
        }
      }
    }
    label324:
    label354:
    label360:
    label366:
    label372:
    for (paramString = "isSuccess";; paramString = "is_succ")
    {
      x.i("MicroMsg.CardListItemParser", localJSONObject.optInt(paramString));
      i += 1;
      break;
      localJSONStringer.value(false);
      break label202;
      localJSONStringer.value(localJSONObject.optInt("is_succ"));
      break label202;
      localJSONStringer.value(localJSONObject.optString("code"));
      break label236;
      localJSONStringer.endArray();
      paramString = localJSONStringer.toString();
      return paramString;
      paramString = "card_id";
      break label113;
      paramString = "card_ext";
      break label142;
      paramString = "is_succ";
      break label171;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */