package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public final class a
{
  private Context mContext;
  View nHN;
  int nHO;
  FrameLayout.LayoutParams nHP;
  
  public a(Activity paramActivity)
  {
    this.mContext = paramActivity;
    this.nHN = ((FrameLayout)paramActivity.findViewById(16908290)).getChildAt(0);
    this.nHN.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public final void onGlobalLayout()
      {
        a locala = a.this;
        Rect localRect = new Rect();
        locala.nHN.getWindowVisibleDisplayFrame(localRect);
        int i = localRect.bottom;
        int j;
        int k;
        if (i != locala.nHO)
        {
          j = locala.nHN.getRootView().getHeight();
          k = j - i;
          if (k <= j / 4) {
            break label89;
          }
        }
        label89:
        for (locala.nHP.height = (j - k);; locala.nHP.height = i)
        {
          locala.nHN.requestLayout();
          locala.nHO = i;
          return;
        }
      }
    });
    this.nHP = ((FrameLayout.LayoutParams)this.nHN.getLayoutParams());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */