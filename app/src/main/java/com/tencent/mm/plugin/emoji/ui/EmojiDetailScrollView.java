package com.tencent.mm.plugin.emoji.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class EmojiDetailScrollView
  extends ScrollView
{
  private boolean imb = true;
  
  public EmojiDetailScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public EmojiDetailScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setFadingEdgeLength(0);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.imb) {
      return false;
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.imb = false;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void requestChildFocus(View paramView1, View paramView2) {}
  
  public void requestLayout()
  {
    this.imb = false;
    super.requestLayout();
  }
  
  public void scrollBy(int paramInt1, int paramInt2) {}
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    this.imb = true;
  }
  
  public void setScrollEnable(boolean paramBoolean)
  {
    this.imb = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/EmojiDetailScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */