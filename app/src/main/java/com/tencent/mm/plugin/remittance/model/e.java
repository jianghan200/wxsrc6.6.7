package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.protocal.c.mp;
import com.tencent.mm.protocal.c.mq;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class e
  extends h
{
  private final String TAG = "MicroMsg.NetSceneBeforeTransfer";
  public mq mwY;
  
  public e(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new mp();
    ((b.a)localObject).dIH = new mq();
    ((b.a)localObject).dIF = 2783;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/beforetransfer";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (mp)this.diG.dID.dIL;
    ((mp)localObject).rcH = paramString;
    if (!f.cfE()) {
      ((mp)localObject).rqE = f.cfF();
    }
    x.d("MicroMsg.NetSceneBeforeTransfer", "rcver name: %s", new Object[] { paramString });
  }
  
  protected final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneBeforeTransfer", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.mwY = ((mq)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBeforeTransfer", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.mwY.hUm), this.mwY.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (mq)((b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 2783;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */