package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.ak.a.e;
import com.tencent.mm.plugin.ak.a.f;
import com.tencent.mm.plugin.ak.a.g;
import com.tencent.mm.sdk.platformtools.x;

public class SnsAdNativeLandingPagesVideoPlayerLoadingBar
  extends RelativeLayout
  implements a
{
  private boolean bPb = false;
  private View contentView = null;
  private boolean fTW = false;
  private int mPosition = 0;
  private b ndh = null;
  private ImageView ndi;
  private ImageView ndj = null;
  private ImageView ndk = null;
  private ImageView ndl = null;
  private TextView ndm;
  private TextView ndn;
  private int ndo = 0;
  private int ndp = 0;
  private float ndr = 0.0F;
  private int nds = -1;
  private int ndt = -1;
  private int ndu = -1;
  private int ndv = -1;
  
  public SnsAdNativeLandingPagesVideoPlayerLoadingBar(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public SnsAdNativeLandingPagesVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public SnsAdNativeLandingPagesVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void ajV()
  {
    if (this.ndo == 0) {}
    while ((this.fTW) || (this.ndk == null) || (getBarLen() == 0)) {
      return;
    }
    int i = (this.ndk.getWidth() - this.ndk.getPaddingLeft() - this.ndk.getPaddingRight()) / 2;
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
  
  private int getBarLen()
  {
    this.ndp = this.ndj.getWidth();
    return this.ndp;
  }
  
  private int getCurrentTimeByBarPoint()
  {
    int i = ((FrameLayout.LayoutParams)this.ndj.getLayoutParams()).leftMargin;
    int j = this.ndk.getPaddingLeft();
    j = (int)((((FrameLayout.LayoutParams)this.ndk.getLayoutParams()).leftMargin - (i - j)) * 1.0D / getBarLen() * this.ndo);
    i = j;
    if (j < 0) {
      i = 0;
    }
    return i;
  }
  
  private void init()
  {
    this.contentView = View.inflate(getContext(), a.f.sns_ad_natvie_landingpages_video_player_loading_bar, this);
    this.ndi = ((ImageView)this.contentView.findViewById(a.e.player_progress_bar_front));
    this.ndj = ((ImageView)this.contentView.findViewById(a.e.player_progress_bar_background));
    this.ndk = ((ImageView)this.contentView.findViewById(a.e.player_progress_point));
    this.ndl = ((ImageView)this.contentView.findViewById(a.e.play_btn));
    this.ndm = ((TextView)this.contentView.findViewById(a.e.play_current_time_tv));
    this.ndn = ((TextView)this.contentView.findViewById(a.e.play_total_time_tv));
    this.ndk.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          x.i("MicroMsg.SnsAdNativeLandingPagesVideoPlayerLoadingBar", "ontouch down");
          SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this, false);
          SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this, paramAnonymousMotionEvent.getX());
          if (SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this) != null) {
            SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).ajO();
          }
        }
        do
        {
          return true;
          if (paramAnonymousMotionEvent.getAction() == 2)
          {
            float f = paramAnonymousMotionEvent.getX();
            paramAnonymousView = (FrameLayout.LayoutParams)SnsAdNativeLandingPagesVideoPlayerLoadingBar.b(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).getLayoutParams();
            i = paramAnonymousView.leftMargin;
            int j = (int)(f - SnsAdNativeLandingPagesVideoPlayerLoadingBar.c(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this));
            paramAnonymousView.leftMargin = SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this, j + i);
            SnsAdNativeLandingPagesVideoPlayerLoadingBar.b(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).setLayoutParams(paramAnonymousView);
            i = SnsAdNativeLandingPagesVideoPlayerLoadingBar.d(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this);
            if (SnsAdNativeLandingPagesVideoPlayerLoadingBar.e(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this) > 0)
            {
              paramAnonymousView = (FrameLayout.LayoutParams)SnsAdNativeLandingPagesVideoPlayerLoadingBar.f(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).getLayoutParams();
              paramAnonymousView.width = ((int)(i * 1.0D / SnsAdNativeLandingPagesVideoPlayerLoadingBar.e(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this) * SnsAdNativeLandingPagesVideoPlayerLoadingBar.g(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this)));
              SnsAdNativeLandingPagesVideoPlayerLoadingBar.f(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).setLayoutParams(paramAnonymousView);
            }
            SnsAdNativeLandingPagesVideoPlayerLoadingBar.h(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).setText(SnsAdNativeLandingPagesVideoPlayerLoadingBar.kT(i / 60) + ":" + SnsAdNativeLandingPagesVideoPlayerLoadingBar.kT(i % 60));
            SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this, true);
            return true;
          }
        } while (!SnsAdNativeLandingPagesVideoPlayerLoadingBar.i(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this));
        int i = SnsAdNativeLandingPagesVideoPlayerLoadingBar.d(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this);
        if (SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this) != null)
        {
          x.i("MicroMsg.SnsAdNativeLandingPagesVideoPlayerLoadingBar", "current time : " + i);
          SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).kV(i);
        }
        SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this, false);
        return true;
      }
    });
  }
  
  public static String kT(int paramInt)
  {
    if (paramInt < 10) {
      return "0" + paramInt;
    }
    return String.valueOf(paramInt);
  }
  
  public final void bvT()
  {
    this.ndp = 0;
  }
  
  public boolean getIsPlay()
  {
    return this.bPb;
  }
  
  public int getVideoTotalTime()
  {
    return this.ndo;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != this.nds) || (paramInt2 != this.ndt) || (paramInt3 != this.ndu) || (paramInt4 != this.ndv)) {
      ajV();
    }
    this.nds = paramInt1;
    this.ndt = paramInt2;
    this.ndu = paramInt3;
    this.ndv = paramInt4;
  }
  
  public final void seek(int paramInt)
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
    this.bPb = paramBoolean;
    if (paramBoolean)
    {
      this.ndl.setImageResource(a.g.media_player_pause_btn);
      return;
    }
    this.ndl.setImageResource(a.g.media_player_play_btn);
  }
  
  public void setOnPlayButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    this.ndl.setOnClickListener(paramOnClickListener);
  }
  
  public void setVideoTotalTime(int paramInt)
  {
    if ((this.ndk.isShown()) && (this.ndk.getWidth() == 0))
    {
      post(new SnsAdNativeLandingPagesVideoPlayerLoadingBar.2(this, paramInt));
      return;
    }
    this.ndo = paramInt;
    this.mPosition = 0;
    this.ndn.setText(kT(this.ndo / 60) + ":" + kT(this.ndo % 60));
    ajV();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sight/decode/ui/SnsAdNativeLandingPagesVideoPlayerLoadingBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */