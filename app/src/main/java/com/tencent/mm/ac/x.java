package com.tencent.mm.ac;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bgl;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.bgn;
import java.util.LinkedList;

public final class x
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public x(LinkedList<bgl> paramLinkedList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bgm();
    ((b.a)localObject).dIH = new bgn();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/reportcommand";
    ((b.a)localObject).dIF = 2592;
    ((b.a)localObject).dII = 176;
    ((b.a)localObject).dIJ = 1000000176;
    this.diG = ((b.a)localObject).KT();
    localObject = (bgm)this.diG.dID.dIL;
    ((bgm)localObject).rtB = paramLinkedList;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneReportBrandSession", "reportcommand MsgReport size %d", new Object[] { Integer.valueOf(((bgm)localObject).rtB.size()) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 2592;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ac/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */