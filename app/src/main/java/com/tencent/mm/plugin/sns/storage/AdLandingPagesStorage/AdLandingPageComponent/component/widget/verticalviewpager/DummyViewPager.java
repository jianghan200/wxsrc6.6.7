package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager.h;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.b.a;
import java.io.Serializable;

public class DummyViewPager
  extends AdLandingViewPager
  implements Serializable
{
  protected int nHc;
  
  public DummyViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = new a();
    if (Build.VERSION.SDK_INT >= 11) {
      if (this.wN == null) {
        break label79;
      }
    }
    label79:
    for (int i = 1;; i = 0)
    {
      if (1 != i) {
        j = 1;
      }
      this.wN = paramContext;
      setChildrenDrawingOrderEnabledCompat(true);
      this.wP = 1;
      if (j != 0) {
        cf();
      }
      setOnPageChangeListener(new ViewPager.h()
      {
        public final void N(int paramAnonymousInt)
        {
          super.N(paramAnonymousInt);
          if (paramAnonymousInt == 0) {
            DummyViewPager.this.nHc = DummyViewPager.this.getScrollX();
          }
        }
      });
      return;
    }
  }
  
  public int getBaseScrollX()
  {
    return this.nHc;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public void setBaseScrollX(int paramInt)
  {
    this.nHc = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/DummyViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */