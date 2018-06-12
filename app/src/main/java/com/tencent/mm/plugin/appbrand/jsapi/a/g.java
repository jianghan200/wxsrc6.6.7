package com.tencent.mm.plugin.appbrand.jsapi.a;

import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.protocal.c.bif;
import com.tencent.mm.protocal.c.big;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class g
  extends a
{
  public static final int CTRL_INDEX = 205;
  public static final String NAME = "setUserAutoFillData";
  
  public final void a(final p paramp, JSONObject paramJSONObject, final int paramInt)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData data is invalid");
      paramp.E(paramInt, f("fail:data is invalid", null));
      return;
    }
    paramJSONObject = paramJSONObject.optString("dataList");
    String str = paramp.mAppId;
    x.i("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData appId:%s, dataList:%s", new Object[] { str, paramJSONObject });
    Object localObject = new com.tencent.mm.ab.b.a();
    ((com.tencent.mm.ab.b.a)localObject).dIG = new bif();
    ((com.tencent.mm.ab.b.a)localObject).dIH = new big();
    ((com.tencent.mm.ab.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/saveinfo";
    ((com.tencent.mm.ab.b.a)localObject).dIF = 1180;
    ((com.tencent.mm.ab.b.a)localObject).dII = 0;
    ((com.tencent.mm.ab.b.a)localObject).dIJ = 0;
    localObject = ((com.tencent.mm.ab.b.a)localObject).KT();
    bif localbif = (bif)((com.tencent.mm.ab.b)localObject).dID.dIL;
    localbif.bPS = str;
    localbif.rLM = paramJSONObject;
    com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ab.b)localObject, new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ab.b paramAnonymousb)
      {
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.dIE.dIL == null))
        {
          x.e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData SaveUserAutoFillInfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.dIE.dIL });
          paramp.E(paramInt, g.this.f("fail:cgi fail", null));
          return;
        }
        x.i("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData success");
        paramp.E(paramInt, g.this.f("ok", null));
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */