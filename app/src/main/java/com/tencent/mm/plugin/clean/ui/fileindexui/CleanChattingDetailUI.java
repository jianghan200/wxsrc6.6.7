package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.gridviewheaders.GridHeadersGridView;
import com.tencent.mm.ui.widget.textview.MMAutoAdjustTextView;

public class CleanChattingDetailUI
  extends MMActivity
  implements com.tencent.mm.plugin.clean.c.h
{
  private ProgressDialog eHw;
  private Button eOQ;
  private View gVb;
  CheckBox gVd;
  private long hQF;
  private GridHeadersGridView hSf;
  private b hSg;
  MMAutoAdjustTextView hSh;
  private com.tencent.mm.plugin.clean.b.b hSi;
  private int pos;
  private String username;
  
  public final void ck(long paramLong)
  {
    x.i("MicroMsg.CleanChattingDetailUI", "%s onDeleteEnd [%d] ", new Object[] { hashCode(), Long.valueOf(paramLong) });
    j.aBt().hQD -= paramLong;
    j.aBt().hQC -= paramLong;
    this.hQF += paramLong;
    ah.A(new CleanChattingDetailUI.6(this, paramLong));
  }
  
  public final void cq(int paramInt1, int paramInt2)
  {
    ah.A(new CleanChattingDetailUI.5(this, paramInt1, paramInt2));
  }
  
  protected final int getLayoutId()
  {
    return R.i.clean_chatting_detail_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.username = getIntent().getStringExtra("key_username");
    this.pos = getIntent().getIntExtra("key_pos", 0);
    if (bi.oW(this.username))
    {
      x.w("MicroMsg.CleanChattingDetailUI", "username is null");
      finish();
      return;
    }
    this.gVb = ((View)findViewById(R.h.all_select_click_area));
    this.gVd = ((CheckBox)findViewById(R.h.all_select_cb));
    this.hSh = ((MMAutoAdjustTextView)findViewById(R.h.delete_info_tv));
    this.eOQ = ((Button)findViewById(R.h.del_btn));
    op(0);
    if (s.fq(this.username)) {
      setMMTitle(r.getDisplayName(this.username, this.username));
    }
    for (;;)
    {
      this.hSf = ((GridHeadersGridView)findViewById(R.h.clean_chatting_detail_gv));
      this.hSf.setNumColumns(3);
      this.hSg = new b(this, this.username);
      this.hSf.setOnHeaderClickListener(this.hSg.hRU);
      this.hSf.setOnItemClickListener(this.hSg.hpE);
      this.hSf.setOnScrollListener(this.hSg.hRW);
      this.hSf.setAdapter(this.hSg);
      setBackBtn(new CleanChattingDetailUI.1(this));
      this.gVb.setOnClickListener(new CleanChattingDetailUI.2(this));
      this.eOQ.setOnClickListener(new CleanChattingDetailUI.3(this));
      getString(R.l.app_tip);
      this.eHw = com.tencent.mm.ui.base.h.a(this, getString(R.l.clean_del_data), false, new CleanChattingDetailUI.4(this));
      this.eHw.dismiss();
      if (this.hSg != null) {
        e.post(new b.b(this.hSg, (byte)0), "load_clean_detail");
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(714L, 30L, 1L, false);
      return;
      setMMTitle(r.gT(this.username));
    }
  }
  
  protected void onDestroy()
  {
    if ((this.eHw != null) && (this.eHw.isShowing())) {
      this.eHw.dismiss();
    }
    if (this.hSg != null) {
      this.hSg.isStop = true;
    }
    super.onDestroy();
  }
  
  public final void op(int paramInt)
  {
    if (paramInt > 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.eOQ.setEnabled(bool);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */