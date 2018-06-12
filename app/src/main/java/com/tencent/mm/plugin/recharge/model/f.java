package com.tencent.mm.plugin.recharge.model;

import android.content.Context;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet.a.d;
import com.tencent.mm.plugin.wallet.a.m;
import com.tencent.mm.plugin.wallet.a.n;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.azc;
import com.tencent.mm.protocal.c.azd;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f
  extends l
  implements k
{
  public String Yy = "";
  public String appId = "";
  public int cmdId;
  public String desc = "";
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public String eTa = "";
  public int errCode = 0;
  public boolean moQ = false;
  public ArrayList<n> moR;
  public ArrayList<n> moS;
  public d moT;
  public d moU;
  public d moV;
  public d moW;
  public d moX;
  public m moY;
  public List<a> moZ;
  public boolean mpa = false;
  
  public f(String paramString)
  {
    this(paramString, 0);
  }
  
  public f(String paramString, int paramInt)
  {
    this.eTa = paramString;
    paramString = new b.a();
    paramString.dIG = new azc();
    paramString.dIH = new azd();
    paramString.uri = "/cgi-bin/mmpay-bin/paychargeproxy";
    paramString.dIF = 1571;
    paramString.dII = 0;
    paramString.dIJ = 0;
    this.diG = paramString.KT();
    paramString = (azc)this.diG.dID.dIL;
    paramString.rtM = paramInt;
    this.cmdId = paramInt;
    x.i("MicroMsg.NetScenePayChargeProxy", "cmdId: %d", new Object[] { Integer.valueOf(paramInt) });
    if (!bi.oW(this.eTa))
    {
      x.i("MicroMsg.NetScenePayChargeProxy", "hy: requesting phone num: %s", new Object[] { this.eTa });
      paramString.sbT = String.format("phone=%s", new Object[] { this.eTa });
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetScenePayChargeProxy", "hy: NetScenePayChargeProxy end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.errCode = paramInt3;
    Object localObject1;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (azd)((b)paramq).dIE.dIL;
      Object localObject2;
      try
      {
        paramq = new JSONObject(paramq.sbU);
        x.d("MicroMsg.NetScenePayChargeProxy", "tofutest: json: %s", new Object[] { paramq.toString() });
        this.appId = paramq.optString("appId");
        this.errCode = paramq.optInt("errCode", -1);
        this.Yy = paramq.optString("errMsg", ad.getContext().getString(a.i.wallet_json_err));
        if (this.errCode < 0) {}
        for (this.moQ = true;; this.moQ = false)
        {
          this.desc = paramq.optString("desc");
          paramArrayOfByte = paramq.optJSONArray("productList");
          if (paramArrayOfByte == null) {
            break label515;
          }
          this.moR = new ArrayList();
          this.moS = new ArrayList();
          paramInt1 = 0;
          if (paramInt1 >= paramArrayOfByte.length()) {
            break label525;
          }
          localObject1 = paramArrayOfByte.getJSONObject(paramInt1);
          localObject2 = new n();
          ((n)localObject2).desc = ((JSONObject)localObject1).optString("desc", "");
          ((n)localObject2).id = ((JSONObject)localObject1).optString("id", "");
          ((n)localObject2).name = ((JSONObject)localObject1).optString("name", "");
          ((n)localObject2).status = ((JSONObject)localObject1).optInt("status", 0);
          ((n)localObject2).url = ((JSONObject)localObject1).optString("url", "");
          ((n)localObject2).type = ((JSONObject)localObject1).optInt("type");
          ((n)localObject2).peu = ((JSONObject)localObject1).optString("typeName");
          ((n)localObject2).pew = ((JSONObject)localObject1).optString("isColor", "0");
          ((n)localObject2).pex = ((JSONObject)localObject1).optString("colorCode", "0");
          ((n)localObject2).pey = ((JSONObject)localObject1).optInt("isReConfirm", 0);
          ((n)localObject2).pdR = ((JSONObject)localObject1).optString("weappID");
          ((n)localObject2).dzE = ((JSONObject)localObject1).optString("weappPath");
          ((n)localObject2).pez = ((JSONObject)localObject1).optInt("isRecommend", 0);
          if (((n)localObject2).type != 1) {
            break;
          }
          this.moR.add(localObject2);
          break label1506;
        }
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
      catch (Exception paramq)
      {
        x.e("MicroMsg.NetScenePayChargeProxy", "hy: exception occurred when parsing json: %s", new Object[] { paramq.toString() });
        this.moQ = true;
        this.Yy = ad.getContext().getString(a.i.wallet_json_err);
      }
      label474:
      return;
      ((n)localObject2).pev = ((JSONObject)localObject1).optString("productAttr");
      this.moS.add(localObject2);
      break label1506;
      label515:
      this.moR = null;
      this.moS = null;
      label525:
      Object localObject3 = paramq.optJSONObject("weSim");
      if (localObject3 != null)
      {
        paramArrayOfByte = ((JSONObject)localObject3).optString("url");
        localObject1 = ((JSONObject)localObject3).optString("name");
        localObject2 = ((JSONObject)localObject3).optString("weappID");
        localObject3 = ((JSONObject)localObject3).optString("weappPath");
        if (bi.oW((String)localObject1))
        {
          x.w("MicroMsg.NetScenePayChargeProxy", "tf: weSim is missing");
          this.moW = null;
        }
      }
      else
      {
        label600:
        localObject3 = paramq.optJSONObject("wxRemind");
        if (localObject3 != null)
        {
          paramArrayOfByte = ((JSONObject)localObject3).optString("url");
          localObject1 = ((JSONObject)localObject3).optString("name");
          localObject2 = ((JSONObject)localObject3).optString("weappID");
          localObject3 = ((JSONObject)localObject3).optString("weappPath");
          if (!bi.oW((String)localObject1)) {
            break label1118;
          }
          x.w("MicroMsg.NetScenePayChargeProxy", "hy: remind unicom unnecessary element missing");
        }
        this.moT = null;
        label675:
        localObject3 = paramq.optJSONObject("wxCard");
        if (localObject3 != null)
        {
          paramArrayOfByte = ((JSONObject)localObject3).optString("url");
          localObject1 = ((JSONObject)localObject3).optString("name");
          localObject2 = ((JSONObject)localObject3).optString("weappID");
          localObject3 = ((JSONObject)localObject3).optString("weappPath");
          if (!bi.oW((String)localObject1)) {
            break label1168;
          }
          x.w("MicroMsg.NetScenePayChargeProxy", "hy: phone card necessary element missing");
        }
        this.moU = null;
        label750:
        localObject3 = paramq.optJSONObject("wxWt");
        if (localObject3 != null)
        {
          paramArrayOfByte = ((JSONObject)localObject3).optString("url");
          localObject1 = ((JSONObject)localObject3).optString("name");
          localObject2 = ((JSONObject)localObject3).optString("weappID");
          localObject3 = ((JSONObject)localObject3).optString("weappPath");
          if (!bi.oW((String)localObject1)) {
            break label1218;
          }
          x.w("MicroMsg.NetScenePayChargeProxy", "hy: phone hall necessary element missing");
        }
        this.moV = null;
        label825:
        paramArrayOfByte = paramq.optJSONObject("banner");
        if (paramArrayOfByte == null) {
          break label1268;
        }
        this.moY = new m();
        this.moY.id = paramArrayOfByte.getInt("id");
        this.moY.name = paramArrayOfByte.optString("name");
        this.moY.url = paramArrayOfByte.optString("url");
        this.moY.pdR = paramArrayOfByte.optString("weappID");
        this.moY.dzE = paramArrayOfByte.optString("weappPath");
        label924:
        localObject3 = paramq.optJSONObject("headEnter");
        if (localObject3 != null)
        {
          paramArrayOfByte = ((JSONObject)localObject3).optString("name");
          localObject1 = ((JSONObject)localObject3).optString("url");
          localObject2 = ((JSONObject)localObject3).optString("weappID");
          localObject3 = ((JSONObject)localObject3).optString("weappPath");
          if (!bi.oW(paramArrayOfByte)) {
            break label1276;
          }
          x.w("MicroMsg.NetScenePayChargeProxy", "tf: headEnter is missing");
        }
        this.moX = null;
      }
      for (;;)
      {
        paramq = paramq.optJSONArray("numberList");
        if (paramq == null) {
          break label1449;
        }
        if (bi.oW(this.eTa)) {
          this.mpa = true;
        }
        if (paramq.length() > 0) {
          break label1326;
        }
        x.w("MicroMsg.NetScenePayChargeProxy", "number length is short! %s", new Object[] { Integer.valueOf(paramq.length()) });
        this.moZ = null;
        break;
        this.moW = new d();
        this.moW.url = paramArrayOfByte;
        this.moW.name = ((String)localObject1);
        this.moW.pdR = ((String)localObject2);
        this.moW.dzE = ((String)localObject3);
        break label600;
        label1118:
        this.moT = new d();
        this.moT.url = paramArrayOfByte;
        this.moT.name = ((String)localObject1);
        this.moT.pdR = ((String)localObject2);
        this.moT.dzE = ((String)localObject3);
        break label675;
        label1168:
        this.moU = new d();
        this.moU.url = paramArrayOfByte;
        this.moU.name = ((String)localObject1);
        this.moU.pdR = ((String)localObject2);
        this.moU.dzE = ((String)localObject3);
        break label750;
        label1218:
        this.moV = new d();
        this.moV.url = paramArrayOfByte;
        this.moV.name = ((String)localObject1);
        this.moV.pdR = ((String)localObject2);
        this.moV.dzE = ((String)localObject3);
        break label825;
        label1268:
        this.moY = null;
        break label924;
        label1276:
        this.moX = new d();
        this.moX.name = paramArrayOfByte;
        this.moX.url = ((String)localObject1);
        this.moX.pdR = ((String)localObject2);
        this.moX.dzE = ((String)localObject3);
      }
      label1326:
      this.moZ = new ArrayList();
      paramInt1 = 0;
    }
    for (;;)
    {
      if (paramInt1 < paramq.length())
      {
        localObject1 = paramq.optJSONObject(paramInt1);
        if (localObject1 != null)
        {
          paramArrayOfByte = ((JSONObject)localObject1).optString("number");
          localObject1 = ((JSONObject)localObject1).optString("desc");
          if (!bi.oW(paramArrayOfByte))
          {
            paramArrayOfByte = new a(paramArrayOfByte, "", (String)localObject1, 2);
            this.moZ.add(paramArrayOfByte);
          }
        }
      }
      else
      {
        x.i("MicroMsg.NetScenePayChargeProxy", "number list: %s", new Object[] { Integer.valueOf(this.moZ.size()) });
        break label474;
        label1449:
        this.moZ = null;
        x.w("MicroMsg.NetScenePayChargeProxy", "empty numberList");
        break label474;
        this.moQ = true;
        paramq = paramString;
        if (bi.oW(paramString)) {
          paramq = ad.getContext().getString(a.i.wallet_data_err);
        }
        this.Yy = paramq;
        paramString = paramq;
        break label474;
        label1506:
        paramInt1 += 1;
        break;
      }
      paramInt1 += 1;
    }
  }
  
  public final int getType()
  {
    return 1571;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/recharge/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */