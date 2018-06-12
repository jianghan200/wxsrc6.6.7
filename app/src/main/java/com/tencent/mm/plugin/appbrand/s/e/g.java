package com.tencent.mm.plugin.appbrand.s.e;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class g
  implements c
{
  private byte[] content;
  private TreeMap<String, String> gDW = new TreeMap(String.CASE_INSENSITIVE_ORDER);
  
  public final Iterator<String> aoQ()
  {
    return Collections.unmodifiableSet(this.gDW.keySet()).iterator();
  }
  
  public final byte[] aoR()
  {
    return this.content;
  }
  
  public final void put(String paramString1, String paramString2)
  {
    this.gDW.put(paramString1, paramString2);
  }
  
  public final String wa(String paramString)
  {
    String str = (String)this.gDW.get(paramString);
    paramString = str;
    if (str == null) {
      paramString = "";
    }
    return paramString;
  }
  
  public final boolean wb(String paramString)
  {
    return this.gDW.containsKey(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/s/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */