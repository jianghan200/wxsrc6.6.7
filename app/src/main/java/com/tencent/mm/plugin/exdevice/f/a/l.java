package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ara;
import com.tencent.mm.protocal.c.arb;
import com.tencent.mm.sdk.platformtools.x;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  public int bYt;
  private b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  public String dxK;
  public String ixK;
  
  public l(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    this.ixK = paramString3;
    this.dxK = paramString2;
    this.bYt = paramInt;
    this.ixK = paramString3;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ara();
    ((b.a)localObject).dIH = new arb();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/rank/addlike";
    ((b.a)localObject).dIF = 1041;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (ara)this.diG.dID.dIL;
    ((ara)localObject).iEL = paramString2;
    ((ara)localObject).username = paramString1;
    ((ara)localObject).bYt = paramInt;
    ((ara)localObject).dxc = paramString3;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneUpdateLikeStatus", "hy: end. errType: %d, errCode: %d, errMsg: %s, ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1041;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */