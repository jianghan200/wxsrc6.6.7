package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.f;
import junit.framework.Assert;

abstract class l
  implements a, m.b
{
  protected Context context;
  protected f eOE;
  protected ab guS;
  protected HelperHeaderPreference.a lWG;
  
  public l(Context paramContext, HelperHeaderPreference.a parama)
  {
    this.context = paramContext;
    this.lWG = parama;
  }
  
  private void auv()
  {
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(Ys());
    boolean bool = bnv();
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.eOE.ZZ("contact_info_header_helper");
    if (localHelperHeaderPreference != null) {
      localHelperHeaderPreference.a(this.guS, this.lWG);
    }
    if (!bool)
    {
      this.eOE.aaa("contact_info_plugin_view");
      this.eOE.aaa("contact_info_plugin_clear_data");
      this.eOE.aaa("contact_info_plugin_uninstall");
      return;
    }
    this.eOE.aaa("contact_info_plugin_install");
  }
  
  protected abstract int Ys();
  
  public void a(int paramInt, m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetPlugin", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    au.HU();
    if ((paramm != c.DT()) || (i <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetPlugin", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
    }
    while ((i != 40) && (i != 34) && (i != 7)) {
      return;
    }
    auv();
  }
  
  public boolean a(f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    if (paramab != null)
    {
      paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      if (bi.oV(paramab.field_username).length() <= 0) {
        break label77;
      }
    }
    label77:
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramf != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      au.HU();
      c.DT().a(this);
      this.guS = paramab;
      this.eOE = paramf;
      auv();
      return true;
      paramBoolean = false;
      break;
    }
  }
  
  public boolean auw()
  {
    au.HU();
    c.DT().b(this);
    this.eOE.ZZ("contact_info_header_helper");
    return true;
  }
  
  protected abstract boolean bnv();
  
  protected abstract void clear();
  
  protected abstract void hb(boolean paramBoolean);
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public boolean wX(String paramString)
  {
    if ("contact_info_plugin_clear_data".equals(paramString))
    {
      h.a(this.context, this.context.getString(R.l.contact_info_clear_data), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new l.1(this), null);
      return true;
    }
    if (paramString.equals("contact_info_plugin_install"))
    {
      hb(true);
      return true;
    }
    if (paramString.equals("contact_info_plugin_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new l.2(this), null);
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetPlugin", "handleEvent : unexpected key = " + paramString);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */