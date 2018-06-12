package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.location_soso.ViewManager;
import com.tencent.mm.plugin.map.a.d;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.x;

public class TrackPoint
  extends LinearLayout
{
  private boolean YN = true;
  private double fTP = -1.0D;
  private double fTQ = -1.0D;
  private double fTR = -1.0D;
  private double fTS = -1.0D;
  public FrameLayout kKl;
  public ImageView kKm;
  private double kKn = 0.0D;
  private Context mContext;
  public ViewManager mViewManager;
  private String username;
  
  public TrackPoint(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init(0);
  }
  
  public TrackPoint(Context paramContext, ViewManager paramViewManager)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.mViewManager = paramViewManager;
    init(0);
  }
  
  public TrackPoint(Context paramContext, ViewManager paramViewManager, int paramInt)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.mViewManager = paramViewManager;
    init(paramInt);
  }
  
  private void init(int paramInt)
  {
    this.kKl = ((FrameLayout)View.inflate(this.mContext, a.f.track_point_avatar, null));
    this.kKm = new ImageView(this.mContext);
    if (paramInt > 0) {
      this.kKm.setImageResource(paramInt);
    }
    for (;;)
    {
      this.kKm.setBackgroundResource(a.d.mm_trans);
      this.kKm.setFocusable(true);
      this.kKm.setFocusableInTouchMode(true);
      return;
      this.kKm.setImageResource(a.d.location_track_point_icon_navigate);
    }
  }
  
  public final void ban()
  {
    this.YN = false;
    this.kKl.setVisibility(4);
    if (this.mViewManager != null) {
      this.mViewManager.toggleViewVisible(this.kKl);
    }
  }
  
  public final void bao()
  {
    this.YN = true;
    this.kKl.setVisibility(0);
    if (this.mViewManager != null) {
      this.mViewManager.toggleViewVisible(this.kKl);
    }
  }
  
  public double getHeading()
  {
    return this.kKn;
  }
  
  public double getLatOffest()
  {
    return this.fTP - this.fTR;
  }
  
  public double getLongOffset()
  {
    return this.fTQ - this.fTS;
  }
  
  public final void n(double paramDouble1, double paramDouble2)
  {
    if (this.mViewManager != null)
    {
      this.mViewManager.updateViewLayout(this.kKl, paramDouble1, paramDouble2, false);
      this.mViewManager.updateLocaitonPinLayout(this.kKm, paramDouble1, paramDouble2, false);
    }
  }
  
  public final void o(double paramDouble1, double paramDouble2)
  {
    if (this.mViewManager != null)
    {
      this.mViewManager.addView(this.kKl, paramDouble1, paramDouble2);
      this.mViewManager.addView(this.kKm, paramDouble1, paramDouble2);
    }
  }
  
  public final void set2Top()
  {
    if (this.mViewManager != null)
    {
      this.mViewManager.setMarker2Top(this.kKl);
      this.mViewManager.setMarker2Top(this.kKm);
    }
  }
  
  public void setAvatar(String paramString)
  {
    if (paramString.equals(this.username)) {
      x.i("MicroMsg.TrackPoint", "skip this set avatar");
    }
    do
    {
      return;
      this.username = paramString;
      a.b.n((ImageView)this.kKl.findViewById(a.e.anim_avatar), paramString);
    } while (this.mViewManager == null);
    this.mViewManager.updateMarkerView(this.kKl);
  }
  
  public void setHeading(double paramDouble)
  {
    this.kKn = paramDouble;
  }
  
  public void setOnAvatarOnClickListener(View.OnClickListener paramOnClickListener) {}
  
  public void setOnLocationOnClickListener(View.OnClickListener paramOnClickListener) {}
  
  public final void v(double paramDouble)
  {
    this.kKn = paramDouble;
    if (this.mViewManager != null) {
      this.mViewManager.updateRotation(this.kKm, (float)paramDouble);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/location/ui/impl/TrackPoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */