package com.tencent.mm.app;

import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.mm.pluginsdk.r;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.splash.SplashActivity;
import com.tencent.mm.ui.MMActivity;

public class WeChatSplashActivity
  extends SplashActivity
{
  public Resources getResources()
  {
    if ((getAssets() != null) && (ad.getResources() != null)) {
      return ad.getResources();
    }
    return super.getResources();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    MMActivity.initLanguage(getBaseContext());
    setContentView(2130905065);
  }
  
  protected void onPause()
  {
    r.cbl();
    super.onPause();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/app/WeChatSplashActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */