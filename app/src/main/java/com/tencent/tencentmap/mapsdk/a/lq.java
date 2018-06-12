package com.tencent.tencentmap.mapsdk.a;

import android.view.View;
import com.tencent.map.lib.f;

public class lq
{
  private ks a = null;
  private lm b = null;
  private lo c;
  
  public lq(View paramView)
  {
    this.a = ((ks)paramView);
  }
  
  public lp a(nj paramnj, boolean paramBoolean)
  {
    if (this.a == null) {
      return null;
    }
    this.b = new lm(this.a, this.c, paramnj, paramBoolean);
    this.b.c = true;
    this.b.c(Float.NEGATIVE_INFINITY);
    this.b.c();
    this.a.a(this.b);
    this.a.getMap().a();
    return new lp(this.b, this, this.b.v());
  }
  
  public void a(lo paramlo)
  {
    this.c = paramlo;
  }
  
  public void a(String paramString)
  {
    if (this.a == null) {
      return;
    }
    this.a.b(paramString, true);
    this.a.getMap().a();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/lq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */