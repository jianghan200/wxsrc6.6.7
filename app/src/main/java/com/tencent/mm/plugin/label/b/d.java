package com.tencent.mm.plugin.label.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.auz;
import com.tencent.mm.protocal.c.ava;
import com.tencent.mm.protocal.c.bxe;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class d
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private LinkedList<bxe> kAG = new LinkedList();
  
  public d(LinkedList<bxe> paramLinkedList)
  {
    b.a locala = new b.a();
    locala.dIG = new auz();
    locala.dIH = new ava();
    locala.uri = "/cgi-bin/micromsg-bin/modifycontactlabellist";
    locala.dIF = 638;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.kAG = paramLinkedList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.Label.NetSceneModifyContactLabelList", "cpan[doScene].");
    this.diJ = parame1;
    parame1 = (auz)this.diG.dID.dIL;
    parame1.rYe = this.kAG;
    parame1.rGU = this.kAG.size();
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.Label.NetSceneModifyContactLabelList", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 638;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/label/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */