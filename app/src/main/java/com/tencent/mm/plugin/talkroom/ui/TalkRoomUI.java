package com.tencent.mm.plugin.talkroom.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ax.d;
import com.tencent.mm.compatible.b.f;
import com.tencent.mm.g.a.ln;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.m;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.talkroom.model.g;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.bsm;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.as.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.y;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TalkRoomUI
  extends MMBaseActivity
  implements e, d
{
  private List<String> bTR = new LinkedList();
  private TextView eBO;
  private p eXe;
  private long kGA = 0L;
  private al kGB = new al(new al.a()
  {
    public final boolean vD()
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess expired to execute");
      TalkRoomUI.q(TalkRoomUI.this);
      return false;
    }
  }, false);
  private al kGC = new al(new TalkRoomUI.1(this), false);
  private al kGD = new al(new al.a()
  {
    public final boolean vD()
    {
      TalkRoomUI.m(TalkRoomUI.this);
      return false;
    }
  }, false);
  private final al kGG = new al(new al.a()
  {
    public final boolean vD()
    {
      int j = 15;
      boolean bool = false;
      int i;
      if (TalkRoomUI.b(TalkRoomUI.this) == 3)
      {
        i = com.tencent.mm.plugin.talkroom.model.b.bGT().So();
        if (i > 15) {
          break label154;
        }
        if (!TalkRoomUI.e(TalkRoomUI.this)) {
          break label149;
        }
        i = j;
        label41:
        TalkRoomUI.f(TalkRoomUI.this);
        j = i;
        if (TalkRoomUI.g(TalkRoomUI.this) >= 5)
        {
          TalkRoomUI localTalkRoomUI = TalkRoomUI.this;
          if (!TalkRoomUI.e(TalkRoomUI.this)) {
            bool = true;
          }
          TalkRoomUI.a(localTalkRoomUI, bool);
          TalkRoomUI.h(TalkRoomUI.this);
        }
      }
      label149:
      label154:
      for (j = i;; j = i)
      {
        TalkRoomUI.d(TalkRoomUI.this);
        TalkRoomUI.i(TalkRoomUI.this).setValue(j);
        return true;
        if (bi.oW(TalkRoomUI.c(TalkRoomUI.this)))
        {
          TalkRoomUI.d(TalkRoomUI.this);
          return false;
        }
        i = com.tencent.mm.plugin.talkroom.model.b.bGT().Sp();
        break;
        i = 0;
        break label41;
      }
    }
  }, true);
  private boolean kGH = true;
  private Chronometer kGM;
  private int kGN = 0;
  private boolean kGt = true;
  private String kGu;
  private String kGv;
  private boolean kGx = false;
  private int kGy = 0;
  private long kGz = 500L;
  private float kHA = -1.0F;
  private TextView kxe;
  private TextView oxH;
  private ImageButton oxI;
  private Button oxJ;
  private ImageView oxK;
  private TalkRoomVolumeMeter oxL;
  private TalkRoomAvatarsFrame oxM;
  private a oxN;
  private boolean oxO = true;
  private int oxP = 0;
  private AlphaAnimation oxQ;
  private AlphaAnimation oxR;
  private AlphaAnimation oxS;
  private AlphaAnimation oxT;
  private float oxU = -1.0F;
  private float oxV = -1.0F;
  private PowerManager.WakeLock wakeLock;
  
  private void Or(String paramString)
  {
    if (!this.kGH) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TalkRoomUI", "alertToFinish has exit, ignore ");
    }
    for (;;)
    {
      return;
      this.kGH = false;
      com.tencent.mm.plugin.talkroom.model.b.bGT().aZL();
      String str = paramString;
      if (bi.oW(paramString)) {
        if (ao.isConnected(getApplication())) {
          break label77;
        }
      }
      label77:
      for (str = getString(R.l.talk_room_network_not_conn); !isFinishing(); str = getString(R.l.talk_room_network_failed))
      {
        com.tencent.mm.ui.base.h.a(this, str, "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            TalkRoomUI.this.finish();
          }
        });
        return;
      }
    }
  }
  
  private void aZJ()
  {
    if (this.kGy != 5) {
      return;
    }
    this.kGB.SO();
    aZK();
    bHn();
    as.b(ad.getContext(), R.l.talkroom_begin, new TalkRoomUI.6(this));
    this.kGC.J(1000L, 1000L);
  }
  
  private void aZK()
  {
    if (this.kGt) {
      return;
    }
    if (com.tencent.mm.plugin.talkroom.model.b.bGT().oxi)
    {
      e(getString(R.l.talk_room_pausing), R.e.talk_room_tv_red);
      this.oxM.setCurMemeber(null);
      this.oxK.setImageResource(R.g.talk_room_led_black);
      bHq();
      return;
    }
    switch (this.kGy)
    {
    default: 
      return;
    case 0: 
      if (!bi.oW(this.kGv))
      {
        cm(r.gT(this.kGv), R.e.talk_room_tv_green);
        this.oxM.setCurMemeber(this.kGv);
        this.oxK.setImageResource(R.g.talk_room_led_black);
        yc(1);
        return;
      }
      if (com.tencent.mm.plugin.talkroom.model.b.bGT().aZp().size() == 1) {}
      for (String str = getString(R.l.talk_room_waiting_for_others);; str = "")
      {
        e(str, R.e.talk_room_tv_green);
        this.oxM.setCurMemeber(null);
        this.oxK.setImageResource(R.g.talk_room_led_black);
        bHq();
        return;
      }
    case 1: 
      e(getString(R.l.talk_room_connecting), R.e.talk_room_tv_green);
      this.oxK.setImageResource(R.g.talk_room_led_yellow);
      return;
    case 3: 
    case 5: 
      e(getString(R.l.talk_room_self_speaking), R.e.talk_room_tv_green);
      this.oxM.setCurMemeber(q.GF());
      this.oxK.setImageResource(R.g.talk_room_led_green);
      yc(2);
      return;
    case 2: 
      e(getString(R.l.talk_room_seize_mic_failed), R.e.talk_room_tv_red);
      this.oxK.setImageResource(R.g.talk_room_led_red);
      return;
    }
    e(getString(R.l.talk_room_speak_too_long), R.e.talk_room_tv_red);
    this.oxK.setImageResource(R.g.talk_room_led_red);
    bHq();
  }
  
  private void bHn()
  {
    if ((this.kGy == 3) || (this.kGy == 5))
    {
      this.oxL.setShowFlame(true);
      return;
    }
    if (!bi.oW(this.kGv))
    {
      this.oxL.setShowFlame(true);
      return;
    }
    this.oxL.setShowFlame(false);
  }
  
  private void bHo()
  {
    Object localObject = com.tencent.mm.plugin.talkroom.model.b.bGT().aZp();
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localLinkedList.add(((bsm)((Iterator)localObject).next()).hbL);
    }
    this.oxM.setMembersList(localLinkedList);
  }
  
  private void bHp()
  {
    int i = com.tencent.mm.plugin.talkroom.model.b.bGT().aZp().size();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TalkRoomUI", "displayCount %d", new Object[] { Integer.valueOf(i) });
    this.kxe.setText(String.valueOf(i));
  }
  
  private void bHq()
  {
    if (this.kGN == 0) {
      return;
    }
    this.kGM.stop();
    this.kGN = 0;
    this.kGM.startAnimation(this.oxR);
  }
  
  private void cm(String paramString, int paramInt)
  {
    e(j.a(this, paramString, this.oxH.getTextSize()), paramInt);
  }
  
  private void e(CharSequence paramCharSequence, int paramInt)
  {
    if (bi.oW(paramCharSequence.toString()))
    {
      this.oxH.startAnimation(this.oxT);
      return;
    }
    this.oxH.setTextColor(getResources().getColor(paramInt));
    this.oxH.setText(paramCharSequence);
    this.oxH.startAnimation(this.oxS);
  }
  
  private void yc(int paramInt)
  {
    if ((paramInt != 0) && (this.kGN == paramInt)) {
      return;
    }
    this.kGM.setVisibility(0);
    this.kGM.startAnimation(this.oxQ);
    this.kGM.setBase(bi.VG());
    this.kGM.start();
    this.kGN = paramInt;
  }
  
  public final void St()
  {
    this.kGt = false;
    this.oxI.setEnabled(true);
    this.oxI.setImageResource(R.g.talk_room_mic_btn_normal);
    this.oxJ.setVisibility(0);
    aZK();
    bHp();
    bHo();
  }
  
  public final void Su()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess");
    if (this.kGy != 1) {
      return;
    }
    this.kGy = 5;
    if (bi.bI(this.kGA) < this.kGz)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess waiting to execute");
      al localal = this.kGB;
      long l = this.kGz - bi.bI(this.kGA);
      localal.J(l, l);
      return;
    }
    aZJ();
  }
  
  public final void Sv()
  {
    if (!this.kGH)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TalkRoomUI", "alertToFinish has exit, ignore ");
      return;
    }
    this.kGH = false;
    finish();
  }
  
  public final void Sw()
  {
    aZK();
  }
  
  public final void Sx()
  {
    aZK();
  }
  
  public final void Sy()
  {
    e(getString(R.l.talk_room_reconnecting), R.e.talk_room_tv_red);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml.getType() == 364) && (this.eXe != null) && (this.eXe.isShowing())) {
      this.eXe.cancel();
    }
  }
  
  public final void ay(String paramString1, String paramString2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TalkRoomUI", "add %s,  del %s", new Object[] { paramString1, paramString2 });
    bHo();
    if (this.kGt) {}
    do
    {
      return;
      bHp();
      if (!bi.oW(paramString1))
      {
        cm(getString(R.l.talk_room_enter_4short, new Object[] { r.gT(paramString1) }), R.e.talk_room_tv_green);
        this.kGD.J(3000L, 3000L);
      }
    } while (bi.oW(paramString2));
    cm(getString(R.l.talk_room_exit_4short, new Object[] { r.gT(paramString2) }), R.e.talk_room_tv_green);
    this.kGD.J(3000L, 3000L);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.f("MicroMsg.TalkRoomUI", "errType %d, errCode %d, errInfo %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    Or("");
  }
  
  public void finish()
  {
    super.finish();
  }
  
  public final void i(String paramString, int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.x.f("MicroMsg.TalkRoomUI", "onInitFailed %s", new Object[] { paramString });
    paramString = "";
    if (paramInt1 == 4)
    {
      if (paramInt2 != -1)
      {
        this.kGH = false;
        finish();
        return;
      }
      paramString = getString(R.l.talk_room_network_failed);
    }
    Or(paramString);
  }
  
  public final void iA(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TalkRoomUI", "onSeizeMicFailed");
    if (paramInt == 340) {
      if (this.kGy != 3) {
        return;
      }
    }
    for (this.kGy = 4;; this.kGy = 2)
    {
      bHn();
      aZK();
      as.a(ad.getContext(), R.l.talkroom_sasasa, new TalkRoomUI.4(this));
      return;
      if (this.kGy != 1) {
        break;
      }
    }
  }
  
  public final void nr(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TalkRoomUI", "onCurMember %s", new Object[] { paramString });
    this.kGv = paramString;
    bHn();
    aZK();
    if (!bi.oW(paramString))
    {
      as.b(ad.getContext(), R.l.talkroom_othersbegin, new as.a()
      {
        public final void wd() {}
      });
      this.kGG.J(100L, 100L);
      return;
    }
    this.kGG.SO();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TalkRoomUI", "onCreate");
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("enter_room_username");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TalkRoomUI", "onCreate talkRoomName : %s", new Object[] { paramBundle });
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TalkRoomUI", "talkRoomName %s ", new Object[] { paramBundle });
    this.kGu = paramBundle;
    if (bi.oW(this.kGu))
    {
      Or("");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TalkRoomUI", "onCreate before initView");
      setContentView(y.gq(ad.getContext()).inflate(R.i.talk_room, null));
      this.wakeLock = ((PowerManager)getSystemService("power")).newWakeLock(26, "TalkRoomUI Lock");
      this.eBO = ((TextView)findViewById(R.h.title_tv));
      this.oxH = ((TextView)findViewById(R.h.mic_info));
      this.kxe = ((TextView)findViewById(R.h.count_tv));
      this.oxJ = ((Button)findViewById(R.h.info_btn));
      this.kGM = ((Chronometer)findViewById(R.h.chronometer));
      this.oxK = ((ImageView)findViewById(R.h.led_iv));
      this.oxN = new a(this);
      this.oxJ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          com.tencent.mm.ui.base.h.a(TalkRoomUI.this, TalkRoomUI.this.getString(R.l.talk_room_exit_room_tip), TalkRoomUI.this.getString(R.l.talk_room_exit_room), new TalkRoomUI.11.1(this), null);
        }
      });
      findViewById(R.h.up_btn).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = TalkRoomUI.this;
          au.HU();
          if (bi.a((Integer)com.tencent.mm.model.c.DT().get(144641, null), 0) > 0) {}
          for (int i = 0;; i = 1)
          {
            if (i == 0) {
              TalkRoomUI.this.onBackPressed();
            }
            return;
            i locali = new i(paramAnonymousView, R.m.mmdialog);
            LinearLayout localLinearLayout = (LinearLayout)y.gq(ad.getContext()).inflate(R.i.talkroom_welcome_ui, null);
            localLinearLayout.setMinimumWidth(10000);
            Button localButton = (Button)localLinearLayout.findViewById(R.h.i_know_btn);
            locali.setCanceledOnTouchOutside(true);
            locali.setOnDismissListener(new TalkRoomUI.17(paramAnonymousView));
            locali.setCancelable(false);
            localButton.setOnClickListener(new TalkRoomUI.2(paramAnonymousView, locali));
            locali.setContentView(localLinearLayout);
            locali.show();
          }
        }
      });
      this.oxI = ((ImageButton)findViewById(R.h.mic_btn));
      this.oxI.setEnabled(false);
      this.oxI.setImageResource(R.g.talk_room_mic_btn_unable);
      this.oxI.setOnTouchListener(new TalkRoomUI.13(this));
      this.oxL = ((TalkRoomVolumeMeter)findViewById(R.h.volume_meter));
      paramBundle = new TalkRoomUI.14(this);
      findViewById(R.h.touch_view).setOnTouchListener(new TalkRoomUI.15(this, paramBundle));
      this.oxM = ((TalkRoomAvatarsFrame)findViewById(R.h.avatar_frame));
      this.eBO.setOnClickListener(new TalkRoomUI.16(this));
      this.oxQ = new AlphaAnimation(0.0F, 1.0F);
      this.oxQ.setDuration(300L);
      this.oxQ.setFillAfter(true);
      this.oxR = new AlphaAnimation(1.0F, 0.0F);
      this.oxR.setDuration(300L);
      this.oxR.setFillAfter(true);
      this.oxS = new AlphaAnimation(0.0F, 1.0F);
      this.oxS.setDuration(300L);
      this.oxS.setFillAfter(true);
      this.oxT = new AlphaAnimation(1.0F, 0.0F);
      this.oxT.setDuration(300L);
      this.oxT.setFillAfter(true);
      au.DF().a(364, this);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TalkRoomUI", "onCreate before getServer");
      com.tencent.mm.plugin.talkroom.model.b.bGT().a(this);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TalkRoomUI", "onCreate end");
      return;
    }
    List localList;
    if (s.fq(paramBundle))
    {
      localList = m.gI(paramBundle);
      if (localList == null) {
        am.a.dBr.R(paramBundle, "");
      }
    }
    for (;;)
    {
      new ag(Looper.getMainLooper()).post(new TalkRoomUI.3(this, paramBundle));
      break;
      this.bTR = localList;
      continue;
      this.bTR.clear();
      this.bTR.add(paramBundle);
      this.bTR.add(q.GF());
    }
  }
  
  protected void onDestroy()
  {
    com.tencent.mm.plugin.talkroom.model.b.bGT().b(this);
    au.DF().b(364, this);
    if ((this.eXe != null) && (this.eXe.isShowing())) {
      this.eXe.cancel();
    }
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 25)
    {
      au.HV().fE(3);
      return true;
    }
    if (paramInt == 24)
    {
      au.HV().fD(3);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_DEACTIVE").putExtra("classname", getClass().getName()), "com.tencent.mm.permission.MM_MESSAGE");
    this.wakeLock.release();
    this.kGG.SO();
    com.tencent.mm.plugin.talkroom.model.b.bGS().ovZ.owe = false;
    com.tencent.mm.plugin.talkroom.model.b.bGS();
    Object localObject = com.tencent.mm.plugin.talkroom.model.b.bGS().ovZ;
    if (((com.tencent.mm.plugin.talkroom.model.c)localObject).kGt) {
      ((com.tencent.mm.plugin.talkroom.model.c)localObject).Op(ad.getContext().getString(R.l.talk_room_readying));
    }
    for (;;)
    {
      localObject = new ln();
      ((ln)localObject).bVQ.bVR = false;
      com.tencent.mm.sdk.b.a.sFg.a((com.tencent.mm.sdk.b.b)localObject, getMainLooper());
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TalkRoomUI", "TalkRoom cancel pause auto download logic");
      return;
      if (!bi.oW(((com.tencent.mm.plugin.talkroom.model.c)localObject).kFP))
      {
        String str = ad.getContext().getString(R.l.talk_room_speaking, new Object[] { r.gT(((com.tencent.mm.plugin.talkroom.model.c)localObject).kFP) });
        com.tencent.mm.plugin.talkroom.model.c.bGZ();
        ((com.tencent.mm.plugin.talkroom.model.c)localObject).Op(str);
      }
      else
      {
        ((com.tencent.mm.plugin.talkroom.model.c)localObject).Op(com.tencent.mm.plugin.talkroom.model.h.aJ(ad.getContext(), com.tencent.mm.plugin.talkroom.model.b.bGT().owU));
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_ACTIVE").putExtra("isTalkroom", true).putExtra("classname", getClass().getName()), "com.tencent.mm.permission.MM_MESSAGE");
    this.wakeLock.acquire();
    Object localObject = j.a(this, com.tencent.mm.plugin.talkroom.model.h.aJ(this, this.kGu), this.eBO.getTextSize());
    this.eBO.setText((CharSequence)localObject);
    com.tencent.mm.plugin.talkroom.model.b.bGS().ovZ.owe = true;
    com.tencent.mm.plugin.talkroom.model.b.bGS();
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.TalkRoomDisplayMgr", "yy dismissStatusBar");
    com.tencent.mm.plugin.talkroom.model.b.bGS();
    com.tencent.mm.plugin.talkroom.model.c.bGZ();
    localObject = new ln();
    ((ln)localObject).bVQ.bVR = true;
    com.tencent.mm.sdk.b.a.sFg.a((com.tencent.mm.sdk.b.b)localObject, getMainLooper());
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.TalkRoomUI", "TalkRoom req pause auto download logic");
  }
  
  private abstract class a
  {
    float fto;
    float ftp;
    long oya;
    
    private a() {}
    
    public abstract void bHr();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/talkroom/ui/TalkRoomUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */