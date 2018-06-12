package com.tencent.mm.plugin.game.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.d.ay;
import com.tencent.mm.plugin.game.d.az;
import com.tencent.mm.sdk.platformtools.x;

public final class at
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  public final b ivx;
  
  public at(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ay();
    ((b.a)localObject).dIH = new az();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newgetgamedetail";
    ((b.a)localObject).dIF = 1217;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    localObject = (ay)this.ivx.dID.dIL;
    ((ay)localObject).jRj = paramString1;
    ((ay)localObject).jPc = paramString2;
    ((ay)localObject).jRt = paramBoolean;
    ((ay)localObject).jRv = true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.ivx, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetGameDetailNew", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1217;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/model/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */