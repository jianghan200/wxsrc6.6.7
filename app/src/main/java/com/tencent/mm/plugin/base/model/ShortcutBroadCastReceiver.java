package com.tencent.mm.plugin.base.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;

public class ShortcutBroadCastReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
    {
      x.e("MicroMsg.ShortcutBroadCastReceiver", "alvinluo shortcut receiver intent is null");
      return;
    }
    h.bA(paramContext, paramContext.getString(a.h.app_added));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/base/model/ShortcutBroadCastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */