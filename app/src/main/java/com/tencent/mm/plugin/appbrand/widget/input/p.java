package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;

abstract class p
  extends w
{
  public p(Context paramContext)
  {
    super(paramContext);
    super.setHorizontallyScrolling(true);
  }
  
  public final boolean apv()
  {
    return false;
  }
  
  public boolean apz()
  {
    return false;
  }
  
  public boolean canScrollVertically(int paramInt)
  {
    return false;
  }
  
  public void setGravity(int paramInt)
  {
    super.setGravity(paramInt & 0xFFFFFFAF & 0xFFFFFFCF | 0x10);
  }
  
  public final void setInputType(int paramInt)
  {
    super.setInputType(0xFFFDFFFF & paramInt);
  }
  
  public final void setSingleLine(boolean paramBoolean) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */