package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class PLTextView
  extends StaticTextView
{
  private static long dtE = 0L;
  private static int dtF = 0;
  private static long dtG = -2147483648L;
  private static long dtH = 0L;
  private static int dtI = 0;
  private static long dtJ = -2147483648L;
  private static long dtK = 0L;
  private static int dtL = 0;
  private static long dtM = -2147483648L;
  private static boolean dtN = false;
  
  public PLTextView(Context paramContext)
  {
    super(paramContext);
  }
  
  public PLTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PLTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void n(CharSequence paramCharSequence)
  {
    super.setText(paramCharSequence, false);
  }
  
  public void o(CharSequence paramCharSequence) {}
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (getLayoutWrapper() != null) {
      getLayoutWrapper().due = false;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    long l = 0L;
    if (dtN) {
      l = System.currentTimeMillis();
    }
    super.onDraw(paramCanvas);
    if (dtN)
    {
      l = System.currentTimeMillis() - l;
      dtK += l;
      dtL += 1;
      if (l > dtM) {
        dtM = l;
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    long l = 0L;
    if (dtN) {
      l = System.currentTimeMillis();
    }
    super.onMeasure(paramInt1, paramInt2);
    if (dtN)
    {
      l = System.currentTimeMillis() - l;
      dtH += l;
      dtI += 1;
      if (l > dtJ) {
        dtJ = l;
      }
    }
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    long l2 = 0L;
    if (bi.K(paramCharSequence))
    {
      if (h.DEBUG) {
        x.d("MicroMsg.PLTextView", "set null text");
      }
      return;
    }
    if (h.DEBUG) {}
    for (long l1 = System.currentTimeMillis();; l1 = 0L)
    {
      if ((getLayoutWrapper() != null) && (getLayoutWrapper().due)) {
        c.dtC.a(getConfig(), getLayoutWrapper());
      }
      f localf = c.dtC.a(getConfig(), paramCharSequence);
      if (localf != null)
      {
        o(paramCharSequence);
        setTextLayout(localf);
      }
      for (boolean bool = true;; bool = false)
      {
        if (h.DEBUG)
        {
          l2 = System.currentTimeMillis();
          x.d("MicroMsg.PLTextView", "setText used %fms, hitCache: %b, hashCode: %d, text: %s hitCache %s", new Object[] { Double.valueOf((l2 - l1) / 1000000.0D), Boolean.valueOf(bool), Integer.valueOf(hashCode()), paramCharSequence, Boolean.valueOf(bool) });
        }
        if (!dtN) {
          break;
        }
        l1 = l2 - l1;
        dtE += l1;
        dtF += 1;
        if (l1 <= dtG) {
          break;
        }
        dtG = l1;
        return;
        n(paramCharSequence);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/PLTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */