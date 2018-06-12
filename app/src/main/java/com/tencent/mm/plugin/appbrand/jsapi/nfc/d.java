package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.content.Intent;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.nfc.HCEService;
import com.tencent.mm.plugin.nfc.b.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends JsApiAppBrandNFCBase
{
  public static final int CTRL_INDEX = 352;
  public static final String NAME = "startHCE";
  Timer bno;
  private int fFw = -1;
  private int fWA;
  boolean fWB = false;
  private JSONObject fWz;
  MMActivity fcq = null;
  l fcy = null;
  final Object mLock = new Object();
  long mStartTime = -1L;
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.JsApiNFCStartHCE", "alvinluo appbrand start HCE, data: %s", new Object[] { paramJSONObject.toString() });
    this.fcy = paraml;
    this.fFw = paramInt;
    this.fWz = paramJSONObject;
    this.fWB = false;
    this.fWA = this.fWz.optInt("time_limit", 1500);
    a(new d.1(this));
  }
  
  final void onSuccess()
  {
    int i = 0;
    Object localObject = new HashMap();
    ArrayList localArrayList = new ArrayList();
    try
    {
      JSONArray localJSONArray = this.fWz.getJSONArray("aid_list");
      int j = localJSONArray.length();
      x.i("MicroMsg.JsApiNFCStartHCE", "alvinluo mData: %s, aidList: %s, length: %d", new Object[] { this.fWz.toString(), localJSONArray.toString(), Integer.valueOf(j) });
      while (i < j)
      {
        localArrayList.add(localJSONArray.get(i).toString());
        i += 1;
      }
      HCEEventLogic.a.ajt();
    }
    catch (Exception localException)
    {
      ((Map)localObject).put("errCode", Integer.valueOf(13003));
      tp(f("fail: aid_list invalid", (Map)localObject));
      c.aa(this.fcy.mAppId, 13003, -1);
      return;
    }
    localObject = new Intent(this.fcq, HCEService.class);
    ((Intent)localObject).putExtra("key_appid", this.fcy.mAppId);
    ((Intent)localObject).putExtra("key_time_limit", this.fWA);
    ((Intent)localObject).putStringArrayListExtra("key_aid_list", localException);
    HCEEventLogic.a(new d.3(this));
    this.fcq.startService((Intent)localObject);
    this.mStartTime = System.currentTimeMillis();
    localObject = new d.4(this);
    this.bno = new Timer();
    this.bno.schedule((TimerTask)localObject, 10000L);
  }
  
  final void tp(String paramString)
  {
    x.i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE callback result: %s", new Object[] { paramString });
    if (this.fcy != null) {
      this.fcy.E(this.fFw, paramString);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/nfc/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */