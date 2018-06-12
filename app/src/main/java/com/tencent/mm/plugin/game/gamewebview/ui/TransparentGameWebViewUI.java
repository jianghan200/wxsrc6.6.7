package com.tencent.mm.plugin.game.gamewebview.ui;

import com.tencent.mm.ui.base.a;

@a(1)
public class TransparentGameWebViewUI
  extends GameWebViewUI
{
  protected final void initView()
  {
    super.initView();
    this.jIE.setBackgroundColor(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/TransparentGameWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */