package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.avh;
import com.tencent.mm.protocal.c.avi;
import com.tencent.mm.protocal.c.bao;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class j
  extends h
{
  private final String TAG = "MicroMsg.NetSceneModifyHoneyPayerPayWay";
  private avi kjK;
  
  public j(bao parambao, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new avh();
    ((b.a)localObject).dIH = new avi();
    ((b.a)localObject).dIF = 2941;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/modifyhppayerpayway";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (avh)this.diG.dID.dIL;
    ((avh)localObject).rPo = parambao;
    ((avh)localObject).rIw = paramString;
    x.i("MicroMsg.NetSceneModifyHoneyPayerPayWay", "cardNo: %s, suffix: %s, bankType: %s", new Object[] { paramString, parambao.scZ, parambao.lMV });
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneModifyHoneyPayerPayWay", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kjK = ((avi)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneModifyHoneyPayerPayWay", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kjK.hwV), this.kjK.hwW });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (avi)((b)paramq).dIE.dIL;
    this.uXe = paramq.hwV;
    this.uXf = paramq.hwW;
  }
  
  public final int getType()
  {
    return 2941;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */