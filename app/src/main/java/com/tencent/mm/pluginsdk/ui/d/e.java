package com.tencent.mm.pluginsdk.ui.d;

import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.kiss.widget.textview.StaticTextView;
import com.tencent.mm.sdk.platformtools.x;

public final class e
{
  private static int I(View paramView, int paramInt)
  {
    if ((paramView instanceof TextView))
    {
      if (((TextView)paramView).getLayout() == null) {
        return 0;
      }
      return ((TextView)paramView).getLayout().getLineEnd(paramInt);
    }
    if ((paramView instanceof StaticTextView))
    {
      if (((StaticTextView)paramView).getTvLayout() == null) {
        return 0;
      }
      return ((StaticTextView)paramView).getTvLayout().getLineEnd(paramInt);
    }
    return 0;
  }
  
  public static boolean a(View paramView, Spanned paramSpanned)
  {
    int i;
    if ((paramView != null) && (paramSpanned != null) && (((paramView instanceof TextView)) || ((paramView instanceof StaticTextView)))) {
      if ((paramView instanceof TextView)) {
        i = ((TextView)paramView).getLineCount();
      }
    }
    for (;;)
    {
      if ((i == 1) && (paramSpanned.length() > 500))
      {
        x.e("MicroMsg.InvalidTextCheck", "error black dot");
        return true;
        if ((paramView instanceof StaticTextView)) {
          i = ((StaticTextView)paramView).getLineCount();
        }
      }
      else
      {
        int j = 1;
        while (j < i)
        {
          if (I(paramView, j) - I(paramView, j - 1) > 500)
          {
            x.e("MicroMsg.InvalidTextCheck", "error black dot");
            return true;
          }
          j += 1;
        }
        return false;
      }
      i = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */