package com.tencent.mm.ui.chatting.b;

import android.content.Intent;
import android.content.res.Resources;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.bk;
import com.tencent.mm.g.a.iy;
import com.tencent.mm.g.a.rn;
import com.tencent.mm.g.a.rn.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.o.a;
import com.tencent.mm.pluginsdk.o.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.ak;
import com.tencent.mm.ui.chatting.b.b.ac;
import com.tencent.mm.ui.chatting.b.b.r;
import com.tencent.mm.ui.chatting.e;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.List;

@com.tencent.mm.ui.chatting.b.a.a(cwo=r.class)
public class x
  extends a
  implements r
{
  public final boolean aS(bd parambd)
  {
    if (parambd.aQo())
    {
      ak.aM(parambd);
      this.bAG.lT(true);
      return true;
    }
    return false;
  }
  
  public final void cpG()
  {
    iy localiy = new iy();
    localiy.bSB.bSv = 0;
    localiy.bSB.aem = w.chP();
    if (s.fq(this.bAG.oLT.field_username)) {}
    for (localiy.bSB.bSD = true;; localiy.bSB.bSD = false)
    {
      com.tencent.mm.sdk.b.a.sFg.m(localiy);
      return;
    }
  }
  
  public final void cpK()
  {
    bk localbk = new bk();
    com.tencent.mm.sdk.b.a.sFg.m(localbk);
  }
  
  public final void cun()
  {
    super.cun();
    iy localiy = new iy();
    localiy.bSB.bSv = 2;
    com.tencent.mm.sdk.b.a.sFg.m(localiy);
  }
  
  public final void cvF()
  {
    int i;
    if (ab.XR(this.bAG.getTalkerUserName())) {
      if ((((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.openim.a.b.class)).oD(this.bAG.oLT.field_openImAppid) & 0x1000) == 0) {
        i = 1;
      }
    }
    for (;;)
    {
      int j;
      label128:
      String[] arrayOfString;
      if ((!this.bAG.oLT.ckW()) && (!s.hL(this.bAG.getTalkerUserName())) && (!ab.XO(this.bAG.getTalkerUserName())) && (!ab.XQ(this.bAG.getTalkerUserName())) && (!ab.gY(this.bAG.getTalkerUserName())) && (!this.bAG.getTalkerUserName().equals(q.GF())))
      {
        j = 1;
        if ((j != 0) && (i == 0)) {
          break label196;
        }
        arrayOfString = new String[1];
        arrayOfString[0] = this.bAG.tTq.getMMResources().getString(R.l.location_send_poi);
      }
      for (;;)
      {
        com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), null, arrayOfString, null, new x.1(this));
        return;
        i = 0;
        break;
        j = 0;
        break label128;
        label196:
        arrayOfString = new String[2];
        arrayOfString[0] = this.bAG.tTq.getMMResources().getString(R.l.location_send_poi);
        arrayOfString[1] = this.bAG.tTq.getMMResources().getString(R.l.location_send_share);
      }
      i = 0;
    }
  }
  
  public final void cvG()
  {
    Intent localIntent = new Intent();
    com.tencent.mm.plugin.report.service.h.mEJ.h(12809, new Object[] { Integer.valueOf(1), "" });
    localIntent.putExtra("map_view_type", 0);
    localIntent.putExtra("map_sender_name", this.bAG.cwp());
    localIntent.putExtra("map_talker_name", this.bAG.getTalkerUserName());
    com.tencent.mm.bg.d.b(this.bAG.tTq.getContext(), "location", ".ui.RedirectUI", localIntent);
  }
  
  public final void cvH()
  {
    int i = 1;
    if ((!com.tencent.mm.p.a.by(this.bAG.tTq.getContext())) && (!com.tencent.mm.p.a.bw(this.bAG.tTq.getContext())))
    {
      if (o.a.qyi.HC(this.bAG.getTalkerUserName()))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.LocationComponent", "click share location, but now is in multitalk!");
        com.tencent.mm.ui.base.h.i(this.bAG.tTq.getContext(), R.l.multitalk_exit_tip, R.l.app_tip);
      }
    }
    else {
      return;
    }
    Object localObject2 = null;
    rn localrn = new rn();
    Object localObject1 = localObject2;
    if (com.tencent.mm.ax.g.elf != null)
    {
      localrn.ccn.ccp = true;
      com.tencent.mm.sdk.b.a.sFg.m(localrn);
      if (!bi.oW(localrn.cco.ccr)) {
        localObject1 = this.bAG.tTq.getMMResources().getString(R.l.enter_track_myself_talking_err);
      }
    }
    else
    {
      if (bi.oW((String)localObject1)) {
        break label318;
      }
      if ((com.tencent.mm.ay.d.elh == null) || (!com.tencent.mm.ay.d.elh.nt(this.bAG.oLT.field_username))) {
        break label340;
      }
      localObject2 = com.tencent.mm.ay.d.elh.ns(this.bAG.oLT.field_username);
      if ((localObject2 == null) || (!((List)localObject2).contains(this.bAG.cwp()))) {
        break label340;
      }
    }
    for (;;)
    {
      if (i == 0)
      {
        localObject2 = new c.a(this.bAG.tTq.getContext());
        ((c.a)localObject2).abu((String)localObject1);
        ((c.a)localObject2).Gt(R.l.i_know_it).a(new x.2(this));
        ((c.a)localObject2).anj().show();
        return;
        localObject1 = localObject2;
        if (!com.tencent.mm.ax.g.elf.nq(this.bAG.getTalkerUserName())) {
          break;
        }
        localObject1 = this.bAG.tTq.getMMResources().getString(R.l.enter_track_other_talking_err);
        break;
      }
      label318:
      ((ac)this.bAG.O(ac.class)).aar("fromPluginLocation");
      return;
      label340:
      i = 0;
    }
  }
  
  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      if (paramInt == 67)
      {
        cvG();
        return;
      }
      cvH();
      return;
    }
    com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.permission_location_request_again_msg), this.bAG.tTq.getMMResources().getString(R.l.permission_tips_title), this.bAG.tTq.getMMResources().getString(R.l.jump_to_settings), this.bAG.tTq.getMMResources().getString(R.l.cancel), false, new x.3(this), null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/chatting/b/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */