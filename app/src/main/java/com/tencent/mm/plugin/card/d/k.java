package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.mm.protocal.c.lg;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
{
  public static LinkedList<lg> bb(String paramString, int paramInt)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.CardListItemParser", "parseCardTpInfoItemArray jsonContent is null");
      return null;
    }
    JSONArray localJSONArray;
    try
    {
      localJSONArray = new JSONArray(paramString);
      if (localJSONArray.length() == 0)
      {
        x.e("MicroMsg.CardListItemParser", "parseCardTpInfoItemArray cardItemListJson is null");
        return null;
      }
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.CardListItemParser", paramString, "", new Object[0]);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    if (i < localJSONArray.length())
    {
      JSONObject localJSONObject = localJSONArray.optJSONObject(i);
      lg locallg = new lg();
      if (paramInt == 26) {}
      for (paramString = "cardId";; paramString = "card_id")
      {
        locallg.huU = localJSONObject.optString(paramString);
        locallg.code = localJSONObject.optString("code");
        localLinkedList.add(locallg);
        i += 1;
        break;
      }
    }
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */