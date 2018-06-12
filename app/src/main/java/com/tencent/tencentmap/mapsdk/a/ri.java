package com.tencent.tencentmap.mapsdk.a;

import java.net.URL;

public abstract class ri
  implements rh
{
  public final rf a(int paramInt1, int paramInt2, int paramInt3, tc.a parama, Object... paramVarArgs)
  {
    parama = a(paramInt1, paramInt2, paramInt3, paramVarArgs);
    if (parama == null) {
      return null;
    }
    return new rf(paramInt1, paramInt2, paramInt3, tn.a(parama));
  }
  
  public abstract URL a(int paramInt1, int paramInt2, int paramInt3, Object... paramVarArgs);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */