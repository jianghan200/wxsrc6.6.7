package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;

public final class jw
  extends mf
{
  static ArrayList<jt> c = new ArrayList();
  public int a = 0;
  public ArrayList<jt> b = null;
  
  static
  {
    jt localjt = new jt();
    c.add(localjt);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */