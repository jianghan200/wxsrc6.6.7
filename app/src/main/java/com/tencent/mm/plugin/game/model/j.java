package com.tencent.mm.plugin.game.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class j
{
  JSONObject jLQ = new JSONObject();
  
  protected j(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.GameServerData", "Null or nil json string");
      return;
    }
    try
    {
      this.jLQ = new JSONObject(paramString);
      return;
    }
    catch (JSONException paramString)
    {
      x.e("MicroMsg.GameServerData", "Json parsing error");
    }
  }
  
  private static String i(JSONObject paramJSONObject, String paramString)
  {
    if (paramJSONObject == null) {}
    while (paramJSONObject.isNull(paramString)) {
      return null;
    }
    return paramJSONObject.optString(paramString);
  }
  
  protected static LinkedList<d> m(JSONArray paramJSONArray)
  {
    LinkedList localLinkedList = new LinkedList();
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      x.i("MicroMsg.GameServerData", "Null or empty json array");
      return localLinkedList;
    }
    x.i("MicroMsg.GameServerData", "Parsing json AppInfo, size: %d", new Object[] { Integer.valueOf(paramJSONArray.length()) });
    int i = 0;
    if (i < paramJSONArray.length())
    {
      Object localObject = paramJSONArray.optJSONObject(i);
      if (localObject == null)
      {
        x.e("MicroMsg.GameServerData", "Invalid json object");
        localObject = null;
      }
      for (;;)
      {
        if (localObject != null) {
          localLinkedList.add(localObject);
        }
        i += 1;
        break;
        JSONObject localJSONObject = ((JSONObject)localObject).optJSONObject("YYB");
        String str = i((JSONObject)localObject, "appID");
        if (bi.oW(str))
        {
          x.e("MicroMsg.GameServerData", "No AppID field, abort");
          localObject = null;
        }
        else
        {
          x.i("MicroMsg.GameServerData", "Parsing AppID: %s", new Object[] { str });
          d locald = new d();
          locald.field_appId = str;
          locald.field_appName = i((JSONObject)localObject, "name");
          locald.field_appIconUrl = i((JSONObject)localObject, "iconURL");
          locald.field_appType = ",1,";
          locald.field_packageName = i((JSONObject)localObject, "AndroidPackageName");
          locald.di(i((JSONObject)localObject, "downloadURL"));
          locald.dl(i((JSONObject)localObject, "AndroidApkMd5"));
          str = i((JSONObject)localObject, "GooglePlayDownloadUrl");
          int j = ((JSONObject)localObject).optInt("GooglePlayDownloadFlag");
          locald.dm(str);
          if (!bi.oW(str))
          {
            x.i("MicroMsg.GameServerData", "GooglePlay URL: %s, Download Flag: %d", new Object[] { str, Integer.valueOf(j) });
            locald.eA(j);
          }
          if (localJSONObject != null) {
            locald.eA(localJSONObject.optInt("AndroidDownloadFlag"));
          }
          if (localJSONObject != null)
          {
            locald.dr(i(localJSONObject, "DownloadUrl"));
            locald.ds(i(localJSONObject, "ApkMd5"));
            locald.dp(i(localJSONObject, "PreemptiveUrl"));
            locald.dq(i(localJSONObject, "ExtInfo"));
            locald.eB(localJSONObject.optInt("SupportedVersionCode"));
          }
          locald.jLc = i((JSONObject)localObject, "desc");
          locald.jLb = i((JSONObject)localObject, "brief");
          locald.type = ((JSONObject)localObject).optInt("type", 0);
          locald.status = ((JSONObject)localObject).optInt("status");
          locald.jLe = i((JSONObject)localObject, "webURL");
          locald.jLf = i((JSONObject)localObject, "adUrl");
          locald.bHF = i((JSONObject)localObject, "noticeid");
          locald.jLg = ((JSONObject)localObject).optBoolean("isSubscribed");
          locald.versionCode = ((JSONObject)localObject).optInt("versionCode");
          localObject = locald;
          if (localJSONObject != null)
          {
            locald.jLh = i(localJSONObject, "DownloadTipsWording");
            locald.jLi = i(localJSONObject, "BackBtnWording");
            locald.jLj = i(localJSONObject, "DownloadBtnWording");
            localObject = locald;
          }
        }
      }
    }
    return localLinkedList;
  }
  
  protected final JSONArray optJSONArray(String paramString)
  {
    return this.jLQ.optJSONArray(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */