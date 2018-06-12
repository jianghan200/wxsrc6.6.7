package com.tencent.mm.plugin.setting.ui.setting;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.preference.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SettingsAddMeUI
  extends MMPreference
{
  private HashMap<Integer, Integer> eGU = new HashMap();
  private f eOE;
  private long hXx;
  private int mRK;
  private int status;
  
  private void b(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAddMeUI", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.status |= paramInt1;
      if (!paramBoolean) {
        break label91;
      }
    }
    label91:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      this.eGU.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      return;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }
  
  private void c(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAddMeUI", "switch ext change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.hXx |= paramInt1;
      if (!paramBoolean) {
        break label93;
      }
    }
    label93:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      this.eGU.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      return;
      this.hXx &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }
  
  private boolean uL(int paramInt)
  {
    return (this.status & paramInt) != 0;
  }
  
  public final int Ys()
  {
    return a.k.settings_add_me;
  }
  
  public final h a(SharedPreferences paramSharedPreferences)
  {
    return new com.tencent.mm.ui.base.preference.a(this, paramSharedPreferences);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool1 = false;
    paramPreference = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAddMeUI", paramPreference + " item has been clicked!");
    if (paramPreference.equals("settings_find_me_by_QQ"))
    {
      if (!((CheckBoxPreference)paramf.ZZ("settings_find_me_by_QQ")).isChecked()) {}
      for (bool1 = true;; bool1 = false)
      {
        b(bool1, 8, 2);
        b(bool1, 16, 3);
        return true;
      }
    }
    if (paramPreference.equals("settings_find_me_by_weixin"))
    {
      if (!((CheckBoxPreference)paramf.ZZ("settings_find_me_by_weixin")).isChecked()) {
        bool1 = true;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAddMeUI", "switch plug change : open = " + bool1 + " item value = 512 functionId = 25");
      if (bool1)
      {
        this.mRK |= 0x200;
        if (!bool1) {
          break label216;
        }
      }
      label216:
      for (int i = 1;; i = 2)
      {
        this.eGU.put(Integer.valueOf(25), Integer.valueOf(i));
        return true;
        this.mRK &= 0xFDFF;
        break;
      }
    }
    if (paramPreference.equals("settings_find_me_by_mobile"))
    {
      bool1 = bool2;
      if (!((CheckBoxPreference)paramf.ZZ("settings_find_me_by_mobile")).isChecked()) {
        bool1 = true;
      }
      b(bool1, 512, 8);
      return true;
    }
    if (paramPreference.equals("settings_find_me_by_google"))
    {
      bool1 = bool3;
      if (!((CheckBoxPreference)paramf.ZZ("settings_find_me_by_google")).isChecked()) {
        bool1 = true;
      }
      b(bool1, 524288, 30);
      return true;
    }
    if (paramPreference.equals("settings_add_me_by_chatroom"))
    {
      bool1 = bool4;
      if (!((CheckBoxPreference)paramf.ZZ("settings_add_me_by_chatroom")).isChecked()) {
        bool1 = true;
      }
      c(bool1, 1, 38);
      return true;
    }
    if (paramPreference.equals("settings_add_me_by_qrcode"))
    {
      bool1 = bool5;
      if (!((CheckBoxPreference)paramf.ZZ("settings_add_me_by_qrcode")).isChecked()) {
        bool1 = true;
      }
      c(bool1, 2, 39);
      return true;
    }
    if (paramPreference.equals("settings_add_me_by_namecard"))
    {
      bool1 = bool6;
      if (!((CheckBoxPreference)paramf.ZZ("settings_add_me_by_namecard")).isChecked()) {
        bool1 = true;
      }
      c(bool1, 4, 40);
      return true;
    }
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_add_me_way);
    setBackBtn(new SettingsAddMeUI.1(this));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAddMeUI", "plug:" + this.mRK + ",status:" + this.status + ",extstatus:" + this.hXx);
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(a.k.settings_add_me);
    Object localObject1 = (Integer)com.tencent.mm.kernel.g.Ei().DT().get(9, null);
    Object localObject2 = (CheckBoxPreference)this.eOE.ZZ("settings_find_me_by_QQ");
    ((Preference)localObject2).tDr = false;
    boolean bool;
    if ((localObject1 != null) && (((Integer)localObject1).intValue() != 0)) {
      if ((!uL(8)) || (!uL(16)))
      {
        bool = true;
        ((CheckBoxPreference)localObject2).qpJ = bool;
        label160:
        localObject1 = (String)com.tencent.mm.kernel.g.Ei().DT().get(6, null);
        localObject2 = (CheckBoxPreference)this.eOE.ZZ("settings_find_me_by_mobile");
        ((Preference)localObject2).tDr = false;
        if ((localObject1 == null) || (((String)localObject1).length() <= 0)) {
          break label483;
        }
        if (uL(512)) {
          break label478;
        }
        bool = true;
        label219:
        ((CheckBoxPreference)localObject2).qpJ = bool;
        label224:
        localObject1 = (CheckBoxPreference)this.eOE.ZZ("settings_find_me_by_weixin");
        ((Preference)localObject1).tDr = false;
        if ((this.mRK & 0x200) == 0) {
          break label497;
        }
        ((CheckBoxPreference)localObject1).qpJ = false;
        label260:
        localObject1 = (CheckBoxPreference)this.eOE.ZZ("settings_find_me_by_google");
        if (uL(524288)) {
          break label505;
        }
        bool = true;
        label286:
        ((CheckBoxPreference)localObject1).qpJ = bool;
        ((Preference)localObject1).tDr = false;
        localObject2 = (String)com.tencent.mm.kernel.g.Ei().DT().get(208903, null);
        if ((!bi.fU(this)) || (TextUtils.isEmpty((CharSequence)localObject2))) {
          this.eOE.c((Preference)localObject1);
        }
        localObject1 = (CheckBoxPreference)this.eOE.ZZ("settings_add_me_by_chatroom");
        ((Preference)localObject1).tDr = false;
        if ((this.hXx & 1L) == 0L) {
          break label510;
        }
        ((CheckBoxPreference)localObject1).qpJ = false;
        label373:
        localObject1 = (CheckBoxPreference)this.eOE.ZZ("settings_add_me_by_qrcode");
        ((Preference)localObject1).tDr = false;
        if ((this.hXx & 0x2) == 0L) {
          break label518;
        }
        ((CheckBoxPreference)localObject1).qpJ = false;
        label411:
        localObject1 = (CheckBoxPreference)this.eOE.ZZ("settings_add_me_by_namecard");
        ((Preference)localObject1).tDr = false;
        if ((this.hXx & 0x4) == 0L) {
          break label526;
        }
      }
    }
    label478:
    label483:
    label497:
    label505:
    label510:
    label518:
    label526:
    for (((CheckBoxPreference)localObject1).qpJ = false;; ((CheckBoxPreference)localObject1).qpJ = true)
    {
      this.eOE.notifyDataSetChanged();
      return;
      bool = false;
      break;
      this.eOE.c((Preference)localObject2);
      break label160;
      bool = false;
      break label219;
      this.eOE.c((Preference)localObject2);
      break label224;
      ((CheckBoxPreference)localObject1).qpJ = true;
      break label260;
      bool = false;
      break label286;
      ((CheckBoxPreference)localObject1).qpJ = true;
      break label373;
      ((CheckBoxPreference)localObject1).qpJ = true;
      break label411;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    this.mRK = q.GL();
    this.status = q.GJ();
    this.hXx = q.GK();
    initView();
  }
  
  public void onPause()
  {
    super.onPause();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAddMeUI", "plug:" + this.mRK + ",status:" + this.status + ",extstatus:" + this.hXx);
    com.tencent.mm.kernel.g.Ei().DT().set(7, Integer.valueOf(this.status));
    com.tencent.mm.kernel.g.Ei().DT().set(40, Integer.valueOf(this.mRK));
    com.tencent.mm.kernel.g.Ei().DT().set(147457, Long.valueOf(this.hXx));
    Iterator localIterator = this.eGU.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      int j = ((Integer)((Map.Entry)localObject).getValue()).intValue();
      localObject = new xt();
      ((xt)localObject).rDz = i;
      ((xt)localObject).rDA = j;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(23, (com.tencent.mm.bk.a)localObject));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAddMeUI", "switch  " + i + " " + j);
    }
    this.eGU.clear();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsAddMeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */