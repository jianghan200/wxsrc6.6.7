package com.tencent.mm.plugin.clean.ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import com.tencent.mm.R.i;
import com.tencent.mm.a.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.s;
import org.json.JSONException;
import org.json.JSONObject;

@a(19)
public class CleanUI
  extends MMActivity
{
  private JSONObject hRA;
  private long hRw;
  private String hRx = "com.tencent.qqpimsecure";
  private String hRy = "00B1208638DE0FCD3E920886D658DAF6";
  private String hRz = "11206657";
  
  private boolean aBu()
  {
    aBv();
    if (!p.r(this.mController.tml, this.hRx)) {}
    Object localObject;
    do
    {
      do
      {
        return false;
        localObject = p.bh(this, this.hRx);
      } while ((localObject == null) || (localObject[0] == null));
      localObject = g.u(localObject[0].toByteArray());
    } while ((localObject == null) || (!((String)localObject).equalsIgnoreCase(this.hRy)));
    try
    {
      localObject = getPackageManager().getLaunchIntentForPackage(this.hRx);
      if (localObject != null)
      {
        Bundle localBundle = new Bundle();
        p.g(localBundle, this.hRz);
        ((Intent)localObject).putExtras(localBundle);
        ((Intent)localObject).addFlags(268435456);
        startActivity((Intent)localObject);
        h.mEJ.a(282L, 6L, 1L, false);
        return true;
      }
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CleanUI", localException, "", new Object[0]);
    }
    return true;
  }
  
  private boolean aBv()
  {
    au.HU();
    String str = (String)c.DT().get(aa.a.sSl, "");
    if (bi.oW(str)) {
      return false;
    }
    try
    {
      this.hRA = new JSONObject(str);
      this.hRx = this.hRA.getString("packageName");
      this.hRA.get("md5");
      this.hRz = this.hRA.getString("launcherID");
      this.hRy = this.hRA.getString("signature");
      this.hRA.get("url");
      this.hRw = this.hRA.getLong("size");
      return true;
    }
    catch (JSONException localJSONException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CleanUI", localJSONException, "", new Object[0]);
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return R.i.clean_empty;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((getIntent().getBooleanExtra("had_detected_no_sdcard_space", false)) && (aBu()))
    {
      finish();
      return;
    }
    startActivity(new Intent(this, CleanNewUI.class));
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/clean/ui/CleanUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */