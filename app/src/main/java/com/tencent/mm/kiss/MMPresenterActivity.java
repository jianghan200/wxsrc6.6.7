package com.tencent.mm.kiss;

import android.os.Bundle;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.vending.app.c;

public abstract class MMPresenterActivity
  extends MMActivity
{
  private c dtb = new c();
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dtb.A(getIntent(), this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.dtb.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    this.dtb.GM(3);
  }
  
  protected void onResume()
  {
    super.onResume();
    this.dtb.GM(2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/kiss/MMPresenterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */