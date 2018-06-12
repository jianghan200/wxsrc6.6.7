package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  implements Runnable
{
  public ListView lPD;
  public int mMode;
  public long uBk = System.currentTimeMillis();
  public int uBl;
  public int uBm;
  public int uBn;
  private final int uBo;
  public int uBp;
  
  public n(ListView paramListView)
  {
    this.lPD = paramListView;
    this.uBo = ViewConfiguration.get(this.lPD.getContext()).getScaledFadingEdgeLength();
    x.d("ScrollerRunnable", "mExtraScroll: %d", new Object[] { Integer.valueOf(this.uBo) });
  }
  
  public final void run()
  {
    if (System.currentTimeMillis() - this.uBk > 10000L) {}
    int k;
    View localView;
    label242:
    do
    {
      do
      {
        return;
        j = this.lPD.getHeight();
        k = this.lPD.getFirstVisiblePosition();
        switch (this.mMode)
        {
        default: 
          return;
        case 1: 
          i = this.lPD.getChildCount() - 1;
          k += i;
        }
      } while (i < 0);
      int m;
      int n;
      if (k == this.uBm)
      {
        if (this.uBp > 20)
        {
          this.lPD.setSelection(this.uBl);
          x.d("ScrollerRunnable", "dz:try scroll at same item more than 10, direct seletion");
        }
      }
      else
      {
        this.uBp = 0;
        localView = this.lPD.getChildAt(i);
        m = localView.getHeight();
        n = localView.getTop();
        if (k >= this.lPD.getCount() - 1) {
          break label242;
        }
      }
      for (i = this.uBo;; i = this.lPD.getPaddingBottom())
      {
        this.lPD.smoothScrollBy(i + (m - (j - n)), this.uBn);
        this.uBm = k;
        if (k >= this.uBl) {
          break;
        }
        this.lPD.post(this);
        return;
        this.lPD.post(this);
        this.uBp += 1;
        x.d("ScrollerRunnable", "dz:try scroll lastpos = %d", new Object[] { Integer.valueOf(k) });
        return;
      }
      if (k == this.uBm)
      {
        if (this.uBp <= 20) {
          break;
        }
        this.lPD.setSelection(this.uBl);
        x.d("ScrollerRunnable", "dz:try scroll at same item more than 10, direct seletion");
      }
      this.uBp = 0;
      localView = this.lPD.getChildAt(0);
    } while (localView == null);
    int j = localView.getTop();
    if (k > 0) {}
    for (int i = this.uBo;; i = this.lPD.getPaddingTop())
    {
      this.lPD.smoothScrollBy(j - i, this.uBn);
      this.uBm = k;
      if (k <= this.uBl) {
        break;
      }
      this.lPD.post(this);
      return;
      this.lPD.post(this);
      this.uBp += 1;
      x.d("ScrollerRunnable", "dz:try scroll firstPos = %d", new Object[] { Integer.valueOf(k) });
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/tools/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */