package com.tencent.mm.plugin.mmsight.segment;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.a.a.a;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView;
import com.tencent.mm.plugin.w.a.e;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class MMSightEditUI
  extends MMActivity
{
  private String bOX;
  private com.tencent.mm.remoteservice.d iMQ = new com.tencent.mm.remoteservice.d(ad.getContext());
  private VideoTransPara lfT;
  private ViewGroup lkY;
  private VideoPlayerTextureView lkZ;
  private VideoSeekBarEditorView lla;
  private com.tencent.mm.plugin.mmsight.ui.a llb;
  private String llc;
  private boolean lld = false;
  private boolean lle = false;
  private f.a llf = new MMSightEditUI.3(this);
  private String videoPath;
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.e.mmsight_video_edit_ui;
  }
  
  public void onBackPressed()
  {
    if ((this.llb != null) && (this.llb.agV())) {
      return;
    }
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    supportRequestWindowFeature(1);
    super.onCreate(paramBundle);
    getWindow().addFlags(2097280);
    if (com.tencent.mm.compatible.util.d.fR(19))
    {
      getWindow().setFlags(201327616, 201327616);
      com.tencent.mm.plugin.mmsight.d.gs(true);
    }
    for (;;)
    {
      CaptureMMProxy.createProxy(new CaptureMMProxy(this.iMQ));
      long l = bi.VG();
      this.iMQ.K(new MMSightEditUI.1(this, l));
      return;
      getWindow().setFlags(1024, 1024);
      com.tencent.mm.plugin.mmsight.d.gs(false);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.lkZ != null) {
      this.lkZ.stop();
    }
    if (this.llb != null)
    {
      if (this.lle) {
        com.tencent.mm.plugin.mmsight.a.a.a(new a.a(this.llb.scene));
      }
      this.llb.release();
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.lkZ != null) {
      this.lkZ.pause();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.lkZ != null) {
      this.lkZ.start();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/mmsight/segment/MMSightEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */