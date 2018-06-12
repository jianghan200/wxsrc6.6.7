package com.tencent.mm.plugin.websearch.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.pluginsdk.ui.g;
import com.tencent.mm.sdk.platformtools.x;

public class WebSearchVideoPlayerSeekBar
  extends AdVideoPlayerLoadingBar
  implements g
{
  protected boolean bPb = false;
  private float fto;
  private int pNg = -1;
  private int pNh = -1;
  private int pNi = -1;
  
  public WebSearchVideoPlayerSeekBar(Context paramContext)
  {
    super(paramContext);
  }
  
  public WebSearchVideoPlayerSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public WebSearchVideoPlayerSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
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
  
  private int getCurProgressBarLen()
  {
    return this.ndi.getWidth();
  }
  
  private int getCurTimeByProgressBar()
  {
    return (int)(getCurProgressBarLen() * 1.0D / getBarLen() * this.ndo);
  }
  
  public final void ajV()
  {
    if (this.ndo == 0) {}
    while ((this.fTW) || (this.ndk == null) || (getBarLen() == 0)) {
      return;
    }
    if (this.mPosition == this.ndo) {
      x.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "test");
    }
    this.ndm.setText(kT(this.mPosition / 60) + ":" + kT(this.mPosition % 60));
    int i = this.mPosition;
    if (i <= 0) {
      i = 0;
    }
    for (;;)
    {
      yk(i);
      return;
      if (i >= this.ndo) {
        i = getBarLen();
      } else {
        i = (int)(i * 1.0D / this.ndo * getBarLen());
      }
    }
  }
  
  public int getBarLen()
  {
    return this.ndj.getWidth();
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
    return a.d.video_player_seek_bar;
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
    this.ndi = ((ImageView)this.contentView.findViewById(a.c.player_progress_bar_front));
    this.ndj = ((ImageView)this.contentView.findViewById(a.c.player_progress_bar_background));
    this.ndk = ((ImageView)this.contentView.findViewById(a.c.player_progress_point));
    this.ndl = ((ImageView)this.contentView.findViewById(a.c.play_btn));
    this.ndm = ((TextView)this.contentView.findViewById(a.c.play_current_time_tv));
    this.ndn = ((TextView)this.contentView.findViewById(a.c.play_total_time_tv));
    this.ndk.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          x.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "ontouch down");
          WebSearchVideoPlayerSeekBar.a(WebSearchVideoPlayerSeekBar.this);
          WebSearchVideoPlayerSeekBar.a(WebSearchVideoPlayerSeekBar.this, paramAnonymousMotionEvent.getX());
          WebSearchVideoPlayerSeekBar.b(WebSearchVideoPlayerSeekBar.this, ((FrameLayout.LayoutParams)WebSearchVideoPlayerSeekBar.b(WebSearchVideoPlayerSeekBar.this).getLayoutParams()).leftMargin);
          if (WebSearchVideoPlayerSeekBar.c(WebSearchVideoPlayerSeekBar.this) != null) {
            WebSearchVideoPlayerSeekBar.d(WebSearchVideoPlayerSeekBar.this).ajO();
          }
          return true;
        }
        if (paramAnonymousMotionEvent.getAction() == 2)
        {
          float f1 = paramAnonymousMotionEvent.getX();
          x.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "move dis %f ", new Object[] { Float.valueOf(f1 - WebSearchVideoPlayerSeekBar.e(WebSearchVideoPlayerSeekBar.this)) });
          float f2 = WebSearchVideoPlayerSeekBar.f(WebSearchVideoPlayerSeekBar.this);
          i = (int)(f1 - WebSearchVideoPlayerSeekBar.e(WebSearchVideoPlayerSeekBar.this) + f2);
          WebSearchVideoPlayerSeekBar.this.yk(i);
          i = WebSearchVideoPlayerSeekBar.g(WebSearchVideoPlayerSeekBar.this);
          WebSearchVideoPlayerSeekBar.h(WebSearchVideoPlayerSeekBar.this).setText(WebSearchVideoPlayerSeekBar.kT(i / 60) + ":" + WebSearchVideoPlayerSeekBar.kT(i % 60));
          WebSearchVideoPlayerSeekBar.i(WebSearchVideoPlayerSeekBar.this);
          return true;
        }
        x.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "ontouch up");
        int i = WebSearchVideoPlayerSeekBar.j(WebSearchVideoPlayerSeekBar.this);
        if (WebSearchVideoPlayerSeekBar.k(WebSearchVideoPlayerSeekBar.this)) {
          i = WebSearchVideoPlayerSeekBar.a(WebSearchVideoPlayerSeekBar.this, WebSearchVideoPlayerSeekBar.g(WebSearchVideoPlayerSeekBar.this));
        }
        if (WebSearchVideoPlayerSeekBar.l(WebSearchVideoPlayerSeekBar.this) != null)
        {
          x.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "current time : " + i);
          WebSearchVideoPlayerSeekBar.m(WebSearchVideoPlayerSeekBar.this).kV(i);
        }
        WebSearchVideoPlayerSeekBar.n(WebSearchVideoPlayerSeekBar.this);
        return true;
      }
    });
    this.ndk.addOnLayoutChangeListener(new WebSearchVideoPlayerSeekBar.2(this));
    this.ndj.addOnLayoutChangeListener(new WebSearchVideoPlayerSeekBar.3(this));
  }
  
  public final void jQ(boolean paramBoolean)
  {
    setIsPlay(paramBoolean);
  }
  
  public final void seek(int paramInt)
  {
    x.d("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "seek position : " + paramInt);
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
  
  public void wQ(int paramInt)
  {
    seek(paramInt);
  }
  
  public void yk(int paramInt)
  {
    int i;
    FrameLayout.LayoutParams localLayoutParams;
    if (paramInt > getBarLen())
    {
      i = getBarLen();
      localLayoutParams = (FrameLayout.LayoutParams)this.ndk.getLayoutParams();
      if (i <= getBarLen()) {
        break label121;
      }
    }
    label121:
    for (paramInt = getBarLen();; paramInt = i)
    {
      localLayoutParams.leftMargin = (((FrameLayout.LayoutParams)this.ndj.getLayoutParams()).leftMargin + paramInt - (getBarPointWidth() >>> 1));
      this.ndk.setLayoutParams(localLayoutParams);
      localLayoutParams = (FrameLayout.LayoutParams)this.ndi.getLayoutParams();
      localLayoutParams.width = i;
      this.ndi.setLayoutParams(localLayoutParams);
      this.ndk.requestLayout();
      this.ndi.requestLayout();
      return;
      i = paramInt;
      if (paramInt >= 0) {
        break;
      }
      i = 0;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/websearch/ui/WebSearchVideoPlayerSeekBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */