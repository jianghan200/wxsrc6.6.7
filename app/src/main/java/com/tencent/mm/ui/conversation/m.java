package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.mm.ab.o;
import com.tencent.mm.ax.a;
import com.tencent.mm.g.a.jf;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.account.friend.a.al;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  implements a
{
  Activity bOb;
  c ifd = null;
  MessageQueue.IdleHandler tjO;
  Runnable uhD = new m.10(this);
  g unL;
  ConversationWithAppBrandListView uqX;
  c uru = null;
  c urv = null;
  
  public final void p(String paramString1, String paramString2, String paramString3)
  {
    if (this.unL != null) {
      this.unL.notifyDataSetChanged();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/conversation/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */