package com.tencent.mm.booter;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.n.a.a;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.storage.aa;
import com.tencent.mm.xlog.app.XLogSetup;
import java.util.HashMap;

public final class c
{
  private static c cWP;
  public int cWO = -1;
  private final String[] columns = { "_id", "key", "type", "value" };
  private Context ctx;
  private final HashMap<String, Object> values = new HashMap();
  
  private c(Context paramContext)
  {
    this.ctx = paramContext;
    Object localObject1 = paramContext.getContentResolver();
    try
    {
      localObject1 = ((ContentResolver)localObject1).query(a.a.CONTENT_URI, this.columns, null, null, null);
      if (localObject1 == null) {
        return;
      }
    }
    catch (Exception localException)
    {
      Object localObject2;
      for (;;)
      {
        localObject2 = null;
      }
      if (((Cursor)localObject2).getCount() <= 0)
      {
        ((Cursor)localObject2).close();
        return;
      }
      if (!"18c867f0717aa67b2ab7347505ba07ed".equals(bi.k("com.tencent.mm.coolassist", paramContext)))
      {
        ((Cursor)localObject2).close();
        return;
      }
      b.cho();
      int i = ((Cursor)localObject2).getColumnIndex("key");
      int j = ((Cursor)localObject2).getColumnIndex("type");
      int k = ((Cursor)localObject2).getColumnIndex("value");
      while (((Cursor)localObject2).moveToNext())
      {
        paramContext = a.m(((Cursor)localObject2).getInt(j), ((Cursor)localObject2).getString(k));
        this.values.put(((Cursor)localObject2).getString(i), paramContext);
      }
      ((Cursor)localObject2).close();
    }
  }
  
  public static c bj(Context paramContext)
  {
    if (cWP == null) {
      cWP = new c(paramContext);
    }
    return cWP;
  }
  
  public final Boolean eA(String paramString)
  {
    Object localObject = this.values.get(paramString);
    if (localObject == null) {
      return null;
    }
    if ((localObject instanceof Boolean))
    {
      x.d("MicroMsg.Debugger", "getBoolean(): key=" + paramString + ", value=" + localObject.toString());
      return (Boolean)localObject;
    }
    return null;
  }
  
  public final void ez(String paramString)
  {
    boolean bool3 = true;
    Integer localInteger = getInteger(".com.tencent.mm.debug.log.level");
    boolean bool4 = bi.a(eA(".com.tencent.mm.debug.log.append_mode"), false);
    boolean bool2;
    if ((bi.oW(getString(".com.tencent.mm.debug.log.mmlog"))) && (bi.a(eA(".com.tencent.mm.debug.test.uploadLog"), false)))
    {
      bool1 = true;
      if (bool1)
      {
        String str = getString(".com.tencent.mm.debug.log.tag.skey");
        if ((str != null) && (str.length() > 0)) {
          com.tencent.mars.xlog.Xlog.logDecryptor = new y(str);
        }
      }
      bool2 = this.ctx.getSharedPreferences("system_config_prefs", 4).getBoolean("first_launch_weixin", true);
      if (!"MM".equalsIgnoreCase(paramString)) {
        bool2 = false;
      }
      if (bool2) {
        break label183;
      }
      bool2 = true;
      label123:
      XLogSetup.keep_setupXLog(bool2, aa.sOs, e.dgr, localInteger, Boolean.valueOf(bool4), Boolean.valueOf(bool1), paramString);
      x.Da(x.getLogLevel());
      if (bi.getInt(bi.aG(getString(".com.tencent.mm.debug.monkeyEnv"), "0"), 0) != 1) {
        break label188;
      }
    }
    label183:
    label188:
    for (boolean bool1 = bool3;; bool1 = false)
    {
      bj.lj(bool1);
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label123;
    }
  }
  
  public final Integer getInteger(String paramString)
  {
    Object localObject = this.values.get(paramString);
    if ((localObject instanceof Integer))
    {
      x.d("MicroMsg.Debugger", "getInteger(): key=" + paramString + ", value=" + localObject.toString());
      return (Integer)localObject;
    }
    return null;
  }
  
  public final String getString(String paramString)
  {
    Object localObject = this.values.get(paramString);
    if ((localObject instanceof String))
    {
      x.d("MicroMsg.Debugger", "getString(): key=" + paramString + ", value=" + localObject.toString());
      return (String)localObject;
    }
    return null;
  }
  
  public static final class a
  {
    public static Object m(int paramInt, String paramString)
    {
      String str = paramString;
      switch (paramInt)
      {
      default: 
      case 1: 
      case 2: 
      case 4: 
      case 5: 
      case 6: 
        try
        {
          x.e("MicroMsg.Debugger.Resolver", "unknown type");
        }
        catch (Exception paramString)
        {
          str = null;
        }
        return Integer.valueOf(paramString);
        return Long.valueOf(paramString);
        return Boolean.valueOf(paramString);
        return Float.valueOf(paramString);
        paramString = Double.valueOf(paramString);
        return paramString;
      }
      return str;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/booter/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */