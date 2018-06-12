package com.tencent.mm.ui.chatting.b;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.chatting.ak;
import com.tencent.mm.ui.chatting.am;
import com.tencent.mm.ui.chatting.b.b.ah;
import com.tencent.mm.ui.chatting.k;
import com.tencent.mm.y.g.a;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.chatting.b.a.a(cwo=ah.class)
public class o
  extends a
  implements ah
{
  private com.tencent.mm.sdk.b.c tPC = new o.1(this);
  
  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.c.a parama, com.tencent.mm.storage.bd parambd)
  {
    boolean bool2 = true;
    boolean bool1;
    label114:
    Object localObject;
    switch (paramMenuItem.getItemId())
    {
    default: 
      bool1 = false;
    case 104: 
      do
      {
        return bool1;
        if (parambd.cml()) {
          break;
        }
        bool1 = bool2;
      } while (!parambd.cmm());
      if (parambd.cml())
      {
        paramMenuItem = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi(parambd.field_imgPath);
        localObject = parambd.field_talker;
        if (com.tencent.mm.model.s.fq((String)localObject))
        {
          parambd = com.tencent.mm.model.bd.iB(parambd.field_content);
          label136:
          ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a(parama.tTq.getContext(), paramMenuItem, 0, parambd);
          return true;
        }
      }
      else
      {
        localObject = an.YJ(parambd.field_content);
        paramMenuItem = g.a.J(parambd.field_content, parambd.field_reserved);
        if (paramMenuItem != null) {
          break label862;
        }
        paramMenuItem = new g.a();
        paramMenuItem.dwq = ((an)localObject).bKg;
      }
      break;
    }
    label364:
    label532:
    label626:
    label848:
    label862:
    for (;;)
    {
      bool1 = bool2;
      if (bi.oW(paramMenuItem.dwq)) {
        break;
      }
      bool1 = bool2;
      if (paramMenuItem.dwq.equals("-1")) {
        break;
      }
      paramMenuItem = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi(paramMenuItem.dwq);
      break label114;
      return bB(parambd);
      if ((parambd.cml()) || (parambd.cmm()))
      {
        am.d(parambd, parama.tTq.getContext());
        return true;
      }
      return false;
      if (!parambd.cml())
      {
        bool1 = bool2;
        if (!parambd.cmm()) {
          break;
        }
      }
      paramMenuItem = new LinkedList();
      paramMenuItem.add(parambd);
      if ((((com.tencent.mm.ui.chatting.b.b.c)parama.O(com.tencent.mm.ui.chatting.b.b.c.class)).cus()) || (com.tencent.mm.model.s.fq(parama.getTalkerUserName())))
      {
        bool1 = true;
        k.a(parama.tTq.getContext(), paramMenuItem, bool1, parama.getTalkerUserName(), null);
        if (!parambd.cml()) {
          break label532;
        }
      }
      for (paramMenuItem = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi(parambd.field_imgPath);; paramMenuItem = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi(paramMenuItem.bKg))
      {
        bool1 = bool2;
        if (paramMenuItem == null) {
          break;
        }
        localObject = parama.getTalkerUserName();
        parama = (com.tencent.mm.ui.chatting.c.a)localObject;
        if (com.tencent.mm.model.s.fq((String)localObject)) {
          parama = com.tencent.mm.model.bd.iB(parambd.field_content);
        }
        h.mEJ.h(12789, new Object[] { Integer.valueOf(1), paramMenuItem.Xh(), Integer.valueOf(0), paramMenuItem.field_designerID, paramMenuItem.field_groupId, parama, "", "", "", paramMenuItem.field_activityid });
        return true;
        bool1 = false;
        break label364;
        paramMenuItem = an.YJ(parambd.field_content);
        bool1 = bool2;
        if (bi.oW(paramMenuItem.bKg)) {
          break;
        }
        bool1 = bool2;
        if (paramMenuItem.bKg.equals("-1")) {
          break;
        }
      }
      if (parambd.cml())
      {
        paramMenuItem = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi(parambd.field_imgPath);
        if (paramMenuItem != null) {
          h.mEJ.h(12789, new Object[] { Integer.valueOf(2), paramMenuItem.Xh(), Integer.valueOf(0), paramMenuItem.field_designerID, paramMenuItem.field_groupId, "", "", "", "", "", paramMenuItem.field_activityid });
        }
        if (paramMenuItem != null) {
          break label848;
        }
      }
      for (paramMenuItem = "";; paramMenuItem = paramMenuItem.field_groupId)
      {
        bool1 = bool2;
        if (bi.oW(paramMenuItem)) {
          break;
        }
        parambd = new Intent();
        parambd.putExtra("preceding_scence", 3);
        parambd.putExtra("download_entrance_scene", 16);
        parambd.putExtra("extra_id", paramMenuItem);
        com.tencent.mm.bg.d.b(parama.tTq.getContext(), "emoji", ".ui.EmojiStoreDetailUI", parambd);
        return true;
        paramMenuItem = an.YJ(parambd.field_content);
        bool1 = bool2;
        if (bi.oW(paramMenuItem.bKg)) {
          break;
        }
        bool1 = bool2;
        if (paramMenuItem.bKg.equals("-1")) {
          break;
        }
        paramMenuItem = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi(paramMenuItem.bKg);
        break label626;
      }
      parambd = (com.tencent.mm.storage.bd)localObject;
      break label136;
    }
  }
  
  public final boolean bB(com.tencent.mm.storage.bd parambd)
  {
    x.i("MicroMsg.ChattingUI.EmojiComponent", "[resendEmoji] %d", new Object[] { Long.valueOf(parambd.field_msgId) });
    if (parambd.cml())
    {
      au.HU();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        com.tencent.mm.ui.base.s.gH(this.bAG.tTq.getContext());
        return true;
      }
      x.d("MicroMsg.ChattingUI.EmojiComponent", "resendEmoji");
      if (!this.bAG.getTalkerUserName().equals("medianote"))
      {
        au.HU();
        com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.e(parambd.field_talker, parambd.field_msgSvrId));
      }
      ak.aJ(parambd);
      return true;
    }
    if (parambd.cmm())
    {
      x.d("MicroMsg.ChattingUI.EmojiComponent", "resendAppMsgEmoji");
      if (!this.bAG.getTalkerUserName().equals("medianote"))
      {
        au.HU();
        com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.e(parambd.field_talker, parambd.field_msgSvrId));
      }
      ak.aK(parambd);
      this.bAG.lT(true);
      return true;
    }
    return false;
  }
  
  public final void cpH()
  {
    x.i("MicroMsg.ChattingUI.EmojiComponent", "[onChattingEnterAnimEnd]");
    com.tencent.mm.sdk.b.a.sFg.b(this.tPC);
  }
  
  public final void cpK()
  {
    x.i("MicroMsg.ChattingUI.EmojiComponent", "[onChattingExitAnimStart]");
    com.tencent.mm.sdk.b.a.sFg.c(this.tPC);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/chatting/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */