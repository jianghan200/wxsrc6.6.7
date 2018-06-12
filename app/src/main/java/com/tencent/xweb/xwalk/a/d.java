package com.tencent.xweb.xwalk.a;

import android.content.Context;
import java.util.HashMap;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkInitializer.XWalkInitListener;
import org.xwalk.core.XWalkUpdater;
import org.xwalk.core.XWalkUpdater.XWalkBackgroundUpdateListener;

public final class d
  implements XWalkInitializer.XWalkInitListener, XWalkUpdater.XWalkBackgroundUpdateListener
{
  public static boolean vFD = true;
  private static boolean vFE = false;
  private static d vFF;
  Context mContext;
  XWalkInitializer vFi;
  XWalkUpdater vFj;
  
  private d(Context paramContext)
  {
    this.mContext = paramContext;
    this.vFi = new XWalkInitializer(this, paramContext);
    this.vFj = new XWalkUpdater(this, paramContext);
  }
  
  public static boolean ip(Context paramContext)
  {
    if (vFE) {
      return vFE;
    }
    vFE = true;
    vFF = new d(paramContext);
    XWalkEnvironment.init(paramContext);
    if (XWalkEnvironment.isDownloadMode())
    {
      paramContext = vFF;
      if (!vFD)
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("UpdaterCheckType", "0");
        new e(paramContext.vFj, localHashMap).execute(new String[0]);
      }
      if (paramContext.vFi.tryInitSync())
      {
        XWalkInitializer.addXWalkInitializeLog("initSync Sucsess");
        return true;
      }
      return false;
    }
    return false;
  }
  
  public static boolean isXWalkReady()
  {
    if ((!vFE) || (vFF == null)) {
      return false;
    }
    return vFF.vFi.isXWalkReady();
  }
  
  public final void onXWalkInitCancelled() {}
  
  public final void onXWalkInitCompleted() {}
  
  public final void onXWalkInitFailed() {}
  
  public final void onXWalkInitStarted() {}
  
  public final void onXWalkUpdateCancelled() {}
  
  public final void onXWalkUpdateCompleted() {}
  
  public final void onXWalkUpdateFailed(int paramInt)
  {
    e.Iy(paramInt);
  }
  
  public final void onXWalkUpdateProgress(int paramInt) {}
  
  public final void onXWalkUpdateStarted() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/xwalk/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */