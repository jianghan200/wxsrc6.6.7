package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.plugin.wallet_core.model.ab;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.w;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class y
  extends i
{
  public String ced;
  public String cee;
  public String cef;
  public String ceg;
  public String ceh;
  public String cei = "";
  public int cej = 0;
  public String cek = "";
  public String cel = "";
  public String cem = "";
  public String cen = "";
  public String ceo = "";
  public LinkedList<String> cep = new LinkedList();
  public ECardInfo ceq;
  public Map<String, String> lKr = new HashMap();
  public Map<String, String> peZ;
  public int scene = 0;
  public String title = "";
  
  public y()
  {
    this(null, 0);
  }
  
  public y(String paramString, int paramInt)
  {
    this.scene = paramInt;
    this.lKr.put("req_key", paramString);
    this.lKr.put("bind_query_scene", String.valueOf(paramInt));
    paramString = (k)g.l(k.class);
    this.lKr.put("is_root", "0");
    if (paramString != null)
    {
      this.lKr.put("is_device_open_touch", "1");
      paramString = paramString.aNq();
      if (paramString != null) {
        this.lKr.putAll(paramString);
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is true");
    }
    for (;;)
    {
      F(this.lKr);
      this.peZ = new HashMap();
      g.Ek();
      paramString = (String)g.Ei().DT().get(196612, null);
      g.Ek();
      String str = (String)g.Ei().DT().get(196613, null);
      this.peZ.put("bind_serial", paramString);
      this.peZ.put("last_bind_serial", str);
      aC(this.peZ);
      return;
      this.lKr.put("is_device_open_touch", "0");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is false");
    }
  }
  
  public int If()
  {
    return 1501;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramInt != 0) {
      return;
    }
    if (paramJSONObject.has("real_name_info"))
    {
      paramString = paramJSONObject.optJSONObject("real_name_info");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "get real_name_info %s", new Object[] { paramString.toString() });
      this.ced = paramString.optString("guide_flag");
      this.cee = paramString.optString("guide_wording");
      this.cef = paramString.optString("left_button_wording");
      this.ceg = paramString.optString("right_button_wording");
      this.ceh = paramString.optString("upload_credit_url");
      this.cei = paramString.optString("done_button_wording");
      this.cej = paramString.optInt("is_show_protocol", 0);
      this.cek = paramString.optString("left_protocol_wording");
      this.cel = paramString.optString("new_upload_credit_url");
      this.cem = paramString.optString("protocol_url");
      this.cen = paramString.optString("right_protocol_wording");
      this.ceo = paramString.optString("subtitle");
      this.title = paramString.optString("title");
      JSONArray localJSONArray = paramString.optJSONArray("upload_reasons");
      this.cep.clear();
      if (localJSONArray != null)
      {
        paramInt = 0;
        while (paramInt < localJSONArray.length())
        {
          this.cep.add(localJSONArray.optString(paramInt));
          paramInt += 1;
        }
      }
      if (paramString.has("ecard_info"))
      {
        paramString = paramString.optJSONObject("ecard_info");
        this.ceq = new ECardInfo();
        this.ceq.title = this.title;
        this.ceq.pnf = new ArrayList(this.cep);
        this.ceq.pnh = this.cem;
        this.ceq.pni = this.cek;
        this.ceq.pnj = this.cen;
        this.ceq.png = this.cei;
        this.ceq.pmY = paramString.optInt("ecard_open_scene", 0);
        this.ceq.bJV = paramString.optString("ecard_type", "");
        this.ceq.pmZ = paramString.optInt("show_check_box", 0);
        this.ceq.pna = paramString.optInt("check_box_selected", 0);
        this.ceq.pnb = paramString.optString("check_box_left_wording", "");
        this.ceq.pnc = paramString.optString("check_box_right_wording", "");
        this.ceq.pnd = paramString.optString("check_box_url", "");
        this.ceq.pne = paramString.optInt("is_upload_credid", 0);
        this.ceq.ceh = paramString.optString("upload_credit_url", "");
      }
    }
    if ((paramJSONObject.has("paymenu_array")) && (this.scene == 1))
    {
      paramString = paramJSONObject.optJSONArray("paymenu_array");
      if (paramString != null) {
        w.OY(paramString.toString());
      }
    }
    long l = paramJSONObject.optLong("time_stamp");
    if (l > 0L)
    {
      com.tencent.mm.wallet_core.c.o.setTimeStamp(String.valueOf(l));
      ab.a(paramJSONObject, this.scene);
      if ((ab.zm(this.scene)) || (this.scene == 1))
      {
        paramString = paramJSONObject.optJSONObject("bind_card_menu");
        if (paramString == null) {
          break label650;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneTenpayQueryBindBankcard", "bind card menu: %s", new Object[] { paramString.toString() });
        g.Ek();
        g.Ei().DT().a(aa.a.sYt, paramString.toString());
      }
    }
    for (;;)
    {
      paramString = (k)g.l(k.class);
      if (paramString == null) {
        break label671;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "IFingerPrintMgr is not null");
      paramString.aNj();
      paramString.eZ(com.tencent.mm.plugin.wallet_core.model.o.bOW().bPu());
      return;
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneTenpayQueryBindBankcard", "no time_stamp in bindquerynew.");
      break;
      label650:
      g.Ek();
      g.Ei().DT().a(aa.a.sYt, "");
    }
    label671:
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneTenpayQueryBindBankcard", "IFingerPrintMgr is null");
  }
  
  public int aBO()
  {
    return 72;
  }
  
  public String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/bindquerynew";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */