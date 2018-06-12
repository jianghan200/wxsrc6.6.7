package com.tencent.mm.plugin.collect.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.mb;
import com.tencent.mm.protocal.c.mc;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  extends l
  implements k
{
  private final String TAG = "MicroMsg.NetSceneMDRcvVoice";
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public mc hUC;
  
  public n(int paramInt, com.tencent.mm.bk.b paramb, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new mb();
    ((b.a)localObject).dIH = new mc();
    ((b.a)localObject).dIF = 1317;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/getmdrcvvoice";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (mb)this.diG.dID.dIL;
    ((mb)localObject).amount = paramInt;
    ((mb)localObject).rpW = 1;
    ((mb)localObject).hUM = paramString;
    ((mb)localObject).rpU = null;
    ((mb)localObject).rpV = paramb;
    x.i("MicroMsg.NetSceneMDRcvVoice", "amount: %d, outtradeno: %s", new Object[] { Integer.valueOf(paramInt), paramString });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneMDRcvVoice", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.hUC = ((mc)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneMDRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", new Object[] { Integer.valueOf(this.hUC.hUm), this.hUC.hUn, Integer.valueOf(this.hUC.rpW) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1317;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/collect/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */