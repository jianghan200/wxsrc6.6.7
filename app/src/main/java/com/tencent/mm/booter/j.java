package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.a.h;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class j
{
  public static void run()
  {
    int i = g.AT().getInt("EnableForgroundService", 0);
    au.HU();
    int j = h.aM(c.Df(), 101);
    if ((b.chp()) || ((i > 0) && (j >= 0) && (j <= i))) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      boolean bool1 = bool2;
      if (!bool2) {
        bool1 = d.qVQ;
      }
      bool2 = bool1;
      if (!bool1) {
        bool2 = b.chp();
      }
      if (com.tencent.mm.sdk.platformtools.e.bxk == 1) {
        bool2 = false;
      }
      ad.getContext().getSharedPreferences("system_config_prefs", 0).edit().putBoolean("set_service", bool2).commit();
      x.i("MicroMsg.PostTaskSetPushForegroundService", "Set service, userHash:%d, prob:%d, enabled: %b  isalpha:%b channel:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(d.qVQ), Integer.valueOf(com.tencent.mm.sdk.platformtools.e.bxk) });
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/booter/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */