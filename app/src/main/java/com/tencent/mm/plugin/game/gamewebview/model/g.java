package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Bundle;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonLogicTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.m;

public final class g
{
  public static m Dj(String paramString)
  {
    if (bi.oW(paramString)) {
      x.e("MicroMsg.GameWebViewResourceInterrupter", "url is null, return ");
    }
    while ((bi.oW(paramString)) || (!paramString.startsWith("weixin://resourceid/"))) {
      return null;
    }
    x.i("MicroMsg.GameWebViewResourceInterrupter", "it is wechat resource is, should intercept");
    for (;;)
    {
      try
      {
        CommonLogicTask localCommonLogicTask = new CommonLogicTask();
        localCommonLogicTask.type = 8;
        localCommonLogicTask.jfZ.putString("localId", paramString);
        GameWebViewMainProcessService.b(localCommonLogicTask);
        paramString = aj.Qw(localCommonLogicTask.jfZ.getString("file_path"));
        if (paramString != null)
        {
          paramString = new m("image/*", "utf-8", paramString);
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.GameWebViewResourceInterrupter", "get webview jssdk resource failed %s", new Object[] { paramString.getMessage() });
        return null;
      }
      paramString = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */