package com.tencent.mm.plugin.location.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class m
  implements com.tencent.mm.bl.a.a
{
  private Bitmap hqv = null;
  aa<String, Bitmap> kDC = new aa(20);
  
  public m()
  {
    try
    {
      this.hqv = BackwardSupportUtil.b.a(ad.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bp.a.getDensity(null));
      this.hqv = c.a(this.hqv, false, this.hqv.getWidth() >> 1);
      return;
    }
    catch (IOException localIOException)
    {
      x.printErrStackTrace("MicroMsg.TrackAvatarCacheService", localIOException, "", new Object[0]);
    }
  }
  
  public final Bitmap FK(String paramString)
  {
    if (bi.oW(paramString)) {
      paramString = null;
    }
    Bitmap localBitmap;
    do
    {
      return paramString;
      x.d("MicroMsg.TrackAvatarCacheService", "getAvatar, tag = %s, cacheSize = %d", new Object[] { paramString, Integer.valueOf(this.kDC.size()) });
      localBitmap = (Bitmap)this.kDC.get(paramString);
      if (localBitmap == null) {
        break;
      }
      paramString = localBitmap;
    } while (!localBitmap.isRecycled());
    return null;
  }
  
  public final void p(String paramString, Bitmap paramBitmap)
  {
    if (this.kDC.get(paramString) != null)
    {
      Bitmap localBitmap = (Bitmap)this.kDC.get(paramString);
      if (!localBitmap.isRecycled()) {
        localBitmap.recycle();
      }
      this.kDC.remove(paramString);
    }
    this.kDC.put(paramString, paramBitmap);
    x.d("MicroMsg.TrackAvatarCacheService", "updateCache, tag = %s, cacheSize = %d", new Object[] { paramString, Integer.valueOf(this.kDC.size()) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/location/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */