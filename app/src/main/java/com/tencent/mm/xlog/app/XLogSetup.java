package com.tencent.mm.xlog.app;

import android.os.Looper;
import com.tencent.mars.comm.PlatformComm;
import com.tencent.mars.xlog.LogLogic;
import com.tencent.mars.xlog.Xlog;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public class XLogSetup
{
  public static Boolean appendIsSync;
  public static String cachePath;
  public static boolean hasInit = false;
  public static Boolean isLogcatOpen;
  public static String logPath;
  public static String nameprefix;
  private static boolean setup = false;
  public static Integer toolsLevel;
  public static Xlog xlog = new Xlog();
  
  public static void keep_setupXLog(boolean paramBoolean, String paramString1, String paramString2, Integer paramInteger, Boolean paramBoolean1, Boolean paramBoolean2, String paramString3)
  {
    if (!hasInit)
    {
      PlatformComm.init(ad.getContext(), new ag(Looper.getMainLooper()));
      hasInit = true;
    }
    cachePath = paramString1;
    logPath = paramString2;
    toolsLevel = paramInteger;
    appendIsSync = paramBoolean1;
    isLogcatOpen = paramBoolean2;
    nameprefix = paramString3;
    if (!paramBoolean) {}
    while (setup) {
      return;
    }
    setup = true;
    k.b(a.uZO, XLogSetup.class.getClassLoader());
    x.a(xlog);
    appendIsSync.booleanValue();
    Xlog.setConsoleLogOpen(isLogcatOpen.booleanValue());
    if (toolsLevel == null)
    {
      Xlog.AppenderOpen(2, 0, cachePath, logPath, nameprefix);
      LogLogic.initIPxxLogInfo();
      return;
    }
    Xlog.AppenderOpen(toolsLevel.intValue(), 1, cachePath, logPath, nameprefix);
  }
  
  public static void realSetupXlog()
  {
    keep_setupXLog(true, cachePath, logPath, toolsLevel, appendIsSync, isLogcatOpen, nameprefix);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/xlog/app/XLogSetup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */