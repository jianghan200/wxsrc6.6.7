package com.tencent.mm.plugin.fts.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout;
import com.tencent.mm.modelvoiceaddr.ui.b;
import com.tencent.mm.modelvoiceaddr.ui.b.a;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.s;

@a(19)
public abstract class FTSBaseVoiceSearchUI
  extends MMActivity
  implements b.a, d.a, e
{
  String bWm;
  private VoiceSearchLayout erK;
  private b hpe;
  private ag jvE = new FTSBaseVoiceSearchUI.3(this);
  ListView jwh;
  private d jwi;
  TextView jwj;
  private boolean jwk = false;
  private RelativeLayout jwo;
  
  public void K(int paramInt, boolean paramBoolean)
  {
    x.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onEnd resultCount=%d | isFinished=%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      aQL();
      if (paramInt > 0) {
        aQF();
      }
    }
    for (;;)
    {
      if (this.jwk)
      {
        this.jwk = false;
        this.jwh.setSelection(0);
      }
      return;
      aQE();
      continue;
      if (paramInt > 0)
      {
        aQF();
        aQK();
      }
      else
      {
        aQD();
        aQL();
      }
    }
  }
  
  public final void Uq()
  {
    x.d("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onVoiceSearchStart");
    aQI();
  }
  
  public final void Ur()
  {
    x.d("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onVoiceSearchCancel");
    aQJ();
    com.tencent.mm.plugin.fts.a.e.qf(3);
  }
  
  public final void WW()
  {
    x.d("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onQuitSearch");
    finish();
  }
  
  public final void WX()
  {
    x.d("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onEnterSearch");
  }
  
  public final void WY() {}
  
  public final void WZ() {}
  
  protected abstract d a(e parame);
  
  public void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    x.d("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onVoiceReturn");
    aQJ();
  }
  
  protected void aQB() {}
  
  protected void aQD()
  {
    this.jwj.setVisibility(8);
    if (this.jwo != null) {
      this.jwo.setVisibility(8);
    }
    this.jwh.setVisibility(8);
  }
  
  protected void aQE()
  {
    this.jwj.setVisibility(0);
    this.jwj.setText(f.a(getString(n.g.search_contact_no_result_pre), getString(n.g.search_contact_no_result_post), com.tencent.mm.plugin.fts.a.a.d.b(this.bWm, this.bWm)).jrO);
    if (this.jwo != null) {
      this.jwo.setVisibility(8);
    }
    this.jwh.setVisibility(8);
  }
  
  protected void aQF()
  {
    this.jwj.setVisibility(8);
    if (this.jwo != null) {
      this.jwo.setVisibility(8);
    }
    this.jwh.setVisibility(0);
  }
  
  protected void aQG()
  {
    this.jwj.setVisibility(8);
    if (this.jwo != null) {
      this.jwo.setVisibility(8);
    }
    this.jwh.setVisibility(8);
  }
  
  protected abstract boolean aQH();
  
  protected void aQI()
  {
    this.jwj.setVisibility(8);
    if (this.jwo != null) {
      this.jwo.setVisibility(0);
    }
    this.jwh.setVisibility(8);
  }
  
  protected void aQJ()
  {
    this.jwj.setVisibility(8);
    if (this.jwo != null) {
      this.jwo.setVisibility(8);
    }
    this.jwh.setVisibility(8);
  }
  
  protected void aQK() {}
  
  protected void aQL() {}
  
  protected void aQy()
  {
    this.jwk = true;
    this.jwi.CN(this.bWm);
    aQD();
  }
  
  protected View ayg()
  {
    return null;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    cqi();
    setMMTitle("");
    lF(this.mController.tml.getResources().getColor(n.a.normal_actionbar_color));
    aQB();
    this.hpe = new b();
    this.hpe.mv(true);
    this.hpe.a(this);
    this.hpe.erG = aQH();
    this.jwh = ((ListView)findViewById(n.d.search_result_lv));
    if (ayg() != null)
    {
      x.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "searchResultLV addFooterView");
      this.jwh.addFooterView(ayg());
    }
    this.jwi = a(this);
    this.jwi.jwg = this;
    this.jwh.setAdapter(this.jwi);
    this.jwh.setOnScrollListener(this.jwi);
    this.jwh.setOnItemClickListener(this.jwi);
    this.jwh.setOnTouchListener(new FTSBaseVoiceSearchUI.1(this));
    if (aQH())
    {
      this.erK = new VoiceSearchLayout(this);
      paramBundle = new RelativeLayout.LayoutParams(-1, -1);
      paramBundle.addRule(14);
      this.erK.setLayoutParams(paramBundle);
      this.erK.setTopMargin(BackwardSupportUtil.b.b(this, 100.0F));
      this.erK.setBackgroundColor(getResources().getColor(n.a.BW_95));
      this.erK.setVisibility(8);
      this.hpe.o(this.erK);
      this.jwo = ((RelativeLayout)findViewById(n.d.voice_search_view));
      this.jwo.addView(this.erK);
    }
    this.jwj = ((TextView)findViewById(n.d.no_result_view));
    setBackBtn(new FTSBaseVoiceSearchUI.2(this));
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    this.hpe.a(this, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    this.jvE.removeMessages(1);
    this.jwi.finish();
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    this.hpe.cancel();
    this.hpe.clearFocus();
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    this.hpe.a(this, paramMenu);
    return true;
  }
  
  public boolean pj(String paramString)
  {
    x.d("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onSearchKeyDown %s", new Object[] { paramString });
    YC();
    if (this.hpe != null) {
      this.hpe.clearFocus();
    }
    return false;
  }
  
  public final void pk(String paramString)
  {
    x.v("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onSearchChange %s", new Object[] { paramString });
    if (bi.oW(paramString))
    {
      if (!this.hpe.czu())
      {
        this.hpe.czv();
        showVKB();
      }
      aQG();
    }
    paramString = com.tencent.mm.plugin.fts.a.d.Cw(paramString);
    if ((!bi.oW(this.bWm)) && (this.bWm.equals(paramString)))
    {
      x.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "Same query %s %s", new Object[] { this.bWm, paramString });
      return;
    }
    this.bWm = paramString;
    if (!bi.oW(this.bWm))
    {
      this.jvE.removeMessages(1);
      this.jvE.sendEmptyMessageDelayed(1, 300L);
      return;
    }
    this.jvE.removeMessages(1);
    this.jwk = false;
    this.jwi.stopSearch();
    aQG();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */