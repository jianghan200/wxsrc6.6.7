package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.br;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;

public final class m
  implements a, m.b
{
  private boolean bKe;
  Context context;
  private f eOE;
  private ab guS;
  
  public m(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private void auv()
  {
    boolean bool2 = true;
    this.bKe = q.Ha();
    Object localObject = (HelperHeaderPreference)this.eOE.ZZ("contact_info_header_helper");
    ((HelperHeaderPreference)localObject).an(this.guS.field_username, this.guS.BL(), this.context.getString(R.l.contact_info_qqsync_switch_tip));
    int i;
    if (this.bKe)
    {
      i = 1;
      ((HelperHeaderPreference)localObject).nw(i);
      localObject = this.eOE;
      if (this.bKe) {
        break label165;
      }
      bool1 = true;
      label84:
      ((f)localObject).bw("contact_info_go_to_sync", bool1);
      localObject = this.eOE;
      if (this.bKe) {
        break label170;
      }
      bool1 = true;
      label109:
      ((f)localObject).bw("contact_info_remind_me_syncing_tip", bool1);
      this.eOE.bw("contact_info_qqsync_install", this.bKe);
      localObject = this.eOE;
      if (this.bKe) {
        break label175;
      }
    }
    label165:
    label170:
    label175:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      ((f)localObject).bw("contact_info_qqsync_uninstall", bool1);
      return;
      i = 0;
      break;
      bool1 = false;
      break label84;
      bool1 = false;
      break label109;
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    if (this.bKe != q.Ha()) {
      auv();
    }
  }
  
  public final boolean a(f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    au.HU();
    c.DT().a(this);
    this.eOE = paramf;
    this.guS = paramab;
    paramf.addPreferencesFromResource(R.o.contact_info_pref_qqsync);
    auv();
    return true;
  }
  
  public final boolean auw()
  {
    au.HU();
    c.DT().b(this);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  final void p(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (String str = paramContext.getString(R.l.settings_plugins_installing);; str = paramContext.getString(R.l.settings_plugins_uninstalling))
    {
      paramContext.getString(R.l.app_tip);
      paramContext = h.a(paramContext, str, true, null);
      au.Em().H(new m.3(this, paramBoolean, paramContext));
      return;
    }
  }
  
  public final boolean wX(String paramString)
  {
    if (bi.oV(paramString).length() <= 0) {}
    do
    {
      return false;
      if ("contact_info_go_to_sync".equals(paramString))
      {
        if (p.r(this.context, "com.tencent.qqpim"))
        {
          paramString = this.context.getPackageManager().getLaunchIntentForPackage("com.tencent.qqpim");
          paramString.addFlags(268435456);
          this.context.startActivity(paramString);
        }
        for (;;)
        {
          return true;
          h.a(this.context, R.l.contact_info_qqsync_download, R.l.app_tip, R.l.app_download, R.l.app_cancel, new m.2(this), null);
        }
      }
      if ("contact_info_remind_me_syncing".equals(paramString))
      {
        paramString = (CheckBoxPreference)this.eOE.ZZ("contact_info_remind_me_syncing");
        au.HU();
        c.DT().set(65792, Boolean.valueOf(paramString.isChecked()));
        if (paramString.isChecked()) {}
        for (paramString = "1";; paramString = "2")
        {
          br.r(6, paramString);
          return true;
        }
      }
      if (paramString.equals("contact_info_qqsync_install"))
      {
        p(this.context, true);
        return true;
      }
    } while (!paramString.equals("contact_info_qqsync_uninstall"));
    h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new m.1(this), null);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */