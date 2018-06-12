package com.tencent.mm.ui.chatting.b;

import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar;
import com.tencent.mm.ui.chatting.af;
import com.tencent.mm.ui.chatting.ah;
import com.tencent.mm.ui.chatting.ah.a;
import com.tencent.mm.ui.chatting.b.b.ag;
import com.tencent.mm.ui.chatting.b.b.g;
import com.tencent.mm.ui.chatting.b.b.m;
import com.tencent.mm.ui.chatting.b.b.p;
import com.tencent.mm.ui.chatting.b.b.w;
import com.tencent.mm.ui.chatting.e;
import com.tencent.mm.ui.chatting.v;
import com.tencent.mm.ui.tools.o.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.chatting.b.a.a(cwo=com.tencent.mm.ui.chatting.b.b.h.class)
public class j
  extends a
  implements ah, com.tencent.mm.ui.chatting.b.b.h
{
  public static at tOP = new at(5, "MicroMsg.ChattingMoreBtnBarHelper");
  private ab bTk;
  private com.tencent.mm.ui.tools.o eMS;
  private com.tencent.mm.ui.tools.k fUH;
  private boolean hasInit = false;
  private Animation nen;
  private boolean tGg;
  private boolean tKh = false;
  private ChattingFooterMoreBtnBar tOQ;
  private boolean tOR = true;
  
  private List<bd> cuP()
  {
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = ((g)this.bAG.O(g.class)).ctL().iterator();
    while (localIterator.hasNext())
    {
      long l = ((Long)localIterator.next()).longValue();
      x.v("MicroMsg.ChattingMoreBtnBarHelper", "select msg id %d", new Object[] { Long.valueOf(l) });
      au.HU();
      localLinkedList.add(com.tencent.mm.model.c.FT().dW(l));
    }
    Collections.sort(localLinkedList, new j.7(this));
    return localLinkedList;
  }
  
  private void cuR()
  {
    if (this.tKh) {
      this.bAG.showOptionMenu(false);
    }
    for (;;)
    {
      ((ag)this.bAG.O(ag.class)).cwm();
      return;
      ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).cvp();
    }
  }
  
  public final void a(ah.a parama) {}
  
  public final void aT(bd parambd)
  {
    if (this.hasInit)
    {
      x.e("MicroMsg.ChattingMoreBtnBarHelper", "[init] hasInit!");
      this.bTk = this.bAG.oLT;
      if ((!com.tencent.mm.model.s.fq(this.bAG.getTalkerUserName())) && (!((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cus())) {
        break label593;
      }
    }
    label593:
    for (boolean bool = true;; bool = false)
    {
      this.tGg = bool;
      this.tOQ.ctt();
      this.bAG.tTq.getController().addSearchMenu(true, this.eMS);
      this.tOQ.startAnimation(this.nen);
      this.tOQ.setVisibility(0);
      this.tKh = true;
      ((w)this.bAG.O(w.class)).cvN();
      g localg = (g)this.bAG.O(g.class);
      localg.ctO();
      localg.ctM();
      localg.gt(parambd.field_msgId);
      int i = localg.boX();
      this.tOQ.EO(i);
      ((com.tencent.mm.ui.chatting.b.b.k)this.bAG.O(com.tencent.mm.ui.chatting.b.b.k.class)).cuY();
      this.bAG.YC();
      cuR();
      ((m)this.bAG.O(m.class)).cvk();
      com.tencent.mm.plugin.report.service.h.mEJ.h(10811, new Object[] { Integer.valueOf(1) });
      if (this.bTk.ckW())
      {
        parambd = this.bAG;
        i = R.h.menu_search;
        x.i("MicroMsg.ChattingContext", "[showOptionMenu] menuID:%d", new Object[] { Integer.valueOf(i) });
        parambd.tTr.removeOptionMenu(i);
      }
      ((p)this.bAG.O(p.class)).cvz();
      return;
      this.hasInit = true;
      if (this.tOQ == null)
      {
        ((ViewStub)this.bAG.findViewById(R.h.viewstub_chatting_more_btn)).inflate();
        this.tOQ = ((ChattingFooterMoreBtnBar)this.bAG.findViewById(R.h.chatting_footer_more_btn_bar));
      }
      if (((w)this.bAG.O(w.class)).cvT())
      {
        x.w("MicroMsg.ChattingMoreBtnBarHelper", "is in show search chat result");
        if (this.eMS == null) {}
      }
      for (this.eMS.uBw = null;; this.eMS.uBw = new o.b()
          {
            public final void WW()
            {
              x.v("MicroMsg.ChattingMoreBtnBarHelper", "onQuitSearch");
              g localg = (g)j.this.bAG.O(g.class);
              if (localg.isInEditMode())
              {
                ((w)j.this.bAG.O(w.class)).cvN();
                j.b(j.this).setVisibility(0);
                j.b(j.this).EO(localg.boX());
              }
            }
            
            public final void WX()
            {
              x.v("MicroMsg.ChattingMoreBtnBarHelper", "onEnterSearch");
              com.tencent.mm.plugin.report.service.h.mEJ.a(219L, 21L, 1L, true);
              if (((g)j.this.bAG.O(g.class)).isInEditMode())
              {
                ((w)j.this.bAG.O(w.class)).cvM();
                j.b(j.this).setVisibility(8);
              }
            }
            
            public final void WY() {}
            
            public final void WZ() {}
            
            public final boolean pj(String paramAnonymousString)
            {
              return false;
            }
            
            public final void pk(String paramAnonymousString)
            {
              x.v("MicroMsg.ChattingMoreBtnBarHelper", "on edit change");
              w localw = (w)j.this.bAG.O(w.class);
              if (bi.oW(paramAnonymousString)) {
                if (localw.cvT())
                {
                  if (localw.cvP() != null) {
                    localw.cvP().pi("");
                  }
                  localw.Fd(-1);
                }
              }
              do
              {
                return;
                if (j.h(j.this))
                {
                  localw.cvN();
                  j.b(j.this).setVisibility(0);
                  paramAnonymousString = (g)j.this.bAG.O(g.class);
                  j.b(j.this).EO(paramAnonymousString.boX());
                  return;
                }
                localw.cvN();
                j.b(j.this).setVisibility(8);
                return;
                x.v("MicroMsg.ChattingMoreBtnBarHelper", "enter search mode");
                j.b(j.this).setVisibility(8);
                localw.cvM();
              } while (localw.cvP() == null);
              localw.cvP().pi(paramAnonymousString);
            }
          })
      {
        this.tOQ.c(3, new j.2(this));
        this.tOQ.c(2, new j.3(this));
        this.tOQ.c(1, new j.4(this));
        this.tOQ.c(0, new j.5(this));
        this.tOQ.c(4, new j.6(this));
        this.nen = AnimationUtils.loadAnimation(this.bAG.tTq.getContext(), R.a.push_up_in);
        ((g)this.bAG.O(g.class)).c(new j.1(this));
        this.fUH = new com.tencent.mm.ui.tools.k(this.bAG.tTq.getContext());
        break;
        this.eMS = new com.tencent.mm.ui.tools.o((byte)0);
      }
    }
  }
  
  public final void aU(bd parambd)
  {
    if (parambd == null) {
      x.w("MicroMsg.ChattingMoreBtnBarHelper", "perform search mode click msg item fail, msg is null");
    }
    g localg;
    do
    {
      return;
      localg = (g)this.bAG.O(g.class);
    } while (!localg.gt(parambd.field_msgId));
    int i = localg.boX();
    this.tOQ.EO(i);
    this.tOQ.setVisibility(0);
    this.eMS.czQ();
  }
  
  public final void b(ah.a parama)
  {
    cuQ();
  }
  
  public final void cuQ()
  {
    this.bAG.tTq.getController().addSearchMenu(false, this.eMS);
    this.tOQ.setVisibility(8);
    ((g)this.bAG.O(g.class)).aMw();
    ((w)this.bAG.O(w.class)).cvN();
    this.tKh = false;
    cuR();
    ((com.tencent.mm.ui.chatting.b.b.k)this.bAG.O(com.tencent.mm.ui.chatting.b.b.k.class)).cuZ();
    ((m)this.bAG.O(m.class)).cvk();
    this.bAG.YC();
    com.tencent.mm.ui.chatting.k.cte();
  }
  
  public final boolean cuS()
  {
    return this.tKh;
  }
  
  public final void cuT()
  {
    if (this.eMS != null)
    {
      this.eMS.czQ();
      this.eMS.uBw = null;
    }
  }
  
  public final void cug()
  {
    cuQ();
  }
  
  public final boolean cuh()
  {
    return this.tOR;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */