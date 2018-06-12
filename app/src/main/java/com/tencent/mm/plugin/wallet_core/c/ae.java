package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.protocal.c.auq;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.json.JSONObject;

public final class ae
  extends com.tencent.mm.wallet_core.tenpay.model.i
{
  private long eiD;
  public String pjJ;
  public String pjK;
  public String pjL;
  public String pjM;
  public String pjN;
  public int pjO;
  public int pjP;
  
  public ae()
  {
    F(null);
  }
  
  public static boolean a(boolean paramBoolean, com.tencent.mm.wallet_core.d.i parami)
  {
    com.tencent.mm.kernel.g.Ek();
    long l = ((Long)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sVl, Long.valueOf(0L))).longValue();
    if ((paramBoolean) || (l < System.currentTimeMillis()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTransferWording", "do scene: %d, force: %B", new Object[] { Long.valueOf(l), Boolean.valueOf(paramBoolean) });
      if (parami != null) {
        parami.a(new ae(), false, 1);
      }
      for (;;)
      {
        return true;
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a(new ae(), 0);
      }
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneTransferWording", "not time");
    return false;
  }
  
  public final int If()
  {
    return 1992;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTransferWording", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneTransferWording", "json: %s", new Object[] { paramJSONObject });
    this.pjJ = paramJSONObject.optString("delay_confirm_wording");
    this.pjK = paramJSONObject.optString("delay_confirm_switch_wording");
    this.pjL = paramJSONObject.optString("delay_confirm_switch_remind_wording");
    this.pjM = paramJSONObject.optString("delay_confirm_desc_url");
    this.pjO = paramJSONObject.optInt("delay_confirm_desc_url_flag", 0);
    this.eiD = (paramJSONObject.optLong("expire_time", 0L) * 1000L);
    this.pjP = paramJSONObject.optInt("delay_confirm_switch_flag", 0);
    com.tencent.mm.kernel.g.Ek();
    paramString = com.tencent.mm.kernel.g.Ei().DT();
    if (!bi.oW(this.pjJ)) {
      paramString.a(aa.a.sVi, this.pjJ);
    }
    if (!bi.oW(this.pjK)) {
      paramString.a(aa.a.sVj, this.pjK);
    }
    if (!bi.oW(this.pjL)) {
      paramString.a(aa.a.sVk, this.pjL);
    }
    if (!bi.oW(this.pjM)) {}
    try
    {
      this.pjN = URLDecoder.decode(this.pjM, "UTF-8");
      if (!bi.oW(this.pjN)) {
        paramString.a(aa.a.sVm, this.pjN);
      }
      paramString.a(aa.a.sVn, Integer.valueOf(this.pjO));
      paramString.a(aa.a.sVl, Long.valueOf(this.eiD));
      paramString.a(aa.a.sVo, Integer.valueOf(this.pjP));
      if (this.pjP == 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneTransferWording", "do reset oplog");
        paramJSONObject = new auq();
        paramJSONObject.mEc = 0;
        ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FQ().b(new h.a(205, paramJSONObject));
        paramString.set(147457, Long.valueOf(((Long)paramString.get(147457, Long.valueOf(0L))).longValue() & 0xFFFFFFFFFFFFFFEF & 0xFFFFFFFFFFFFFFDF));
      }
      return;
    }
    catch (UnsupportedEncodingException paramJSONObject)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneTransferWording", paramJSONObject, "", new Object[0]);
      }
    }
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final boolean bkU()
  {
    return false;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/gettransferwording";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */