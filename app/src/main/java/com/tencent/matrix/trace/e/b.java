package com.tencent.matrix.trace.e;

import android.view.View;
import android.view.ViewGroup;

public final class b
{
  public static void a(a parama, int paramInt, View paramView)
  {
    if (paramView == null) {}
    for (;;)
    {
      return;
      int i = paramInt + 1;
      if (i > parama.buS) {
        parama.buS = i;
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int j = paramView.getChildCount();
        if (j > 0)
        {
          paramInt = 0;
          while (paramInt < j)
          {
            View localView = paramView.getChildAt(paramInt);
            if (localView.getVisibility() != 8)
            {
              parama.buR += 1;
              a(parama, i, localView);
            }
            paramInt += 1;
          }
        }
      }
    }
  }
  
  public static final class a
  {
    public int buR = 0;
    public int buS = 0;
    public String mActivityName = "";
    
    public final String toString()
    {
      return "ViewCount:" + this.buR + ",ViewDeep:" + this.buS + ",mActivityName:" + this.mActivityName;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */