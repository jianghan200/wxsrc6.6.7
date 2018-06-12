package com.tencent.mm.plugin.appbrand.appusage;

import android.os.Bundle;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;

public final class c
  extends j
{
  private static volatile c flc = null;
  
  public static c acK()
  {
    if (flc == null) {}
    try
    {
      if (flc == null) {
        flc = new c();
      }
      return flc;
    }
    finally {}
  }
  
  public static boolean acL()
  {
    if (!g.Eg().Dx()) {
      return false;
    }
    return ((Boolean)g.Ei().DT().get(aa.a.sTC, Boolean.valueOf(false))).booleanValue();
  }
  
  public static void release()
  {
    flc = null;
  }
  
  public final void a(long paramLong, boolean paramBoolean, Bundle paramBundle)
  {
    com.tencent.mm.plugin.appbrand.r.c.Em().H(new c.3(this, paramBoolean, paramLong, paramBundle));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appusage/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */