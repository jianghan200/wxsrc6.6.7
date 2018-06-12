package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class LoadingMoreView
  extends LinearLayout
{
  private ImageView bRk;
  private Context context;
  protected LinearLayout hzN;
  
  public LoadingMoreView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    paramContext = LayoutInflater.from(this.context).inflate(R.i.life_loading_more, this, true);
    this.bRk = ((ImageView)findViewById(R.h.life_next_progress));
    this.hzN = ((LinearLayout)paramContext.findViewById(R.h.loading_more_state));
    this.hzN.setVisibility(0);
    paramContext = new RotateAnimation(0.0F, 359.0F, 1, 0.5F, 1, 0.5F);
    paramContext.setDuration(1000L);
    paramContext.setRepeatCount(-1);
    paramContext.setInterpolator(new LinearInterpolator());
    this.bRk.startAnimation(paramContext);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/nearlife/ui/LoadingMoreView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */