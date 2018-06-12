package com.tencent.mm.console.a;

import android.content.Context;
import android.os.Looper;
import android.os.Process;
import com.tencent.mm.g.a.fh;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bn;
import java.util.Calendar;

public final class h
  implements com.tencent.mm.pluginsdk.cmd.a
{
  static
  {
    com.tencent.mm.pluginsdk.cmd.b.a(new h(), new String[] { "//sport" });
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
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      return true;
      if (!paramContext.equals("setdevicestep")) {
        break;
      }
      i = 0;
      break;
      if (!paramContext.equals("clear")) {
        break;
      }
      i = 1;
      break;
      if (!paramContext.equals("setextapistep")) {
        break;
      }
      i = 2;
      break;
      if (!paramContext.equals("updatehistorystep")) {
        break;
      }
      i = 3;
      break;
      i = Integer.valueOf(paramArrayOfString[2]).intValue();
      long l1 = bi.ciZ() / 10000L;
      ((com.tencent.mm.plugin.sport.b.b)g.l(com.tencent.mm.plugin.sport.b.b.class)).J(202, l1);
      ((com.tencent.mm.plugin.sport.b.b)g.l(com.tencent.mm.plugin.sport.b.b.class)).J(201, i);
      paramContext = Calendar.getInstance();
      paramContext.set(11, 0);
      paramContext.set(12, 0);
      paramContext.set(13, 0);
      l1 = paramContext.getTimeInMillis();
      long l2 = System.currentTimeMillis();
      ((com.tencent.mm.plugin.sport.b.b)g.l(com.tencent.mm.plugin.sport.b.b.class)).a("", "gh_43f2581f6fd6", (int)(l1 / 1000L), (int)(l2 / 1000L), i, bn.cmZ());
      continue;
      ((com.tencent.mm.plugin.sport.b.b)g.l(com.tencent.mm.plugin.sport.b.b.class)).bFw();
      Process.killProcess(Process.myPid());
      continue;
      paramContext = new fh();
      paramContext.bNx.action = 2;
      paramContext.bNx.bNA = Integer.valueOf(paramArrayOfString[2]).intValue();
      paramContext.bNx.bNB = 1L;
      com.tencent.mm.sdk.b.a.sFg.a(paramContext, Looper.getMainLooper());
      continue;
      paramContext = Calendar.getInstance();
      paramContext.add(5, -1);
      paramContext.set(10, 23);
      paramContext.set(12, 59);
      paramContext.set(13, 59);
      l1 = paramContext.getTimeInMillis();
      paramContext.add(5, -120);
      paramContext.set(10, 0);
      paramContext.set(12, 0);
      paramContext.set(13, 0);
      l2 = paramContext.getTimeInMillis();
      ((com.tencent.mm.plugin.sport.b.b)g.l(com.tencent.mm.plugin.sport.b.b.class)).a(l2, l1, null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/console/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */