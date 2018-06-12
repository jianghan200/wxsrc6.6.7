package com.tencent.matrix.iocanary.b;

import com.tencent.matrix.c.c.a;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

public final class a
{
  private static volatile Object bra;
  public volatile boolean bqZ;
  private final c.a brb;
  
  public a(c.a parama)
  {
    this.brb = parama;
  }
  
  public static boolean tv()
  {
    try
    {
      Object localObject = Class.forName("dalvik.system.CloseGuard");
      Field localField = ((Class)localObject).getDeclaredField("REPORTER");
      localField.setAccessible(true);
      localField.set(null, bra);
      localObject = ((Class)localObject).getDeclaredField("ENABLED");
      ((Field)localObject).setAccessible(true);
      ((Field)localObject).set(null, Boolean.valueOf(false));
      localField.setAccessible(false);
      c.setEnabled(false);
      return true;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.matrix.d.b.e("Matrix.CloseGuardHooker", "tryHook exp=%s", new Object[] { localThrowable });
    }
    return false;
  }
  
  public final boolean tu()
  {
    try
    {
      Object localObject = Class.forName("dalvik.system.CloseGuard");
      Class localClass = Class.forName("dalvik.system.CloseGuard$Reporter");
      Field localField = ((Class)localObject).getDeclaredField("REPORTER");
      localObject = ((Class)localObject).getDeclaredField("ENABLED");
      localField.setAccessible(true);
      ((Field)localObject).setAccessible(true);
      bra = localField.get(null);
      ((Field)localObject).set(null, Boolean.valueOf(true));
      c.setEnabled(true);
      localObject = localClass.getClassLoader();
      if (localObject == null) {
        return false;
      }
      b localb = new b(this.brb, bra);
      localField.set(null, Proxy.newProxyInstance((ClassLoader)localObject, new Class[] { localClass }, localb));
      localField.setAccessible(false);
      return true;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.matrix.d.b.e("Matrix.CloseGuardHooker", "tryHook exp=%s", new Object[] { localThrowable });
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/iocanary/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */