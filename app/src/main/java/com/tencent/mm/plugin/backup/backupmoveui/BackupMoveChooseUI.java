package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.a.f.b;
import com.tencent.mm.plugin.backup.b.b.b;
import com.tencent.mm.plugin.backup.c.b;
import com.tencent.mm.plugin.backup.c.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class BackupMoveChooseUI
  extends MMWizardActivity
  implements b.b
{
  private static int afv = 0;
  private static long endTime;
  private static int gVj = 0;
  private static long startTime;
  private a gUZ = new a(this);
  private ListView gVa;
  private View gVb;
  private TextView gVc;
  private CheckBox gVd;
  private TextView gVe;
  private TextView gVf;
  private RelativeLayout gVg;
  private TextView gVh;
  private ProgressBar gVi;
  private SimpleDateFormat gVk = new SimpleDateFormat("yyyy.MM.dd");
  
  private void dx(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      b.arv();
      localObject = b.aqU();
      gVj = ((SharedPreferences)localObject).getInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
      afv = ((SharedPreferences)localObject).getInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
      startTime = ((SharedPreferences)localObject).getLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
      endTime = ((SharedPreferences)localObject).getLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
    }
    TextView localTextView;
    StringBuilder localStringBuilder;
    switch (gVj)
    {
    default: 
      if (afv == 1)
      {
        localTextView = this.gVh;
        localStringBuilder = new StringBuilder().append(this.gVh.getText());
        if (gVj != 1) {
          break label239;
        }
      }
      break;
    }
    label239:
    for (Object localObject = ";";; localObject = "")
    {
      localTextView.setText((String)localObject + this.mController.tml.getResources().getString(R.l.backup_move_select_ext_content_text_only_short));
      return;
      this.gVh.setText("");
      break;
      this.gVh.setText(this.gVk.format(new Date(startTime)) + "~" + this.gVk.format(new Date(endTime - 86400000L)));
      break;
    }
  }
  
  public final void a(HashSet<Integer> paramHashSet)
  {
    Object localObject = b.arv().arz().arr();
    if (localObject == null)
    {
      x.e("MicroMsg.BackupMoveChooseUI", "onClickCheckBox convInfo is null.");
      return;
    }
    HashSet localHashSet = new HashSet();
    Iterator localIterator = paramHashSet.iterator();
    long l = 0L;
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if (i < ((LinkedList)localObject).size()) {
        l = ((f.b)((LinkedList)localObject).get(i)).gRL + l;
      } else {
        localHashSet.add(Integer.valueOf(i));
      }
    }
    localObject = localHashSet.iterator();
    while (((Iterator)localObject).hasNext()) {
      paramHashSet.remove((Integer)((Iterator)localObject).next());
    }
    if ((paramHashSet.size() != 0) || (l > 0L))
    {
      enableOptionMenu(true);
      if (paramHashSet.size() == this.gUZ.getCount()) {
        this.gVd.setChecked(true);
      }
      for (;;)
      {
        this.gVc.setText(getString(R.l.backup_choose_session_info, new Object[] { Integer.valueOf(paramHashSet.size()) }));
        return;
        this.gVd.setChecked(false);
      }
    }
    enableOptionMenu(false);
    this.gVd.setChecked(false);
    this.gVc.setText("");
  }
  
  public final void a(LinkedList<f.b> paramLinkedList, f.b paramb, int paramInt) {}
  
  protected final int getLayoutId()
  {
    return R.i.backup_choose;
  }
  
  public final void initView()
  {
    setMMTitle(R.l.backup_start_choose_move_records);
    this.gVa = ((ListView)findViewById(R.h.backup_choose_conversation_lv));
    this.gVa.setAdapter(this.gUZ);
    this.gVa.setEmptyView(findViewById(R.h.backup_choose_empty_view));
    this.gVb = findViewById(R.h.backup_choose_select_all_click_area);
    this.gVc = ((TextView)findViewById(R.h.backup_choose_session_info_tv));
    this.gVd = ((CheckBox)findViewById(R.h.backup_choose_select_all_cb));
    this.gVe = ((TextView)findViewById(R.h.backup_choose_select_all_tv));
    this.gVf = ((TextView)findViewById(R.h.backup_choose_empty_tv));
    this.gVi = ((ProgressBar)findViewById(R.h.backup_choose_loading_pb));
    this.gVg = ((RelativeLayout)findViewById(R.h.backup_choose_ext_rl));
    this.gVh = ((TextView)findViewById(R.h.backup_choose_ext_info_tv));
    if (!w.chL())
    {
      this.gVc.setTextSize(1, 14.0F);
      this.gVe.setTextSize(1, 14.0F);
    }
    setBackBtn(new BackupMoveChooseUI.1(this));
    a(0, getString(R.l.bak_chat_choose_finish), new BackupMoveChooseUI.2(this), s.b.tmX);
    enableOptionMenu(false);
    dx(true);
    this.gVg.setOnClickListener(new BackupMoveChooseUI.3(this));
    this.gVb.setOnClickListener(new BackupMoveChooseUI.4(this));
    if (b.arv().arz().gTz)
    {
      if ((b.arv().arz().arr() == null) || (b.arv().arz().arr().size() == 0)) {
        switch (gVj)
        {
        }
      }
      for (;;)
      {
        this.gVf.setVisibility(0);
        this.gVi.setVisibility(4);
        return;
        this.gVf.setText(R.l.backup_move_choose_empty_records);
        continue;
        this.gVf.setText(R.l.backup_select_empty_records_in_select_time);
      }
    }
    if (!b.arv().arz().gTz)
    {
      this.gVd.setClickable(false);
      this.gVd.setVisibility(4);
      this.gVe.setVisibility(4);
      this.gVi.setVisibility(0);
      return;
    }
    this.gVi.setVisibility(4);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {
      x.e("MicroMsg.BackupMoveChooseUI", "onActivityResult result error! resultCode:%d", new Object[] { Integer.valueOf(paramInt2) });
    }
    long l1;
    long l2;
    do
    {
      return;
      paramInt1 = gVj;
      l1 = startTime;
      l2 = endTime;
      gVj = paramIntent.getIntExtra("BACKUP_SELECT_TIME_MODE", gVj);
      startTime = paramIntent.getLongExtra("BACKUP_SELECT_TIME_START_TIME", 0L);
      endTime = paramIntent.getLongExtra("BACKUP_SELECT_TIME_END_TIME", 0L);
      afv = paramIntent.getIntExtra("BACKUP_SELECT_CONTENT_TYPE", afv);
      x.i("MicroMsg.BackupMoveChooseUI", "onActivityResult timeMode/preTimeMode[%d/%d], startTime/preStartTime[%d/%d], endTime/preEndTime[%d/%d], contentType[%d]", new Object[] { Integer.valueOf(gVj), Integer.valueOf(paramInt1), Long.valueOf(startTime), Long.valueOf(l1), Long.valueOf(endTime), Long.valueOf(l2), Integer.valueOf(afv) });
      b.arv().arx();
      d.c(gVj, startTime, endTime, afv);
      dx(false);
    } while ((paramInt1 == gVj) && ((gVj == 0) || ((gVj == 1) && (startTime == l1) && (endTime == l2))));
    b.arv().arz().a(gVj, startTime, endTime, b.arv().arz().arq());
    paramIntent = this.gUZ;
    paramIntent.gUV.clear();
    paramIntent.gUU.a(paramIntent.gUV);
    if ((b.arv().arz().arr() == null) || (b.arv().arz().arr().size() == 0)) {
      switch (gVj)
      {
      default: 
        this.gVf.setVisibility(0);
      }
    }
    for (;;)
    {
      this.gUZ.notifyDataSetChanged();
      return;
      this.gVf.setText(R.l.backup_move_choose_empty_records);
      break;
      this.gVf.setText(R.l.backup_select_empty_records_in_select_time);
      break;
      this.gVf.setVisibility(4);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onStart()
  {
    super.onStart();
    b.arv().arz().gTu = this;
  }
  
  public void onStop()
  {
    super.onStop();
    b.arv().arz().gTu = null;
  }
  
  public final void y(LinkedList<f.b> paramLinkedList)
  {
    if (paramLinkedList == null) {
      return;
    }
    if (paramLinkedList.size() == 0)
    {
      this.gVi.setVisibility(8);
      this.gVf.setVisibility(0);
      switch (gVj)
      {
      default: 
        return;
      case 0: 
        this.gVf.setText(R.l.backup_move_choose_empty_records);
        return;
      }
      this.gVf.setText(R.l.backup_select_empty_records_in_select_time);
      return;
    }
    this.gVd.setClickable(true);
    this.gVd.setVisibility(0);
    this.gVe.setVisibility(0);
    this.gVi.setVisibility(8);
    this.gUZ.notifyDataSetChanged();
  }
  
  public final void z(LinkedList<f.b> paramLinkedList) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */