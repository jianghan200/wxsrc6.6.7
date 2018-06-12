package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.aws;
import com.tencent.mm.protocal.c.awt;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;
import org.json.JSONObject;

public final class e
  extends m
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public int hUm = -1;
  private String hUn = "";
  public String lJJ = "";
  public int lJK = -1;
  public String lJL = "";
  public int lJM = 1;
  public RealnameGuideHelper lJN;
  private String lJO;
  private String lJP;
  private String lJQ;
  private String lJR;
  private String lJS;
  
  public e(int paramInt, String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aws();
    ((b.a)localObject).dIH = new awt();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/offlinepayconfirm";
    ((b.a)localObject).dIF = 609;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aws)this.diG.dID.dIL;
    ((aws)localObject).rZT = paramInt;
    ((aws)localObject).ksA = paramString1;
    ((aws)localObject).eJn = paramString2;
    ((aws)localObject).rmQ = i.bOL();
    this.lJM = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    if (paramInt1 != 0) {
      x.e("MicroMsg.NetSceneOfflinePayConfirm", "Cmd : 609, errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    }
    Object localObject = (awt)((b)paramq).dIE.dIL;
    i = paramInt1;
    j = paramInt2;
    paramq = paramString;
    if (paramInt1 == 0)
    {
      i = paramInt1;
      j = paramInt2;
      paramq = paramString;
      if (paramInt2 == 0)
      {
        i = paramInt1;
        j = paramInt2;
        paramq = paramString;
      }
    }
    try
    {
      if (((awt)localObject).rJv != null)
      {
        localObject = new JSONObject(((awt)localObject).rJv);
        this.lJJ = ((JSONObject)localObject).optString("transaction_id");
        this.hUm = ((JSONObject)localObject).optInt("retcode");
        this.hUn = ((JSONObject)localObject).optString("retmsg");
        this.lJK = ((JSONObject)localObject).optInt("wx_error_type");
        this.lJL = ((JSONObject)localObject).optString("wx_error_msg");
        x.d("MicroMsg.NetSceneOfflinePayConfirm", "onGYNetEnd %s", new Object[] { ((JSONObject)localObject).toString() });
        i = paramInt1;
        j = paramInt2;
        paramq = paramString;
        if (((JSONObject)localObject).has("real_name_info"))
        {
          paramq = ((JSONObject)localObject).optJSONObject("real_name_info");
          this.lJO = paramq.optString("guide_flag");
          this.lJP = paramq.optString("guide_wording");
          this.lJQ = paramq.optString("left_button_wording");
          this.lJR = paramq.optString("right_button_wording");
          this.lJS = paramq.optString("upload_credit_url");
          if (!"1".equals(this.lJO))
          {
            i = paramInt1;
            j = paramInt2;
            paramq = paramString;
            if (!"2".equals(this.lJO)) {}
          }
          else
          {
            this.lJN = new RealnameGuideHelper();
            this.lJN.a(this.lJO, this.lJP, this.lJQ, this.lJR, this.lJS, 0);
            paramq = paramString;
            j = paramInt2;
            i = paramInt1;
          }
        }
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.NetSceneOfflinePayConfirm", paramString, "", new Object[0]);
        i = 1000;
        j = 2;
        paramq = ad.getContext().getString(a.i.wallet_data_err);
      }
    }
    if (this.diJ != null) {
      this.diJ.a(i, j, paramq, this);
    }
  }
  
  public final int getType()
  {
    return 609;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/offline/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */