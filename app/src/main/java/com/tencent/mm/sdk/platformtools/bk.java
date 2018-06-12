package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.TimeZone;

public final class bk
{
  public static boolean cjj()
  {
    Object localObject1 = w.e(ad.getContext().getSharedPreferences(ad.chY(), 0));
    Object localObject2 = w.chP();
    if (((String)localObject1).equals("language_default")) {
      localObject1 = localObject2;
    }
    for (;;)
    {
      if (!((String)localObject1).equals("zh_CN")) {
        return true;
      }
      localObject1 = TimeZone.getDefault();
      localObject2 = TimeZone.getTimeZone("GMT+08:00");
      if (((TimeZone)localObject1).getRawOffset() != ((TimeZone)localObject2).getRawOffset()) {
        return true;
      }
      localObject1 = (TelephonyManager)ad.getContext().getSystemService("phone");
      if (localObject1 != null)
      {
        localObject1 = ((TelephonyManager)localObject1).getNetworkCountryIso();
        if ((!bi.oW((String)localObject1)) && (!((String)localObject1).contains("cn")) && (!((String)localObject1).contains("CN"))) {
          return true;
        }
      }
      return false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */