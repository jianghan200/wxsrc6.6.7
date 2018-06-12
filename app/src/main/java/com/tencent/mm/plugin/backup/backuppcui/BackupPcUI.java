package com.tencent.mm.plugin.backup.backuppcui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.a.b.c;
import com.tencent.mm.plugin.backup.a.g;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.c;
import com.tencent.mm.plugin.backup.backuppcmodel.d;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMWizardActivity;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class BackupPcUI
  extends MMWizardActivity
{
  private static boolean eFl = false;
  private TextView gVr;
  private TextView gVs;
  private TextView gVt;
  private TextView gVu;
  private TextView gVv;
  private ImageView gVw;
  public b.c gXk = new BackupPcUI.3(this);
  
  private void arR()
  {
    int i = b.arV().aqP().gRC;
    x.i("MicroMsg.BackupPcUI", "closeImpl, backupPcState:%d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default: 
    case 15: 
    case -22: 
    case -21: 
    case -13: 
    case -5: 
    case -3: 
    case -2: 
    case -1: 
    case 1: 
    case 11: 
    case 21: 
    case 27: 
    case 24: 
      for (;;)
      {
        DT(1);
        return;
        x.i("MicroMsg.BackupPcUI", "closeImpl backup finish, user click close.");
        ash();
        return;
        if ((1 == b.arV().arW().gWw) || (3 == b.arV().arW().gWw))
        {
          b.arV().arX().an(false);
          b.arV().aqP().gRC = -100;
        }
        else
        {
          if ((2 == b.arV().arW().gWw) || (4 == b.arV().arW().gWw))
          {
            b.arV().arY().a(false, false, -100);
            return;
          }
          b.arV().aqP().gRC = -100;
          continue;
          x.i("MicroMsg.BackupPcUI", "closeImpl recover finish, user click close.");
          ash();
          return;
          b.arV().aqP().gRC = 25;
        }
      }
    }
    com.tencent.mm.ui.base.h.a(this, R.l.backup_pc_error_alert_stop_recover_tip, R.l.backup_pc_error_alert_stop_recover, R.l.backup_pc_stop_recover, R.l.backup_cancel, false, new BackupPcUI.2(this), null, R.e.backup_red);
  }
  
  private void ash()
  {
    x.i("MicroMsg.BackupPcUI", "exitBackupPc.");
    if ((1 == b.arV().arW().gWw) || (3 == b.arV().arW().gWw))
    {
      b.arV().arZ().cancel();
      b.arV().arZ().art();
      b.arV().arX().an(true);
      b.arV().arw().stop();
      b.arV().aqP().gRC = -100;
      DT(1);
    }
    while ((2 != b.arV().arW().gWw) && (4 != b.arV().arW().gWw)) {
      return;
    }
    b.arV().arY().a(true, true, -100);
    b.arV().arw().stop();
  }
  
  protected final int getLayoutId()
  {
    return R.i.backup_pc;
  }
  
  public final void initView()
  {
    this.gVv = ((TextView)findViewById(R.h.backup_close_btn));
    this.gVw = ((ImageView)findViewById(R.h.backup_image));
    this.gVt = ((TextView)findViewById(R.h.backup_status_title));
    this.gVu = ((TextView)findViewById(R.h.backup_status_content));
    this.gVr = ((TextView)findViewById(R.h.backup_btn));
    this.gVs = ((TextView)findViewById(R.h.backup_bottom_btn));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false)) {}
    int i;
    do
    {
      do
      {
        return;
        x.i("MicroMsg.BackupPcUI", "onCreate.");
        getSupportActionBar().hide();
        com.tencent.mm.plugin.backup.a.ezn.vo();
        initView();
      } while (!b.arV().arW().gWD);
      b.arV().arW().gWD = false;
      i = g.ara();
    } while (i >= 50);
    com.tencent.mm.plugin.report.service.h.mEJ.a(400L, 4L, 1L, false);
    com.tencent.mm.plugin.report.service.h.mEJ.h(13736, new Object[] { Integer.valueOf(4), b.arV().arW().gWx, g.cQ(this), Integer.valueOf(0), Integer.valueOf(b.arV().arW().gWC) });
    com.tencent.mm.ui.base.h.a(this, R.l.backup_pc_error_low_battery_tip, R.l.backup_pc_error_low_battery, R.l.backup_sure, 0, false, new BackupPcUI.1(this, i), null, R.e.backup_green);
  }
  
  public void onDestroy()
  {
    x.i("MicroMsg.BackupPcUI", "onDestroy. stack:%s", new Object[] { bi.cjd() });
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      arR();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    x.i("MicroMsg.BackupPcUI", "onPause.");
    Object localObject1 = b.arV().arX();
    b.c localc = this.gXk;
    synchronized (((com.tencent.mm.plugin.backup.backuppcmodel.e)localObject1).gWI)
    {
      ((com.tencent.mm.plugin.backup.backuppcmodel.e)localObject1).gWI.remove(localc);
      localObject1 = b.arV().arY();
      localc = this.gXk;
    }
    synchronized (((d)localObject1).gWI)
    {
      ((d)localObject1).gWI.remove(localc);
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public void onResume()
  {
    super.onResume();
    x.i("MicroMsg.BackupPcUI", "onResume.");
    Object localObject1 = b.arV().arX();
    b.c localc = this.gXk;
    synchronized (((com.tencent.mm.plugin.backup.backuppcmodel.e)localObject1).gWI)
    {
      ((com.tencent.mm.plugin.backup.backuppcmodel.e)localObject1).gWI.add(localc);
      localObject1 = b.arV().arY();
      localc = this.gXk;
    }
    synchronized (((d)localObject1).gWI)
    {
      ((d)localObject1).gWI.add(localc);
      int i = b.arV().aqP().gRC;
      this.gXk.mw(i);
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    x.i("MicroMsg.BackupPcUI", "onStart.");
    eFl = getIntent().getBooleanExtra("isRecoverTransferFinishFromBanner", false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/backuppcui/BackupPcUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */