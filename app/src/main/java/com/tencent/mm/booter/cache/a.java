package com.tencent.mm.booter.cache;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.tencent.mm.a.f;
import com.tencent.mm.cache.MCacheItem;
import com.tencent.mm.cache.f.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.q;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class a
  extends f.a
{
  public static a cYg;
  private final f<String, Bitmap> cYh;
  
  private a()
  {
    Context localContext = ad.getContext();
    if (com.tencent.mm.platformtools.a.a.values == null) {}
    try
    {
      com.tencent.mm.platformtools.a.a.values = q.Wi(bi.convertStreamToString(localContext.getAssets().open("profile.ini")));
      if (com.tencent.mm.platformtools.a.a.values == null)
      {
        localContext = null;
        this.cYh = new f(bi.getInt(localContext, 2000));
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.ProfileUtil", "exception:%s", new Object[] { bi.i(localException) });
        continue;
        String str = (String)com.tencent.mm.platformtools.a.a.values.get("BACKGROUND_BITMAP_CACHE_LIMIT");
      }
    }
  }
  
  public static void destroy()
  {
    if (cYg == null) {
      return;
    }
    cYg.cYh.clear();
  }
  
  public static void prepare()
  {
    if (cYg == null) {
      cYg = new a();
    }
  }
  
  public final void c(String paramString, Bitmap paramBitmap)
  {
    x.v("MicroMsg.MMCacheImpl", "setting bitmap: %s", new Object[] { paramString });
    this.cYh.m(paramString, paramBitmap);
  }
  
  public final MCacheItem eH(String paramString)
  {
    x.v("MicroMsg.MMCacheImpl", "getting cache item: %s", new Object[] { paramString });
    return null;
  }
  
  public final void eI(String paramString)
  {
    x.v("MicroMsg.MMCacheImpl", "setting cache item: %s", new Object[] { paramString });
  }
  
  public final Bitmap getBitmap(String paramString)
  {
    x.v("MicroMsg.MMCacheImpl", "getting bitmap: %s", new Object[] { paramString });
    return (Bitmap)this.cYh.get(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/booter/cache/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */