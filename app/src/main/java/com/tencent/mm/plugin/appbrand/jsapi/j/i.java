package com.tencent.mm.plugin.appbrand.jsapi.j;

import android.widget.NumberPicker;
import com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePicker;
import com.tencent.mm.plugin.appbrand.widget.picker.a;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import com.tencent.mm.ui.widget.picker.f;
import org.json.JSONObject;

final class i
  extends c
{
  int fXA = -1;
  int fXv = -1;
  int fXw = -1;
  int fXx = Integer.MAX_VALUE;
  int fXy = Integer.MAX_VALUE;
  int fXz = -1;
  
  final void u(JSONObject paramJSONObject)
  {
    Object localObject2 = paramJSONObject.optJSONObject("range");
    if (localObject2 != null)
    {
      Object localObject1 = ((JSONObject)localObject2).optString("start");
      localObject2 = ((JSONObject)localObject2).optString("end");
      localObject1 = f.abB((String)localObject1);
      if (localObject1 != null)
      {
        this.fXv = localObject1[0];
        this.fXw = localObject1[1];
      }
      localObject1 = f.abB((String)localObject2);
      if (localObject1 != null)
      {
        this.fXx = localObject1[0];
        this.fXy = localObject1[1];
      }
    }
    this.fXv = Math.max(this.fXv, 0);
    this.fXw = Math.max(this.fXw, 0);
    this.fXx = Math.min(this.fXx, 23);
    this.fXy = Math.min(this.fXy, 59);
    paramJSONObject = f.abB(paramJSONObject.optString("current"));
    if (paramJSONObject != null)
    {
      this.fXz = paramJSONObject[0];
      this.fXA = paramJSONObject[1];
    }
    com.tencent.mm.plugin.appbrand.r.c.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        i locali = i.this;
        AppBrandTimePicker localAppBrandTimePicker = (AppBrandTimePicker)locali.C(AppBrandTimePicker.class);
        if (localAppBrandTimePicker == null)
        {
          locali.h("fail cant init view", null);
          return;
        }
        a locala = locali.gMI;
        int i = locali.fXv;
        int j = locali.fXw;
        localAppBrandTimePicker.fXv = i;
        localAppBrandTimePicker.fXw = j;
        if ((f.GF(localAppBrandTimePicker.fXv)) && (localAppBrandTimePicker.gNn != null)) {
          localAppBrandTimePicker.gNn.setMinValue(localAppBrandTimePicker.fXv);
        }
        i = locali.fXx;
        j = locali.fXy;
        localAppBrandTimePicker.fXx = i;
        localAppBrandTimePicker.fXy = j;
        if ((f.GF(localAppBrandTimePicker.fXx)) && (localAppBrandTimePicker.gNn != null)) {
          localAppBrandTimePicker.gNn.setMaxValue(localAppBrandTimePicker.fXx);
        }
        i = locali.fXz;
        j = locali.fXA;
        if ((f.GF(i)) && (f.GE(j)))
        {
          localAppBrandTimePicker.setCurrentHour(Integer.valueOf(i));
          localAppBrandTimePicker.setCurrentMinute(Integer.valueOf(j));
        }
        localAppBrandTimePicker.aqt();
        locala.setOnResultListener(new i.2(locali));
        locala.show();
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/j/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */