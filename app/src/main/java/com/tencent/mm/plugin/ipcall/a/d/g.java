package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.akb;
import com.tencent.mm.protocal.c.akc;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.io.IOException;

public final class g
  extends l
  implements k
{
  private b diG = null;
  private com.tencent.mm.ab.e diJ;
  private akb krs = null;
  public akc krt = null;
  
  public g(int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new akb();
    ((b.a)localObject).dIH = new akc();
    ((b.a)localObject).dIF = 257;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getwechatoutcoupons";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    this.krs = ((akb)this.diG.dID.dIL);
    this.krs.otY = paramInt;
    localObject = this.krs;
    au.HU();
    ((akb)localObject).rMF = ((Integer)c.DT().get(aa.a.sRm, Integer.valueOf(0))).intValue();
    localObject = this.krs;
    au.HU();
    ((akb)localObject).rMG = ((Integer)c.DT().get(aa.a.sRa, Integer.valueOf(0))).intValue();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "NetSceneIPCallGetWeChatOutCoupons Scene:%d, RechargeWordingVersion:%d,AccountActivityWordingVersion:%d", new Object[] { Integer.valueOf(this.krs.otY), Integer.valueOf(this.krs.rMF), Integer.valueOf(this.krs.rMG) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.krt = ((akc)((b)paramq).dIE.dIL);
    if (((paramInt2 == 0) || (paramInt3 == 0)) && (paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = this.krt;
      if (paramq != null) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallUtil", "[royle]begin save response,Balance:%s,PVWording:%s,Coupons:%s,Wording:%s,Title:%s,Desc:%s,ImgPath:%s,UrlPath:%s,SmsDesc:%s,PackageMsg:%s", new Object[] { paramq.rMK, paramq.rML, paramq.rMH, paramq.ksB, paramq.bHD, paramq.jOS, paramq.rMI, paramq.rMJ, paramq.rMM, paramq.rMS });
      }
    }
    try
    {
      au.HU();
      c.DT().a(aa.a.sSg, bi.bE(paramq.toByteArray()));
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
      return;
    }
    catch (IOException paramq)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallUtil", "[royle]save exception:%s", new Object[] { paramq.getMessage() });
      }
    }
  }
  
  public final int getType()
  {
    return 257;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */