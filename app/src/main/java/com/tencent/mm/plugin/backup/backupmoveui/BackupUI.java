package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.a.g;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.c.a.1;
import com.tencent.mm.plugin.backup.c.b;
import com.tencent.mm.plugin.backup.g.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMWizardActivity;

public class BackupUI
  extends MMWizardActivity
{
  private static boolean gVG = false;
  private al gUM = new al(Looper.getMainLooper(), new BackupUI.4(this), true);
  private Button gVF;
  private TextView gVs;
  private TextView gVu;
  
  protected final int getLayoutId()
  {
    return R.i.backup_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false)) {
      return;
    }
    setMMTitle(R.l.backup_move);
    h.mEJ.h(11788, new Object[] { Integer.valueOf(1) });
    this.gVu = ((TextView)findViewById(R.h.backup_move_status_content));
    this.gVF = ((Button)findViewById(R.h.backup_move_bt));
    this.gVs = ((TextView)findViewById(R.h.backup_move_bottom_btn));
    b.arv();
    paramBundle = b.aqU().edit();
    paramBundle.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
    paramBundle.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
    paramBundle.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
    paramBundle.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
    paramBundle.commit();
    if (!b.arv().arz().gTz)
    {
      paramBundle = b.arv().arz();
      d.asG().asJ();
      e.post(new a.1(paramBundle), "BakMoveChooseServer.calculateToChoose");
      if (!bi.oW(g.cQ(this))) {
        break label313;
      }
      this.gVu.setText(R.l.backup_status_content_no_wifi);
      this.gVu.setTextColor(getResources().getColor(R.e.backup_red));
      this.gVF.setEnabled(false);
      gVG = false;
      h.mEJ.h(11788, new Object[] { Integer.valueOf(2) });
    }
    for (;;)
    {
      this.gVF.setOnClickListener(new BackupUI.1(this));
      this.gVs.setOnClickListener(new BackupUI.2(this));
      setBackBtn(new BackupUI.3(this));
      return;
      b.arv().arz().aru();
      break;
      label313:
      this.gVu.setText(R.l.backup_status_content_open_wifi);
      this.gVu.setTextColor(getResources().getColor(R.e.backup_green));
      this.gVF.setEnabled(true);
      gVG = true;
    }
  }
  
  public void onDestroy()
  {
    x.d("MicroMsg.BackupUI", "BackupUI onDestroy.");
    super.onDestroy();
    b.arv().arz().cancel();
    b.arv().arz().art();
  }
  
  public void onStart()
  {
    super.onStart();
    this.gUM.J(5000L, 5000L);
  }
  
  public void onStop()
  {
    super.onStop();
    this.gUM.SO();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/backupmoveui/BackupUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */