package com.tencent.mm.protocal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class a
{
  public static int cfW()
  {
    if (b.foreground) {
      return 1;
    }
    return 2;
  }
  
  public static int getNetType(Context paramContext)
  {
    for (;;)
    {
      try
      {
        paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (paramContext == null) {
          return 0;
        }
        i = paramContext.getSubtype();
        int j = paramContext.getType();
        if (j != 1) {
          continue;
        }
        i = 1;
      }
      catch (Exception paramContext)
      {
        x.e("MicroMsg.BgFgBase", "getNetType: %s", new Object[] { bi.i(paramContext) });
        int i = 1;
        continue;
      }
      return i;
      if ((i == 13) || (i == 15) || (i == 14)) {
        i = 4;
      } else if ((i == 3) || (i == 4) || (i == 5) || (i == 6) || (i == 12)) {
        i = 3;
      } else if ((i == 1) || (i == 2)) {
        i = 2;
      } else {
        i = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */