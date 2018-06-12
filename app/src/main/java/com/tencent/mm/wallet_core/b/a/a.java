package com.tencent.mm.wallet_core.b.a;

import android.content.Context;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.amq;
import com.tencent.mm.protocal.c.amr;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class a
  extends m
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public final void F(Map<String, String> paramMap)
  {
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
    Object localObject1 = (amq)this.diG.dID.dIL;
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
    x.i("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + ((amq)localObject1).rPs + ", req = " + localStringBuilder.toString());
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
  
  public abstract int aBM();
  
  public boolean aBN()
  {
    return false;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + aBM() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString + " " + getType());
    amr localamr = (amr)((b)paramq).dIE.dIL;
    int i;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      i = localamr.rPw;
      paramq = ab.b(localamr.rPv);
      if ((i == 0) && (!bi.oW(paramq))) {
        i = localamr.bJL;
      }
    }
    for (;;)
    {
      int j;
      try
      {
        localJSONObject = new JSONObject(paramq);
        j = localJSONObject.getInt("retcode");
        String str = localJSONObject.optString("retmsg");
        paramq = str;
        if (!bi.oW(str)) {
          break label385;
        }
        paramq = localamr.errorMsg;
      }
      catch (Exception paramString)
      {
        JSONObject localJSONObject;
        x.printErrStackTrace("MiroMsg.NetSceneTenpayH5TransferBase", paramString, "", new Object[0]);
        i = 2;
        j = 1000;
      }
      if (aBN())
      {
        a(j, paramq, localJSONObject);
        if (paramInt1 != 0) {
          x.e("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + aBM() + ", errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
        }
        this.diJ.a(paramInt1, paramInt2, paramString, this);
        return;
      }
      if (i == 0)
      {
        paramInt1 = 64536;
        paramString = paramq;
        paramInt2 = paramInt1;
        paramInt1 = 1000;
        continue;
        do
        {
          paramString = ad.getContext().getString(a.i.wallet_data_err);
          paramInt1 = j;
          paramInt2 = i;
          break;
          paramString = localamr.rPx;
          paramInt2 = 2;
          paramInt1 = 1000;
          break;
          paramString = bl.z(paramString, "e");
          j = paramInt1;
          i = paramInt2;
        } while (paramString == null);
        x.d("MiroMsg.NetSceneTenpayH5TransferBase", "CDN error!");
        paramString = (String)paramString.get(".e.Content");
      }
      else
      {
        paramInt1 = i;
        continue;
        label385:
        if (j == 0) {
          if (i == 0) {}
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/wallet_core/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */