package com.tencent.mm.ui.chatting.b;

import android.content.res.Resources;
import android.view.MenuItem;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.rt;
import com.tencent.mm.g.a.ru;
import com.tencent.mm.g.a.ru.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.chatting.b.b.ae;
import com.tencent.mm.ui.chatting.e;
import com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate.b;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.HashMap;

@com.tencent.mm.ui.chatting.b.a.a(cwo=ae.class)
public class al
  extends a
  implements ae
{
  private at tSV = new at(5, "msg-translate-update-worker");
  private HashMap<Long, ChattingItemTranslate.b> tSW = new HashMap();
  private com.tencent.mm.sdk.b.c tSX = new al.2(this);
  
  private void f(com.tencent.mm.storage.bd parambd, boolean paramBoolean)
  {
    if ((parambd.cmt()) && (!paramBoolean)) {
      if (parambd.cmy())
      {
        if (parambd.cmt()) {
          parambd.eC(parambd.cqa & 0xFFFFFFEF);
        }
        a(parambd.field_msgId, ChattingItemTranslate.b.uep);
        com.tencent.mm.modelstat.b.ehL.a(parambd, false);
        au.HU();
        com.tencent.mm.model.c.FT().a(parambd.field_msgId, parambd);
        this.bAG.avj();
      }
    }
    while (bc(parambd) == ChattingItemTranslate.b.uer) {
      for (;;)
      {
        return;
        parambd.cmz();
        a(parambd.field_msgId, ChattingItemTranslate.b.ues);
        com.tencent.mm.modelstat.b.ehL.a(parambd, true);
      }
    }
    rt localrt = new rt();
    localrt.ccE.ccG = false;
    localrt.ccE.id = parambd.field_msgId;
    localrt.ccE.ccF = parambd.field_content;
    localrt.ccE.ccH = parambd.cGM;
    if ((!this.bAG.cwr()) || (parambd.field_isSend == 1)) {}
    for (localrt.ccE.type = 0;; localrt.ccE.type = 1)
    {
      localrt.ccE.bhd = this.bAG.getTalkerUserName();
      com.tencent.mm.sdk.b.a.sFg.m(localrt);
      a(parambd.field_msgId, ChattingItemTranslate.b.uer);
      break;
    }
  }
  
  public final void a(long paramLong, ChattingItemTranslate.b paramb)
  {
    this.tSW.put(Long.valueOf(paramLong), paramb);
  }
  
  public final boolean b(MenuItem paramMenuItem, com.tencent.mm.storage.bd parambd)
  {
    int j = paramMenuItem.getItemId();
    switch (j)
    {
    default: 
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.TranslateComponent", "longclick transalte type: %d isShowTranslated: %s", new Object[] { Integer.valueOf(parambd.getType()), Boolean.valueOf(parambd.cmy()) });
    int i;
    if (j == 124)
    {
      au.HU();
      if (!((Boolean)com.tencent.mm.model.c.DT().get(327712, Boolean.valueOf(false))).booleanValue())
      {
        i = R.l.chatting_translate_tips_content;
        au.HU();
        com.tencent.mm.model.c.DT().set(327712, Boolean.valueOf(true));
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        c.a locala = new c.a(this.bAG.tTq.getContext());
        locala.abu(this.bAG.tTq.getMMResources().getString(i));
        locala.abt(this.bAG.tTq.getMMResources().getString(R.l.chatting_translate_tips_title));
        locala.Gt(R.l.i_know_it).a(new al.3(this, parambd, paramMenuItem, j));
        locala.anj().show();
        return true;
        if (j == 125)
        {
          au.HU();
          if (!((Boolean)com.tencent.mm.model.c.DT().get(327713, Boolean.valueOf(false))).booleanValue())
          {
            i = R.l.chatting_retranslate_tips_content;
            au.HU();
            com.tencent.mm.model.c.DT().set(327713, Boolean.valueOf(true));
          }
        }
      }
      else
      {
        paramMenuItem.getGroupId();
        if (j == 125) {}
        for (boolean bool = true;; bool = false)
        {
          f(parambd, bool);
          return true;
        }
      }
      i = 0;
    }
  }
  
  public final ChattingItemTranslate.b bc(com.tencent.mm.storage.bd parambd)
  {
    ChattingItemTranslate.b localb = (ChattingItemTranslate.b)this.tSW.get(Long.valueOf(parambd.field_msgId));
    Object localObject = localb;
    if (localb == null)
    {
      if (!parambd.cmt()) {
        break label48;
      }
      if (parambd.cmy()) {
        localObject = ChattingItemTranslate.b.ues;
      }
    }
    else
    {
      return (ChattingItemTranslate.b)localObject;
    }
    return ChattingItemTranslate.b.uep;
    label48:
    localObject = new ru();
    ((ru)localObject).ccI.id = parambd.field_msgId;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    if (((ru)localObject).ccJ.ccK)
    {
      localObject = ChattingItemTranslate.b.uer;
      a(parambd.field_msgId, (ChattingItemTranslate.b)localObject);
      return (ChattingItemTranslate.b)localObject;
    }
    return ChattingItemTranslate.b.uep;
  }
  
  public final String bd(com.tencent.mm.storage.bd parambd)
  {
    String str = parambd.field_content;
    int i = parambd.field_isSend;
    parambd = str;
    if (s.fq(this.bAG.getTalkerUserName()))
    {
      parambd = str;
      if (str != null)
      {
        parambd = str;
        if (i == 0) {
          parambd = com.tencent.mm.model.bd.iC(str);
        }
      }
    }
    return parambd;
  }
  
  public final void cpH()
  {
    this.tSW.clear();
    com.tencent.mm.sdk.b.a.sFg.b(this.tSX);
  }
  
  public final void cpK()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.tSX);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/chatting/b/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */