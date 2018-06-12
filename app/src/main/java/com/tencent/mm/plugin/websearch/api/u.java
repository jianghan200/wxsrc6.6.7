package com.tencent.mm.plugin.websearch.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.tencent.mm.model.q;
import com.tencent.mm.protocal.c.bjj;
import com.tencent.mm.protocal.c.bjk;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.IOException;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class u
{
  public static bjk pLM;
  
  public static bjk bSX()
  {
    Object localObject;
    if (pLM == null)
    {
      localObject = bSY();
      pLM = new bjk();
      localObject = ad.getContext().getSharedPreferences("fts_history_search_sp", 0).getString((String)localObject, "");
      if (!bi.oW((String)localObject)) {
        localObject = Base64.decode(((String)localObject).getBytes(), 0);
      }
    }
    try
    {
      pLM.aG((byte[])localObject);
      return pLM;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static String bSY()
  {
    return "key_pb_history_list" + q.GF();
  }
  
  public static String bSZ()
  {
    bjk localbjk = bSX();
    int j = localbjk.hbG.size();
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      JSONArray localJSONArray1 = new JSONArray();
      JSONObject localJSONObject2 = new JSONObject();
      JSONArray localJSONArray2 = new JSONArray();
      int i = 0;
      while ((i < localbjk.hbG.size()) && (i < j))
      {
        bjj localbjj = (bjj)localbjk.hbG.get(i);
        JSONObject localJSONObject3 = new JSONObject();
        localJSONObject3.put("word", localbjj.sjx);
        localJSONArray2.put(localJSONObject3);
        i += 1;
      }
      localJSONObject2.put("items", localJSONArray2);
      localJSONObject2.put("count", localJSONArray2.length());
      localJSONObject2.put("type", 4);
      localJSONArray1.put(localJSONObject2);
      localJSONObject1.put("data", localJSONArray1);
      localJSONObject1.put("ret", 0);
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    return localJSONObject1.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */