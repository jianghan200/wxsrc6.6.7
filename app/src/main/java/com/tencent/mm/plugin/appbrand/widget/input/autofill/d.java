package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.widget.EditText;
import android.widget.ListAdapter;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.widget.input.c.a.a;
import com.tencent.mm.plugin.appbrand.widget.input.z;
import java.lang.ref.WeakReference;
import java.util.List;

public final class d
{
  public static <Input extends EditText,  extends z> void a(p paramp, Input paramInput, a.a parama)
  {
    if (!((z)paramInput).apw()) {
      return;
    }
    paramp = new WeakReference(paramp);
    paramp = new d.1(new WeakReference(paramInput), paramp);
    paramInput = ((z)paramInput).getAutoFillController();
    Object localObject = parama.gLk;
    paramInput.gKa = new a(paramInput.gJU.getContext(), (List)localObject);
    paramInput.gKa.gJN = paramInput.gJY;
    localObject = paramInput.gJV;
    a locala = paramInput.gKa;
    if (((AutoFillListPopupWindowBase)localObject).mObserver == null)
    {
      ((AutoFillListPopupWindowBase)localObject).mObserver = new AutoFillListPopupWindowBase.c((AutoFillListPopupWindowBase)localObject, (byte)0);
      ((AutoFillListPopupWindowBase)localObject).Do = locala;
      if (((AutoFillListPopupWindowBase)localObject).Do != null) {
        locala.registerDataSetObserver(((AutoFillListPopupWindowBase)localObject).mObserver);
      }
      if (((AutoFillListPopupWindowBase)localObject).gKo != null) {
        ((AutoFillListPopupWindowBase)localObject).gKo.setAdapter(((AutoFillListPopupWindowBase)localObject).Do);
      }
      paramInput.gJY.gKg = paramp;
      if (!"screen".equalsIgnoreCase(parama.gLj)) {
        break label235;
      }
    }
    label235:
    for (int i = f.gKv;; i = f.gKw)
    {
      if (i != 0) {
        paramInput.gJZ = i;
      }
      paramInput.apY();
      return;
      if (((AutoFillListPopupWindowBase)localObject).Do == null) {
        break;
      }
      ((AutoFillListPopupWindowBase)localObject).Do.unregisterDataSetObserver(((AutoFillListPopupWindowBase)localObject).mObserver);
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/autofill/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */