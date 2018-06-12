package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStructure;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;

public class SysTextView
  extends TextView
  implements a
{
  private static boolean duw = false;
  private static Field dux = null;
  private g dui = new g(this, new com.tencent.mm.kiss.widget.textview.a.a());
  
  public SysTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public SysTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    super.setText(" ", TextView.BufferType.SPANNABLE);
    this.dui.duk = new com.tencent.mm.kiss.widget.textview.a.a();
    this.dui.duk.textColor = super.getTextColors().getDefaultColor();
    this.dui.duk.dtW = super.getEllipsize();
    this.dui.duk.gravity = super.getGravity();
    this.dui.duk.duz = super.getTextSize();
    if (!duw) {}
    try
    {
      if (dux == null)
      {
        Field localField = TextView.class.getDeclaredField("mSingleLine");
        dux = localField;
        localField.setAccessible(true);
      }
      if (dux.getBoolean(this)) {
        this.dui.duk.maxLines = 1;
      }
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.SysPLTextView", "initSingleLine error: %s", new Object[] { localException.getMessage() });
      duw = true;
    }
  }
  
  public void dispatchProvideStructure(ViewStructure paramViewStructure) {}
  
  public int getBaseline()
  {
    try
    {
      int i = super.getBaseline();
      return i;
    }
    catch (Throwable localThrowable)
    {
      x.printErrStackTrace("MicroMsg.SysPLTextView", localThrowable, "", new Object[0]);
    }
    return -1;
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
  
  protected f getLayoutWrapper()
  {
    if (this.dui == null) {
      return null;
    }
    return this.dui.getLayoutWrapper();
  }
  
  public int getLineCount()
  {
    if (this.dui == null) {
      return 0;
    }
    return this.dui.getLineCount();
  }
  
  public int getLineHeight()
  {
    if (this.dui == null) {
      return 0;
    }
    return this.dui.getLineHeight();
  }
  
  public int getSelectionEnd()
  {
    if (getText() == null) {
      return -1;
    }
    return Selection.getSelectionEnd(getText());
  }
  
  public int getSelectionStart()
  {
    if (getText() == null) {
      return -1;
    }
    return Selection.getSelectionStart(getText());
  }
  
  public CharSequence getText()
  {
    if (this.dui == null) {
      return null;
    }
    return this.dui.getText();
  }
  
  public int getTextColor()
  {
    return this.dui.getTextColor();
  }
  
  public float getTextSize()
  {
    if (this.dui == null) {
      return 0.0F;
    }
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
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      if (this.dui == null) {
        return;
      }
      this.dui.onDraw(paramCanvas);
      return;
    }
    catch (Throwable paramCanvas)
    {
      x.printErrStackTrace("MicroMsg.SysPLTextView", paramCanvas, "", new Object[0]);
    }
  }
  
  public void onFinishTemporaryDetach()
  {
    super.onFinishTemporaryDetach();
  }
  
  public void onHoverChanged(boolean paramBoolean) {}
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      Point localPoint = this.dui.aX(paramInt1, paramInt2);
      if (localPoint != null)
      {
        setMeasuredDimension(localPoint.x, localPoint.y);
        return;
      }
      try
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.SysPLTextView", localException, "onMeasure error: %s", new Object[] { localException.getMessage() });
        return;
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      x.printErrStackTrace("MicroMsg.SysPLTextView", localThrowable, "", new Object[0]);
    }
  }
  
  public boolean onPreDraw()
  {
    return true;
  }
  
  public void onProvideStructure(ViewStructure paramViewStructure)
  {
    try
    {
      super.onProvideStructure(paramViewStructure);
      return;
    }
    catch (Exception paramViewStructure)
    {
      x.printErrStackTrace("MicroMsg.SysPLTextView", paramViewStructure, "onProvideStructure error: %s", new Object[] { paramViewStructure.getMessage() });
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
    if (this.dui == null) {
      return;
    }
    this.dui.duq = paramBoolean;
  }
  
  public void setGravity(int paramInt)
  {
    if (this.dui == null) {
      return;
    }
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
    if (this.dui == null) {
      return;
    }
    this.dui.setLines(paramInt);
  }
  
  public void setMaxLines(int paramInt)
  {
    if (this.dui == null) {
      return;
    }
    this.dui.setMaxLines(paramInt);
  }
  
  public void setMinLines(int paramInt)
  {
    if (this.dui == null) {
      return;
    }
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
    if (this.dui == null) {
      return;
    }
    this.dui.setSingleLine(paramBoolean);
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    setText$609c24db(paramCharSequence);
  }
  
  public final void setText$609c24db(CharSequence paramCharSequence)
  {
    if (this.dui == null)
    {
      super.setText("");
      return;
    }
    this.dui.setText(paramCharSequence, false);
  }
  
  public void setTextColor(int paramInt)
  {
    if (this.dui == null) {
      return;
    }
    this.dui.setTextColor(paramInt);
  }
  
  public void setTextLayout(f paramf)
  {
    if (this.dui == null) {
      return;
    }
    this.dui.setTextLayout(paramf);
  }
  
  public void setTextSize(float paramFloat)
  {
    setTextSize(0, paramFloat);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    if (this.dui == null) {
      return;
    }
    this.dui.setTextSize(paramInt, paramFloat);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/SysTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */