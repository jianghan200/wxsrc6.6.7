package com.tencent.mm.ui.chatting.viewitems;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.mm.ui.base.a.a;

final class ay
  extends LinkMovementMethod
{
  private a ufO;
  
  private static a a(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    int k = paramTextView.getTotalPaddingLeft();
    int m = paramTextView.getTotalPaddingTop();
    int n = paramTextView.getScrollX();
    int i1 = paramTextView.getScrollY();
    paramTextView = paramTextView.getLayout();
    i = paramTextView.getOffsetForHorizontal(paramTextView.getLineForVertical(j - m + i1), i - k + n);
    paramTextView = (a[])paramSpannable.getSpans(i, i, a.class);
    if (paramTextView.length > 0) {
      return paramTextView[0];
    }
    return null;
  }
  
  public final boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      this.ufO = a(paramTextView, paramSpannable, paramMotionEvent);
      if (this.ufO != null)
      {
        this.ufO.kT(true);
        Selection.setSelection(paramSpannable, paramSpannable.getSpanStart(this.ufO), paramSpannable.getSpanEnd(this.ufO));
      }
    }
    do
    {
      return true;
      if (paramMotionEvent.getAction() != 2) {
        break;
      }
      paramTextView = a(paramTextView, paramSpannable, paramMotionEvent);
    } while ((this.ufO == null) || (paramTextView == this.ufO));
    this.ufO.kT(false);
    this.ufO = null;
    Selection.removeSelection(paramSpannable);
    return true;
    if (this.ufO != null)
    {
      this.ufO.kT(false);
      super.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
    }
    this.ufO = null;
    Selection.removeSelection(paramSpannable);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */