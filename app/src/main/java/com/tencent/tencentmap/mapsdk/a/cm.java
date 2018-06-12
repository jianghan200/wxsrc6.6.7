package com.tencent.tencentmap.mapsdk.a;

import java.util.HashMap;
import java.util.Map;

public final class cm
  extends cx
  implements Cloneable
{
  private static Map<Integer, byte[]> b;
  public Map<Integer, byte[]> a = null;
  
  public final void a(cv paramcv)
  {
    if (b == null)
    {
      b = new HashMap();
      byte[] arrayOfByte = (byte[])new byte[1];
      ((byte[])arrayOfByte)[0] = 0;
      b.put(Integer.valueOf(0), arrayOfByte);
    }
    this.a = ((Map)paramcv.a(b, 0, true));
  }
  
  public final void a(cw paramcw)
  {
    paramcw.a(this.a, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */