package com.tencent.mm.plugin.downloader.c;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class b
  extends i<a>
{
  public static final String[] diD = { i.a(a.dhO, "FileDownloadInfo"), "CREATE INDEX IF NOT EXISTS filedownloadinfo_appId  on FileDownloadInfo  (  appId )", "CREATE INDEX IF NOT EXISTS filedownloadinfo_status  on FileDownloadInfo  (  status )" };
  
  public b(e parame)
  {
    super(parame, a.dhO, "FileDownloadInfo", null);
  }
  
  public static String o(ArrayList<String> paramArrayList)
  {
    String str = "";
    if (bi.cX(paramArrayList)) {
      return "1=1";
    }
    int i = 0;
    while (i < paramArrayList.size() - 1)
    {
      str = str + "appId=\"" + (String)paramArrayList.get(i) + "\" or ";
      i += 1;
    }
    return str + "appId=\"" + (String)paramArrayList.get(paramArrayList.size() - 1) + "\"";
  }
  
  public final boolean aDd()
  {
    return fV("FileDownloadInfo", "delete from FileDownloadInfo");
  }
  
  public final a cz(long paramLong)
  {
    a locala1 = null;
    a locala2 = null;
    if (paramLong < 0L) {
      x.e("MicroMsg.FileDownloadInfoStorage", "download id is not avaiable");
    }
    Cursor localCursor;
    do
    {
      do
      {
        return locala2;
        localCursor = rawQuery("select * from FileDownloadInfo where downloadId=" + paramLong, new String[0]);
      } while (localCursor == null);
      if (localCursor.moveToFirst())
      {
        locala1 = new a();
        locala1.d(localCursor);
      }
      locala2 = locala1;
    } while (localCursor == null);
    localCursor.close();
    return locala1;
  }
  
  public final a yK(String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    if (bi.oW(paramString)) {
      x.e("MicroMsg.FileDownloadInfoStorage", "appId is null");
    }
    Cursor localCursor;
    do
    {
      do
      {
        return (a)localObject1;
        localCursor = rawQuery("select * from FileDownloadInfo where appId=\"" + paramString + "\"", new String[0]);
      } while (localCursor == null);
      paramString = (String)localObject2;
      if (localCursor.moveToFirst())
      {
        paramString = new a();
        paramString.d(localCursor);
      }
      localObject1 = paramString;
    } while (localCursor == null);
    localCursor.close();
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/downloader/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */