package com.tencent.mm.plugin.auto.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ah;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.sdk.platformtools.x;

public class MMAutoMessageReplyReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = com.tencent.mm.sdk.platformtools.s.j(paramIntent, "key_username");
    if (str == null) {
      return;
    }
    paramContext = ah.getResultsFromIntent(paramIntent);
    if (paramContext != null) {}
    for (paramContext = paramContext.getCharSequence("key_voice_reply_text"); paramContext == null; paramContext = null)
    {
      x.i("MicroMsg.auto.MMAutoMessageReplyReceiver", "username %s reply null", new Object[] { str });
      return;
    }
    x.i("MicroMsg.auto.MMAutoMessageReplyReceiver", "username %s reply %s", new Object[] { str, paramContext.toString() });
    g.bcT().D(str, paramContext.toString(), com.tencent.mm.model.s.hQ(str));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/auto/service/MMAutoMessageReplyReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */