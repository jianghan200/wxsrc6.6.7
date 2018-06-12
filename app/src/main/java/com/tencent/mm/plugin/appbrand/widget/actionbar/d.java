package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.appbrand.s.e;

public final class d
  extends PopupWindow
{
  private WindowManager gFC;
  private View gFD;
  public FrameLayout gFE;
  private Context mContext = null;
  
  public d(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.gFC = ((WindowManager)paramContext.getSystemService("window"));
    this.gFE = new FrameLayout(this.mContext);
  }
  
  public final void dismiss()
  {
    if (this.gFD != null)
    {
      this.gFC.removeViewImmediate(this.gFD);
      this.gFD = null;
    }
    super.dismiss();
  }
  
  public final void setContentView(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    localLayoutParams.gravity = 17;
    localLayoutParams.topMargin = a.ae(this.mContext, s.e.app_brand_app_brand_popwindow_with_mask_topmargin);
    localLayoutParams.rightMargin = a.ae(this.mContext, s.e.app_brand_app_brand_popwindow_with_mask_margin);
    localLayoutParams.leftMargin = a.ae(this.mContext, s.e.app_brand_app_brand_popwindow_with_mask_margin);
    this.gFE.addView(paramView, localLayoutParams);
    super.setContentView(this.gFE);
  }
  
  public final void showAsDropDown(View paramView)
  {
    IBinder localIBinder = paramView.getWindowToken();
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    localLayoutParams.width = -1;
    localLayoutParams.height = -1;
    localLayoutParams.format = -3;
    localLayoutParams.type = 1000;
    localLayoutParams.token = localIBinder;
    this.gFD = new View(this.mContext);
    this.gFD.setBackgroundColor(2130706432);
    this.gFD.setFitsSystemWindows(false);
    this.gFD.setOnTouchListener(new d.1(this));
    this.gFD.setOnKeyListener(new d.2(this));
    this.gFC.addView(this.gFD, localLayoutParams);
    super.showAsDropDown(paramView);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/actionbar/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */