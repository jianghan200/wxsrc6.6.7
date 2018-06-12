package com.tencent.mm.ui.widget.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.tencent.mm.bw.a.k;
import com.tencent.mm.ui.ap;

public class MMAutoAdjustTextView
  extends TextView
{
  private float duz;
  private Paint kR;
  private float scale;
  
  public MMAutoAdjustTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b(paramContext.obtainStyledAttributes(paramAttributeSet, a.k.MMAutoAdjustTextView));
    init();
  }
  
  public MMAutoAdjustTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    b(paramContext.obtainStyledAttributes(paramAttributeSet, a.k.MMAutoAdjustTextView));
    init();
  }
  
  private void GL(int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    for (;;)
    {
      measure(0, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
      if (getMeasuredWidth() <= paramInt) {
        break;
      }
      this.duz -= ap.getDensity(getContext());
      setTextSize(0, this.duz * this.scale);
    }
  }
  
  private static void b(TypedArray paramTypedArray)
  {
    if (paramTypedArray != null) {
      paramTypedArray.recycle();
    }
  }
  
  private void init()
  {
    this.duz = getTextSize();
    this.scale = ap.fe(getContext());
    this.kR = new Paint();
    this.kR.set(getPaint());
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      getText().toString();
      GL(paramInt1);
    }
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    paramCharSequence.toString();
    GL(getWidth());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/widget/textview/MMAutoAdjustTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */