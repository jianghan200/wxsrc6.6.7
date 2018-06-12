package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.d.as;
import com.tencent.mm.plugin.game.d.bh;
import com.tencent.mm.plugin.game.d.p;
import com.tencent.mm.plugin.game.e.a.a;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.h;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.ab;
import com.tencent.mm.plugin.game.model.ag;
import com.tencent.mm.plugin.game.model.aw;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public class GameDownloadGuidanceUI
  extends GameCenterBaseUI
  implements e
{
  private Dialog iwc;
  private bh jNL;
  private boolean jXA;
  private String jXB = "";
  private TextView jXx;
  private TextView jXy;
  private TextView jXz;
  private LinearLayout jeZ;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.GameDownloadGuidanceUI", "errType: %d errCode: %d, scene: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paraml.hashCode()) });
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      switch (paraml.getType())
      {
      }
    }
    do
    {
      return;
      long l = System.currentTimeMillis();
      paramString = ((aw)paraml).ivx.dIE.dIL;
      com.tencent.mm.plugin.game.e.c.Em().H(new GameDownloadGuidanceUI.5(this, paramString, l));
      return;
      if (!com.tencent.mm.plugin.game.b.a.ezo.a(this, paramInt1, paramInt2, paramString)) {
        Toast.makeText(this, getString(f.i.game_list_get_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
    } while (this.iwc == null);
    this.iwc.cancel();
  }
  
  public final void a(ag paramag, int paramInt)
  {
    if (isFinishing()) {
      x.w("MicroMsg.GameDownloadGuidanceUI", "GameDownloadGuidanceUI hasFinished");
    }
    label94:
    label136:
    label165:
    label224:
    label245:
    label257:
    label269:
    label279:
    for (;;)
    {
      return;
      if ((paramag == null) || (paramag.aUr() == null))
      {
        x.e("MicroMsg.GameDownloadGuidanceUI", "Null data");
        return;
      }
      if ((paramag != null) && (paramag.aUs() != null))
      {
        this.jXB = paramag.aUs().jOU;
        if (bi.oW(this.jXB)) {
          break label224;
        }
        if (!this.jXA)
        {
          addIconOptionMenu(0, f.h.actionbar_setting_icon, new GameDownloadGuidanceUI.4(this));
          this.jXA = true;
        }
        this.jeZ.setVisibility(0);
        paramag = paramag.aUr();
        if (bi.oW(paramag.jPP)) {
          break label245;
        }
        this.jXx.setText(paramag.jPP);
        this.jXx.setVisibility(0);
        if (bi.oW(paramag.jPQ)) {
          break label257;
        }
        this.jXy.setText(paramag.jPQ);
        this.jXy.setVisibility(0);
        if (bi.oW(paramag.jPR)) {
          break label269;
        }
        this.jXz.setText(paramag.jPR);
        this.jXz.setVisibility(0);
      }
      for (;;)
      {
        if (paramInt != 2) {
          break label279;
        }
        com.tencent.mm.plugin.game.e.c.Em().H(new GameDownloadGuidanceUI.3(this));
        return;
        this.jXB = "";
        break;
        if (!this.jXA) {
          break label94;
        }
        removeOptionMenu(0);
        this.jXA = false;
        break label94;
        this.jXx.setVisibility(8);
        break label136;
        this.jXy.setVisibility(8);
        break label165;
        this.jXz.setVisibility(8);
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return f.f.game_google_play_tips;
  }
  
  protected final void initView()
  {
    setBackBtn(new GameDownloadGuidanceUI.1(this));
    setMMTitle(f.i.game_wechat_game);
    this.jeZ = ((LinearLayout)findViewById(f.e.container));
    this.jXx = ((TextView)findViewById(f.e.main_content));
    this.jXy = ((TextView)findViewById(f.e.secondary_title));
    this.jXz = ((TextView)findViewById(f.e.secondary_content));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g.DF().a(2586, this);
    initView();
    com.tencent.mm.plugin.game.e.c.Em().H(new Runnable()
    {
      public final void run()
      {
        Object localObject = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSk().Dw("pb_download_guidance");
        if (localObject == null) {
          ah.A(new GameDownloadGuidanceUI.2.1(this));
        }
        for (;;)
        {
          localObject = new aw(w.chP(), f.aTz(), GameDownloadGuidanceUI.this.jVf, GameDownloadGuidanceUI.this.jVg, GameDownloadGuidanceUI.this.jVh, GameDownloadGuidanceUI.this.jVe);
          g.DF().a((com.tencent.mm.ab.l)localObject, 0);
          f.aTE();
          a.a.aVh().aVf();
          return;
          ah.A(new GameDownloadGuidanceUI.2.2(this, new ag((byte[])localObject)));
        }
      }
    });
  }
  
  protected void onDestroy()
  {
    x.i("MicroMsg.GameDownloadGuidanceUI", "onDestroy");
    super.onDestroy();
    a.a.aVh().clearCache();
    g.DF().b(2586, this);
    ((com.tencent.mm.plugin.game.a.b)g.l(com.tencent.mm.plugin.game.a.b.class)).aSf().clearCache();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDownloadGuidanceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */