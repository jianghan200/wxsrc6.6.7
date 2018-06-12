package b.c.b;

import b.e.b;
import b.e.e;

public final class j
{
  private static final k vGH;
  private static final b[] vGI;
  
  static
  {
    try
    {
      k localk1 = (k)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
      if (localk1 != null)
      {
        vGH = localk1;
        vGI = new b[0];
        return;
      }
    }
    catch (ClassCastException localClassCastException)
    {
      for (;;)
      {
        Object localObject1 = null;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;)
      {
        Object localObject3 = null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        k localk2 = null;
        continue;
        localk2 = new k();
      }
    }
  }
  
  public static b X(Class paramClass)
  {
    return new c(paramClass);
  }
  
  public static e a(h paramh)
  {
    return paramh;
  }
  
  public static String a(f paramf)
  {
    String str = paramf.getClass().getGenericInterfaces()[0].toString();
    paramf = str;
    if (str.startsWith("kotlin.jvm.functions.")) {
      paramf = str.substring(21);
    }
    return paramf;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/b/c/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */