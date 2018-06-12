package com.tencent.mm.console.a;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.plugin.secinforeport.a.d;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  implements a
{
  static
  {
    com.tencent.mm.pluginsdk.cmd.b.a(new e(), new String[] { "//normsg" });
  }
  
  public static void init() {}
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    if (!com.tencent.mm.sdk.a.b.chp()) {}
    while (paramArrayOfString.length < 2) {
      return false;
    }
    try
    {
      if (paramArrayOfString.length >= 3) {
        Integer.valueOf(paramArrayOfString[2]).intValue();
      }
      String str = paramArrayOfString[1].toLowerCase();
      long l1 = System.nanoTime();
      int i = -1;
      switch (str.hashCode())
      {
      default: 
        switch (i)
        {
        default: 
          return false;
        case 0: 
          d.mOw.a(0, true, true, true);
          Toast.makeText(paramContext, "info is reported.", 0).show();
        }
        break;
      }
      for (;;)
      {
        long l2 = System.nanoTime();
        paramArrayOfString = String.format("[NorMsgTest] cmd: %s, time: %d ns.", new Object[] { paramArrayOfString[1], Long.valueOf(l2 - l1) });
        x.i("MicroMsg.NorMsgTest", paramArrayOfString);
        Toast.makeText(paramContext, paramArrayOfString, 0).show();
        return true;
        if (!str.equals("testrpp")) {
          break;
        }
        i = 0;
        break;
        if (!str.equals("testturing")) {
          break;
        }
        i = 1;
        break;
        com.tencent.mm.plugin.normsg.a.b.lFJ.S(1, 1, 4);
        ah.i(new e.1(this), 4000L);
        Toast.makeText(paramContext, "turing info is reported.", 0).show();
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/console/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */