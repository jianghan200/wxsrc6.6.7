package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;

public final class jx
  extends mf
{
  static ArrayList<jv> c = new ArrayList();
  public int a = 0;
  public ArrayList<jv> b = null;
  
  static
  {
    jv localjv = new jv();
    c.add(localjv);
  }
  
  public final void readFrom(md parammd)
  {
    this.a = parammd.a(this.a, 0, true);
    this.b = ((ArrayList)parammd.a(c, 1, false));
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 0);
    if (this.b != null) {
      paramme.a(this.b, 1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */