package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

public abstract class r
{
  public abstract boolean SK(String paramString);
  
  public abstract String Vw();
  
  public String a(Context paramContext, ResolveInfo paramResolveInfo)
  {
    return paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager()).toString();
  }
  
  public abstract String cbq();
  
  public abstract s.a cbr();
  
  public abstract boolean eM(Context paramContext);
  
  public boolean z(Context paramContext, Intent paramIntent)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */