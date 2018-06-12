package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.widget.k.d;
import com.tencent.mm.plugin.appbrand.widget.k.e;

public class MenuAppBrandRecentView
  extends BaseAppBrandRecentView
{
  private AppBrandRecentView.a gPu;
  
  public MenuAppBrandRecentView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MenuAppBrandRecentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected final void a(BaseAppBrandRecentView.b paramb, a parama)
  {
    super.a(paramb, parama);
    paramb.eBO.setTextColor(-1728053248);
    if (parama.type == 2)
    {
      paramb.eBO.setVisibility(0);
      paramb.gPp.setVisibility(8);
      paramb.eBO.setText(k.e.multitask_bar_back_wechat);
      paramb.gmn.setImageResource(k.d.app_brand_capsule_multitasking_wechat);
    }
    while (parama.type != -1) {
      return;
    }
    paramb.gmn.setImageResource(k.d.default_avatar);
  }
  
  protected int getLoadCount()
  {
    return 11;
  }
  
  protected String getType()
  {
    return MenuAppBrandRecentView.class.getSimpleName();
  }
  
  protected final void init(Context paramContext)
  {
    super.init(paramContext);
    super.setOnItemClickListener(new MenuAppBrandRecentView.1(this));
  }
  
  public void setOnItemClickListener(AppBrandRecentView.a parama)
  {
    this.gPu = parama;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/recentview/MenuAppBrandRecentView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */