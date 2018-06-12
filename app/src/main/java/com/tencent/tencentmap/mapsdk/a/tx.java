package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Canvas;
import android.view.MotionEvent;

public class tx
  implements sv
{
  protected boolean a = true;
  protected float b = 0.0F;
  protected sl c;
  protected tw d;
  protected sf e;
  protected String f = j();
  
  public void a() {}
  
  public void a(Canvas paramCanvas)
  {
    a(paramCanvas, this.d);
  }
  
  protected void a(Canvas paramCanvas, tw paramtw) {}
  
  public void a(qv paramqv) {}
  
  public boolean a(MotionEvent paramMotionEvent, tw paramtw)
  {
    return false;
  }
  
  public boolean a(qv paramqv, MotionEvent paramMotionEvent, tw paramtw)
  {
    return false;
  }
  
  public boolean a(qv paramqv, tw paramtw)
  {
    return false;
  }
  
  public boolean a(sv paramsv)
  {
    return (equals(paramsv)) || (paramsv.j().equals(j()));
  }
  
  public void b(float paramFloat)
  {
    this.b = paramFloat;
    this.e.c();
    this.c.a(false, false);
  }
  
  public void b(boolean paramBoolean)
  {
    this.a = paramBoolean;
    this.c.a(false, false);
  }
  
  public boolean h()
  {
    return false;
  }
  
  public void i()
  {
    this.e.b(j());
    a();
  }
  
  public String j()
  {
    if (this.f == null) {
      this.f = sf.a("Overlay");
    }
    return this.f;
  }
  
  public float k()
  {
    return this.b;
  }
  
  public boolean l()
  {
    return this.a;
  }
  
  public int m()
  {
    return 0;
  }
  
  public void n() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/tx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */