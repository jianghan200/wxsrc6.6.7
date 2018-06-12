package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
import com.tencent.mm.ui.s;

public class FTSSOSMoreWebViewUI
  extends BaseSOSWebViewUI
{
  private int qdX;
  private View qeG;
  
  protected final void ant()
  {
    super.ant();
    this.qeG = findViewById(R.h.webview_keyboard_ll);
    bXk().czi();
    bXk().aQY();
    this.mPT.setVisibility(0);
    bXk().aQW();
    this.lAV.setVisibility(8);
    this.qdX = com.tencent.mm.bp.a.fromDPToPix(this, 48);
    bXk().setIconRes(com.tencent.mm.au.a.b(getType(), this));
    if (aUM() == 24) {
      this.qeG.setVisibility(4);
    }
    findViewById(R.h.root).setOnTouchListener(new FTSSOSMoreWebViewUI.1(this));
    if ((getIntent() != null) && (getIntent().getBooleanExtra("ftsneedkeyboard", false))) {
      this.mController.contentView.postDelayed(new FTSSOSMoreWebViewUI.2(this), 128L);
    }
    Z(getResources().getColor(R.e.white), true);
    ImageButton localImageButton = bXk().getClearBtn();
    if (localImageButton != null) {
      localImageButton.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
    }
  }
  
  protected final int anu()
  {
    if ((com.tencent.mm.compatible.util.d.fR(23)) && (!com.tencent.mm.ui.statusbar.d.Af())) {
      return getResources().getColor(R.e.white);
    }
    return super.anu();
  }
  
  public boolean anx()
  {
    bXk().aQY();
    this.qeG.setVisibility(0);
    return super.anx();
  }
  
  protected final void bXg()
  {
    finish();
  }
  
  protected final void bXh()
  {
    super.bXh();
    this.qeG.setVisibility(0);
  }
  
  public final void fg(boolean paramBoolean)
  {
    super.fg(paramBoolean);
    if (paramBoolean)
    {
      this.qdi.setPadding(0, 0, this.qdi.getPaddingRight(), 0);
      this.mPT.setVisibility(8);
      bXk().aQX();
    }
    for (;;)
    {
      bXk().aQY();
      return;
      this.qdi.setPadding(this.qdX, 0, this.qdi.getPaddingRight(), 0);
      this.mPT.setVisibility(0);
      bXk().aQW();
    }
  }
  
  public String getHint()
  {
    int i = -1;
    if ((getType() == 8) && (this.qdz)) {
      i = R.l.fts_header_timeline_publisher;
    }
    while (i < 0)
    {
      return ad.getContext().getResources().getString(R.l.app_search) + AT(getType());
      switch (getType())
      {
      default: 
        break;
      case 1: 
        i = R.l.search_education_biz_contact;
        break;
      case 8: 
        i = R.l.fts_header_timeline;
        break;
      case 2: 
        i = R.l.search_education_article;
        break;
      case 16: 
        i = R.l.fts_header_poi;
        break;
      case 64: 
        i = R.l.app_brand_entrance;
        break;
      case 256: 
      case 384: 
        i = R.l.fts_header_emoji;
        break;
      case 128: 
        i = R.l.fts_header_emoji_product;
        break;
      case 512: 
        i = R.l.fts_header_music;
        break;
      case 1024: 
        i = R.l.fts_header_novel;
      }
    }
    return ad.getContext().getResources().getString(R.l.search_detail_page_hint, new Object[] { ad.getContext().getResources().getString(i) });
  }
  
  protected final int getLayoutId()
  {
    return R.i.sos_more_webview_ui;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */