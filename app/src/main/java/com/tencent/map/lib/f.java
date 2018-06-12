package com.tencent.map.lib;

import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.gl.JNICallback.b;
import com.tencent.map.lib.gl.JNICallback.c;
import com.tencent.map.lib.gl.JNICallback.d;
import com.tencent.map.lib.gl.JNICallback.e;
import com.tencent.map.lib.gl.JNICallback.j;
import com.tencent.map.lib.gl.JNICallback.k;
import com.tencent.map.lib.listener.a;
import com.tencent.map.lib.mapstructure.MapRouteSectionWithName;
import com.tencent.map.lib.mapstructure.Polygon2D;
import com.tencent.map.lib.mapstructure.TappedElement;
import com.tencent.tencentmap.mapsdk.a.gv;
import com.tencent.tencentmap.mapsdk.a.gw;
import com.tencent.tencentmap.mapsdk.a.hb;
import com.tencent.tencentmap.mapsdk.a.hc;
import com.tencent.tencentmap.mapsdk.a.he;
import com.tencent.tencentmap.mapsdk.a.hg;
import com.tencent.tencentmap.mapsdk.a.hh;
import com.tencent.tencentmap.mapsdk.a.hi;
import com.tencent.tencentmap.mapsdk.a.hq;
import com.tencent.tencentmap.mapsdk.a.hs;
import com.tencent.tencentmap.mapsdk.a.ht;
import com.tencent.tencentmap.mapsdk.a.ht.a;
import com.tencent.tencentmap.mapsdk.a.hu;
import com.tencent.tencentmap.mapsdk.a.hv;
import com.tencent.tencentmap.mapsdk.a.ic;
import com.tencent.tencentmap.mapsdk.a.ic.a;
import com.tencent.tencentmap.mapsdk.a.id;
import com.tencent.tencentmap.mapsdk.a.if;
import com.tencent.tencentmap.mapsdk.a.iw;
import java.util.List;

public class f
{
  private hv a;
  private int b = ic.a.a;
  private int c = ic.a.d;
  private GeoPoint d = new GeoPoint();
  private int e = 0;
  
  public f(hv paramhv)
  {
    this.a = paramhv;
  }
  
  public int A()
  {
    return this.a.a(3, true);
  }
  
  public int B()
  {
    return this.a.a(2, false);
  }
  
  public MapLanguage C()
  {
    return this.a.z();
  }
  
  public boolean D()
  {
    return this.a.C();
  }
  
  public void E()
  {
    this.a.D();
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return this.a.a().a(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat)
  {
    return this.a.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramFloat);
  }
  
  public int a(Polygon2D paramPolygon2D)
  {
    return this.a.a(paramPolygon2D);
  }
  
  public String a(GeoPoint paramGeoPoint)
  {
    return this.a.a(paramGeoPoint);
  }
  
  public void a()
  {
    this.a.x();
  }
  
  public void a(double paramDouble)
  {
    this.a.a().j(paramDouble);
  }
  
  public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, Runnable paramRunnable)
  {
    this.a.a().a(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramRunnable);
  }
  
  public void a(float paramFloat)
  {
    this.a.a().c(paramFloat);
  }
  
  public void a(float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    this.a.a().a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public void a(int paramInt)
  {
    this.a.a().b(paramInt);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.a().a(paramInt1, paramInt2);
  }
  
  public void a(e parame)
  {
    this.a.a().a(parame);
  }
  
  public void a(JNICallback.b paramb)
  {
    this.a.a(paramb);
  }
  
  public void a(JNICallback.c paramc)
  {
    this.a.a(paramc);
  }
  
  public void a(JNICallback.d paramd)
  {
    this.a.a(paramd);
  }
  
  public void a(JNICallback.e parame)
  {
    this.a.a(parame);
  }
  
  public void a(JNICallback.j paramj)
  {
    this.a.a(paramj);
  }
  
  public void a(JNICallback.k paramk)
  {
    this.a.a(paramk);
  }
  
  public void a(a parama)
  {
    this.a.c().a(parama);
  }
  
  public void a(hb paramhb)
  {
    this.a.a().a(paramhb);
  }
  
  public void a(hc paramhc)
  {
    this.a.a().a(paramhc);
  }
  
  public void a(he paramhe)
  {
    this.a.a().a(paramhe);
  }
  
  public void a(hg paramhg)
  {
    this.a.a().a(paramhg);
  }
  
  public void a(hi paramhi)
  {
    this.a.a().c(paramhi);
  }
  
  public void a(ht.a parama)
  {
    this.a.a().a(parama);
  }
  
  public void a(id paramid)
  {
    this.a.a().a(paramid);
  }
  
  public void a(iw paramiw)
  {
    this.a.c().a(paramiw);
    this.a.r();
  }
  
  public void a(Runnable paramRunnable)
  {
    this.a.a().a(paramRunnable);
  }
  
  public void a(String paramString)
  {
    this.a.b(paramString);
  }
  
  public void a(List<MapRouteSectionWithName> paramList, List<GeoPoint> paramList1)
  {
    this.a.a(paramList, paramList1);
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.b(paramBoolean);
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    return this.a.c().a(paramFloat1, paramFloat2);
  }
  
  public boolean a(String paramString, byte[] paramArrayOfByte)
  {
    if localif = this.a.p();
    if (localif == null) {
      return false;
    }
    return localif.a(paramString, paramArrayOfByte);
  }
  
  public int b()
  {
    return this.c;
  }
  
  public TappedElement b(float paramFloat1, float paramFloat2)
  {
    return this.a.a(paramFloat1, paramFloat2);
  }
  
  public void b(double paramDouble)
  {
    this.a.a().h(paramDouble);
  }
  
  public void b(float paramFloat)
  {
    this.a.a().b(paramFloat);
  }
  
  public void b(int paramInt)
  {
    this.a.a().a(paramInt);
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    this.a.c(paramInt1, paramInt2);
  }
  
  public void b(GeoPoint paramGeoPoint)
  {
    this.a.a().a(paramGeoPoint.getLatitudeE6(), paramGeoPoint.getLongitudeE6());
  }
  
  public void b(Polygon2D paramPolygon2D)
  {
    this.a.b(paramPolygon2D);
  }
  
  public void b(hb paramhb)
  {
    this.a.a().b(paramhb);
  }
  
  public void b(he paramhe)
  {
    this.a.a().b(paramhe);
  }
  
  public void b(hg paramhg)
  {
    this.a.a().b(paramhg);
  }
  
  public void b(iw paramiw)
  {
    this.a.c().b(paramiw);
    this.a.r();
  }
  
  public void b(Runnable paramRunnable)
  {
    this.a.a().b(paramRunnable);
  }
  
  public void b(String paramString)
  {
    this.a.a(paramString);
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.e(paramBoolean);
    }
  }
  
  public boolean b(String paramString, byte[] paramArrayOfByte)
  {
    if localif = this.a.p();
    if (localif == null) {
      return false;
    }
    return localif.b(paramString, paramArrayOfByte);
  }
  
  public int c()
  {
    return this.b;
  }
  
  public String c(GeoPoint paramGeoPoint)
  {
    return this.a.b(paramGeoPoint);
  }
  
  public void c(float paramFloat)
  {
    this.a.a().a(paramFloat);
  }
  
  public void c(int paramInt)
  {
    this.a.b(paramInt);
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    this.a.a().b(paramInt1, paramInt2);
  }
  
  public void c(String paramString)
  {
    this.a.c(paramString);
  }
  
  public void c(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.f(paramBoolean);
    }
  }
  
  public int d()
  {
    return this.a.e().n();
  }
  
  public void d(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public void d(int paramInt1, int paramInt2)
  {
    this.a.d(paramInt1, paramInt2);
  }
  
  public void d(boolean paramBoolean)
  {
    this.a.g(paramBoolean);
  }
  
  public int e()
  {
    return this.a.a().u();
  }
  
  public int e(boolean paramBoolean)
  {
    return this.a.a(1, paramBoolean);
  }
  
  public void e(int paramInt)
  {
    this.b = paramInt;
    this.a.i().b(paramInt);
  }
  
  public void e(int paramInt1, int paramInt2)
  {
    this.a.e(paramInt1, paramInt2);
  }
  
  public GeoPoint f()
  {
    return this.a.a().n();
  }
  
  public void f(int paramInt)
  {
    this.c = paramInt;
    this.a.i().c(paramInt);
  }
  
  public void f(boolean paramBoolean)
  {
    this.a.h(paramBoolean);
  }
  
  public void g(int paramInt)
  {
    this.a.c(paramInt);
  }
  
  public void g(boolean paramBoolean)
  {
    this.a.j(paramBoolean);
  }
  
  public boolean g()
  {
    return this.a.v();
  }
  
  public int h()
  {
    return this.a.a().m();
  }
  
  public void h(int paramInt)
  {
    this.a.d(paramInt);
  }
  
  public void h(boolean paramBoolean)
  {
    this.a.k(paramBoolean);
  }
  
  public float i()
  {
    return this.a.a().l();
  }
  
  public void i(boolean paramBoolean)
  {
    this.a.i(paramBoolean);
  }
  
  public float j()
  {
    return this.a.a().q();
  }
  
  public void j(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.l(paramBoolean);
    }
  }
  
  public void k()
  {
    this.a.a().s();
  }
  
  public void l()
  {
    this.a.t();
  }
  
  public void m()
  {
    this.a.u();
  }
  
  public void n()
  {
    int i = this.a.s();
    try
    {
      gv.a().a(i);
      gv.a().a(this.a.e());
      return;
    }
    catch (Exception localException) {}
  }
  
  public void o()
  {
    if localif = this.a.p();
    if (localif == null) {
      return;
    }
    localif.c();
  }
  
  public float p()
  {
    return this.a.a().o();
  }
  
  public float q()
  {
    return this.a.a().p();
  }
  
  public void r()
  {
    this.a.w();
  }
  
  public hh s()
  {
    return this.a.d();
  }
  
  @Deprecated
  public hh t()
  {
    return new gw(this.a);
  }
  
  public void u()
  {
    this.a.a().A();
  }
  
  public Rect v()
  {
    return this.a.a().b();
  }
  
  public int w()
  {
    return this.a.i().o();
  }
  
  public String[] x()
  {
    return this.a.y();
  }
  
  public hs y()
  {
    return this.a.A();
  }
  
  public ic z()
  {
    return this.a.e();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/map/lib/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */