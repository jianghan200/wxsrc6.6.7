package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.x;

public class VoiceTipInfoView
  extends LinearLayout
{
  public ProgressBar eWx;
  TextView gsY;
  boolean oGL = false;
  private boolean oGM = false;
  private TextView oGN;
  private boolean oGO = false;
  private float oGP = 0.0F;
  TextView oGm;
  
  public VoiceTipInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = LayoutInflater.from(paramContext).inflate(R.i.voice_tip_info_view, this, true);
    this.eWx = ((ProgressBar)paramContext.findViewById(R.h.load_progress));
    bJm();
    this.gsY = ((TextView)paramContext.findViewById(R.h.voice_print_title));
    this.oGm = ((TextView)paramContext.findViewById(R.h.voice_print_title_tip));
    this.oGN = ((TextView)paramContext.findViewById(R.h.voice_print_title_error));
    reset();
  }
  
  public final void bJl()
  {
    x.d("MicroMsg.VoiceTipInfoView", "mProgressBar show");
    this.eWx.setVisibility(0);
  }
  
  public final void bJm()
  {
    x.d("MicroMsg.VoiceTipInfoView", "mProgressBar hide");
    this.eWx.setVisibility(8);
  }
  
  public final void bJn()
  {
    x.d("MicroMsg.VoiceTipInfoView", "showTitle, titleTv.getVisibility:%d, mAnimingTitle:%b", new Object[] { Integer.valueOf(this.gsY.getVisibility()), Boolean.valueOf(this.oGL) });
    if (((this.gsY.getVisibility() == 4) || (this.gsY.getVisibility() == 8)) && (!this.oGL))
    {
      this.gsY.clearAnimation();
      this.oGL = true;
      TextView localTextView = this.gsY;
      Object localObject = getContext();
      VoiceTipInfoView.2 local2 = new VoiceTipInfoView.2(this);
      localObject = AnimationUtils.loadAnimation((Context)localObject, R.a.fast_faded_in);
      ((Animation)localObject).setDuration(300L);
      ((Animation)localObject).setFillAfter(true);
      ((Animation)localObject).setRepeatCount(0);
      ((Animation)localObject).setAnimationListener(new a.4(local2));
      localTextView.startAnimation((Animation)localObject);
      return;
    }
    x.d("MicroMsg.VoiceTipInfoView", "showTitle, directly set to VISIBLE");
    this.gsY.clearAnimation();
    this.gsY.setVisibility(0);
    this.gsY.invalidate();
  }
  
  public final void bJo()
  {
    this.oGm.setVisibility(8);
  }
  
  public final void bJp()
  {
    if ((this.oGN.getVisibility() == 4) && (!this.oGO))
    {
      this.oGN.clearAnimation();
      this.oGO = true;
      TextView localTextView = this.oGN;
      getContext();
      VoiceTipInfoView.4 local4 = new VoiceTipInfoView.4(this);
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, -1.0F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
      localTranslateAnimation.setDuration(200L);
      localTranslateAnimation.setFillAfter(true);
      localTranslateAnimation.setRepeatCount(0);
      localTranslateAnimation.setAnimationListener(new a.5(local4));
      localTextView.startAnimation(localTranslateAnimation);
      return;
    }
    this.oGN.clearAnimation();
    this.oGN.setVisibility(0);
  }
  
  public final void bJq()
  {
    if ((this.oGN.getVisibility() == 0) && (!this.oGO))
    {
      this.oGN.clearAnimation();
      this.oGO = true;
      a.a(this.oGN, getContext(), new a.a()
      {
        public final void bJd() {}
        
        public final void bJe()
        {
          VoiceTipInfoView.c(VoiceTipInfoView.this).setVisibility(4);
          VoiceTipInfoView.d(VoiceTipInfoView.this);
        }
      });
      return;
    }
    this.oGN.clearAnimation();
    this.oGN.setVisibility(4);
  }
  
  public final void reset()
  {
    this.oGm.setTextSize(0, getContext().getResources().getDimension(R.f.voice_print_tip_normal_size));
    this.oGP = this.oGm.getTextSize();
    this.oGm.clearAnimation();
    x.d("MicroMsg.VoiceTipInfoView", "mTipSize %f", new Object[] { Float.valueOf(this.oGP) });
  }
  
  public void setErr(int paramInt)
  {
    this.oGN.setText(paramInt);
  }
  
  public void setErr(String paramString)
  {
    this.oGN.setText(paramString);
  }
  
  public void setTipText(int paramInt)
  {
    this.oGm.setText(paramInt);
    this.oGm.setVisibility(0);
  }
  
  public void setTipText(String paramString)
  {
    this.oGm.setText(paramString);
    this.oGm.setVisibility(0);
  }
  
  public void setTitleText(int paramInt)
  {
    this.gsY.setText(paramInt);
    this.gsY.setVisibility(0);
  }
  
  public void setTitleText(String paramString)
  {
    this.gsY.setText(paramString);
    this.gsY.setVisibility(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/ui/VoiceTipInfoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */