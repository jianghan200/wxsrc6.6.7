package com.tencent.mm.plugin.fingerprint.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.CheckBox;
import com.tencent.d.b.f.f;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.j;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class FingerPrintAuthTransparentUI
  extends WalletBaseUI
  implements com.tencent.mm.pluginsdk.wallet.a
{
  private com.tencent.mm.pluginsdk.wallet.c jgt = new FingerPrintAuthTransparentUI.1(this);
  private i jhc = null;
  Dialog jhd;
  private j jhe = null;
  private int jhf = -1;
  private Animation jhg;
  private int jhh = 0;
  private boolean jhi = false;
  private int jhj = 0;
  private boolean jhk = false;
  View view = null;
  
  private void BL(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramString = getString(-1);
    }
    for (;;)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", getString(a.i.wallet_i_know_it), false, new FingerPrintAuthTransparentUI.3(this));
      return;
    }
  }
  
  private static void aNL()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: user cancelled");
    com.tencent.mm.plugin.fingerprint.a.aMW();
    if (com.tencent.mm.plugin.fingerprint.a.aMX() != null) {
      com.tencent.mm.plugin.fingerprint.b.c.aNe();
    }
  }
  
  private void fe(boolean paramBoolean)
  {
    com.tencent.mm.plugin.fingerprint.a.aMW();
    com.tencent.mm.plugin.fingerprint.a.aMX();
    com.tencent.mm.plugin.fingerprint.b.c.abort();
    com.tencent.mm.plugin.fingerprint.b.c.release();
    if (!com.tencent.mm.plugin.fingerprint.b.c.aNf()) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintAuthTransparentUI", "no fingerprints enrolled, use settings to enroll fingerprints first");
    }
    while (com.tencent.mm.plugin.fingerprint.b.c.a(this.jgt, paramBoolean) == 0) {
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintAuthTransparentUI", "startFingerprintAuth failed!");
  }
  
  public final void af(int paramInt, String paramString)
  {
    dO(false);
    if (paramInt == 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerPrintAuthTransparentUI", "open fingerprintpay success");
      a(new y(null, 19), false, false);
      paramString = LayoutInflater.from(this).inflate(a.g.finger_print_auth_success_dialog_layout, null);
      com.tencent.mm.ui.base.h.a(this.mController.tml, false, null, paramString, getString(a.i.wallet_i_know_it), "", new FingerPrintAuthTransparentUI.2(this), null);
      return;
    }
    if (paramInt == -2)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintAuthTransparentUI", "open fingerprintpay failed");
      paramInt = a.i.fingerprint_open_fail;
      if (!TextUtils.isEmpty(paramString)) {
        break label155;
      }
      paramString = getString(paramInt);
    }
    label155:
    for (;;)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", getString(a.i.fingerprint_try_again), getString(a.i.app_cancel), false, new FingerPrintAuthTransparentUI.4(this), new FingerPrintAuthTransparentUI.5(this));
      return;
      BL(paramString);
      return;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return this.jhe.d(paramInt1, paramInt2, paramString, paraml);
  }
  
  protected final void dO(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.jhd = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
    }
    while ((this.jhd == null) || (!this.jhd.isShowing())) {
      return;
    }
    this.jhd.dismiss();
    this.jhd = null;
  }
  
  public void finish()
  {
    if (this.jhe != null) {
      this.jhe.clear();
    }
    super.finish();
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerPrintAuthTransparentUI", "launch FingerPrintAuthTransparentUI");
    if (!com.tencent.mm.plugin.fingerprint.b.e.aNm())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintAuthTransparentUI", "device is not support FingerPrintAuth or load fingerpringauth so failed, finish UI!");
      finish();
      return;
    }
    if (com.tencent.mm.model.q.GS())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintAuthTransparentUI", "now account is isPayUPay, finish UI!");
      finish();
      return;
    }
    if (com.tencent.mm.plugin.fingerprint.b.e.aNy())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintAuthTransparentUI", "getIsOpenFPFromLocal is true, finish UI!");
      finish();
      return;
    }
    com.tencent.mm.plugin.fingerprint.a.aMW();
    com.tencent.mm.plugin.fingerprint.a.aMX();
    if (!com.tencent.mm.plugin.fingerprint.b.c.aNf())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintAuthTransparentUI", "isWxHasFingerPrint is false, finish UI!");
      finish();
      return;
    }
    if (com.tencent.mm.compatible.e.q.deQ.deZ != 1)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintAuthTransparentUI", "hy: device config force to not support");
      finish();
    }
    paramBundle = o.bOW();
    com.tencent.mm.plugin.fingerprint.a.aMW();
    com.tencent.mm.plugin.fingerprint.a.aMX();
    this.jhe = com.tencent.mm.plugin.fingerprint.b.c.aNg();
    this.jhk = com.tencent.mm.kernel.g.Ei().DT().getBoolean(aa.a.sQx, false);
    if ((paramBundle.bPs()) && (!com.tencent.mm.plugin.fingerprint.b.e.aNy()))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintAuthTransparentUI", "show fingerprint auth open guide!");
      f.cFZ().cGa();
      com.tencent.mm.plugin.report.service.h.mEJ.h(12924, new Object[] { Integer.valueOf(1) });
      com.tencent.mm.plugin.soter.c.a.xO(0);
      if (com.tencent.mm.kernel.g.Ei().DT().getBoolean(aa.a.sQu, true))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: first show. no check box");
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sQu, Boolean.valueOf(false));
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sQx, Boolean.valueOf(false));
        if (this.jhk) {}
        for (paramBundle = getString(a.i.guide_open_text_for_transparent_recover);; paramBundle = getString(a.i.guide_open_text_for_transparent))
        {
          com.tencent.mm.ui.base.h.a(this, paramBundle, "", getString(a.i.btn_guide_open_fingerprint), getString(a.i.app_cancel), false, new FingerPrintAuthTransparentUI.7(this), new FingerPrintAuthTransparentUI.8(this));
          com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sQw, Integer.valueOf(1));
          this.jhj = 1;
          com.tencent.mm.plugin.soter.c.a.dK(1, this.jhj);
          return;
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: already shown before. show dialog with check box");
      paramBundle = LayoutInflater.from(this).inflate(a.g.fingerprint_guide_dialog, null);
      CheckBox localCheckBox = (CheckBox)paramBundle.findViewById(a.f.fingerprint_not_show_any_more_cb);
      this.jhj = (((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sQw, null)).intValue() + 1);
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sQw, Integer.valueOf(this.jhj));
      com.tencent.mm.plugin.soter.c.a.dK(1, this.jhj);
      com.tencent.mm.ui.base.h.a(this, false, null, paramBundle, getString(a.i.btn_guide_open_fingerprint), getString(a.i.app_cancel), new FingerPrintAuthTransparentUI.9(this), new FingerPrintAuthTransparentUI.10(this, localCheckBox));
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerPrintAuthTransparentUI", "isReg?:" + paramBundle.bPs() + ";isOpenTouch:" + com.tencent.mm.plugin.fingerprint.b.e.aNy());
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintAuthTransparentUI", "finish FingerPrintAuthTransparentUI, not show the open guide!");
    finish();
  }
  
  public void onDestroy()
  {
    if ((this.jhc != null) && (this.jhc.isShowing()))
    {
      this.jhc.dismiss();
      this.jhc = null;
    }
    if (this.jhg != null) {
      this.jhg.cancel();
    }
    dO(false);
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerPrintAuthTransparentUI", "alvinluo onPause");
    PowerManager.WakeLock localWakeLock = ((PowerManager)this.mController.tml.getSystemService("power")).newWakeLock(536870913, "PostLocationService");
    if (localWakeLock != null) {
      localWakeLock.acquire();
    }
    aNL();
    if (localWakeLock != null) {
      localWakeLock.release();
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.jhi) {
      fe(false);
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */