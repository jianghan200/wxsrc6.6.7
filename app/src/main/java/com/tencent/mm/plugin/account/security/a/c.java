package com.tencent.mm.plugin.account.security.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bvd;
import com.tencent.mm.protocal.c.bve;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends l
  implements k
{
  public String bKv;
  public String byN;
  public String deviceName;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public c(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bvd();
    ((b.a)localObject).dIH = new bve();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/updatesafedevice";
    ((b.a)localObject).dIF = 361;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    this.byN = paramString1;
    this.deviceName = paramString2;
    this.bKv = paramString3;
    localObject = (bvd)this.diG.dID.dIL;
    ((bvd)localObject).rvq = paramString1;
    ((bvd)localObject).jPe = paramString2;
    ((bvd)localObject).reT = paramString3;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    if ((bi.oW(this.byN)) || (bi.oW(this.deviceName)) || (bi.oW(this.bKv)))
    {
      x.e("MicroMsg.NetscenUpdateSafeDevice", "null device is or device name or device type");
      return -1;
    }
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetscenUpdateSafeDevice", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 361;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/security/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */