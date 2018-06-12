package com.tencent.mm.plugin.webview.b;

import android.database.Cursor;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class b
{
  private static long pNr = 2592000L;
  private static b pNs;
  private c pNt;
  private Map<String, Long> pNu = new HashMap();
  private long pNv = 0L;
  
  public static b bTB()
  {
    if (pNs == null) {
      pNs = new b();
    }
    return pNs;
  }
  
  public final void Qc(String paramString)
  {
    c localc = bTC();
    paramString = String.format("delete from %s where %s=\"%s\"", new Object[] { "WebViewData", "appId", paramString });
    x.d("MicroMsg.WebViewDataStorage", "cleanAllData: " + paramString);
    boolean bool = localc.fV("WebViewData", paramString);
    x.d("MicroMsg.WebViewDataStorage", "cleanAllData: " + bool);
  }
  
  public final boolean a(String paramString1, final String paramString2, String paramString3, final String paramString4, final String paramString5, boolean paramBoolean)
  {
    Object localObject = bTC().rawQuery(String.format("select %s from %s where %s=\"%s\"", new Object[] { "size", "WebViewData", "appIdKey", c.fl(paramString1, paramString2) }), new String[0]);
    long l2;
    long l4;
    long l5;
    label105:
    final long l3;
    if (localObject == null)
    {
      l2 = 0L;
      l4 = paramString2.getBytes().length + paramString3.getBytes().length;
      l5 = l4 - l2;
      if (!this.pNu.containsKey(paramString1)) {
        break label231;
      }
      l1 = ((Long)this.pNu.get(paramString1)).longValue();
      l3 = l1 + l5;
      if (!paramString1.equals("wx62d9035fd4fd2059")) {
        break label377;
      }
    }
    label231:
    label377:
    for (final long l1 = l3 - 52428800L;; l1 = l3 - 10485760L)
    {
      x.i("MicroMsg.WebViewDataCenter", "prevSize = %d, valueSize = %d, diffSize = %d, newAppSize = %d, expireSize = %d", new Object[] { Long.valueOf(l2), Long.valueOf(l4), Long.valueOf(l5), Long.valueOf(l3), Long.valueOf(l1) });
      if ((l1 <= 0L) || (paramBoolean)) {
        break label388;
      }
      return false;
      l1 = 0L;
      if (((Cursor)localObject).moveToFirst()) {
        l1 = ((Cursor)localObject).getLong(0);
      }
      ((Cursor)localObject).close();
      l2 = l1;
      break;
      localObject = bTC();
      String str = String.format("select %s from %s where %s=\"%s\"", new Object[] { "size", "WebViewData", "appIdKey", c.aj(paramString1, "###@@@@TOTAL@@@###SIZE####", "_") });
      x.d("MicroMsg.WebViewDataStorage", "getAppIdSize: " + str);
      l3 = 0L;
      localObject = ((c)localObject).rawQuery(str, new String[0]);
      l1 = l3;
      if (localObject != null)
      {
        l1 = l3;
        if (((Cursor)localObject).moveToFirst()) {
          l1 = ((Cursor)localObject).getLong(0);
        }
        ((Cursor)localObject).close();
      }
      x.d("MicroMsg.WebViewDataStorage", "getAppIdSize: " + l1);
      break label105;
    }
    label388:
    au.Em().H(new Runnable()
    {
      public final void run()
      {
        c localc;
        Object localObject1;
        long l2;
        Object localObject2;
        label118:
        String str1;
        boolean bool;
        if (l1 > 0L)
        {
          localc = b.this.bTC();
          localObject1 = l3;
          l2 = l1;
          localObject1 = String.format("select * from %s where appId='%s' order by weight,timeStamp", new Object[] { "WebViewData", localObject1 });
          x.d("MicroMsg.WebViewDataStorage", "deleteSize querySql: " + (String)localObject1);
          localObject2 = localc.rawQuery((String)localObject1, new String[0]);
          if (localObject2 == null)
          {
            l1 = 0L;
            b.a(b.this).put(l3, Long.valueOf(paramString2 - l1));
            localc = b.this.bTC();
            localObject1 = l3;
            localObject2 = paramString4;
            str1 = paramString5;
            String str2 = bi.aG(this.pNy, "1");
            l1 = b.Qd(this.pNz);
            a locala = new a();
            locala.field_appId = ((String)localObject1);
            locala.field_appIdKey = c.fl((String)localObject1, (String)localObject2);
            locala.field_value = str1;
            locala.field_weight = str2;
            locala.field_expireTime = (l1 + System.currentTimeMillis() / 1000L);
            locala.field_size = (((String)localObject2).getBytes().length + str1.getBytes().length);
            locala.field_timeStamp = (System.currentTimeMillis() / 1000L);
            bool = localc.a(locala);
            x.d("MicroMsg.WebViewDataStorage", "setData: " + bool);
            localc = b.this.bTC();
            localObject1 = l3;
            if (b.a(b.this).get(l3) != null) {
              break label703;
            }
          }
        }
        label703:
        for (long l1 = 0L;; l1 = ((Long)b.a(b.this).get(l3)).longValue())
        {
          localObject2 = new a();
          ((a)localObject2).field_appId = ((String)localObject1);
          ((a)localObject2).field_appIdKey = c.aj((String)localObject1, "###@@@@TOTAL@@@###SIZE####", "_");
          ((a)localObject2).field_expireTime = Long.MAX_VALUE;
          ((a)localObject2).field_size = l1;
          x.d("MicroMsg.WebViewDataStorage", "setAppIdSize: %b, size: %d", new Object[] { Boolean.valueOf(localc.a((com.tencent.mm.sdk.e.c)localObject2)), Long.valueOf(l1) });
          b.b(b.this);
          return;
          localObject1 = new LinkedList();
          long l3;
          for (l1 = l2; (((Cursor)localObject2).moveToFirst()) && (l1 > 0L); l1 -= l3)
          {
            str1 = ((Cursor)localObject2).getString(1);
            l3 = ((Cursor)localObject2).getLong(6);
            ((List)localObject1).add(str1);
          }
          ((Cursor)localObject2).close();
          if (((List)localObject1).size() > 0)
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("(");
            localObject1 = ((List)localObject1).iterator();
            while (((Iterator)localObject1).hasNext())
            {
              str1 = (String)((Iterator)localObject1).next();
              ((StringBuilder)localObject2).append("\"" + str1 + "\",");
            }
            ((StringBuilder)localObject2).deleteCharAt(((StringBuilder)localObject2).length() - 1);
            ((StringBuilder)localObject2).append(")");
            localObject1 = String.format("delete from %s where %s in %s", new Object[] { "WebViewData", "appIdKey", ((StringBuilder)localObject2).toString() });
            x.d("MicroMsg.WebViewDataStorage", "deleteSize deleteSql: " + (String)localObject1);
            bool = localc.fV("WebViewData", (String)localObject1);
            x.d("MicroMsg.WebViewDataStorage", "deleteSize: " + bool);
          }
          l1 = l2 - l1;
          break;
          b.a(b.this).put(l3, Long.valueOf(paramString2));
          break label118;
        }
      }
    });
    return true;
  }
  
  public final void b(String paramString, JSONArray paramJSONArray)
  {
    c localc = bTC();
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    int i = 0;
    for (;;)
    {
      if (i < paramJSONArray.length()) {
        try
        {
          String str = paramJSONArray.getString(i);
          localStringBuilder.append("\"" + c.fl(paramString, str) + "\",");
          i += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            x.e("MicroMsg.WebViewDataStorage", "clearData: " + localException.getMessage());
          }
        }
      }
    }
    localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    localStringBuilder.append(")");
    paramString = String.format("delete from %s where %s in %s", new Object[] { "WebViewData", "appIdKey", localStringBuilder.toString() });
    x.d("MicroMsg.WebViewDataStorage", "deleteData: " + paramString);
    boolean bool = localc.fV("WebViewData", paramString);
    x.d("MicroMsg.WebViewDataStorage", "clearData: " + bool);
  }
  
  public final c bTC()
  {
    if (this.pNt == null)
    {
      g.Ek();
      this.pNt = new c(g.Ei().dqq);
    }
    return this.pNt;
  }
  
  public final a fk(String paramString1, String paramString2)
  {
    c localc = bTC();
    paramString1 = String.format("select * from %s where %s=\"%s\"", new Object[] { "WebViewData", "appIdKey", c.fl(paramString1, paramString2) });
    x.d("MicroMsg.WebViewDataStorage", "getData: " + paramString1);
    paramString1 = localc.rawQuery(paramString1, new String[0]);
    paramString2 = new a();
    if (paramString1 != null)
    {
      if (paramString1.moveToFirst()) {
        paramString2.d(paramString1);
      }
      paramString1.close();
    }
    return paramString2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */