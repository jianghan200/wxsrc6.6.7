package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class PLSysTextView
  extends SysTextView
{
  public PLSysTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PLSysTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (getLayoutWrapper() != null) {
      getLayoutWrapper().due = false;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public boolean onPreDraw()
  {
    return true;
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    if (bi.K(paramCharSequence)) {
      if (h.DEBUG) {
        x.d("MicroMsg.PLSysTextView", "set null text");
      }
    }
    for (;;)
    {
      return;
      long l = 0L;
      if (h.DEBUG) {
        l = System.currentTimeMillis();
      }
      if ((getLayoutWrapper() != null) && (getLayoutWrapper().due)) {
        c.dtC.a(getConfig(), getLayoutWrapper());
      }
      paramBufferType = c.dtC.a(getConfig(), paramCharSequence);
      if (paramBufferType != null) {
        setTextLayout(paramBufferType);
      }
      for (boolean bool = true; h.DEBUG; bool = false)
      {
        x.d("MicroMsg.PLSysTextView", "setText used %fms, hitCache: %b, hashCode: %d, text: %s", new Object[] { Double.valueOf((System.currentTimeMillis() - l) / 1000000.0D), Boolean.valueOf(bool), Integer.valueOf(hashCode()), paramCharSequence });
        return;
        super.setText$609c24db(paramCharSequence);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/PLSysTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */