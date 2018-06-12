package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.lo;
import com.tencent.mm.protocal.c.lp;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;
import java.net.URLDecoder;

public final class m
  extends h
{
  private final String TAG = "MicroMsg.NetSceneF2fDynamicCode";
  public lp mxr;
  
  public m(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new lo();
    ((b.a)localObject).dIH = new lp();
    ((b.a)localObject).dIF = 2736;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/f2fdynamiccode";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (lo)this.diG.dID.dIL;
    ((lo)localObject).amount = paramInt;
    ((lo)localObject).hyG = paramString1;
    ((lo)localObject).myl = paramString2;
    ((lo)localObject).rpI = URLDecoder.decode(paramString3);
    ((lo)localObject).mxX = paramString4;
    ((lo)localObject).mxY = paramString5;
    ((lo)localObject).myo = paramString6;
    ((lo)localObject).nickname = paramString7;
    ((lo)localObject).mxM = paramString8;
    x.i("MicroMsg.NetSceneF2fDynamicCode", "amount: %s, username: %s, transfer_code_id: %s", new Object[] { Integer.valueOf(paramInt), paramString1, URLDecoder.decode(paramString3) });
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneF2fDynamicCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.mxr = ((lp)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneF2fDynamicCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.mxr.hUm), this.mxr.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (lp)((b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 2736;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */