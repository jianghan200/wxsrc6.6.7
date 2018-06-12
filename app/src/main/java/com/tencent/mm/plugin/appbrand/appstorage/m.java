package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.File;

final class m
{
  static boolean e(File paramFile1, File paramFile2)
  {
    while (paramFile2 != null)
    {
      if (paramFile1.equals(paramFile2)) {
        return true;
      }
      paramFile2 = paramFile2.getParentFile();
    }
    return false;
  }
  
  static String i(String... paramVarArgs)
  {
    Object localObject = new StringBuilder(";");
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      ((StringBuilder)localObject).append(bi.oV(paramVarArgs[i])).append(';');
      i += 1;
    }
    String str = g.u(((StringBuilder)localObject).toString().getBytes());
    if (!f.zZ()) {}
    for (paramVarArgs = null; paramVarArgs == null; paramVarArgs = new File(paramVarArgs + "wxanewfiles/"))
    {
      return "[INVALID]";
      localObject = e.bnE;
      paramVarArgs = (String[])localObject;
      if (!((String)localObject).endsWith("/")) {
        paramVarArgs = (String)localObject + "/";
      }
    }
    return new File(paramVarArgs.getPath() + "/" + str).getPath();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */