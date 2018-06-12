package com.tencent.mm.plugin.sns.abtest;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsoluteLayout;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.sdk.platformtools.ad;

public final class b
{
  int JP = 0;
  int gwO = 0;
  int mScreenHeight = 0;
  NotInterestMenu nhD;
  ViewGroup nhE;
  NotInterestMenu.b nhF = new b.1(this);
  Animation nhG = null;
  Animation nhH = null;
  private Animation nhI = null;
  private Animation nhJ = null;
  int nhK = 0;
  int nhL = 0;
  int nhM = 0;
  int nhN = 0;
  int nhO = 0;
  boolean nhP = false;
  AbsoluteLayout nhQ = null;
  boolean nhR = false;
  boolean nhS = false;
  NotInterestMenu.c nhy;
  
  public b(ViewGroup paramViewGroup)
  {
    this.nhE = paramViewGroup;
    this.nhG = AnimationUtils.loadAnimation(ad.getContext(), i.a.dropdown_down);
    this.nhG.setFillAfter(true);
    this.nhG.setDuration(100L);
    this.nhG.setAnimationListener(new b.2(this));
    this.nhH = AnimationUtils.loadAnimation(ad.getContext(), i.a.dropup_up);
    this.nhH.setFillAfter(true);
    this.nhH.setDuration(100L);
    this.nhH.setAnimationListener(new b.3(this));
    this.nhI = AnimationUtils.loadAnimation(ad.getContext(), i.a.dropdown_up);
    this.nhI.setFillAfter(true);
    this.nhI.setDuration(100L);
    this.nhI.setAnimationListener(new b.4(this));
    this.nhJ = AnimationUtils.loadAnimation(ad.getContext(), i.a.dropup_down);
    this.nhJ.setFillAfter(true);
    this.nhJ.setDuration(100L);
    this.nhJ.setAnimationListener(new b.5(this));
  }
  
  public final void bwH()
  {
    if ((this.nhQ != null) && (this.nhE != null) && (this.nhD != null))
    {
      this.nhQ.removeView(this.nhD);
      this.nhE.removeView(this.nhQ);
      this.nhQ = null;
      this.nhD = null;
      this.nhP = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/abtest/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */