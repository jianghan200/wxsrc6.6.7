package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bl;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import junit.framework.Assert;

public final class e
  implements com.tencent.mm.pluginsdk.b.a, m.b
{
  private boolean bKe;
  final Context context;
  private f eOE;
  private final Map<String, Preference> eQe = new HashMap();
  private ab guS;
  private int status;
  
  public e(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private void auv()
  {
    int i = 1;
    this.status = q.GJ();
    boolean bool;
    if ((q.GQ() & 0x40) == 0)
    {
      bool = true;
      this.bKe = bool;
      this.eOE.removeAll();
      if (this.eQe.containsKey("contact_info_header_helper"))
      {
        HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.eQe.get("contact_info_header_helper");
        this.eOE.a(localHelperHeaderPreference);
        localHelperHeaderPreference = (HelperHeaderPreference)this.eOE.ZZ("contact_info_header_helper");
        localHelperHeaderPreference.an(this.guS.field_username, this.guS.BL(), this.context.getString(R.l.contact_info_floatbottle_tip));
        if (!this.bKe) {
          break label329;
        }
        label126:
        localHelperHeaderPreference.nw(i);
      }
      if (this.eQe.containsKey("contact_info_floatbottle_hide_cat")) {
        this.eOE.a((Preference)this.eQe.get("contact_info_floatbottle_hide_cat"));
      }
      if (!this.bKe) {
        break label334;
      }
      if (this.eQe.containsKey("contact_info_goto_floatbottle")) {
        this.eOE.a((Preference)this.eQe.get("contact_info_goto_floatbottle"));
      }
      if (this.eQe.containsKey("contact_info_floatbottle_clear_data")) {
        this.eOE.a((Preference)this.eQe.get("contact_info_floatbottle_clear_data"));
      }
      if (this.eQe.containsKey("contact_info_floatbottle_hide_cat2")) {
        this.eOE.a((Preference)this.eQe.get("contact_info_floatbottle_hide_cat2"));
      }
      if (this.eQe.containsKey("contact_info_floatbottle_uninstall")) {
        this.eOE.a((Preference)this.eQe.get("contact_info_floatbottle_uninstall"));
      }
    }
    label329:
    label334:
    while (!this.eQe.containsKey("contact_info_floatbottle_install"))
    {
      return;
      bool = false;
      break;
      i = 0;
      break label126;
    }
    this.eOE.a((Preference)this.eQe.get("contact_info_floatbottle_install"));
  }
  
  public static void m(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Object localObject = paramContext.getString(R.l.settings_plugins_installing);; localObject = paramContext.getString(R.l.settings_plugins_uninstalling))
    {
      paramContext.getString(R.l.app_tip);
      paramContext = h.a(paramContext, (String)localObject, true, null);
      localObject = new e.3(paramBoolean);
      new Timer().schedule(new e.4(paramContext, (ag)localObject), 1500L);
      return;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetFloatBottle", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    au.HU();
    if ((paramm != c.DT()) || (i <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetFloatBottle", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
    }
    while ((i != 40) && (i != 34) && (i != 7)) {
      return;
    }
    auv();
  }
  
  public final boolean a(f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramab != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(s.hl(paramab.field_username));
      au.HU();
      c.DT().a(this);
      this.guS = paramab;
      this.eOE = paramf;
      paramf.addPreferencesFromResource(R.o.contact_info_pref_floatbottle);
      paramab = paramf.ZZ("contact_info_header_helper");
      if (paramab != null) {
        this.eQe.put("contact_info_header_helper", paramab);
      }
      paramab = paramf.ZZ("contact_info_goto_floatbottle");
      if (paramab != null) {
        this.eQe.put("contact_info_goto_floatbottle", paramab);
      }
      paramab = (PreferenceCategory)paramf.ZZ("contact_info_floatbottle_hide_cat");
      if (paramab != null) {
        this.eQe.put("contact_info_floatbottle_hide_cat", paramab);
      }
      paramab = paramf.ZZ("contact_info_floatbottle_clear_data");
      if (paramab != null) {
        this.eQe.put("contact_info_floatbottle_clear_data", paramab);
      }
      paramab = (PreferenceCategory)paramf.ZZ("contact_info_floatbottle_hide_cat2");
      if (paramab != null) {
        this.eQe.put("contact_info_floatbottle_hide_cat2", paramab);
      }
      paramab = (PreferenceCategory)paramf.ZZ("contact_info_floatbottle_hide_cat3");
      if (paramab != null) {
        this.eQe.put("contact_info_floatbottle_hide_cat3", paramab);
      }
      paramab = paramf.ZZ("contact_info_floatbottle_install");
      if (paramab != null) {
        this.eQe.put("contact_info_floatbottle_install", paramab);
      }
      paramf = paramf.ZZ("contact_info_floatbottle_uninstall");
      if (paramf != null) {
        this.eQe.put("contact_info_floatbottle_uninstall", paramf);
      }
      auv();
      return true;
    }
  }
  
  public final boolean auw()
  {
    au.HU();
    c.DT().b(this);
    com.tencent.mm.plugin.bottle.a.ezo.vl();
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetFloatBottle", "handleEvent : key = " + paramString);
    if (bi.oV(paramString).length() <= 0) {
      return false;
    }
    if (paramString.equals("contact_info_goto_floatbottle"))
    {
      paramString = bl.IC();
      if ((bi.a(Integer.valueOf(paramString.sex), 0) <= 0) || (bi.oW(paramString.getProvince()))) {
        this.context.startActivity(new Intent(this.context, BottleWizardStep1.class));
      }
      for (;;)
      {
        return true;
        this.context.startActivity(new Intent(this.context, BottleBeachUI.class));
      }
    }
    if (paramString.equals("contact_info_floatbottle_clear_data"))
    {
      h.a(this.context, this.context.getString(R.l.contact_info_clear_data), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new e.1(this), null);
      return true;
    }
    if (paramString.equals("contact_info_floatbottle_install"))
    {
      m(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_floatbottle_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new e.2(this), null);
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetFloatBottle", "handleEvent : unExpected key = " + paramString);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */