package com.tencent.neattextview.textview.layout;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.LineBackgroundSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class b
{
  private static final char[] vac = { '…' };
  private static final String vad = new String(vac);
  protected TextPaint dG;
  protected CharSequence mText;
  private float qta;
  d<LineBackgroundSpan> vaA = new d(LineBackgroundSpan.class);
  private float vaB = 0.0F;
  public LinkedList<com.tencent.neattextview.textview.b.c> vaC;
  protected boolean[] vaD;
  protected String vae;
  protected char[] vaf;
  protected float[] vag;
  protected float[] vah;
  protected float[] vai = new float[com.tencent.neattextview.textview.a.a.uZY.length];
  protected float[] vaj = new float[com.tencent.neattextview.textview.a.a.uZZ.length];
  protected HashMap<Character, Float> vak = new HashMap(com.tencent.neattextview.textview.a.a.uZY.length);
  public ArrayList<a> val = new ArrayList();
  public LinkedList<com.tencent.neattextview.textview.b.b> vam = new LinkedList();
  private float van;
  private float vao;
  private float vap;
  private float vaq;
  private int var = 0;
  private TextPaint vas = new TextPaint();
  private float[] vat;
  d<ImageSpan> vau = new d(ImageSpan.class);
  d<AbsoluteSizeSpan> vav = new d(AbsoluteSizeSpan.class);
  d<RelativeSizeSpan> vaw = new d(RelativeSizeSpan.class);
  d<BackgroundColorSpan> vax = new d(BackgroundColorSpan.class);
  d<ForegroundColorSpan> vay = new d(ForegroundColorSpan.class);
  d<ClickableSpan> vaz = new d(ClickableSpan.class);
  
  public b(CharSequence paramCharSequence, float[] paramArrayOfFloat)
  {
    this.mText = paramCharSequence;
    this.vae = paramCharSequence.toString();
    this.vaf = this.vae.toCharArray();
    if (paramArrayOfFloat != null)
    {
      this.vag = new float[paramArrayOfFloat.length];
      System.arraycopy(paramArrayOfFloat, 0, this.vag, 0, paramArrayOfFloat.length);
    }
  }
  
  private void a(TextUtils.TruncateAt paramTruncateAt, TextPaint paramTextPaint)
  {
    int i;
    float f2;
    float f1;
    if ((paramTruncateAt != null) && (paramTruncateAt != TextUtils.TruncateAt.MARQUEE)) {
      if ((this.mText != null) && (this.val.size() > 0) && (this.mText.length() > ((a)this.val.get(this.val.size() - 1)).getEnd()))
      {
        i = 1;
        if (i == 0) {
          break label279;
        }
        f2 = paramTextPaint.measureText(vad);
        if ((this.var != 1) || (paramTruncateAt != TextUtils.TruncateAt.MIDDLE)) {
          break label220;
        }
        paramTruncateAt = (a)this.val.get(0);
        i = paramTruncateAt.getStart();
        f1 = 0.0F;
        label118:
        if (i >= paramTruncateAt.getEnd()) {
          break label214;
        }
        f1 += this.vag[i];
        if (f1 < this.qta / 2.0F) {
          break label205;
        }
      }
    }
    for (;;)
    {
      label150:
      f1 = 0.0F;
      for (;;)
      {
        if (i >= 0)
        {
          f1 += this.vag[i];
          if (f1 < f2)
          {
            this.vag[i] = 0.0F;
            this.vaf[i] = '\000';
            i -= 1;
            continue;
            i = 0;
            break;
            label205:
            i += 1;
            break label118;
            label214:
            i = 0;
            break label150;
            label220:
            if (paramTruncateAt != TextUtils.TruncateAt.END) {
              break label280;
            }
            i = ((a)this.val.get(this.val.size() - 1)).getEnd() - 1;
            break label150;
          }
        }
      }
      this.vag[i] = f2;
      this.vaf[i] = vac[0];
      label279:
      return;
      label280:
      i = 0;
    }
  }
  
  private void a(CharSequence paramCharSequence, TextPaint paramTextPaint, boolean[] paramArrayOfBoolean)
  {
    int k = 0;
    Object localObject;
    if ((paramCharSequence instanceof Spanned))
    {
      localObject = (Spanned)paramCharSequence;
      i = paramCharSequence.length();
      this.vau.a((Spanned)localObject, i);
      this.vav.a((Spanned)localObject, i);
      this.vaw.a((Spanned)localObject, i);
      this.vay.a((Spanned)localObject, i);
      this.vax.a((Spanned)localObject, i);
      this.vaz.a((Spanned)localObject, i);
      this.vaA.a((Spanned)localObject, i);
    }
    this.vas.set(paramTextPaint);
    int i = 0;
    int j;
    int m;
    int n;
    while (i < this.vav.vaZ)
    {
      ((AbsoluteSizeSpan[])this.vav.vba)[i].updateMeasureState(this.vas);
      j = this.vav.vbb[i];
      m = this.vav.vbc[i];
      n = m - j;
      paramTextPaint = new float[n];
      this.vas.getTextWidths(paramCharSequence, j, m, paramTextPaint);
      System.arraycopy(paramTextPaint, 0, this.vag, j, n);
      if (this.vah == null) {
        this.vah = new float[paramCharSequence.length()];
      }
      this.vah[j] = this.vas.getTextSize();
      i += 1;
    }
    i = 0;
    while (i < this.vaw.vaZ)
    {
      ((RelativeSizeSpan[])this.vaw.vba)[i].updateMeasureState(this.vas);
      j = this.vaw.vbb[i];
      m = this.vaw.vbc[i];
      n = m - j;
      paramTextPaint = new float[n];
      this.vas.getTextWidths(paramCharSequence, j, m, paramTextPaint);
      System.arraycopy(paramTextPaint, 0, this.vag, j, n);
      if (this.vah == null) {
        this.vah = new float[paramCharSequence.length()];
      }
      this.vah[j] = this.vas.getTextSize();
      i += 1;
    }
    i = 0;
    while (i < this.vau.vaZ)
    {
      paramTextPaint = ((ImageSpan[])this.vau.vba)[i];
      m = this.vau.vbb[i];
      n = this.vau.vbc[i];
      paramTextPaint = paramTextPaint.getDrawable();
      localObject = new Rect();
      if (paramTextPaint != null) {
        ((Rect)localObject).set(paramTextPaint.getBounds());
      }
      this.vag[m] = ((Rect)localObject).width();
      paramArrayOfBoolean[m] = true;
      j = m + 1;
      while (j < m + (n - m))
      {
        this.vag[j] = 0.0F;
        paramArrayOfBoolean[j] = true;
        j += 1;
      }
      if (this.vah == null) {
        this.vah = new float[paramCharSequence.length()];
      }
      this.vah[m] = ((Rect)localObject).height();
      i += 1;
    }
    i = 0;
    for (;;)
    {
      j = k;
      if (i >= this.vax.vaZ) {
        break;
      }
      paramCharSequence = ((BackgroundColorSpan[])this.vax.vba)[i];
      j = this.vax.vbb[i];
      m = this.vax.vbc[i];
      this.vam.add(new com.tencent.neattextview.textview.b.a(j, m, paramCharSequence));
      i += 1;
    }
    while (j < this.vaz.vaZ)
    {
      paramCharSequence = ((ClickableSpan[])this.vaz.vba)[j];
      i = this.vaz.vbb[j];
      k = this.vaz.vbc[j];
      this.vam.add(new com.tencent.neattextview.textview.b.c(i, k, paramCharSequence));
      j += 1;
    }
  }
  
  private void c(Paint paramPaint)
  {
    this.vak.clear();
    Rect localRect = new Rect();
    char[] arrayOfChar = com.tencent.neattextview.textview.a.a.uZY;
    int k = arrayOfChar.length;
    int i = 0;
    int j = 0;
    float f1;
    while (i < k)
    {
      char c = arrayOfChar[i];
      f1 = paramPaint.measureText(String.valueOf(c));
      paramPaint.getTextBounds(String.valueOf(c), 0, 1, localRect);
      float f2 = localRect.right;
      this.vai[j] = (f1 - f2);
      j += 1;
      i += 1;
    }
    arrayOfChar = com.tencent.neattextview.textview.a.a.uZZ;
    k = arrayOfChar.length;
    i = 0;
    j = 0;
    if (i < k)
    {
      paramPaint.getTextBounds(String.valueOf(arrayOfChar[i]), 0, 1, localRect);
      if (localRect.left > 0) {}
      for (f1 = localRect.left;; f1 = 0.0F)
      {
        this.vaj[j] = f1;
        this.vak.put(Character.valueOf(com.tencent.neattextview.textview.a.a.uZZ[j]), Float.valueOf(f1));
        j += 1;
        i += 1;
        break;
      }
    }
  }
  
  public final void a(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    paramCanvas.save();
    paramCanvas.translate(paramFloat1, paramFloat2);
    paramFloat1 = 0.0F;
    Iterator localIterator = this.vam.iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.neattextview.textview.b.b)localIterator.next()).a(paramCanvas, this.dG, this.val);
    }
    localIterator = this.val.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      locala.a(paramCanvas, this.dG, paramFloat1);
      paramFloat1 = locala.getHeight() + paramFloat1;
    }
    paramCanvas.restore();
  }
  
  public final void a(TextPaint paramTextPaint, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt, TextUtils.TruncateAt paramTruncateAt, boolean paramBoolean)
  {
    this.dG = new TextPaint(paramTextPaint);
    this.van = paramFloat2;
    this.qta = paramFloat1;
    this.vao = paramFloat3;
    this.vap = paramFloat4;
    this.var = paramInt;
    this.vaq = paramFloat5;
    this.vat = null;
    int i = this.mText.length();
    if (this.vag == null)
    {
      this.vag = new float[i];
      paramTextPaint.getTextWidths(this.vae, this.vag);
    }
    this.vaD = new boolean[i];
    a(this.mText, paramTextPaint, this.vaD);
    c(paramTextPaint);
    a(paramTextPaint, paramFloat1, paramInt, paramBoolean);
    a(paramTruncateAt, paramTextPaint);
  }
  
  protected abstract void a(TextPaint paramTextPaint, float paramFloat, int paramInt, boolean paramBoolean);
  
  protected final void a(char[] paramArrayOfChar, int paramInt1, int paramInt2, float paramFloat1, float[] paramArrayOfFloat, int paramInt3, float paramFloat2, boolean paramBoolean)
  {
    Paint.FontMetrics localFontMetrics = this.dG.getFontMetrics();
    float f1 = localFontMetrics.bottom - localFontMetrics.top;
    float f2 = f1;
    if (this.vah != null)
    {
      int i = paramInt1;
      for (;;)
      {
        f2 = f1;
        if (i >= paramInt2) {
          break;
        }
        f2 = f1;
        if (f1 < this.vah[i]) {
          f2 = this.vah[i];
        }
        i += 1;
        f1 = f2;
      }
    }
    f1 = f2 + this.vaq;
    paramArrayOfChar = new c(this, paramArrayOfChar, paramInt1, paramInt2, this.vaB, paramArrayOfFloat, paramFloat1, f1, paramFloat2, this.dG, paramBoolean, paramInt3);
    this.vaB += f1;
    this.val.add(paramArrayOfChar);
  }
  
  public int cEg()
  {
    return this.val.size();
  }
  
  public final float[] cEh()
  {
    if (this.vat == null)
    {
      Iterator localIterator = this.val.iterator();
      float f2 = 0.0F;
      float f1 = 0.0F;
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        float f3 = f2;
        if (f2 < locala.getWidth()) {
          f3 = locala.getWidth();
        }
        f1 = locala.getHeight() + f1;
        f2 = f3;
      }
      this.vat = new float[] { f2, f1 };
    }
    return this.vat;
  }
  
  public final TextPaint cEi()
  {
    return this.dG;
  }
  
  public final HashMap<Character, Float> cEj()
  {
    return this.vak;
  }
  
  public final CharSequence getText()
  {
    return this.mText;
  }
  
  public static enum a
  {
    public static int[] cEk()
    {
      return (int[])vaL.clone();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/neattextview/textview/layout/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */