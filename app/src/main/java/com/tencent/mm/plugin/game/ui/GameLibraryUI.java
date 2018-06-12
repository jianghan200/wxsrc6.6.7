package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.h;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.ab;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.ay;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.HashMap;
import java.util.LinkedList;

public class GameLibraryUI
  extends MMActivity
  implements e
{
  private View gPU;
  private Dialog iwc;
  private int jNB = 0;
  private int jNv = 0;
  private k jUE = new k();
  private ListView jUL;
  private l jUM;
  private boolean jUN = false;
  private boolean jUO = true;
  private m.a jUR = new GameLibraryUI.3(this);
  private AbsListView.OnScrollListener jUS = new GameLibraryUI.8(this);
  private boolean jVD = true;
  private TextView jZA;
  private View jZB;
  private GameDropdownView jZC;
  private HashMap<Integer, String> jZD;
  private int jZE = 0;
  private View jZF;
  private Button jZG;
  private boolean jZH = false;
  private int jZI = 990;
  private int jZJ = 0;
  private View.OnClickListener jZK = new GameLibraryUI.5(this);
  private View.OnClickListener jZL = new GameLibraryUI.6(this);
  private GameDropdownView.a jZM = new GameLibraryUI.7(this);
  private GameBannerView jZx;
  private GameLibraryCategoriesView jZy;
  private View jZz;
  private boolean jud = false;
  
  private void aUY()
  {
    Object localObject = f.aTz();
    int i = this.jNB;
    int j = this.jZE;
    if (this.jNB == 0) {}
    for (boolean bool = true;; bool = false)
    {
      localObject = new ay(i, (LinkedList)localObject, j, bool);
      g.DF().a((com.tencent.mm.ab.l)localObject, 0);
      this.jUN = true;
      return;
    }
  }
  
  private void goBack()
  {
    Object localObject = getIntent().getStringExtra("jump_game_center");
    if ((!bi.oW((String)localObject)) && (((String)localObject).equals("jump_game_center")))
    {
      localObject = new Intent(this, GameCenterUI.class);
      ((Intent)localObject).putExtra("jump_find_more_friends", "jump_find_more_friends");
      startActivity((Intent)localObject);
    }
    finish();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      switch (paraml.getType())
      {
      }
    }
    do
    {
      return;
      paramString = ((ay)paraml).ivx.dIE.dIL;
      g.Em().H(new GameLibraryUI.9(this, paramString));
      return;
      if (!com.tencent.mm.plugin.game.b.a.ezo.a(this, paramInt1, paramInt2, paramString)) {
        Toast.makeText(this, getString(f.i.game_list_get_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
    } while (this.iwc == null);
    this.iwc.cancel();
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return f.f.game_library;
  }
  
  protected final void initView()
  {
    setMMTitle(f.i.game_library);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GameLibraryUI.a(GameLibraryUI.this);
        return true;
      }
    });
    if (!bi.oW(f.aTK())) {
      addIconOptionMenu(0, f.i.top_item_desc_search, f.h.actionbar_icon_dark_search, new GameLibraryUI.2(this));
    }
    this.jUL = ((ListView)findViewById(f.e.game_library_list));
    this.jUL.setOnItemClickListener(this.jUE);
    this.jUE.setSourceScene(this.jNv);
    this.jUL.setOnScrollListener(this.jUS);
    this.jUM = new l(this);
    this.jUM.setSourceScene(this.jNv);
    this.jUM.a(this.jUR);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mController.tml.getSystemService("layout_inflater");
    Object localObject = localLayoutInflater.inflate(f.f.game_library_top_banner, this.jUL, false);
    this.jZx = ((GameBannerView)((View)localObject).findViewById(f.e.game_library_top_banner));
    this.jZx.setSourceScene(this.jNv);
    this.jUL.addHeaderView((View)localObject);
    this.jZJ += 1;
    this.jZy = ((GameLibraryCategoriesView)localLayoutInflater.inflate(f.f.game_library_categories_head, this.jUL, false));
    localObject = new LinearLayout(this);
    ((LinearLayout)localObject).addView(this.jZy);
    this.jUL.addHeaderView((View)localObject);
    this.jZJ += 1;
    this.jZz = localLayoutInflater.inflate(f.f.game_library_new_head, this.jUL, false);
    this.jZz.setOnClickListener(this.jZK);
    this.jZA = ((TextView)this.jZz.findViewById(f.e.game_library_new_game_more));
    this.jZB = localLayoutInflater.inflate(f.f.game_library_all_head, this.jUL, false);
    this.jZB.setOnClickListener(null);
    this.jZC = ((GameDropdownView)this.jZB.findViewById(f.e.game_library_all_sort));
    this.jZC.setAnchorView(this.jZB);
    this.jZC.setOnSelectionChangedListener(this.jZM);
    this.gPU = localLayoutInflater.inflate(f.f.game_list_footer_loading, this.jUL, false);
    this.gPU.setVisibility(8);
    localObject = new LinearLayout(this);
    ((LinearLayout)localObject).addView(this.gPU);
    this.jUL.addFooterView((View)localObject);
    this.jZF = localLayoutInflater.inflate(f.f.game_library_footer_more, this.jUL, false);
    this.jZF.setVisibility(8);
    this.jZG = ((Button)this.jZF.findViewById(f.e.game_library_more_btn));
    this.jZG.setOnClickListener(this.jZL);
    this.jUL.addFooterView(this.jZF);
    this.jUL.setAdapter(this.jUM);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.i("MicroMsg.GameLibraryUI", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 != 1) {
      x.e("MicroMsg.GameLibraryUI", "error request code");
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!g.Eg().Dx())
    {
      x.e("MicroMsg.GameLibraryUI", "account not ready");
      finish();
      return;
    }
    this.jNv = getIntent().getIntExtra("game_report_from_scene", 0);
    g.DF().a(1218, this);
    initView();
    paramBundle = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSk().Dw("pb_library");
    if (paramBundle == null) {
      x.i("MicroMsg.GameLibraryUI", "No cache found");
    }
    for (int i = 0;; i = 1)
    {
      if (i == 0)
      {
        this.iwc = com.tencent.mm.plugin.game.e.c.dD(this);
        this.iwc.show();
      }
      aUY();
      an.a(this, 11, 1100, 0, 1, this.jNv, null);
      return;
      g.Em().H(new GameLibraryUI.4(this, paramBundle));
    }
  }
  
  protected void onDestroy()
  {
    x.i("MicroMsg.GameLibraryUI", "onDestroy");
    super.onDestroy();
    g.DF().b(1218, this);
    this.jUM.clear();
    if (this.jZx != null) {
      this.jZx.jUl.SO();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.jZx != null)
    {
      GameBannerView localGameBannerView = this.jZx;
      if (localGameBannerView.jUl != null)
      {
        localGameBannerView.jUl.SO();
        x.i("MicroMsg.GameBannerView", "Auto scroll stopped");
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if (!g.Eg().Dx()) {
      x.e("MicroMsg.GameLibraryUI", "account not ready");
    }
    do
    {
      return;
      this.jUM.refresh();
      if ((!this.jVD) && (this.jZx != null))
      {
        GameBannerView localGameBannerView = this.jZx;
        if ((localGameBannerView.jUl != null) && (localGameBannerView.jUl.ciq()) && (localGameBannerView.jUk.size() > 1))
        {
          localGameBannerView.jUl.J(5000L, 5000L);
          x.i("MicroMsg.GameBannerView", "Auto scroll restarted");
        }
      }
    } while (!this.jVD);
    this.jVD = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameLibraryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */