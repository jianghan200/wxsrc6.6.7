package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public class StaticTextView
  extends View
  implements a
{
  protected g dui = new g(this, Fc());
  
  public StaticTextView(Context paramContext)
  {
    super(paramContext);
    this.dui.init();
  }
  
  public StaticTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.dui.init();
  }
  
  public StaticTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.dui.init();
  }
  
  public com.tencent.mm.kiss.widget.textview.a.a Fc()
  {
    return new com.tencent.mm.kiss.widget.textview.a.a();
  }
  
  public com.tencent.mm.kiss.widget.textview.a.a getConfig()
  {
    if (this.dui == null) {
      return null;
    }
    return this.dui.duk;
  }
  
  public int getHorizontalDrawOffset()
  {
    if (this.dui == null) {
      return 0;
    }
    return this.dui.dun;
  }
  
  public f getLayoutWrapper()
  {
    if (this.dui == null) {
      return null;
    }
    return this.dui.getLayoutWrapper();
  }
  
  public int getLineCount()
  {
    return this.dui.getLineCount();
  }
  
  public int getLineHeight()
  {
    return this.dui.getLineHeight();
  }
  
  public int getMaxLines()
  {
    return this.dui.getMaxLines();
  }
  
  public int getOrientation()
  {
    int i = getResources().getConfiguration().orientation;
    x.i("MicroMsg.StaticTextView", "test test getOrientation " + i);
    return i;
  }
  
  public int getSelectionEnd()
  {
    return this.dui.getSelectionEnd();
  }
  
  public int getSelectionStart()
  {
    return this.dui.getSelectionStart();
  }
  
  public CharSequence getText()
  {
    return this.dui.getText();
  }
  
  public int getTextColor()
  {
    return this.dui.getTextColor();
  }
  
  public float getTextSize()
  {
    return this.dui.getTextSize();
  }
  
  public Layout getTvLayout()
  {
    return this.dui.getTvLayout();
  }
  
  public int getVerticalDrawOffset()
  {
    if (this.dui == null) {
      return 0;
    }
    return this.dui.duo;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.dui != null) {
      this.dui.onDraw(paramCanvas);
    }
  }
  
  public void onFinishTemporaryDetach()
  {
    super.onFinishTemporaryDetach();
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (paramAccessibilityEvent.getEventType() == 8192)
    {
      paramAccessibilityEvent.setFromIndex(Selection.getSelectionStart(getText()));
      paramAccessibilityEvent.setToIndex(Selection.getSelectionEnd(getText()));
      if (!bi.K(getText())) {
        paramAccessibilityEvent.setItemCount(getText().length());
      }
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if (!bi.K(getText()))
    {
      paramAccessibilityNodeInfo.addAction(256);
      paramAccessibilityNodeInfo.addAction(512);
      paramAccessibilityNodeInfo.setMovementGranularities(31);
      if (d.fR(18)) {
        paramAccessibilityNodeInfo.addAction(131072);
      }
    }
    if ((isFocused()) && (d.fR(18)))
    {
      paramAccessibilityNodeInfo.addAction(16384);
      paramAccessibilityNodeInfo.addAction(32768);
      paramAccessibilityNodeInfo.addAction(65536);
    }
    if ((d.fR(19)) && (this.dui.getMaxLines() > 1)) {
      paramAccessibilityNodeInfo.setMultiLine(true);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.dui == null)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    Point localPoint = this.dui.aX(paramInt1, paramInt2);
    if (localPoint != null)
    {
      setMeasuredDimension(localPoint.x, localPoint.y);
      return;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (!bi.K(getText())) {
      paramAccessibilityEvent.getText().add(getText());
    }
  }
  
  public void onStartTemporaryDetach()
  {
    super.onStartTemporaryDetach();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1;
    if (getTvLayout() == null) {
      bool1 = false;
    }
    boolean bool2;
    do
    {
      return bool1;
      bool2 = this.dui.v(paramMotionEvent);
      bool1 = super.onTouchEvent(paramMotionEvent);
    } while (!bool2);
    return true;
  }
  
  public boolean performClick()
  {
    if (this.dui == null) {}
    while (!this.dui.performClick()) {
      return false;
    }
    return super.performClick();
  }
  
  public void setClickable(boolean paramBoolean)
  {
    super.setClickable(paramBoolean);
    if (this.dui != null) {
      this.dui.duq = paramBoolean;
    }
  }
  
  public void setConfig(com.tencent.mm.kiss.widget.textview.a.a parama)
  {
    this.dui.duk = parama;
  }
  
  public void setGravity(int paramInt)
  {
    this.dui.setGravity(paramInt);
  }
  
  public void setHandleClickableSpan(boolean paramBoolean)
  {
    this.dui.dur = paramBoolean;
  }
  
  public void setLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.dui != null) {
      this.dui.Fd();
    }
    super.setLayoutParams(paramLayoutParams);
  }
  
  public void setLines(int paramInt)
  {
    this.dui.setLines(paramInt);
  }
  
  public void setMaxLines(int paramInt)
  {
    this.dui.setMaxLines(paramInt);
  }
  
  public void setMinLines(int paramInt)
  {
    this.dui.setMinLines(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.dui != null) {
      this.dui.Fd();
    }
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setSingleLine(boolean paramBoolean)
  {
    this.dui.setSingleLine(paramBoolean);
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    setText(paramCharSequence, true);
  }
  
  public final void setText(CharSequence paramCharSequence, boolean paramBoolean)
  {
    this.dui.setText(paramCharSequence, paramBoolean);
    setContentDescription(paramCharSequence);
  }
  
  public void setTextColor(int paramInt)
  {
    this.dui.setTextColor(paramInt);
  }
  
  public void setTextLayout(f paramf)
  {
    this.dui.setTextLayout(paramf);
  }
  
  public void setTextSize(float paramFloat)
  {
    this.dui.setTextSize(0, paramFloat);
  }
  
  public final void setTextSize$255e752(float paramFloat)
  {
    this.dui.setTextSize(1, paramFloat);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/StaticTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */