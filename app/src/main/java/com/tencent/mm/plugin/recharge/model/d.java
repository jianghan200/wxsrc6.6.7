package com.tencent.mm.plugin.recharge.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.protocal.c.aev;
import com.tencent.mm.protocal.c.aew;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends l
  implements k
{
  public com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String eNQ;
  public int moF;
  public MallRechargeProduct moI = null;
  public List<MallRechargeProduct> moJ = null;
  public String moK;
  public String moy;
  public String moz = null;
  
  public d(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.moy = paramString1;
    this.moF = paramInt;
    this.eNQ = paramString5;
    this.moK = paramString2;
    paramString5 = new b.a();
    paramString5.dIG = new aev();
    paramString5.dIH = new aew();
    paramString5.uri = "/cgi-bin/micromsg-bin/getlatestpayproductinfo";
    paramString5.dIF = 497;
    paramString5.dII = 229;
    paramString5.dIJ = 1000000229;
    this.diG = paramString5.KT();
    paramString5 = (aev)this.diG.dID.dIL;
    paramString5.rDg = paramString1;
    paramString5.rDh = paramString3;
    paramString5.rIL = paramString2;
    paramString5.rDi = paramString4;
    paramString5.rwj = c.bPK().Pe(paramString1);
    x.d("MicroMsg.NetSceneGetLatestPayProductInfo", String.format("funcId:%s, appId:%s, productId:%s, remark:%s", new Object[] { paramString1, paramString3, paramString2, paramString4 }));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetLatestPayProductInfo", "errCode " + paramInt3 + ", errMsg " + paramString);
    paramArrayOfByte = (aew)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    x.d("MicroMsg.NetSceneGetLatestPayProductInfo", "resp.OurterRemark " + paramArrayOfByte.rDl);
    paramq = paramArrayOfByte.rDl;
    this.moz = "";
    if (!bi.oW(paramq))
    {
      paramq = paramq.split("&");
      if ((paramq != null) && (paramq.length > 0))
      {
        paramInt1 = 1;
        int i = 0;
        if (i < paramq.length)
        {
          String[] arrayOfString = paramq[i].split("=");
          int j = paramInt1;
          if (arrayOfString.length == 2)
          {
            if (paramInt1 != 0) {
              break label224;
            }
            this.moz += " ";
          }
          for (;;)
          {
            this.moz += arrayOfString[1];
            j = paramInt1;
            i += 1;
            paramInt1 = j;
            break;
            label224:
            paramInt1 = 0;
          }
        }
      }
    }
    if (!bi.oW(paramArrayOfByte.rIN)) {}
    try
    {
      paramq = new JSONObject(paramArrayOfByte.rIN);
      this.moJ = b.a(this.moy, paramq.optJSONArray("product_info"));
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        paramq = paramArrayOfByte.rIM;
        x.d("MicroMsg.NetSceneGetLatestPayProductInfo", "resp.Product " + paramq);
        if (bi.oW(paramq)) {}
      }
    }
    catch (JSONException paramq)
    {
      try
      {
        this.moI = b.d(this.moy, new JSONObject(paramq));
        this.moI.moz = this.moz;
        x.d("MicroMsg.NetSceneGetLatestPayProductInfo", String.format("OutErrCode : %d ,OutErrMsg : %s , WxErrCode : %d , WxErrMsg : %s", new Object[] { Integer.valueOf(paramArrayOfByte.rDj), paramArrayOfByte.rDk, Integer.valueOf(paramArrayOfByte.rDm), paramArrayOfByte.rDn }));
        paramInt1 = paramInt3;
        if (paramInt3 == 0)
        {
          if (paramArrayOfByte.rDm != 0) {
            paramInt1 = paramArrayOfByte.rDm;
          }
        }
        else
        {
          paramq = paramString;
          if (bi.oW(paramString))
          {
            if (bi.oW(paramArrayOfByte.rDn)) {
              break label510;
            }
            paramq = paramArrayOfByte.rDn;
          }
          this.diJ.a(paramInt2, paramInt1, paramq, this);
          return;
          paramq = paramq;
          x.printErrStackTrace("MicroMsg.NetSceneGetLatestPayProductInfo", paramq, "", new Object[0]);
        }
      }
      catch (JSONException paramq)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.NetSceneGetLatestPayProductInfo", paramq, "", new Object[0]);
          continue;
          paramInt1 = paramArrayOfByte.rDj;
          continue;
          label510:
          paramq = paramArrayOfByte.rDk;
        }
      }
    }
  }
  
  public final int getType()
  {
    return 497;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/recharge/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */