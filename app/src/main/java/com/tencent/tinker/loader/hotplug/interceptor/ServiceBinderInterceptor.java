package com.tencent.tinker.loader.hotplug.interceptor;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.IBinder;
import android.os.IInterface;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ServiceBinderInterceptor
  extends Interceptor<IBinder>
{
  private static Class<?> vuo = null;
  private static Field vup = null;
  private static Method vuq = null;
  private final String bqB;
  private final Context vum;
  private final BinderInvocationHandler vun;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: aconst_null
    //   1: putstatic 35	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:vuo	Ljava/lang/Class;
    //   4: aconst_null
    //   5: putstatic 37	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:vup	Ljava/lang/reflect/Field;
    //   8: aconst_null
    //   9: putstatic 39	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:vuq	Ljava/lang/reflect/Method;
    //   12: ldc 2
    //   14: monitorenter
    //   15: getstatic 35	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:vuo	Ljava/lang/Class;
    //   18: astore_0
    //   19: aload_0
    //   20: ifnonnull +42 -> 62
    //   23: ldc 41
    //   25: invokestatic 47	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   28: astore_0
    //   29: aload_0
    //   30: putstatic 35	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:vuo	Ljava/lang/Class;
    //   33: aload_0
    //   34: ldc 49
    //   36: invokestatic 55	com/tencent/tinker/loader/shareutil/ShareReflectUtil:d	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   39: putstatic 37	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:vup	Ljava/lang/reflect/Field;
    //   42: getstatic 35	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:vuo	Ljava/lang/Class;
    //   45: ldc 57
    //   47: iconst_1
    //   48: anewarray 43	java/lang/Class
    //   51: dup
    //   52: iconst_0
    //   53: ldc 59
    //   55: aastore
    //   56: invokestatic 63	com/tencent/tinker/loader/shareutil/ShareReflectUtil:c	(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   59: putstatic 39	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:vuq	Ljava/lang/reflect/Method;
    //   62: ldc 2
    //   64: monitorexit
    //   65: return
    //   66: astore_0
    //   67: ldc 2
    //   69: monitorexit
    //   70: aload_0
    //   71: athrow
    //   72: astore_0
    //   73: goto -11 -> 62
    // Local variable table:
    //   start	length	slot	name	signature
    //   18	16	0	localClass	Class
    //   66	5	0	localObject	Object
    //   72	1	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   15	19	66	finally
    //   23	62	66	finally
    //   62	65	66	finally
    //   67	70	66	finally
    //   23	62	72	java/lang/Throwable
  }
  
  public ServiceBinderInterceptor(Context paramContext, String paramString, BinderInvocationHandler paramBinderInvocationHandler)
  {
    while ((paramContext != null) && ((paramContext instanceof ContextWrapper))) {
      paramContext = ((ContextWrapper)paramContext).getBaseContext();
    }
    this.vum = paramContext;
    this.bqB = paramString;
    this.vun = paramBinderInvocationHandler;
  }
  
  private static Class<?>[] U(Class<?> paramClass)
  {
    if (paramClass == null) {
      return null;
    }
    HashSet localHashSet = new HashSet(10);
    while (!Object.class.equals(paramClass))
    {
      localHashSet.addAll(Arrays.asList(paramClass.getInterfaces()));
      paramClass = paramClass.getSuperclass();
    }
    return (Class[])localHashSet.toArray(new Class[localHashSet.size()]);
  }
  
  private static <T> T a(Class<?>[] paramArrayOfClass, InvocationHandler paramInvocationHandler)
  {
    Class[] arrayOfClass = new Class[paramArrayOfClass.length + 1];
    System.arraycopy(paramArrayOfClass, 0, arrayOfClass, 0, paramArrayOfClass.length);
    arrayOfClass[paramArrayOfClass.length] = Interceptor.ITinkerHotplugProxy.class;
    try
    {
      paramArrayOfClass = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), arrayOfClass, paramInvocationHandler);
      return paramArrayOfClass;
    }
    catch (Throwable localThrowable)
    {
      paramArrayOfClass = new HashSet(4);
      int j = arrayOfClass.length;
      int i = 0;
      while (i < j)
      {
        paramArrayOfClass.add(arrayOfClass[i].getClassLoader());
        i += 1;
      }
      if (paramArrayOfClass.size() == 1) {}
      for (paramArrayOfClass = (ClassLoader)paramArrayOfClass.iterator().next();; paramArrayOfClass = new ClassLoader()
          {
            protected final Class<?> loadClass(String paramAnonymousString, boolean paramAnonymousBoolean)
            {
              Iterator localIterator = this.vur.iterator();
              while (localIterator.hasNext())
              {
                Class localClass = ((ClassLoader)localIterator.next()).loadClass(paramAnonymousString);
                if (localClass != null) {
                  return localClass;
                }
              }
              throw new ClassNotFoundException("cannot find class: " + paramAnonymousString);
            }
          }) {
        try
        {
          paramInvocationHandler = Proxy.newProxyInstance(paramArrayOfClass, arrayOfClass, paramInvocationHandler);
          return paramInvocationHandler;
        }
        catch (Throwable paramInvocationHandler)
        {
          throw new RuntimeException("cl: " + paramArrayOfClass, localThrowable);
        }
      }
    }
  }
  
  public static abstract interface BinderInvocationHandler
  {
    public abstract Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject);
  }
  
  private static class FakeClientBinderHandler
    implements InvocationHandler
  {
    private final ServiceBinderInterceptor.BinderInvocationHandler vun;
    private final IBinder vus;
    
    FakeClientBinderHandler(IBinder paramIBinder, ServiceBinderInterceptor.BinderInvocationHandler paramBinderInvocationHandler)
    {
      this.vus = paramIBinder;
      this.vun = paramBinderInvocationHandler;
    }
    
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if ("queryLocalInterface".equals(paramMethod.getName()))
      {
        paramMethod = this.vus.getInterfaceDescriptor();
        if (paramMethod.equals("android.app.IActivityManager")) {}
        for (paramMethod = "android.app.ActivityManagerNative";; paramMethod = paramMethod + "$Stub")
        {
          paramMethod = (IInterface)ShareReflectUtil.c(Class.forName(paramMethod), "asInterface", new Class[] { IBinder.class }).invoke(null, new Object[] { this.vus });
          paramObject = new ServiceBinderInterceptor.FakeInterfaceHandler(paramMethod, (IBinder)paramObject, this.vun);
          return ServiceBinderInterceptor.b(ServiceBinderInterceptor.V(paramMethod.getClass()), (InvocationHandler)paramObject);
        }
      }
      return paramMethod.invoke(this.vus, paramArrayOfObject);
    }
  }
  
  private static class FakeInterfaceHandler
    implements InvocationHandler
  {
    private final ServiceBinderInterceptor.BinderInvocationHandler vun;
    private final IBinder vus;
    private final IInterface vut;
    
    FakeInterfaceHandler(IInterface paramIInterface, IBinder paramIBinder, ServiceBinderInterceptor.BinderInvocationHandler paramBinderInvocationHandler)
    {
      this.vut = paramIInterface;
      this.vus = paramIBinder;
      this.vun = paramBinderInvocationHandler;
    }
    
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if ("asBinder".equals(paramMethod.getName())) {
        return this.vus;
      }
      return this.vun.invoke(this.vut, paramMethod, paramArrayOfObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */