package com.tencent.mm.plugin.appbrand.game.c;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug.MemoryInfo;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.ad;

public final class h
{
  public int fBZ = Integer.MAX_VALUE;
  
  public static Debug.MemoryInfo agu()
  {
    Debug.MemoryInfo[] arrayOfMemoryInfo = ((ActivityManager)ad.getContext().getSystemService("activity")).getProcessMemoryInfo(new int[] { Process.myPid() });
    if ((arrayOfMemoryInfo != null) && (arrayOfMemoryInfo.length > 0)) {
      return arrayOfMemoryInfo[0];
    }
    return null;
  }
  
  public static int b(Debug.MemoryInfo paramMemoryInfo)
  {
    if (paramMemoryInfo == null) {
      return 0;
    }
    return paramMemoryInfo.getTotalPss() / 1024;
  }
  
  public final int a(Debug.MemoryInfo paramMemoryInfo)
  {
    if (this.fBZ == Integer.MAX_VALUE) {}
    while (paramMemoryInfo == null) {
      return Integer.MAX_VALUE;
    }
    return b(paramMemoryInfo) - this.fBZ;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */