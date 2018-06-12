package com.tencent.mm.plugin.fav.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.ThumbnailUtils;
import android.support.v4.app.Fragment;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.snackbar.a.b;
import com.tencent.mm.ui.widget.snackbar.a.c;
import com.tencent.mm.y.g.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class c
{
  private static aa<String, Bitmap> iYG = new aa(20);
  private static Map<String, Integer> iYH = new HashMap();
  
  static
  {
    HashMap localHashMap = new HashMap();
    iYH = localHashMap;
    localHashMap.put("avi", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("m4v", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("vob", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("mpeg", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("mpe", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("asx", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("asf", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("f4v", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("flv", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("mkv", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("wmv", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("wm", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("3gp", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("mp4", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("rmvb", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("rm", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("ra", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("ram", Integer.valueOf(m.h.app_attach_file_icon_video));
    iYH.put("mp3pro", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("vqf", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("cd", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("md", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("mod", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("vorbis", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("au", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("amr", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("silk", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("wma", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("mmf", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("mid", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("midi", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("mp3", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("aac", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("ape", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("aiff", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("aif", Integer.valueOf(m.h.app_attach_file_icon_music));
    iYH.put("jfif", Integer.valueOf(m.h.app_attach_file_icon_pic));
    iYH.put("tiff", Integer.valueOf(m.h.app_attach_file_icon_pic));
    iYH.put("tif", Integer.valueOf(m.h.app_attach_file_icon_pic));
    iYH.put("jpe", Integer.valueOf(m.h.app_attach_file_icon_pic));
    iYH.put("dib", Integer.valueOf(m.h.app_attach_file_icon_pic));
    iYH.put("jpeg", Integer.valueOf(m.h.app_attach_file_icon_pic));
    iYH.put("jpg", Integer.valueOf(m.h.app_attach_file_icon_pic));
    iYH.put("png", Integer.valueOf(m.h.app_attach_file_icon_pic));
    iYH.put("bmp", Integer.valueOf(m.h.app_attach_file_icon_pic));
    iYH.put("gif", Integer.valueOf(m.h.app_attach_file_icon_pic));
    iYH.put("rar", Integer.valueOf(m.h.app_attach_file_icon_rar));
    iYH.put("zip", Integer.valueOf(m.h.app_attach_file_icon_rar));
    iYH.put("7z", Integer.valueOf(m.h.app_attach_file_icon_rar));
    iYH.put("iso", Integer.valueOf(m.h.app_attach_file_icon_rar));
    iYH.put("cab", Integer.valueOf(m.h.app_attach_file_icon_rar));
    iYH.put("doc", Integer.valueOf(m.h.app_attach_file_icon_word));
    iYH.put("docx", Integer.valueOf(m.h.app_attach_file_icon_word));
    iYH.put("ppt", Integer.valueOf(m.h.app_attach_file_icon_ppt));
    iYH.put("pptx", Integer.valueOf(m.h.app_attach_file_icon_ppt));
    iYH.put("xls", Integer.valueOf(m.h.app_attach_file_icon_excel));
    iYH.put("xlsx", Integer.valueOf(m.h.app_attach_file_icon_excel));
    iYH.put("txt", Integer.valueOf(m.h.app_attach_file_icon_txt));
    iYH.put("rtf", Integer.valueOf(m.h.app_attach_file_icon_txt));
    iYH.put("pdf", Integer.valueOf(m.h.app_attach_file_icon_pdf));
    iYH.put("unknown", Integer.valueOf(m.h.app_attach_file_icon_unknow));
  }
  
  public static int Bx(String paramString)
  {
    paramString = (Integer)iYH.get(paramString);
    if (paramString == null) {
      return ((Integer)iYH.get("unknown")).intValue();
    }
    return paramString.intValue();
  }
  
  @TargetApi(8)
  public static Bitmap By(String paramString)
  {
    Bitmap localBitmap = null;
    if (com.tencent.mm.compatible.util.d.fR(8)) {
      localBitmap = ThumbnailUtils.createVideoThumbnail(paramString, 1);
    }
    return localBitmap;
  }
  
  private static int a(ch paramch, int paramInt)
  {
    int i = 1;
    vx localvx;
    if ((paramch.bJF.bJH.rBI != null) && (paramch.bJF.bJH.rBI.size() > 0))
    {
      localvx = (vx)paramch.bJF.bJH.rBI.getLast();
      if (paramInt > 0) {}
    }
    switch (paramInt)
    {
    default: 
      localvx.CH(0);
      if ((paramch.bJF.bJH.rBI == null) || (paramch.bJF.bJH.rBI.size() == 0)) {
        paramch.bJF.bJL = paramInt;
      }
      break;
    }
    while (paramch.bJF.bJL == -9)
    {
      return paramInt;
      localvx.CH(1);
      localvx.UP(null);
      break;
      localvx.CH(2);
      localvx.UP(null);
      break;
    }
    int j = i;
    if (paramInt <= 0) {
      if (paramch.bJF.bJL <= 0) {
        break label420;
      }
    }
    label420:
    for (j = i;; j = 0)
    {
      int k = 0;
      i = 0;
      int n = 0;
      int m = 0;
      if (k < paramch.bJF.bJH.rBI.size())
      {
        switch (((vx)paramch.bJF.bJH.rBI.get(k)).rAw)
        {
        }
        for (;;)
        {
          k += 1;
          break;
          i += 1;
          continue;
          n += 1;
          continue;
          m += 1;
        }
      }
      if (j > 0)
      {
        if ((n > 0) || (i > 0))
        {
          paramch.bJF.bJL = -9;
          return paramInt;
        }
        paramch.bJF.bJL = paramInt;
        return paramInt;
      }
      if (n > 0)
      {
        if (i > 0)
        {
          paramch.bJF.bJL = -8;
          return paramInt;
        }
        if (m == 0)
        {
          paramch.bJF.bJL = -5;
          return paramInt;
        }
        if (m <= 0) {
          break;
        }
        paramch.bJF.bJL = -7;
        return paramInt;
      }
      if (i <= 0) {
        break;
      }
      if (m == 0)
      {
        paramch.bJF.bJL = -4;
        return paramInt;
      }
      if (m <= 0) {
        break;
      }
      paramch.bJF.bJL = -6;
      return paramInt;
    }
  }
  
  public static int a(bd parambd, ch paramch, boolean paramBoolean)
  {
    x.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo msg type is %d", new Object[] { Integer.valueOf(parambd.getType()) });
    if ((!paramBoolean) && (paramch.bJF.bJL > 0))
    {
      x.i("MicroMsg.FavExportLogic", "(!result)&&(favoriteEvent.data.errorType > FavExportLogic.KEY_FAV_PARA_NO_ERROR)");
      return a(paramch, paramch.bJF.bJL);
    }
    if ((paramch.bJF.type == 4) || (paramch.bJF.type == 8) || (paramch.bJF.type == 16) || (paramch.bJF.type == 2)) {}
    for (paramBoolean = false;; paramBoolean = true)
    {
      boolean bool = paramBoolean;
      Object localObject;
      if (paramch.bJF.type == 14)
      {
        bool = paramBoolean;
        if (paramch.bJF.bJH.rBI.size() > 0)
        {
          localObject = (vx)paramch.bJF.bJH.rBI.getLast();
          if ((((vx)localObject).bjS != 4) && (((vx)localObject).bjS != 8) && (((vx)localObject).bjS != 15))
          {
            bool = paramBoolean;
            if (((vx)localObject).bjS != 2) {}
          }
          else
          {
            bool = false;
          }
        }
      }
      x.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo msg type skipCheck %B", new Object[] { Boolean.valueOf(bool) });
      if (bool) {
        return a(paramch, 0);
      }
      if (paramch.bJF.bJH == null) {
        return a(paramch, -1);
      }
      if (paramch.bJF.bJH.rBI == null) {
        return a(paramch, -1);
      }
      if (System.currentTimeMillis() - parambd.field_createTime > 259200000L) {}
      for (paramBoolean = true;; paramBoolean = false)
      {
        x.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo isOverThreeDays %B", new Object[] { Boolean.valueOf(paramBoolean) });
        if (1 <= paramch.bJF.bJH.rBI.size()) {}
        for (localObject = ((vx)paramch.bJF.bJH.rBI.getLast()).rzM;; localObject = "")
        {
          if (paramBoolean)
          {
            if ((!bi.oW((String)localObject)) && (com.tencent.mm.vfs.d.cn((String)localObject))) {
              break label530;
            }
            if ((parambd != null) && ((parambd.getType() == 43) || (parambd.getType() == 44) || (parambd.getType() == 62)))
            {
              localObject = t.nW(parambd.field_imgPath);
              if ((localObject != null) && (((r)localObject).enT == -1))
              {
                localObject = ((r)localObject).Tl();
                if (!com.tencent.mm.vfs.d.cn((String)localObject)) {}
              }
            }
            while (bi.oW((String)localObject))
            {
              return a(paramch, -4);
              localObject = null;
            }
            ((vx)paramch.bJF.bJH.rBI.getLast()).UP((String)localObject);
          }
          label530:
          for (;;)
          {
            if (a(parambd, paramch, (String)localObject, true)) {
              return a(paramch, -5);
            }
            x.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  isOverThreeDays true not big not expired");
            do
            {
              x.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  fav data is normal");
              return a(paramch, 0);
            } while (!a(parambd, paramch, (String)localObject, false));
            return a(paramch, -5);
          }
        }
      }
    }
  }
  
  public static void a(int paramInt1, int paramInt2, Activity paramActivity, Fragment paramFragment, a.c paramc, DialogInterface.OnClickListener paramOnClickListener, a.b paramb)
  {
    if ((paramActivity == null) && (paramFragment == null))
    {
      x.e("MicroMsg.FavExportLogic", "handleErrorType activity = null && fragment = null");
      return;
    }
    if (paramb == null) {}
    for (Object localObject1 = new c.1();; localObject1 = paramb)
    {
      if (paramInt2 == 0)
      {
        if (paramFragment != null)
        {
          com.tencent.mm.ui.widget.snackbar.b.a(paramFragment, paramFragment.getString(m.i.favorite_ok), paramFragment.getString(m.i.favorite_add_tag_tips), (a.b)localObject1, paramc);
          return;
        }
        if (paramActivity == null) {
          break;
        }
        com.tencent.mm.ui.widget.snackbar.b.a(paramActivity, paramActivity.getString(m.i.favorite_ok), paramActivity.getString(m.i.favorite_add_tag_tips), (a.b)localObject1, paramc);
        return;
      }
      if (paramActivity == null) {}
      for (paramb = paramFragment.getActivity();; paramb = paramActivity)
      {
        switch (paramInt2)
        {
        case -3: 
        default: 
          h.a(paramb, paramInt2, 0, new c.2(paramOnClickListener));
          return;
        case -2: 
          h.a(paramb, paramb.getString(m.i.favorite_fail_clean_alert_content), paramb.getString(m.i.favorite_fail_clean_alert_title), paramb.getString(m.i.favorite_fail_fav_clean), paramb.getString(m.i.confirm_dialog_cancel), new c.3(paramb, paramOnClickListener), new c.4(paramOnClickListener), m.b.wechat_green);
          return;
        }
        Object localObject2;
        if (paramFragment == null)
        {
          localObject2 = paramb;
          if (paramInt2 != -4) {
            break label408;
          }
          switch (paramInt1)
          {
          default: 
            paramActivity = "";
          }
        }
        for (;;)
        {
          h.a((Context)localObject2, paramActivity, "", ((Context)localObject2).getString(m.i.plugin_favorite_opt), ((Context)localObject2).getString(m.i.confirm_dialog_cancel), new c.5(paramOnClickListener, paramFragment, (a.b)localObject1, paramc, paramb), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              paramAnonymousDialogInterface.dismiss();
              if (this.iYJ != null) {
                this.iYJ.onClick(paramAnonymousDialogInterface, -1);
              }
            }
          }, m.b.wechat_green);
          return;
          localObject2 = paramFragment.getActivity();
          break;
          paramActivity = ((Context)localObject2).getString(m.i.favorite_expired_image);
          continue;
          paramActivity = ((Context)localObject2).getString(m.i.favorite_expired_file);
          continue;
          paramActivity = ((Context)localObject2).getString(m.i.favorite_expired_video);
          continue;
          paramActivity = ((Context)localObject2).getString(m.i.favorite_fail_record_expired);
          continue;
          label408:
          if (paramInt2 == -5)
          {
            if (paramInt1 != 14) {
              paramActivity = ((Context)localObject2).getString(m.i.favorite_big_file);
            } else {
              paramActivity = ((Context)localObject2).getString(m.i.favorite_fail_record_bigfile);
            }
          }
          else if (paramInt2 == -6)
          {
            paramActivity = ((Context)localObject2).getString(m.i.favorite_fail_record_expired);
          }
          else if (paramInt2 == -7)
          {
            paramActivity = ((Context)localObject2).getString(m.i.favorite_fail_record_bigfile);
          }
          else if (paramInt2 == -8)
          {
            paramActivity = ((Context)localObject2).getString(m.i.favorite_fail_record_expired_bigfile);
          }
          else
          {
            if (paramInt2 == -9)
            {
              if (paramFragment != null)
              {
                com.tencent.mm.ui.widget.snackbar.b.a(paramFragment, ((Context)localObject2).getString(m.i.favorite_ok), ((Context)localObject2).getString(m.i.favorite_add_tag_tips), (a.b)localObject1, paramc);
                return;
              }
              com.tencent.mm.ui.widget.snackbar.b.a(paramb, ((Context)localObject2).getString(m.i.favorite_ok), ((Context)localObject2).getString(m.i.favorite_add_tag_tips), (a.b)localObject1, paramc);
              return;
            }
            paramActivity = ((Context)localObject2).getString(m.i.favorite_fail_argument_error);
          }
        }
      }
    }
  }
  
  public static void a(int paramInt, Activity paramActivity, a.b paramb)
  {
    a(-1, paramInt, paramActivity, null, null, null, paramb);
  }
  
  private static boolean a(bd parambd, ch paramch, String paramString, boolean paramBoolean)
  {
    Object localObject;
    if (!bi.oW(paramString))
    {
      localObject = new com.tencent.mm.vfs.b(paramString);
      if (((com.tencent.mm.vfs.b)localObject).exists())
      {
        if (((com.tencent.mm.vfs.b)localObject).length() > com.tencent.mm.k.b.AB())
        {
          x.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file is big");
          return true;
        }
        x.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file not big");
      }
    }
    else
    {
      localObject = parambd.field_content;
      if (localObject == null) {
        break label233;
      }
    }
    label233:
    for (parambd = g.a.J((String)localObject, parambd.field_reserved);; parambd = null)
    {
      if (parambd != null)
      {
        if ((parambd.dws != 0) || (parambd.dwo > com.tencent.mm.k.b.AB()))
        {
          x.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file is big");
          return true;
          if (paramBoolean) {
            break;
          }
          x.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  not download finish ！attachFile.exists()");
          ((vx)paramch.bJF.bJH.rBI.getLast()).UP(null);
          break;
        }
        if ((!bi.oW(paramString)) && (com.tencent.mm.vfs.d.cn(paramString)) && (!paramBoolean))
        {
          long l = com.tencent.mm.vfs.d.abQ(paramString);
          if (parambd.dwo > l)
          {
            x.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  not download finish content.attachlen > datasize");
            ((vx)paramch.bJF.bJH.rBI.getLast()).UP(null);
          }
        }
      }
      if ((localObject == null) || (parambd == null)) {
        x.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  (xml == null ) ||(content == null)");
      }
      return false;
    }
  }
  
  public static void aMi() {}
  
  public static Bitmap at(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    if (bi.oW(paramString)) {
      return null;
    }
    Object localObject = (Bitmap)iYG.get(paramString);
    if (localObject != null)
    {
      x.d("MicroMsg.FavExportLogic", "get bm from cache %s", new Object[] { paramString });
      return (Bitmap)localObject;
    }
    if (paramBoolean) {
      return null;
    }
    if (!com.tencent.mm.vfs.d.cn(paramString)) {
      return null;
    }
    x.d("MicroMsg.FavExportLogic", "get from cache fail, try to decode from file");
    localObject = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(paramString, (BitmapFactory.Options)localObject);
    if (localBitmap != null)
    {
      x.i("MicroMsg.FavExportLogic", "bitmap recycle %s", new Object[] { localBitmap });
      localBitmap.recycle();
    }
    int j;
    if ((z.bv(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) && (((BitmapFactory.Options)localObject).outWidth > 480))
    {
      i = 1;
      if ((!z.bu(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) || (((BitmapFactory.Options)localObject).outHeight <= 480)) {
        break label227;
      }
      j = 1;
    }
    for (;;)
    {
      label182:
      if ((i != 0) || (j != 0))
      {
        i = ((BitmapFactory.Options)localObject).outHeight;
        j = ((BitmapFactory.Options)localObject).outWidth;
        for (;;)
        {
          if (j * i > 2764800)
          {
            j >>= 1;
            i >>= 1;
            continue;
            i = 0;
            break;
            label227:
            j = 0;
            break label182;
          }
        }
        j = Math.max(1, j);
        i = Math.max(1, i);
        x.w("MicroMsg.FavExportLogic", "fit long picture, beg %d*%d, after %d*%d", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject).outWidth), Integer.valueOf(((BitmapFactory.Options)localObject).outHeight), Integer.valueOf(j), Integer.valueOf(i) });
      }
    }
    int i = BackwardSupportUtil.ExifHelper.VX(paramString);
    if ((MMNativeJpeg.IsJpegFile(paramString)) && (MMNativeJpeg.isProgressive(paramString)))
    {
      localObject = MMNativeJpeg.decodeAsBitmap(paramString);
      if (localObject == null)
      {
        paramBoolean = bool;
        x.i("MicroMsg.FavExportLogic", "Progressive jpeg, result isNull:%b", new Object[] { Boolean.valueOf(paramBoolean) });
      }
    }
    for (;;)
    {
      if (localObject != null) {
        break label391;
      }
      x.e("MicroMsg.FavExportLogic", "getSuitableBmp fail, temBmp is null, filePath = " + paramString);
      return null;
      paramBoolean = false;
      break;
      localObject = com.tencent.mm.sdk.platformtools.c.cU(paramString, 0);
    }
    label391:
    localObject = com.tencent.mm.sdk.platformtools.c.b((Bitmap)localObject, i);
    iYG.put(paramString, localObject);
    return (Bitmap)localObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */