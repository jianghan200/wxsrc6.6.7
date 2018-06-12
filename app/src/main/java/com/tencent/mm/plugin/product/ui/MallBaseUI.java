package com.tencent.mm.plugin.product.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.g;

public abstract class MallBaseUI
  extends MMActivity
{
  protected String fGO;
  
  protected final void JB(String paramString)
  {
    this.fGO = paramString;
    showDialog(55535);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBackBtn(new MallBaseUI.1(this));
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return super.onCreateDialog(paramInt);
    case -10001: 
      if (bi.oW(this.fGO)) {
        this.fGO = getString(a.i.mall_product_data_err);
      }
      return h.a(this, this.fGO, null, false, new MallBaseUI.2(this));
    }
    return g.a(this.mController.tml, false, new MallBaseUI.3(this));
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 1)) {
      this.mController.callBackMenu();
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public final void ux(int paramInt)
  {
    this.mController.contentView.setVisibility(paramInt);
    if (paramInt == 0)
    {
      this.mController.showTitleView();
      return;
    }
    this.mController.hideTitleView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/product/ui/MallBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */