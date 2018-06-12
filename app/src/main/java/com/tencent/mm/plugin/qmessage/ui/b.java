package com.tencent.mm.plugin.qmessage.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.r;
import java.util.Timer;
import junit.framework.Assert;

public final class b
  implements com.tencent.mm.pluginsdk.b.a, m.b
{
  Context context;
  private f eOE;
  private ab guS;
  private boolean lUD;
  
  public b(Context paramContext)
  {
    this.context = paramContext;
  }
  
  static void e(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i = q.GJ();
    if (paramBoolean)
    {
      paramInt1 = i | paramInt1;
      au.HU();
      c.DT().set(7, Integer.valueOf(paramInt1));
      if (!paramBoolean) {
        break label65;
      }
    }
    label65:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      au.HU();
      c.FQ().b(new com.tencent.mm.aq.g(paramInt2, paramInt1));
      return;
      paramInt1 = i & (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }
  
  public static void m(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Object localObject = paramContext.getString(R.l.settings_plugins_installing);; localObject = paramContext.getString(R.l.settings_plugins_uninstalling))
    {
      paramContext.getString(R.l.app_tip);
      paramContext = h.a(paramContext, (String)localObject, true, null);
      localObject = new ag()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          b.e(64, this.hlD, 5);
          b.e(8192, this.hlD, 12);
          int i = q.GQ();
          if (this.hlD) {
            i &= 0xFFFFFFDF;
          }
          for (;;)
          {
            au.HU();
            c.DT().set(34, Integer.valueOf(i));
            au.HU();
            c.FQ().b(new com.tencent.mm.aq.l("", "", "", "", "", "", "", "", i, "", ""));
            if (!this.hlD) {
              com.tencent.mm.plugin.qmessage.a.g.boe();
            }
            if (this.hlE != null) {
              this.hlE.a(null, null);
            }
            return;
            i |= 0x20;
          }
        }
      };
      new Timer().schedule(new b.8(paramContext, (ag)localObject), 5000L);
      return;
    }
  }
  
  private static boolean uS(int paramInt)
  {
    return (q.GJ() & paramInt) != 0;
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    au.HU();
    if (paramm != c.DT()) {
      return;
    }
    auv();
  }
  
  public final boolean a(f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    boolean bool2 = false;
    if (paramab != null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      Assert.assertTrue(s.hm(paramab.field_username));
      bool1 = bool2;
      if (paramf != null) {
        bool1 = true;
      }
      Assert.assertTrue(bool1);
      au.HU();
      c.DT().a(this);
      this.guS = paramab;
      this.lUD = paramBoolean;
      this.eOE = paramf;
      auv();
      return true;
    }
  }
  
  final void auv()
  {
    int j = 1;
    int i;
    boolean bool;
    HelperHeaderPreference localHelperHeaderPreference;
    if ((q.GQ() & 0x20) == 0)
    {
      i = 1;
      bool = uS(64);
      uS(8192);
      this.eOE.removeAll();
      this.eOE.addPreferencesFromResource(R.o.contact_info_pref_qmessage);
      localHelperHeaderPreference = (HelperHeaderPreference)this.eOE.ZZ("contact_info_header_helper");
      localHelperHeaderPreference.an(this.guS.field_username, this.guS.BL(), this.context.getString(R.l.contact_info_qmessage_tip));
      if (i == 0) {
        break label163;
      }
    }
    for (;;)
    {
      localHelperHeaderPreference.nw(j);
      if (i != 0) {
        break label168;
      }
      this.eOE.aaa("contact_info_view_message");
      this.eOE.aaa("contact_info_qmessage_recv_offline_msg");
      this.eOE.aaa("contact_info_qmessage_uninstall");
      this.eOE.aaa("contact_info_qmessage_clear_data");
      return;
      i = 0;
      break;
      label163:
      j = 0;
    }
    label168:
    this.eOE.aaa("contact_info_qmessage_install");
    ((CheckBoxPreference)this.eOE.ZZ("contact_info_qmessage_recv_offline_msg")).qpJ = bool;
  }
  
  public final boolean auw()
  {
    au.HU();
    c.DT().b(this);
    com.tencent.mm.plugin.qmessage.a.mbs.vl();
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetQMessage", "handleEvent : key = " + paramString);
    if (bi.oV(paramString).length() <= 0) {
      return false;
    }
    if (paramString.equals("contact_info_view_message"))
    {
      paramString = new Intent(this.context, QConversationUI.class);
      if (this.lUD) {
        ((Activity)this.context).setResult(-1, paramString);
      }
      for (;;)
      {
        ((Activity)this.context).finish();
        return true;
        this.context.startActivity(paramString);
      }
    }
    if (paramString.equals("contact_info_qmessage_recv_offline_msg"))
    {
      paramString = (CheckBoxPreference)this.eOE.ZZ(paramString);
      if (paramString.isChecked()) {
        e(64, true, 5);
      }
      for (;;)
      {
        return true;
        if (!uS(8192))
        {
          e(64, false, 5);
          return true;
        }
        h.a(this.context, R.l.contact_info_qmessage_close_weixin_online_tip, R.l.app_tip, new b.1(this), new b.2(this, paramString));
      }
    }
    if (paramString.equals("contact_info_qmessage_display_weixin_online"))
    {
      e(8192, ((CheckBoxPreference)this.eOE.ZZ(paramString)).isChecked(), 12);
      return true;
    }
    if (paramString.equals("contact_info_qmessage_clear_data"))
    {
      h.a(this.context, this.context.getString(R.l.contact_info_clear_data), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new b.3(this), null);
      return true;
    }
    if (paramString.equals("contact_info_qmessage_install"))
    {
      au.HU();
      if (bi.f((Integer)c.DT().get(9, null)) == 0)
      {
        h.b(this.context, R.l.settings_weibo_notice, R.l.app_tip, new b.4(this), new b.5(this));
        return true;
      }
      m(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_qmessage_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new b.6(this), null);
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetQMessage", "handleEvent : unExpected key = " + paramString);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/qmessage/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */