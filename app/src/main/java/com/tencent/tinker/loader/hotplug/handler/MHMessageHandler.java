package com.tencent.tinker.loader.hotplug.handler;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import com.tencent.tinker.loader.hotplug.IncrementComponentManager;
import com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.MessageHandler;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MHMessageHandler
  implements HandlerMessageInterceptor.MessageHandler
{
  private static final int sMX;
  private final Context mContext;
  
  static
  {
    int j = 100;
    int i = j;
    if (Build.VERSION.SDK_INT < 27) {}
    try
    {
      i = ShareReflectUtil.d(Class.forName("android.app.ActivityThread$H"), "LAUNCH_ACTIVITY").getInt(null);
      sMX = i;
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        i = j;
      }
    }
  }
  
  public MHMessageHandler(Context paramContext)
  {
    while ((paramContext instanceof ContextWrapper))
    {
      Context localContext = ((ContextWrapper)paramContext).getBaseContext();
      if (localContext == null) {
        break;
      }
      paramContext = localContext;
    }
    this.mContext = paramContext;
  }
  
  private static <T> void y(T paramT1, T paramT2)
  {
    if ((paramT1 == null) || (paramT2 == null)) {
      return;
    }
    Class localClass = paramT1.getClass();
    while (!localClass.equals(Object.class))
    {
      Field[] arrayOfField = localClass.getDeclaredFields();
      int j = arrayOfField.length;
      int i = 0;
      label38:
      Field localField;
      if (i < j)
      {
        localField = arrayOfField[i];
        if ((!localField.isSynthetic()) && (!Modifier.isStatic(localField.getModifiers()))) {
          if (!localField.isAccessible()) {
            localField.setAccessible(true);
          }
        }
      }
      try
      {
        localField.set(paramT2, localField.get(paramT1));
        i += 1;
        break label38;
        localClass = localClass.getSuperclass();
      }
      catch (Throwable localThrowable)
      {
        for (;;) {}
      }
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    int i = 2;
    if (paramMessage.what == sMX) {}
    try
    {
      Object localObject1 = paramMessage.obj;
      if (localObject1 == null)
      {
        new StringBuilder("msg: [").append(paramMessage.what).append("] has no 'obj' value.");
        return false;
      }
      paramMessage = (Intent)ShareReflectUtil.b(localObject1, "intent").get(localObject1);
      if (paramMessage != null)
      {
        ShareIntentUtil.a(paramMessage, this.mContext.getClassLoader());
        ComponentName localComponentName = (ComponentName)paramMessage.getParcelableExtra("tinker_iek_old_component");
        if (localComponentName == null)
        {
          new StringBuilder("oldComponent was null, start ").append(paramMessage.getComponent()).append(" next.");
          return false;
        }
        ActivityInfo localActivityInfo1 = (ActivityInfo)ShareReflectUtil.b(localObject1, "activityInfo").get(localObject1);
        if (localActivityInfo1 != null)
        {
          ActivityInfo localActivityInfo2 = IncrementComponentManager.acS(localComponentName.getClassName());
          if (localActivityInfo2 == null)
          {
            new StringBuilder("Failed to query target activity's info, perhaps the target is not hotpluged component. Target: ").append(localComponentName.getClassName());
            return false;
          }
          int j = localActivityInfo2.screenOrientation;
          if (j == -1) {}
          for (;;)
          {
            try
            {
              localObject1 = ShareReflectUtil.b(localObject1, "token").get(localObject1);
              Object localObject2 = ShareReflectUtil.c(Class.forName("android.app.ActivityManagerNative"), "getDefault", new Class[0]).invoke(null, new Object[0]);
              ShareReflectUtil.b(localObject2, "setRequestedOrientation", new Class[] { IBinder.class, Integer.TYPE }).invoke(localObject2, new Object[] { localObject1, Integer.valueOf(i) });
              y(localActivityInfo2, localActivityInfo1);
              paramMessage.setComponent(localComponentName);
              paramMessage.removeExtra("tinker_iek_old_component");
              return false;
            }
            catch (Throwable localThrowable)
            {
              continue;
            }
            i = j;
          }
        }
      }
      return false;
    }
    catch (Throwable paramMessage) {}
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/hotplug/handler/MHMessageHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */