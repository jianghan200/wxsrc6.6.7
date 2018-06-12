package com.tencent.mm.plugin.appbrand.widget.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.r.b;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.page.z.a;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.widget.b.a;
import com.tencent.mm.plugin.appbrand.widget.b.e;
import com.tencent.mm.plugin.appbrand.widget.b.f.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView;
import java.util.LinkedList;
import java.util.List;

@SuppressLint({"ViewConstructor"})
public final class f
  extends AbsoluteLayout
  implements r.b, w, com.tencent.mm.plugin.appbrand.page.z, e
{
  private final p fJQ;
  public final com.tencent.mm.plugin.appbrand.widget.b.f gGA;
  private final AbsoluteLayout gGB;
  private final List<z.a> gGz = new LinkedList();
  
  public f(Context paramContext, p paramp)
  {
    super(paramContext);
    super.setId(s.g.app_brand_page_input_container);
    this.fJQ = paramp;
    this.gGB = this;
    this.gGA = new com.tencent.mm.plugin.appbrand.widget.b.f(this.gGB);
  }
  
  private void m(t paramt)
  {
    if ((this.gGB.getWidth() != paramt.getWidth()) || (this.gGB.getHeight() != paramt.getHeight()))
    {
      ViewGroup.LayoutParams localLayoutParams = this.gGB.getLayoutParams();
      localLayoutParams.width = paramt.getWidth();
      localLayoutParams.height = paramt.getHeight();
      this.gGB.setLayoutParams(localLayoutParams);
    }
    if ((this.gGB.getScrollX() != paramt.getWebScrollX()) || (this.gGB.getScrollY() != paramt.getWebScrollY())) {
      this.gGB.scrollTo(paramt.getWebScrollX(), paramt.getWebScrollY());
    }
  }
  
  public final boolean D(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent == null) || (paramMotionEvent.getActionMasked() != 0)) {}
    com.tencent.mm.plugin.appbrand.widget.b.f localf;
    do
    {
      return false;
      localf = this.gGA;
    } while ((paramMotionEvent == null) || (paramMotionEvent.getActionMasked() != 0) || (localf.gFI == null) || (paramMotionEvent.getDownTime() != localf.gFI.gFJ) || (paramMotionEvent.getEventTime() != localf.gFI.gFK));
    return true;
  }
  
  public final void a(z.a parama)
  {
    if (parama == null) {}
    while (this.gGz.contains(parama)) {
      return;
    }
    this.gGz.add(parama);
  }
  
  public final <Input extends View,  extends z> boolean a(t paramt, Input paramInput, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramt == null) || (paramt.getView() == null) || (paramInput == null)) {
      return false;
    }
    m(paramt);
    paramt = new AbsoluteLayout.LayoutParams(paramInt1, paramInt2, paramInt3, paramInt4);
    this.gGB.addView(paramInput, paramt);
    ((z)paramInput).r(this.fJQ);
    return true;
  }
  
  public final boolean apd()
  {
    if (getChildCount() <= 0) {}
    for (;;)
    {
      return false;
      int i = 0;
      while (i <= getChildCount())
      {
        if (a.bR(getChildAt(i))) {
          return true;
        }
        i += 1;
      }
    }
  }
  
  public final void b(z.a parama)
  {
    if (parama == null) {
      return;
    }
    this.gGz.remove(parama);
  }
  
  public final <Input extends View,  extends z> boolean b(t paramt, Input paramInput, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramt == null) || (paramt.getView() == null) || (paramInput == null)) {}
    label31:
    label172:
    for (;;)
    {
      return false;
      if ((paramInput != null) && (this.gGB != null))
      {
        i = 0;
        if (i < this.gGB.getChildCount()) {
          if (paramInput != this.gGB.getChildAt(i)) {}
        }
      }
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label172;
        }
        m(paramt);
        if ((paramInput.getLayoutParams() == null) || (!(paramInput.getLayoutParams() instanceof AbsoluteLayout.LayoutParams))) {
          break;
        }
        if ((paramInput.getWidth() != paramInt1) || (paramInput.getHeight() != paramInt2) || (paramInput.getLeft() != paramInt3) || (paramInput.getTop() != paramInt4))
        {
          paramt = (AbsoluteLayout.LayoutParams)paramInput.getLayoutParams();
          paramt.x = paramInt3;
          paramt.y = paramInt4;
          paramt.width = paramInt1;
          paramt.height = paramInt2;
          paramInput.setLayoutParams(paramt);
        }
        return true;
        i += 1;
        break label31;
      }
    }
  }
  
  public final <Input extends View,  extends z> void bU(Input paramInput)
  {
    if (paramInput == null) {
      return;
    }
    paramInput.setVisibility(8);
    this.gGB.removeView(paramInput);
    ((z)paramInput).s(this.fJQ);
  }
  
  public final void lp(int paramInt)
  {
    setTranslationY(paramInt);
  }
  
  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    int i = 0;
    x.v("MicroMsg.AppBrandInputContainer", "onScrollChanged, left = %d, top = %d, oldLeft = %d, oldTop = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    paramInt3 = i;
    if (this.gGB != null)
    {
      ViewGroup.LayoutParams localLayoutParams2 = this.gGB.getLayoutParams();
      ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
      if (localLayoutParams2 == null)
      {
        localLayoutParams1 = new ViewGroup.LayoutParams(paramView.getWidth(), paramView.getHeight());
        this.gGB.setLayoutParams(localLayoutParams1);
      }
      if ((paramView.getWidth() != localLayoutParams1.width) || (paramView.getHeight() != localLayoutParams1.height))
      {
        localLayoutParams1.width = paramView.getWidth();
        localLayoutParams1.height = paramView.getHeight();
        this.gGB.setLayoutParams(localLayoutParams1);
      }
      this.gGB.scrollTo(paramInt1, paramInt2);
      paramInt3 = i;
    }
    while (paramInt3 < this.gGz.size())
    {
      ((z.a)this.gGz.get(paramInt3)).bP(paramInt1, paramInt2);
      paramInt3 += 1;
    }
  }
  
  public final void setId(int paramInt) {}
  
  public final boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */