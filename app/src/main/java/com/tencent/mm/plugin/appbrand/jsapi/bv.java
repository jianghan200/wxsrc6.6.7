package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ipcinvoker.wx_extension.b;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.protocal.c.bxt;
import com.tencent.mm.protocal.c.bxu;
import org.json.JSONObject;

public final class bv
  extends a
{
  public static final int CTRL_INDEX = 313;
  public static final String NAME = "verifyPlugin";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if ((paramJSONObject == null) || (paramJSONObject.opt("data") == null))
    {
      paraml.E(paramInt, f("fail:data is null or nil", null));
      return;
    }
    String str = paraml.mAppId;
    bxt localbxt = new bxt();
    b.a locala = new b.a();
    locala.dIG = localbxt;
    locala.dIH = new bxu();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/verifyplugin";
    locala.dIF = 1714;
    locala.dII = 0;
    locala.dIJ = 0;
    localbxt.bPS = str;
    localbxt.stT = paramJSONObject.opt("data").toString();
    b.a(locala.KT(), new bv.1(this, paraml, paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */