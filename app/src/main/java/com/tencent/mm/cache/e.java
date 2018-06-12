package com.tencent.mm.cache;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public abstract interface e
{
  public abstract Object get(Object paramObject);
  
  public abstract void o(Object paramObject1, Object paramObject2);
  
  public abstract Object remove(Object paramObject);
  
  public static final class a
  {
    private static Map<String, e> dam = new HashMap();
    
    public static <T> T E(String paramString1, String paramString2)
    {
      return (T)a(eY(paramString1), paramString2);
    }
    
    public static <T> void F(String paramString1, String paramString2)
    {
      b(eY(paramString1), paramString2);
    }
    
    private static <T> T a(e parame, String paramString)
    {
      if (parame == null)
      {
        x.e("MicroMsg.ICacheService.Factory", "null service");
        return null;
      }
      try
      {
        parame = parame.get(paramString);
        return parame;
      }
      catch (Exception parame)
      {
        x.e("MicroMsg.ICacheService.Factory", "cast failed, different type ?");
        x.e("MicroMsg.ICacheService.Factory", "exception:%s", new Object[] { bi.i(parame) });
      }
      return null;
    }
    
    public static void a(String paramString, e parame)
    {
      dam.put(paramString, parame);
    }
    
    public static <T> void a(String paramString1, String paramString2, T paramT)
    {
      paramString1 = eY(paramString1);
      if (paramString1 == null)
      {
        x.e("MicroMsg.ICacheService.Factory", "null service");
        return;
      }
      paramString1.o(paramString2, paramT);
    }
    
    private static <T> T b(e parame, String paramString)
    {
      if (parame == null)
      {
        x.e("MicroMsg.ICacheService.Factory", "null service");
        return null;
      }
      try
      {
        parame = parame.remove(paramString);
        return parame;
      }
      catch (Exception parame)
      {
        x.e("MicroMsg.ICacheService.Factory", "cast failed, different type ?");
        x.e("MicroMsg.ICacheService.Factory", "exception:%s", new Object[] { bi.i(parame) });
      }
      return null;
    }
    
    private static e eY(String paramString)
    {
      return (e)dam.get(paramString);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/cache/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */