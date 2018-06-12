package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import com.tencent.mm.R.l;

final class o
  implements HelperHeaderPreference.a
{
  private final Context context;
  
  public o(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final void a(HelperHeaderPreference paramHelperHeaderPreference)
  {
    paramHelperHeaderPreference.hd(true);
  }
  
  public final CharSequence getHint()
  {
    return this.context.getString(R.l.contact_info_fmessage_switch_tip);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */