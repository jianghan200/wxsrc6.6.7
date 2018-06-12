package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

public class MMKeyboardUperView
  extends ScrollView
{
  private int defaultHeight = -1;
  private View eSn;
  private Runnable eSo = new MMKeyboardUperView.1(this);
  private Runnable eSp = new Runnable()
  {
    public final void run()
    {
      MMKeyboardUperView.a(MMKeyboardUperView.this).setVisibility(0);
    }
  };
  
  public MMKeyboardUperView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MMKeyboardUperView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void setupUperView(View paramView)
  {
    this.eSn = paramView;
    this.defaultHeight = -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/ui/MMKeyboardUperView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */