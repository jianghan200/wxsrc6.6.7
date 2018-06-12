package com.tencent.mm.console.a.a;

import android.content.Context;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.lang.reflect.Method;

public final class b
  implements a
{
  private static String D(Context paramContext, String paramString)
  {
    try
    {
      File localFile1 = (File)paramContext.getClass().getMethod("getSharedPrefsFile", new Class[] { String.class }).invoke(paramContext, new Object[] { paramString });
      File localFile3 = localFile1;
      if (localFile1 == null) {
        localFile3 = new File(paramContext.getFilesDir().getParent() + "/shared_prefs", paramString + ".xml");
      }
      return localFile3.getAbsolutePath();
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        x.w("MicroMsg.HCSettingCommand", "Failed call getSharedPrefsFile", new Object[] { localThrowable });
        File localFile2 = new File(paramContext.getFilesDir().getParent() + "/shared_prefs", paramString + ".xml");
      }
    }
  }
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length <= 1) {
      return false;
    }
    int i = bi.getInt(paramArrayOfString[1], 0);
    x.i("MicroMsg.HCSettingCommand", "hardcoder copy[%d] [%s]", new Object[] { Integer.valueOf(i), D(paramContext, "hardcoder_setting") });
    paramArrayOfString = D(paramContext, "hardcoder_setting");
    Object localObject = com.tencent.mm.compatible.util.e.bnE + "hardcoder_setting.xml";
    if (i > 0)
    {
      paramContext = paramArrayOfString;
      if (i <= 0) {
        break label152;
      }
    }
    for (;;)
    {
      paramArrayOfString = new File((String)localObject);
      if (paramArrayOfString.exists()) {
        paramArrayOfString.delete();
      }
      x.i("MicroMsg.HCSettingCommand", "hcsetting copy[%d], ret[%d] src[%s] to dest[%s]", new Object[] { Integer.valueOf(i), Long.valueOf(com.tencent.mm.a.e.y(paramContext, (String)localObject)), paramContext, localObject });
      return true;
      paramContext = (Context)localObject;
      break;
      label152:
      localObject = paramArrayOfString;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/console/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */