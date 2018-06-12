package com.tencent.mm.plugin.backup.backuppcui;

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
import com.tencent.mm.plugin.backup.b.b.a;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.e;
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

@com.tencent.mm.ui.base.a(3)
public class BackupPcChooseUI
  extends MMWizardActivity
{
  private static int afv = 0;
  private static long endTime;
  private static int gVj = 0;
  private static long startTime;
  private View gVb;
  private TextView gVc;
  private CheckBox gVd;
  private TextView gVe;
  private TextView gVf;
  private RelativeLayout gVg;
  private TextView gVh;
  private ProgressBar gVi;
  private SimpleDateFormat gVk = new SimpleDateFormat("yyyy.MM.dd");
  private a gXd = new a(this);
  private ListView gXe;
  private b.a gXf = new BackupPcChooseUI.5(this);
  
  private void dA(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      b.arV();
      localObject = b.aqU();
      gVj = ((SharedPreferences)localObject).getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
      afv = ((SharedPreferences)localObject).getInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
      startTime = ((SharedPreferences)localObject).getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
      endTime = ((SharedPreferences)localObject).getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
    }
    if (b.arV().arX().gWR) {}
    TextView localTextView;
    StringBuilder localStringBuilder;
    switch (gVj)
    {
    default: 
      if ((b.arV().arX().gWS) && (afv == 1))
      {
        localTextView = this.gVh;
        localStringBuilder = new StringBuilder().append(this.gVh.getText());
        if (gVj != 1) {
          break label263;
        }
      }
      break;
    }
    label263:
    for (Object localObject = ";";; localObject = "")
    {
      localTextView.setText((String)localObject + this.mController.tml.getResources().getString(R.l.backup_pc_select_ext_content_text_only_short));
      return;
      this.gVh.setText("");
      break;
      this.gVh.setText(this.gVk.format(new Date(startTime)) + "~" + this.gVk.format(new Date(endTime - 86400000L)));
      break;
    }
  }
  
  public final void a(HashSet<Integer> paramHashSet)
  {
    Object localObject = new HashSet();
    int i = b.arV().arZ().arr().size();
    Iterator localIterator = paramHashSet.iterator();
    while (localIterator.hasNext())
    {
      int j = ((Integer)localIterator.next()).intValue();
      if (j >= i) {
        ((HashSet)localObject).add(Integer.valueOf(j));
      }
    }
    localObject = ((HashSet)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramHashSet.remove(Integer.valueOf(((Integer)((Iterator)localObject).next()).intValue()));
    }
    if (paramHashSet.size() != 0)
    {
      enableOptionMenu(true);
      if ((b.arV().arZ().gTz) && (paramHashSet.size() == this.gXd.getCount())) {
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
  
  protected final int getLayoutId()
  {
    return R.i.backup_choose;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.backup_pc_start_choose_records);
    this.gXe = ((ListView)findViewById(R.h.backup_choose_conversation_lv));
    this.gXe.setAdapter(this.gXd);
    this.gXe.setEmptyView(findViewById(R.h.backup_choose_empty_view));
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
    setBackBtn(new BackupPcChooseUI.1(this));
    a(0, getString(R.l.bak_chat_choose_finish), new BackupPcChooseUI.2(this), s.b.tmX);
    enableOptionMenu(false);
    if ((!b.arV().arX().gWR) && (!b.arV().arX().gWS))
    {
      this.gVg.setVisibility(8);
      this.gVb.setOnClickListener(new BackupPcChooseUI.4(this));
      if (b.arV().arZ().gTz) {
        break label331;
      }
      this.gVd.setClickable(false);
      this.gVi.setVisibility(0);
    }
    label331:
    while (b.arV().arZ().arr().size() != 0)
    {
      return;
      this.gVg.setVisibility(0);
      dA(true);
      this.gVg.setOnClickListener(new BackupPcChooseUI.3(this));
      break;
    }
    switch (gVj)
    {
    }
    for (;;)
    {
      this.gVf.setVisibility(0);
      return;
      this.gVf.setText(R.l.backup_pc_choose_empty_records);
      continue;
      this.gVf.setText(R.l.backup_select_empty_records_in_select_time);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {
      x.e("MicroMsg.BackupPcChooseUI", "onActivityResult result error! resultCode[%d]", new Object[] { Integer.valueOf(paramInt2) });
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
      x.i("MicroMsg.BackupPcChooseUI", "onActivityResult timeMode/preTimeMode[%d/%d], startTime/preStartTime[%d/%d], endTime/preEndTime[%d/%d], contentType[%d]", new Object[] { Integer.valueOf(gVj), Integer.valueOf(paramInt1), Long.valueOf(startTime), Long.valueOf(l1), Long.valueOf(endTime), Long.valueOf(l2), Integer.valueOf(afv) });
      b.arV().arX();
      e.d(gVj, startTime, endTime, afv);
      dA(false);
    } while ((paramInt1 == gVj) && ((gVj == 0) || ((gVj == 1) && (startTime == l1) && (endTime == l2))));
    b.arV().arZ().a(gVj, startTime, endTime, b.arV().arZ().arq());
    paramIntent = this.gXd;
    paramIntent.gUV.clear();
    paramIntent.gXa.a(paramIntent.gUV);
    if ((b.arV().arZ().arr() == null) || (b.arV().arZ().arr().size() == 0)) {
      switch (gVj)
      {
      default: 
        this.gVf.setVisibility(0);
      }
    }
    for (;;)
    {
      this.gXd.notifyDataSetChanged();
      return;
      this.gVf.setText(R.l.backup_pc_choose_empty_records);
      break;
      this.gVf.setText(R.l.backup_select_empty_records_in_select_time);
      break;
      this.gVf.setVisibility(4);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false)) {
      return;
    }
    initView();
  }
  
  public void onStart()
  {
    super.onStart();
    b.arV().arZ().gWo = this.gXf;
  }
  
  public void onStop()
  {
    super.onStop();
    b.arV().arZ().gWo = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/backuppcui/BackupPcChooseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */