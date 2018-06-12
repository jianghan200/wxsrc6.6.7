package com.tencent.mm.plugin.profile.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.brs;
import com.tencent.mm.protocal.c.brt;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends l
  implements k
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public c(String paramString, boolean paramBoolean)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new brs();
    ((b.a)localObject).dIH = new brt();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/switchbrand";
    ((b.a)localObject).dIF = 1394;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (brs)this.diG.dID.dIL;
    ((brs)localObject).riK = paramString;
    ((brs)localObject).spC = paramBoolean;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.brandservice.NetSceneSwitchBrand", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.brandservice.NetSceneSwitchBrand", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final brt bnk()
  {
    if ((this.diG != null) && (this.diG.dIE.dIL != null)) {
      return (brt)this.diG.dIE.dIL;
    }
    return null;
  }
  
  public final brs bnl()
  {
    if ((this.diG != null) && (this.diG.dID.dIL != null)) {
      return (brs)this.diG.dID.dIL;
    }
    return null;
  }
  
  public final int getType()
  {
    return 1394;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/profile/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */