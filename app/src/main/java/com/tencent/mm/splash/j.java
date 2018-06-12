package com.tencent.mm.splash;

import android.content.Context;
import android.os.Handler.Callback;
import android.os.Message;
import com.tencent.mm.compatible.util.d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Set;

final class j
  implements Handler.Callback
{
  public static int sMX = 100;
  public static int sMY = 113;
  public static int sMZ = 114;
  public static int sNa = 115;
  public static int sNb = 116;
  public static int sNc = 121;
  public static int sNd = 122;
  public static int sNe = 126;
  public static int sNf = 145;
  private static boolean sNg = false;
  private static Runnable sNh;
  private static boolean sNj = false;
  Handler.Callback lGF;
  private Context mContext;
  private boolean sNi = false;
  
  public j(Context paramContext, Handler.Callback paramCallback)
  {
    this.mContext = paramContext;
    this.lGF = paramCallback;
  }
  
  public static void aa(Runnable paramRunnable)
  {
    sNg = true;
    sNh = paramRunnable;
  }
  
  public static boolean ckk()
  {
    return sNj;
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    if (this.sNi)
    {
      h.b("WxSplash.SplashHackHandlerCallback", "found a infinite call loop", new Object[0]);
      return true;
    }
    sNj = false;
    h.b("WxSplash.SplashHackHandlerCallback", "before handleMessage %s, splash %s, pending early %s", new Object[] { Integer.valueOf(paramMessage.what), Boolean.valueOf(h.cjV()), Boolean.valueOf(h.cjW()) });
    if ((sNg) && (paramMessage.what == 987654321))
    {
      if (sNh != null)
      {
        h.b("WxSplash.SplashHackHandlerCallback", "verify hack received.", new Object[0]);
        sNh.run();
      }
      return true;
    }
    Object localObject;
    if ((h.cjV()) && (!h.cjW()))
    {
      h.b("WxSplash.SplashHackHandlerCallback", "handleMessage %s, splash %s", new Object[] { Integer.valueOf(paramMessage.what), Boolean.valueOf(h.cjV()) });
      if ((paramMessage.what == sMY) || (paramMessage.what == sMZ) || (paramMessage.what == sNa) || (paramMessage.what == sNb) || (paramMessage.what == sNc) || (paramMessage.what == sNd) || (paramMessage.what == sNf))
      {
        localObject = Message.obtain();
        ((Message)localObject).copyFrom(paramMessage);
        h.sMw.add(localObject);
        if (h.sMB != null) {
          h.sMB.vh();
        }
        return true;
      }
    }
    if (paramMessage.what == sNe)
    {
      if (h.sMC.size() > 0) {
        sNj = true;
      }
      h.b("WxSplash.SplashHackHandlerCallback", "received a RELAUNCH_ACTIVITY message, with %s splash activity", new Object[] { Integer.valueOf(h.sMC.size()) });
      localObject = paramMessage.obj;
      if (!d.fT(25)) {}
    }
    try
    {
      if (l.sNt == null)
      {
        Field localField = Class.forName("android.app.ActivityThread$ActivityClientRecord").getDeclaredField("mPreserveWindow");
        localField.setAccessible(true);
        l.sNt = localField;
      }
      h.b("WxSplash.SplashHackHandlerCallback", "preserveWindow is %s, will set false", new Object[] { Boolean.valueOf(((Boolean)l.sNt.get(localObject)).booleanValue()) });
      l.sNt.set(localObject, Boolean.valueOf(false));
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool;
        h.a(localException, "");
      }
    }
    if (this.lGF != null)
    {
      this.sNi = true;
      bool = this.lGF.handleMessage(paramMessage);
      this.sNi = false;
      return bool;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/splash/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */