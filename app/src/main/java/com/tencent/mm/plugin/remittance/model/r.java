package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.b.a.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class r
  extends a
{
  public long cfh;
  public String desc;
  public String hUA;
  public int hUB;
  public int hUw;
  public String hUx;
  public String hUy;
  public String hUz;
  public String mxw;
  public String mxx;
  public String mxy;
  
  public r(String paramString)
  {
    HashMap localHashMap = new HashMap();
    try
    {
      if (!bi.oW(paramString)) {
        localHashMap.put("qrcode_url", URLEncoder.encode(paramString, "UTF-8"));
      }
      F(localHashMap);
      x.i("MicroMsg.NetSceneH5F2fTransferScanQrCode", "qrcode_url: %s", new Object[] { paramString });
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferScanQrCode", localUnsupportedEncodingException, "", new Object[0]);
      }
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.mxw = paramJSONObject.optString("recv_username", "");
    this.hUA = paramJSONObject.optString("recv_realname", "");
    this.mxx = paramJSONObject.optString("recv_nickname", "");
    this.desc = paramJSONObject.optString("desc", "");
    this.cfh = paramJSONObject.optLong("amount", 0L);
    this.hUB = paramJSONObject.optInt("set_amount", 0);
    this.hUw = paramJSONObject.optInt("currency", 0);
    this.hUx = paramJSONObject.optString("currencyunit", "");
    this.mxy = paramJSONObject.optString("qrcodeid", "");
    this.hUy = paramJSONObject.optString("notice", "");
    this.hUz = paramJSONObject.optString("notice_url", "");
    x.i("MicroMsg.NetSceneH5F2fTransferScanQrCode", "recv_username: %s, recv_nickname: %s, desc: %s, amount: %s, setAmount: %s, currencyunit: %s", new Object[] { this.mxw, this.mxx, this.desc, Long.valueOf(this.cfh), Integer.valueOf(this.hUB), this.hUx });
    x.d("MicroMsg.NetSceneH5F2fTransferScanQrCode", "recv_realname: %s", new Object[] { this.hUA });
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/h5f2ftransferscanqrcode";
  }
  
  public final int aBM()
  {
    return 1301;
  }
  
  public final int getType()
  {
    return 1301;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */