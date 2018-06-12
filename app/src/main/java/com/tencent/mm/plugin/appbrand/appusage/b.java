package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.mm.g.a.pk;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.storage.aa.a;

public enum b
{
  public static final c<pk> fkZ = new b.1();
  
  public static boolean acE()
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {}
    do
    {
      return false;
      if (com.tencent.mm.k.g.AT().getInt("WeAppForbiddenSwitch", 0) == 1)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrandEntranceLogic", "showInFindMore, WeAppForbiddenSwitch == 1, not show");
        return false;
      }
    } while ((!acJ()) && (!j.acX()));
    return true;
  }
  
  public static void acF()
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {
      return;
    }
    if (acG())
    {
      j.e locale = j.e.fma;
      j.e.a("", 0L, 2, 1);
    }
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sTL, Boolean.valueOf(false));
  }
  
  static boolean acG()
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {
      return false;
    }
    return ((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sTL, Boolean.valueOf(false))).booleanValue();
  }
  
  public static boolean acH()
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {
      return false;
    }
    return ((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sTA, Boolean.valueOf(false))).booleanValue();
  }
  
  public static boolean acI()
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {
      return false;
    }
    return ((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sTz, Boolean.valueOf(false))).booleanValue();
  }
  
  public static boolean acJ()
  {
    return (acI()) || (acH());
  }
  
  private static void e(boolean paramBoolean, String paramString)
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {
      return;
    }
    Object localObject = (Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sTA, null);
    if ((localObject != null) && (!((Boolean)localObject).booleanValue()) && (paramBoolean))
    {
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sTL, Boolean.valueOf(true));
      localObject = j.e.fma;
      j.e.a("", 0L, 1, 1);
    }
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sTA, Boolean.valueOf(paramBoolean));
      if (i == 0) {
        break;
      }
      localObject = com.tencent.mm.plugin.appbrand.app.e.aaY();
      if (localObject == null) {
        break;
      }
      ((AppBrandGuideUI.a)localObject).guw = true;
      ((AppBrandGuideUI.a)localObject).gux = paramString;
      return;
    }
  }
  
  static void jI(int paramInt)
  {
    boolean bool2 = true;
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {
      return;
    }
    com.tencent.mm.storage.x localx = com.tencent.mm.kernel.g.Ei().DT();
    aa.a locala;
    if ((paramInt & 0x2) > 0)
    {
      bool1 = true;
      e(bool1, "");
      locala = aa.a.sTz;
      if ((paramInt & 0x1) <= 0) {
        break label62;
      }
    }
    label62:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localx.a(locala, Boolean.valueOf(bool1));
      return;
      bool1 = false;
      break;
    }
  }
  
  static void rk(String paramString)
  {
    e(true, paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appusage/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */