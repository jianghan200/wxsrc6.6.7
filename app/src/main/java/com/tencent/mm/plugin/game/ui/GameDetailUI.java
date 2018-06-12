package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.model.b;
import com.tencent.mm.plugin.game.model.b.a;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.a;

@a(19)
public class GameDetailUI
  extends MMBaseActivity
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("game_app_id");
    Object localObject = b.bt(paramBundle, getIntent().getIntExtra("game_report_from_scene", 0));
    if ((((b.a)localObject).bWA == 2) && (!bi.oW(((b.a)localObject).url))) {
      c.r(getBaseContext(), ((b.a)localObject).url, "game_center_detail");
    }
    for (;;)
    {
      finish();
      return;
      int i = f.aTJ();
      if (i == 2)
      {
        c.ap(this, paramBundle);
      }
      else if (i == 1)
      {
        c.e(this, getIntent().getExtras());
      }
      else
      {
        localObject = bi.fS(this);
        if ((bi.oW((String)localObject)) || (((String)localObject).toLowerCase().equals("cn"))) {
          c.ap(this, paramBundle);
        } else {
          c.e(this, getIntent().getExtras());
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */