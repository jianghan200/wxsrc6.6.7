package com.tencent.mm.plugin.downloader.model;

import android.database.Cursor;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.c.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class c
{
  public static b FX()
  {
    if (g.Eg().Dx())
    {
      g.Eg();
      if (!com.tencent.mm.kernel.a.Dr()) {}
    }
    else
    {
      x.e("MicroMsg.FileDownloadInfoDBHelper", "no user login");
      return null;
    }
    if (g.l(com.tencent.mm.plugin.downloader.a.c.class) == null)
    {
      x.e("MicroMsg.FileDownloadInfoDBHelper", "service not ready");
      return null;
    }
    return ((com.tencent.mm.plugin.downloader.a.c)g.l(com.tencent.mm.plugin.downloader.a.c.class)).FX();
  }
  
  public static LinkedList<com.tencent.mm.plugin.downloader.c.a> aCS()
  {
    Object localObject = FX();
    if (localObject == null) {
      localObject = null;
    }
    Cursor localCursor;
    LinkedList localLinkedList;
    do
    {
      return (LinkedList<com.tencent.mm.plugin.downloader.c.a>)localObject;
      x.i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiRunningTasks, sql = " + "select * from FileDownloadInfo where status=1 and downloadInWifi=1");
      localCursor = ((b)localObject).rawQuery("select * from FileDownloadInfo where status=1 and downloadInWifi=1", new String[0]);
      localLinkedList = new LinkedList();
      localObject = localLinkedList;
    } while (localCursor == null);
    while (localCursor.moveToNext())
    {
      localObject = new com.tencent.mm.plugin.downloader.c.a();
      ((com.tencent.mm.plugin.downloader.c.a)localObject).d(localCursor);
      localLinkedList.add(localObject);
    }
    localCursor.close();
    return localLinkedList;
  }
  
  public static LinkedList<com.tencent.mm.plugin.downloader.c.a> aCT()
  {
    Object localObject = FX();
    if (localObject == null) {
      localObject = null;
    }
    Cursor localCursor;
    LinkedList localLinkedList;
    do
    {
      return (LinkedList<com.tencent.mm.plugin.downloader.c.a>)localObject;
      x.i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiPauseTasks, sql = " + "select * from FileDownloadInfo where status<>1 and status<>3 and downloadInWifi=1");
      localCursor = ((b)localObject).rawQuery("select * from FileDownloadInfo where status<>1 and status<>3 and downloadInWifi=1", new String[0]);
      localLinkedList = new LinkedList();
      localObject = localLinkedList;
    } while (localCursor == null);
    while (localCursor.moveToNext())
    {
      localObject = new com.tencent.mm.plugin.downloader.c.a();
      ((com.tencent.mm.plugin.downloader.c.a)localObject).d(localCursor);
      localLinkedList.add(localObject);
    }
    localCursor.close();
    return localLinkedList;
  }
  
  public static com.tencent.mm.plugin.downloader.c.a cs(long paramLong)
  {
    b localb = FX();
    if (localb == null) {
      return null;
    }
    return localb.cz(paramLong);
  }
  
  public static boolean ct(long paramLong)
  {
    b localb = FX();
    if (localb == null) {
      return false;
    }
    com.tencent.mm.plugin.downloader.c.a locala = new com.tencent.mm.plugin.downloader.c.a();
    locala.field_downloadId = paramLong;
    return localb.a(locala, new String[0]);
  }
  
  public static long d(com.tencent.mm.plugin.downloader.c.a parama)
  {
    if (parama == null) {}
    b localb;
    do
    {
      return -1L;
      localb = FX();
    } while (localb == null);
    boolean bool = localb.b(parama);
    x.i("MicroMsg.FileDownloadInfoDBHelper", "insert downloadinfo: " + parama.field_downloadId + ", ret=" + bool);
    return parama.field_downloadId;
  }
  
  public static long e(com.tencent.mm.plugin.downloader.c.a parama)
  {
    if (parama == null) {}
    b localb;
    do
    {
      return -1L;
      localb = FX();
    } while (localb == null);
    boolean bool = localb.c(parama, new String[0]);
    x.d("MicroMsg.FileDownloadInfoDBHelper", "Update Downloadinfo, ID: %d, ret: %b, Status: %d", new Object[] { Long.valueOf(parama.field_downloadId), Boolean.valueOf(bool), Integer.valueOf(parama.field_status) });
    return parama.field_downloadId;
  }
  
  public static boolean k(long paramLong, int paramInt)
  {
    b localb = FX();
    if (localb == null) {
      return false;
    }
    return localb.fV("FileDownloadInfo", "update FileDownloadInfo set status = " + paramInt + " where downloadId = " + paramLong);
  }
  
  public static com.tencent.mm.plugin.downloader.c.a yK(String paramString)
  {
    b localb = FX();
    if (localb == null) {
      return null;
    }
    return localb.yK(paramString);
  }
  
  public static boolean yL(String paramString)
  {
    b localb = FX();
    if (localb == null) {
      return false;
    }
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.FileDownloadInfoStorage", "deledonloadinfo failed, url is null");
      return false;
    }
    return localb.fV("FileDownloadInfo", "delete from FileDownloadInfo where downloadUrl=\"" + paramString + "\"");
  }
  
  public static boolean yM(String paramString)
  {
    b localb = FX();
    if (localb == null) {
      return false;
    }
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.FileDownloadInfoStorage", "deledonloadinfo failed, appId is null");
      return false;
    }
    return localb.fV("FileDownloadInfo", "delete from FileDownloadInfo where appId=\"" + paramString + "\"");
  }
  
  public static com.tencent.mm.plugin.downloader.c.a yN(String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    Object localObject3 = FX();
    if (localObject3 == null) {}
    do
    {
      do
      {
        return (com.tencent.mm.plugin.downloader.c.a)localObject1;
        if (bi.oW(paramString))
        {
          x.e("MicroMsg.FileDownloadInfoStorage", "Null or nil url");
          return null;
        }
        localObject3 = ((b)localObject3).rawQuery("select * from FileDownloadInfo where downloadUrlHashCode=" + paramString.hashCode(), new String[0]);
      } while (localObject3 == null);
      paramString = (String)localObject2;
      if (((Cursor)localObject3).moveToFirst())
      {
        paramString = new com.tencent.mm.plugin.downloader.c.a();
        paramString.d((Cursor)localObject3);
      }
      localObject1 = paramString;
    } while (localObject3 == null);
    ((Cursor)localObject3).close();
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/downloader/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */