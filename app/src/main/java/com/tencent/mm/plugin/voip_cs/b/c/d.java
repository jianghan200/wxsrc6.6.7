package com.tencent.mm.plugin.voip_cs.b.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bzk;
import com.tencent.mm.protocal.c.bzl;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public d(long paramLong1, long paramLong2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bzk();
    ((b.a)localObject).dIH = new bzl();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoipredirect";
    ((b.a)localObject).dIF = 285;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bzk)this.diG.dID.dIL;
    ((bzk)localObject).svs = paramLong1;
    ((bzk)localObject).rxH = paramLong2;
    ((bzk)localObject).see = System.currentTimeMillis();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneVoipCSRedirect", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 285;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/b/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */