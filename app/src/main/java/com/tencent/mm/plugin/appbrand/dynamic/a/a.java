package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.view.View;
import com.tencent.mm.modelappbrand.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class a
  implements c
{
  private Map<Object, Set<View>> fvg = new HashMap();
  
  public final Map<Object, Set<View>> JL()
  {
    return this.fvg;
  }
  
  public final Set<View> aX(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    return (Set)this.fvg.get(paramObject);
  }
  
  public final Set<View> aY(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    return (Set)this.fvg.remove(paramObject);
  }
  
  public final boolean g(Object paramObject, View paramView)
  {
    if ((paramObject == null) || (paramView == null)) {
      return false;
    }
    Set localSet = (Set)this.fvg.get(paramObject);
    Object localObject = localSet;
    if (localSet == null)
    {
      localObject = new HashSet();
      this.fvg.put(paramObject, localObject);
    }
    return ((Set)localObject).add(paramView);
  }
  
  public final boolean h(Object paramObject, View paramView)
  {
    if ((paramObject == null) || (paramView == null)) {
      return false;
    }
    paramObject = (Set)this.fvg.get(paramObject);
    if (paramObject != null) {
      return ((Set)paramObject).remove(paramView);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */