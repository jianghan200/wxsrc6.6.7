package com.tencent.mm.pluginsdk.model.app;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.a.g;
import com.tencent.mm.g.c.p;
import com.tencent.mm.plugin.ac.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public final class i
  extends com.tencent.mm.sdk.e.i<f>
{
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(f.dhO, "AppInfo") };
  public final com.tencent.mm.a.f<String, f> qzQ = new com.tencent.mm.a.f(50);
  
  public i(e parame)
  {
    super(parame, f.dhO, "AppInfo", p.ciG);
    parame = new f();
    parame.field_appId = "wx4310bbd51be7d979";
    if (!super.b(parame, new String[0]))
    {
      parame = new f();
      parame.field_appId = "wx4310bbd51be7d979";
      parame.field_appName = "weixinfile";
      parame.field_packageName = "com.tencent.mm.openapi";
      parame.field_status = -1;
      super.b(parame);
    }
  }
  
  private void Ck(String paramString)
  {
    if (!bi.oW(paramString)) {
      this.qzQ.remove(paramString);
    }
  }
  
  public static String cQ(String paramString, int paramInt)
  {
    int i = 0;
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.AppInfoStorage", "getIconPath : invalid argument");
      return null;
    }
    String str = a.bmc();
    File localFile1 = new File(str);
    File localFile2;
    if (!localFile1.exists()) {
      if (!localFile1.getParentFile().exists())
      {
        localFile2 = localFile1.getParentFile();
        File localFile3 = new File(localFile2.getAbsolutePath() + System.currentTimeMillis());
        if (localFile3.mkdir()) {
          localFile3.renameTo(localFile2);
        }
      }
      else
      {
        if ((localFile1.mkdir()) && (localFile1.isDirectory())) {
          break label225;
        }
        x.e("MicroMsg.AppInfoStorage", "mkdir error. %s", new Object[] { str });
      }
    }
    while (i != 0) {
      switch (paramInt)
      {
      default: 
        x.e("MicroMsg.AppInfoStorage", "getIconPath, unknown iconType = " + paramInt);
        return null;
        x.e("MicroMsg.AppInfoStorage", "mkdir error, %s", new Object[] { localFile2.getAbsolutePath() });
        continue;
        label225:
        i = 1;
      }
    }
    return a.bmc() + g.u(paramString.getBytes()) + ".png";
    return a.bmc() + g.u(paramString.getBytes()) + "_wm.png";
    return a.bmc() + g.u(paramString.getBytes()) + "_sg.png";
    return a.bmc() + g.u(paramString.getBytes()) + "_sl.png";
    return a.bmc() + g.u(paramString.getBytes()) + "_sp.png";
  }
  
  public static f cbQ()
  {
    f localf = new f();
    localf.field_appName = "invalid_appname";
    localf.field_packageName = "";
    localf.field_signature = "";
    localf.field_status = 3;
    return localf;
  }
  
  private void k(f paramf)
  {
    if ((paramf == null) || (paramf.field_appId == null)) {
      return;
    }
    this.qzQ.m(paramf.field_appId, paramf);
  }
  
  public final f SW(String paramString)
  {
    Object localObject;
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.AppInfoStorage", "appId is null");
      localObject = null;
      return (f)localObject;
    }
    f localf = (f)this.qzQ.get(paramString);
    if (localf != null) {}
    for (;;)
    {
      if (localf != null)
      {
        localObject = localf;
        if (!bi.oW(localf.field_appId)) {
          break;
        }
      }
      localf = new f();
      localf.field_appId = paramString;
      if (!super.b(localf, new String[0])) {
        break label91;
      }
      k(localf);
      return localf;
      localf = null;
    }
    label91:
    return null;
  }
  
  public final boolean a(f paramf, String... paramVarArgs)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramf != null)
    {
      if (!bi.oW(paramf.field_appId)) {
        break label25;
      }
      bool1 = bool2;
    }
    label25:
    do
    {
      return bool1;
      Ck(paramf.field_appId);
      bool2 = super.b(paramf, false, paramVarArgs);
      bool1 = bool2;
    } while (!bool2);
    b(paramf.field_appId, 3, paramf.field_appId);
    return bool2;
  }
  
  public final boolean b(f paramf, String... paramVarArgs)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramf != null)
    {
      if (!bi.oW(paramf.field_appId)) {
        break label25;
      }
      bool1 = bool2;
    }
    label25:
    do
    {
      return bool1;
      Ck(paramf.field_appId);
      bool2 = super.a(paramf, false, paramVarArgs);
      bool1 = bool2;
    } while (!bool2);
    b(paramf.field_appId, 5, paramf.field_appId);
    return bool2;
  }
  
  public final List<String> cbO()
  {
    x.d("MicroMsg.AppInfoStorage", "getNullOpenIdList, maxCount = -1");
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = rawQuery("select appId from AppInfo where openId is NULL ", new String[0]);
    if (localCursor == null) {
      x.e("MicroMsg.AppInfoStorage", "get null cursor");
    }
    do
    {
      return localArrayList;
      int i = localCursor.getCount();
      if (i <= 0)
      {
        x.w("MicroMsg.AppInfoStorage", "getNullOpenIdList fail, cursor count = " + i);
        localCursor.close();
        return localArrayList;
      }
      if (localCursor.moveToFirst()) {
        while (!localCursor.isAfterLast())
        {
          i = localCursor.getColumnIndex("appId");
          if (i >= 0)
          {
            String str = localCursor.getString(i);
            if (!bi.oW(str)) {
              localArrayList.add(str);
            }
          }
          localCursor.moveToNext();
        }
      }
    } while (localCursor == null);
    localCursor.close();
    return localArrayList;
  }
  
  public final Cursor cbP()
  {
    Cursor localCursor2 = rawQuery("select * from AppInfo where appType like '%1,%'", new String[0]);
    Cursor localCursor1 = localCursor2;
    if (localCursor2 == null)
    {
      x.e("MicroMsg.AppInfoStorage", "getGameApp : cursor is null");
      localCursor1 = null;
    }
    return localCursor1;
  }
  
  public final Cursor dh(int paramInt1, int paramInt2)
  {
    Object localObject = new StringBuilder(256);
    ((StringBuilder)localObject).append("select * from AppInfo");
    ((StringBuilder)localObject).append(" where ");
    if (paramInt1 != 0) {
      ((StringBuilder)localObject).append(" ( serviceAppInfoFlag & ").append(paramInt1).append(" ) != 0 and ");
    }
    ((StringBuilder)localObject).append(" ( serviceShowFlag & ").append(paramInt2).append(" ) != 0");
    localObject = rawQuery(((StringBuilder)localObject).toString(), new String[0]);
    if (localObject == null)
    {
      x.e("MicroMsg.AppInfoStorage", "getServiceByAppInfoFlagAndShowFlag : cursor is null");
      return null;
    }
    x.d("MicroMsg.AppInfoStorage", "getServiceByAppInfoFlagAndShowFlag count = %d", new Object[] { Integer.valueOf(((Cursor)localObject).getCount()) });
    return (Cursor)localObject;
  }
  
  public final boolean e(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      x.e("MicroMsg.AppInfoStorage", "saveIcon, invalid argument");
    }
    do
    {
      return false;
      localObject = cQ(paramString, paramInt);
      if (localObject == null)
      {
        x.e("MicroMsg.AppInfoStorage", "saveIcon fail, iconPath is null");
        return false;
      }
      localObject = new File((String)localObject);
      if (((File)localObject).exists()) {
        ((File)localObject).delete();
      }
      try
      {
        localObject = new FileOutputStream((File)localObject);
        x.printErrStackTrace("MicroMsg.AppInfoStorage", paramString, "", new Object[0]);
      }
      catch (Exception paramString)
      {
        try
        {
          ((FileOutputStream)localObject).write(paramArrayOfByte);
          ((FileOutputStream)localObject).close();
          Xp(paramString);
          return true;
        }
        catch (Exception paramString)
        {
          for (;;)
          {
            paramArrayOfByte = (byte[])localObject;
          }
        }
        paramString = paramString;
        paramArrayOfByte = null;
      }
      x.e("MicroMsg.AppInfoStorage", "saveIcon, exception, e = " + paramString.getMessage());
    } while (paramArrayOfByte == null);
    try
    {
      paramArrayOfByte.close();
      return false;
    }
    catch (IOException paramString)
    {
      return false;
    }
  }
  
  public final boolean l(f paramf)
  {
    if ((paramf == null) || (bi.oW(paramf.field_appId))) {}
    while (!super.a(paramf, false)) {
      return false;
    }
    b(paramf.field_appId, 2, paramf.field_appId);
    k(paramf);
    return true;
  }
  
  public final boolean t(String paramString, Bitmap paramBitmap)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      x.e("MicroMsg.AppInfoStorage", "saveIcon : invalid argument");
      return false;
    }
    Object localObject = cQ(paramString, 1);
    if (localObject == null)
    {
      x.e("MicroMsg.AppInfoStorage", "saveIcon fail, iconPath is null");
      return false;
    }
    localObject = new File((String)localObject);
    if (((File)localObject).exists()) {
      ((File)localObject).delete();
    }
    try
    {
      localObject = new FileOutputStream((File)localObject);
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject);
      ((FileOutputStream)localObject).close();
      Xp(paramString);
      return true;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.AppInfoStorage", paramString, "", new Object[0]);
      x.e("MicroMsg.AppInfoStorage", "saveIcon : compress occurs an exception");
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */