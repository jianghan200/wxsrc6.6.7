package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 104;
  public static final String NAME = "chooseImage";
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiChooseImage", "invoke");
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    if (paramJSONObject == null)
    {
      x.i("MicroMsg.GameJsApiChooseImage", "data is null");
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("chooseImage:fail_invalid_data", null));
      return;
    }
    Object localObject1 = paramJSONObject.optJSONArray("sourceType");
    int j = 0;
    int i = 0;
    if (localObject1 != null)
    {
      x.i("MicroMsg.GameJsApiChooseImage", "sourceType = " + ((JSONArray)localObject1).toString());
      k = 0;
      j = i;
      if (k < ((JSONArray)localObject1).length())
      {
        if (((JSONArray)localObject1).optString(k).equals("album")) {
          j = i | 0x1;
        }
        for (;;)
        {
          k += 1;
          i = j;
          break;
          j = i;
          if (((JSONArray)localObject1).optString(k).equals("camera")) {
            j = i | 0x2;
          }
        }
      }
    }
    i = j;
    j = i;
    if (i == 0) {
      j = 3;
    }
    x.i("MicroMsg.GameJsApiChooseImage", "real scene = %d", new Object[] { Integer.valueOf(j) });
    if ((j == 2) || (j == 3))
    {
      boolean bool = com.tencent.mm.pluginsdk.permission.a.a(localGameWebViewUI, "android.permission.CAMERA", 113, "", "");
      x.d("MicroMsg.GameJsApiChooseImage", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("chooseImage:fail_android_permission_denied", null));
        return;
      }
    }
    int k = paramJSONObject.optInt("count", 0);
    Boolean localBoolean = Boolean.valueOf(false);
    localObject1 = Boolean.valueOf(false);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("sizeType");
    Object localObject2 = localObject1;
    Object localObject3 = localBoolean;
    if (localJSONArray != null)
    {
      i = 0;
      paramJSONObject = localBoolean;
      localObject2 = localObject1;
      localObject3 = paramJSONObject;
      if (i < localJSONArray.length())
      {
        if (localJSONArray.optString(i).equals("original")) {
          localObject2 = Boolean.valueOf(true);
        }
        for (;;)
        {
          i += 1;
          paramJSONObject = (JSONObject)localObject2;
          break;
          localObject2 = paramJSONObject;
          if (localJSONArray.optString(i).equals("compressed"))
          {
            localObject1 = Boolean.valueOf(true);
            localObject2 = paramJSONObject;
          }
        }
      }
    }
    if ((((Boolean)localObject3).booleanValue()) && (!((Boolean)localObject2).booleanValue()))
    {
      i = 7;
      paramJSONObject = Boolean.valueOf(true);
    }
    for (;;)
    {
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("key_pick_local_pic_capture", j);
      ((Intent)localObject1).putExtra("key_pick_local_pic_count", k);
      ((Intent)localObject1).putExtra("key_pick_local_pic_query_source_type", i);
      ((Intent)localObject1).putExtra("key_pick_local_pic_send_raw", paramJSONObject);
      ((Intent)localObject1).putExtra("query_media_type", 1);
      x.i("MicroMsg.GameJsApiChooseImage", "doChooseImage: realScene: %d, count: %d, querySourceType: %d, sendRaw: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), paramJSONObject });
      localGameWebViewUI.geJ = new h.1(this, paramd, paramInt, localGameWebViewUI);
      com.tencent.mm.bg.d.a(localGameWebViewUI, "webview", ".ui.tools.OpenFileChooserUI", (Intent)localObject1, 14, false);
      return;
      if ((!((Boolean)localObject3).booleanValue()) && (((Boolean)localObject2).booleanValue()))
      {
        i = 7;
        paramJSONObject = Boolean.valueOf(false);
      }
      else
      {
        i = 8;
        paramJSONObject = Boolean.valueOf(false);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */