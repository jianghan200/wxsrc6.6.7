package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.jg.JgClassChecked;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class InstallReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null)) {
      return;
    }
    String str = paramIntent.getAction();
    x.i("MicroMsg.InstallReceiver", "action:[%s]", new Object[] { str });
    if ((bi.oW(str)) || (!str.equals("com.android.vending.INSTALL_REFERRER")))
    {
      x.e("MicroMsg.InstallReceiver", "action is null or nil, or not the installed action");
      return;
    }
    str = "";
    try
    {
      paramIntent = paramIntent.getStringExtra("referrer");
      x.i("MicroMsg.InstallReceiver", "get referer:[%s]", new Object[] { paramIntent });
      if (bi.oW(paramIntent))
      {
        x.e("MicroMsg.InstallReceiver", "get referer is null or nil");
        return;
      }
    }
    catch (Exception paramIntent)
    {
      for (;;)
      {
        x.e("MicroMsg.InstallReceiver", "%s", new Object[] { bi.i(paramIntent) });
        paramIntent = str;
      }
      x.d("MicroMsg.InstallReceiver", "[PREF] write installreferer = " + paramIntent);
      paramContext.getSharedPreferences(ad.chY(), 0).edit().putString("installreferer", paramIntent).commit();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/booter/InstallReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */