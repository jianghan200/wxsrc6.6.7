package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.concurrent.Callable;

public final class tp
  implements Callable<Bitmap>
{
  private a a;
  private Bitmap b = null;
  private td c;
  private boolean d = false;
  private tf e = null;
  
  public tp(a parama, td paramtd)
  {
    this.a = parama;
    this.c = paramtd;
  }
  
  private Bitmap d()
  {
    if (this.a != null) {
      this.a.b(this);
    }
    try
    {
      this.b = f();
      Bitmap localBitmap = this.b;
      return localBitmap;
    }
    finally
    {
      e();
    }
  }
  
  private void e()
  {
    if (this.a != null) {
      this.a.a(this);
    }
    this.a = null;
    if ((this.b != null) && (!this.b.isRecycled())) {
      this.b.recycle();
    }
    this.b = null;
  }
  
  private Bitmap f()
  {
    int i = 0;
    Object localObject2 = null;
    if (i < 4) {
      localObject5 = localObject2;
    }
    do
    {
      do
      {
        for (;;)
        {
          Object localObject6;
          Object localObject1;
          int j;
          try
          {
            localObject6 = this.c;
            localObject5 = localObject2;
            boolean bool = this.d;
            localObject5 = localObject2;
            if (this.e != null)
            {
              localObject5 = localObject2;
              localObject1 = this.e.a();
              localObject5 = localObject2;
              localObject6 = ((td)localObject6).a(bool, (String)localObject1);
              localObject1 = localObject2;
              if (localObject6 == null) {
                continue;
              }
              localObject5 = localObject2;
              if ((localObject6.length != 1) || (localObject6[0] != -1)) {
                continue;
              }
              localObject5 = localObject2;
              if (!this.d) {
                continue;
              }
              localObject5 = localObject2;
              te.a().a(this.c, null, true);
              localObject5 = localObject2;
              if (this.e != null)
              {
                localObject5 = localObject2;
                if (this.e.b() != null)
                {
                  localObject5 = localObject2;
                  sl.e += 1;
                  localObject5 = localObject2;
                  sl.a += 1;
                  localObject5 = localObject2;
                  localObject1 = this.e.b();
                  localObject5 = localObject1;
                  return (Bitmap)localObject5;
                }
              }
            }
            else
            {
              localObject1 = null;
              continue;
            }
            return null;
          }
          catch (Exception localException1) {}
          try
          {
            localObject1 = BitmapFactory.decodeByteArray((byte[])localObject6, 0, localObject6.length);
            if (localObject1 == null) {}
          }
          catch (Exception localException5)
          {
            Exception localException2 = localException4;
            Object localObject4 = localException5;
            continue;
            continue;
          }
          try
          {
            if (this.d)
            {
              sl.f += 1;
              sl.c += 1;
            }
            j = localObject6.length;
            if (j < 2097152)
            {
              try
              {
                localObject2 = new tf((byte[])localObject6, this.c.l());
                te.a().a((tf)localObject2, this.c);
                localObject5 = localObject1;
                if (localObject1 != null) {
                  continue;
                }
                if (i != 0) {
                  continue;
                }
                localObject5 = localObject1;
                Thread.sleep(300L);
                localObject5 = localObject1;
                new StringBuilder().append(this.c.l()).append(",重试次数：2");
                localObject2 = localObject1;
                i += 1;
              }
              catch (Throwable localThrowable)
              {
                if (tz.n() == null) {
                  break label748;
                }
              }
              tz.n().a("TileNetFetcher downLoad function occured exception when call CacheManager Put,the downloaded data length-" + localObject6.length + ";tileInfo:x=" + this.c.b() + ",y=" + this.c.c() + "z=" + this.c.d() + "exceptionInfo:" + localThrowable.toString());
              break label748;
            }
            if (tz.n() != null) {
              tz.n().a("TileNetFetcher downLoad function,the downloaded data length-" + localObject6.length + ";tileInfo:x=" + this.c.b() + ",y=" + this.c.c() + "z=" + this.c.d());
            }
            continue;
            try
            {
              new StringBuilder("decoder bitmap error:").append(localException3.getMessage());
            }
            catch (Exception localException4)
            {
              for (;;)
              {
                Object localObject3;
                localObject5 = localException1;
                localException2 = localException4;
              }
            }
          }
          catch (Exception localException3) {}
          if (i == 1)
          {
            localObject5 = localObject1;
            Thread.sleep(500L);
            localObject5 = localObject1;
            new StringBuilder().append(this.c.l()).append(",重试次数3");
            localObject3 = localObject1;
            continue;
            new StringBuilder("Error occured:").append(localException1.getMessage());
            localObject3 = localObject5;
          }
          else
          {
            localObject3 = localException1;
            if (i == 2)
            {
              localObject5 = localException1;
              Thread.sleep(700L);
              localObject5 = localException1;
              new StringBuilder().append(this.c.l()).append(",重试次数4");
              localObject3 = localException1;
            }
          }
        }
        localObject5 = localObject3;
      } while (this.c.e().getClass() != tm.class);
      localObject5 = localObject3;
    } while (localObject3 != null);
    new StringBuilder().append(this.c.l()).append(",重试4次，仍然失败");
    return (Bitmap)localObject3;
  }
  
  public final Bitmap a()
  {
    return this.b;
  }
  
  public final void a(tf paramtf)
  {
    this.e = paramtf;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public final String b()
  {
    if (this.c != null) {
      return this.c.toString();
    }
    return "";
  }
  
  public final void c()
  {
    if (this.b != null) {
      this.b.recycle();
    }
    this.b = null;
  }
  
  public static abstract interface a
  {
    public abstract void a(tp paramtp);
    
    public abstract void b(tp paramtp);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/tp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */