package com.tencent.mm.plugin.translate.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aio;
import com.tencent.mm.protocal.c.aip;
import com.tencent.mm.protocal.c.bub;
import com.tencent.mm.protocal.c.buc;
import java.util.LinkedList;

public final class b
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ = null;
  public LinkedList<buc> oEq;
  
  public b(LinkedList<bub> paramLinkedList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aio();
    ((b.a)localObject).dIH = new aip();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/gettranstext";
    ((b.a)localObject).dIF = 631;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aio)this.diG.dID.dIL;
    ((aio)localObject).rLq = paramLinkedList;
    ((aio)localObject).hbE = paramLinkedList.size();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (aip)this.diG.dIE.dIL;
    this.diJ.a(paramInt2, paramInt3, paramString, this);
    this.oEq = paramq.rLq;
  }
  
  public final int getType()
  {
    return 631;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/translate/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */