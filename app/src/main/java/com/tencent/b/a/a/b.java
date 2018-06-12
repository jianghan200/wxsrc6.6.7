package com.tencent.b.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Locale;
import java.util.TimeZone;

final class b
{
  static a bvh;
  Integer bvi = null;
  String bvj = null;
  
  public b(Context paramContext)
  {
    try
    {
      aE(paramContext);
      TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (localTelephonyManager != null) {
        this.bvi = Integer.valueOf(localTelephonyManager.getNetworkType());
      }
      this.bvj = s.aP(paramContext);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private static a aE(Context paramContext)
  {
    try
    {
      if (bvh == null) {
        bvh = new a(paramContext.getApplicationContext(), (byte)0);
      }
      paramContext = bvh;
      return paramContext;
    }
    finally {}
  }
  
  static final class a
  {
    String aem = Locale.getDefault().getLanguage();
    String bvk;
    String bvl = "2.21";
    DisplayMetrics bvm;
    int bvn = Build.VERSION.SDK_INT;
    String bvo = Build.MANUFACTURER;
    String bvp = "WX";
    String bvq;
    String bvr;
    int bvs = 0;
    String bvt = null;
    String bvu = null;
    Context ctx = null;
    String imsi;
    String model = Build.MODEL;
    String packageName = null;
    String timezone;
    
    private a(Context paramContext)
    {
      this.ctx = paramContext.getApplicationContext();
      try
      {
        this.bvk = this.ctx.getPackageManager().getPackageInfo(this.ctx.getPackageName(), 0).versionName;
        this.bvm = new DisplayMetrics();
        ((WindowManager)this.ctx.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(this.bvm);
        if (s.o(paramContext, "android.permission.READ_PHONE_STATE"))
        {
          paramContext = (TelephonyManager)paramContext.getSystemService("phone");
          if (paramContext != null)
          {
            this.bvq = paramContext.getSimOperator();
            this.imsi = paramContext.getSubscriberId();
          }
        }
        this.timezone = TimeZone.getDefault().getID();
        this.bvr = s.aO(this.ctx);
        this.packageName = this.ctx.getPackageName();
        this.bvu = s.tV();
        return;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/b/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */