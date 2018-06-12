package com.tencent.mm.plugin.facedetect.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.facedetect.a.b;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;

public class SettingsFacePrintManagerUI
  extends MMPreference
  implements com.tencent.mm.ab.e
{
  private ProgressDialog eHw = null;
  private f eOE;
  private FaceHeaderPreference iSb;
  private boolean iSc = false;
  private View ilW;
  
  public final int Ys()
  {
    return a.i.settings_face_print;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FaceSettingsManagerUI", "hy: onSceneEnd, errType:%d, errCode:%d, sceneType:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paraml.getType()) });
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      this.eOE.bw("settings_faceprint_create", true);
      this.eOE.bw("settings_faceprint_unlock", true);
      this.eOE.bw("settings_faceeprint_reset", true);
      ((CheckBoxPreference)this.eOE.ZZ("settings_faceprint_title")).lM(false);
      this.iSb.setTitle(getString(a.h.settings_faceprint_off));
      this.eOE.notifyDataSetChanged();
      if (this.eHw != null) {
        this.eHw.dismiss();
      }
    }
    label395:
    label456:
    label570:
    for (;;)
    {
      return;
      if (paraml.getType() == 938)
      {
        paramString = (com.tencent.mm.plugin.facedetect.b.q)paraml;
        if (!paramString.iMJ) {
          break label456;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FaceSettingsManagerUI", "faceprint exist");
        this.eOE.bw("settings_faceprint_unlock", false);
        this.eOE.notifyDataSetChanged();
        paramInt1 = com.tencent.mm.model.q.GL();
        paraml = (CheckBoxPreference)this.eOE.ZZ("settings_faceprint_title");
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FaceSettingsManagerUI", "opScene.isOpenSwitch:%b", new Object[] { Boolean.valueOf(paramString.iMK) });
        if (!paramString.iMK) {
          break label395;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FaceSettingsManagerUI", "hy: faceprint open");
        paraml.lM(true);
        this.eOE.bw("settings_faceeprint_reset", false);
        this.eOE.bw("settings_faceprint_unlock", false);
        paramInt1 = 0x400000 | paramInt1;
        this.iSb.cH(getString(a.h.settings_faceprint_on), "");
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FaceSettingsManagerUI", "scene end plugSwitch %d", new Object[] { Integer.valueOf(paramInt1) });
        at.dBv.T("last_login_use_voice", String.valueOf(paramInt1));
        g.Ei().DT().set(40, Integer.valueOf(paramInt1));
        this.eOE.bw("settings_faceprint_create", true);
        this.eOE.bw("settings_faceprint_title", false);
        this.iSb.a(null);
        this.eOE.notifyDataSetChanged();
      }
      for (;;)
      {
        if (this.eHw == null) {
          break label570;
        }
        this.eHw.dismiss();
        return;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FaceSettingsManagerUI", "hy: faceprint close");
        paraml.lM(false);
        this.eOE.bw("settings_faceeprint_reset", true);
        this.eOE.bw("settings_faceprint_unlock", true);
        paramInt1 = 0xFFBFFFFF & paramInt1;
        this.iSb.cH(getString(a.h.settings_faceprint_off), "");
        break;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FaceSettingsManagerUI", "faceprint not exist");
        com.tencent.mm.plugin.report.service.h.mEJ.h(11390, new Object[] { Integer.valueOf(2) });
        this.eOE.bw("settings_faceprint_create", true);
        this.eOE.bw("settings_faceprint_title", true);
        this.eOE.bw("settings_faceprint_unlock", true);
        this.eOE.bw("settings_faceeprint_reset", true);
        this.iSb.setTitle(getString(a.h.settings_face_title));
        this.iSb.a(new SettingsFacePrintManagerUI.5(this));
        this.eOE.notifyDataSetChanged();
      }
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramPreference = paramPreference.mKey;
    Intent localIntent = new Intent();
    if (paramPreference.equals("settings_faceprint_title"))
    {
      paramf = (CheckBoxPreference)paramf.ZZ("settings_faceprint_title");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FaceSettingsManagerUI", "hy: checkPref.isChecked() " + paramf.isChecked());
      if ((this.eHw != null) && (this.eHw.isShowing())) {
        this.eHw.dismiss();
      }
      paramPreference = this.mController.tml;
      getString(a.h.app_tip);
      this.eHw = com.tencent.mm.ui.base.h.a(paramPreference, getString(a.h.app_waiting), true, new SettingsFacePrintManagerUI.4(this));
      if (paramf.isChecked()) {
        g.DF().a(new com.tencent.mm.plugin.facedetect.b.q(1), 0);
      }
      for (;;)
      {
        return true;
        g.DF().a(new com.tencent.mm.plugin.facedetect.b.q(2), 0);
      }
    }
    if (paramPreference.equals("settings_faceprint_unlock"))
    {
      localIntent.setClass(this, FaceDetectUI.class);
      localIntent.putExtra("k_need_signature", true);
      localIntent.putExtra("k_user_name", com.tencent.mm.model.q.GI());
      localIntent.putExtra("k_purpose", 2);
      startActivity(localIntent);
      return true;
    }
    if (paramPreference.equals("settings_faceeprint_reset"))
    {
      localIntent.setClass(this, FaceDetectUI.class);
      localIntent.putExtra("k_need_signature", true);
      localIntent.putExtra("k_user_name", com.tencent.mm.model.q.GI());
      localIntent.putExtra("k_purpose", 1);
      startActivityForResult(localIntent, 1);
      return true;
    }
    return false;
  }
  
  public final void initView()
  {
    int i = bi.p(g.Ei().DT().get(40, Integer.valueOf(0)), 0);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FaceSettingsManagerUI", "plugSwitch " + i + " " + (i & 0x400000));
    this.eOE = this.tCL;
    this.iSb = ((FaceHeaderPreference)this.eOE.ZZ("settings_faceprint_header"));
    ((CheckBoxPreference)this.eOE.ZZ("settings_faceprint_title")).lM(true);
    this.eOE.notifyDataSetChanged();
    if ((this.eHw != null) && (this.eHw.isShowing())) {
      this.eHw.dismiss();
    }
    ActionBarActivity localActionBarActivity = this.mController.tml;
    getString(a.h.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(a.h.app_waiting), true, new SettingsFacePrintManagerUI.2(this));
    g.DF().a(new com.tencent.mm.plugin.facedetect.b.q(3), 0);
    this.eOE.bw("settings_faceprint_create", true);
    this.eOE.bw("settings_faceeprint_reset", true);
    this.eOE.bw("settings_faceprint_unlock", true);
    setBackBtn(new SettingsFacePrintManagerUI.3(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      if ((paramIntent != null) && (paramIntent.getIntExtra("err_code", 10) == 0)) {
        this.iSc = true;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FaceSettingsManagerUI", "hy: is reg ok: %b", new Object[] { Boolean.valueOf(this.iSc) });
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.h.face_lock_title);
    g.DF().a(938, this);
    this.ilW = findViewById(a.e.mm_preference_list_content);
    initView();
    this.ilW.setBackgroundResource(a.b.white);
    com.tencent.mm.plugin.facedetect.model.o.q(this);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    g.DF().b(938, this);
    if (this.eHw != null) {
      this.eHw.dismiss();
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 1)) {}
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FaceSettingsManagerUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults0[%d] grantResults1[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Integer.valueOf(paramArrayOfInt[1]), Long.valueOf(Thread.currentThread().getId()) });
      switch (paramInt)
      {
      default: 
        return;
      }
    } while ((paramArrayOfInt[0] == 0) && (paramArrayOfInt[1] == 0));
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FaceSettingsManagerUI", "hy: permission not granted");
    finish();
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
      getString(a.h.app_tip);
      this.eHw = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(a.h.app_waiting), true, new SettingsFacePrintManagerUI.1(this));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FaceSettingsManagerUI", "hy: resume after create face, get switch status");
      g.DF().a(new com.tencent.mm.plugin.facedetect.b.q(1), 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/facedetect/ui/SettingsFacePrintManagerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */