package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.mm.a.e;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.a.d;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.chat.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.FileInputStream;

public final class w
  implements j
{
  private Context context;
  private ab guS;
  private String tJc;
  private boolean tLT = true;
  private boolean tLU = true;
  
  public w(Context paramContext, ab paramab, String paramString)
  {
    this.context = paramContext;
    this.guS = paramab;
    this.tJc = paramString;
    if (ab.gY(this.tJc)) {
      this.tLU = false;
    }
    if (ab.XQ(this.tJc)) {
      this.tLT = false;
    }
    if (ab.XO(this.tJc)) {
      this.tLT = false;
    }
    if ((this.guS != null) && (ab.gY(this.guS.field_username))) {
      paramContext = this.tJc;
    }
    for (;;)
    {
      if (com.tencent.mm.model.s.ha(paramContext)) {
        this.tLU = false;
      }
      return;
      if (this.guS == null) {
        paramContext = null;
      } else {
        paramContext = this.guS.field_username;
      }
    }
  }
  
  public final boolean bcO()
  {
    return this.tLU;
  }
  
  public final boolean bcP()
  {
    return this.tLT;
  }
  
  public final void bcQ() {}
  
  public final void l(EmojiInfo paramEmojiInfo)
  {
    au.HU();
    if (!com.tencent.mm.model.c.isSDCardAvailable()) {
      com.tencent.mm.ui.base.s.gH(this.context);
    }
    while (paramEmojiInfo == null) {
      return;
    }
    if ((this.guS.field_username.equals("medianote")) && ((q.GJ() & 0x4000) == 0)) {}
    for (int i = 1; i != 0; i = 0)
    {
      paramEmojiInfo.field_start = 0;
      paramEmojiInfo.field_state = EmojiInfo.tcP;
      ((com.tencent.mm.plugin.emoji.b.c)g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().d(paramEmojiInfo);
      localObject = new com.tencent.mm.storage.bd();
      ((com.tencent.mm.storage.bd)localObject).setType(47);
      ((com.tencent.mm.storage.bd)localObject).ep("medianote");
      ((com.tencent.mm.storage.bd)localObject).eX(1);
      if (paramEmojiInfo.aaq()) {
        ((com.tencent.mm.storage.bd)localObject).setContent(an.a(q.GF(), 0L, false, paramEmojiInfo.Xh(), false, ""));
      }
      ((com.tencent.mm.storage.bd)localObject).eq(paramEmojiInfo.Xh());
      ((com.tencent.mm.storage.bd)localObject).ay(com.tencent.mm.model.bd.iD(((cm)localObject).field_talker));
      ((com.tencent.mm.storage.bd)localObject).setStatus(2);
      au.HU();
      com.tencent.mm.model.c.FT().T((com.tencent.mm.storage.bd)localObject);
      return;
    }
    d locald = ((com.tencent.mm.plugin.emoji.b.c)g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr();
    if (bi.oW(this.tJc)) {}
    for (Object localObject = this.guS.field_username;; localObject = this.tJc)
    {
      locald.a((String)localObject, paramEmojiInfo, null);
      return;
    }
  }
  
  public final void m(EmojiInfo paramEmojiInfo)
  {
    au.HU();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.s.gH(this.context);
      return;
    }
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    Object localObject = new StringBuilder();
    au.HU();
    localObject = com.tencent.mm.model.c.Gg() + paramEmojiInfo.Xh();
    if (e.cn((String)localObject + "_thumb"))
    {
      int i = e.cm((String)localObject + "_thumb");
      localWXMediaMessage.thumbData = e.e((String)localObject + "_thumb", 0, i);
    }
    for (;;)
    {
      localWXMediaMessage.mediaObject = new WXEmojiObject((String)localObject);
      l.a(localWXMediaMessage, paramEmojiInfo.field_app_id, null, this.tJc, 1, paramEmojiInfo.Xh());
      return;
      try
      {
        FileInputStream localFileInputStream = new FileInputStream((String)localObject);
        localWXMediaMessage.setThumbImage(BackwardSupportUtil.b.a(localFileInputStream, 1.0F));
        localFileInputStream.close();
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.ChattingSmileyPanelImpl", localException, "", new Object[0]);
        x.e("MicroMsg.ChattingSmileyPanelImpl", "sendAppMsgEmoji Fail cause there is no thumb");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */