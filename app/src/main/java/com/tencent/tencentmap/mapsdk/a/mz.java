package com.tencent.tencentmap.mapsdk.a;

import android.view.View;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.f;
import java.util.ArrayList;
import java.util.List;

public class mz
  extends oe
{
  private ks a = null;
  
  public mz(View paramView)
  {
    this.a = ((ks)paramView);
  }
  
  private ArrayList<GeoPoint> a(List<ox> paramList)
  {
    if (paramList == null) {}
    int j;
    do
    {
      return null;
      j = paramList.size();
    } while (j <= 0);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < j)
    {
      Object localObject = (ox)paramList.get(i);
      if (localObject != null)
      {
        localObject = kh.a((ox)localObject);
        if (localObject != null) {
          localArrayList.add(localObject);
        }
      }
      i += 1;
    }
    return localArrayList;
  }
  
  pd a(pe parampe, my parammy)
  {
    if (this.a == null) {}
    kf localkf;
    do
    {
      return null;
      localkf = new kf(this.a, parampe);
      localkf.a(parampe);
      localkf.c();
    } while (!this.a.a(localkf));
    this.a.getMap().a();
    return new pd(parampe, parammy, localkf.v());
  }
  
  public void a()
  {
    this.a = null;
  }
  
  void a(String paramString)
  {
    if (this.a == null) {
      return;
    }
    this.a.b(paramString, true);
    this.a.getMap().a();
  }
  
  void a(String paramString, float paramFloat)
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
    paramString.d(paramFloat);
    this.a.getMap().a();
  }
  
  void a(String paramString, int paramInt)
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
    paramString.c(paramInt);
    this.a.getMap().a();
  }
  
  void a(String paramString, List<ox> paramList)
  {
    synchronized (this.a.e)
    {
      paramString = this.a.a(paramString);
      if (paramString == null) {
        return;
      }
      if (!(paramString instanceof kf)) {
        return;
      }
    }
    paramString = (kf)paramString;
    paramString.a(a(paramList));
    paramString.c();
    this.a.getMap().a();
  }
  
  void a(String paramString, boolean paramBoolean)
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
    this.a.getMap().a();
  }
  
  void b()
  {
    if (this.a != null) {
      this.a.c(kf.class);
    }
  }
  
  void b(String paramString, float paramFloat)
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
    paramString.c(paramFloat);
    this.a.getMap().a();
  }
  
  void b(String paramString, int paramInt)
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
    this.a.getMap().a();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/mz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */