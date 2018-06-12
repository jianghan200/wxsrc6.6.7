package com.tencent.mm.plugin.product.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ago;
import com.tencent.mm.protocal.c.agp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class h
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public String lRg;
  public m lRh;
  public List<n> lRi;
  
  public h(m paramm, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ago();
    ((b.a)localObject).dIH = new agp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getproductdetail";
    ((b.a)localObject).dIF = 553;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (ago)this.diG.dID.dIL;
    this.lRg = paramString;
    ((ago)localObject).rJU = paramString;
    x.d("MicroMsg.NetSceneMallGetProductDetail", "pid " + paramString);
    ((ago)localObject).hcD = 0;
    this.lRh = paramm;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = (agp)((b)paramq).dIE.dIL;
    if (!bi.oW(paramArrayOfByte.rJW))
    {
      x.d("MicroMsg.NetSceneMallGetProductDetail", "resp.ProductInfo " + paramArrayOfByte.rJW);
      this.lRh = m.a(this.lRh, paramArrayOfByte.rJW);
    }
    paramInt1 = paramInt3;
    paramq = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramq = paramString;
      if (paramArrayOfByte.rmN != 0)
      {
        paramInt1 = paramArrayOfByte.rmN;
        paramq = paramArrayOfByte.rmO;
      }
    }
    if (!bi.oW(paramArrayOfByte.rJX))
    {
      x.d("MicroMsg.NetSceneMallGetProductDetail", "resp.RecommendInfo " + paramArrayOfByte.rJX);
      this.lRi = n.parse(paramArrayOfByte.rJX);
    }
    x.d("MicroMsg.NetSceneMallGetProductDetail", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.diJ.a(paramInt2, paramInt1, paramq, this);
  }
  
  public final int getType()
  {
    return 553;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/product/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */