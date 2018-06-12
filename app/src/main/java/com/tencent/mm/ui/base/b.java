package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class b
{
  public static void E(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent == null) || (paramContext == null) || (!(paramContext instanceof Activity))) {}
    while (!paramIntent.getBooleanExtra("animation_pop_in", false)) {
      return;
    }
    ((Activity)paramContext).overridePendingTransition(a.a.pop_in, a.a.anim_not_change);
  }
  
  public static int M(Class<?> paramClass)
  {
    Object localObject;
    do
    {
      localObject = (a)paramClass.getAnnotation(a.class);
      if (localObject != null) {
        return ((a)localObject).value();
      }
      localObject = paramClass.getSuperclass();
      paramClass = (Class<?>)localObject;
    } while (localObject != null);
    return 0;
  }
  
  public static boolean N(Class<?> paramClass)
  {
    return (M(paramClass) & 0x1) == 0;
  }
  
  public static void Y(Activity paramActivity)
  {
    try
    {
      Method localMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
      localMethod.setAccessible(true);
      localMethod.invoke(paramActivity, new Object[0]);
      return;
    }
    catch (Throwable paramActivity)
    {
      x.printErrStackTrace("MicroMsg.ActivityUtil", paramActivity, "call convertActivityFromTranslucent Fail: %s", new Object[] { paramActivity.getMessage() });
    }
  }
  
  public static int ZX(String paramString)
  {
    paramString = ZY(paramString);
    if (paramString != null) {
      return M(paramString);
    }
    return 0;
  }
  
  private static Class<?> ZY(String paramString)
  {
    try
    {
      Class localClass = Class.forName(paramString);
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      x.printErrStackTrace("MicroMsg.ActivityUtil", localClassNotFoundException, "", new Object[0]);
      x.e("MicroMsg.ActivityUtil", "Class %s not found in dex", new Object[] { paramString });
    }
    return null;
  }
  
  @TargetApi(16)
  public static void a(Activity paramActivity, a parama)
  {
    if (d.fS(16))
    {
      x.w("MicroMsg.ActivityUtil", "convertActivityToTranslucent::Android Version Error %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      return;
    }
    for (;;)
    {
      int i;
      try
      {
        Class[] arrayOfClass = Activity.class.getDeclaredClasses();
        int j = arrayOfClass.length;
        i = 0;
        localObject1 = null;
        if (i < j)
        {
          localObject2 = arrayOfClass[i];
          if (!((Class)localObject2).getSimpleName().contains("TranslucentConversionListener")) {
            break label246;
          }
          localObject1 = localObject2;
          break label246;
        }
        if (parama == null) {
          break label241;
        }
        Object localObject2 = new b((byte)0);
        ((b)localObject2).tsj = new WeakReference(parama);
        parama = Proxy.newProxyInstance(((Class)localObject1).getClassLoader(), new Class[] { localObject1 }, (InvocationHandler)localObject2);
        if (d.fS(21))
        {
          localObject1 = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[] { localObject1 });
          ((Method)localObject1).setAccessible(true);
          ((Method)localObject1).invoke(paramActivity, new Object[] { parama });
          return;
        }
      }
      catch (Throwable paramActivity)
      {
        x.printErrStackTrace("MicroMsg.ActivityUtil", paramActivity, "call convertActivityToTranslucent Fail: %s", new Object[] { paramActivity.getMessage() });
        return;
      }
      Object localObject1 = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[] { localObject1, ActivityOptions.class });
      ((Method)localObject1).setAccessible(true);
      ((Method)localObject1).invoke(paramActivity, new Object[] { parama, null });
      return;
      label241:
      parama = null;
      continue;
      label246:
      i += 1;
    }
  }
  
  public static void gD(Context paramContext)
  {
    if ((paramContext == null) || (!(paramContext instanceof Activity))) {
      return;
    }
    ((Activity)paramContext).overridePendingTransition(a.a.pop_in, a.a.anim_not_change);
  }
  
  public static void gE(Context paramContext)
  {
    if ((paramContext == null) || (!(paramContext instanceof Activity))) {
      return;
    }
    ((Activity)paramContext).overridePendingTransition(a.a.pop_in, a.a.pop_out);
  }
  
  public static void gF(Context paramContext)
  {
    if ((paramContext == null) || (!(paramContext instanceof Activity))) {
      return;
    }
    ((Activity)paramContext).overridePendingTransition(a.a.anim_not_change, a.a.pop_out);
  }
  
  public static void gG(Context paramContext)
  {
    if ((paramContext == null) || (!(paramContext instanceof Activity))) {
      return;
    }
    ((Activity)paramContext).overridePendingTransition(a.a.anim_not_change, a.a.anim_not_change);
  }
  
  public static abstract interface a
  {
    public abstract void kh(boolean paramBoolean);
  }
  
  private static final class b
    implements InvocationHandler
  {
    WeakReference<b.a> tsj;
    
    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      boolean bool2 = false;
      if (this.tsj == null)
      {
        x.i("MicroMsg.ActivityUtil", "swipe invoke fail, callbackRef NULL!");
        return null;
      }
      paramObject = (b.a)this.tsj.get();
      if (paramObject == null)
      {
        x.i("MicroMsg.ActivityUtil", "swipe invoke fail, callback NULL!");
        return null;
      }
      boolean bool1 = bool2;
      if (paramArrayOfObject != null)
      {
        bool1 = bool2;
        if (paramArrayOfObject.length > 0)
        {
          bool1 = bool2;
          if ((paramArrayOfObject[0] instanceof Boolean)) {
            bool1 = ((Boolean)paramArrayOfObject[0]).booleanValue();
          }
        }
      }
      ((b.a)paramObject).kh(bool1);
      return null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/base/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */