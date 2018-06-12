package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.View;
import android.widget.EditText;
import com.tencent.mm.plugin.appbrand.page.p;

public abstract interface y<Input extends EditText,  extends z>
{
  public abstract boolean adjustPositionOnFocused();
  
  public abstract View getInputPanel();
  
  public abstract int getInputPanelMarginBottom();
  
  public abstract Input getWidget();
  
  public abstract boolean hideKeyboard();
  
  public abstract boolean isAttachedTo(p paramp);
  
  public abstract void kL(int paramInt);
  
  public abstract boolean removeSelf();
  
  public abstract boolean showKeyboard(int paramInt1, int paramInt2);
  
  public abstract void updateValue(String paramString, Integer paramInteger);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */