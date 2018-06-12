package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.ar.b;
import com.tencent.mm.ar.r;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.chatting.e;

final class af
  implements ae.a
{
  public final void b(b.a parama, int paramInt, com.tencent.mm.ui.chatting.c.a parama1, bd parambd)
  {
    parama = (ae.b)parama;
    parama.ucQ.setText(parambd.field_content);
    Bundle localBundle = new Bundle();
    localBundle.putString("chatroom_name", parama1.getTalkerUserName());
    localBundle.putLong("msg_id", parambd.field_msgId);
    if ((parambd.field_flag & 0x8) != 0)
    {
      j.a(parama.ucQ, false, localBundle);
      parama.ucQ.setClickable(true);
      parambd = r.Qq().mw(parama1.getTalkerUserName());
      au.HU();
      paramInt = ((Integer)c.DT().get(12311, Integer.valueOf(-2))).intValue();
      if (((parambd == null) || (parambd.ecv == -2)) && ((parambd != null) || (paramInt == -2))) {
        break label209;
      }
      parama.ucQ.setTextColor(parama1.tTq.getContext().getResources().getColor(R.e.black_text_color));
      parama.ucQ.setBackground(parama1.tTq.getContext().getResources().getDrawable(R.g.chat_tips_light_bg));
    }
    for (;;)
    {
      parama.ucQ.invalidate();
      return;
      j.a(parama.ucQ, localBundle);
      break;
      label209:
      parama.ucQ.setTextColor(parama1.tTq.getContext().getResources().getColor(R.e.white_text_color));
      parama.ucQ.setBackground(parama1.tTq.getContext().getResources().getDrawable(R.g.chat_tips_bg));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */