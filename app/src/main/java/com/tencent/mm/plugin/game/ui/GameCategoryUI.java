package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.h;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.az;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class GameCategoryUI
  extends MMActivity
  implements e
{
  private View gPU;
  private Dialog gvJ;
  private int jNB = 0;
  private int jNv = 0;
  private k jUE = new k();
  private ListView jUL;
  private l jUM;
  private boolean jUN = false;
  private boolean jUO = false;
  private int jUP;
  private String jUQ;
  private m.a jUR = new GameCategoryUI.3(this);
  private AbsListView.OnScrollListener jUS = new GameCategoryUI.4(this);
  private int mType;
  
  private void aUP()
  {
    az localaz = new az(this.jNB, this.mType, this.jUP);
    g.DF().a(localaz, 0);
    this.jUN = true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      x.e("MicroMsg.GameCategoryUI", "errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      return;
    }
    paramString = ((az)paraml).ivx.dIE.dIL;
    g.Em().H(new GameCategoryUI.5(this, paramString));
  }
  
  protected final int getLayoutId()
  {
    return f.f.game_category;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.i("MicroMsg.GameCategoryUI", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 != 1) {
      x.e("MicroMsg.GameCategoryUI", "error request code");
    }
    String str;
    do
    {
      do
      {
        return;
        str = null;
        if (paramIntent != null) {
          str = paramIntent.getStringExtra("game_app_id");
        }
        switch (paramInt2)
        {
        default: 
          return;
        }
      } while (bi.oW(str));
      this.jUM.DJ(str);
      this.jUM.DL(str);
      return;
    } while (bi.oW(str));
    this.jUM.DK(str);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("extra_type", 0);
    this.jUP = getIntent().getIntExtra("extra_category_id", 0);
    this.jUQ = getIntent().getStringExtra("extra_category_name");
    this.jNv = getIntent().getIntExtra("game_report_from_scene", 0);
    g.DF().a(1220, this);
    setMMTitle(this.jUQ);
    setBackBtn(new GameCategoryUI.1(this));
    if (!bi.oW(f.aTK())) {
      addIconOptionMenu(0, f.i.top_item_desc_search, f.h.actionbar_icon_dark_search, new GameCategoryUI.2(this));
    }
    this.jUL = ((ListView)findViewById(f.e.game_category_list));
    this.jUL.setOnItemClickListener(this.jUE);
    this.jUE.setSourceScene(this.jNv);
    this.jUL.setOnScrollListener(this.jUS);
    this.jUM = new l(this);
    this.jUM.setSourceScene(this.jNv);
    this.jUM.a(this.jUR);
    this.gPU = ((LayoutInflater)this.mController.tml.getSystemService("layout_inflater")).inflate(f.f.game_list_footer_loading, this.jUL, false);
    this.gPU.setVisibility(8);
    this.jUL.addFooterView(this.gPU);
    this.jUL.setAdapter(this.jUM);
    this.gvJ = c.dD(this);
    this.gvJ.show();
    aUP();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    g.DF().b(1220, this);
    this.jUM.clear();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameCategoryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */