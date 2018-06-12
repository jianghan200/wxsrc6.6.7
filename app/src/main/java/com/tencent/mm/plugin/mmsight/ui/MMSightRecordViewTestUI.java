package com.tencent.mm.plugin.mmsight.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.d;
import com.tencent.mm.plugin.w.a.d;
import com.tencent.mm.plugin.w.a.e;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;

public class MMSightRecordViewTestUI
  extends MMActivity
{
  private MMSightRecordView fOq;
  private int fbk = 720;
  private float fbl = 0.67F;
  
  protected final int getLayoutId()
  {
    return a.e.mmsight_record_view_testui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBackBtn(new MMSightRecordViewTestUI.1(this));
    this.fOq = ((MMSightRecordView)findViewById(a.d.record_view));
    this.fOq.setDisplayRatio(this.fbl);
    this.fOq.setPreviewSizeLimit(this.fbk);
    this.fOq.setVideoPara$2e715812(100000);
    this.fOq.setVideoFilePath(e.bnE + "mmsighttest.mp4");
    this.fOq.setClipPictureSize(true);
    this.fOq.setClipVideoSize(true);
    this.fOq.leB.ZX();
    this.fOq.setFlashMode(3);
    this.fOq.setFrameDataCallback(new MMSightRecordViewTestUI.2(this));
    this.fOq.leB.startPreview();
    this.fOq.leB.ZS();
    findViewById(a.d.take_picture_btn).setOnClickListener(new MMSightRecordViewTestUI.3(this));
    findViewById(a.d.start_record_btn).setOnClickListener(new MMSightRecordViewTestUI.4(this));
    ah.i(new MMSightRecordViewTestUI.5(this, (TextView)findViewById(a.d.debug_info)), 1000L);
    findViewById(a.d.switch_camera_btn).setOnClickListener(new MMSightRecordViewTestUI.6(this));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.fOq.leB.release();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/mmsight/ui/MMSightRecordViewTestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */