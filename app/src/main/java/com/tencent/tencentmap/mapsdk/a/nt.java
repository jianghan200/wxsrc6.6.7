package com.tencent.tencentmap.mapsdk.a;

import android.view.View;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.f;

public final class nt
  extends nx
  implements od
{
  private ks a = null;
  
  public nt(View paramView)
  {
    this.a = ((ks)paramView);
    if (this.a.a(ka.class) == null) {
      this.a.a(ka.class, this);
    }
  }
  
  final os a(ot paramot, ns paramns)
  {
    if (this.a == null) {}
    ka localka;
    do
    {
      return null;
      localka = new ka(this.a);
      localka.a(paramot);
      localka.c();
    } while (!this.a.a(localka));
    this.a.getMap().a();
    paramot = new os(paramot, paramns, localka.v());
    localka.a(paramot);
    return paramot;
  }
  
  public final void a()
  {
    this.a.b(ka.class);
    this.a = null;
  }
  
  final void a(String paramString)
  {
    if (this.a == null) {
      return;
    }
    synchronized (this.a.e)
    {
      paramString = this.a.b(paramString, false);
      if ((paramString == null) || (!(paramString instanceof ka))) {
        return;
      }
    }
    paramString.d();
    this.a.getMap().a();
  }
  
  final void a(String paramString, double paramDouble)
  {
    if (this.a == null) {
      return;
    }
    synchronized (this.a.e)
    {
      paramString = this.a.a(paramString);
      if (paramString == null) {
        return;
      }
    }
    if (!(paramString instanceof ka)) {
      return;
    }
    ((ka)paramString).a(paramDouble);
    this.a.getMap().a();
  }
  
  final void a(String paramString, float paramFloat)
  {
    if (this.a == null) {
      return;
    }
    synchronized (this.a.e)
    {
      paramString = this.a.a(paramString);
      if (paramString == null) {
        return;
      }
    }
    if (!(paramString instanceof ka)) {
      return;
    }
    ((ka)paramString).d(paramFloat);
    this.a.getMap().a();
  }
  
  final void a(String paramString, int paramInt)
  {
    if (this.a == null) {
      return;
    }
    synchronized (this.a.e)
    {
      paramString = this.a.a(paramString);
      if (paramString == null) {
        return;
      }
    }
    if (!(paramString instanceof ka)) {
      return;
    }
    ((ka)paramString).c(paramInt);
    this.a.getMap().a();
  }
  
  final void a(String paramString, ox paramox)
  {
    if (this.a == null) {}
    while (paramox == null) {
      return;
    }
    synchronized (this.a.e)
    {
      paramString = this.a.a(paramString);
      if (paramString == null) {
        return;
      }
    }
    if (!(paramString instanceof ka)) {
      return;
    }
    ((ka)paramString).a(kh.a(paramox));
    this.a.getMap().a();
  }
  
  final void a(String paramString, boolean paramBoolean)
  {
    if (this.a == null) {
      return;
    }
    synchronized (this.a.e)
    {
      paramString = this.a.a(paramString);
      if (paramString == null) {
        return;
      }
    }
    if (!(paramString instanceof ka)) {
      return;
    }
    ((ka)paramString).a_(paramBoolean);
    this.a.getMap().a();
  }
  
  public final boolean a(ke paramke, boolean paramBoolean, GeoPoint paramGeoPoint)
  {
    return false;
  }
  
  final void b()
  {
    if (this.a != null) {
      this.a.c(ka.class);
    }
  }
  
  final void b(String paramString, float paramFloat)
  {
    if (this.a == null) {
      return;
    }
    ke localke = this.a.a(paramString);
    if (localke != null) {
      localke.c(paramFloat);
    }
    this.a.a(paramString, paramFloat);
    this.a.getMap().a();
  }
  
  final void b(String paramString, int paramInt)
  {
    if (this.a == null) {
      return;
    }
    synchronized (this.a.e)
    {
      paramString = this.a.a(paramString);
      if (paramString == null) {
        return;
      }
    }
    if (!(paramString instanceof ka)) {
      return;
    }
    ((ka)paramString).b(paramInt);
    this.a.getMap().a();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/nt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */