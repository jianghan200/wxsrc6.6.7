package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View;
import java.util.List;
import java.util.Vector;

public final class sh
  extends View
{
  private sl a;
  private si b;
  private boolean c = false;
  private volatile boolean d = false;
  private List<Runnable> e = new Vector();
  private rs f;
  private ru g = null;
  private PointF h = null;
  private tz.f i;
  private final Handler j = new sh.1(this);
  private rn k;
  private rm l;
  
  public sh(sl paramsl)
  {
    super(sl.a());
    this.a = paramsl;
    this.b = paramsl.b();
    this.f = new rs(10.0D);
    if ((paramsl.f().a() >= 3) && (paramsl.f().b() > 1.0F)) {
      this.f.a(1.3D);
    }
    this.g = rv.a(new qw(39.91669D, 116.39716D));
    this.h = new PointF(getWidth() / 2, getHeight() / 2);
    sz.a(this, 2);
  }
  
  private ru a(int paramInt1, int paramInt2)
  {
    return new ru(this.g.b() + paramInt1 * this.f.d(), this.g.a() - paramInt2 * this.f.d());
  }
  
  private void a(rs paramrs, PointF paramPointF)
  {
    double d1 = getWidth() / 2.0D;
    double d2 = getHeight() / 2.0D;
    double d3 = this.g.b();
    double d4 = paramPointF.x;
    double d5 = this.f.d();
    double d6 = paramPointF.x;
    double d7 = paramrs.d();
    double d8 = this.g.a();
    double d9 = paramPointF.y;
    double d10 = this.f.d();
    double d11 = paramPointF.y;
    double d12 = paramrs.d();
    this.g.b(d3 + ((d4 - d1) * d5 + (d1 - d6) * d7));
    this.g.a(d8 - ((d9 - d2) * d10 + (d2 - d11) * d12));
    this.h.x = ((int)d1);
    this.h.y = ((int)d2);
    this.f.b(paramrs.c());
    this.b.a(this.g);
    this.a.a(false, false);
  }
  
  private void b(double paramDouble, PointF paramPointF, boolean paramBoolean, long paramLong, tt paramtt)
  {
    a(paramDouble, paramPointF, paramBoolean, paramLong, rl.a.c, paramtt);
  }
  
  private PointF e()
  {
    return new PointF(getWidth() / 2, getHeight() / 2);
  }
  
  public final PointF a()
  {
    return this.h;
  }
  
  public final void a(double paramDouble, PointF paramPointF)
  {
    double d1 = this.f.b();
    a(this.b.a(new rs(this.f.a(), d1 * paramDouble)), paramPointF);
  }
  
  public final void a(double paramDouble, PointF paramPointF, boolean paramBoolean, long paramLong, rl.a parama, tt paramtt)
  {
    if (paramBoolean)
    {
      if (this.k != null) {
        this.k.b();
      }
      this.k = new rn(this.a, paramDouble, paramPointF, paramLong, paramtt);
      this.k.a(parama);
      this.k.a();
    }
    do
    {
      return;
      a(this.b.a(new rs(paramDouble)), paramPointF);
    } while (paramtt == null);
    paramtt.a();
  }
  
  public final void a(double paramDouble, PointF paramPointF, boolean paramBoolean, long paramLong, tt paramtt)
  {
    b(paramDouble, paramPointF, false, 0L, null);
  }
  
  public final void a(double paramDouble, PointF paramPointF, boolean paramBoolean, tt paramtt)
  {
    b(this.f.c() + paramDouble, paramPointF, paramBoolean, 500L, paramtt);
  }
  
  public final void a(double paramDouble, boolean paramBoolean, tt paramtt)
  {
    b(this.f.c() + paramDouble, e(), paramBoolean, 500L, paramtt);
  }
  
  public final void a(int paramInt1, int paramInt2, long paramLong, tt paramtt)
  {
    a(a(paramInt1, paramInt2), paramLong, paramtt);
  }
  
  public final void a(PointF paramPointF, boolean paramBoolean, tt paramtt)
  {
    b(1.0D + this.f.c(), paramPointF, true, 500L, null);
  }
  
  public final void a(ru paramru)
  {
    this.g = paramru;
    this.b.a(this.g);
    this.a.a(false, false);
  }
  
  public final void a(ru paramru, long paramLong, tt paramtt)
  {
    if (this.l != null) {
      this.l.b();
    }
    this.l = new rm(this.a, paramru, paramLong, paramtt);
    this.l.a();
  }
  
  public final void a(rw paramrw)
  {
    if ((!this.d) && (paramrw.a()))
    {
      this.e.add(new sh.2(this, paramrw));
      return;
    }
    paramrw.a(this.a);
  }
  
  public final void a(tz.f paramf)
  {
    this.i = paramf;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.c = true;
  }
  
  public final void a(boolean paramBoolean, tt paramtt)
  {
    b(1.0D + this.f.c(), e(), paramBoolean, 500L, paramtt);
  }
  
  public final ru b()
  {
    return this.g;
  }
  
  public final void b(double paramDouble, boolean paramBoolean, tt paramtt)
  {
    b(paramDouble, e(), paramBoolean, 500L, paramtt);
  }
  
  public final void b(ru paramru)
  {
    a(paramru);
  }
  
  public final void b(boolean paramBoolean, tt paramtt)
  {
    b(this.f.c() - 1.0D, e(), paramBoolean, 500L, paramtt);
  }
  
  public final double c()
  {
    return this.f.c();
  }
  
  public final void clearAnimation()
  {
    super.clearAnimation();
    if (this.l != null) {
      this.l.b();
    }
    if (this.k != null) {
      this.k.b();
    }
  }
  
  public final rs d()
  {
    return this.f;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (!this.d)
    {
      this.j.sendEmptyMessage(11);
      this.d = true;
    }
    if (Build.VERSION.SDK_INT > 10) {
      paramCanvas.isHardwareAccelerated();
    }
    boolean bool = this.a.g().a(paramCanvas);
    this.a.e().a(paramCanvas);
    if (!sl.p())
    {
      Paint localPaint = new Paint();
      localPaint.setColor(-65536);
      localPaint.setTextSize(50.0F);
      Rect localRect = new Rect();
      int m = getWidth();
      int n = getHeight();
      localPaint.getTextBounds("鉴权失败，请到腾讯", 0, "鉴权失败，请到腾讯".length(), localRect);
      paramCanvas.drawText("鉴权失败，请到腾讯", m / 2 - localRect.width() / 2, n / 2 - localRect.height(), localPaint);
      localPaint.getTextBounds("地图官网申请密钥", 0, "地图官网申请密钥".length(), localRect);
      paramCanvas.drawText("地图官网申请密钥", m / 2 - localRect.width() / 2, n / 2 + 2, localPaint);
    }
    this.a.d(bool);
    if ((this.c) && (bool))
    {
      this.c = false;
      this.j.sendEmptyMessage(16);
    }
  }
  
  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.b.g() != 0.0D) && (this.b.h() != 0.0D))
    {
      this.b.b(this.b.g(), this.b.h());
      this.b.a(0);
      this.b.b(0);
    }
    this.h = new PointF(getWidth() / 2, getHeight() / 2);
    paramInt1 = rs.a;
    paramInt2 = Math.max(getWidth(), getHeight());
    while (256.0D * Math.pow(2.0D, paramInt1) < paramInt2) {
      paramInt1 += 1;
    }
    rs.a = paramInt1;
    if (this.b.j().a() < rs.a) {
      this.b.c(rs.a);
    }
    this.a.a(false, false);
  }
  
  public final void scrollBy(int paramInt1, int paramInt2)
  {
    a(a(paramInt1, paramInt2));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/sh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */