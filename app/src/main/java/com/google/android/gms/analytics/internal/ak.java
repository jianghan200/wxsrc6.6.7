package com.google.android.gms.analytics.internal;

public final class ak
  extends ab<b>
{
  public ak(q paramq)
  {
    super(paramq, new a(paramq));
  }
  
  private static final class a
    implements ab.a<b>
  {
    private final q aFn;
    private final b aIl;
    
    public a(q paramq)
    {
      this.aFn = paramq;
      this.aIl = new b();
    }
    
    public final void g(String paramString, boolean paramBoolean)
    {
      if ("ga_dryRun".equals(paramString))
      {
        paramString = this.aIl;
        if (paramBoolean) {}
        for (int i = 1;; i = 0)
        {
          paramString.aEZ = i;
          return;
        }
      }
      this.aFn.nr().f("Bool xml configuration name not recognized", paramString);
    }
    
    public final void k(String paramString, int paramInt)
    {
      if ("ga_dispatchPeriod".equals(paramString))
      {
        this.aIl.aEY = paramInt;
        return;
      }
      this.aFn.nr().f("Int xml configuration name not recognized", paramString);
    }
    
    public final void m(String paramString1, String paramString2)
    {
      if ("ga_appName".equals(paramString1))
      {
        this.aIl.aEV = paramString2;
        return;
      }
      if ("ga_appVersion".equals(paramString1))
      {
        this.aIl.aEW = paramString2;
        return;
      }
      if ("ga_logLevel".equals(paramString1))
      {
        this.aIl.aEX = paramString2;
        return;
      }
      this.aFn.nr().f("String xml configuration name not recognized", paramString1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/analytics/internal/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */