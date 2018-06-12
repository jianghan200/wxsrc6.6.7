package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bux;
import com.tencent.mm.protocal.c.buy;

public final class y
  extends l
  implements k
{
  private String bKv;
  private String byN;
  public String cCR;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private int ivI;
  
  public y(String paramString1, String paramString2, String paramString3)
  {
    this.cCR = paramString3;
    this.byN = paramString1;
    this.bKv = paramString2;
    this.ivI = 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new bux();
    parame1.dIH = new buy();
    parame1.uri = "/cgi-bin/mmoc-bin/hardware/updatemydeviceattr";
    parame1.dIF = 1263;
    parame1.dII = 0;
    parame1.dIJ = 0;
    this.diG = parame1.KT();
    parame1 = (bux)this.diG.dID.dIL;
    parame1.cCR = this.cCR;
    parame1.lKa = this.byN;
    parame1.devicetype = this.bKv;
    parame1.srT = this.ivI;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1263;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */