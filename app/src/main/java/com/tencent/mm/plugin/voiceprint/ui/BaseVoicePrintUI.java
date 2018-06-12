package com.tencent.mm.plugin.voiceprint.ui;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.voiceprint.model.m;
import com.tencent.mm.plugin.voiceprint.model.p;
import com.tencent.mm.plugin.voiceprint.model.p.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.io.File;

public abstract class BaseVoicePrintUI
  extends MMActivity
{
  private final al kGG = new al(new BaseVoicePrintUI.3(this), true);
  private boolean kGx = false;
  Button oFF;
  View oFG;
  VoicePrintVolumeMeter oFH;
  VoiceTipInfoView oFI;
  p oFJ = null;
  String oFK = null;
  private boolean oFL = false;
  private View oFM;
  private boolean oFN = false;
  private final p.a oFO = new BaseVoicePrintUI.1(this);
  al oFP = new al(new BaseVoicePrintUI.4(this), true);
  private ag oFQ = new ag(Looper.getMainLooper(), new BaseVoicePrintUI.5(this));
  String oFo = null;
  
  protected abstract void aZW();
  
  protected final void bIZ()
  {
    ah.i(new BaseVoicePrintUI.7(this), 1300L);
  }
  
  protected final void bJa()
  {
    if ((this.oFM.getVisibility() == 4) || (this.oFM.getVisibility() == 8)) {
      return;
    }
    if (this.oFN)
    {
      this.oFM.setVisibility(4);
      return;
    }
    this.oFN = true;
    a.a(this.oFM, this, new BaseVoicePrintUI.9(this));
  }
  
  protected final void bJb()
  {
    ym(R.l.voice_print_network_error);
  }
  
  protected abstract void bJc();
  
  protected final int getLayoutId()
  {
    return R.i.voice_print_layout;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.oFI = ((VoiceTipInfoView)findViewById(R.h.tip_info_view));
    this.oFF = ((Button)findViewById(R.h.recoder_btn));
    this.oFG = findViewById(R.h.volume_layout);
    this.oFH = ((VoicePrintVolumeMeter)findViewById(R.h.volume_meter));
    this.oFM = findViewById(R.h.button_press_tips);
    this.oFI.bJq();
    this.oFH.setArchView(this.oFF);
    this.oFJ = new p();
    this.oFJ.oFA = this.oFO;
    this.oFF.setOnTouchListener(new BaseVoicePrintUI.10(this));
    findViewById(R.h.left_btn).setOnClickListener(new BaseVoicePrintUI.2(this));
    aZW();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    Object localObject = this.oFH;
    ((VoicePrintVolumeMeter)localObject).oGu.SO();
    ((VoicePrintVolumeMeter)localObject).oGt.lnJ.getLooper().quit();
    x.d("MicroMsg.VoicePrintVolumeMeter", "destroy, quit factor thread");
    x.d("MicroMsg.VoicePrintLogic", "delete voiceprint voice file");
    localObject = new File(m.aY("voice_pt_voice_print_record.rec", false));
    if (((File)localObject).exists()) {
      ((File)localObject).delete();
    }
    localObject = new File(m.aY("voice_pt_voice_print_noise_detect.rec", false));
    if (((File)localObject).exists()) {
      ((File)localObject).delete();
    }
  }
  
  protected final void ym(int paramInt)
  {
    this.oFI.bJm();
    this.oFI.setErr(paramInt);
    this.oFI.bJp();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */