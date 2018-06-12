package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.chatting.b.b.g;
import com.tencent.mm.ui.chatting.c.a;
import com.tencent.mm.ui.s.b;
import com.tencent.mm.ui.x;

public final class o
{
  public a bAG;
  public long[] tIX = null;
  
  public o(a parama, long[] paramArrayOfLong)
  {
    this.bAG = parama;
    this.tIX = paramArrayOfLong;
    this.bAG.tTq.removeAllOptionMenu();
    this.bAG.tTq.addTextOptionMenu$7df2a0ca(2, this.bAG.tTq.getMMResources().getString(R.l.biz_report_confirm), new o.1(this), null, s.b.tmX);
    parama = (g)this.bAG.O(g.class);
    parama.c(new o.2(this, parama));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */