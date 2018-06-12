package com.tencent.mm.plugin.aa.a.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.protocal.c.g;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;

public final class f
  extends l
  implements k
{
  public String chatroomName;
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private com.tencent.mm.protocal.c.f eAQ;
  public g eAR;
  
  public f(long paramLong1, String paramString1, int paramInt1, int paramInt2, long paramLong2, String paramString2)
  {
    b.a locala = new b.a();
    locala.dIG = new com.tencent.mm.protocal.c.f();
    locala.dIH = new g();
    locala.dIF = 1624;
    locala.uri = "/cgi-bin/mmpay-bin/newaalaunchbymoney";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.eAQ = ((com.tencent.mm.protocal.c.f)this.eAN.dID.dIL);
    this.chatroomName = paramString2;
    try
    {
      this.eAQ.qYf = paramInt1;
      this.eAQ.qYg = paramLong1;
      this.eAQ.title = URLEncoder.encode(paramString1, "UTF-8");
      this.eAQ.qYh = new LinkedList();
      this.eAQ.scene = paramInt2;
      this.eAQ.qYd = paramString2;
      this.eAQ.qYi = i.bOL();
      x.d("MicroMsg.NetSceneAALaunchByMoney", "location %s", new Object[] { this.eAQ.qYi });
      this.eAQ.qYj = paramLong2;
      x.i("MicroMsg.NetSceneAALaunchByMoney", "NetSceneAALaunchByMoney, total_num: %s, per_amount: %s, title: %s, payer_list: %s, scene: %s, groupid: %s, timestamp", new Object[] { Integer.valueOf(this.eAQ.qYf), Long.valueOf(this.eAQ.qYg), this.eAQ.title, this.eAQ.qYh, Integer.valueOf(this.eAQ.scene), this.eAQ.qYd, Long.valueOf(this.eAQ.qYj) });
      return;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        x.e("MicroMsg.NetSceneAALaunchByMoney", "build NetSceneAALaunchByMoney request error: %s", new Object[] { paramString1.getMessage() });
      }
    }
  }
  
  public f(long paramLong1, String paramString1, List<String> paramList, int paramInt, long paramLong2, String paramString2)
  {
    b.a locala = new b.a();
    locala.dIG = new com.tencent.mm.protocal.c.f();
    locala.dIH = new g();
    locala.dIF = 1624;
    locala.uri = "/cgi-bin/mmpay-bin/newaalaunchbymoney";
    locala.dII = 0;
    locala.dIJ = 0;
    this.chatroomName = paramString2;
    this.eAN = locala.KT();
    this.eAQ = ((com.tencent.mm.protocal.c.f)this.eAN.dID.dIL);
    this.eAN.dIU = true;
    if (paramList != null) {}
    try
    {
      if (paramList.size() > 0)
      {
        this.eAQ.qYf = paramList.size();
        this.eAQ.qYg = paramLong1;
        this.eAQ.title = URLEncoder.encode(paramString1, "UTF-8");
        this.eAQ.qYh = new LinkedList();
        this.eAQ.qYh.addAll(paramList);
        this.eAQ.scene = paramInt;
        this.eAQ.qYd = paramString2;
        this.eAQ.qYi = i.bOL();
        this.eAQ.qYj = paramLong2;
        x.d("MicroMsg.NetSceneAALaunchByMoney", "location %s", new Object[] { this.eAQ.qYi });
      }
      x.i("MicroMsg.NetSceneAALaunchByMoney", "NetSceneAALaunchByMoney, total_num: %s, per_amount: %s, title: %s, payer_list: %s, scene: %s, groupid: %s, timestamp: %s", new Object[] { Integer.valueOf(this.eAQ.qYf), Long.valueOf(this.eAQ.qYg), this.eAQ.title, this.eAQ.qYh, Integer.valueOf(this.eAQ.scene), this.eAQ.qYd, Long.valueOf(this.eAQ.qYj) });
      return;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        x.e("MicroMsg.NetSceneAALaunchByMoney", "build NetSceneAALaunchByMoney request error: %s", new Object[] { paramString1.getMessage() });
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.NetSceneAALaunchByMoney", "doScene");
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneAALaunchByMoney", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.eAR = ((g)((b)paramq).dIE.dIL);
    paramInt1 = this.eAR.hUm;
    paramq = this.eAR.hUn;
    if (this.eAR.qYe == null) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.NetSceneAALaunchByMoney", "retcode: %s, retmsg: %s, msgxml==null: %s, billNo: %s", new Object[] { Integer.valueOf(paramInt1), paramq, Boolean.valueOf(bool), this.eAR.qYc });
      x.d("MicroMsg.NetSceneAALaunchByMoney", "msgxml: %s", new Object[] { this.eAR.qYe });
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
      return;
    }
  }
  
  public final int getType()
  {
    return 1624;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */