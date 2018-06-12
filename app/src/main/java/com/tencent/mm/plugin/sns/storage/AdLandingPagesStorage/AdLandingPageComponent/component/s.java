package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.mm.bu.a;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class s
  extends l
{
  public s(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l paraml, ViewGroup paramViewGroup)
  {
    super(paramContext, paraml, paramViewGroup);
  }
  
  protected final void d(Button paramButton)
  {
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l locall = bAa();
    if (g.r(this.context, locall.nAt))
    {
      paramButton.setOnClickListener(new s.1(this, locall));
      return;
    }
    super.d(paramButton);
  }
  
  public final boolean t(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString1))) {}
    for (;;)
    {
      return false;
      try
      {
        Intent localIntent = paramContext.getPackageManager().getLaunchIntentForPackage(paramString1);
        if (localIntent != null)
        {
          paramString1 = paramContext;
          if (!(paramContext instanceof Activity)) {
            paramString1 = this.context;
          }
          a.post(new s.2(this, paramString1, localIntent, paramString2));
          return true;
        }
      }
      catch (Exception paramContext)
      {
        x.e("AdLandingPageOpenAppBtnComp", bi.i(paramContext));
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */