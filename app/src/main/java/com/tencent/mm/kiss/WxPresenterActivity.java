package com.tencent.mm.kiss;

import android.os.Bundle;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.vending.app.c;
import com.tencent.mm.vending.c.b;

public abstract class WxPresenterActivity
  extends MMActivity
{
  protected c dtb = new c();
  
  public final com.tencent.mm.vending.app.a EW()
  {
    return this.dtb.EW();
  }
  
  public void keep(com.tencent.mm.vending.e.a parama)
  {
    this.dtb.keep(parama);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dtb.A(getIntent(), this);
  }
  
  public void onDestroy()
  {
    this.dtb.onDestroy();
    super.onDestroy();
  }
  
  public void onPause()
  {
    this.dtb.GM(3);
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.dtb.GM(2);
  }
  
  public final <T extends b<? extends com.tencent.mm.vending.app.a>> T t(Class<? extends b<? extends com.tencent.mm.vending.app.a>> paramClass)
  {
    return this.dtb.a(this, paramClass);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/kiss/WxPresenterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */