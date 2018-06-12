package com.tencent.mm.plugin.readerapp.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.readerapp.a.g;
import com.tencent.mm.plugin.readerapp.a.h;
import com.tencent.mm.plugin.readerapp.c.c;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;
import java.util.Timer;
import junit.framework.Assert;

public final class b
  implements com.tencent.mm.pluginsdk.b.a, m.b
{
  Context context;
  private f eOE;
  private ab guS;
  
  public b(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private void auv()
  {
    int j = 1;
    int i;
    Object localObject;
    if ((q.GQ() & 0x80000) == 0)
    {
      i = 1;
      this.eOE.removeAll();
      this.eOE.addPreferencesFromResource(a.h.contact_info_pref_readerappnews);
      localObject = (HelperHeaderPreference)this.eOE.ZZ("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).an(this.guS.field_username, this.guS.BL(), this.context.getString(a.g.contact_info_readerappnews_tip));
      if (i == 0) {
        break label161;
      }
    }
    for (;;)
    {
      ((HelperHeaderPreference)localObject).nw(j);
      localObject = (CheckBoxPreference)this.eOE.ZZ("contact_info_readerappnews_recv_remind");
      boolean bool = c.bpR();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetReaderAppNews", "wantToReceiveNews = " + bool);
      ((CheckBoxPreference)localObject).qpJ = bool;
      if (i == 0) {
        break label166;
      }
      this.eOE.aaa("contact_info_readerappnews_install");
      return;
      i = 0;
      break;
      label161:
      j = 0;
    }
    label166:
    this.eOE.aaa("contact_info_readerappnews_subscribe");
    this.eOE.aaa("contact_info_readerappnews_view");
    this.eOE.aaa("contact_info_readerappnews_clear_data");
    this.eOE.aaa("contact_info_readerappnews_uninstall");
    this.eOE.aaa("contact_info_readerappnews_recv_remind");
  }
  
  static void hm(boolean paramBoolean)
  {
    int i = q.GL();
    if (paramBoolean)
    {
      i &= 0xFBFF;
      com.tencent.mm.kernel.g.Ei().DT().set(40, Integer.valueOf(i));
      if (!paramBoolean) {
        break label73;
      }
    }
    label73:
    for (i = 2;; i = 1)
    {
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new com.tencent.mm.aq.g(26, i));
      return;
      i |= 0x400;
      break;
    }
  }
  
  public static void m(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Object localObject = paramContext.getString(a.g.settings_plugins_installing);; localObject = paramContext.getString(a.g.settings_plugins_uninstalling))
    {
      paramContext.getString(a.g.app_tip);
      localObject = com.tencent.mm.ui.base.h.a(paramContext, (String)localObject, true, null);
      paramContext = new b.3(paramBoolean, paramContext);
      new Timer().schedule(new b.4((ProgressDialog)localObject, paramContext), 5000L);
      return;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetReaderAppNews", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    if ((paramm != com.tencent.mm.kernel.g.Ei().DT()) || (i <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetReaderAppNews", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
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
      Assert.assertTrue(s.hv(paramab.field_username));
      com.tencent.mm.kernel.g.Ei().DT().a(this);
      this.guS = paramab;
      this.eOE = paramf;
      auv();
      return true;
    }
  }
  
  public final boolean auw()
  {
    com.tencent.mm.kernel.g.Ei().DT().b(this);
    com.tencent.mm.plugin.readerapp.b.a.ezo.vl();
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    boolean bool2 = false;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetReaderAppNews", "handleEvent : key = " + paramString);
    if (bi.oV(paramString).length() <= 0) {
      return false;
    }
    if (paramString.equals("contact_info_readerappnews_view"))
    {
      paramString = new Intent(this.context, ReaderAppUI.class);
      paramString.putExtra("type", 20);
      this.context.startActivity(paramString);
      com.tencent.mm.plugin.readerapp.b.a.ezo.vl();
      return true;
    }
    if (paramString.equals("contact_info_readerappnews_subscribe"))
    {
      paramString = new Intent(this.context, ReaderAppSubscribeUI.class);
      this.context.startActivity(paramString);
      return true;
    }
    if (paramString.equals("contact_info_readerappnews_clear_data"))
    {
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(a.g.contact_info_clear_data_alert), "", this.context.getString(a.g.app_clear), this.context.getString(a.g.app_cancel), new b.1(this), null);
      return true;
    }
    if (paramString.equals("contact_info_readerappnews_recv_remind"))
    {
      paramString = (CheckBoxPreference)this.eOE.ZZ(paramString);
      boolean bool3 = c.bpR();
      if (!bool3)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(15413, new Object[] { Integer.valueOf(7), "", "" });
        if (bool3) {
          break label312;
        }
      }
      label312:
      for (boolean bool1 = true;; bool1 = false)
      {
        paramString.qpJ = bool1;
        bool1 = bool2;
        if (!bool3) {
          bool1 = true;
        }
        hm(bool1);
        return true;
        com.tencent.mm.plugin.report.service.h.mEJ.h(15413, new Object[] { Integer.valueOf(6), "", "" });
        break;
      }
    }
    if (paramString.equals("contact_info_readerappnews_install"))
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(15413, new Object[] { Integer.valueOf(5), "", "" });
      m(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_readerappnews_uninstall"))
    {
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(a.g.settings_plugins_uninstall_hint), "", this.context.getString(a.g.app_clear), this.context.getString(a.g.app_cancel), new b.2(this), null);
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetReaderAppNews", "handleEvent : unExpected key = " + paramString);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/readerapp/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */