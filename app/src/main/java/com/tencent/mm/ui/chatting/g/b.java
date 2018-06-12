package com.tencent.mm.ui.chatting.g;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.HandlerThread;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.g;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.g.a.ch.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.pluginsdk.model.g;
import com.tencent.mm.protocal.c.wz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.chatting.a.b.f;
import com.tencent.mm.ui.chatting.i;
import com.tencent.mm.ui.chatting.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class b
  implements b.f, com.tencent.mm.ui.chatting.d.b.a
{
  protected ArrayList<com.tencent.mm.ui.chatting.a.b.b> gBc = null;
  protected String gBf;
  protected Context mContext;
  private boolean qUB = false;
  private long tUA = 0L;
  protected com.tencent.mm.ui.chatting.d.b.b tXZ;
  com.tencent.mm.ui.chatting.a.b tYa;
  private LinearLayoutManager tYb;
  protected ArrayList<com.tencent.mm.ui.chatting.a.b.b> tYc = null;
  
  public b(Context paramContext)
  {
    this.mContext = paramContext;
    this.gBc = new ArrayList();
  }
  
  protected static String i(com.tencent.mm.storage.bd parambd, boolean paramBoolean)
  {
    String str1 = null;
    String str2 = null;
    if (parambd == null) {}
    do
    {
      return str2;
      if (parambd.field_isSend == 1) {
        return q.GF();
      }
      if (paramBoolean) {
        str1 = com.tencent.mm.model.bd.iB(parambd.field_content);
      }
      str2 = str1;
    } while (!bi.oW(str1));
    return parambd.field_talker;
  }
  
  public final com.tencent.mm.ui.chatting.a.b.b EZ(int paramInt)
  {
    if ((this.gBc == null) || (this.gBc.size() <= paramInt)) {
      return null;
    }
    return (com.tencent.mm.ui.chatting.a.b.b)this.gBc.get(paramInt);
  }
  
  public final RecyclerView.a aau(String paramString)
  {
    this.gBf = paramString;
    this.tYa = new com.tencent.mm.ui.chatting.a.b(this.mContext, this);
    com.tencent.mm.ui.chatting.a.b.tNS = cwH();
    return this.tYa;
  }
  
  public final RecyclerView.g cwF()
  {
    return new b.1(this);
  }
  
  public final com.tencent.mm.modelvoiceaddr.ui.b.a cwI()
  {
    new com.tencent.mm.modelvoiceaddr.ui.b.a()
    {
      private al hPw = new al(au.Em().lnJ.getLooper(), new b.2.1(this), false);
      String tNU = "";
      
      public final void Uq() {}
      
      public final void Ur() {}
      
      public final void WW()
      {
        x.d("MicroMsg.BaseHistoryListPresenter", "onQuitSearch");
        if (b.this.tXZ != null) {
          b.this.tXZ.onFinish();
        }
      }
      
      public final void WX() {}
      
      public final void WY() {}
      
      public final void WZ()
      {
        x.i("MicroMsg.BaseHistoryListPresenter", "onSearchEditTextReady");
      }
      
      public final void a(boolean paramAnonymousBoolean, String[] paramAnonymousArrayOfString, long paramAnonymousLong, int paramAnonymousInt) {}
      
      public final boolean pj(String paramAnonymousString)
      {
        return false;
      }
      
      public final void pk(String paramAnonymousString)
      {
        if (!this.tNU.equals(paramAnonymousString))
        {
          this.tNU = paramAnonymousString;
          this.hPw.SO();
          this.hPw.J(500L, 500L);
        }
      }
    };
  }
  
  protected final boolean cxG()
  {
    long l1 = this.tUA;
    long l2 = System.currentTimeMillis();
    this.tUA = l2;
    if (l1 + 30000L < l2)
    {
      au.HU();
      this.qUB = c.isSDCardAvailable();
    }
    return this.qUB;
  }
  
  public final void d(int paramInt, final com.tencent.mm.storage.bd parambd)
  {
    x.i("MicroMsg.BaseHistoryListPresenter", "[handleSelectedItem] index:%s", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
    case 1: 
      do
      {
        return;
        localObject = new ch();
        ArrayList localArrayList = new ArrayList(1);
        localArrayList.add(parambd);
        if (!g.a(this.mContext, (ch)localObject, this.gBf, localArrayList, false, false)) {
          break;
        }
        ((ch)localObject).bJF.bJM = 45;
        ((ch)localObject).bJF.activity = ((Activity)this.mContext);
        a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      } while ((((ch)localObject).bJG.ret == -2) || (((ch)localObject).bJG.ret > 0) || (((ch)localObject).bJG.ret > 0));
      if (14 != ((ch)localObject).bJF.type)
      {
        x.d("MicroMsg.BaseHistoryListPresenter", "not record type, do not report");
        return;
      }
      if (((ch)localObject).bJF.bJI == null)
      {
        x.e("MicroMsg.BaseHistoryListPresenter", "want to report record fav, but type count is null");
        return;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.h(11142, new Object[] { Integer.valueOf(((ch)localObject).bJF.bJI.rBY), Integer.valueOf(((ch)localObject).bJF.bJI.rBZ), Integer.valueOf(((ch)localObject).bJF.bJI.rCa), Integer.valueOf(((ch)localObject).bJF.bJI.rCb), Integer.valueOf(((ch)localObject).bJF.bJI.rCc), Integer.valueOf(((ch)localObject).bJF.bJI.rCd), Integer.valueOf(((ch)localObject).bJF.bJI.rCe), Integer.valueOf(((ch)localObject).bJF.bJI.rCf), Integer.valueOf(((ch)localObject).bJF.bJI.rCg), Integer.valueOf(((ch)localObject).bJF.bJI.rCh), Integer.valueOf(((ch)localObject).bJF.bJI.rCi), Integer.valueOf(((ch)localObject).bJF.bJI.rCj), Integer.valueOf(((ch)localObject).bJF.bJI.rCk), Integer.valueOf(((ch)localObject).bJF.bJI.rCl), Integer.valueOf(((ch)localObject).bJF.bJI.rCm) });
      return;
      x.e("MicroMsg.BaseHistoryListPresenter", "[handleFav] err!");
      return;
    case 0: 
      com.tencent.mm.plugin.report.service.h.mEJ.a(219L, 19L, 1L, true);
      boolean bool = this.gBf.toLowerCase().endsWith("@chatroom");
      localObject = new ArrayList(1);
      ((ArrayList)localObject).add(parambd);
      k.a(this.mContext, (List)localObject, bool, this.gBf, new b.3(this));
      return;
    }
    com.tencent.mm.plugin.report.service.h.mEJ.h(11627, new Object[] { Integer.valueOf(5) });
    final Object localObject = new TreeSet();
    ((Set)localObject).add(Long.valueOf(parambd.field_msgId));
    com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(R.l.confirm_delete), "", this.mContext.getString(R.l.delete_message), this.mContext.getString(R.l.app_cancel), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        x.i("MicroMsg.BaseHistoryListPresenter", "delete message");
        i.a(b.this.mContext, localObject, new b.4.1(this));
      }
    }, null);
  }
  
  public final int getCount()
  {
    if (this.gBc == null) {
      return 0;
    }
    return this.gBc.size();
  }
  
  public final void onDetach()
  {
    this.tXZ.a(null);
    this.tXZ = null;
    if (this.tYa != null)
    {
      com.tencent.mm.ui.chatting.a.b.tNS = null;
      com.tencent.mm.ui.chatting.a.b.tNT = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */