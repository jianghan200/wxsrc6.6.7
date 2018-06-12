package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.mm.R.h;
import com.tencent.mm.sdk.platformtools.ag;

public class SprayLayout
  extends FrameLayout
{
  private ag handler;
  Animation hmA = new AlphaAnimation(0.2F, 1.0F);
  Animation hmB = new ScaleAnimation(0.8F, 1.27F, 0.8F, 1.27F, 1, 0.5F, 1, 1.0F);
  Animation hmC = new AlphaAnimation(1.0F, 0.5F);
  Animation hmD = new ScaleAnimation(0.8F, 1.0F, 0.8F, 1.0F, 1, 0.5F, 1, 1.0F);
  AnimationSet hmE = new AnimationSet(true);
  AnimationSet hmF = new AnimationSet(true);
  AnimationSet hmG = new AnimationSet(true);
  private int hmH;
  private int hmI;
  private int hmJ;
  private int hmK;
  private int hmL;
  private int hmM;
  private Runnable hmN;
  private ImageView hmw;
  private ImageView hmx;
  private ImageView hmy;
  Animation hmz = new ScaleAnimation(0.6F, 0.8F, 0.6F, 0.8F, 1, 0.5F, 1, 1.0F);
  private int repeatCount;
  
  public SprayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SprayLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.hmz.setDuration(280L);
    this.hmA.setDuration(280L);
    this.hmB.setDuration(280L);
    this.hmC.setDuration(280L);
    this.hmE.addAnimation(this.hmz);
    this.hmE.addAnimation(this.hmA);
    this.hmE.setRepeatCount(1);
    this.hmE.setDuration(280L);
    this.hmF.addAnimation(this.hmB);
    this.hmF.setRepeatCount(1);
    this.hmF.setDuration(280L);
    this.hmG.addAnimation(this.hmD);
    this.hmG.setRepeatCount(1);
    this.hmG.setDuration(280L);
    this.hmH = 0;
    this.repeatCount = 1;
    this.hmJ = -1;
    this.hmK = -1;
    this.handler = new ag();
    this.hmN = new SprayLayout.1(this);
  }
  
  public final void E(int paramInt1, int paramInt2, int paramInt3)
  {
    this.hmH = 0;
    this.repeatCount = paramInt1;
    this.hmI = 0;
    this.hmJ = paramInt2;
    this.hmK = paramInt3;
    if (this.hmw == null)
    {
      this.hmw = ((ImageView)findViewById(R.h.bottle_spray_one_iv));
      this.hmx = ((ImageView)findViewById(R.h.bottle_spray_two_iv));
      this.hmy = ((ImageView)findViewById(R.h.bottle_spray_three_iv));
      DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
      this.hmL = (localDisplayMetrics.widthPixels * 35 / 96);
      this.hmM = (localDisplayMetrics.heightPixels / 16);
    }
    this.hmw.setVisibility(8);
    this.hmx.setVisibility(8);
    this.hmy.setVisibility(8);
    setVisibility(0);
    this.handler.removeCallbacks(this.hmN);
    this.handler.postDelayed(this.hmN, 0L);
  }
  
  public final void stop()
  {
    this.handler.removeCallbacks(this.hmN);
    setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/SprayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */