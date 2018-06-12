package com.tencent.mm.plugin.appbrand.page;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.bw.a.c;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.menu.k;
import com.tencent.mm.ui.an;
import java.util.List;

public final class m
{
  p fFv;
  com.tencent.mm.ui.widget.a.d gmE;
  List<k> gmF;
  String mAppId;
  
  public m(Context paramContext, String paramString, p paramp, List<k> paramList)
  {
    this.mAppId = paramString;
    this.fFv = paramp;
    this.gmF = paramList;
    this.gmE = new com.tencent.mm.ui.widget.a.d(paramContext);
    paramString = this.fFv.ahb();
    if (paramString != null) {
      this.gmE.dS(paramString);
    }
    this.gmE.ofp = new m.1(this);
    this.gmE.ofq = new m.2(this);
    if (this.fFv.gnz)
    {
      paramString = this.gmE;
      int i = Color.parseColor("#000000");
      if (paramString.ilW != null) {
        paramString.ilW.setBackgroundColor(i);
      }
      paramString.uJU = Boolean.valueOf(an.Ec(i));
      if ((paramString.uJU.booleanValue()) && (paramString.uKc != null)) {
        paramString.uKc.setImageDrawable(paramString.mContext.getResources().getDrawable(a.c.dark_bg_line_color));
      }
    }
    boolean bool1;
    if (this.fFv.fdO.aaq())
    {
      paramString = this.gmE;
      if ((this.fFv.isFullScreen()) || (((com.tencent.mm.plugin.appbrand.game.page.d)this.fFv).ahf()))
      {
        bool1 = true;
        paramString.qgK = bool1;
        paramString = this.gmE;
        if (!this.fFv.isFullScreen())
        {
          bool1 = bool2;
          if (!((com.tencent.mm.plugin.appbrand.game.page.d)this.fFv).ahf()) {}
        }
        else
        {
          bool1 = true;
        }
        paramString.qgL = bool1;
      }
    }
    for (;;)
    {
      this.gmE.bXO();
      if ((paramContext instanceof Activity)) {
        ((Activity)paramContext).getApplication().registerActivityLifecycleCallbacks(new m.3(this, paramContext));
      }
      return;
      bool1 = false;
      break;
      this.gmE.qgK = this.fFv.isFullScreen();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */