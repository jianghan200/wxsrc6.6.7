package com.tencent.mm.kiss.widget.textview;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.InputFilter.LengthFilter;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.style.MetricAffectingSpan;
import com.tencent.mm.sdk.platformtools.x;

public final class d
{
  private static e dtO = new e();
  private static final SpannableString dtP = new SpannableString("");
  CharSequence dtQ = null;
  CharSequence dtR = null;
  int dtS = 0;
  int dtT = 0;
  TextPaint dtU = null;
  Layout.Alignment dtV = Layout.Alignment.ALIGN_NORMAL;
  TextUtils.TruncateAt dtW = null;
  int dtX = -1;
  TextDirectionHeuristic dtY = null;
  float dtZ = 0.0F;
  float dua = 1.0F;
  boolean dub = false;
  InputFilter.LengthFilter duc = null;
  int gravity = 51;
  int maxLength = -1;
  int maxLines = Integer.MAX_VALUE;
  int width = 0;
  
  private StaticLayout a(CharSequence paramCharSequence, boolean paramBoolean, int paramInt)
  {
    if (paramBoolean) {
      return new StaticLayout(paramCharSequence, this.dtS, this.dtT, this.dtU, this.width, this.dtV, this.dua, this.dtZ, this.dub, this.dtW, paramInt);
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      if (this.dtY == null) {
        this.dtY = TextDirectionHeuristics.FIRSTSTRONG_LTR;
      }
      return com.tencent.mm.kiss.widget.textview.b.a.a(paramCharSequence, this.dtS, this.dtT, this.dtU, this.width, this.dtV, this.dtY, this.dua, this.dtZ, this.dub, this.dtW, paramInt, this.maxLines);
    }
    return com.tencent.mm.kiss.widget.textview.b.a.a(paramCharSequence, this.dtS, this.dtT, this.dtU, this.width, this.dtV, this.dua, this.dtZ, this.dub, this.dtW, paramInt, this.maxLines);
  }
  
  public static d a(CharSequence paramCharSequence, int paramInt, com.tencent.mm.kiss.widget.textview.a.a parama)
  {
    boolean bool = false;
    Object localObject1 = paramCharSequence;
    if (paramCharSequence == null) {
      localObject1 = "";
    }
    int i = ((CharSequence)localObject1).length();
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = "";
    }
    localObject1 = dtO.Fb();
    paramCharSequence = (CharSequence)localObject1;
    if (localObject1 == null) {
      paramCharSequence = new d();
    }
    paramCharSequence.dtQ = ((CharSequence)localObject2).toString();
    paramCharSequence.dtR = ((CharSequence)localObject2);
    paramCharSequence.dtS = 0;
    paramCharSequence.dtT = i;
    paramCharSequence.width = paramInt;
    paramCharSequence.dtU = new TextPaint();
    if (parama.maxLines != -1)
    {
      paramInt = parama.maxLines;
      if (paramInt >= 0) {
        paramCharSequence.maxLines = paramInt;
      }
    }
    if (parama.maxLength != -1)
    {
      paramInt = parama.maxLength;
      if (paramInt >= 0)
      {
        paramCharSequence.maxLength = paramInt;
        paramCharSequence.duc = new InputFilter.LengthFilter(paramCharSequence.maxLength);
      }
    }
    localObject1 = parama.dtV;
    if (localObject1 != null) {
      paramCharSequence.dtV = ((Layout.Alignment)localObject1);
    }
    if (parama.dtW != null)
    {
      localObject1 = parama.dtW;
      if (localObject1 != null) {
        paramCharSequence.dtW = ((TextUtils.TruncateAt)localObject1);
      }
    }
    paramCharSequence.gravity = parama.gravity;
    if (parama.duy != -1)
    {
      paramInt = parama.duy;
      if (paramInt >= 0) {
        paramCharSequence.dtX = paramInt;
      }
    }
    if (parama.dtY != null)
    {
      localObject1 = parama.dtY;
      if (Build.VERSION.SDK_INT >= 18) {
        paramCharSequence.dtY = ((TextDirectionHeuristic)localObject1);
      }
    }
    float f1 = parama.dtZ;
    float f2 = parama.dua;
    paramCharSequence.dtZ = f1;
    paramCharSequence.dua = f2;
    paramCharSequence.dub = parama.dub;
    if (parama.boi != null)
    {
      if (parama.fontStyle == -1) {
        break label533;
      }
      localObject1 = parama.boi;
      i = parama.fontStyle;
      if (i <= 0) {
        break label507;
      }
      if (localObject1 != null) {
        break label485;
      }
      localObject1 = Typeface.defaultFromStyle(i);
      paramCharSequence.b((Typeface)localObject1);
      if (localObject1 == null) {
        break label497;
      }
      paramInt = ((Typeface)localObject1).getStyle();
      label353:
      paramInt = (paramInt ^ 0xFFFFFFFF) & i;
      localObject1 = paramCharSequence.dtU;
      if ((paramInt & 0x1) != 0) {
        bool = true;
      }
      ((TextPaint)localObject1).setFakeBoldText(bool);
      localObject1 = paramCharSequence.dtU;
      if ((paramInt & 0x2) == 0) {
        break label502;
      }
      f1 = -0.25F;
      label397:
      ((TextPaint)localObject1).setTextSkewX(f1);
    }
    for (;;)
    {
      if (parama.duz != -1.0F)
      {
        f1 = parama.duz;
        paramCharSequence.dtU.setTextSize(f1);
      }
      if (parama.textColor != -1)
      {
        paramInt = parama.textColor;
        paramCharSequence.dtU.setColor(paramInt);
      }
      if (parama.linkColor != -1)
      {
        paramInt = parama.linkColor;
        paramCharSequence.dtU.linkColor = paramInt;
      }
      if (parama.dug != null) {
        paramCharSequence.dtU = parama.dug;
      }
      return paramCharSequence;
      label485:
      localObject1 = Typeface.create((Typeface)localObject1, i);
      break;
      label497:
      paramInt = 0;
      break label353;
      label502:
      f1 = 0.0F;
      break label397;
      label507:
      paramCharSequence.dtU.setFakeBoldText(false);
      paramCharSequence.dtU.setTextSkewX(0.0F);
      paramCharSequence.b((Typeface)localObject1);
      continue;
      label533:
      paramCharSequence.b(parama.boi);
    }
  }
  
  private d b(Typeface paramTypeface)
  {
    this.dtU.setTypeface(paramTypeface);
    return this;
  }
  
  @TargetApi(18)
  public final f Fa()
  {
    int j;
    Object localObject1;
    if ((this.dtW == null) || (this.dtX <= 0))
    {
      j = this.width;
      if ((this.dtW == null) && (this.maxLines == 1)) {
        this.dtW = TextUtils.TruncateAt.END;
      }
      if ((this.maxLength > 0) && (this.duc != null))
      {
        localObject1 = this.duc.filter(this.dtR, 0, this.dtR.length(), dtP, 0, 0);
        if (localObject1 != null)
        {
          this.dtR = ((CharSequence)localObject1);
          if (this.dtT > this.dtR.length()) {
            this.dtT = this.dtR.length();
          }
        }
      }
      if (h.DEBUG) {
        x.i("StaticTextView.StaticLayoutBuilder", "StaticLayoutWrapper build " + this.dtR + " " + this.width);
      }
      if (this.dtV == Layout.Alignment.ALIGN_NORMAL) {}
      switch (this.gravity & 0x800007)
      {
      default: 
        this.dtV = Layout.Alignment.ALIGN_NORMAL;
        label239:
        this.dtU.setAntiAlias(true);
        localObject1 = null;
        if (((this.dtY != null) && ((!com.tencent.mm.compatible.util.d.fR(18)) || (this.dtY != TextDirectionHeuristics.FIRSTSTRONG_LTR))) || ((this.maxLines != Integer.MAX_VALUE) && (this.maxLines != -1))) {
          break;
        }
      }
    }
    for (boolean bool = true;; bool = false)
    {
      try
      {
        localObject3 = a(this.dtR, bool, j);
        localObject1 = localObject3;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          Object localObject3;
          x.i("StaticTextView.StaticLayoutBuilder", "build static layout error: %s", new Object[] { localException2.getMessage() });
          int i = 0;
          if (i < 3)
          {
            int k = i;
            Object localObject4 = localObject1;
            try
            {
              SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(this.dtR);
              k = i;
              localObject4 = localObject1;
              MetricAffectingSpan[] arrayOfMetricAffectingSpan = (MetricAffectingSpan[])localSpannableStringBuilder.getSpans(0, localSpannableStringBuilder.length(), MetricAffectingSpan.class);
              if (arrayOfMetricAffectingSpan != null)
              {
                k = i;
                localObject4 = localObject1;
                if (arrayOfMetricAffectingSpan.length > 0)
                {
                  k = i;
                  localObject4 = localObject1;
                  localSpannableStringBuilder.insert(localSpannableStringBuilder.getSpanStart(arrayOfMetricAffectingSpan[0]) - 1, " ");
                  i += 1;
                }
              }
              for (;;)
              {
                k = i;
                localObject4 = localObject1;
                this.dtR = localSpannableStringBuilder;
                k = i;
                localObject4 = localObject1;
                localObject1 = a(this.dtR, bool, j);
                k = i;
                localObject4 = localObject1;
                x.i("StaticTextView.StaticLayoutBuilder", "fix from build static layout, fixCount: %s", new Object[] { Integer.valueOf(i) });
                break;
                i = 100;
              }
            }
            catch (Exception localException1)
            {
              x.i("StaticTextView.StaticLayoutBuilder", "fix, build static layout error: %s, fixCount: %s", new Object[] { localException1.getMessage(), Integer.valueOf(k) });
              i = k;
              Object localObject2 = localObject4;
            }
          }
        }
      }
      localObject3 = localObject1;
      if (localObject1 == null)
      {
        this.dtR = this.dtR.toString();
        localObject3 = a(this.dtR, bool, j);
      }
      localObject1 = new f((StaticLayout)localObject3);
      ((f)localObject1).duf = this.dtQ;
      ((f)localObject1).text = this.dtR;
      ((f)localObject1).maxLength = this.maxLength;
      ((f)localObject1).maxLines = this.maxLines;
      ((f)localObject1).dtV = this.dtV;
      ((f)localObject1).dtW = this.dtW;
      ((f)localObject1).dug = this.dtU;
      ((f)localObject1).gravity = this.gravity;
      dtO.a(this);
      return (f)localObject1;
      j = this.dtX;
      break;
      this.dtV = Layout.Alignment.ALIGN_NORMAL;
      break label239;
      this.dtV = Layout.Alignment.ALIGN_OPPOSITE;
      break label239;
      this.dtV = Layout.Alignment.ALIGN_CENTER;
      break label239;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */