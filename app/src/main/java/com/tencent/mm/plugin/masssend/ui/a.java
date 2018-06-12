package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.masssend.a.b;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class a
  implements com.tencent.mm.pluginsdk.b.a, m.b
{
  Context context;
  private f eOE;
  private Map<String, Preference> eQe = new HashMap();
  private ab guS;
  
  public a(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public static void acV()
  {
    b localb = com.tencent.mm.plugin.masssend.a.h.bco();
    if (localb.dCZ.fV("massendinfo", "delete from massendinfo")) {
      localb.doNotify();
    }
    au.HU();
    c.FW().Yp("masssendapp");
  }
  
  private void auv()
  {
    boolean bool3 = true;
    Object localObject;
    int i;
    label65:
    boolean bool2;
    if ((q.GQ() & 0x10000) == 0)
    {
      bool1 = true;
      localObject = (HelperHeaderPreference)this.eOE.ZZ("contact_info_masssend_header_helper");
      ((HelperHeaderPreference)localObject).an(this.guS.field_username, this.guS.BL(), this.context.getString(R.l.contact_info_masssend_tip));
      if (!bool1) {
        break label156;
      }
      i = 1;
      ((HelperHeaderPreference)localObject).nw(i);
      this.eOE.bw("contact_info_masssend_install", bool1);
      localObject = this.eOE;
      if (bool1) {
        break label161;
      }
      bool2 = true;
      label95:
      ((f)localObject).bw("contact_info_masssend_view", bool2);
      localObject = this.eOE;
      if (bool1) {
        break label166;
      }
      bool2 = true;
      label117:
      ((f)localObject).bw("contact_info_masssend_clear_data", bool2);
      localObject = this.eOE;
      if (bool1) {
        break label171;
      }
    }
    label156:
    label161:
    label166:
    label171:
    for (boolean bool1 = bool3;; bool1 = false)
    {
      ((f)localObject).bw("contact_info_masssend_uninstall", bool1);
      return;
      bool1 = false;
      break;
      i = 0;
      break label65;
      bool2 = false;
      break label95;
      bool2 = false;
      break label117;
    }
  }
  
  public static void m(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (final Object localObject = paramContext.getString(R.l.settings_plugins_installing);; localObject = paramContext.getString(R.l.settings_plugins_uninstalling))
    {
      paramContext.getString(R.l.app_tip);
      paramContext = com.tencent.mm.ui.base.h.a(paramContext, (String)localObject, true, null);
      localObject = new a.3(paramBoolean);
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          if (this.hlF != null)
          {
            this.hlF.dismiss();
            localObject.sendEmptyMessage(0);
          }
        }
      }, 1500L);
      return;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetMassSend", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    au.HU();
    if ((paramm != c.DT()) || (i <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetMassSend", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
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
      Assert.assertTrue(s.ho(paramab.field_username));
      au.HU();
      c.DT().a(this);
      this.guS = paramab;
      this.eOE = paramf;
      paramf.addPreferencesFromResource(R.o.contact_info_pref_masssend);
      auv();
      return true;
    }
  }
  
  public final boolean auw()
  {
    au.HU();
    c.DT().b(this);
    com.tencent.mm.plugin.masssend.a.ezo.vl();
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetMassSend", "handleEvent : key = " + paramString);
    if (bi.oV(paramString).length() <= 0) {
      return false;
    }
    if (paramString.equals("contact_info_masssend_view"))
    {
      paramString = new Intent(this.context, MassSendHistoryUI.class);
      this.context.startActivity(paramString);
      return true;
    }
    if (paramString.equals("contact_info_masssend_clear_data"))
    {
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.contact_info_clear_data), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new a.1(this), null);
      return true;
    }
    if (paramString.equals("contact_info_masssend_install"))
    {
      m(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_masssend_uninstall"))
    {
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new a.2(this), null);
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetMassSend", "handleEvent : unExpected key = " + paramString);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/masssend/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */