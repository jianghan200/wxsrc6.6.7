package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.e;
import android.support.v4.view.a.b.k;
import android.support.v4.view.z;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class ac
  extends a
{
  final RecyclerView Sa;
  final a Tj = new ac.1(this);
  
  public ac(RecyclerView paramRecyclerView)
  {
    this.Sa = paramRecyclerView;
  }
  
  public final void a(View paramView, b paramb)
  {
    super.a(paramView, paramb);
    paramb.setClassName(RecyclerView.class.getName());
    if ((!gk()) && (this.Sa.getLayoutManager() != null))
    {
      paramView = this.Sa.getLayoutManager();
      RecyclerView.m localm = paramView.Sa.QN;
      RecyclerView.q localq = paramView.Sa.RB;
      if ((z.h(paramView.Sa, -1)) || (z.g(paramView.Sa, -1)))
      {
        paramb.addAction(8192);
        paramb.setScrollable(true);
      }
      if ((z.h(paramView.Sa, 1)) || (z.g(paramView.Sa, 1)))
      {
        paramb.addAction(4096);
        paramb.setScrollable(true);
      }
      int i = paramView.a(localm, localq);
      int j = paramView.b(localm, localq);
      paramView = new b.k(b.cp().r(i, j));
      b.xr.g(paramb.xs, ((b.k)paramView).xs);
    }
  }
  
  final boolean gk()
  {
    RecyclerView localRecyclerView = this.Sa;
    return (!localRecyclerView.Rc) || (localRecyclerView.Rl) || (localRecyclerView.QP.eE());
  }
  
  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(RecyclerView.class.getName());
    if (((paramView instanceof RecyclerView)) && (!gk()))
    {
      paramView = (RecyclerView)paramView;
      if (paramView.getLayoutManager() != null) {
        paramView.getLayoutManager().onInitializeAccessibilityEvent(paramAccessibilityEvent);
      }
    }
  }
  
  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool2 = false;
    boolean bool1;
    if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
      bool1 = true;
    }
    int i;
    do
    {
      do
      {
        do
        {
          do
          {
            return bool1;
            bool1 = bool2;
          } while (gk());
          bool1 = bool2;
        } while (this.Sa.getLayoutManager() == null);
        paramView = this.Sa.getLayoutManager();
        paramBundle = paramView.Sa.QN;
        paramBundle = paramView.Sa.RB;
        bool1 = bool2;
      } while (paramView.Sa == null);
      switch (paramInt)
      {
      default: 
        i = 0;
        paramInt = 0;
        if (paramInt != 0) {
          break label126;
        }
        bool1 = bool2;
      }
    } while (i == 0);
    label126:
    paramView.Sa.scrollBy(i, paramInt);
    return true;
    if (z.h(paramView.Sa, -1)) {}
    for (paramInt = -(paramView.mHeight - paramView.getPaddingTop() - paramView.getPaddingBottom());; paramInt = 0)
    {
      i = paramInt;
      if (z.g(paramView.Sa, -1))
      {
        i = -(paramView.mWidth - paramView.getPaddingLeft() - paramView.getPaddingRight());
        break;
        if (!z.h(paramView.Sa, 1)) {
          break label271;
        }
      }
      label271:
      for (paramInt = paramView.mHeight - paramView.getPaddingTop() - paramView.getPaddingBottom();; paramInt = 0)
      {
        i = paramInt;
        if (z.g(paramView.Sa, 1))
        {
          i = paramView.mWidth - paramView.getPaddingLeft() - paramView.getPaddingRight();
          break;
        }
        int j = 0;
        paramInt = i;
        i = j;
        break;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/android/support/v7/widget/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */