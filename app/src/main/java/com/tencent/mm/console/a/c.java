package com.tencent.mm.console.a;

import android.content.Context;
import android.os.Looper;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  implements com.tencent.mm.pluginsdk.cmd.a
{
  static
  {
    b.a(new c(), new String[] { "//fav" });
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
      label54:
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      return true;
      if (!paramContext.equals("resendfavitem")) {
        break;
      }
      break label54;
      if (!paramContext.equals("uploadfavitem")) {
        break;
      }
      i = 1;
      break label54;
      paramContext = new fz();
      paramContext.bOL.type = 39;
      paramContext.bOL.bOU = paramArrayOfString[2];
      paramContext.bOL.bOV = paramArrayOfString[3];
      com.tencent.mm.sdk.b.a.sFg.a(paramContext, Looper.getMainLooper());
      continue;
      paramContext = new fz();
      paramContext.bOL.type = 38;
      paramContext.bOL.bOU = paramArrayOfString[2];
      com.tencent.mm.sdk.b.a.sFg.a(paramContext, Looper.getMainLooper());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/console/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */