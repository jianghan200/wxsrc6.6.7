package com.tencent.mm.vending.app;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.vending.e.b;

public abstract class PresenterActivity
  extends Activity
  implements b
{
  private c dtb = new c();
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dtb.A(getIntent(), this);
  }
  
  protected void onDestroy()
  {
    this.dtb.onDestroy();
    super.onDestroy();
  }
  
  protected void onPause()
  {
    this.dtb.GM(3);
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.dtb.GM(2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/vending/app/PresenterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */