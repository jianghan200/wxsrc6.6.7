package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.z;
import android.util.DisplayMetrics;

final class l
  extends z
{
  private final LinearLayoutManager gAX;
  private final int gAY;
  private final int gAZ;
  
  l(Context paramContext, LinearLayoutManager paramLinearLayoutManager)
  {
    super(paramContext);
    this.gAX = paramLinearLayoutManager;
    this.gAY = 3000;
    this.gAZ = Math.round(paramContext.getResources().getDisplayMetrics().heightPixels * 0.75F);
  }
  
  public final PointF bf(int paramInt)
  {
    return this.gAX.bf(paramInt);
  }
  
  protected final int bi(int paramInt)
  {
    paramInt = Math.min(this.gAY, paramInt);
    return super.bi(Math.max(this.gAZ, paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */