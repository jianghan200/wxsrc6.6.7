package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.res.Resources;
import com.tencent.mm.R.l;
import com.tencent.mm.protocal.c.atl;
import com.tencent.mm.sdk.platformtools.ad;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public static final List<atl> qgo = new LinkedList();
  
  static
  {
    atl localatl = new atl();
    localatl.bHD = ad.getResources().getString(R.l.game_menu_share_to_friend);
    localatl.lPl = "game_menu_icon_share_to_friend";
    localatl.rWP = 1;
    localatl.rWO = 1;
    localatl.rDF = c.a.qgw.code;
    qgo.add(localatl);
    localatl = new atl();
    localatl.bHD = ad.getResources().getString(R.l.game_menu_exit);
    localatl.lPl = "game_menu_icon_exit";
    localatl.rWP = 2;
    localatl.rWO = 2;
    localatl.rDF = c.a.qgv.code;
    qgo.add(localatl);
    localatl = new atl();
    localatl.bHD = ad.getResources().getString(R.l.game_menu_refresh);
    localatl.lPl = "game_menu_icon_refresh";
    localatl.rWP = 4;
    localatl.rWO = 5;
    localatl.rDF = c.a.qgy.code;
    qgo.add(localatl);
    localatl = new atl();
    localatl.bHD = ad.getResources().getString(R.l.game_menu_collect);
    localatl.lPl = "game_menu_icon_collect";
    localatl.rWP = 3;
    localatl.rWO = 6;
    localatl.rDF = c.a.qgx.code;
    qgo.add(localatl);
    localatl = new atl();
    localatl.bHD = ad.getResources().getString(R.l.game_menu_complaint);
    localatl.lPl = "game_menu_icon_complaint";
    localatl.rWP = 6;
    localatl.rWO = 7;
    localatl.rDF = c.a.qgA.code;
    qgo.add(localatl);
    localatl = new atl();
    localatl.bHD = ad.getResources().getString(R.l.game_menu_add_to_desktop);
    localatl.lPl = "game_menu_icon_add_to_desktop";
    localatl.rWP = 5;
    localatl.rWO = 8;
    localatl.rDF = c.a.qgz.code;
    qgo.add(localatl);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/menu/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */