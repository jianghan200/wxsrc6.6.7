package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.e.a.a;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.s;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public abstract class GameCenterBaseUI
  extends GameCenterActivity
{
  protected int jNv = 0;
  protected boolean jVe = false;
  protected s jVf;
  protected s jVg;
  protected s jVh;
  protected boolean jVi = false;
  private boolean jVj = true;
  
  public final int aUM()
  {
    return 10;
  }
  
  public final int aUN()
  {
    return 1000;
  }
  
  public final int aUO()
  {
    return this.jNv;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!g.Eg().Dx())
    {
      x.e("MicroMsg.GameCenterBaseUI", "account not ready");
      finish();
      return;
    }
    this.jNv = getIntent().getIntExtra("game_report_from_scene", 0);
    this.jVe = getIntent().getBooleanExtra("from_find_more_friend", false);
    c.Em().H(new GameCenterBaseUI.1(this));
    an.a(this, 10, 1000, 0, 1, 0, null, this.jNv, 0, null, null, null);
  }
  
  public void onResume()
  {
    super.onResume();
    if (!g.Eg().Dx())
    {
      x.e("MicroMsg.GameCenterBaseUI", "account not ready");
      return;
    }
    if ((!this.jVj) && (a.a.aVh().kdd))
    {
      a.a.aVh().kdd = false;
      x.i("MicroMsg.GameCenterBaseUI", "restart page from country setting");
      if (!isFinishing()) {
        finish();
      }
      sendBroadcast(new Intent("com.tencent.mm.ACTION_EXIT"), "com.tencent.mm.permission.MM_MESSAGE");
      Intent localIntent = new Intent();
      localIntent.putExtra("game_report_from_scene", 901);
      localIntent.putExtra("switch_country_no_anim", true);
      d.b(this, "game", ".ui.GameCenterUI", localIntent);
    }
    this.jVj = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameCenterBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */