package com.tencent.mm.plugin.account.ui;

import com.google.android.search.verification.client.SearchActionVerificationClientActivity;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.tencent.mm.plugin.account.model.VoiceActionService;
import com.tencent.mm.sdk.platformtools.x;

public class VoiceActionActivity
  extends SearchActionVerificationClientActivity
{
  public final Class<? extends SearchActionVerificationClientService> rU()
  {
    x.d("MicroMsg.VoiceActionActivity", "getServiceClass");
    return VoiceActionService.class;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/ui/VoiceActionActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */