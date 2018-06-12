package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

final class b
{
  View SU;
  ThreeDotsLoadingView gzp;
  View gzq;
  View gzr;
  
  b(Context paramContext, ViewGroup paramViewGroup)
  {
    this.SU = LayoutInflater.from(paramContext).inflate(s.h.app_brand_recents_list_footer, paramViewGroup, false);
    this.gzp = ((ThreeDotsLoadingView)this.SU.findViewById(s.g.loading_view));
    this.gzq = this.SU.findViewById(s.g.footer_top_divider);
    this.gzr = this.SU.findViewById(s.g.end_tip);
  }
  
  final void setLoading(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.gzp != null)
      {
        this.gzp.setVisibility(0);
        this.gzp.cAG();
      }
      if (this.gzr != null) {
        this.gzr.setVisibility(8);
      }
    }
    do
    {
      return;
      if (this.gzp != null)
      {
        this.gzp.cAH();
        this.gzp.setVisibility(8);
      }
    } while (this.gzr == null);
    this.gzr.setVisibility(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */