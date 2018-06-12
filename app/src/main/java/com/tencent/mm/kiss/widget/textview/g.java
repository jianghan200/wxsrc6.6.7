package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.mm.kiss.widget.textview.a.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class g
{
  protected f duj;
  public a duk;
  protected StaticLayout dul;
  protected boolean dum = false;
  int dun;
  int duo;
  private boolean dup = false;
  boolean duq = false;
  boolean dur = false;
  private boolean dus = false;
  private View dut;
  private int duu = 0;
  private int duv = 0;
  protected CharSequence text = null;
  
  public g(View paramView, a parama)
  {
    this.dut = paramView;
    this.duk = parama;
  }
  
  private boolean gL(int paramInt)
  {
    if ((this.dum) || (this.duj == null) || (this.dul == null))
    {
      if (this.duk == null) {
        return false;
      }
      if (paramInt > 0)
      {
        Fd();
        long l1 = 0L;
        if (h.DEBUG) {
          l1 = System.nanoTime();
        }
        this.duj = d.a(this.text, paramInt, this.duk).Fa();
        this.dul = this.duj.duh;
        this.dum = false;
        if (h.DEBUG)
        {
          long l2 = System.nanoTime();
          x.d("MicroMsg.StaticTextViewHolder", "recreateLayoutIfNeed, width: %d, hasCode: %d, used: %fms, text: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(hashCode()), Double.valueOf((l2 - l1) / 1000000.0D), this.text });
        }
        return true;
      }
    }
    return false;
  }
  
  final void Fd()
  {
    this.duv = 0;
    this.duu = 0;
    this.dun = 0;
    this.duo = 0;
  }
  
  public final Point aX(int paramInt1, int paramInt2)
  {
    long l = 0L;
    if (h.DEBUG) {
      l = System.nanoTime();
    }
    int n = View.MeasureSpec.getMode(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    gL(i);
    if (this.dul != null) {
      if (n == 1073741824) {
        paramInt1 = i;
      }
    }
    for (;;)
    {
      if (m == 1073741824) {
        paramInt2 = j;
      }
      Object localObject1;
      Object localObject2;
      for (;;)
      {
        localObject1 = new Point(paramInt1, paramInt2);
        if (h.DEBUG)
        {
          double d = (System.nanoTime() - l) / 1000000.0D;
          paramInt1 = hashCode();
          CharSequence localCharSequence = this.text;
          if (localObject1 != null) {
            break label588;
          }
          localObject2 = "";
          label121:
          x.d("MicroMsg.StaticTextViewHolder", "onMeasure used: %fms, hashCode: %d, text: %s result: %s", new Object[] { Double.valueOf(d), Integer.valueOf(paramInt1), localCharSequence, localObject2 });
        }
        return (Point)localObject1;
        paramInt1 = 0;
        if (this.duk.dtW == null)
        {
          localObject1 = this.dul;
          if (this.duu == 0) {
            break label283;
          }
          paramInt1 = this.duu;
        }
        for (;;)
        {
          k = (int)Math.ceil(Layout.getDesiredWidth(this.dul.getText(), this.dul.getPaint()));
          paramInt2 = paramInt1;
          if (k > paramInt1) {
            paramInt2 = k;
          }
          if (h.DEBUG) {
            x.d("MicroMsg.StaticTextViewHolder", "onMeasure  hashCode: %d, des: %d newdes: %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt2), Integer.valueOf(k) });
          }
          if (n != Integer.MIN_VALUE) {
            break label604;
          }
          paramInt1 = Math.min(i, paramInt2);
          break;
          label283:
          paramInt2 = ((Layout)localObject1).getLineCount();
          localObject2 = ((Layout)localObject1).getText();
          float f = 0.0F;
          paramInt1 = 0;
          for (;;)
          {
            if (paramInt1 >= paramInt2 - 1) {
              break label340;
            }
            if (((CharSequence)localObject2).charAt(((Layout)localObject1).getLineEnd(paramInt1) - 1) != '\n')
            {
              paramInt1 = -1;
              break;
            }
            paramInt1 += 1;
          }
          label340:
          paramInt1 = 0;
          while (paramInt1 < paramInt2)
          {
            f = Math.max(f, ((Layout)localObject1).getLineWidth(paramInt1));
            paramInt1 += 1;
          }
          this.duu = ((int)Math.ceil(f));
          this.duu += this.dut.getPaddingLeft() + this.dut.getPaddingRight();
          paramInt1 = this.duu;
        }
        localObject1 = this.dul;
        if (this.duv == 0) {
          break label450;
        }
        i = this.duv;
        label429:
        paramInt2 = i;
        if (m == Integer.MIN_VALUE) {
          paramInt2 = Math.min(i, j);
        }
      }
      label450:
      i = ((Layout)localObject1).getLineCount();
      paramInt2 = i;
      if (this.duj.maxLines > 0)
      {
        paramInt2 = i;
        if (this.duj.maxLines < i) {
          paramInt2 = this.duj.maxLines;
        }
      }
      int k = this.dut.getPaddingTop();
      n = this.dut.getPaddingBottom();
      i = ((Layout)localObject1).getLineTop(paramInt2);
      int i1;
      if ((this.duk.minLines > 0) && (paramInt2 < this.duk.minLines)) {
        i1 = getLineHeight();
      }
      for (paramInt2 = (this.duk.minLines - paramInt2) * i1 + i;; paramInt2 = i)
      {
        this.duv = (paramInt2 + (k + n));
        i = this.duv;
        break label429;
        localObject1 = null;
        break;
        label588:
        localObject2 = ((Point)localObject1).toString();
        break label121;
      }
      label604:
      paramInt1 = paramInt2;
    }
  }
  
  public final f getLayoutWrapper()
  {
    return this.duj;
  }
  
  public final int getLineCount()
  {
    if (this.dul == null) {
      return 0;
    }
    return this.dul.getLineCount();
  }
  
  public final int getLineHeight()
  {
    TextPaint localTextPaint2 = this.duj.duh.getPaint();
    TextPaint localTextPaint1 = localTextPaint2;
    if (localTextPaint2 == null) {
      localTextPaint1 = this.duk.dug;
    }
    return Math.round(localTextPaint1.getFontMetricsInt(null) * this.duk.dua + this.duk.dtZ);
  }
  
  public final int getMaxLines()
  {
    if (this.duk != null) {
      return this.duk.maxLines;
    }
    return -1;
  }
  
  public final int getSelectionEnd()
  {
    if (this.text == null) {
      return -1;
    }
    return Selection.getSelectionEnd(this.text);
  }
  
  public final int getSelectionStart()
  {
    if (this.text == null) {
      return -1;
    }
    return Selection.getSelectionStart(this.text);
  }
  
  public final CharSequence getText()
  {
    return this.text;
  }
  
  public final int getTextColor()
  {
    if (this.duj == null)
    {
      if (this.duk != null) {
        return this.duk.textColor;
      }
      return 0;
    }
    return this.duj.dug.getColor();
  }
  
  public final float getTextSize()
  {
    if (this.duj == null)
    {
      if (this.duk != null) {
        return this.duk.duz;
      }
      return 0.0F;
    }
    return this.duj.dug.getTextSize();
  }
  
  public final Layout getTvLayout()
  {
    return this.dul;
  }
  
  public final void init()
  {
    this.text = "";
    this.dut.setWillNotDraw(false);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    if ((this.dul == null) || (this.duj == null))
    {
      boolean bool = gL(this.dut.getMeasuredWidth());
      if (h.DEBUG) {
        x.d("MicroMsg.StaticTextViewHolder", "onDraw, textLayout==null:%b, layoutWrapper==null:%b recreate:%b", new Object[] { this.dul, this.duj, Boolean.valueOf(bool) });
      }
      if (bool)
      {
        this.dut.requestLayout();
        this.dut.invalidate();
      }
    }
    long l;
    int k;
    int m;
    int n;
    int i1;
    int j;
    int i;
    int i2;
    int i3;
    do
    {
      return;
      l = 0L;
      if (h.DEBUG) {
        l = System.nanoTime();
      }
      paramCanvas.save();
      k = this.dut.getPaddingLeft();
      m = this.dut.getPaddingTop();
      n = this.dut.getRight() - this.dut.getLeft() - this.dut.getPaddingRight();
      i1 = this.dut.getBottom() - this.dut.getTop() - this.dut.getPaddingBottom();
      paramCanvas.clipRect(k, m, n, i1);
      if ((this.dun == 0) || (this.duo == 0))
      {
        j = this.dut.getPaddingLeft();
        i = this.dut.getRight() - this.dut.getLeft() - this.dut.getPaddingLeft() - this.dut.getPaddingRight();
        i2 = this.dul.getWidth();
        if (i2 <= i) {
          break;
        }
        i = j;
        this.dun = i;
        j = this.dut.getPaddingTop();
        i2 = this.dut.getBottom() - this.dut.getTop() - this.dut.getPaddingTop() - this.dut.getPaddingBottom();
        i = 0;
        i3 = this.dul.getHeight();
        if (i3 <= i2) {
          break label550;
        }
        i = j;
        this.duo = i;
      }
      paramCanvas.translate(this.dun, this.duo);
      this.dul.draw(paramCanvas, null, null, 0);
      paramCanvas.restore();
    } while (!h.DEBUG);
    x.d("MicroMsg.StaticTextViewHolder", "onDraw used: %fms, hashCode: %d, text: %s clipLeft:%d clipTop:%d clipRight:%d clipBottom:%d", new Object[] { Double.valueOf((System.nanoTime() - l) / 1000000.0D), Integer.valueOf(hashCode()), this.text, Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1) });
    return;
    switch (this.duj.gravity & 0x800007)
    {
    default: 
      i = 0;
    }
    for (;;)
    {
      i += j;
      break;
      i = 0;
      continue;
      i = i / 2 - i2 / 2;
      continue;
      i -= i2;
    }
    label550:
    switch (this.duj.gravity & 0x70)
    {
    }
    for (;;)
    {
      i += j;
      break;
      i = 0;
      continue;
      i = i2 / 2 - i3 / 2;
      continue;
      i = i2 - i3;
    }
  }
  
  public final boolean performClick()
  {
    return (!this.dus) && (this.duq);
  }
  
  public final void setGravity(int paramInt)
  {
    if ((this.duk != null) && (paramInt != this.duk.gravity))
    {
      this.duk.gravity = paramInt;
      this.dum = true;
      if (h.DEBUG) {
        x.i("MicroMsg.StaticTextViewHolder", "setGravity isNeedRecreateLayout");
      }
    }
  }
  
  public final void setLines(int paramInt)
  {
    if ((this.duk.maxLines != paramInt) || (this.duk.minLines != paramInt))
    {
      this.dum = true;
      Fd();
      this.duk.maxLines = paramInt;
      this.duk.minLines = paramInt;
      this.dut.requestLayout();
      this.dut.invalidate();
      if (h.DEBUG) {
        x.i("MicroMsg.StaticTextViewHolder", "setLines isNeedRecreateLayout");
      }
    }
  }
  
  public final void setMaxLines(int paramInt)
  {
    if ((this.duk != null) && (paramInt != this.duk.maxLines))
    {
      this.duk.maxLines = paramInt;
      this.dum = true;
      Fd();
      if (h.DEBUG) {
        x.i("MicroMsg.StaticTextViewHolder", "setMaxLines isNeedRecreateLayout");
      }
      this.dut.requestLayout();
      this.dut.invalidate();
    }
  }
  
  public final void setMinLines(int paramInt)
  {
    if (this.duk.minLines != paramInt)
    {
      this.duk.minLines = paramInt;
      Fd();
      this.dut.requestLayout();
      this.dut.invalidate();
    }
  }
  
  public final void setSingleLine(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = Integer.MAX_VALUE)
    {
      if (this.duk.maxLines != i)
      {
        this.duk.maxLines = i;
        this.dum = true;
        Fd();
        this.dut.requestLayout();
        this.dut.invalidate();
      }
      return;
    }
  }
  
  public final void setText(CharSequence paramCharSequence, boolean paramBoolean)
  {
    if (paramCharSequence == null) {}
    do
    {
      do
      {
        return;
      } while ((this.text != null) && (this.text.equals(paramCharSequence)) && (!paramBoolean));
      this.text = paramCharSequence;
      this.dum = true;
      this.dut.requestLayout();
      this.dut.invalidate();
    } while (!h.DEBUG);
    x.i("MicroMsg.StaticTextViewHolder", "setText isNeedRecreateLayout " + paramCharSequence + " hashcode " + hashCode() + " " + bi.cjd().toString());
  }
  
  public final void setTextColor(int paramInt)
  {
    if ((this.duk != null) && (paramInt != this.duk.textColor))
    {
      this.duk.textColor = paramInt;
      this.dum = true;
      if (h.DEBUG) {
        x.i("MicroMsg.StaticTextViewHolder", "setTextColor isNeedRecreateLayout");
      }
    }
  }
  
  public final void setTextLayout(f paramf)
  {
    if ((paramf == null) || (paramf.duh == null))
    {
      this.duj = null;
      return;
    }
    if (this.duk == null)
    {
      com.tencent.mm.kiss.widget.textview.a.b localb = new com.tencent.mm.kiss.widget.textview.a.b();
      localb.duk = new a();
      localb.duk.maxLines = paramf.maxLines;
      localb.duk.maxLength = paramf.maxLength;
      localb.duk.dug = paramf.dug;
      localb.duk.dtV = paramf.dtV;
      localb.duk.dtW = paramf.dtW;
      localb.duk.gravity = paramf.gravity;
      localb.duk.duz = paramf.dug.getTextSize();
      localb.duk.textColor = paramf.dug.getColor();
      this.duk = localb.duk;
    }
    Fd();
    this.dut.setWillNotDraw(false);
    this.duj = paramf;
    this.dul = paramf.duh;
    this.text = paramf.text;
    this.dup = (this.text instanceof Spannable);
    if (this.dup)
    {
      this.text = this.duj.text;
      com.tencent.mm.kiss.widget.textview.b.b.Fg();
      com.tencent.mm.kiss.widget.textview.b.b.a((Spannable)this.text);
    }
    this.dut.requestLayout();
    this.dut.invalidate();
  }
  
  public final void setTextSize(int paramInt, float paramFloat)
  {
    Object localObject = ad.getContext();
    if (localObject == null) {}
    for (localObject = Resources.getSystem();; localObject = ((Context)localObject).getResources())
    {
      paramFloat = TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics());
      if ((paramFloat != 0.0F) && (this.duk != null) && (paramFloat != this.duk.duz))
      {
        this.duk.duz = paramFloat;
        this.dum = true;
        if (h.DEBUG) {
          x.i("MicroMsg.StaticTextViewHolder", "setRawTextSize isNeedRecreateLayout");
        }
      }
      return;
    }
  }
  
  public final boolean v(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    int i;
    boolean bool1;
    float f2;
    if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
    {
      i = 1;
      bool1 = bool2;
      if (this.dut.isEnabled())
      {
        bool1 = bool2;
        if (this.dup)
        {
          com.tencent.mm.kiss.widget.textview.b.b.Fg();
          bool1 = com.tencent.mm.kiss.widget.textview.b.b.a(this.dut, this.dul, (Spannable)this.text, paramMotionEvent);
          this.dus = bool1;
          if ((!this.dur) || (i == 0)) {
            break label238;
          }
          float f1 = paramMotionEvent.getX();
          f2 = paramMotionEvent.getY();
          if ((f1 >= this.dun) && (f1 <= this.dul.getWidth() + this.dun)) {
            break label198;
          }
          i = 0;
        }
      }
    }
    for (;;)
    {
      if (i == 0) {
        break label238;
      }
      paramMotionEvent = (ClickableSpan[])((Spannable)this.text).getSpans(getSelectionStart(), getSelectionEnd(), ClickableSpan.class);
      if (paramMotionEvent.length <= 0) {
        break label238;
      }
      x.d("MicroMsg.StaticTextViewHolder", "perform clickable span click");
      paramMotionEvent[0].onClick(this.dut);
      bool1 = true;
      return bool1;
      i = 0;
      break;
      label198:
      if ((f2 < this.duo) || (f2 > this.dul.getHeight() + this.duo)) {
        i = 0;
      } else {
        i = 1;
      }
    }
    label238:
    return bool1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */