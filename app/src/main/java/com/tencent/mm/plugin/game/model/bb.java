package com.tencent.mm.plugin.game.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.d.at;
import com.tencent.mm.plugin.game.d.au;
import com.tencent.mm.sdk.platformtools.x;

public final class bb
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private final b ivx;
  
  public bb(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new at();
    ((b.a)localObject).dIH = new au();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamereport";
    ((b.a)localObject).dIF = 1223;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    localObject = (at)this.ivx.dID.dIL;
    ((at)localObject).jPc = paramString1;
    ((at)localObject).jRb = paramInt1;
    ((at)localObject).jRc = paramInt2;
    ((at)localObject).jRd = paramString2;
    ((at)localObject).jRe = paramString3;
    ((at)localObject).jRa = ((int)(System.currentTimeMillis() / 1000L));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.ivx, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetGameIndex", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1223;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/model/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */