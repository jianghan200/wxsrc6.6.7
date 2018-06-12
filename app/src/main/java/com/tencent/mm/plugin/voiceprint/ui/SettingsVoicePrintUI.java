package com.tencent.mm.plugin.voiceprint.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.at;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.voiceprint.model.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;

public class SettingsVoicePrintUI
  extends MMPreference
  implements e
{
  private ProgressDialog eHw = null;
  private f eOE;
  private boolean iSc = false;
  private View ilW;
  private VoiceHeaderPreference oFZ;
  
  private void bJh()
  {
    com.tencent.mm.plugin.report.service.h.mEJ.h(11390, new Object[] { Integer.valueOf(3) });
    Intent localIntent = new Intent();
    localIntent.setClass(this, VoiceCreateUI.class);
    localIntent.putExtra("kscene_type", 71);
    localIntent.putExtra("createVoicePrint", true);
    startActivityForResult(localIntent, 1);
    this.iSc = false;
  }
  
  public final int Ys()
  {
    return R.o.settings_voice_print;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoiceSettingsUI", "onSceneEnd, errType:%d, errCode:%d, sceneType:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paraml.getType()) });
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      this.eOE.bw("settings_voiceprint_unlock", true);
      this.eOE.bw("settings_voiceprint_reset", true);
      this.eOE.bw("settings_voiceprint_create", true);
      ((CheckBoxPreference)this.eOE.ZZ("settings_voiceprint_title")).lM(false);
      this.oFZ.cH(getString(R.l.voice_start_close), "");
      this.eOE.notifyDataSetChanged();
      if (this.eHw != null) {
        this.eHw.dismiss();
      }
    }
    label399:
    label460:
    label581:
    for (;;)
    {
      return;
      if (paraml.getType() == 615)
      {
        paramString = (i)paraml;
        if (paramString.mStatus != 1) {
          break label460;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoiceSettingsUI", "voiceprint exist");
        this.eOE.bw("settings_voiceprint_unlock", false);
        this.eOE.notifyDataSetChanged();
        paramInt1 = q.GL();
        paraml = (CheckBoxPreference)this.eOE.ZZ("settings_voiceprint_title");
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoiceSettingsUI", "opScene.getSwitch:%d", new Object[] { Integer.valueOf(paramString.oFh) });
        if (paramString.oFh <= 0) {
          break label399;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoiceSettingsUI", "voiceprint open");
        paraml.lM(true);
        this.eOE.bw("settings_voiceprint_reset", false);
        this.eOE.bw("settings_voiceprint_unlock", false);
        paramInt1 = 0x20000 | paramInt1;
        this.oFZ.cH(getString(R.l.voice_start_open), "");
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VoiceSettingsUI", "scene end plugSwitch %d", new Object[] { Integer.valueOf(paramInt1) });
        at.dBv.T("last_login_use_voice", String.valueOf(paramInt1));
        au.HU();
        c.DT().set(40, Integer.valueOf(paramInt1));
        this.eOE.bw("settings_voiceprint_create", true);
        this.eOE.bw("settings_voiceprint_title", false);
        this.oFZ.a(null);
        this.eOE.notifyDataSetChanged();
      }
      for (;;)
      {
        if (this.eHw == null) {
          break label581;
        }
        this.eHw.dismiss();
        return;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoiceSettingsUI", "voiceprint close");
        paraml.lM(false);
        this.eOE.bw("settings_voiceprint_reset", true);
        this.eOE.bw("settings_voiceprint_unlock", true);
        paramInt1 = 0xFFFDFFFF & paramInt1;
        this.oFZ.cH(getString(R.l.voice_start_close), "");
        break;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoiceSettingsUI", "voiceprint not exist");
        com.tencent.mm.plugin.report.service.h.mEJ.h(11390, new Object[] { Integer.valueOf(2) });
        this.eOE.bw("settings_voiceprint_unlock", true);
        this.eOE.bw("settings_voiceprint_reset", true);
        this.eOE.bw("settings_voiceprint_create", true);
        this.eOE.bw("settings_voiceprint_title", true);
        this.oFZ.cH(getString(R.l.voice_start_title), getString(R.l.voice_start_tip));
        this.oFZ.a(new SettingsVoicePrintUI.5(this));
        this.eOE.notifyDataSetChanged();
      }
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramPreference = paramPreference.mKey;
    Intent localIntent = new Intent();
    if (paramPreference.equals("settings_voiceprint_title"))
    {
      paramf = (CheckBoxPreference)paramf.ZZ("settings_voiceprint_title");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoiceSettingsUI", "checkPref.isChecked() " + paramf.isChecked());
      if ((this.eHw != null) && (this.eHw.isShowing())) {
        this.eHw.dismiss();
      }
      paramPreference = this.mController.tml;
      getString(R.l.app_tip);
      this.eHw = com.tencent.mm.ui.base.h.a(paramPreference, getString(R.l.app_waiting), true, new SettingsVoicePrintUI.4(this));
      if (paramf.isChecked()) {
        au.DF().a(new i(1), 0);
      }
      for (;;)
      {
        return true;
        au.DF().a(new i(2), 0);
      }
    }
    if (paramPreference.equals("settings_voiceprint_unlock"))
    {
      localIntent.setClass(this, VoiceUnLockUI.class);
      localIntent.putExtra("kscene_type", 73);
      startActivity(localIntent);
      return true;
    }
    if (paramPreference.equals("settings_voiceprint_reset"))
    {
      localIntent.setClass(this, VoiceCreateUI.class);
      localIntent.putExtra("KvoicePrintReset", true);
      localIntent.putExtra("kscene_type", 73);
      startActivityForResult(localIntent, 1);
      return true;
    }
    return false;
  }
  
  public final void initView()
  {
    au.HU();
    int i = bi.p(c.DT().get(40, Integer.valueOf(0)), 0);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VoiceSettingsUI", "plugSwitch " + i + " " + (i & 0x20000));
    this.eOE = this.tCL;
    this.oFZ = ((VoiceHeaderPreference)this.eOE.ZZ("settings_voiceprint_header"));
    ((CheckBoxPreference)this.eOE.ZZ("settings_voiceprint_title")).lM(true);
    this.eOE.notifyDataSetChanged();
    if ((this.eHw != null) && (this.eHw.isShowing())) {
      this.eHw.dismiss();
    }
    ActionBarActivity localActionBarActivity = this.mController.tml;
    getString(R.l.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(R.l.app_waiting), true, new SettingsVoicePrintUI.2(this));
    au.DF().a(new i(0), 0);
    this.eOE.bw("settings_voiceprint_unlock", true);
    this.eOE.bw("settings_voiceprint_reset", true);
    this.eOE.bw("settings_voiceprint_create", true);
    setBackBtn(new SettingsVoicePrintUI.3(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 1) && (paramIntent != null)) {
      this.iSc = paramIntent.getBooleanExtra("KIsCreateSuccess", false);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.settings_voiceprint);
    au.DF().a(615, this);
    this.ilW = findViewById(R.h.mm_preference_list_content);
    initView();
    this.ilW.setBackgroundResource(R.e.white);
    au.HU();
    c.DT().a(aa.a.sPp, Boolean.valueOf(false));
    au.HU();
    c.DT().a(aa.a.sPq, Boolean.valueOf(false));
    au.HU();
    c.DT().a(aa.a.sPr, Boolean.valueOf(false));
    au.HU();
    c.DT().a(aa.a.sPs, Boolean.valueOf(false));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VoiceSettingsUI", "unset all voiceprint config");
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    au.DF().b(615, this);
    if (this.eHw != null) {
      this.eHw.dismiss();
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VoiceSettingsUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      bJh();
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_microphone_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new SettingsVoicePrintUI.6(this), new SettingsVoicePrintUI.7(this));
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.iSc)
    {
      this.iSc = false;
      if ((this.eHw != null) && (this.eHw.isShowing())) {
        this.eHw.dismiss();
      }
      ActionBarActivity localActionBarActivity = this.mController.tml;
      getString(R.l.app_tip);
      this.eHw = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(R.l.app_waiting), true, new SettingsVoicePrintUI.1(this));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VoiceSettingsUI", "resume after create voiceprint, get switch status");
      au.DF().a(new i(1), 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/ui/SettingsVoicePrintUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */