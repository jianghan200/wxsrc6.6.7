package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Intent;
import com.tencent.mm.sdk.platformtools.bi;

public final class d
{
  public static String bZM;
  public static int cfR;
  public static String qgn;
  
  public d(Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    bZM = bi.oV(paramIntent.getStringExtra("KPublisherId"));
    qgn = bi.oV(paramIntent.getStringExtra("geta8key_username"));
    cfR = bi.f(Integer.valueOf(paramIntent.getIntExtra("geta8key_scene", 0)));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */