package com.tencent.mm.plugin.appbrand.jsapi.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.protocal.c.aja;
import com.tencent.mm.protocal.c.ajb;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_INDEX = 204;
  public static final String NAME = "getUserAutoFillData";
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData data is invalid");
      paramp.E(paramInt, f("fail:data is invalid", null));
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Object localObject = paramJSONObject.optJSONArray("fields");
    if ((localObject != null) && (((JSONArray)localObject).length() > 0))
    {
      int i = 0;
      while (i < ((JSONArray)localObject).length())
      {
        localLinkedList.add(((JSONArray)localObject).optString(i));
        i += 1;
      }
    }
    if (localLinkedList.size() == 0)
    {
      x.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData fields is empty");
      paramp.E(paramInt, f("fail:fields is empty", null));
      return;
    }
    localObject = paramp.mAppId;
    x.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData appId:%s, data:%s", new Object[] { localObject, paramJSONObject.toString() });
    paramJSONObject = new b.a();
    paramJSONObject.dIG = new aja();
    paramJSONObject.dIH = new ajb();
    paramJSONObject.uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo";
    paramJSONObject.dIF = 1191;
    paramJSONObject.dII = 0;
    paramJSONObject.dIJ = 0;
    paramJSONObject = paramJSONObject.KT();
    aja localaja = (aja)paramJSONObject.dID.dIL;
    localaja.rLL = localLinkedList;
    localaja.bPS = ((String)localObject);
    localaja.rLK = false;
    localaja.source = 1;
    com.tencent.mm.ipcinvoker.wx_extension.b.a(paramJSONObject, new d.1(this, paramp, paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */