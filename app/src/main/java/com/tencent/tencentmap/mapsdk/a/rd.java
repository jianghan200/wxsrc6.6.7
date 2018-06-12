package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class rd
{
  private boolean a = false;
  private boolean b = false;
  private final List<qw> c = new ArrayList();
  private boolean d = true;
  private int e = -16777216;
  private float f = 10.0F;
  private float g = 0.0F;
  private qq h;
  private float i = 0.0F;
  private int j = -983041;
  private float k = 90.0F;
  
  public final qq a()
  {
    return this.h;
  }
  
  public final rd a(float paramFloat)
  {
    if (paramFloat > 0.0F) {
      this.k = paramFloat;
    }
    return this;
  }
  
  public final rd a(int paramInt)
  {
    this.j = paramInt;
    return this;
  }
  
  public final rd a(qq paramqq)
  {
    if (paramqq != null) {
      this.h = paramqq;
    }
    return this;
  }
  
  public final rd a(Iterable<qw> paramIterable)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      qw localqw = (qw)paramIterable.next();
      this.c.add(localqw);
    }
    return this;
  }
  
  public final rd a(boolean paramBoolean)
  {
    this.d = paramBoolean;
    return this;
  }
  
  public final float b()
  {
    return this.i;
  }
  
  public final rd b(float paramFloat)
  {
    if (paramFloat > 0.0F) {
      this.i = paramFloat;
    }
    return this;
  }
  
  public final rd b(int paramInt)
  {
    this.e = paramInt;
    return this;
  }
  
  public final rd b(boolean paramBoolean)
  {
    this.b = paramBoolean;
    return this;
  }
  
  public final int c()
  {
    return this.j;
  }
  
  public final rd c(float paramFloat)
  {
    this.f = paramFloat;
    return this;
  }
  
  public final rd c(boolean paramBoolean)
  {
    this.a = paramBoolean;
    return this;
  }
  
  public final float d()
  {
    return this.k;
  }
  
  public final rd d(float paramFloat)
  {
    this.g = paramFloat;
    return this;
  }
  
  public final List<qw> e()
  {
    return this.c;
  }
  
  public final float f()
  {
    return this.f;
  }
  
  public final int g()
  {
    return this.e;
  }
  
  public final float h()
  {
    return this.g;
  }
  
  public final boolean i()
  {
    return this.d;
  }
  
  public final boolean j()
  {
    return this.a;
  }
  
  public final boolean k()
  {
    return this.b;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */