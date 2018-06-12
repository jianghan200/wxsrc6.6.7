package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class HardDeviceChattingItemView
  extends LinearLayout
{
  private boolean mHasInit;
  
  public HardDeviceChattingItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    if (!this.mHasInit) {
      this.mHasInit = true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/HardDeviceChattingItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */