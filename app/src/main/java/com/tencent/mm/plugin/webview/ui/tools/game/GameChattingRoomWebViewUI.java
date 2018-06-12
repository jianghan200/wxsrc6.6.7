package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.pluginsdk.ui.applet.g;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.platformtools.x;

public class GameChattingRoomWebViewUI
  extends WebViewUI
{
  private String jumpUrl = "";
  private int qfF = 4;
  private int qfG = 5;
  final q.a qfH = new GameChattingRoomWebViewUI.1(this);
  final q.a qfI = new GameChattingRoomWebViewUI.2(this);
  
  protected final boolean Du(String paramString)
  {
    return true;
  }
  
  protected final void Ro(String paramString)
  {
    x.i("MicroMsg.GameChattingRoomWebViewUI", "url = %s", new Object[] { paramString });
    this.jumpUrl = paramString;
    String str1 = getIntent().getStringExtra("action");
    String str2;
    if (str1 != null)
    {
      paramString = getIntent().getStringExtra("app_name");
      if (paramString != null) {
        break label99;
      }
      paramString = getString(R.l.app_back);
      str2 = getString(R.l.confirm_dialog_stay_in_weixin);
      if (!str1.equals("action_create")) {
        break label118;
      }
      g.a(this.mController, getString(R.l.created_chatroom), paramString, str2, this.qfH, this.qfI);
    }
    label99:
    label118:
    while (!str1.equals("action_join"))
    {
      return;
      paramString = getString(R.l.confirm_dialog_back_app, new Object[] { paramString });
      break;
    }
    g.a(this.mController, getString(R.l.joined_chatroom), paramString, str2, this.qfH, this.qfI);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/GameChattingRoomWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */