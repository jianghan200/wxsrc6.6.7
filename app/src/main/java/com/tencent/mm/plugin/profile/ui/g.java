package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.ht;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.base.h;

public final class g
  extends l
  implements m.b
{
  public g(Context paramContext)
  {
    super(paramContext, new q(paramContext));
    paramContext = new ht();
    a.sFg.m(paramContext);
  }
  
  public static void acV()
  {
    au.HU();
    c.FT().GK("feedsapp");
    au.HU();
    c.FW().Yp("feedsapp");
  }
  
  protected final int Ys()
  {
    return R.o.contact_info_pref_feedsapp;
  }
  
  protected final boolean bnv()
  {
    return (com.tencent.mm.model.q.GQ() & 0x8000) == 0;
  }
  
  protected final void clear() {}
  
  protected final void hb(boolean paramBoolean)
  {
    Context localContext = this.context;
    if (paramBoolean) {}
    for (String str = localContext.getString(R.l.settings_plugins_installing);; str = localContext.getString(R.l.settings_plugins_uninstalling))
    {
      localContext.getString(R.l.app_tip);
      new al(new g.1(paramBoolean, h.a(localContext, str, true, null)), false).J(1500L, 1500L);
      return;
    }
  }
  
  public final boolean wX(String paramString)
  {
    if ("contact_info_plugin_view".equals(paramString))
    {
      paramString = new Intent();
      paramString.putExtra("sns_timeline_NeedFirstLoadint", true);
      d.b(this.context, "sns", ".ui.SnsTimeLineUI", paramString);
      return true;
    }
    Intent localIntent;
    if ("contact_info_plugin_outsize".equals(paramString))
    {
      localIntent = new Intent();
      localIntent.putExtra("k_sns_tag_id", 4L);
      d.b(this.context, "sns", ".ui.SnsBlackDetailUI", localIntent);
    }
    if ("contact_info_plugin_black".equals(paramString))
    {
      localIntent = new Intent();
      localIntent.putExtra("k_sns_tag_id", 5L);
      d.b(this.context, "sns", ".ui.SnsTagDetailUI", localIntent);
    }
    if (paramString.equals("contact_info_plugin_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint_by_sns), "", this.context.getString(R.l.app_stop), this.context.getString(R.l.app_cancel), new g.2(this), null);
      return true;
    }
    return super.wX(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */