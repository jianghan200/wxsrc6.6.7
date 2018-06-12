package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.view.View;
import android.view.ViewGroup;

public final class f
{
  public static int a(ViewGroup paramViewGroup, float paramFloat1, float paramFloat2)
  {
    int i = paramViewGroup.getChildCount() - 1;
    while (i >= 0)
    {
      if (c(paramViewGroup.getChildAt(i), paramFloat1, paramFloat2)) {
        return i;
      }
      i -= 1;
    }
    return -1;
  }
  
  public static boolean c(View paramView, float paramFloat1, float paramFloat2)
  {
    return (paramFloat1 >= paramView.getLeft()) && (paramFloat1 <= paramView.getRight()) && (paramFloat2 >= paramView.getTop()) && (paramFloat2 <= paramView.getBottom());
  }
  
  public static float cP(View paramView)
  {
    return Math.abs((paramView.getRight() - paramView.getLeft()) / 2);
  }
  
  public static float cQ(View paramView)
  {
    return Math.abs((paramView.getBottom() - paramView.getTop()) / 2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/previewimageview/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */