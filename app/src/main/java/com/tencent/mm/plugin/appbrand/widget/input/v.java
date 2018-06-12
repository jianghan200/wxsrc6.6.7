package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.c.e;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public abstract class v
  extends AppBrandInputInvokeHandler
{
  boolean addInputImpl(w paramw, e parame)
  {
    if (paramw == null)
    {
      x.w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl failed, EditText is null");
      return false;
    }
    int j = parame.gGq;
    if (this.mPageRef != null)
    {
      localObject = (p)this.mPageRef.get();
      if (localObject != null) {}
    }
    else
    {
      x.w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) failed, pageView is null", new Object[] { Integer.valueOf(j) });
      return false;
    }
    Object localObject = ((p)localObject).agU();
    if (localObject == null)
    {
      x.w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) failed, CustomViewContainer is null", new Object[] { Integer.valueOf(j) });
      return false;
    }
    int i;
    int k;
    float f1;
    float f2;
    float f3;
    float f4;
    if ((parame.gLR != null) && (parame.gLR.booleanValue()))
    {
      i = 4;
      k = parame.dGN;
      f1 = parame.gLE.intValue();
      f2 = parame.gLD.intValue();
      f3 = parame.gLB.intValue();
      f4 = parame.gLC.intValue();
      if ((parame.gLV == null) || (!parame.gLV.booleanValue())) {
        break label260;
      }
    }
    label260:
    for (boolean bool = true;; bool = false)
    {
      bool = ((u)localObject).a(paramw, j, k, new float[] { f1, f2, f3, f4, 0.0F }, i, bool);
      x.i("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) success = %s, ", new Object[] { Integer.valueOf(j), Boolean.valueOf(bool) });
      return bool;
      i = 0;
      break;
    }
  }
  
  void removeInputImpl(w paramw)
  {
    if (paramw == null)
    {
      x.w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl failed, EditText is null");
      return;
    }
    int i = paramw.getInputId();
    paramw.b(this.mInputFocusChangeListenerImpl);
    if (this.mPageRef == null) {}
    for (paramw = null; paramw == null; paramw = (p)this.mPageRef.get())
    {
      x.w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) failed, pageView is null", new Object[] { Integer.valueOf(i) });
      return;
    }
    paramw = paramw.agU();
    if (paramw == null)
    {
      x.w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) failed, CustomViewContainer is null", new Object[] { Integer.valueOf(i) });
      return;
    }
    x.i("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) success = %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(paramw.lt(i)) });
  }
  
  boolean updateInputPosition(w paramw, e parame)
  {
    if (paramw == null)
    {
      x.w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition failed, EditText is null");
      return false;
    }
    int j = paramw.getInputId();
    if (this.mPageRef != null)
    {
      paramw = (p)this.mPageRef.get();
      if (paramw != null) {}
    }
    else
    {
      x.w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) failed, pageView is null", new Object[] { Integer.valueOf(j) });
      return false;
    }
    paramw = paramw.agU();
    if (paramw == null)
    {
      x.w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) failed, CustomViewContainer is null", new Object[] { Integer.valueOf(j) });
      return false;
    }
    if ((parame.gLR != null) && (parame.gLR.booleanValue())) {}
    for (int i = 4;; i = 0)
    {
      float f1 = parame.gLE.intValue();
      float f2 = parame.gLD.intValue();
      float f3 = parame.gLB.intValue();
      float f4 = parame.gLC.intValue();
      parame = parame.gLV;
      boolean bool = paramw.a(j, new float[] { f1, f2, f3, f4, 0.0F }, i, parame);
      x.i("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) success = %s", new Object[] { Integer.valueOf(j), Boolean.valueOf(bool) });
      return bool;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */