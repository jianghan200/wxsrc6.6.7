package com.tencent.mm.plugin.offline.a;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class o
  extends i
{
  public o(int paramInt1, int paramInt2, int paramInt3)
  {
    this(paramInt1, paramInt2, 0, paramInt3, "");
  }
  
  private o(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("residue_num", String.valueOf(paramInt1));
    localHashMap.put("entry_scene", String.valueOf(paramInt2));
    localHashMap.put("is_snapshot", String.valueOf(paramInt3));
    localHashMap.put("user_view_digit", String.valueOf(paramInt4));
    StringBuilder localStringBuilder = new StringBuilder();
    g.Ek();
    localHashMap.put("code_ver", g.Ei().DT().get(aa.a.sOz, ""));
    localHashMap.put("card_id", a.htC);
    localHashMap.put("user_card_id", a.lMQ);
    localHashMap.put("card_code", a.lMR);
    localHashMap.put("ext_business_attach", paramString);
    F(localHashMap);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayWxOfflineShowCode", "hy: residue_num == %d, entryscene = %d,is_snapshot = %d, user_view_digit: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneTenpayWxOfflineShowCode", "card_id=%s,  user_card_id=%s,  card_code:%s ", new Object[] { a.htC, a.lMQ, a.lMR });
  }
  
  public o(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    this(paramInt1, paramInt2, paramInt3, 0, paramString);
  }
  
  public final int If()
  {
    return 572;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject) {}
  
  public final int aBO()
  {
    return 102;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlineshowcode";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/offline/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */