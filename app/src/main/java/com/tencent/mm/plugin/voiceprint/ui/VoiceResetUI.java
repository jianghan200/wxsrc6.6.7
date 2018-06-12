package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Intent;
import com.tencent.mm.sdk.platformtools.x;

public class VoiceResetUI
  extends VoiceUnLockUI
{
  protected final void bJk()
  {
    x.d("MicroMsg.VoiceResetUI", "unlock success");
    startActivity(new Intent(this, VoiceCreateUI.class));
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/ui/VoiceResetUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */