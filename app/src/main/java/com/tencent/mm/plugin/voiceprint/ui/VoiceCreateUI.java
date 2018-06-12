package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.plugin.voiceprint.model.f;
import com.tencent.mm.plugin.voiceprint.model.l;
import com.tencent.mm.plugin.voiceprint.model.l.a;
import com.tencent.mm.plugin.voiceprint.model.m;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class VoiceCreateUI
  extends BaseVoicePrintUI
  implements l.a
{
  private View hZE = null;
  private int oFn = 1;
  private l oGb;
  private com.tencent.mm.plugin.voiceprint.model.o oGc = null;
  private View oGd;
  private NoiseDetectMaskView oGe;
  private Button oGf = null;
  private int oGg = 0;
  private c oGh = new VoiceCreateUI.1(this);
  
  private void bJi()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("KIsCreateSuccess", false);
    setResult(-1, localIntent);
  }
  
  private void start()
  {
    x.d("MicroMsg.VoiceCreateUI", "start create");
    this.oGc.reset();
    Object localObject = this.oGe;
    if (((NoiseDetectMaskView)localObject).eWx != null) {
      ((NoiseDetectMaskView)localObject).eWx.setVisibility(0);
    }
    ((NoiseDetectMaskView)localObject).oFU.setText(R.l.voice_print_noise_detecting);
    ((NoiseDetectMaskView)localObject).oFV.setVisibility(8);
    x.d("MicroMsg.VoiceCreateUI", "start noise detect");
    this.hZE.setVisibility(4);
    this.oGd.setVisibility(4);
    this.oFG.setVisibility(4);
    this.oGe.setVisibility(0);
    localObject = this.oGc;
    x.d("MicroMsg.VoicePrintNoiseDetector", "start detect noise");
    ((com.tencent.mm.plugin.voiceprint.model.o)localObject).reset();
    String str = m.aY("voice_pt_voice_print_noise_detect.rec", true);
    if (!((com.tencent.mm.plugin.voiceprint.model.o)localObject).oFs.dc(str))
    {
      ((com.tencent.mm.plugin.voiceprint.model.o)localObject).oFs.we();
      ((com.tencent.mm.plugin.voiceprint.model.o)localObject).reset();
      x.d("MicroMsg.VoicePrintNoiseDetector", "start record fail");
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.voiceprint.model.o)localObject).oFt.J(100L, 100L);
      return;
      x.d("MicroMsg.VoicePrintNoiseDetector", "start record");
    }
  }
  
  public final void OD(String paramString)
  {
    x.d("MicroMsg.VoiceCreateUI", "onGetFirstText");
    bIZ();
    this.oFo = paramString;
    this.oFI.bJm();
    this.oFI.bJn();
    this.oFI.setTipText(paramString);
    this.oFF.setEnabled(true);
  }
  
  public final void OE(String paramString)
  {
    x.d("MicroMsg.VoiceCreateUI", "onGetSecondText");
    this.oFo = paramString;
    this.oFI.bJm();
    this.oFI.bJn();
    this.oFI.setTipText(paramString);
    this.oFF.setEnabled(true);
  }
  
  protected final void aZW()
  {
    this.oGb = new l(this);
    findViewById(R.h.right_btn).setVisibility(8);
    this.oFI.setTitleText(R.l.voice_read_title);
    this.oFI.bJo();
    this.oFF.setEnabled(false);
    this.oGc = new com.tencent.mm.plugin.voiceprint.model.o();
    this.oGd = findViewById(R.h.voice_bottom);
    this.oGe = ((NoiseDetectMaskView)findViewById(R.h.mask));
    this.hZE = findViewById(R.h.left_btn);
    this.oGf = ((Button)findViewById(R.h.right_btn));
    this.oGf.setVisibility(8);
    this.oGf.setOnClickListener(new VoiceCreateUI.2(this));
    this.oGe.setOnClickRetryCallback(new VoiceCreateUI.3(this));
    this.oGe.setOnCancelDetectCallback(new VoiceCreateUI.4(this));
    com.tencent.mm.sdk.b.a.sFg.b(this.oGh);
    this.hZE.setOnClickListener(new VoiceCreateUI.5(this));
    start();
  }
  
  public final void bIV()
  {
    bJb();
    bJi();
  }
  
  protected final void bJc()
  {
    x.d("MicroMsg.VoiceCreateUI", "sendVoice, filename:%s", new Object[] { this.oFK });
    if (!bi.oW(this.oFK))
    {
      this.oFF.setEnabled(false);
      this.oFI.bJl();
      if (this.oFn != 1) {
        break label97;
      }
      locall = this.oGb;
      localf = new f(this.oFK, 71, locall.oFp, 0);
      localf.oEW = true;
      au.DF().a(localf, 0);
      locall.oFn = 71;
    }
    label97:
    while (this.oFn != 2) {
      return;
    }
    l locall = this.oGb;
    f localf = new f(this.oFK, 72, locall.oFp, locall.oEZ);
    localf.oEW = true;
    au.DF().a(localf, 0);
    locall.oFn = 72;
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    bJi();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    l locall = this.oGb;
    au.DF().b(611, locall);
    au.DF().b(612, locall);
    locall.oFq = null;
    com.tencent.mm.sdk.b.a.sFg.c(this.oGh);
  }
  
  public final void u(boolean paramBoolean, int paramInt)
  {
    x.d("MicroMsg.VoiceCreateUI", "onCreate, result:%b, step:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (paramBoolean)
    {
      switch (paramInt)
      {
      default: 
        return;
      case 71: 
        x.d("MicroMsg.VoiceCreateUI", "finish create step 1");
        this.oFF.setEnabled(false);
        this.oFn = 2;
        bJa();
        a.a(this.oFI, new VoiceCreateUI.7(this));
        return;
      }
      this.oGg = 0;
      x.d("MicroMsg.VoiceCreateUI", "finish create step 2");
      Intent localIntent = new Intent();
      localIntent.putExtra("KIsCreateSuccess", true);
      setResult(-1, localIntent);
      localIntent = new Intent();
      localIntent.setClass(this, VoicePrintFinishUI.class);
      localIntent.putExtra("kscene_type", 72);
      startActivity(localIntent);
      finish();
      return;
    }
    switch (paramInt)
    {
    case 71: 
    default: 
      return;
    }
    bJi();
    this.oGg += 1;
    if (this.oGg >= 2)
    {
      x.d("MicroMsg.VoiceCreateUI", "in second step, verify two times failed");
      this.oGg = 0;
      startActivity(new Intent(this, VoiceReCreatePromptUI.class));
      overridePendingTransition(R.a.slide_right_in, R.a.slide_left_out);
      finish();
      return;
    }
    this.oFF.setEnabled(true);
    this.oFI.bJm();
    this.oFI.setErr(R.l.voice_regeist_error);
    this.oFI.bJp();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */