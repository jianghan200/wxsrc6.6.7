package com.tencent.mm.plugin.game.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.xw;
import com.tencent.mm.protocal.c.xx;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class as
  extends l
  implements k
{
  public String bHt;
  private com.tencent.mm.ab.e diJ;
  public final b ivx;
  
  public as(String paramString1, String paramString2, LinkedList<String> paramLinkedList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new xw();
    ((b.a)localObject).dIH = new xx();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamecentersearchrecommend";
    ((b.a)localObject).dIF = 1329;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    if (paramString2 == null) {}
    for (this.bHt = "";; this.bHt = paramString2.trim())
    {
      this.ivx = ((b.a)localObject).KT();
      localObject = (xw)this.ivx.dID.dIL;
      ((xw)localObject).jRj = paramString1;
      ((xw)localObject).rDH = paramString2;
      ((xw)localObject).rDI = paramLinkedList;
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.ivx, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGameSearchRecmd", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1329;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/model/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */