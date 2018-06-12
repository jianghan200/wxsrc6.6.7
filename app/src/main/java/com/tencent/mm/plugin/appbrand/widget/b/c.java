package com.tencent.mm.plugin.appbrand.widget.b;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class c
  implements Iterator<View>
{
  private final ViewGroup gFG;
  private int gwc = 0;
  
  public c(ViewGroup paramViewGroup)
  {
    this.gFG = paramViewGroup;
  }
  
  public final boolean hasNext()
  {
    return this.gwc < this.gFG.getChildCount();
  }
  
  public final void remove()
  {
    this.gFG.removeViewAt(this.gwc - 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */