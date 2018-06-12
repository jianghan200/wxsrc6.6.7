package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;

public class LoadingMoreView
  extends LinearLayout
{
  private ImageView bRk;
  private Context context;
  protected LinearLayout hzN;
  protected LinearLayout hzO;
  protected LinearLayout nOp;
  protected LinearLayout nOq;
  protected TextView nOr;
  
  public LoadingMoreView(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    init();
  }
  
  public LoadingMoreView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    init();
  }
  
  private void init()
  {
    Object localObject = LayoutInflater.from(this.context).inflate(i.g.sns_next_loading, this, true);
    this.bRk = ((ImageView)findViewById(i.f.album_next_progress));
    this.hzN = ((LinearLayout)((View)localObject).findViewById(i.f.loading_more_state));
    this.hzO = ((LinearLayout)((View)localObject).findViewById(i.f.loading_end));
    this.nOp = ((LinearLayout)((View)localObject).findViewById(i.f.strange_limit));
    this.nOq = ((LinearLayout)((View)localObject).findViewById(i.f.recent_limit));
    this.nOr = ((TextView)((View)localObject).findViewById(i.f.recent_limit_text));
    this.hzN.setVisibility(0);
    this.hzO.setVisibility(8);
    this.nOp.setVisibility(8);
    this.nOq.setVisibility(8);
    localObject = new RotateAnimation(0.0F, 359.0F, 1, 0.5F, 1, 0.5F);
    ((Animation)localObject).setDuration(1000L);
    ((Animation)localObject).setRepeatCount(-1);
    ((Animation)localObject).setInterpolator(new LinearInterpolator());
    this.bRk.startAnimation((Animation)localObject);
  }
  
  public final void im(boolean paramBoolean)
  {
    this.hzN.setVisibility(8);
    if (paramBoolean)
    {
      this.nOp.setVisibility(0);
      this.hzO.setVisibility(8);
    }
    for (;;)
    {
      this.nOq.setVisibility(8);
      return;
      this.hzO.setVisibility(0);
      this.nOp.setVisibility(8);
    }
  }
  
  public final void xk(int paramInt)
  {
    this.hzN.setVisibility(8);
    this.nOp.setVisibility(8);
    this.hzO.setVisibility(8);
    this.nOq.setVisibility(0);
    if (paramInt == 2001) {
      this.nOr.setText(getContext().getResources().getString(i.j.sns_recent_half_year_tip));
    }
    do
    {
      return;
      if (paramInt == 2003)
      {
        this.nOr.setText(getContext().getResources().getString(i.j.sns_close));
        return;
      }
    } while (paramInt != 2004);
    this.nOr.setText(getContext().getResources().getString(i.j.sns_recent_three_day_tip));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/LoadingMoreView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */