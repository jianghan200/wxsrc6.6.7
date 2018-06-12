package com.tencent.mm.app;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.StringBuilderPrinter;
import com.tencent.mm.loader.stub.a;
import com.tencent.mm.loader.stub.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.a;
import com.tencent.mm.sdk.platformtools.ak.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class h
{
  public static String a(Application paramApplication, final String paramString)
  {
    if (!"com.tencent.mm:cuploader".equals(paramString))
    {
      ak.a(new ak.d()
      {
        public final void a(ak paramAnonymousak, String paramAnonymousString, Throwable paramAnonymousThrowable)
        {
          Application localApplication = this.byv;
          Object localObject1 = paramString;
          try
          {
            StringBuilder localStringBuilder = new StringBuilder(2560);
            StringBuilderPrinter localStringBuilderPrinter = new StringBuilderPrinter(localStringBuilder);
            localStringBuilderPrinter.println("#client.version=" + a.CLIENT_VERSION);
            if (a.DEBUG) {
              localStringBuilderPrinter.println("#accinfo.revision=123321123");
            }
            for (;;)
            {
              Object localObject2 = c.duQ.I("last_login_uin", "0");
              if (localObject2 != null)
              {
                paramAnonymousak = (ak)localObject2;
                if (!((String)localObject2).equals("0")) {}
              }
              else
              {
                paramAnonymousak = Integer.toString((Build.DEVICE + Build.FINGERPRINT + Build.MANUFACTURER + Build.MODEL).hashCode());
              }
              localStringBuilderPrinter.println("#accinfo.uin=" + paramAnonymousak);
              localObject2 = new StringBuilder("#accinfo.runtime=").append(bi.VF() - b.bya).append("(");
              paramAnonymousak = (ak)localObject1;
              if (localObject1 == null) {
                paramAnonymousak = "";
              }
              localStringBuilderPrinter.println(paramAnonymousak + ") by cup");
              if (a.DEBUG) {
                localStringBuilderPrinter.println("#accinfo.build=99/88/2077 66:55 PM:amm-dev");
              }
              try
              {
                for (;;)
                {
                  paramAnonymousak = Environment.getDataDirectory();
                  localObject1 = new StatFs(paramAnonymousak.getPath());
                  localObject2 = new StatFs(com.tencent.mm.loader.stub.b.bnC);
                  paramAnonymousak = String.format("%dMB %dMB %s:%d:%d:%d %s:%d:%d:%d", new Object[] { Integer.valueOf(((ActivityManager)localApplication.getSystemService("activity")).getMemoryClass()), Integer.valueOf(((ActivityManager)localApplication.getSystemService("activity")).getLargeMemoryClass()), paramAnonymousak.getAbsolutePath(), Integer.valueOf(((StatFs)localObject1).getBlockSize()), Integer.valueOf(((StatFs)localObject1).getBlockCount()), Integer.valueOf(((StatFs)localObject1).getAvailableBlocks()), com.tencent.mm.loader.stub.b.bnC, Integer.valueOf(((StatFs)localObject2).getBlockSize()), Integer.valueOf(((StatFs)localObject2).getBlockCount()), Integer.valueOf(((StatFs)localObject2).getAvailableBlocks()) });
                  p.b(paramAnonymousThrowable);
                  localStringBuilderPrinter.println("#accinfo.data=" + paramAnonymousak);
                  paramAnonymousak = new Date();
                  paramAnonymousThrowable = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
                  localStringBuilderPrinter.println("#accinfo.crashTime=" + paramAnonymousThrowable.format(paramAnonymousak));
                  localStringBuilderPrinter.println("#crashContent=");
                  paramAnonymousak = paramAnonymousString;
                  if (f.aV(ad.getContext()) == 1) {
                    paramAnonymousak = paramAnonymousString.substring(0, f.aW(ad.getContext()));
                  }
                  f.g(ad.getContext(), ad.getProcessName(), "first");
                  localStringBuilderPrinter.println(paramAnonymousak);
                  x.e("MicroMsg.FirstCrashCatcher", "cpu catch crash:" + paramAnonymousak);
                  paramAnonymousak = new Intent();
                  paramAnonymousak.setAction("INTENT_ACTION_UNCATCH");
                  paramAnonymousak.putExtra("INTENT_EXTRA_USER_NAME", c.duQ.I("login_user_name", "never_login_crash"));
                  paramAnonymousak.putExtra("INTENT_EXTRA_EXCEPTION_MSG", Base64.encodeToString(localStringBuilder.toString().getBytes(), 2));
                  paramAnonymousak.putExtra("INTENT_EXTRA_DATA_PATH", com.tencent.mm.loader.stub.b.duN + "crash/");
                  paramAnonymousak.putExtra("INTENT_EXTRA_SDCARD_PATH", com.tencent.mm.loader.stub.b.duP);
                  paramAnonymousak.putExtra("INTENT_EXTRA_UIN", c.duQ.I("last_login_uin", "0"));
                  paramAnonymousak.putExtra("INTENT_EXTRA_CLIENT_VERSION", a.CLIENT_VERSION);
                  paramAnonymousak.putExtra("INTENT_EXTRA_DEVICE_TYPE", a.DEVICE_TYPE);
                  paramAnonymousak.putExtra("INTENT_EXTRA_TAG", "exception");
                  paramAnonymousString = localApplication.getSharedPreferences("system_config_prefs", 0);
                  paramAnonymousak.putExtra("INTENT_EXTRA_HOST", "http://" + paramAnonymousString.getString("support.weixin.qq.com", "support.weixin.qq.com"));
                  paramAnonymousak.setClassName(localApplication, localApplication.getPackageName() + ".crash.CrashUploaderService");
                  ad.getContext().startService(paramAnonymousak);
                  return;
                  localStringBuilderPrinter.println("#accinfo.revision=" + a.codeRevision());
                  break;
                  localStringBuilderPrinter.println("#accinfo.build=" + a.TIME + ":" + a.HOSTNAME + ":0");
                }
              }
              catch (Exception paramAnonymousak)
              {
                for (;;)
                {
                  paramAnonymousak = "";
                }
              }
            }
            return;
          }
          catch (Exception paramAnonymousak) {}
        }
      });
      ak.a(new ak.a()
      {
        public final void uV()
        {
          String str = a.PATCH_REV;
        }
      });
    }
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/app/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */