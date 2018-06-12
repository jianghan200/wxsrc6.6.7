package com.tencent.mm.plugin.qqmail.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.no;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.protocal.c.qe;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  b diG;
  private com.tencent.mm.ab.e diJ;
  private ArrayList<Long> mcU;
  
  public l(ArrayList<Long> paramArrayList)
  {
    this.mcU = paramArrayList;
    paramArrayList = new b.a();
    paramArrayList.dIG = new no();
    paramArrayList.dIH = new np();
    paramArrayList.uri = "/cgi-bin/micromsg-bin/checkconversationfile";
    paramArrayList.dIF = 483;
    paramArrayList.dII = 0;
    paramArrayList.dIJ = 0;
    this.diG = paramArrayList.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = (no)this.diG.dID.dIL;
    parame1.hbF = this.mcU.size();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.mcU.iterator();
    while (localIterator.hasNext())
    {
      long l = ((Long)localIterator.next()).longValue();
      qe localqe = new qe();
      localqe.rcq = l;
      localLinkedList.add(localqe);
      x.i("MicroMsg.NetSceneCheckConversationFile", "MsgId: %d", new Object[] { Long.valueOf(l) });
    }
    parame1.rrE = localLinkedList;
    x.i("MicroMsg.NetSceneCheckConversationFile", "Count = %d, MsgInfoList.size = %d", new Object[] { Integer.valueOf(parame1.hbF), Integer.valueOf(parame1.rrE.size()) });
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneCheckConversationFile", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (((paramInt2 != 0) || (paramInt3 != 0)) && (this.diJ != null)) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    while (this.diJ == null) {
      return;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 483;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */