package com.tencent.mm.plugin.voip_cs.b.c;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bzh;
import com.tencent.mm.protocal.c.bzi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends l
  implements k
{
  public com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public c(int paramInt1, String paramString1, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bzh();
    ((b.a)localObject).dIH = new bzi();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoipinvite";
    ((b.a)localObject).dIF = 823;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bzh)this.diG.dID.dIL;
    ((bzh)localObject).sef = paramInt1;
    ((bzh)localObject).svt = paramString1;
    ((bzh)localObject).rth = paramInt2;
    ((bzh)localObject).svu = com.tencent.mm.bk.b.bi(paramArrayOfByte1);
    ((bzh)localObject).svv = com.tencent.mm.bk.b.bi(paramArrayOfByte2);
    ((bzh)localObject).see = System.currentTimeMillis();
    if ((paramString2 != null) && (!paramString2.equals(""))) {
      ((bzh)localObject).svw = paramString2;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneVoipCSInvite", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 823;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/b/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */