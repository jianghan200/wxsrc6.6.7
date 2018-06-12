package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sw
  implements sv
{
  private List<qw> a = new ArrayList();
  private int b;
  private int c;
  private qx d = null;
  private boolean e = true;
  private float f;
  private float g = 0.0F;
  private String h;
  private sl i;
  private sf j;
  
  public sw(sl paramsl, rb paramrb)
  {
    this.i = paramsl;
    this.j = paramsl.e();
    this.h = j();
    this.b = paramrb.d();
    b(paramrb.a());
    this.e = paramrb.f();
    this.f = paramrb.b();
    this.g = paramrb.e();
    this.c = paramrb.c();
  }
  
  private void b(List<qw> paramList)
  {
    qx.a locala = qx.a();
    this.a.clear();
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      paramList = null;
      while (localIterator.hasNext())
      {
        qw localqw = (qw)localIterator.next();
        if (!localqw.equals(paramList))
        {
          this.a.add(localqw);
          locala.a(localqw);
          paramList = localqw;
        }
      }
      int k = this.a.size();
      if ((k > 1) && (((qw)this.a.get(0)).equals((qw)this.a.get(k - 1)))) {
        this.a.remove(k - 1);
      }
    }
    this.d = locala.a();
  }
  
  public float a()
  {
    return this.f;
  }
  
  public void a(float paramFloat)
  {
    this.f = paramFloat;
    this.i.a(false, false);
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
    this.i.a(false, false);
  }
  
  public void a(Canvas paramCanvas)
  {
    if ((this.a == null) || (this.a.size() == 0)) {}
    Path localPath;
    Object localObject;
    do
    {
      return;
      localPath = new Path();
      localObject = (qw)this.a.get(0);
      new PointF();
      localObject = this.i.b().a((qw)localObject);
      localPath.moveTo(((PointF)localObject).x, ((PointF)localObject).y);
      int k = 1;
      while (k < this.a.size())
      {
        localObject = (qw)this.a.get(k);
        new PointF();
        localObject = this.i.b().a((qw)localObject);
        localPath.lineTo(((PointF)localObject).x, ((PointF)localObject).y);
        k += 1;
      }
      localObject = new Paint();
      ((Paint)localObject).setColor(b());
      ((Paint)localObject).setAntiAlias(true);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      localPath.close();
      paramCanvas.drawPath(localPath, (Paint)localObject);
    } while (sz.a(a(), 0.0F));
    ((Paint)localObject).setStyle(Paint.Style.STROKE);
    ((Paint)localObject).setColor(d());
    ((Paint)localObject).setStrokeWidth(a());
    paramCanvas.drawPath(localPath, (Paint)localObject);
  }
  
  public void a(List<qw> paramList)
  {
    b(paramList);
    this.i.a(false, false);
  }
  
  public boolean a(qw paramqw)
  {
    return sz.a(paramqw, c());
  }
  
  public boolean a(sv paramsv)
  {
    return (equals(paramsv)) || (paramsv.j().equals(j()));
  }
  
  public int b()
  {
    return this.b;
  }
  
  public void b(float paramFloat)
  {
    this.g = paramFloat;
    this.j.c();
    this.i.a(false, false);
  }
  
  public void b(int paramInt)
  {
    this.c = paramInt;
    this.i.a(false, false);
  }
  
  public void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
    this.i.a(false, false);
  }
  
  public List<qw> c()
  {
    return this.a;
  }
  
  public int d()
  {
    return this.c;
  }
  
  public boolean h()
  {
    if (this.d == null) {}
    qx localqx;
    do
    {
      return false;
      localqx = this.i.b().c();
      if (localqx == null) {
        return true;
      }
    } while ((!this.d.a(localqx)) && (!this.d.b(localqx)));
    return true;
  }
  
  public void i()
  {
    this.j.b(j());
  }
  
  public String j()
  {
    if (this.h == null) {
      this.h = sf.a("Polygon");
    }
    return this.h;
  }
  
  public float k()
  {
    return this.g;
  }
  
  public boolean l()
  {
    return this.e;
  }
  
  public int m()
  {
    return super.hashCode();
  }
  
  public void n() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/sw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */