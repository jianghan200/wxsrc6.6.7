package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.game.d.bj;
import com.tencent.mm.plugin.game.e.a.a;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.ax;
import com.tencent.mm.plugin.game.model.b.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class GameOverSeaCenterUI
  extends GameCenterBaseUI
  implements e
{
  private Dialog iwc;
  private bj jNZ;
  k jUE = new k();
  private boolean jVD = true;
  private boolean jXA;
  private String jXB = "";
  private View.OnClickListener jZL = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      b.a locala = com.tencent.mm.plugin.game.model.b.aTu();
      int i;
      if (locala.bWA == 2) {
        i = com.tencent.mm.plugin.game.e.c.r(GameOverSeaCenterUI.this.mController.tml, locala.url, "game_center_library");
      }
      for (;;)
      {
        an.a(GameOverSeaCenterUI.this.mController.tml, 10, 1005, 1, i, GameOverSeaCenterUI.this.jNv, null);
        return;
        paramAnonymousView = paramAnonymousView.getTag();
        if ((paramAnonymousView != null) && ((paramAnonymousView instanceof String)) && (!bi.oW((String)paramAnonymousView)))
        {
          paramAnonymousView = (String)paramAnonymousView;
          i = com.tencent.mm.plugin.game.e.c.r(GameOverSeaCenterUI.this.mController.tml, paramAnonymousView, "game_center_library");
        }
        else
        {
          paramAnonymousView = new Intent(GameOverSeaCenterUI.this.mController.tml, GameLibraryUI.class);
          paramAnonymousView.putExtra("game_report_from_scene", 1005);
          GameOverSeaCenterUI.this.startActivity(paramAnonymousView);
          i = 6;
        }
      }
    }
  };
  private GameCenterListView kbi;
  private g kbj;
  private GameInfoViewForeign kbk;
  private GameMessageBubbleView kbl;
  private GameInstalledView kbm;
  private View kbn;
  private TextView kbo;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.GameOverSeaCenterUI", "errType: %d errCode: %d, scene: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paraml.hashCode()) });
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      switch (paraml.getType())
      {
      }
    }
    do
    {
      return;
      long l = System.currentTimeMillis();
      paramString = ((ax)paraml).ivx.dIE.dIL;
      com.tencent.mm.plugin.game.e.c.Em().H(new GameOverSeaCenterUI.6(this, paramString, l));
      return;
      if (!com.tencent.mm.plugin.game.b.a.ezo.a(this, paramInt1, paramInt2, paramString)) {
        Toast.makeText(this, getString(f.i.game_list_get_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
    } while (this.iwc == null);
    this.iwc.cancel();
  }
  
  protected final int getLayoutId()
  {
    return f.f.game_center_home;
  }
  
  protected final void initView()
  {
    setBackBtn(new GameOverSeaCenterUI.1(this));
    setMMTitle(f.i.game_wechat_game);
    this.kbi = ((GameCenterListView)findViewById(f.e.game_center_uninstalled));
    this.kbi.setOnItemClickListener(this.jUE);
    this.jUE.setSourceScene(this.jNv);
    this.kbj = new g(this);
    this.kbj.setSourceScene(this.jNv);
    Object localObject = (LayoutInflater)this.mController.tml.getSystemService("layout_inflater");
    View localView = ((LayoutInflater)localObject).inflate(f.f.game_center_home_info_foreign, this.kbi, false);
    this.kbk = ((GameInfoViewForeign)localView.findViewById(f.e.game_center_info_foreign));
    this.kbi.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(f.f.game_center_bubble_layout, this.kbi, false);
    this.kbl = ((GameMessageBubbleView)localView.findViewById(f.e.game_msg_bubble_view));
    this.kbi.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(f.f.game_center_home_installed, this.kbi, false);
    this.kbm = ((GameInstalledView)localView.findViewById(f.e.game_installed_header));
    this.kbi.addHeaderView(localView);
    localObject = ((LayoutInflater)localObject).inflate(f.f.game_center_home_footer_more2, this.kbi, false);
    this.kbi.addFooterView((View)localObject);
    this.kbn = ((View)localObject).findViewById(f.e.game_home_more_btn);
    this.kbn.setOnClickListener(this.jZL);
    this.kbo = ((TextView)((View)localObject).findViewById(f.e.game_home_more_btn_text));
    this.kbi.setAdapter(this.kbj);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.GameOverSeaCenterUI", "GameOverSeaCenterUI create");
    com.tencent.mm.kernel.g.DF().a(2855, this);
    initView();
    com.tencent.mm.plugin.game.e.c.Em().H(new GameOverSeaCenterUI.2(this));
  }
  
  protected void onDestroy()
  {
    x.i("MicroMsg.GameOverSeaCenterUI", "onDestroy");
    super.onDestroy();
    a.a.aVh().clearCache();
    com.tencent.mm.kernel.g.DF().b(2855, this);
    ((com.tencent.mm.plugin.game.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.b.class)).aSf().clearCache();
  }
  
  protected void onResume()
  {
    super.onResume();
    if (!this.jVD)
    {
      if (this.jVe) {
        this.kbl.aVb();
      }
      this.kbk.aUW();
    }
    this.jVD = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameOverSeaCenterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */