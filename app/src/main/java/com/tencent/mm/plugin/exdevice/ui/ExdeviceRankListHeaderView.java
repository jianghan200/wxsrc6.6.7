package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;

public class ExdeviceRankListHeaderView
  extends RelativeLayout
{
  private TextView iFJ;
  private View.OnClickListener iFK;
  private Animation iFL;
  private Animation iFM;
  private Runnable iFN;
  private boolean iFO = true;
  private Context mContext;
  
  public ExdeviceRankListHeaderView(Context paramContext)
  {
    super(paramContext);
    co(paramContext);
  }
  
  public ExdeviceRankListHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  public ExdeviceRankListHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    co(paramContext);
  }
  
  private void co(Context paramContext)
  {
    this.mContext = paramContext;
    this.iFJ = ((TextView)LayoutInflater.from(this.mContext).inflate(R.i.exdevice_rank_header_view, this, true).findViewById(R.h.champion_motto));
    this.iFJ.setVisibility(4);
    this.iFL = AnimationUtils.loadAnimation(this.mContext, R.a.abc_fade_in);
    this.iFM = AnimationUtils.loadAnimation(this.mContext, R.a.abc_fade_out);
    this.iFN = new Runnable()
    {
      public final void run()
      {
        ExdeviceRankListHeaderView.e(ExdeviceRankListHeaderView.this).startAnimation(ExdeviceRankListHeaderView.d(ExdeviceRankListHeaderView.this));
      }
    };
    this.iFL.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        ExdeviceRankListHeaderView.d(ExdeviceRankListHeaderView.this).reset();
        ah.i(ExdeviceRankListHeaderView.f(ExdeviceRankListHeaderView.this), 4000L);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        ExdeviceRankListHeaderView.e(ExdeviceRankListHeaderView.this).setVisibility(0);
      }
    });
    this.iFM.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        ExdeviceRankListHeaderView.e(ExdeviceRankListHeaderView.this).setVisibility(4);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        ExdeviceRankListHeaderView.e(ExdeviceRankListHeaderView.this).setVisibility(0);
      }
    });
    this.iFL.setFillAfter(true);
    this.iFL.setFillEnabled(true);
    this.iFM.setFillAfter(true);
    this.iFM.setFillAfter(true);
    setOnClickListener(new ExdeviceRankListHeaderView.1(this));
  }
  
  public String getMotto()
  {
    return bi.aG(this.iFJ.getText().toString(), "");
  }
  
  public void setIsShowTip(boolean paramBoolean)
  {
    this.iFO = paramBoolean;
  }
  
  public void setMotto(String paramString)
  {
    this.iFJ.setText(paramString);
  }
  
  public void setOnViewClickListener(View.OnClickListener paramOnClickListener)
  {
    this.iFK = paramOnClickListener;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/ui/ExdeviceRankListHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */