package com.tencent.mm.plugin.appbrand.dynamic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class i
{
  private static final i fuP = new i();
  public Map<String, String> fuO = new HashMap();
  
  public static i aeT()
  {
    return fuP;
  }
  
  public final Collection<String> aeU()
  {
    return this.fuO.values();
  }
  
  public final String sz(String paramString)
  {
    return (String)this.fuO.get(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */