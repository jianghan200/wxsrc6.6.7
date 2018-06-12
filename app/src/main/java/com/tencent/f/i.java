package com.tencent.f;

import android.content.Context;
import com.tencent.f.b.d;
import com.tencent.pb.common.c.c;

public final class i
{
  private static i vwM;
  private boolean mg;
  private Context rc;
  
  private static i cHs()
  {
    if (vwM == null) {}
    try
    {
      if (vwM == null) {
        vwM = new i();
      }
      return vwM;
    }
    finally {}
  }
  
  public static void jdMethod_if(Context paramContext)
  {
    i locali = cHs();
    if (!locali.mg)
    {
      locali.rc = paramContext;
      paramContext = new d("EventCenter", com.tencent.f.a.b.class.getName());
    }
    try
    {
      paramContext = f.a(paramContext);
      if (paramContext != null) {
        paramContext.start();
      }
      return;
    }
    catch (Throwable paramContext)
    {
      c.x("service", new Object[] { paramContext });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */