package com.tencent.mm.plugin.appbrand.jsapi.l;

import android.text.TextUtils;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

public class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 45;
  private static final String NAME = "reportAction";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    String str5 = paramJSONObject.optString("key");
    String str7 = paramJSONObject.optString("value");
    x.i("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey =  %s, actionValue =  %s", new Object[] { str5, str7 });
    if ((bi.oW(str5)) || (bi.oW(str7)))
    {
      x.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue is null");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    if ((str5.length() <= 0) || (str5.length() > 32) || (str7.length() <= 0) || (str7.length() > 1024))
    {
      x.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue size is bad");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    String str6 = paraml.mAppId;
    if (TextUtils.isEmpty(str6))
    {
      x.e("MicroMsg.JsApiReportAction", "doReportActionInfo, appId is empty");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    x.i("MicroMsg.JsApiReportAction", "doReportActionInfo, appId %s", new Object[] { str6 });
    int i = 0;
    int j = 0;
    if (ao.isConnected(paraml.getContext()))
    {
      if (!ao.isWifi(paraml.getContext())) {
        break label496;
      }
      i = 1;
    }
    for (;;)
    {
      x.i("MicroMsg.JsApiReportAction", "doReportActionInfo, get networkType %d", new Object[] { Integer.valueOf(i) });
      long l = bi.VE();
      x.d("MicroMsg.JsApiReportAction", "report(%s), clickTimestamp : %d, appID %s, networkType %d, userAgent %s, url : %s, sessionID : %s, actionKey : %s, actionValue : %s", new Object[] { Long.valueOf(l), Integer.valueOf(13579), str6, Integer.valueOf(i), "", "", "", str5, str7 });
      Object localObject1 = "";
      localObject3 = "";
      String str3 = "";
      str4 = "";
      String str1 = str3;
      paramJSONObject = (JSONObject)localObject3;
      try
      {
        localObject2 = URLEncoder.encode(bi.oV(""), "UTF-8");
        str1 = str3;
        paramJSONObject = (JSONObject)localObject3;
        localObject1 = localObject2;
        localObject3 = URLEncoder.encode("", "UTF-8");
        str1 = str3;
        paramJSONObject = (JSONObject)localObject3;
        localObject1 = localObject2;
        str3 = URLEncoder.encode(str5, "UTF-8");
        str1 = str3;
        paramJSONObject = (JSONObject)localObject3;
        localObject1 = localObject2;
        str5 = URLEncoder.encode(str7, "UTF-8");
        paramJSONObject = str5;
        localObject1 = localObject2;
        str1 = str3;
        localObject2 = paramJSONObject;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          Object localObject2;
          x.printErrStackTrace("MicroMsg.JsApiReportAction", localUnsupportedEncodingException, "", new Object[0]);
          String str2 = str4;
          localObject3 = paramJSONObject;
        }
      }
      h.mEJ.h(13579, new Object[] { str6, Integer.valueOf(i), localObject1, localObject3, "", str1, localObject2, Long.valueOf(l), Long.valueOf(l) });
      paraml.E(paramInt, f("ok", null));
      return;
      label496:
      if (ao.is4G(paraml.getContext()))
      {
        i = 4;
      }
      else if (ao.is3G(paraml.getContext()))
      {
        i = 3;
      }
      else
      {
        i = j;
        if (ao.is2G(paraml.getContext())) {
          i = 2;
        }
      }
    }
  }
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    String str5 = paramJSONObject.optString("key");
    String str7 = paramJSONObject.optString("value");
    x.i("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey =  %s, actionValue =  %s", new Object[] { str5, str7 });
    if ((bi.oW(str5)) || (bi.oW(str7)))
    {
      x.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue is null");
      paramp.E(paramInt, f("fail", null));
      return;
    }
    if ((str5.length() <= 0) || (str5.length() > 32) || (str7.length() <= 0) || (str7.length() > 1024))
    {
      x.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue size is bad");
      paramp.E(paramInt, f("fail", null));
      return;
    }
    String str6 = paramp.mAppId;
    if (TextUtils.isEmpty(str6))
    {
      x.e("MicroMsg.JsApiReportAction", "doReportActionInfo, appId is empty");
      paramp.E(paramInt, f("fail", null));
      return;
    }
    x.i("MicroMsg.JsApiReportAction", "doReportActionInfo, appId %s", new Object[] { str6 });
    int i = 0;
    int j = 0;
    if (ao.isConnected(paramp.mContext))
    {
      if (!ao.isWifi(paramp.mContext)) {
        break label496;
      }
      i = 1;
    }
    for (;;)
    {
      x.i("MicroMsg.JsApiReportAction", "doReportActionInfo, get networkType %d", new Object[] { Integer.valueOf(i) });
      long l = bi.VE();
      x.d("MicroMsg.JsApiReportAction", "report(%s), clickTimestamp : %d, appID %s, networkType %d, userAgent %s, url : %s, sessionID : %s, actionKey : %s, actionValue : %s", new Object[] { Long.valueOf(l), Integer.valueOf(13579), str6, Integer.valueOf(i), "", "", "", str5, str7 });
      Object localObject1 = "";
      localObject3 = "";
      String str3 = "";
      str4 = "";
      String str1 = str3;
      paramJSONObject = (JSONObject)localObject3;
      try
      {
        localObject2 = URLEncoder.encode(bi.oV(""), "UTF-8");
        str1 = str3;
        paramJSONObject = (JSONObject)localObject3;
        localObject1 = localObject2;
        localObject3 = URLEncoder.encode("", "UTF-8");
        str1 = str3;
        paramJSONObject = (JSONObject)localObject3;
        localObject1 = localObject2;
        str3 = URLEncoder.encode(str5, "UTF-8");
        str1 = str3;
        paramJSONObject = (JSONObject)localObject3;
        localObject1 = localObject2;
        str5 = URLEncoder.encode(str7, "UTF-8");
        paramJSONObject = str5;
        localObject1 = localObject2;
        str1 = str3;
        localObject2 = paramJSONObject;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          Object localObject2;
          x.printErrStackTrace("MicroMsg.JsApiReportAction", localUnsupportedEncodingException, "", new Object[0]);
          String str2 = str4;
          localObject3 = paramJSONObject;
        }
      }
      h.mEJ.h(13579, new Object[] { str6, Integer.valueOf(i), localObject1, localObject3, "", str1, localObject2, Long.valueOf(l), Long.valueOf(l) });
      paramp.E(paramInt, f("ok", null));
      return;
      label496:
      if (ao.is4G(paramp.mContext))
      {
        i = 4;
      }
      else if (ao.is3G(paramp.mContext))
      {
        i = 3;
      }
      else
      {
        i = j;
        if (ao.is2G(paramp.mContext)) {
          i = 2;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */