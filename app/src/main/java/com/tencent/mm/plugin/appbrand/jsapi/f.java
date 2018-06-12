package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONObject;

public abstract class f
  extends g
  implements MMActivity.a
{
  protected MMActivity fEY;
  private int fEZ;
  
  public f(e parame, l paraml, p paramp, JSONObject paramJSONObject, int paramInt)
  {
    super(parame, paraml, paramp, paramJSONObject, paramInt);
    paraml = paraml.fdO.fcz;
    if (paraml == null) {
      paraml = null;
    }
    for (;;)
    {
      this.fEY = paraml;
      if (this.fEY != null) {
        break;
      }
      throw new IllegalArgumentException("JsApiActivityResultRequest. Activity is null");
      paraml = paraml.getContext();
      if (!(paraml instanceof MMActivity)) {
        paraml = null;
      } else {
        paraml = (MMActivity)paraml;
      }
    }
    this.fEZ = (parame.hashCode() & 0xFFFF);
  }
  
  public abstract boolean a(MMActivity paramMMActivity, JSONObject paramJSONObject, int paramInt);
  
  public final void b(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.fEZ != paramInt1) {
      return;
    }
    if (paramInt2 == -1)
    {
      u(paramIntent);
      return;
    }
    if ((paramIntent != null) && (paramIntent.hasExtra("result_error_msg")))
    {
      onError(paramIntent.getIntExtra("result_error_code", -1), paramIntent.getStringExtra("result_error_msg"));
      return;
    }
    onError(-1, "fail:system error {{unknow error}}");
  }
  
  public abstract void onError(int paramInt, String paramString);
  
  public final void run()
  {
    this.fEY.geJ = this;
    if (!a(this.fEY, ahL(), this.fEZ)) {
      onError(-1, "fail:system error {{launch fail}}");
    }
  }
  
  public abstract void u(Intent paramIntent);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */