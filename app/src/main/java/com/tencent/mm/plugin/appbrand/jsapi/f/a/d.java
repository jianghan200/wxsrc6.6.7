package com.tencent.mm.plugin.appbrand.jsapi.f.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;

public final class d
  extends LinearLayout
{
  private Context context;
  private ImageView fTO;
  double fTP = -1.0D;
  double fTQ = -1.0D;
  double fTR = -1.0D;
  double fTS = -1.0D;
  float fTT = 900.0F;
  float fTU = 900.0F;
  float fTV = 0.0F;
  boolean fTW;
  b.h fTv;
  
  public d(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    this.fTO = ((ImageView)View.inflate(this.context, s.h.app_brand_map_location_point, this).findViewById(s.g.tp_location_point));
    this.fTO.requestFocus();
  }
  
  final float getHeading()
  {
    if (this.fTW) {
      return this.fTT;
    }
    return this.fTV;
  }
  
  public final double getLatitude()
  {
    return this.fTP;
  }
  
  public final double getLongitude()
  {
    return this.fTQ;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */