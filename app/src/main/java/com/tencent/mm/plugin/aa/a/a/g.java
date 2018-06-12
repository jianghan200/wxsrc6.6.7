package com.tencent.mm.plugin.aa.a.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.h;
import com.tencent.mm.protocal.c.j;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends l
  implements k
{
  public String chatroomName;
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private h eAS;
  public com.tencent.mm.protocal.c.i eAT;
  
  public g(String paramString1, long paramLong1, List<j> paramList, int paramInt, String paramString2, long paramLong2)
  {
    b.a locala = new b.a();
    locala.dIG = new h();
    locala.dIH = new com.tencent.mm.protocal.c.i();
    locala.dIF = 1655;
    locala.uri = "/cgi-bin/mmpay-bin/newaalaunchbyperson";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.eAS = ((h)this.eAN.dID.dIL);
    this.eAN.dIU = true;
    try
    {
      this.eAS.title = p.encode(paramString1, "UTF-8");
      this.eAS.qYl = paramLong1;
      this.eAS.qYh = new LinkedList();
      this.eAS.qYh.addAll(paramList);
      this.eAS.scene = paramInt;
      this.eAS.qYd = paramString2;
      this.eAS.qYi = com.tencent.mm.plugin.wallet_core.model.i.bOL();
      this.eAS.qYj = paramLong2;
      x.d("MicroMsg.NetSceneAALaunchByPerson", "location %s", new Object[] { this.eAS.qYi });
      this.chatroomName = paramString2;
      x.i("MicroMsg.NetSceneAALaunchByPerson", "NetSceneAALaunchByPerson, title: %s, total_pay_amount: %s, payer_list: %s, scene: %s, groupid: %s, timestamp: %s", new Object[] { this.eAS.title, Long.valueOf(this.eAS.qYl), this.eAS.qYh, Integer.valueOf(this.eAS.scene), this.eAS.qYd, Long.valueOf(this.eAS.qYj) });
      return;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        x.e("MicroMsg.NetSceneAALaunchByPerson", "build NetSceneAALaunchByPerson request error: %s", new Object[] { paramString1.getMessage() });
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneAALaunchByPerson", "doScene");
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneAALaunchByPerson", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.eAT = ((com.tencent.mm.protocal.c.i)((b)paramq).dIE.dIL);
    paramInt1 = this.eAT.hUm;
    paramq = this.eAT.hUn;
    paramArrayOfByte = this.eAT.qYc;
    if (this.eAT.qYe == null) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.NetSceneAALaunchByPerson", "retcode: %s, retmsg: %s, bill_no: %s, msgxml==null: %s", new Object[] { Integer.valueOf(paramInt1), paramq, paramArrayOfByte, Boolean.valueOf(bool) });
      x.d("MicroMsg.NetSceneAALaunchByPerson", "msgxml: %s", new Object[] { this.eAT.qYe });
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
      return;
    }
  }
  
  public final int getType()
  {
    return 1655;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */