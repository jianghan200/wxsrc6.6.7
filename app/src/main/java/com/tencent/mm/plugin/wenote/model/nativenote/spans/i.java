package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.b;

public final class i
  extends ArrowKeyMovementMethod
{
  private static i qsS;
  
  public static i caI()
  {
    if (qsS == null) {
      qsS = new i();
    }
    return qsS;
  }
  
  public final boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if ((i == 1) || (i == 0))
    {
      int m = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      int n = paramTextView.getTotalPaddingLeft();
      int k = paramTextView.getTotalPaddingTop();
      m = paramTextView.getScrollX() + (m - n);
      n = paramTextView.getScrollY();
      Object localObject = paramTextView.getLayout();
      j = ((Layout)localObject).getOffsetForHorizontal(((Layout)localObject).getLineForVertical(n + (j - k)), m);
      localObject = (k[])paramSpannable.getSpans(j, j + 1, k.class);
      if ((m < b.bZC()) && (localObject.length != 0) && (i == 0)) {
        localObject[0].a(paramTextView, paramSpannable, paramMotionEvent, localObject[0]);
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/spans/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */