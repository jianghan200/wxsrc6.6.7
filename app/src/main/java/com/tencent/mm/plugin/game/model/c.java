package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.database.Cursor;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.downloader.c.b;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
{
  LinkedList<String> jKZ = new LinkedList();
  LinkedList<f> jLa = new LinkedList();
  
  private void aTw()
  {
    Object localObject1 = new ArrayList();
    Object localObject2 = ((com.tencent.mm.plugin.downloader.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.downloader.a.c.class)).FX().rawQuery("select * from FileDownloadInfo where status=3", new String[0]);
    if (localObject2 == null) {}
    while (!((List)localObject1).isEmpty())
    {
      localObject1 = ((List)localObject1).iterator();
      Object localObject3;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if ((!bi.oW((String)localObject2)) && (!this.jKZ.contains(localObject2)))
        {
          localObject3 = com.tencent.mm.pluginsdk.model.app.g.bl((String)localObject2, false);
          if ((localObject3 != null) && (!this.jLa.contains(localObject3)))
          {
            this.jLa.add(localObject3);
            this.jKZ.add(localObject2);
          }
        }
      }
      while (((Cursor)localObject2).moveToNext())
      {
        localObject3 = new com.tencent.mm.plugin.downloader.c.a();
        ((com.tencent.mm.plugin.downloader.c.a)localObject3).d((Cursor)localObject2);
        if ((!bi.oW(((com.tencent.mm.plugin.downloader.c.a)localObject3).field_appId)) && (((com.tencent.mm.plugin.downloader.c.a)localObject3).field_appId.startsWith("wx")) && (((com.tencent.mm.plugin.downloader.c.a)localObject3).field_status == 3) && (e.cn(((com.tencent.mm.plugin.downloader.c.a)localObject3).field_filePath)) && (!((List)localObject1).contains(((com.tencent.mm.plugin.downloader.c.a)localObject3).field_appId))) {
          ((List)localObject1).add(((com.tencent.mm.plugin.downloader.c.a)localObject3).field_appId);
        }
      }
      ((Cursor)localObject2).close();
    }
  }
  
  private void dq(Context paramContext)
  {
    Cursor localCursor = com.tencent.mm.plugin.ac.a.bmf().cbP();
    if (localCursor == null)
    {
      x.e("MicroMsg.GameAppCacheService", "getInstalledGame faild: curosr is null");
      return;
    }
    if (localCursor.moveToFirst()) {
      do
      {
        f localf = new f();
        localf.d(localCursor);
        if ((com.tencent.mm.pluginsdk.model.app.g.a(paramContext, localf)) && (!this.jKZ.contains(localf.field_appId)))
        {
          x.i("MicroMsg.GameAppCacheService", "installed game:[%s][%s]", new Object[] { localf.field_appName, localf.field_appId });
          this.jLa.add(localf);
          this.jKZ.add(localf.field_appId);
        }
      } while (localCursor.moveToNext());
    }
    localCursor.close();
  }
  
  public final void clearCache()
  {
    x.i("MicroMsg.GameAppCacheService", "clear cached apppinfos");
    if (this.jLa != null) {
      this.jLa.clear();
    }
    if (this.jKZ != null) {
      this.jKZ.clear();
    }
  }
  
  public final void init(Context paramContext)
  {
    if (this.jLa == null)
    {
      this.jLa = new LinkedList();
      if (this.jKZ != null) {
        break label112;
      }
      this.jKZ = new LinkedList();
    }
    for (;;)
    {
      long l1 = System.currentTimeMillis();
      dq(paramContext);
      long l2 = System.currentTimeMillis();
      aTw();
      long l3 = System.currentTimeMillis();
      x.i("MicroMsg.GameAppCacheService", "Init time: %d, %d, %d", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(l3 - l2), Long.valueOf(l3 - l1) });
      return;
      this.jLa.clear();
      break;
      label112:
      this.jKZ.clear();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */