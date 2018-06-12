package com.tencent.mm.plugin.fav.ui.detail;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.a.m.c;
import com.tencent.mm.plugin.fav.a.p;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.plugin.fav.ui.FavDetailFooterView;
import com.tencent.mm.plugin.fav.ui.m.e;
import com.tencent.mm.plugin.fav.ui.m.f;
import com.tencent.mm.plugin.fav.ui.m.h;
import com.tencent.mm.plugin.fav.ui.m.i;
import com.tencent.mm.plugin.fav.ui.widget.FavDetailTitleView;
import com.tencent.mm.plugin.fav.ui.widget.FavTagEntrance;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wy;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMLoadScrollView;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public class FavoriteSightDetailUI
  extends BaseFavDetailReportUI
  implements p, j.a
{
  private vx bOz;
  private com.tencent.mm.plugin.fav.a.k jaf = new com.tencent.mm.plugin.fav.a.k();
  private com.tencent.mm.plugin.fav.a.g jaq;
  private boolean jcp = false;
  private boolean jcv = false;
  private FavDetailTitleView jdc;
  private FavDetailFooterView jdd;
  private FavTagEntrance jde;
  private View jdf;
  private ImageView jdg;
  private MMPinProgressBtn jdh;
  private VideoPlayerTextureView jdi;
  private ImageView jdj;
  private long jdk;
  private boolean jdl = true;
  private boolean jdm = false;
  private Runnable jdn = new FavoriteSightDetailUI.5(this);
  private boolean jdo = false;
  
  private void aMP()
  {
    String str = com.tencent.mm.plugin.fav.a.b.b(this.bOz);
    if (!com.tencent.mm.a.e.cn(str)) {
      return;
    }
    this.jdi.stop();
    this.jdi.setMute(true);
    this.jdi.setVideoPath(str);
  }
  
  @SuppressLint({"ResourceType"})
  private void eW(boolean paramBoolean)
  {
    if (this.jaq.isDone())
    {
      if (com.tencent.mm.plugin.fav.a.b.f(this.bOz))
      {
        this.jdg.setVisibility(8);
        this.jdh.setVisibility(8);
        aMP();
        return;
      }
      if (bi.oW(this.bOz.rzo)) {
        this.jdg.setImageResource(m.h.shortvideo_play_btn);
      }
    }
    for (;;)
    {
      this.jdg.setVisibility(0);
      this.jdh.setVisibility(8);
      this.jdj.setVisibility(0);
      return;
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
      this.jdg.setImageResource(m.h.shortvideo_play_btn);
      continue;
      if (this.jaq.aLh())
      {
        if (bi.oW(this.bOz.rzo))
        {
          this.jdg.setImageResource(m.h.shortvideo_play_btn);
          if (!paramBoolean) {}
        }
        else
        {
          this.jdg.setImageResource(m.h.shortvideo_play_btn);
          if (paramBoolean) {
            com.tencent.mm.ui.base.h.bA(this.mController.tml, getString(m.i.download_fail));
          }
        }
      }
      else if (this.jaq.aLg())
      {
        this.jdg.setImageResource(m.h.shortvideo_play_btn);
        if (paramBoolean) {
          com.tencent.mm.ui.base.h.bA(this.mController.tml, getString(m.i.fav_upload_fail));
        }
      }
      else
      {
        if ((this.jaq.isDownloading()) || (this.jaq.aLf()))
        {
          this.jdg.setVisibility(8);
          this.jdh.setVisibility(0);
          c localc = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(this.bOz.jdM);
          if (localc != null) {
            this.jdh.setProgress((int)localc.getProgress());
          }
          for (;;)
          {
            this.jdj.setVisibility(0);
            return;
            this.jdh.setProgress(0);
          }
        }
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteSightDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        this.jdg.setImageResource(m.h.shortvideo_play_btn);
      }
    }
  }
  
  public final void a(String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteSightDetailUI", "on favitem change, notifyId:%s, curId:%d", new Object[] { paramString, Long.valueOf(this.jaq.field_localId) });
    paramString = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(this.jaq.field_localId);
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteSightDetailUI", "error, on notify change, cannot find info");
      finish();
    }
    for (;;)
    {
      return;
      this.jaq = paramString;
      this.bOz = com.tencent.mm.plugin.fav.a.b.c(paramString);
      paramString = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(this.bOz.jdM);
      boolean bool;
      if (paramString == null) {
        bool = false;
      }
      while (!bool)
      {
        ah.M(this.jdn);
        ah.i(this.jdn, 500L);
        return;
        if (this.jcv)
        {
          bool = false;
        }
        else
        {
          if ((paramString.field_status == 4) && (((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(this.bOz.jdM).field_extFlag != 0))
          {
            com.tencent.mm.plugin.fav.a.b.a(this.jaq, this.bOz, true);
            this.jcv = true;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteSightDetailUI", "FavoriteFileDetail download, check retry, return %B", new Object[] { Boolean.valueOf(this.jcv) });
          bool = this.jcv;
        }
      }
    }
  }
  
  protected final MMLoadScrollView aMI()
  {
    return (MMLoadScrollView)findViewById(m.e.scroll_view);
  }
  
  public final void d(c paramc)
  {
    if ((paramc == null) || (paramc.field_dataId == null))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, item is null");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, dataID is %s, field id is %s,offset is %d, total is %d,cdn status is %d, cdn type is %d (send or recieve)", new Object[] { this.bOz.jdM, paramc.field_dataId, Integer.valueOf(paramc.field_offset), Integer.valueOf(paramc.field_totalLen), Integer.valueOf(paramc.field_status), Integer.valueOf(paramc.field_type) });
    if (paramc.field_offset > paramc.field_totalLen)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, cdn offset length > cdn total length, do cdnLengthError()");
      if (1 != paramc.field_type) {
        break label211;
      }
    }
    label211:
    for (paramc.field_status = 2;; paramc.field_status = 4)
    {
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a(paramc, new String[0]);
      if (paramc.field_type == 0) {
        com.tencent.mm.plugin.fav.a.b.a(paramc);
      }
      if (paramc.field_type == 1) {
        com.tencent.mm.plugin.fav.a.b.b(paramc);
      }
      if (!paramc.field_dataId.equals(this.bOz.jdM)) {
        break;
      }
      int i = (int)paramc.getProgress();
      this.jdh.post(new FavoriteSightDetailUI.6(this, i));
      return;
    }
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return m.f.favorite_sight_detail_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (-1 == paramInt2))
    {
      String str;
      label23:
      Object localObject;
      label87:
      com.tencent.mm.plugin.fav.a.m.d locald;
      if (paramIntent == null)
      {
        str = null;
        if (paramIntent != null) {
          break label142;
        }
        paramIntent = null;
        localObject = new FavoriteSightDetailUI.7(this, com.tencent.mm.ui.base.h.a(this.mController.tml, getString(m.i.favorite_forward_tips), false, null));
        com.tencent.mm.plugin.fav.ui.h.a(this.mController.tml, str, paramIntent, this.jaq, (Runnable)localObject);
        boolean bool = com.tencent.mm.model.s.fq(str);
        if (!bool) {
          break label153;
        }
        paramIntent = m.c.iWy;
        localObject = this.jaq;
        locald = com.tencent.mm.plugin.fav.a.m.d.iWB;
        if (!bool) {
          break label160;
        }
      }
      label142:
      label153:
      label160:
      for (paramInt1 = com.tencent.mm.model.m.gK(str);; paramInt1 = 0)
      {
        com.tencent.mm.plugin.fav.a.m.a(paramIntent, (com.tencent.mm.plugin.fav.a.g)localObject, locald, paramInt1);
        com.tencent.mm.ui.widget.snackbar.b.h(this, getString(m.i.fav_finish_sent));
        return;
        str = paramIntent.getStringExtra("Select_Conv_User");
        break;
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        break label23;
        paramIntent = m.c.iWx;
        break label87;
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    com.tencent.mm.pluginsdk.e.k(this);
    super.onCreate(paramBundle);
    this.jdk = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.jaq = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(this.jdk);
    if (this.jaq == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteSightDetailUI", "id[%d] info is null, return", new Object[] { Long.valueOf(this.jdk) });
      finish();
      return;
    }
    F(this.jaq);
    com.tencent.mm.plugin.fav.a.m.w(this.jaq);
    this.bOz = com.tencent.mm.plugin.fav.a.b.c(this.jaq);
    this.jdc = ((FavDetailTitleView)findViewById(m.e.fav_detail_title));
    this.jdd = ((FavDetailFooterView)findViewById(m.e.fav_detail_footer));
    this.jde = ((FavTagEntrance)findViewById(m.e.fav_tag_entrance));
    this.jdg = ((ImageView)findViewById(m.e.status_btn));
    this.jdh = ((MMPinProgressBtn)findViewById(m.e.video_progress));
    this.jdf = findViewById(m.e.click_area);
    this.jdi = ((VideoPlayerTextureView)findViewById(m.e.video_view));
    this.jdj = ((ImageView)findViewById(m.e.video_thumb));
    this.jde.setFavItemID(this.jaq.field_localId);
    this.jde.setTagContent(this.jaq.field_tagProto.rBX);
    this.jdc.D(this.jaq);
    this.jdd.D(this.jaq);
    this.jdf.setOnClickListener(new FavoriteSightDetailUI.1(this));
    this.jdi.setVideoCallback(new FavoriteSightDetailUI.2(this));
    setMMTitle(getString(m.i.favorite_detail));
    setBackBtn(new FavoriteSightDetailUI.3(this));
    addIconOptionMenu(0, m.i.top_item_desc_more, com.tencent.mm.plugin.fav.ui.m.d.mm_title_btn_menu, new FavoriteSightDetailUI.4(this));
    if (!com.tencent.mm.a.e.cn(com.tencent.mm.plugin.fav.a.b.c(this.bOz))) {
      if (!bi.oW(this.bOz.dwE)) {
        com.tencent.mm.plugin.fav.a.b.a(this.jaq, this.bOz);
      }
    }
    do
    {
      eW(false);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().c(this.jde);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().c(this);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a(this);
      com.tencent.mm.pluginsdk.e.l(this);
      return;
      paramBundle = com.tencent.mm.plugin.fav.ui.k.a(this.bOz, this.jaq);
    } while (paramBundle == null);
    int i = paramBundle.getWidth();
    int j = paramBundle.getHeight();
    DisplayMetrics localDisplayMetrics;
    float f;
    ViewGroup.LayoutParams localLayoutParams;
    if (!this.jdo)
    {
      this.jdo = true;
      localDisplayMetrics = this.jdf.getResources().getDisplayMetrics();
      f = localDisplayMetrics.density;
      localLayoutParams = this.jdf.getLayoutParams();
      if (localLayoutParams != null) {
        break label554;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FavoriteSightDetailUI", "setViewResize, but params is null");
    }
    for (;;)
    {
      this.jdj.setImageBitmap(paramBundle);
      this.jdj.setVisibility(0);
      break;
      label554:
      localLayoutParams.width = (localDisplayMetrics.widthPixels - (int)(f * 36.0F + 0.5F));
      localLayoutParams.height = (j * localLayoutParams.width / i);
      this.jdf.setLayoutParams(localLayoutParams);
    }
  }
  
  protected void onDestroy()
  {
    if (this.jdi != null)
    {
      this.jdi.setVideoCallback(null);
      this.jdi.stop();
    }
    if (this.jde != null) {
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().d(this.jde);
    }
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().d(this);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().b(this);
    super.onDestroy();
  }
  
  protected void onPause()
  {
    if (this.jdi != null) {
      this.jdi.stop();
    }
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.jdi != null)
    {
      if (this.jdl) {
        break label28;
      }
      aMP();
    }
    for (;;)
    {
      this.jdl = false;
      return;
      label28:
      if (!this.jdi.isPlaying()) {
        this.jdi.start();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */