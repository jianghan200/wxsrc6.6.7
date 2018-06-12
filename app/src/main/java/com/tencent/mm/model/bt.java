package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class bt
{
  public static bt dDs = new bt();
  private SharedPreferences dDb = ad.getContext().getSharedPreferences(ad.chY() + "_account_history", 0);
  private SharedPreferences dDt = ad.getContext().getSharedPreferences(ad.chY() + "_account_switch", 0);
  
  public final Set<String> IH()
  {
    HashSet localHashSet = new HashSet();
    Set localSet = this.dDt.getStringSet("first_switch_group", null);
    if ((localSet != null) && (!localSet.isEmpty())) {
      localHashSet.addAll(localSet);
    }
    return localHashSet;
  }
  
  public final String II()
  {
    Object localObject = IH();
    StringBuilder localStringBuilder = new StringBuilder();
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      localStringBuilder.append((String)((Iterator)localObject).next());
      localStringBuilder.append(';');
    }
    if (localStringBuilder.length() > 0) {
      localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    }
    x.i("MicroMsg.SwitchAccountInfo", "switch users %s", new Object[] { localStringBuilder.toString() });
    return localStringBuilder.toString();
  }
  
  public final void W(String paramString1, String paramString2)
  {
    if ((bi.G(new String[] { paramString1, paramString2 })) || (paramString1.equals(paramString2))) {
      return;
    }
    Set localSet = this.dDt.getStringSet("first_switch_group", null);
    Object localObject = localSet;
    if (localSet == null) {
      localObject = new HashSet();
    }
    if ((((Set)localObject).contains(paramString1)) && (((Set)localObject).size() < 2)) {
      ((Set)localObject).add(paramString2);
    }
    for (;;)
    {
      paramString1 = this.dDt.edit();
      paramString1.remove("first_switch_group").apply();
      paramString1.putStringSet("first_switch_group", (Set)localObject).commit();
      return;
      ((Set)localObject).clear();
      ((Set)localObject).add(paramString1);
      ((Set)localObject).add(paramString2);
    }
  }
  
  public final void d(String paramString, Map<String, String> paramMap)
  {
    if (paramMap != null) {}
    Object localObject;
    for (;;)
    {
      try
      {
        if (paramMap.isEmpty())
        {
          x.i("MicroMsg.SwitchAccountInfo", "kv map is null or empty!");
          return;
        }
        if (!this.dDb.contains(paramString)) {
          break label162;
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
        x.e("MicroMsg.SwitchAccountInfo", "save account info about %s failed, error: %s", new Object[] { paramString, paramMap.getMessage() });
        return;
      }
      continue;
      label162:
      localObject = new JSONObject();
    }
    x.i("MicroMsg.SwitchAccountInfo", "put json str %s", new Object[] { ((JSONObject)localObject).toString() });
    this.dDb.edit().putString(paramString, Base64.encodeToString(((JSONObject)localObject).toString().getBytes(), 0)).commit();
  }
  
  public final String getString(String paramString1, String paramString2)
  {
    try
    {
      x.i("MicroMsg.SwitchAccountInfo", "get %s, %s", new Object[] { paramString1, paramString2 });
      if (this.dDb.contains(paramString1))
      {
        Object localObject = new String(Base64.decode(this.dDb.getString(paramString1, ""), 0));
        if (!bi.oW((String)localObject))
        {
          x.i("MicroMsg.SwitchAccountInfo", "get json str %s", new Object[] { localObject });
          localObject = new JSONObject((String)localObject);
          if (((JSONObject)localObject).has(paramString2)) {
            return ((JSONObject)localObject).getString(paramString2);
          }
        }
      }
      else
      {
        x.w("MicroMsg.SwitchAccountInfo", "account info about %s is not found!", new Object[] { paramString1 });
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.SwitchAccountInfo", "get account info %s about %s failed, error: %s", new Object[] { paramString2, paramString1, localException.getMessage() });
      }
    }
    return "";
  }
  
  public final void iL(String paramString)
  {
    if (iM(paramString))
    {
      Set localSet = this.dDt.getStringSet("first_switch_group", null);
      if (localSet != null)
      {
        localSet.remove(paramString);
        SharedPreferences.Editor localEditor = this.dDt.edit();
        localEditor.remove("first_switch_group").apply();
        localEditor.putStringSet("first_switch_group", localSet).commit();
      }
    }
    if ((iN(paramString)) && (this.dDb.contains(paramString))) {
      this.dDb.edit().remove(paramString).commit();
    }
  }
  
  public final boolean iM(String paramString)
  {
    Set localSet = this.dDt.getStringSet("first_switch_group", null);
    if (localSet == null) {
      return false;
    }
    return localSet.contains(paramString);
  }
  
  public final boolean iN(String paramString)
  {
    return this.dDb.contains(paramString);
  }
  
  public final void l(String paramString1, String paramString2, String paramString3)
  {
    for (;;)
    {
      try
      {
        if (this.dDb.contains(paramString1))
        {
          localObject = this.dDb.getString(paramString1, "");
          if (!bi.oW((String)localObject))
          {
            localObject = new JSONObject(new String(Base64.decode((String)localObject, 0)));
            if (bi.G(new String[] { paramString2, paramString3 })) {
              break;
            }
            ((JSONObject)localObject).put(paramString2, paramString3);
            x.i("MicroMsg.SwitchAccountInfo", "put key %s, jsonStr %s", new Object[] { paramString2, ((JSONObject)localObject).toString() });
            this.dDb.edit().putString(paramString1, Base64.encodeToString(((JSONObject)localObject).toString().getBytes(), 0)).commit();
            return;
          }
          localObject = new JSONObject();
          continue;
        }
        Object localObject = new JSONObject();
      }
      catch (Exception paramString3)
      {
        x.e("MicroMsg.SwitchAccountInfo", "save account info %s about %s failed, error: %s", new Object[] { paramString2, paramString1, paramString3.getMessage() });
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/model/bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */