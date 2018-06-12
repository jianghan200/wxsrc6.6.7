package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.content.Context;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;

public abstract interface d
  extends a
{
  public abstract AppBrandRecentView a(Context paramContext, int paramInt, a parama);
  
  public abstract void aoX();
  
  public abstract b aoY();
  
  public abstract void cN(Context paramContext);
  
  public abstract AppBrandRecentView z(Context paramContext, int paramInt);
  
  public static abstract interface a
  {
    public abstract LocalUsageInfo alV();
  }
  
  public static enum b {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/recentview/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */