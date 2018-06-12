package com.tencent.mm.booter.notification.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public final class d
{
  public Intent Hq;
  
  public static PendingIntent a(Context paramContext, int paramInt, Intent paramIntent)
  {
    return PendingIntent.getActivity(paramContext, paramInt, paramIntent, 134217728);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/booter/notification/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */