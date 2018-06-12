package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bd;
import com.tencent.mm.protocal.c.be;
import com.tencent.mm.protocal.c.bj;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  private b diG;
  public com.tencent.mm.ab.e diJ;
  private LinkedList<bj> nnP;
  
  public l(LinkedList<bj> paramLinkedList)
  {
    b.a locala = new b.a();
    locala.dIG = new bd();
    locala.dIH = new be();
    locala.uri = "/cgi-bin/mmoc-bin/ad/addatareport";
    locala.dIF = 1295;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((bd)this.diG.dID.dIL).rbu = paramLinkedList;
    this.nnP = paramLinkedList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneSnsAdDataReport", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1295;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */