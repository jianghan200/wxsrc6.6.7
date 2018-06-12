package com.tencent.mm.ac;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.bf;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.pd;
import com.tencent.mm.protocal.c.pe;
import com.tencent.mm.protocal.c.pf;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class q
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public q(String paramString1, int paramInt, String paramString2, LinkedList<pd> paramLinkedList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new pe();
    ((b.a)localObject).dIH = new pf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/clickcommand";
    ((b.a)localObject).dIF = 359;
    ((b.a)localObject).dII = 176;
    ((b.a)localObject).dIJ = 1000000176;
    this.diG = ((b.a)localObject).KT();
    localObject = (pe)this.diG.dID.dIL;
    ((pe)localObject).rtz = paramInt;
    ((pe)localObject).rtA = paramString2;
    ((pe)localObject).riA = paramString1;
    ((pe)localObject).rco = bf.Ir();
    if (paramLinkedList != null) {
      ((pe)localObject).rtB = paramLinkedList;
    }
    x.i("MicroMsg.NetSceneBizClickCommand", "click command : %s, type: %s, info: %s, MsgSource : %s, MsgReport size %d", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2, ((pe)localObject).rco, Integer.valueOf(((pe)localObject).rtB.size()) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 359;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ac/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */