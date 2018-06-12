package com.tencent.tencentmap.mapsdk.a;

import java.util.List;

public final class pd
{
  private pe a = null;
  private String b = "";
  private my c = null;
  
  public pd(pe parampe, my parammy, String paramString)
  {
    this.b = paramString;
    this.a = parampe;
    this.c = parammy;
  }
  
  public final void a()
  {
    if (this.c == null) {
      return;
    }
    this.c.a(this.b);
  }
  
  public final void a(float paramFloat)
  {
    this.c.a(this.b, paramFloat);
    this.a.a(paramFloat);
  }
  
  public final void a(int paramInt)
  {
    this.c.b(this.b, paramInt);
    this.a.a(paramInt);
  }
  
  public final void a(List<ox> paramList)
  {
    if (this.c == null) {
      return;
    }
    this.c.a(this.b, paramList);
    this.a.a(paramList);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.c.a(this.b, paramBoolean);
    this.a.a(paramBoolean);
  }
  
  public final boolean a(ox paramox)
  {
    List localList = c();
    boolean bool;
    if ((localList == null) || (localList.size() < 3) || (paramox == null)) {
      bool = false;
    }
    int j;
    int i;
    int k;
    do
    {
      return bool;
      j = localList.size() - 1;
      i = 0;
      while (i < localList.size())
      {
        if (((ox)localList.get(i)).equals(paramox)) {
          return true;
        }
        i += 1;
      }
      i = 0;
      k = 0;
      bool = k;
    } while (i >= localList.size());
    if (((((ox)localList.get(i)).a < paramox.a) && (((ox)localList.get(j)).a >= paramox.a)) || ((((ox)localList.get(j)).a < paramox.a) && (((ox)localList.get(i)).a >= paramox.a) && ((((ox)localList.get(i)).b <= paramox.b) || (((ox)localList.get(j)).b <= paramox.b))))
    {
      double d1 = ((ox)localList.get(i)).b;
      double d2 = (paramox.a - ((ox)localList.get(i)).a) / (((ox)localList.get(j)).a - ((ox)localList.get(i)).a);
      if ((((ox)localList.get(j)).b - ((ox)localList.get(i)).b) * d2 + d1 <= paramox.b)
      {
        j = 1;
        label365:
        k ^= j;
      }
    }
    for (;;)
    {
      j = i;
      i += 1;
      break;
      j = 0;
      break label365;
    }
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final void b(int paramInt)
  {
    this.c.a(this.b, paramInt);
    this.a.b(paramInt);
  }
  
  public final List<ox> c()
  {
    return this.a.a();
  }
  
  public final void c(int paramInt)
  {
    this.c.b(this.b, paramInt);
    this.a.c(paramInt);
  }
  
  public final float d()
  {
    return this.a.b();
  }
  
  public final int e()
  {
    return this.a.c();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof pd)) {
      return false;
    }
    paramObject = (pd)paramObject;
    return this.b.equals(((pd)paramObject).b);
  }
  
  public final int f()
  {
    return this.a.d();
  }
  
  public final float g()
  {
    return this.a.e();
  }
  
  public final boolean h()
  {
    return this.a.f();
  }
  
  public final int hashCode()
  {
    return this.b.hashCode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/pd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */