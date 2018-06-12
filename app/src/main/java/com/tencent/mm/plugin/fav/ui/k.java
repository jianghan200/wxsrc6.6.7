package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.widget.ImageView;
import com.tencent.mm.bp.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.protocal.c.vv;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.wk;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wu;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vfs.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class k
{
  private static Map<String, g.a> jaQ = new HashMap();
  private static com.tencent.mm.a.f<String, Bitmap> jaR = new com.tencent.mm.a.f(10);
  private static aa<String, Bitmap> jaS = new aa(20);
  public Context context;
  public e jaN;
  public HashMap<String, String[]> jaO = new HashMap();
  private HashMap<String, String[]> jaP = new HashMap();
  
  public k(Context paramContext, int paramInt)
  {
    this.context = paramContext;
    int i = paramInt;
    if (paramInt <= 0) {
      i = 24;
    }
    this.jaN = new e(i);
  }
  
  public static Bitmap a(vx paramvx, com.tencent.mm.plugin.fav.a.g paramg)
  {
    if (!com.tencent.mm.compatible.util.f.zZ()) {
      localObject = BitmapFactory.decodeResource(ad.getContext().getResources(), m.d.nosdcard_chatting_bg);
    }
    Bitmap localBitmap;
    do
    {
      return (Bitmap)localObject;
      if (b.Ba(paramvx.jdM) == null) {
        return null;
      }
      localBitmap = a(paramvx, true, false);
      localObject = localBitmap;
    } while (localBitmap != null);
    Object localObject = b.c(paramvx);
    com.tencent.mm.kernel.g.Em().H(new k.5((String)localObject, paramg, paramvx));
    return localBitmap;
  }
  
  public static Bitmap a(final vx paramvx, final com.tencent.mm.plugin.fav.a.g paramg, boolean paramBoolean)
  {
    if (!com.tencent.mm.compatible.util.f.zZ()) {
      localObject = BitmapFactory.decodeResource(ad.getContext().getResources(), m.d.nosdcard_chatting_bg);
    }
    Bitmap localBitmap;
    do
    {
      return (Bitmap)localObject;
      if (paramvx.jdM == null) {
        return null;
      }
      localBitmap = a(paramvx, false, false);
      localObject = localBitmap;
    } while (localBitmap != null);
    final Object localObject = b.b(paramvx);
    com.tencent.mm.kernel.g.Em().H(new Runnable()
    {
      public final void run()
      {
        if ((this.jaU) || (k.BD(localObject))) {
          b.a(paramg, paramvx, this.jaU);
        }
      }
      
      public final String toString()
      {
        return super.toString() + "|getBigImg";
      }
    });
    return localBitmap;
  }
  
  private static Bitmap a(vx paramvx, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {}
    for (paramvx = b.c(paramvx); !d.cn(paramvx); paramvx = b.b(paramvx))
    {
      x.w("MicroMsg.FavoriteImageLogic", "getBitmap file not exist");
      return null;
    }
    return c.at(paramvx, paramBoolean2);
  }
  
  public static void a(ImageView paramImageView, int paramInt1, vx paramvx, com.tencent.mm.plugin.fav.a.g paramg, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    if (!com.tencent.mm.compatible.util.f.zZ()) {
      paramImageView.setImageBitmap(BitmapFactory.decodeResource(ad.getContext().getResources(), m.d.nosdcard_chatting_bg));
    }
    if (paramvx.jdM == null) {
      paramImageView.setImageResource(paramInt1);
    }
    Bitmap localBitmap = a(paramvx, paramg);
    String str = b.b(paramvx);
    if (d.cn(str)) {
      localBitmap = b(str, paramInt2, paramInt3, true);
    }
    if (localBitmap == null)
    {
      paramImageView.setImageResource(paramInt1);
      paramImageView.setTag(str);
      com.tencent.mm.kernel.g.Em().H(new k.6(str, paramInt2, paramInt3, paramg, paramvx, paramBoolean, paramImageView));
      return;
    }
    paramImageView.setImageBitmap(localBitmap);
  }
  
  public static Bitmap b(final vx paramvx, final com.tencent.mm.plugin.fav.a.g paramg, int paramInt)
  {
    if (!com.tencent.mm.compatible.util.f.zZ())
    {
      localObject2 = BitmapFactory.decodeResource(ad.getContext().getResources(), m.d.nosdcard_chatting_bg);
      return (Bitmap)localObject2;
    }
    if (paramvx.jdM == null) {
      return null;
    }
    Object localObject2 = b.b(paramvx);
    if (!d.cn((String)localObject2))
    {
      x.w("MicroMsg.FavoriteImageLogic", "getBitmap file not exist");
      localObject1 = null;
    }
    for (;;)
    {
      localObject2 = localObject1;
      if (localObject1 != null) {
        break;
      }
      localObject2 = b.b(paramvx);
      com.tencent.mm.kernel.g.Em().H(new Runnable()
      {
        public final void run()
        {
          if ((this.jaU) || (k.BD(this.enZ))) {
            b.a(paramg, paramvx, this.jaU);
          }
        }
        
        public final String toString()
        {
          return super.toString() + "|getBigImg";
        }
      });
      return (Bitmap)localObject1;
      localObject1 = (Bitmap)jaR.get(localObject2);
      if (localObject1 == null) {
        break label129;
      }
      x.d("MicroMsg.FavoriteImageLogic", "get bm from cache %s", new Object[] { localObject2 });
    }
    label129:
    x.d("MicroMsg.FavoriteImageLogic", "get from cache fail, try to decode from file");
    Object localObject1 = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject1).inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile((String)localObject2, (BitmapFactory.Options)localObject1);
    if (localBitmap != null)
    {
      x.i("MicroMsg.FavoriteImageLogic", "bitmap recycle %s", new Object[] { localBitmap });
      localBitmap.recycle();
    }
    int j = ((BitmapFactory.Options)localObject1).outWidth;
    int i = ((BitmapFactory.Options)localObject1).outHeight;
    x.d("MicroMsg.FavoriteImageLogic", "width: %s, height: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
    if (j > paramInt) {
      i = ((BitmapFactory.Options)localObject1).outHeight * paramInt / ((BitmapFactory.Options)localObject1).outWidth;
    }
    for (;;)
    {
      paramInt = Math.max(1, paramInt);
      i = Math.max(1, i);
      x.w("MicroMsg.FavoriteImageLogic", "fit long picture, beg %d*%d, after %d*%d", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject1).outWidth), Integer.valueOf(((BitmapFactory.Options)localObject1).outHeight), Integer.valueOf(paramInt), Integer.valueOf(i) });
      int k = BackwardSupportUtil.ExifHelper.VX((String)localObject2);
      if ((k == 90) || (k == 270)) {}
      for (;;)
      {
        localObject1 = com.tencent.mm.sdk.platformtools.c.e((String)localObject2, paramInt, i, false);
        if (localObject1 == null)
        {
          x.e("MicroMsg.FavoriteImageLogic", "getSuitableBmp fail, temBmp is null, filePath = " + (String)localObject2);
          localObject1 = null;
          break;
        }
        localObject1 = com.tencent.mm.sdk.platformtools.c.b((Bitmap)localObject1, k);
        jaR.put(localObject2, localObject1);
        break;
        j = paramInt;
        paramInt = i;
        i = j;
      }
      paramInt = j;
    }
  }
  
  public static Bitmap b(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    if (!d.cn(paramString))
    {
      x.w("MicroMsg.FavoriteImageLogic", "file not exist");
      return null;
    }
    Bitmap localBitmap = (Bitmap)jaS.get(paramString);
    if ((localBitmap != null) || (paramBoolean))
    {
      paramBoolean = bool1;
      if (localBitmap != null) {
        paramBoolean = true;
      }
      x.d("MicroMsg.FavoriteImageLogic", "return bm path %s, bm %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
      return localBitmap;
    }
    Object localObject1 = localBitmap;
    for (;;)
    {
      Object localObject2;
      int m;
      try
      {
        localObject2 = new BitmapFactory.Options();
        localObject1 = localBitmap;
        ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
        localObject1 = localBitmap;
        com.tencent.mm.sdk.platformtools.c.decodeFile(paramString, (BitmapFactory.Options)localObject2);
        localObject1 = localBitmap;
        i = ((BitmapFactory.Options)localObject2).outWidth;
        localObject1 = localBitmap;
        j = ((BitmapFactory.Options)localObject2).outHeight;
        localObject1 = localBitmap;
        m = BackwardSupportUtil.ExifHelper.VX(paramString);
        if (m == 90) {
          break label592;
        }
        if (m != 270) {
          break label574;
        }
      }
      catch (IOException paramString)
      {
        x.e("MicroMsg.FavoriteImageLogic", paramString.getMessage());
        return (Bitmap)localObject1;
      }
      localObject1 = localBitmap;
      ((BitmapFactory.Options)localObject2).inSampleSize = 1;
      localObject1 = localBitmap;
      if (i / ((BitmapFactory.Options)localObject2).inSampleSize > paramInt2)
      {
        localObject1 = localBitmap;
        if (j / ((BitmapFactory.Options)localObject2).inSampleSize > paramInt1)
        {
          localObject1 = localBitmap;
          ((BitmapFactory.Options)localObject2).inSampleSize += 1;
          continue;
        }
      }
      localObject1 = localBitmap;
      int k = j * paramInt2 / paramInt1;
      localObject1 = localBitmap;
      x.d("MicroMsg.FavoriteImageLogic", "decode top region width: %d, height: %d, scaleheight: %d, rotate: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k), Boolean.valueOf(paramBoolean) });
      Rect localRect;
      BitmapRegionDecoder localBitmapRegionDecoder;
      if ((k > 0) && (i > k))
      {
        localObject1 = localBitmap;
        localRect = new Rect();
        localObject1 = localBitmap;
        localRect.top = 0;
        localObject1 = localBitmap;
        localRect.left = 0;
        if (paramBoolean)
        {
          localObject1 = localBitmap;
          localRect.right = k;
          localObject1 = localBitmap;
          localRect.bottom = j;
          localObject1 = localBitmap;
          localBitmapRegionDecoder = BitmapRegionDecoder.newInstance(paramString, true);
          localObject1 = localBitmap;
          ((BitmapFactory.Options)localObject2).inJustDecodeBounds = false;
          localObject1 = localBitmap;
        }
      }
      for (localBitmap = localBitmapRegionDecoder.decodeRegion(localRect, (BitmapFactory.Options)localObject2);; localBitmap = com.tencent.mm.sdk.platformtools.c.decodeFile(paramString, (BitmapFactory.Options)localObject2))
      {
        localObject2 = localBitmap;
        if (localBitmap != null)
        {
          localObject2 = localBitmap;
          if (paramBoolean)
          {
            localObject1 = localBitmap;
            localObject2 = com.tencent.mm.sdk.platformtools.c.b(localBitmap, m);
          }
        }
        if (localObject2 == null) {
          break label559;
        }
        localObject1 = localObject2;
        x.d("MicroMsg.FavoriteImageLogic", "width %d, height %d, tw %d, th %d", new Object[] { Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        localObject1 = localObject2;
        jaS.put(paramString, localObject2);
        return (Bitmap)localObject2;
        localObject1 = localBitmap;
        localRect.right = j;
        localObject1 = localBitmap;
        localRect.bottom = k;
        break;
        localObject1 = localBitmap;
        ((BitmapFactory.Options)localObject2).inJustDecodeBounds = false;
        localObject1 = localBitmap;
      }
      label559:
      localObject1 = localObject2;
      x.w("MicroMsg.FavoriteImageLogic", "decode bm fail!");
      return (Bitmap)localObject2;
      label574:
      k = i;
      paramBoolean = bool2;
      int i = j;
      int j = k;
      continue;
      label592:
      paramBoolean = true;
    }
  }
  
  public static void b(com.tencent.mm.plugin.fav.a.g paramg, vx paramvx)
  {
    b(paramg, paramvx, true);
  }
  
  private static void b(final com.tencent.mm.plugin.fav.a.g paramg, final vx paramvx, boolean paramBoolean)
  {
    final String str = b.b(paramvx);
    com.tencent.mm.kernel.g.Em().H(new Runnable()
    {
      public final void run()
      {
        if ((this.jaU) || (k.BD(str))) {
          b.a(paramg, paramvx, this.jaU);
        }
      }
      
      public final String toString()
      {
        return super.toString() + "|reDownload";
      }
    });
  }
  
  public static Bitmap j(vx paramvx)
  {
    if (!com.tencent.mm.compatible.util.f.zZ()) {
      return BitmapFactory.decodeResource(ad.getContext().getResources(), m.d.nosdcard_chatting_bg);
    }
    if (paramvx.jdM == null) {
      return null;
    }
    return a(paramvx, false, true);
  }
  
  public final void a(ImageView paramImageView, vx paramvx, com.tencent.mm.plugin.fav.a.g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
    String str = null;
    if (paramImageView == null) {}
    xa localxa;
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if (!com.tencent.mm.compatible.util.f.zZ())
            {
              paramImageView.setImageResource(m.d.nosdcard_chatting_bg);
              return;
            }
          } while (paramg == null);
          switch (paramg.field_type)
          {
          case 6: 
          case 8: 
          case 9: 
          case 12: 
          case 13: 
          case 14: 
          default: 
            x.w("MicroMsg.FavoriteImageLogic", "attach thumb, pass type is %d", new Object[] { Integer.valueOf(paramg.field_type) });
            return;
          }
        } while (paramvx == null);
        a(paramImageView, paramvx, paramg, paramvx.bJv, paramInt1, paramInt2, paramInt3);
        return;
      } while (paramvx == null);
      a(paramImageView, paramvx, paramg, paramvx.bJv, paramInt1, paramInt2, paramInt3);
      return;
      localxa = paramg.field_favProto.rAN;
      if (paramvx != null) {
        break;
      }
    } while (localxa == null);
    this.jaN.a(paramImageView, null, localxa.thumbUrl, paramInt1, paramInt2, paramInt3);
    return;
    if (localxa == null)
    {
      label207:
      if (!bi.oW(str)) {
        break label343;
      }
      str = paramvx.bJv;
    }
    label343:
    for (;;)
    {
      a(paramImageView, paramvx, paramg, str, paramInt1, paramInt2, paramInt3);
      return;
      str = localxa.thumbUrl;
      break label207;
      paramvx = paramg.field_favProto.rAP;
      if (paramvx == null) {
        break;
      }
      this.jaN.a(paramImageView, null, paramvx.thumbUrl, paramInt1, paramInt2, paramInt3);
      return;
      paramvx = paramg.field_favProto.rAR;
      if (paramvx == null) {
        break;
      }
      this.jaN.a(paramImageView, null, paramvx.thumbUrl, paramInt1, paramInt2, paramInt3);
      return;
      paramvx = paramg.field_favProto.rAP;
      if (paramvx == null) {
        break;
      }
      this.jaN.a(paramImageView, null, paramvx.thumbUrl, paramInt1, paramInt2, paramInt3);
      return;
    }
  }
  
  public final void a(ImageView paramImageView, vx paramvx, com.tencent.mm.plugin.fav.a.g paramg, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    String str = b.Ba(paramvx.jdM);
    String[] arrayOfString = null;
    if (paramvx.jdM != null)
    {
      arrayOfString = (String[])this.jaP.get(str);
      if (arrayOfString != null) {
        break label118;
      }
      arrayOfString = new String[1];
      arrayOfString[0] = b.c(paramvx);
      this.jaP.put(str, arrayOfString);
    }
    label118:
    for (;;)
    {
      this.jaN.a(paramImageView, arrayOfString, paramString, paramInt1, paramInt2, paramInt3);
      if ((arrayOfString == null) || (arrayOfString.length <= 0)) {
        return;
      }
      paramImageView = arrayOfString[0];
      com.tencent.mm.kernel.g.Em().H(new k.1(this, paramImageView, paramg, paramvx));
      return;
    }
  }
  
  public final void b(ImageView paramImageView, vx paramvx, com.tencent.mm.plugin.fav.a.g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject2 = null;
    if (paramImageView == null) {
      return;
    }
    if (!com.tencent.mm.compatible.util.f.zZ())
    {
      paramImageView.setImageResource(m.d.nosdcard_chatting_bg);
      return;
    }
    if ((paramg == null) || (paramvx == null))
    {
      paramImageView.setImageDrawable(a.f(this.context, paramInt1));
      return;
    }
    Object localObject1;
    switch (paramvx.bjS)
    {
    case 6: 
    case 8: 
    case 9: 
    case 12: 
    case 13: 
    case 16: 
    case 17: 
    case 18: 
    default: 
      x.w("MicroMsg.FavoriteImageLogic", "attach thumb, pass type is %d", new Object[] { Integer.valueOf(paramg.field_type) });
      return;
    case 7: 
      a(paramImageView, paramvx, paramg, paramvx.bJv, paramInt1, paramInt2, paramInt3);
      return;
    case 4: 
    case 15: 
      a(paramImageView, paramvx, paramg, paramvx.bJv, paramInt1, paramInt2, paramInt3);
      return;
    case 5: 
      if (paramvx.rAi != null)
      {
        localObject1 = paramvx.rAi.rAN;
        label203:
        if (localObject1 != null) {
          break label287;
        }
        localObject1 = localObject2;
        label212:
        if (!bi.oW((String)localObject1)) {
          break label613;
        }
        localObject1 = paramvx.bJv;
      }
      break;
    }
    label287:
    label613:
    for (;;)
    {
      a(paramImageView, paramvx, paramg, (String)localObject1, paramInt1, paramInt2, paramInt3);
      return;
      x.w("MicroMsg.FavoriteImageLogic", "webpage: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramvx.jdM, Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
      localObject1 = null;
      break label203;
      localObject1 = ((xa)localObject1).thumbUrl;
      break label212;
      if (paramvx.rAi == null)
      {
        x.w("MicroMsg.FavoriteImageLogic", "good: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramvx.jdM, Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
        return;
      }
      paramvx = paramvx.rAi.rAP;
      if (paramvx == null) {
        break;
      }
      this.jaN.a(paramImageView, null, paramvx.thumbUrl, paramInt1, paramInt2, paramInt3);
      return;
      if (paramvx.rAi == null)
      {
        x.w("MicroMsg.FavoriteImageLogic", "tv: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramvx.jdM, Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
        return;
      }
      paramvx = paramvx.rAi.rAR;
      if (paramvx == null) {
        break;
      }
      this.jaN.a(paramImageView, null, paramvx.thumbUrl, paramInt1, paramInt2, paramInt3);
      return;
      if (paramvx.rAi == null)
      {
        x.w("MicroMsg.FavoriteImageLogic", "product: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramvx.jdM, Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
        return;
      }
      paramvx = paramvx.rAi.rAP;
      if (paramvx == null) {
        break;
      }
      this.jaN.a(paramImageView, null, paramvx.thumbUrl, paramInt1, paramInt2, paramInt3);
      return;
      if (paramvx.rAi == null)
      {
        x.w("MicroMsg.FavoriteImageLogic", "app brand: get data proto item null, dataid[%s], infoid[%d, %d]", new Object[] { paramvx.jdM, Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
        return;
      }
      paramvx = paramvx.rAi.rBa;
      if (paramvx == null) {
        break;
      }
      this.jaN.a(paramImageView, null, paramvx.iconUrl, paramInt1, paramInt2, paramInt3);
      return;
    }
  }
  
  public final void destory()
  {
    e locale = this.jaN;
    synchronized (locale.dsN)
    {
      x.d("MicroMsg.ImageEngine", "do clear mark");
      locale.qSx.clear();
      locale.qSy.clear();
      locale.qSx = new HashMap();
      locale.qSy = new HashMap();
      this.jaO.clear();
      this.jaP.clear();
      this.jaN.destroy();
      this.context = null;
      this.jaO = null;
      this.jaP = null;
      this.jaN = null;
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */