package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.x;

public class MMAutoSizeTextView
  extends TextView
{
  private Paint kR;
  private float kgG;
  private float ttG;
  private float ttH;
  
  public MMAutoSizeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public MMAutoSizeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void crp()
  {
    this.kgG = getTextSize();
    if (this.kgG <= this.ttG) {
      this.kgG = this.ttH;
    }
  }
  
  private void dj(String paramString, int paramInt)
  {
    x.i("MicroMsg.MMAutoSizeTextView", "autoAdjustTextSize[text=%s, viewWidth=%d]", new Object[] { paramString, Integer.valueOf(paramInt) });
    if (paramInt <= 0) {
      return;
    }
    paramInt = paramInt - getPaddingLeft() - getPaddingRight();
    crp();
    float f1 = this.kgG;
    this.kR.setTextSize(f1);
    for (;;)
    {
      float f2 = f1;
      if (f1 > this.ttG)
      {
        f2 = f1;
        if (this.kR.measureText(paramString) > paramInt)
        {
          f1 -= 1.0F;
          if (f1 > this.ttG) {
            break label162;
          }
          f2 = this.ttG;
        }
      }
      x.i("MicroMsg.MMAutoSizeTextView", "try size[%f], maxSize[%f], measureTextSize[%f], availableWidth[%d]", new Object[] { Float.valueOf(f2), Float.valueOf(this.kgG), Float.valueOf(this.kR.measureText(paramString)), Integer.valueOf(paramInt) });
      setTextSize(0, f2);
      return;
      label162:
      this.kR.setTextSize(f1);
    }
  }
  
  private void init()
  {
    setSingleLine();
    setEllipsize(TextUtils.TruncateAt.END);
    this.ttG = a.fromDPToPix(getContext(), 8);
    this.ttH = a.fromDPToPix(getContext(), 22);
    this.kR = new Paint();
    this.kR.set(getPaint());
    crp();
  }
  
  public int getBaseline()
  {
    try
    {
      int i = super.getBaseline();
      return i;
    }
    catch (Throwable localThrowable)
    {
      x.printErrStackTrace("MicroMsg.MMAutoSizeTextView", localThrowable, "", new Object[0]);
    }
    return -1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      return;
    }
    catch (Throwable paramCanvas)
    {
      x.printErrStackTrace("MicroMsg.MMAutoSizeTextView", paramCanvas, "", new Object[0]);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    catch (Throwable localThrowable)
    {
      x.printErrStackTrace("MicroMsg.MMAutoSizeTextView", localThrowable, "", new Object[0]);
    }
  }
  
  public boolean onPreDraw()
  {
    try
    {
      boolean bool = super.onPreDraw();
      return bool;
    }
    catch (Throwable localThrowable) {}
    return true;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    x.w("MicroMsg.MMAutoSizeTextView", "on size changed");
    if (paramInt1 != paramInt3) {
      dj(getText().toString(), paramInt1);
    }
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    x.w("MicroMsg.MMAutoSizeTextView", "on text changed");
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    dj(paramCharSequence.toString(), getWidth());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/base/MMAutoSizeTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */