package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class SnsTextView
  extends TextView
{
  private String kGl = "";
  private char obT = '\000';
  
  public SnsTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public int getBaseline()
  {
    try
    {
      int i = super.getBaseline();
      return i;
    }
    catch (Throwable localThrowable)
    {
      x.printErrStackTrace("MicroMsg.SnsTextView", localThrowable, "", new Object[0]);
    }
    return -1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      return;
    }
    catch (Throwable paramCanvas)
    {
      x.printErrStackTrace("MicroMsg.SnsTextView", paramCanvas, "", new Object[0]);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((q.deW.ddU == 1) || (q.deW.ddU == -1)) {
      try
      {
        super.onMeasure(paramInt1, paramInt2);
        this.obT = '\000';
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException1)
      {
        if (this.obT < '\003') {
          for (;;)
          {
            try
            {
              SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(getText());
              MetricAffectingSpan[] arrayOfMetricAffectingSpan = (MetricAffectingSpan[])localSpannableStringBuilder.getSpans(0, localSpannableStringBuilder.length(), MetricAffectingSpan.class);
              if ((arrayOfMetricAffectingSpan != null) && (arrayOfMetricAffectingSpan.length > 0))
              {
                localSpannableStringBuilder.insert(localSpannableStringBuilder.getSpanStart(arrayOfMetricAffectingSpan[0]) - 1, " ");
                this.obT = ((char)(this.obT + '\001'));
                setText(localSpannableStringBuilder);
                onMeasure(paramInt1, paramInt2);
                return;
              }
            }
            catch (IndexOutOfBoundsException localIndexOutOfBoundsException2)
            {
              x.i("MicroMsg.SnsTextView", "tryToFix error set origintext " + bi.oW(this.kGl));
              setText(this.kGl);
              onMeasure(paramInt1, paramInt2);
              this.obT = ((char)(this.obT + '\001'));
              return;
            }
            this.obT = 'd';
          }
        }
        if (this.obT == '\003')
        {
          x.i("MicroMsg.SnsTextView", "fix error set origintext " + bi.oW(this.kGl));
          setText(this.kGl);
          onMeasure(paramInt1, paramInt2);
          this.obT = ((char)(this.obT + '\001'));
          return;
        }
        throw localIndexOutOfBoundsException2;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public boolean onPreDraw()
  {
    try
    {
      boolean bool = super.onPreDraw();
      return bool;
    }
    catch (Throwable localThrowable) {}
    return true;
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    return super.onTextContextMenuItem(paramInt);
  }
  
  public void setOriginText(String paramString)
  {
    this.kGl = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */