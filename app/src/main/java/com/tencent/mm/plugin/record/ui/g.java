package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView;
import com.tencent.mm.R.g;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.record.b.h;
import com.tencent.mm.protocal.c.vv;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.wk;
import com.tencent.mm.protocal.c.wu;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends com.tencent.mm.plugin.record.b.f
  implements h.a
{
  public final Bitmap a(h.a.b paramb)
  {
    vx localvx = paramb.bOz;
    long l = paramb.msT;
    boolean bool = paramb.bOC;
    int j = paramb.maxWidth;
    if (!com.tencent.mm.compatible.util.f.zZ()) {
      paramb = BitmapFactory.decodeResource(ad.getContext().getResources(), R.g.nosdcard_chatting_bg);
    }
    String str;
    for (;;)
    {
      if ((paramb == null) && (!bool))
      {
        bool = super.a(localvx, l);
        x.d("MicroMsg.RecordMsgImgService", "get image fail, try download, can retry:%B", new Object[] { Boolean.valueOf(bool) });
        h.b(localvx, l, bool);
      }
      return paramb;
      str = h.c(localvx, l);
      if ((bi.oW(str)) || (!e.cn(str)))
      {
        x.d("MicroMsg.RecordMsgImgService", "getBitmap file not exist, thumb[%B] path[%s]", new Object[] { Boolean.valueOf(false), str });
        paramb = null;
      }
      else
      {
        paramb = (Bitmap)this.jaR.get(str);
        if (paramb != null)
        {
          x.d("MicroMsg.RecordMsgImgService", "get bm from cache %s", new Object[] { str });
        }
        else
        {
          if (!bool) {
            break;
          }
          paramb = null;
        }
      }
    }
    x.d("MicroMsg.RecordMsgImgService", "get from cache fail, try to decode from file, path %s", new Object[] { str });
    paramb = new BitmapFactory.Options();
    paramb.inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(str, paramb);
    if (localBitmap != null)
    {
      x.i("MicroMsg.RecordMsgImgService", "bitmap recycle %s", new Object[] { localBitmap });
      localBitmap.recycle();
    }
    int i = paramb.outHeight;
    int m = paramb.outWidth;
    x.d("MicroMsg.RecordMsgImgService", "width: %s, height: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(i) });
    int k = m;
    if (m > j)
    {
      i = paramb.outHeight * j / paramb.outWidth;
      k = j;
    }
    k = Math.max(1, k);
    i = Math.max(1, i);
    if (k > j) {
      i = paramb.outHeight * j / paramb.outWidth;
    }
    for (;;)
    {
      m = BackwardSupportUtil.ExifHelper.VX(str);
      if ((m == 90) || (m == 270)) {}
      for (;;)
      {
        paramb = c.e(str, j, i, false);
        if (paramb == null)
        {
          x.e("MicroMsg.RecordMsgImgService", "extractThumbNail fail, temBmp is null, filePath = " + str);
          paramb = null;
          break;
        }
        paramb = c.b(paramb, m);
        this.jaR.put(str, paramb);
        break;
        k = j;
        j = i;
        i = k;
      }
      j = k;
    }
  }
  
  public final Bitmap a(h.a.c paramc)
  {
    return super.b(paramc.bOz, paramc.msT);
  }
  
  public final void a(h.a.a parama)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    ImageView localImageView = parama.bOA;
    vx localvx = parama.bOz;
    long l = parama.msT;
    int i = parama.bOB;
    int j = parama.width;
    int k = parama.height;
    if (localImageView == null) {
      return;
    }
    if (!com.tencent.mm.compatible.util.f.zZ())
    {
      localImageView.setImageResource(R.g.nosdcard_chatting_bg);
      return;
    }
    if (localvx == null)
    {
      localImageView.setImageResource(i);
      return;
    }
    switch (localvx.bjS)
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
      x.w("MicroMsg.RecordMsgImgService", "attach thumb, pass data type is %d", new Object[] { Integer.valueOf(localvx.bjS) });
      return;
    case 7: 
      super.a(localImageView, localvx, l, localvx.bJv, i, j, k);
      return;
    case 4: 
    case 15: 
      super.a(localImageView, localvx, l, localvx.bJv, i, j, k);
      return;
    case 5: 
      if (localvx.rAi != null)
      {
        parama = localvx.rAi.rAN;
        label236:
        if (parama != null) {
          break label296;
        }
        parama = (h.a.a)localObject1;
        label243:
        if (!bi.oW(parama)) {
          break label576;
        }
        parama = localvx.bJv;
      }
      break;
    }
    label296:
    label511:
    label565:
    label573:
    label576:
    for (;;)
    {
      super.a(localImageView, localvx, l, parama, i, j, k);
      return;
      x.w("MicroMsg.RecordMsgImgService", "webpage: get data proto item null, dataid[%s]", new Object[] { localvx.jdM });
      parama = null;
      break label236;
      parama = parama.thumbUrl;
      break label243;
      if (localvx.rAi == null)
      {
        x.w("MicroMsg.RecordMsgImgService", "good: get data proto item null, dataid[%s]", new Object[] { localvx.jdM });
        return;
      }
      parama = localvx.rAi.rAP;
      if (parama == null) {
        break;
      }
      this.mse.a(localImageView, null, parama.thumbUrl, i, j, k);
      return;
      if (localvx.rAi == null)
      {
        x.w("MicroMsg.RecordMsgImgService", "tv: get data proto item null, dataid[%s]", new Object[] { localvx.jdM });
        return;
      }
      parama = localvx.rAi.rAR;
      if (parama == null) {
        break;
      }
      this.mse.a(localImageView, null, parama.thumbUrl, i, j, k);
      return;
      if (localvx.rAi == null)
      {
        x.w("MicroMsg.RecordMsgImgService", "product: get data proto item null, dataid[%s]", new Object[] { localvx.jdM });
        return;
      }
      parama = localvx.rAi.rAP;
      if (parama == null) {
        break;
      }
      this.mse.a(localImageView, null, parama.thumbUrl, i, j, k);
      return;
      if (localvx.rAi != null)
      {
        parama = localvx.rAi.rBa;
        if (parama != null) {
          break label565;
        }
        parama = (h.a.a)localObject2;
        if (!bi.oW(parama)) {
          break label573;
        }
        parama = localvx.bJv;
      }
      for (;;)
      {
        super.a(localImageView, localvx, l, parama, i, j, k);
        return;
        x.w("MicroMsg.RecordMsgImgService", "appbrand: get data proto item null, dataid[%s]", new Object[] { localvx.jdM });
        parama = null;
        break;
        parama = parama.iconUrl;
        break label511;
      }
    }
  }
  
  public final void bqy()
  {
    super.destory();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */