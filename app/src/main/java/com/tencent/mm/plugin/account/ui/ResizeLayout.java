package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ResizeLayout
  extends LinearLayout
{
  private a eWS = null;
  
  public ResizeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.eWS != null) {
      this.eWS.YE();
    }
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setOnSizeChanged(a parama)
  {
    this.eWS = parama;
  }
  
  public static abstract interface a
  {
    public abstract void YE();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/ui/ResizeLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */