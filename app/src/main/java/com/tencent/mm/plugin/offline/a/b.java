package com.tencent.mm.plugin.offline.a;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends i
{
  public String TAG = "MicroMsg.NetSceneOfflineAckMsg";
  
  public b(boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("ack_key", a.blW());
    localHashMap.put("req_key", a.blX());
    localHashMap.put("paymsg_type", a.blY());
    localHashMap.put("transactionid", a.blZ());
    localHashMap.put("network", a.getNetworkType(ad.getContext()));
    if (k.lJx)
    {
      str = "1";
      localHashMap.put("processed", str);
      if (!a.bma()) {
        break label203;
      }
      str = "1";
      label135:
      localHashMap.put("is_pos_enabled", str);
      if (!paramBoolean) {
        break label209;
      }
    }
    label203:
    label209:
    for (String str = "pull";; str = "push")
    {
      localHashMap.put("channel", str);
      localHashMap.put("timestamp", System.currentTimeMillis() / 1000L);
      F(localHashMap);
      return;
      str = "0";
      break;
      str = "0";
      break label135;
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramInt == 0)
    {
      com.tencent.mm.sdk.platformtools.x.v(this.TAG, "response ok");
      h.mEJ.a(135L, 68L, 1L, true);
      paramInt = paramJSONObject.optInt("poll_time") * 1000;
      if (paramInt > 0)
      {
        g.Ek();
        g.Ei().DT().a(aa.a.sXl, Integer.valueOf(paramInt));
      }
      return;
    }
    com.tencent.mm.sdk.platformtools.x.v(this.TAG, "response fail");
    h.mEJ.a(135L, 69L, 1L, true);
  }
  
  public final int aBO()
  {
    return 1230;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlineackmsg";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/offline/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */