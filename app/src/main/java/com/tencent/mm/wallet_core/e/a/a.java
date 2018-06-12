package com.tencent.mm.wallet_core.e.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.j;
import com.tencent.mm.model.q;
import com.tencent.mm.protocal.c.bal;
import com.tencent.mm.protocal.c.bam;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.c.n;
import com.tenpay.android.wechat.TenpayUtil;
import java.net.URLEncoder;

public abstract class a
  extends i
{
  public final void J(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject2 = this.diG;
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).dIG = new bal();
      ((b.a)localObject1).dIH = new bam();
      ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/payu";
      ((b.a)localObject1).dIF = 1518;
      ((b.a)localObject1).dII = 0;
      ((b.a)localObject1).dIJ = 0;
      localObject1 = ((b.a)localObject1).KT();
      ((j)localObject1).dIU = true;
    }
    localObject2 = (bal)((b)localObject1).dID.dIL;
    if (paramBoolean1) {
      ((bal)localObject2).rPs = bOo();
    }
    if (paramBoolean2) {
      ((bal)localObject2).rPt = 1;
    }
    this.diG = ((b)localObject1);
  }
  
  public final String OT(String paramString)
  {
    return TenpayUtil.signWith3Des(paramString);
  }
  
  public int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    if (!q.GS())
    {
      x.e("MicroMsg.NetScenePayUBase", "hy: serious error: not payupay");
      parame1.a(1000, -100868, "Pay Method Err", this);
      return 1;
    }
    return a(parame, this.diG, this);
  }
  
  public final void a(b paramb, bhy parambhy)
  {
    ((bal)paramb.dID.dIL).rPu = parambhy;
  }
  
  public final void b(b paramb, bhy parambhy)
  {
    ((bal)paramb.dID.dIL).scR = parambhy;
  }
  
  public final void b(StringBuilder paramStringBuilder, String paramString)
  {
    paramStringBuilder.append(URLEncoder.encode(paramString));
  }
  
  public final int bNX()
  {
    return bOo();
  }
  
  public abstract int bOo();
  
  public final n d(b paramb)
  {
    paramb = (bam)paramb.dIE.dIL;
    n localn = new n();
    localn.rPy = paramb.rPy;
    localn.rPx = paramb.rPx;
    localn.rPw = paramb.rPw;
    localn.rPv = paramb.rPv;
    localn.iwT = paramb.scT;
    localn.uXp = paramb.scS;
    return localn;
  }
  
  public final int getType()
  {
    return 1518;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/e/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */