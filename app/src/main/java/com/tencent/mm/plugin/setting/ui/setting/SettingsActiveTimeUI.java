package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.model.as;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.s;
import java.sql.Time;
import java.text.DateFormat;

public class SettingsActiveTimeUI
  extends MMPreference
{
  private boolean bGv = false;
  private com.tencent.mm.ui.base.preference.f eOE;
  private Preference gYX;
  private Preference gYY;
  private int mRD;
  private int mRE;
  private int mRF;
  private int mRG;
  private boolean mRH = false;
  private final TimePickerDialog.OnTimeSetListener mRI = new SettingsActiveTimeUI.2(this);
  
  private static String f(Context paramContext, int paramInt1, int paramInt2)
  {
    String str1 = w.e(paramContext.getSharedPreferences(ad.chY(), 0));
    String str2 = w.chP();
    if ((!str1.equalsIgnoreCase("zh_CN")) && ((!str1.equalsIgnoreCase("language_default")) || (!"zh_CN".equalsIgnoreCase(str2)))) {
      return DateFormat.getTimeInstance(3, w.Wl(str1)).format(new Time(paramInt1, paramInt2, 0));
    }
    if (paramInt1 > 12) {}
    for (int i = paramInt1 - 12;; i = paramInt1) {
      return com.tencent.mm.pluginsdk.f.h.p(paramContext, paramInt1 * 3600000L + paramInt2 * 60000L) + String.format("%02d:%02d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) });
    }
  }
  
  public final int Ys()
  {
    return a.k.settings_pref_active_time;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    if (paramPreference.mKey.equals("settings_active_begin_time"))
    {
      this.mRH = true;
      showDialog(1);
      return true;
    }
    if (paramPreference.mKey.equals("settings_active_end_time"))
    {
      this.mRH = false;
      showDialog(1);
      return true;
    }
    if (paramPreference.mKey.equals("settings_active_silence_time"))
    {
      paramf = (CheckBoxPreference)this.eOE.ZZ("settings_active_silence_time");
      boolean bool;
      if (!paramf.isChecked())
      {
        bool = true;
        com.tencent.mm.k.f.bm(bool);
        paramPreference = com.tencent.mm.plugin.report.service.h.mEJ;
        if (!paramf.isChecked()) {
          break label140;
        }
      }
      label140:
      for (int i = 1;; i = 2)
      {
        paramPreference.h(11351, new Object[] { Integer.valueOf(0), Integer.valueOf(i) });
        initView();
        return true;
        bool = false;
        break;
      }
    }
    return false;
  }
  
  protected final void initView()
  {
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(a.k.settings_pref_active_time);
    this.gYY = this.eOE.ZZ("settings_active_begin_time");
    this.mRD = com.tencent.mm.k.f.Ar();
    this.mRE = com.tencent.mm.k.f.At();
    this.gYY.setSummary(f(this, this.mRD, this.mRE));
    this.gYX = this.eOE.ZZ("settings_active_end_time");
    this.mRF = com.tencent.mm.k.f.Aq();
    this.mRG = com.tencent.mm.k.f.As();
    this.gYX.setSummary(f(this, this.mRF, this.mRG));
    boolean bool;
    if (!com.tencent.mm.k.f.Ap())
    {
      bool = true;
      this.bGv = bool;
      ((CheckBoxPreference)this.eOE.ZZ("settings_active_silence_time")).qpJ = this.bGv;
      if (!this.bGv) {
        break label248;
      }
      this.gYY.setEnabled(true);
      this.gYX.setEnabled(true);
    }
    for (;;)
    {
      if (!this.bGv)
      {
        this.eOE.c(this.gYY);
        this.eOE.c(this.gYX);
      }
      this.eOE.bw("settings_active_time_full", true);
      this.eOE.notifyDataSetChanged();
      setBackBtn(new SettingsActiveTimeUI.1(this));
      return;
      bool = false;
      break;
      label248:
      this.gYY.setEnabled(false);
      this.gYX.setEnabled(false);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.settings_active_time);
    this.eOE = this.tCL;
    initView();
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    if (this.mRH) {
      return new TimePickerDialog(this.mController.tml, this.mRI, this.mRD, this.mRE, false);
    }
    return new TimePickerDialog(this.mController.tml, this.mRI, this.mRF, this.mRG, false);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    as.ha(2);
  }
  
  protected void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    switch (paramInt)
    {
    default: 
      return;
    }
    if (this.mRH)
    {
      ((TimePickerDialog)paramDialog).updateTime(this.mRD, this.mRE);
      return;
    }
    ((TimePickerDialog)paramDialog).updateTime(this.mRF, this.mRG);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsActiveTimeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */