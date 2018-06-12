package com.tencent.mm.plugin.facedetect.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.tencent.mm.a.g;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.facedetect.a.b;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.a.i;
import com.tencent.mm.plugin.facedetect.model.e;
import com.tencent.mm.plugin.facedetect.model.o;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.io.File;

public class FaceDebugUI
  extends MMPreference
{
  private f eOE;
  private CheckBoxPreference iPM = null;
  private CheckBoxPreference iPN = null;
  private CheckBoxPreference iPO = null;
  private CheckBoxPreference iPP = null;
  private CheckBoxPreference iPQ = null;
  private CheckBoxPreference iPR = null;
  private View ilW;
  
  private void aKm()
  {
    this.eOE = this.tCL;
    this.iPM = ((CheckBoxPreference)this.eOE.ZZ("face_debug_switch"));
    this.iPN = ((CheckBoxPreference)this.eOE.ZZ("face_debug_save_pic_switch"));
    this.iPO = ((CheckBoxPreference)this.eOE.ZZ("face_debug_save_final_switch"));
    this.iPP = ((CheckBoxPreference)this.eOE.ZZ("face_debug_save_lipreading_switch"));
    this.iPQ = ((CheckBoxPreference)this.eOE.ZZ("face_debug_save_voice_switch"));
    this.iPR = ((CheckBoxPreference)this.eOE.ZZ("face_debug_force_upload_video"));
    this.eOE.notifyDataSetChanged();
  }
  
  private void aKn()
  {
    boolean bool1 = e.aJE();
    boolean bool2 = e.aJG();
    boolean bool3 = e.aJH();
    boolean bool4 = e.aJI();
    boolean bool5 = e.aJJ();
    boolean bool6 = e.aJF();
    if (!bool1)
    {
      this.iPM.lM(false);
      this.eOE.bw("face_debug_save_pic_switch", true);
      this.eOE.bw("face_debug_save_final_switch", true);
      this.eOE.bw("face_debug_save_lipreading_switch", true);
      this.eOE.bw("face_debug_save_voice_switch", true);
      this.eOE.bw("face_debug_force_upload_video", true);
    }
    for (;;)
    {
      this.eOE.notifyDataSetChanged();
      return;
      this.iPM.lM(true);
      this.eOE.bw("face_debug_save_pic_switch", false);
      this.eOE.bw("face_debug_save_final_switch", false);
      this.eOE.bw("face_debug_save_lipreading_switch", false);
      this.eOE.bw("face_debug_save_voice_switch", false);
      this.eOE.bw("face_debug_force_upload_video", false);
      this.iPN.lM(bool2);
      this.iPO.lM(bool3);
      this.iPP.lM(bool4);
      this.iPQ.lM(bool5);
      this.iPR.lM(bool6);
    }
  }
  
  public final int Ys()
  {
    return a.i.face_debug_pref;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    aKm();
    if ("face_debug_switch".equals(paramPreference.mKey))
    {
      e.eD(this.iPM.isChecked());
      aKn();
      return true;
    }
    if ("face_debug_save_pic_switch".equals(paramPreference.mKey))
    {
      e.eE(this.iPN.isChecked());
      aKn();
      return true;
    }
    if ("face_debug_save_final_switch".equals(paramPreference.mKey))
    {
      e.eF(this.iPO.isChecked());
      aKn();
      return true;
    }
    if ("face_debug_save_lipreading_switch".equals(paramPreference.mKey))
    {
      e.eG(this.iPP.isChecked());
      aKn();
      return true;
    }
    if ("face_debug_save_voice_switch".equals(paramPreference.mKey))
    {
      e.eH(this.iPQ.isChecked());
      aKn();
      return true;
    }
    if ("face_debug_force_upload_video".equals(paramPreference.mKey))
    {
      e.eI(this.iPR.isChecked());
      aKn();
      return true;
    }
    if ("face_debug_clear_resource".equals(paramPreference.mKey))
    {
      paramf = new File(o.pA(0));
      if (paramf.exists()) {
        paramf.delete();
      }
      paramf = new File(o.pA(1));
      if (paramf.exists()) {
        paramf.delete();
      }
      at.dBv.T("LAST_LOGIN_FACE_MODEL_DETECT_VERSION", "-1");
      at.dBv.T("LAST_LOGIN_FACE_MODEL_ALIGNMENT_VERSION", "-1");
      return true;
    }
    if ("face_debug_check_resource".equals(paramPreference.mKey))
    {
      paramf = new File(o.pA(0));
      paramPreference = new File(o.pA(1));
      com.tencent.mm.ui.base.s.makeText(this.mController.tml, String.format("is detect model exists: %b, is alignment model exists: %b", new Object[] { Boolean.valueOf(paramf.exists()), Boolean.valueOf(paramPreference.exists()) }), 0).show();
      x.i("MicroMsg.FaceDebugUI", "hy: detect bin md5: %s", new Object[] { g.m(paramf) });
      x.i("MicroMsg.FaceDebugUI", "hy: alignment bin md5: %s", new Object[] { g.m(paramPreference) });
      return true;
    }
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.ilW = findViewById(a.e.mm_preference_list_content);
    this.ilW.setBackgroundResource(a.b.white);
    aKm();
    setMMTitle(getString(a.h.face_debug_name));
    setBackBtn(new FaceDebugUI.1(this));
  }
  
  protected void onResume()
  {
    super.onResume();
    aKn();
  }
  
  protected void onStop()
  {
    super.onStop();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/facedetect/ui/FaceDebugUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */