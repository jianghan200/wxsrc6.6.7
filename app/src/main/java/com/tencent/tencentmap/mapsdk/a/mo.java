package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Color;
import android.location.Location;

public class mo
  extends ny
{
  private mr a = null;
  private ns b = null;
  private nu c = null;
  private z.a d = null;
  private z e = null;
  private boolean f = false;
  private pa g = null;
  private os h = null;
  private ac.n i = null;
  private pc j = new pc();
  private int k = Color.argb(102, 0, 163, 255);
  private Location l = null;
  
  public mo(mr parammr, ns paramns, nu paramnu)
  {
    this.a = parammr;
    this.b = paramns;
    this.c = paramnu;
    this.d = f();
  }
  
  private z.a f()
  {
    return new mo.1(this);
  }
  
  public void a()
  {
    c();
    this.a = null;
    this.b = null;
    this.c = null;
  }
  
  boolean b()
  {
    if (this.f == true) {}
    do
    {
      return true;
      this.f = true;
      if (this.d == null) {
        this.d = f();
      }
      if (this.g != null) {
        this.g.b(true);
      }
      if (this.h != null) {
        this.h.a(true);
      }
    } while (this.e == null);
    this.e.a(this.d);
    return true;
  }
  
  void c()
  {
    if (this.g != null)
    {
      this.g.b(false);
      this.g.f();
      this.g = null;
    }
    if (this.h != null)
    {
      this.h.a(false);
      this.h.a();
      this.h = null;
    }
    if (!this.f) {}
    do
    {
      return;
      this.f = false;
      this.d = null;
    } while (this.e == null);
    this.e.a();
  }
  
  Location d()
  {
    if (this.l == null) {
      return null;
    }
    return new Location(this.l);
  }
  
  boolean e()
  {
    return this.f;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/mo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */