package com.tencent.mm.plugin.game.model;

import android.content.Context;
import com.tencent.mm.a.e;
import com.tencent.mm.g.c.p;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;

public final class n
{
  public d jMa;
  public boolean jMb = false;
  public int mode = 1;
  public int progress = 0;
  public int status = 0;
  
  public n(d paramd)
  {
    this.jMa = paramd;
  }
  
  public final void aTT()
  {
    if (this.jMa == null) {
      return;
    }
    switch (this.mode)
    {
    default: 
      this.status = 0;
    }
    for (;;)
    {
      label37:
      x.i("MicroMsg.GameDownloadInfo", "Updating Download Status, AppId: %s, downloadMode: %d, downloadStatus: %d", new Object[] { this.jMa.field_appId, Integer.valueOf(this.mode), Integer.valueOf(this.status) });
      return;
      FileDownloadTaskInfo localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.d.aCU().yO(this.jMa.field_appId);
      if (localFileDownloadTaskInfo.gTK != 0L) {}
      for (this.progress = ((int)(localFileDownloadTaskInfo.icq / localFileDownloadTaskInfo.gTK * 100.0D));; this.progress = 0)
      {
        x.d("MicroMsg.GameDownloadInfo", "status = " + localFileDownloadTaskInfo.status);
        switch (localFileDownloadTaskInfo.status)
        {
        default: 
          this.status = 0;
          break label37;
        }
      }
      this.status = 1;
      continue;
      this.status = 2;
      continue;
      this.status = 0;
      continue;
      if (e.cn(localFileDownloadTaskInfo.path))
      {
        this.status = 3;
      }
      else
      {
        this.status = 0;
        continue;
        if ((this.progress != 0) && (!ao.isConnected(ad.getContext()))) {
          this.status = 2;
        } else {
          this.status = 0;
        }
      }
    }
  }
  
  public final void aTU()
  {
    this.mode = 1;
    this.jMb = true;
  }
  
  public final void dC(Context paramContext)
  {
    if (this.jMa == null) {
      return;
    }
    int j = this.jMa.cmN;
    int i = this.jMa.cmN;
    x.i("MicroMsg.GameDownloadInfo", "AppId: %s, Initial downloadMode: %d", new Object[] { this.jMa.field_appId, Integer.valueOf(j) });
    if (j == 2) {
      i = 3;
    }
    j = i;
    if (i == 3)
    {
      j = i;
      if (!g.r(paramContext, "wx3909f6add1206543")) {
        j = 1;
      }
    }
    i = j;
    if (j != 1)
    {
      paramContext = com.tencent.mm.plugin.downloader.model.d.aCU().yO(this.jMa.field_appId);
      if ((paramContext.status != 1) && (paramContext.status != 2))
      {
        i = j;
        if (paramContext.status != 3) {}
      }
      else
      {
        i = 1;
      }
    }
    this.mode = i;
    x.i("MicroMsg.GameDownloadInfo", "AppId: %s, Final downloadMode: %d", new Object[] { this.jMa.field_appId, Integer.valueOf(i) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/model/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */