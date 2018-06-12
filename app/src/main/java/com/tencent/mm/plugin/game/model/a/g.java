package com.tencent.mm.plugin.game.model.a;

import android.database.Cursor;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.v.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.cy;
import com.tencent.mm.protocal.c.cz;
import com.tencent.mm.protocal.c.na;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g
{
  static void cancelDownload(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      boolean bool;
      do
      {
        return;
        c localc = new c();
        localc.field_appId = paramString;
        bool = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().a(localc, new String[0]);
        x.i("MicroMsg.GameSilentDownloader", "remove SilentDownload DB, appid:%s, ret:%b", new Object[] { paramString, Boolean.valueOf(bool) });
      } while (!bool);
      paramString = d.aCU().yO(paramString);
    } while ((paramString == null) || (paramString.id <= 0L));
    long l = paramString.id;
    d.aCU().cl(l);
    x.i("MicroMsg.GameSilentDownloader", "remove download task, appid:%s", new Object[] { paramString.appId });
  }
  
  public static void pauseDownload()
  {
    Object localObject2 = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().rawQuery(String.format("select * from %s", new Object[] { "GameSilentDownload" }), new String[0]);
    Object localObject1;
    if (localObject2 == null)
    {
      x.i("MicroMsg.GameSilentDownloadStorage", "cursor is null");
      localObject1 = null;
      if (!bi.cX((List)localObject1)) {
        break label163;
      }
    }
    for (;;)
    {
      return;
      if (((Cursor)localObject2).moveToFirst())
      {
        localObject1 = new ArrayList();
        do
        {
          c localc = new c();
          localc.d((Cursor)localObject2);
          ((List)localObject1).add(localc);
        } while (((Cursor)localObject2).moveToNext());
        ((Cursor)localObject2).close();
        x.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfoList size:%s", new Object[] { Integer.valueOf(((List)localObject1).size()) });
        break;
      }
      ((Cursor)localObject2).close();
      x.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfoList no record");
      localObject1 = null;
      break;
      label163:
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (c)((Iterator)localObject1).next();
        if (localObject2 != null) {
          if (((c)localObject2).field_expireTime <= bi.VE())
          {
            x.i("MicroMsg.GameSilentDownloader", "pauseDownload, task expire time, appId:%s", new Object[] { ((c)localObject2).field_appId });
            e.DB(((c)localObject2).field_appId);
            cancelDownload(((c)localObject2).field_appId);
          }
          else
          {
            localObject2 = ((c)localObject2).field_appId;
            localObject2 = d.aCU().yO((String)localObject2);
            if ((localObject2 != null) && (((FileDownloadTaskInfo)localObject2).id > 0L) && (((FileDownloadTaskInfo)localObject2).status == 1))
            {
              long l = ((FileDownloadTaskInfo)localObject2).id;
              d.aCU().ibV = true;
              boolean bool = d.aCU().cn(l);
              x.i("MicroMsg.GameSilentDownloader", "pauseDownload, appid:%s, ret:%b", new Object[] { ((FileDownloadTaskInfo)localObject2).appId, Boolean.valueOf(bool) });
            }
          }
        }
      }
    }
  }
  
  public final void fv(boolean paramBoolean)
  {
    final Object localObject1;
    Object localObject2;
    for (;;)
    {
      localObject1 = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSl();
      localObject2 = ((f)localObject1).rawQuery(String.format("select * from %s where %s=1 limit 1", new Object[] { "GameSilentDownload", "isRunning" }), new String[0]);
      if (localObject2 == null)
      {
        x.i("MicroMsg.GameSilentDownloadStorage", "first cursor is null");
        localObject1 = null;
      }
      while (localObject1 == null)
      {
        x.i("MicroMsg.GameSilentDownloader", "silentDownload witch can check is empty!");
        return;
        if (((Cursor)localObject2).moveToFirst())
        {
          localObject1 = new c();
          ((c)localObject1).d((Cursor)localObject2);
          ((Cursor)localObject2).close();
        }
        else
        {
          x.i("MicroMsg.GameSilentDownloadStorage", "no running task");
          ((Cursor)localObject2).close();
          localObject2 = ((f)localObject1).rawQuery(String.format("select * from %s where %s < ? limit 1", new Object[] { "GameSilentDownload", "nextCheckTime" }), new String[] { String.valueOf(bi.VE()) });
          if (localObject2 == null)
          {
            x.i("MicroMsg.GameSilentDownloadStorage", "second cursor is null");
            localObject1 = null;
          }
          else if (((Cursor)localObject2).moveToFirst())
          {
            localObject1 = new c();
            ((c)localObject1).d((Cursor)localObject2);
            ((Cursor)localObject2).close();
          }
          else
          {
            ((Cursor)localObject2).close();
            x.i("MicroMsg.GameSilentDownloadStorage", "no record");
            localObject1 = null;
          }
        }
      }
      x.i("MicroMsg.GameSilentDownloader", "[appid:%s] in DB to check download", new Object[] { ((c)localObject1).field_appId });
      if (((c)localObject1).field_expireTime > bi.VE()) {
        break;
      }
      x.i("MicroMsg.GameSilentDownloader", "task expire time, appId:%s", new Object[] { ((c)localObject1).field_appId });
      e.DB(((c)localObject1).field_appId);
      cancelDownload(((c)localObject1).field_appId);
      paramBoolean = false;
    }
    if (!ao.isWifi(ad.getContext()))
    {
      x.i("MicroMsg.GameSilentDownloader", "NetType is not WIFI");
      return;
    }
    ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().DD(((c)localObject1).field_appId);
    com.tencent.mm.kernel.g.Ek();
    if (!com.tencent.mm.kernel.g.Ei().isSDCardAvailable())
    {
      x.i("MicroMsg.GameSilentDownloader", "sdcard isnt available");
      return;
    }
    ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().DE(((c)localObject1).field_appId);
    if ((((c)localObject1).field_size > 0L) && (!com.tencent.mm.compatible.util.f.aM(((c)localObject1).field_size)))
    {
      x.i("MicroMsg.GameSilentDownloader", "sdcard dont have enough space");
      return;
    }
    ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().DF(((c)localObject1).field_appId);
    x.i("MicroMsg.GameSilentDownloader", "fromBattery：%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
    {
      localObject2 = a.aUG();
      x.i("MicroMsg.GameSilentDownloader", "battery isCharging:%b  percent:%f", new Object[] { Boolean.valueOf(((a.a)localObject2).gCp), Float.valueOf(((a.a)localObject2).jOI) });
      if ((!((a.a)localObject2).gCp) && (((a.a)localObject2).jOI < 0.2D))
      {
        x.i("MicroMsg.GameSilentDownloader", "battery is low");
        return;
      }
      ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().DG(((c)localObject1).field_appId);
    }
    for (;;)
    {
      com.tencent.mm.bu.a.post(new Runnable()
      {
        public final void run()
        {
          com.tencent.mm.pluginsdk.model.app.f localf = com.tencent.mm.pluginsdk.model.app.g.bk(localObject1.field_appId, false);
          if (com.tencent.mm.pluginsdk.model.app.g.a(ad.getContext(), localf))
          {
            x.i("MicroMsg.GameSilentDownloader", "app is installed, appid = %s", new Object[] { localObject1.field_appId });
            e.C(localObject1.field_appId, 4, 0);
            ah.A(new g.1.1(this));
            return;
          }
          ah.A(new g.1.2(this));
        }
      });
      return;
      ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().DG(((c)localObject1).field_appId);
    }
  }
  
  private static final class a
  {
    private static g jOR = new g((byte)0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/model/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */