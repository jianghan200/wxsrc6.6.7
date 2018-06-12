package com.tencent.mm.svg.b;

import java.lang.reflect.Field;

public final class b
{
  private static boolean dti = false;
  private static String mPackageName = "";
  private static boolean tfq = false;
  private static boolean tfr = false;
  
  private static final Object ZN(String paramString)
  {
    try
    {
      Class localClass = Class.forName(mPackageName + ".svg.SVGBuildConfig");
      paramString = localClass.getDeclaredField(paramString);
      paramString.setAccessible(true);
      paramString = paramString.get(localClass);
      return paramString;
    }
    catch (NoSuchFieldException paramString)
    {
      c.printErrStackTrace("MicroMSG.WeChatSVGConfig", paramString, "NoSuchFieldException", new Object[0]);
      return null;
    }
    catch (IllegalArgumentException paramString)
    {
      for (;;)
      {
        c.printErrStackTrace("MicroMSG.WeChatSVGConfig", paramString, "IllegalArgumentException", new Object[0]);
      }
    }
    catch (ClassNotFoundException paramString)
    {
      for (;;)
      {
        c.printErrStackTrace("MicroMSG.WeChatSVGConfig", paramString, "ClassNotFoundException", new Object[0]);
      }
    }
    catch (IllegalAccessException paramString)
    {
      for (;;)
      {
        c.printErrStackTrace("MicroMSG.WeChatSVGConfig", paramString, "IllegalAccessException", new Object[0]);
      }
    }
  }
  
  public static void cQ(String paramString)
  {
    mPackageName = paramString;
  }
  
  public static final boolean col()
  {
    return tfr;
  }
  
  public static final boolean com()
  {
    Object localObject;
    if (!dti)
    {
      localObject = ZN("WxSVGCode");
      if (localObject != null) {
        break label52;
      }
    }
    label52:
    for (tfq = false;; tfq = ((Boolean)localObject).booleanValue())
    {
      c.i("MicroMSG.WeChatSVGConfig", "Initialized mUsingWeChatSVGCode %s", new Object[] { Boolean.valueOf(tfq) });
      dti = true;
      if (tfq) {
        break;
      }
      return true;
    }
    return false;
  }
  
  public static final Class<?> con()
  {
    Object localObject = ZN("WxSVGRawClass");
    if (localObject != null) {
      return (Class)localObject;
    }
    return null;
  }
  
  public static long coo()
  {
    return System.nanoTime();
  }
  
  public static long gq(long paramLong)
  {
    return (System.nanoTime() - paramLong) / 1000L;
  }
  
  public static final void lp(boolean paramBoolean)
  {
    tfr = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/svg/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */