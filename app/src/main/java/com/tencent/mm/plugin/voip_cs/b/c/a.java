package com.tencent.mm.plugin.voip_cs.b.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bzd;
import com.tencent.mm.protocal.c.bze;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(int paramInt1, long paramLong1, long paramLong2, String paramString, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bzd();
    ((b.a)localObject).dIH = new bze();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoiphangup";
    ((b.a)localObject).dIF = 880;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bzd)this.diG.dID.dIL;
    ((bzd)localObject).sef = paramInt1;
    ((bzd)localObject).svs = paramLong1;
    ((bzd)localObject).rxH = paramLong2;
    ((bzd)localObject).svt = paramString;
    ((bzd)localObject).rEv = paramInt2;
    ((bzd)localObject).see = System.currentTimeMillis();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneVoipCSHangUp", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 880;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/b/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */