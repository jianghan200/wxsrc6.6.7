package com.tencent.mm.plugin.collect.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.qbar.QbarNative;

public final class b
{
  public static Bitmap a(Context paramContext, String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, y.a parama, boolean paramBoolean)
  {
    int i = (int)(paramInt2 * 0.26F);
    int j = (int)(paramInt2 * 0.22F);
    paramInt2 = (int)(paramInt2 * 0.076F);
    for (;;)
    {
      try
      {
        Paint localPaint = new Paint();
        localPaint.setAntiAlias(true);
        x.i("MicroMsg.CollectBitmapFactory", "createCollectQrcode size avatarSize %s dpCanvas %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        Bitmap localBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Object localObject2 = null;
        Object localObject1 = localObject2;
        if (paramInt1 == 1)
        {
          localObject1 = localObject2;
          if (!bi.oW(paramString3))
          {
            localObject1 = y.a(new c(paramString3));
            y.b(parama);
          }
        }
        paramString3 = (String)localObject1;
        if (localObject1 == null) {
          paramString3 = com.tencent.mm.aa.c.c(paramString2, j, j, (int)(j * 0.06F));
        }
        paramString2 = paramString3;
        if (paramString3 == null)
        {
          paramString2 = BackwardSupportUtil.b.a(ad.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bp.a.getDensity(null));
          paramString2 = com.tencent.mm.sdk.platformtools.c.a(paramString2, false, 0.06F * paramString2.getWidth());
        }
        paramString3 = paramString2;
        if (paramString2 != null)
        {
          paramString3 = paramString2;
          if (paramBoolean) {
            paramString3 = com.tencent.mm.sdk.platformtools.c.a(paramString2, false, paramString2.getWidth() * 0.5F);
          }
        }
        paramString2 = new Canvas(localBitmap);
        paramInt1 = (i - j) / 2;
        paramString2.drawBitmap(paramString3, null, new Rect(paramInt1, paramInt1, i - paramInt1, i - paramInt1), localPaint);
        paramString2.drawBitmap(MMBitmapFactory.decodeStream(paramContext.getResources().openRawResource(a.e.collect_ftf_avatar_icon)), null, new Rect(i - paramInt2, i - paramInt2, i, i), localPaint);
        paramString2 = new byte[40000];
        paramString3 = new int[2];
        paramInt1 = QbarNative.a(paramString2, paramString3, paramString1, 0, 3, "UTF-8");
        QbarNative.nativeRelease();
        if (paramInt1 > 0)
        {
          paramContext = com.tencent.mm.bm.a.a.a(paramContext, localBitmap, paramString2, paramString3);
          if (paramContext == null)
          {
            x.i("MicroMsg.QRCodeBitmapFactory", "createBitmap bm is error result %d %s", new Object[] { Integer.valueOf(paramInt1), bi.cjd().toString() });
            localBitmap.recycle();
            return paramContext;
          }
          x.i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", new Object[] { paramContext });
          continue;
        }
      }
      catch (Exception paramContext)
      {
        x.printErrStackTrace("MicroMsg.CollectBitmapFactory", paramContext, "", new Object[0]);
        return null;
      }
      tmp426_423[0] = Integer.valueOf(paramInt1);
      Object[] tmp433_426 = tmp426_423;
      tmp433_426[1] = bi.cjd().toString();
      x.i("MicroMsg.QRCodeBitmapFactory", "result %d %s", tmp433_426);
      paramContext = null;
    }
  }
  
  public static Bitmap a(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3, y.a parama, boolean paramBoolean)
  {
    return a(paramContext, paramString1, paramString2, paramInt, paramString3, BackwardSupportUtil.b.b(paramContext, 197.0F), parama, paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/collect/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */