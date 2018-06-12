package c.t.m.g;

import android.location.Location;
import java.util.List;

public final class cr
{
  public final ct a;
  public volatile boolean b;
  public cs c;
  public dp d;
  public List<dp> e;
  public dt f;
  public dq g;
  public Location h;
  
  public cr(ct paramct)
  {
    this.a = paramct;
    this.b = false;
  }
  
  public final void a()
  {
    this.e = null;
    this.d = null;
    this.g = null;
    this.g = null;
  }
  
  public final boolean b()
  {
    if (this.g != null)
    {
      dq localdq = this.g;
      if ((localdq.a != null) && (localdq.a.getAltitude() != 0.0D) && (System.currentTimeMillis() - localdq.b <= 10000L)) {}
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final void c()
  {
    if (!b()) {}
    do
    {
      return;
      if ((this.e == null) || (this.e.size() == 0)) {
        this.e = ec.a(this.a);
      }
    } while ((this.e == null) || (this.e.size() == 0));
    if (this.c != null) {
      this.c.a(this.g, null, this.e);
    }
    if (this.h == null)
    {
      this.h = new Location(this.g.a);
      return;
    }
    this.h.set(this.g.a);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/c/t/m/g/cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */