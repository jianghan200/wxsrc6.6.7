package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.ar.b;
import com.tencent.mm.ar.r;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.a;
import java.lang.ref.WeakReference;

final class ag
  implements ae.a
{
  public final void b(b.a parama, int paramInt, com.tencent.mm.ui.chatting.c.a parama1, bd parambd)
  {
    String str = parama1.getTalkerUserName();
    parama = (ae.b)parama;
    Bundle localBundle = new Bundle();
    localBundle.putString("conv_talker_username", str);
    if ((parama1.tTq instanceof AppBrandServiceChattingUI.a))
    {
      paramInt = 10;
      localBundle.putInt("scene", paramInt);
      localBundle.putLong("msg_id", parambd.field_msgId);
      localBundle.putLong("msg_sever_id", parambd.field_msgSvrId);
      localBundle.putString("send_msg_username", parambd.field_talker);
      com.tencent.mm.plugin.messenger.a.e locale = (com.tencent.mm.plugin.messenger.a.e)g.l(com.tencent.mm.plugin.messenger.a.e.class);
      long l = parambd.field_msgId;
      parambd = parambd.field_content;
      WeakReference localWeakReference = new WeakReference(parama1.tTq.getContext());
      new WeakReference(parama.ucQ);
      parambd = locale.a(parambd, localBundle, localWeakReference);
      if ((parambd != null) && (parambd.length() != 0)) {
        break label338;
      }
      parama.jEz.setVisibility(8);
      label177:
      parambd = r.Qq().mw(str);
      au.HU();
      paramInt = ((Integer)c.DT().get(12311, Integer.valueOf(-2))).intValue();
      if (((parambd == null) || (parambd.ecv == -2)) && ((parambd != null) || (paramInt == -2))) {
        break label368;
      }
      parama.ucQ.setTextColor(parama1.tTq.getContext().getResources().getColor(R.e.black_text_color));
      parama.ucQ.setBackground(parama1.tTq.getContext().getResources().getDrawable(R.g.chat_tips_light_bg));
    }
    for (;;)
    {
      parama.ucQ.setOnClickListener(new ag.1(this));
      parama.ucQ.invalidate();
      return;
      if (parama1.cwr())
      {
        paramInt = 2;
        break;
      }
      if (s.hf(str))
      {
        paramInt = 7;
        break;
      }
      paramInt = 1;
      break;
      label338:
      parama.jEz.setVisibility(0);
      parama.ucQ.setText(parambd);
      parama.ucQ.setMovementMethod(ay.getInstance());
      break label177;
      label368:
      parama.ucQ.setTextColor(parama1.tTq.getContext().getResources().getColor(R.e.white_text_color));
      parama.ucQ.setBackground(parama1.tTq.getContext().getResources().getDrawable(R.g.chat_tips_bg));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */