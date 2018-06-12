package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.model.ap.b;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.ui.d.m;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.k;

public class SnsSingleTextViewUI
  extends MMActivity
{
  private String bNH;
  private n.d hqV = new SnsSingleTextViewUI.5(this);
  private ClipboardManager jdw;
  private n nsz;
  private TextView obl;
  private boolean obm = false;
  private SnsTranslateResultView obn;
  private c obo = new SnsSingleTextViewUI.1(this);
  private c obp = new SnsSingleTextViewUI.2(this);
  private c obq = new SnsSingleTextViewUI.3(this);
  protected int requestType = 0;
  private String text;
  
  protected final int getLayoutId()
  {
    return i.g.sns_single_textviewui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jdw = ((ClipboardManager)getSystemService("clipboard"));
    setMMTitle(i.j.sns_all_text);
    setBackBtn(new SnsSingleTextViewUI.4(this));
    this.text = getIntent().getStringExtra("sns_text_show");
    this.bNH = bi.aG(getIntent().getStringExtra("sns_local_id"), "");
    this.nsz = af.byo().Nl(this.bNH);
    if (bi.oW(this.text)) {
      this.text = "";
    }
    this.obl = ((TextView)findViewById(i.f.sns_text_tv));
    this.obl.setText(this.text, TextView.BufferType.SPANNABLE);
    j.g(this.obl, 2);
    this.obl.setOnTouchListener(new m());
    new k(this).a(this.obl, this, this.hqV);
    this.obn = ((SnsTranslateResultView)findViewById(i.f.sns_translate_result_view));
    this.obn.setResultTextSize(this.obl.getTextSize());
    if ((this.nsz != null) && (ap.cd(this.nsz.bAK(), 8)))
    {
      paramBundle = ap.Mq(this.nsz.bAK());
      if ((paramBundle != null) && (paramBundle.dDR))
      {
        this.obn.setVisibility(0);
        this.obn.a(null, 1, paramBundle.result, paramBundle.dMB, false);
        this.obm = true;
      }
    }
    a.sFg.b(this.obo);
    a.sFg.b(this.obp);
    a.sFg.b(this.obq);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    if ((paramView instanceof TextView))
    {
      paramContextMenu.add(0, 0, 0, getString(i.j.app_copy));
      if (d.QS("favorite")) {
        paramContextMenu.add(0, 1, 0, getString(i.j.favorite));
      }
      paramContextMenu.add(0, 6, 1, getString(i.j.app_expose));
      if (!this.obm) {
        ap.a(paramContextMenu, true);
      }
    }
    else
    {
      return;
    }
    ap.b(paramContextMenu, true);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    a.sFg.c(this.obo);
    a.sFg.c(this.obp);
    a.sFg.c(this.obq);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsSingleTextViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */