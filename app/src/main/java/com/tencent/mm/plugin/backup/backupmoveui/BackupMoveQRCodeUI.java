package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.backup.a.b.d;
import com.tencent.mm.plugin.backup.a.c;
import com.tencent.mm.plugin.backup.b.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;

public class BackupMoveQRCodeUI
  extends MMWizardActivity
  implements b.d
{
  private ImageView gVm;
  private TextView gVn;
  private TextView gVo;
  private boolean gVp = false;
  
  private void arP()
  {
    if (au.Dr())
    {
      h.a(this, R.l.backup_move_qrcode_exit_move_tip, R.l.backup_move_qrcode_exit_move, R.l.backup_move_stop_move, R.l.backup_cancel, false, new BackupMoveQRCodeUI.2(this), null, R.e.backup_red);
      return;
    }
    x.i("MicroMsg.BackupMoveQRCodeUI", "user click close. stop move.");
    com.tencent.mm.plugin.backup.c.b.arv().arw().stop();
    com.tencent.mm.plugin.backup.c.b.arv().arx().an(true);
    com.tencent.mm.plugin.backup.c.b.arv().aqP().gRC = -100;
    DT(1);
  }
  
  public final void aqO() {}
  
  protected final int getLayoutId()
  {
    return R.i.backup_move_qrcode;
  }
  
  public final void initView()
  {
    setMMTitle(R.l.backup_move);
    this.gVm = ((ImageView)findViewById(R.h.backup_move_qrcode_image));
    this.gVn = ((TextView)findViewById(R.h.backup_move_qrcode_status_title));
    this.gVo = ((TextView)findViewById(R.h.backup_move_qrcode_status_content));
    setBackBtn(new BackupMoveQRCodeUI.1(this));
  }
  
  public final void mw(int paramInt)
  {
    x.i("MicroMsg.BackupMoveQRCodeUI", "onUpdateUIProgress backupState:%d", new Object[] { Integer.valueOf(paramInt) });
    if (this.gVp) {
      return;
    }
    switch (paramInt)
    {
    default: 
      return;
    case -33: 
      this.gVp = true;
      h.a(this, R.l.backup_move_error_not_support_quick_backup, 0, R.l.backup_all_types, R.l.backup_cancel, false, new BackupMoveQRCodeUI.8(this), new BackupMoveQRCodeUI.9(this), R.e.backup_green);
      return;
    case 2: 
      x.i("MicroMsg.BackupMoveQRCodeUI", "auth success. go to BackupMoveUI.");
      com.tencent.mm.plugin.backup.c.b.arv().aqP().gRC = 12;
      MMWizardActivity.D(this, new Intent(this, BackupMoveUI.class));
      return;
    case 51: 
      byte[] arrayOfByte = com.tencent.mm.plugin.backup.c.b.arv().arx().bitmapData;
      this.gVm.setImageBitmap(BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length));
      this.gVn.setText(R.l.backup_move_qrcode_success_tip);
      this.gVn.setTextColor(this.mController.tml.getResources().getColor(R.e.black));
      this.gVo.setVisibility(4);
      return;
    case -11: 
    case -4: 
      this.gVn.setText(R.l.backup_move_error_move_gencode_err);
      this.gVn.setTextColor(this.mController.tml.getResources().getColor(R.e.red));
      this.gVm.setImageResource(R.k.backup_move_qrcode_light);
      this.gVo.setVisibility(4);
      return;
    case -31: 
      this.gVp = true;
      h.a(this, R.l.backup_move_error_not_support_select_time_and_quick_backup, 0, R.l.backup_all_types, R.l.backup_cancel, false, new BackupMoveQRCodeUI.3(this), new BackupMoveQRCodeUI.4(this), R.e.backup_green);
      return;
    case -32: 
      this.gVp = true;
      h.a(this, R.l.backup_move_error_not_support_select_time, 0, R.l.backup_all_records, R.l.backup_cancel, false, new BackupMoveQRCodeUI.5(this), new BackupMoveQRCodeUI.6(this), R.e.backup_green);
      return;
    }
    h.a(this, R.l.backup_move_error_recover_phone_old_version, 0, R.l.backup_sure, 0, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        x.i("MicroMsg.BackupMoveQRCodeUI", "move phone old version");
      }
    }, null, R.e.backup_green);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false)) {
      return;
    }
    if (!au.HX())
    {
      finish();
      return;
    }
    initView();
    com.tencent.mm.plugin.backup.f.b.clear();
    paramBundle = com.tencent.mm.plugin.backup.c.b.arv().arx();
    com.tencent.mm.plugin.backup.f.b.a(paramBundle.gUq);
    com.tencent.mm.plugin.backup.a.d.mx(21);
    com.tencent.mm.plugin.backup.f.b.a(paramBundle.gUo);
    com.tencent.mm.plugin.backup.c.b.arv().aqQ();
    com.tencent.mm.plugin.backup.f.b.a(paramBundle);
    com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.c.b.arv().arw());
    com.tencent.mm.plugin.backup.f.b.mx(2);
    com.tencent.mm.plugin.backup.c.b.arv().gRx = null;
    paramBundle.gUz = false;
    com.tencent.mm.plugin.backup.c.b.arv().arx().gUA = c.gRn;
    com.tencent.mm.plugin.backup.a.d.aqV();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      arP();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onResume()
  {
    super.onResume();
    mw(com.tencent.mm.plugin.backup.c.b.arv().aqP().gRC);
  }
  
  public void onStart()
  {
    super.onStart();
    com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.c.b.arv().arx());
    com.tencent.mm.plugin.backup.c.b.arv().arx().gSW = this;
    com.tencent.mm.plugin.backup.c.b.arv().arx().gUF.start();
  }
  
  public void onStop()
  {
    x.i("MicroMsg.BackupMoveQRCodeUI", "BackupMoveQRCodeUI onStop.");
    if (com.tencent.mm.plugin.backup.c.b.arv().arx().gUF != null) {
      com.tencent.mm.plugin.backup.c.b.arv().arx().gUF.stop();
    }
    super.onStop();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/backupmoveui/BackupMoveQRCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */