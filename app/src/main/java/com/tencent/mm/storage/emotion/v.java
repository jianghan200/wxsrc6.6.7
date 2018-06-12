package com.tencent.mm.storage.emotion;

import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.Log;

public final class v
  extends j
{
  public HashMap<String, u> tdh;
  
  public final List<u> aEb()
  {
    if (this.tdh == null) {
      cnP();
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.tdh.values().iterator();
    while (localIterator.hasNext())
    {
      u localu = (u)localIterator.next();
      if ((localu.position >= 0) && (localu.position < com.tencent.mm.br.e.cjH().apW())) {
        localArrayList.add(localu);
      }
    }
    Collections.sort(localArrayList, new v.1(this));
    return localArrayList;
  }
  
  public final void aPm()
  {
    g.Ei().DT().a(aa.a.tae, null);
    this.tdh = new HashMap();
  }
  
  public final void cnP()
  {
    Object localObject = (String)g.Ei().DT().get(aa.a.tae, "");
    this.tdh = new HashMap();
    try
    {
      localObject = new JSONArray((String)localObject);
      int i = 0;
      while (i < ((JSONArray)localObject).length())
      {
        u localu = new u();
        JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
        localu.aAL = localJSONObject.optString("key", "");
        localu.position = localJSONObject.optInt("position", 0);
        localu.tdg = localJSONObject.optInt("use_count", 0);
        localu.dDj = localJSONObject.optLong("last_time", 0L);
        this.tdh.put(localu.aAL, localu);
        i += 1;
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      Log.w("SmileyUsageInfoStorage", "data error clear all");
      aPm();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/storage/emotion/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */