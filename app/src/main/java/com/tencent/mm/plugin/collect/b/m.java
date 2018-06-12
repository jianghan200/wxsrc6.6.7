package com.tencent.mm.plugin.collect.b;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.b.a.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m
  extends a
{
  public long cfh;
  public String desc;
  public String hUA;
  public int hUB;
  public int hUm;
  public String hUn;
  public String hUo;
  public int hUp;
  public String hUq;
  public String hUr;
  public String hUs;
  public String hUt;
  public String hUu;
  public String hUv;
  public int hUw;
  public String hUx;
  public String hUy;
  public String hUz;
  
  public m(int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("set_amount", "0");
    localHashMap.put("wallet_type", String.valueOf(paramInt));
    F(localHashMap);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "setAmount: %s, walletType: %s", new Object[] { Integer.valueOf(0), Integer.valueOf(paramInt) });
  }
  
  public m(long paramLong, String paramString, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("amount", String.valueOf(paramLong));
    localHashMap.put("set_amount", "1");
    try
    {
      if (!bi.oW(paramString)) {
        localHashMap.put("desc", URLEncoder.encode(paramString, "UTF-8"));
      }
      localHashMap.put("wallet_type", String.valueOf(paramInt));
      F(localHashMap);
      this.cfh = paramLong;
      this.desc = paramString;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "amount: %d, setAmount: %s, desc: %s, walletType: %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(1), paramString, Integer.valueOf(paramInt) });
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferGetQrCode", localUnsupportedEncodingException, "", new Object[0]);
      }
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.hUm = paramJSONObject.optInt("retcode", 0);
    this.hUn = paramJSONObject.optString("retmsg", "");
    this.hUo = paramJSONObject.optString("qrcode_url", "");
    this.hUp = paramJSONObject.optInt("alert_type", 0);
    this.hUq = paramJSONObject.optString("alert_title", "");
    this.hUr = paramJSONObject.optString("left_button_text", "");
    this.hUs = paramJSONObject.optString("right_button_text", "");
    this.hUt = paramJSONObject.optString("right_button_url", "");
    this.hUu = paramJSONObject.optString("bottom_text", "");
    this.hUv = paramJSONObject.optString("bottom_url", "");
    this.hUw = paramJSONObject.optInt("currency", 0);
    this.hUx = paramJSONObject.optString("currencyunit", "");
    this.hUy = paramJSONObject.optString("notice", "");
    this.hUz = paramJSONObject.optString("notice_url", "");
    this.hUA = paramJSONObject.optString("recv_realname", "");
    this.hUB = paramJSONObject.optInt("set_amount", 0);
    if (this.hUB == 0)
    {
      g.Ek();
      g.Ei().DT().a(aa.a.sXo, this.hUo);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "set payurl: %s", new Object[] { this.hUo });
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneH5F2fTransferGetQrCode", "url: %s, currency: %s", new Object[] { this.hUo, Integer.valueOf(this.hUw) });
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/h5f2ftransfergetqrcode";
  }
  
  public final int aBM()
  {
    return 1335;
  }
  
  public final boolean aBN()
  {
    return true;
  }
  
  public final int getType()
  {
    return 1335;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/collect/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */