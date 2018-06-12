package com.tencent.mm.ui.chatting.b;

import android.text.TextUtils;
import android.widget.AbsListView;
import com.tencent.mm.ac.f;
import com.tencent.mm.booter.z;
import com.tencent.mm.booter.z.a;
import com.tencent.mm.g.a.ar;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.m;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.w;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.chatting.b.b.ag;
import com.tencent.mm.ui.chatting.b.b.p;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.chatting.b.a.a(cwo=com.tencent.mm.ui.chatting.b.b.i.class)
public class k
  extends a
  implements com.tencent.mm.ui.chatting.b.b.i
{
  private static String tPh = "100134";
  private long hej = 0L;
  private boolean tOB = false;
  private HashSet<Long> tPc = new HashSet();
  private HashSet<Long> tPd = new HashSet();
  private HashSet<Long> tPe = new HashSet();
  private int tPf = 0;
  private boolean tPg = false;
  private long tPi = 0L;
  private boolean tPj = false;
  private String tPk = null;
  private long tPl = 0L;
  private int tPm = 0;
  
  private void cuV()
  {
    int i = 0;
    h localh;
    if (this.tPj)
    {
      long l1 = System.currentTimeMillis();
      long l2 = this.tPi;
      this.tPi = 0L;
      this.tPj = false;
      localh = h.mEJ;
      if (i >= 8) {
        break label134;
      }
      if (l1 - l2 >= new long[] { 0L, 200L, 400L, 600L, 800L, 1000L, 1500L, 2000L }[i]) {
        break label115;
      }
    }
    for (;;)
    {
      localh.a(109L, i, 1L, true);
      return;
      label115:
      if (i == 7)
      {
        i = 8;
      }
      else
      {
        i += 1;
        break;
        label134:
        i = -1;
      }
    }
  }
  
  private void xP()
  {
    this.tPk = null;
    if ((!q.GF().equals(this.bAG.getTalkerUserName())) && (s.fq(this.bAG.getTalkerUserName())))
    {
      this.tPk = this.bAG.getTalkerUserName();
      this.hej = (com.tencent.mm.model.bd.Ik() / 1000L * 1000L);
      this.tPm = 0;
      String str = this.tPk;
      au.Em().H(new k.4(this, str));
    }
    com.tencent.mm.modelstat.d.b(3, "ChattingUI" + this.bAG.tTq.getIdentityString(), hashCode());
    cuV();
  }
  
  public final void aV(final com.tencent.mm.storage.bd parambd)
  {
    if (!this.tPc.contains(Long.valueOf(parambd.field_msgSvrId)))
    {
      this.tPc.add(Long.valueOf(parambd.field_msgSvrId));
      e.post(new Runnable()
      {
        public final void run()
        {
          ((com.tencent.mm.plugin.sns.b.i)g.l(com.tencent.mm.plugin.sns.b.i.class)).Z(parambd);
          com.tencent.mm.storage.bd localbd = parambd;
          boolean bool1 = this.tPn;
          Object localObject2 = new PString();
          Object localObject1 = new PString();
          boolean bool2;
          com.tencent.mm.modelsns.d locald;
          if (com.tencent.mm.ui.chatting.a.a(localbd, (PString)localObject2, (PString)localObject1))
          {
            Object localObject3 = ((PString)localObject2).value;
            String str = ((PString)localObject1).value;
            localObject2 = localbd.field_talker;
            bool2 = ((String)localObject2).endsWith("@chatroom");
            if (localbd.field_isSend != 1) {
              break label522;
            }
            localObject1 = q.GF();
            locald = new com.tencent.mm.modelsns.d();
            locald.r("20source_publishid", (String)localObject3 + ",");
            locald.r("21uxinfo", str + ",");
            locald.r("22clienttime", bi.VF() + ",");
            localObject3 = new StringBuilder();
            if (localbd.getType() != 62) {
              break label546;
            }
            i = 1;
            label213:
            locald.r("23source_type", i + ",");
            localObject3 = new StringBuilder();
            if (!bool2) {
              break label551;
            }
            i = 4;
            label249:
            locald.r("24scene", i + ",");
            locald.r("25scene_chatname", (String)localObject2 + ",");
            locald.r("26scene_username", (String)localObject1 + ",");
            locald.r("27curr_publishid", ",");
            locald.r("28curr_msgid", localbd.field_msgSvrId + ",");
            locald.r("29curr_favid", "0,");
            localObject1 = new StringBuilder();
            if (!bool1) {
              break label556;
            }
            i = 1;
            label387:
            locald.r("30isdownload", i + ",");
            localObject1 = new StringBuilder();
            if (!bool2) {
              break label561;
            }
          }
          label522:
          label546:
          label551:
          label556:
          label561:
          for (int i = m.gK((String)localObject2);; i = 0)
          {
            locald.r("31chatroom_membercount", i + ",");
            ((com.tencent.mm.plugin.sns.b.i)g.l(com.tencent.mm.plugin.sns.b.i.class)).b(((com.tencent.mm.plugin.sns.b.i)g.l(com.tencent.mm.plugin.sns.b.i.class)).C(localbd), locald);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AdVideoStatistic", "report snsad_video_exposure: " + locald.wF());
            h.mEJ.h(12989, new Object[] { locald });
            return;
            if (bool2)
            {
              localObject1 = com.tencent.mm.model.bd.iB(localbd.field_content);
              break;
            }
            localObject1 = localObject2;
            break;
            i = 2;
            break label213;
            i = 3;
            break label249;
            i = 0;
            break label387;
          }
        }
      }, "ChattingUI.adVideoExposeReport");
    }
  }
  
  public final void aW(com.tencent.mm.storage.bd parambd)
  {
    if (this.tPd.contains(Long.valueOf(parambd.field_msgSvrId))) {
      return;
    }
    this.tPd.add(Long.valueOf(parambd.field_msgSvrId));
    e.post(new k.2(this, parambd), "ChattingUI.expExposeReport");
  }
  
  public final void aX(com.tencent.mm.storage.bd parambd)
  {
    if (!this.tPg)
    {
      this.tPg = true;
      com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ(tPh);
      if (localc.isValid()) {
        this.tPf = com.tencent.mm.platformtools.ai.getInt((String)localc.ckq().get("needUploadData"), 0);
      }
    }
    if (this.tPf == 0) {}
    while (this.tPe.contains(Long.valueOf(parambd.field_msgSvrId))) {
      return;
    }
    e.post(new k.3(this, parambd), "ChattingUI.appExposeReport");
  }
  
  public final void cpF()
  {
    if (bi.oW(this.bAG.getTalkerUserName())) {
      h.mEJ.a(110L, 0L, 1L, true);
    }
  }
  
  public final void cpG()
  {
    this.tPi = System.currentTimeMillis();
    this.tPj = true;
    if ((this.bAG.oLT == null) || (this.bAG.getTalkerUserName() == null)) {}
    label142:
    label560:
    label718:
    label778:
    for (;;)
    {
      this.tOB = true;
      xP();
      return;
      com.tencent.mm.modelstat.b.ehL.cE(this.bAG.getTalkerUserName());
      Object localObject;
      if (!q.GF().equals(this.bAG.getTalkerUserName()))
      {
        localObject = new ar();
        ((ar)localObject).bIf.bIg = true;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      }
      boolean bool = ((ag)this.bAG.O(ag.class)).BD();
      int j;
      int k;
      int i;
      if ("notification_messages".equals(this.bAG.getTalkerUserName()))
      {
        j = 1;
        k = 0;
        i = 8;
        if (!this.bAG.cwq()) {
          break label718;
        }
        i = 0;
      }
      for (;;)
      {
        if (i == 0) {
          break label778;
        }
        au.HU();
        localObject = com.tencent.mm.model.c.FW().Yq(this.bAG.getTalkerUserName());
        if (localObject == null) {}
        for (int m = 0;; m = ((am)localObject).field_unReadCount)
        {
          localObject = z.cXH;
          String str = this.bAG.getTalkerUserName();
          if (((z)localObject).cXR == null) {
            ((z)localObject).cXR = q.GF();
          }
          if (((z)localObject).cXR.equals(str)) {
            break;
          }
          if (((z)localObject).cXL != null)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.StayTimeReport", "enterChattingUI, not close:%s", new Object[] { ((z)localObject).cXL.cXY });
            ((z)localObject).eG(((z)localObject).cXL.cXY);
          }
          if (((z)localObject).cXI.Di(6) == 0) {
            ((z)localObject).cXI.setLong(4, com.tencent.mm.platformtools.ai.VE());
          }
          com.tencent.mm.sdk.b.a.sFg.a(((z)localObject).cXJ);
          com.tencent.mm.sdk.b.a.sFg.a(((z)localObject).cXK);
          ((z)localObject).cXL = new z.a((z)localObject);
          ((z)localObject).cXL.cYd = ((z)localObject).cXM;
          ((z)localObject).cXM = 0;
          ((z)localObject).cXL.cXY = str;
          ((z)localObject).cXP = com.tencent.mm.platformtools.ai.VG();
          ((z)localObject).cXL.type = i;
          ((z)localObject).cXL.cXZ = j;
          ((z)localObject).cXL.bGz = m;
          ((z)localObject).cXL.cYa = k;
          ((z)localObject).cXL.cYb = com.tencent.mm.platformtools.ai.VE();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.StayTimeReport", "enter chattingUI: chatUser:%s----type:%d, notifyOpen:%d, unreadCount:%d, membercount:%d", new Object[] { str, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(k) });
          break;
          if (s.hf(this.bAG.getTalkerUserName()))
          {
            localObject = (com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class);
            if (((com.tencent.mm.ui.chatting.b.b.c)localObject).cur())
            {
              if (bool) {}
              for (i = 0;; i = 1)
              {
                if (!((com.tencent.mm.ui.chatting.b.b.c)localObject).cus()) {
                  break label560;
                }
                k = ((com.tencent.mm.ui.chatting.b.b.c)localObject).cup().Nn().size();
                m = 5;
                j = i;
                i = m;
                break;
              }
              k = 0;
              m = 4;
              j = i;
              i = m;
              break label142;
            }
            if (f.kL(this.bAG.getTalkerUserName()))
            {
              if (bool) {}
              for (j = 0;; j = 1)
              {
                k = 0;
                i = 3;
                break;
              }
            }
            if (f.kM(this.bAG.getTalkerUserName()))
            {
              j = 1;
              k = 0;
              i = 0;
              break label142;
            }
            if (f.kI(this.bAG.getTalkerUserName()))
            {
              i = 6;
              j = 0;
            }
          }
          for (;;)
          {
            k = 0;
            break;
            i = 7;
            j = 0;
            continue;
            if (s.fq(this.bAG.getTalkerUserName()))
            {
              k = m.gK(this.bAG.getTalkerUserName());
              if (bool) {}
              for (j = 0;; j = 1)
              {
                i = 2;
                break;
              }
            }
            if (bool)
            {
              j = 0;
              i = 1;
            }
            else
            {
              j = 1;
              i = 1;
            }
          }
          localObject = s.dAV;
          int n = localObject.length;
          m = 0;
          while (m < n)
          {
            if (localObject[m].equals(this.bAG.getTalkerUserName())) {
              i = 0;
            }
            m += 1;
          }
        }
      }
    }
  }
  
  public final void cpH() {}
  
  public final void cpI()
  {
    if (!this.tOB) {
      xP();
    }
    this.tOB = false;
  }
  
  public final void cpJ()
  {
    if ((!TextUtils.isEmpty(this.tPk)) && (s.fq(this.bAG.getTalkerUserName())))
    {
      this.tPl = com.tencent.mm.model.bd.Ik();
      String str = this.tPk;
      this.tPk = "";
      int k = ((p)this.bAG.O(p.class)).cvB();
      if (k == 2) {
        ((p)this.bAG.O(p.class)).cvA();
      }
      int j = 0;
      int i = j;
      if (s.fq(this.bAG.getTalkerUserName()))
      {
        i = j;
        if (this.bAG.oLT.csI == 0) {
          i = 1;
        }
      }
      au.Em().H(new k.5(this, str, k, i));
    }
  }
  
  public final void cpK()
  {
    z.cXH.eG(this.bAG.getTalkerUserName());
    com.tencent.mm.modelstat.b.ehL.xP();
    ar localar = new ar();
    localar.bIf.bIg = false;
    com.tencent.mm.sdk.b.a.sFg.m(localar);
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    super.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 2) {
      com.tencent.mm.bv.d.cov().dh(ChattingUI.class.getName() + ".Listview", 4);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */