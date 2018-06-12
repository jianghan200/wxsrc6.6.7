package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.List;

public final class pa
  implements ou
{
  private boolean a = false;
  private String b;
  private int c = -1;
  private boolean d = false;
  private pb e = null;
  private String f = "";
  private boolean g = false;
  private mr h = null;
  private boolean i = false;
  private int j = 0;
  private boolean k = false;
  private ac.m l;
  private Object m;
  
  public pa(pb parampb, mr parammr, String paramString)
  {
    this.f = paramString;
    this.e = parampb;
    this.h = parammr;
    this.k = parampb.p();
    this.j = parampb.o();
    this.m = this.e.r();
  }
  
  public final int a(Context paramContext)
  {
    on localon = this.e.e();
    if (localon == null) {}
    do
    {
      return 0;
      paramContext = localon.a().a(paramContext);
    } while (paramContext == null);
    return paramContext.getWidth();
  }
  
  public final List<iw> a()
  {
    return this.h.h(this.f);
  }
  
  public final void a(float paramFloat)
  {
    if (this.h == null) {
      return;
    }
    this.h.a(this.f, paramFloat);
    this.e.a(paramFloat);
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    if (this.h == null) {
      return;
    }
    this.h.a(this.f, paramFloat1, paramFloat2);
    this.e.a(paramFloat1, paramFloat2);
  }
  
  public final void a(int paramInt)
  {
    if (this.h == null) {
      return;
    }
    this.c = paramInt;
  }
  
  public final void a(on paramon)
  {
    if (this.h == null) {
      return;
    }
    this.h.a(this.f, paramon);
    this.e.a(paramon);
  }
  
  public final void a(ox paramox)
  {
    if ((this.h == null) || (paramox == null)) {
      return;
    }
    this.h.a(this.f, paramox);
    this.e.a(paramox);
  }
  
  public final void a(Object paramObject)
  {
    this.m = paramObject;
  }
  
  public final void a(String paramString)
  {
    if (this.h == null) {
      return;
    }
    this.e.a(paramString);
    this.h.b(this.f, paramString);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.h == null) {
      return;
    }
    this.h.a(this.f, paramBoolean);
    mr localmr = this.h;
    String str = this.f;
    if ((!paramBoolean) && (s())) {}
    for (boolean bool = true;; bool = false)
    {
      localmr.c(str, bool);
      this.e.a(paramBoolean);
      return;
    }
  }
  
  public final int b(Context paramContext)
  {
    on localon = this.e.e();
    if (localon == null) {}
    do
    {
      return 0;
      paramContext = localon.a().a(paramContext);
    } while (paramContext == null);
    return paramContext.getHeight();
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final void b(float paramFloat)
  {
    if (this.h == null) {
      return;
    }
    this.h.b(this.f, paramFloat);
    this.e.b(paramFloat);
  }
  
  public final void b(String paramString)
  {
    if (this.h == null) {
      return;
    }
    this.e.b(paramString);
    this.h.a(this.f, paramString);
  }
  
  public final void b(boolean paramBoolean)
  {
    if (this.h == null) {
      return;
    }
    this.h.b(this.f, paramBoolean);
    this.e.b(paramBoolean);
  }
  
  public final void c(float paramFloat)
  {
    this.h.c(this.f, paramFloat);
    this.e.c(paramFloat);
  }
  
  public final boolean c()
  {
    return this.a;
  }
  
  public final int d()
  {
    return this.c;
  }
  
  public final boolean e()
  {
    return this.d;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof pa)) {
      return false;
    }
    paramObject = (pa)paramObject;
    return this.f.equals(((pa)paramObject).f);
  }
  
  public final void f()
  {
    if (this.h == null) {
      return;
    }
    this.h.a(this.f);
  }
  
  public final String g()
  {
    return this.f;
  }
  
  public final boolean h()
  {
    return this.e.j();
  }
  
  public final int hashCode()
  {
    return this.f.hashCode();
  }
  
  public final ox i()
  {
    ox localox2 = this.h.b(this.f);
    ox localox1 = localox2;
    if (localox2 == null) {
      localox1 = this.e.b();
    }
    return localox1;
  }
  
  public final String j()
  {
    return this.e.c();
  }
  
  public final String k()
  {
    return this.e.d();
  }
  
  public final float l()
  {
    return this.e.k();
  }
  
  public final boolean m()
  {
    return this.e.h();
  }
  
  public final void n()
  {
    if (this.h == null) {
      return;
    }
    this.h.c(this.f);
  }
  
  public final void o()
  {
    if (this.h == null) {
      return;
    }
    this.h.d(this.f);
  }
  
  public final boolean p()
  {
    if (this.h == null) {
      return false;
    }
    return this.h.e(this.f);
  }
  
  public final float q()
  {
    if (this.h == null) {
      return 0.0F;
    }
    return this.h.f(this.f);
  }
  
  public final boolean r()
  {
    if (this.h == null) {
      return false;
    }
    return this.e.i();
  }
  
  final boolean s()
  {
    return this.h.g(this.f);
  }
  
  public final float t()
  {
    if (this.e != null) {
      return this.e.l();
    }
    return 0.0F;
  }
  
  public final float u()
  {
    return this.e.f();
  }
  
  public final float v()
  {
    return this.e.g();
  }
  
  public final int w()
  {
    return this.j;
  }
  
  public final boolean x()
  {
    return this.k;
  }
  
  public final ac.m y()
  {
    return this.l;
  }
  
  public final Object z()
  {
    return this.m;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/pa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */