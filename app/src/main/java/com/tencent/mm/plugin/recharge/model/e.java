package com.tencent.mm.plugin.recharge.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.agc;
import com.tencent.mm.protocal.c.agd;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public ArrayList<MallRechargeProduct> moL = null;
  public String moM;
  public String moN;
  public String moO;
  public String moP;
  public String moy;
  
  public e(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new agc();
    ((b.a)localObject).dIH = new agd();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getpayfunctionproductlist";
    ((b.a)localObject).dIF = 496;
    ((b.a)localObject).dII = 228;
    ((b.a)localObject).dIJ = 1000000228;
    this.diG = ((b.a)localObject).KT();
    localObject = (agc)this.diG.dID.dIL;
    this.moy = paramString;
    ((agc)localObject).rDg = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetPayFunctionProductList", "errType " + paramInt2 + ", errCode " + paramInt3 + ", errMsg " + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (agd)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      paramArrayOfByte = paramq.rIN;
      x.d("MicroMsg.NetSceneGetPayFunctionProductList", "resp.ProductList " + paramArrayOfByte);
      if (bi.oW(paramArrayOfByte)) {}
    }
    try
    {
      paramArrayOfByte = new JSONObject(paramArrayOfByte);
      this.moL = b.a(this.moy, paramArrayOfByte.getJSONArray("pay_product_list"));
      if (bi.oW(paramq.rJR)) {}
    }
    catch (JSONException paramArrayOfByte)
    {
      try
      {
        paramq = new JSONObject(paramq.rJR);
        this.moM = paramq.optString("balance_link");
        this.moO = paramq.optString("recharge_link");
        this.moN = paramq.optString("balance_wording");
        this.moP = paramq.optString("recharge_wording");
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        paramArrayOfByte = paramArrayOfByte;
        x.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionProductList", paramArrayOfByte, "", new Object[0]);
      }
      catch (JSONException paramq)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionProductList", paramq, "", new Object[0]);
        }
      }
    }
  }
  
  public final int getType()
  {
    return 496;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/recharge/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */