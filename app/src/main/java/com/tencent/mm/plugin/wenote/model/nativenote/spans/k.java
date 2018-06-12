package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.plugin.wenote.model.a.h;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public class k
  implements LeadingMarginSpan, f<Boolean>, g<Boolean>
{
  private int qsP;
  public boolean qsQ;
  public boolean qsT = false;
  public boolean qsU = false;
  public boolean qsV = false;
  public boolean qsW = false;
  private WeakReference<Drawable> qsX;
  
  public k(boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    this.qsP = paramInt;
    boolean bool1 = bool2;
    if (paramBoolean2)
    {
      bool1 = bool2;
      if (paramBoolean4)
      {
        bool1 = bool2;
        if (!paramBoolean3) {
          bool1 = true;
        }
      }
    }
    this.qsQ = bool1;
    this.qsW = paramBoolean1;
    this.qsT = paramBoolean3;
    this.qsU = paramBoolean4;
    this.qsV = paramBoolean2;
  }
  
  private k caJ()
  {
    return new k(this.qsW, this.qsP, this.qsV, this.qsT, this.qsU);
  }
  
  public final void a(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent, k paramk)
  {
    if (paramMotionEvent.getX() > this.qsP)
    {
      x.e("MicroMsg.NoteTodoSpan", "x > mGapWidth");
      return;
    }
    int i = paramSpannable.getSpanStart(paramk);
    int j = paramSpannable.getSpanEnd(paramk);
    if (this.qsW)
    {
      paramMotionEvent = "true";
      label51:
      x.i("MicroMsg.NoteTodoSpan", "current mIsTodoCheck: %s", new Object[] { paramMotionEvent });
      paramSpannable.removeSpan(this);
      if (this.qsW) {
        break label158;
      }
    }
    label158:
    for (boolean bool = true;; bool = false)
    {
      this.qsW = bool;
      paramSpannable.setSpan(caJ(), i, j, 33);
      paramTextView = (WXRTEditText)paramTextView;
      if (paramTextView.getEditTextType() != 0) {
        break;
      }
      paramTextView = c.bZD().Bv(paramTextView.getRecyclerItemPosition());
      if ((paramTextView == null) || (paramTextView.getType() != 1)) {
        break;
      }
      ((h)paramTextView).content = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(paramSpannable);
      return;
      paramMotionEvent = "false";
      break label51;
    }
  }
  
  public void drawLeadingMargin(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, boolean paramBoolean, Layout paramLayout)
  {
    paramCharSequence = (Spanned)paramCharSequence;
    if ((!this.qsQ) && (paramCharSequence.getSpanStart(this) == paramInt6))
    {
      paramLayout = this.qsX;
      paramCharSequence = null;
      if (paramLayout != null) {
        paramCharSequence = (Drawable)paramLayout.get();
      }
      paramLayout = paramCharSequence;
      if (paramCharSequence == null) {
        if (!this.qsW) {
          break label101;
        }
      }
    }
    label101:
    for (paramCharSequence = a.f(ad.getContext(), R.g.note_select_press);; paramCharSequence = a.f(ad.getContext(), R.g.note_select_unpress))
    {
      this.qsX = new WeakReference(paramCharSequence);
      paramLayout = paramCharSequence;
      if (paramLayout != null) {
        break;
      }
      return;
    }
    paramLayout.setBounds(0, 0, paramLayout.getIntrinsicWidth(), paramLayout.getIntrinsicHeight());
    paramCanvas.save();
    paramPaint = paramPaint.getFontMetricsInt();
    paramInt1 = paramPaint.descent;
    paramCanvas.translate(0.0F, (paramPaint.ascent + (paramInt1 + paramInt4 + paramInt4)) / 2 - paramLayout.getBounds().bottom / 2);
    paramLayout.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  public int getLeadingMargin(boolean paramBoolean)
  {
    if (this.qsQ) {
      return 0;
    }
    return this.qsP;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/spans/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */