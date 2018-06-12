package com.tencent.mm.plugin.soter.c;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.d.a.a;
import com.tencent.d.a.c.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public static c bFh()
  {
    Object localObject = ad.chZ();
    if (localObject == null) {
      return new c();
    }
    String str = ((SharedPreferences)localObject).getString("cpu_id", "");
    localObject = ((SharedPreferences)localObject).getString("uid", "");
    if ((!bi.oW(str)) && (!bi.oW((String)localObject)))
    {
      x.i("MicroMsg.SoterDeviceInfoManager", "hy:device info exists in preference. directly return");
      return new c(str, (String)localObject);
    }
    x.w("MicroMsg.SoterDeviceInfoManager", "hy: no cpu id and uid retrieved. load again");
    localObject = a.cFE();
    if (localObject != null)
    {
      str = ((h)localObject).onE;
      localObject = String.valueOf(((h)localObject).uid);
      if ((!bi.oW(str)) && (!bi.oW((String)localObject)))
      {
        eQ(str, (String)localObject);
        return new c(str, (String)localObject);
      }
    }
    return new c();
  }
  
  public static void eQ(String paramString1, String paramString2)
  {
    Object localObject = ad.chZ();
    if (localObject == null) {
      return;
    }
    x.i("MicroMsg.SoterDeviceInfoManager", "hy: save device info");
    localObject = ((SharedPreferences)localObject).edit();
    ((SharedPreferences.Editor)localObject).putString("cpu_id", paramString1);
    ((SharedPreferences.Editor)localObject).putString("uid", paramString2);
    ((SharedPreferences.Editor)localObject).apply();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/soter/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */