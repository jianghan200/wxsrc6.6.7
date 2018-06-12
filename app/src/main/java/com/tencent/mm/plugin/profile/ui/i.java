package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.f;
import junit.framework.Assert;

public final class i
  implements com.tencent.mm.pluginsdk.b.a, m.b
{
  Context context;
  private f eOE;
  private ab guS;
  private HelperHeaderPreference.a lWg;
  
  public i(Context paramContext)
  {
    this.context = paramContext;
    this.lWg = new r(paramContext);
  }
  
  private void auv()
  {
    if ((q.GQ() & 0x1000000) == 0) {}
    for (int i = 1;; i = 0)
    {
      this.eOE.removeAll();
      this.eOE.addPreferencesFromResource(R.o.contact_info_pref_linkedin);
      ((HelperHeaderPreference)this.eOE.ZZ("contact_info_header_helper")).a(this.guS, this.lWg);
      if (i == 0) {
        break;
      }
      this.eOE.bw("contact_info_linkedin_account", false);
      this.eOE.aaa("contact_info_linkedin_install");
      return;
    }
    this.eOE.bw("contact_info_linkedin_account", true);
    this.eOE.aaa("contact_info_linkedin_uninstall");
  }
  
  public static void m(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (String str = paramContext.getString(R.l.settings_plugins_installing);; str = paramContext.getString(R.l.settings_plugins_uninstalling))
    {
      paramContext.getString(R.l.app_tip);
      new al(new i.2(h.a(paramContext, str, true, null), paramBoolean), false).J(1500L, 1500L);
      return;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    if ((paramObject instanceof Integer))
    {
      paramInt = ((Integer)paramObject).intValue();
      if ((paramInt == 40) || (paramInt == 34)) {
        auv();
      }
    }
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
      Assert.assertTrue(s.hA(paramab.field_username));
      au.HU();
      c.DT().a(this);
      this.guS = paramab;
      this.eOE = paramf;
      auv();
      return true;
    }
  }
  
  public final boolean auw()
  {
    au.HU();
    c.DT().b(this);
    this.eOE.ZZ("contact_info_header_helper");
    com.tencent.mm.plugin.profile.a.ezo.vl();
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramInt2 == -1)) {
      auv();
    }
  }
  
  public final boolean wX(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetLinkedIn", "handleEvent : key = " + paramString);
    if (bi.oV(paramString).length() <= 0) {
      return false;
    }
    if (paramString.equals("contact_info_linkedin_install"))
    {
      m(this.context, true);
      return true;
    }
    if (paramString.equals("contact_info_linkedin_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          i.m(i.this.context, false);
        }
      }, null);
      return true;
    }
    if (paramString.equals("contact_info_linkedin_account"))
    {
      Intent localIntent = new Intent(this.context, BindLinkedInUI.class);
      ((Activity)this.context).startActivityForResult(localIntent, 1);
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactWidgetLinkedIn", "handleEvent : unExpected key = " + paramString);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */