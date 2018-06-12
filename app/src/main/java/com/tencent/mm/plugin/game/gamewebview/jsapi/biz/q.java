package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class q
  extends a
{
  public static final int CTRL_BYTE = 25;
  public static final String NAME = "getInstallState";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiGetNetworkType", "invoke");
    Object localObject1 = paramd.getContext();
    if (localObject1 == null)
    {
      x.i("MicroMsg.GameJsApiGetNetworkType", "context is null");
      return;
    }
    if (paramJSONObject == null)
    {
      x.i("MicroMsg.GameJsApiGetNetworkType", "data is null");
      paramd.E(paramInt, a.f("get_install_state:no_null_data", null));
      return;
    }
    JSONArray localJSONArray = paramJSONObject.optJSONArray("packageName");
    Object localObject2;
    JSONObject localJSONObject;
    int i;
    int m;
    int j;
    int k;
    if (localJSONArray != null)
    {
      localObject2 = new JSONObject();
      localJSONObject = new JSONObject();
      i = 0;
      m = 0;
      j = i;
      k = i;
    }
    for (;;)
    {
      try
      {
        if (m >= localJSONArray.length()) {
          continue;
        }
        j = i;
        String str = localJSONArray.optString(m);
        j = i;
        paramJSONObject = p.getPackageInfo((Context)localObject1, str);
        if (paramJSONObject == null)
        {
          n = 0;
          break label520;
          j = i;
          x.i("MicroMsg.GameJsApiGetNetworkType", "getInstallState, packageName = " + str + ", version = " + n + ", versionName = " + paramJSONObject);
          k = i;
          if (i == 0)
          {
            k = i;
            if (n > 0) {
              k = 1;
            }
          }
          j = k;
          ((JSONObject)localObject2).put(str, n);
          j = k;
          localJSONObject.put(str, paramJSONObject);
          m += 1;
          i = k;
          break;
        }
        j = i;
        int n = paramJSONObject.versionCode;
      }
      catch (Exception paramJSONObject)
      {
        k = j;
        paramJSONObject = new HashMap();
        paramJSONObject.put("result", ((JSONObject)localObject2).toString());
        paramJSONObject.put("versionName", localJSONObject.toString());
        if (k == 0) {
          continue;
        }
        paramd.E(paramInt, f("get_install_state:yes", paramJSONObject));
        return;
        paramd.E(paramInt, a.f("get_install_state:no", null));
        return;
      }
      j = i;
      paramJSONObject = paramJSONObject.versionName;
      continue;
      localObject2 = paramJSONObject.optString("packageName");
      if (bi.oW((String)localObject2))
      {
        x.i("MicroMsg.GameJsApiGetNetworkType", "packageName is null or nil");
        paramd.E(paramInt, a.f("get_install_state:no_null_packageName", null));
        return;
      }
      localObject1 = p.getPackageInfo((Context)localObject1, (String)localObject2);
      if (localObject1 == null)
      {
        i = 0;
        if (localObject1 != null) {
          break label464;
        }
      }
      label464:
      for (paramJSONObject = "null";; paramJSONObject = ((PackageInfo)localObject1).versionName)
      {
        x.i("MicroMsg.GameJsApiGetNetworkType", "doGetInstallState, packageName = " + (String)localObject2 + ", version = " + i + ", versionName = " + paramJSONObject);
        if (localObject1 != null) {
          break label473;
        }
        paramd.E(paramInt, a.f("get_install_state:no", null));
        return;
        i = ((PackageInfo)localObject1).versionCode;
        break;
      }
      label473:
      localObject1 = new HashMap();
      ((Map)localObject1).put("versionName", paramJSONObject);
      paramd.E(paramInt, f("get_install_state:yes_" + paramJSONObject, (Map)localObject1));
      return;
      label520:
      if (paramJSONObject == null) {
        paramJSONObject = "null";
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */