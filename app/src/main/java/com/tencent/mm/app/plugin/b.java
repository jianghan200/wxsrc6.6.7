package com.tencent.mm.app.plugin;

import com.tencent.mm.bg.d;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.platformtools.bi;

public final class b
{
  public static boolean vy()
  {
    if (!d.QS("translate")) {}
    String str;
    do
    {
      return false;
      str = g.AT().getValue("TranslateMsgOff");
      if (bi.oW(str)) {
        return true;
      }
    } while (bi.WU(str) != 0);
    return true;
  }
  
  public static boolean vz()
  {
    if (!d.QS("translate")) {}
    String str;
    do
    {
      return false;
      str = g.AT().getValue("ReTranslateSwitch");
      if (bi.oW(str)) {
        return true;
      }
    } while (bi.WU(str) != 0);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/app/plugin/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */