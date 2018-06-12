package com.tencent.mm.plugin.game.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.d.dc;
import com.tencent.mm.plugin.game.d.dd;
import com.tencent.mm.sdk.platformtools.x;

public final class bd
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  public final b ivx;
  
  public bd(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new dc();
    ((b.a)localObject).dIH = new dd();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newsubscribenewgame";
    ((b.a)localObject).dIF = 1219;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    localObject = (dc)this.ivx.dID.dIL;
    ((dc)localObject).jPc = paramString1;
    ((dc)localObject).jRj = paramString2;
    ((dc)localObject).jOZ = paramString3;
    ((dc)localObject).jPp = paramBoolean;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.ivx, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGameSubscription", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1219;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/model/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */