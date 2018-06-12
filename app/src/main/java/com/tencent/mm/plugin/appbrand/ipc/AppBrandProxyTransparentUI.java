package com.tencent.mm.plugin.appbrand.ipc;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.base.a;

@a(7)
public class AppBrandProxyTransparentUI
  extends MMActivity
{
  protected final void ahy()
  {
    int i = getIntent().getIntExtra("orientation", -1);
    if (i != -1) {
      setRequestedOrientation(i);
    }
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.AppBrandProxyTransparentUI", "onCreate");
    ak.a(getWindow());
    try
    {
      paramBundle = Class.forName(getIntent().getStringExtra("task_class_name"));
      getIntent().getExtras().setClassLoader(paramBundle.getClassLoader());
      paramBundle = (AppBrandProxyTransparentUIProcessTask)getIntent().getParcelableExtra("task_object");
      String str = getIntent().getStringExtra("task_id");
      if (paramBundle != null)
      {
        paramBundle.a(this, new AppBrandProxyTransparentUI.1(this, paramBundle, str));
        return;
      }
    }
    catch (ClassNotFoundException paramBundle)
    {
      for (;;)
      {
        x.e("MicroMsg.AppBrandProxyTransparentUI", "ClassNotFoundException");
        setResult(1);
        finish();
      }
      setResult(1);
      finish();
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    x.i("MicroMsg.AppBrandProxyTransparentUI", "onDestroy");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ipc/AppBrandProxyTransparentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */