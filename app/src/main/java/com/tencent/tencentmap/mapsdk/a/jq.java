package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;

public final class jq
  extends mf
{
  static ArrayList<js> b = new ArrayList();
  public ArrayList<js> a = null;
  
  static
  {
    js localjs = new js();
    b.add(localjs);
  }
  
  public jq() {}
  
  public jq(ArrayList<js> paramArrayList)
  {
    this.a = paramArrayList;
  }
  
  public final void readFrom(md parammd)
  {
    this.a = ((ArrayList)parammd.a(b, 0, true));
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */