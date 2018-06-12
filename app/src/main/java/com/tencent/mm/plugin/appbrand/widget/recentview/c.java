package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.widget.k.d;
import java.util.List;

public class c
  extends BaseAppBrandRecentView
{
  private AppBrandRecentView.a gPu;
  private boolean gPv = false;
  
  public c(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void a(BaseAppBrandRecentView.b paramb, a parama)
  {
    super.a(paramb, parama);
    if (parama.type == 0)
    {
      paramb.eBO.setVisibility(4);
      paramb.gmn.setImageResource(k.d.multitask_bar_more_btn);
    }
  }
  
  protected final boolean aqB()
  {
    boolean bool = this.gPv;
    this.gPv = false;
    return bool;
  }
  
  public final void as(List<a> paramList)
  {
    paramList.add(new a());
  }
  
  protected int getLoadCount()
  {
    return 11;
  }
  
  protected String getType()
  {
    return c.class.getSimpleName();
  }
  
  protected final void init(Context paramContext)
  {
    super.init(paramContext);
    super.setOnItemClickListener(new c.1(this));
  }
  
  public void setOnItemClickListener(AppBrandRecentView.a parama)
  {
    this.gPu = parama;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/recentview/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */