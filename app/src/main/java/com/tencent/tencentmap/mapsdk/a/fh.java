package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class fh
  extends gc
{
  private static ArrayList k;
  private static Map l;
  private String a = "";
  private String b = "";
  private ArrayList c = null;
  private String d = "";
  private String e = "";
  private int f = 0;
  private int g = 0;
  private int h = 0;
  private String i = "";
  private Map j = null;
  
  public fh() {}
  
  public fh(String paramString1, String paramString2, ArrayList paramArrayList, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, String paramString5, Map paramMap)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramArrayList;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramInt3;
    this.i = paramString5;
    this.j = paramMap;
  }
  
  public final void a(ga paramga)
  {
    this.a = paramga.a(0, true);
    this.b = paramga.a(1, true);
    if (k == null)
    {
      k = new ArrayList();
      k.add("");
    }
    this.c = ((ArrayList)paramga.a(k, 2, true));
    this.d = paramga.a(3, false);
    this.e = paramga.a(4, false);
    this.f = paramga.a(this.f, 5, false);
    this.g = paramga.a(this.g, 6, false);
    this.h = paramga.a(this.h, 7, false);
    this.i = paramga.a(8, false);
    if (l == null)
    {
      l = new HashMap();
      l.put("", "");
    }
    this.j = ((Map)paramga.a(l, 9, false));
  }
  
  public final void a(gb paramgb)
  {
    paramgb.a(this.a, 0);
    paramgb.a(this.b, 1);
    paramgb.a(this.c, 2);
    if (this.d != null) {
      paramgb.a(this.d, 3);
    }
    if (this.e != null) {
      paramgb.a(this.e, 4);
    }
    paramgb.a(this.f, 5);
    paramgb.a(this.g, 6);
    paramgb.a(this.h, 7);
    if (this.i != null) {
      paramgb.a(this.i, 8);
    }
    if (this.j != null) {
      paramgb.a(this.j, 9);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */