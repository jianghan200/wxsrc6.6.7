package com.tencent.mm.plugin.webview.fts.c;

import com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  implements b.a
{
  public al gbr;
  public int gbs;
  private com.tencent.mm.plugin.webview.ui.tools.jsapi.d pNV;
  private b.b pQK;
  FtsWebVideoView pQU;
  
  public d(FtsWebVideoView paramFtsWebVideoView, b.b paramb, com.tencent.mm.plugin.webview.ui.tools.jsapi.d paramd)
  {
    this.pQU = paramFtsWebVideoView;
    this.pQK = paramb;
    this.pQK.a(this);
    this.pNV = paramd;
  }
  
  public final JSONObject a(int paramInt, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("playerId", this.pQU.getmVideoPlayerId());
    localJSONObject.put("event", paramInt);
    if (paramJSONObject != null) {
      localJSONObject.put("detail", paramJSONObject);
    }
    return localJSONObject;
  }
  
  public final void agK() {}
  
  public final void agL() {}
  
  public final boolean agV()
  {
    return false;
  }
  
  public final void ajd() {}
  
  public final JSONObject aka()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("data", this.pQU.getCookieData());
    return localJSONObject;
  }
  
  public final void akb()
  {
    if (this.gbr != null) {
      this.gbr.SO();
    }
  }
  
  public final void ao(JSONObject paramJSONObject)
  {
    this.pNV.a("onVideoPlayerCallback", null, paramJSONObject);
  }
  
  public final void bIu() {}
  
  public final void bTS() {}
  
  public final void bTU()
  {
    try
    {
      JSONObject localJSONObject = aka();
      localJSONObject.put("currentTime", this.pQU.getCurrPosSec());
      ao(a(6, localJSONObject));
      return;
    }
    catch (JSONException localJSONException)
    {
      x.printErrStackTrace("MicroMsg.JsApiVideoCallback", localJSONException, null, new Object[0]);
    }
  }
  
  public final void clean()
  {
    x.i("MicroMsg.JsApiVideoCallback", "clean %s", new Object[] { toString() });
    akb();
  }
  
  public final void onDestroy()
  {
    x.d("MicroMsg.JsApiVideoCallback", "onDestroy clean");
    clean();
    this.pQU.setCallback(null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/fts/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */