package com.tencent.mm.plugin.appbrand.ui.banner;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.i;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.b.b.h;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;

public final class d
  extends com.tencent.mm.pluginsdk.ui.b.b
  implements View.OnClickListener, f
{
  private static boolean gxY = false;
  private View gxS;
  private TextView gxT;
  private ImageView gxU;
  private String gxV;
  private final Runnable gxW;
  private final b.h gxX;
  
  public static void anS()
  {
    gxY = false;
  }
  
  public final void an(String paramString, int paramInt)
  {
    ah.A(this.gxW);
  }
  
  public final boolean anR()
  {
    if (!gxY)
    {
      ((e)g.l(e.class)).b(this);
      ((e)g.l(e.class)).anO();
      ((e)g.l(e.class)).a(this);
      gxY = true;
    }
    Object localObject2 = BannerModel.anZ();
    if ((localObject2 != null) && (!bi.oW(((BannerModel)localObject2).appId)))
    {
      Object localObject1 = ((BannerModel)localObject2).appName;
      String str = ((BannerModel)localObject2).gyo;
      localObject2 = ((BannerModel)localObject2).fmD;
      if (bi.oW(str)) {}
      while (bi.oW((String)localObject1))
      {
        return false;
        localObject1 = str;
      }
      setVisibility(0);
      if (this.gxT != null) {
        this.gxT.setText((CharSequence)localObject1);
      }
      if (!bi.oW((String)localObject2))
      {
        localObject1 = null;
        if (!bi.oW(this.gxV)) {
          localObject1 = com.tencent.mm.modelappbrand.b.b.Ka().jv(this.gxV);
        }
        if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
          break label178;
        }
        this.gxX.n((Bitmap)localObject1);
      }
      for (;;)
      {
        return true;
        label178:
        this.gxV = com.tencent.mm.modelappbrand.b.b.Ka().a(this.gxX, (String)localObject2, com.tencent.mm.modelappbrand.b.f.dGr);
      }
    }
    setVisibility(8);
    return false;
  }
  
  public final void destroy()
  {
    if (this.gxS != null)
    {
      ((ViewGroup)this.gxS).removeAllViews();
      this.gxS.setVisibility(8);
    }
    this.gxS = null;
    this.gxT = null;
    this.gxU = null;
    ((e)g.l(e.class)).b(this);
  }
  
  public final int getLayoutId()
  {
    return R.i.chatting_app_brand_entrance_banner;
  }
  
  public final void onClick(View paramView)
  {
    Object localObject = BannerModel.anZ();
    if (localObject == null) {
      return;
    }
    String str = ((BannerModel)localObject).appId;
    int i = ((BannerModel)localObject).fmv;
    if (bi.oW(str))
    {
      anR();
      return;
    }
    localObject = new AppBrandStatObject();
    ((AppBrandStatObject)localObject).scene = 1022;
    ((com.tencent.mm.plugin.appbrand.n.d)g.l(com.tencent.mm.plugin.appbrand.n.d.class)).a(paramView.getContext(), null, str, i, -1, null, (AppBrandStatObject)localObject);
  }
  
  public final void setVisibility(int paramInt)
  {
    if (this.gxS != null) {
      this.gxS.setVisibility(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/banner/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */