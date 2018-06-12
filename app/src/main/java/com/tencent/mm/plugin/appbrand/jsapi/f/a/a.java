package com.tencent.mm.plugin.appbrand.jsapi.f.a;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.plugin.appbrand.widget.e.c;
import com.tencent.mm.plugin.appbrand.widget.e.e;
import java.util.LinkedList;

public final class a
{
  private static LinkedList<View> fSN = new LinkedList();
  private static LinkedList<e> fSO = new LinkedList();
  private static LinkedList<c> fSP = new LinkedList();
  
  public static boolean a(c paramc)
  {
    synchronized (fSP)
    {
      if (fSP.size() > 10) {
        return false;
      }
      fSP.push(paramc);
      return true;
    }
  }
  
  public static boolean a(e parame)
  {
    synchronized (fSO)
    {
      if (fSO.size() > 10) {
        return false;
      }
      fSO.push(parame);
      return true;
    }
  }
  
  public static c ajh()
  {
    synchronized (fSP)
    {
      if (fSP.size() <= 0) {
        return null;
      }
      c localc = (c)fSP.removeFirst();
      bJ(localc);
      return localc;
    }
  }
  
  public static e aji()
  {
    synchronized (fSO)
    {
      if (fSO.size() <= 0) {
        return null;
      }
      e locale = (e)fSO.removeFirst();
      bJ(locale);
      return locale;
    }
  }
  
  private static void bJ(View paramView)
  {
    if (paramView == null) {}
    while (!ViewGroup.class.isInstance(paramView.getParent())) {
      return;
    }
    ((ViewGroup)paramView.getParent()).removeView(paramView);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */