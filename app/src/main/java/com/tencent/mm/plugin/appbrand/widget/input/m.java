package com.tencent.mm.plugin.appbrand.widget.input;

import android.support.v4.e.a;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.plugin.appbrand.widget.input.c.h;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public enum m
{
  public static final Map<String, Integer> gHq;
  public static final Set<String> gHr;
  private static final Map<Integer, WeakReference<y>> gHs = new HashMap();
  private static final a<p, z> gHt = new a();
  
  static
  {
    Object localObject = new HashSet();
    ((Set)localObject).add("text");
    ((Set)localObject).add("emoji");
    ((Set)localObject).add("number");
    ((Set)localObject).add("digit");
    ((Set)localObject).add("idcard");
    gHr = Collections.unmodifiableSet((Set)localObject);
    localObject = new HashMap(3);
    ((Map)localObject).put("digit", Integer.valueOf(2));
    ((Map)localObject).put("number", Integer.valueOf(0));
    ((Map)localObject).put("idcard", Integer.valueOf(1));
    gHq = Collections.unmodifiableMap((Map)localObject);
  }
  
  static void a(int paramInt, y paramy)
  {
    if (paramy == null) {
      return;
    }
    c.runOnUiThread(new m.1(paramInt, paramy));
  }
  
  static void a(p paramp, z paramz)
  {
    if (paramp == null) {
      return;
    }
    c.runOnUiThread(new m.4(paramp, paramz));
  }
  
  public static void a(p paramp, String paramString, Integer paramInteger)
  {
    if (paramp == null) {
      return;
    }
    c.runOnUiThread(new m.2(paramp, paramString, paramInteger));
  }
  
  public static boolean a(p paramp, int paramInt1, int paramInt2, int paramInt3)
  {
    y localy = lY(paramInt1);
    return (localy != null) && (localy.isAttachedTo(paramp)) && (localy.showKeyboard(paramInt2, paramInt3));
  }
  
  public static boolean a(p paramp, Integer paramInteger)
  {
    Integer localInteger = paramInteger;
    if (paramInteger == null)
    {
      paramp = (z)gHt.get(paramp);
      if (paramp == null) {
        return false;
      }
      localInteger = Integer.valueOf(paramp.getInputId());
    }
    paramp = lY(localInteger.intValue());
    return (paramp != null) && (paramp.hideKeyboard());
  }
  
  @Deprecated
  public static boolean a(h paramh, int paramInt)
  {
    Object localObject = (WeakReference)gHs.get(Integer.valueOf(paramInt));
    if (localObject == null)
    {
      localObject = null;
      if (!(localObject instanceof AppBrandInputInvokeHandler)) {
        break label59;
      }
    }
    label59:
    for (localObject = (AppBrandInputInvokeHandler)localObject;; localObject = null)
    {
      if ((localObject == null) || (!((AppBrandInputInvokeHandler)localObject).updateInput(paramh))) {
        break label64;
      }
      return true;
      localObject = (y)((WeakReference)localObject).get();
      break;
    }
    label64:
    return false;
  }
  
  static y lY(int paramInt)
  {
    WeakReference localWeakReference = (WeakReference)gHs.get(Integer.valueOf(paramInt));
    if (localWeakReference == null) {
      return null;
    }
    return (y)localWeakReference.get();
  }
  
  public static boolean lZ(int paramInt)
  {
    y localy = lY(paramInt);
    return (localy != null) && (localy.removeSelf());
  }
  
  public static void m(p paramp)
  {
    if (paramp != null) {
      new j(paramp);
    }
  }
  
  public static boolean n(p paramp)
  {
    return a(paramp, null);
  }
  
  public static void o(p paramp)
  {
    ah.A(new m.3(paramp));
  }
  
  static void p(p paramp)
  {
    if (paramp == null) {
      return;
    }
    c.runOnUiThread(new m.5(paramp));
  }
  
  static y q(p paramp)
  {
    if (paramp == null) {
      return null;
    }
    paramp = (z)gHt.get(paramp);
    if (paramp == null) {
      return null;
    }
    return lY(paramp.getInputId());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */