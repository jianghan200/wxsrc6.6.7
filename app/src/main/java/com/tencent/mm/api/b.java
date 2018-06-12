package com.tencent.mm.api;

import android.content.Context;
import android.widget.FrameLayout;

public abstract class b
  extends FrameLayout
{
  l bwK = new b.1(this);
  
  public b(Context paramContext)
  {
    super(paramContext);
  }
  
  public l getSelectedFeatureListener()
  {
    return this.bwK;
  }
  
  public abstract void setActionBarCallback(e parame);
  
  public abstract void setActionBarVisible(boolean paramBoolean);
  
  public abstract void setAutoShowFooterAndBar(boolean paramBoolean);
  
  public abstract void setFooterVisible(boolean paramBoolean);
  
  public void setSelectedFeatureListener(l paraml)
  {
    this.bwK = paraml;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/api/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */