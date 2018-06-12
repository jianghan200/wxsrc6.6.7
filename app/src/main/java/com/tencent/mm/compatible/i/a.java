package com.tencent.mm.compatible.i;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.u;
import com.tencent.mm.compatible.f.b;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  private static int dga = 0;
  
  public static void bf(boolean paramBoolean)
  {
    SharedPreferences localSharedPreferences = ad.chZ();
    boolean bool = localSharedPreferences.getBoolean("settings_support_swipe", true);
    if (bool != paramBoolean) {
      localSharedPreferences.edit().putBoolean("settings_support_swipe", paramBoolean).commit();
    }
    x.i("MicroMsg.StyleUtil", "switchSwipebackMode, from %B to %B", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(paramBoolean) });
  }
  
  public static boolean zX()
  {
    Object localObject;
    int i;
    if (b.zU())
    {
      localObject = q.deR;
      if (!ad.cic()) {
        ((u)localObject).dfp = MultiProcessSharedPreferences.getSharedPreferences(ad.getContext(), "system_config_prefs", 4).getInt("update_swip_back_status", 0);
      }
      if (((u)localObject).dfp == 1)
      {
        i = 0;
        if (i == 0) {
          break label58;
        }
      }
    }
    for (;;)
    {
      return false;
      i = 1;
      break;
      label58:
      if (dga == 0)
      {
        localObject = ad.chZ();
        if ((localObject == null) || (!((SharedPreferences)localObject).getBoolean("settings_support_swipe", true))) {
          break label97;
        }
      }
      label97:
      for (dga = 1; dga == 1; dga = 2) {
        return true;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */