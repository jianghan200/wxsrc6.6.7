package com.tencent.mm.ui.chatting.b;

import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.modelmulti.b;
import com.tencent.mm.modelmulti.b.a;
import com.tencent.mm.modelmulti.b.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.az.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.b.b.p;
import com.tencent.mm.ui.chatting.b.b.w;
import com.tencent.mm.ui.chatting.b.b.z;

@com.tencent.mm.ui.chatting.b.a.a(cwo=z.class)
public class ah
  extends a
  implements b.c, az.a, z
{
  public static int tSa = 350;
  private boolean tOB = false;
  public boolean tSb = false;
  public boolean tSc = false;
  public int tSd = -1;
  public int tSe = -1;
  public boolean tSf = true;
  public boolean tSg = false;
  private com.tencent.mm.sdk.b.c tSh = new ah.1(this);
  private boolean tSi = false;
  
  private void csI()
  {
    long l1 = System.currentTimeMillis();
    String str = this.bAG.oLT.field_username;
    au.HU();
    Object localObject = com.tencent.mm.model.c.FW().Yq(str);
    if (localObject != null)
    {
      long l2 = ((am)localObject).field_lastSeq;
      int i = ((am)localObject).field_UnDeliverCount;
      long l3 = ((am)localObject).field_firstUnDeliverSeq;
      x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onResume filterSeq[%d], lastSeq[%d], undeliverCount[%d], chatRoomId[%s]", new Object[] { Long.valueOf(l3), Long.valueOf(l2), Integer.valueOf(i), str });
      if (l2 > 0L)
      {
        au.HU();
        localObject = com.tencent.mm.model.c.FT().J(str, l2);
        if ((((cm)localObject).field_msgId == 0L) && (((cm)localObject).field_msgSeq != l2))
        {
          x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onResume need getChatRoomMsg up msg == null[%b] svrid[%d], msgseq[%d], take[%d]ms", new Object[] { Boolean.valueOf(false), Long.valueOf(((cm)localObject).field_msgSvrId), Long.valueOf(((cm)localObject).field_msgSeq), Long.valueOf(System.currentTimeMillis() - l1) });
          com.tencent.mm.sdk.platformtools.ah.A(new ah.5(this, str, l3, l2, i));
        }
      }
    }
  }
  
  public final void Ff(int paramInt)
  {
    this.tSd = paramInt;
  }
  
  public final void Fg(int paramInt)
  {
    this.tSe = paramInt;
  }
  
  public final String PE()
  {
    if (this.bAG.cwr()) {
      return this.bAG.oLT.field_username;
    }
    return "";
  }
  
  public final boolean PF()
  {
    return this.tSb;
  }
  
  public final void a(com.tencent.mm.storage.ai paramai, final az paramaz)
  {
    x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify cvs.getUsername[%s] tid[%d]", new Object[] { paramai.field_username, Long.valueOf(Thread.currentThread().getId()) });
    if (!this.bAG.eaR) {
      x.w("MicroMsg.ChattingUI.SilenceMsgComponent", "[onMsgChangeNotify] ChattingUI is not in Foreground!!");
    }
    label47:
    bd localbd1;
    do
    {
      do
      {
        do
        {
          do
          {
            break label47;
            break label47;
            break label47;
            do
            {
              return;
            } while ((!this.bAG.cwr()) || (!this.bAG.oLT.field_username.equals(paramai.field_username)));
            paramaz = (com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class);
            i = paramai.field_msgCount;
            j = paramaz.ctI();
            x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify newCvsCount[%d], total[%d], dealHistoryGetMsg[%b], UnDeliverCount[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(this.tSb), Integer.valueOf(paramai.field_UnDeliverCount) });
          } while (i <= j);
          localbd1 = paramai.tay;
        } while ((localbd1 == null) || (localbd1.field_msgId == 0L));
        if (i - j > 1) {
          this.tSi = true;
        }
        k = localbd1.field_flag;
        x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify receive get msg svrId[%d], seq[%d], flag[%d], stack[%s]", new Object[] { Long.valueOf(localbd1.field_msgSvrId), Long.valueOf(localbd1.field_msgSeq), Integer.valueOf(k), bi.cjd() });
      } while ((k & 0x2) == 0);
      if ((this.bAG.getListView() == null) || (paramaz == null) || (this.bAG.tTs == null))
      {
        x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr something is null %s %s %s", new Object[] { this.bAG.getListView(), paramaz, this.bAG.tTs });
        return;
      }
      if ((k & 0x4) != 0) {
        break;
      }
      x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify down dealHistoryGetMsg: %b", new Object[] { Boolean.valueOf(this.tSb) });
      if (this.tSb)
      {
        x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify down but dealHistoryGetMsg so ignore");
        return;
      }
      k = this.bAG.getFirstVisiblePosition();
      m = paramaz.getCount();
      paramaz.ctD();
      n = paramaz.getCount();
      i1 = n - m;
      x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify down talker[%s],firstVisiblePosition:%d, new oldTotal[%d,%d,%d], now preCount:[%d,%d,%d] fromcount:%d, needCheckHistoryTips:%b", new Object[] { this.bAG.oLT.field_username, Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(i - j), Integer.valueOf(n), Integer.valueOf(m), Integer.valueOf(i1), Integer.valueOf(paramaz.ctH()), Boolean.valueOf(this.tSc) });
    } while (i1 <= 1);
    paramai = this.bAG.getListView();
    int i = paramai.getFirstVisiblePosition();
    final int j = paramai.getChildCount();
    if ((k < i) || (k > j + i - 1))
    {
      paramai = paramai.getAdapter().getView(k, null, paramai);
      if (paramai != null) {
        break label716;
      }
    }
    label716:
    for (i = 0;; i = paramai.getTop())
    {
      j = i - this.bAG.tTs.getBottomHeight();
      this.bAG.getListView().setAdapter(this.bAG.getListView().getAdapter());
      this.bAG.eX(k, j);
      x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition %s firstView %s scrollY %s %s", new Object[] { Integer.valueOf(k), paramai, Integer.valueOf(i), Integer.valueOf(j) });
      this.bAG.getListView().post(new Runnable()
      {
        public final void run()
        {
          ah.this.bAG.eX(k, j);
          x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition 111 %s %s %s", new Object[] { Integer.valueOf(ah.this.bAG.getFirstVisiblePosition()), Integer.valueOf(ah.this.bAG.getLastVisiblePosition()), Integer.valueOf(paramaz.getCount()) });
        }
      });
      this.bAG.getListView().postDelayed(new ah.9(this, k, j, paramaz), 200L);
      return;
      paramai = paramai.getChildAt(k - i);
      break;
    }
    final int k = this.bAG.getFirstVisiblePosition();
    int m = this.bAG.getLastVisiblePosition();
    bd localbd2 = paramaz.ES(k);
    bd localbd3 = paramaz.ES(m);
    int n = paramaz.getCount();
    paramaz.ctD();
    int i1 = paramaz.getCount();
    int i2 = i - j;
    int i3 = i1 - n;
    x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify up talker[%s],new oldTotal[%d,%d,%d], now preCount:[%d,%d,%d] fromcount:%d needCheckHistoryTips:%b", new Object[] { this.bAG.oLT.field_username, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i1), Integer.valueOf(n), Integer.valueOf(i3), Integer.valueOf(paramaz.ctH()), Boolean.valueOf(this.tSc) });
    if ((localbd3 != null) && (localbd3.field_msgId != 0L) && (localbd3.field_createTime < localbd1.field_createTime)) {
      x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr lastVisibleMsg getCreateTime < lastInsert msg");
    }
    for (;;)
    {
      this.bAG.tTs.cub();
      paramaz.ctE();
      if (paramai.field_UnDeliverCount <= 0) {
        ((p)this.bAG.O(p.class)).cvz();
      }
      if (!this.tSc) {
        break;
      }
      this.tSc = false;
      this.bAG.tTs.setIsBottomShowAll(paramaz.ctK());
      boolean bool = ((w)this.bAG.O(w.class)).cvQ();
      this.bAG.tTs.setBottomViewVisible(bool);
      this.bAG.tTs.lK(false);
      x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify set needCheckHistoryTips[%b]", new Object[] { Boolean.valueOf(this.tSc) });
      com.tencent.mm.ui.chatting.c.a.cwt().postDelayed(new ah.11(this, paramai), 500L);
      return;
      if ((i3 > 0) && (paramaz.ctH() >= 0))
      {
        paramaz.EQ(i3);
        long l1;
        if (localbd2 == null)
        {
          l1 = -1L;
          label1126:
          if (localbd3 != null) {
            break label1305;
          }
        }
        label1305:
        for (long l2 = -1L;; l2 = localbd3.field_createTime)
        {
          x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr firstVisiblePosition %s, lastVisiblePosition %s, createtime[%s, %s, %s]", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(localbd1.field_createTime) });
          x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify up nowCount > preCount on set select:%d position %d, firstVisiblePosition %s", new Object[] { Integer.valueOf(i3), Integer.valueOf(i3 + 1), Integer.valueOf(k) });
          paramaz.lS(true);
          this.bAG.eX(i3 + 1, ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).cvy() + this.bAG.tTs.getTopHeight());
          com.tencent.mm.sdk.platformtools.ah.A(new ah.10(this, i3, paramaz));
          break;
          l1 = localbd2.field_createTime;
          break label1126;
        }
      }
      x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onMsgChangeNotify up incTotal incCount[%d, %d, %d] keep same", new Object[] { Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(paramaz.ctH()) });
    }
  }
  
  public final void b(com.tencent.mm.storage.ai paramai, int paramInt1, int paramInt2)
  {
    int i = paramai.field_UnDeliverCount;
    x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr mGoBackToHistryMsgLayout Unread[%d] UnDeliver[%d] pos[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(paramInt2) });
    if (i <= 0) {
      x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr mGoBackToHistryMsgLayout undeliverCount[%d] less then one scene do normal", new Object[] { Integer.valueOf(i) });
    }
    do
    {
      ((p)this.bAG.O(p.class)).an(paramInt2, false);
      return;
      paramInt1 = (int)paramai.field_firstUnDeliverSeq;
      x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr mGoBackToHistryMsgLayout undeliverCount[%d] need get firstSeq[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) });
    } while (paramInt1 <= 0);
    au.Em().H(new ah.3(this, paramInt1, paramai));
  }
  
  public final void bb(bd parambd)
  {
    long l3;
    boolean bool;
    int j;
    Object localObject;
    long l1;
    label75:
    int i;
    long l2;
    if ((parambd != null) && (parambd.field_msgId != 0L))
    {
      l3 = parambd.field_msgSeq;
      if ((parambd.field_flag & 0x4) == 0) {
        break label334;
      }
      bool = true;
      j = 18;
      au.HU();
      localObject = com.tencent.mm.model.c.FW().Yq(this.bAG.oLT.field_username);
      if (localObject == null) {
        break label355;
      }
      if (!bool) {
        break label340;
      }
      l1 = ((am)localObject).field_firstUnDeliverSeq;
      i = j;
      if (bool)
      {
        i = j;
        if (l1 == 0L) {
          i = ((am)localObject).field_UnDeliverCount;
        }
      }
      l2 = l1;
      j = i;
      if (bool)
      {
        l2 = l1;
        j = i;
        if (l1 > l3)
        {
          localObject = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().W(this.bAG.oLT.field_username, l3);
          l2 = l1;
          j = i;
          if (localObject != null)
          {
            l2 = l1;
            j = i;
            if (((cm)localObject).field_msgSeq < l3)
            {
              x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr getChatroomMsgWithFaultMsg revised filterSeq[%d] to [%d]", new Object[] { Long.valueOf(l1), Long.valueOf(((cm)localObject).field_msgSeq) });
              l2 = ((cm)localObject).field_msgSeq;
              j = i;
            }
          }
        }
      }
    }
    for (;;)
    {
      x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr getChatroomMsgWithFaultMsg filterSeq[%d], lastSeq[%d], needCount[%d], flag[%d], up[%b]", new Object[] { Long.valueOf(l2), Long.valueOf(l3), Integer.valueOf(j), Integer.valueOf(parambd.field_flag), Boolean.valueOf(bool) });
      this.tSb = false;
      parambd = this.bAG.oLT.field_username;
      int k = (int)l2;
      int m = (int)l3;
      if (bool) {}
      for (i = 1;; i = 0)
      {
        parambd = new b.a(parambd, k, m, j, i);
        com.tencent.mm.modelmulti.o.PN().a(parambd, this);
        return;
        label334:
        bool = false;
        break;
        label340:
        l1 = ((am)localObject).field_lastSeq;
        break label75;
      }
      label355:
      l2 = 0L;
    }
  }
  
  public final void cpF()
  {
    this.tSb = false;
    this.tSf = this.bAG.cwr();
    this.tSb = false;
    this.tSc = false;
  }
  
  public final void cpG()
  {
    csI();
    this.tOB = true;
  }
  
  public final void cpH()
  {
    au.HU();
    com.tencent.mm.model.c.FW().a(this, Looper.getMainLooper());
    com.tencent.mm.sdk.b.a.sFg.b(this.tSh);
  }
  
  public final void cpI()
  {
    if ((!this.tOB) && (this.bAG.cwr())) {
      csI();
    }
    this.tOB = false;
  }
  
  public final void cpJ() {}
  
  public final void cpK()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.tSh);
    au.HU();
    com.tencent.mm.model.c.FW().a(this);
  }
  
  public final boolean cvU()
  {
    return this.tSf;
  }
  
  public final void cvV()
  {
    this.tSf = false;
  }
  
  public final boolean cvW()
  {
    if (this.bAG.cwr())
    {
      bd localbd1 = ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).ES(0);
      if ((localbd1 != null) && (localbd1.field_msgId != 0L))
      {
        x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onTopLoadData check fault[%d, %d, %d, %d, %d, %d, %d, %s]", new Object[] { Integer.valueOf(localbd1.field_flag), Integer.valueOf(localbd1.field_isSend), Long.valueOf(localbd1.field_msgId), Long.valueOf(localbd1.field_msgSvrId), Long.valueOf(localbd1.field_msgSeq), Long.valueOf(localbd1.field_createTime), Integer.valueOf(localbd1.getType()), localbd1.field_talker });
        au.HU();
        bd localbd2 = com.tencent.mm.model.c.FT().J(localbd1.field_talker, localbd1.field_msgSeq);
        if ((localbd2.field_flag & 0x1) == 0)
        {
          x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onTopLoadData check fault found in cache but db is not[%d, %d, %d, %d, %d, %d, %d, %s] notify", new Object[] { Integer.valueOf(localbd2.field_flag), Integer.valueOf(localbd2.field_isSend), Long.valueOf(localbd2.field_msgId), Long.valueOf(localbd2.field_msgSvrId), Long.valueOf(localbd2.field_msgSeq), Long.valueOf(localbd2.field_createTime), Integer.valueOf(localbd2.getType()), localbd2.field_talker });
          ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).ctD();
          return false;
        }
        if (((localbd1.field_flag & 0x1) != 0) && ((localbd1.field_flag & 0x4) != 0))
        {
          x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onTopLoadData check fault found");
          ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).lS(true);
          au.Em().H(new ah.12(this, localbd1));
          return true;
        }
      }
      else
      {
        x.d("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onTopLoadData firstMsgInfo is null");
      }
    }
    return false;
  }
  
  public final boolean cvX()
  {
    if ((this.tSc) && (tSa > 0))
    {
      long l = System.currentTimeMillis();
      this.bAG.getListView().getViewTreeObserver().addOnGlobalLayoutListener(new ah.4(this, l));
      return true;
    }
    return false;
  }
  
  public final boolean cvY()
  {
    return this.tSg;
  }
  
  public final void cvZ()
  {
    this.tSg = false;
  }
  
  public final boolean cwa()
  {
    return this.tSc;
  }
  
  public final void eY(int paramInt1, int paramInt2)
  {
    if ((this.tSb) && (paramInt1 - paramInt2 == this.tSd << 1))
    {
      this.tSb = false;
      x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr set dealHistoryGetMsg %b firstVisibleItem: %d, totalItemCount:%d mUnreadMessageBeforeCheckHistory:%d", new Object[] { Boolean.valueOf(this.tSb), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(this.tSd) });
    }
  }
  
  public final void ia(int paramInt)
  {
    x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onGetFinish retcode[%d] thread[%d], dealHistoryGetMsg[%b], needCheckHistoryTips[%b]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()), Boolean.valueOf(this.tSb), Boolean.valueOf(this.tSc) });
    if ((paramInt != 0) || (!this.tSb)) {
      com.tencent.mm.sdk.platformtools.ah.A(new ah.6(this));
    }
    com.tencent.mm.storage.ai localai;
    do
    {
      return;
      au.HU();
      localai = com.tencent.mm.model.c.FW().Yq(this.bAG.oLT.field_username);
    } while (localai == null);
    int j = localai.field_unReadCount;
    int k = localai.field_UnDeliverCount;
    au.HU();
    int m = com.tencent.mm.model.c.FT().GT(this.bAG.oLT.field_username);
    int i = m - this.tSd - j;
    paramInt = i;
    if (this.tSe != -1)
    {
      paramInt = i;
      if (this.tSe - this.tSd != i) {
        paramInt = this.tSe;
      }
    }
    x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr onGetFinish unReadCount[%d] unDeliverCount[%d] beforemsgCount[%d], msgCount[%d] pos[%d] lastMessageCount[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(this.tSd), Integer.valueOf(m), Integer.valueOf(paramInt), Integer.valueOf(this.tSe) });
    this.tSe = -1;
    com.tencent.mm.sdk.platformtools.ah.A(new ah.7(this, paramInt));
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    super.onScrollStateChanged(paramAbsListView, paramInt);
    Object localObject;
    if (paramInt == 0)
    {
      for (;;)
      {
        try
        {
          paramAbsListView = this.bAG.getChildAt(this.bAG.getFirstVisiblePosition());
          if ((paramAbsListView != null) && (paramAbsListView.getTop() == 0))
          {
            x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange forceTopLoadData true");
            if (!this.bAG.cwr()) {
              break label902;
            }
            paramAbsListView = ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).ES(0);
            if ((paramAbsListView == null) || (paramAbsListView.field_msgId == 0L)) {
              break label902;
            }
            x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange check fault[%d, %d, %d, %d, %d, %d, %d, %s]", new Object[] { Integer.valueOf(paramAbsListView.field_flag), Integer.valueOf(paramAbsListView.field_isSend), Long.valueOf(paramAbsListView.field_msgId), Long.valueOf(paramAbsListView.field_msgSvrId), Long.valueOf(paramAbsListView.field_msgSeq), Long.valueOf(paramAbsListView.field_createTime), Integer.valueOf(paramAbsListView.getType()), paramAbsListView.field_talker });
            if (((paramAbsListView.field_flag & 0x1) == 0) || ((paramAbsListView.field_flag & 0x4) == 0)) {
              break label902;
            }
            this.bAG.tTs.cua();
            return;
          }
          if ((!this.bAG.cwr()) || (this.bAG.getChildAt(this.bAG.getListView().getChildCount() - 1) == null)) {
            break label902;
          }
          localObject = (com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class);
          if (this.bAG.getLastVisiblePosition() != this.bAG.getListView().getAdapter().getCount() - 1) {
            break label902;
          }
          paramAbsListView = null;
          paramInt = 1;
          if (paramInt >= 5) {
            break label899;
          }
          paramAbsListView = ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).ES(((com.tencent.mm.ui.chatting.b.b.g)localObject).getCount() - paramInt);
          if ((paramAbsListView != null) && (paramAbsListView.field_msgId != 0L) && ((paramAbsListView.field_flag & 0x1) != 0))
          {
            x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault found i[%s]", new Object[] { Integer.valueOf(paramInt) });
            if ((paramAbsListView == null) || (paramAbsListView.field_msgId == 0L)) {
              break label903;
            }
            localObject = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().J(paramAbsListView.field_talker, paramAbsListView.field_msgSeq);
            if ((((cm)localObject).field_msgId == 0L) || (((cm)localObject).field_msgId != paramAbsListView.field_msgId) || ((((cm)localObject).field_flag & 0x1) != 0)) {
              break;
            }
            x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange found msg not fault msgId[%s] flag[%s]", new Object[] { Long.valueOf(((cm)localObject).field_msgId), Integer.valueOf(((cm)localObject).field_flag) });
            ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).ctD();
            return;
          }
        }
        catch (Exception paramAbsListView)
        {
          x.printErrStackTrace("MicroMsg.ChattingUI.SilenceMsgComponent", paramAbsListView, "silenceMsgImp handleIdelScrollChange", new Object[0]);
          return;
        }
        paramInt += 1;
      }
      x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault[%d, %d, %d, %d, %d, %d, %d, %s]", new Object[] { Integer.valueOf(paramAbsListView.field_flag), Integer.valueOf(paramAbsListView.field_isSend), Long.valueOf(paramAbsListView.field_msgId), Long.valueOf(paramAbsListView.field_msgSvrId), Long.valueOf(paramAbsListView.field_msgSeq), Long.valueOf(paramAbsListView.field_createTime), Integer.valueOf(paramAbsListView.getType()), paramAbsListView.field_talker });
      if (((paramAbsListView.field_flag & 0x1) != 0) && ((paramAbsListView.field_flag & 0x4) == 0))
      {
        x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange forceBottomLoadData");
        this.bAG.tTs.setIsBottomShowAll(false);
        this.bAG.tTs.setBottomViewVisible(true);
        this.bAG.tTs.lK(true);
        x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault found");
        ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).lS(true);
        au.Em().H(new ah.2(this, paramAbsListView));
        return;
      }
    }
    for (;;)
    {
      label708:
      int i;
      if ((paramAbsListView.field_flag & 0x2) != 0)
      {
        i = 1;
        label719:
        if ((i & paramInt) == 0) {
          break label902;
        }
        au.HU();
        localObject = com.tencent.mm.model.c.FT().GE(paramAbsListView.field_talker);
        if ((localObject == null) || (((cm)localObject).field_msgId == 0L) || (((cm)localObject).field_createTime <= paramAbsListView.field_createTime)) {
          break label902;
        }
        x.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr handleScrollChange bottom check fault[%d, %d, %d, %d, %d, %d, %d, %s] not need notify", new Object[] { Integer.valueOf(((cm)localObject).field_flag), Integer.valueOf(((cm)localObject).field_isSend), Long.valueOf(((cm)localObject).field_msgId), Long.valueOf(((cm)localObject).field_msgSvrId), Long.valueOf(((cm)localObject).field_msgSeq), Long.valueOf(((cm)localObject).field_createTime), Integer.valueOf(((bd)localObject).getType()), ((cm)localObject).field_talker });
        ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).ctD();
      }
      label899:
      label902:
      label903:
      do
      {
        paramInt = 0;
        break label708;
        i = 0;
        break label719;
        break;
        return;
      } while (paramAbsListView == null);
      paramInt = 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/b/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */