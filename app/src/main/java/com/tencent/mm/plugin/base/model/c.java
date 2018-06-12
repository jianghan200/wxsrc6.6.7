package com.tencent.mm.plugin.base.model;

import android.os.Process;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  public static String bU(String paramString1, String paramString2)
  {
    return g.u((g.u(paramString1.getBytes()) + b.bT(paramString2, paramString1)).getBytes());
  }
  
  public static String wO(String paramString)
  {
    String str1;
    if ((paramString == null) || (paramString.length() <= 0)) {
      str1 = null;
    }
    String str2;
    do
    {
      do
      {
        do
        {
          do
          {
            return str1;
            x.i("MicroMsg.ShortcutUtil", "process name: %s", new Object[] { bi.an(ad.getContext(), Process.myPid()) });
            str1 = paramString;
          } while (!paramString.startsWith("shortcut_"));
          str1 = paramString;
        } while (paramString.length() <= 9);
        str2 = paramString.substring(9);
        str1 = paramString;
      } while (str2 == null);
      str1 = paramString;
    } while (str2.length() <= 0);
    return b.bT(new String(b.wN(str2)), q.zy());
  }
  
  public static String wP(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {}
    do
    {
      return null;
      x.i("MicroMsg.ShortcutUtil", "process name: %s", new Object[] { bi.an(ad.getContext(), Process.myPid()) });
      paramString = b.bT(paramString, q.zy());
    } while (bi.oW(paramString));
    return "shortcut_" + b.aa(paramString.getBytes());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/base/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */