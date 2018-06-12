package com.tencent.mm.plugin.masssend.a;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.bt.h;
import com.tencent.mm.model.au;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS massendinfo ( clientid text  PRIMARY KEY , status int  , createtime long  , lastmodifytime long  , filename text  , thumbfilename text  , tolist text  , tolistcount int  , msgtype int  , mediatime int  , datanetoffset int  , datalen int  , thumbnetoffset int  , thumbtotallen int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) ", "CREATE INDEX IF NOT EXISTS  massendinfostatus_index ON massendinfo ( status )" };
  public h dCZ;
  
  public b(h paramh)
  {
    this.dCZ = paramh;
  }
  
  public static Bitmap Gh(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return null;
    }
    paramString = paramString.trim();
    StringBuilder localStringBuilder = new StringBuilder();
    au.HU();
    return y.oQ(com.tencent.mm.model.c.Gb() + paramString);
  }
  
  public static String a(a parama)
  {
    switch (parama.msgType)
    {
    default: 
      return ad.getContext().getResources().getString(R.l.contact_info_masssend_tip);
    case 1: 
      return parama.bch();
    case 3: 
      return ad.getContext().getResources().getString(R.l.app_pic);
    case 34: 
      return ad.getContext().getResources().getString(R.l.app_voice);
    }
    return ad.getContext().getResources().getString(R.l.app_video);
  }
  
  public static Bitmap d(String paramString, float paramFloat)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      paramString = null;
    }
    Object localObject;
    do
    {
      return paramString;
      paramString = paramString.trim();
      localObject = new StringBuilder();
      au.HU();
      localObject = BackwardSupportUtil.b.e(com.tencent.mm.model.c.Gb() + paramString, paramFloat);
      paramString = (String)localObject;
    } while (localObject == null);
    return Bitmap.createScaledBitmap((Bitmap)localObject, (int)(((Bitmap)localObject).getWidth() * paramFloat), (int)(((Bitmap)localObject).getHeight() * paramFloat), true);
  }
  
  public static a i(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    if (!e.cn(paramString1)) {
      return null;
    }
    au.HU();
    Object localObject = com.tencent.mm.model.c.Gb();
    int i = BackwardSupportUtil.ExifHelper.VX(paramString1);
    String str = g.u((paramString1 + System.currentTimeMillis()).getBytes());
    x.d("MicroMsg.MasSendInfoStorage", "insert : original img path = " + paramString1);
    BitmapFactory.Options localOptions = com.tencent.mm.sdk.platformtools.c.VZ(paramString1);
    if ((paramInt2 == 0) && ((e.cm(paramString1) > 204800) || ((localOptions != null) && ((localOptions.outHeight > 960) || (localOptions.outWidth > 960)))))
    {
      if (!com.tencent.mm.sdk.platformtools.c.a(paramString1, 960, 960, Bitmap.CompressFormat.JPEG, 70, (String)localObject, str)) {
        return null;
      }
      e.i((String)localObject, str, str + ".jpg");
    }
    for (;;)
    {
      paramString1 = str + ".jpg";
      x.d("MicroMsg.MasSendInfoStorage", "insert: compressed bigImgPath = " + paramString1);
      if ((paramInt2 != 0) || (i == 0) || (com.tencent.mm.sdk.platformtools.c.a((String)localObject + paramString1, i, Bitmap.CompressFormat.JPEG, (String)localObject, str + ".jpg"))) {
        break;
      }
      return null;
      e.a((String)localObject, str, ".jpg", e.e(paramString1, 0, e.cm(paramString1)));
    }
    str = g.u((paramString1 + System.currentTimeMillis()).getBytes());
    if (!com.tencent.mm.sdk.platformtools.c.a((String)localObject + paramString1, 120, 120, Bitmap.CompressFormat.JPEG, 90, (String)localObject, str)) {
      return null;
    }
    x.d("MicroMsg.MasSendInfoStorage", "insert: thumbName = " + str);
    localObject = new a();
    ((a)localObject).msgType = 3;
    ((a)localObject).laj = paramString2;
    ((a)localObject).lak = paramInt1;
    ((a)localObject).lai = str;
    ((a)localObject).filename = paramString1;
    return (a)localObject;
  }
  
  public final a Gi(String paramString)
  {
    Object localObject = null;
    paramString = "select massendinfo.clientid,massendinfo.status,massendinfo.createtime,massendinfo.lastmodifytime,massendinfo.filename,massendinfo.thumbfilename,massendinfo.tolist,massendinfo.tolistcount,massendinfo.msgtype,massendinfo.mediatime,massendinfo.datanetoffset,massendinfo.datalen,massendinfo.thumbnetoffset,massendinfo.thumbtotallen,massendinfo.reserved1,massendinfo.reserved2,massendinfo.reserved3,massendinfo.reserved4 from massendinfo   where massendinfo.clientid = \"" + bi.oU(paramString) + "\"";
    Cursor localCursor = this.dCZ.b(paramString, null, 2);
    if (localCursor == null) {
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new a();
      paramString.d(localCursor);
    }
    localCursor.close();
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/masssend/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */