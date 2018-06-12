package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.ui.base.h;

public final class j
{
  public static boolean eY(Context paramContext)
  {
    if (!af.Wp("network_doctor_shown")) {
      return false;
    }
    h.a(paramContext, R.l.network_doctor, R.l.app_tip, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        this.val$context.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
      }
    }, null);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */