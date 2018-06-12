package com.tencent.mm.graphics.b;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b
  implements a
{
  private Context diZ;
  private List<Double> dja = new ArrayList(100);
  private int djb = 0;
  public double djc = 0.0D;
  public double djd = 0.0D;
  public double dje = 2.147483647E9D;
  public double djf = 0.0D;
  public double djg = 0.0D;
  
  static
  {
    if (!b.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  public b(Context paramContext)
  {
    this.diZ = paramContext;
    this.djc = bz(paramContext);
    x.v("MicroMsg.MemoryRecord", "hy: init mem to " + this.djc);
  }
  
  private static double bz(Context paramContext)
  {
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
    assert (paramContext != null);
    paramContext.getMemoryInfo(localMemoryInfo);
    return (localMemoryInfo.totalMem - localMemoryInfo.availMem) / 1024.0D / 1024.0D;
  }
  
  public final void Cj()
  {
    this.djb = this.dja.size();
    if (this.djb == 0)
    {
      x.w("MicroMsg.MemoryRecord", "hy: check frames 0!");
      return;
    }
    Iterator localIterator = this.dja.iterator();
    Double localDouble1 = Double.valueOf(0.0D);
    Double localDouble2;
    while (localIterator.hasNext())
    {
      localDouble2 = (Double)localIterator.next();
      localDouble1 = Double.valueOf(localDouble1.doubleValue() + localDouble2.doubleValue());
      this.djd = Math.max(this.djd, localDouble2.doubleValue());
      this.dje = Math.min(this.dje, localDouble2.doubleValue());
    }
    localDouble1 = Double.valueOf(localDouble1.doubleValue() / this.djb);
    this.djg = (localDouble1.doubleValue() - this.djc);
    this.djd -= this.djc;
    this.dje -= this.djc;
    localIterator = this.dja.iterator();
    double d;
    for (long l = 0L; localIterator.hasNext(); l = (Math.pow(localDouble2.doubleValue() - localDouble1.doubleValue(), 2.0D) + d))
    {
      localDouble2 = (Double)localIterator.next();
      d = l;
    }
    this.djf = Math.sqrt(l / this.djb);
  }
  
  public final void Ck()
  {
    if (this.dja == null) {}
    while ((this.dja.size() > 10000) || (this.diZ == null)) {
      return;
    }
    double d = bz(this.diZ);
    this.djc = Math.min(d, this.djc);
    if (this.djc == d) {
      x.v("MicroMsg.MemoryRecord", "hy: updating min mem to " + this.djc);
    }
    this.dja.add(Double.valueOf(d));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/graphics/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */