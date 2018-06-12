package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.model.q;

final class p
  implements HelperHeaderPreference.a
{
  private Context context;
  
  public p(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final void a(HelperHeaderPreference paramHelperHeaderPreference)
  {
    if ((q.GQ() & 0x2000) == 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramHelperHeaderPreference.hd(bool);
      return;
    }
  }
  
  public final CharSequence getHint()
  {
    return this.context.getString(R.l.contact_info_facebookapp_tip);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */