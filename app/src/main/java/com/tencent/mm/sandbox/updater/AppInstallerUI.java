package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.widget.a.c.a;

public class AppInstallerUI
  extends MMBaseActivity
{
  private static AppInstallerUI sDo = null;
  private String bKg;
  private String desc;
  private com.tencent.mm.ui.widget.a.c eIW = null;
  private int nPm;
  private com.tencent.mm.ui.widget.a.c sDn = null;
  private DialogInterface.OnClickListener sDp = new AppInstallerUI.2(this);
  
  public static AppInstallerUI cgN()
  {
    return sDo;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.d("MicroMsg.AppInstallerUI", "onCreate");
    com.tencent.mm.sandbox.c.i(hashCode(), this);
    MMActivity.initLanguage(this);
    if ((AppUpdaterUI.cgO() != null) && (!AppUpdaterUI.cgO().isFinishing()))
    {
      x.d("MicroMsg.AppInstallerUI", "AppUpdaterUI is there, finish self");
      finish();
    }
    do
    {
      return;
      if ((sDo != null) && (!sDo.isFinishing()) && (sDo != this))
      {
        x.d("MicroMsg.AppInstallerUI", "duplicate instance, finish self");
        finish();
        return;
      }
      sDo = this;
      this.bKg = i.cce();
      if ((bi.oW(this.bKg)) || (com.tencent.mm.sandbox.monitor.c.Hw(this.bKg) == null))
      {
        finish();
        return;
      }
      this.desc = i.cgY();
      this.nPm = i.cgZ();
      setContentView(R.i.empty);
      paramBundle = new c.a(this);
      paramBundle.Gq(R.l.fmt_update);
      paramBundle.mF(true);
      paramBundle.e(new AppInstallerUI.1(this));
      paramBundle.abu(getString(R.l.fmt_update_install_info, new Object[] { this.desc }));
      paramBundle.Gt(R.l.install_now).a(false, this.sDp);
      paramBundle.Gu(R.l.update_cancel).b(null);
      this.eIW = paramBundle.anj();
      this.eIW.setCanceledOnTouchOutside(false);
      this.eIW.show();
      h.mEJ.a(405L, 71L, 1L, true);
    } while (this.nPm != 2);
    i.g(this, 2, i.cha() + 1);
  }
  
  protected void onDestroy()
  {
    x.d("MicroMsg.AppInstallerUI", "onDestroy");
    if ((this.eIW != null) && (this.eIW.isShowing())) {
      this.eIW.dismiss();
    }
    if ((this.sDn != null) && (this.sDn.isShowing())) {
      this.sDn.dismiss();
    }
    if (sDo == this) {
      sDo = null;
    }
    com.tencent.mm.sandbox.c.j(hashCode(), this);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/sandbox/updater/AppInstallerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */