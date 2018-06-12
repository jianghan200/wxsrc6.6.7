package com.tencent.mm.hardcoder;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h
  implements g.a
{
  public static int dlm = -1;
  public static int dln = -1;
  final Map<Integer, a> dlk = new TreeMap();
  private int dll = 0;
  
  public final boolean fx(String paramString)
  {
    String[] arrayOfString = paramString.trim().split(",");
    if (arrayOfString.length > 0)
    {
      long l = bi.getLong(arrayOfString[0], 0L);
      int i = 1;
      if (i < arrayOfString.length)
      {
        Integer localInteger = Integer.valueOf(this.dll + i - 1);
        if (this.dlk.containsKey(localInteger)) {
          paramString = (a)this.dlk.get(localInteger);
        }
        for (;;)
        {
          paramString.dlq.put(Long.valueOf(l), Integer.valueOf(bi.getInt(arrayOfString[i], 0)));
          i += 1;
          break;
          paramString = new a();
          this.dlk.put(localInteger, paramString);
        }
      }
    }
    return true;
  }
  
  public final void initialize()
  {
    this.dlk.clear();
    for (;;)
    {
      Object localObject2;
      final Object localObject3;
      try
      {
        Object localObject1 = Build.MODEL;
        if (localObject1 == null) {
          return;
        }
        x.i("MicroMsg.PowerConsumption", "[oneliang] device model:%s", new Object[] { localObject1 });
        localObject1 = ((String)localObject1).toUpperCase();
        localObject2 = ad.getContext().getAssets().open("hardcoder/power.json");
        localObject3 = new StringBuilder();
        g.a((InputStream)localObject2, new g.a()
        {
          public final boolean fx(String paramAnonymousString)
          {
            localObject3.append(paramAnonymousString);
            return true;
          }
        });
        localObject2 = new JSONObject(((StringBuilder)localObject3).toString());
        if (!((JSONObject)localObject2).has((String)localObject1)) {
          break label316;
        }
        localObject1 = ((JSONObject)localObject2).getJSONObject((String)localObject1);
        localObject2 = ((JSONObject)localObject1).keys();
        int i = 0;
        if (!((Iterator)localObject2).hasNext()) {
          break label501;
        }
        ((Iterator)localObject2).next();
        i += 1;
        continue;
        if ((j >= i) || (!((JSONObject)localObject1).has("cluster" + j))) {
          break label316;
        }
        localObject2 = ((JSONObject)localObject1).getJSONArray("cluster" + j);
        int k = 0;
        if (k < ((JSONArray)localObject2).length())
        {
          fx(((JSONArray)localObject2).getString(k));
          k += 1;
          continue;
        }
        this.dll = this.dlk.size();
        switch (j)
        {
        case 0: 
          dlm = this.dll - 1;
        }
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.PowerConsumption", "initialize exception:" + localException.getMessage());
        return;
      }
      dln = this.dll - 1;
      break label506;
      label316:
      x.i("MicroMsg.PowerConsumption", "[oneliang] cluster0:%s,cluster1:%s", new Object[] { Integer.valueOf(dlm), Integer.valueOf(dln) });
      Iterator localIterator = this.dlk.entrySet().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (Map.Entry)localIterator.next();
        x.i("MicroMsg.PowerConsumption", "config cpu:" + ((Map.Entry)localObject2).getKey());
        localObject2 = ((a)((Map.Entry)localObject2).getValue()).dlq.entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          x.i("MicroMsg.PowerConsumption", ((Map.Entry)localObject3).getKey() + "," + ((Map.Entry)localObject3).getValue());
        }
      }
      return;
      label501:
      int j = 0;
      continue;
      label506:
      j += 1;
    }
  }
  
  public static final class a
  {
    public final Map<Long, Integer> dlq = new TreeMap();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/hardcoder/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */