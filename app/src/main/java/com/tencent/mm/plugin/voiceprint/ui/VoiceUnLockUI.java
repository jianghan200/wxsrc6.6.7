package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.voiceprint.model.d;
import com.tencent.mm.plugin.voiceprint.model.j;
import com.tencent.mm.plugin.voiceprint.model.q;
import com.tencent.mm.plugin.voiceprint.model.q.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class VoiceUnLockUI
  extends BaseVoicePrintUI
  implements q.a
{
  private q oGR;
  
  public final void OF(String paramString)
  {
    this.oFo = paramString;
    this.oFI.bJn();
    this.oFI.setTipText(paramString);
    this.oFI.bJm();
    this.oFF.setEnabled(true);
  }
  
  protected final void aZW()
  {
    findViewById(R.h.right_btn).setVisibility(8);
    this.oFI.bJl();
    this.oFI.setTitleText(R.l.voice_print_auth_title);
    this.oFI.bJo();
    this.oFF.setEnabled(false);
  }
  
  public final void bIV()
  {
    bJb();
  }
  
  protected final void bJc()
  {
    x.d("MicroMsg.VoiceUnLockUI", "sendVoice, filename:%s", new Object[] { this.oFK });
    if ((!bi.oW(this.oFK)) && (!bi.oW(this.oGR.oFo)))
    {
      Object localObject = this.oGR;
      localObject = new j(this.oFK, ((q)localObject).oFp);
      ((j)localObject).oEW = true;
      au.DF().a((l)localObject, 0);
      this.oFF.setEnabled(false);
      this.oFI.bJl();
    }
  }
  
  protected void bJk()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("kscene_type", 73);
    localIntent.setClass(this, VoicePrintFinishUI.class);
    startActivity(localIntent);
    finish();
  }
  
  public final void iI(boolean paramBoolean)
  {
    this.oFI.bJm();
    this.oFF.setEnabled(true);
    if (paramBoolean)
    {
      x.d("MicroMsg.VoiceUnLockUI", "unlock success");
      bJk();
      return;
    }
    this.oFI.setErr(R.l.voice_print_auth_error);
    this.oFI.bJp();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.oGR = new q(this);
    x.d("MicroMsg.VoicePrintUnLockService", "getVoiceText");
    au.DF().a(new d(73, ""), 0);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    q localq = this.oGR;
    au.DF().b(611, localq);
    au.DF().b(613, localq);
    localq.oFE = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */