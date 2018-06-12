package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.f;
import javax.microedition.khronos.opengles.GL10;

public class kd
  extends ke
{
  private int A = 0;
  private int B = 0;
  private boolean C = false;
  private GeoPoint D = null;
  private iy E;
  private om F = null;
  private kk G = null;
  private ac.l H;
  private Runnable I = new kd.1(this);
  private Runnable P = new Runnable()
  {
    public void run()
    {
      try
      {
        if (kd.a(kd.this) != null) {
          kd.a(kd.this).b();
        }
        return;
      }
      catch (NullPointerException localNullPointerException) {}
    }
  };
  private kk.b Q = new kd.3(this);
  protected Bitmap a = null;
  boolean b = false;
  protected byte[] c = new byte[0];
  float d = 0.5F;
  float e = 0.5F;
  protected float f = 0.0F;
  protected boolean g = false;
  protected float h = 0.0F;
  protected float i = 0.0F;
  protected float j = -1.0F;
  protected pb k = null;
  protected String l = null;
  String m = null;
  protected GeoPoint n = null;
  protected GeoPoint o = null;
  protected GeoPoint p = null;
  protected float q = 1.0F;
  protected float r = 1.0F;
  protected float s = 1.0F;
  public boolean t = false;
  public boolean u = false;
  public boolean v = true;
  protected ks w = null;
  public pa x = null;
  private boolean y = false;
  private boolean z = false;
  
  public kd(ks paramks)
  {
    this.w = paramks;
  }
  
  private void a(String paramString)
  {
    synchronized (this.c)
    {
      this.l = paramString;
      return;
    }
  }
  
  private void b(pb parampb)
  {
    if ((parampb == null) || (this.E != null)) {
      return;
    }
    iz localiz = new iz().a(kh.a(parampb.b())).a(parampb.k()).a(parampb.f(), parampb.g());
    Object localObject = Math.random();
    try
    {
      String str = parampb.e().a().a();
      localObject = str;
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;) {}
    }
    parampb = localiz.a((String)localObject, new Bitmap[] { parampb.e().a(this.w.getContext()) }).a((int)parampb.n()).b(parampb.m()).b((int)parampb.l()).d(this.z).c(parampb.a()).e(parampb.q());
    if (this.E == null)
    {
      this.E = new iy(parampb);
      return;
    }
    this.E.a(parampb);
  }
  
  public void a(float paramFloat)
  {
    this.f = paramFloat;
    if (this.E != null) {
      this.E.a((int)this.f);
    }
  }
  
  protected void a(Bitmap paramBitmap)
  {
    synchronized (this.c)
    {
      this.a = paramBitmap;
      if (this.l == null) {
        this.l = paramBitmap.toString();
      }
      if (this.E != null) {
        this.E.a(this.l, new Bitmap[] { this.a });
      }
      return;
    }
  }
  
  public void a(GeoPoint paramGeoPoint)
  {
    if (paramGeoPoint == null) {
      return;
    }
    if (this.n == null) {
      this.n = new GeoPoint(paramGeoPoint.getLatitudeE6(), paramGeoPoint.getLongitudeE6());
    }
    for (;;)
    {
      this.y = true;
      if (this.E == null) {
        break;
      }
      this.E.a(this.n);
      return;
      this.n.setLatitudeE6(paramGeoPoint.getLatitudeE6());
      this.n.setLongitudeE6(paramGeoPoint.getLongitudeE6());
    }
  }
  
  public void a(on paramon)
  {
    if (paramon == null) {}
    do
    {
      return;
      paramon = paramon.a();
    } while (paramon == null);
    Bitmap localBitmap = paramon.a(this.w.getContext());
    a(paramon.a());
    b(localBitmap);
  }
  
  public void a(pb parampb)
  {
    if (parampb == null) {
      return;
    }
    this.k = parampb;
    a(kh.a(parampb.b()));
    b(parampb.f(), parampb.g());
    a_(parampb.i());
    a(parampb.n());
    a(parampb.e());
    b(parampb.k());
    c(parampb.l());
    b(parampb);
  }
  
  public void a(GL10 paramGL10)
  {
    if (!a()) {
      b();
    }
    do
    {
      return;
      f();
      b(paramGL10);
      paramGL10 = this.w.getMap().y();
    } while ((paramGL10 == null) || (this.E == null));
    this.E.b(paramGL10, this.w.getMap().s());
  }
  
  public boolean a()
  {
    return this.N;
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    if (!this.v) {}
    boolean bool2;
    do
    {
      do
      {
        do
        {
          return bool1;
        } while (this.E == null);
        bool2 = this.E.a(this.w.getMap().s(), paramFloat1, paramFloat2);
        bool1 = bool2;
      } while (!bool2);
      bool1 = bool2;
    } while (this.H == null);
    this.H.a(this.x);
    return bool2;
  }
  
  public void a_(boolean paramBoolean)
  {
    this.N = paramBoolean;
    if (this.E != null) {
      this.E.a(paramBoolean);
    }
    this.w.getMap().a();
  }
  
  public void b()
  {
    if (this.E != null) {
      this.E.j();
    }
  }
  
  public void b(float paramFloat)
  {
    this.q = paramFloat;
    if (this.E != null) {
      this.E.a(paramFloat);
    }
  }
  
  public void b(float paramFloat1, float paramFloat2)
  {
    float f1;
    if (paramFloat1 > 1.0F)
    {
      f1 = 1.0F;
      if (paramFloat2 <= 1.0F) {
        break label62;
      }
      paramFloat1 = 1.0F;
    }
    for (;;)
    {
      this.d = f1;
      this.e = paramFloat1;
      if (this.E != null) {
        this.E.a(this.d, this.e);
      }
      return;
      f1 = paramFloat1;
      if (paramFloat1 >= 0.0F) {
        break;
      }
      f1 = 0.0F;
      break;
      label62:
      paramFloat1 = paramFloat2;
      if (paramFloat2 < 0.0F) {
        paramFloat1 = 0.0F;
      }
    }
  }
  
  public void b(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return;
    }
    a(paramBitmap);
    h();
  }
  
  public void b(boolean paramBoolean)
  {
    this.z = paramBoolean;
    if (this.E != null) {
      this.E.b(paramBoolean);
    }
  }
  
  protected boolean b(GL10 paramGL10)
  {
    if (this.G != null)
    {
      this.G.c();
      this.C = this.G.b();
      if (this.C == true) {
        this.w.getMap().a();
      }
      return true;
    }
    return false;
  }
  
  public int c(boolean paramBoolean)
  {
    if ((this.a != null) && (this.E != null))
    {
      int i1 = this.a.getHeight();
      if (!paramBoolean) {
        return (int)(i1 * this.E.b());
      }
      return (int)(i1 * (1.0F - this.E.b()));
    }
    return 0;
  }
  
  public void c() {}
  
  public void c(float paramFloat)
  {
    this.M = paramFloat;
    if (this.E != null) {
      this.E.b((int)paramFloat);
    }
  }
  
  public void d()
  {
    this.w = null;
    this.n = null;
    if (this.E != null) {
      this.E.j();
    }
  }
  
  public pb e()
  {
    return this.k;
  }
  
  protected void f()
  {
    if (!this.u) {
      return;
    }
    a(this.w.getNaviCenter());
  }
  
  public GeoPoint g()
  {
    return this.n;
  }
  
  public void h()
  {
    synchronized (this.c)
    {
      if ((this.a != null) && (!this.a.isRecycled())) {
        this.b = true;
      }
      return;
    }
  }
  
  public float i()
  {
    if (this.E != null) {
      return this.E.f();
    }
    return 0.0F;
  }
  
  public float j()
  {
    if (this.E != null) {
      return this.E.g();
    }
    return 0.0F;
  }
  
  public float k()
  {
    if (this.E != null) {
      return this.E.h();
    }
    return 0.0F;
  }
  
  public float l()
  {
    if (this.E != null) {
      return this.E.i();
    }
    return 0.0F;
  }
  
  public Rect m()
  {
    if (this.E != null) {
      return this.E.a(this.w.getMap().s());
    }
    return null;
  }
  
  public float n()
  {
    return this.f;
  }
  
  public boolean o()
  {
    return this.z;
  }
  
  public Point p()
  {
    return new Point(this.A, this.B);
  }
  
  public boolean q()
  {
    return true;
  }
  
  public boolean r()
  {
    return this.C;
  }
  
  public boolean s()
  {
    return this.E != null;
  }
  
  public iy t()
  {
    return this.E;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/kd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */