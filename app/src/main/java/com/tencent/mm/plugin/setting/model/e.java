package com.tencent.mm.plugin.setting.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aiq;
import com.tencent.mm.protocal.c.air;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new aiq();
    parame1.dIH = new air();
    parame1.uri = "/cgi-bin/micromsg-bin/gettrustedfriends";
    parame1.dIF = 869;
    parame1.dII = 0;
    parame1.dIJ = 0;
    return a(parame, parame1.KT(), this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.dIZ = paramInt1;
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      x.e("MicroMsg.NetSceneGetTrustedFriends", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 869;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */