package com.tencent.mm.plugin.shake.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.au;
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
import com.tencent.mm.ui.base.preference.f;
import java.util.Timer;
import junit.framework.Assert;

public final class a
  implements aq, com.tencent.mm.pluginsdk.b.a, m.b
{
  Context context;
  private f eOE;
  private ab guS;
  
  public a(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private void auv()
  {
    boolean bool3 = true;
    Object localObject;
    int i;
    label74:
    boolean bool2;
    if ((q.GQ() & 0x100) == 0)
    {
      bool1 = true;
      localObject = (HelperHeaderPreference)this.eOE.ZZ("contact_info_header_helper");
      if (localObject != null)
      {
        ((HelperHeaderPreference)localObject).an(this.guS.field_username, this.guS.BL(), this.context.getString(R.l.contact_info_shake_tip));
        if (!bool1) {
          break label143;
        }
        i = 1;
        ((HelperHeaderPreference)localObject).nw(i);
      }
      this.eOE.bw("contact_info_shake_install", bool1);
      localObject = this.eOE;
      if (bool1) {
        break label148;
      }
      bool2 = true;
      label104:
      ((f)localObject).bw("contact_info_shake_go_shake", bool2);
      localObject = this.eOE;
      if (bool1) {
        break label153;
      }
    }
    label143:
    label148:
    label153:
    for (boolean bool1 = bool3;; bool1 = false)
    {
      ((f)localObject).bw("contact_info_shake_uninstall", bool1);
      return;
      bool1 = false;
      break;
      i = 0;
      break label74;
      bool2 = false;
      break label104;
    }
  }
  
  public static void m(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Object localObject = paramContext.getString(R.l.settings_plugins_installing);; localObject = paramContext.getString(R.l.settings_plugins_uninstalling))
    {
      paramContext.getString(R.l.app_tip);
      paramContext = h.a(paramContext, (String)localObject, true, null);
      localObject = new a.2(paramBoolean);
      new Timer().schedule(new a.3(paramContext, (ag)localObject), 1500L);
      return;
    }
  }
  
  public final void HK()
  {
    auv();
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetShake", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    au.HU();
    if ((paramm != c.DT()) || (i <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetShake", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
    }
    while ((i != 7) && (i != 34)) {
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
      Assert.assertTrue(s.ht(paramab.field_username));
      au.HU();
      c.DT().a(this);
      au.HU();
      c.a(this);
      this.guS = paramab;
      this.eOE = paramf;
      paramf.addPreferencesFromResource(R.o.contact_info_pref_shake);
      auv();
      return true;
    }
  }
  
  public final boolean auw()
  {
    au.HU();
    c.DT().b(this);
    au.HU();
    c.b(this);
    com.tencent.mm.plugin.shake.a.ezo.vl();
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetShake", "handleEvent : key = " + paramString);
    if (bi.oV(paramString).length() <= 0) {
      return false;
    }
    if (paramString.equals("contact_info_shake_go_shake"))
    {
      paramString = new Intent();
      paramString.setClass(this.context, ShakeReportUI.class);
      this.context.startActivity(paramString);
      ((Activity)this.context).finish();
      return true;
    }
    if (paramString.equals("contact_info_shake_install"))
    {
      m(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_shake_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new a.1(this), null);
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetShake", "handleEvent : unExpected key = " + paramString);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/shake/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */