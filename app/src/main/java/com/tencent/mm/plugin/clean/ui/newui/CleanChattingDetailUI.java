package com.tencent.mm.plugin.clean.ui.newui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.clean.c.d;
import com.tencent.mm.plugin.clean.c.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.gridviewheaders.GridHeadersGridView;
import com.tencent.mm.ui.widget.textview.MMAutoAdjustTextView;
import java.util.ArrayList;
import java.util.HashSet;

public class CleanChattingDetailUI
  extends MMActivity
  implements com.tencent.mm.plugin.clean.c.h
{
  private ProgressDialog eHw;
  private Button eOQ;
  private View gVb;
  CheckBox gVd;
  private GridHeadersGridView hSf;
  MMAutoAdjustTextView hSh;
  private b hTo;
  private com.tencent.mm.plugin.clean.c.b hTp;
  private e hTq;
  private int index;
  
  public final void ck(long paramLong)
  {
    this.eHw.dismiss();
    d.ci(d.aBm() + paramLong);
    d.cf(d.aBj() - paramLong);
    com.tencent.mm.ui.base.h.a(this, getString(R.l.clean_del_data_ok_tip, new Object[] { bi.bF(paramLong) }), "", new CleanChattingDetailUI.5(this));
  }
  
  public final void cq(int paramInt1, int paramInt2)
  {
    this.eHw.setMessage(getString(R.l.clean_progress_tip, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
  }
  
  protected final int getLayoutId()
  {
    return R.i.clean_chatting_detail_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    d.aBp();
    this.index = getIntent().getIntExtra("key_position", -1);
    if (this.index < 0)
    {
      finish();
      return;
    }
    if (d.aBi() == null)
    {
      finish();
      return;
    }
    this.gVb = findViewById(R.h.all_select_click_area);
    this.gVd = ((CheckBox)findViewById(R.h.all_select_cb));
    this.hSh = ((MMAutoAdjustTextView)findViewById(R.h.delete_info_tv));
    this.eOQ = ((Button)findViewById(R.h.del_btn));
    op(0);
    this.hTp = ((com.tencent.mm.plugin.clean.c.b)d.aBi().get(this.index));
    if (s.fq(this.hTp.username)) {
      setMMTitle(r.getDisplayName(this.hTp.username, this.hTp.username));
    }
    for (;;)
    {
      this.hSf = ((GridHeadersGridView)findViewById(R.h.clean_chatting_detail_gv));
      this.hSf.setNumColumns(3);
      this.hTo = new b(this, this.hTp.hQM);
      this.hSf.setOnHeaderClickListener(this.hTo.hRU);
      this.hSf.setOnItemClickListener(this.hTo.hpE);
      this.hSf.setOnScrollListener(this.hTo.hRW);
      this.hSf.setAdapter(this.hTo);
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          CleanChattingDetailUI.this.finish();
          return false;
        }
      });
      this.gVb.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = CleanChattingDetailUI.a(CleanChattingDetailUI.this);
          if (paramAnonymousView.gUV.size() == paramAnonymousView.gvR.size()) {
            paramAnonymousView.gUV.clear();
          }
          for (;;)
          {
            paramAnonymousView.aBx();
            CleanChattingDetailUI.a(CleanChattingDetailUI.this).notifyDataSetChanged();
            return;
            int i = 0;
            while (i < paramAnonymousView.gvR.size())
            {
              paramAnonymousView.gUV.add(Integer.valueOf(i));
              i += 1;
            }
          }
        }
      });
      this.eOQ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          com.tencent.mm.ui.base.h.a(CleanChattingDetailUI.this, CleanChattingDetailUI.this.getString(R.l.confirm_delete_file), "", CleanChattingDetailUI.this.getString(R.l.delete), CleanChattingDetailUI.this.getString(R.l.cancel), new CleanChattingDetailUI.3.1(this), new CleanChattingDetailUI.3.2(this));
        }
      });
      getString(R.l.app_tip);
      this.eHw = com.tencent.mm.ui.base.h.a(this, getString(R.l.clean_del_data), false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface) {}
      });
      this.eHw.dismiss();
      return;
      setMMTitle(r.gT(this.hTp.username));
    }
  }
  
  protected void onDestroy()
  {
    if (this.eHw.isShowing()) {
      this.eHw.dismiss();
    }
    if (this.hTq != null) {
      this.hTq.aBr();
    }
    d.aBq();
    d.aBo();
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/clean/ui/newui/CleanChattingDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */