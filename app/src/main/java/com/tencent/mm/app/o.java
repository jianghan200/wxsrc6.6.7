package com.tencent.mm.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.R.k;
import com.tencent.mm.kiss.a.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.svg.a.e;
import com.tencent.mm.svg.b.c.a;

public final class o
{
  private static Class<?> bzf = null;
  private static Application bzg;
  private static Resources bzh;
  private static String mPackageName = null;
  
  public static void a(Application paramApplication, Resources paramResources)
  {
    e.d(paramApplication, mPackageName);
    bzg = paramApplication;
    bzh = paramResources;
  }
  
  public static void cQ(String paramString)
  {
    mPackageName = paramString;
  }
  
  public static void h(Class<?> paramClass)
  {
    bzf = paramClass;
  }
  
  public static void ve()
  {
    boolean bool = true;
    x.i("MicroMsg.SVGInit", "SVG initSVGPreload");
    e.a(new c.a()
    {
      public final void d(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        x.d(paramAnonymousString1, paramAnonymousString2, paramAnonymousVarArgs);
      }
      
      public final void e(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        x.e(paramAnonymousString1, paramAnonymousString2, paramAnonymousVarArgs);
      }
      
      public final void i(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        x.i(paramAnonymousString1, paramAnonymousString2, paramAnonymousVarArgs);
      }
      
      public final void printErrStackTrace(String paramAnonymousString1, Throwable paramAnonymousThrowable, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        x.printErrStackTrace(paramAnonymousString1, paramAnonymousThrowable, paramAnonymousString2, paramAnonymousVarArgs);
      }
    });
    e.h(bzf);
    e.a(bzg, bzh, mPackageName);
    Object localObject1 = bzg;
    for (;;)
    {
      try
      {
        localObject1 = ((Application)localObject1).getBaseContext().getResources().getDrawable(R.k.actionbar_icon);
        if (localObject1 != null)
        {
          i = 1;
          localObject1 = b.EY();
          if (i == 0)
          {
            ((b)localObject1).dtj = bool;
            return;
          }
          bool = false;
          continue;
        }
        int i = 0;
      }
      catch (Throwable localThrowable)
      {
        x.printErrStackTrace("MicroMsg.SVGInit", localThrowable, "not support get svg from application context", new Object[0]);
        return;
      }
      finally
      {
        b.EY().dtj = true;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/app/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */