package com.tencent.mm.plugin.sns.model.a;

import android.graphics.BitmapFactory.Options;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.c;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends f
{
  public e(c.a parama, a parama1)
  {
    super(parama, parama1);
  }
  
  public final boolean bza()
  {
    long l1 = -1L;
    int i;
    String str1;
    label46:
    BitmapFactory.Options localOptions;
    Object localObject;
    label124:
    long l3;
    if ((!bi.oW(this.nsN.nkR)) && (!bi.oW(this.nsN.nkS)))
    {
      i = 1;
      if (i == 0) {
        break label613;
      }
      str1 = this.nsN.nkS;
      String str2 = this.nsN.getPath() + this.nsN.byY();
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      MMBitmapFactory.decodeFile(str2, localOptions, null, 0, new int[0]);
      if (localOptions.outMimeType == null) {
        break label625;
      }
      localObject = localOptions.outMimeType.toLowerCase();
      l3 = FileOp.mI(str2);
      if ((!this.ntm) && (!((String)localObject).contains("webp"))) {
        break label632;
      }
      i = 0;
    }
    for (;;)
    {
      label150:
      label176:
      boolean bool;
      label194:
      long l2;
      switch (i)
      {
      default: 
        localObject = new StringBuilder("donwload big pic isWebp ");
        if (i == 0)
        {
          bool = true;
          x.i("MicroMsg.SnsDownloadImage", bool);
          l2 = FileOp.mI(this.nsN.getPath() + str1);
          h.mEJ.h(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l1), Long.valueOf(l2), Thread.currentThread().getName(), af.byB(), com.tencent.mm.compatible.util.e.bnC });
          if (this.nsN.nsI == 3) {
            break label1442;
          }
        }
        break;
      }
      label613:
      label625:
      label632:
      label1442:
      for (i = 1;; i = 0)
      {
        int j = i;
        if (this.nsN.nkK != null)
        {
          j = i;
          if (this.nsN.nkK.nkQ != 4)
          {
            j = i;
            if (this.nsN.nkK.nkQ != 5) {
              j = 0;
            }
          }
        }
        if (j != 0)
        {
          localObject = i.e(this.caK);
          if (FileOp.cn(this.nsN.getPath() + (String)localObject)) {
            FileOp.deleteFile(this.nsN.getPath() + (String)localObject);
          }
          l1 = bi.VG();
          s.a(this.nsN.getPath(), str1, (String)localObject, af.byx());
          l1 = bi.bI(l1);
          FileOp.mI(this.nsN.getPath() + (String)localObject);
          h.mEJ.h(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l1), Long.valueOf(l2), Thread.currentThread().getName(), af.byB(), com.tencent.mm.compatible.util.e.bnC });
          localObject = i.f(this.caK);
          if (!FileOp.cn(this.nsN.getPath() + (String)localObject)) {
            s.b(this.nsN.getPath(), str1, (String)localObject, af.byw());
          }
        }
        return true;
        i = 0;
        break;
        str1 = i.l(this.caK);
        break label46;
        localObject = "";
        break label124;
        if ((!this.ntn) && (!((String)localObject).contains("vcodec"))) {
          break label1447;
        }
        i = 1;
        break label150;
        h.mEJ.a(22L, 64L, 1L, true);
        FileOp.deleteFile(this.nsN.getPath() + str1);
        l1 = bi.VG();
        s.e(this.nsN.getPath(), this.nsN.getPath() + this.nsN.byY(), str1, false);
        l2 = bi.bI(l1);
        FileOp.deleteFile(this.nsN.getPath() + this.nsN.byY());
        l1 = bi.bI(l1);
        c.a(this.nsN.getPath() + str1, this.nsN.url, 0, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, -1, l3, l2);
        break label176;
        x.i("MicroMsg.SnsDownloadImage", "found vcodec:%s, reencoded.", new Object[] { this.nsN.getPath() + this.nsN.byY() });
        FileOp.deleteFile(this.nsN.getPath() + str1);
        l1 = bi.VG();
        s.e(this.nsN.getPath(), this.nsN.getPath() + this.nsN.byY(), str1, false);
        l2 = bi.bI(l1);
        FileOp.deleteFile(this.nsN.getPath() + this.nsN.byY());
        l1 = bi.bI(l1);
        c.a(this.nsN.getPath() + str1, this.nsN.url, 0, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, -1, l3, l2);
        break label176;
        l2 = -1L;
        if (i.LO(this.nsN.getPath() + this.nsN.byY()))
        {
          x.w("MicroMsg.SnsDownloadImage", "the " + this.nsN.mediaId + " is too max ! " + this.nsN.url);
          FileOp.deleteFile(this.nsN.getPath() + str1);
          l1 = bi.VG();
          s.ad(this.nsN.getPath(), this.nsN.getPath() + this.nsN.byY(), str1);
          l2 = bi.bI(l1);
          FileOp.deleteFile(this.nsN.getPath() + this.nsN.byY());
        }
        for (l1 = bi.bI(l1);; l1 = 0L)
        {
          j = -1;
          if ((((String)localObject).contains("jpg")) || (((String)localObject).contains("jpeg")))
          {
            int k = MMNativeJpeg.queryQuality(this.nsN.getPath() + str1);
            j = k;
            if (k == 0) {
              j = -1;
            }
          }
          c.a(this.nsN.getPath() + str1, this.nsN.url, 0, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, j, l3, l2);
          break;
          FileOp.i(this.nsN.getPath(), this.nsN.byY(), str1);
        }
        bool = false;
        break label194;
      }
      label1447:
      i = 2;
    }
  }
  
  protected final int bzb()
  {
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */