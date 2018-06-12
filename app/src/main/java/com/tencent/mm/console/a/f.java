package com.tencent.mm.console.a;

import android.content.Context;
import com.tencent.mm.g.a.my;
import com.tencent.mm.modelstat.WatchDogPushReceiver;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  implements com.tencent.mm.pluginsdk.cmd.a
{
  static
  {
    b.a(new f(), new String[] { "//recovery" });
  }
  
  public static void init() {}
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    int i = 0;
    if (x.getLogLevel() > 1) {
      return false;
    }
    if (paramArrayOfString.length < 2) {
      return true;
    }
    paramContext = paramArrayOfString[1];
    switch (paramContext.hashCode())
    {
    default: 
      i = -1;
      label70:
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      return true;
      if (!paramContext.equals("testpush")) {
        break;
      }
      break label70;
      if (!paramContext.equals("testmm")) {
        break;
      }
      i = 1;
      break label70;
      if (!paramContext.equals("testmmonline")) {
        break;
      }
      i = 2;
      break label70;
      if (!paramContext.equals("log")) {
        break;
      }
      i = 3;
      break label70;
      WatchDogPushReceiver.Sl();
      continue;
      paramContext = new my();
      paramContext.bYa.action = 1;
      com.tencent.mm.sdk.b.a.sFg.m(paramContext);
      continue;
      paramContext = new my();
      paramContext.bYa.action = 3;
      com.tencent.mm.sdk.b.a.sFg.m(paramContext);
      continue;
      paramContext = new my();
      paramContext.bYa.action = 2;
      com.tencent.mm.sdk.b.a.sFg.m(paramContext);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/console/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */