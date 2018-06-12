package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.c.i.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.ArrayList;

public class AppUpdaterUI
  extends MMBaseActivity
{
  private static AppUpdaterUI sDt = null;
  private com.tencent.mm.ui.widget.a.c eIW = null;
  private Button haQ;
  private DialogInterface.OnClickListener sDp = new AppUpdaterUI.10(this);
  private Button sDs;
  private j sDu;
  private g sDv = new g()
  {
    public final void MX(String paramAnonymousString)
    {
      if (AppUpdaterUI.b(AppUpdaterUI.this) != null) {
        AppUpdaterUI.b(AppUpdaterUI.this).dismiss();
      }
      if (AppUpdaterUI.this.isFinishing()) {}
      do
      {
        return;
        x.d("MicroMsg.AppUpdaterUI", paramAnonymousString);
      } while (paramAnonymousString == null);
      AppUpdaterUI.a(AppUpdaterUI.this, paramAnonymousString);
      AppUpdaterUI.a(AppUpdaterUI.this).setEnabled(false);
    }
    
    public final void a(com.tencent.mm.sandbox.monitor.c paramAnonymousc)
    {
      if (AppUpdaterUI.this.isFinishing()) {}
      do
      {
        return;
        if (!(paramAnonymousc instanceof c)) {
          break;
        }
        com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 67L, 1L, true);
        x.e("MicroMsg.AppUpdaterUI", "download package from cdn error. switch to webserver");
        if (AppUpdaterUI.b(AppUpdaterUI.this) != null) {
          AppUpdaterUI.b(AppUpdaterUI.this).setMessage(AppUpdaterUI.this.getString(R.l.fmt_update_info, new Object[] { AppUpdaterUI.e(AppUpdaterUI.this).desc, AppUpdaterUI.this.getString(R.l.update_full_web_tips), bi.bF(AppUpdaterUI.e(AppUpdaterUI.this).size) }));
        }
      } while (!AppUpdaterUI.e(AppUpdaterUI.this).sEF);
      com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 68L, 1L, true);
      AppUpdaterUI.a(AppUpdaterUI.this, paramAnonymousc);
      return;
      com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 69L, 1L, true);
      com.tencent.mm.ui.base.h.a(AppUpdaterUI.this, R.l.update_get_pack_error, R.l.app_tip, new AppUpdaterUI.1.1(this), new AppUpdaterUI.1.2(this));
    }
    
    public final void bzS()
    {
      if (AppUpdaterUI.this.isFinishing()) {
        return;
      }
      AppUpdaterUI.a(AppUpdaterUI.this).setText(R.l.update_getting_updatepack);
      AppUpdaterUI.a(AppUpdaterUI.this).setEnabled(false);
    }
    
    public final void cgR()
    {
      x.e("MicroMsg.AppUpdaterUI", "no sdcard.");
      if (AppUpdaterUI.b(AppUpdaterUI.this) != null) {
        AppUpdaterUI.b(AppUpdaterUI.this).dismiss();
      }
      if (AppUpdaterUI.this.isFinishing()) {
        return;
      }
      AppUpdaterUI.c(AppUpdaterUI.this);
    }
    
    public final void cgS()
    {
      if (AppUpdaterUI.b(AppUpdaterUI.this) != null) {
        AppUpdaterUI.b(AppUpdaterUI.this).dismiss();
      }
      if (AppUpdaterUI.this.isFinishing()) {
        return;
      }
      AppUpdaterUI.d(AppUpdaterUI.this);
    }
    
    public final void co(int paramAnonymousInt1, int paramAnonymousInt2)
    {
      if (paramAnonymousInt1 <= 0) {}
      for (long l = 0L;; l = paramAnonymousInt2 * 100L / paramAnonymousInt1)
      {
        paramAnonymousInt1 = (int)l;
        if (paramAnonymousInt1 != 100) {
          break;
        }
        AppUpdaterUI.a(AppUpdaterUI.this).setText(AppUpdaterUI.this.getString(R.l.update_merge_apk));
        return;
      }
      AppUpdaterUI.a(AppUpdaterUI.this).setText(AppUpdaterUI.this.getString(R.l.update_getting_updatepack) + paramAnonymousInt1 + "%");
    }
  };
  private DialogInterface.OnClickListener sDw = new DialogInterface.OnClickListener()
  {
    public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
    {
      AppUpdaterUI.g(AppUpdaterUI.this);
    }
  };
  
  public static AppUpdaterUI cgO()
  {
    return sDt;
  }
  
  public static void cgP()
  {
    if (sDt != null) {
      sDt.cgQ();
    }
  }
  
  private void cgQ()
  {
    if ((this.eIW != null) && (this.eIW.isShowing())) {
      this.eIW.dismiss();
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.d("MicroMsg.AppUpdaterUI", "onCreate");
    com.tencent.mm.sandbox.c.i(hashCode(), this);
    MMActivity.initLanguage(this);
    if ((AppInstallerUI.cgN() != null) && (!AppInstallerUI.cgN().isFinishing()))
    {
      x.d("MicroMsg.AppUpdaterUI", "AppInstallerUI is there, finish self");
      finish();
      return;
    }
    if ((sDt != null) && (!sDt.isFinishing()) && (sDt != this))
    {
      x.d("MicroMsg.AppUpdaterUI", "duplicate instance, finish self");
      x.d("MicroMsg.AppUpdaterUI", "we already got one instance, does it gonna leak?");
      finish();
      return;
    }
    sDt = this;
    setContentView(R.i.empty);
    this.sDu = j.a.sER;
    if (!this.sDu.ap(getIntent()))
    {
      x.e("MicroMsg.AppUpdaterUI", "updaterManager.handleCommand return false");
      cgQ();
      return;
    }
    if ((this.sDu.sDi == 999) && (this.sDu.sDK != null) && (this.sDu.sDK.length > 0))
    {
      x.d("MicroMsg.AppUpdaterUI", "into emergency status");
      new ag().postDelayed(new Runnable()
      {
        public final void run()
        {
          com.tencent.mm.ui.base.h.a(AppUpdaterUI.this, AppUpdaterUI.e(AppUpdaterUI.this).desc, AppUpdaterUI.this.getString(R.l.app_tip), new AppUpdaterUI.7.1(this)).setOnCancelListener(new AppUpdaterUI.7.2(this));
        }
      }, 100L);
      return;
    }
    x.d("MicroMsg.AppUpdaterUI", "showUpdateDlg, downloadUrls = " + this.sDu.sDK);
    Object localObject = new c.a(this);
    ((c.a)localObject).Gq(R.l.fmt_update);
    ((c.a)localObject).mF(true);
    ((c.a)localObject).e(new AppUpdaterUI.8(this));
    if ((this.sDu.sEF) && (this.sDu.sEE != null))
    {
      paramBundle = getString(R.l.fmt_update_info, new Object[] { this.sDu.desc, getString(R.l.update_increment_tips), bi.bF(this.sDu.sEE.size) });
      label339:
      if (this.sDu.sDi == 1) {
        break label562;
      }
    }
    label562:
    for (int i = R.l.update_cancel;; i = R.l.update_exit)
    {
      ((c.a)localObject).abu(paramBundle);
      ((c.a)localObject).Gt(R.l.update_now).a(false, this.sDp);
      ((c.a)localObject).Gu(i);
      this.eIW = ((c.a)localObject).anj();
      this.eIW.setCanceledOnTouchOutside(false);
      this.sDs = this.eIW.getButton(-1);
      this.haQ = this.eIW.getButton(-2);
      this.eIW.show();
      if (this.sDu.nPm == 1) {
        i.ai(this, 5);
      }
      if (this.sDu.sEJ) {
        com.tencent.mm.plugin.report.service.h.mEJ.a(614L, 60L, 1L, false);
      }
      paramBundle = this.sDu;
      localObject = this.sDv;
      if ((localObject == null) || (paramBundle.sEA.contains(localObject))) {
        break;
      }
      paramBundle.sEA.add(localObject);
      return;
      x.d("MicroMsg.AppUpdaterUI", "had try to download full pack.");
      paramBundle = getString(R.l.fmt_update_info, new Object[] { this.sDu.desc, getString(R.l.update_full_web_tips), bi.bF(this.sDu.size) });
      break label339;
    }
  }
  
  protected void onDestroy()
  {
    x.d("MicroMsg.AppUpdaterUI", "onDestroy");
    com.tencent.mm.sandbox.c.j(hashCode(), this);
    if (this.sDu != null)
    {
      j localj = this.sDu;
      g localg = this.sDv;
      localj.sEA.remove(localg);
    }
    if (sDt == this) {
      sDt = null;
    }
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/sandbox/updater/AppUpdaterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */