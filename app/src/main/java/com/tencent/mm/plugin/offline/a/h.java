package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bsq;
import com.tencent.mm.protocal.c.bsr;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tenpay.android.wechat.TenpayUtil;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class h
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public final void F(Map<String, String> paramMap)
  {
    if (!f.cfE()) {
      paramMap.put("jsapi_reqkey", f.cfF());
    }
    if (this.diG == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).dIG = new bsq();
      ((b.a)localObject1).dIH = new bsr();
      localObject2 = getUri();
      i = If();
      ((b.a)localObject1).uri = ((String)localObject2);
      ((b.a)localObject1).dIF = i;
      ((b.a)localObject1).dII = 185;
      ((b.a)localObject1).dIJ = 1000000185;
      this.diG = ((b.a)localObject1).KT();
    }
    Object localObject1 = (bsq)this.diG.dID.dIL;
    ((bsq)localObject1).rPs = aBO();
    ((bsq)localObject1).rPt = 1;
    Object localObject2 = paramMap.keySet().toArray();
    Arrays.sort((Object[])localObject2);
    Object localObject3 = new StringBuilder();
    int i = 0;
    String str1;
    int k;
    for (int j = 0; i < localObject2.length; j = k)
    {
      localObject4 = localObject2[i];
      str1 = (String)paramMap.get(localObject4);
      k = j;
      if (!bi.oW(str1))
      {
        if (j != 0) {
          ((StringBuilder)localObject3).append("&");
        }
        ((StringBuilder)localObject3).append(localObject4);
        ((StringBuilder)localObject3).append("=");
        ((StringBuilder)localObject3).append(str1);
        k = 1;
      }
      i += 1;
    }
    localObject3 = TenpayUtil.signWith3Des(((StringBuilder)localObject3).toString());
    Object localObject4 = new StringBuilder();
    i = 0;
    j = 0;
    if (j < localObject2.length)
    {
      str1 = localObject2[j];
      String str2 = (String)paramMap.get(str1);
      if (bi.oW(str2)) {
        break label431;
      }
      if (i != 0) {
        ((StringBuilder)localObject4).append("&");
      }
      ((StringBuilder)localObject4).append(str1);
      ((StringBuilder)localObject4).append("=");
      ((StringBuilder)localObject4).append(p.encode(str2));
      i = 1;
    }
    label431:
    for (;;)
    {
      j += 1;
      break;
      if (i != 0) {}
      for (paramMap = "&";; paramMap = "")
      {
        ((StringBuilder)localObject4).append(paramMap);
        ((StringBuilder)localObject4).append("WCPaySign");
        ((StringBuilder)localObject4).append("=");
        ((StringBuilder)localObject4).append((String)localObject3);
        paramMap = ((StringBuilder)localObject4).toString().getBytes();
        ((bsq)localObject1).rPu = new bhy().bq(paramMap);
        return;
      }
    }
  }
  
  public int If()
  {
    return 385;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + aBO() + ", errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    bsr localbsr = (bsr)((b)paramq).dIE.dIL;
    int i;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      if (localbsr.rPw == 0)
      {
        paramq = ab.b(localbsr.rPv);
        try
        {
          JSONObject localJSONObject = new JSONObject(paramq);
          paramInt1 = localJSONObject.getInt("retcode");
          paramArrayOfByte = localbsr.scT;
          paramq = paramArrayOfByte;
          if (bi.oW(paramArrayOfByte)) {
            paramq = localJSONObject.optString("retmsg");
          }
          i = localbsr.scS;
          if ((paramInt1 != 0) || (i != 0)) {
            break label297;
          }
          a(paramInt1, paramq, localJSONObject);
          i = paramInt3;
          paramInt1 = paramInt2;
        }
        catch (Exception paramString)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.NetSceneTenpayOfflineBase", paramString, "", new Object[0]);
            paramString = ad.getContext().getString(a.i.wallet_data_err);
            i = 2;
            paramInt1 = 1000;
          }
        }
        if (paramInt1 != 0) {
          x.e("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + aBO() + ", errType = " + paramInt1 + ", errCode = " + i + ", errMsg = " + paramString);
        }
        this.diJ.a(paramInt1, i, paramString, this);
        x.d("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + aBO() + ", errType = " + paramInt1 + ", errCode = " + i + ", errMsg = " + paramString);
        return;
        label297:
        x.i("MicroMsg.NetSceneTenpayOfflineBase", "ErrCode tenpayErrType : " + i);
        if (i != 0) {
          break label468;
        }
        i = 64536;
      }
    }
    label468:
    for (;;)
    {
      x.d("MicroMsg.NetSceneTenpayOfflineBase", "ErrCode errMsg : " + paramq);
      paramString = paramq;
      paramInt1 = 1000;
      break;
      paramString = localbsr.rPx;
      i = 2;
      paramInt1 = 1000;
      break;
      paramq = bl.z(paramString, "e");
      paramInt1 = paramInt2;
      i = paramInt3;
      if (paramq == null) {
        break;
      }
      x.d("MicroMsg.NetSceneTenpayOfflineBase", "CDN error!");
      paramString = (String)paramq.get(".e.Content");
      paramInt1 = paramInt2;
      i = paramInt3;
      break;
    }
  }
  
  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);
  
  public abstract int aBO();
  
  public final int getType()
  {
    return 385;
  }
  
  public String getUri()
  {
    return "/cgi-bin/micromsg-bin/tenpay";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/offline/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */