package com.tencent.mm.plugin.luckymoney.b;

import android.content.Context;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.g.a.pl;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.amq;
import com.tencent.mm.protocal.c.amr;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.wallet_core.c.m;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class q
  extends m
{
  com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public final void F(Map<String, String> paramMap)
  {
    Object localObject1 = com.tencent.mm.model.q.GF();
    g.Ek();
    localObject1 = ((i)g.l(i.class)).FR().Yg((String)localObject1);
    if (localObject1 != null)
    {
      paramMap.put("province", ((com.tencent.mm.storage.ab)localObject1).cla());
      paramMap.put("city", ((com.tencent.mm.storage.ab)localObject1).getCityCode());
    }
    if (this.diG == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).dIG = new amq();
      ((b.a)localObject1).dIH = new amr();
      ((b.a)localObject1).uri = aBL();
      ((b.a)localObject1).dIF = getType();
      ((b.a)localObject1).dII = 0;
      ((b.a)localObject1).dIJ = 0;
      this.diG = ((b.a)localObject1).KT();
      this.diG.dIU = true;
    }
    localObject1 = (amq)this.diG.dID.dIL;
    ((amq)localObject1).rPs = aBM();
    ((amq)localObject1).rPt = 1;
    Object[] arrayOfObject = paramMap.keySet().toArray();
    Arrays.sort(arrayOfObject);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    int k;
    for (int j = 0; i < arrayOfObject.length; j = k)
    {
      Object localObject2 = arrayOfObject[i];
      String str = (String)paramMap.get(localObject2);
      k = j;
      if (!bi.oW(str))
      {
        if (j != 0) {
          localStringBuilder.append("&");
        }
        localStringBuilder.append(localObject2);
        localStringBuilder.append("=");
        localStringBuilder.append(str);
        k = 1;
      }
      i += 1;
    }
    x.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + ((amq)localObject1).rPs + ", req = " + localStringBuilder.toString());
    paramMap = localStringBuilder.toString().getBytes();
    ((amq)localObject1).rPu = new bhy().bq(paramMap);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public abstract void a(int paramInt, String paramString, JSONObject paramJSONObject);
  
  public abstract String aBL();
  
  public int aBM()
  {
    return -1;
  }
  
  public final int baY()
  {
    return aBM();
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, com.tencent.mm.network.q paramq)
  {
    x.i("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + aBM() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    paramq = (amr)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    int i;
    int j;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      i = paramq.rPw;
      Object localObject = com.tencent.mm.platformtools.ab.b(paramq.rPv);
      if ((i == 0) && (!bi.oW((String)localObject)))
      {
        i = paramq.bJL;
        for (;;)
        {
          try
          {
            JSONObject localJSONObject = new JSONObject((String)localObject);
            j = localJSONObject.getInt("retcode");
            localObject = paramq.errorMsg;
            paramq = (com.tencent.mm.network.q)localObject;
            if (bi.oW((String)localObject)) {
              paramq = localJSONObject.optString("retmsg");
            }
            if (localJSONObject.has("showmess"))
            {
              x.i("MicroMsg.NetSceneLuckyMoneyBase", "has alert item");
              paramq = ae.P(localJSONObject);
              localObject = new pl();
              ((pl)localObject).can.cao = paramq;
              a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
              if (paramInt1 != 0) {
                x.e("MicroMsg.NetSceneLuckyMoneyBase", "Cmd : " + aBM() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
              }
              this.diJ.a(paramInt1, paramInt2, paramString, this);
              return;
            }
            if ((j != 0) || (i != 0)) {
              break;
            }
            a(j, paramq, localJSONObject);
            continue;
            paramString = ad.getContext().getString(a.i.wallet_data_err);
          }
          catch (Exception paramString)
          {
            x.printErrStackTrace("MicroMsg.NetSceneLuckyMoneyBase", paramString, "", new Object[0]);
            i = 2;
            j = 1000;
          }
          label330:
          paramInt1 = j;
          paramInt2 = i;
        }
        if (i != 0) {
          break label427;
        }
      }
    }
    label427:
    for (paramInt1 = 64536;; paramInt1 = i)
    {
      paramString = paramq;
      paramInt2 = paramInt1;
      paramInt1 = 1000;
      break;
      paramString = paramq.rPx;
      paramInt2 = 2;
      paramInt1 = 1000;
      break;
      paramString = bl.z(paramString, "e");
      j = paramInt1;
      i = paramInt2;
      if (paramString == null) {
        break label330;
      }
      x.d("MicroMsg.NetSceneLuckyMoneyBase", "CDN error!");
      paramString = (String)paramString.get(".e.Content");
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */