package com.tencent.mm.plugin.appbrand.jsapi.h;

import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.k.j;
import com.tencent.mm.plugin.appbrand.k.k;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.s.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;
import org.json.JSONObject;

public final class h
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 347;
  public static final String NAME = "operateSocketTask";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.d("MicroMsg.JsApiOperateSocketTask", "JsApiOperateSocketTask");
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail:data is null", null));
      x.e("MicroMsg.JsApiOperateSocketTask", "data is null");
      return;
    }
    String str1 = paramJSONObject.optString("socketTaskId");
    if (bi.oW(str1))
    {
      x.e("MicroMsg.JsApiOperateSocketTask", "taskId is null");
      paraml.E(paramInt, f("fail:taskId is null or nil", null));
      return;
    }
    String str2 = paramJSONObject.optString("operationType");
    if (bi.oW(str2))
    {
      x.e("MicroMsg.JsApiOperateSocketTask", "operationType is null");
      paraml.E(paramInt, f("fail:operationType is null or nil", null));
      return;
    }
    j localj = k.aly().uT(paraml.mAppId);
    if (localj == null)
    {
      paraml.E(paramInt, f("fail:no task", null));
      x.w("MicroMsg.JsApiOperateSocketTask", "client is null");
      return;
    }
    com.tencent.mm.plugin.appbrand.s.a.a locala = localj.uS(str1);
    if (locala == null)
    {
      paraml.E(paramInt, f("fail:taskID not exist", null));
      x.w("MicroMsg.JsApiOperateSocketTask", "webSocketClient is null");
      return;
    }
    if (str2.equals("close"))
    {
      int i = paramJSONObject.optInt("code", 1000);
      if ((i != 1000) && ((i < 3000) || (i >= 5000)))
      {
        paraml.E(paramInt, f("fail:The code must be either 1000, or between 3000 and 4999", null));
        return;
      }
      paramJSONObject = paramJSONObject.optString("reason", "");
      if (locala != null) {}
      try
      {
        x.i("MicroMsg.AppBrandNetworkWebSocket", "try to close socket");
        if (locala.gDi != null) {
          locala.S(i, paramJSONObject);
        }
        localj.b(locala);
        paraml.E(paramInt, f("ok", null));
        x.d("MicroMsg.JsApiOperateSocketTask", "closeSocket code %d, reason %s", new Object[] { Integer.valueOf(i), paramJSONObject });
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.AppBrandNetworkWebSocket", "send error" + localException.toString());
        }
      }
    }
    if (str2.equals("send"))
    {
      if (locala != null) {}
      for (boolean bool = locala.gDd.isOpen(); !bool; bool = false)
      {
        paraml.E(paramInt, f("fail", null));
        x.w("MicroMsg.JsApiOperateSocketTask", "send fail taskId: %s", new Object[] { localException });
        return;
      }
      paramJSONObject = paramJSONObject.opt("data");
      if (paramJSONObject != null)
      {
        for (;;)
        {
          try
          {
            if ((paramJSONObject instanceof ByteBuffer))
            {
              x.i("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage ok message:%s", new Object[] { paramJSONObject });
              locala.q((ByteBuffer)paramJSONObject);
              paraml.E(paramInt, f("ok", null));
              return;
            }
          }
          catch (Exception paramJSONObject)
          {
            paraml.E(paramInt, f("fail:" + paramJSONObject.getMessage(), null));
            return;
          }
          if (!(paramJSONObject instanceof String)) {
            break;
          }
          x.i("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage ok message");
          paramJSONObject = (String)paramJSONObject;
          if (locala != null) {
            locala.vW(paramJSONObject);
          }
        }
        x.w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage error message type wrong");
        paraml.E(paramInt, f("fail:unknown data", null));
        return;
      }
      paraml.E(paramInt, f("fail:message is null or nil", null));
      x.w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage fail:%s", new Object[] { paramJSONObject });
      return;
    }
    paraml.E(paramInt, f("fail:unknown operationType", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */