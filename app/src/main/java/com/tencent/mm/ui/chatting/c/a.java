package com.tencent.mm.ui.chatting.c;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import com.tencent.mm.bg.d.a;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.chatting.af;
import com.tencent.mm.ui.chatting.b.b.c;
import com.tencent.mm.ui.chatting.b.u;
import com.tencent.mm.ui.chatting.b.v;
import com.tencent.mm.ui.chatting.e;
import com.tencent.mm.ui.chatting.e.b;
import java.util.HashMap;

public final class a
{
  private static com.tencent.mm.sdk.platformtools.ag tTm = new com.tencent.mm.sdk.platformtools.ag();
  public boolean eaR = false;
  public ab oLT;
  public com.tencent.mm.ui.chatting.e.a tTn = new com.tencent.mm.ui.chatting.e.a(this);
  public b tTo = new b(this);
  public String tTp;
  public e tTq;
  public af tTr;
  public com.tencent.mm.ui.chatting.ag tTs;
  
  public a(e parame, af paramaf, com.tencent.mm.ui.chatting.ag paramag)
  {
    this.tTq = parame;
    this.tTr = paramaf;
    this.tTs = paramag;
  }
  
  public static com.tencent.mm.sdk.platformtools.ag cwt()
  {
    return tTm;
  }
  
  public final void EV(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[setSelection] pos:%s isSmooth:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(false) });
    this.tTr.EV(paramInt);
  }
  
  public final void EW(int paramInt)
  {
    this.tTr.EW(paramInt);
  }
  
  public final void Fh(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[updateOptionMenuIcon] menuID:%d iconID:%s", new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt) });
    this.tTr.updateOptionMenuIcon(2, paramInt);
  }
  
  public final <T extends u, V extends Class<T>> T O(V paramV)
  {
    com.tencent.mm.ui.chatting.e.a locala = this.tTn;
    if (!paramV.isInterface()) {
      throw new RuntimeException("[get] " + paramV + " is not a interface!");
    }
    if (locala.tXO.containsKey(paramV)) {
      return (u)locala.tXO.get(paramV);
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingComponentManager", "[get] " + paramV + " is never register! activity:%s", new Object[] { locala.bAG.tTq.getContext().getClass().getSimpleName() });
    return null;
  }
  
  public final void YC()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[hideVKB]");
    this.tTr.hideVKB();
  }
  
  public final void a(Intent paramIntent, int paramInt, d.a parama)
  {
    this.tTo.a(paramIntent, paramInt, parama);
  }
  
  public final void a(Class<? extends u> paramClass, u paramu)
  {
    com.tencent.mm.ui.chatting.e.a locala = this.tTn;
    if (locala.tXO.put(paramClass, paramu) != null) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ChattingComponentManager", "[register] %s has register", new Object[] { paramClass });
    }
    if ((paramu instanceof v))
    {
      long l1 = System.currentTimeMillis();
      ((v)paramu).a(locala.bAG);
      long l2 = System.currentTimeMillis();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingComponentManager", "[install] listener:%s cost:%sms", new Object[] { paramu.getClass().getName(), Long.valueOf(l2 - l1) });
    }
  }
  
  public final void avj()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[notifyDataSetChange]");
    this.tTr.avj();
  }
  
  public final String cuz()
  {
    return bi.aG(((c)O(c.class)).cuz(), this.oLT.field_nickname);
  }
  
  public final String cwp()
  {
    if (this.tTp == null)
    {
      this.tTp = q.GF();
      if (!ab.gY(getTalkerUserName())) {
        break label42;
      }
    }
    label42:
    for (String str = ab.XV(this.tTp);; str = this.tTp)
    {
      this.tTp = str;
      return this.tTp;
    }
  }
  
  public final boolean cwq()
  {
    String str = getTalkerUserName();
    return (ab.gY(str)) || (ab.XQ(str)) || (ab.XO(str)) || (s.hu(str));
  }
  
  public final boolean cwr()
  {
    return (s.fq(getTalkerUserName())) || (((c)O(c.class)).cus());
  }
  
  public final boolean cws()
  {
    if ((!this.oLT.ckW()) && (!s.hL(getTalkerUserName())) && (!ab.XO(getTalkerUserName()))) {
      return true;
    }
    return ((c)O(c.class)).cur();
  }
  
  public final void d(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[showDialog]");
    this.tTr.c(paramContext, paramString, paramOnCancelListener);
  }
  
  public final void dismissDialog()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[dismissDialog]");
    this.tTr.dismissDialog();
  }
  
  public final void eX(int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[setSelectionFromTop] pos:%s offset:%s isSmooth:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(false) });
    this.tTr.eX(paramInt1, paramInt2);
  }
  
  public final View findViewById(int paramInt)
  {
    return this.tTq.findViewById(paramInt);
  }
  
  public final View getChildAt(int paramInt)
  {
    return this.tTr.getChildAt(paramInt);
  }
  
  public final int getFirstVisiblePosition()
  {
    return this.tTr.getFirstVisiblePosition();
  }
  
  public final int getHeaderViewsCount()
  {
    return this.tTr.getHeaderViewsCount();
  }
  
  public final int getLastVisiblePosition()
  {
    return this.tTr.getLastVisiblePosition();
  }
  
  @Deprecated
  public final ListView getListView()
  {
    return this.tTr.getListView();
  }
  
  public final String getTalkerUserName()
  {
    if (this.oLT == null) {
      return "";
    }
    return bi.aG(this.oLT.field_username, "");
  }
  
  public final void lT(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[scrollToLast] force:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.tTr.lT(paramBoolean);
  }
  
  public final void lZ(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[showOptionMenu] menuID:%d show:%s", new Object[] { Integer.valueOf(2), Boolean.valueOf(paramBoolean) });
    this.tTr.showOptionMenu(2, paramBoolean);
  }
  
  public final void setKeepScreenOn(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[setKeepScreenOn] force:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.tTr.setKeepScreenOn(paramBoolean);
  }
  
  public final void showOptionMenu(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[showOptionMenu] show:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.tTr.showOptionMenu(paramBoolean);
  }
  
  public final void startActivity(Intent paramIntent)
  {
    this.tTq.startActivity(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */