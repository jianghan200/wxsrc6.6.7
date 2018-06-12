package com.tencent.mm.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.w.a.h;

@a(3)
public class MMSuperAlert
  extends Activity
{
  public static void j(Context paramContext, int paramInt1, int paramInt2)
  {
    Intent localIntent = new Intent(paramContext, MMSuperAlert.class);
    localIntent.putExtra("MMSuperAlert_title", paramInt1);
    localIntent.putExtra("MMSuperAlert_msg", paramInt2);
    localIntent.putExtra("MMSuperAlert_cancelable", false);
    paramContext.startActivity(localIntent);
  }
  
  public Resources getResources()
  {
    if ((getAssets() != null) && (ad.getResources() != null)) {
      return ad.getResources();
    }
    return super.getResources();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.h.mm_super_alert_empty);
    int i = getIntent().getIntExtra("MMSuperAlert_msg", 0);
    int j = getIntent().getIntExtra("MMSuperAlert_title", 0);
    boolean bool = getIntent().getBooleanExtra("MMSuperAlert_cancelable", true);
    new ag().postDelayed(new MMSuperAlert.1(this, i, j, bool), 50L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/base/MMSuperAlert.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */