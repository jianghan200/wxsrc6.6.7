package com.tencent.mm.ak.a.f;

import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.mm.ak.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class c
  implements Runnable
{
  private String aAL;
  private Bitmap bitmap;
  private b dYi;
  private com.tencent.mm.ak.a.c dYk;
  private String url;
  
  public c(String paramString1, com.tencent.mm.ak.a.c paramc, Bitmap paramBitmap, b paramb, String paramString2)
  {
    this.url = paramString1;
    this.dYk = paramc;
    this.bitmap = paramBitmap;
    this.dYi = paramb;
    this.aAL = paramString2;
  }
  
  public final void run()
  {
    if ((!bi.oW(this.url)) && (this.dYk != null) && (this.bitmap != null) && (!this.bitmap.isRecycled()) && (this.dYi != null))
    {
      Object localObject1 = this.dYi;
      Object localObject2 = this.dYk;
      localObject1 = (String)((b)localObject1).dWV.get(Integer.valueOf(((com.tencent.mm.ak.a.c)localObject2).Pr()));
      if (this.url.equals(localObject1))
      {
        localObject2 = this.dYk;
        localObject1 = this.bitmap;
        if ((Looper.myLooper() == Looper.getMainLooper()) && (((com.tencent.mm.ak.a.c)localObject2).dWX != null))
        {
          localObject2 = (ImageView)((com.tencent.mm.ak.a.c)localObject2).dWX.get();
          if (localObject2 != null) {
            ((ImageView)localObject2).setImageBitmap((Bitmap)localObject1);
          }
        }
        this.dYi.a(this.dYk);
        return;
      }
      x.w("MicroMsg.imageloader.ImageShowTask", "[cpan] url is not equals view url.");
      return;
    }
    x.w("MicroMsg.imageloader.ImageShowTask", "[cpan] run something is null.");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ak/a/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */