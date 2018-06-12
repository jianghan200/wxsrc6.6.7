package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import com.tencent.mm.al.b;
import com.tencent.mm.al.b.a;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.s;

@a(7)
public class AppBrandRedirectUI
  extends MMActivity
{
  private int fromScene = -1;
  private boolean gvt = false;
  private int result = 0;
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    j.a(getWindow());
    x.i("AppBrandRedirectUI", "onCreate");
    setResult(0);
    this.fromScene = getIntent().getIntExtra("key_from_scene", -1);
    if (this.fromScene == 0)
    {
      getIntent().putExtra("WizardRootClass", getClass().getName());
      x.i("AppBrandRedirectUI", "start to bind phone number");
      paramBundle = new Intent();
      paramBundle.setClassName(this, "com.tencent.mm.plugin.account.bind.ui.BindMContactUI");
      paramBundle.putExtra("is_bind_for_safe_device", false);
      paramBundle.putExtra("bind_scene", 5);
      Object localObject = ((TelephonyManager)this.mController.tml.getSystemService("phone")).getSimCountryIso();
      if (!bi.oW((String)localObject))
      {
        localObject = b.j(this, (String)localObject, this.mController.tml.getString(s.j.country_code));
        if (localObject != null)
        {
          paramBundle.putExtra("country_name", ((b.a)localObject).dYy);
          paramBundle.putExtra("couttry_code", ((b.a)localObject).dYx);
        }
      }
      MMWizardActivity.D(this, paramBundle);
      return;
    }
    x.e("AppBrandRedirectUI", "from scene is illegal, finish activity");
    finish();
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      x.e("AppBrandRedirectUI", "onKeyDown KEYCODE_BACK, result cancel, finishUI");
      setResult(0);
      finish();
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    x.i("AppBrandRedirectUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    if (paramIntent != null)
    {
      this.result = paramIntent.getIntExtra("wizard_activity_result_code", 0);
      setResult(this.result);
      x.i("AppBrandRedirectUI", "result:%d, finish activity", new Object[] { Integer.valueOf(this.result) });
    }
    for (;;)
    {
      finish();
      return;
      x.i("AppBrandRedirectUI", "intent is null");
      setResult(0);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    x.i("AppBrandRedirectUI", "onResume");
    if (!this.gvt)
    {
      this.gvt = true;
      return;
    }
    x.i("AppBrandRedirectUI", "onResume, RESULT_CANCELED  finish activity");
    setResult(0);
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandRedirectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */