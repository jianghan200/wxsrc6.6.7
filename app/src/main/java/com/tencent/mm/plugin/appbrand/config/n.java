package com.tencent.mm.plugin.appbrand.config;

import com.tencent.mm.protocal.c.byl;
import com.tencent.mm.protocal.c.cx;
import com.tencent.mm.protocal.c.dh;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public enum n
{
  static String a(dh paramdh)
  {
    if (paramdh == null) {
      return "AppRunningFlagInfo{null}";
    }
    return "AppRunningFlagInfo{RunningFlag=" + paramdh.rdx + ", StopServiceTime" + paramdh.rdy + ", AppForbiddenReason" + paramdh.rdz + ", SessionOpenForbiddenReason" + paramdh.rdA + ", TimelineOpenForbiddenReason" + paramdh.rdB + "}";
  }
  
  static cx i(JSONObject paramJSONObject)
  {
    Object localObject = paramJSONObject.optJSONObject("AppConfig");
    paramJSONObject = new cx();
    if (localObject != null)
    {
      localObject = ((JSONObject)localObject).optJSONArray("VersionList");
      paramJSONObject.rcX = new LinkedList();
      if (localObject != null)
      {
        int i = 0;
        while (i < ((JSONArray)localObject).length())
        {
          JSONObject localJSONObject = ((JSONArray)localObject).optJSONObject(i);
          byl localbyl = new byl();
          localbyl.type = localJSONObject.optInt("type");
          localbyl.version = localJSONObject.optInt("version");
          paramJSONObject.rcX.add(localbyl);
          i += 1;
        }
      }
    }
    return paramJSONObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */