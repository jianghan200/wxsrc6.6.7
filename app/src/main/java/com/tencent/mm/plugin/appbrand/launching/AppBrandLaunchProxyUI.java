package com.tencent.mm.plugin.appbrand.launching;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.launching.precondition.d;
import com.tencent.mm.plugin.appbrand.launching.precondition.f;
import com.tencent.mm.plugin.appbrand.launching.precondition.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.plugin.appbrand.ui.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.p;

@a(7)
public final class AppBrandLaunchProxyUI
  extends MMBaseActivity
  implements k
{
  private p geH;
  private com.tencent.mm.plugin.appbrand.launching.precondition.h geI;
  private MMActivity.a geJ = null;
  
  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, AppBrandStatObject paramAppBrandStatObject, LaunchParamsOptional paramLaunchParamsOptional)
  {
    a(paramContext, paramString1, null, paramString2, paramInt1, paramInt2, paramAppBrandStatObject, null, paramLaunchParamsOptional);
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, AppBrandStatObject paramAppBrandStatObject, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, LaunchParamsOptional paramLaunchParamsOptional)
  {
    if ((bi.oW(paramString1)) && (bi.oW(paramString2))) {
      return false;
    }
    return g.ghE.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramAppBrandStatObject, paramAppBrandLaunchReferrer, paramLaunchParamsOptional);
  }
  
  public static boolean v(Intent paramIntent)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramIntent != null) {
      bool1 = bool2;
    }
    try
    {
      if (paramIntent.getComponent() != null)
      {
        boolean bool3 = paramIntent.getComponent().getShortClassName().equals(".plugin.appbrand.launching.AppBrandLaunchProxyUI");
        bool1 = bool2;
        if (bool3) {
          bool1 = true;
        }
      }
      return bool1;
    }
    catch (Exception paramIntent) {}
    return false;
  }
  
  public final void a(MMActivity.a parama, Intent paramIntent, int paramInt)
  {
    this.geJ = parama;
    startActivityForResult(paramIntent, paramInt);
  }
  
  public final boolean akz()
  {
    return !isFinishing();
  }
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.geJ != null) {
      this.geJ.b(paramInt1, paramInt2, paramIntent);
    }
    this.geJ = null;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent() == null) {
      finish();
    }
    label174:
    do
    {
      return;
      j.a(getWindow());
      j.a(getWindow(), true);
      if (!getIntent().getBooleanExtra("extra_from_mm", true)) {}
      for (paramBundle = new d(this);; paramBundle = new f(this))
      {
        this.geI = paramBundle;
        if (this.geI == null) {
          break label227;
        }
        x.i("MicroMsg.AppBrandLaunchProxyUI", "onCreate, uiDelegate %s", new Object[] { this.geI.getClass().getSimpleName() });
        this.geI.w(getIntent());
        if (isFinishing()) {
          break;
        }
        getString(s.j.app_tip);
        this.geH = com.tencent.mm.ui.base.h.a(this, getString(s.j.loading_tips), true, new AppBrandLaunchProxyUI.1(this));
        if (this.geH != null) {
          break label174;
        }
        x.e("MicroMsg.AppBrandLaunchProxyUI", "onCreate, get null progress dialog");
        finish();
        return;
      }
      this.geH.setOnDismissListener(new AppBrandLaunchProxyUI.2(this));
    } while (this.geH.getWindow() == null);
    paramBundle = this.geH.getWindow().getAttributes();
    paramBundle.dimAmount = 0.0F;
    this.geH.getWindow().setAttributes(paramBundle);
    return;
    label227:
    finish();
  }
  
  protected final void onDestroy()
  {
    super.onDestroy();
    if (this.geH != null)
    {
      this.geH.dismiss();
      this.geH = null;
    }
  }
  
  protected final void onPause()
  {
    super.onPause();
    if (this.geI != null)
    {
      this.geI.onPause();
      return;
    }
    super.finish();
  }
  
  protected final void onResume()
  {
    super.onResume();
    if (this.geI != null)
    {
      this.geI.onResume();
      return;
    }
    super.finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */