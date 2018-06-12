package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.view.View;
import com.tencent.mm.plugin.appbrand.widget.input.l;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Constructor;

public abstract class b
{
  public a gMI;
  
  public final <T extends e> T C(Class<T> paramClass)
  {
    a locala = dq(true);
    this.gMI = locala;
    if (locala == null) {
      return null;
    }
    try
    {
      locala.setPickerImpl((e)paramClass.getDeclaredConstructor(new Class[] { Context.class }).newInstance(new Object[] { locala.getContext() }));
      return locala.getPicker();
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.AppBrandBottomPickerInvokeHandler", "newInstance class[%s], exp[%s]", new Object[] { paramClass.getSimpleName(), localException });
    }
    return null;
  }
  
  public abstract View ajw();
  
  public final a dq(boolean paramBoolean)
  {
    a locala2 = null;
    if (this.gMI != null) {
      locala1 = this.gMI;
    }
    l locall;
    do
    {
      do
      {
        do
        {
          do
          {
            return locala1;
            locala1 = locala2;
          } while (ajw() == null);
          locall = l.bV(ajw());
          locala1 = locala2;
        } while (locall == null);
        locala2 = a.ci(locall);
        locala1 = locala2;
      } while (locala2 != null);
      locala1 = locala2;
    } while (!paramBoolean);
    a locala1 = new a(ajw().getContext());
    locall.f(locala1, true);
    return locala1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */