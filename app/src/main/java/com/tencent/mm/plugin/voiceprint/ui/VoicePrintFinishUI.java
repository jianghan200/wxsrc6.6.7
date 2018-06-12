package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class VoicePrintFinishUI
  extends MMActivity
{
  private TextView gsY;
  private TextView oGm;
  private Button oGn;
  private ImageView oGo;
  private int oGp;
  
  protected final int getLayoutId()
  {
    return R.i.voice_print_finish;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    x.i("MicroMsg.VoicePrintFinishUI", "VoicePrintFinishUI");
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.oGp = getIntent().getIntExtra("kscene_type", 73);
    x.d("MicroMsg.VoicePrintFinishUI", "onCreate, sceneType:%d", new Object[] { Integer.valueOf(this.oGp) });
    this.gsY = ((TextView)findViewById(R.h.voice_print_title));
    this.oGm = ((TextView)findViewById(R.h.voice_print_title_tip));
    this.oGn = ((Button)findViewById(R.h.right_btn));
    this.oGo = ((ImageView)findViewById(R.h.voice_print_sucesss_icon));
    switch (this.oGp)
    {
    }
    for (;;)
    {
      this.oGn.setOnClickListener(new VoicePrintFinishUI.1(this));
      setBackBtn(new VoicePrintFinishUI.2(this));
      return;
      this.gsY.setText(R.l.voice_regeist_finish);
      this.oGm.setText(R.l.voice_regeist_finish_tip);
      this.oGo.setVisibility(0);
      this.oGn.setText(R.l.settings_voiceprint_unlock);
      continue;
      this.gsY.setVisibility(8);
      this.oGm.setText(R.l.voice_unlock_ok_tip);
      this.oGo.setVisibility(0);
      this.oGn.setText(R.l.settings_voiceprint_unlock_finish);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/ui/VoicePrintFinishUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */