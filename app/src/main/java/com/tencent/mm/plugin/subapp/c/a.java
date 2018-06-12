package com.tencent.mm.plugin.subapp.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.axh;
import com.tencent.mm.protocal.c.axi;
import com.tencent.mm.protocal.c.byq;
import java.util.LinkedList;

public final class a
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(LinkedList<byq> paramLinkedList, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new axh();
    ((b.a)localObject).dIH = new axi();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/opvoicereminder";
    ((b.a)localObject).dIF = 331;
    ((b.a)localObject).dII = 150;
    ((b.a)localObject).dIJ = 1000000150;
    this.diG = ((b.a)localObject).KT();
    localObject = (axh)this.diG.dID.dIL;
    ((axh)localObject).qZc = 1;
    ((axh)localObject).sar = paramLinkedList;
    ((axh)localObject).saq = paramInt;
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
    return 331;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/subapp/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */