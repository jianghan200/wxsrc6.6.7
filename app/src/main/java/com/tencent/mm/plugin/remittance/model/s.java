package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.mr;
import com.tencent.mm.protocal.c.ms;
import com.tencent.mm.sdk.platformtools.x;

public final class s
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  public ms mxz;
  
  public s(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, String paramString5)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new mr();
    ((b.a)localObject).dIH = new ms();
    ((b.a)localObject).dIF = 1779;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/transferoldpaycheck";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.eAN = ((b.a)localObject).KT();
    localObject = (mr)this.eAN.dID.dIL;
    ((mr)localObject).bQa = paramString1;
    ((mr)localObject).rqG = paramString2;
    ((mr)localObject).myq = paramString3;
    ((mr)localObject).myl = paramString4;
    ((mr)localObject).mzF = paramLong;
    ((mr)localObject).rqo = paramString5;
    x.i("MicroMsg.NetSceneRemittancePayCheck", "reqKey: %s, transfer: %s, fee: %s", new Object[] { paramString1, paramString2, Long.valueOf(paramLong) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneRemittancePayCheck", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.mxz = ((ms)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneRemittancePayCheck", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.mxz.hUm), this.mxz.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1779;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */