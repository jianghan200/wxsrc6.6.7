package com.tencent.neattextview.textview.layout;

import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.LineBackgroundSpan;
import android.text.style.RelativeSizeSpan;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  implements a
{
  private static final TextPaint vaM = new TextPaint(1);
  private static Comparator<Integer> vaN = new Comparator() {};
  public int Tw;
  private float qsZ;
  public int tK;
  private b vaO;
  private char[] vaP;
  private int vaQ;
  private float vaR;
  private boolean vaS;
  private float vaT;
  private float vaU = -1.0F;
  private RectF vaV = new RectF();
  private LinkedList<Integer> vaW = null;
  private float[] vag;
  
  public c(b paramb, char[] paramArrayOfChar, int paramInt1, int paramInt2, float paramFloat1, float[] paramArrayOfFloat, float paramFloat2, float paramFloat3, float paramFloat4, TextPaint paramTextPaint, boolean paramBoolean, int paramInt3)
  {
    this.vaO = paramb;
    this.vaP = paramArrayOfChar;
    this.Tw = paramInt1;
    this.tK = paramInt2;
    this.vaQ = paramInt3;
    this.vag = paramArrayOfFloat;
    this.vaR = paramFloat4;
    this.vaS = paramBoolean;
    this.vaT = paramFloat3;
    this.qsZ = paramFloat2;
    paramb = paramTextPaint.getFontMetrics();
    paramFloat3 = paramb.leading;
    paramFloat4 = paramb.top;
    float f1 = paramb.bottom;
    float f2 = paramb.leading;
    paramFloat1 = (this.vaT - paramb.bottom + paramb.top) / 2.0F + paramFloat1 - paramb.top;
    this.vaV.set(0.0F, paramFloat1 - (paramFloat3 - paramFloat4), 0.0F + paramFloat2, paramFloat1 + (f1 - f2));
  }
  
  private boolean a(TextPaint paramTextPaint, int paramInt1, int paramInt2)
  {
    boolean bool2 = true;
    boolean bool1 = false;
    vaM.set(paramTextPaint);
    paramTextPaint = (AbsoluteSizeSpan)this.vaO.vav.fB(paramInt1, paramInt2);
    if (paramTextPaint != null)
    {
      paramTextPaint.updateDrawState(vaM);
      bool1 = true;
    }
    paramTextPaint = (RelativeSizeSpan)this.vaO.vaw.fB(paramInt1, paramInt2);
    if (paramTextPaint != null)
    {
      paramTextPaint.updateDrawState(vaM);
      bool1 = bool2;
    }
    for (;;)
    {
      paramTextPaint = (ForegroundColorSpan)this.vaO.vay.fB(paramInt1, paramInt2);
      if (paramTextPaint != null) {
        paramTextPaint.updateDrawState(vaM);
      }
      paramTextPaint = (ClickableSpan)this.vaO.vaz.fB(paramInt1, paramInt2);
      if (paramTextPaint != null) {
        paramTextPaint.updateDrawState(vaM);
      }
      return bool1;
    }
  }
  
  private void fA(int paramInt1, int paramInt2)
  {
    if (this.vaW == null)
    {
      this.vaW = new LinkedList();
      int[] arrayOfInt = b.a.cEk();
      int n = arrayOfInt.length;
      int i = 0;
      while (i < n)
      {
        int j = arrayOfInt[i];
        if (j != b.a.vaG)
        {
          Object localObject = this.vaO;
          int k;
          label127:
          LinkedList localLinkedList;
          switch (b.1.vaE[(j - 1)])
          {
          default: 
            localObject = null;
            boolean[] arrayOfBoolean = ((d)localObject).fC(paramInt1, paramInt2);
            int i1 = arrayOfBoolean.length;
            j = 0;
            k = 0;
            if (j >= i1) {
              break label307;
            }
            if (arrayOfBoolean[j] != 0)
            {
              localLinkedList = this.vaW;
              if (localObject.vbb[k] >= paramInt1) {
                break label281;
              }
              m = paramInt1;
              label163:
              localLinkedList.add(Integer.valueOf(m));
              localLinkedList = this.vaW;
              if (localObject.vbc[k] <= paramInt2) {
                break label294;
              }
            }
            break;
          }
          label281:
          label294:
          for (int m = paramInt2;; m = localObject.vbc[k])
          {
            localLinkedList.add(Integer.valueOf(m));
            k += 1;
            j += 1;
            break label127;
            localObject = ((b)localObject).vaz;
            break;
            localObject = ((b)localObject).vax;
            break;
            localObject = ((b)localObject).vau;
            break;
            localObject = ((b)localObject).vav;
            break;
            localObject = ((b)localObject).vaw;
            break;
            localObject = ((b)localObject).vay;
            break;
            m = localObject.vbb[k];
            break label163;
          }
        }
        label307:
        i += 1;
      }
      Collections.sort(this.vaW, vaN);
    }
  }
  
  private int getLength()
  {
    return this.tK - this.Tw;
  }
  
  public final void a(Canvas paramCanvas, TextPaint paramTextPaint, float paramFloat)
  {
    float f1 = 0.0F + cEf();
    Paint.FontMetrics localFontMetrics = paramTextPaint.getFontMetrics();
    float f2 = (this.vaT - localFontMetrics.bottom + localFontMetrics.top) / 2.0F + paramFloat - localFontMetrics.top;
    int j = this.Tw;
    int k = this.tK;
    Object localObject1 = this.vaO.vaA.vbb;
    Object localObject2 = this.vaO.vaA.vbc;
    LineBackgroundSpan[] arrayOfLineBackgroundSpan = (LineBackgroundSpan[])this.vaO.vaA.vba;
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < this.vaO.vaA.vaZ)
    {
      if ((localObject1[i] < k) && (localObject2[i] > j)) {
        localLinkedList.add(arrayOfLineBackgroundSpan[i]);
      }
      i += 1;
    }
    localObject1 = localLinkedList.iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((LineBackgroundSpan)((Iterator)localObject1).next()).drawBackground(paramCanvas, paramTextPaint, (int)this.vaV.left, (int)this.vaV.right, (int)this.vaV.top, (int)f2, (int)this.vaV.bottom, this.vaO.getText(), this.Tw, this.tK, this.vaQ);
    }
    float f3;
    if ((this.vaR != 0.0F) || (this.vaS))
    {
      j = this.Tw;
      i = this.Tw;
      f3 = f1;
      f1 = f2;
      f2 = f3;
      if (i < this.tK)
      {
        float f4;
        if (i + 1 < this.tK)
        {
          k = j;
          f4 = f2;
          f3 = f1;
          if (this.vag[(i + 1)] == 0.0F) {}
        }
        else
        {
          k = i + 1;
          localObject1 = (ImageSpan)this.vaO.vau.fB(j, k);
          if (localObject1 == null) {
            break label446;
          }
          vaM.set(paramTextPaint);
          ((ImageSpan)localObject1).draw(paramCanvas, "", j, k, f2, 0, (int)f1, (int)(this.vaT + paramFloat), vaM);
        }
        for (;;)
        {
          f4 = f2 + (this.vag[j] + this.vaR);
          f3 = f1;
          i += 1;
          j = k;
          f2 = f4;
          f1 = f3;
          break;
          label446:
          if (a(paramTextPaint, j, k)) {
            f1 = (this.vaT - localFontMetrics.bottom + localFontMetrics.top) / 2.0F + paramFloat - localFontMetrics.top;
          }
          paramCanvas.drawText(this.vaP, j, k - j, f2, f1, vaM);
        }
      }
    }
    else
    {
      fA(this.Tw, this.tK);
      i = this.Tw;
      localObject1 = this.vaW.iterator();
      f3 = f1;
      f1 = f2;
      f2 = f3;
      while (((Iterator)localObject1).hasNext())
      {
        j = ((Integer)((Iterator)localObject1).next()).intValue();
        if ((j > 0) && (i != j))
        {
          localObject2 = (ImageSpan)this.vaO.vau.fD(i, j);
          if (localObject2 != null)
          {
            vaM.set(paramTextPaint);
            ((ImageSpan)localObject2).draw(paramCanvas, "", i, j, f2, 0, (int)f1, (int)(this.vaT + paramFloat), vaM);
          }
          while (i < j)
          {
            f2 += this.vag[i];
            i += 1;
            continue;
            if (a(paramTextPaint, i, j)) {
              f1 = (this.vaT - localFontMetrics.bottom + localFontMetrics.top) / 2.0F + paramFloat - localFontMetrics.top;
            }
            paramCanvas.drawText(this.vaP, i, j - i, f2, f1, vaM);
          }
          i = j;
        }
      }
      if (i < this.Tw + getLength()) {
        if (!a(paramTextPaint, i, this.Tw + getLength())) {
          break label835;
        }
      }
    }
    label835:
    for (paramFloat = (this.vaT - localFontMetrics.bottom + localFontMetrics.top) / 2.0F + paramFloat - localFontMetrics.top;; paramFloat = f1)
    {
      paramCanvas.drawText(this.vaP, i, this.Tw + getLength() - i, f2, paramFloat, vaM);
      return;
    }
  }
  
  public final float[] cEb()
  {
    return this.vag;
  }
  
  public final RectF cEc()
  {
    return this.vaV;
  }
  
  public final float cEd()
  {
    return this.vaR;
  }
  
  public final boolean cEe()
  {
    return this.vaS;
  }
  
  public final float cEf()
  {
    if (this.vaU != -1.0F) {
      return this.vaU;
    }
    if ((this.vaO.vau.fB(this.Tw, this.Tw + 1) == null) && (this.vaO.cEj().containsKey(Character.valueOf(this.vaP[this.Tw]))))
    {
      float f = -((Float)this.vaO.cEj().get(Character.valueOf(this.vaP[this.Tw]))).floatValue();
      this.vaU = f;
      return f;
    }
    this.vaU = 0.0F;
    return this.vaU;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      if ((((a)paramObject).getStart() != this.Tw) || (((a)paramObject).getEnd() != this.tK) || (!((a)paramObject).cEc().equals(this.vaV)) || (((a)paramObject).cEe() != this.vaS) || (((a)paramObject).cEd() != this.vaR) || (((a)paramObject).cEf() != this.vaU)) {
        return false;
      }
      int i = this.Tw;
      while (i < this.tK)
      {
        if (this.vag[i] != paramObject.cEb()[i]) {
          return false;
        }
        i += 1;
      }
      return true;
    }
    return false;
  }
  
  public final RectF fz(int paramInt1, int paramInt2)
  {
    RectF localRectF = new RectF();
    if (paramInt1 >= paramInt2) {
      return localRectF;
    }
    float f1 = cEf();
    int i = this.Tw;
    while (i < paramInt1)
    {
      f1 += this.vag[i] + this.vaR;
      i += 1;
    }
    float f2 = f1;
    while (paramInt1 < paramInt2)
    {
      f2 += this.vag[paramInt1] + this.vaR;
      paramInt1 += 1;
    }
    localRectF.set(f1, this.vaV.top, f2, this.vaV.bottom);
    return localRectF;
  }
  
  public final int getEnd()
  {
    return this.tK;
  }
  
  public final float getHeight()
  {
    return this.vaT;
  }
  
  public final int getStart()
  {
    return this.Tw;
  }
  
  public final float getWidth()
  {
    return this.qsZ;
  }
  
  public final int hashCode()
  {
    return this.Tw + this.tK + (int)this.vaT + (int)this.qsZ + (int)this.vaU + this.vaV.hashCode();
  }
  
  public final String toString()
  {
    return "MeasuredLine{mStart=" + this.Tw + ", mEnd=" + this.tK + ", mLetter=" + this.vaR + ", isSmartLetter=" + this.vaS + ", mHeight=" + this.vaT + ", mWidth=" + this.qsZ + ", mLeftOffset=" + this.vaU + ", mLineRect=" + this.vaV + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/neattextview/textview/layout/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */