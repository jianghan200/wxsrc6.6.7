package com.tencent.tencentmap.mapsdk.a;

import android.os.Handler;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.f;
import com.tencent.map.lib.gl.JNICallback.e;
import java.util.ArrayList;
import java.util.List;

public class oj
  implements JNICallback.e, he
{
  ov a = null;
  private ks b = null;
  private ac.f c = null;
  private Handler d = new Handler();
  private boolean e = false;
  
  public oj(ks paramks)
  {
    this.b = paramks;
    if ((paramks != null) && (paramks.getMap() != null))
    {
      paramks = paramks.getMap();
      paramks.a(this);
      paramks.a(this);
    }
  }
  
  private void a(String paramString, String[] paramArrayOfString, int paramInt)
  {
    int i = 0;
    if (this.b == null) {}
    label208:
    do
    {
      do
      {
        for (;;)
        {
          return;
          Object localObject = this.b.getMap();
          int j = ((f)localObject).c();
          if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0) || (paramInt < 0) || (j < 16)) {
            break label208;
          }
          if ((this.c != null) && (!this.e))
          {
            this.e = true;
            this.c.a();
          }
          ((f)localObject).e(22);
          if (this.c != null)
          {
            localObject = new ArrayList();
            if (paramArrayOfString != null)
            {
              j = paramArrayOfString.length;
              while (i < j)
              {
                ((List)localObject).add(new ow(paramArrayOfString[i]));
                i += 1;
              }
            }
          }
          try
          {
            if ((this.a != null) && (this.a.a().equals(paramString)))
            {
              i = this.a.c();
              if (i == paramInt) {
                continue;
              }
            }
          }
          catch (Exception paramArrayOfString)
          {
            for (;;) {}
          }
        }
        this.a = new ov(paramString, (List)localObject, paramInt);
        this.c.a(this.a);
        return;
        ((f)localObject).e(Math.min(ic.a.a, j));
      } while (!this.e);
      this.e = false;
      this.a = null;
    } while (this.c == null);
    this.c.b();
  }
  
  public void a(ac.f paramf)
  {
    this.c = paramf;
  }
  
  public void a(ic.c paramc)
  {
    if ((this.b == null) || (this.b.getMap() == null) || (this.b.getIndoorFloorControlManager() == null)) {
      return;
    }
    if ((this.b.getMap().h() >= 18) && (this.e))
    {
      this.b.getIndoorFloorControlManager().a(true);
      return;
    }
    this.b.getIndoorFloorControlManager().a(false);
  }
  
  public boolean a()
  {
    return this.e;
  }
  
  public void z()
  {
    int i = 0;
    if ((this.b == null) || (this.b.getMap() == null)) {
      return;
    }
    f localf = this.b.getMap();
    String str = localf.c(new GeoPoint(0, 0));
    String[] arrayOfString = localf.x();
    int j = localf.w();
    if ((arrayOfString != null) && (arrayOfString.length <= j)) {}
    for (;;)
    {
      this.d.post(new oj.1(this, str, arrayOfString, i));
      return;
      i = j;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/oj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */