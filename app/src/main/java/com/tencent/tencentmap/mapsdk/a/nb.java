package com.tencent.tencentmap.mapsdk.a;

import android.view.View;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.f;
import java.util.ArrayList;
import java.util.List;

public final class nb
  extends of
  implements od
{
  private ks a = null;
  private ac.o b = null;
  
  public nb(View paramView)
  {
    this.a = ((ks)paramView);
    if (this.a.a(kg.class) == null) {
      this.a.a(kg.class, this);
    }
  }
  
  final pf a(pg parampg, na paramna)
  {
    if (this.a == null) {}
    kg localkg;
    do
    {
      return null;
      localkg = new kg(this.a);
      localkg.a(parampg);
      localkg.c();
    } while (!this.a.a(localkg));
    this.a.getMap().a();
    parampg = new pf(parampg, paramna, localkg.v());
    localkg.a(parampg);
    return parampg;
  }
  
  public final void a()
  {
    this.a.b(kg.class);
    this.a = null;
  }
  
  final void a(String paramString)
  {
    if (this.a == null) {
      return;
    }
    this.a.b(paramString, true);
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
    if (!(paramString instanceof kg)) {
      return;
    }
    paramString = (kg)paramString;
    paramString.d(paramFloat);
    paramString.c();
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
    paramString.b(paramInt);
    paramString.c();
    this.a.getMap().a();
  }
  
  final void a(String paramString, List<ox> paramList)
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
    if (!(paramString instanceof kg)) {
      return;
    }
    paramString = (kg)paramString;
    try
    {
      paramString.a(paramList);
      paramString.c();
      this.a.getMap().a();
      return;
    }
    catch (IndexOutOfBoundsException paramList)
    {
      for (;;) {}
    }
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
    paramString.a_(paramBoolean);
    paramString.c();
    this.a.getMap().a();
  }
  
  public final boolean a(ke paramke, boolean paramBoolean, GeoPoint paramGeoPoint)
  {
    paramke = (kg)paramke;
    paramBoolean = paramke.f().i();
    if ((this.b != null) && (paramBoolean))
    {
      paramGeoPoint = kh.a(paramGeoPoint);
      this.b.a(paramke.f(), paramGeoPoint);
      return true;
    }
    return false;
  }
  
  final List<iw> b(String paramString)
  {
    synchronized (this.a.e)
    {
      paramString = this.a.a(paramString);
      if ((paramString == null) || (!(paramString instanceof kg))) {
        return null;
      }
      paramString = (kg)paramString;
      ??? = new ArrayList(1);
      ((List)???).add(paramString.g());
      return (List<iw>)???;
    }
  }
  
  final void b()
  {
    if (this.a != null) {
      this.a.c(kg.class);
    }
  }
  
  final void b(String paramString, float paramFloat)
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
    if (!(paramString instanceof kg)) {
      return;
    }
    paramString = (kg)paramString;
    paramString.c(paramFloat);
    paramString.c();
    this.a.getMap().a();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/nb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */