package com.tencent.mm.modelappbrand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class v
  implements u
{
  private f dFI;
  protected Map<String, k> dFJ = new HashMap();
  
  public v(f paramf)
  {
    this.dFI = paramf;
  }
  
  public v(u paramu)
  {
    if (paramu == null) {
      return;
    }
    this.dFI = paramu.JX();
    a(paramu);
  }
  
  private void a(u paramu)
  {
    paramu = paramu.JY().iterator();
    while (paramu.hasNext()) {
      a((k)paramu.next());
    }
  }
  
  public final f JX()
  {
    return this.dFI;
  }
  
  public final List<k> JY()
  {
    return new ArrayList(this.dFJ.values());
  }
  
  public final void a(k paramk)
  {
    this.dFJ.put(paramk.getName(), paramk);
  }
  
  public final <T> T jr(String paramString)
  {
    return (T)this.dFJ.get(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelappbrand/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */