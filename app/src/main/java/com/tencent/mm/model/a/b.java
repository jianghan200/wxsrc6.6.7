package com.tencent.mm.model.a;

import java.util.HashMap;

public final class b
{
  public String dDI;
  public String dDJ;
  public String dDK;
  public String dDL;
  public HashMap<String, e> dDM = new HashMap();
  
  public final e iP(String paramString)
  {
    if ((this.dDM != null) && (this.dDM.containsKey(paramString))) {
      return (e)this.dDM.get(paramString);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/model/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */