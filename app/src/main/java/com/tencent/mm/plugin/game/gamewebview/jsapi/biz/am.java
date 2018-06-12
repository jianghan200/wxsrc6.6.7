package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.a.e;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class am
  extends a
{
  public static final int CTRL_BYTE = 40;
  public static final String NAME = "queryDownloadTask";
  
  private static void a(d paramd, FileDownloadTaskInfo paramFileDownloadTaskInfo, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    String str;
    switch (paramFileDownloadTaskInfo.status)
    {
    case 0: 
    default: 
      str = "default";
    }
    for (;;)
    {
      try
      {
        localHashMap.put("download_id", Long.valueOf(paramFileDownloadTaskInfo.id));
        localHashMap.put("state", str);
        if ((str == "downloading") && (paramFileDownloadTaskInfo.gTK != 0L)) {
          localHashMap.put("progress", Long.valueOf(paramFileDownloadTaskInfo.icq / paramFileDownloadTaskInfo.gTK * 100L));
        }
        paramd.E(paramInt, f("query_download_task:ok", localHashMap));
        return;
      }
      catch (Exception paramd)
      {
        x.e("MicroMsg.GameJsApiQueryDownloadTask", paramd.getMessage());
      }
      str = "api_not_support";
      continue;
      str = "downloading";
      continue;
      if (e.cn(paramFileDownloadTaskInfo.path))
      {
        str = "download_succ";
      }
      else
      {
        str = "default";
        continue;
        str = "download_pause";
        continue;
        str = "download_fail";
      }
    }
  }
  
  private static void a(JSONObject paramJSONObject, ArrayList<String> paramArrayList)
  {
    if (bi.cX(paramArrayList)) {}
    for (;;)
    {
      return;
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        String str = (String)paramArrayList.next();
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("download_id", -1);
          localJSONObject.put("state", "default");
          paramJSONObject.put(str, localJSONObject);
        }
        catch (Exception localException)
        {
          x.e("MicroMsg.GameJsApiQueryDownloadTask", localException.getMessage());
        }
      }
    }
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    Object localObject2 = paramJSONObject.optJSONArray("appIdArray");
    if ((localObject2 != null) && (((JSONArray)localObject2).length() > 0))
    {
      localObject1 = new JSONObject();
      ArrayList localArrayList = new ArrayList();
      while (i < ((JSONArray)localObject2).length())
      {
        localArrayList.add(((JSONArray)localObject2).optString(i));
        i += 1;
      }
      paramJSONObject = new QueryDownloadInfoTask();
      paramJSONObject.type = 2;
      paramJSONObject.jHC = localArrayList;
      GameWebViewMainProcessService.b(paramJSONObject);
      paramJSONObject = paramJSONObject.ixN;
      if ((paramJSONObject != null) && (paramJSONObject.size() > 0))
      {
        localObject2 = paramJSONObject.iterator();
        if (((Iterator)localObject2).hasNext())
        {
          FileDownloadTaskInfo localFileDownloadTaskInfo = (FileDownloadTaskInfo)((Iterator)localObject2).next();
          JSONObject localJSONObject = new JSONObject();
          switch (localFileDownloadTaskInfo.status)
          {
          case 0: 
          default: 
            paramJSONObject = "default";
          }
          for (;;)
          {
            try
            {
              localJSONObject.put("download_id", localFileDownloadTaskInfo.id);
              localJSONObject.put("state", paramJSONObject);
              if ((paramJSONObject == "downloading") && (localFileDownloadTaskInfo.gTK != 0L)) {
                localJSONObject.put("progress", localFileDownloadTaskInfo.icq / localFileDownloadTaskInfo.gTK * 100L);
              }
              ((JSONObject)localObject1).put(localFileDownloadTaskInfo.appId, localJSONObject);
              localArrayList.remove(localFileDownloadTaskInfo.appId);
            }
            catch (Exception paramJSONObject)
            {
              x.e("MicroMsg.GameJsApiQueryDownloadTask", paramJSONObject.getMessage());
            }
            break;
            paramJSONObject = "api_not_support";
            continue;
            paramJSONObject = "downloading";
            continue;
            if (e.cn(localFileDownloadTaskInfo.path))
            {
              paramJSONObject = "download_succ";
            }
            else
            {
              paramJSONObject = "default";
              continue;
              paramJSONObject = "download_pause";
              continue;
              paramJSONObject = "download_fail";
            }
          }
        }
        a((JSONObject)localObject1, localArrayList);
        paramJSONObject = new HashMap();
        paramJSONObject.put("result", ((JSONObject)localObject1).toString());
        paramd.E(paramInt, f("query_download_task:ok", paramJSONObject));
        return;
      }
      x.e("MicroMsg.GameJsApiQueryDownloadTask", "taskInfos is null");
      a((JSONObject)localObject1, localArrayList);
      paramJSONObject = new HashMap();
      paramJSONObject.put("result", ((JSONObject)localObject1).toString());
      paramd.E(paramInt, f("query_download_task:ok", paramJSONObject));
      return;
    }
    Object localObject1 = new QueryDownloadInfoTask();
    long l = paramJSONObject.optLong("download_id", -1L);
    paramJSONObject = paramJSONObject.optString("appid");
    if (l > 0L)
    {
      ((QueryDownloadInfoTask)localObject1).type = 1;
      ((QueryDownloadInfoTask)localObject1).bGm = l;
      GameWebViewMainProcessService.b((GWMainProcessTask)localObject1);
      if ((((QueryDownloadInfoTask)localObject1).ixN == null) || (((QueryDownloadInfoTask)localObject1).ixN.size() == 0))
      {
        a(paramd, new FileDownloadTaskInfo(), paramInt);
        return;
      }
      a(paramd, (FileDownloadTaskInfo)((QueryDownloadInfoTask)localObject1).ixN.get(0), paramInt);
      return;
    }
    if (!bi.oW(paramJSONObject))
    {
      ((QueryDownloadInfoTask)localObject1).type = 2;
      ((QueryDownloadInfoTask)localObject1).jHC = new ArrayList();
      ((QueryDownloadInfoTask)localObject1).jHC.add(paramJSONObject);
      GameWebViewMainProcessService.b((GWMainProcessTask)localObject1);
      if ((((QueryDownloadInfoTask)localObject1).ixN == null) || (((QueryDownloadInfoTask)localObject1).ixN.size() == 0))
      {
        a(paramd, new FileDownloadTaskInfo(), paramInt);
        return;
      }
      a(paramd, (FileDownloadTaskInfo)((QueryDownloadInfoTask)localObject1).ixN.get(0), paramInt);
      return;
    }
    x.e("MicroMsg.GameJsApiQueryDownloadTask", "invalid params");
    paramd.E(paramInt, a.f("query_download_task:fail_invalid_params", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */