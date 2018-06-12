package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.k.e;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;
import java.util.Timer;
import junit.framework.Assert;

public final class j
  implements com.tencent.mm.pluginsdk.b.a, m.b
{
  private static boolean isDeleteCancel = false;
  private Context context;
  private f eOE;
  private ab guS;
  
  public j(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private void auv()
  {
    boolean bool4 = true;
    boolean bool1;
    int i;
    boolean bool2;
    label54:
    Object localObject;
    label105:
    boolean bool3;
    if ((q.GQ() & 0x10) == 0)
    {
      bool1 = true;
      i = q.GJ();
      if (q.Hm()) {
        break label279;
      }
      if ((i & 0x4000) != 0)
      {
        au.HU();
        c.DT().set(7, Integer.valueOf(i & 0xBFFF));
      }
      bool2 = false;
      localObject = (HelperHeaderPreference)this.eOE.ZZ("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).an(this.guS.field_username, this.guS.BL(), this.context.getString(R.l.contact_info_medianote_tip));
      if (!bool1) {
        break label297;
      }
      i = 1;
      ((HelperHeaderPreference)localObject).nw(i);
      this.eOE.bw("contact_info_medianote_install", bool1);
      localObject = this.eOE;
      if (bool1) {
        break label302;
      }
      bool3 = true;
      label136:
      ((f)localObject).bw("contact_info_medianote_view", bool3);
      if ((!bool1) || (q.Hm())) {
        break label331;
      }
      if (bi.getInt(com.tencent.mm.k.g.AT().getValue("BindQQSwitch"), 1) != 1) {
        break label308;
      }
      bool3 = true;
      label176:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactWidgetMediaNote", "summerqq BindQQSwitch off");
    }
    for (;;)
    {
      localObject = this.eOE;
      if (!bool3)
      {
        bool3 = true;
        label197:
        ((f)localObject).bw("contact_info_medianote_sync_to_qqmail", bool3);
        localObject = this.eOE;
        if (bool1) {
          break label320;
        }
        bool3 = true;
        label221:
        ((f)localObject).bw("contact_info_medianote_clear_data", bool3);
        localObject = this.eOE;
        if (bool1) {
          break label326;
        }
      }
      label279:
      label297:
      label302:
      label308:
      label320:
      label326:
      for (bool1 = bool4;; bool1 = false)
      {
        ((f)localObject).bw("contact_info_medianote_uninstall", bool1);
        ((CheckBoxPreference)this.eOE.ZZ("contact_info_medianote_sync_to_qqmail")).qpJ = bool2;
        return;
        bool1 = false;
        break;
        if ((i & 0x4000) != 0)
        {
          bool2 = true;
          break label54;
        }
        bool2 = false;
        break label54;
        i = 0;
        break label105;
        bool3 = false;
        break label136;
        bool3 = false;
        break label176;
        bool3 = false;
        break label197;
        bool3 = false;
        break label221;
      }
      label331:
      bool3 = bool1;
    }
  }
  
  static void hc(boolean paramBoolean)
  {
    int i = q.GJ();
    if (paramBoolean)
    {
      i |= 0x4000;
      au.HU();
      c.DT().set(7, Integer.valueOf(i));
      if (!paramBoolean) {
        break label68;
      }
    }
    label68:
    for (i = 1;; i = 2)
    {
      au.HU();
      c.FQ().b(new com.tencent.mm.aq.g(13, i));
      return;
      i &= 0xBFFF;
      break;
    }
  }
  
  public static void m(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Object localObject = paramContext.getString(R.l.settings_plugins_installing);; localObject = paramContext.getString(R.l.settings_plugins_uninstalling))
    {
      paramContext.getString(R.l.app_tip);
      localObject = h.a(paramContext, (String)localObject, true, null);
      paramContext = new j.4(paramBoolean, paramContext);
      new Timer().schedule(new j.5((p)localObject, paramContext), 1500L);
      return;
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetMediaNote", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    au.HU();
    if ((paramm != c.DT()) || (i <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetMediaNote", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
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
      Assert.assertTrue(s.hu(paramab.field_username));
      au.HU();
      c.DT().a(this);
      this.guS = paramab;
      this.eOE = paramf;
      paramf.addPreferencesFromResource(R.o.contact_info_pref_medianote);
      auv();
      return true;
    }
  }
  
  public final boolean auw()
  {
    au.HU();
    c.DT().b(this);
    com.tencent.mm.plugin.profile.a.ezo.vl();
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetMediaNote", "handleEvent : key = " + paramString);
    if (bi.oV(paramString).length() <= 0) {
      return false;
    }
    if (paramString.equals("contact_info_medianote_view"))
    {
      paramString = new Intent();
      paramString.putExtra("Chat_User", "medianote");
      com.tencent.mm.plugin.profile.a.ezn.e(paramString, this.context);
      com.tencent.mm.plugin.profile.a.ezo.vl();
      return true;
    }
    if (paramString.equals("contact_info_medianote_sync_to_qqmail"))
    {
      if (!q.Hm())
      {
        h.a(this.context, R.l.contact_info_medianote_sync_to_qqmail_alert_tip, R.l.contact_info_medianote_sync_to_qqmail, new j.1(this), null);
        auv();
      }
      for (;;)
      {
        return true;
        hc(((CheckBoxPreference)this.eOE.ZZ(paramString)).isChecked());
      }
    }
    if (paramString.equals("contact_info_medianote_clear_data"))
    {
      h.a(this.context, this.context.getString(R.l.contact_info_clear_data), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new j.2(this), null);
      return true;
    }
    if (paramString.equals("contact_info_medianote_install"))
    {
      m(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_medianote_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new j.3(this), null);
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetMediaNote", "handleEvent : unExpected key = " + paramString);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */