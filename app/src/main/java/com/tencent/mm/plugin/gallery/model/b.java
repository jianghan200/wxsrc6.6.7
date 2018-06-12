package com.tencent.mm.plugin.gallery.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.tencent.mm.a.f;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.Vector;

public final class b
{
  k<b, String> dHn = new b.1(this);
  public Vector<b> dHo = new Vector();
  f<String, a> jAp = new f(100, new b.3(this));
  d jAq;
  private final b jAr = new b()
  {
    public final void CR(String paramAnonymousString)
    {
      x.i("MicroMsg.GalleryCache", "now listener size : " + b.this.dHo.size());
      int i = b.this.dHo.size() - 1;
      for (;;)
      {
        if (i >= 0) {
          try
          {
            b.b localb = (b.b)b.this.dHo.get(i);
            if (localb == null)
            {
              x.d("MicroMsg.GalleryCache", "get listener is null");
              i -= 1;
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              x.e("MicroMsg.GalleryCache", "get wathcer failed:[%s]", new Object[] { localException.toString() });
              Object localObject = null;
              continue;
              ((b.b)localObject).CR(paramAnonymousString);
            }
          }
        }
      }
    }
  };
  
  public b()
  {
    d locald = new d(new File(e.bnE + "/diskcache"));
    locald.jAJ = ad.getContext().getSharedPreferences(ad.chY(), 0).getInt("com.tencent.mm.gallery.cache.suffix", 0);
    locald.aRn();
    locald.qo(-1);
    this.jAq = locald;
    this.dHn.a(this.jAr, null);
  }
  
  public final Bitmap getBitmap(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.GalleryCache", "null filepath");
      return null;
    }
    if (this.jAp == null)
    {
      x.w("MicroMsg.GalleryCache", "want to get bitmap, but gallery cache is null");
      return null;
    }
    if (this.jAp.bb(paramString))
    {
      Object localObject = (a)this.jAp.get(paramString);
      if (localObject == null)
      {
        x.d("MicroMsg.GalleryCache", "weakreference is null");
        this.jAp.remove(paramString);
        return null;
      }
      localObject = ((a)localObject).bitmap;
      if (localObject != null)
      {
        if (((Bitmap)localObject).isRecycled())
        {
          x.i("MicroMsg.GalleryCache", "cahce bitmap has recycled");
          this.jAp.remove(paramString);
          return null;
        }
        x.i("MicroMsg.GalleryCache", "get cached bitmap:" + paramString);
        return (Bitmap)localObject;
      }
      this.jAp.remove(paramString);
      x.i("MicroMsg.GalleryCache", "get bitmap is null");
    }
    return null;
  }
  
  private final class a
  {
    Bitmap bitmap;
    private int type;
    
    public a(Bitmap paramBitmap, int paramInt)
    {
      this.bitmap = paramBitmap;
      this.type = paramInt;
    }
  }
  
  public static abstract interface b
  {
    public abstract void CR(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/gallery/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */