package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.rz;
import com.tencent.mm.model.d.a;
import com.tencent.mm.plugin.ak.a.b;
import com.tencent.mm.plugin.ak.a.e;
import com.tencent.mm.plugin.ak.a.f;
import com.tencent.mm.plugin.ak.a.i;
import com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.i;

public final class c
  extends i
  implements d.a
{
  public int ccR = 0;
  public String dXA;
  private com.tencent.mm.model.d gbl = new com.tencent.mm.model.d();
  private f hEl = null;
  public int iYO = 0;
  public String imagePath;
  public int ncW = 0;
  private TextView ndP = null;
  private boolean ndQ = false;
  
  public c(Context paramContext)
  {
    super(paramContext, a.i.videodialog);
  }
  
  private void bvV()
  {
    x.v("check", "onclick");
    if (this.hEl.isPlaying())
    {
      this.hEl.pause();
      this.gbl.bv(false);
    }
    new ag().post(new c.4(this));
  }
  
  public final void dismiss()
  {
    x.d("MicroMsg.VideoPopupHelper", "on dismiss");
    if (com.tencent.mm.booter.a.xt() != null) {
      com.tencent.mm.booter.a.xt().xu();
    }
    if (this.hEl != null)
    {
      this.hEl.setVideoCallback(null);
      this.hEl.stop();
      this.hEl.onDetach();
      findViewById(a.e.video_container).setOnClickListener(null);
    }
    if ((!this.ndQ) && (isShowing()))
    {
      rz localrz = new rz();
      localrz.ccO.type = 0;
      localrz.ccO.ccP = this.ncW;
      localrz.ccO.ccQ = this.iYO;
      localrz.ccO.ccR = this.ccR;
      com.tencent.mm.sdk.b.a.sFg.m(localrz);
    }
    super.dismiss();
    this.gbl.bv(true);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    long l = System.currentTimeMillis();
    x.d("MicroMsg.VideoPopupHelper", l + " initView beg");
    super.onCreate(paramBundle);
    getWindow().setFlags(16777216, 16777216);
    setContentView(a.f.shortvideoplayer);
    if (com.tencent.mm.booter.a.xt() != null) {
      com.tencent.mm.booter.a.xt().xv();
    }
    x.d("MicroMsg.VideoPopupHelper", g.Ab() + " initView: fullpath:" + this.dXA + ", imagepath:" + this.imagePath);
    this.ndP = ((TextView)findViewById(a.e.tips_tv));
    findViewById(a.e.show_ad_sight).setVisibility(8);
    paramBundle = (ViewGroup)findViewById(a.e.video_container);
    paramBundle.setBackgroundResource(a.b.black);
    x.i("MicroMsg.VideoPopupHelper", "getVideoView, is normal video");
    if (com.tencent.mm.compatible.util.d.fR(14)) {}
    for (this.hEl = new VideoTextureView(getContext());; this.hEl = new VideoSurfaceView(getContext()))
    {
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams.addRule(13);
      paramBundle.addView((View)this.hEl, localLayoutParams);
      this.hEl.setVideoCallback(new c.1(this));
      findViewById(a.e.video_container).setOnClickListener(new c.2(this));
      ((View)this.hEl).setOnClickListener(new c.3(this));
      if (this.dXA != null)
      {
        this.hEl.stop();
        this.hEl.setVideoPath(this.dXA);
      }
      x.d("MicroMsg.VideoPopupHelper", System.currentTimeMillis() - l + " initView end");
      paramBundle = new rz();
      paramBundle.ccO.type = 1;
      com.tencent.mm.sdk.b.a.sFg.m(paramBundle);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sight/decode/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */