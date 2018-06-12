package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.Intent;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.backup.a.b.d;
import com.tencent.mm.plugin.backup.a.e;
import com.tencent.mm.plugin.backup.a.g;
import com.tencent.mm.plugin.backup.c.b;
import com.tencent.mm.plugin.backup.c.c;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.s;
import java.lang.reflect.Method;

@com.tencent.mm.ui.base.a(3)
public class BackupMoveRecoverUI
  extends MMWizardActivity
  implements b.d
{
  private static boolean eFl = false;
  private static boolean gVx = false;
  public TextView gVr;
  public TextView gVs;
  public TextView gVt;
  public TextView gVu;
  public TextView gVv;
  public ImageView gVw;
  
  private void arQ()
  {
    this.gVv.setText(R.l.backup_close);
    this.gVv.setOnClickListener(new BackupMoveRecoverUI.6(this));
  }
  
  private void arR()
  {
    int i = b.arv().aqP().gRC;
    x.i("MicroMsg.BackupMoveRecoverUI", "close btn, backupPcState:%d, backupPcState:%d ", new Object[] { Integer.valueOf(i), Integer.valueOf(i) });
    switch (i)
    {
    default: 
    case -22: 
    case -21: 
    case -13: 
    case -5: 
    case -3: 
    case -2: 
    case -1: 
    case 1: 
    case 27: 
    case 24: 
      for (;;)
      {
        DT(1);
        return;
        b.arv().ary().a(false, false, -100);
        return;
        x.i("MicroMsg.BackupMoveRecoverUI", "recover finish, user click close, backupState[%d].", new Object[] { Integer.valueOf(i) });
        b.arv().ary().a(true, false, -100);
        b.arv().arw().stop();
        return;
        b.arv().aqP().gRC = 25;
      }
    case 52: 
      com.tencent.mm.ui.base.h.a(this, R.l.backup_move_error_alert_stop_move_tip, R.l.backup_move_error_alert_stop_move, R.l.backup_move_recover_stop_move, R.l.backup_cancel, false, new BackupMoveRecoverUI.7(this, i), null, R.e.backup_red);
      return;
    }
    com.tencent.mm.ui.base.h.a(this, R.l.backup_pc_error_alert_stop_recover_tip, R.l.backup_pc_error_alert_stop_recover, R.l.backup_pc_stop_recover, R.l.backup_cancel, false, new BackupMoveRecoverUI.8(this, i), null, R.e.backup_red);
  }
  
  private void arS()
  {
    this.gVv.setText(R.l.backup_minimize);
    this.gVv.setOnClickListener(new BackupMoveRecoverUI.9(this));
  }
  
  public final void aqO() {}
  
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
  
  public final void mw(int paramInt)
  {
    Object localObject = b.arv().aqP();
    x.i("MicroMsg.BackupMoveRecoverUI", "onUpdateUIProgress state[%d], isActivityOnTop[%b], transferSession[%d], totalSession[%d]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(gVx), Integer.valueOf(((e)localObject).gRD), Integer.valueOf(((e)localObject).gRE) });
    TextView localTextView;
    int i;
    int j;
    switch (paramInt)
    {
    default: 
    case -100: 
    case 3: 
    case 1: 
    case 22: 
    case 52: 
    case 23: 
    case 25: 
    case 24: 
      do
      {
        do
        {
          return;
          DT(1);
          return;
          finish();
          return;
          this.gVw.setImageResource(R.k.backup_move);
          this.gVt.setText(R.l.backup_move_connecting);
          this.gVu.setText(R.l.backup_move_keep_screen_on);
          this.gVu.setVisibility(0);
          this.gVr.setVisibility(4);
          this.gVs.setVisibility(4);
          arQ();
          return;
          this.gVw.setImageResource(R.k.backup_move);
          this.gVt.setText(R.l.backup_move_recover_preparing);
          this.gVu.setText(R.l.backup_move_keep_screen_on);
          this.gVu.setTextColor(getResources().getColor(R.e.backup_status_content));
          this.gVu.setVisibility(0);
          this.gVr.setVisibility(4);
          this.gVs.setVisibility(4);
          arS();
          return;
          this.gVw.setImageResource(R.k.backup_move);
          this.gVt.setText(R.l.backup_move_has_move_before);
          this.gVr.setText(R.l.backup_move_has_move_before_move_resume);
          this.gVs.setText(R.l.backup_move_has_move_before_move_all);
          this.gVu.setVisibility(4);
          this.gVr.setVisibility(0);
          this.gVs.setVisibility(0);
          this.gVr.setOnClickListener(new BackupMoveRecoverUI.1(this));
          this.gVs.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              b.arv().ary().du(true);
            }
          });
          arQ();
          return;
          this.gVw.setImageResource(R.k.backup_move);
          localTextView = this.gVt;
          paramInt = R.l.backup_move_recover_transfer;
          i = ((e)localObject).gRD;
          j = ((e)localObject).gRE;
          b.arv().ary();
          localTextView.setText(getString(paramInt, new Object[] { Integer.valueOf(i), Integer.valueOf(j), c.arD() }));
          this.gVu.setText(R.l.backup_move_keep_screen_on);
          this.gVu.setTextColor(getResources().getColor(R.e.backup_status_content));
          this.gVu.setVisibility(0);
          this.gVr.setVisibility(4);
          this.gVs.setVisibility(4);
          arS();
          return;
        } while (!gVx);
        b.arv().aqP().gRC = 24;
        paramInt = 24;
        break;
        x.i("MicroMsg.BackupMoveRecoverUI", "backupmove BACKUP_STATE_RECOVER_TRANSFER_FINISH isFromBanner[%b]", new Object[] { Boolean.valueOf(eFl) });
        if (eFl)
        {
          this.gVw.setImageResource(R.k.backup_move);
          this.gVt.setText(R.l.backup_move_recover_transfer_finish);
          this.gVu.setText(R.l.backup_move_recover_transfer_finish_tip);
          this.gVu.setTextColor(getResources().getColor(R.e.backup_status_content));
          this.gVr.setText(R.l.backup_move_recover_start_merge);
          this.gVs.setText(R.l.backup_move_recover_stop_merge);
          this.gVv.setText(R.l.backup_remind_later);
          this.gVu.setVisibility(0);
          this.gVr.setVisibility(0);
          this.gVs.setVisibility(0);
          this.gVr.setOnClickListener(new BackupMoveRecoverUI.11(this));
          this.gVs.setOnClickListener(new BackupMoveRecoverUI.12(this, paramInt));
          this.gVv.setOnClickListener(new BackupMoveRecoverUI.13(this));
          return;
        }
      } while (!gVx);
      b.arv().ary();
      if (!c.arA())
      {
        x.e("MicroMsg.BackupMoveRecoverUI", "miss recover merge data.");
        b.arv().aqP().gRC = -22;
        mw(-22);
        com.tencent.mm.plugin.report.service.h.mEJ.a(485L, 6L, 1L, false);
        return;
      }
      b.arv().ary().arg();
      return;
    case 26: 
      this.gVw.setImageResource(R.k.backup_move_recover);
      this.gVt.setText(getString(R.l.backup_move_recover_merging, new Object[] { Integer.valueOf(((e)localObject).gRD), Integer.valueOf(((e)localObject).gRE) }));
      this.gVu.setText(R.l.backup_move_recover_merging_tip);
      this.gVu.setTextColor(getResources().getColor(R.e.backup_status_content));
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arQ();
      return;
    case 27: 
      this.gVw.setImageResource(R.k.backup_move_recover_finish);
      this.gVt.setText(R.l.backup_move_recover_merge_finish);
      this.gVu.setText(getString(R.l.backup_move_recover_merge_finish_detail, new Object[] { Integer.valueOf(((e)localObject).gRD), Integer.valueOf(((e)localObject).gRE) }));
      this.gVu.setTextColor(getResources().getColor(R.e.backup_status_content));
      this.gVr.setText(R.l.backup_finish);
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(0);
      this.gVs.setVisibility(4);
      this.gVr.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          b.arv().arw().stop();
          b.arv().aqP().gRC = -100;
          BackupMoveRecoverUI.b(BackupMoveRecoverUI.this);
        }
      });
      arQ();
      return;
    case 4: 
      this.gVw.setImageResource(R.k.backup_move);
      localTextView = this.gVt;
      paramInt = R.l.backup_move_recover_transfer;
      i = ((e)localObject).gRD;
      j = ((e)localObject).gRE;
      b.arv().ary();
      localTextView.setText(getString(paramInt, new Object[] { Integer.valueOf(i), Integer.valueOf(j), c.arD() }));
      this.gVu.setText(R.l.backup_pc_transfer_weak_network);
      this.gVu.setTextColor(getResources().getColor(R.e.backup_red));
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arS();
      return;
    case -4: 
      this.gVw.setImageResource(R.k.backup_move_error);
      this.gVt.setText(getString(R.l.backup_move_network_disconnect_transfer_state, new Object[] { Integer.valueOf(((e)localObject).gRD), Integer.valueOf(((e)localObject).gRE), "0M" }));
      this.gVu.setText(R.l.backup_move_error_network_disconnect);
      this.gVr.setText(R.l.backup_move_recover_scan_qrcode_again);
      this.gVs.setText(R.l.backup_move_recover_stop_move);
      this.gVr.setOnClickListener(new BackupMoveRecoverUI.15(this));
      this.gVs.setOnClickListener(new BackupMoveRecoverUI.16(this, paramInt));
      this.gVu.setTextColor(getResources().getColor(R.e.backup_red));
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(0);
      this.gVs.setVisibility(0);
      arS();
      return;
    case -2: 
    case -1: 
      this.gVw.setImageResource(R.k.backup_move_error);
      this.gVt.setText(R.l.backup_move_error_not_same_wifi);
      localObject = g.cQ(this);
      if ((localObject == null) || (((String)localObject).equals(""))) {
        this.gVu.setText(getString(R.l.backup_move_error_not_same_wifi_wifiname, new Object[] { "移动网络", b.arv().ary().gUe }));
      }
      for (;;)
      {
        this.gVu.setTextColor(getResources().getColor(R.e.backup_red));
        this.gVu.setVisibility(0);
        this.gVr.setVisibility(4);
        this.gVs.setVisibility(4);
        arQ();
        return;
        this.gVu.setText(getString(R.l.backup_move_error_not_same_wifi_wifiname, new Object[] { localObject, b.arv().ary().gUe }));
      }
    case -3: 
      this.gVw.setImageResource(R.k.backup_move_error);
      this.gVt.setText(R.l.backup_move_error_complex_wifi);
      this.gVu.setText(R.l.backup_move_error_complex_wifi_wifiap_tip);
      this.gVr.setText(R.l.backup_move_recover_open_wifia_word);
      this.gVs.setText(R.l.backup_move_recover_stop_move);
      this.gVu.setTextColor(getResources().getColor(R.e.backup_red));
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(0);
      this.gVs.setVisibility(0);
      this.gVr.setOnClickListener(new BackupMoveRecoverUI.17(this));
      this.gVs.setOnClickListener(new BackupMoveRecoverUI.2(this, paramInt));
      arQ();
      return;
    case -5: 
      this.gVw.setImageResource(R.k.backup_move_error);
      this.gVt.setText(R.l.backup_move_error_connect_fail);
      this.gVr.setText(R.l.backup_move_recover_scan_qrcode_again);
      this.gVs.setText(R.l.backup_move_recover_stop_move);
      this.gVu.setVisibility(4);
      this.gVr.setVisibility(0);
      this.gVs.setVisibility(0);
      this.gVr.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.h(11788, new Object[] { Integer.valueOf(9) });
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("BaseScanUI_select_scan_mode", 1);
          paramAnonymousView.setFlags(268435456);
          d.b(BackupMoveRecoverUI.this.mController.tml, "scanner", ".ui.BaseScanUI", paramAnonymousView);
        }
      });
      this.gVs.setOnClickListener(new BackupMoveRecoverUI.4(this, paramInt));
      arQ();
      return;
    case -21: 
      this.gVw.setImageResource(R.k.backup_move_error);
      this.gVt.setText(R.l.backup_pc_error_programme_error);
      this.gVu.setVisibility(4);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arQ();
      return;
    case -12: 
      this.gVw.setImageResource(R.k.backup_move);
      this.gVt.setText(R.l.backup_move_connecting);
      this.gVu.setText(R.l.backup_move_keep_screen_on);
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arQ();
      com.tencent.mm.ui.base.h.a(this, R.l.backup_move_error_move_phone_old_version, 0, R.l.backup_sure, 0, false, new BackupMoveRecoverUI.5(this), null, R.e.backup_green);
      return;
    case -13: 
      this.gVw.setImageResource(R.k.backup_move_error);
      this.gVt.setText(R.l.backup_move_error_not_enough_space_for_recover);
      this.gVu.setText(getString(R.l.backup_move_error_not_enough_space_for_recover_tip, new Object[] { bi.bF(b.arv().ary().gUm) }));
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arQ();
      return;
    }
    this.gVw.setImageResource(R.k.backup_move_error);
    this.gVt.setText(R.l.backup_pc_error_miss_recover_merge_data);
    b.arv().arw().stop();
    this.gVu.setVisibility(4);
    this.gVr.setVisibility(4);
    this.gVs.setVisibility(4);
    arQ();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false)) {
      return;
    }
    x.i("MicroMsg.BackupMoveRecoverUI", "onCreate.");
    getSupportActionBar().hide();
    com.tencent.mm.plugin.backup.a.ezn.vo();
    initView();
    try
    {
      paramBundle = WifiManager.class.getMethod("isWifiApEnabled", new Class[0]);
      WifiManager localWifiManager = (WifiManager)getSystemService("wifi");
      b.arv().ary().gTY = ((Boolean)paramBundle.invoke(localWifiManager, new Object[0])).booleanValue();
      x.d("MicroMsg.BackupMoveRecoverUI", "new isWifiAp:%s", new Object[] { Boolean.valueOf(b.arv().ary().gTY) });
      return;
    }
    catch (Exception paramBundle)
    {
      x.e("MicroMsg.BackupMoveRecoverUI", "no such method WifiManager.isWifiApEnabled:%s", new Object[] { bi.cjd() });
    }
  }
  
  public void onDestroy()
  {
    x.i("MicroMsg.BackupMoveRecoverUI", "BackupMoveRecoverUI onDestroy.");
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
  
  protected void onPause()
  {
    super.onPause();
    x.i("MicroMsg.BackupMoveRecoverUI", "onPause.");
    gVx = false;
  }
  
  public void onResume()
  {
    super.onResume();
    x.i("MicroMsg.BackupMoveRecoverUI", "onResume.");
    gVx = true;
    b.arv().ary().gSW = this;
    eFl = getIntent().getBooleanExtra("isRecoverTransferFinishFromBanner", false);
    mw(b.arv().aqP().gRC);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */