package com.tencent.mm.plugin.multitalk.a;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.widget.Toast;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.mz;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.ao;
import com.tencent.mm.model.au;
import com.tencent.mm.model.m;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.w;
import com.tencent.pb.common.b.a.a.aa;
import com.tencent.pb.common.b.a.a.am;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.z;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;

public final class e
  implements com.tencent.pb.talkroom.sdk.a
{
  com.tencent.mm.compatible.util.b epT;
  private Timer gei;
  public boolean hEj;
  private boolean knY;
  public com.tencent.mm.plugin.voip.video.i koX;
  private long ltA = 0L;
  private long ltB = 30000L;
  public a ltC;
  i.a ltD;
  public boolean ltE;
  MultiTalkGroup ltF = null;
  long ltG = 0L;
  com.tencent.mm.sdk.platformtools.al ltH = new com.tencent.mm.sdk.platformtools.al(Looper.getMainLooper(), new e.10(this), true);
  ag ltI = new ag(Looper.getMainLooper());
  BroadcastReceiver ltJ = new e.2(this);
  com.tencent.mm.sdk.b.c ltK = new e.4(this);
  boolean ltm;
  public boolean ltn;
  public boolean lto;
  int ltp;
  public boolean ltq = true;
  public HashSet<String> ltr = new HashSet();
  public com.tencent.mm.plugin.multitalk.ui.widget.e lts = com.tencent.mm.plugin.multitalk.ui.widget.e.lvI;
  public MultiTalkGroup ltt = null;
  private k ltu;
  private long ltv = 0L;
  public int ltw = 0;
  private int ltx = 0;
  private int lty = 2;
  private boolean ltz = false;
  
  public e()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.ltK);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.PHONE_STATE");
    localIntentFilter.addAction("android.intent.action.PHONE_STATE_2");
    localIntentFilter.addAction("android.intent.action.PHONE_STATE2");
    localIntentFilter.addAction("android.intent.action.PHONE_STATE_EXT");
    localIntentFilter.addAction("android.intent.action.DUAL_PHONE_STATE");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    ad.getContext().registerReceiver(this.ltJ, localIntentFilter);
    this.koX = new com.tencent.mm.plugin.voip.video.i(ad.getContext());
    this.epT = new com.tencent.mm.compatible.util.b(ad.getContext());
    this.ltE = false;
  }
  
  public static void Hz(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "generateMsgExitMsg");
    bd localbd = new bd();
    localbd.setType(64);
    localbd.ay(System.currentTimeMillis());
    localbd.setStatus(6);
    localbd.setContent(ad.getContext().getString(R.l.multitalk_system_slave_misscall_exit_msg));
    if (m.gC(paramString))
    {
      localbd.ep(paramString);
      localbd.setContent(localbd.field_content);
      au.HU();
      com.tencent.mm.model.c.FT().T(localbd);
    }
  }
  
  private void YN()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "startTimeCount");
    if (this.gei != null)
    {
      this.gei.cancel();
      return;
    }
    this.ltv = System.currentTimeMillis();
    this.ltw = 0;
    this.gei = new Timer();
    e.3 local3 = new e.3(this);
    this.gei.schedule(local3, 1000L, 1000L);
  }
  
  private static void a(MultiTalkGroup paramMultiTalkGroup, com.tencent.mm.plugin.multitalk.ui.widget.e parame, boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "generateMsgExitMsg");
    if ((parame == com.tencent.mm.plugin.multitalk.ui.widget.e.lvJ) && (paramBoolean))
    {
      parame = new bd();
      parame.setType(64);
      parame.ay(System.currentTimeMillis());
      parame.setStatus(6);
      parame.setContent(ad.getContext().getString(R.l.multitalk_system_slave_misscall_exit_msg));
      if (m.gC(paramMultiTalkGroup.vgo))
      {
        parame.ep(paramMultiTalkGroup.vgo);
        parame.setContent(parame.field_content);
        au.HU();
        com.tencent.mm.model.c.FT().T(parame);
      }
    }
  }
  
  private boolean a(MultiTalkGroup paramMultiTalkGroup)
  {
    if (!bgl())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "first time update multitalk group: %s", new Object[] { i.h(paramMultiTalkGroup) });
      this.ltt = paramMultiTalkGroup;
      this.ltw = 0;
      this.ltp = 1;
      this.ltr.clear();
      bgp();
      sort();
      return true;
    }
    if (i.a(paramMultiTalkGroup, this.ltt))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "update multitalk group: %s", new Object[] { i.h(paramMultiTalkGroup) });
      Object localObject1 = this.ltt;
      HashMap localHashMap = new HashMap();
      Object localObject2 = paramMultiTalkGroup.vgq.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)((Iterator)localObject2).next();
        localHashMap.put(localMultiTalkGroupMember.vgr, localMultiTalkGroupMember);
      }
      localObject1 = ((MultiTalkGroup)localObject1).vgq.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (MultiTalkGroupMember)((Iterator)localObject1).next();
        if ((!q.GF().equals(((MultiTalkGroupMember)localObject2).vgr)) && (q.GF().equals(((MultiTalkGroupMember)localObject2).vgs)) && (((MultiTalkGroupMember)localObject2).status == 1) && ((!localHashMap.containsKey(((MultiTalkGroupMember)localObject2).vgr)) || (((MultiTalkGroupMember)localHashMap.get(((MultiTalkGroupMember)localObject2).vgr)).status == 20)))
        {
          localObject2 = ((MultiTalkGroupMember)localObject2).vgr;
          localObject2 = ad.getContext().getString(R.l.multitalk_system_busy_exit_msg, new Object[] { r.gT((String)localObject2) });
          localObject2 = j.a(ad.getContext(), (CharSequence)localObject2);
          Toast.makeText(ad.getContext(), (CharSequence)localObject2, 0).show();
        }
      }
      this.ltt = paramMultiTalkGroup;
      bgp();
      sort();
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MT.MultiTalkManager", "updateCurrentMultiTalkGroup: not same multitalk\ncurrentGroup=%s\nchangeGroup=%s", new Object[] { i.h(this.ltt), i.h(paramMultiTalkGroup) });
    return false;
  }
  
  private void amy()
  {
    if (this.gei != null)
    {
      this.gei.cancel();
      this.gei = null;
    }
  }
  
  private void b(com.tencent.mm.plugin.multitalk.ui.widget.e parame)
  {
    boolean bool = true;
    Object localObject = this.lts;
    this.lts = parame;
    if (localObject != parame) {
      if (parame == com.tencent.mm.plugin.multitalk.ui.widget.e.lvM)
      {
        localObject = new mz();
        ((mz)localObject).bYb.type = 1;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
        d.a(i.k(this.ltt), bgo(), i.l(this.ltt));
        o.bgN().stopRing();
        if ((au.HV().yK()) || (au.HV().yE())) {
          break label116;
        }
      }
    }
    for (;;)
    {
      gK(bool);
      if (this.ltC != null) {
        this.ltC.a(parame);
      }
      return;
      label116:
      bool = false;
    }
  }
  
  private void bgp()
  {
    Iterator localIterator = this.ltt.vgq.iterator();
    while (localIterator.hasNext())
    {
      MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)localIterator.next();
      if ((localMultiTalkGroupMember.status != 10) && (this.ltr.remove(localMultiTalkGroupMember.vgr))) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "remove video user according group %s", new Object[] { localMultiTalkGroupMember.vgr });
      }
    }
  }
  
  private void bgq()
  {
    if (this.lts == com.tencent.mm.plugin.multitalk.ui.widget.e.lvK) {}
    for (;;)
    {
      boolean bool = false;
      for (e locale = this;; locale = this)
      {
        locale.ltn = bool;
        this.hEj = false;
        this.ltD = i.bgF();
        return;
        if ((au.HV().yK()) || (au.HV().yE())) {
          break;
        }
        bool = true;
      }
    }
  }
  
  private void bgr()
  {
    if (i.i(this.ltt)) {
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.lvM);
    }
    while (this.ltC != null)
    {
      this.ltC.bcI();
      localObject = i.bgF();
      if (localObject != this.ltD) {
        this.ltD = ((i.a)localObject);
      }
      return;
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.lvL);
    }
    Object localObject = new Intent();
    com.tencent.mm.bg.d.b(ad.getContext(), "multitalk", ".ui.MultiTalkMainUI", (Intent)localObject);
  }
  
  private static boolean bgx()
  {
    for (;;)
    {
      try
      {
        TelephonyManager localTelephonyManager = (TelephonyManager)ad.getContext().getSystemService("phone");
        if (localTelephonyManager == null) {
          break label109;
        }
        i = localTelephonyManager.getCallState();
        switch (i)
        {
        default: 
          bool = false;
        }
      }
      catch (Exception localException1)
      {
        int i;
        boolean bool = false;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MT.MultiTalkManager", "get callState error , errMsg is %s", new Object[] { localException1.getLocalizedMessage() });
        return bool;
      }
      try
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "TelephoneManager.callState is %d", new Object[] { Integer.valueOf(i) });
        return bool;
      }
      catch (Exception localException2)
      {
        continue;
      }
      bool = false;
      continue;
      bool = true;
    }
    label109:
    return false;
  }
  
  private void c(MultiTalkGroup paramMultiTalkGroup)
  {
    com.tencent.mm.sdk.platformtools.x.l("MicroMsg.MT.MultiTalkManager", "enterNewMultiTalk", new Object[0]);
    if (a(paramMultiTalkGroup))
    {
      this.ltm = false;
      bgq();
      YN();
      paramMultiTalkGroup = new Intent();
      com.tencent.mm.bg.d.b(ad.getContext(), "multitalk", ".ui.MultiTalkMainUI", paramMultiTalkGroup);
    }
  }
  
  static boolean dE(Context paramContext)
  {
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((ActivityManager.RunningTaskInfo)((List)localObject).get(0)).topActivity;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MT.MultiTalkManager", "topActivity:" + ((ComponentName)localObject).flattenToString());
      if (!((ComponentName)localObject).getPackageName().equals(paramContext.getPackageName()))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "is in backGround.");
        return false;
      }
    }
    if (((KeyguardManager)ad.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "is in foreGround.");
    return true;
  }
  
  private void sort()
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MT.MultiTalkManager", "before sort: %s", new Object[] { this.ltt.vgq });
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.ltt.vgq.iterator();
    Object localObject = null;
    while (localIterator.hasNext())
    {
      MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)localIterator.next();
      if (!localMultiTalkGroupMember.vgr.equals(q.GF())) {
        localLinkedList.add(localMultiTalkGroupMember);
      } else {
        localObject = localMultiTalkGroupMember;
      }
    }
    Collections.sort(localLinkedList, new e.1(this));
    Collections.sort(localLinkedList, new e.7(this));
    Collections.sort(localLinkedList, new e.8(this));
    if (localObject != null) {
      localLinkedList.add(localObject);
    }
    this.ltt.vgq = localLinkedList;
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MT.MultiTalkManager", "after sort: %s", new Object[] { this.ltt.vgq });
  }
  
  public final boolean HA(String paramString)
  {
    if (bgm())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "ownerUserName : " + paramString);
      boolean bool = o.bgM().lta.HA(paramString);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "result of subscribeLargeVideo: " + bool);
      return bool;
    }
    return false;
  }
  
  public final void aWS()
  {
    this.knY = false;
    com.tencent.mm.plugin.voip.model.i.bJJ().dismiss();
    ((NotificationManager)ad.getContext().getSystemService("notification")).cancel(43);
  }
  
  public final void b(Activity paramActivity, String paramString1, String paramString2)
  {
    boolean bool2 = this.hEj;
    boolean bool3 = this.ltn;
    boolean bool4 = this.ltq;
    Object localObject = this.lts.toString();
    if (this.ltt == null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "createMultiTalk All Var Value:\n isMute: %b isHandsFree: %b isCameraFace: %b multiTalkStatus: %s groupIsNull: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), localObject, Boolean.valueOf(bool1) });
      d.bfX();
      if (!bgx()) {
        break;
      }
      com.tencent.mm.ui.base.h.i(paramActivity, R.l.in_phone_tip, R.l.app_tip);
      return;
    }
    if (com.tencent.mm.plugin.voip.b.d.bLS())
    {
      com.tencent.mm.ui.base.h.i(paramActivity, R.l.in_wechat_out_tip, R.l.app_tip);
      return;
    }
    if (com.tencent.mm.plugin.voip.b.d.bLT())
    {
      com.tencent.mm.ui.base.h.i(paramActivity, R.l.in_voip_tip, R.l.app_tip);
      return;
    }
    if (com.tencent.mm.ax.e.SA())
    {
      com.tencent.mm.ui.base.h.i(paramActivity, R.l.in_new_share_location_tip, R.l.app_tip);
      return;
    }
    if (com.tencent.mm.plugin.voip.b.d.bLU())
    {
      com.tencent.mm.ui.base.h.i(paramActivity, R.l.in_voip_cs_tip, R.l.app_tip);
      return;
    }
    if (bgl())
    {
      com.tencent.mm.ax.e.a(paramActivity, R.l.multitalk_exit_tip, null);
      return;
    }
    if ((this.ltz) && (System.currentTimeMillis() - this.ltA < this.ltB))
    {
      com.tencent.mm.ax.e.a(paramActivity, R.l.multitalk_overload_fail_tips, null);
      return;
    }
    this.ltz = false;
    paramActivity = bi.F(paramString1.split(","));
    paramString1 = new MultiTalkGroup();
    paramString1.vgn = o.bgM().lta.cEJ();
    paramString1.vgo = paramString2;
    localObject = paramActivity.iterator();
    if (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      MultiTalkGroupMember localMultiTalkGroupMember = new MultiTalkGroupMember();
      localMultiTalkGroupMember.vgr = str;
      if (str.equals(q.GF())) {}
      for (localMultiTalkGroupMember.status = 10;; localMultiTalkGroupMember.status = 1)
      {
        paramString1.vgq.add(localMultiTalkGroupMember);
        break;
      }
    }
    o.bgM().lta.bg(bi.f((Integer)au.HS().get(1)), q.GF());
    if (o.bgM().lta.f(paramString1.vgn, paramString2, paramActivity)) {
      d.bfV();
    }
    for (;;)
    {
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.lvK);
      c(paramString1);
      return;
      d.bfW();
    }
  }
  
  public final void b(final MultiTalkGroup paramMultiTalkGroup)
  {
    boolean bool2 = this.hEj;
    boolean bool3 = this.ltn;
    boolean bool4 = this.ltq;
    String str = this.lts.toString();
    boolean bool1;
    if (this.ltt == null)
    {
      bool1 = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk All Var Value:\n isMute: %b isHandsFree: %b isCameraFace: %b multiTalkStatus: %s groupIsNull: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), str, Boolean.valueOf(bool1) });
      d.bfY();
      if ((com.tencent.mm.k.f.Ak()) || (dE(ad.getContext()))) {
        break label172;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "NotificationConfig.isNewVoipMsgNotification() is false and is not in foreground, now return.");
      if ((this.ltF == null) && (this.ltH.ciq()))
      {
        this.ltF = paramMultiTalkGroup;
        this.ltH.J(2000L, 2000L);
        this.ltG = System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.h.mEJ.a(500L, 6L, 1L, false);
      }
    }
    label172:
    label419:
    do
    {
      return;
      bool1 = false;
      break;
      str = i.m(paramMultiTalkGroup);
      au.HU();
      ab localab = com.tencent.mm.model.c.FR().Yg(str);
      if (com.tencent.mm.k.g.AT().getInt("MultitalkBlockReceiver", 0) == 0) {}
      for (int i = 1; (i == 0) || (localab.BA()); i = 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "not open multitalk receiver or black user");
        ah.i(new e.11(this, paramMultiTalkGroup), 1000L);
        d.au(3, i.l(paramMultiTalkGroup));
        return;
      }
      if ((!bgl()) && (!com.tencent.mm.plugin.voip.b.d.bLT()) && (!com.tencent.mm.plugin.voip.b.d.bLS()) && (!com.tencent.mm.ax.e.SA())) {
        if (((TelephonyManager)ad.getContext().getSystemService("phone")).getCallState() == 0) {
          break label419;
        }
      }
      for (i = 1; (i != 0) || (com.tencent.mm.plugin.voip.b.d.bLU()) || (!com.tencent.mm.l.a.gd(localab.field_type)); i = 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk: exit multitalk: %s", new Object[] { i.h(paramMultiTalkGroup) });
        if (!m.gB(paramMultiTalkGroup.vgo))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", new Object[] { paramMultiTalkGroup.vgo });
          am.a.dBr.a(paramMultiTalkGroup.vgo, "", new e.12(this));
        }
        ah.i(new Runnable()
        {
          public final void run()
          {
            String str2 = paramMultiTalkGroup.vgm;
            String str1 = str2;
            if (bi.oW(str2)) {
              str1 = paramMultiTalkGroup.vgn;
            }
            o.bgM().lta.HI(str1);
          }
        }, 1000L);
        d.au(3, i.l(paramMultiTalkGroup));
        return;
      }
      if (!m.gB(paramMultiTalkGroup.vgo))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", new Object[] { paramMultiTalkGroup.vgo });
        am.a.dBr.a(paramMultiTalkGroup.vgo, "", null);
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk: %s", new Object[] { i.h(paramMultiTalkGroup) });
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.lvJ);
      d.au(1, i.l(paramMultiTalkGroup));
      if (com.tencent.mm.l.a.gd(localab.field_type)) {
        break label559;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk nofriend do not show invitingUI  inviter=%s,currentuser=%s", new Object[] { str, q.GF() });
    } while (!a(paramMultiTalkGroup));
    this.ltm = false;
    bgq();
    YN();
    return;
    label559:
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk friend show invitingUI inviter=%s,currentuser=%s", new Object[] { str, q.GF() });
    c(paramMultiTalkGroup);
  }
  
  public final void b(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!m.gB(paramString1))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", new Object[] { paramString1 });
      am.a.dBr.a(paramString1, "", new e.9(this));
    }
    bd localbd = new bd();
    localbd.setType(64);
    localbd.ay(System.currentTimeMillis());
    localbd.setStatus(6);
    localbd.eX(2);
    String str = r.gT(paramString2);
    Object localObject = paramString2;
    if (str != null) {
      if (!str.equals("")) {
        break label337;
      }
    }
    label272:
    label337:
    for (localObject = paramString2;; localObject = str)
    {
      paramString2 = (String)localObject + ad.getContext().getString(R.l.multitalk_system_master_start_multi_msg);
      localbd.setContent(paramString2);
      if (m.gC(paramString1))
      {
        localbd.ep(paramString1);
        au.HU();
        com.tencent.mm.model.c.FT().T(localbd);
        au.HU();
        localObject = com.tencent.mm.model.c.FW().Yq(paramString1);
        if (localObject == null) {
          break label272;
        }
        if (paramBoolean1) {
          ((com.tencent.mm.storage.ai)localObject).eV(((am)localObject).field_unReadCount + 1);
        }
        ((com.tencent.mm.storage.ai)localObject).setContent(paramString2);
        au.HU();
        if (com.tencent.mm.model.c.FW().a((com.tencent.mm.storage.ai)localObject, paramString1) == -1) {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MT.MultiTalkManager", "update cvs fail!!! for :" + paramString1);
        }
        if (paramBoolean2) {
          ((ao)au.getNotification()).a(localbd);
        }
      }
      do
      {
        return;
        localObject = new com.tencent.mm.storage.ai();
        ((com.tencent.mm.storage.ai)localObject).setUsername(paramString1);
        if (paramBoolean1) {
          ((com.tencent.mm.storage.ai)localObject).eV(1);
        }
        ((com.tencent.mm.storage.ai)localObject).setContent(paramString2);
        au.HU();
        com.tencent.mm.model.c.FW().d((com.tencent.mm.storage.ai)localObject);
      } while (!paramBoolean2);
      ((ao)au.getNotification()).a(localbd);
      return;
    }
  }
  
  public final void bB(List<a.am> paramList)
  {
    if (bgl())
    {
      this.ltr.clear();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MT.MultiTalkManager", "onVideoGroupMemberChange: %s", new Object[] { paramList });
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        a.am localam = (a.am)paramList.next();
        if ((localam.veA == 2) || (localam.veA == 3)) {
          this.ltr.add(localam.vez);
        }
      }
      this.ltr.remove(q.GF());
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onVideoGroupMemberChange %s", new Object[] { this.ltr });
      if (this.ltu != null) {
        this.ltu.tl(this.ltr.size());
      }
      if (this.ltC != null) {
        this.ltC.bfK();
      }
    }
  }
  
  public final boolean bgj()
  {
    i.bgE();
    return i.tj(this.ltp);
  }
  
  public final boolean bgk()
  {
    i.bgE();
    return i.tk(this.ltp);
  }
  
  public final boolean bgl()
  {
    if ((this.lts != com.tencent.mm.plugin.multitalk.ui.widget.e.lvI) && (this.ltt != null)) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MT.MultiTalkManager", "isMultiTalkConnecting %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public final boolean bgm()
  {
    if ((this.lts == com.tencent.mm.plugin.multitalk.ui.widget.e.lvL) || (this.lts == com.tencent.mm.plugin.multitalk.ui.widget.e.lvM)) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MT.MultiTalkManager", "isMultiTalkStarting %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public final boolean bgn()
  {
    if (this.lts == com.tencent.mm.plugin.multitalk.ui.widget.e.lvM) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MT.MultiTalkManager", "isMultiTalkTalking %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public final long bgo()
  {
    return System.currentTimeMillis() - this.ltv;
  }
  
  public final void bgs()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onMultiTalkReady");
  }
  
  public final void bgt()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onSwitchMultiTalkVideoSuss currentVideoAction %d", new Object[] { Integer.valueOf(this.ltp) });
  }
  
  public final void bgu()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onSubscribeLargeVideoSuss ");
  }
  
  public final void bgv()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "try to startNetworkReceiver");
    if (this.ltC == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MT.MultiTalkManager", "ui callback is null");
    }
    do
    {
      return;
      if (this.ltr.size() == 0)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "currentVideoUserSet.size() is 0,just return.");
        return;
      }
      if (this.ltu == null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "startNetworkReceiver: networkReceiver is null %d", new Object[] { Integer.valueOf(this.ltr.size()) });
        this.ltu = new k(this.ltC);
        this.ltu.tl(this.ltr.size());
      }
    } while (this.ltu.bFi);
    this.ltu.start();
  }
  
  public final void bgw()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "try to stopNetworkReceiver");
    if (this.ltu != null)
    {
      this.ltu.stop();
      this.ltu = null;
    }
  }
  
  public final void d(MultiTalkGroup paramMultiTalkGroup)
  {
    d.au(2, i.l(paramMultiTalkGroup));
    a(paramMultiTalkGroup, com.tencent.mm.plugin.multitalk.ui.widget.e.lvJ, true);
  }
  
  public final void e(MultiTalkGroup paramMultiTalkGroup)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onCreateMultiTalk: %s", new Object[] { i.h(paramMultiTalkGroup) });
    d.gH(true);
    if (a(paramMultiTalkGroup)) {
      bgr();
    }
  }
  
  public final void f(MultiTalkGroup paramMultiTalkGroup)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onEnterMultiTalk: %s", new Object[] { i.h(paramMultiTalkGroup) });
    mz localmz = new mz();
    localmz.bYb.type = 1;
    com.tencent.mm.sdk.b.a.sFg.m(localmz);
    d.gI(true);
    if (this.lts != com.tencent.mm.plugin.multitalk.ui.widget.e.lvJ)
    {
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.lvL);
      c(paramMultiTalkGroup);
    }
    if ((bgl()) && (a(paramMultiTalkGroup))) {
      bgr();
    }
  }
  
  public final void g(MultiTalkGroup paramMultiTalkGroup)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onMemberChange: %s", new Object[] { i.h(paramMultiTalkGroup) });
    if ((bgl()) && (a(paramMultiTalkGroup)))
    {
      if (i.j(this.ltt)) {
        break label70;
      }
      if (this.lts != com.tencent.mm.plugin.multitalk.ui.widget.e.lvJ) {
        break label62;
      }
      g(false, true, false);
    }
    label62:
    label70:
    do
    {
      return;
      g(false, false, false);
      return;
      if ((this.lts != com.tencent.mm.plugin.multitalk.ui.widget.e.lvM) && (i.i(paramMultiTalkGroup))) {
        b(com.tencent.mm.plugin.multitalk.ui.widget.e.lvM);
      }
    } while ((this.ltC == null) || (!i.c(this.lts)));
    this.ltC.bfJ();
  }
  
  public final void g(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = 4;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "exitCurrentMultiTalk: isReject %b isMissCall %b isPhoneCall %b isNetworkError %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Boolean.valueOf(false), Boolean.valueOf(paramBoolean3) });
    o.bgN().stopRing();
    Object localObject;
    boolean bool;
    long l;
    if (bgl())
    {
      localObject = new mz();
      ((mz)localObject).bYb.type = 2;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      localObject = i.l(this.ltt);
      d.Hy((String)localObject);
      if (this.lts != com.tencent.mm.plugin.multitalk.ui.widget.e.lvM)
      {
        bool = i.k(this.ltt);
        l = bgo();
        if (bool) {
          if (!paramBoolean2) {}
        }
      }
    }
    for (;;)
    {
      d.a(bool, l, (String)localObject, i);
      for (;;)
      {
        localObject = this.lts;
        if (this.ltC != null) {
          this.ltC.bfI();
        }
        this.lts = com.tencent.mm.plugin.multitalk.ui.widget.e.lvI;
        bgw();
        aWS();
        amy();
        o.bgL().reset();
        o.bgO().bgH();
        if (this.ltt != null)
        {
          a(this.ltt, (com.tencent.mm.plugin.multitalk.ui.widget.e)localObject, paramBoolean2);
          String str = this.ltt.vgm;
          localObject = str;
          if (bi.oW(str)) {
            localObject = this.ltt.vgn;
          }
          o.bgM().lta.HI((String)localObject);
          this.ltt = null;
        }
        this.ltp = 0;
        this.ltn = true;
        this.hEj = false;
        this.ltq = true;
        this.ltv = 0L;
        this.ltw = 0;
        this.ltr.clear();
        this.ltx = 0;
        return;
        if (paramBoolean1)
        {
          i = 1;
          break;
        }
        if (paramBoolean3)
        {
          i = 5;
          break;
        }
        i = 2;
        break;
        if (paramBoolean2)
        {
          if (l >= 45L)
          {
            i = 6;
            break;
          }
          i = 8;
          break;
        }
        if (paramBoolean1)
        {
          i = 7;
          break;
        }
        if (!paramBoolean3) {
          break label451;
        }
        i = 10;
        break;
        d.tg(this.ltw);
        d.n(this.ltw, (String)localObject);
      }
      bgw();
      aWS();
      amy();
      this.ltt = null;
      this.ltp = 0;
      this.ltv = 0L;
      this.ltw = 0;
      this.ltr.clear();
      this.lts = com.tencent.mm.plugin.multitalk.ui.widget.e.lvI;
      this.ltx = 0;
      return;
      label451:
      i = 0;
    }
  }
  
  public final void gD(boolean paramBoolean)
  {
    this.hEj = paramBoolean;
    if (this.ltC != null) {
      this.ltC.gD(this.hEj);
    }
  }
  
  public final void gF(boolean paramBoolean)
  {
    if ((o.bgN().bgm()) && (this.ltC != null))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "setHandFreeEnable: %s", new Object[] { Boolean.valueOf(paramBoolean) });
      this.ltC.gF(paramBoolean);
    }
  }
  
  public final void gJ(boolean paramBoolean)
  {
    if ((!bgl()) || (this.knY)) {
      return;
    }
    this.knY = true;
    d.f(i.bgC(), o.bgN().bgj(), paramBoolean);
    Toast.makeText(ad.getContext(), R.l.multitalk_mini_toast, 0).show();
    Object localObject1 = ad.getContext().getString(R.l.multitalk);
    String str = ad.getContext().getString(R.l.multitalk_recover);
    Object localObject2 = new Intent();
    ((Intent)localObject2).setClass(ad.getContext(), MultiTalkMainUI.class);
    localObject2 = PendingIntent.getActivity(ad.getContext(), 43, (Intent)localObject2, 134217728);
    int i = R.g.notification_icon_gray;
    if (com.tencent.mm.compatible.util.d.fS(19)) {
      i = R.g.notification_icon;
    }
    localObject1 = com.tencent.mm.plugin.voip.b.d.a(new Notification.Builder(ad.getContext()).setTicker(str).setWhen(System.currentTimeMillis()).setContentTitle((CharSequence)localObject1).setContentText(str).setContentIntent((PendingIntent)localObject2));
    ((Notification)localObject1).icon = i;
    ((Notification)localObject1).flags |= 0x20;
    au.getNotification().a(43, (Notification)localObject1, false);
    if (this.ltC != null) {
      this.ltC.aWY();
    }
    ah.A(new e.14(this));
  }
  
  public final void gK(boolean paramBoolean)
  {
    o.bgM().lta.gK(paramBoolean);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onSpeakerStateChange %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.ltn = paramBoolean;
    if (this.ltC != null) {
      this.ltC.gE(this.ltn);
    }
  }
  
  public final void gL(boolean paramBoolean)
  {
    if (this.ltm) {
      return;
    }
    this.koX.n(R.k.phonering, 0, paramBoolean);
    this.epT.requestFocus();
    this.ltm = true;
  }
  
  public final void h(int paramInt, Object paramObject)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onErr: %d", new Object[] { Integer.valueOf(paramInt) });
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sZI, Integer.valueOf(-1));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sZJ, Long.valueOf(-1L));
    int i;
    switch (paramInt)
    {
    default: 
      i = R.l.multitalk_error_600;
    }
    for (;;)
    {
      if (this.ltC != null) {
        this.ltC.onError(paramInt);
      }
      if ((paramInt != 64736) && (paramInt != 65036) && (paramInt != 63836))
      {
        Toast.makeText(ad.getContext(), ad.getContext().getString(i), 0).show();
        g(false, false, true);
      }
      return;
      d.gH(false);
      i = R.l.multitalk_error_100;
      continue;
      d.gI(false);
      i = R.l.multitalk_error_200;
      continue;
      i = R.l.multitalk_error_300;
      continue;
      i = R.l.multitalk_error_400;
      continue;
      i = R.l.multitalk_error_500;
      continue;
      i = R.l.multitalk_error_600;
      continue;
      i = R.l.multitalk_error_700;
      continue;
      i = R.l.multitalk_error_800;
      continue;
      i = R.l.multitalk_error_900;
      continue;
      i = R.l.multitalk_error_1000;
      continue;
      i = R.l.multitalk_error_1100;
      continue;
      i = R.l.multitalk_error_1200;
      continue;
      int j = R.l.multitalk_error_1300;
      this.ltz = true;
      this.ltA = System.currentTimeMillis();
      i = j;
      if (paramObject != null)
      {
        paramObject = (a.z)paramObject;
        i = j;
        if (paramObject != null)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "ErrorCode : -1300, now try set retrySeconds:" + ((a.z)paramObject).veg);
          i = j;
          if (((a.z)paramObject).veg != 0)
          {
            this.ltB = (((a.z)paramObject).veg * 1000);
            i = j;
            continue;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "14256,other device has handle this!");
            j = R.l.multitalk_error_14256;
            i = j;
            if (paramObject != null)
            {
              i = j;
              if ((a.aa)paramObject != null)
              {
                com.tencent.wecall.talkroom.model.a.cHu().mT(false);
                i = j;
                continue;
                i = R.l.multitalk_error_1400;
                continue;
                MultiTalkGroup localMultiTalkGroup = this.ltt;
                if (this.ltt != null) {}
                for (String str = this.ltt.vgo;; str = "")
                {
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onErr:MULTITALK_E_Talk_Enter_BannerClear  %d, currentMultiTalkGroup=%s,wxGroupId=%s", new Object[] { Integer.valueOf(paramInt), localMultiTalkGroup, str });
                  if (paramObject != null)
                  {
                    paramObject = (a.aa)paramObject;
                    if (paramObject != null)
                    {
                      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "ErrorCode :-14255,now exitMultiTalk for groupId : " + ((a.aa)paramObject).groupId);
                      if (((a.aa)paramObject).vcK != null)
                      {
                        o.bgP().HK(((a.aa)paramObject).vcK.vfd);
                        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "cleanBanner for wxGroupId :" + ((a.aa)paramObject).vcK.vfd);
                      }
                      if (!o.bgM().lta.HI(((a.aa)paramObject).groupId)) {
                        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "exit fail!!,now cleanBanner for groupId :" + ((a.aa)paramObject).groupId);
                      }
                    }
                  }
                  i = R.l.multitalk_system_master_finish_exit_msg;
                  break;
                }
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onErr, MULTITALK_ERRORCODE_SWITCHVIDEO_FAIL_DISABLE, disableTime: %s", new Object[] { paramObject });
                Toast.makeText(ad.getContext(), ad.getContext().getString(R.l.multitalk_disabled), 0).show();
                if (paramObject != null)
                {
                  i = ((Integer)paramObject).intValue();
                  if (i > 0)
                  {
                    au.HU();
                    com.tencent.mm.model.c.DT().a(aa.a.sZI, Integer.valueOf(i));
                    au.HU();
                    com.tencent.mm.model.c.DT().a(aa.a.sZJ, Long.valueOf(bi.VG()));
                  }
                }
                i = R.l.multitalk_disabled;
                continue;
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onErr, MULTITALK_ERRORCODE_ENGINE_NETWORK_FAIL");
                i = R.l.multitalk_network_failed;
              }
            }
          }
        }
      }
    }
  }
  
  public final void stopRing()
  {
    com.tencent.mm.sdk.f.e.post(new e.5(this), "MultiTalkManager_stop_ring");
  }
  
  public final void th(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "onNotifyLargeVideoSubscribersChange largeVideoSubscribersCnt: " + paramInt);
    if (paramInt > 0)
    {
      this.ltE = true;
      return;
    }
    this.ltE = false;
  }
  
  public final boolean ti(int paramInt)
  {
    if (bgm())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "try switch to action : " + paramInt);
      boolean bool = o.bgM().lta.ti(paramInt);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "switchMultiTalkVideo %b", new Object[] { Boolean.valueOf(bool) });
      int i = this.ltp;
      this.ltp = paramInt;
      if (bgk()) {
        bgv();
      }
      for (;;)
      {
        if ((this.ltC != null) && (i != this.ltp)) {
          this.ltC.cT(i, this.ltp);
        }
        return bool;
        bgw();
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/multitalk/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */