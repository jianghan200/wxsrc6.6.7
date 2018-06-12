package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.ae.a.a;
import com.tencent.mm.plugin.ae.a.b;
import com.tencent.mm.plugin.ae.a.c;

public class AdVideoPlayerLoadingBar
  extends RelativeLayout
  implements a
{
  public View contentView = null;
  public boolean fTW = false;
  public int mPosition = 0;
  public b ndh = null;
  public ImageView ndi;
  public ImageView ndj = null;
  public ImageView ndk = null;
  public ImageView ndl = null;
  public TextView ndm;
  public TextView ndn;
  public int ndo = 0;
  private int ndp = 0;
  private int ndq = 0;
  public float ndr = 0.0F;
  private int nds = -1;
  private int ndt = -1;
  private int ndu = -1;
  private int ndv = -1;
  
  public AdVideoPlayerLoadingBar(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public AdVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public AdVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  public static String kT(int paramInt)
  {
    if (paramInt < 10) {
      return "0" + paramInt;
    }
    return String.valueOf(paramInt);
  }
  
  public void ajV()
  {
    if (this.ndo == 0) {}
    while ((this.fTW) || (this.ndk == null) || (getBarLen() == 0)) {
      return;
    }
    int i = (getBarPointWidth() - this.ndk.getPaddingLeft() - this.ndk.getPaddingRight()) / 2;
    this.ndm.setText(kT(this.mPosition / 60) + ":" + kT(this.mPosition % 60));
    int j = ((FrameLayout.LayoutParams)this.ndj.getLayoutParams()).leftMargin;
    int k = this.ndk.getPaddingLeft();
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.ndk.getLayoutParams();
    localLayoutParams.leftMargin = (j - k + (int)(this.mPosition * 1.0D / this.ndo * getBarLen()) - i);
    this.ndk.setLayoutParams(localLayoutParams);
    localLayoutParams = (FrameLayout.LayoutParams)this.ndi.getLayoutParams();
    localLayoutParams.width = ((int)(this.mPosition * 1.0D / this.ndo * getBarLen()));
    this.ndi.setLayoutParams(localLayoutParams);
  }
  
  public final void bvS()
  {
    this.ndn.setText(kT(this.ndo / 60) + ":" + kT(this.ndo % 60));
    ajV();
  }
  
  public final void bvT()
  {
    this.ndp = 0;
  }
  
  public int getBarLen()
  {
    if (this.ndp <= 0) {
      this.ndp = this.ndj.getWidth();
    }
    return this.ndp;
  }
  
  public int getBarPointWidth()
  {
    if (this.ndq <= 0) {
      this.ndq = this.ndk.getWidth();
    }
    return this.ndq;
  }
  
  protected int getCurrentTimeByBarPoint()
  {
    int i = ((FrameLayout.LayoutParams)this.ndj.getLayoutParams()).leftMargin;
    int j = this.ndk.getPaddingLeft();
    return Math.max(0, (int)((((FrameLayout.LayoutParams)this.ndk.getLayoutParams()).leftMargin - (i - j) + (getBarPointWidth() - this.ndk.getPaddingLeft() - this.ndk.getPaddingRight()) / 2) * 1.0D / getBarLen() * this.ndo));
  }
  
  public int getLayoutId()
  {
    return a.b.video_player_loading_bar;
  }
  
  public int getVideoTotalTime()
  {
    return this.ndo;
  }
  
  public int getmPosition()
  {
    return this.mPosition;
  }
  
  public void init()
  {
    this.contentView = View.inflate(getContext(), getLayoutId(), this);
    this.ndi = ((ImageView)this.contentView.findViewById(a.a.player_progress_bar_front));
    this.ndj = ((ImageView)this.contentView.findViewById(a.a.player_progress_bar_background));
    this.ndk = ((ImageView)this.contentView.findViewById(a.a.player_progress_point));
    this.ndl = ((ImageView)this.contentView.findViewById(a.a.play_btn));
    this.ndm = ((TextView)this.contentView.findViewById(a.a.play_current_time_tv));
    this.ndn = ((TextView)this.contentView.findViewById(a.a.play_total_time_tv));
    this.ndk.setOnTouchListener(new AdVideoPlayerLoadingBar.1(this));
    this.ndk.post(new AdVideoPlayerLoadingBar.2(this));
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.ndi.getLayoutParams();
    localLayoutParams.width = 0;
    this.ndi.setLayoutParams(localLayoutParams);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.ndp = 0;
    if ((paramInt1 != this.nds) || (paramInt2 != this.ndt) || (paramInt3 != this.ndu) || (paramInt4 != this.ndv)) {
      ajV();
    }
    this.nds = paramInt1;
    this.ndt = paramInt2;
    this.ndu = paramInt3;
    this.ndv = paramInt4;
  }
  
  public void seek(int paramInt)
  {
    this.mPosition = paramInt;
    ajV();
  }
  
  public void setIplaySeekCallback(b paramb)
  {
    this.ndh = paramb;
  }
  
  public void setIsPlay(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.ndl.setImageResource(a.c.media_player_pause_btn);
      return;
    }
    this.ndl.setImageResource(a.c.media_player_play_btn);
  }
  
  public void setOnPlayButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    this.ndl.setOnClickListener(paramOnClickListener);
  }
  
  public void setVideoTotalTime(int paramInt)
  {
    this.ndo = paramInt;
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      post(new AdVideoPlayerLoadingBar.3(this));
      return;
    }
    bvS();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sight/decode/ui/AdVideoPlayerLoadingBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */