package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.widget.ScrollView;
import com.tencent.mm.sdk.platformtools.x;

public class IPCallFeedbackScrollView
  extends ScrollView
{
  public IPCallFeedbackScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public IPCallFeedbackScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      Display localDisplay = ((Activity)getContext()).getWindowManager().getDefaultDisplay();
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      localDisplay.getMetrics(localDisplayMetrics);
      int i = View.MeasureSpec.makeMeasureSpec(localDisplayMetrics.heightPixels / 2, Integer.MIN_VALUE);
      paramInt2 = i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.IPCallFeedbackScrollView", localException, "", new Object[0]);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */