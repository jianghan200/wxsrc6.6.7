package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.text.TextUtils;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.protocal.c.sb;
import com.tencent.mm.protocal.c.sc;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class b
  extends a
{
  public static final int CTRL_INDEX = 206;
  public static final String NAME = "deleteUserAutoFillData";
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData data is invalid");
      paramp.E(paramInt, f("fail:data is invalid", null));
      return;
    }
    String str = paramJSONObject.optString("groupKey");
    int i = paramJSONObject.optInt("groupId", 0);
    if (TextUtils.isEmpty(str))
    {
      x.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData groupKey is invalid");
      paramp.E(paramInt, f("fail:groupKey is invalid", null));
      return;
    }
    paramJSONObject = paramp.mAppId;
    x.i("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData appId:%s, groupId:%d, groupKey:%s", new Object[] { paramJSONObject, Integer.valueOf(i), str });
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new sb();
    ((b.a)localObject).dIH = new sc();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo";
    ((b.a)localObject).dIF = 1194;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    localObject = ((b.a)localObject).KT();
    sb localsb = (sb)((com.tencent.mm.ab.b)localObject).dID.dIL;
    localsb.rvy = str;
    localsb.bPS = paramJSONObject;
    localsb.group_id = i;
    localsb.source = 1;
    com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ab.b)localObject, new b.1(this, paramp, paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */