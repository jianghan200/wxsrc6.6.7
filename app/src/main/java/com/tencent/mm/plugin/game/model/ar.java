package com.tencent.mm.plugin.game.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.xz;
import com.tencent.mm.protocal.c.ya;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class ar
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  public final b ivx;
  
  public ar(String paramString, LinkedList<String> paramLinkedList1, LinkedList<String> paramLinkedList2, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new xz();
    ((b.a)localObject).dIH = new ya();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamecentersearch";
    ((b.a)localObject).dIF = 1328;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    localObject = (xz)this.ivx.dID.dIL;
    ((xz)localObject).jRj = paramString;
    ((xz)localObject).rDP = paramLinkedList1;
    ((xz)localObject).rDI = paramLinkedList2;
    ((xz)localObject).rDQ = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.ivx, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGameCenterSearch", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1328;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */