package com.tencent.matrix.a.c;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public final class b
{
  private final String bqB;
  private final String bqC;
  private final b bqD;
  private IBinder bqE;
  
  public b(String paramString1, String paramString2, b paramb)
  {
    this.bqB = paramString1;
    this.bqC = paramString2;
    this.bqD = paramb;
  }
  
  private Object tr()
  {
    try
    {
      Object localObject1 = Class.forName(this.bqC);
      Object localObject3 = Class.forName(String.format("%s$Stub", new Object[] { this.bqC }));
      Object localObject2 = ((Class)localObject3).getDeclaredMethod("asInterface", new Class[] { IBinder.class }).invoke(null, new Object[] { this.bqE });
      localObject3 = ((Class)localObject3).getClassLoader();
      if (localObject3 == null)
      {
        com.tencent.matrix.d.b.e("Matrix.SystemServiceBinderHooker", "doHook exp classLoader null ", new Object[0]);
        return Boolean.valueOf(false);
      }
      localObject2 = new c(localObject2, this.bqD);
      localObject1 = Proxy.newProxyInstance((ClassLoader)localObject3, new Class[] { IBinder.class, IInterface.class, localObject1 }, (InvocationHandler)localObject2);
      return localObject1;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.matrix.d.b.w("Matrix.SystemServiceBinderHooker", "createPowerManagerServiceProxy exp:%s", new Object[] { localThrowable.getLocalizedMessage() });
    }
    return null;
  }
  
  public final boolean doHook()
  {
    com.tencent.matrix.d.b.i("Matrix.SystemServiceBinderHooker", "doHook: serviceName:%s, serviceClsName:%s", new Object[] { this.bqB, this.bqC });
    try
    {
      Object localObject1 = Class.forName("android.os.ServiceManager");
      this.bqE = ((IBinder)((Class)localObject1).getDeclaredMethod("getService", new Class[] { String.class }).invoke(null, new Object[] { this.bqB }));
      Object localObject2 = ((Class)localObject1).getClassLoader();
      if (localObject2 == null)
      {
        com.tencent.matrix.d.b.e("Matrix.SystemServiceBinderHooker", "doHook exp classLoader null ", new Object[0]);
        return false;
      }
      a locala = new a(this.bqE, tr());
      localObject2 = (IBinder)Proxy.newProxyInstance((ClassLoader)localObject2, new Class[] { IBinder.class }, locala);
      localObject1 = ((Class)localObject1).getDeclaredField("sCache");
      ((Field)localObject1).setAccessible(true);
      ((Map)((Field)localObject1).get(null)).put(this.bqB, localObject2);
      return true;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.matrix.d.b.e("Matrix.SystemServiceBinderHooker", "doHook exp : " + localThrowable.getLocalizedMessage(), new Object[0]);
    }
    return false;
  }
  
  public final boolean doUnHook()
  {
    if (this.bqE == null)
    {
      com.tencent.matrix.d.b.i("Matrix.SystemServiceBinderHooker", "doUnHook sOriginPowerManagerService null", new Object[0]);
      return false;
    }
    try
    {
      Field localField = Class.forName("android.os.ServiceManager").getDeclaredField("sCache");
      localField.setAccessible(true);
      ((Map)localField.get(null)).put(this.bqB, this.bqE);
      return true;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.matrix.d.b.e("Matrix.SystemServiceBinderHooker", "doUnHook exp : " + localThrowable.getLocalizedMessage(), new Object[0]);
    }
    return false;
  }
  
  private static final class a
    implements InvocationHandler
  {
    private final IBinder bqF;
    private final Object bqG;
    
    a(IBinder paramIBinder, Object paramObject)
    {
      this.bqF = paramIBinder;
      this.bqG = paramObject;
    }
    
    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if (("queryLocalInterface".equals(paramMethod.getName())) && (this.bqG != null)) {
        return this.bqG;
      }
      return paramMethod.invoke(this.bqF, paramArrayOfObject);
    }
  }
  
  public static abstract interface b
  {
    public abstract void b(Method paramMethod, Object[] paramArrayOfObject);
  }
  
  private static final class c
    implements InvocationHandler
  {
    final Object bqH;
    final b.b bqI;
    
    c(Object paramObject, b.b paramb)
    {
      this.bqH = paramObject;
      this.bqI = paramb;
    }
    
    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if (this.bqI != null) {
        this.bqI.b(paramMethod, paramArrayOfObject);
      }
      return paramMethod.invoke(this.bqH, paramArrayOfObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/a/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */