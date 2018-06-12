package com.tencent.mm.app;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.splash.c;
import com.tencent.mm.splash.e;
import com.tencent.mm.splash.m;
import com.tencent.mm.splash.n;
import com.tencent.mm.xlog.app.XLogSetup;
import java.util.ArrayList;

public final class q
{
  public static com.tencent.mm.kernel.b.h bzn;
  
  public static void a(com.tencent.mm.kernel.b.h paramh, String paramString)
  {
    bzn = paramh;
    com.tencent.mm.splash.h.a(new c()
    {
      public final void a(Throwable paramAnonymousThrowable, String paramAnonymousString)
      {
        x.printErrStackTrace("WxSplash.WeChatSplash", paramAnonymousThrowable, paramAnonymousString, new Object[0]);
        String str = paramAnonymousString;
        if (paramAnonymousString == null) {
          str = "";
        }
        paramAnonymousThrowable = str + "  " + Log.getStackTraceString(paramAnonymousThrowable);
        com.tencent.mm.splash.h.ckd().sNz.add(paramAnonymousThrowable);
      }
      
      public final void b(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        x.i(paramAnonymousString1, paramAnonymousString2, paramAnonymousVarArgs);
      }
      
      public final void e(Activity paramAnonymousActivity)
      {
        if ((q.bzn != null) && (q.bzn.ES()))
        {
          paramAnonymousActivity = paramAnonymousActivity.getSharedPreferences("system_config_prefs", 4);
          if (paramAnonymousActivity.getBoolean("first_launch_weixin", true))
          {
            paramAnonymousActivity.edit().putBoolean("first_launch_weixin", false).commit();
            XLogSetup.realSetupXlog();
          }
        }
      }
    });
    com.tencent.mm.splash.h.a(new com.tencent.mm.splash.b()
    {
      public final boolean aY(Context paramAnonymousContext)
      {
        return com.tencent.mm.f.a.bh(paramAnonymousContext);
      }
      
      public final boolean aZ(Context paramAnonymousContext)
      {
        return com.tencent.mm.f.a.aZ(paramAnonymousContext);
      }
      
      public final void ba(Context paramAnonymousContext)
      {
        com.tencent.mm.f.a.ba(paramAnonymousContext);
      }
    });
    com.tencent.mm.splash.h.a(new e()
    {
      public final void cR(String paramAnonymousString)
      {
        com.tencent.mm.blink.a.cR(paramAnonymousString);
      }
      
      public final void vh() {}
      
      public final void vi()
      {
        com.tencent.mm.blink.a.fm(1);
      }
    });
    if (paramString == null)
    {
      x.i("WxSplash.WeChatSplash", "splash callback class is null, return.");
      return;
    }
    com.tencent.mm.blink.a.aD(b.bya);
    com.tencent.mm.splash.h.XB(ad.chW());
    com.tencent.mm.splash.h.J(WeChatSplashActivity.class);
    com.tencent.mm.splash.h.K(WeChatSplashFallbackActivity.class);
    m.a(paramh.dsQ, paramh.dox, paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/app/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */