package com.tencent.mm.compatible.util;

import java.security.PrivilegedAction;

public final class i
  implements PrivilegedAction
{
  private String dgD;
  private String dgE;
  
  public i(String paramString)
  {
    this.dgD = paramString;
  }
  
  public final Object run()
  {
    String str2 = System.getProperty(this.dgD);
    String str1 = str2;
    if (str2 == null) {
      str1 = this.dgE;
    }
    return str1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/compatible/util/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */