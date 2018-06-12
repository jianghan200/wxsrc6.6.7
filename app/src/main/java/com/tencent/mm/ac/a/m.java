package com.tencent.mm.ac.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.qf;
import com.tencent.mm.protocal.c.qg;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  extends l
  implements k
{
  public String dNT;
  Object data;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public m(String paramString1, String paramString2, String paramString3, Object paramObject)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new qf();
    ((b.a)localObject).dIH = new qg();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/convertbizchat";
    ((b.a)localObject).dIF = 1315;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (qf)this.diG.dID.dIL;
    ((qf)localObject).ruF = paramString1;
    ((qf)localObject).ruH = paramString2;
    ((qf)localObject).ruG = paramString3;
    this.data = paramObject;
  }
  
  public final qg Ns()
  {
    if ((this.diG != null) && (this.diG.dIE.dIL != null)) {
      return (qg)this.diG.dIE.dIL;
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.NetSceneConvertBizChat", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneConvertBizChat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1315;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ac/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */