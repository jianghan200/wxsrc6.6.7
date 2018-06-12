package com.tencent.mm.ui.chatting.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ax.f;
import com.tencent.mm.ax.g;
import com.tencent.mm.g.a.er;
import com.tencent.mm.g.a.rn;
import com.tencent.mm.g.a.rn.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.o.a;
import com.tencent.mm.pluginsdk.o.b;
import com.tencent.mm.pluginsdk.o.c;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MultiTalkRoomPopupNav;
import com.tencent.mm.ui.MultiTalkRoomPopupNav.a;
import com.tencent.mm.ui.MultiTalkRoomPopupNav.b;
import com.tencent.mm.ui.base.TalkRoomPopupNav;
import com.tencent.mm.ui.base.TalkRoomPopupNav.4;
import com.tencent.mm.ui.base.TalkRoomPopupNav.5;
import com.tencent.mm.ui.base.TalkRoomPopupNav.8;
import com.tencent.mm.ui.base.TalkRoomPopupNav.9;
import com.tencent.mm.ui.base.TalkRoomPopupNav.a;
import com.tencent.mm.ui.chatting.b.b.ac;
import com.tencent.mm.ui.chatting.b.b.p;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.chatting.b.a.a(cwo=ac.class)
public class aj
  extends a
  implements com.tencent.mm.ax.a, com.tencent.mm.ay.c, o.b, ac
{
  private final j.a tOy = new j.a()
  {
    public final void a(String paramAnonymousString, l paramAnonymousl)
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.ChattingUI.TrackRoomComponent", "roommember watcher notify " + paramAnonymousString);
      if (!bi.oW(paramAnonymousString)) {
        aj.a(aj.this);
      }
    }
  };
  public TalkRoomPopupNav tSG;
  public MultiTalkRoomPopupNav tSH;
  private TalkRoomPopupNav.a tSI = new TalkRoomPopupNav.a()
  {
    public final void cse()
    {
      if ((com.tencent.mm.p.a.by(aj.this.bAG.tTq.getContext())) || (com.tencent.mm.p.a.bw(aj.this.bAG.tTq.getContext())))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.TrackRoomComponent", "voip is running");
        return;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.TrackRoomComponent", "Click banner : %d", new Object[] { Integer.valueOf(com.tencent.mm.ay.d.elh.ns(aj.this.bAG.oLT.field_username).size()) });
      if (com.tencent.mm.ay.d.elh.nt(aj.this.bAG.oLT.field_username))
      {
        aj.b(aj.this);
        return;
      }
      aj.this.lX(true);
    }
    
    public final void csf()
    {
      rn localrn = new rn();
      localrn.ccn.ccq = true;
      com.tencent.mm.sdk.b.a.sFg.m(localrn);
      aj.a(aj.this, aj.this.bAG.getTalkerUserName());
    }
  };
  
  private void a(TalkRoomPopupNav.a parama)
  {
    if (this.tSG == null)
    {
      i.a(this.bAG.tTq, R.h.viewstub_talkroom_popup_nav);
      this.tSG = ((TalkRoomPopupNav)this.bAG.findViewById(R.h.talk_room_popup_nav));
      if (this.tSG != null) {}
    }
    while (this.tSG == null) {
      return;
    }
    this.tSG.setOnClickListener(parama);
  }
  
  private void aas(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("enter_room_username", paramString);
    localIntent.setFlags(268435456);
    com.tencent.mm.bg.d.b(this.bAG.tTq.getContext(), "talkroom", ".ui.TalkRoomUI", localIntent);
  }
  
  private void cwe()
  {
    if (this.tSG != null)
    {
      this.tSG.setVisibility(8);
      this.tSG.setIconAnim(-1);
      this.tSG.stop();
      ((p)this.bAG.O(p.class)).Fb(-1);
    }
    if (this.tSH != null)
    {
      if (!o.a.qyi.HC(this.bAG.getTalkerUserName())) {
        this.tSH.cqM();
      }
      this.tSH.setVisibility(8);
      ((p)this.bAG.O(p.class)).Fb(-1);
    }
  }
  
  private void lW(boolean paramBoolean)
  {
    if (this.bAG == null) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ChattingUI.TrackRoomComponent", "[checkTalkroomBanner] isResume:%s mChattingContext == null! maybe chattingui has Exited! this event come from post msg", new Object[] { Boolean.valueOf(paramBoolean) });
    }
    boolean bool;
    label151:
    Object localObject1;
    Object localObject3;
    do
    {
      do
      {
        do
        {
          return;
          if ((((com.tencent.mm.ui.chatting.b.b.e)this.bAG.O(com.tencent.mm.ui.chatting.b.b.e.class)).cuI()) || (((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cux())) {}
          for (bool = true;; bool = false)
          {
            if ((!s.fq(this.bAG.getTalkerUserName())) || (bool)) {
              break label151;
            }
            if (this.tSG != null)
            {
              this.tSG.setVisibility(8);
              ((p)this.bAG.O(p.class)).Fb(-1);
            }
            if (this.tSH == null) {
              break;
            }
            this.tSH.setInChatRoom(false);
            this.tSH.setVisibility(8);
            return;
          }
          cwe();
          if ((com.tencent.mm.ay.d.elh == null) || (!com.tencent.mm.ay.d.elh.nt(this.bAG.oLT.field_username))) {
            break;
          }
          a(this.tSI);
        } while (this.tSG == null);
        localObject2 = com.tencent.mm.ay.d.elh.ns(this.bAG.oLT.field_username);
        localObject1 = "";
        if ((localObject2 != null) && (((List)localObject2).contains(this.bAG.cwp())))
        {
          this.tSG.setBgViewResource(R.g.tipsbar_green_bg);
          localObject2 = this.bAG.tTq.getMMResources().getString(R.l.track_room_sharing);
          this.tSG.setIconRes(R.k.tipsbar_icon_location_lightgreen);
          this.tSG.setIconAnim(R.k.tipsbar_icon_location_shining);
          localObject3 = this.tSG;
          if (((TalkRoomPopupNav)localObject3).tBj != null)
          {
            localObject1 = localObject2;
            if (((TalkRoomPopupNav)localObject3).tBk != null) {}
          }
          else
          {
            ((TalkRoomPopupNav)localObject3).tBj = new AlphaAnimation(0.0F, 1.0F);
            ((TalkRoomPopupNav)localObject3).tBj.setDuration(1000L);
            ((TalkRoomPopupNav)localObject3).tBj.setStartOffset(0L);
            ((TalkRoomPopupNav)localObject3).tBk = new AlphaAnimation(1.0F, 0.0F);
            ((TalkRoomPopupNav)localObject3).tBk.setDuration(1000L);
            ((TalkRoomPopupNav)localObject3).tBk.setStartOffset(0L);
            ((TalkRoomPopupNav)localObject3).tBj.setAnimationListener(new TalkRoomPopupNav.8((TalkRoomPopupNav)localObject3));
            ((TalkRoomPopupNav)localObject3).tBk.setAnimationListener(new TalkRoomPopupNav.9((TalkRoomPopupNav)localObject3));
            ((TalkRoomPopupNav)localObject3).tBc.startAnimation(((TalkRoomPopupNav)localObject3).tBj);
            localObject1 = localObject2;
          }
          this.tSG.setVisibility(0);
          this.tSG.setNavContent((String)localObject1);
          ((p)this.bAG.O(p.class)).Fb(1);
          return;
        }
        this.tSG.setIconAnim(-1);
        this.tSG.stop();
        this.tSG.setBgViewResource(R.g.tipsbar_grey_bg);
        if ((localObject2 != null) && (((List)localObject2).size() == 1)) {
          localObject1 = this.bAG.tTq.getMMResources().getString(R.l.track_room_one_sharing, new Object[] { r.gT((String)((List)localObject2).get(0)) });
        }
        for (;;)
        {
          this.tSG.setIconRes(R.k.tipsbar_icon_location);
          break;
          if (localObject2 != null) {
            localObject1 = this.bAG.tTq.getMMResources().getString(R.l.track_room_some_people_in, new Object[] { Integer.valueOf(((List)localObject2).size()) });
          }
        }
        if ((g.elf != null) && (g.elf.nq(this.bAG.getTalkerUserName())))
        {
          a(this.tSI);
          localObject1 = new rn();
          ((rn)localObject1).ccn.ccp = true;
          com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
          if (this.bAG.getTalkerUserName().equals(((rn)localObject1).cco.ccr)) {
            this.tSG.setBgViewResource(R.g.tipsbar_green_bg);
          }
          for (;;)
          {
            localObject1 = this.bAG.tTq.getMMResources().getString(R.l.talk_room_some_people_in, new Object[] { Integer.valueOf(g.elf.np(this.bAG.getTalkerUserName()).size()) });
            this.tSG.setIconRes(R.g.talk_room_mic_in_chat);
            this.tSG.setIconAnim(-1);
            this.tSG.stop();
            this.tSG.setVisibility(0);
            this.tSG.setNavContent((String)localObject1);
            ((p)this.bAG.O(p.class)).Fb(1);
            return;
            this.tSG.setBgViewResource(R.g.tipsbar_grey_bg);
          }
        }
        if ((!s.fq(this.bAG.getTalkerUserName())) || (o.a.qyi == null)) {
          break;
        }
        localObject1 = o.a.qyi.HO(this.bAG.getTalkerUserName());
      } while ((localObject1 == null) || (((f)localObject1).field_wxGroupId == null) || (!((f)localObject1).field_wxGroupId.equals(this.bAG.getTalkerUserName())));
      if (this.tSH == null)
      {
        i.a(this.bAG.tTq, R.h.viewstub_multitalk_popup_nav);
        this.tSH = ((MultiTalkRoomPopupNav)this.bAG.findViewById(R.h.multitalk_talk_room_popup_nav));
      }
    } while (this.tSH == null);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.TrackRoomComponent", "show multiTalkBanner! ");
    this.tSH.setGroupUserName(this.bAG.getTalkerUserName());
    this.tSH.setCurrentSenderUserName(this.bAG.cwp());
    this.tSH.setInChatRoom(bool);
    Object localObject2 = this.tSH;
    ((MultiTalkRoomPopupNav)localObject2).toW = false;
    if ((((MultiTalkRoomPopupNav)localObject2).toP == null) || (((MultiTalkRoomPopupNav)localObject2).toQ == null)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MultiTalkRoomPopupNav", "groupUserName or currentSenderUserName is null! groupUserName:" + ((MultiTalkRoomPopupNav)localObject2).toP + ",currentSenderUserName:" + ((MultiTalkRoomPopupNav)localObject2).toQ);
    }
    List localList;
    int i;
    for (;;)
    {
      this.tSH.setMultiTalkInfo((f)localObject1);
      ((p)this.bAG.O(p.class)).Fb(1);
      return;
      localObject3 = ((MultiTalkRoomPopupNav)localObject2).toP;
      if ((o.a.qyi == null) || (!o.a.qyi.HC((String)localObject3)))
      {
        ((MultiTalkRoomPopupNav)localObject2).cqM();
      }
      else
      {
        localList = o.a.qyi.HE((String)localObject3);
        if (localList.size() == 0)
        {
          o.a.qyi.jy((String)localObject3);
          ((MultiTalkRoomPopupNav)localObject2).cqM();
        }
        else
        {
          i = o.a.qyi.dN((String)localObject3, ((MultiTalkRoomPopupNav)localObject2).toQ);
          if (i != 1) {
            break label1305;
          }
          ((MultiTalkRoomPopupNav)localObject2).setUserTalkingStatus$b292420(MultiTalkRoomPopupNav.b.tpa);
          if (!o.a.qyi.HF((String)localObject3)) {
            break;
          }
          ((MultiTalkRoomPopupNav)localObject2).cqM();
        }
      }
    }
    ((MultiTalkRoomPopupNav)localObject2).setInvitingBannerStyle(o.a.qyi.gT(o.a.qyi.dM((String)localObject3, ((MultiTalkRoomPopupNav)localObject2).toQ)));
    for (;;)
    {
      ((MultiTalkRoomPopupNav)localObject2).setVisibility(0);
      ((MultiTalkRoomPopupNav)localObject2).toK.setVisibility(0);
      ((MultiTalkRoomPopupNav)localObject2).toL.setVisibility(0);
      if ((((MultiTalkRoomPopupNav)localObject2).toT != null) && ((paramBoolean) || (((MultiTalkRoomPopupNav)localObject2).toV == null) || (((MultiTalkRoomPopupNav)localObject2).toV.getVisibility() != 0))) {
        MultiTalkRoomPopupNav.a.a(((MultiTalkRoomPopupNav)localObject2).toT);
      }
      ((MultiTalkRoomPopupNav)localObject2).dw(MultiTalkRoomPopupNav.k(localList, ""));
      break;
      label1305:
      if (i == 10)
      {
        ((MultiTalkRoomPopupNav)localObject2).setUserTalkingStatus$b292420(MultiTalkRoomPopupNav.b.tpb);
        if (o.a.qyi.HF((String)localObject3))
        {
          ((MultiTalkRoomPopupNav)localObject2).cqM();
          break;
        }
        if (o.a.qyi.bgl())
        {
          ((MultiTalkRoomPopupNav)localObject2).cqM();
          break;
        }
        ((MultiTalkRoomPopupNav)localObject2).setUserTalkingStatus$b292420(MultiTalkRoomPopupNav.b.tpc);
        ((MultiTalkRoomPopupNav)localObject2).setDefaultBannerStyle(ad.getContext().getString(R.l.multitalk_somepepole_in_tip, new Object[] { Integer.valueOf(localList.size()) }));
        continue;
      }
      ((MultiTalkRoomPopupNav)localObject2).setUserTalkingStatus$b292420(MultiTalkRoomPopupNav.b.tpc);
      ((MultiTalkRoomPopupNav)localObject2).setDefaultBannerStyle(ad.getContext().getString(R.l.multitalk_somepepole_in_tip, new Object[] { Integer.valueOf(localList.size()) }));
    }
    cwe();
  }
  
  public final void SF(String paramString)
  {
    if ((this.bAG != null) && (paramString.equals(this.bAG.getTalkerUserName()))) {
      lW(false);
    }
  }
  
  public final void aar(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("map_view_type", 6);
    localIntent.putExtra("map_sender_name", this.bAG.cwp());
    localIntent.putExtra("map_talker_name", this.bAG.getTalkerUserName());
    localIntent.putExtra("fromWhereShare", paramString);
    com.tencent.mm.bg.d.b(this.bAG.tTq.getContext(), "location", ".ui.RedirectUI", localIntent);
  }
  
  public final void ad(final Runnable paramRunnable)
  {
    if ((com.tencent.mm.ay.d.elh != null) && (com.tencent.mm.ay.d.elh.az(this.bAG.oLT.field_username, this.bAG.cwp())))
    {
      com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.track_leave_chattingui), this.bAG.tTq.getMMResources().getString(R.l.app_tip), true, new DialogInterface.OnClickListener()new aj.6
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramRunnable.run();
          paramAnonymousDialogInterface = new er();
          paramAnonymousDialogInterface.bMv.username = aj.this.bAG.getTalkerUserName();
          com.tencent.mm.sdk.b.a.sFg.m(paramAnonymousDialogInterface);
        }
      }, new aj.6(this));
      return;
    }
    paramRunnable.run();
  }
  
  public final void by(String paramString, boolean paramBoolean)
  {
    if (((com.tencent.mm.ay.d.elh != null) && (com.tencent.mm.ay.d.elh.nt(this.bAG.oLT.field_username))) || (paramBoolean))
    {
      LinkedList localLinkedList = com.tencent.mm.ay.d.elh.ns(this.bAG.oLT.field_username);
      if ((localLinkedList == null) || (!localLinkedList.contains(this.bAG.cwp())))
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(10997, new Object[] { Integer.valueOf(13), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.enter_track_tips), null, new aj.3(this, paramString), new aj.4(this));
        return;
      }
    }
    aar(paramString);
  }
  
  public final void cpI()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.TrackRoomComponent", "[onChattingResume]");
    if (g.elf != null) {
      g.elf.a(this);
    }
    if (com.tencent.mm.ay.d.elh != null) {
      com.tencent.mm.ay.d.elh.a(this);
    }
    if (o.a.qyi != null) {
      o.a.qyi.a(this);
    }
    lW(true);
  }
  
  public final void cpJ()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.TrackRoomComponent", "[onChattingPause]");
    if (g.elf != null) {
      g.elf.b(this);
    }
    if (com.tencent.mm.ay.d.elh != null) {
      com.tencent.mm.ay.d.elh.b(this);
    }
    if (o.a.qyi != null) {
      o.a.qyi.b(this);
    }
  }
  
  public final void cpK() {}
  
  public final void cun()
  {
    super.cun();
    if (this.tSG != null) {
      this.tSG.stop();
    }
  }
  
  public final boolean cwb()
  {
    if (this.tSG == null) {}
    while (this.tSG.getVisibility() != 0) {
      return false;
    }
    return true;
  }
  
  public final boolean cwc()
  {
    if (this.tSH == null) {}
    while (this.tSH.getVisibility() != 0) {
      return false;
    }
    return true;
  }
  
  public final int cwd()
  {
    if (this.tSG == null) {
      return 0;
    }
    return this.tSG.getHeight();
  }
  
  public final void lX(boolean paramBoolean)
  {
    if ((((com.tencent.mm.ui.chatting.b.b.e)this.bAG.O(com.tencent.mm.ui.chatting.b.b.e.class)).cuI()) || (((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cux())) {}
    for (int i = 1; (this.bAG.getTalkerUserName().toLowerCase().endsWith("@chatroom")) && (i == 0); i = 0)
    {
      com.tencent.mm.ui.base.h.b(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.talk_room_kicked_tip), null, true);
      return;
    }
    Object localObject1 = new rn();
    ((rn)localObject1).ccn.ccp = true;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
    if (!paramBoolean)
    {
      if ((com.tencent.mm.ay.d.elh != null) && (com.tencent.mm.ay.d.elh.nt(this.bAG.oLT.field_username)))
      {
        localObject1 = com.tencent.mm.ay.d.elh.ns(this.bAG.oLT.field_username);
        if ((localObject1 != null) && (((List)localObject1).contains(this.bAG.cwp()))) {
          localObject1 = this.bAG.tTq.getMMResources().getString(R.l.talk_room_err_myself_sharing_location);
        }
        for (i = R.l.enter_sharing_location;; i = R.l.join_sharing_location)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.h(10997, new Object[] { Integer.valueOf(19), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          localObject2 = new c.a(this.bAG.tTq.getContext());
          ((c.a)localObject2).abu((String)localObject1);
          ((c.a)localObject2).Gt(R.l.app_cancel).a(new aj.8(this));
          ((c.a)localObject2).Gu(i).b(new aj.9(this, paramBoolean));
          ((c.a)localObject2).anj().show();
          return;
          localObject1 = this.bAG.tTq.getMMResources().getString(R.l.talk_room_err_other_sharing_location);
        }
      }
      if ((!bi.oW(((rn)localObject1).cco.ccr)) && (!this.bAG.getTalkerUserName().equals(((rn)localObject1).cco.ccr)))
      {
        com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.talk_room_change_room_tip), null, new aj.10(this), new aj.11(this));
        return;
      }
      aas(this.bAG.getTalkerUserName());
      return;
    }
    if ((bi.oW(((rn)localObject1).cco.ccr)) || (this.bAG.getTalkerUserName().equals(((rn)localObject1).cco.ccr)))
    {
      aas(this.bAG.getTalkerUserName());
      return;
    }
    if ((this.tSG == null) || (this.tSG.getVisibility() != 0))
    {
      com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.talk_room_change_room_tip), null, new aj.12(this), new aj.2(this));
      return;
    }
    this.tSG.setDialogContent(this.bAG.tTq.getMMResources().getString(R.l.talk_room_change_room_tip));
    localObject1 = this.tSG;
    if (((TalkRoomPopupNav)localObject1).tBd == null)
    {
      ((TalkRoomPopupNav)localObject1).tBd = new ScaleAnimation(1.0F, 1.0F, ((TalkRoomPopupNav)localObject1).tBf * 1.0F / ((TalkRoomPopupNav)localObject1).tBg, 1.0F);
      ((TalkRoomPopupNav)localObject1).tBd.setDuration(300L);
      ((TalkRoomPopupNav)localObject1).tBd.setAnimationListener(new TalkRoomPopupNav.4((TalkRoomPopupNav)localObject1));
    }
    if (((TalkRoomPopupNav)localObject1).tBe == null)
    {
      ((TalkRoomPopupNav)localObject1).tBe = AnimationUtils.loadAnimation(((TalkRoomPopupNav)localObject1).getContext(), R.a.fast_faded_out);
      ((TalkRoomPopupNav)localObject1).tBe.setFillAfter(true);
      ((TalkRoomPopupNav)localObject1).tBe.setAnimationListener(new TalkRoomPopupNav.5((TalkRoomPopupNav)localObject1));
    }
    Object localObject2 = ((TalkRoomPopupNav)localObject1).iZk.getLayoutParams();
    ((ViewGroup.LayoutParams)localObject2).height = ((TalkRoomPopupNav)localObject1).tBg;
    ((TalkRoomPopupNav)localObject1).iZk.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    ((TalkRoomPopupNav)localObject1).iZk.startAnimation(((TalkRoomPopupNav)localObject1).tBd);
    ((TalkRoomPopupNav)localObject1).toK.startAnimation(((TalkRoomPopupNav)localObject1).tBe);
    ((TalkRoomPopupNav)localObject1).tAZ.startAnimation(AnimationUtils.loadAnimation(((TalkRoomPopupNav)localObject1).getContext(), R.a.fast_faded_in));
    ((TalkRoomPopupNav)localObject1).tAZ.setVisibility(0);
  }
  
  public final void nu(String paramString)
  {
    if ((this.bAG != null) && (paramString.equals(this.bAG.getTalkerUserName()))) {
      lW(false);
    }
  }
  
  public final void p(String paramString1, String paramString2, String paramString3)
  {
    if ((this.bAG != null) && (paramString1.equals(this.bAG.getTalkerUserName()))) {
      lW(false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/b/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */