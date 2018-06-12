package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.n;
import com.tencent.mm.plugin.fav.ui.FavDetailFooterView;
import com.tencent.mm.plugin.fav.ui.FavVoiceBaseView;
import com.tencent.mm.plugin.fav.ui.m.d;
import com.tencent.mm.plugin.fav.ui.m.e;
import com.tencent.mm.plugin.fav.ui.m.f;
import com.tencent.mm.plugin.fav.ui.m.i;
import com.tencent.mm.plugin.fav.ui.widget.FavDetailTitleView;
import com.tencent.mm.plugin.fav.ui.widget.FavTagEntrance;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wy;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import java.util.LinkedList;

public class FavoriteVoiceDetailUI
  extends BaseFavDetailReportUI
  implements j.a
{
  private com.tencent.mm.plugin.fav.a.g iWQ;
  private n iXl;
  private FavDetailTitleView jcK;
  private FavDetailFooterView jcL;
  private FavTagEntrance jcM;
  private FavVoiceBaseView jdR;
  private long jdk;
  
  public final void a(String paramString, l paraml)
  {
    this.iWQ = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(this.jdk);
    if (this.iWQ == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteDetailUI", "on notify changed, get fav item info error");
      finish();
    }
    while ((this.iWQ.field_itemStatus != 10) || (paraml == null) || (paraml.sKL == null) || (this.iWQ.field_favProto.rBI.size() <= 0)) {
      return;
    }
    paramString = b.c(this.iWQ);
    paraml = b.b(paramString);
    int i = b.Be(paramString.rzD);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteDetailUI", "on notify changed, favVoiceView.updateInfo");
    this.jdR.P(paraml, i, paramString.duration);
  }
  
  protected final int getLayoutId()
  {
    return m.f.favorite_voice_detail_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(getString(m.i.favorite_detail));
    this.jdk = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.iWQ = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(this.jdk);
    if (this.iWQ == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteDetailUI", "get fav item info error");
      finish();
    }
    for (;;)
    {
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().c(this);
      if (this.jcM != null) {
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().c(this.jcM);
      }
      return;
      F(this.iWQ);
      this.jcK = ((FavDetailTitleView)findViewById(m.e.fav_detail_title));
      this.jcK.D(this.iWQ);
      this.jcL = ((FavDetailFooterView)findViewById(m.e.fav_detail_footer));
      this.jcL.D(this.iWQ);
      this.iXl = new n();
      this.jdR = ((FavVoiceBaseView)findViewById(m.e.voice_player));
      this.jdR.setVoiceHelper(this.iXl);
      paramBundle = b.c(this.iWQ);
      String str = b.b(paramBundle);
      int i = b.Be(paramBundle.rzD);
      if (!e.cn(str)) {
        b.m(this.iWQ);
      }
      this.jdR.P(str, i, paramBundle.duration);
      this.jcM = ((FavTagEntrance)findViewById(m.e.fav_tag_entrance));
      this.jcM.setFavItemID(this.iWQ.field_localId);
      this.jcM.setTagContent(this.iWQ.field_tagProto.rBX);
      setBackBtn(new FavoriteVoiceDetailUI.1(this));
      addIconOptionMenu(0, m.i.top_item_desc_more, m.d.mm_title_btn_menu, new FavoriteVoiceDetailUI.2(this));
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.jdR.stopPlay();
    this.iXl.destroy();
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().d(this);
    if (this.jcM != null) {
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().d(this.jcM);
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    this.jdR.aLs();
    this.iXl.pause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/detail/FavoriteVoiceDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */