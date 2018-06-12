package com.tencent.mm.ba;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

public enum a
{
  private a() {}
  
  public static boolean Us()
  {
    return !bi.oW(Ut());
  }
  
  public static String Ut()
  {
    g.Ek();
    String str = (String)g.Ei().DT().get(aa.a.sVL, String.valueOf(""));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebviewKeepManager", "getLastPageUrl : %s", new Object[] { str });
    return str;
  }
  
  public static String Uu()
  {
    g.Ek();
    String str = (String)g.Ei().DT().get(aa.a.sVN, String.valueOf(""));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebviewKeepManager", "getLastPageTitle : %s", new Object[] { str });
    return str;
  }
  
  public static void s(String paramString1, String paramString2, String paramString3)
  {
    g.Ek();
    g.Ei().DT().a(aa.a.sVL, paramString1);
    g.Ek();
    g.Ei().DT().a(aa.a.sVN, paramString2);
    g.Ek();
    g.Ei().DT().a(aa.a.sVM, paramString3);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ba/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */