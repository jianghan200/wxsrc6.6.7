package com.tencent.mm.plugin.game.wepkg.model;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.game.wepkg.a.a;
import com.tencent.mm.plugin.game.wepkg.a.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WepkgCrossProcessTask
  extends BaseWepkgProcessTask
{
  public static final Parcelable.Creator<WepkgCrossProcessTask> CREATOR = new WepkgCrossProcessTask.1();
  public Runnable fFC;
  public WepkgVersion kff;
  public List<WepkgVersion> kfg;
  public WepkgPreloadFile kfh;
  public List<WepkgPreloadFile> kfi;
  public String kfj;
  public int nc;
  
  public WepkgCrossProcessTask()
  {
    this.nc = -1;
    this.kff = new WepkgVersion();
    this.kfg = new ArrayList();
    this.kfh = new WepkgPreloadFile();
    this.kfi = new ArrayList();
  }
  
  private WepkgCrossProcessTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    Object localObject2 = null;
    Object localObject1 = null;
    boolean bool2 = false;
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool5 = true;
    boolean bool1 = true;
    label221:
    Object localObject3;
    Object localObject4;
    switch (this.nc)
    {
    default: 
    case 1001: 
    case 1002: 
    case 3001: 
    case 3003: 
    case 3004: 
    case 3005: 
    case 3006: 
    case 2001: 
    case 2002: 
    case 4001: 
    case 4002: 
    case 2003: 
      label1356:
      do
      {
        En();
        return;
        for (;;)
        {
          this.bGZ = bool1;
          break;
          bool1 = g.AU().AG();
          continue;
          if (this.kff == null) {
            break;
          }
          localObject1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo().DV(this.kff.kfA);
          if (localObject1 != null)
          {
            this.kff.a((com.tencent.mm.plugin.game.wepkg.a.c)localObject1);
          }
          else
          {
            this.kff = null;
            break;
            if (this.kff == null) {
              break;
            }
            bool1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo().DX(this.kff.kfA);
            continue;
            if (this.kff == null) {
              break;
            }
            bool1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo().a(this.kff.kfA, this.kff.kfR, this.kff.kfS, this.kff.kfT);
            continue;
            if (this.kff == null) {
              break;
            }
            bool1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo().k(this.kff.kfA, this.kff.ffK, this.kff.kfX);
            continue;
            if (this.kff == null) {
              break;
            }
            bool1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo().aA(this.kff.kfA, this.kff.kfY);
            continue;
            if ((this.kff != null) && (!bi.oW(this.kff.kfA)))
            {
              localObject1 = this.kff.kfA;
              com.tencent.mm.plugin.game.wepkg.a.d.aVo().DU((String)localObject1);
              b.aVn().DU((String)localObject1);
              f.Ej((String)localObject1);
            }
            else
            {
              localObject1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo();
              if (((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).fAQ)
              {
                x.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord clearWepkg ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).fV("WepkgVersion", String.format("delete from %s", new Object[] { "WepkgVersion" }))) });
                x.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgPreloadFilesRecord clearWepkg ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).fV("WepkgPreloadFiles", String.format("delete from %s", new Object[] { "WepkgPreloadFiles" }))) });
              }
              com.tencent.mm.plugin.game.wepkg.utils.d.Em().H(new f.2());
              break;
              if ((this.kff == null) || (bi.oW(this.kff.kfA))) {
                break;
              }
              localObject1 = this.kff.kfA;
              com.tencent.mm.plugin.game.wepkg.a.d.aVo().DU((String)localObject1);
              b.aVn().DU((String)localObject1);
              localObject1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo();
              localObject2 = this.kff;
              localObject3 = new com.tencent.mm.plugin.game.wepkg.a.c();
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_pkgId = ((WepkgVersion)localObject2).kfA;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_appId = ((WepkgVersion)localObject2).appId;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_version = ((WepkgVersion)localObject2).version;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_pkgPath = ((WepkgVersion)localObject2).ffK;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_disableWvCache = ((WepkgVersion)localObject2).kfR;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_clearPkgTime = ((WepkgVersion)localObject2).kfS;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_checkIntervalTime = ((WepkgVersion)localObject2).kfT;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_packMethod = ((WepkgVersion)localObject2).kfU;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_domain = ((WepkgVersion)localObject2).cfx;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_md5 = ((WepkgVersion)localObject2).bKg;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_downloadUrl = ((WepkgVersion)localObject2).downloadUrl;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_pkgSize = ((WepkgVersion)localObject2).kfV;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_downloadNetType = ((WepkgVersion)localObject2).kfm;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_nextCheckTime = ((WepkgVersion)localObject2).kfW;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_createTime = ((WepkgVersion)localObject2).createTime;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_charset = ((WepkgVersion)localObject2).charset;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_bigPackageReady = ((WepkgVersion)localObject2).kfX;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_preloadFilesReady = ((WepkgVersion)localObject2).kfY;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_preloadFilesAtomic = ((WepkgVersion)localObject2).kfZ;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_totalDownloadCount = ((WepkgVersion)localObject2).kga;
              ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_downloadTriggerType = ((WepkgVersion)localObject2).cga;
              if ((!((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).fAQ) || (bi.oW(((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_pkgId)))
              {
                if (!bi.cX(this.kfi)) {
                  localObject1 = this.kfi.iterator();
                }
              }
              else {
                for (;;)
                {
                  if (!((Iterator)localObject1).hasNext()) {
                    break label1356;
                  }
                  localObject2 = (WepkgPreloadFile)((Iterator)localObject1).next();
                  if (localObject2 != null)
                  {
                    localObject3 = b.aVn();
                    localObject4 = new a();
                    ((a)localObject4).field_key = ((WepkgPreloadFile)localObject2).aAL;
                    ((a)localObject4).field_pkgId = ((WepkgPreloadFile)localObject2).kfA;
                    ((a)localObject4).field_version = ((WepkgPreloadFile)localObject2).version;
                    ((a)localObject4).field_filePath = ((WepkgPreloadFile)localObject2).filePath;
                    ((a)localObject4).field_rid = ((WepkgPreloadFile)localObject2).kfk;
                    ((a)localObject4).field_mimeType = ((WepkgPreloadFile)localObject2).mimeType;
                    ((a)localObject4).field_md5 = ((WepkgPreloadFile)localObject2).bKg;
                    ((a)localObject4).field_downloadUrl = ((WepkgPreloadFile)localObject2).downloadUrl;
                    ((a)localObject4).field_size = ((WepkgPreloadFile)localObject2).size;
                    ((a)localObject4).field_downloadNetType = ((WepkgPreloadFile)localObject2).kfm;
                    ((a)localObject4).field_completeDownload = ((WepkgPreloadFile)localObject2).kfB;
                    ((a)localObject4).field_createTime = ((WepkgPreloadFile)localObject2).createTime;
                    if (((b)localObject3).fAQ)
                    {
                      if (((b)localObject3).de(((a)localObject4).field_pkgId, ((a)localObject4).field_rid) == null)
                      {
                        ((a)localObject4).field_createTime = com.tencent.mm.plugin.game.wepkg.utils.d.aow();
                        bool2 = ((b)localObject3).b((com.tencent.mm.sdk.e.c)localObject4);
                        x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "insertPreloadFile pkgid:%s, version:%s, rid:%s, ret:%s", new Object[] { ((a)localObject4).field_pkgId, ((a)localObject4).field_version, ((a)localObject4).field_rid, Boolean.valueOf(bool2) });
                        continue;
                        if (((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).DV(((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_pkgId) == null)
                        {
                          ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_nextCheckTime = (com.tencent.mm.plugin.game.wepkg.utils.d.aow() + ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_checkIntervalTime);
                          ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_createTime = com.tencent.mm.plugin.game.wepkg.utils.d.aow();
                          ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_accessTime = com.tencent.mm.plugin.game.wepkg.utils.d.aow();
                          bool2 = ((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).b((com.tencent.mm.sdk.e.c)localObject3);
                          x.i("MicroMsg.Wepkg.WepkgVersionStorage", "insertPkgVersion pkgid:%s, version:%s, ret:%s", new Object[] { ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_pkgId, ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_version, Boolean.valueOf(bool2) });
                          break;
                        }
                        ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_nextCheckTime = (com.tencent.mm.plugin.game.wepkg.utils.d.aow() + ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_checkIntervalTime);
                        bool2 = ((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).a((com.tencent.mm.sdk.e.c)localObject3);
                        x.i("MicroMsg.Wepkg.WepkgVersionStorage", "replacePkgVersion pkgid:%s, version:%s, ret:%s", new Object[] { ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_pkgId, ((com.tencent.mm.plugin.game.wepkg.a.c)localObject3).field_version, Boolean.valueOf(bool2) });
                        break;
                      }
                      bool2 = ((b)localObject3).a((com.tencent.mm.sdk.e.c)localObject4);
                      x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "relacePreloadFile pkgid:%s, version:%s, rid:%s, ret:%s", new Object[] { ((a)localObject4).field_pkgId, ((a)localObject4).field_version, ((a)localObject4).field_rid, Boolean.valueOf(bool2) });
                    }
                  }
                }
              }
              continue;
              if ((this.kff == null) || (bi.oW(this.kff.kfA))) {
                break;
              }
              localObject2 = b.aVn();
              localObject4 = this.kff.kfA;
              if ((!((b)localObject2).fAQ) && (bi.oW((String)localObject4))) {}
              for (;;)
              {
                this.kfi = ((List)localObject1);
                break;
                localObject3 = String.format("select * from %s where %s=? and %s=0", new Object[] { "WepkgPreloadFiles", "pkgId", "completeDownload" });
                localObject2 = ((b)localObject2).rawQuery((String)localObject3, new String[] { localObject4 });
                x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getNeedDownloadPreLoadFileList queryStr:%s", new Object[] { localObject3 });
                if (localObject2 == null)
                {
                  x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "cursor is null");
                }
                else if (((Cursor)localObject2).moveToFirst())
                {
                  localObject1 = new ArrayList();
                  do
                  {
                    localObject3 = new WepkgPreloadFile();
                    localObject4 = new a();
                    ((a)localObject4).d((Cursor)localObject2);
                    ((WepkgPreloadFile)localObject3).a((a)localObject4);
                    ((List)localObject1).add(localObject3);
                  } while (((Cursor)localObject2).moveToNext());
                  ((Cursor)localObject2).close();
                  x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "record list size:%s", new Object[] { Integer.valueOf(((List)localObject1).size()) });
                }
                else
                {
                  ((Cursor)localObject2).close();
                  x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "no record");
                }
              }
              if (this.kfh == null) {
                break;
              }
              bool1 = b.aVn().d(this.kfh.kfA, this.kfh.kfk, this.kfh.filePath, this.kfh.kfB);
            }
          }
        }
      } while (this.kff == null);
      localObject1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo();
      if (!((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).fAQ) {
        localObject1 = null;
      }
      for (;;)
      {
        label1694:
        if (bi.oW((String)localObject1))
        {
          localObject3 = b.aVn();
          if (!((b)localObject3).fAQ)
          {
            localObject1 = localObject2;
            label1719:
            if (bi.oW((String)localObject1))
            {
              localObject2 = com.tencent.mm.plugin.game.wepkg.a.d.aVo();
              if (((com.tencent.mm.plugin.game.wepkg.a.d)localObject2).fAQ)
              {
                x.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord resetAutoDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.game.wepkg.a.d)localObject2).fV("WepkgVersion", String.format("update %s set %s=0", new Object[] { "WepkgVersion", "autoDownloadCount" }))) });
                x.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgPreloadFilesRecord resetAutoDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.game.wepkg.a.d)localObject2).fV("WepkgPreloadFiles", String.format("update %s set %s=0", new Object[] { "WepkgPreloadFiles", "autoDownloadCount" }))) });
              }
            }
            this.kff.kfA = ((String)localObject1);
            break;
            localObject3 = ((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).rawQuery(String.format("select * from %s where %s=0 and %s=1 and %s<1 and %s<?", new Object[] { "WepkgVersion", "bigPackageReady", "preloadFilesAtomic", "autoDownloadCount", "packageDownloadCount" }), new String[] { "3" });
            if (localObject3 == null)
            {
              localObject1 = null;
              continue;
            }
            if (((Cursor)localObject3).moveToFirst())
            {
              i = ((Cursor)localObject3).getCount();
              if (i <= 1) {
                break label3329;
              }
            }
          }
        }
      }
    }
    label2772:
    label3316:
    label3324:
    label3329:
    for (int i = bi.eF(i - 1, 0);; i = 0)
    {
      ((Cursor)localObject3).move(i);
      localObject4 = new com.tencent.mm.plugin.game.wepkg.a.c();
      ((com.tencent.mm.plugin.game.wepkg.a.c)localObject4).d((Cursor)localObject3);
      ((Cursor)localObject3).close();
      ((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).DY(((com.tencent.mm.plugin.game.wepkg.a.c)localObject4).field_pkgId);
      x.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, bigPackageReady:false, preloadFilesAtomic:true", new Object[] { ((com.tencent.mm.plugin.game.wepkg.a.c)localObject4).field_pkgId, ((com.tencent.mm.plugin.game.wepkg.a.c)localObject4).field_version });
      localObject1 = ((com.tencent.mm.plugin.game.wepkg.a.c)localObject4).field_pkgId;
      break label1694;
      ((Cursor)localObject3).close();
      localObject3 = ((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).rawQuery(String.format("select * from %s where %s=0 and %s<1 and %s<?", new Object[] { "WepkgVersion", "bigPackageReady", "autoDownloadCount", "packageDownloadCount" }), new String[] { "3" });
      if (localObject3 == null)
      {
        localObject1 = null;
        break label1694;
      }
      if (((Cursor)localObject3).moveToFirst())
      {
        i = ((Cursor)localObject3).getCount();
        if (i <= 1) {
          break label3324;
        }
      }
      for (i = bi.eF(i - 1, 0);; i = 0)
      {
        ((Cursor)localObject3).move(i);
        localObject4 = new com.tencent.mm.plugin.game.wepkg.a.c();
        ((com.tencent.mm.plugin.game.wepkg.a.c)localObject4).d((Cursor)localObject3);
        ((Cursor)localObject3).close();
        ((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).DY(((com.tencent.mm.plugin.game.wepkg.a.c)localObject4).field_pkgId);
        x.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, bigPackageReady:false, preloadFilesAtomic:false", new Object[] { ((com.tencent.mm.plugin.game.wepkg.a.c)localObject4).field_pkgId, ((com.tencent.mm.plugin.game.wepkg.a.c)localObject4).field_version });
        localObject1 = ((com.tencent.mm.plugin.game.wepkg.a.c)localObject4).field_pkgId;
        break label1694;
        ((Cursor)localObject3).close();
        x.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid no download record in DB");
        localObject1 = null;
        break label1694;
        localObject4 = ((b)localObject3).rawQuery(String.format("select * from %s where %s=0 and %s<1 and %s<?", new Object[] { "WepkgPreloadFiles", "completeDownload", "autoDownloadCount", "fileDownloadCount" }), new String[] { "3" });
        localObject1 = localObject2;
        if (localObject4 == null) {
          break label1719;
        }
        if (((Cursor)localObject4).moveToFirst())
        {
          i = ((Cursor)localObject4).getCount();
          if (i <= 1) {
            break label3316;
          }
        }
        for (i = bi.eF(i - 1, 0);; i = 0)
        {
          ((Cursor)localObject4).move(i);
          localObject1 = new a();
          ((a)localObject1).d((Cursor)localObject4);
          ((Cursor)localObject4).close();
          localObject2 = ((a)localObject1).field_pkgId;
          localObject4 = ((a)localObject1).field_rid;
          if ((!((b)localObject3).fAQ) || (bi.oW((String)localObject2)) || (bi.oW((String)localObject4))) {}
          for (;;)
          {
            x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, rid:%s", new Object[] { ((a)localObject1).field_pkgId, ((a)localObject1).field_version, ((a)localObject1).field_rid });
            localObject1 = ((a)localObject1).field_pkgId;
            break;
            x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord addAutoDownloadCount ret:%s", new Object[] { Boolean.valueOf(((b)localObject3).fV("WepkgPreloadFiles", String.format("update %s set %s=%s+1 where %s='%s' and %s='%s'", new Object[] { "WepkgPreloadFiles", "autoDownloadCount", "autoDownloadCount", "pkgId", localObject2, "rid", localObject4 }))) });
          }
          ((Cursor)localObject4).close();
          x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid no download record in DB");
          localObject1 = localObject2;
          break label1719;
          if (this.kff == null) {
            break;
          }
          this.kfi = b.aVn().DT(this.kff.kfA);
          break label221;
          if (this.kfh == null) {
            break;
          }
          localObject1 = b.aVn().de(this.kfh.kfA, this.kfh.kfk);
          if (localObject1 != null)
          {
            this.kfh.a((a)localObject1);
            break label221;
          }
          this.kfh = null;
          break;
          if (this.kff == null) {
            break;
          }
          bool1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo().DZ(this.kff.kfA);
          break label221;
          if (this.kff == null) {
            break;
          }
          localObject1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo().DW(this.kff.kfA);
          if (localObject1 != null)
          {
            this.kff.a((com.tencent.mm.plugin.game.wepkg.a.c)localObject1);
            break label221;
          }
          this.kff = null;
          break;
          this.kfg = com.tencent.mm.plugin.game.wepkg.a.d.aVo().aVp();
          break label221;
          if (this.kff == null) {
            break;
          }
          bool1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo().Ea(this.kff.kfA);
          break label221;
          if (this.kff == null) {
            break;
          }
          localObject1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo();
          localObject2 = this.kff.kfA;
          bool1 = bool2;
          if (((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).fAQ) {
            if (!bi.oW((String)localObject2)) {
              break label2772;
            }
          }
          for (bool1 = bool2;; bool1 = true)
          {
            this.bGZ = bool1;
            break;
            x.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addTotalDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).fV("WepkgVersion", String.format("update %s set %s=%s+1 where %s='%s'", new Object[] { "WepkgVersion", "totalDownloadCount", "totalDownloadCount", "pkgId", localObject2 }))) });
          }
          if (this.kff == null) {
            break;
          }
          localObject1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo();
          localObject2 = this.kff.kfA;
          if ((!((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).fAQ) || (bi.oW((String)localObject2))) {}
          for (bool1 = false;; bool1 = bool3)
          {
            this.bGZ = bool1;
            break;
            x.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addPackageDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).fV("WepkgVersion", String.format("update %s set %s=%s+1 where %s='%s'", new Object[] { "WepkgVersion", "packageDownloadCount", "packageDownloadCount", "pkgId", localObject2 }))) });
          }
          if (this.kff == null) {
            break;
          }
          localObject1 = com.tencent.mm.plugin.game.wepkg.a.d.aVo();
          localObject2 = this.kff.kfA;
          if ((!((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).fAQ) || (bi.oW((String)localObject2))) {}
          for (bool1 = false;; bool1 = bool4)
          {
            this.bGZ = bool1;
            break;
            x.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord resetPackageDownloadCount ret:%s", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.game.wepkg.a.d)localObject1).fV("WepkgVersion", String.format("update %s set %s=0 where %s='%s'", new Object[] { "WepkgVersion", "packageDownloadCount", "pkgId", localObject2 }))) });
          }
          if (this.kfh == null) {
            break;
          }
          localObject1 = b.aVn();
          localObject2 = this.kfh.kfA;
          localObject3 = this.kfh.kfk;
          if ((!((b)localObject1).fAQ) || (bi.oW((String)localObject2)) || (bi.oW((String)localObject3))) {}
          for (bool1 = false;; bool1 = bool5)
          {
            this.bGZ = bool1;
            break;
            x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord addFileDownloadCount ret:%s", new Object[] { Boolean.valueOf(((b)localObject1).fV("WepkgPreloadFiles", String.format("update %s set %s=%s+1 where %s='%s' and %s='%s'", new Object[] { "WepkgPreloadFiles", "fileDownloadCount", "fileDownloadCount", "pkgId", localObject2, "rid", localObject3 }))) });
          }
          if (this.kfh == null) {
            break;
          }
          localObject1 = b.aVn();
          localObject2 = this.kfh.kfA;
          if ((!((b)localObject1).fAQ) || (bi.oW((String)localObject2)))
          {
            bool1 = false;
            break label221;
          }
          x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord resetFileDownloadCount ret:%s", new Object[] { Boolean.valueOf(((b)localObject1).fV("WepkgPreloadFiles", String.format("update %s set %s=0 where %s='%s'", new Object[] { "WepkgPreloadFiles", "fileDownloadCount", "pkgId", localObject2 }))) });
          break label221;
        }
        break label1719;
      }
    }
  }
  
  public final void aaj()
  {
    if (this.fFC != null) {
      this.fFC.run();
    }
  }
  
  public final void k(Parcel paramParcel)
  {
    this.nc = paramParcel.readInt();
    this.kff = ((WepkgVersion)paramParcel.readParcelable(WepkgVersion.class.getClassLoader()));
    if (this.kfg == null) {
      this.kfg = new ArrayList();
    }
    paramParcel.readList(this.kfg, WepkgVersion.class.getClassLoader());
    this.kfh = ((WepkgPreloadFile)paramParcel.readParcelable(WepkgPreloadFile.class.getClassLoader()));
    if (this.kfi == null) {
      this.kfi = new ArrayList();
    }
    paramParcel.readList(this.kfi, WepkgPreloadFile.class.getClassLoader());
    this.kfj = paramParcel.readString();
  }
  
  public final void v(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.nc);
    paramParcel.writeParcelable(this.kff, paramInt);
    paramParcel.writeList(this.kfg);
    paramParcel.writeParcelable(this.kfh, paramInt);
    paramParcel.writeList(this.kfi);
    paramParcel.writeString(this.kfj);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/model/WepkgCrossProcessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */