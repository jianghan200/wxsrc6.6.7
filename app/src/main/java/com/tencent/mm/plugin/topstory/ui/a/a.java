package com.tencent.mm.plugin.topstory.ui.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.topstory.ui.b.g;
import com.tencent.mm.plugin.topstory.ui.b.h;
import com.tencent.mm.plugin.topstory.ui.d;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.protocal.c.bay;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;

public final class a
  implements com.tencent.mm.pluginsdk.b.a, m.b
{
  private Context context;
  private f eOE;
  private ab guS;
  private CheckBoxPreference opR;
  
  public a(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private void auv()
  {
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.eOE.ZZ("contact_info_header_helper");
    localHelperHeaderPreference.an(this.guS.field_username, this.guS.BL(), this.context.getString(b.g.contact_info_top_story_switch_tip));
    if ((q.GQ() & 0x4000000) == 0)
    {
      i = 1;
      if (i == 0) {
        break label140;
      }
      localHelperHeaderPreference.nw(1);
      this.eOE.bw("contact_info_top_story_install", true);
      this.eOE.bw("contact_info_top_story_uninstall", false);
      this.eOE.bw("contact_info_go_to_top_story", false);
      this.eOE.bw("contact_info_top_story_not_disturb", false);
      label111:
      if ((q.GL() & 0x1000000) != 0) {
        break label196;
      }
    }
    label140:
    label196:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label201;
      }
      this.opR.qpJ = true;
      return;
      i = 0;
      break;
      localHelperHeaderPreference.nw(0);
      this.eOE.bw("contact_info_top_story_install", false);
      this.eOE.bw("contact_info_top_story_uninstall", true);
      this.eOE.bw("contact_info_go_to_top_story", true);
      this.eOE.bw("contact_info_top_story_not_disturb", true);
      break label111;
    }
    label201:
    this.opR.qpJ = false;
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    paramInt = bi.p(paramObject, 0);
    if ((paramm != com.tencent.mm.kernel.g.Ei().DT()) || (paramInt <= 0)) {}
    while ((paramInt != 40) && (paramInt != 34) && (paramInt != 7)) {
      return;
    }
    auv();
  }
  
  public final boolean a(f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    this.eOE = paramf;
    this.guS = paramab;
    paramf.addPreferencesFromResource(b.h.contact_info_pref_top_story);
    com.tencent.mm.kernel.g.Ei().DT().a(this);
    this.opR = ((CheckBoxPreference)paramf.ZZ("contact_info_top_story_not_disturb"));
    auv();
    return true;
  }
  
  public final boolean auw()
  {
    com.tencent.mm.kernel.g.Ei().DT().b(this);
    return true;
  }
  
  final void hh(boolean paramBoolean)
  {
    int i = q.GQ();
    Object localObject;
    if (paramBoolean)
    {
      i &= 0xFBFFFFFF;
      com.tencent.mm.kernel.g.Ei().DT().set(34, Integer.valueOf(i));
      localObject = new bay();
      ((bay)localObject).raB = 67108864;
      if (!paramBoolean) {
        break label186;
      }
    }
    label186:
    for (i = 0;; i = 1)
    {
      ((bay)localObject).sdm = i;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(39, (com.tencent.mm.bk.a)localObject));
      auv();
      if (!paramBoolean) {
        break label191;
      }
      if (((i)com.tencent.mm.kernel.g.l(i.class)).FW().Yq("topstoryapp") == null)
      {
        localObject = new com.tencent.mm.storage.ai();
        ((com.tencent.mm.storage.ai)localObject).setUsername("topstoryapp");
        ((com.tencent.mm.storage.ai)localObject).setContent(this.context.getString(b.g.contact_info_top_story_switch_tip));
        ((com.tencent.mm.storage.ai)localObject).as(bi.VF());
        ((com.tencent.mm.storage.ai)localObject).eX(0);
        ((com.tencent.mm.storage.ai)localObject).eV(0);
        ((i)com.tencent.mm.kernel.g.l(i.class)).FW().d((com.tencent.mm.storage.ai)localObject);
      }
      return;
      i |= 0x4000000;
      break;
    }
    label191:
    ((i)com.tencent.mm.kernel.g.l(i.class)).FW().Yp("topstoryapp");
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final boolean wX(String paramString)
  {
    if ("contact_info_go_to_top_story".equals(paramString)) {
      d.N(this.context, 0);
    }
    do
    {
      return false;
      if ("contact_info_top_story_install".equals(paramString))
      {
        hh(true);
        return false;
      }
      if ("contact_info_top_story_uninstall".equals(paramString))
      {
        h.a(this.context, this.context.getString(b.g.settings_plugins_uninstall_hint), "", this.context.getString(b.g.app_clear), this.context.getString(b.g.app_cancel), new a.1(this), null);
        return false;
      }
    } while (!"contact_info_top_story_not_disturb".equals(paramString));
    int i = q.GL();
    if (this.opR.isChecked())
    {
      i &= 0xFEFFFFFF;
      com.tencent.mm.kernel.g.Ei().DT().set(40, Integer.valueOf(i));
      paramString = new xt();
      paramString.rDz = 55;
      if (!this.opR.isChecked()) {
        break label208;
      }
    }
    label208:
    for (i = 2;; i = 1)
    {
      paramString.rDA = i;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(55, paramString));
      return false;
      i |= 0x1000000;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */