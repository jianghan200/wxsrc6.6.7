package com.tencent.mm.plugin.card.ui.view;

import android.view.View;
import com.tencent.mm.plugin.card.ui.n;

public abstract class i
{
  n hHF;
  
  public final void a(n paramn)
  {
    this.hHF = paramn;
    initView();
  }
  
  public void azI() {}
  
  public void destroy()
  {
    this.hHF = null;
  }
  
  protected final View findViewById(int paramInt)
  {
    return this.hHF.findViewById(paramInt);
  }
  
  protected final String getString(int paramInt)
  {
    return this.hHF.getString(paramInt);
  }
  
  public abstract void initView();
  
  public void update() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */