package com.tencent.mm.plugin.base.stub;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Bundle;
import com.jg.JgClassChecked;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.modelpay.PayReq.Options;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.plugin.wallet_index.ui.e;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class WXPayEntryActivity
  extends AutoLoginActivity
{
  private String eeY = null;
  private long hej = 0L;
  
  private static void a(Context paramContext, f paramf, String paramString)
  {
    Signature[] arrayOfSignature = p.bh(paramContext, paramString);
    Object localObject = "";
    paramContext = (Context)localObject;
    if (arrayOfSignature != null)
    {
      paramContext = (Context)localObject;
      if (arrayOfSignature.length > 0)
      {
        int j = arrayOfSignature.length;
        int i = 0;
        for (;;)
        {
          paramContext = (Context)localObject;
          if (i >= j) {
            break;
          }
          paramContext = arrayOfSignature[i];
          localObject = (String)localObject + p.Tb(com.tencent.mm.a.g.u(paramContext.toByteArray())) + "|";
          i += 1;
        }
      }
    }
    localObject = paramContext;
    if (paramContext.length() > 1) {
      localObject = paramContext.substring(0, paramContext.length() - 1);
    }
    paramContext = new JSONObject();
    try
    {
      paramContext.put("raw_package_name", bi.aG(paramString, ""));
      paramContext.put("package_name", bi.aG(paramf.field_packageName, ""));
      paramContext.put("raw_signature", localObject);
      paramContext.put("signature", bi.aG(paramf.field_signature, ""));
      paramContext.put("scene", 5);
      paramString = new gt();
      paramString.bPU.appId = paramf.field_appId;
      paramString.bPU.opType = 3;
      paramString.bPU.bJv = paramContext.toString();
      com.tencent.mm.sdk.b.a.sFg.m(paramString);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        x.i("MicroMsg.WXPayEntryActivity", "doIfAppInValid, jsonException = " + paramString.getMessage());
      }
    }
  }
  
  private void mY(int paramInt)
  {
    PayReq localPayReq = new PayReq();
    localPayReq.fromBundle(s.aq(getIntent()));
    PayReq.Options localOptions = new PayReq.Options();
    localOptions.fromBundle(s.aq(getIntent()));
    PayResp localPayResp = new PayResp();
    localPayResp.prepayId = localPayReq.prepayId;
    localPayResp.extData = localPayReq.extData;
    localPayResp.errCode = paramInt;
    e.a(this, s.j(getIntent(), "_mmessage_appPackage"), localPayResp, localOptions);
  }
  
  protected final boolean A(Intent paramIntent)
  {
    return true;
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    boolean bool2 = true;
    if (paramIntent == null)
    {
      finish();
      return;
    }
    x.i("MicroMsg.WXPayEntryActivity", "postLogin, delegate intent to OrderHandlerUI, resultCode = " + parama);
    switch (WXPayEntryActivity.1.hdM[parama.ordinal()])
    {
    default: 
      x.e("MicroMsg.WXPayEntryActivity", "postLogin, unknown login result = " + parama);
    }
    for (;;)
    {
      this.eeY = s.j(paramIntent, "_mmessage_appPackage");
      x.i("MicroMsg.WXPayEntryActivity", "postLogin, getCallingPackage success, value = " + this.eeY);
      boolean bool1;
      if ((getIntent() == null) || (s.aq(getIntent()) == null))
      {
        bool1 = false;
        label142:
        if (!bool1) {
          x.e("MicroMsg.WXPayEntryActivity", "postLogin, checkApp fail");
        }
      }
      try
      {
        paramIntent.putExtra("key_scene", 0);
        parama = s.aq(paramIntent);
        parama.putLong("wallet_pay_key_check_time", this.hej);
        h.a(this, parama, bool1, "");
        finish();
        return;
        x.i("MicroMsg.WXPayEntryActivity", "coreaccount st %s", new Object[] { Boolean.valueOf(com.tencent.mm.kernel.a.Dr()) });
        if (!com.tencent.mm.kernel.a.Dr()) {
          continue;
        }
        finish();
        return;
        mY(-2);
        x.e("MicroMsg.WXPayEntryActivity", "postLogin fail, loginResult = " + parama);
        finish();
        return;
        mY(-1);
        x.e("MicroMsg.WXPayEntryActivity", "postLogin fail, loginResult = " + parama);
        finish();
        return;
        parama = new PayReq();
        parama.fromBundle(s.aq(getIntent()));
        parama = parama.appId;
        x.d("MicroMsg.WXPayEntryActivity", "postLogin, appId = " + parama);
        if ((parama == null) || (parama.length() == 0))
        {
          x.e("MicroMsg.WXPayEntryActivity", "checkApp fail, appId is null");
          bool1 = false;
          break label142;
        }
        f localf = com.tencent.mm.pluginsdk.model.app.g.bl(parama, true);
        if (localf == null)
        {
          x.w("MicroMsg.WXPayEntryActivity", "checkApp fail, not reg");
          localf = new f();
          localf.field_appId = parama;
          localf.field_appName = "";
          localf.field_packageName = this.eeY;
          localf.field_status = 0;
          String str = p.bg(this, this.eeY);
          if (str != null) {
            localf.field_signature = str;
          }
          bool1 = bool2;
          if (!ao.bmf().l(localf)) {
            break label142;
          }
          bool1 = bool2;
          if (!bi.oW(localf.field_openId)) {
            break label142;
          }
          x.d("MicroMsg.WXPayEntryActivity", "checkApp, trigger getAppSetting, appId = " + parama);
          ao.bmh().pS(parama);
          bool1 = bool2;
          break label142;
        }
        if (localf.field_status == 3)
        {
          x.e("MicroMsg.WXPayEntryActivity", "checkApp fail, app is in blacklist");
          bool1 = false;
          break label142;
        }
        bool1 = bool2;
        if (p.c(this, localf, this.eeY)) {
          break label142;
        }
        a(this, localf, this.eeY);
        x.e("MicroMsg.WXPayEntryActivity", "checkApp fail, app invalid");
        bool1 = false;
      }
      catch (Exception parama)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.IntentUtil", parama, "", new Object[0]);
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.hej = System.currentTimeMillis();
    s.b(getIntent(), "key_auto_login_wizard_exit", true);
    super.onCreate(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/base/stub/WXPayEntryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */