package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.widget.input.i.a;
import com.tencent.mm.plugin.appbrand.widget.input.z;
import com.tencent.mm.ui.base.o;

public final class c
{
  final z gJU;
  final e gJV;
  public final i.a gKh = new c.1(this);
  public p gKi;
  int gKj = Integer.MIN_VALUE;
  boolean gKk = false;
  
  c(z paramz, e parame)
  {
    this.gJU = paramz;
    this.gJV = parame;
  }
  
  final void mj(final int paramInt)
  {
    final AutoFillListPopupWindowBase.a locala = this.gJV.gKo;
    if (locala == null) {}
    while (!this.gJV.eZB.isShowing()) {
      return;
    }
    if ((1 == paramInt) && (this.gKk))
    {
      this.gKj = Integer.MIN_VALUE;
      this.gKk = false;
    }
    locala.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        locala.getViewTreeObserver().removeOnPreDrawListener(this);
        c localc = c.this;
        if ((!localc.gJV.eZB.isShowing()) || (localc.gJV.gKo == null) || (localc.gJV.gKo.getAdapter() == null) || (localc.gJV.gKo.getAdapter().getCount() <= 0)) {}
        Object localObject;
        do
        {
          return true;
          localObject = localc.gJU.getInputPanel();
        } while (localObject == null);
        int m = a.fromDPToPix(localc.gJU.getContext(), 8);
        int n = localc.gJV.gKo.getChildAt(0).getHeight();
        int i = localc.gJV.gKo.getAdapter().getCount() * n;
        int k = i + m * 2;
        int j = n * 3 + m * 2;
        if (k > j) {
          i = j - m * 2;
        }
        for (;;)
        {
          localc.gJV.PM = j;
          int[] arrayOfInt = new int[2];
          localc.gJU.getView().getLocationInWindow(arrayOfInt);
          j = arrayOfInt[1];
          j = localc.gJU.getView().getHeight() + j;
          ((View)localObject).getLocationInWindow(arrayOfInt);
          k = arrayOfInt[1];
          if (((localc.gKj == Integer.MIN_VALUE) || (localc.gKj >= 0 - m)) && (k - j >= i + m))
          {
            localc.gJV.PW = localc.gJU.getView();
            localc.gJV.PM = (m * 2 + i);
            localc.gJV.setVerticalOffset(0 - m);
            label315:
            localc.gJV.show();
            localObject = localc.gJV;
            if (((AutoFillListPopupWindowBase)localObject).PQ) {
              break label528;
            }
          }
          label528:
          for (i = 0;; i = ((AutoFillListPopupWindowBase)localObject).PO)
          {
            localc.gKj = i;
            return true;
            if (j - localc.gJU.getView().getHeight() >= i)
            {
              localc.gJV.PW = localc.gJU.getView();
              localc.gJV.PM = (m * 2 + i);
              localc.gJV.setVerticalOffset(-(i + m) - localc.gJU.getView().getHeight());
              break label315;
            }
            if (i <= n)
            {
              localc.gJV.PM = n;
              localc.gJV.PW = localc.gJU.getView();
              if (localc.gKj < 0 - m)
              {
                localc.gJV.setVerticalOffset(-(i + m) - localc.gJU.getView().getHeight());
                break label315;
              }
              localc.gJV.setVerticalOffset(0 - m);
              break label315;
            }
            i -= n;
            break;
          }
          j = k;
        }
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/autofill/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */