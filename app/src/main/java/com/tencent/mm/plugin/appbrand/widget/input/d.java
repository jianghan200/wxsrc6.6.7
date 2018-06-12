package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Rect;
import android.view.View;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.widget.input.c.e;
import com.tencent.mm.plugin.appbrand.widget.input.c.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.Map;

final class d
  extends c<q>
{
  final int gGq;
  int gGr = 0;
  q gGs;
  t gGt;
  h gGu;
  boolean gGv;
  boolean gGw;
  
  d(String paramString, p paramp, e parame)
  {
    super(paramString, paramp);
    this.gGs = new q(paramp.mContext);
    this.gGq = parame.gGq;
    this.gGr = bi.a((Integer)m.gHq.get(paramString), 0);
  }
  
  private t findNumberKeyboard()
  {
    if (this.gGt != null) {
      return this.gGt;
    }
    t localt = (t)this.gGs.getInputPanel();
    this.gGt = localt;
    return localt;
  }
  
  private boolean isFocused()
  {
    if (this.gGs == null) {}
    do
    {
      return false;
      if (this.gGs.isFocused()) {
        return true;
      }
    } while ((findNumberKeyboard() == null) || (!findNumberKeyboard().isShown()) || (this.gGt.getAttachedEditText() != this.gGs));
    return true;
  }
  
  public final boolean adjustPositionOnFocused()
  {
    return (this.gGu != null) && (af.f(this.gGu.gLZ));
  }
  
  final Rect api()
  {
    return new Rect(this.gGu.gLE.intValue(), this.gGu.gLD.intValue(), this.gGu.gLE.intValue() + this.gGu.gLB.intValue(), this.gGu.gLD.intValue() + this.gGu.gLC.intValue());
  }
  
  public final h b(h paramh)
  {
    if (this.gGu == null)
    {
      this.gGu = paramh;
      if ((af.f(paramh.gMh)) && (this.gGs != null)) {
        this.gGs.setPasswordMode(true);
      }
    }
    while (this.gGs == null)
    {
      return null;
      this.gGu.a(paramh);
    }
    b.a(this.gGs, this.gGu);
    return this.gGu;
  }
  
  protected final boolean dm(boolean paramBoolean)
  {
    x.d("MicroMsg.AppBrandInputComponentAsNumber", "[input_switch] onFocusChanged hasFocus %b, isFocused %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(isFocused()) });
    if (!paramBoolean) {
      if (!this.gGv) {}
    }
    while ((this.gGw) || (isFocused()))
    {
      do
      {
        return true;
      } while (!isFocused());
      this.gGv = true;
      a(apk());
      hideKeyboard();
      apj();
      this.gGv = false;
      this.gGs = null;
      return true;
    }
    this.gGw = true;
    showKeyboard(-2, -2);
    this.gGw = false;
    return true;
  }
  
  final int getInputId()
  {
    return this.gGq;
  }
  
  public final View getInputPanel()
  {
    findNumberKeyboard();
    return this.gGt;
  }
  
  public final int getInputPanelMarginBottom()
  {
    if ((this.gGu == null) || (this.gGu.gLW == null)) {
      return 0;
    }
    return this.gGu.gLW.intValue();
  }
  
  public final boolean hideKeyboard()
  {
    if (findNumberKeyboard() == null) {}
    while (!isFocused()) {
      return false;
    }
    Object localObject = this.gGt;
    ((t)localObject).setVisibility(8);
    ((t)localObject).apB();
    x.d("MicroMsg.AppBrandInputComponentAsNumber", "[input_switch] disableInputFocus %s", new Object[] { this.gGs });
    if (this.gGs != null)
    {
      this.gGs.setFocusable(false);
      this.gGs.setFocusableInTouchMode(false);
      this.gGs.setEnabled(false);
    }
    localObject = (p)this.gGm.get();
    if ((localObject != null) && (((p)localObject).gns != null)) {
      g.apm().p(((p)localObject).gns);
    }
    i.a(this.gGm).app();
    return true;
  }
  
  public final boolean showKeyboard(int paramInt1, int paramInt2)
  {
    if (this.gGs == null) {
      return false;
    }
    this.gGt = t.ca(((p)this.gGm.get()).getContentView());
    if (this.gGt == null) {
      return false;
    }
    this.gGw = true;
    Object localObject = (p)this.gGm.get();
    if ((localObject != null) && (((p)localObject).gns != null)) {
      g.apm().o(((p)localObject).gns);
    }
    this.gGt.setXMode(this.gGr);
    localObject = this.gGt;
    q localq = this.gGs;
    if (localq != null)
    {
      if (((t)localObject).im != localq) {
        ((t)localObject).apB();
      }
      ((t)localObject).setInputEditText(localq);
      ((t)localObject).setVisibility(0);
    }
    this.gGt.setOnDoneListener(new t.a()
    {
      public final void onDone()
      {
        d.this.a(d.this.apk());
        d.this.dm(false);
      }
    });
    setInputSelection(paramInt1, paramInt2);
    i.a(this.gGm).apo();
    this.gGw = false;
    return true;
  }
  
  public final boolean wh(String paramString)
  {
    if (this.gGs == null) {
      return false;
    }
    this.gGs.q(paramString);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */