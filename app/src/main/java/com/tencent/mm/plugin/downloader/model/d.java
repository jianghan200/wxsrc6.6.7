package com.tencent.mm.plugin.downloader.model;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.support.v4.app.z.d;
import com.tencent.mm.g.a.gr;
import com.tencent.mm.g.a.hh;
import com.tencent.mm.g.a.hh.a;
import com.tencent.mm.model.al;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  private static int fHD = 2;
  private static Map<Long, Long> ibM = new HashMap();
  private static d ibU;
  private m ibN;
  private m ibO;
  private m ibP;
  private m ibQ;
  private m ibR;
  private m ibS;
  public b ibT;
  public boolean ibV = false;
  
  private d()
  {
    aCZ();
    if (com.tencent.mm.kernel.g.Eg().Dx())
    {
      com.tencent.mm.kernel.g.Eg();
      if (!com.tencent.mm.kernel.a.Dr())
      {
        fHD = bi.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue("FileDownloaderType"), 2);
        x.i("MicroMsg.FileDownloadManager", "get downloader type from dynamic config = %d", new Object[] { Integer.valueOf(fHD) });
      }
    }
    for (;;)
    {
      this.ibT = new b();
      return;
      x.i("MicroMsg.FileDownloadManager", "not login, use the default tmassist downloader");
    }
  }
  
  private void a(String paramString, e parame)
  {
    com.tencent.mm.plugin.downloader.c.a locala;
    if (!this.ibV)
    {
      locala = c.yK(paramString);
      if ((locala != null) && (locala.field_autoDownload))
      {
        gr localgr = new gr();
        localgr.bPR.bPS = paramString;
        com.tencent.mm.sdk.b.a.sFg.m(localgr);
        if (parame == null) {
          break label104;
        }
        locala.field_autoInstall = parame.ice;
        locala.field_showNotification = parame.fHC;
      }
    }
    for (locala.field_autoDownload = parame.icg;; locala.field_autoDownload = false)
    {
      c.e(locala);
      x.i("MicroMsg.FileDownloadManager", "remove silentDownload, appId:%s", new Object[] { paramString });
      this.ibV = false;
      return;
      label104:
      locala.field_autoInstall = true;
      locala.field_showNotification = true;
    }
  }
  
  static void a(String paramString1, String paramString2, PendingIntent paramPendingIntent)
  {
    z.d locald = new z.d(ad.getContext());
    locald.b(paramString1);
    locald.c(paramString2);
    locald.Y(17301634);
    locald.u(true);
    if (paramPendingIntent != null) {}
    for (locald.pu = paramPendingIntent;; locald.pu = PendingIntent.getActivity(ad.getContext(), 0, paramString1, 0))
    {
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.notification.b.a.class)).getNotification().b(locald.build());
      x.i("MicroMsg.FileDownloadManager", "show notification");
      return;
      paramString1 = new Intent();
    }
  }
  
  public static d aCU()
  {
    if (ibU == null) {
      ibU = new d();
    }
    return ibU;
  }
  
  private m aCW()
  {
    if (this.ibP == null) {
      this.ibP = new g(this.ibT);
    }
    return this.ibP;
  }
  
  private m aCX()
  {
    if (this.ibO == null) {
      this.ibO = new i(this.ibT);
    }
    return this.ibO;
  }
  
  private static void aCZ()
  {
    SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("off_line_download_ids", 0);
    if (localSharedPreferences == null) {}
    do
    {
      return;
      localObject = localSharedPreferences.getAll();
    } while ((localObject == null) || (((Map)localObject).size() == 0));
    ibM.clear();
    Object localObject = ((Map)localObject).entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)((Iterator)localObject).next();
      if ((localEntry1 != null) && (!bi.oW((String)localEntry1.getKey()))) {
        try
        {
          long l1 = bi.getLong((String)localEntry1.getKey(), 0L);
          long l2 = ((Long)localEntry1.getValue()).longValue();
          long l3 = System.currentTimeMillis() - l1;
          if ((l3 - l1 > 0L) && (l3 - l1 < 86400000L)) {
            ibM.put(Long.valueOf(l1), Long.valueOf(l2));
          }
        }
        catch (Exception localException)
        {
          x.e("MicroMsg.FileDownloadManager", "parse download task failed: " + localException.toString());
          x.printErrStackTrace("MicroMsg.FileDownloadManager", localException, "", new Object[0]);
        }
      }
    }
    localSharedPreferences.edit().clear();
    localObject = ibM.entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)((Iterator)localObject).next();
      localSharedPreferences.edit().putLong(localEntry2.getKey(), ((Long)localEntry2.getValue()).longValue());
    }
    localSharedPreferences.edit().commit();
  }
  
  static boolean cu(long paramLong)
  {
    return ibM.containsKey(Long.valueOf(paramLong));
  }
  
  static long cv(long paramLong)
  {
    Long localLong = (Long)ibM.get(Long.valueOf(paramLong));
    if (localLong == null) {
      return -1L;
    }
    return localLong.longValue();
  }
  
  private void cw(long paramLong)
  {
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if (locala == null)
    {
      this.ibV = false;
      return;
    }
    a(locala.field_appId, null);
  }
  
  public static ArrayList<FileDownloadTaskInfo> n(ArrayList<String> paramArrayList)
  {
    ArrayList localArrayList = null;
    Object localObject = c.FX();
    label36:
    FileDownloadTaskInfo localFileDownloadTaskInfo;
    if (localObject == null)
    {
      paramArrayList = localArrayList;
      localArrayList = new ArrayList();
      if ((paramArrayList == null) || (paramArrayList.size() <= 0)) {
        return localArrayList;
      }
      paramArrayList = paramArrayList.iterator();
      if (!paramArrayList.hasNext()) {
        return localArrayList;
      }
      localObject = (com.tencent.mm.plugin.downloader.c.a)paramArrayList.next();
      localFileDownloadTaskInfo = new FileDownloadTaskInfo();
      if ((((com.tencent.mm.plugin.downloader.c.a)localObject).field_status != 3) || (com.tencent.mm.a.e.cn(((com.tencent.mm.plugin.downloader.c.a)localObject).field_filePath))) {
        break label266;
      }
    }
    label266:
    for (localFileDownloadTaskInfo.status = 0;; localFileDownloadTaskInfo.status = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_status)
    {
      localFileDownloadTaskInfo.appId = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_appId;
      localFileDownloadTaskInfo.id = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_downloadId;
      localFileDownloadTaskInfo.url = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_downloadUrl;
      localFileDownloadTaskInfo.path = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_filePath;
      localFileDownloadTaskInfo.bKg = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_md5;
      localFileDownloadTaskInfo.icq = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_downloadedSize;
      localFileDownloadTaskInfo.gTK = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_totalSize;
      localFileDownloadTaskInfo.icr = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_autoDownload;
      localFileDownloadTaskInfo.bPG = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_downloaderType;
      localArrayList.add(localFileDownloadTaskInfo);
      break label36;
      paramArrayList = com.tencent.mm.plugin.downloader.c.b.o(paramArrayList);
      localObject = ((com.tencent.mm.plugin.downloader.c.b)localObject).rawQuery("select * from FileDownloadInfo where " + paramArrayList, new String[0]);
      paramArrayList = localArrayList;
      if (localObject == null) {
        break;
      }
      localArrayList = new ArrayList();
      if (((Cursor)localObject).moveToFirst()) {
        do
        {
          paramArrayList = new com.tencent.mm.plugin.downloader.c.a();
          paramArrayList.d((Cursor)localObject);
          localArrayList.add(paramArrayList);
        } while (((Cursor)localObject).moveToNext());
      }
      paramArrayList = localArrayList;
      if (localObject == null) {
        break;
      }
      ((Cursor)localObject).close();
      paramArrayList = localArrayList;
      break;
    }
    return localArrayList;
  }
  
  static void q(long paramLong1, long paramLong2)
  {
    ibM.put(Long.valueOf(paramLong1), Long.valueOf(paramLong2));
    ad.getContext().getSharedPreferences("off_line_download_ids", 0).edit().putLong(String.valueOf(paramLong1), paramLong2).commit();
  }
  
  public final long a(e parame)
  {
    x.i("MicroMsg.FileDownloadManager", "addDownloadTask, filetype:%d, appId = %s", new Object[] { Integer.valueOf(parame.icd), parame.mAppId });
    if (parame.icd == 2)
    {
      if (this.ibS == null) {
        this.ibS = new j(this.ibT);
      }
      return this.ibS.a(parame);
    }
    a(parame.mAppId, parame);
    if (com.tencent.mm.kernel.g.Eg().Dx())
    {
      com.tencent.mm.kernel.g.Eg();
      if (!com.tencent.mm.kernel.a.Dr()) {
        return aCV().a(parame);
      }
    }
    long l = aCW().a(parame);
    if (l >= 0L)
    {
      ibM.put(Long.valueOf(l), Long.valueOf(0L));
      ad.getContext().getSharedPreferences("off_line_download_ids", 0).edit().putLong(String.valueOf(l), 0L).commit();
      x.i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", new Object[] { Long.valueOf(l) });
      return l;
    }
    x.i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
    aCX().a(parame);
    return l;
  }
  
  public final m aCV()
  {
    x.i("MicroMsg.FileDownloadManager", "mDownloaderType = " + fHD);
    if (this.ibN != null) {
      return this.ibN;
    }
    hh localhh = new hh();
    com.tencent.mm.sdk.b.a.sFg.m(localhh);
    int i = localhh.bQC.bPG;
    if (i > 0) {
      fHD = i;
    }
    if (fHD == 1) {}
    for (this.ibN = aCW();; this.ibN = this.ibQ)
    {
      return this.ibN;
      if (this.ibQ == null) {
        this.ibQ = new com.tencent.mm.plugin.downloader.d.a(this.ibT);
      }
    }
  }
  
  public final m aCY()
  {
    if (this.ibR == null) {
      this.ibR = new a(this.ibT);
    }
    return this.ibR;
  }
  
  public final long b(e parame)
  {
    x.i("MicroMsg.FileDownloadManager", "addDownloadTaskByCDNDownloader, appId = %s", new Object[] { parame.mAppId });
    a(parame.mAppId, parame);
    if (com.tencent.mm.kernel.g.Eg().Dx())
    {
      com.tencent.mm.kernel.g.Eg();
      if (!com.tencent.mm.kernel.a.Dr()) {
        return aCY().a(parame);
      }
    }
    long l = aCW().a(parame);
    if (l >= 0L)
    {
      ibM.put(Long.valueOf(l), Long.valueOf(0L));
      ad.getContext().getSharedPreferences("off_line_download_ids", 0).edit().putLong(String.valueOf(l), 0L).commit();
      x.i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", new Object[] { Long.valueOf(l) });
      return l;
    }
    x.i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
    aCX().a(parame);
    return l;
  }
  
  public final int cl(long paramLong)
  {
    x.i("MicroMsg.FileDownloadManager", "removeDownloadTask, id = " + paramLong);
    if (cu(paramLong)) {
      return aCW().cl(paramLong);
    }
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if ((locala != null) && (locala.field_downloaderType == 3)) {
      return aCY().cl(paramLong);
    }
    return aCV().cl(paramLong);
  }
  
  public final FileDownloadTaskInfo cm(long paramLong)
  {
    if (cu(paramLong)) {
      return aCW().cm(paramLong);
    }
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    Object localObject2;
    boolean bool;
    if ((locala != null) && (locala.field_status == 3) && (com.tencent.mm.a.e.cn(locala.field_filePath)))
    {
      localObject1 = new FileDownloadTaskInfo();
      ((FileDownloadTaskInfo)localObject1).id = paramLong;
      ((FileDownloadTaskInfo)localObject1).url = locala.field_downloadUrl;
      ((FileDownloadTaskInfo)localObject1).status = 3;
      ((FileDownloadTaskInfo)localObject1).path = locala.field_filePath;
      ((FileDownloadTaskInfo)localObject1).bKg = locala.field_md5;
      ((FileDownloadTaskInfo)localObject1).icq = locala.field_downloadedSize;
      ((FileDownloadTaskInfo)localObject1).gTK = locala.field_totalSize;
      ((FileDownloadTaskInfo)localObject1).icr = locala.field_autoDownload;
      ((FileDownloadTaskInfo)localObject1).bPG = locala.field_downloaderType;
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new FileDownloadTaskInfo();
      }
      if ((((FileDownloadTaskInfo)localObject2).status == 3) && (!com.tencent.mm.a.e.cn(((FileDownloadTaskInfo)localObject2).path))) {
        ((FileDownloadTaskInfo)localObject2).status = 0;
      }
      if (locala == null) {
        break label394;
      }
      bool = locala.field_downloadInWifi;
      label195:
      ((FileDownloadTaskInfo)localObject2).ics = bool;
      if (locala == null) {
        break label399;
      }
    }
    label394:
    label399:
    for (Object localObject1 = locala.field_appId;; localObject1 = "")
    {
      ((FileDownloadTaskInfo)localObject2).appId = ((String)localObject1);
      x.i("MicroMsg.FileDownloadManager", "getDownloadTaskInfo: id: %d, url: %s, status: %d, path: %s, md5: %s, totalsize: %d, autodownload: %b, downloaderType: %d", new Object[] { Long.valueOf(((FileDownloadTaskInfo)localObject2).id), ((FileDownloadTaskInfo)localObject2).url, Integer.valueOf(((FileDownloadTaskInfo)localObject2).status), ((FileDownloadTaskInfo)localObject2).path, ((FileDownloadTaskInfo)localObject2).bKg, Long.valueOf(((FileDownloadTaskInfo)localObject2).gTK), Boolean.valueOf(((FileDownloadTaskInfo)localObject2).icr), Integer.valueOf(((FileDownloadTaskInfo)localObject2).bPG) });
      return (FileDownloadTaskInfo)localObject2;
      if ((locala != null) && (locala.field_downloaderType == 3))
      {
        localObject1 = aCY().cm(paramLong);
        break;
      }
      localObject2 = aCV().cm(paramLong);
      localObject1 = localObject2;
      if (locala == null) {
        break;
      }
      ((FileDownloadTaskInfo)localObject2).icr = locala.field_autoDownload;
      ((FileDownloadTaskInfo)localObject2).bPG = locala.field_downloaderType;
      localObject1 = localObject2;
      break;
      bool = false;
      break label195;
    }
  }
  
  public final boolean cn(long paramLong)
  {
    x.i("MicroMsg.FileDownloadManager", "pauseDownloadTask, id = " + paramLong);
    cw(paramLong);
    if (cu(paramLong)) {
      return aCW().cn(paramLong);
    }
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if ((locala != null) && (locala.field_downloaderType == 3)) {
      return aCY().cn(paramLong);
    }
    return aCV().cn(paramLong);
  }
  
  public final boolean co(long paramLong)
  {
    x.i("MicroMsg.FileDownloadManager", "resumeDownloadTask, id = " + paramLong);
    cw(paramLong);
    if (cu(paramLong)) {
      return aCW().co(paramLong);
    }
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if ((locala != null) && (locala.field_downloaderType == 3)) {
      return aCY().co(paramLong);
    }
    return aCV().co(paramLong);
  }
  
  final void k(long paramLong, boolean paramBoolean)
  {
    x.d("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded id[%d], stack[%s]", new Object[] { Long.valueOf(paramLong), bi.cjd() });
    Object localObject = ad.getContext();
    if (cu(paramLong))
    {
      localObject = cm(paramLong);
      this.ibT.c(paramLong, ((FileDownloadTaskInfo)localObject).path, paramBoolean);
    }
    com.tencent.mm.plugin.downloader.c.a locala;
    do
    {
      return;
      locala = c.cs(paramLong);
    } while (locala == null);
    if (bi.oW(locala.field_packageName))
    {
      String str = q.Td(locala.field_filePath);
      if (!bi.oW(str))
      {
        locala.field_packageName = str;
        x.i("MicroMsg.FileDownloadManager", "get package name from file : %s, %s", new Object[] { locala.field_filePath, str });
        c.e(locala);
      }
    }
    int i = q.Te(locala.field_filePath);
    x.d("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded field_packageName[%s], field_filePath[%s], versionCode[%d]", new Object[] { locala.field_packageName, locala.field_filePath, Integer.valueOf(i) });
    com.tencent.mm.kernel.g.Em().H(new d.1(this, locala, i, (Context)localObject, paramLong, paramBoolean));
  }
  
  public final FileDownloadTaskInfo yO(String paramString)
  {
    paramString = c.yK(paramString);
    if (paramString != null) {
      return cm(paramString.field_downloadId);
    }
    return new FileDownloadTaskInfo();
  }
  
  public final FileDownloadTaskInfo yP(String paramString)
  {
    paramString = c.yN(paramString);
    if (paramString != null) {
      return cm(paramString.field_downloadId);
    }
    return new FileDownloadTaskInfo();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/downloader/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */