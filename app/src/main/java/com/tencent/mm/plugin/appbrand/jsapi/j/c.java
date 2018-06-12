package com.tencent.mm.plugin.appbrand.jsapi.j;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.widget.picker.AppBrandEmptyPickerView;
import com.tencent.mm.plugin.appbrand.widget.picker.a;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import com.tencent.mm.plugin.appbrand.widget.picker.d.a;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

abstract class c
  extends b
{
  private e fFu;
  private int fFw;
  WeakReference<p> mPageRef;
  
  final void a(e parame, p paramp, JSONObject paramJSONObject, int paramInt)
  {
    this.fFu = parame;
    this.mPageRef = new WeakReference(paramp);
    this.fFw = paramInt;
    u(paramJSONObject);
  }
  
  protected final View ajw()
  {
    if (this.mPageRef == null) {
      return null;
    }
    return ((p)this.mPageRef.get()).getContentView();
  }
  
  final void ajx()
  {
    C(AppBrandEmptyPickerView.class);
    this.gMI.setOnResultListener(new d.a()
    {
      public final void f(boolean paramAnonymousBoolean, Object paramAnonymousObject)
      {
        c.this.gMI.hide();
      }
    });
    this.gMI.show();
  }
  
  final void h(String paramString, Map<String, Object> paramMap)
  {
    if ((this.mPageRef != null) && (this.mPageRef.get() != null) && (this.fFu != null)) {
      ((p)this.mPageRef.get()).E(this.fFw, this.fFu.f(paramString, paramMap));
    }
  }
  
  abstract void u(JSONObject paramJSONObject);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/j/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */