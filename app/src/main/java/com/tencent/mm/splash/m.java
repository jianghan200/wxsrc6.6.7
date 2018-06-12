package com.tencent.mm.splash;

import android.app.Application;
import com.tencent.mm.sdk.platformtools.x;

public final class m
{
  private static String bqA;
  private static Application sMx;
  private static boolean sNu = false;
  private static a sNv;
  private static boolean sNw = false;
  private static o.a sNx;
  
  private static void XC(String paramString)
  {
    if (sNv != null) {
      return;
    }
    paramString = XD(paramString);
    paramString.b(sMx, bqA);
    sNv = paramString;
  }
  
  private static a XD(String paramString)
  {
    try
    {
      a locala = (a)Class.forName(paramString).newInstance();
      return locala;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.SplashInit", localException, "%s has problem!", new Object[] { paramString });
      throw new RuntimeException(localException);
    }
  }
  
  public static void a(Application paramApplication, String paramString1, String paramString2)
  {
    boolean bool1 = true;
    sMx = paramApplication;
    bqA = paramString1;
    h.a(new o()
    {
      public final void d(o.a paramAnonymousa)
      {
        x.i("MicroMsg.SplashInit", "do one more thing");
        m.c(paramAnonymousa);
        m.mp(this.sNy);
        m.bwD();
      }
    });
    h.ckd().mStartTimestamp = System.currentTimeMillis();
    if (!paramApplication.getPackageName().equals(paramString1)) {
      h.b("MicroMsg.SplashInit", "not main process(%s), no hack, do fallback.", new Object[] { paramString1 });
    }
    for (;;)
    {
      sNu = bool1;
      if (h.sMB != null) {
        h.sMB.vi();
      }
      if ((!bool1) || (a.fZ(paramApplication))) {}
      try
      {
        a.gb(paramApplication);
        boolean bool2 = a.gd(paramApplication);
        h.b("MicroMsg.SplashInit", "block checking dex opt result: %s", new Object[] { Boolean.valueOf(bool2) });
        if (!bool2)
        {
          h.b("MicroMsg.SplashInit", "dexopt service return failed or timeout. kill self.", new Object[0]);
          h.cjX();
        }
        a.ga(paramApplication);
        if ((f.lY) || (bool1)) {
          XC(paramString2);
        }
        return;
      }
      catch (InterruptedException paramApplication)
      {
        throw new RuntimeException(paramApplication);
      }
      if (!h.f(paramApplication))
      {
        h.ckd().f(675L, 5L, 1L);
        h.gf(paramApplication);
        h.b("MicroMsg.SplashInit", "hack failed, do fallback logic.", new Object[0]);
      }
      else
      {
        bool1 = false;
        h.cjY();
      }
    }
  }
  
  private static void ckm()
  {
    if ((sNw) && (sNx != null)) {
      sNv.a(sNx);
    }
  }
  
  public static void ckn()
  {
    h.b("MicroMsg.SplashInit", "applicationOnCreate", new Object[0]);
    h.cjT();
    sNw = true;
    if (sNu)
    {
      sNv.vj();
      return;
    }
    ckm();
  }
  
  public static abstract interface a
  {
    public abstract void a(o.a parama);
    
    public abstract void b(Application paramApplication, String paramString);
    
    public abstract void vj();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/splash/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */