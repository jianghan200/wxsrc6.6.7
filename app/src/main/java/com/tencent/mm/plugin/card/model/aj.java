package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.zn;
import com.tencent.mm.protocal.c.zo;
import com.tencent.mm.sdk.platformtools.x;

public final class aj
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String hwU;
  public com.tencent.mm.bk.b hxt;
  public boolean hxu;
  
  public aj(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, String paramString4, String paramString5, String paramString6, com.tencent.mm.bk.b paramb)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new zn();
    ((b.a)localObject).dIH = new zo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getavailablecard";
    ((b.a)localObject).dIF = 664;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (zn)this.diG.dID.dIL;
    ((zn)localObject).hva = paramString1;
    ((zn)localObject).hFj = paramInt1;
    ((zn)localObject).hFk = paramString2;
    ((zn)localObject).hFl = paramString3;
    ((zn)localObject).time_stamp = paramInt2;
    ((zn)localObject).hFm = paramString4;
    ((zn)localObject).huU = paramString5;
    ((zn)localObject).hFn = paramString6;
    ((zn)localObject).hxt = paramb;
    if ("INVOICE".equalsIgnoreCase(paramString6))
    {
      ((zn)localObject).rFt = 1;
      return;
    }
    ((zn)localObject).rFt = 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetsceneGetAvailableCard", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (zo)this.diG.dIE.dIL;
      this.hwU = paramq.hwU;
      this.hxt = paramq.hxt;
      if (paramq.rFu == 0) {
        break label103;
      }
    }
    label103:
    for (boolean bool = true;; bool = false)
    {
      this.hxu = bool;
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
  }
  
  public final int getType()
  {
    return 664;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/model/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */