package com.tencent.mm.ac;

import com.tencent.mm.g.c.ai;
import com.tencent.mm.l.a;
import com.tencent.mm.model.bd.5;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.atx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import java.util.List;

public final class f
{
  public static boolean MH()
  {
    return z.MY().hx(1) > 0;
  }
  
  public static boolean MI()
  {
    return z.MY().hx(4) > 0;
  }
  
  public static boolean MJ()
  {
    return z.MY().hx(8) > 0;
  }
  
  public static boolean MK()
  {
    return z.MY().hx(16) > 0;
  }
  
  public static boolean ML()
  {
    return z.MY().hx(64) > 0;
  }
  
  public static List<String> MM()
  {
    return z.MY().hw(128);
  }
  
  public static boolean MN()
  {
    return z.MY().hx(128) > 0;
  }
  
  public static boolean MO()
  {
    return z.MY().hx(256) > 0;
  }
  
  public static boolean MP()
  {
    return z.MY().hx(512) > 0;
  }
  
  public static boolean eZ(String paramString)
  {
    paramString = kH(paramString);
    if (paramString == null) {}
    while (!paramString.Ma()) {
      return false;
    }
    return true;
  }
  
  public static void f(d paramd)
  {
    if (paramd == null)
    {
      x.e("MicroMsg.BizInfoStorageLogic", "updateBrandFlagForTempSession bizInfo is Null");
      return;
    }
    atx localatx = new atx();
    localatx.eJV = paramd.field_brandFlag;
    localatx.hbL = paramd.field_username;
    ab localab = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yf(paramd.field_username);
    if ((localab != null) && (a.gd(localab.field_type))) {
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(47, localatx));
    }
    for (;;)
    {
      x.i("MicroMsg.BizInfoStorageLogic", "updateBrandFlagForTempSession ret = %b, BrandFlag = %b", new Object[] { Boolean.valueOf(z.MY().c(paramd, new String[0])), Integer.valueOf(paramd.field_brandFlag) });
      return;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(58, localatx));
    }
  }
  
  public static void g(d paramd)
  {
    if (paramd != null)
    {
      atx localatx = new atx();
      localatx.eJV = paramd.field_brandFlag;
      localatx.hbL = paramd.field_username;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(47, localatx));
      z.MY().c(paramd, new String[0]);
    }
  }
  
  public static d kH(String paramString)
  {
    paramString = z.MY().kA(paramString);
    if (paramString.field_updateTime > 0L) {
      return paramString;
    }
    return null;
  }
  
  public static boolean kI(String paramString)
  {
    paramString = kH(paramString);
    if (paramString == null) {}
    while (!paramString.LV()) {
      return false;
    }
    return true;
  }
  
  public static boolean kJ(String paramString)
  {
    paramString = kH(paramString);
    if (paramString == null) {
      return false;
    }
    return paramString.LW();
  }
  
  public static boolean kK(String paramString)
  {
    paramString = kH(paramString);
    if (paramString == null) {}
    while (!paramString.LX()) {
      return false;
    }
    return true;
  }
  
  public static boolean kL(String paramString)
  {
    paramString = kH(paramString);
    if (paramString == null) {}
    while (!paramString.LZ()) {
      return false;
    }
    return true;
  }
  
  public static boolean kM(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return false;
      paramString = kH(paramString);
    } while ((paramString == null) || (!paramString.LY()));
    return true;
  }
  
  public static boolean kN(String paramString)
  {
    paramString = kH(paramString);
    if (paramString == null) {}
    while (!paramString.Mb()) {
      return false;
    }
    return true;
  }
  
  public static boolean kO(String paramString)
  {
    paramString = kH(paramString);
    if (paramString == null) {
      return false;
    }
    return paramString.LQ();
  }
  
  public static void kP(String paramString)
  {
    int i = 0;
    z.MY();
    Object localObject = e.kD(paramString);
    if (localObject != null) {
      ((o)com.tencent.mm.kernel.g.l(o.class)).FU().GK((String)localObject);
    }
    ((i)com.tencent.mm.kernel.g.l(i.class)).FW().Yp(paramString);
    localObject = kH(paramString);
    if (localObject == null)
    {
      z.Nh().jy(paramString);
      return;
    }
    if (((d)localObject).LY())
    {
      ((i)com.tencent.mm.kernel.g.l(i.class)).FW().YH(paramString);
      z.MY();
      List localList = e.kC(paramString);
      if ((localList == null) || (localList.size() <= 0)) {
        x.d("MicroMsg.MsgInfoStorageLogic", "deleteMsgByTalkers, empty talkers");
      }
      while (i < localList.size())
      {
        String str = (String)localList.get(i);
        if (eZ(str)) {
          com.tencent.mm.ac.a.e.D(str, true);
        }
        z.MY().delete(str);
        i += 1;
        continue;
        x.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalkers stack[%s]", new Object[] { bi.cjd() });
        com.tencent.mm.sdk.f.e.post(new bd.5(localList), "deleteMsgByTalkers");
      }
    }
    if (((d)localObject).Ma()) {
      com.tencent.mm.ac.a.e.D(paramString, true);
    }
    z.MY().c((d)localObject);
    z.Nh().jy(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ac/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */