package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Bundle;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.l;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  implements l
{
  public final void b(long paramLong, int paramInt, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:state_change");
    localBundle.putString("state", "download_fail");
    localBundle.putInt("err_code", paramInt);
    Object localObject = c.cs(paramLong);
    if (localObject != null) {}
    for (localObject = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_appId;; localObject = "")
    {
      localBundle.putString("appid", (String)localObject);
      localBundle.putLong("download_id", paramLong);
      com.tencent.mm.plugin.game.gamewebview.ipc.a.z(localBundle);
      return;
    }
  }
  
  public final void b(long paramLong, String paramString, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:state_change");
    localBundle.putString("state", "download_succ");
    paramString = c.cs(paramLong);
    if (paramString != null) {}
    for (paramString = paramString.field_appId;; paramString = "")
    {
      localBundle.putString("appid", paramString);
      localBundle.putLong("download_id", paramLong);
      com.tencent.mm.plugin.game.gamewebview.ipc.a.z(localBundle);
      return;
    }
  }
  
  public final void bP(long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:progress_change");
    com.tencent.mm.plugin.downloader.c.a locala = c.cs(paramLong);
    if ((locala == null) || (locala.field_totalSize == 0L))
    {
      x.w("MicroMsg.GameWebViewDownloadEventBus", "loadDownloadProgress failed, downloadId = " + paramLong);
      return;
    }
    localBundle.putInt("progress", (int)(locala.field_downloadedSize / locala.field_totalSize * 100.0D));
    localBundle.putString("appid", locala.field_appId);
    localBundle.putLong("download_id", paramLong);
    com.tencent.mm.plugin.game.gamewebview.ipc.a.z(localBundle);
  }
  
  public final void h(long paramLong, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:state_change");
    localBundle.putString("state", "download_resumed");
    paramString = c.cs(paramLong);
    if (paramString != null) {}
    for (paramString = paramString.field_appId;; paramString = "")
    {
      localBundle.putString("appid", paramString);
      localBundle.putLong("download_id", paramLong);
      com.tencent.mm.plugin.game.gamewebview.ipc.a.z(localBundle);
      return;
    }
  }
  
  public final void onTaskPaused(long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:state_change");
    localBundle.putString("state", "download_pause");
    Object localObject = c.cs(paramLong);
    if (localObject != null) {}
    for (localObject = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_appId;; localObject = "")
    {
      localBundle.putString("appid", (String)localObject);
      localBundle.putLong("download_id", paramLong);
      com.tencent.mm.plugin.game.gamewebview.ipc.a.z(localBundle);
      return;
    }
  }
  
  public final void onTaskRemoved(long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:state_change");
    localBundle.putString("state", "download_removed");
    Object localObject = c.cs(paramLong);
    if (localObject != null) {}
    for (localObject = ((com.tencent.mm.plugin.downloader.c.a)localObject).field_appId;; localObject = "")
    {
      localBundle.putString("appid", (String)localObject);
      localBundle.putLong("download_id", paramLong);
      com.tencent.mm.plugin.game.gamewebview.ipc.a.z(localBundle);
      return;
    }
  }
  
  public final void onTaskStarted(long paramLong, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:state_change");
    localBundle.putString("state", "download_start");
    paramString = c.cs(paramLong);
    if (paramString != null) {}
    for (paramString = paramString.field_appId;; paramString = "")
    {
      localBundle.putString("appid", paramString);
      localBundle.putLong("download_id", paramLong);
      com.tencent.mm.plugin.game.gamewebview.ipc.a.z(localBundle);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */