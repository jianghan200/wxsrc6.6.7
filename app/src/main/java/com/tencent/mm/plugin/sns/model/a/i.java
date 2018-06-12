package com.tencent.mm.plugin.sns.model.a;

import android.graphics.BitmapFactory.Options;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.h.c;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends f
{
  private boolean dBk = false;
  
  public i(c.a parama, a parama1)
  {
    super(parama, parama1);
    h.mEJ.a(150L, 10L, 1L, true);
  }
  
  public final boolean bza()
  {
    String str2;
    String str3;
    BitmapFactory.Options localOptions;
    String str1;
    if (this.nsN.nkK != null)
    {
      str2 = com.tencent.mm.plugin.sns.data.i.e(this.caK);
      this.dBk = s.NB(this.nsN.getPath() + this.nsN.byY());
      if (this.ntm) {
        this.dBk = true;
      }
      if (this.dBk) {
        h.mEJ.a(22L, 64L, 1L, true);
      }
      str3 = this.nsN.getPath() + this.nsN.byY();
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      MMBitmapFactory.decodeFile(str3, localOptions, null, 0, new int[0]);
      if (localOptions.outMimeType == null) {
        break label1087;
      }
      str1 = localOptions.outMimeType.toLowerCase();
      if ((localOptions.outMimeType == null) || (bi.oW(localOptions.outMimeType))) {
        h.mEJ.a(150L, 35L, 1L, true);
      }
      if ((!str1.contains("jpg")) && (!str1.contains("jpeg"))) {
        break label1119;
      }
      int j = MMNativeJpeg.queryQuality(str3);
      i = j;
      if (j != 0) {}
    }
    label1087:
    label1095:
    label1119:
    for (int i = -1;; i = -1)
    {
      long l1 = FileOp.mI(str3);
      if (l1 <= 0L) {
        h.mEJ.a(150L, 23L, 1L, true);
      }
      long l2 = bi.VG();
      str1 = com.tencent.mm.plugin.sns.data.i.i(this.caK);
      FileOp.y(this.nsN.getPath() + this.nsN.byY(), this.nsN.getPath() + str1);
      x.v("MicroMsg.SnsDownloadThumb", "file src" + FileOp.cn(new StringBuilder().append(this.nsN.getPath()).append(str1).toString()));
      long l3 = bi.VG();
      if (!s.a(this.nsN.getPath(), this.nsN.byY(), str2, af.byx()))
      {
        x.e("MicroMsg.SnsDownloadThumb", "decodeInfo createThumb failed");
        h.mEJ.a(150L, 27L, 1L, true);
      }
      l3 = bi.bI(l3);
      boolean bool = FileOp.cn(this.nsN.getPath() + this.nsN.byY());
      FileOp.deleteFile(this.nsN.getPath() + this.nsN.byY());
      l2 = bi.bI(l2);
      if (!FileOp.cn(this.nsN.getPath() + str2))
      {
        x.i("MicroMsg.SnsDownloadThumb", "fileExists is false %s", new Object[] { Long.valueOf(FileOp.mI(this.nsN.getPath() + str2)) });
        h.mEJ.a(150L, 31L, 1L, true);
        if ((bool) && (!FileOp.cn(this.nsN.getPath() + str2)))
        {
          bool = com.tencent.mm.plugin.normsg.a.b.lFJ.cKL();
          x.i("MicroMsg.SnsDownloadThumb", "let me see Is DuplicatedApp? %s", new Object[] { Boolean.valueOf(bool) });
          h.mEJ.a(150L, 32L, 1L, true);
          if (bool) {
            h.mEJ.a(150L, 33L, 1L, true);
          }
        }
      }
      h.mEJ.h(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l2), Integer.valueOf(this.nth), Thread.currentThread().getName(), af.byB(), com.tencent.mm.compatible.util.e.bnC });
      if ((this.nsN.nkK.nkQ == 0) || (this.nsN.nkK.nkQ == 5))
      {
        str1 = com.tencent.mm.plugin.sns.data.i.f(this.caK);
        s.b(this.nsN.getPath(), str2, str1, af.byw());
      }
      for (;;)
      {
        c.a(this.nsN.getPath() + str1, this.nsN.url, 1, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, i, l1, l3);
        this.nsM = com.tencent.mm.plugin.sns.data.i.LJ(this.nsN.getPath() + str1);
        bool = com.tencent.mm.plugin.sns.data.i.b(this.nsM);
        x.i("MicroMsg.SnsDownloadThumb", "download decode bitmap done : succ: " + bool + " isWebp: " + this.dBk + " srcImgFileSize: " + l1);
        if (!bool)
        {
          h.mEJ.a(150L, 65L, 1L, true);
          if (!this.nto) {
            break label1095;
          }
          h.mEJ.a(150L, 50L, 1L, true);
        }
        for (;;)
        {
          if (this.ntn) {
            h.mEJ.a(150L, 54L, 1L, true);
          }
          if (this.ntm) {
            h.mEJ.a(150L, 57L, 1L, true);
          }
          if ((this.dBk) && (!bool)) {
            h.mEJ.a(22L, 65L, 1L, true);
          }
          if ((this.nto) && (bool)) {
            com.tencent.mm.plugin.sns.lucky.a.b.kB(139);
          }
          return true;
          str1 = "";
          break;
          h.mEJ.a(150L, 51L, 1L, true);
        }
        str1 = str2;
      }
    }
  }
  
  protected final int bzb()
  {
    return 3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */