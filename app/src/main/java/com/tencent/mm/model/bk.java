package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class bk
{
  public static bk dDa = new bk();
  private SharedPreferences dDb = ad.getContext().getSharedPreferences(ad.chY() + "_register_history", 0);
  
  public final void d(String paramString, Map<String, String> paramMap)
  {
    Object localObject;
    for (;;)
    {
      try
      {
        if (paramMap.isEmpty())
        {
          x.i("MicroMsg.RegisterAccountInfo", "kv map is null or empty!");
          return;
        }
        if (!this.dDb.contains(paramString)) {
          break label158;
        }
        localObject = this.dDb.getString(paramString, "");
        if (!bi.oW((String)localObject))
        {
          localObject = new JSONObject(new String(Base64.decode((String)localObject, 0)));
          Iterator localIterator = paramMap.keySet().iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          String str = (String)localIterator.next();
          ((JSONObject)localObject).put(str, paramMap.get(str));
          continue;
        }
        localObject = new JSONObject();
      }
      catch (Exception paramMap)
      {
        x.e("MicroMsg.RegisterAccountInfo", "save account info about %s failed, error: %s", new Object[] { paramString, paramMap.getMessage() });
        return;
      }
      continue;
      label158:
      localObject = new JSONObject();
    }
    x.i("MicroMsg.RegisterAccountInfo", "put json str %s", new Object[] { ((JSONObject)localObject).toString() });
    this.dDb.edit().putString(paramString, Base64.encodeToString(((JSONObject)localObject).toString().getBytes(), 0)).commit();
  }
  
  public final String getString(String paramString1, String paramString2)
  {
    try
    {
      x.i("MicroMsg.RegisterAccountInfo", "get %s, %s", new Object[] { paramString1, paramString2 });
      if (this.dDb.contains(paramString1))
      {
        Object localObject = new String(Base64.decode(this.dDb.getString(paramString1, ""), 0));
        if (!bi.oW((String)localObject))
        {
          x.i("MicroMsg.RegisterAccountInfo", "get json str %s", new Object[] { localObject });
          localObject = new JSONObject((String)localObject);
          if (((JSONObject)localObject).has(paramString2)) {
            return ((JSONObject)localObject).getString(paramString2);
          }
        }
      }
      else
      {
        x.w("MicroMsg.RegisterAccountInfo", "register info about %s is not found!", new Object[] { paramString1 });
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.RegisterAccountInfo", "get register info %s about %s failed, error: %s", new Object[] { paramString2, paramString1, localException.getMessage() });
      }
    }
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/model/bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */