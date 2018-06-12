package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CleanChattingUI
  extends MMActivity
  implements com.tencent.mm.plugin.clean.c.h
{
  private List<c> dataList = new ArrayList();
  private ProgressDialog eHw;
  private Button eOQ;
  private View gVb;
  private CheckBox gVd;
  private TextView gVe;
  private a hSm;
  private ListView hSn;
  private TextView hSo;
  private TextView hSp;
  private boolean hSq = false;
  
  public final void a(HashSet<Integer> paramHashSet)
  {
    if (this.hSm == null)
    {
      x.w("MicroMsg.CleanChattingUI", "on click check box but adapter is null");
      return;
    }
    Object localObject = new HashSet();
    Iterator localIterator = paramHashSet.iterator();
    long l = 0L;
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      c localc = this.hSm.om(i);
      if (localc != null) {
        l = localc.size + l;
      } else {
        ((HashSet)localObject).add(Integer.valueOf(i));
      }
    }
    localObject = ((HashSet)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramHashSet.remove((Integer)((Iterator)localObject).next());
    }
    if ((paramHashSet.size() != 0) || (l > 0L))
    {
      this.hSo.setText(getString(R.l.delete_info, new Object[] { bi.bF(l) }));
      this.eOQ.setEnabled(true);
      if (paramHashSet.size() == this.hSm.getCount())
      {
        this.gVd.setChecked(true);
        return;
      }
      this.gVd.setChecked(false);
      return;
    }
    this.hSo.setText("");
    this.eOQ.setEnabled(false);
    this.gVd.setChecked(false);
  }
  
  public final void ck(long paramLong)
  {
    x.i("MicroMsg.CleanChattingUI", "%s onDeleteEnd [%d] ", new Object[] { hashCode(), Long.valueOf(paramLong) });
    j.aBt().hQD -= paramLong;
    j.aBt().hQC -= paramLong;
    ah.A(new CleanChattingUI.8(this, paramLong));
  }
  
  public final void cq(final int paramInt1, final int paramInt2)
  {
    ah.A(new Runnable()
    {
      public final void run()
      {
        CleanChattingUI.g(CleanChattingUI.this).setMessage(CleanChattingUI.this.getString(R.l.clean_progress_tip, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
      }
    });
  }
  
  protected final int getLayoutId()
  {
    return R.i.clean_chatting_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    long l;
    c localc;
    if (paramIntent != null)
    {
      int i = paramIntent.getIntExtra("key_pos", -1);
      l = paramIntent.getLongExtra("key_delete_size", 0L);
      if ((i > 0) && (i < this.dataList.size()))
      {
        localc = (c)this.dataList.get(i);
        if (localc != null)
        {
          if (localc.size != l) {
            break label102;
          }
          this.dataList.remove(i);
        }
      }
    }
    for (;;)
    {
      this.hSm.notifyDataSetChanged();
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      label102:
      localc.size -= l;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.CleanChattingUI", "Create!!");
    setMMTitle(R.l.clean_msg_ui_title);
    this.hSn = ((ListView)findViewById(R.h.clean_chatting_lv));
    this.hSm = new a(this, this.dataList);
    this.hSn.setAdapter(this.hSm);
    this.hSn.setEmptyView(findViewById(R.h.empty_view));
    this.hSp = ((TextView)findViewById(R.h.empty_tip));
    this.gVb = findViewById(R.h.all_select_click_area);
    this.hSo = ((TextView)findViewById(R.h.delete_info_tv));
    this.gVd = ((CheckBox)findViewById(R.h.all_select_cb));
    this.gVe = ((TextView)findViewById(R.h.all_select));
    if (!w.chL())
    {
      this.hSo.setTextSize(1, 14.0F);
      this.gVe.setTextSize(1, 14.0F);
    }
    this.eOQ = ((Button)findViewById(R.h.del_btn));
    this.eOQ.setEnabled(false);
    setBackBtn(new CleanChattingUI.1(this));
    this.hSn.setOnItemClickListener(new CleanChattingUI.2(this));
    this.eOQ.setOnClickListener(new CleanChattingUI.3(this));
    this.gVb.setOnClickListener(new CleanChattingUI.4(this));
    getString(R.l.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(this, getString(R.l.clean_del_data), false, new CleanChattingUI.5(this));
    this.eHw.dismiss();
    com.tencent.mm.plugin.report.service.h.mEJ.a(714L, 20L, 1L, false);
  }
  
  protected void onDestroy()
  {
    if (this.eHw.isShowing()) {
      this.eHw.dismiss();
    }
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
    if ((this.hSm != null) && (this.dataList.isEmpty())) {
      g.Em().H(new CleanChattingUI.6(this));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */