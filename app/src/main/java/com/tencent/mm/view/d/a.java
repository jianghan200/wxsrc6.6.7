package com.tencent.mm.view.d;

import android.graphics.Bitmap;
import com.tencent.mm.ak.a.c.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  implements m
{
  private com.tencent.mm.ak.a.d.a<String, Bitmap> dYe = new com.tencent.mm.ak.a.d.a(150);
  
  public final void clear()
  {
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
            Bitmap localBitmap = (Bitmap)((Map.Entry)((Iterator)localObject1).next()).getValue();
            if ((localBitmap != null) && (!localBitmap.isRecycled())) {
              x.i("MicroMsg.emoji.EmojiLoaderMemoryCache", "recycle bitmap:%s, not need", new Object[] { localBitmap.toString() });
            }
          }
        }
        this.dYe.clear();
      }
    }
    finally {}
  }
  
  public final void d(String paramString, Bitmap paramBitmap)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.emoji.EmojiLoaderMemoryCache", "[cpan] put failed. key is null.");
      return;
    }
    if (paramBitmap == null)
    {
      x.w("MicroMsg.emoji.EmojiLoaderMemoryCache", "[cpan] put failed.value is null.");
      return;
    }
    this.dYe.put(paramString, paramBitmap);
  }
  
  public final Bitmap jz(String paramString)
  {
    if (!bi.oW(paramString)) {
      return (Bitmap)this.dYe.get(paramString);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/view/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */