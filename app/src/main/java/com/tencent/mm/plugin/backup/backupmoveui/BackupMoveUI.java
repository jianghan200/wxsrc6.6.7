package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.a.b.d;
import com.tencent.mm.plugin.backup.a.c;
import com.tencent.mm.plugin.backup.c.b;
import com.tencent.mm.plugin.backup.c.d;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import java.lang.reflect.Method;

@com.tencent.mm.ui.base.a(3)
public class BackupMoveUI
  extends MMWizardActivity
  implements b.d
{
  public TextView gVr;
  public TextView gVs;
  public TextView gVt;
  public TextView gVu;
  public TextView gVv;
  public ImageView gVw;
  
  private void arQ()
  {
    this.gVv.setText(R.l.backup_close);
    this.gVv.setOnClickListener(new BackupMoveUI.2(this));
  }
  
  private void arR()
  {
    int i = b.arv().aqP().gRC;
    x.i("MicroMsg.BackupMoveUI", "close btn, backupMoveState:%d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default: 
      DT(1);
      return;
    case 15: 
      x.i("MicroMsg.BackupMoveUI", "backup move finish, user click close.");
      b.arv().arz().cancel();
      b.arv().arz().art();
      b.arv().arx().an(true);
      b.arv().arw().stop();
      b.arv().aqP().gRC = -100;
      DT(1);
      return;
    }
    h.a(this, R.l.backup_move_qrcode_exit_move_tip, R.l.backup_move_qrcode_exit_move, R.l.backup_move_stop_move, R.l.backup_cancel, false, new BackupMoveUI.3(this), null, R.e.backup_red);
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
    x.i("MicroMsg.BackupMoveUI", "onUpdateUIProgress state:%d, transferSession:%d, totalSession:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(((com.tencent.mm.plugin.backup.a.e)localObject).gRD), Integer.valueOf(((com.tencent.mm.plugin.backup.a.e)localObject).gRE) });
    TextView localTextView;
    int i;
    int j;
    switch (paramInt)
    {
    default: 
      return;
    case -100: 
      DT(1);
      return;
    case 3: 
      finish();
      return;
    case 1: 
      this.gVw.setImageResource(R.k.backup_move);
      this.gVt.setText(R.l.backup_move_connecting);
      this.gVu.setText(R.l.backup_move_keep_screen_on);
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arQ();
      return;
    case 13: 
      this.gVw.setImageResource(R.k.backup_move);
      this.gVt.setText(getString(R.l.backup_move_calculating, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.a.e)localObject).gRD), Integer.valueOf(((com.tencent.mm.plugin.backup.a.e)localObject).gRE) }));
      this.gVu.setText(R.l.backup_move_keep_screen_on);
      this.gVu.setTextColor(getResources().getColor(R.e.backup_status_content));
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arQ();
      return;
    case 12: 
      this.gVw.setImageResource(R.k.backup_move);
      this.gVt.setText(R.l.backup_move_preparing);
      this.gVu.setText(R.l.backup_move_keep_screen_on);
      this.gVu.setTextColor(getResources().getColor(R.e.backup_status_content));
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arQ();
      return;
    case 14: 
      this.gVw.setImageResource(R.k.backup_move);
      localTextView = this.gVt;
      paramInt = R.l.backup_move_transfer;
      i = ((com.tencent.mm.plugin.backup.a.e)localObject).gRD;
      j = ((com.tencent.mm.plugin.backup.a.e)localObject).gRE;
      b.arv().arx();
      localTextView.setText(getString(paramInt, new Object[] { Integer.valueOf(i), Integer.valueOf(j), d.arK() }));
      this.gVu.setText(R.l.backup_move_keep_screen_on);
      this.gVu.setTextColor(getResources().getColor(R.e.backup_status_content));
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arQ();
      return;
    case 15: 
      this.gVw.setImageResource(R.k.backup_move_finish);
      this.gVt.setText(R.l.backup_move_finish);
      this.gVu.setText(getString(R.l.backup_move_finish_detail, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.a.e)localObject).gRD), Integer.valueOf(((com.tencent.mm.plugin.backup.a.e)localObject).gRE) }));
      this.gVu.setTextColor(getResources().getColor(R.e.backup_status_content));
      this.gVr.setText(R.l.backup_finish);
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(0);
      this.gVs.setVisibility(4);
      this.gVr.setOnClickListener(new BackupMoveUI.1(this));
      arQ();
      return;
    case 51: 
      localObject = b.arv().arx().bitmapData;
      this.gVw.setImageBitmap(BitmapFactory.decodeByteArray((byte[])localObject, 0, localObject.length));
      this.gVt.setText(R.l.backup_move_qrcode_success_tip);
      this.gVt.setTextColor(this.mController.tml.getResources().getColor(R.e.black));
      this.gVu.setVisibility(4);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arQ();
      return;
    case 4: 
      this.gVw.setImageResource(R.k.backup_move);
      localTextView = this.gVt;
      paramInt = R.l.backup_move_transfer;
      i = ((com.tencent.mm.plugin.backup.a.e)localObject).gRD;
      j = ((com.tencent.mm.plugin.backup.a.e)localObject).gRE;
      b.arv().arx();
      localTextView.setText(getString(paramInt, new Object[] { Integer.valueOf(i), Integer.valueOf(j), d.arK() }));
      this.gVu.setText(R.l.backup_pc_transfer_weak_network);
      this.gVu.setTextColor(getResources().getColor(R.e.backup_red));
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arQ();
      return;
    case -4: 
      this.gVw.setImageResource(R.k.backup_move_qrcode_dark);
      b.arv().arx().gUF.start();
      this.gVt.setText(getString(R.l.backup_move_network_disconnect_transfer_state, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.a.e)localObject).gRD), Integer.valueOf(((com.tencent.mm.plugin.backup.a.e)localObject).gRE), "0M" }));
      this.gVu.setText(R.l.backup_move_error_network_disconnect);
      this.gVu.setTextColor(this.mController.tml.getResources().getColor(R.e.red));
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      this.gVv.setText(R.l.backup_minimize);
      this.gVv.setOnClickListener(new BackupMoveUI.4(this));
      b.arv().arx().gUA = c.gRo;
      return;
    case -11: 
      this.gVw.setImageResource(R.k.backup_move_qrcode_dark);
      this.gVt.setText(getString(R.l.backup_move_network_disconnect_transfer_state, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.a.e)localObject).gRD), Integer.valueOf(((com.tencent.mm.plugin.backup.a.e)localObject).gRE), "0M" }));
      this.gVu.setText(R.l.backup_move_error_move_gencode_err);
      this.gVu.setTextColor(this.mController.tml.getResources().getColor(R.e.red));
      this.gVu.setVisibility(0);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arQ();
      return;
    case -21: 
      this.gVw.setImageResource(R.k.backup_move_error);
      this.gVt.setText(R.l.backup_move_error_programme_error);
      this.gVu.setVisibility(4);
      this.gVr.setVisibility(4);
      this.gVs.setVisibility(4);
      arQ();
      return;
    }
    this.gVw.setImageResource(R.k.backup_move_error);
    this.gVt.setText(R.l.backup_move_error_empty_records);
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
    x.i("MicroMsg.BackupMoveUI", "onCreate.");
    getSupportActionBar().hide();
    com.tencent.mm.plugin.backup.a.ezn.vo();
    initView();
    try
    {
      paramBundle = WifiManager.class.getMethod("isWifiApEnabled", new Class[0]);
      WifiManager localWifiManager = (WifiManager)getSystemService("wifi");
      b.arv().arx().gTY = ((Boolean)paramBundle.invoke(localWifiManager, new Object[0])).booleanValue();
      x.d("MicroMsg.BackupMoveUI", "old isWifiAp:%s", new Object[] { Boolean.valueOf(b.arv().arx().gTY) });
      return;
    }
    catch (Exception paramBundle)
    {
      x.e("MicroMsg.BackupMoveUI", "no such method WifiManager.isWifiApEnabled:%s", new Object[] { bi.cjd() });
    }
  }
  
  public void onDestroy()
  {
    x.d("MicroMsg.BackupMoveUI", "BackupMoveUI onDestroy.");
    if (b.arv().arx().gUF != null) {
      b.arv().arx().gUF.stop();
    }
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
  
  public void onResume()
  {
    super.onResume();
    b.arv().arx().gSW = this;
    mw(b.arv().aqP().gRC);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/backupmoveui/BackupMoveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */