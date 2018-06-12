package com.tencent.mm.plugin.radar.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import b.c.b.e;
import com.tencent.mm.protocal.c.ben;
import com.tencent.mm.protocal.c.beq;

public final class g
{
  public static final g mmr = new g();
  
  public static String a(ben paramben)
  {
    if (paramben != null)
    {
      String str = paramben.ryZ;
      Object localObject = str;
      if (str == null)
      {
        paramben = paramben.hbL;
        localObject = paramben;
        if (paramben == null) {
          localObject = "";
        }
      }
      paramben = (ben)localObject;
      if (localObject != null) {}
    }
    else
    {
      paramben = "";
    }
    return paramben;
  }
  
  public static String b(beq parambeq)
  {
    e.i(parambeq, "member");
    String str = parambeq.hbL;
    Object localObject = str;
    if (str == null)
    {
      parambeq = parambeq.ryZ;
      localObject = parambeq;
      if (parambeq == null) {
        localObject = "";
      }
    }
    return (String)localObject;
  }
  
  public static String c(beq parambeq)
  {
    if (parambeq != null)
    {
      String str = parambeq.ryZ;
      Object localObject = str;
      if (str == null)
      {
        parambeq = parambeq.hbL;
        localObject = parambeq;
        if (parambeq == null) {
          localObject = "";
        }
      }
      parambeq = (beq)localObject;
      if (localObject != null) {}
    }
    else
    {
      parambeq = "";
    }
    return parambeq;
  }
  
  public static boolean ea(Context paramContext)
  {
    e.i(paramContext, "context");
    paramContext = paramContext.getResources();
    e.h(paramContext, "context.resources");
    return paramContext.getDisplayMetrics().densityDpi <= 240;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/radar/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */