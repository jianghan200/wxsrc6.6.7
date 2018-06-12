package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputConnection;
import com.tencent.mm.plugin.appbrand.widget.input.b.a;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class AppBrandNumberKeyboardView
  extends MyKeyboardWindow
{
  private int gHX = 0;
  private final SparseArray<String> gHY = new AppBrandNumberKeyboardView.1(this);
  InputConnection gHZ;
  a gIa;
  
  AppBrandNumberKeyboardView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public AppBrandNumberKeyboardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    AppBrandNumberKeyboardView.2 local2 = new AppBrandNumberKeyboardView.2(this);
    int i = 0;
    while (i < this.gHY.size())
    {
      findViewById(getId((String)this.gHY.valueAt(i))).setOnClickListener(local2);
      i += 1;
    }
    findViewById(getId("tenpay_keyboard_x")).setOnClickListener(local2);
    findViewById(getId("tenpay_keyboard_d")).setOnClickListener(null);
    findViewById(getId("tenpay_keyboard_d")).setOnTouchListener(new AppBrandNumberKeyboardView.3(this));
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setInputEditText(null);
  }
  
  public final void setXMode(int paramInt)
  {
    super.setXMode(paramInt);
    this.gHX = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */