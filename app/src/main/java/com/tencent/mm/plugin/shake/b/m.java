package com.tencent.mm.plugin.shake.b;

import android.os.Looper;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.ph;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.plugin.shake.c.a.f;
import com.tencent.mm.plugin.shake.d.a.o;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.ay.a;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.az.a;
import com.tencent.mm.storage.bp;
import java.util.HashMap;

public final class m
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private az.a dBJ = new m.2(this);
  private com.tencent.mm.sdk.b.c hKG = new m.7(this);
  private ay.a lBt = new ay.a()
  {
    public final void a(ay paramAnonymousay, com.tencent.mm.storage.ab paramAnonymousab)
    {
      if ((paramAnonymousay != null) && (paramAnonymousab != null) && (paramAnonymousab.BA())) {
        m.buC().Lb(paramAnonymousab.field_username);
      }
    }
  };
  private com.tencent.mm.sdk.b.c lyA = new m.6(this);
  private ag mHandler = new ag(Looper.getMainLooper());
  private e mWV;
  private g mWW;
  private f mWX;
  private com.tencent.mm.plugin.shake.c.a.d mWY;
  private o mWZ;
  private n mXa = new n();
  com.tencent.mm.pluginsdk.c.d mXb = new com.tencent.mm.pluginsdk.c.d()
  {
    public final b CY(String paramAnonymousString)
    {
      ph localph = new ph();
      localph.caf.bHA = paramAnonymousString;
      return localph;
    }
    
    public final j aSe()
    {
      return m.buD();
    }
  };
  private bv.a mXc = new m.13(this);
  private com.tencent.mm.sdk.b.c mXd = new m.3(this);
  private bv.a mXe = new m.4(this);
  private bv.a mXf = new bv.a()
  {
    public final void a(d.a paramAnonymousa)
    {
      String str = com.tencent.mm.platformtools.ab.a(paramAnonymousa.dIN.rcl);
      if ((str == null) || (str.length() == 0))
      {
        x.e("MicroMsg.SubCoreShake", "onReceiveMsg, ShakeCardRedDotMsg msgContent is null");
        return;
      }
      m.a(m.this).post(new m.5.1(this, str, paramAnonymousa));
    }
  };
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("SHAKEITEM_TABLE".hashCode()), new m.8());
    cVM.put(Integer.valueOf("SHAKEMSG_TABLE".hashCode()), new m.9());
    cVM.put(Integer.valueOf("SHAKETVHISTORY_TABLE".hashCode()), new m.10());
    cVM.put(Integer.valueOf("SHAKENEWYEARFRIENDINFO_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return k.diD;
      }
    });
  }
  
  private static m buB()
  {
    au.HN();
    m localm2 = (m)bs.iK("plugin.shake");
    m localm1 = localm2;
    if (localm2 == null)
    {
      localm1 = new m();
      au.HN().a("plugin.shake", localm1);
    }
    return localm1;
  }
  
  public static e buC()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (buB().mWV == null)
    {
      m localm = buB();
      au.HU();
      localm.mWV = new e(com.tencent.mm.model.c.FO());
    }
    return buB().mWV;
  }
  
  public static g buD()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (buB().mWW == null)
    {
      m localm = buB();
      au.HU();
      localm.mWW = new g(com.tencent.mm.model.c.FO());
    }
    return buB().mWW;
  }
  
  public static o buE()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (buB().mWZ == null)
    {
      m localm = buB();
      au.HU();
      localm.mWZ = new o(com.tencent.mm.model.c.FO());
    }
    return buB().mWZ;
  }
  
  public static void buF()
  {
    buC().but();
    com.tencent.mm.az.d.SH().aPm();
  }
  
  public static int buG()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    return i.mWK;
  }
  
  public static f buH()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (buB().mWX == null) {
      buB().mWX = new f();
    }
    return buB().mWX;
  }
  
  public static com.tencent.mm.plugin.shake.c.a.d buI()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (buB().mWY == null) {
      buB().mWY = new com.tencent.mm.plugin.shake.c.a.d();
    }
    return buB().mWY;
  }
  
  public static String eq(String paramString1, String paramString2)
  {
    if ((au.HX()) && (!bi.oW(paramString1)))
    {
      au.HU();
      return String.format("%s/Sk%s_%s", new Object[] { com.tencent.mm.model.c.Gi(), paramString2, com.tencent.mm.a.g.u(paramString1.getBytes()) });
    }
    return "";
  }
  
  public static String lV(String paramString)
  {
    if (au.HX())
    {
      au.HU();
      return String.format("%s/Sk_%s", new Object[] { com.tencent.mm.model.c.Gi(), com.tencent.mm.a.g.u(paramString.getBytes()) });
    }
    return "";
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.pluginsdk.o.a.qyh = new h();
    au.HU();
    com.tencent.mm.model.c.FW().b(this.dBJ);
    com.tencent.mm.sdk.b.a.sFg.b(this.hKG);
    com.tencent.mm.sdk.b.a.sFg.b(this.mXd);
    com.tencent.mm.sdk.b.a.sFg.b(this.mXa);
    com.tencent.mm.sdk.b.a.sFg.b(this.lyA);
    au.HU();
    com.tencent.mm.model.c.FR().a(this.lBt);
    au.Em().H(new m.12(this));
    au.getSysCmdMsgExtension().a("shake", this.mXc, true);
    au.getSysCmdMsgExtension().a("ShakeCardEntrance", this.mXe, true);
    au.getSysCmdMsgExtension().a("ShakeCardRedDot", this.mXf, true);
    this.mWX = null;
    this.mWY = null;
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    au.HU();
    com.tencent.mm.model.c.FW().c(this.dBJ);
    com.tencent.mm.sdk.b.a.sFg.c(this.hKG);
    com.tencent.mm.sdk.b.a.sFg.c(this.mXd);
    com.tencent.mm.sdk.b.a.sFg.c(this.mXa);
    com.tencent.mm.sdk.b.a.sFg.c(this.lyA);
    au.HU();
    com.tencent.mm.model.c.FR().b(this.lBt);
    au.getSysCmdMsgExtension().b("shake", this.mXc, true);
    au.getSysCmdMsgExtension().b("ShakeCardEntrance", this.mXe, true);
    au.getSysCmdMsgExtension().b("ShakeCardRedDot", this.mXf, true);
    com.tencent.mm.pluginsdk.o.a.qyh = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/shake/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */