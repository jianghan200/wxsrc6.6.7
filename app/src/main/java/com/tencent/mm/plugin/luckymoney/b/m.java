package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class m
{
  public static f M(JSONObject paramJSONObject)
  {
    f localf = new f();
    if (paramJSONObject != null)
    {
      localf.kPI = paramJSONObject.optInt("hbType");
      localf.ceS = paramJSONObject.optInt("hbStatus");
      localf.kPJ = paramJSONObject.optString("statusMess");
      localf.kPK = paramJSONObject.optString("gameMess");
      localf.kLf = paramJSONObject.optString("wishing");
      localf.kPL = paramJSONObject.optString("sendNick");
      localf.kPM = paramJSONObject.optString("sendHeadImg");
      localf.kLZ = paramJSONObject.optString("sendId");
      localf.kPN = paramJSONObject.optString("adMessage");
      localf.kPO = paramJSONObject.optString("adUrl");
      localf.cfh = paramJSONObject.optLong("amount");
      localf.kPP = paramJSONObject.optLong("recNum");
      localf.kPQ = paramJSONObject.optLong("recAmount");
      localf.hUg = paramJSONObject.optInt("totalNum");
      localf.kPR = paramJSONObject.optLong("totalAmount");
      localf.kPS = paramJSONObject.optString("receiveId");
      localf.kPT = paramJSONObject.optInt("hasWriteAnswer");
      localf.kPU = paramJSONObject.optInt("isSender");
      localf.kPV = paramJSONObject.optInt("isContinue");
      localf.kPW = paramJSONObject.optString("headTitle");
      localf.ceT = paramJSONObject.optInt("receiveStatus");
      localf.kPX = paramJSONObject.optInt("canShare");
      localf.kNg = paramJSONObject.optInt("jumpChange");
      localf.kNi = paramJSONObject.optString("changeWording");
      localf.kNh = paramJSONObject.optString("changeUrl");
      localf.kQd = paramJSONObject.optInt("hbKind");
      localf.kNj = paramJSONObject.optString("externMess");
      localf.kQg = paramJSONObject.optString("sendUserName");
      if ((bi.oW(localf.kPL)) && (!bi.oW(localf.kQg))) {
        localf.kPL = ((b)g.l(b.class)).gT(localf.kQg);
      }
      localf.kPY = new a();
      Object localObject = paramJSONObject.optJSONObject("atomicFunc");
      if (localObject != null)
      {
        localf.kPY.ddp = ((JSONObject)localObject).optInt("enable");
        localf.kPY.kPx = ((JSONObject)localObject).optString("fissionContent");
        localf.kPY.kPw = ((JSONObject)localObject).optString("fissionUrl");
      }
      localf.kPZ = new LinkedList();
      localObject = paramJSONObject.optJSONArray("operationHeader");
      if (localObject != null)
      {
        int i = 0;
        while (i < ((JSONArray)localObject).length())
        {
          localf.kPZ.add(O(((JSONArray)localObject).getJSONObject(i)));
          i += 1;
        }
      }
      localf.kQb = paramJSONObject.optString("watermark");
      localf.kQc = paramJSONObject.optString("context");
      localf.kQf = paramJSONObject.optString("contextMd5");
      localf.resourceId = paramJSONObject.optInt("resourceId");
      localf.kQa = O(paramJSONObject.optJSONObject("operationTail"));
      localf.kQe = N(paramJSONObject);
      localf.kQh = paramJSONObject.optInt("jumpChangeType");
      localf.kQi = paramJSONObject.optString("changeIconUrl");
    }
    return localf;
  }
  
  private static LinkedList<n> N(JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.optJSONArray("record");
    LinkedList localLinkedList = new LinkedList();
    if (paramJSONObject != null)
    {
      int i = 0;
      while (i < paramJSONObject.length())
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
        n localn = new n();
        if (localJSONObject != null)
        {
          localn.kQC = localJSONObject.optString("receiveName");
          localn.kQD = localJSONObject.optString("receiveHeadImg");
          localn.kQp = localJSONObject.optLong("receiveAmount");
          localn.kQq = localJSONObject.optString("receiveTime");
          localn.kQE = localJSONObject.optString("answer");
          localn.kPS = localJSONObject.optString("receiveId");
          localn.kQF = localJSONObject.optString("gameTips");
          localn.userName = localJSONObject.optString("userName");
          if ((bi.oW(localn.kQC)) && (!bi.oW(localn.userName))) {
            localn.kQC = ((b)g.l(b.class)).gT(localn.userName);
          }
        }
        localLinkedList.add(localn);
        i += 1;
      }
    }
    return localLinkedList;
  }
  
  public static ai O(JSONObject paramJSONObject)
  {
    ai localai = new ai();
    if (paramJSONObject != null)
    {
      localai.ddp = paramJSONObject.optInt("enable", 0);
      localai.content = paramJSONObject.optString("content");
      localai.iconUrl = paramJSONObject.optString("iconUrl");
      localai.type = paramJSONObject.optString("type");
      localai.name = paramJSONObject.optString("name");
      localai.kRD = paramJSONObject.optInt("ossKey");
      localai.kRE = paramJSONObject.optInt("focus");
    }
    return localai;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */