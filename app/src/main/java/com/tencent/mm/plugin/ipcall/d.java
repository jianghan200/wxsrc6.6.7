package com.tencent.mm.plugin.ipcall;

import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;

public final class d
{
  public static boolean aWV()
  {
    if (au.HX())
    {
      if (g.AT().getInt("WCOEntranceSwitch", 0) > 0)
      {
        au.HU();
        c.DT().a(aa.a.sRf, Boolean.valueOf(true));
        return true;
      }
      au.HU();
      c.DT().a(aa.a.sRf, Boolean.valueOf(false));
      return false;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ipcall/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */