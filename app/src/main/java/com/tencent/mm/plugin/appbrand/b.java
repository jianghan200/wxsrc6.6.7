package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import com.tencent.mm.plugin.appbrand.appcache.af;
import com.tencent.mm.plugin.appbrand.appcache.al;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.appcache.ap.b;
import com.tencent.mm.plugin.appbrand.appcache.h.c;
import com.tencent.mm.plugin.appbrand.appcache.j;
import com.tencent.mm.plugin.appbrand.appusage.q.a;
import com.tencent.mm.plugin.appbrand.compat.a.f;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.d;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.m.c;
import com.tencent.mm.plugin.appbrand.m.c.a;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.storage.aa.a;
import java.io.File;

public final class b
  implements a
{
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    int i = -1;
    boolean bool2 = false;
    boolean bool1 = false;
    if ((!bj.cjh()) && (!com.tencent.mm.sdk.platformtools.d.sFy)) {}
    label560:
    do
    {
      do
      {
        do
        {
          do
          {
            return true;
            if ("//enable_appbrand_monkey_test".equals(paramArrayOfString[0]))
            {
              DebuggerShell.aes();
              return true;
            }
            if ("//disable_appbrand_monkey_test".equals(paramArrayOfString[0]))
            {
              DebuggerShell.aet();
              return true;
            }
            if (!"//wxafts".equals(paramArrayOfString[0])) {
              break;
            }
          } while (!paramArrayOfString[1].contains("delete"));
          paramContext = c.a.gsM;
          com.tencent.mm.a.e.k(new File(((f)com.tencent.mm.kernel.g.l(f.class)).adP()));
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WxaFTSSearchCore", "forceUnzipBasicTemplate");
          paramContext.prepare();
          return true;
          if ("//localwxalibrary".equals(paramArrayOfString[0]))
          {
            paramContext = ad.chZ();
            paramArrayOfString = paramArrayOfString[1];
            switch (paramArrayOfString.hashCode())
            {
            }
            for (;;)
            {
              switch (i)
              {
              default: 
                return true;
              case 0: 
                paramContext.edit().remove("localwxalibrary").commit();
                return true;
                if (paramArrayOfString.equals("clear"))
                {
                  i = 0;
                  continue;
                  if (paramArrayOfString.equals("true"))
                  {
                    i = 1;
                    continue;
                    if (paramArrayOfString.equals("false")) {
                      i = 2;
                    }
                  }
                }
                break;
              }
            }
            paramContext.edit().putBoolean("localwxalibrary", true).commit();
            return true;
            paramContext.edit().putBoolean("localwxalibrary", false).commit();
            return true;
          }
          if ("//getsearchshowoutwxaapp".equals(paramArrayOfString[0]))
          {
            if ((paramArrayOfString.length > 1) && (paramArrayOfString[1].contains("daily")))
            {
              i = q.a.fmx;
              com.tencent.mm.plugin.appbrand.appusage.q.adh();
              return true;
            }
            i = q.a.fmy;
            com.tencent.mm.plugin.appbrand.appusage.q.adh();
            return true;
          }
          if ("//callsearchshowoutwxaapp".equals(paramArrayOfString[0]))
          {
            ((com.tencent.mm.plugin.appbrand.n.g)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.n.g.class)).adj();
            return true;
          }
          paramContext = paramArrayOfString[1].toLowerCase();
          switch (paramContext.hashCode())
          {
          default: 
            i = -1;
          }
          for (;;)
          {
            switch (i)
            {
            default: 
              return true;
            case 0: 
              paramContext = com.tencent.mm.plugin.appbrand.app.e.abi();
              paramArrayOfString = new al();
              paramArrayOfString.field_appId = "@LibraryAppId";
              paramArrayOfString.field_debugType = 999;
              paramArrayOfString.field_version = 1;
              paramContext.fhZ.a(paramArrayOfString, al.fhI);
              i = af.VERSION;
              com.tencent.mm.plugin.appbrand.task.e.lE(2);
              return true;
              if (!paramContext.equals("deletebetalib")) {
                break label560;
              }
              i = 0;
              continue;
              if (!paramContext.equals("deletelib")) {
                break label560;
              }
              i = 1;
              continue;
              if (!paramContext.equals("pkgcleanup")) {
                break label560;
              }
              i = 2;
              continue;
              if (!paramContext.equals("deletecontact")) {
                break label560;
              }
              i = 3;
              continue;
              if (!paramContext.equals("historycount")) {
                break label560;
              }
              i = 4;
              continue;
              if (!paramContext.equals("resetsyncversion")) {
                break label560;
              }
              i = 5;
              continue;
              if (!paramContext.equals("sync")) {
                break label560;
              }
              i = 6;
              continue;
              if (!paramContext.equals("starmax")) {
                break label560;
              }
              i = 7;
              continue;
              if (!paramContext.equals("guide")) {
                break label560;
              }
              i = 8;
              continue;
              if (!paramContext.equals("clearguide")) {
                break label560;
              }
              i = 9;
              continue;
              if (!paramContext.equals("releasepkghighversion")) {
                break label560;
              }
              i = 10;
              continue;
              if (!paramContext.equals("incremental_insert_24")) {
                break label560;
              }
              i = 11;
              continue;
              if (!paramContext.equals("incremental_insert_28")) {
                break label560;
              }
              i = 12;
              continue;
              if (!paramContext.equals("incremental_delete_28")) {
                break label560;
              }
              i = 13;
              continue;
              if (!paramContext.equals("incremental_delete_latest")) {
                break label560;
              }
              i = 14;
              continue;
              if (!paramContext.equals("incremental_lib")) {
                break label560;
              }
              i = 15;
              continue;
              if (!paramContext.equals("clear_mocklib")) {
                break label560;
              }
              i = 16;
              continue;
              if (!paramContext.equals("force_modularizing")) {
                break label560;
              }
              i = 17;
              continue;
              if (!paramContext.equals("useisolatectxwxalibrary")) {
                break label560;
              }
              i = 18;
            }
          }
          com.tencent.mm.plugin.appbrand.app.e.abi().al("@LibraryAppId", 0);
          i = af.VERSION;
          com.tencent.mm.plugin.appbrand.task.e.lE(2);
          return true;
          com.tencent.mm.sdk.f.e.post(h.c.abz(), "WxaPkgCleanupByCMD");
          return true;
          com.tencent.mm.plugin.appbrand.config.q.sa(paramArrayOfString[2]);
          return true;
          if (bi.getInt(paramArrayOfString[2].trim(), 0) > 0) {
            bool1 = true;
          }
          com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sTB, Boolean.valueOf(bool1));
          return true;
          com.tencent.mm.plugin.appbrand.config.q.rZ(paramArrayOfString[2]);
          return true;
          r.se(paramArrayOfString[2]);
          return true;
          com.tencent.mm.plugin.appbrand.appusage.m.fmn = Integer.valueOf(Math.max(0, bi.getInt(paramArrayOfString[2], 10)));
          return true;
          com.tencent.mm.bg.d.A(ad.getContext(), "appbrand", ".ui.AppBrandGuideUI");
          return true;
          com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sTA, Boolean.valueOf(false));
          return true;
          paramContext = paramArrayOfString[2];
          try
          {
            paramArrayOfString = new WxaAttributes.d();
            paramArrayOfString.cbu = 1000;
            paramArrayOfString.fsj = "fake";
            com.tencent.mm.plugin.appbrand.app.e.abi().a(paramContext, paramArrayOfString);
            return true;
          }
          catch (Exception paramContext)
          {
            return true;
          }
          paramContext = new al();
          paramContext.field_appId = "wx4ffb369b6881ee5e";
          paramContext.field_version = 24;
          paramContext.field_versionMd5 = "a47b978d23679075cbbed1030f71b7bb";
          paramContext.field_versionState = 0;
          paramContext.field_debugType = 0;
          paramContext.field_pkgPath = "/sdcard/_276854502_24.wxapkg";
          com.tencent.mm.plugin.appbrand.app.e.abi().d(paramContext);
          return true;
          paramContext = new al();
          paramContext.field_appId = "wx4ffb369b6881ee5e";
          paramContext.field_version = 28;
          paramContext.field_versionMd5 = "5713e70880cc2d356905d6189ba37a72";
          paramContext.field_versionState = 0;
          paramContext.field_debugType = 0;
          paramContext.field_pkgPath = "/sdcard/_276854502_28.wxapkg";
          com.tencent.mm.plugin.appbrand.app.e.abi().d(paramContext);
          return true;
          paramContext = new al();
          paramContext.field_appId = "wx4ffb369b6881ee5e";
          paramContext.field_version = 28;
          paramContext.field_debugType = 0;
          com.tencent.mm.plugin.appbrand.app.e.abi().a(paramContext);
          return true;
          paramContext = com.tencent.mm.plugin.appbrand.app.e.abi();
          paramArrayOfString = paramContext.a("wx4ffb369b6881ee5e", 0, new String[] { "version" });
        } while (paramArrayOfString == null);
        paramContext.a(paramArrayOfString);
        return true;
        new j(bi.getInt(paramArrayOfString[2], 78), paramArrayOfString[3]).run();
        return true;
        af.abS();
        Toast.makeText(ad.getContext(), "MockLib已清除，重启微信生效", 1).show();
        return true;
        if (paramArrayOfString.length >= 3)
        {
          bool1 = bool2;
          if (paramArrayOfString[2].equalsIgnoreCase("false")) {}
        }
        else
        {
          bool1 = true;
        }
        com.tencent.mm.plugin.appbrand.launching.z.ggw = bool1;
        return true;
        paramContext = ad.chZ();
      } while (paramArrayOfString.length <= 2);
      if ("open".equalsIgnoreCase(paramArrayOfString[2]))
      {
        paramContext.edit().putInt("useisolatectxwxalibrary", 1).commit();
        return true;
      }
      if ("close".equalsIgnoreCase(paramArrayOfString[2]))
      {
        paramContext.edit().putInt("useisolatectxwxalibrary", -1).commit();
        return true;
      }
    } while (!"auto".equalsIgnoreCase(paramArrayOfString[2]));
    paramContext.edit().putInt("useisolatectxwxalibrary", 0).commit();
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */