package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import java.io.File;

public class l
{
  private static volatile l a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  
  private l(Context paramContext)
  {
    this.b = paramContext.getDir("tencentMapTemp", 0).getAbsolutePath();
    this.e = paramContext.getDir("tencentMapLib", 0).getAbsolutePath();
    this.c = (this.e + File.separator + "vector.jar");
    this.d = (this.e + File.separator + "libtxmapengine.so");
    this.f = (paramContext.getFilesDir().getAbsolutePath() + "/tencentMapSdk/assets/");
  }
  
  public static l a(Context paramContext)
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new l(paramContext);
      }
      return a;
    }
    finally {}
  }
  
  public String a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.f;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */