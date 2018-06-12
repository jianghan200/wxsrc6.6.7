package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import java.io.File;

public final class su
{
  private static int h = 0;
  private sl a;
  private final String b;
  private boolean c = true;
  private float d = Float.NEGATIVE_INFINITY;
  private boolean e = true;
  private rh f;
  private String g;
  
  public su(sl paramsl, rg paramrg)
  {
    StringBuilder localStringBuilder = new StringBuilder("TileOverlay_");
    int i = h;
    h = i + 1;
    this.b = i;
    this.a = paramsl;
    this.g = (sl.a().getPackageName() + File.separator + this.b);
    this.e = paramrg.d();
    this.f = paramrg.a();
    this.d = paramrg.b();
    this.c = paramrg.c();
  }
  
  public final float a()
  {
    return this.d;
  }
  
  public final void b()
  {
    this.a.g().a(this);
  }
  
  public final boolean c()
  {
    return this.c;
  }
  
  public final rh d()
  {
    return this.f;
  }
  
  public final String e()
  {
    return this.g;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramObject != null)
    {
      bool1 = bool2;
      if ((paramObject instanceof su))
      {
        paramObject = (su)paramObject;
        bool1 = bool2;
        if (this.b.equals(((su)paramObject).b)) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public final boolean f()
  {
    return this.e;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/su.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */