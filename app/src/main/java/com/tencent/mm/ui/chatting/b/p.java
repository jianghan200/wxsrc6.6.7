package com.tencent.mm.ui.chatting.b;

import android.os.Bundle;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.ui.chatting.ChatFooterCustom;
import com.tencent.mm.ui.chatting.b.b.ag;
import com.tencent.mm.ui.chatting.b.b.g;
import com.tencent.mm.ui.chatting.b.b.k;
import com.tencent.mm.ui.chatting.b.b.l;
import com.tencent.mm.ui.chatting.b.b.m;
import com.tencent.mm.ui.chatting.b.b.w;
import com.tencent.mm.ui.chatting.o;
import com.tencent.mm.ui.x;

@com.tencent.mm.ui.chatting.b.a.a(cwo=l.class)
public class p
  extends a
  implements l
{
  private long[] tIX = null;
  private boolean tPG = false;
  private o tPH = null;
  
  public final void cpF()
  {
    this.tPG = this.bAG.tTq.getBooleanExtra("expose_edit_mode", false).booleanValue();
    this.tIX = this.bAG.tTq.getArguments().getLongArray("expose_selected_ids");
  }
  
  public final void cpG()
  {
    if ((this.tPG) && (this.tPH == null)) {
      this.tPH = new o(this.bAG, this.tIX);
    }
  }
  
  public final void cpH()
  {
    super.cpH();
    if (this.tPH != null)
    {
      o localo = this.tPH;
      Object localObject = (g)localo.bAG.O(g.class);
      ((w)localo.bAG.O(w.class)).cvN();
      ((g)localObject).ctP();
      ((g)localObject).ctM();
      if (localo.tIX != null)
      {
        long[] arrayOfLong = localo.tIX;
        int j = arrayOfLong.length;
        int i = 0;
        while (i < j)
        {
          ((g)localObject).gt(arrayOfLong[i]);
          i += 1;
        }
      }
      localObject = ((m)localo.bAG.O(m.class)).cvb();
      if (localObject != null) {
        ((ChatFooter)localObject).setVisibility(8);
      }
      localObject = ((m)localo.bAG.O(m.class)).cvc();
      if (localObject != null) {
        ((ChatFooterCustom)localObject).setVisibility(8);
      }
      ((k)localo.bAG.O(k.class)).cuY();
      localo.bAG.YC();
      ((ag)localo.bAG.O(ag.class)).cwm();
      localo.bAG.lZ(true);
    }
  }
  
  public final boolean cva()
  {
    return this.tPG;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/b/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */