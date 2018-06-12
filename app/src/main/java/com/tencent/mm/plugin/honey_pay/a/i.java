package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.avf;
import com.tencent.mm.protocal.c.avg;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class i
  extends h
{
  private final String TAG = "MicroMsg.NetSceneModifyHoneyPayerNotify";
  public int bWA;
  private avg kjJ;
  
  public i(int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new avf();
    locala.dIH = new avg();
    locala.dIF = 2742;
    locala.uri = "/cgi-bin/mmpay-bin/modifyhppayernotify";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((avf)this.diG.dID.dIL).peW = paramInt;
    this.bWA = paramInt;
    x.i("MicroMsg.NetSceneModifyHoneyPayerNotify", "notify flag: %s", new Object[] { Integer.valueOf(paramInt) });
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneModifyHoneyPayerNotify", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kjJ = ((avg)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneModifyHoneyPayerNotify", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kjJ.hwV), this.kjJ.hwW });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (avg)((b)paramq).dIE.dIL;
    this.uXe = paramq.hwV;
    this.uXf = paramq.hwW;
  }
  
  public final int getType()
  {
    return 2742;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */