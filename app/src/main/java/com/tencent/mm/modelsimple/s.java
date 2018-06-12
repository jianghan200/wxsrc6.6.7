package com.tencent.mm.modelsimple;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.aq.h;
import com.tencent.mm.aq.h.a;
import com.tencent.mm.model.at;
import com.tencent.mm.model.av;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.auth.PluginAuth;
import com.tencent.mm.protocal.c.awa;
import com.tencent.mm.protocal.c.awb;
import com.tencent.mm.protocal.c.bnp;
import com.tencent.mm.protocal.c.brj;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.u.a;
import com.tencent.mm.protocal.u.b;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class s
  extends l
  implements k
{
  public com.tencent.mm.network.q dJM;
  private int dJp = 2;
  com.tencent.mm.ab.e diJ;
  private final String efZ;
  private final String ega;
  private final String egb;
  private final String egc;
  private final String egd;
  private final String ege;
  private final int egf;
  private final int egg;
  private boolean egh = true;
  public boolean egi = false;
  
  public s(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, String paramString5, String paramString6, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneReg", "NetSceneReg: username = " + paramString1 + " nickname = " + paramString3);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneReg", "NetSceneReg: bindUin = " + paramInt1 + "bindEmail = " + paramString4 + " bindMobile = " + paramString5);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneReg", "NetSceneReg: regMode = " + paramInt2 + " ticket: " + paramString6);
    this.egg = paramInt2;
    this.dJM = new ax();
    u.a locala = (u.a)this.dJM.KV();
    locala.eK(0);
    locala.qWY.hbL = paramString1;
    locala.qWY.rhI = bi.WN(paramString2);
    if (paramInt2 == 4)
    {
      locala.qWY.rhI = paramString6;
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneReg", "dkreg rand:" + paramString6 + " reqMd5:" + locala.qWY.rhI);
    }
    locala.qWY.hcS = paramString3;
    locala.qWY.ray = paramInt1;
    locala.qWY.raz = paramString4;
    locala.qWY.raA = paramString5;
    locala.qWY.rwj = paramString6;
    locala.qWY.rLa = paramInt2;
    locala.qWY.iwO = bi.ciX();
    locala.qWY.rwh = com.tencent.mm.compatible.e.q.getSimCountryIso();
    locala.qWY.iwP = com.tencent.mm.sdk.platformtools.w.chP();
    locala.qWY.reR = 0;
    locala.qWY.rYY = 0;
    locala.qWY.rYZ = com.tencent.mm.compatible.e.q.getAndroidId();
    locala.qWY.ryW = com.tencent.mm.compatible.e.q.zB();
    locala.qWY.rZa = ad.getContext().getSharedPreferences(ad.chY(), 0).getString("installreferer", "");
    locala.qWY.rZb = com.tencent.mm.plugin.normsg.a.b.lFJ.ub(2);
    locala.qWY.rZc = ad.getContext().getSharedPreferences(ad.chY() + "_google_aid", 4).getString("getgoogleaid", "");
    this.efZ = paramString1;
    this.ega = paramString2;
    this.egb = paramString3;
    this.egc = paramString4;
    this.egd = paramString5;
    this.egf = paramInt1;
    this.ege = "";
    if (((paramString6 == null) || (paramString6.length() <= 0)) && (paramString4.length() <= 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.egh = bool;
      locala.qWY.reS = com.tencent.mm.kernel.a.DA();
      return;
    }
  }
  
  public s(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt2, String paramString9, String paramString10, String paramString11, boolean paramBoolean1, boolean paramBoolean2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneReg", "init: use:%s pwd:%s nick:%s bindqq:%d email:%s mobile:%s [%s,%s,%s] regmode:%d alias:%s [%s,%s] force:%b avatar:%b", new Object[] { paramString1, bi.Xf(paramString2), paramString3, Integer.valueOf(paramInt1), paramString4, paramString5, paramString6, paramString7, paramString8, Integer.valueOf(paramInt2), paramString9, paramString11, paramString10, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    this.egg = paramInt2;
    this.dJM = new ax();
    paramString6 = (u.a)this.dJM.KV();
    paramString6.eK(0);
    paramString6.qWY.hbL = paramString1;
    paramString6.qWY.rhI = bi.WN(paramString2);
    if (paramInt2 == 4)
    {
      paramString6.qWY.rhI = paramString8;
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneReg", "dkreg rand:" + paramString8 + " reqMd5:" + paramString6.qWY.rhI);
    }
    paramString6.qWY.hcS = paramString3;
    paramString6.qWY.ray = paramInt1;
    paramString6.qWY.raz = paramString4;
    paramString6.qWY.raA = paramString5;
    paramString6.qWY.rwj = paramString8;
    paramString6.qWY.rLa = paramInt2;
    paramString6.qWY.iwO = bi.ciX();
    paramString6.qWY.rwh = com.tencent.mm.compatible.e.q.getSimCountryIso();
    paramString6.qWY.iwP = com.tencent.mm.sdk.platformtools.w.chP();
    paramString6.qWY.reR = 0;
    paramString6.qWY.eJM = paramString9;
    paramString6.qWY.rKZ = paramString11;
    paramString6.qWY.rKY = paramString10;
    paramString7 = paramString6.qWY;
    if (paramBoolean1)
    {
      paramInt2 = 1;
      paramString7.rhy = paramInt2;
      paramString7 = paramString6.qWY;
      if (!paramBoolean2) {
        break label629;
      }
      paramInt2 = 1;
      label421:
      paramString7.rYX = paramInt2;
      paramString6.qWY.reS = com.tencent.mm.kernel.a.DA();
      paramString6.qWY.rYZ = com.tencent.mm.compatible.e.q.getAndroidId();
      paramString6.qWY.ryW = com.tencent.mm.compatible.e.q.zB();
      paramString6.qWY.rZa = ad.getContext().getSharedPreferences(ad.chY(), 0).getString("installreferer", "");
      paramString6.qWY.rZb = com.tencent.mm.plugin.normsg.a.b.lFJ.ub(2);
      paramString6.qWY.rZc = ad.getContext().getSharedPreferences(ad.chY() + "_google_aid", 4).getString("getgoogleaid", "");
      this.efZ = paramString1;
      this.ega = paramString2;
      this.egb = paramString3;
      this.egc = paramString4;
      this.egd = paramString5;
      this.egf = paramInt1;
      this.ege = paramString9;
      if (((paramString8 != null) && (paramString8.length() > 0)) || ((paramString4 != null) && (paramString4.length() > 0))) {
        break label635;
      }
    }
    label629:
    label635:
    for (paramBoolean1 = true;; paramBoolean1 = false)
    {
      this.egh = paramBoolean1;
      return;
      paramInt2 = 0;
      break;
      paramInt2 = 0;
      break label421;
    }
  }
  
  protected final int Cc()
  {
    return 3;
  }
  
  public final String Re()
  {
    return ((u.b)this.dJM.Id()).qWZ.rKY;
  }
  
  public final byte[] Rf()
  {
    return ab.a(((u.b)this.dJM.Id()).qWZ.rLb, new byte[0]);
  }
  
  public final String Rn()
  {
    return ((u.b)this.dJM.Id()).qWZ.rZn;
  }
  
  public final int Ro()
  {
    Object localObject = ((u.b)this.dJM.Id()).qWZ.reD;
    if ((localObject != null) && (((bnp)localObject).slI != null) && (((bnp)localObject).slI.size() > 0))
    {
      localObject = ((bnp)localObject).slI.iterator();
      while (((Iterator)localObject).hasNext())
      {
        brj localbrj = (brj)((Iterator)localObject).next();
        if (localbrj.mEb == 1) {
          return bi.getInt(localbrj.spx, 0);
        }
      }
    }
    return 0;
  }
  
  public final String Rp()
  {
    Object localObject = ((u.b)this.dJM.Id()).qWZ.reD;
    if ((localObject != null) && (((bnp)localObject).slI != null) && (((bnp)localObject).slI.size() > 0))
    {
      localObject = ((bnp)localObject).slI.iterator();
      while (((Iterator)localObject).hasNext())
      {
        brj localbrj = (brj)((Iterator)localObject).next();
        if (localbrj.mEb == 2) {
          return localbrj.spx;
        }
      }
    }
    return "";
  }
  
  public final int Rq()
  {
    Object localObject = ((u.b)this.dJM.Id()).qWZ.reD;
    if ((localObject != null) && (((bnp)localObject).slI != null) && (((bnp)localObject).slI.size() > 0))
    {
      localObject = ((bnp)localObject).slI.iterator();
      while (((Iterator)localObject).hasNext())
      {
        brj localbrj = (brj)((Iterator)localObject).next();
        if (localbrj.mEb == 3) {
          return bi.getInt(localbrj.spx, 2);
        }
      }
    }
    return 2;
  }
  
  public final String Rr()
  {
    Object localObject = ((u.b)this.dJM.Id()).qWZ.reD;
    if ((localObject != null) && (((bnp)localObject).slI != null) && (((bnp)localObject).slI.size() > 0))
    {
      localObject = ((bnp)localObject).slI.iterator();
      while (((Iterator)localObject).hasNext())
      {
        brj localbrj = (brj)((Iterator)localObject).next();
        if (localbrj.mEb == 17) {
          return localbrj.spx;
        }
      }
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dJM, this);
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(final int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = (u.b)paramq.Id();
    Object localObject1;
    if (paramArrayOfByte.qWZ != null)
    {
      paramInt1 = paramArrayOfByte.qWZ.reI;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneReg", "summerauth mmtls reg:%s", new Object[] { Integer.valueOf(paramInt1) });
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().dqk.set(47, Integer.valueOf(paramInt1));
      localObject1 = com.tencent.mm.kernel.g.Eh().dpP.dJs;
      if (localObject1 != null)
      {
        if ((paramInt1 & 0x1) != 0) {
          break label173;
        }
        bool = true;
        ((com.tencent.mm.network.e)localObject1).bF(bool);
      }
    }
    for (;;)
    {
      if ((paramInt2 == 4) && (paramInt3 == 65235))
      {
        av.a(true, paramArrayOfByte.qWZ.rhK, paramArrayOfByte.qWZ.rhL, paramArrayOfByte.qWZ.rhJ);
        this.dJp -= 1;
        if (this.dJp <= 0)
        {
          this.diJ.a(3, -1, "", this);
          return;
          label173:
          bool = false;
          break;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneReg", "summerauth mmtls reg not set as ret:%s", new Object[] { Integer.valueOf(paramArrayOfByte.qWB) });
          continue;
        }
        a(this.dIX, this.diJ);
        return;
      }
    }
    if ((paramInt2 == 4) && (paramInt3 == 65296))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneReg", "summerauth auth MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", new Object[] { Integer.valueOf(this.dJp) });
      this.dJp -= 1;
      if (this.dJp <= 0)
      {
        this.diJ.a(3, -1, "", this);
        return;
      }
      a(this.dIX, this.diJ);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.KV().qWA.ver;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneReg", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      com.tencent.mm.kernel.g.Em().H(new Runnable()
      {
        public final void run()
        {
          new i().a(s.this.dIX, new s.1.1(this));
        }
      });
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (u.a)paramq.KV();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneReg", "dkreg: pass:" + paramArrayOfByte.qWZ.iwG + " regtype:" + paramArrayOfByte.qWZ.raC + " mode:" + paramq.qWY.rLa);
    if ((paramArrayOfByte.qWZ.iwE != 0) && (!this.egh))
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.gJ(paramArrayOfByte.qWZ.iwE);
      com.tencent.mm.kernel.g.Ei().DT().set(2, paramq.qWY.hbL);
      com.tencent.mm.kernel.g.Ei().DT().set(16, Integer.valueOf(1));
      com.tencent.mm.kernel.g.Ei().DT().set(52, Integer.valueOf(paramArrayOfByte.qWZ.raC));
      com.tencent.mm.kernel.g.Ei().DT().set(340240, Long.valueOf(System.currentTimeMillis()));
      com.tencent.mm.kernel.g.Ei().DT().set(340241, Boolean.valueOf(true));
      if ((this.efZ != null) && (this.efZ.length() > 0) && (this.egg != 1)) {
        paramArrayOfByte.qWZ.hbL = this.efZ;
      }
      paramArrayOfByte.qWZ.raz = this.egc;
      paramArrayOfByte.qWZ.hcd = 0;
      if ((!com.tencent.mm.kernel.g.Eg().Dx()) || (com.tencent.mm.kernel.g.Ei().DT() == null)) {
        break label1453;
      }
      paramq = this.ege;
      paramInt1 = this.egf;
      localObject1 = this.egb;
      String str1 = this.egd;
      String str2 = paramArrayOfByte.qWZ.hbL;
      String str3 = paramArrayOfByte.qWZ.raz;
      int i = paramArrayOfByte.qWZ.hcd;
      String str4 = paramArrayOfByte.qWZ.raF;
      String str5 = paramArrayOfByte.qWZ.raG;
      int j = paramArrayOfByte.qWZ.raH;
      int k = paramArrayOfByte.qWZ.rZh;
      String str6 = paramArrayOfByte.qWZ.qZf;
      String str7 = paramArrayOfByte.qWZ.raI;
      String str8 = paramArrayOfByte.qWZ.reA;
      Object localObject2 = paramArrayOfByte.qWZ.rZg;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HandleAuthResponse", "dkwt updateProfile user:%s alias:%s qq:%s nick:%s email:%s mobile:%s status:%d offuser:%s offnick:%s pushmail:%d sendCard:%d session:%s fsurl:%s pluginFlag:%d atuhkey:%s a2:%s newa2:%s kisd:%s safedev:%d MicroBlog:%s emailpwd:%d", new Object[] { str2, paramq, com.tencent.mm.a.o.getString(paramInt1), localObject1, str3, str1, Integer.valueOf(i), str4, str5, Integer.valueOf(j), Integer.valueOf(k), bi.Xf(str6), str7, Integer.valueOf(0), bi.Xf(str8), bi.Xf(null), bi.Xf(null), bi.Xf(null), Integer.valueOf(-1), localObject2, Integer.valueOf(0) });
      localObject2 = com.tencent.mm.kernel.g.Ei().DT();
      at.dBv.T("login_weixin_username", str2);
      at.dBv.T("last_login_nick_name", (String)localObject1);
      at.dBv.c(str1, paramInt1, str3);
      ((com.tencent.mm.storage.x)localObject2).set(2, str2);
      ((com.tencent.mm.storage.x)localObject2).set(42, paramq);
      ((com.tencent.mm.storage.x)localObject2).set(9, Integer.valueOf(paramInt1));
      ((com.tencent.mm.storage.x)localObject2).set(4, localObject1);
      ((com.tencent.mm.storage.x)localObject2).set(5, str3);
      ((com.tencent.mm.storage.x)localObject2).set(6, str1);
      ((com.tencent.mm.storage.x)localObject2).set(7, Integer.valueOf(i));
      ((com.tencent.mm.storage.x)localObject2).set(21, str4);
      ((com.tencent.mm.storage.x)localObject2).set(22, str5);
      ((com.tencent.mm.storage.x)localObject2).set(57, Integer.valueOf(0));
      ((com.tencent.mm.storage.x)localObject2).set(17, Integer.valueOf(j));
      ((com.tencent.mm.storage.x)localObject2).set(25, Integer.valueOf(k));
      ((com.tencent.mm.storage.x)localObject2).set(1, str6);
      ((com.tencent.mm.storage.x)localObject2).set(29, str7);
      ((com.tencent.mm.storage.x)localObject2).set(34, Integer.valueOf(0));
      ((com.tencent.mm.storage.x)localObject2).set(256, Boolean.valueOf(false));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HandleAuthResponse", "summerstatus USERINFO_FORCE_UPDATE_AUTH set false");
      ((com.tencent.mm.storage.x)localObject2).set(-1535680990, str8);
      ((com.tencent.mm.storage.x)localObject2).set(46, null);
      ((com.tencent.mm.storage.x)localObject2).set(72, null);
      ((com.tencent.mm.storage.x)localObject2).set(64, Integer.valueOf(-1));
      ((com.tencent.mm.storage.x)localObject2).lm(true);
      ((PluginAuth)com.tencent.mm.kernel.g.n(PluginAuth.class)).getHandleAuthResponseCallbacks().a(paramArrayOfByte, this.ege, this.egf, this.egb, this.egd, 0);
      av.a(false, paramArrayOfByte.qWZ.rhK, paramArrayOfByte.qWZ.rhL, paramArrayOfByte.qWZ.rhJ);
      com.tencent.mm.kernel.g.Ei().DT().lm(true);
      com.tencent.mm.kernel.g.DF().a(new bg(new s.2(this, paramArrayOfByte)), 0);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneReg", "resp return flag" + paramArrayOfByte.qWZ.rZj);
      if ((paramArrayOfByte.qWZ.rZj & 0x1) == 0) {
        break label1506;
      }
    }
    label1453:
    label1506:
    for (boolean bool = true;; bool = false)
    {
      this.egi = bool;
      paramq = new LinkedList();
      paramq.add(new h.a(21, "android-" + Build.VERSION.SDK_INT + "-" + Build.MODEL));
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FQ().b(new h(paramq));
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      bool = com.tencent.mm.kernel.g.Eg().Dx();
      com.tencent.mm.kernel.g.Eg();
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneReg", "dkwt ERR: updateProfile acc:%b uin:%s userConfigStg:%s", new Object[] { Boolean.valueOf(bool), com.tencent.mm.a.o.getString(com.tencent.mm.kernel.a.Df()), com.tencent.mm.kernel.g.Ei().DT() });
      break;
    }
  }
  
  protected final void a(l.a parama) {}
  
  public final int getType()
  {
    return 126;
  }
  
  public final void im(int paramInt)
  {
    ((u.a)this.dJM.KV()).qWY.rhE = paramInt;
  }
  
  public final void mX(String paramString)
  {
    if (!bi.oW(paramString)) {
      ((u.a)this.dJM.KV()).qWY.rhF = paramString;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelsimple/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */