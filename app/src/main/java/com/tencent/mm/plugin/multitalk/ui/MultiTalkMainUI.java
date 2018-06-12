package com.tencent.mm.plugin.multitalk.ui;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jr;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.multitalk.a.e.6;
import com.tencent.mm.plugin.multitalk.a.i.a;
import com.tencent.mm.plugin.multitalk.a.m;
import com.tencent.mm.plugin.multitalk.a.o;
import com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkVideoView;
import com.tencent.mm.plugin.multitalk.ui.widget.f.a;
import com.tencent.mm.plugin.multitalk.ui.widget.f.b;
import com.tencent.mm.plugin.voip.ui.MMCheckBox;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import com.tencent.pb.talkroom.sdk.d;
import com.tencent.wecall.talkroom.model.TalkRoom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MultiTalkMainUI
  extends MMActivity
  implements com.tencent.mm.plugin.multitalk.a.a
{
  protected ag ioW;
  private com.tencent.mm.plugin.multitalk.ui.widget.c luQ;
  private com.tencent.mm.plugin.multitalk.ui.widget.f luR;
  private boolean luS;
  private boolean luT = true;
  private boolean luU = false;
  private Runnable luV = new Runnable()
  {
    public final void run()
    {
      o.bgN().bgv();
    }
  };
  private boolean luW;
  private BroadcastReceiver luX = new MultiTalkMainUI.3(this);
  
  private static int aXI()
  {
    if (au.HV().yE()) {
      return au.HV().yQ();
    }
    if (!o.bgN().koX.alf()) {
      return 3;
    }
    return 0;
  }
  
  public final int Hx(String paramString)
  {
    paramString = this.luR.HR(paramString);
    if (paramString == null) {
      return -1;
    }
    return ((f.a)paramString.getTag()).lwk.getPosition();
  }
  
  public final void a(i.a parama)
  {
    if (parama == i.a.luc) {
      o.bgL().w(this);
    }
    do
    {
      return;
      if (parama == i.a.lud)
      {
        o.bgL().v(this);
        return;
      }
    } while (parama != i.a.lue);
    com.tencent.mm.ax.e.a(this, R.l.voip_net_unavailable, null);
  }
  
  public final void a(com.tencent.mm.plugin.multitalk.ui.widget.e parame)
  {
    if (parame == com.tencent.mm.plugin.multitalk.ui.widget.e.lvM)
    {
      parame = this.luR;
      if (parame.lwh > 0L) {
        parame.lwh = System.currentTimeMillis();
      }
    }
  }
  
  public final void a(String paramString, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    this.luR.a(paramString, paramBitmap, paramInt1, paramInt2);
  }
  
  public final void a(String paramString, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    if (o.bgN().bgm()) {
      this.luR.a(paramString, paramArrayOfInt, paramInt1, paramInt2, paramInt3);
    }
  }
  
  public final void aWY()
  {
    jr localjr = new jr();
    localjr.bTt.action = 0;
    com.tencent.mm.sdk.b.a.sFg.m(localjr);
    this.luR.gO(true);
    o.bgN().ltC = null;
    o.bgN().stopRing();
    finish();
  }
  
  public final void aWZ()
  {
    Object localObject3 = this.luR;
    Object localObject1 = ((com.tencent.mm.plugin.multitalk.ui.widget.f)localObject3).hrs;
    long l = o.bgN().ltw;
    ((TextView)localObject1).setText(String.format("%02d:%02d", new Object[] { Long.valueOf(l / 60L), Long.valueOf(l % 60L) }));
    Object localObject4 = o.bgN();
    Object localObject2 = ((com.tencent.mm.plugin.multitalk.a.e)localObject4).ltt.vgm;
    localObject1 = localObject2;
    if (bi.oW((String)localObject2)) {
      localObject1 = ((com.tencent.mm.plugin.multitalk.a.e)localObject4).ltt.vgn;
    }
    localObject1 = o.bgM().lta.acj((String)localObject1);
    localObject2 = o.bgN().ltr;
    Object localObject5;
    if (localObject1 != null)
    {
      localObject4 = ((com.tencent.mm.plugin.multitalk.ui.widget.f)localObject3).lwa.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (f.a)((RelativeLayout)((Iterator)localObject4).next()).getTag();
        String str = ((f.a)localObject5).lwk.getUsername();
        if (((!q.GF().equals(str)) || (!((com.tencent.mm.plugin.multitalk.ui.widget.f)localObject3).bfL())) && (((List)localObject1).contains(str)) && (!((HashSet)localObject2).contains(str)))
        {
          ((f.a)localObject5).lwl.setVisibility(0);
          x.i("MicroMsg.MT.MultiTalkTalkingUILogic", "displayVoiceTalkingIcon, %s show", new Object[] { str });
        }
        else
        {
          ((f.a)localObject5).lwl.setVisibility(8);
          x.i("MicroMsg.MT.MultiTalkTalkingUILogic", "displayVoiceTalkingIcon, %s hide", new Object[] { str });
        }
      }
    }
    localObject4 = o.bgN();
    localObject2 = ((com.tencent.mm.plugin.multitalk.a.e)localObject4).ltt.vgm;
    localObject1 = localObject2;
    if (bi.oW((String)localObject2)) {
      localObject1 = ((com.tencent.mm.plugin.multitalk.a.e)localObject4).ltt.vgn;
    }
    if (m.luE == null) {
      m.luE = new m();
    }
    localObject4 = m.luE;
    localObject2 = new ArrayList();
    ((m)localObject4).luF = com.tencent.wecall.talkroom.model.c.cHG().adg((String)localObject1);
    if (((m)localObject4).luF != null)
    {
      localObject1 = ((m)localObject4).luF.cHD().iterator();
      label453:
      label514:
      label517:
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (a.av)((Iterator)localObject1).next();
        int i = ((a.av)localObject4).kpU;
        if (i >= 0)
        {
          localObject5 = new byte[4];
          if (o.bgM().lta.setAppCmd(10, (byte[])localObject5, i) < 0)
          {
            x.d("MicroMsg.Multitalk.VoipNetStatusChecker", "get netStatus failed memberId :%d", new Object[] { Integer.valueOf(i) });
            i = -1;
            if ((i == -1) || (i >= 5)) {
              break label514;
            }
          }
          for (i = 1;; i = 0)
          {
            if (i == 0) {
              break label517;
            }
            ((List)localObject2).add(((a.av)localObject4).vez);
            break;
            i = bi.aH((byte[])localObject5);
            x.d("MicroMsg.Multitalk.VoipNetStatusChecker", "netStatus: %d", new Object[] { Integer.valueOf(i) });
            break label453;
          }
        }
      }
    }
    localObject1 = ((com.tencent.mm.plugin.multitalk.ui.widget.f)localObject3).lwa.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (f.a)((RelativeLayout)((Iterator)localObject1).next()).getTag();
      if (((List)localObject2).contains(((f.a)localObject3).lwk.getUsername())) {
        ((f.a)localObject3).lwm.setVisibility(0);
      } else {
        ((f.a)localObject3).lwm.setVisibility(8);
      }
    }
  }
  
  public final void bcI()
  {
    this.luQ.bgT();
    this.luR.o(o.bgN().ltt);
  }
  
  public final void bfI()
  {
    au.HV().yC();
    com.tencent.mm.sdk.f.e.post(new e.6(o.bgN()), "MultiTalkManager_play_end_sound");
    jr localjr = new jr();
    localjr.bTt.action = 0;
    com.tencent.mm.sdk.b.a.sFg.m(localjr);
    this.luR.gO(false);
    o.bgN().ltC = null;
    o.bgN().stopRing();
    finish();
  }
  
  public final void bfJ()
  {
    switch (MultiTalkMainUI.6.luZ[o.bgN().lts.ordinal()])
    {
    default: 
      return;
    case 2: 
    case 3: 
    case 4: 
      this.luR.o(o.bgN().ltt);
      return;
    }
    this.luQ.n(o.bgN().ltt);
  }
  
  public final void bfK()
  {
    x.i("MicroMsg.MT.MultiTalkMainUI", "onVideoGroupMemberChange, SubCoreMultiTalk.getMultiTalkManager().getCurrentVideoUserSet().size(): " + o.bgN().ltr.size());
    if (o.bgN().bgm())
    {
      if (o.bgN().ltr.size() <= 0) {
        break label101;
      }
      com.tencent.mm.plugin.multitalk.a.i.bgE();
      o.bgN().bgv();
    }
    for (;;)
    {
      com.tencent.mm.plugin.multitalk.ui.widget.f localf = this.luR;
      HashSet localHashSet = new HashSet();
      localHashSet.addAll(o.bgN().ltr);
      if (o.bgN().bgk()) {
        localf.d(localHashSet);
      }
      return;
      label101:
      o.bgN().bgw();
    }
  }
  
  public final boolean bfL()
  {
    if (this.luR != null) {
      return this.luR.bfL();
    }
    return false;
  }
  
  public final void bgS()
  {
    this.luW = true;
    Intent localIntent = new Intent(this, MultiTalkAddMembersUI.class);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = o.bgN().ltt.vgq.iterator();
    while (localIterator.hasNext())
    {
      MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)localIterator.next();
      if ((localMultiTalkGroupMember.status == 10) || (localMultiTalkGroupMember.status == 1)) {
        localArrayList.add(localMultiTalkGroupMember.vgr);
      }
    }
    localIntent.putExtra("titile", getString(R.l.multitalk_add_contact));
    localIntent.putExtra("chatroomName", o.bgN().ltt.vgo);
    localIntent.putExtra("always_select_contact", bi.c(localArrayList, ","));
    localIntent.putExtra("key_need_gallery", false);
    startActivityForResult(localIntent, 1);
  }
  
  public final void cT(int paramInt1, int paramInt2)
  {
    com.tencent.mm.plugin.multitalk.ui.widget.f localf;
    Object localObject;
    if (o.bgN().bgm())
    {
      localf = this.luR;
      localObject = (f.a)localf.HR(q.GF()).getTag();
      if (com.tencent.mm.plugin.multitalk.a.i.tj(paramInt2)) {
        break label160;
      }
      if (com.tencent.mm.plugin.multitalk.a.i.tj(paramInt1))
      {
        localf.lvV.setChecked(false);
        ((f.a)localObject).lwk.bgY();
        localf.lvU.setVisibility(8);
        if ((localf.lwf.equals(q.GF())) && (localf.lvP.getVisibility() == 0))
        {
          localf.lwf = "";
          localf.lvO.setVisibility(0);
          localf.lvP.setVisibility(8);
        }
      }
      localf.gN(false);
    }
    label160:
    do
    {
      for (;;)
      {
        localObject = new HashSet();
        ((HashSet)localObject).addAll(o.bgN().ltr);
        if (com.tencent.mm.plugin.multitalk.a.i.tk(paramInt2)) {
          break;
        }
        if (com.tencent.mm.plugin.multitalk.a.i.tk(paramInt1)) {
          localf.bgU();
        }
        return;
        if ((com.tencent.mm.plugin.multitalk.a.i.tj(paramInt2)) && (!com.tencent.mm.plugin.multitalk.a.i.tj(paramInt1)))
        {
          localf.lvV.setChecked(true);
          ((f.a)localObject).lwk.bgZ();
          ((f.a)localObject).lwn.setVisibility(8);
          ah.i(new f.b(localf, (f.a)localObject), 1500L);
          localf.lvU.setVisibility(0);
        }
      }
    } while ((!com.tencent.mm.plugin.multitalk.a.i.tk(paramInt2)) || (com.tencent.mm.plugin.multitalk.a.i.tk(paramInt1)));
    localf.d((HashSet)localObject);
  }
  
  public final void gD(boolean paramBoolean)
  {
    if (o.bgN().bgm()) {
      this.luR.lvW.setChecked(paramBoolean);
    }
  }
  
  public final void gE(boolean paramBoolean)
  {
    if (o.bgN().bgm())
    {
      com.tencent.mm.plugin.multitalk.ui.widget.f localf = this.luR;
      localf.lvX.setChecked(paramBoolean);
      localf.bgW();
    }
  }
  
  public final void gF(boolean paramBoolean)
  {
    if (o.bgN().bgm())
    {
      com.tencent.mm.plugin.multitalk.ui.widget.f localf = this.luR;
      if (localf.lvX != null) {
        localf.lvX.setEnabled(paramBoolean);
      }
    }
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.multitalk_main_ui;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.MT.MultiTalkMainUI", "onActivityResult " + paramInt1 + " resultCode " + paramInt2);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.luW = false;
    ArrayList localArrayList;
    if ((paramInt2 == -1) && (paramInt1 == 1))
    {
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      x.i("MicroMsg.MT.MultiTalkMainUI", "add member " + paramIntent);
      localArrayList = bi.F(paramIntent.split(","));
      if (localArrayList != null) {
        break label104;
      }
    }
    label104:
    com.tencent.mm.plugin.multitalk.a.e locale;
    do
    {
      return;
      locale = o.bgN();
    } while (!locale.bgl());
    String str = locale.ltt.vgm;
    paramIntent = str;
    if (bi.oW(str)) {
      paramIntent = locale.ltt.vgn;
    }
    o.bgM().lta.u(paramIntent, localArrayList);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    int i = getIntent().getIntExtra("enterMainUiSource", 0);
    if ((i == 1) || (i == 2))
    {
      overridePendingTransition(R.a.pop_in, R.a.anim_not_change);
      getWindow().addFlags(6946944);
      o.bgN().aWS();
      if (o.bgN().bgl()) {
        break label103;
      }
      finish();
      if (i == 2) {
        getIntent().getStringExtra("enterMainUiWxGroupId");
      }
    }
    label103:
    do
    {
      return;
      overridePendingTransition(R.a.slide_top_in, R.a.slide_top_out);
      break;
      this.luQ = new com.tencent.mm.plugin.multitalk.ui.widget.c(this);
      this.luR = new com.tencent.mm.plugin.multitalk.ui.widget.f(this);
      o.bgN().gK(o.bgN().ltn);
      o.bgN().ltC = this;
      paramBundle = new IntentFilter();
      paramBundle.addAction("android.intent.action.SCREEN_OFF");
      registerReceiver(this.luX, paramBundle);
      this.luU = true;
      this.ioW = new ag();
      au.HV().yB();
    } while (com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.RECORD_AUDIO", 82, "", ""));
    x.i("MicroMsg.MT.MultiTalkMainUI", "has not audio record permission!");
  }
  
  protected void onDestroy()
  {
    if (this.luW) {
      o.bgN().gJ(false);
    }
    if (this.luU) {
      unregisterReceiver(this.luX);
    }
    super.onDestroy();
  }
  
  public final void onError(int paramInt)
  {
    if (paramInt == 63836)
    {
      com.tencent.mm.plugin.multitalk.ui.widget.f localf = this.luR;
      x.i("MicroMsg.MT.MultiTalkTalkingUILogic", "onSwitchVideoDisabled");
      localf.gN(false);
      o.bgN().ti(1);
      localf.lvV.setChecked(false);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4)
    {
      com.tencent.mm.ui.base.h.a(this, R.l.multitalk_exit_tip, R.l.multitalk, R.l.app_alert_exit, R.l.app_cancel, new MultiTalkMainUI.2(this), null);
      return true;
    }
    if (o.bgN().lts == com.tencent.mm.plugin.multitalk.ui.widget.e.lvJ)
    {
      if ((paramInt == 25) || (paramInt == 24))
      {
        o.bgN().stopRing();
        this.luT = false;
        return true;
      }
    }
    else
    {
      if (paramInt == 25)
      {
        au.HV().fE(aXI());
        return true;
      }
      if (paramInt == 24)
      {
        au.HV().fD(aXI());
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    KeyguardManager localKeyguardManager = (KeyguardManager)ad.getContext().getSystemService("keyguard");
    PowerManager localPowerManager = (PowerManager)ad.getContext().getSystemService("power");
    boolean bool1 = localKeyguardManager.inKeyguardRestrictedInputMode();
    boolean bool2 = hasWindowFocus();
    boolean bool3 = localPowerManager.isScreenOn();
    if (((bool2) || (!bool1)) && (bool3)) {}
    for (bool1 = true;; bool1 = false)
    {
      this.luS = bool1;
      x.i("MicroMsg.MT.MultiTalkMainUI", "onPause, screenOn: %b", new Object[] { Boolean.valueOf(this.luS) });
      if (o.bgN().bgm())
      {
        o.bgN().bgw();
        this.luR.gN(true);
      }
      super.onPause();
      return;
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0) || (paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      x.e("MicroMsg.MT.MultiTalkMainUI", "[multitalk]onRequestPermissionsResult %d data is invalid", new Object[] { Integer.valueOf(paramInt) });
      return;
    }
    x.d("MicroMsg.MT.MultiTalkMainUI", "[multitalk] onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      x.d("MicroMsg.MT.MultiTalkMainUI", "granted record audio!");
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_microphone_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new MultiTalkMainUI.4(this), new MultiTalkMainUI.5(this));
  }
  
  protected void onResume()
  {
    super.onResume();
    switch (MultiTalkMainUI.6.luZ[o.bgN().lts.ordinal()])
    {
    }
    for (;;)
    {
      if (o.bgN().bgm())
      {
        if (o.bgN().bgj()) {
          this.luR.gM(true);
        }
        this.ioW.postDelayed(this.luV, 2000L);
      }
      return;
      this.luR.lvR.setVisibility(8);
      this.luQ.n(o.bgN().ltt);
      if (ao.is4G(this)) {
        o.bgL().w(this);
      }
      while (this.luT)
      {
        o.bgN().gL(false);
        break;
        if ((ao.is2G(this)) || (ao.is3G(this))) {
          o.bgL().v(this);
        }
      }
      this.luQ.bgT();
      this.luR.o(o.bgN().ltt);
      if (ao.is4G(this)) {
        o.bgL().w(this);
      }
      for (;;)
      {
        o.bgN().gL(true);
        break;
        if ((ao.is2G(this)) || (ao.is3G(this))) {
          o.bgL().v(this);
        }
      }
      this.luQ.bgT();
      this.luR.o(o.bgN().ltt);
    }
  }
  
  protected void onStop()
  {
    if ((!this.luW) && (this.luS)) {
      o.bgN().gJ(false);
    }
    super.onStop();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */