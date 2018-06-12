package com.tencent.mm.aa;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ano;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.gc;
import com.tencent.mm.protocal.c.gd;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  LinkedList<bhz> dHV = null;
  LinkedList<ano> dHW = null;
  private com.tencent.mm.ab.e diJ;
  
  public l(LinkedList<bhz> paramLinkedList)
  {
    this.dHV = paramLinkedList;
  }
  
  protected final int Cc()
  {
    return 20;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    if ((this.dHV == null) || (this.dHV.size() <= 0))
    {
      x.e("MicroMsg.NetSceneBatchGetHeadImg", g.Ac() + "doScene ReqSize==0");
      return -1;
    }
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new gc();
    parame1.dIH = new gd();
    parame1.uri = "/cgi-bin/micromsg-bin/batchgetheadimg";
    parame1.dIF = 123;
    parame1.dII = 15;
    parame1.dIJ = 1000000015;
    parame1 = parame1.KT();
    gc localgc = (gc)parame1.dID.dIL;
    localgc.rgF = this.dHV;
    localgc.hbF = this.dHV.size();
    return a(parame, parame1, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneBatchGetHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
    this.dHW = ((gd)((b)paramq).dIE.dIL).rgI;
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 123;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */