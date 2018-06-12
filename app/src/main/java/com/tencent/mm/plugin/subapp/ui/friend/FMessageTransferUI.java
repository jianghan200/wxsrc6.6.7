package com.tencent.mm.plugin.subapp.ui.friend;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.az.d;
import com.tencent.mm.model.al;
import com.tencent.mm.model.au;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class FMessageTransferUI
  extends MMActivity
{
  private int bzH;
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("friend_message_transfer_username");
    d.SF().YK(paramBundle);
    d.SF().clR();
    String str1 = getIntent().getAction();
    String str2 = "friend_message_accept_" + paramBundle;
    this.bzH = (0x7F000000 | 0x7FFFFFFF & paramBundle.hashCode());
    au.getNotification().cancel(this.bzH);
    if (str2.equals(str1)) {
      a.g(this.mController.tml, paramBundle, true);
    }
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/friend/FMessageTransferUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */