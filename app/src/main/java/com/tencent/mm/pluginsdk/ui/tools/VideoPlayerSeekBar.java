package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.ae.a.a;
import com.tencent.mm.plugin.ae.a.b;
import com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar;
import com.tencent.mm.pluginsdk.ui.g;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.x;

public class VideoPlayerSeekBar
  extends AdVideoPlayerLoadingBar
  implements g
{
  public boolean bPb = false;
  private int pNg = -1;
  private int pNh = -1;
  private int pNi = -1;
  private PInt qTw = new PInt();
  
  public VideoPlayerSeekBar(Context paramContext)
  {
    super(paramContext);
  }
  
  public VideoPlayerSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public VideoPlayerSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private int getBarPointPaddingLeft()
  {
    if (this.pNh == -1) {
      this.pNh = this.ndk.getPaddingLeft();
    }
    return this.pNh;
  }
  
  private int getBarPointPaddingRight()
  {
    if (this.pNi == -1) {
      this.pNi = this.ndk.getPaddingRight();
    }
    return this.pNi;
  }
  
  public void ajV()
  {
    if (this.ndo == 0) {}
    while ((this.fTW) || (this.ndk == null) || (getBarLen() == 0)) {
      return;
    }
    this.ndm.setText(kT(this.mPosition / 60) + ":" + kT(this.mPosition % 60));
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.ndk.getLayoutParams();
    int i = getBarLen();
    localLayoutParams.leftMargin = eB(this.mPosition, i);
    this.ndk.setLayoutParams(localLayoutParams);
    localLayoutParams = (FrameLayout.LayoutParams)this.ndi.getLayoutParams();
    localLayoutParams.width = ((int)(this.mPosition * 1.0D / this.ndo * i));
    this.ndi.setLayoutParams(localLayoutParams);
    requestLayout();
  }
  
  public final int eB(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= 0)
    {
      this.ndj.getLayoutParams();
      return 0;
    }
    if (paramInt1 >= this.ndo) {
      return paramInt2 - (getBarPointWidth() - getBarPointPaddingLeft() - getBarPointPaddingRight()) / 2;
    }
    return (int)(paramInt1 * 1.0D / this.ndo * paramInt2);
  }
  
  protected int getBarPointWidth()
  {
    if (this.pNg == -1) {
      this.pNg = this.ndk.getWidth();
    }
    return this.pNg;
  }
  
  public int getLayoutId()
  {
    return a.b.video_player_seek_bar;
  }
  
  public ImageView getPlayBtn()
  {
    return this.ndl;
  }
  
  public TextView getPlaytimeTv()
  {
    return this.ndm;
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
    this.ndk.setOnTouchListener(new VideoPlayerSeekBar.1(this));
  }
  
  public final void jQ(boolean paramBoolean)
  {
    setIsPlay(paramBoolean);
  }
  
  public final void seek(int paramInt)
  {
    x.d("MicroMsg.VideoPlayerSeekBar", "seek position : " + paramInt);
    int i = paramInt;
    if (paramInt < 0) {
      i = 0;
    }
    paramInt = i;
    if (i >= this.ndo) {
      paramInt = this.ndo;
    }
    if (this.mPosition != paramInt)
    {
      this.mPosition = paramInt;
      ajV();
    }
  }
  
  public void setIsPlay(boolean paramBoolean)
  {
    this.bPb = paramBoolean;
    super.setIsPlay(paramBoolean);
  }
  
  public void setPlayBtnOnClickListener(View.OnClickListener paramOnClickListener)
  {
    if (this.ndl != null) {
      this.ndl.setOnClickListener(paramOnClickListener);
    }
  }
  
  public void setVideoTotalTime(int paramInt)
  {
    this.ndo = paramInt;
    this.mPosition = 0;
    this.ndn.setText(kT(this.ndo / 60) + ":" + kT(this.ndo % 60));
    ajV();
  }
  
  public final void wQ(int paramInt)
  {
    seek(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/VideoPlayerSeekBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */