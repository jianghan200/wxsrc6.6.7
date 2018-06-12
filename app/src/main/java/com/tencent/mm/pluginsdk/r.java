package com.tencent.mm.pluginsdk;

import com.tencent.mm.sdk.platformtools.x;

public final class r
{
  private static boolean qyn = false;
  public String mTag = "";
  public boolean qym = false;
  
  public r(String paramString)
  {
    this.mTag = paramString;
  }
  
  public static void cbl()
  {
    qyn = true;
  }
  
  public final boolean cE(String paramString)
  {
    if (qyn) {
      x.i("MicroMsg.SplashOptimizing", "[%s], check cancel", new Object[] { this.mTag });
    }
    while (!this.qym) {
      return false;
    }
    x.i("MicroMsg.SplashOptimizing", "[%s], recreate activity, skip this %s", new Object[] { this.mTag, paramString });
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */