package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.storage.aa.a;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.wallet_core.tenpay.model.i
{
  public d()
  {
    o.bPa().diF.fV("WalletBulletin", "delete from WalletBulletin");
    F(new HashMap());
  }
  
  public final int If()
  {
    return 1679;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetBannerInfo", "NetSceneGetBannerInfo errCode = " + paramInt + " " + paramJSONObject);
    if (paramInt == 0)
    {
      r.aj(paramJSONObject);
      long l = paramJSONObject.optLong("banner_update_interval", 0L);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetBannerInfo", "update_interval=" + l);
      g.Ek();
      g.Ei().DT().a(aa.a.sSq, Long.valueOf(l));
      paramString = paramJSONObject.optJSONObject("lbs_info");
      if (paramString != null)
      {
        JSONArray localJSONArray = paramString.optJSONArray("config_array");
        if ((localJSONArray != null) && (localJSONArray.length() > 0))
        {
          com.tencent.mm.plugin.wallet_core.model.i locali = com.tencent.mm.plugin.wallet_core.model.i.bOG();
          if (localJSONArray != null)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.GpsReportHelper", localJSONArray.toString());
            locali.pnZ = localJSONArray;
            g.Ek();
            g.Ei().DT().a(aa.a.sTh, localJSONArray.toString());
          }
        }
        g.Ek();
        g.Ei().DT().a(aa.a.sTi, paramString.optString("title"));
        g.Ek();
        g.Ei().DT().a(aa.a.sTj, paramString.optString("content"));
      }
      paramJSONObject = paramJSONObject.optJSONObject("realname_info");
      if (paramJSONObject != null)
      {
        paramString = paramJSONObject.optString("title");
        paramJSONObject = paramJSONObject.optString("balance_title");
        g.Ek();
        g.Ei().DT().a(aa.a.sTk, paramString);
        g.Ek();
        g.Ei().DT().a(aa.a.sTl, paramJSONObject);
      }
    }
  }
  
  public final int aBO()
  {
    return 1679;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/getbannerinfo";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */