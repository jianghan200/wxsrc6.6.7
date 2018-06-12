package com.tencent.mm.plugin.game.gamewebview.ui;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  private String jIA;
  private String jIB;
  boolean jIv;
  private String jIw;
  private String jIx;
  private String jIy;
  private String jIz;
  private String lang;
  
  public a(Bundle paramBundle)
  {
    this.jIv = paramBundle.getBoolean("close_window_confirm_dialog_switch");
    this.jIw = paramBundle.getString("close_window_confirm_dialog_title_cn");
    this.jIx = paramBundle.getString("close_window_confirm_dialog_title_eng");
    this.jIy = paramBundle.getString("close_window_confirm_dialog_ok_cn");
    this.jIz = paramBundle.getString("close_window_confirm_dialog_ok_eng");
    this.jIA = paramBundle.getString("close_window_confirm_dialog_cancel_cn");
    this.jIB = paramBundle.getString("close_window_confirm_dialog_cancel_eng");
    this.lang = w.fD(ad.getContext());
  }
  
  public final String aSC()
  {
    if ("zh_CN".equals(this.lang)) {
      return this.jIw;
    }
    return this.jIx;
  }
  
  public final String aSD()
  {
    if ("zh_CN".equals(this.lang)) {
      return this.jIy;
    }
    return this.jIz;
  }
  
  public final String aSE()
  {
    if ("zh_CN".equals(this.lang)) {
      return this.jIA;
    }
    return this.jIB;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */