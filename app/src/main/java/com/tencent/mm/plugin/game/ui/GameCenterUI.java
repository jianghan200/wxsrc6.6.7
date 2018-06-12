package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.d.aj;
import com.tencent.mm.plugin.game.d.ax;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.a;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.b.a;
import com.tencent.mm.plugin.game.model.o;
import com.tencent.mm.plugin.game.model.s;
import com.tencent.mm.plugin.game.model.s.a;
import com.tencent.mm.plugin.game.model.s.c;
import com.tencent.mm.plugin.game.model.v;
import com.tencent.mm.plugin.game.ui.tab.GameRouteUI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.base.a;

@a(19)
public class GameCenterUI
  extends MMBaseActivity
{
  private void DM(String paramString)
  {
    qU(7);
    Object localObject = getIntent();
    if ((this == null) || (bi.oW(paramString)) || (localObject == null))
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(848L, 3L, 1L, false);
      return;
    }
    boolean bool = ((Intent)localObject).getBooleanExtra("from_find_more_friend", false);
    int i = ((Intent)localObject).getIntExtra("game_report_from_scene", 0);
    ((com.tencent.mm.plugin.game.a.b)g.l(com.tencent.mm.plugin.game.a.b.class)).aSi();
    localObject = v.aTZ();
    paramString = o.a(paramString, (s)localObject);
    if (bool)
    {
      o.a(this, paramString, "game_center_entrance", true, (s)localObject, i);
      ((com.tencent.mm.plugin.game.a.b)g.l(com.tencent.mm.plugin.game.a.b.class)).aSi();
      v.aTY();
    }
    for (;;)
    {
      finish();
      break;
      o.a(this, paramString, "game_center_entrance", false, (s)localObject, i);
    }
  }
  
  private void fz(boolean paramBoolean)
  {
    Object localObject;
    if (e.chv())
    {
      x.i("MicroMsg.GameCenterUI", "GP version");
      localObject = new Intent(this, GameRouteUI.class);
      Bundle localBundle = getIntent().getExtras();
      if (localBundle != null) {
        ((Intent)localObject).putExtras(localBundle);
      }
      startActivity((Intent)localObject);
      if (!paramBoolean) {
        break label123;
      }
      overridePendingTransition(f.a.in_no_slide, f.a.in_no_slide);
    }
    for (;;)
    {
      qU(6);
      com.tencent.mm.plugin.report.service.h.mEJ.a(848L, 4L, 1L, false);
      return;
      localObject = com.tencent.mm.plugin.game.model.b.qQ(getIntent().getIntExtra("game_report_from_scene", 0));
      if ((((b.a)localObject).bWA != 2) || (bi.oW(((b.a)localObject).url))) {
        break;
      }
      DM(((b.a)localObject).url);
      return;
      label123:
      overridePendingTransition(MMFragmentActivity.a.tnC, MMFragmentActivity.a.tnD);
    }
  }
  
  private void qU(int paramInt)
  {
    s locals;
    if (getIntent().getBooleanExtra("from_find_more_friend", false))
    {
      ((com.tencent.mm.plugin.game.a.b)g.l(com.tencent.mm.plugin.game.a.b.class)).aSi();
      locals = v.aTX();
      if (locals == null) {
        an.a(this, 9, 901, 1, paramInt, 0, an.da("resource", "0"));
      }
    }
    else
    {
      return;
    }
    locals.aTW();
    int i = locals.field_msgType;
    if (locals.field_msgType == 100) {
      i = locals.jNa;
    }
    an.a(this, 9, 901, 1, paramInt, 0, locals.field_appId, 0, i, locals.field_gameMsgId, locals.jNb, an.da("resource", String.valueOf(locals.jMt.jNi)));
    ((com.tencent.mm.plugin.game.a.b)g.l(com.tencent.mm.plugin.game.a.b.class)).aSi();
    v.aTY();
    com.tencent.mm.plugin.report.service.h.mEJ.a(858L, 3L, 1L, false);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.d("MicroMsg.GameCenterUI", "onCreate");
    if (getIntent().getBooleanExtra("game_check_float", false))
    {
      int i = getIntent().getIntExtra("game_sourceScene", 0);
      ((com.tencent.mm.plugin.game.a.b)g.l(com.tencent.mm.plugin.game.a.b.class)).aSi();
      paramBundle = v.aTZ();
      if (paramBundle != null)
      {
        paramBundle.aTW();
        if (!bi.oW(paramBundle.jMI.url)) {
          c.a(getBaseContext(), paramBundle, "game_center_h5_floatlayer");
        }
      }
      o.a(paramBundle, i, 1);
      finish();
      return;
    }
    boolean bool = getIntent().getBooleanExtra("switch_country_no_anim", false);
    Object localObject = com.tencent.mm.plugin.game.model.h.aTL();
    paramBundle = null;
    if (((com.tencent.mm.plugin.game.model.h)localObject).jLN != null)
    {
      localObject = ((com.tencent.mm.plugin.game.model.h)localObject).jLN.jRn;
      paramBundle = (Bundle)localObject;
      if (localObject != null)
      {
        x.i("MicroMsg.GameConfigManager", "getGameIndexSettingControl jumpType:%d, jumpUrl:%s", new Object[] { Integer.valueOf(((aj)localObject).jQq), ((aj)localObject).jOU });
        paramBundle = (Bundle)localObject;
      }
      if (paramBundle == null) {}
    }
    switch (paramBundle.jQq)
    {
    default: 
      fz(bool);
    case 0: 
    case 1: 
      for (;;)
      {
        finish();
        return;
        ((com.tencent.mm.plugin.game.model.h)localObject).Zy();
        break;
        fz(bool);
        continue;
        if (!bi.oW(paramBundle.jOU)) {
          DM(paramBundle.jOU);
        } else {
          fz(bool);
        }
      }
    case 2: 
      paramBundle = new Intent(this, GameOverSeaCenterUI.class);
      localObject = getIntent().getExtras();
      if (localObject != null) {
        paramBundle.putExtras((Bundle)localObject);
      }
      startActivity(paramBundle);
      if (bool) {
        overridePendingTransition(f.a.in_no_slide, f.a.in_no_slide);
      }
      for (;;)
      {
        qU(6);
        com.tencent.mm.plugin.report.service.h.mEJ.a(848L, 5L, 1L, false);
        break;
        overridePendingTransition(MMFragmentActivity.a.tnC, MMFragmentActivity.a.tnD);
      }
    }
    paramBundle = new Intent(this, GameDownloadGuidanceUI.class);
    localObject = getIntent().getExtras();
    if (localObject != null) {
      paramBundle.putExtras((Bundle)localObject);
    }
    startActivity(paramBundle);
    if (bool) {
      overridePendingTransition(f.a.in_no_slide, f.a.in_no_slide);
    }
    for (;;)
    {
      qU(6);
      com.tencent.mm.plugin.report.service.h.mEJ.a(848L, 6L, 1L, false);
      break;
      overridePendingTransition(MMFragmentActivity.a.tnC, MMFragmentActivity.a.tnD);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameCenterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */