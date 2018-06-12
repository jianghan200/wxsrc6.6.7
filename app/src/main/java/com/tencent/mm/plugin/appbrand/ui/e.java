package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.ui.statusbar.b;

public final class e
  extends b
  implements l
{
  private final g fdO;
  private final Bitmap gvu;
  
  public e(Context paramContext, g paramg, Bitmap paramBitmap)
  {
    super(paramContext);
    this.gvu = paramBitmap;
    this.fdO = paramg;
    setupFullscreen(this.fdO.aaq());
    dl(true);
    setBackground(new BitmapDrawable(getResources(), paramBitmap));
    paramContext = LayoutInflater.from(paramContext).inflate(s.h.app_brand_show_toast, this, false);
    addView(paramContext, new FrameLayout.LayoutParams(-2, -2, 17));
    ((TextView)paramContext.findViewById(s.g.title)).setText(s.j.app_brand_jsapi_update_app_updating);
    paramContext.findViewById(s.g.iv_icon).setVisibility(8);
  }
  
  private void setupFullscreen(boolean paramBoolean)
  {
    Object localObject = j.cJ(getContext());
    if (localObject == null) {}
    do
    {
      return;
      localObject = ((Activity)localObject).getWindow();
    } while (localObject == null);
    j.c((Window)localObject, paramBoolean);
  }
  
  public final void a(a.d paramd) {}
  
  public final void anm()
  {
    post(new e.1(this));
  }
  
  public final void ann() {}
  
  public final void bL(String paramString1, String paramString2) {}
  
  public final View getView()
  {
    return this;
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.gvu.recycle();
  }
  
  public final void setProgress(int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */