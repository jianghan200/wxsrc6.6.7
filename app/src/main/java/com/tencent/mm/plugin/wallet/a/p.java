package com.tencent.mm.plugin.wallet.a;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.v;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import java.io.File;
import java.util.HashMap;

public class p
  implements ar
{
  private int cdM = 0;
  private int peA = 0;
  private o peB = new o();
  private v peC = new v();
  private i peD = new i();
  private m.b peE = new m.b()
  {
    public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
    {
      if (bi.p(paramAnonymousObject, 0) == 339975)
      {
        g.Ek();
        paramAnonymousInt = ((Integer)g.Ei().DT().get(339975, Integer.valueOf(0))).intValue();
        if (paramAnonymousInt != p.a(p.this)) {
          com.tencent.mm.pluginsdk.model.app.ap.ccb().reset();
        }
      }
      do
      {
        p.a(p.this, paramAnonymousInt);
        do
        {
          return;
        } while (!aa.a.sTs.equals(paramAnonymousObject));
        g.Ek();
        paramAnonymousInt = ((Integer)g.Ei().DT().get(aa.a.sTs, Integer.valueOf(0))).intValue();
      } while (paramAnonymousInt == p.b(p.this));
      com.tencent.mm.pluginsdk.model.app.ap.ccb().reset();
      p.b(p.this, paramAnonymousInt);
    }
  };
  private n peF = new p.2(this);
  private j peG = new j();
  
  static
  {
    com.tencent.mm.wallet_core.a.i("ForgotPwdProcess", com.tencent.mm.plugin.wallet.pwd.a.class);
    com.tencent.mm.wallet_core.a.i("BindCardProcess", com.tencent.mm.plugin.wallet_core.b.b.class);
  }
  
  public p()
  {
    File localFile = new File(com.tencent.mm.plugin.wallet_core.d.b.bPR());
    if (!localFile.exists()) {
      localFile.mkdir();
    }
  }
  
  public static String Ol()
  {
    g.Ek();
    String str1 = (String)g.Ei().DT().get(6, null);
    String str2 = com.tencent.mm.sdk.platformtools.ap.Fp(str1);
    if (bi.oW(str1)) {
      return "";
    }
    return str1.substring(str2.length() + 1);
  }
  
  public static p bNp()
  {
    return (p)com.tencent.mm.model.p.v(p.class);
  }
  
  public static ag bNq()
  {
    return com.tencent.mm.plugin.wallet_core.model.o.bOW();
  }
  
  public static String bNr()
  {
    g.Ek();
    String str1 = (String)g.Ei().DT().get(6, null);
    if (bi.oW(str1)) {}
    for (str1 = "";; str1 = com.tencent.mm.sdk.platformtools.ap.Fp(str1.replace("+", "")))
    {
      String str2 = str1;
      if (bi.oW(str1))
      {
        if (!q.GS()) {
          break;
        }
        str2 = "27";
      }
      return str2;
    }
    return "86";
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    g.Ek();
    this.peA = ((Integer)g.Ei().DT().get(339975, Integer.valueOf(0))).intValue();
    g.Ek();
    this.cdM = ((Integer)g.Ei().DT().get(aa.a.sTs, Integer.valueOf(0))).intValue();
    ((com.tencent.mm.plugin.messenger.foundation.a.o)g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("paymsg", this.peF);
    com.tencent.mm.sdk.b.a.sFg.b(this.peB);
    com.tencent.mm.sdk.b.a.sFg.b(this.peC);
    com.tencent.mm.sdk.b.a.sFg.b(this.peD);
    this.peG.cht();
    g.Ek();
    g.Ei().DT().a(this.peE);
    g.Ek();
    g.Ei().DT().a(aa.a.sZH, Boolean.valueOf(false));
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    ((com.tencent.mm.plugin.messenger.foundation.a.o)g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("paymsg", this.peF);
    com.tencent.mm.sdk.b.a.sFg.c(this.peB);
    com.tencent.mm.sdk.b.a.sFg.c(this.peC);
    com.tencent.mm.sdk.b.a.sFg.c(this.peD);
    this.peG.dead();
    g.Ek();
    g.Ei().DT().b(this.peE);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */