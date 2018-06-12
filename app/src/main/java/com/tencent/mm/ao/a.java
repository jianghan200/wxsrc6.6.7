package com.tencent.mm.ao;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bcq;
import com.tencent.mm.protocal.c.bcr;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  boolean ebi = false;
  int ebj = 0;
  
  public a(int paramInt, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bcq();
    ((b.a)localObject).dIH = new bcr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/pushnewtips";
    ((b.a)localObject).dIF = 597;
    this.diG = ((b.a)localObject).KT();
    localObject = (bcq)this.diG.dID.dIL;
    ((bcq)localObject).seO = paramInt;
    ((bcq)localObject).seP = 1;
    ((bcq)localObject).riD = paramString;
    this.ebj = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetScenePushNewTips", "doScene");
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.NetScenePushNewTips", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.ebi = ((bcr)((b)paramq).dIE.dIL).seQ;
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 597;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ao/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */