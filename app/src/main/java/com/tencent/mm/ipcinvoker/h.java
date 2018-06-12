package com.tencent.mm.ipcinvoker;

import java.util.HashMap;
import java.util.Map;

public class h
{
  private static volatile h dmF;
  Map<String, BaseIPCService> dmG = new HashMap();
  
  public static h Ct()
  {
    if (dmF == null) {}
    try
    {
      if (dmF == null) {
        dmF = new h();
      }
      return dmF;
    }
    finally {}
  }
  
  public final BaseIPCService fG(String paramString)
  {
    return (BaseIPCService)this.dmG.get(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ipcinvoker/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */