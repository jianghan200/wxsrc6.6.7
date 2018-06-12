package com.tencent.mm.plugin.fts.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.a;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a.a;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.List;

public abstract class FTSBaseUI
  extends MMActivity
  implements d.a, e, FTSEditTextView.a, a.a
{
  String bWm;
  private ag jvE = new FTSBaseUI.3(this);
  ListView jwh;
  private d jwi;
  private TextView jwj;
  private boolean jwk = false;
  com.tencent.mm.plugin.fts.ui.widget.a jwl;
  String jwm = null;
  
  protected void CO(String paramString)
  {
    if (!bi.oW(paramString))
    {
      this.bWm = paramString;
      this.jvE.removeMessages(1);
      this.jvE.sendEmptyMessageDelayed(1, 300L);
      return;
    }
    stopSearch();
  }
  
  public final void K(int paramInt, boolean paramBoolean)
  {
    x.i("MicroMsg.FTS.FTSBaseUI", "onEnd resultCount=%d | isFinished=%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
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
      if (paramInt > 0) {
        aQF();
      } else {
        aQD();
      }
    }
  }
  
  protected abstract d a(e parame);
  
  public void a(com.tencent.mm.plugin.fts.a.d.a.a parama) {}
  
  public void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    if (paramb == FTSEditTextView.b.jzB)
    {
      paramString1 = com.tencent.mm.plugin.fts.a.d.Cw(paramString1);
      if ((!bi.oW(this.bWm)) && (this.bWm.equals(paramString1))) {
        x.i("MicroMsg.FTS.FTSBaseUI", "Same query %s %s", new Object[] { this.bWm, paramString1 });
      }
    }
    else
    {
      return;
    }
    CO(paramString1);
  }
  
  protected void aQB() {}
  
  public final void aQC() {}
  
  protected void aQD()
  {
    this.jwj.setVisibility(8);
    this.jwh.setVisibility(8);
  }
  
  protected void aQE()
  {
    this.jwj.setVisibility(0);
    this.jwj.setText(f.a(getString(n.g.search_contact_no_result_pre), getString(n.g.search_contact_no_result_post), com.tencent.mm.plugin.fts.a.a.d.b(this.bWm, this.bWm)).jrO);
    this.jwh.setVisibility(8);
  }
  
  protected void aQF()
  {
    this.jwj.setVisibility(8);
    this.jwh.setVisibility(0);
  }
  
  protected void aQG()
  {
    this.jwj.setVisibility(8);
    this.jwh.setVisibility(8);
  }
  
  protected void aQy()
  {
    this.jwk = true;
    this.jwi.CN(this.bWm);
    aQD();
  }
  
  public boolean anx()
  {
    YC();
    this.jwl.getFtsEditText().jzo.clearFocus();
    return false;
  }
  
  public final void fg(boolean paramBoolean) {}
  
  public String getHint()
  {
    if (this.jwm != null) {
      return this.jwm;
    }
    return getString(n.g.app_search);
  }
  
  protected final void i(String paramString, List<a.b> paramList)
  {
    this.bWm = paramString;
    this.jwl.getFtsEditText().j(paramString, paramList);
  }
  
  public void onClickBackBtn(View paramView)
  {
    finish();
  }
  
  public void onClickCancelBtn(View paramView) {}
  
  public void onClickClearTextBtn(View paramView)
  {
    stopSearch();
    this.jwl.getFtsEditText().aQU();
    showVKB();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    cqi();
    setMMTitle("");
    lF(android.support.v4.content.a.g(this.mController.tml, n.a.normal_actionbar_color));
    cqh();
    aQB();
    this.jwl = new com.tencent.mm.plugin.fts.ui.widget.a(this);
    this.jwl.setSearchViewListener(this);
    this.jwl.getFtsEditText().setHint(getHint());
    this.jwl.getFtsEditText().setFtsEditTextListener(this);
    this.jwl.getFtsEditText().setCanDeleteTag(false);
    getSupportActionBar().setCustomView(this.jwl);
    this.jwh = ((ListView)findViewById(n.d.search_result_lv));
    this.jwi = a(this);
    this.jwi.jwg = this;
    this.jwh.setAdapter(this.jwi);
    this.jwh.setOnScrollListener(this.jwi);
    this.jwh.setOnItemClickListener(this.jwi);
    this.jwh.setOnTouchListener(new FTSBaseUI.1(this));
    this.jwj = ((TextView)findViewById(n.d.no_result_view));
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        FTSBaseUI.this.finish();
        return true;
      }
    });
  }
  
  protected void onDestroy()
  {
    this.jvE.removeMessages(1);
    this.jwi.finish();
    super.onDestroy();
  }
  
  protected void stopSearch()
  {
    this.bWm = "";
    this.jvE.removeMessages(1);
    this.jwk = false;
    this.jwi.stopSearch();
    this.jwl.getFtsEditText().setHint(getHint());
    aQG();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/FTSBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */