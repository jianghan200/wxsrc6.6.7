package com.tencent.mm.plugin.appbrand.widget.e;

import com.tencent.mm.plugin.appbrand.compat.a.b.f;

public final class g
{
  public static double gMF = 6378137.0D;
  final double gMG = 6.283185307179586D * gMF;
  
  public final f c(b.f paramf)
  {
    double d1 = paramf.adH() / 360.0D;
    double d2 = Math.sin(Math.toRadians(paramf.adG()));
    d2 = Math.log((1.0D + d2) / (1.0D - d2)) * 0.5D / -6.283185307179586D;
    return new f((d1 + 0.5D) * this.gMG, (d2 + 0.5D) * this.gMG);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */