package com.tencent.mm.console.a;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.g.a.bm;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.s;

public final class m
  implements com.tencent.mm.pluginsdk.cmd.a
{
  static
  {
    b.a(new m(), new String[] { "//cleanwx", "//showfile", "//hidefile" });
  }
  
  public static void init() {}
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    paramArrayOfString = paramArrayOfString[0];
    int i = -1;
    switch (paramArrayOfString.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return false;
        if (paramArrayOfString.equals("//cleanwx"))
        {
          i = 0;
          continue;
          if (paramArrayOfString.equals("//showfile"))
          {
            i = 1;
            continue;
            if (paramArrayOfString.equals("//hidefile")) {
              i = 2;
            }
          }
        }
        break;
      }
    }
    paramArrayOfString = new bm();
    com.tencent.mm.sdk.b.a.sFg.m(paramArrayOfString);
    s.makeText(paramContext, "clean wx file index now.", 0).show();
    return true;
    try
    {
      g.Ei().DT().a(aa.a.sYn, Integer.valueOf(1));
      s.makeText(paramContext, "show file now.", 0).show();
      return true;
    }
    catch (Exception paramContext)
    {
      return true;
    }
    try
    {
      g.Ei().DT().a(aa.a.sYn, Integer.valueOf(0));
      s.makeText(paramContext, "hide file now.", 0).show();
      return true;
    }
    catch (Exception paramContext) {}
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/console/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */