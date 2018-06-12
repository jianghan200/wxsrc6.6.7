package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class rb
{
  private int a = -16777216;
  private int b = -16777216;
  private final List<qw> c = new ArrayList();
  private float d = 10.0F;
  private boolean e = true;
  private float f = 0.0F;
  
  public final rb a(float paramFloat)
  {
    this.d = paramFloat;
    return this;
  }
  
  public final rb a(int paramInt)
  {
    this.a = paramInt;
    return this;
  }
  
  public final rb a(Iterable<qw> paramIterable)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      qw localqw = (qw)paramIterable.next();
      this.c.add(localqw);
    }
    return this;
  }
  
  public final rb a(boolean paramBoolean)
  {
    this.e = paramBoolean;
    return this;
  }
  
  public final List<qw> a()
  {
    return this.c;
  }
  
  public final float b()
  {
    return this.d;
  }
  
  public final rb b(float paramFloat)
  {
    this.f = paramFloat;
    return this;
  }
  
  public final rb b(int paramInt)
  {
    this.b = paramInt;
    return this;
  }
  
  public final int c()
  {
    return this.a;
  }
  
  public final int d()
  {
    return this.b;
  }
  
  public final float e()
  {
    return this.f;
  }
  
  public final boolean f()
  {
    return this.e;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */