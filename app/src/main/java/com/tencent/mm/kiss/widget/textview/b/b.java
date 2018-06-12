package com.tencent.mm.kiss.widget.textview.b;

import android.text.Layout;
import android.text.NoCopySpan.Concrete;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.mm.kiss.widget.textview.a;

public final class b
{
  private static b duD;
  private static Object duE = new NoCopySpan.Concrete();
  
  public static b Fg()
  {
    if (duD == null) {
      duD = new b();
    }
    return duD;
  }
  
  public static void a(Spannable paramSpannable)
  {
    Selection.removeSelection(paramSpannable);
    paramSpannable.removeSpan(duE);
  }
  
  public static boolean a(View paramView, Layout paramLayout, Spannable paramSpannable, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if (!(paramView instanceof a)) {
      return false;
    }
    paramView = (a)paramView;
    if ((i == 1) || (i == 0))
    {
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if ((j < paramView.getHorizontalDrawOffset()) || (j > paramLayout.getWidth() + paramView.getHorizontalDrawOffset())) {
        return false;
      }
      if ((k < paramView.getVerticalDrawOffset()) || (k > paramLayout.getHeight() + paramView.getVerticalDrawOffset())) {
        return false;
      }
      int m = paramView.getHorizontalDrawOffset();
      int n = paramView.getVerticalDrawOffset();
      int i1 = paramView.getScrollX();
      j = paramLayout.getOffsetForHorizontal(paramLayout.getLineForVertical(k - n + paramView.getScrollY()), j - m + i1);
      paramView = (ClickableSpan[])paramSpannable.getSpans(j, j, ClickableSpan.class);
      if (paramView.length != 0)
      {
        if (i == 1) {
          return true;
        }
        Selection.setSelection(paramSpannable, paramSpannable.getSpanStart(paramView[0]), paramSpannable.getSpanEnd(paramView[0]));
        return true;
      }
      Selection.removeSelection(paramSpannable);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */