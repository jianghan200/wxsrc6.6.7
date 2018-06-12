package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class pe
{
  private final List<ox> a = new ArrayList();
  private float b = 1.0F;
  private int c = -16777216;
  private int d = kh.l;
  private int e = 0;
  private boolean f = true;
  private boolean g = false;
  private String h = "";
  private int i = -16777216;
  private Typeface j = Typeface.DEFAULT;
  private int k = Integer.MAX_VALUE;
  private int l = 1;
  private int m = -1;
  
  public pe a(float paramFloat)
  {
    if (paramFloat < 0.0F)
    {
      this.b = 1.0F;
      return this;
    }
    this.b = paramFloat;
    return this;
  }
  
  public pe a(int paramInt)
  {
    this.c = paramInt;
    return this;
  }
  
  public pe a(boolean paramBoolean)
  {
    this.f = paramBoolean;
    return this;
  }
  
  public List<ox> a()
  {
    return this.a;
  }
  
  public void a(Iterable<ox> paramIterable)
  {
    if (this.a == null) {}
    do
    {
      return;
      this.a.clear();
    } while (paramIterable == null);
    b(paramIterable);
  }
  
  public float b()
  {
    return this.b;
  }
  
  public pe b(int paramInt)
  {
    this.d = paramInt;
    return this;
  }
  
  public pe b(Iterable<ox> paramIterable)
  {
    if (paramIterable != null)
    {
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
      {
        ox localox = (ox)paramIterable.next();
        this.a.add(localox);
      }
    }
    return this;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public pe c(int paramInt)
  {
    this.e = paramInt;
    return this;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public float e()
  {
    return this.e;
  }
  
  public boolean f()
  {
    return this.f;
  }
  
  public String g()
  {
    return this.h;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/pe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */