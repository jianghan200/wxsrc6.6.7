package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.g.a.gl;
import com.tencent.mm.g.a.gl.b;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class GameJsApiGetGameCommInfo
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 241;
  public static final String NAME = "getGameCommInfo";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiGetGameCommInfo", "invoke");
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.GameJsApiGetGameCommInfo", "data is null");
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("getGameCommInfo:fail_invalid_data", null));
      return;
    }
    GetGameCommInfoTask localGetGameCommInfoTask = new GetGameCommInfoTask();
    localGetGameCommInfoTask.nc = paramJSONObject.optInt("cmd", 0);
    localGetGameCommInfoTask.bPE = paramJSONObject.optString("param");
    GameWebViewMainProcessService.b(localGetGameCommInfoTask);
    paramJSONObject = new HashMap();
    paramJSONObject.put("gameRegionName", localGetGameCommInfoTask.result);
    paramd.E(paramInt, f("getGameCommInfo:ok", paramJSONObject));
  }
  
  private static class GetGameCommInfoTask
    extends GWMainProcessTask
  {
    public static final Parcelable.Creator<GetGameCommInfoTask> CREATOR = new GameJsApiGetGameCommInfo.GetGameCommInfoTask.1();
    public String bPE;
    public int nc;
    public String result;
    
    public GetGameCommInfoTask() {}
    
    private GetGameCommInfoTask(Parcel paramParcel)
    {
      g(paramParcel);
    }
    
    public final void aai()
    {
      gl localgl = new gl();
      localgl.bPC.nc = this.nc;
      localgl.bPC.bPE = this.bPE;
      localgl.bPC.context = ad.getContext();
      com.tencent.mm.sdk.b.a.sFg.m(localgl);
      this.result = localgl.bPD.result;
    }
    
    public final void g(Parcel paramParcel)
    {
      this.nc = paramParcel.readInt();
      this.bPE = paramParcel.readString();
      this.result = paramParcel.readString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.nc);
      paramParcel.writeString(this.bPE);
      paramParcel.writeString(this.result);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/GameJsApiGetGameCommInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */