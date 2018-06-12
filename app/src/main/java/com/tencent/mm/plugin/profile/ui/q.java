package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import com.tencent.mm.R.l;

final class q
  implements HelperHeaderPreference.a
{
  private Context context;
  
  public q(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final void a(HelperHeaderPreference paramHelperHeaderPreference)
  {
    if ((com.tencent.mm.model.q.GQ() & 0x8000) == 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramHelperHeaderPreference.hd(bool);
      return;
    }
  }
  
  public final CharSequence getHint()
  {
    return this.context.getString(R.l.contact_info_feedsapp_tip);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */