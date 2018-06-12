package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class VoiceReCreatePromptUI
  extends MMActivity
  implements View.OnClickListener
{
  private View oGK = null;
  
  protected final int getLayoutId()
  {
    return R.i.voice_print_recreate_prompt;
  }
  
  public void onClick(View paramView)
  {
    startActivity(new Intent(this, VoiceCreateUI.class));
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.oGK = findViewById(R.h.recreate_button);
    this.oGK.setOnClickListener(this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/ui/VoiceReCreatePromptUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */