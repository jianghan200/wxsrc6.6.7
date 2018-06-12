package com.tencent.mm.plugin.wear.model.d;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.amd;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  public String bKv;
  public String byN;
  private com.tencent.mm.ab.b dZf;
  private com.tencent.mm.ab.e diJ;
  
  public a(String paramString1, String paramString2)
  {
    this.byN = paramString1;
    this.bKv = paramString2;
    Object localObject = new b.a();
    ((b.a)localObject).dIF = 1091;
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/device/register";
    ((b.a)localObject).dIG = new amc();
    ((b.a)localObject).dIH = new amd();
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.dZf = ((b.a)localObject).KT();
    localObject = (amc)this.dZf.dID.dIL;
    ((amc)localObject).rgs = new com.tencent.mm.bk.b(paramString1.getBytes());
    ((amc)localObject).rgu = new com.tencent.mm.bk.b(paramString2.getBytes());
    ((amc)localObject).rOO = new com.tencent.mm.bk.b("5".getBytes());
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.Wear.NetSceneBizDeviceAuth", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1091;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wear/model/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */