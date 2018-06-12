package com.tencent.mm.modelvoiceaddr.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bgz;
import com.tencent.mm.protocal.c.bha;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class a
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(int paramInt, LinkedList<bhz> paramLinkedList, bhz parambhz1, bhz parambhz2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bgz();
    ((b.a)localObject).dIH = new bha();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/reportvoiceresult";
    ((b.a)localObject).dIF = 228;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bgz)this.diG.dID.dIL;
    ((bgz)localObject).shR = paramInt;
    ((bgz)localObject).shS = paramLinkedList;
    ((bgz)localObject).shT = parambhz1;
    ((bgz)localObject).shU = parambhz2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneNewVoiceInputReport", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 228;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelvoiceaddr/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */