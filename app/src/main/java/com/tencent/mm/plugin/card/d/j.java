package com.tencent.mm.plugin.card.d;

import android.content.Context;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.c;
import com.tencent.mm.protocal.c.abv;
import com.tencent.mm.protocal.c.ly;
import com.tencent.mm.protocal.c.lz;
import com.tencent.mm.protocal.c.ma;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j
{
  private static lz H(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.w("MicroMsg.CardStickyHelper", "parseLayoutItemList param obj null");
      return null;
    }
    lz locallz = new lz();
    locallz.rqi = new LinkedList();
    for (;;)
    {
      int i;
      try
      {
        JSONArray localJSONArray = paramJSONObject.getJSONArray("item_list");
        i = 0;
        if (i < localJSONArray.length())
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i);
          if (localJSONObject == null)
          {
            paramJSONObject = null;
            if ((paramJSONObject != null) && ((paramJSONObject.end_time > bi.VE()) || (paramJSONObject.end_time == 0)))
            {
              locallz.rqi.add(paramJSONObject);
              break label188;
            }
          }
          else
          {
            paramJSONObject = new ly();
            paramJSONObject.hyB = localJSONObject.optString("announcement");
            paramJSONObject.cac = localJSONObject.optString("card_id");
            paramJSONObject.end_time = localJSONObject.optInt("end_time", 0);
            paramJSONObject.rqg = localJSONObject.optInt("update_time", 0);
            paramJSONObject.rqh = localJSONObject.optString("label_wording");
            continue;
          }
        }
        else
        {
          return locallz;
        }
      }
      catch (JSONException paramJSONObject)
      {
        x.printErrStackTrace("MicroMsg.CardStickyHelper", paramJSONObject, "", new Object[0]);
      }
      x.i("MicroMsg.CardStickyHelper", "item.end_time > Util.nowSecond()");
      label188:
      i += 1;
    }
  }
  
  public static String a(Context paramContext, int paramInt, CardInfo paramCardInfo)
  {
    switch (paramInt % 10)
    {
    default: 
      return null;
    case 3: 
      return paramContext.getString(a.g.card_sticky_expiring_title);
    case 2: 
      return paramContext.getString(a.g.card_sticky_member_card_title);
    case 1: 
      return paramContext.getString(a.g.card_sticky_nearby_title);
    case 0: 
      return paramContext.getString(a.g.card_sticky_order_title);
    }
    return paramCardInfo.field_label_wording;
  }
  
  public static void b(LinkedList<ly> paramLinkedList, int paramInt)
  {
    if (paramLinkedList == null) {
      return;
    }
    int j = paramLinkedList.size();
    int i = 0;
    label12:
    Object localObject;
    c localc;
    String str1;
    String str2;
    int k;
    if (i < paramLinkedList.size())
    {
      localObject = (ly)paramLinkedList.get(i);
      localc = am.axi();
      str1 = ((ly)localObject).cac;
      str2 = ((ly)localObject).hyB;
      k = ((ly)localObject).end_time;
      if (!bi.oW(str1)) {
        break label78;
      }
      x.w("MicroMsg.CardInfoStorage", "cardId null");
    }
    for (;;)
    {
      i += 1;
      break label12;
      break;
      label78:
      localObject = "update UserCardInfo set stickyIndex=" + ((j - i) * 10 + paramInt) + ", stickyAnnouncement='" + str2 + "', stickyEndTime=" + k + " where card_id='" + str1 + "'";
      localc.diF.fV("UserCardInfo", (String)localObject);
    }
  }
  
  public static void c(LinkedList<ly> paramLinkedList, int paramInt)
  {
    if (paramLinkedList == null) {
      return;
    }
    int i = 0;
    label7:
    c localc;
    String str;
    if (i < paramLinkedList.size())
    {
      localObject = (ly)paramLinkedList.get(i);
      localc = am.axi();
      str = ((ly)localObject).cac;
      if (((ly)localObject).rqh == null) {
        break label109;
      }
    }
    label109:
    for (Object localObject = ((ly)localObject).rqh;; localObject = "")
    {
      localObject = "update UserCardInfo set stickyIndex=" + paramInt + ", label_wording='" + (String)localObject + "' where card_id='" + str + "'";
      localc.diF.fV("UserCardInfo", (String)localObject);
      i += 1;
      break label7;
      break;
    }
  }
  
  public static abv xU(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.CardStickyHelper", "jsonRet null");
      return null;
    }
    abv localabv = new abv();
    try
    {
      paramString = new JSONObject(paramString);
      localabv.rGo = paramString.optString("layout_buff");
      localJSONObject = paramString.getJSONObject("list");
      if (localJSONObject == null) {
        break label354;
      }
      localabv.rGr = new ma();
      localabv.rGr.rqj = H(localJSONObject.optJSONObject("expiring_list"));
      localabv.rGr.rqk = H(localJSONObject.optJSONObject("member_card_list"));
      localabv.rGr.rql = H(localJSONObject.optJSONObject("nearby_list"));
      localabv.rGr.rqm = H(localJSONObject.optJSONObject("label_list"));
      localabv.rGr.rqn = H(localJSONObject.optJSONObject("first_list"));
      if ((localabv.rGr.rqn == null) || (localabv.rGr.rqn.rqi == null)) {
        break label277;
      }
      i = localabv.rGr.rqn.rqi.size() - 1;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        JSONObject localJSONObject;
        int i;
        label277:
        boolean bool;
        label354:
        x.printErrStackTrace("MicroMsg.CardStickyHelper", paramString, "", new Object[0]);
        continue;
        i -= 1;
      }
    }
    if (i >= 0)
    {
      paramString = (ly)localabv.rGr.rqn.rqi.get(i);
      if (!bi.oW(paramString.cac))
      {
        paramString = am.axi().xm(paramString.cac);
        if ((paramString != null) && (!paramString.avT())) {
          localabv.rGr.rqn.rqi.remove(i);
        }
      }
    }
    else
    {
      localabv.rGs = localJSONObject.optString("red_dot_wording");
      if (localJSONObject.optInt("show_red_dot", 0) == 1) {}
      for (bool = true;; bool = false)
      {
        localabv.rGt = bool;
        String str = localJSONObject.optString("title");
        paramString = str;
        if (str == null) {
          paramString = "";
        }
        am.axn().putValue("key_card_entrance_tips", paramString);
        localabv.rGu = localJSONObject.optInt("top_scene", 100);
        return localabv;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */