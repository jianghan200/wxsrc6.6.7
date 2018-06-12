package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.NoCopySpan;
import android.text.Spannable;
import android.widget.TextView;

final class ae
{
  static a[] d(TextView paramTextView)
  {
    int i = 0;
    Spannable localSpannable = null;
    Object localObject = localSpannable;
    if (paramTextView != null)
    {
      localObject = localSpannable;
      if ((paramTextView.getText() instanceof Spannable))
      {
        localSpannable = (Spannable)paramTextView.getText();
        paramTextView = (a[])localSpannable.getSpans(0, localSpannable.length(), a.class);
        int j = paramTextView.length;
        for (;;)
        {
          localObject = paramTextView;
          if (i >= j) {
            break;
          }
          localSpannable.removeSpan(paramTextView[i]);
          i += 1;
        }
      }
    }
    return (a[])localObject;
  }
  
  private static class a
    implements NoCopySpan
  {
    public float Yr;
    public float Ys;
    public int gJn;
    public int gJo;
    public boolean gJp;
    public boolean gJq;
    public boolean gJr;
    @Deprecated
    public boolean gJs;
    
    public a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
    {
      this.Yr = paramFloat1;
      this.Ys = paramFloat2;
      this.gJn = paramInt1;
      this.gJo = paramInt2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */