package com.tencent.mm.plugin.talkroom.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.protocal.c.ug;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private int sceneType;
  
  public b(int paramInt1, long paramLong, String paramString, int paramInt2)
  {
    this.sceneType = paramInt2;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new uf();
    ((b.a)localObject).dIH = new ug();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/exittalkroom";
    ((b.a)localObject).dIF = 333;
    ((b.a)localObject).dII = 148;
    ((b.a)localObject).dIJ = 1000000148;
    this.diG = ((b.a)localObject).KT();
    localObject = (uf)this.diG.dID.dIL;
    ((uf)localObject).rxF = paramString;
    ((uf)localObject).rxG = paramInt1;
    ((uf)localObject).rxH = paramLong;
    ((uf)localObject).otY = paramInt2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneExitTalkRoom", "doScene %d", new Object[] { Integer.valueOf(this.sceneType) });
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneExitTalkRoom", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 333;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/talkroom/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */