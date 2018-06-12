package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.kiss.widget.textview.PLTextView;
import com.tencent.mm.kiss.widget.textview.a.a;

public class SnsCommentPreloadTextView
  extends PLTextView
{
  private static a omZ = null;
  private static int ona = 0;
  
  public SnsCommentPreloadTextView(Context paramContext)
  {
    super(paramContext);
  }
  
  public SnsCommentPreloadTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SnsCommentPreloadTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public static a getTextViewConfig()
  {
    if (omZ == null) {
      omZ = b.bEX().getTextViewConfig();
    }
    return omZ;
  }
  
  public static int getViewWidth()
  {
    if (ona == 0) {
      ona = b.bEX().getViewWidth();
    }
    return ona;
  }
  
  protected final a Fc()
  {
    if (omZ == null) {
      omZ = b.bEX().getTextViewConfig();
    }
    return omZ;
  }
  
  protected final void n(CharSequence paramCharSequence)
  {
    super.n(paramCharSequence);
  }
  
  protected final void o(CharSequence paramCharSequence)
  {
    super.o(paramCharSequence);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/widget/SnsCommentPreloadTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */