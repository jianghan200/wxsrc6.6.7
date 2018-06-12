package com.tencent.mm.ui.chatting;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.ao;
import com.tencent.mm.model.s;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.b.b.o;
import com.tencent.mm.ui.chatting.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class z
  implements ao
{
  public a bAG;
  public ac tMr;
  
  public z(a parama)
  {
    this.bAG = parama;
    this.tMr = new ac();
  }
  
  private void dE(List<bd> paramList)
  {
    if ((this.tMr != null) && (this.bAG != null)) {
      this.tMr.a(this.bAG.tTq.getContext(), paramList);
    }
  }
  
  public final void B(List<bd> paramList)
  {
    if (this.bAG == null) {
      x.w("MicroMsg.ChattingUIKeywordChecker", "chatting ui is null.");
    }
    while (s.fq(this.bAG.getTalkerUserName())) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      bd localbd = (bd)paramList.next();
      if ((localbd.field_talker.equals(this.bAG.getTalkerUserName())) && (localbd.isText())) {
        localArrayList.add(localbd);
      }
    }
    dE(localArrayList);
  }
  
  public final void a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Bundle paramBundle) {}
  
  public final void a(bd parambd)
  {
    if (this.bAG.O(o.class) == null) {
      x.w("MicroMsg.ChattingUIKeywordChecker", "chatting ui maybe has exit!");
    }
    do
    {
      return;
      ((o)this.bAG.O(o.class)).cvn();
    } while ((!parambd.field_talker.equals(this.bAG.getTalkerUserName())) || (!parambd.isText()));
    aF(parambd);
  }
  
  public final void aF(bd parambd)
  {
    if (parambd == null) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(parambd);
    dE(localArrayList);
  }
  
  public final Looper getLooper()
  {
    return Looper.getMainLooper();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */