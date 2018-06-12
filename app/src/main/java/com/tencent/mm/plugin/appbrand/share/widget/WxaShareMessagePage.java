package com.tencent.mm.plugin.appbrand.share.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.modelappbrand.b.b;
import com.tencent.mm.modelappbrand.b.b.f;
import com.tencent.mm.modelappbrand.b.b.h;
import com.tencent.mm.plugin.appbrand.compat.a.a;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.plugin.appbrand.q.k;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

public class WxaShareMessagePage
  extends LinearLayout
  implements b.h
{
  ImageView gav;
  TextView gsY;
  ImageView gsZ;
  IPCDynamicPageView gta;
  ThreeDotsLoadingView gtb;
  
  public WxaShareMessagePage(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public WxaShareMessagePage(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public WxaShareMessagePage(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    View localView = View.inflate(paramContext, s.h.wxa_share_message_page, this);
    this.gav = ((ImageView)localView.findViewById(s.g.cover_iv));
    this.gsZ = ((ImageView)localView.findViewById(s.g.error_icon_iv));
    this.gta = ((IPCDynamicPageView)localView.findViewById(s.g.widget_pv));
    this.gsY = ((TextView)localView.findViewById(s.g.title_tv));
    this.gtb = ((ThreeDotsLoadingView)localView.findViewById(s.g.loading_view));
    paramContext = ((a)com.tencent.mm.kernel.g.l(a.class)).c(paramContext, (ViewGroup)localView);
    ((ViewGroup)localView.findViewById(s.g.container)).addView(paramContext);
    setGravity(17);
  }
  
  public final void Kc() {}
  
  public final void Kd()
  {
    this.gtb.setVisibility(4);
    this.gtb.cAH();
    this.gav.setImageBitmap(null);
    this.gsZ.setVisibility(0);
  }
  
  public final String Ke()
  {
    return k.bq(this);
  }
  
  public ImageView getCoverImageView()
  {
    return this.gav;
  }
  
  public ImageView getErrorImageView()
  {
    return this.gsZ;
  }
  
  public ThreeDotsLoadingView getLoadingView()
  {
    return this.gtb;
  }
  
  public int getWidgetHeight()
  {
    return f.lP(180);
  }
  
  public IPCDynamicPageView getWidgetPageView()
  {
    return this.gta;
  }
  
  public int getWidgetWidth()
  {
    return f.lP(224);
  }
  
  public final void n(Bitmap paramBitmap)
  {
    this.gtb.setVisibility(4);
    this.gtb.cAH();
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.gav.setImageBitmap(paramBitmap);
      this.gsZ.setVisibility(4);
      return;
    }
    this.gav.setImageBitmap(null);
    this.gsZ.setVisibility(0);
  }
  
  public void setImageData(Bitmap paramBitmap)
  {
    this.gav.setVisibility(0);
    this.gtb.setVisibility(4);
    this.gsZ.setVisibility(4);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      b.f localf = ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.g.l(com.tencent.mm.modelappbrand.g.class)).JO();
      this.gav.setImageBitmap(localf.o(paramBitmap));
      return;
    }
    this.gav.setImageBitmap(null);
  }
  
  public void setImageUrl(String paramString)
  {
    this.gtb.setVisibility(0);
    this.gtb.cAG();
    this.gsZ.setVisibility(4);
    this.gav.setVisibility(0);
    b.Ka().a(this, paramString, null, ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.g.l(com.tencent.mm.modelappbrand.g.class)).bc(112, 90));
  }
  
  public void setTitle(String paramString)
  {
    this.gsY.setText(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/share/widget/WxaShareMessagePage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */