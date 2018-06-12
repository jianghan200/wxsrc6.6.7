package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.bl.a.a.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class b
  extends i
  implements f.c
{
  Bitmap hqv = null;
  private float qEJ = 0.5F;
  
  private b(String paramString)
  {
    super(a.b.ccZ(), paramString);
  }
  
  public b(String paramString, float paramFloat)
  {
    this(paramString);
  }
  
  private void a(Canvas paramCanvas, Bitmap paramBitmap)
  {
    Rect localRect2 = getBounds();
    Rect localRect1 = null;
    if ((this.qFI > 1.0F) || (this.lkD))
    {
      int i = paramBitmap.getHeight() / 15 / 2;
      int j = paramBitmap.getWidth() / 15 / 2;
      localRect1 = new Rect(j, i, paramBitmap.getWidth() - j, paramBitmap.getHeight() - i);
    }
    paramCanvas.drawBitmap(paramBitmap, localRect1, localRect2, dvs);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Bitmap localBitmap = null;
    com.tencent.mm.bl.a.a locala = a.a.sCg;
    if (locala != null) {
      localBitmap = a.a.sCg.FK(this.tag);
    }
    if (localBitmap != null) {
      a(paramCanvas, localBitmap);
    }
    do
    {
      return;
      if (this.qFD) {}
      for (localBitmap = this.lZs.b(this.tag, paramCanvas.getWidth(), paramCanvas.getHeight(), 1); localBitmap != null; localBitmap = this.lZs.cJ(this.tag))
      {
        localBitmap = c.a(localBitmap, false, this.qEJ * localBitmap.getWidth());
        if (locala != null) {
          locala.p(this.tag, localBitmap);
        }
        a(paramCanvas, localBitmap);
        return;
      }
    } while ((localBitmap != null) && (!localBitmap.isRecycled()));
    if (this.hqv == null) {}
    try
    {
      this.hqv = BackwardSupportUtil.b.a(ad.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bp.a.getDensity(null));
      this.hqv = c.a(this.hqv, false, this.qEJ * this.hqv.getWidth());
      a(paramCanvas, this.hqv);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.AvatarRoundDrawable", localIOException, "", new Object[0]);
      }
    }
  }
  
  public final void jX(String paramString)
  {
    super.jX(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */