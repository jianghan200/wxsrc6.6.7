package com.tencent.mm.modelappbrand;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public static String dFw;
  public static String dFx;
  
  public static String JK()
  {
    StringBuilder localStringBuilder = new StringBuilder("sid_");
    g.Eg();
    dFw = a.Df() + "_" + bi.VF();
    x.v("MicroMsg.AppBrandReporter", "refreshWeAppSearchSessionId : %s", new Object[] { dFw });
    return dFw;
  }
  
  public static void ji(String paramString)
  {
    Object localObject = MultiProcessSharedPreferences.getSharedPreferences(ad.getContext(), "pref_appbrand_process", 4);
    paramString = paramString + ":start_time";
    localObject = ((SharedPreferences)localObject).edit();
    ((SharedPreferences.Editor)localObject).remove(paramString);
    ((SharedPreferences.Editor)localObject).commit();
    f.mDy.a(365L, 5L, 1L, false);
    x.v("MicroMsg.AppBrandReporter", "onProcessExit");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelappbrand/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */