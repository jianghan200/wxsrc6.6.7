package com.tencent.mm.splash;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import java.lang.reflect.Field;
import java.util.ArrayList;

final class k
  extends Instrumentation
{
  public Instrumentation sNk;
  
  public k(Instrumentation paramInstrumentation)
  {
    this.sNk = paramInstrumentation;
    ckl();
  }
  
  private void ckl()
  {
    Field[] arrayOfField = Instrumentation.class.getDeclaredFields();
    int i = 0;
    while (i < arrayOfField.length)
    {
      arrayOfField[i].setAccessible(true);
      Object localObject = arrayOfField[i].get(this.sNk);
      arrayOfField[i].set(this, localObject);
      i += 1;
    }
  }
  
  public final Activity newActivity(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    if (h.sMB != null) {
      h.sMB.cR(paramString);
    }
    if ((h.cjV()) && (!h.ckc().getCanonicalName().equals(paramString)))
    {
      paramClassLoader = new i();
      paramClassLoader.sMW = paramString;
      h.b("WxSplash.SplashHackInstrumentation", "new splash hack activity. replace activity %s", new Object[] { paramString });
      h.sMv.add(paramClassLoader);
    }
    do
    {
      return paramClassLoader;
      paramString = super.newActivity(paramClassLoader, paramString, paramIntent);
      paramClassLoader = paramString;
    } while (!j.ckk());
    h.b("WxSplash.SplashHackInstrumentation", "processing relaunch activity.", new Object[0]);
    paramIntent.putExtra("splash-hack-activity-recreate", true);
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/splash/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */