package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.ad;

public final class x
{
  public static void b(boolean paramBoolean, Intent paramIntent)
  {
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    if (paramBoolean) {}
    for (paramIntent = "com.tencent.mm.ui.ACTION_ACTIVE";; paramIntent = "com.tencent.mm.ui.ACTION_DEACTIVE")
    {
      localIntent.setAction(paramIntent);
      localIntent.putExtra("_application_context_process_", ad.getProcessName());
      localIntent.putExtra("process_id", Process.myPid());
      localIntent.putExtra("process_is_mm", ad.cic());
      ad.getContext().sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/base/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */