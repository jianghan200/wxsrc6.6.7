package com.tencent.mm.ui.chatting.b;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.a.b;
import com.tencent.mm.ac.d;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.chatting.af;
import com.tencent.mm.ui.chatting.b.b.ac;
import com.tencent.mm.ui.chatting.b.b.g;
import com.tencent.mm.ui.chatting.b.b.p;
import com.tencent.mm.ui.chatting.e;

@com.tencent.mm.ui.chatting.b.a.a(cwo=p.class)
public class t
  extends a
  implements p
{
  private View tQD;
  private TextView tQE;
  private int tQF;
  private int tQG = 0;
  
  private boolean cvC()
  {
    com.tencent.mm.ui.chatting.b.b.c localc = (com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class);
    if (s.hJ(this.bAG.getTalkerUserName())) {
      return true;
    }
    return (this.bAG.oLT.ckW()) && (localc.cuo() != null) && ((localc.cuo().LW()) || (localc.cuo().LV()));
  }
  
  public final void Fb(int paramInt)
  {
    if (cvC())
    {
      i = 5;
      if ((this.tQF >= i) && (this.tQD != null)) {
        break label31;
      }
    }
    label31:
    FrameLayout.LayoutParams localLayoutParams;
    do
    {
      return;
      i = 10;
      break;
      localLayoutParams = (FrameLayout.LayoutParams)this.tQD.getLayoutParams();
      switch (paramInt)
      {
      case -1: 
      case 2: 
      default: 
        return;
      }
    } while (((ac)this.bAG.O(ac.class)).cwb());
    localLayoutParams.setMargins(0, this.bAG.tTq.getMMResources().getDimensionPixelSize(R.f.LargePadding), 0, 0);
    return;
    localLayoutParams.setMargins(0, this.bAG.tTq.getMMResources().getDimensionPixelSize(R.f.LargePadding) * 3, 0, 0);
    return;
    ac localac = (ac)this.bAG.O(ac.class);
    if (localac.cwb())
    {
      paramInt = localac.cwd();
      if (!localac.cwc()) {
        break label257;
      }
    }
    label257:
    for (int i = this.bAG.tTq.getMMResources().getDimensionPixelSize(R.f.NormalButtonHeight);; i = 0)
    {
      int j = paramInt;
      if (i > paramInt) {
        j = i;
      }
      localLayoutParams.setMargins(0, this.bAG.tTq.getMMResources().getDimensionPixelSize(R.f.LargePadding) + j, 0, 0);
      return;
      paramInt = 0;
      break;
    }
    localLayoutParams.setMargins(0, this.bAG.tTq.getMMResources().getDimensionPixelSize(R.f.LargePadding), 0, 0);
  }
  
  public final void a(ai paramai, boolean paramBoolean)
  {
    x.i("MicroMsg.HistoryMsgTongueComponent", "[update] get:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.tQD = this.bAG.findViewById(R.h.chatting_goback_history_layout);
    if (this.tQD == null)
    {
      x.e("MicroMsg.HistoryMsgTongueComponent", "[update] is mGoBackToHistoryMsgLayout null");
      this.tQG = 0;
      return;
    }
    ((com.tencent.mm.ui.chatting.b.b.z)this.bAG.O(com.tencent.mm.ui.chatting.b.b.z.class)).Fg(-1);
    com.tencent.mm.ui.chatting.b.b.c localc = (com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class);
    Object localObject = null;
    if (localc.cur()) {
      localObject = com.tencent.mm.ac.z.Nb().bd(localc.cuC());
    }
    int i;
    if (((paramai != null) || (localObject != null)) && (((!this.bAG.cwq()) && (!s.hM(this.bAG.getTalkerUserName())) && (!s.hf(this.bAG.getTalkerUserName())) && (!s.hH(this.bAG.getTalkerUserName())) && (!s.hi(this.bAG.getTalkerUserName()))) || (s.fq(this.bAG.getTalkerUserName())) || (localc.cur()) || (cvC()))) {
      if ((localc.cur()) && (localObject != null))
      {
        this.tQF = ((com.tencent.mm.ac.a.a)localObject).field_unReadCount;
        x.i("MicroMsg.HistoryMsgTongueComponent", "[update] bizChatCon mUnreadMessageCount:%s", new Object[] { Integer.valueOf(this.tQF) });
        i = this.tQF;
        if ((!paramBoolean) || (paramai == null) || (paramai.field_UnDeliverCount <= 0)) {
          break label754;
        }
        i = paramai.field_UnDeliverCount + i;
        x.i("MicroMsg.HistoryMsgTongueComponent", "summerbadcr updateGoBackToHistoryMessage mUnreadMessageCount fixUnreadMessage[%d, %d]", new Object[] { Integer.valueOf(i), Integer.valueOf(this.tQF) });
        ((com.tencent.mm.ui.chatting.b.b.z)this.bAG.O(com.tencent.mm.ui.chatting.b.b.z.class)).Ff(this.tQF);
      }
    }
    label346:
    label423:
    label469:
    label613:
    label625:
    label665:
    label739:
    label754:
    for (;;)
    {
      int j;
      if (cvC())
      {
        j = 5;
        x.i("MicroMsg.HistoryMsgTongueComponent", "[update] threshold:%s fixUnreadMessage:%s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        if (i < j) {
          break label739;
        }
        x.i("MicroMsg.HistoryMsgTongueComponent", "[update] mGoBackToHistoryMsgLayout VISIBLE");
        this.tQE = ((TextView)this.bAG.findViewById(R.h.chatting_goback_history_tv));
        localObject = com.tencent.mm.booter.z.cXH;
        if (((com.tencent.mm.booter.z)localObject).cXL != null) {
          break label613;
        }
        ((com.tencent.mm.booter.z)localObject).cXM = 1;
        if (i <= 999) {
          break label625;
        }
        this.tQE.setText(String.format(this.bAG.tTq.getMMResources().getString(R.l.chatting_history_go_back_tip), new Object[] { Integer.valueOf(999) }));
        if (!localc.cur()) {
          break label665;
        }
        au.HU();
        i = com.tencent.mm.model.c.FU().au(this.bAG.getTalkerUserName(), localc.cuC()) - this.tQF;
      }
      for (;;)
      {
        this.tQD.setOnClickListener(new t.1(this, paramai, i));
        this.tQD.postDelayed(new t.2(this), 300L);
        return;
        if (paramai != null)
        {
          this.tQF = paramai.field_unReadCount;
          x.i("MicroMsg.HistoryMsgTongueComponent", "[update] mUnreadMessageCount:%s", new Object[] { Integer.valueOf(this.tQF) });
          break;
        }
        x.w("MicroMsg.HistoryMsgTongueComponent", "[update] mGoBackToHistoryMsgLayout GONE");
        this.tQD.setVisibility(8);
        this.tQG = 0;
        return;
        j = 10;
        break label346;
        ((com.tencent.mm.booter.z)localObject).cXL.cYd = 1;
        break label423;
        this.tQE.setText(String.format(this.bAG.tTq.getMMResources().getString(R.l.chatting_history_go_back_tip), new Object[] { Integer.valueOf(i) }));
        break label469;
        au.HU();
        i = com.tencent.mm.model.c.FT().GT(this.bAG.getTalkerUserName());
        j = this.tQF;
        localObject = (com.tencent.mm.ui.chatting.b.b.z)this.bAG.O(com.tencent.mm.ui.chatting.b.b.z.class);
        au.HU();
        ((com.tencent.mm.ui.chatting.b.b.z)localObject).Fg(com.tencent.mm.model.c.FT().GT(this.bAG.getTalkerUserName()));
        i -= j;
      }
      this.tQD.setVisibility(8);
      this.tQG = 0;
      return;
    }
  }
  
  public final void an(int paramInt, boolean paramBoolean)
  {
    Object localObject = (g)this.bAG.O(g.class);
    int k = ((g)localObject).getCount();
    int m = ((g)localObject).ctI();
    int n = m - paramInt;
    int i;
    if (n <= 18) {
      i = k - n;
    }
    for (;;)
    {
      int j = i;
      if (paramBoolean)
      {
        x.i("MicroMsg.HistoryMsgTongueComponent", "summerbadcr goBackToHistoryMsg dzmonster get pos=%d, preCount=%d, totalCount=%d, msgCount =%d, select=%d, newTotalCount=%d, newCount=%d, stack[%s]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i), Integer.valueOf(((g)localObject).ctI()), Integer.valueOf(((g)localObject).getCount()), bi.cjd() });
        j = ((g)localObject).getCount() - k;
      }
      x.i("MicroMsg.HistoryMsgTongueComponent", "summerbadcr goBackToHistoryMsg dzmonster pos=%d, preCount=%d, totalCount=%d, msgCount =%d, fSelect=%d, newTotalCount=%d, newCount=%d, stack[%s]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(((g)localObject).ctI()), Integer.valueOf(((g)localObject).getCount()), bi.cjd() });
      ((g)localObject).ER(j);
      cvz();
      localObject = this.bAG;
      x.i("MicroMsg.ChattingContext", "[scrollToLast] position:%b", new Object[] { Integer.valueOf(j) });
      ((com.tencent.mm.ui.chatting.c.a)localObject).tTr.bg(j);
      return;
      if (k > n)
      {
        i = k - n;
      }
      else
      {
        ((g)localObject).EP(n - k);
        i = 0;
        ((g)localObject).ctG();
      }
    }
  }
  
  public final void cpG()
  {
    au.HU();
    ai localai = com.tencent.mm.model.c.FW().Yq(this.bAG.getTalkerUserName());
    if (localai != null) {
      x.i("MicroMsg.HistoryMsgTongueComponent", "[onChattingEnterAnimStart] getUnDeliverCount:%s", new Object[] { Integer.valueOf(localai.field_UnDeliverCount) });
    }
    if ((localai == null) || (localai.field_UnDeliverCount == 0)) {
      a(localai, false);
    }
    while (this.tQD == null) {
      return;
    }
    this.tQD.setVisibility(8);
    x.i("MicroMsg.HistoryMsgTongueComponent", "summerbadcr not updateGoBackToHistoryMessage initList UnDeliver:%d, UnRead:%d", new Object[] { Integer.valueOf(localai.field_UnDeliverCount), Integer.valueOf(localai.field_unReadCount) });
  }
  
  public final void cvA()
  {
    this.tQG = 0;
  }
  
  public final int cvB()
  {
    return this.tQG;
  }
  
  public final void cvz()
  {
    if (this.tQD == null) {
      return;
    }
    this.tQF = -1;
    if (this.tQD.getVisibility() == 0)
    {
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, this.tQD.getWidth(), 0.0F, 0.0F);
      localTranslateAnimation.setDuration(300L);
      localTranslateAnimation.setInterpolator(AnimationUtils.loadInterpolator(this.bAG.tTq.getContext(), 17432581));
      this.tQD.startAnimation(localTranslateAnimation);
    }
    this.tQD.setVisibility(8);
  }
  
  public final void eY(int paramInt1, int paramInt2)
  {
    if ((this.tQF > 0) && (paramInt1 - (paramInt2 + 1) >= this.tQF) && (this.tQD != null) && (this.tQD.getVisibility() == 0))
    {
      x.i("MicroMsg.HistoryMsgTongueComponent", "summerbadcr jacks onScroll dismissGoBackToHistory mUnreadMessage[%d] [%d,%d]", new Object[] { Integer.valueOf(this.tQF), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      cvz();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/b/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */