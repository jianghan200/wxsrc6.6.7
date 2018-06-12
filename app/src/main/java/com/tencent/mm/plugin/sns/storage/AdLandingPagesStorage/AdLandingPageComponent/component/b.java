package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.c;
import com.tencent.mm.sdk.platformtools.x;

public abstract class b
  extends i
{
  public b(Context paramContext, c paramc, ViewGroup paramViewGroup)
  {
    super(paramContext, paramc, paramViewGroup);
  }
  
  protected final void a(LinearLayout paramLinearLayout)
  {
    Object localObject = (c)this.nDt;
    if (paramLinearLayout == null) {
      return;
    }
    int i = Double.compare(((c)localObject).nAh, ((c)localObject).nAi);
    int m = (int)((c)localObject).nAh;
    int n = (int)((c)localObject).nAi;
    int k;
    if (i == 0)
    {
      k = n;
      i = m;
      if (m == 0)
      {
        k = 1;
        i = 1;
      }
    }
    for (;;)
    {
      x.i("AdLandingBorderedComp", "border width top %d,bottom %d", new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
      if (i > 0)
      {
        localLinearLayout = new LinearLayout(paramLinearLayout.getContext());
        localLinearLayout.setBackgroundColor(((c)localObject).fTL);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, i);
        localLayoutParams.gravity = 48;
        paramLinearLayout.addView(localLinearLayout, 0, localLayoutParams);
      }
      if (k <= 0) {
        break;
      }
      LinearLayout localLinearLayout = new LinearLayout(paramLinearLayout.getContext());
      localLinearLayout.setBackgroundColor(((c)localObject).fTL);
      localObject = new LinearLayout.LayoutParams(-1, k);
      ((LinearLayout.LayoutParams)localObject).gravity = 80;
      paramLinearLayout.addView(localLinearLayout, (ViewGroup.LayoutParams)localObject);
      return;
      int j = m;
      if (m == 0)
      {
        j = m;
        if (((c)localObject).nAh != 0.0D) {
          j = 1;
        }
      }
      k = n;
      i = j;
      if (n == 0)
      {
        k = n;
        i = j;
        if (((c)localObject).nAi != 0.0D)
        {
          k = 1;
          i = j;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */