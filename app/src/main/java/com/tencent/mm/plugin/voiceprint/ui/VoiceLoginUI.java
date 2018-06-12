package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.voiceprint.model.e;
import com.tencent.mm.plugin.voiceprint.model.n;
import com.tencent.mm.plugin.voiceprint.model.n.a;
import com.tencent.mm.pluginsdk.permission.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class VoiceLoginUI
  extends BaseVoicePrintUI
  implements n.a
{
  private String gtX = null;
  private n oGk = null;
  
  private void goBack()
  {
    setResult(0);
    finish();
  }
  
  public final void OF(String paramString)
  {
    x.d("MicroMsg.VoiceLoginUI", "onGetText");
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
    ym(R.l.voice_print_login_network_error);
  }
  
  public final void bIX()
  {
    this.oFF.setEnabled(false);
    this.oFF.setVisibility(4);
    this.oFI.bJm();
    this.oFI.setErr(R.l.voice_print_login_blocked_by_limited);
    this.oFI.bJp();
  }
  
  protected final void bJc()
  {
    x.d("MicroMsg.VoiceLoginUI", "sendVoice, filename:%s", new Object[] { this.oFK });
    if ((!bi.oW(this.oFK)) && (!bi.oW(this.oFo)))
    {
      Object localObject = this.oGk;
      localObject = new com.tencent.mm.plugin.voiceprint.model.h(this.oFK, ((n)localObject).oFp, ((n)localObject).fsy);
      ((com.tencent.mm.plugin.voiceprint.model.h)localObject).oEW = true;
      au.DF().a((l)localObject, 0);
      this.oFF.setEnabled(false);
      this.oFI.bJl();
    }
  }
  
  public final void iH(boolean paramBoolean)
  {
    this.oFI.bJm();
    this.oFF.setEnabled(true);
    if (paramBoolean)
    {
      x.i("MicroMsg.VoiceLoginUI", "login success[%s]", new Object[] { bi.Xf(this.oGk.eRp) });
      Intent localIntent = new Intent();
      localIntent.putExtra("VoiceLoginAuthPwd", this.oGk.eRp);
      setResult(-1, localIntent);
      finish();
      return;
    }
    x.i("MicroMsg.VoiceLoginUI", "login failed");
    this.oFI.setErr(R.l.voice_print_auth_error);
    this.oFI.bJp();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.h.mEJ.h(11557, new Object[] { Integer.valueOf(1) });
    this.gtX = bi.aG(getIntent().getStringExtra("Kusername"), null);
    paramBundle = bi.aG(getIntent().getStringExtra("Kvertify_key"), null);
    x.d("MicroMsg.VoiceLoginUI", "summerauth onCreate, username:%s loginTicket==null:%b", new Object[] { this.gtX, Boolean.valueOf(bi.oW(paramBundle)) });
    if ((bi.oW(this.gtX)) && (bi.oW(paramBundle)))
    {
      x.e("MicroMsg.VoiceLoginUI", "onCreate error, username and ticket are both null");
      return;
    }
    this.oGk = new n();
    this.oGk.gtX = this.gtX;
    this.oGk.fsy = paramBundle;
    this.oGk.oFr = this;
    paramBundle = this.oGk;
    if (bi.oW(paramBundle.fsy))
    {
      paramBundle = new e(paramBundle.gtX);
      au.DF().a(paramBundle, 0);
    }
    for (;;)
    {
      x.i("MicroMsg.VoiceLoginUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(a.a(this, "android.permission.RECORD_AUDIO", 80, "", "")), bi.cjd(), this });
      setBackBtn(new VoiceLoginUI.1(this));
      if (!d.fR(23)) {
        break;
      }
      getWindow().setStatusBarColor(getResources().getColor(R.e.navpage));
      cqc();
      return;
      paramBundle.bIW();
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.oGk != null)
    {
      n localn = this.oGk;
      au.DF().b(618, localn);
      au.DF().b(616, localn);
      au.DF().b(617, localn);
      localn.oFr = null;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.VoiceLoginUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      bIZ();
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_microphone_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new VoiceLoginUI.2(this), new VoiceLoginUI.3(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */