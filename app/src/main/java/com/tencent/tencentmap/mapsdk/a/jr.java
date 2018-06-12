package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;

public final class jr
  extends mf
{
  static ArrayList<ju> e = new ArrayList();
  public ArrayList<ju> a = null;
  public String b = "";
  public String c = "";
  public String d = "";
  
  static
  {
    ju localju = new ju();
    e.add(localju);
  }
  
  public jr() {}
  
  public jr(ArrayList<ju> paramArrayList, String paramString1, String paramString2, String paramString3)
  {
    this.a = paramArrayList;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public final void readFrom(md parammd)
  {
    this.a = ((ArrayList)parammd.a(e, 0, true));
    this.b = parammd.a(1, false);
    this.c = parammd.a(2, false);
    this.d = parammd.a(3, false);
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 0);
    if (this.b != null) {
      paramme.a(this.b, 1);
    }
    if (this.c != null) {
      paramme.a(this.c, 2);
    }
    if (this.d != null) {
      paramme.a(this.d, 3);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */