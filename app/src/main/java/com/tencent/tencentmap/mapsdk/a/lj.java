package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ZoomControls;
import com.tencent.map.lib.d;
import com.tencent.map.lib.f;

public class lj
  implements ld
{
  private Context a;
  private ZoomControls b;
  private lk c = null;
  private ViewGroup d;
  private ld.b e = ld.b.c;
  private ni.a f = null;
  private ks g;
  private int h = 0;
  
  public lj(Context paramContext, ks paramks)
  {
    this.a = paramContext;
    this.g = paramks;
    a(paramContext);
    c();
  }
  
  private void a(Context paramContext)
  {
    this.c = new lk(paramContext);
    this.c.setVisibility(8);
    b();
    try
    {
      this.b = new ZoomControls(paramContext);
      int i = View.MeasureSpec.makeMeasureSpec(0, 0);
      int j = View.MeasureSpec.makeMeasureSpec(0, 0);
      this.b.measure(i, j);
      this.h = this.b.getMeasuredHeight();
      this.b.setVisibility(8);
      return;
    }
    catch (Exception paramContext) {}
  }
  
  private void b()
  {
    Bitmap localBitmap1 = kh.b(kh.b(this.a, "location_enable.png"));
    Bitmap localBitmap2 = kh.b(kh.b(this.a, "location_state_normal.png"));
    Bitmap localBitmap3 = kh.b(kh.b(this.a, "location_state_selected.png"));
    this.c.setScaleType(ImageView.ScaleType.CENTER);
    this.c.setImageBitmap(localBitmap1);
    this.c.a(this.a, localBitmap2, localBitmap3);
  }
  
  private void c()
  {
    if (this.b != null)
    {
      this.b.setOnZoomInClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          lj.a(lj.this).getMap().a(null);
        }
      });
      this.b.setOnZoomOutClickListener(new lj.2(this));
    }
    this.c.setOnClickListener(new lj.3(this));
  }
  
  private FrameLayout.LayoutParams d()
  {
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    switch (lj.4.a[this.e.ordinal()])
    {
    default: 
      d.b("Unknown position:" + this.e);
      return localLayoutParams;
    case 1: 
      localLayoutParams.gravity = 83;
      localLayoutParams.bottomMargin = 5;
      localLayoutParams.leftMargin = 5;
      return localLayoutParams;
    case 2: 
      localLayoutParams.gravity = 81;
      localLayoutParams.bottomMargin = 5;
      return localLayoutParams;
    case 3: 
      localLayoutParams.gravity = 85;
      localLayoutParams.bottomMargin = 5;
      localLayoutParams.rightMargin = 5;
      return localLayoutParams;
    case 4: 
      localLayoutParams.gravity = 51;
      localLayoutParams.topMargin = 5;
      localLayoutParams.leftMargin = 5;
      return localLayoutParams;
    case 5: 
      localLayoutParams.gravity = 49;
      localLayoutParams.topMargin = 5;
      return localLayoutParams;
    }
    localLayoutParams.gravity = 53;
    localLayoutParams.topMargin = 5;
    localLayoutParams.rightMargin = 5;
    return localLayoutParams;
  }
  
  public void a()
  {
    if (this.c != null) {
      this.c.a();
    }
  }
  
  public void a(int paramInt1, int paramInt2) {}
  
  public void a(ni.a parama)
  {
    this.f = parama;
  }
  
  public void a(boolean paramBoolean)
  {
    ZoomControls localZoomControls;
    if (this.b != null)
    {
      localZoomControls = this.b;
      if (!paramBoolean) {
        break label24;
      }
    }
    label24:
    for (int i = 0;; i = 4)
    {
      localZoomControls.setVisibility(i);
      return;
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.b != null)
    {
      this.b.setIsZoomInEnabled(paramBoolean1);
      this.b.setIsZoomOutEnabled(paramBoolean2);
    }
  }
  
  public boolean a(ViewGroup paramViewGroup)
  {
    if ((paramViewGroup == null) || (this.b == null) || (this.c == null)) {
      return false;
    }
    this.d = paramViewGroup;
    FrameLayout.LayoutParams localLayoutParams = d();
    if (paramViewGroup.indexOfChild(this.b) < 0)
    {
      paramViewGroup.addView(this.b, localLayoutParams);
      localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
      localLayoutParams.gravity = 85;
      localLayoutParams.bottomMargin = (this.h + 5);
      localLayoutParams.rightMargin = 5;
      if (paramViewGroup.indexOfChild(this.c) >= 0) {
        break label117;
      }
      paramViewGroup.addView(this.c, localLayoutParams);
    }
    for (;;)
    {
      return true;
      paramViewGroup.updateViewLayout(this.b, localLayoutParams);
      break;
      label117:
      paramViewGroup.updateViewLayout(this.c, localLayoutParams);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/lj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */