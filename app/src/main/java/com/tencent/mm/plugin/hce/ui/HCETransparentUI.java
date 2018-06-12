package com.tencent.mm.plugin.hce.ui;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.hce.a.b;
import com.tencent.mm.plugin.nfc.HCEService;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@a(7)
public class HCETransparentUI
  extends MMActivity
{
  private boolean kjl = false;
  private boolean kjm = false;
  private c kjn = null;
  private ProgressDialog kjo = null;
  private boolean kjp = false;
  private int kjq = 0;
  private Timer kjr;
  private TimerTask kjs;
  
  private void aVY()
  {
    if (!b.aVW())
    {
      aq(13000, "not support NFC");
      return;
    }
    if (!b.aVV())
    {
      aq(13002, "not support HCE");
      return;
    }
    if (!b.aVX())
    {
      if (this.kjl)
      {
        x.i("MicroMsg.HCETransparentUI", "alvinluo has shown open NFC dialog");
        k(13001, "system NFC switch not opened", getString(R.l.hce_not_open_nfc_switch_tips));
        return;
      }
      c.a locala = new c.a(this);
      locala.Gr(R.l.hce_open_nfc_switch_tips).Gt(R.l.jump_to_settings).a(new HCETransparentUI.2(this));
      Object localObject = new Intent("android.settings.NFC_SETTINGS");
      localObject = getPackageManager().queryIntentActivities((Intent)localObject, 65536);
      int i;
      if ((localObject != null) && (((List)localObject).size() > 0))
      {
        x.i("MicroMsg.HCETransparentUI", "alvinluo NFC activity not null, activities size: " + ((List)localObject).size());
        i = 0;
        while (i < ((List)localObject).size())
        {
          x.i("MicroMsg.HCETransparentUI", "alvinluo NFC activity: %s", new Object[] { ((ResolveInfo)((List)localObject).get(i)).activityInfo.name });
          i += 1;
        }
        i = 1;
        if (i == 0) {
          break label291;
        }
        locala.Gu(R.l.app_cancel).b(new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            x.i("MicroMsg.HCETransparentUI", "alvinluo user click cancel button of NFC tips dialog.");
            HCETransparentUI.a(HCETransparentUI.this, "system NFC switch not opened");
          }
        });
      }
      for (;;)
      {
        locala.e(new HCETransparentUI.4(this));
        this.kjn = locala.anj();
        this.kjn.setCanceledOnTouchOutside(false);
        this.kjn.show();
        this.kjl = true;
        return;
        x.e("MicroMsg.HCETransparentUI", "alvinluo Cannot jump to NFC setting");
        i = 0;
        break;
        label291:
        locala.Gt(R.l.app_ok);
      }
    }
    aVZ();
  }
  
  @TargetApi(19)
  private void aVZ()
  {
    CardEmulation localCardEmulation = CardEmulation.getInstance(NfcAdapter.getDefaultAdapter(this));
    ComponentName localComponentName = new ComponentName(this, HCEService.class.getCanonicalName());
    x.i("MicroMsg.HCETransparentUI", "alvinluo component name: " + localComponentName);
    if (!localCardEmulation.isDefaultServiceForCategory(localComponentName, "payment"))
    {
      x.i("MicroMsg.HCETransparentUI", "alvinluo not NFC Default Application, isAutoSet: %b", new Object[] { Boolean.valueOf(true) });
      x.i("MicroMsg.HCETransparentUI", "alvinluo request set default NFC application, hasRequestSetDefault: %b", new Object[] { Boolean.valueOf(this.kjm) });
      if (this.kjm)
      {
        x.i("MicroMsg.HCETransparentUI", "alvinluo has request set default NFC application");
        k(13004, "not set default NFC application", getString(R.l.hce_not_set_default_nfc_application_tips));
        return;
      }
      ah.i(new HCETransparentUI.6(this, localComponentName), 200L);
      return;
    }
    x.i("MicroMsg.HCETransparentUI", "alvinluo now is NFC Default Application");
    ar(0, "NFC switch has opened and now is NFC default application");
  }
  
  private void aq(int paramInt, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("errCode", paramInt);
    localIntent.putExtra("errMsg", paramString);
    setResult(1, localIntent);
  }
  
  private void ar(int paramInt, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("errCode", paramInt);
    localIntent.putExtra("errMsg", paramString);
    setResult(-1, localIntent);
    finish();
  }
  
  private void dismissDialog()
  {
    if ((this.kjn != null) && (this.kjn.isShowing()))
    {
      this.kjn.dismiss();
      this.kjn = null;
    }
    if (this.kjo != null)
    {
      this.kjo.dismiss();
      this.kjo = null;
    }
  }
  
  private void k(int paramInt, String paramString1, String paramString2)
  {
    dismissDialog();
    this.kjn = h.a(this, paramString2, "", getString(R.l.app_ok), new HCETransparentUI.5(this, paramInt, paramString1));
  }
  
  protected final int getLayoutId()
  {
    return R.i.hce_transparent_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.i("MicroMsg.HCETransparentUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      x.i("MicroMsg.HCETransparentUI", "alvinluo back from REQUEST_JUMP_NFC_SETTING");
      this.kjp = true;
    }
    while (paramInt1 != 2) {
      return;
    }
    x.i("MicroMsg.HCETransparentUI", "alvinluo back from REQUEST_SET_DEFAULT_NFC_APPLICATION");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    dismissDialog();
  }
  
  protected void onResume()
  {
    super.onResume();
    x.i("MicroMsg.HCETransparentUI", "alvinluo onResume");
    if (this.kjp)
    {
      this.kjs = new HCETransparentUI.1(this);
      this.kjr = new Timer();
      this.kjr.scheduleAtFixedRate(this.kjs, 0L, 300L);
      this.kjo = h.a(this, getString(R.l.app_waiting), false, null);
      return;
    }
    aVY();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/hce/ui/HCETransparentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */