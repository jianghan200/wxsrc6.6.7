package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.facedetect.ui.FaceTransparentStubUI;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONObject;

public abstract class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public final void a(final l paraml, JSONObject paramJSONObject, final int paramInt)
  {
    super.a(paraml, paramJSONObject, paramInt);
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      x.e("MicroMsg.JsApiFaceAsyncBase", "JsApiFaceAsyncBase context is null, appId is %s", new Object[] { paraml.mAppId });
      paraml.E(paramInt, f("fail", null));
      return;
    }
    Object localObject = paramJSONObject.optString("requestVerifyPreInfo");
    String str = paraml.mAppId;
    if (ain()) {}
    for (int i = 1001;; i = 1000)
    {
      paramJSONObject = new Bundle();
      paramJSONObject.putBoolean("k_need_signature", true);
      paramJSONObject.putInt("k_server_scene", 5);
      paramJSONObject.putBoolean("key_is_need_video", ain());
      paramJSONObject.putBoolean("is_check_dyncfg", false);
      paramJSONObject.putString("k_app_id", str);
      paramJSONObject.putString("request_verify_pre_info", (String)localObject);
      paramJSONObject.putInt("key_business_type", 4);
      paramJSONObject.putString("key_function_name", aio());
      localObject = new Intent(localMMActivity, FaceTransparentStubUI.class);
      ((Intent)localObject).putExtra("KEY_EXTRAS", paramJSONObject);
      ((Intent)localObject).putExtra("KEY_REQUEST_CODE", i);
      localMMActivity.geJ = new MMActivity.a()
      {
        public final void b(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          paramAnonymousInt2 = 90199;
          a locala = null;
          Object localObject2 = null;
          l locall = null;
          Object localObject3 = null;
          Object localObject4 = null;
          Object localObject1 = null;
          if (paramAnonymousIntent != null) {
            paramAnonymousInt2 = paramAnonymousIntent.getIntExtra("err_code", 90199);
          }
          if (paramAnonymousInt1 == 1000)
          {
            x.i("MicroMsg.JsApiFaceAsyncBase", "alvinluo: requestWxFacePictureVerify errCode: %d", new Object[] { Integer.valueOf(paramAnonymousInt2) });
            if (paramAnonymousInt2 == 0)
            {
              locala = a.this;
              localObject2 = paraml;
              paramAnonymousInt1 = paramInt;
              if (paramAnonymousIntent != null) {
                localObject1 = paramAnonymousIntent.getExtras();
              }
              a.a(locala, (l)localObject2, paramAnonymousInt1, (Bundle)localObject1, "ok");
            }
          }
          while (paramAnonymousInt1 != 1001)
          {
            return;
            if (paramAnonymousInt2 == 90100)
            {
              localObject2 = a.this;
              locall = paraml;
              paramAnonymousInt1 = paramInt;
              localObject1 = locala;
              if (paramAnonymousIntent != null) {
                localObject1 = paramAnonymousIntent.getExtras();
              }
              a.a((a)localObject2, locall, paramAnonymousInt1, (Bundle)localObject1, "cancel");
              return;
            }
            locala = a.this;
            locall = paraml;
            paramAnonymousInt1 = paramInt;
            localObject1 = localObject2;
            if (paramAnonymousIntent != null) {
              localObject1 = paramAnonymousIntent.getExtras();
            }
            a.a(locala, locall, paramAnonymousInt1, (Bundle)localObject1, "fail");
            return;
          }
          x.i("MicroMsg.JsApiFaceAsyncBase", "hy: REQUEST_FACE_DETECT_WITH_VIDEO errCode: %d", new Object[] { Integer.valueOf(paramAnonymousInt2) });
          if (paramAnonymousInt2 == 0)
          {
            locala = a.this;
            localObject2 = paraml;
            paramAnonymousInt1 = paramInt;
            localObject1 = locall;
            if (paramAnonymousIntent != null) {
              localObject1 = paramAnonymousIntent.getExtras();
            }
            a.a(locala, (l)localObject2, paramAnonymousInt1, (Bundle)localObject1, "ok");
            return;
          }
          if (paramAnonymousInt2 == 90100)
          {
            locala = a.this;
            localObject2 = paraml;
            paramAnonymousInt1 = paramInt;
            localObject1 = localObject3;
            if (paramAnonymousIntent != null) {
              localObject1 = paramAnonymousIntent.getExtras();
            }
            a.a(locala, (l)localObject2, paramAnonymousInt1, (Bundle)localObject1, "cancel");
            return;
          }
          locala = a.this;
          localObject2 = paraml;
          paramAnonymousInt1 = paramInt;
          localObject1 = localObject4;
          if (paramAnonymousIntent != null) {
            localObject1 = paramAnonymousIntent.getExtras();
          }
          a.a(locala, (l)localObject2, paramAnonymousInt1, (Bundle)localObject1, "fail");
        }
      };
      localMMActivity.startActivityForResult((Intent)localObject, i);
      return;
    }
  }
  
  protected abstract boolean ain();
  
  protected abstract String aio();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bio/face/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */