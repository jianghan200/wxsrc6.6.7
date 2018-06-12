package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.protocal.c.bcb;
import com.tencent.mm.protocal.c.bcc;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends l
  implements k
{
  private b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  public bcb krw = null;
  public bcc krx = null;
  
  public i(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bcb();
    ((b.a)localObject).dIH = new bcc();
    ((b.a)localObject).dIF = 991;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/pstninvite";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    long l = System.currentTimeMillis();
    int i = c.aYA();
    localObject = (bcb)this.diG.dID.dIL;
    ((bcb)localObject).jTv = com.tencent.mm.model.q.GF();
    ((bcb)localObject).seg = paramString2;
    ((bcb)localObject).jTu = paramString1;
    ((bcb)localObject).sef = paramInt1;
    ((bcb)localObject).rth = i;
    ((bcb)localObject).seo = 1;
    ((bcb)localObject).see = l;
    ((bcb)localObject).sen = paramInt2;
    ((bcb)localObject).sep = paramInt3;
    this.krw = ((bcb)localObject);
    x.i("MicroMsg.NetSceneIPCallInvite", "toUsername: %s, phoneNumber: %s, invitedId: %s, netType: %d, dialScene: %d, countryType: %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneIPCallInvite", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.krx = ((bcc)((b)paramq).dIE.dIL);
    if ((paramInt2 != 0) && (paramInt3 != 0)) {
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
    }
    while (this.diJ == null) {
      return;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 991;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */