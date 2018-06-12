package com.tencent.mm.v;

import android.util.Log;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import org.json.JSONObject;

public final class g
{
  private static volatile int dpf = 0;
  private static volatile boolean dpg = false;
  
  public static c Dc()
  {
    if (dpf == 1) {
      return new k();
    }
    return new d();
  }
  
  public static a Dd()
  {
    if (dpf == 1) {
      return new j();
    }
    return new b();
  }
  
  public static int De()
  {
    return dpf;
  }
  
  public static JSONObject fU(String paramString)
  {
    if (!dpg) {
      initialize();
    }
    if (dpf == 1) {
      return new h(paramString);
    }
    return new JSONObject(paramString);
  }
  
  public static c fV(String paramString)
  {
    if (dpf == 1) {
      return new k(paramString);
    }
    return new d(paramString);
  }
  
  public static a fW(String paramString)
  {
    if (dpf == 1) {
      return new j(paramString);
    }
    return new b(paramString);
  }
  
  public static void gF(int paramInt)
  {
    dpf = paramInt;
    dpg = true;
  }
  
  public static void initialize()
  {
    com.tencent.mm.bu.a.post(new Runnable()
    {
      public final void run()
      {
        Object localObject = a.b.dnp;
        localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.fJ("100295");
        if (localObject == null)
        {
          x.i("MicroMsg.JSONFactory", "JSON lib type ABTest item is null.");
          return;
        }
        if (!((com.tencent.mm.storage.c)localObject).isValid())
        {
          g.gF(1);
          return;
        }
        try
        {
          g.gF(bi.getInt((String)((com.tencent.mm.storage.c)localObject).ckq().get("jsonLibType"), 1));
          x.i("MicroMsg.JSONFactory", "current jsonLibType is : %d", new Object[] { Integer.valueOf(g.bB()) });
          return;
        }
        catch (Exception localException)
        {
          x.w("MicroMsg.JSONFactory", "parse jsonLibType error : %s", new Object[] { Log.getStackTraceString(localException) });
        }
      }
    });
  }
  
  public static c n(Map paramMap)
  {
    if (dpf == 1) {
      return new k(paramMap);
    }
    return new d(paramMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/v/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */