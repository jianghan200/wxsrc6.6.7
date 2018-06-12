package com.tencent.mm.plugin.fav.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.tencent.mm.plugin.fav.a.ab;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.plugin.fav.ui.d.a.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import java.util.HashSet;
import java.util.Set;

public class FavSelectUI
  extends FavBaseUI
{
  private String jac;
  private com.tencent.mm.plugin.fav.ui.a.b jad = null;
  private Set<Integer> jae = new HashSet();
  private k jaf = new k();
  private String toUser;
  
  public final com.tencent.mm.plugin.fav.ui.a.a aMc()
  {
    if (this.jad == null)
    {
      ActionBarActivity localActionBarActivity = this.mController.tml;
      this.jad = new com.tencent.mm.plugin.fav.ui.a.b(this.iYh, false);
    }
    return this.jad;
  }
  
  protected final void aMd() {}
  
  protected final boolean aMe()
  {
    return ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().getCount() > 0;
  }
  
  protected final void aMf()
  {
    this.iYb.setCompoundDrawablesWithIntrinsicBounds(0, m.d.favorites_empty_favorites_icon, 0, 0);
    this.iYb.setCompoundDrawablePadding(com.tencent.mm.bp.a.fromDPToPix(this.mController.tml, 10));
    this.iYb.setText(m.i.favorite_empty_fav);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 0) && (-1 == paramInt2))
    {
      finish();
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.toUser = getIntent().getStringExtra("key_to_user");
    this.jac = getIntent().getStringExtra("key_fav_item_id");
    if (this.jac != null)
    {
      paramBundle = this.jac.split(",");
      int j = paramBundle.length;
      int i = 0;
      while (i < j)
      {
        int k = bi.getInt(paramBundle[i], Integer.MAX_VALUE);
        if (Integer.MAX_VALUE != k) {
          this.jae.add(Integer.valueOf(k));
        }
        i += 1;
      }
    }
    this.jae.remove(Integer.valueOf(3));
    this.jad.g(this.jae);
    this.jaf.iWc = false;
    this.jad.a(this.jaf);
    this.iYd.post(new FavSelectUI.1(this));
    addIconOptionMenu(0, m.h.actionbar_icon_dark_search, new FavSelectUI.2(this));
    setMMTitle(m.i.favorite_select_title);
    setBackBtn(new FavSelectUI.3(this));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.jad != null) {
      this.jad.finish();
    }
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (a.b)paramView.getTag();
    if (paramAdapterView == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavSelectUI", "on item click, holder is null");
      return;
    }
    if (paramAdapterView.iWQ == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavSelectUI", "on item click, info is null");
      return;
    }
    paramView = paramAdapterView.iWQ;
    h.f(paramView.field_localId, 1, 1);
    if (paramView.field_type == 3)
    {
      com.tencent.mm.ui.widget.snackbar.b.h(this, getString(m.i.Fav_Voice_CannotForward));
      return;
    }
    if ((paramView.field_type == 8) && (com.tencent.mm.model.s.hf(this.toUser)))
    {
      com.tencent.mm.ui.widget.snackbar.b.h(this, getString(m.i.Fav_File_CannotForward));
      return;
    }
    ((ab)com.tencent.mm.kernel.g.l(ab.class)).a(this.mController.tml, this.toUser, paramAdapterView.iWQ, m.i.app_send, true, new FavSelectUI.4(this, paramAdapterView));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/FavSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */