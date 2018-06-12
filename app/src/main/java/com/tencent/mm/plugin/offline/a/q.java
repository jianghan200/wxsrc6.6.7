package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.d;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.Map;
import org.json.JSONObject;

public final class q
  extends i
{
  public n lKs;
  public y lKt;
  public com.tencent.mm.wallet_core.c.c lKu;
  public com.tencent.mm.wallet_core.c.c lKv;
  
  public q(int paramInt)
  {
    this.lKs = new n(System.currentTimeMillis(), paramInt);
    F(this.lKs.lKr);
    this.lKt = new y(null, 8);
    aB(this.lKt.lKr);
    aC(this.lKt.peZ);
  }
  
  private static com.tencent.mm.wallet_core.c.c R(JSONObject paramJSONObject)
  {
    com.tencent.mm.wallet_core.c.c localc = new com.tencent.mm.wallet_core.c.c();
    localc.Yy = ad.getContext().getString(a.i.wallet_data_err);
    String str = ad.getContext().getString(a.i.wallet_data_err);
    try
    {
      i = paramJSONObject.getInt("retcode");
      paramJSONObject = paramJSONObject.optString("retmsg");
      if (i != 0)
      {
        x.w("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: resolve busi error: retCode is error");
        if (i != 55447)
        {
          localc.e(1000, i, paramJSONObject, 2);
          return localc;
        }
      }
    }
    catch (Exception paramJSONObject)
    {
      for (;;)
      {
        x.w("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: json resolve error: error when resolving error code : " + paramJSONObject.toString());
        paramJSONObject = str;
        int i = 55447;
      }
      localc.e(1000, 2, paramJSONObject, 2);
      return localc;
    }
    x.i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: all's OK");
    return localc;
  }
  
  public static boolean isEnabled()
  {
    boolean bool2 = false;
    Object localObject = com.tencent.mm.model.c.c.Jx().fJ("100337");
    boolean bool1 = bool2;
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).ckq();
      bool1 = bool2;
      if (((Map)localObject).containsKey("enabled"))
      {
        bool1 = bool2;
        if ("1".equals(((Map)localObject).get("enabled"))) {
          bool1 = true;
        }
      }
    }
    x.v("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "isUserBindQueryEnabled: " + bool1);
    return bool1;
  }
  
  public final int If()
  {
    return 1742;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramInt != 0) {}
    do
    {
      return;
      paramString = paramJSONObject.optJSONObject("queryuser_resp");
      this.lKu = R(paramString);
      this.lKs.a(this.lKu.errCode, this.lKu.Yy, paramString);
      paramJSONObject = paramJSONObject.optJSONObject("bindquerynew_resp");
      this.lKv = R(paramJSONObject);
      this.lKt.a(this.lKv.errCode, this.lKv.Yy, paramJSONObject);
      paramString = paramString.optString("card_list");
    } while (paramString == null);
    a.Jb(paramString);
  }
  
  public final int aBO()
  {
    return 1742;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlineuserbindquery";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/offline/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */