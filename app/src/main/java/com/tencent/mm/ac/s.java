package com.tencent.mm.ac;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aar;
import com.tencent.mm.protocal.c.aas;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class s
  extends l
  implements k
{
  Object data;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public s(String paramString, int paramInt, Object paramObject)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aar();
    ((b.a)localObject).dIH = new aas();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/getbizenterpriseattr";
    ((b.a)localObject).dIF = 1343;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aar)this.diG.dID.dIL;
    ((aar)localObject).riK = paramString;
    ((aar)localObject).rFW = paramInt;
    if (w.chP().equals("zh_CN")) {}
    for (paramInt = 2;; paramInt = 1)
    {
      ((aar)localObject).rFX = paramInt;
      this.data = paramObject;
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.NetSceneGetBizEnterpriseAttr", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetBizEnterpriseAttr", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1343;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ac/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */