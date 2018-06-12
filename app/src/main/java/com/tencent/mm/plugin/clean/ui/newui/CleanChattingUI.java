package com.tencent.mm.plugin.clean.ui.newui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.clean.c.b;
import com.tencent.mm.plugin.clean.c.d;
import com.tencent.mm.plugin.clean.c.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CleanChattingUI
  extends MMActivity
  implements com.tencent.mm.plugin.clean.c.h
{
  private ProgressDialog eHw;
  private Button eOQ;
  private View gVb;
  private CheckBox gVd;
  private TextView gVe;
  private ListView hSn;
  private TextView hSo;
  private e hTq;
  private a hTt;
  
  public final void a(HashSet<Integer> paramHashSet)
  {
    Object localObject = new HashSet();
    Iterator localIterator = paramHashSet.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      int j = ((Integer)localIterator.next()).intValue();
      if (j < d.aBi().size())
      {
        long l = i;
        i = (int)(((b)d.aBi().get(j)).gTK + l);
      }
      else
      {
        ((HashSet)localObject).add(Integer.valueOf(j));
      }
    }
    localObject = ((HashSet)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramHashSet.remove((Integer)((Iterator)localObject).next());
    }
    if ((paramHashSet.size() != 0) || (i > 0))
    {
      this.hSo.setText(getString(R.l.delete_info, new Object[] { bi.bF(i) }));
      this.eOQ.setEnabled(true);
      if (paramHashSet.size() == this.hTt.getCount())
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
    this.eHw.dismiss();
    d.ci(d.aBm() + paramLong);
    d.cf(d.aBj() - paramLong);
    com.tencent.mm.ui.base.h.a(this, getString(R.l.clean_del_data_ok_tip, new Object[] { bi.bF(paramLong) }), "", new CleanChattingUI.6(this));
  }
  
  public final void cq(int paramInt1, int paramInt2)
  {
    this.eHw.setMessage(getString(R.l.clean_progress_tip, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
  }
  
  protected final int getLayoutId()
  {
    return R.i.clean_chatting_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.hTt.notifyDataSetChanged();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    d.aBp();
    x.i("MicroMsg.CleanChattingUI", "Create!!");
    setMMTitle(R.l.clean_ui_title);
    this.hSn = ((ListView)findViewById(R.h.clean_chatting_lv));
    this.hTt = new a(this);
    this.hSn.setAdapter(this.hTt);
    this.hSn.setEmptyView(findViewById(R.h.empty_view));
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
    this.hSn.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        paramAnonymousAdapterView = new Intent(CleanChattingUI.this, CleanChattingDetailUI.class);
        paramAnonymousAdapterView.putExtra("key_position", paramAnonymousInt);
        CleanChattingUI.this.startActivityForResult(paramAnonymousAdapterView, 0);
      }
    });
    this.eOQ.setOnClickListener(new CleanChattingUI.3(this));
    this.gVb.setOnClickListener(new CleanChattingUI.4(this));
    getString(R.l.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(this, getString(R.l.clean_del_data), false, new CleanChattingUI.5(this));
    this.eHw.dismiss();
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
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/clean/ui/newui/CleanChattingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */