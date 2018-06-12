package com.tencent.mm.console.a;

import android.content.Context;
import com.tencent.mm.g.a.ig;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;

public final class d
  implements com.tencent.mm.pluginsdk.cmd.a
{
  static
  {
    b.a(new d(), new String[] { "//hotpatch" });
  }
  
  public static void init() {}
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    if (x.getLogLevel() > 1) {
      return false;
    }
    if (paramArrayOfString.length < 2) {
      return true;
    }
    paramContext = paramArrayOfString[1];
    int i = -1;
    switch (paramContext.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return true;
        if (paramContext.equals("apply"))
        {
          i = 0;
          continue;
          if (paramContext.equals("info"))
          {
            i = 1;
            continue;
            if (paramContext.equals("clear"))
            {
              i = 2;
              continue;
              if (paramContext.equals("check")) {
                i = 3;
              }
            }
          }
        }
        break;
      }
    }
    if (paramArrayOfString.length < 3) {}
    for (paramContext = "/data/local/tmp/test.apk";; paramContext = paramArrayOfString[2])
    {
      x.d("MicroMsg.CommandTestHotPatches", "hotpatch test from %s", new Object[] { paramContext });
      paramArrayOfString = new ig();
      paramArrayOfString.bRH.bRM = paramContext;
      com.tencent.mm.sdk.b.a.sFg.m(paramArrayOfString);
      return true;
    }
    x.d("MicroMsg.CommandTestHotPatches", "hotpatch current class loader=%s", new Object[] { getClass().getClassLoader() });
    return true;
    x.d("MicroMsg.CommandTestHotPatches", "clear hotpatch");
    paramContext = new ig();
    paramContext.bRH.bIH = 1;
    com.tencent.mm.sdk.b.a.sFg.m(paramContext);
    return true;
    if (paramArrayOfString.length < 3) {
      return true;
    }
    paramArrayOfString = paramArrayOfString[2];
    paramContext = paramArrayOfString;
    if (!paramArrayOfString.startsWith("/")) {
      paramContext = "/data/data/com.tencent.mm/app_dex/" + paramArrayOfString;
    }
    x.i("MicroMsg.CommandTestHotPatches", "hotpatch check patch file %s", new Object[] { paramContext });
    x.i("MicroMsg.CommandTestHotPatches", "-------------------------------------------------------------------------------------");
    x.i("MicroMsg.CommandTestHotPatches", "-------------------------------------------------------------------------------------");
    x.i("MicroMsg.CommandTestHotPatches", "hotpatch check md5, passed=%b", new Object[] { Boolean.valueOf(SharePatchFileUtil.acX(paramContext)) });
    x.i("MicroMsg.CommandTestHotPatches", "-------------------------------------------------------------------------------------");
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/console/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */