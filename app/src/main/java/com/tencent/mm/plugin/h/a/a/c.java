package com.tencent.mm.plugin.h.a.a;

import java.util.Arrays;

public final class c
{
  public String bvw = "";
  String heN = null;
  public e heO = null;
  public double heP = 0.0D;
  
  public final boolean equals(Object paramObject)
  {
    if ((this.heO == null) || (paramObject == null)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    return Arrays.equals(((c)paramObject).heO.heS.hft, this.heO.heS.hft);
  }
  
  public final int hashCode()
  {
    if (this.heO == null) {
      return 0;
    }
    return Arrays.hashCode(this.heO.heS.hft);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/h/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */