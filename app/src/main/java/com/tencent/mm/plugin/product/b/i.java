package com.tencent.mm.plugin.product.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.agq;
import com.tencent.mm.protocal.c.agr;
import com.tencent.mm.protocal.c.sg;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public LinkedList<sg> lRj;
  public String mUrl;
  
  public i(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new agq();
    ((b.a)localObject).dIH = new agr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getproductdiscount";
    ((b.a)localObject).dIF = 579;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (agq)this.diG.dID.dIL;
    ((agq)localObject).rmM = paramString1;
    this.mUrl = paramString2;
    ((agq)localObject).jPK = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = (agr)((b)paramq).dIE.dIL;
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.rmN == 0))
    {
      x.d("MicroMsg.NetSceneMallGetProductDiscount", "resp.ProductInfo " + paramArrayOfByte.rJY);
      try
      {
        paramq = new JSONObject(paramArrayOfByte.rJY).optJSONArray("discount_list");
        if (paramq != null)
        {
          this.lRj = new LinkedList();
          int i = paramq.length();
          paramInt1 = 0;
          while (paramInt1 < i)
          {
            JSONObject localJSONObject = paramq.getJSONObject(paramInt1);
            sg localsg = new sg();
            localsg.bHD = localJSONObject.getString("title");
            localsg.rlz = localJSONObject.getInt("fee");
            this.lRj.add(localsg);
            paramInt1 += 1;
          }
        }
        paramInt1 = paramInt3;
      }
      catch (Exception paramq) {}
    }
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
    x.d("MicroMsg.NetSceneMallGetProductDiscount", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.diJ.a(paramInt2, paramInt1, paramq, this);
  }
  
  public final int getType()
  {
    return 579;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/product/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */