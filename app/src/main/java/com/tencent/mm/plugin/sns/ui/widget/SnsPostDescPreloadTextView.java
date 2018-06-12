package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.kiss.widget.textview.PLTextView;
import com.tencent.mm.kiss.widget.textview.a.a;
import com.tencent.mm.kiss.widget.textview.c;
import com.tencent.mm.kiss.widget.textview.f;

public class SnsPostDescPreloadTextView
  extends PLTextView
{
  private static int hitCount = 0;
  private static int missCount = 0;
  private boolean onc = false;
  private int ond = 0;
  
  public SnsPostDescPreloadTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SnsPostDescPreloadTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private int getPostDescWidth()
  {
    if (this.ond > 0) {
      return this.ond;
    }
    return d.bEY().getViewWidth();
  }
  
  protected final a Fc()
  {
    this.onc = true;
    return d.bEY().getTextViewConfig();
  }
  
  protected final void n(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null) {
      setText(e.a(getContext(), paramCharSequence.toString(), getConfig().duz), true);
    }
    missCount += 1;
  }
  
  protected final void o(CharSequence paramCharSequence)
  {
    super.o(paramCharSequence);
    hitCount += 1;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setMaxLines(int paramInt)
  {
    int i = 1;
    if (getText() == null) {
      super.setMaxLines(paramInt);
    }
    if (paramInt <= 6)
    {
      if (!this.onc) {
        break label137;
      }
      setConfig(d.bEY().bEZ());
      this.onc = false;
      paramInt = i;
    }
    for (;;)
    {
      if (paramInt != 0)
      {
        f localf2 = c.dtC.a(getConfig(), getText());
        f localf1 = localf2;
        if (localf2 == null)
        {
          paramInt = getPostDescWidth();
          localf1 = localf2;
          if (paramInt > 0) {
            localf1 = com.tencent.mm.kiss.widget.textview.d.a(getText(), paramInt, getConfig()).Fa();
          }
        }
        if (localf1 != null) {
          setTextLayout(localf1);
        }
      }
      return;
      if (!this.onc)
      {
        setConfig(d.bEY().getTextViewConfig());
        this.onc = true;
        paramInt = i;
      }
      else
      {
        label137:
        paramInt = 0;
      }
    }
  }
  
  public void setSpecialWidth(int paramInt)
  {
    this.ond = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/widget/SnsPostDescPreloadTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */