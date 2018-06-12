package com.tencent.mm.ak.a.b;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.tencent.mm.ak.a.c.m;
import com.tencent.mm.ak.a.d.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class f
  implements m
{
  private a<String, Bitmap> dYe = new a(50);
  private a<String, Bitmap> dYf = new a(10);
  
  public final void clear()
  {
    Bitmap localBitmap;
    try
    {
      if (this.dYe != null)
      {
        Object localObject1 = this.dYe.snapshot();
        if ((!((Map)localObject1).isEmpty()) && (((Map)localObject1).size() > 0))
        {
          localObject1 = ((Map)localObject1).entrySet().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localBitmap = (Bitmap)((Map.Entry)((Iterator)localObject1).next()).getValue();
            if ((localBitmap != null) && (!localBitmap.isRecycled())) {
              x.i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "recycle bitmap:%s, not need", new Object[] { localBitmap.toString() });
            }
          }
        }
        this.dYe.clear();
      }
    }
    finally {}
    if (this.dYf != null)
    {
      Object localObject3 = this.dYf.snapshot();
      if ((!((Map)localObject3).isEmpty()) && (((Map)localObject3).size() > 0))
      {
        localObject3 = ((Map)localObject3).entrySet().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localBitmap = (Bitmap)((Map.Entry)((Iterator)localObject3).next()).getValue();
          if ((localBitmap != null) && (!localBitmap.isRecycled())) {
            x.i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "recycle bitmap:%s. not need", new Object[] { localBitmap.toString() });
          }
        }
      }
      this.dYf.clear();
    }
  }
  
  public final void d(String paramString, Bitmap paramBitmap)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put failed. key is null.");
      return;
    }
    if (paramBitmap == null)
    {
      x.w("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put failed.value is null.");
      return;
    }
    Bitmap localBitmap;
    long l;
    if ((paramBitmap != null) && ((paramBitmap instanceof Bitmap)))
    {
      localBitmap = (Bitmap)paramBitmap;
      if (Build.VERSION.SDK_INT >= 12) {
        l = localBitmap.getByteCount();
      }
    }
    for (;;)
    {
      x.d("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put key:%s,bitmap size:%d B newsize:%s", new Object[] { paramString, Long.valueOf(l), bi.bF(l) });
      if (l <= 524288L) {
        break;
      }
      this.dYf.put(paramString, paramBitmap);
      return;
      int i = localBitmap.getRowBytes();
      l = localBitmap.getHeight() * i;
      continue;
      l = 0L;
    }
    this.dYe.put(paramString, paramBitmap);
  }
  
  public final Bitmap jz(String paramString)
  {
    if (!bi.oW(paramString))
    {
      if (this.dYe.get(paramString) == null) {
        return (Bitmap)this.dYf.get(paramString);
      }
      return (Bitmap)this.dYe.get(paramString);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ak/a/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */