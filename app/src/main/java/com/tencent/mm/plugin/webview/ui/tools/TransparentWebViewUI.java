package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMWebView;

@com.tencent.mm.ui.base.a(3)
public class TransparentWebViewUI
  extends GameWebViewUI
{
  protected final void bVP()
  {
    setBackGroundColorResource(0);
    this.mController.contentView.setBackgroundResource(0);
    this.mhH.setBackgroundResource(17170445);
    this.mhH.setBackgroundColor(0);
    findViewById(R.h.webview_keyboard_ll).setBackgroundResource(17170445);
    findViewById(R.h.root_container).setBackgroundResource(17170445);
  }
  
  protected final boolean bVQ()
  {
    return false;
  }
  
  protected final void initView()
  {
    int i = 1;
    super.initView();
    this.pZr.pXt = true;
    this.pZr.fpo = false;
    this.pZr.jY(true);
    this.pZr.AH(0);
    if ((getIntent() != null) && (getIntent().hasExtra("show_full_screen")) && (getIntent().getBooleanExtra("show_full_screen", false))) {}
    for (;;)
    {
      if ((i != 0) && (this.pXI != null)) {
        this.pXI.setCanMove(false);
      }
      return;
      i = 0;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (this.screenOrientation == 1001)
    {
      this.screenOrientation = 0;
      if (this.fYl != null) {
        this.fYl.enable();
      }
    }
    do
    {
      do
      {
        return;
      } while (this.screenOrientation != 1002);
      this.screenOrientation = 1;
    } while (this.fYl == null);
    this.fYl.enable();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/TransparentWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */