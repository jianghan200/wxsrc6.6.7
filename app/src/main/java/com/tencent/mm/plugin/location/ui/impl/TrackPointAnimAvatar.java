package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bi;

public class TrackPointAnimAvatar
  extends RelativeLayout
{
  private ImageView eKk;
  private LinearLayout kKo;
  private Animation kKp;
  private Animation kKq;
  private Context mContext;
  private String username;
  
  public TrackPointAnimAvatar(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    init();
  }
  
  public TrackPointAnimAvatar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init();
  }
  
  private void init()
  {
    View localView = View.inflate(this.mContext, a.f.track_point_avatar, this);
    this.kKo = ((LinearLayout)localView.findViewById(a.e.anim_avatar_layout));
    this.eKk = ((ImageView)localView.findViewById(a.e.anim_avatar));
    this.kKp = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, -0.5F);
    this.kKp.setDuration(500L);
    this.kKp.setFillAfter(true);
    this.kKq = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, -0.5F, 1, 0.0F);
    this.kKq.setDuration(500L);
    this.kKq.setFillAfter(true);
    this.kKp.setAnimationListener(new TrackPointAnimAvatar.1(this));
    this.kKq.setAnimationListener(new TrackPointAnimAvatar.2(this));
  }
  
  public void setUser(String paramString)
  {
    if (!bi.oW(paramString))
    {
      this.username = paramString;
      if (this.eKk != null) {
        a.b.n(this.eKk, this.username);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/location/ui/impl/TrackPointAnimAvatar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */