package com.tencent.mm.plugin.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;

public final class a
{
  public static String Zu()
  {
    return ad.getContext().getSharedPreferences(ad.chY(), 0).getString("reg_last_exit_ui", "");
  }
  
  public static void d(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {}
    for (paramString = paramString + "," + bi.VF() + "," + Zu();; paramString = paramString + "," + bi.VF() + "," + ad.getContext().getSharedPreferences(ad.chY(), 0).getString("reg_next_enter_ui", ""))
    {
      f.mDy.a(10645, paramString, true, true);
      return;
    }
  }
  
  public static void pT(String paramString)
  {
    ad.getContext().getSharedPreferences(ad.chY(), 0).edit().putString("reg_last_exit_ui", paramString).commit();
  }
  
  public static void pU(String paramString)
  {
    ad.getContext().getSharedPreferences(ad.chY(), 0).edit().putString("reg_next_enter_ui", paramString).commit();
  }
  
  public static void pV(String paramString)
  {
    paramString = paramString + "," + bi.VF() + "," + Zu();
    f.mDy.a(10645, paramString, true, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */