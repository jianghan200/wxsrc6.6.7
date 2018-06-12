package com.tencent.mm.plugin.voip.ui;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v7.app.ActionBar;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ih;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.k.g;
import com.tencent.mm.model.al;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.model.i;
import com.tencent.mm.plugin.voip.model.j;
import com.tencent.mm.plugin.voip.model.o;
import com.tencent.mm.plugin.voip.model.o.11;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.k;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
@SuppressLint({"SimpleDateFormat"})
public class VideoActivity
  extends MMActivity
  implements b, d.d
{
  private String cYO;
  private ag guJ;
  private boolean iTN = false;
  private boolean mIsMute = false;
  private int mStatus;
  private CaptureView oLP;
  private ab oLT;
  private boolean oLU;
  private boolean oLV;
  private int oLZ = 1;
  private d oQc;
  private WeakReference<c> oQd;
  private long oQe = -1L;
  private long oQf = 0L;
  private boolean oQg = false;
  private int oQh = 1;
  private boolean oQi = false;
  private boolean oQj = false;
  private com.tencent.mm.sdk.b.c oQk = new VideoActivity.1(this);
  private TelephonyManager oQl = null;
  private long oQm;
  
  private int aXI()
  {
    int i;
    if (!com.tencent.mm.plugin.voip.b.b.yU(this.mStatus)) {
      if (au.HV().yE())
      {
        i = 0;
        if (this.oLU)
        {
          if (this.oLV) {
            break label105;
          }
          if (com.tencent.mm.compatible.e.q.deN.dce < 0) {
            break label136;
          }
          i = com.tencent.mm.compatible.e.q.deN.dce;
        }
      }
    }
    for (;;)
    {
      label51:
      int j = i;
      if (!au.HV().yE())
      {
        j = i;
        if (com.tencent.mm.compatible.e.q.deN.dcg < 0) {}
      }
      for (j = com.tencent.mm.compatible.e.q.deN.dcg;; j = i.bJI().bJx())
      {
        x.d("MicroMsg.Voip.VideoActivity", "Current StreamType:%d", new Object[] { Integer.valueOf(j) });
        return j;
        i = 2;
        break;
        label105:
        i = 3;
        if (com.tencent.mm.compatible.e.q.deN.dcb < 0) {
          break label51;
        }
        i = com.tencent.mm.compatible.e.q.deN.dcb;
        break label51;
      }
      label136:
      i = 0;
    }
  }
  
  private void bKx()
  {
    this.guJ.postDelayed(new VideoActivity.5(this), 2000L);
  }
  
  private static boolean bgx()
  {
    for (;;)
    {
      try
      {
        TelephonyManager localTelephonyManager = (TelephonyManager)com.tencent.mm.sdk.platformtools.ad.getContext().getSystemService("phone");
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
        x.e("MicroMsg.Voip.VideoActivity", "get callState error , errMsg is %s", new Object[] { localException1.getLocalizedMessage() });
        return bool;
      }
      try
      {
        x.i("MicroMsg.Voip.VideoActivity", "TelephoneManager.callState is %d", new Object[] { Integer.valueOf(i) });
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
  
  public final void H(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.oQg = paramBoolean2;
    if (paramBoolean1)
    {
      bKx();
      return;
    }
    finish();
  }
  
  public final void OH(String paramString)
  {
    if (this.oQc != null) {
      this.guJ.post(new VideoActivity.8(this, paramString));
    }
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (this.oQc != null) {
      this.oQc.a(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    }
  }
  
  public final void aL(int paramInt, String paramString)
  {
    x.i("MicroMsg.Voip.VideoActivity", "onError, errCode:%d, isVideoCall:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.oLV) });
    this.iTN = true;
    if (paramInt == 241)
    {
      com.tencent.mm.ui.base.h.b(this, paramString, null, true);
      return;
    }
    this.guJ.post(new VideoActivity.7(this, paramInt));
  }
  
  public final void aYv()
  {
    x.d("MicroMsg.Voip.VideoActivity", "dismissNetStatusWarning");
    if (this.oQc != null) {
      this.oQc.bLG();
    }
  }
  
  public final void bKB()
  {
    if (this.oQc != null) {
      this.oQc.bKB();
    }
  }
  
  public final Context bLD()
  {
    return this.mController.tml;
  }
  
  public final void bLE()
  {
    x.d("MicroMsg.Voip.VideoActivity", "tryShowNetStatusWarning");
    if (this.oQc != null) {
      this.oQc.bLF();
    }
  }
  
  public final void c(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if (this.oQc != null) {
      this.oQc.c(paramInt1, paramInt2, paramArrayOfInt);
    }
  }
  
  public final void dQ(int paramInt1, int paramInt2)
  {
    this.mStatus = paramInt2;
    if ((1 != this.oQh) && (paramInt2 != 8) && (paramInt2 != 262)) {
      x.i("MicroMsg.Voip.VideoActivity", "activity is not normal, can't transform");
    }
    do
    {
      return;
      if (this.oQc == null)
      {
        x.i("MicroMsg.Voip.VideoActivity", "mBaseFragment is null ,already close,now return.");
        return;
      }
      this.oQc.dQ(paramInt1, paramInt2);
      switch (paramInt2)
      {
      default: 
        return;
      }
    } while ((this.oQc != null) && ((this.oQc instanceof f)));
    if (this.oQc != null)
    {
      this.oQc.uninit();
      getSupportFragmentManager().bk().a(this.oQc).commit();
      this.oQc = null;
    }
    x.i("MicroMsg.Voip.VideoActivity", "switch to voice fragment");
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("key_username", this.oLT.field_username);
    ((Bundle)localObject).putBoolean("key_isoutcall", this.oLU);
    ((Bundle)localObject).putInt("key_status", this.mStatus);
    this.oQc = new f();
    this.oQc.setArguments((Bundle)localObject);
    this.oQc.setVoipUIListener((c)this.oQd.get());
    this.oQc.fw(this.oQe);
    this.oQc.a(this);
    this.oQc.yN(this.oLZ);
    this.oQc.setMute(this.mIsMute);
    this.oQc.a(this.oLP);
    getSupportFragmentManager().bk().b(R.h.voip_container, this.oQc).commit();
    return;
    switch (paramInt1)
    {
    }
    for (;;)
    {
      bKx();
      return;
      d locald;
      if (this.oLU)
      {
        locald = this.oQc;
        if (!this.oLV) {
          break label455;
        }
      }
      label455:
      for (localObject = getString(R.l.voip_video_call_rejected);; localObject = getString(R.l.voip_audio_call_rejected))
      {
        locald.co((String)localObject, -1);
        bKx();
        break;
      }
      this.guJ.post(new VideoActivity.9(this));
      continue;
      this.guJ.post(new VideoActivity.10(this));
      continue;
      this.guJ.postDelayed(new VideoActivity.6(this), 50L);
      continue;
      bKx();
      continue;
      finish();
    }
  }
  
  protected final void dealContentView(View paramView)
  {
    ak.d(ak.a(getWindow(), null), this.mController.tlX);
    ((ViewGroup)getWindow().getDecorView()).addView(paramView, 0);
  }
  
  public void finish()
  {
    this.oQh = 3;
    x.i("MicroMsg.Voip.VideoActivity", "finish, finishBczMinimize: %b, status: %s", new Object[] { Boolean.valueOf(this.oQg), com.tencent.mm.plugin.voip.b.b.yR(this.mStatus) });
    Object localObject;
    if ((!this.oQg) && (com.tencent.mm.plugin.voip.b.b.yU(this.mStatus)) && (4 != this.oQh))
    {
      x.i("MicroMsg.Voip.VideoActivity", "finish VideoActivity, start ChattingUI");
      localObject = new Intent();
      ((Intent)localObject).addFlags(67108864);
      ((Intent)localObject).putExtra("Chat_User", this.cYO);
      com.tencent.mm.plugin.voip.a.a.ezn.e((Intent)localObject, this);
    }
    setScreenEnable(true);
    int i;
    if (this.oQc != null) {
      if (this.oQc.oQu == 4105)
      {
        i = 1;
        this.oQc.uninit();
        this.oQc = null;
      }
    }
    for (;;)
    {
      this.oQd = null;
      this.oLP = null;
      this.oQj = true;
      super.finish();
      if (i != 0)
      {
        localObject = new ih();
        ((ih)localObject).bRN.bRQ = true;
        ((ih)localObject).bRN.bRP = this.oQm;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      }
      for (;;)
      {
        d.oQv = -1;
        return;
        localObject = new ih();
        ((ih)localObject).bRN.bRQ = false;
        ((ih)localObject).bRN.bRP = 0L;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      }
      i = 0;
      break;
      i = 0;
    }
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.voip_main;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!com.tencent.mm.plugin.voip.b.d.em(this.mController.tml)) {
      com.tencent.mm.plugin.voip.b.d.en(this.mController.tml);
    }
    x.i("MicroMsg.Voip.VideoActivity", "VideoActivity onCreate start");
    getSupportActionBar().hide();
    getWindow().setSoftInputMode(3);
    getWindow().addFlags(6815872);
    if (au.HX()) {
      i.bJI().F(false, false);
    }
    this.guJ = new ag();
    PBool localPBool1 = new PBool();
    PBool localPBool2 = new PBool();
    PString localPString = new PString();
    PInt localPInt = new PInt();
    localPString.value = getIntent().getStringExtra("Voip_User");
    localPBool1.value = getIntent().getBooleanExtra("Voip_Outcall", true);
    localPBool2.value = getIntent().getBooleanExtra("Voip_VideoCall", true);
    this.oQm = getIntent().getLongExtra("Voip_LastPage_Hash", 0L);
    localPInt.value = com.tencent.mm.plugin.voip.b.b.I(localPBool1.value, localPBool2.value);
    if (localPBool1.value) {
      try
      {
        if (bgx())
        {
          Toast.makeText(this, R.l.in_phone_tip, 0).show();
          x.i("MicroMsg.Voip.VideoActivity", "this phone is on a call");
          super.finish();
          return;
        }
      }
      catch (Exception paramBundle)
      {
        x.e("MicroMsg.Voip.VideoActivity", "not ready now!");
      }
    }
    r localr = i.bJI();
    if (localr.oNb != null)
    {
      x.i("MicroMsg.Voip.VoipService", "voipMgr is not null");
      localPString.value = localr.oNb.cYO;
      localPBool1.value = localr.oNb.oLU;
      localPBool2.value = localr.oNb.oLV;
      localPInt.value = localr.oNb.oLL.mState;
      paramBundle = localr.oNb;
    }
    while (paramBundle == null)
    {
      x.e("MicroMsg.Voip.VideoActivity", "unable to init VoipMgr");
      super.finish();
      return;
      if (localPString.value == null)
      {
        x.e("MicroMsg.Voip.VoipService", "username is null, can't start voip");
        paramBundle = null;
      }
      else
      {
        if ((!localPBool1.value) && (!localr.oNa.bJP()))
        {
          x.e("MicroMsg.Voip.VoipService", "is out call, but kenerl is not working");
          localObject1 = localPString.value;
          if (localPBool2.value)
          {
            paramBundle = bd.tby;
            label419:
            if (!localPBool1.value) {
              break label459;
            }
          }
          label459:
          for (i = 1;; i = 0)
          {
            com.tencent.mm.plugin.voip.model.q.a((String)localObject1, paramBundle, i, 4, com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_call_cancel_msg_from));
            paramBundle = null;
            break;
            paramBundle = bd.tbx;
            break label419;
          }
        }
        localr.oNb = new o();
        o localo = localr.oNb;
        paramBundle = localPString.value;
        boolean bool2 = localPBool1.value;
        boolean bool3 = localPBool2.value;
        x.i("MicroMsg.Voip.VoipMgr", "start VoIP, userName: %s, isOutCall: %b, isVideoCall: %b", new Object[] { paramBundle, Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        localo.oMn = true;
        localo.cYO = paramBundle;
        localo.oLU = bool2;
        localo.oLV = bool3;
        au.HU();
        localo.oLT = com.tencent.mm.model.c.FR().Yg(localo.cYO);
        localo.guJ = new ag();
        if (localo.oMt == null) {
          localo.oMt = new com.tencent.mm.plugin.voip.video.e();
        }
        localo.oMu = 0;
        boolean bool1;
        label641:
        int j;
        if (bi.getInt(g.AT().getValue("VOIPCameraSwitch"), 1) == 0)
        {
          bool1 = true;
          localo.oLW = bool1;
          if (!localo.oLV) {
            localo.oLW = false;
          }
          j = com.tencent.mm.plugin.voip.b.b.I(bool2, bool3);
          i = j;
          if (localo.oLW)
          {
            if (j != 0) {
              break label1032;
            }
            i = 1;
          }
          label686:
          if (!bool2) {
            break label1048;
          }
          localo.oLL = com.tencent.mm.plugin.voip.b.b.yT(i);
          label700:
          bool1 = com.tencent.mm.compatible.f.b.zT();
          bool2 = com.tencent.mm.compatible.f.b.zV();
          if (Build.MANUFACTURER.equalsIgnoreCase("meizu"))
          {
            if (!bool1)
            {
              paramBundle = com.tencent.mm.plugin.report.service.h.mEJ;
              if (!localo.oLV) {
                break label1060;
              }
              i = 0;
              label741:
              paramBundle.h(11306, new Object[] { Integer.valueOf(i), Integer.valueOf(1) });
            }
            if (!bool2)
            {
              paramBundle = com.tencent.mm.plugin.report.service.h.mEJ;
              if (!localo.oLV) {
                break label1065;
              }
              i = 0;
              label785:
              paramBundle.h(11306, new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
            }
          }
          if ((!bool2) || (!bool1))
          {
            paramBundle = null;
            localObject1 = null;
            if ((bool1) || (bool2)) {
              break label1070;
            }
            paramBundle = getString(R.l.app_special_no_audio_camera_permission);
            localObject1 = getString(R.l.app_need_audio_and_camera_title);
            label852:
            com.tencent.mm.ui.base.h.a(this, paramBundle, (String)localObject1, getString(R.l.app_need_show_settings_button), true, new o.11(localo, this));
          }
          x.i("MicroMsg.Voip.VoipMgr", "initMgr");
          au.vv().xv();
          au.HV().b(localo);
          au.HV().a(localo);
          au.HV().yB();
          localo.bEL = new com.tencent.mm.compatible.util.b(com.tencent.mm.sdk.platformtools.ad.getContext());
          localo.bEL.requestFocus();
          if (!localo.oLV) {
            break label1120;
          }
          i.bJI().a(true, true, localo.cYO);
          label963:
          if (!localo.oLU) {
            break label1164;
          }
          i.bJI().oNa.bLf();
          if (!localo.oLV) {
            break label1136;
          }
          paramBundle = i.bJI();
          localObject1 = localo.oLT.field_username;
        }
        for (int i = paramBundle.oNa.cn((String)localObject1, 0);; i = paramBundle.oNa.cn((String)localObject1, 1))
        {
          if (i >= 0) {
            break label1164;
          }
          localo.fr(false);
          break;
          bool1 = false;
          break label641;
          label1032:
          i = j;
          if (256 != j) {
            break label686;
          }
          i = 257;
          break label686;
          label1048:
          localo.oLL = com.tencent.mm.plugin.voip.b.b.yS(i);
          break label700;
          label1060:
          i = 1;
          break label741;
          label1065:
          i = 1;
          break label785;
          label1070:
          if (!bool1)
          {
            paramBundle = getString(R.l.app_special_no_record_audio_permission);
            localObject1 = getString(R.l.app_need_audio_title);
            break label852;
          }
          if (bool2) {
            break label852;
          }
          paramBundle = getString(R.l.app_special_no_open_camera_permission);
          localObject1 = getString(R.l.app_need_camera_title);
          break label852;
          label1120:
          i.bJI().a(true, false, localo.cYO);
          break label963;
          label1136:
          paramBundle = i.bJI();
          localObject1 = localo.oLT.field_username;
        }
        label1164:
        localo.oLM = new HeadsetPlugReceiver();
        localo.oLM.a(com.tencent.mm.sdk.platformtools.ad.getContext(), localo.oMA);
        Object localObject1 = i.bJI();
        paramBundle = com.tencent.mm.sdk.platformtools.ad.getContext();
        localObject1 = ((r)localObject1).oNa;
        ((com.tencent.mm.plugin.voip.model.s)localObject1).oHa.gKE = paramBundle;
        ((com.tencent.mm.plugin.voip.model.s)localObject1).oHa.oJY = localo;
        com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip.VoipServiceEx", "attach ui........");
        localo.knT = ((TelephonyManager)com.tencent.mm.sdk.platformtools.ad.getContext().getSystemService("phone"));
        localo.knT.listen(localo.knU, 32);
        label1278:
        label1304:
        label1330:
        Object localObject2;
        if (localo.oLV)
        {
          i = 0;
          i.bJI().l(R.k.phonering, i, localo.oLU);
          if (!au.HV().yK()) {
            break label1619;
          }
          i = 3;
          localo.oLZ = i;
          localo.oMs = false;
          if (!localo.oLV) {
            break label1651;
          }
          localo.oMc = true;
          paramBundle = "voip_recent_contact" + com.tencent.mm.model.q.GF();
          localObject1 = com.tencent.mm.sdk.platformtools.ad.getContext().getSharedPreferences("voip_plugin_prefs", 0);
          localObject2 = ((SharedPreferences)localObject1).getString(paramBundle, null);
          if (localObject2 == null) {
            break label1679;
          }
          localObject2 = bi.F(((String)localObject2).split(";"));
          if (localObject2 == null) {
            break label1679;
          }
          i = ((List)localObject2).size();
          if (!((List)localObject2).contains(localo.cYO)) {
            break label1660;
          }
          if (i > 1)
          {
            ((List)localObject2).remove(localo.cYO);
            label1437:
            ((List)localObject2).add(0, localo.cYO);
          }
          localObject2 = bi.c((List)localObject2, ";");
          ((SharedPreferences)localObject1).edit().putString(paramBundle, (String)localObject2).commit();
        }
        for (;;)
        {
          com.tencent.mm.sdk.b.a.sFg.b(localo.oMB);
          com.tencent.mm.sdk.b.a.sFg.b(localo.knV);
          paramBundle = localo.oMg;
          if (!paramBundle.hfT.contains(localo)) {
            paramBundle.hfT.add(localo);
          }
          paramBundle = new IntentFilter();
          paramBundle.addAction("android.intent.action.SCREEN_ON");
          paramBundle.addAction("android.intent.action.SCREEN_OFF");
          paramBundle.addAction("android.intent.action.USER_PRESENT");
          com.tencent.mm.sdk.platformtools.ad.getContext().registerReceiver(localo.oMz, paramBundle);
          localo.hlW = new SensorController(localo.getContext());
          x.i("MicroMsg.Voip.VoipMgr", "initMgr setSensorCallBack");
          localo.hlW.a(localo);
          break;
          i = 1;
          break label1278;
          label1619:
          if (au.HV().yE())
          {
            i = 4;
            break label1304;
          }
          if (localo.oLV)
          {
            i = 1;
            break label1304;
          }
          i = 2;
          break label1304;
          label1651:
          localo.oMc = false;
          break label1330;
          label1660:
          if (4 != i) {
            break label1437;
          }
          ((List)localObject2).remove(i - 1);
          break label1437;
          label1679:
          localObject2 = new ArrayList();
          ((List)localObject2).add(0, localo.cYO);
          localObject2 = bi.c((List)localObject2, ";");
          ((SharedPreferences)localObject1).edit().putString(paramBundle, (String)localObject2).commit();
        }
      }
    }
    this.oQd = new WeakReference(paramBundle);
    this.cYO = localPString.value;
    this.oLV = localPBool2.value;
    this.oLU = localPBool1.value;
    this.mStatus = localPInt.value;
    au.HU();
    this.oLT = com.tencent.mm.model.c.FR().Yg(this.cYO);
    paramBundle = new Bundle();
    paramBundle.putString("key_username", this.oLT.field_username);
    paramBundle.putBoolean("key_isoutcall", this.oLU);
    paramBundle.putInt("key_status", com.tencent.mm.plugin.voip.b.b.I(this.oLU, this.oLV));
    if (com.tencent.mm.plugin.voip.b.b.yV(this.mStatus))
    {
      this.oQc = new e();
      this.oQc.setArguments(paramBundle);
      getSupportFragmentManager().bk().b(R.h.voip_container, this.oQc).commit();
      setTitleVisibility(8);
      if ((com.tencent.mm.plugin.voip.b.b.yW(this.mStatus)) && (this.oLU)) {
        this.guJ.postDelayed(new VideoActivity.4(this), 20000L);
      }
      this.oQc.setVoipUIListener((c)this.oQd.get());
      this.oQc.a(this);
      this.oQc.yN(this.oLZ);
      this.oQc.setMute(this.mIsMute);
      if (i.bJI().oNb.oMr != null) {
        OH(i.bJI().oNb.oMr);
      }
      if ((this.oQd != null) && (this.oQd.get() != null)) {
        ((c)this.oQd.get()).a(this, 1);
      }
      x.i("MicroMsg.Voip.VideoActivity", "VideoActivity onCreate end isOutCall:%b isVideoCall:%b username:%s state:%d", new Object[] { Boolean.valueOf(this.oLU), Boolean.valueOf(this.oLV), this.cYO, Integer.valueOf(this.mStatus) });
      if (!com.tencent.mm.plugin.voip.b.b.yV(this.mStatus)) {
        break label2223;
      }
      x.i("MicroMsg.Voip.VideoActivity", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.CAMERA", 19, "", "")), bi.cjd(), this });
      x.i("MicroMsg.Voip.VideoActivity", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.RECORD_AUDIO", 19, "", "")), bi.cjd(), this });
    }
    for (;;)
    {
      com.tencent.mm.sdk.b.a.sFg.b(this.oQk);
      return;
      this.oQc = new f();
      break;
      label2223:
      x.i("MicroMsg.Voip.VideoActivity", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.RECORD_AUDIO", 82, "", "")), bi.cjd(), this });
    }
  }
  
  protected void onDestroy()
  {
    this.oQh = 4;
    x.i("MicroMsg.Voip.VideoActivity", "onDestroy, status: %s", new Object[] { com.tencent.mm.plugin.voip.b.b.yR(this.mStatus) });
    if (!this.oQj) {
      finish();
    }
    if ((this.oQd != null) && (this.oQd.get() != null)) {
      ((c)this.oQd.get()).a(this);
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.oQk);
    setScreenEnable(true);
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4) {
      return true;
    }
    if (paramInt == 25)
    {
      if ((!i.bJI().bKY()) && (!this.oLU))
      {
        i.bJI().stopRing();
        return true;
      }
      if (au.HV().yE()) {}
      for (paramInt = au.HV().yQ();; paramInt = aXI())
      {
        au.HV().fE(paramInt);
        break;
      }
    }
    if (paramInt == 24)
    {
      if ((!i.bJI().bKY()) && (!this.oLU))
      {
        i.bJI().stopRing();
        return true;
      }
      if (au.HV().yE()) {}
      for (paramInt = au.HV().yQ();; paramInt = aXI())
      {
        au.HV().fD(paramInt);
        break;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    x.i("MicroMsg.Voip.VideoActivity", "onNewIntent");
    super.onNewIntent(paramIntent);
  }
  
  public void onPause()
  {
    super.onPause();
    KeyguardManager localKeyguardManager = (KeyguardManager)com.tencent.mm.sdk.platformtools.ad.getContext().getSystemService("keyguard");
    PowerManager localPowerManager = (PowerManager)com.tencent.mm.sdk.platformtools.ad.getContext().getSystemService("power");
    boolean bool2 = localKeyguardManager.inKeyguardRestrictedInputMode();
    boolean bool3 = hasWindowFocus();
    boolean bool4 = localPowerManager.isScreenOn();
    if (((bool3) || (!bool2)) && (bool4)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      this.oQi = bool1;
      x.i("MicroMsg.Voip.VideoActivity", "onPause, status: %s, screenOn: %b, hasWindowFocus: %s, isScreenLocked: %s, isScreenOn: %s", new Object[] { com.tencent.mm.plugin.voip.b.b.yR(this.mStatus), Boolean.valueOf(this.oQi), Boolean.valueOf(bool3), Boolean.valueOf(bool2), Boolean.valueOf(bool4) });
      com.tencent.mm.plugin.webview.ui.tools.widget.m.Bk(2);
      return;
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0) || (paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      x.e("MicroMsg.Voip.VideoActivity", "onRequestPermissionsResult %d data is invalid", new Object[] { Integer.valueOf(paramInt) });
    }
    do
    {
      do
      {
        return;
        x.i("MicroMsg.Voip.VideoActivity", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
        switch (paramInt)
        {
        default: 
          return;
        }
      } while (paramArrayOfInt[0] == 0);
      if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
      for (paramInt = R.l.permission_camera_request_again_msg;; paramInt = R.l.permission_microphone_request_again_msg)
      {
        com.tencent.mm.ui.base.h.a(this, getString(paramInt), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new VideoActivity.2
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            paramAnonymousDialogInterface.dismiss();
            VideoActivity.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          }
        }, new VideoActivity.2(this));
        return;
      }
    } while (paramArrayOfInt[0] == 0);
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_microphone_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new VideoActivity.3(this), null);
  }
  
  public void onResume()
  {
    int i = 0;
    x.i("MicroMsg.Voip.VideoActivity", "onResume, status: %s", new Object[] { com.tencent.mm.plugin.voip.b.b.yR(this.mStatus) });
    au.getNotification().cancel(40);
    j localj = i.bJI().oNa.oHa;
    if (localj.oJJ) {
      localj.oJJ = false;
    }
    super.onResume();
    setScreenEnable(true);
    this.oQf = bi.VG();
    if ((this.oLU) && (com.tencent.mm.plugin.voip.b.b.yW(this.mStatus)) && (i.bJI().bKY())) {
      if (!this.oLV) {
        break label124;
      }
    }
    for (;;)
    {
      i.bJI().l(R.k.phonering, i, this.oLU);
      com.tencent.mm.plugin.webview.ui.tools.widget.m.Bk(1);
      return;
      label124:
      i = 1;
    }
  }
  
  public void onStart()
  {
    super.onStart();
    if (!this.oQj)
    {
      x.i("MicroMsg.Voip.VideoActivity", "onStart");
      this.oQh = 1;
      dQ(4096, this.mStatus);
    }
  }
  
  protected void onStop()
  {
    this.oQh = 2;
    x.i("MicroMsg.Voip.VideoActivity", "onStop, status: %s", new Object[] { com.tencent.mm.plugin.voip.b.b.yR(this.mStatus) });
    super.onStop();
    com.tencent.mm.plugin.report.service.h localh;
    if ((262 != this.mStatus) && (8 != this.mStatus) && (this.oQi) && (!this.oQj) && (this.oQd != null) && (this.oQd.get() != null) && (((c)this.oQd.get()).iP(false)))
    {
      H(false, true);
      if (com.tencent.mm.plugin.voip.b.b.yU(this.mStatus))
      {
        localh = com.tencent.mm.plugin.report.service.h.mEJ;
        if (!com.tencent.mm.plugin.voip.b.b.yV(this.mStatus)) {
          break label158;
        }
      }
    }
    label158:
    for (int i = 2;; i = 3)
    {
      localh.h(11618, new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
      return;
    }
  }
  
  public final void setCaptureView(CaptureView paramCaptureView)
  {
    this.oLP = paramCaptureView;
    if (this.oQc != null) {
      this.oQc.a(paramCaptureView);
    }
  }
  
  public final void setConnectSec(long paramLong)
  {
    this.oQe = paramLong;
    if (this.oQc != null) {
      this.oQc.fw(this.oQe);
    }
  }
  
  public final void setHWDecMode(int paramInt)
  {
    if (this.oQc != null) {
      this.oQc.setHWDecMode(paramInt);
    }
  }
  
  public final void setMute(boolean paramBoolean)
  {
    this.mIsMute = paramBoolean;
    if (this.oQc != null) {
      this.oQc.setMute(paramBoolean);
    }
  }
  
  public final void uninit()
  {
    if (this.oQc != null) {
      this.oQc.uninit();
    }
  }
  
  public final void yN(int paramInt)
  {
    this.oLZ = paramInt;
    if (this.oQc != null) {
      this.oQc.yN(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip/ui/VideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */