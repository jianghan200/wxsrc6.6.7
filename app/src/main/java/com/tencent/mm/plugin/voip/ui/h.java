package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.widget.BaseSmallView;

public final class h
  extends BaseSmallView
{
  private TextView hrV;
  
  public h(Context paramContext)
  {
    super(paramContext, null);
    LayoutInflater.from(paramContext).inflate(R.i.voip_voice_mini_widget_view, this);
    this.hrV = ((TextView)findViewById(R.h.voip_voice_mini_time_tv));
  }
  
  public final void OI(String paramString)
  {
    this.hrV.setTextSize(1, 12.0F);
    this.hrV.setText(paramString);
  }
  
  public final void OJ(String paramString)
  {
    this.hrV.setTextSize(1, 14.0F);
    this.hrV.setText(paramString);
  }
  
  protected final void bLM() {}
  
  protected final void bLN() {}
  
  protected final void onAnimationEnd() {}
  
  public final void setCaptureView(CaptureView paramCaptureView) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */