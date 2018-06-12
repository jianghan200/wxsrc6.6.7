package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.bottle.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.preference.HeadImgPreference;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class BottlePersonalInfoUI
  extends MMPreference
  implements f.c
{
  private SharedPreferences duR;
  private HashMap<Integer, Integer> eGU = new HashMap();
  private com.tencent.mm.ui.base.preference.f eOE;
  private c hlv;
  private int status;
  
  public final int Ys()
  {
    return R.o.bottle_settings_pref_personal_info;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    int i = 2;
    paramf = paramPreference.mKey;
    if (paramf.equals("bottle_settings_change_avatar"))
    {
      au.HU();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        com.tencent.mm.ui.base.s.gH(this);
        return false;
      }
      com.tencent.mm.pluginsdk.ui.tools.l.a(this, 2, null);
      return true;
    }
    if (paramf.equals("settings_district")) {
      return this.hlv.aus();
    }
    if (paramf.equals("settings_signature")) {
      return this.hlv.aur();
    }
    if (paramf.equals("bottle_settings_show_at_main"))
    {
      boolean bool = this.duR.getBoolean("bottle_settings_show_at_main", true);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BottleSettignsPersonalInfoUI", "switch change : open = " + bool + " item value = 32768 functionId = 14");
      if (bool) {}
      for (this.status |= 0x8000;; this.status &= 0xFFFF7FFF)
      {
        if (bool) {
          i = 1;
        }
        this.eGU.put(Integer.valueOf(14), Integer.valueOf(i));
        return true;
      }
    }
    if (paramf.equals("bottle_settings_clear_data"))
    {
      h.a(this.mController.tml, this.mController.tml.getString(R.l.contact_info_clear_data), "", this.mController.tml.getString(R.l.app_clear), this.mController.tml.getString(R.l.app_cancel), new BottlePersonalInfoUI.2(this), null);
      return true;
    }
    return false;
  }
  
  protected final void initView()
  {
    boolean bool = true;
    setMMTitle(R.l.settings_title);
    this.eOE = this.tCL;
    this.eOE.addPreferencesFromResource(R.o.bottle_wizard_step2);
    this.duR = this.duR;
    this.status = com.tencent.mm.model.q.GJ();
    Object localObject;
    if (getIntent().getBooleanExtra("is_allow_set", true))
    {
      this.hlv = new c(this, this.eOE);
      localObject = (CheckBoxPreference)this.eOE.ZZ("bottle_settings_show_at_main");
      if ((this.status & 0x8000) == 0) {
        break label160;
      }
    }
    for (;;)
    {
      ((CheckBoxPreference)localObject).qpJ = bool;
      setBackBtn(new BottlePersonalInfoUI.1(this));
      return;
      localObject = this.eOE;
      ((com.tencent.mm.ui.base.preference.f)localObject).aaa("settings_sex");
      ((com.tencent.mm.ui.base.preference.f)localObject).aaa("settings_district");
      ((com.tencent.mm.ui.base.preference.f)localObject).aaa("settings_signature");
      ((com.tencent.mm.ui.base.preference.f)localObject).aaa("bottle_settings_change_avatar_alert");
      break;
      label160:
      bool = false;
    }
  }
  
  public final void jX(String paramString)
  {
    if ((paramString != null) && (paramString.equals(ab.XV(com.tencent.mm.model.q.GF()))))
    {
      Bitmap localBitmap = com.tencent.mm.aa.c.a(paramString, false, -1);
      paramString = localBitmap;
      if (localBitmap == null) {
        paramString = com.tencent.mm.aa.c.a(com.tencent.mm.model.q.GF(), false, -1);
      }
      if (paramString != null) {
        break label73;
      }
      paramString = BitmapFactory.decodeResource(getResources(), R.g.default_avatar);
    }
    label73:
    for (;;)
    {
      ((HeadImgPreference)this.eOE.ZZ("bottle_settings_change_avatar")).O(paramString);
      return;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    do
    {
      Object localObject;
      do
      {
        do
        {
          do
          {
            return;
            localObject = getApplicationContext();
            au.HU();
            paramIntent = com.tencent.mm.pluginsdk.ui.tools.l.d((Context)localObject, paramIntent, com.tencent.mm.model.c.Gb());
          } while (paramIntent == null);
          localObject = new Intent();
          ((Intent)localObject).putExtra("CropImageMode", 1);
          ((Intent)localObject).putExtra("CropImage_OutputPath", paramIntent);
          ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
          a.ezn.a(this, (Intent)localObject, 4);
          return;
        } while (paramIntent == null);
        localObject = getApplicationContext();
        au.HU();
        localObject = com.tencent.mm.pluginsdk.ui.tools.l.d((Context)localObject, paramIntent, com.tencent.mm.model.c.Gb());
      } while (localObject == null);
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 1);
      localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.aa.q.Kp().c(ab.XV(com.tencent.mm.model.q.GF()), true, false));
      localIntent.putExtra("CropImage_ImgPath", (String)localObject);
      a.ezn.a(localIntent, 4, this, paramIntent);
      return;
    } while (paramIntent == null);
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    if (paramIntent == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BottleSettignsPersonalInfoUI", "crop picture failed");
      return;
    }
    new o(this.mController.tml, paramIntent).b(2, null);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.aa.q.Kp().d(this);
    initView();
  }
  
  public void onDestroy()
  {
    a.ezo.vl();
    com.tencent.mm.aa.q.Kp().e(this);
    super.onDestroy();
  }
  
  public void onPause()
  {
    c.auq();
    au.HU();
    com.tencent.mm.model.c.DT().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.eGU.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int i = ((Integer)localEntry.getKey()).intValue();
      int j = ((Integer)localEntry.getValue()).intValue();
      au.HU();
      com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.g(i, j));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BottleSettignsPersonalInfoUI", "switch  " + i + " " + j);
    }
    this.eGU.clear();
    super.onPause();
  }
  
  public void onResume()
  {
    HeadImgPreference localHeadImgPreference = (HeadImgPreference)this.eOE.ZZ("bottle_settings_change_avatar");
    Bitmap localBitmap2 = com.tencent.mm.aa.c.a(ab.XV(com.tencent.mm.model.q.GF()), false, -1);
    Bitmap localBitmap1 = localBitmap2;
    if (localBitmap2 == null) {
      localBitmap1 = com.tencent.mm.aa.c.a(com.tencent.mm.model.q.GF(), false, -1);
    }
    if (localBitmap1 != null) {
      localHeadImgPreference.O(localBitmap1);
    }
    localHeadImgPreference.mVS = new BottlePersonalInfoUI.3(this);
    if (this.hlv != null) {
      this.hlv.update();
    }
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/BottlePersonalInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */