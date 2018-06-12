package com.tencent.mm.wallet_core.tenpay.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.j;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.d;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bsq;
import com.tencent.mm.protocal.c.bsr;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.a;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.c.t;
import com.tenpay.android.wechat.TenpayUtil;
import java.util.Vector;
import org.json.JSONObject;

public abstract class i
  extends com.tencent.mm.wallet_core.c.i
{
  public static Vector<String> uYa = new Vector();
  protected boolean uXZ = false;
  
  static
  {
    int i = 0;
    while (i < d.qUT.length)
    {
      uYa.add(d.qUT[i]);
      i += 1;
    }
  }
  
  private int e(com.tencent.mm.ab.b paramb)
  {
    Object localObject1 = (bsq)paramb.dID.dIL;
    if (((bsq)localObject1).rPu != null) {
      new String(((bsq)localObject1).rPu.siK.lR);
    }
    if (((bsq)localObject1).scR != null) {
      new String(((bsq)localObject1).scR.siK.lR);
    }
    t.cDk();
    if (this.uXZ)
    {
      Object localObject2 = (bsr)paramb.dIE.dIL;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new bsr();
      }
      localObject2 = "".getBytes();
      ((bsr)localObject1).rPv = new bhy().bq((byte[])localObject2);
      ((bsr)localObject1).rPy = bNX();
      ((bsr)localObject1).rPw = 0;
      try
      {
        localObject2 = new JSONObject(null);
        ((bsr)localObject1).scS = ((JSONObject)localObject2).optInt("TenpayErrType");
        ((bsr)localObject1).scT = ((JSONObject)localObject2).optString("TenpayErrMsg");
        a(1, 0, 0, "", paramb, null);
        return 1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.NetSenceTenPayBase", localException, "", new Object[0]);
        }
      }
    }
    return -1;
  }
  
  public int If()
  {
    return 385;
  }
  
  public void J(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = this.diG;
    Object localObject2;
    boolean bool;
    if (localObject1 == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).dIG = new bsq();
      ((b.a)localObject1).dIH = new bsr();
      localObject2 = getUri();
      int i = If();
      ((b.a)localObject1).uri = ((String)localObject2);
      ((b.a)localObject1).dIF = i;
      ((b.a)localObject1).dII = 185;
      ((b.a)localObject1).dIJ = 1000000185;
      localObject1 = ((b.a)localObject1).KT();
      if (!cDq())
      {
        bool = true;
        ((j)localObject1).dIU = bool;
      }
    }
    for (;;)
    {
      localObject2 = (bsq)((com.tencent.mm.ab.b)localObject1).dID.dIL;
      if (paramBoolean1) {
        ((bsq)localObject2).rPs = aBO();
      }
      if (paramBoolean2) {
        ((bsq)localObject2).rPt = 1;
      }
      this.diG = ((com.tencent.mm.ab.b)localObject1);
      return;
      bool = false;
      break;
    }
  }
  
  public final String OT(String paramString)
  {
    return TenpayUtil.signWith3Des(paramString);
  }
  
  public int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    String str1 = this.diG.uri;
    if (uYa.contains(str1))
    {
      x.d("MicroMsg.NetSenceTenPayBase", "black cgi bye bye %s", new Object[] { str1 });
      if (this.uXZ)
      {
        int i = e(this.diG);
        if (i != -1) {
          return i;
        }
      }
    }
    else
    {
      a.cCW();
      x.i("MicroMsg.NetSenceTenPayBase", "cert try get errormsg %s", new Object[] { Integer.valueOf(a.getLastError()) });
      long l = System.currentTimeMillis();
      a.cCW();
      a.init(ad.getContext());
      bsq localbsq = (bsq)this.diG.dID.dIL;
      str1 = "";
      String str2 = "";
      if (localbsq.rPu != null) {
        str1 = new String(localbsq.rPu.siK.lR);
      }
      if (localbsq.scR != null) {
        str2 = new String(localbsq.scR.siK.lR);
      }
      str1 = new String((str1 + "&&" + str2).getBytes());
      s.cDi();
      str2 = s.cDh();
      a.cCW();
      if (a.isCertExist(str2))
      {
        h.mEJ.a(414L, 20L, 1L, true);
        a.cCW();
        String str3 = a.genUserSig(str2, str1);
        h.mEJ.a(414L, 21L, System.currentTimeMillis() - l, true);
        x.v("MicroMsg.NetSenceTenPayBase", "sign ret src:%s sign:%s", new Object[] { str1, str3 });
        localbsq.sign = str3;
        localbsq.spW = str2;
      }
      for (;;)
      {
        x.i("MicroMsg.NetSenceTenPayBase", "sign cost time %s cn %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), str2 });
        break;
        a.cCW();
        x.i("MicroMsg.NetSenceTenPayBase", "cert not exist cn %s %s", new Object[] { str2, Integer.valueOf(a.getLastError()) });
      }
    }
    if (q.GS())
    {
      x.e("MicroMsg.NetSenceTenPayBase", "hy: serious error: is payupay");
      parame1.a(1000, -100868, "Pay Method Err", this);
      return 1;
    }
    return a(parame, this.diG, this);
  }
  
  public final void a(com.tencent.mm.ab.b paramb, bhy parambhy)
  {
    ((bsq)paramb.dID.dIL).rPu = parambhy;
  }
  
  public abstract int aBO();
  
  public final void b(com.tencent.mm.ab.b paramb, bhy parambhy)
  {
    ((bsq)paramb.dID.dIL).scR = parambhy;
  }
  
  public int bNX()
  {
    return aBO();
  }
  
  public boolean cDq()
  {
    return true;
  }
  
  public final void cDz()
  {
    this.uXZ = true;
  }
  
  public final n d(com.tencent.mm.ab.b paramb)
  {
    paramb = (bsr)paramb.dIE.dIL;
    n localn = new n();
    localn.rPy = paramb.rPy;
    localn.rPx = paramb.rPx;
    localn.rPw = paramb.rPw;
    localn.rPv = paramb.rPv;
    localn.iwT = paramb.scT;
    localn.uXp = paramb.scS;
    return localn;
  }
  
  public int getType()
  {
    return 385;
  }
  
  public String getUri()
  {
    return "/cgi-bin/micromsg-bin/tenpay";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/tenpay/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */