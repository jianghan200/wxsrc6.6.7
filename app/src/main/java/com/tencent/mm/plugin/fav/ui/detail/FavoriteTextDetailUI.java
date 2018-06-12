package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.k.b;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.ui.FavDetailFooterView;
import com.tencent.mm.plugin.fav.ui.m.d;
import com.tencent.mm.plugin.fav.ui.m.e;
import com.tencent.mm.plugin.fav.ui.m.f;
import com.tencent.mm.plugin.fav.ui.m.i;
import com.tencent.mm.plugin.fav.ui.widget.FavDetailTitleView;
import com.tencent.mm.plugin.fav.ui.widget.FavTagEntrance;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wy;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.tools.k;
import com.tencent.mm.ui.widget.MMLoadScrollView;

public class FavoriteTextDetailUI
  extends BaseFavDetailReportUI
{
  private static final int jdu = ;
  private k contextMenuHelper;
  private com.tencent.mm.plugin.fav.a.g jcO;
  private FavDetailTitleView jdc;
  private FavDetailFooterView jdd;
  private FavTagEntrance jde;
  private long jdk;
  private TextView jdv;
  private ClipboardManager jdw;
  private com.tencent.mm.plugin.fav.a.g jdx;
  private n.d jdy = new n.d()
  {
    public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
    {
      switch (paramAnonymousMenuItem.getItemId())
      {
      }
      do
      {
        return;
      } while ((FavoriteTextDetailUI.c(FavoriteTextDetailUI.this) == null) || (FavoriteTextDetailUI.a(FavoriteTextDetailUI.this) == null) || (FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_favProto == null));
      FavoriteTextDetailUI.c(FavoriteTextDetailUI.this).setText(FavoriteTextDetailUI.a(FavoriteTextDetailUI.this).field_favProto.desc);
      h.bA(FavoriteTextDetailUI.this.mController.tml, FavoriteTextDetailUI.this.mController.tml.getString(m.i.app_copy_ok));
    }
  };
  
  private void aMQ()
  {
    this.jcO = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(this.jdk);
    F(this.jcO);
    if ((this.jcO == null) || (this.jcO.field_favProto == null))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteTextDetailUI", "id[%d] info is null, return", new Object[] { Long.valueOf(this.jdk) });
      return;
    }
    this.jde.setFavItemID(this.jcO.field_localId);
    this.jde.setTagContent(this.jcO.field_tagProto.rBX);
    if ((this.jdx != null) && (this.jdx.field_edittime == this.jcO.field_edittime))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteTextDetailUI", "not change, return");
      return;
    }
    this.jdx = this.jcO;
    this.jdc.D(this.jcO);
    this.jdd.D(this.jcO);
    this.jdv.setText(this.jcO.field_favProto.desc);
    j.g(this.jdv, 1);
  }
  
  protected final MMLoadScrollView aMI()
  {
    return (MMLoadScrollView)findViewById(m.e.scroll_view);
  }
  
  protected final int getLayoutId()
  {
    return m.f.favorite_text_detail_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((1 == paramInt1) && (-1 == paramInt2))
    {
      h.bA(this.mController.tml, getString(m.i.app_saved));
      new ag().postDelayed(new FavoriteTextDetailUI.4(this), 250L);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jdv = ((TextView)findViewById(m.e.chat_fav_text_tv));
    this.jdc = ((FavDetailTitleView)findViewById(m.e.fav_detail_title));
    this.jdd = ((FavDetailFooterView)findViewById(m.e.fav_detail_footer));
    this.jde = ((FavTagEntrance)findViewById(m.e.fav_tag_entrance));
    this.jdw = ((ClipboardManager)getSystemService("clipboard"));
    this.jdk = getIntent().getLongExtra("key_detail_info_id", -1L);
    i.Cx(5);
    this.contextMenuHelper = new k(this.mController.tml);
    this.contextMenuHelper.a(this.jdv, this, this.jdy);
    setMMTitle(getString(m.i.favorite_detail));
    setBackBtn(new FavoriteTextDetailUI.1(this));
    addIconOptionMenu(0, m.i.top_item_desc_more, m.d.mm_title_btn_menu, new FavoriteTextDetailUI.2(this));
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().c(this.jde);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    paramContextMenu.add(0, 1, 0, getString(m.i.app_copy));
  }
  
  protected void onDestroy()
  {
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().d(this.jde);
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    aMQ();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/detail/FavoriteTextDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */