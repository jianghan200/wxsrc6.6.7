package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.f;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.opengles.GL10;

public class kb
  extends ke
{
  private static AtomicInteger P = new AtomicInteger(0);
  protected kk A = null;
  protected boolean B = false;
  protected int C = 0;
  protected int D = 0;
  protected float E = 0.5F;
  protected float F = 0.5F;
  public int G = 0;
  public int H = 0;
  private boolean I = false;
  private Runnable Q = new kb.1(this);
  private Runnable R = new Runnable()
  {
    public void run()
    {
      kb.this.e = 0.0F;
      if (kb.this.z != null) {
        kb.this.z.b();
      }
    }
  };
  private kk.a S = new kb.3(this);
  private kk.b T = new kk.b()
  {
    public void a(float paramAnonymousFloat)
    {
      kb.this.q = paramAnonymousFloat;
      if (kb.this.a != null) {
        kb.this.a.a(kb.this.q);
      }
    }
    
    public void b(float paramAnonymousFloat) {}
  };
  protected iy a;
  protected Bitmap b = null;
  boolean c = false;
  protected byte[] d = new byte[0];
  protected float e = 0.0F;
  protected boolean f = false;
  protected float g = 0.0F;
  protected float h = 0.0F;
  protected float i = -1.0F;
  protected String j = null;
  String k = null;
  public int l = 0;
  public int m = 0;
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
  public pb y = null;
  protected om z = null;
  
  public kb(ks paramks)
  {
    this.w = paramks;
    i();
  }
  
  private void b(pb parampb)
  {
    if ((parampb == null) || (this.a != null)) {}
    do
    {
      return;
      parampb = d(parampb);
    } while (parampb == null);
    this.a = new iy(parampb);
  }
  
  private void c(pb parampb)
  {
    if (parampb == null) {}
    do
    {
      return;
      parampb = d(parampb);
    } while (parampb == null);
    if (this.a == null)
    {
      this.a = new iy(parampb);
      return;
    }
    this.a.a(parampb);
  }
  
  private iz d(pb parampb)
  {
    if (parampb == null) {
      return null;
    }
    return new iz().a(parampb.k()).a(this.E, this.F).b(false).b((int)parampb.l()).d(this.B).a(true);
  }
  
  private void i()
  {
    iz localiz = new iz();
    if (this.a == null)
    {
      this.a = new iy(localiz);
      return;
    }
    this.a.a(localiz);
  }
  
  public void a(float paramFloat)
  {
    this.e = paramFloat;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.C = paramInt1;
    this.D = paramInt2;
    if (this.a != null)
    {
      b(true);
      GeoPoint localGeoPoint = new GeoPoint(this.D, this.C);
      this.a.a(localGeoPoint);
    }
  }
  
  protected void a(Bitmap paramBitmap)
  {
    synchronized (this.d)
    {
      this.j = (paramBitmap.hashCode() + P.getAndIncrement());
      if (this.j == null) {
        this.j = "";
      }
      if (this.a != null) {
        this.a.a(this.j, new Bitmap[] { paramBitmap });
      }
      this.l = paramBitmap.getWidth();
      this.m = paramBitmap.getHeight();
      return;
    }
  }
  
  public void a(kk paramkk)
  {
    this.A = paramkk;
    if (this.A != null)
    {
      this.A.a(this.S);
      this.A.a(this.T);
    }
  }
  
  public void a(om paramom)
  {
    this.z = paramom;
  }
  
  public void a(pb parampb)
  {
    if (parampb == null) {
      return;
    }
    this.y = parampb;
    a_(parampb.i());
    a(parampb.n());
    b(parampb.k());
    c(parampb);
  }
  
  public void a(GL10 paramGL10)
  {
    if (!a()) {}
    do
    {
      return;
      b(this.y);
      b(paramGL10);
      paramGL10 = this.w.getMap().y();
    } while ((paramGL10 == null) || (this.a == null));
    this.a.b(paramGL10, this.w.getMap().s());
  }
  
  public boolean a()
  {
    return this.N;
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    if ((!this.v) || (this.a == null)) {}
    while (this.a == null) {
      return false;
    }
    boolean bool = this.a.a(this.w.getMap().s(), paramFloat1, paramFloat2);
    Rect localRect = this.a.b(this.w.getMap().s());
    if ((bool == true) && (localRect != null))
    {
      this.G = ((int)paramFloat1 - localRect.left);
      this.H = ((int)paramFloat2 - localRect.top);
      return bool;
    }
    this.G = -1;
    this.H = -1;
    return bool;
  }
  
  public void a_(boolean paramBoolean)
  {
    this.N = paramBoolean;
  }
  
  public void b() {}
  
  public void b(float paramFloat)
  {
    this.q = paramFloat;
  }
  
  public void b(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return;
    }
    a(paramBitmap);
    e();
  }
  
  public void b(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }
  
  protected boolean b(GL10 paramGL10)
  {
    if (this.A != null)
    {
      this.A.c();
      if (this.A.b() == true) {
        this.w.getMap().a();
      }
      return true;
    }
    return false;
  }
  
  public void c() {}
  
  public void d()
  {
    this.w = null;
    this.n = null;
  }
  
  public void e()
  {
    synchronized (this.d)
    {
      if ((this.b != null) && (!this.b.isRecycled())) {
        this.c = true;
      }
      return;
    }
  }
  
  public void f()
  {
    if (this.o != null) {
      this.I = true;
    }
  }
  
  public boolean g()
  {
    if (this.A == null) {
      return false;
    }
    return this.A.a(this.n, this.p);
  }
  
  protected void h() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/kb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */