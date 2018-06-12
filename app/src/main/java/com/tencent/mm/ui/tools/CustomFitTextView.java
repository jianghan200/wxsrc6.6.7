package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.e;
import java.util.Iterator;
import java.util.LinkedList;

public class CustomFitTextView
  extends TextView
{
  private boolean fbh = true;
  public int maxLines;
  private Paint uwK;
  private String uwL;
  private Rect uwM = new Rect();
  private LinkedList<String> uwN = new LinkedList();
  public int uwO;
  private Drawable uwP;
  public boolean uwQ;
  private int uwR = 0;
  
  public CustomFitTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CustomFitTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void abc(String paramString)
  {
    if ((this.uwN == null) || (paramString == null) || ("".equals(paramString))) {
      return;
    }
    this.uwN.add(paramString);
  }
  
  private int czH()
  {
    Paint.FontMetrics localFontMetrics = getPaint().getFontMetrics();
    float f1 = this.uwN.size();
    float f2 = localFontMetrics.bottom;
    float f3 = localFontMetrics.top;
    return (int)((localFontMetrics.leading + (f2 - f3)) * f1 + getPaddingTop() + getPaddingBottom()) + Math.max(0, this.uwN.size() - 1) * this.uwR;
  }
  
  private int d(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    if (paramInt2 <= paramInt1) {
      i = paramInt1 + 1;
    }
    do
    {
      return i;
      i = paramInt2;
    } while (getPaint().measureText(paramString, paramInt1, paramInt2) + paramInt3 < paramInt4);
    int j = paramString.length();
    for (;;)
    {
      i = paramInt2;
      if (getPaint().measureText(paramString, paramInt1, paramInt2) + paramInt3 <= paramInt4) {
        break;
      }
      paramInt2 = paramInt2 + paramInt1 >> 1;
    }
    while ((i <= j) && (getPaint().measureText(paramString, paramInt1, i) + paramInt3 < paramInt4)) {
      i += 1;
    }
    paramInt2 = Math.min(j, i) - 1;
    paramInt1 = paramInt2;
    while ((paramInt1 >= 0) && (bi.o(paramString.charAt(paramInt1)))) {
      paramInt1 -= 1;
    }
    if ((paramInt1 < 0) || (paramInt1 == paramInt2)) {
      return i - 1;
    }
    return paramInt1 + 1;
  }
  
  private boolean ds(String paramString, int paramInt)
  {
    int k;
    int n;
    int i1;
    int i;
    if ((this.fbh) && (paramInt > 0) && (paramString != null) && (!"".equals(paramString)))
    {
      this.uwN.clear();
      k = 0;
      n = paramString.length();
      i1 = paramInt - getPaddingLeft() - getPaddingRight();
      if (this.uwQ)
      {
        paramInt = this.uwP.getIntrinsicWidth();
        float f = getPaint().measureText(paramString, 0, n);
        f = paramInt + f;
        i = this.maxLines;
        if (Float.compare(f, this.maxLines * i1) >= 0) {
          break label230;
        }
        i = (int)Math.ceil(f / i1);
      }
    }
    label121:
    label230:
    for (;;)
    {
      int j = 0;
      if (j < i) {
        if (j == i - 1) {
          abc(paramString.substring(k, d(paramString, k, n, paramInt, i1)).trim());
        }
      }
      for (;;)
      {
        j += 1;
        break label121;
        paramInt = 0;
        break;
        int m = d(paramString, k, n, 0, i1);
        abc(paramString.substring(k, m).trim());
        if (m >= n)
        {
          x.w("MicroMsg.CustomFitTextView", "not match last line, but match text length end");
          return true;
          return false;
        }
        k = m;
      }
    }
  }
  
  public final void a(String paramString, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    this.maxLines = paramInt1;
    this.uwL = paramString;
    if (this.uwL == null)
    {
      x.w("MicroMsg.CustomFitTextView", "ori text is null");
      this.uwL = "";
    }
    if (this.maxLines <= 0)
    {
      x.w("MicroMsg.CustomFitTextView", "maxLines is invalid");
      this.maxLines = 2;
    }
    this.uwR = getResources().getDimensionPixelSize(a.e.BasicPaddingSize);
    this.uwQ = paramBoolean;
    this.uwO = paramInt2;
    if (this.uwQ) {
      this.uwP = getResources().getDrawable(this.uwO);
    }
    this.uwK = new Paint();
    this.uwK.set(getPaint());
    this.uwK.setAntiAlias(true);
    this.uwK.setColor(paramInt3);
    ds(this.uwL, getWidth());
    setHeight(Math.max(czH(), a.fromDPToPix(getContext(), 32)));
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (!this.fbh) {}
    Paint.FontMetrics localFontMetrics;
    float f2;
    float f1;
    do
    {
      do
      {
        return;
      } while ((this.uwL == null) || ("".equals(this.uwL)) || (this.uwN.size() == 0));
      localFontMetrics = getPaint().getFontMetrics();
      f2 = localFontMetrics.descent - localFontMetrics.ascent;
      float f3 = getPaddingLeft();
      f1 = getPaddingTop();
      Iterator localIterator = this.uwN.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        f1 = localFontMetrics.leading + f2 + f1;
        paramCanvas.drawText(str, f3, f1, this.uwK);
      }
    } while (!this.uwQ);
    getPaint().getTextBounds((String)this.uwN.getLast(), 0, ((String)this.uwN.getLast()).length(), this.uwM);
    int i = getPaddingLeft() + this.uwM.right;
    int j = this.uwP.getIntrinsicWidth();
    int k = (int)(f1 - f2 - localFontMetrics.leading);
    int m = this.uwP.getIntrinsicHeight();
    this.uwP.setBounds(i, k, j + i, m + k);
    this.uwP.draw(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = a.fromDPToPix(getContext(), 32);
    paramInt1 = paramInt2;
    if (ds(this.uwL, i)) {
      paramInt1 = Math.max(czH(), paramInt2);
    }
    setMeasuredDimension(i, paramInt1);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {}
    for (boolean bool = true;; bool = false)
    {
      this.fbh = bool;
      if (this.fbh) {
        ds(this.uwL, paramInt1);
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/tools/CustomFitTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */