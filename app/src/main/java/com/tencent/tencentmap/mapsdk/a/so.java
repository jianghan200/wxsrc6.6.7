package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;

public class so
  implements sv
{
  private qw a = null;
  private double b = 0.0D;
  private float c = 10.0F;
  private int d = -16777216;
  private int e = 0;
  private float f = 0.0F;
  private boolean g = true;
  private boolean h = false;
  private DashPathEffect i = null;
  private DashPathEffect j;
  private String k;
  private sl l;
  private sf m;
  
  public so(sl paramsl, qu paramqu)
  {
    this.l = paramsl;
    this.m = paramsl.e();
    this.k = j();
    this.e = paramqu.e();
    this.a = paramqu.a();
    this.g = paramqu.g();
    this.c = paramqu.c();
    this.f = paramqu.f();
    this.d = paramqu.d();
    this.b = paramqu.b();
    this.h = paramqu.h();
    this.i = paramqu.i();
    this.j = new DashPathEffect(new float[] { this.c, this.c }, 0.0F);
  }
  
  public qw a()
  {
    return this.a;
  }
  
  public void a(double paramDouble)
  {
    this.b = paramDouble;
    this.l.a(false, false);
  }
  
  public void a(float paramFloat)
  {
    this.c = paramFloat;
    this.j = new DashPathEffect(new float[] { this.c, this.c }, 0.0F);
    this.l.a(false, false);
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
    this.l.a(false, false);
  }
  
  public void a(Canvas paramCanvas)
  {
    if ((a() == null) || (this.b <= 0.0D) || (!l())) {}
    float f1;
    PointF localPointF;
    Paint localPaint;
    do
    {
      return;
      f1 = this.l.b().a(this.a.b(), (float)b());
      localPointF = this.l.b().a(this.a);
      localPaint = new Paint();
      localPaint.setColor(e());
      localPaint.setAntiAlias(true);
      localPaint.setStyle(Paint.Style.FILL);
      paramCanvas.drawCircle(localPointF.x, localPointF.y, f1, localPaint);
    } while (sz.a(c(), 0.0F));
    if (this.h)
    {
      if (this.i != null) {
        break label187;
      }
      localPaint.setPathEffect(this.j);
    }
    for (;;)
    {
      localPaint.setColor(d());
      localPaint.setStyle(Paint.Style.STROKE);
      localPaint.setStrokeWidth(c());
      paramCanvas.drawCircle(localPointF.x, localPointF.y, f1, localPaint);
      return;
      label187:
      localPaint.setPathEffect(this.i);
    }
  }
  
  public void a(DashPathEffect paramDashPathEffect)
  {
    this.i = paramDashPathEffect;
  }
  
  public void a(qw paramqw)
  {
    this.a = paramqw;
    this.l.a(false, false);
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public boolean a(sv paramsv)
  {
    return (equals(paramsv)) || (paramsv.j().equals(j()));
  }
  
  public double b()
  {
    return this.b;
  }
  
  public void b(float paramFloat)
  {
    this.f = paramFloat;
    this.m.c();
    this.l.a(false, false);
  }
  
  public void b(int paramInt)
  {
    this.e = paramInt;
    this.l.a(false, false);
  }
  
  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
    this.l.a(false, false);
  }
  
  public boolean b(qw paramqw)
  {
    return this.b >= rv.a(this.a, paramqw);
  }
  
  public float c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public boolean f()
  {
    return this.h;
  }
  
  public DashPathEffect g()
  {
    return this.i;
  }
  
  public boolean h()
  {
    return true;
  }
  
  public void i()
  {
    this.m.b(j());
  }
  
  public String j()
  {
    if (this.k == null) {
      this.k = sf.a("Circle");
    }
    return this.k;
  }
  
  public float k()
  {
    return this.f;
  }
  
  public boolean l()
  {
    return this.g;
  }
  
  public int m()
  {
    return 0;
  }
  
  public void n()
  {
    this.a = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/so.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */