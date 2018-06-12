package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.account.ui.FacebookFriendUI;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import junit.framework.Assert;

public final class f
  implements com.tencent.mm.pluginsdk.b.a, m.b
{
  Context context;
  private com.tencent.mm.ui.base.preference.f eOE;
  private Map<String, Preference> eQe = new HashMap();
  private ab guS;
  private HelperHeaderPreference.a lWa;
  
  public f(Context paramContext)
  {
    this.context = paramContext;
    this.lWa = new p(paramContext);
    au.HU();
    c.FW().Ys("facebookapp");
  }
  
  private void auv()
  {
    this.eOE.removeAll();
    Object localObject;
    if (this.eQe.containsKey("contact_info_header_helper"))
    {
      localObject = (HelperHeaderPreference)this.eQe.get("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).a(this.guS, this.lWa);
      this.eOE.a((Preference)localObject);
    }
    if (this.eQe.containsKey("contact_info_facebookapp_cat")) {
      this.eOE.a((Preference)this.eQe.get("contact_info_facebookapp_cat"));
    }
    if ((q.GQ() & 0x2000) == 0) {}
    for (int i = 1; i == 0; i = 0)
    {
      if (this.eQe.containsKey("contact_info_facebookapp_install")) {
        this.eOE.a((Preference)this.eQe.get("contact_info_facebookapp_install"));
      }
      return;
    }
    if (!q.Hg()) {
      if (this.eQe.containsKey("contact_info_facebookapp_connect")) {
        this.eOE.a((Preference)this.eQe.get("contact_info_facebookapp_connect"));
      }
    }
    for (;;)
    {
      if (this.eQe.containsKey("contact_info_facebookapp_cat2")) {
        this.eOE.a((Preference)this.eQe.get("contact_info_facebookapp_cat2"));
      }
      if (!this.eQe.containsKey("contact_info_facebookapp_uninstall")) {
        break;
      }
      this.eOE.a((Preference)this.eQe.get("contact_info_facebookapp_uninstall"));
      return;
      if (this.eQe.containsKey("contact_info_facebookapp_addr"))
      {
        this.eOE.a((Preference)this.eQe.get("contact_info_facebookapp_addr"));
        localObject = (Preference)this.eQe.get("contact_info_facebookapp_addr");
        au.HU();
        ((Preference)localObject).setSummary((String)c.DT().get(65826, null));
      }
    }
  }
  
  public static void m(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Object localObject = paramContext.getString(R.l.settings_plugins_installing);; localObject = paramContext.getString(R.l.settings_plugins_uninstalling))
    {
      paramContext.getString(R.l.app_tip);
      paramContext = h.a(paramContext, (String)localObject, true, null);
      localObject = new f.2(paramBoolean);
      new Timer().schedule(new f.3(paramContext, (ag)localObject), 1500L);
      return;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetFacebookapp", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    au.HU();
    if ((paramm != c.DT()) || (i <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetFacebookapp", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
    }
    while ((i != 40) && (i != 34) && (i != 65825)) {
      return;
    }
    auv();
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ab paramab, boolean paramBoolean, int paramInt)
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
      Assert.assertTrue(s.hn(paramab.field_username));
      au.HU();
      c.DT().a(this);
      this.guS = paramab;
      this.eOE = paramf;
      paramf.addPreferencesFromResource(R.o.contact_info_pref_facebookapp);
      paramab = paramf.ZZ("contact_info_header_helper");
      if (paramab != null) {
        this.eQe.put("contact_info_header_helper", paramab);
      }
      paramab = paramf.ZZ("contact_info_facebookapp_listfriend");
      if (paramab != null) {
        this.eQe.put("contact_info_facebookapp_listfriend", paramab);
      }
      paramab = paramf.ZZ("contact_info_facebookapp_connect");
      if (paramab != null) {
        this.eQe.put("contact_info_facebookapp_connect", paramab);
      }
      paramab = (PreferenceCategory)paramf.ZZ("contact_info_facebookapp_cat");
      if (paramab != null) {
        this.eQe.put("contact_info_facebookapp_cat", paramab);
      }
      paramab = paramf.ZZ("contact_info_facebookapp_addr");
      if (paramab != null) {
        this.eQe.put("contact_info_facebookapp_addr", paramab);
      }
      paramab = (PreferenceCategory)paramf.ZZ("contact_info_facebookapp_cat2");
      if (paramab != null) {
        this.eQe.put("contact_info_facebookapp_cat2", paramab);
      }
      paramab = paramf.ZZ("contact_info_facebookapp_install");
      if (paramab != null) {
        this.eQe.put("contact_info_facebookapp_install", paramab);
      }
      paramf = paramf.ZZ("contact_info_facebookapp_uninstall");
      if (paramf != null) {
        this.eQe.put("contact_info_facebookapp_uninstall", paramf);
      }
      auv();
      return true;
    }
  }
  
  public final boolean auw()
  {
    au.HU();
    c.DT().b(this);
    this.eQe.get("contact_info_header_helper");
    com.tencent.mm.plugin.profile.a.ezo.vl();
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetFacebookapp", "handleEvent : key = " + paramString);
    if (bi.oV(paramString).length() <= 0) {
      return false;
    }
    if (paramString.equals("contact_info_facebookapp_install"))
    {
      m(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new f.1(this), null);
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_listfriend"))
    {
      paramString = new Intent(this.context, FacebookFriendUI.class);
      this.context.startActivity(paramString);
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_connect"))
    {
      d.b(this.context, "account", ".ui.FacebookAuthUI", new Intent());
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_addr"))
    {
      d.b(this.context, "account", ".ui.FacebookAuthUI", new Intent());
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetFacebookapp", "handleEvent : unExpected key = " + paramString);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */