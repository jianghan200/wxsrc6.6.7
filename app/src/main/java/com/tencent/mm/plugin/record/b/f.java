package com.tencent.mm.plugin.record.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.SystemClock;
import android.widget.ImageView;
import com.tencent.mm.R.g;
import com.tencent.mm.a.e;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.pluginsdk.ui.tools.g;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;

public class f
{
  private HashMap<String, String[]> jaP = new HashMap();
  public com.tencent.mm.a.f<String, Bitmap> jaR = new com.tencent.mm.a.f(10);
  public g mse = new f.1(this);
  private HashSet<String> msf = new HashSet();
  private HashMap<String, g.a> msh = new HashMap();
  
  public final Bitmap a(vx paramvx, long paramLong, boolean paramBoolean)
  {
    int j = 1;
    if (!com.tencent.mm.compatible.util.f.zZ()) {
      localObject = BitmapFactory.decodeResource(ad.getContext().getResources(), R.g.nosdcard_chatting_bg);
    }
    do
    {
      return (Bitmap)localObject;
      if (paramBoolean) {}
      for (paramvx = h.f(paramvx, paramLong); (bi.oW(paramvx)) || (!e.cn(paramvx)); paramvx = h.c(paramvx, paramLong))
      {
        x.d("MicroMsg.RecordMsgImgService", "getBitmap file not exist, thumb[%B] path[%s]", new Object[] { Boolean.valueOf(paramBoolean), paramvx });
        return null;
      }
      localBitmap = (Bitmap)this.jaR.get(paramvx);
      localObject = localBitmap;
    } while (localBitmap != null);
    x.d("MicroMsg.RecordMsgImgService", "get from cache fail, try to decode from file, path %s", new Object[] { paramvx });
    Object localObject = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(paramvx, (BitmapFactory.Options)localObject);
    if (localBitmap != null)
    {
      x.i("MicroMsg.RecordMsgImgService", "bitmap recycled %s", new Object[] { localBitmap });
      localBitmap.recycle();
    }
    int i;
    if ((z.bv(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) && (((BitmapFactory.Options)localObject).outWidth > 480))
    {
      i = 1;
      if ((!z.bu(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) || (((BitmapFactory.Options)localObject).outHeight <= 480)) {
        break label318;
      }
      label228:
      if ((i == 0) && (j == 0)) {
        break label363;
      }
      i = ((BitmapFactory.Options)localObject).outHeight;
    }
    for (j = ((BitmapFactory.Options)localObject).outWidth;; j = 960)
    {
      int m = BackwardSupportUtil.ExifHelper.VX(paramvx);
      if ((m == 90) || (m == 270)) {}
      for (;;)
      {
        localObject = c.e(paramvx, j, i, false);
        if (localObject == null)
        {
          x.e("MicroMsg.RecordMsgImgService", "extractThumbNail fail, temBmp is null, filePath = " + paramvx);
          return null;
          i = 0;
          break;
          label318:
          j = 0;
          break label228;
        }
        localObject = c.b((Bitmap)localObject, m);
        this.jaR.put(paramvx, localObject);
        return (Bitmap)localObject;
        int k = j;
        j = i;
        i = k;
      }
      label363:
      i = 960;
    }
  }
  
  public final void a(ImageView paramImageView, vx paramvx, long paramLong, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    String str = h.Ba(paramvx.jdM) + "@" + String.valueOf(paramLong);
    String[] arrayOfString;
    if (paramvx.jdM != null)
    {
      arrayOfString = (String[])this.jaP.get(str);
      if ((arrayOfString != null) && (arrayOfString.length > 0)) {
        break label184;
      }
      arrayOfString = new String[1];
      arrayOfString[0] = h.f(paramvx, paramLong);
      this.jaP.put(str, arrayOfString);
    }
    label184:
    for (;;)
    {
      this.mse.a(paramImageView, arrayOfString, paramString, paramInt1, paramInt2, paramInt3);
      if (this.msf.contains(str)) {}
      do
      {
        return;
        this.msf.add(str);
      } while ((new File(arrayOfString[0]).exists()) || ((bi.oW(paramvx.dwE)) && (bi.oW(paramvx.dwv))));
      h.c(paramvx, paramLong, a(paramvx, paramLong));
      return;
    }
  }
  
  public final boolean a(vx paramvx, long paramLong)
  {
    paramvx = h.e(paramvx.jdM, paramLong, true);
    g.a locala = (g.a)this.msh.get(paramvx);
    if (locala == null)
    {
      locala = new g.a();
      this.msh.put(paramvx, locala);
      return true;
    }
    if (locala.Ad() > 30000L)
    {
      locala.dgA = SystemClock.elapsedRealtime();
      return true;
    }
    return false;
  }
  
  public final Bitmap b(vx paramvx, long paramLong)
  {
    Bitmap localBitmap = a(paramvx, paramLong, true);
    if (localBitmap == null)
    {
      boolean bool = a(paramvx, paramLong);
      x.d("MicroMsg.RecordMsgImgService", "get thumb fail, try download, can retry:%B", new Object[] { Boolean.valueOf(bool) });
      h.c(paramvx, paramLong, bool);
    }
    return localBitmap;
  }
  
  public final void destory()
  {
    this.mse.destroy();
    this.jaP.clear();
    this.msf.clear();
    this.mse = null;
    this.jaP = null;
    this.msf = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/record/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */