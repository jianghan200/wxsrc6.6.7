package com.tencent.mm.plugin.voip_cs.ui;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.b.f;
import com.tencent.mm.compatible.b.f.a;
import com.tencent.mm.compatible.e.c.a;
import com.tencent.mm.g.a.qy;
import com.tencent.mm.model.au;
import com.tencent.mm.network.n;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.model.p;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip_cs.b.b.a.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import java.util.Arrays;

@com.tencent.mm.ui.base.a(3)
public class VoipCSMainUI
  extends MMActivity
  implements com.tencent.mm.plugin.voip_cs.b.a, a.a
{
  private String appId = "";
  private com.tencent.mm.compatible.util.b bEL;
  public String bSc = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_mp_video);
  public String buF = "";
  private ag dvh;
  public String eTp = "";
  private TelephonyManager knT;
  PhoneStateListener knU = new VoipCSMainUI.5(this);
  private n mHI = new VoipCSMainUI.10(this);
  private HeadsetPlugReceiver oLM = null;
  private HeadsetPlugReceiver.a oMA = new VoipCSMainUI.3(this);
  private BroadcastReceiver oMz = new VoipCSMainUI.4(this);
  public String oXt = "";
  private com.tencent.mm.plugin.voip_cs.b.a.a oXz;
  private com.tencent.mm.plugin.voip_cs.b.a.b oYd;
  private com.tencent.mm.plugin.voip_cs.b.a.c oYe;
  private boolean oYf = false;
  public String oYg = "";
  public String oYh = "";
  public String oYi = "";
  public boolean oYj = false;
  private com.tencent.mm.sdk.platformtools.al oYk = new com.tencent.mm.sdk.platformtools.al(Looper.getMainLooper(), new VoipCSMainUI.18(this), true);
  f.a oYl = new VoipCSMainUI.2(this);
  public CharSequence tickerText = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_mp_video);
  public CharSequence title = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_func_name_appbrand_video);
  public String type = "";
  
  private int aXI()
  {
    int i = 2;
    if (au.HV().yE()) {
      i = au.HV().yQ();
    }
    for (;;)
    {
      x.d("MicroMsg.voipcs.VoipCSMainUI", "Current StreamType:%d", new Object[] { Integer.valueOf(i) });
      return i;
      if (this.oXz.bKY())
      {
        if (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs != 2)
        {
          com.tencent.mm.plugin.voip_cs.b.a.c localc = this.oYe;
          if (localc.oKt != null)
          {
            i = localc.oKt.bJx();
            continue;
          }
        }
        i = 0;
      }
    }
  }
  
  private void bMM()
  {
    Object localObject1;
    Object localObject2;
    long l;
    boolean bool1;
    boolean bool2;
    label321:
    boolean bool3;
    if (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs <= 0)
    {
      localObject1 = this.oYd;
      if (((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).oXR.ciq())
      {
        localObject2 = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).oXR;
        l = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).oXM;
        ((com.tencent.mm.sdk.platformtools.al)localObject2).J(l, l);
      }
      localObject1 = this.oYd;
      if (((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).oXS.ciq())
      {
        localObject2 = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).oXS;
        l = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).oXN;
        ((com.tencent.mm.sdk.platformtools.al)localObject2).J(l, l);
      }
      localObject1 = com.tencent.mm.plugin.voip_cs.b.b.bMv();
      ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).kqA = false;
      ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).kqz = false;
      if (((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).kqx.lkO)
      {
        x.d("MicroMsg.VoipCSEngine", "protocal has init,now uninit!");
        ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).kqx.iT(false);
        ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).kqx.reset();
      }
      ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).kqx.oOk = 1;
      l = System.currentTimeMillis();
      localObject1 = ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).kqx;
      ((v2protocal)localObject1).netType = com.tencent.mm.plugin.voip.b.a.getNetType(com.tencent.mm.sdk.platformtools.ad.getContext());
      ((v2protocal)localObject1).oOj = ((v2protocal)localObject1).netType;
      com.tencent.mm.plugin.voip_cs.b.b.bMx().oOj = ((v2protocal)localObject1).netType;
      if (((v2protocal)localObject1).netType == 5) {
        ((v2protocal)localObject1).netType = 4;
      }
      if ((((v2protocal)localObject1).oOj < 4) || ((v2protocal.ovW & 0x400) == 0) || ((v2protocal.ovW & 0xFF) < 30)) {
        break label1282;
      }
      bool1 = true;
      if ((com.tencent.mm.compatible.e.q.deM.ddl != 1) || (com.tencent.mm.compatible.e.q.deM.dcN.width < 480) || (com.tencent.mm.compatible.e.q.deM.dcN.height < 360) || (com.tencent.mm.compatible.e.q.deM.dcP.width < 480) || (com.tencent.mm.compatible.e.q.deM.dcP.height < 360)) {
        break label1288;
      }
      bool2 = true;
      if (com.tencent.mm.compatible.e.q.deM.ddl != 0) {
        break label1294;
      }
      bool3 = true;
      label333:
      if (((bool1) || (bool2)) && (!bool3))
      {
        ((v2protocal)localObject1).defaultWidth = 480;
        ((v2protocal)localObject1).defaultHeight = 360;
        v2protocal.oOg = true;
        com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip", "steve:Set Enable 480! " + ((v2protocal)localObject1).defaultWidth + "x" + ((v2protocal)localObject1).defaultHeight);
      }
      com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip", "steve: Android CPUFlag:" + (v2protocal.ovW & 0xFF) + ", 480x360 Enc flags: bEnable480FromLocal:" + bool1 + ", bEnable480FromSvr:" + bool2 + ", bDisable480FromSvr:" + bool3);
      ((v2protocal)localObject1).oPf = new int[((v2protocal)localObject1).defaultWidth * ((v2protocal)localObject1).defaultHeight];
      au.HU();
      ((v2protocal)localObject1).oOi = com.tencent.mm.model.c.Df();
      if ((v2protocal.ovW & 0x400) == 0) {
        break label1300;
      }
      com.tencent.mm.compatible.loader.d.y(com.tencent.mm.sdk.platformtools.ad.getContext(), "libvoipCodec_v7a.so");
      com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v7a.so... ");
    }
    for (;;)
    {
      int i = Build.VERSION.SDK_INT;
      int j = OpenGlRender.bMg();
      localObject2 = ((WindowManager)com.tencent.mm.sdk.platformtools.ad.getContext().getSystemService("window")).getDefaultDisplay();
      int k = ((Display)localObject2).getWidth();
      int m = ((Display)localObject2).getHeight();
      i = ((v2protocal)localObject1).init(((v2protocal)localObject1).netType, 2, ((v2protocal)localObject1).defaultWidth << 16 | ((v2protocal)localObject1).defaultHeight, k << 16 | m, ((v2protocal)localObject1).oOi, i << 16 | j << 24 | v2protocal.ovW, com.tencent.mm.compatible.util.e.duM + "app_lib/", 8);
      com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip", "protocal init ret :" + i + ",uin= " + ((v2protocal)localObject1).oOi);
      ((v2protocal)localObject1).lkO = true;
      if (i < 0) {
        ((v2protocal)localObject1).reset();
      }
      x.d("MicroMsg.VoipCSEngine", "protocal init finish, ret: %d, used %dms", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
      if (i < 0) {
        x.e("MicroMsg.VoipCSEngine", "engine init failed!");
      }
      com.tencent.mm.plugin.voip_cs.b.d locald = com.tencent.mm.plugin.voip_cs.b.b.bMw();
      String str1 = this.oXt;
      String str2 = this.appId;
      String str3 = this.oYi;
      x.i("MicroMsg.voipcs.VoipCSService", "start netscene invite for username:" + str1 + ",appid:" + str2 + ",voipCSContext:" + str3);
      locald.oXt = str1;
      locald.oXs = 1;
      localObject1 = com.tencent.mm.plugin.voip_cs.b.b.bMx();
      x.d("MicroMsg.VoipCSReportHelper", "markSendInvite");
      if (((com.tencent.mm.plugin.voip_cs.b.c)localObject1).oXf == 0) {
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject1).oXf = ((int)(System.currentTimeMillis() / 1000L));
      }
      localObject2 = null;
      localObject1 = localObject2;
      if (str3 != null)
      {
        localObject1 = localObject2;
        if (!str3.equals("")) {
          localObject1 = str3.getBytes();
        }
      }
      au.DF().a(823, locald);
      com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.kpr = ((int)(System.currentTimeMillis() / 1000L));
      localObject1 = new com.tencent.mm.plugin.voip_cs.b.c.c(com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.kpr, str1, com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.netType, (byte[])localObject1, com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.field_capInfo, str2);
      x.i("MicroMsg.voipcs.VoipCSService", "capDump is " + Arrays.toString(com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.field_capInfo));
      au.DF().a((l)localObject1, 0);
      if (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs < 2) {
        this.oXz.bME();
      }
      localObject1 = this.oYd;
      x.i("MicroMsg.voipcs.VoipCSViewManager", "start capture render");
      if (((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwe == null)
      {
        x.i("MicroMsg.voipcs.VoipCSViewManager", "create capture View");
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwe = new ObservableTextureView(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).oXA);
        localObject2 = new RelativeLayout.LayoutParams(1, 1);
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwe.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).oXB.addView(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwe, new RelativeLayout.LayoutParams(1, 1));
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwe.setVisibility(0);
      }
      if (((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwc == null)
      {
        j = 320;
        i = 240;
        com.tencent.mm.plugin.voip_cs.b.b.bMv();
        if (v2protocal.oOg)
        {
          j = 640;
          i = 480;
        }
        x.i("MicroMsg.voipcs.VoipCSViewManager", "create capture Render");
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwc = new com.tencent.mm.plugin.voip.video.a(j, i);
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwc.a((com.tencent.mm.plugin.voip.video.g)localObject1, true);
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwc.a(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwe);
        com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.oOx = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwc.bMd();
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwc.bLY();
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwc.bMe();
        x.i("MicroMsg.voipcs.VoipCSViewManager", "captureRender.mIsCurrentFaceCamera=%b captureRender.mIsCameraRemote180=%b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwc.bMb()), Boolean.valueOf(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).lwc.bMc()) });
      }
      return;
      label1282:
      bool1 = false;
      break;
      label1288:
      bool2 = false;
      break label321;
      label1294:
      bool3 = false;
      break label333;
      label1300:
      if ((v2protocal.ovW & 0x200) != 0)
      {
        com.tencent.mm.compatible.loader.d.y(com.tencent.mm.sdk.platformtools.ad.getContext(), "libvoipCodec.so");
        com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec.so... ");
      }
      else
      {
        com.tencent.mm.compatible.loader.d.y(com.tencent.mm.sdk.platformtools.ad.getContext(), "libvoipCodec_v5.so");
        com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v5.so... ");
      }
    }
  }
  
  private boolean bMN()
  {
    if (!com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.RECORD_AUDIO", 82, "", ""))
    {
      x.i("MicroMsg.voipcs.VoipCSMainUI", "has not audio record premission!");
      return false;
    }
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.CAMERA", 19, "", "");
    x.d("MicroMsg.voipcs.VoipCSMainUI", "voipcs checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this });
    if (!bool)
    {
      x.i("MicroMsg.voipcs.VoipCSMainUI", "has not camera  premission!");
      return false;
    }
    return true;
  }
  
  public final void aWO()
  {
    this.oYd.aWO();
    Object localObject;
    int i;
    if ((au.HV().yK()) || (au.HV().yE()))
    {
      this.oYe.ja(false);
      localObject = this.oYe;
      if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).ltc == null) {
        break label215;
      }
      boolean bool = ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).ltc.wn();
      com.tencent.mm.plugin.voip_cs.b.b.bMx().oWR = 1;
      if (!bool) {
        break label215;
      }
      i = 1;
      label66:
      com.tencent.mm.plugin.voip_cs.b.b.bMx().oXk = i;
      localObject = this.oYe;
      if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).oKt != null) {
        break label220;
      }
      com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.oOy = Math.abs(1);
    }
    for (;;)
    {
      this.oXz.stopRing();
      localObject = com.tencent.mm.plugin.voip_cs.b.b.bMx();
      if (((com.tencent.mm.plugin.voip_cs.b.c)localObject).oXf != 0) {
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject).oWU = ((int)(System.currentTimeMillis() / 1000L) - ((com.tencent.mm.plugin.voip_cs.b.c)localObject).oXf);
      }
      localObject = com.tencent.mm.plugin.voip_cs.b.b.bMx();
      x.d("MicroMsg.VoipCSReportHelper", "markStartTalk");
      if (((com.tencent.mm.plugin.voip_cs.b.c)localObject).oXi == 0) {
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject).oXi = ((int)(System.currentTimeMillis() / 1000L));
      }
      localObject = com.tencent.mm.plugin.voip_cs.b.b.bMx();
      x.d("MicroMsg.VoipCSReportHelper", "markConnect");
      if (((com.tencent.mm.plugin.voip_cs.b.c)localObject).oXh != 0) {
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject).oWW = ((int)(System.currentTimeMillis() / 1000L) - ((com.tencent.mm.plugin.voip_cs.b.c)localObject).oXh);
      }
      return;
      this.oYe.ja(true);
      break;
      label215:
      i = -1;
      break label66;
      label220:
      ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).oKt.bJt();
      if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).oKt.bJt() <= 0) {
        com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.oOy = Math.abs(1);
      }
    }
  }
  
  public final void bML()
  {
    x.d("MicroMsg.voipcs.VoipCSMainUI", "onChannelConnectFailed now finish it!");
    this.oYd.zc(5);
  }
  
  public final void eX(String paramString1, String paramString2)
  {
    com.tencent.mm.plugin.voip_cs.b.a.b localb = this.oYd;
    if ((localb.oXQ.equals("")) && (com.tencent.pb.common.c.g.isNullOrEmpty(paramString2))) {
      if (localb.oXA.oYj)
      {
        localb.eTm.setText(R.l.voip_cs_biz_user_name_appbrand);
        if ((!localb.oXP.equals("")) || (!com.tencent.pb.common.c.g.isNullOrEmpty(paramString1)) || ((localb.oXA.eTp != null) && (!localb.oXA.eTp.equals("")))) {
          break label120;
        }
        localb.oXG.setImageResource(R.g.default_avatar);
      }
    }
    label120:
    SharedPreferences localSharedPreferences;
    do
    {
      return;
      localb.eTm.setText(R.l.voip_cs_biz_user_name);
      break;
      localb.OM(paramString2);
      break;
      localSharedPreferences = com.tencent.mm.sdk.platformtools.ad.chZ();
      if ((!com.tencent.pb.common.c.g.isNullOrEmpty(paramString1)) && (!localb.oXP.equals(paramString1)))
      {
        localb.ON(paramString1);
        localSharedPreferences.edit().putString(localb.bMF(), paramString1).commit();
      }
    } while ((com.tencent.pb.common.c.g.isNullOrEmpty(paramString2)) || (localb.oXQ.equals(paramString2)));
    localb.OM(paramString2);
    localSharedPreferences.edit().putString(localb.bMG(), paramString2).commit();
  }
  
  protected final int getLayoutId()
  {
    return R.i.voip_cs_main;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    x.i("MicroMsg.voipcs.VoipCSMainUI", "onCreate voipcs....");
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.oXt = getIntent().getStringExtra("voipCSBizId");
    this.appId = getIntent().getStringExtra("voipCSAppId");
    this.buF = bi.oV(getIntent().getStringExtra("voipCSScene"));
    this.type = bi.oV(getIntent().getStringExtra("voipCSType"));
    this.oYg = getIntent().getStringExtra("voipCSAllowBackCamera");
    this.oYh = getIntent().getStringExtra("voipCSShowOther");
    this.eTp = getIntent().getStringExtra("voipCSAvatarUrl");
    this.oYi = getIntent().getStringExtra("voipCSContext");
    this.oYj = getIntent().getBooleanExtra("launch_from_appbrand", false);
    getWindow().addFlags(6946944);
    if (Build.VERSION.SDK_INT >= 19) {
      getWindow().addFlags(67108864);
    }
    this.dvh = new ag();
    paramBundle = com.tencent.mm.plugin.voip_cs.b.b.bMx();
    x.d("MicroMsg.VoipCSReportHelper", "reset");
    paramBundle.bjS = 0;
    paramBundle.oWu = 0;
    paramBundle.oWv = 0;
    paramBundle.oWw = 0;
    paramBundle.videoFps = 0;
    paramBundle.oWx = 0;
    paramBundle.oWy = 0;
    paramBundle.oWz = 0;
    paramBundle.oWA = 0;
    paramBundle.oWB = 0;
    paramBundle.oWC = 0;
    paramBundle.networkType = 0;
    paramBundle.oWD = 0;
    paramBundle.oWE = com.tencent.mm.plugin.voip_cs.b.c.oWr;
    paramBundle.oWF = 0;
    paramBundle.oWG = 0L;
    paramBundle.kpp = 0L;
    paramBundle.oWH = "";
    paramBundle.oOj = 0;
    paramBundle.oWK = 0;
    paramBundle.oWL = 0;
    paramBundle.oWM = 0;
    paramBundle.oOC = 0;
    paramBundle.oOB = 0;
    paramBundle.oWN = 0;
    paramBundle.oWO = 0;
    paramBundle.oWP = 0;
    paramBundle.oWQ = 0;
    paramBundle.oWR = 0;
    paramBundle.oWS = 0;
    paramBundle.oWT = 0L;
    paramBundle.oWU = 0;
    paramBundle.oWV = 0L;
    paramBundle.oWW = 0L;
    paramBundle.oWX = 0L;
    paramBundle.kqM = 0L;
    paramBundle.oWY = 0;
    paramBundle.oWZ = 0;
    paramBundle.channelStrategy = 1;
    paramBundle.oPR = 0;
    paramBundle.oOD = 0;
    paramBundle.oXa = 0;
    paramBundle.oXb = 0;
    paramBundle.kqW = "";
    paramBundle.kqV = "";
    paramBundle.oXf = 0;
    paramBundle.oXg = 0;
    paramBundle.oXh = 0;
    paramBundle.oXi = 0;
    paramBundle.oXj = 0;
    this.knT = ((TelephonyManager)com.tencent.mm.sdk.platformtools.ad.getContext().getSystemService("phone"));
    com.tencent.mm.plugin.voip_cs.b.b.bMw().oXt = this.oXt;
    this.oYd = new com.tencent.mm.plugin.voip_cs.b.a.b(this);
    this.oYe = new com.tencent.mm.plugin.voip_cs.b.a.c();
    this.bEL = new com.tencent.mm.compatible.util.b(com.tencent.mm.sdk.platformtools.ad.getContext());
    this.oXz = com.tencent.mm.plugin.voip_cs.b.a.a.bMC();
    com.tencent.mm.plugin.voip_cs.b.b.bMv().oYb = this;
    com.tencent.mm.plugin.voip_cs.b.b.bMw().oXl = this;
    if ((com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs == 0) || (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs == 3)) {
      com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs = 0;
    }
    au.vv().xv();
    this.bEL.requestFocus();
    au.HV().yB();
    au.HV().a(this.oYl);
    this.oLM = new HeadsetPlugReceiver();
    this.oLM.a(com.tencent.mm.sdk.platformtools.ad.getContext(), this.oMA);
    paramBundle = new IntentFilter();
    paramBundle.addAction("android.intent.action.SCREEN_ON");
    paramBundle.addAction("android.intent.action.SCREEN_OFF");
    paramBundle.addAction("android.intent.action.USER_PRESENT");
    com.tencent.mm.sdk.platformtools.ad.getContext().registerReceiver(this.oMz, paramBundle);
    au.a(this.mHI);
    int i;
    if (this.oYj) {
      if (this.buF.equals("1")) {
        if (this.type.equals("video"))
        {
          this.title = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_func_name);
          this.tickerText = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording);
          this.bSc = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording);
          i = this.knT.getCallState();
          if ((i != 2) && (i != 1)) {
            break label1165;
          }
          x.i("MicroMsg.voipcs.VoipCSMainUI", "check is phone use now ! TelephoneManager.callState is %d", new Object[] { Integer.valueOf(i) });
          h.a(this, R.l.voip_cs_phone_in_use, R.l.app_tip, new VoipCSMainUI.1(this));
          i = 1;
          label806:
          if (i == 0) {
            break label1170;
          }
          x.i("MicroMsg.voipcs.VoipCSMainUI", "can not start voip cs  by in telephone talking!");
        }
      }
    }
    label1165:
    label1170:
    do
    {
      return;
      this.title = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_func_name_appbrand_audio);
      this.tickerText = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_appbrand_audio);
      this.bSc = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_appbrand_audio);
      break;
      if (this.type.equals("video"))
      {
        this.title = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_func_name_appbrand_video);
        this.tickerText = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_appbrand_video);
        this.bSc = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_appbrand_video);
        break;
      }
      this.title = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_func_name_appbrand_audio);
      this.tickerText = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_appbrand_audio);
      this.bSc = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_appbrand_audio);
      break;
      if (this.buF.equals("1"))
      {
        if (this.type.equals("video"))
        {
          this.title = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_func_name);
          this.tickerText = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording);
          this.bSc = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording);
          break;
        }
        this.title = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_func_name_appbrand_audio);
        this.tickerText = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_mp_video);
        this.bSc = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_mp_video);
        break;
      }
      if (this.type.equals("video"))
      {
        this.title = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_func_name_appbrand_video);
        this.tickerText = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_mp_video);
        this.bSc = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_mp_video);
        break;
      }
      this.title = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_func_name_appbrand_audio);
      this.tickerText = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_mp_audio);
      this.bSc = com.tencent.mm.sdk.platformtools.ad.getContext().getString(R.l.voip_cs_minimize_wording_mp_audio);
      break;
      i = 0;
      break label806;
      this.knT.listen(this.knU, 32);
      if (!ao.isNetworkConnected(this))
      {
        x.e("MicroMsg.voipcs.VoipCSMainUI", "isNetworkAvailable false, not connected!cannot start voip cs!");
        h.a(this, R.l.voip_cs_net_unavailable, R.l.voip_not_wifi_warnning_title, new VoipCSMainUI.15(this));
        i = 0;
      }
      while (i == 0)
      {
        x.i("MicroMsg.voipcs.VoipCSMainUI", "can not start voip cs  by in  voip talking!");
        return;
        if ((ao.isWifi(this)) || (com.tencent.mm.plugin.voip.model.q.bKO()))
        {
          i = 1;
        }
        else
        {
          x.i("MicroMsg.voipcs.VoipCSMainUI", "check is not wifi network!");
          h.a(this, R.l.voip_cs_not_wifi_warnning_message, R.l.voip_not_wifi_warnning_title, new VoipCSMainUI.16(this), new VoipCSMainUI.17(this));
          i = 0;
        }
      }
      if (com.tencent.mm.plugin.voip.b.d.bLT())
      {
        x.i("MicroMsg.voipcs.VoipCSMainUI", "check  is voip talking now!");
        h.a(this, R.l.in_voip_tip, R.l.app_tip, new VoipCSMainUI.11(this));
        i = 1;
      }
      while (i != 0)
      {
        x.i("MicroMsg.voipcs.VoipCSMainUI", "can not start voip cs  by in other voip talking!");
        return;
        if (com.tencent.mm.plugin.voip.b.d.bLS())
        {
          x.i("MicroMsg.voipcs.VoipCSMainUI", "check is ipCall talking now!");
          h.a(this, R.l.in_wechat_out_tip, R.l.app_tip, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              paramAnonymousDialogInterface.dismiss();
              VoipCSMainUI.this.yZ(0);
            }
          });
          i = 1;
        }
        else if (com.tencent.mm.p.a.BQ())
        {
          x.i("MicroMsg.voipcs.VoipCSMainUI", "check is multiTalking  now!");
          h.a(this, R.l.in_multitalk_tip, R.l.app_tip, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              paramAnonymousDialogInterface.dismiss();
              VoipCSMainUI.this.yZ(0);
            }
          });
          i = 1;
        }
        else if (com.tencent.mm.ax.e.SA())
        {
          x.i("MicroMsg.voipcs.VoipCSMainUI", "check is in talktRoom  now!");
          h.a(this, R.l.in_new_share_location_tip, R.l.app_tip, new VoipCSMainUI.14(this));
          i = 1;
        }
        else
        {
          i = 0;
        }
      }
    } while (!bMN());
    bMM();
  }
  
  protected void onDestroy()
  {
    int j = 2;
    x.i("MicroMsg.voipcs.VoipCSMainUI", "onDestroy voipcs....");
    if (this.bEL != null) {
      this.bEL.zY();
    }
    Object localObject1 = new qy();
    Object localObject2;
    if (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXu == -1)
    {
      ((qy)localObject1).cbK.status = 3;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = this.oYe;
      localObject2 = com.tencent.mm.plugin.voip_cs.b.b.bMx();
      if ((((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).oKt == null) || (com.tencent.mm.plugin.voip_cs.b.b.bMx().oWR != 1)) {
        break label1338;
      }
    }
    label161:
    label247:
    label391:
    label695:
    label1288:
    label1298:
    label1328:
    label1333:
    label1338:
    for (int i = ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).oKt.bJx();; i = 0)
    {
      float f = au.HV().getStreamMaxVolume(i);
      ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).oXb = ((int)(au.HV().getStreamVolume(i) / f * 100.0F));
      localObject2 = com.tencent.mm.plugin.voip_cs.b.b.bMx();
      Object localObject3;
      byte[] arrayOfByte;
      if ((((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).ltc != null) && (com.tencent.mm.plugin.voip_cs.b.b.bMx().oWR == 1))
      {
        i = ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).ltc.wp();
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).oOD = i;
        if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).ltc != null) {
          ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).ltc.we();
        }
        if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).oKt != null) {
          ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).oKt.bJv();
        }
        this.oXz.stopRing();
        if (this.oYd != null)
        {
          localObject1 = this.oYd;
          if (com.tencent.mm.plugin.voip_cs.b.b.bMx().bjS == 0)
          {
            if (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs >= 2) {
              break label1288;
            }
            com.tencent.mm.plugin.voip_cs.b.b.bMx().bjS = 1;
          }
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).oQR.bMh();
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).oQS.bMh();
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).bMH();
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).bMK();
          localObject1 = com.tencent.mm.plugin.voip_cs.b.b.bMw();
          x.i("MicroMsg.voipcs.VoipCSService", "now stop service");
          au.DF().b(823, (com.tencent.mm.ab.e)localObject1);
          au.DF().b(455, (com.tencent.mm.ab.e)localObject1);
          au.DF().b(818, (com.tencent.mm.ab.e)localObject1);
          au.DF().b(795, (com.tencent.mm.ab.e)localObject1);
          au.DF().b(285, (com.tencent.mm.ab.e)localObject1);
          au.DF().b(312, (com.tencent.mm.ab.e)localObject1);
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXs = 3;
          if (((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXu != 823)
          {
            au.DF().a(880, (com.tencent.mm.ab.e)localObject1);
            if (((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXn != 0) {
              break label1298;
            }
            i = 1;
            x.i("MicroMsg.voipcs.VoipCSService", "start netscene hangup for username:" + ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXt + ",inviteId：" + com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.kpr + ",csroomId:" + com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.oOl + ",roomkey:" + com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.kpp + ",reason:" + i);
            localObject2 = new com.tencent.mm.plugin.voip_cs.b.c.a(com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.kpr, com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.oOl, com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.kpp, ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXt, i);
            au.DF().a((l)localObject2, 0);
          }
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXw.SO();
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXx.SO();
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXm = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oWI = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXn = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXo = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXp = null;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).kpy = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXq = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXs = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXt = "";
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXr = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXu = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXv = 999;
          localObject1 = com.tencent.mm.plugin.voip_cs.b.b.bMv();
          x.i("MicroMsg.VoipCSEngine", "now stop engine");
          ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).kqx.iT(true);
          localObject2 = com.tencent.mm.plugin.voip_cs.b.b.bMx();
          if ((bi.oW(((com.tencent.mm.plugin.voip_cs.b.c)localObject2).kqW)) && (bi.oW(((com.tencent.mm.plugin.voip_cs.b.c)localObject2).kqV)))
          {
            localObject3 = com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx;
            if (((com.tencent.mm.plugin.voip_cs.b.c)localObject2).oWP != 1) {
              break label1328;
            }
            i = 1;
            arrayOfByte = ((v2protocal)localObject3).oPO;
            j = ((v2protocal)localObject3).oPO.length;
            if (i == 0) {
              break label1333;
            }
          }
        }
      }
      for (i = 1;; i = 0)
      {
        ((v2protocal)localObject3).getVoipcsChannelInfo(arrayOfByte, j, i);
        x.d("MicroMsg.Voip", "field_voipcsEngineInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject3).field_voipcsChannelInfoLength) });
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).kqW = new String(((v2protocal)localObject3).oPO, 0, ((v2protocal)localObject3).field_voipcsChannelInfoLength);
        localObject3 = com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx;
        ((v2protocal)localObject3).getVoipcsEngineInfo(((v2protocal)localObject3).oPP, ((v2protocal)localObject3).oPP.length);
        x.d("MicroMsg.Voip", "field_voipcsEngineInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject3).field_voipcsEngineInfoLength) });
        localObject3 = ((v2protocal)localObject3).kpw + "," + ((v2protocal)localObject3).kpp + "," + ((v2protocal)localObject3).oOl + "," + com.tencent.mm.plugin.voip_cs.b.b.bMx().oWR + "," + ((v2protocal)localObject3).oOx + "," + ((v2protocal)localObject3).oOy + ((v2protocal)localObject3).bLu() + new String(((v2protocal)localObject3).oPP, 0, ((v2protocal)localObject3).field_voipcsEngineInfoLength);
        com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip", "voipreport:NewEngineString:" + (String)localObject3);
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).kqV = ((String)localObject3);
        x.d("MicroMsg.VoipCSReportHelper", "nativeChannelReportString: %s", new Object[] { ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).kqW });
        x.d("MicroMsg.VoipCSReportHelper", "nativeEngineReportString: %s", new Object[] { ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).kqV });
        localObject2 = com.tencent.mm.plugin.voip_cs.b.b.bMw();
        au.DF().a(312, (com.tencent.mm.ab.e)localObject2);
        localObject2 = new com.tencent.mm.plugin.voip_cs.b.c.e(com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.oOl, com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.kpp);
        au.DF().a((l)localObject2, 0);
        ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).kqx.reset();
        p.bKK().bKM();
        p.bKK().oMP = null;
        this.oYd = null;
        this.oYe = null;
        au.HV().setMode(0);
        com.tencent.mm.sdk.platformtools.ad.getContext().unregisterReceiver(this.oMz);
        au.HV().b(this.oYl);
        au.HV().yC();
        if (this.oLM != null) {
          this.oLM.ej(com.tencent.mm.sdk.platformtools.ad.getContext());
        }
        au.b(this.mHI);
        if (this.oYk != null) {
          this.oYk.SO();
        }
        au.getNotification().cancel(44);
        if ((this.knT != null) && (this.knU != null))
        {
          this.knT.listen(this.knU, 0);
          this.knU = null;
        }
        super.onDestroy();
        return;
        if (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXu == 823)
        {
          ((qy)localObject1).cbK.status = 4;
          break;
        }
        if (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs <= 1)
        {
          ((qy)localObject1).cbK.status = 1;
          break;
        }
        if (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs < 2) {
          break;
        }
        ((qy)localObject1).cbK.status = 2;
        break;
        i = 0;
        break label161;
        com.tencent.mm.plugin.voip_cs.b.b.bMx().bjS = 3;
        break label247;
        i = j;
        if (((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXn == 2) {
          break label391;
        }
        if (((com.tencent.mm.plugin.voip_cs.b.d)localObject1).oXn == 3)
        {
          i = 3;
          break label391;
        }
        i = 4;
        break label391;
        i = 0;
        break label695;
      }
    }
  }
  
  public final void onError(int paramInt)
  {
    if (this.oYd != null)
    {
      x.d("MicroMsg.voipcs.VoipCSMainUI", "onError for errCode:" + paramInt);
      this.oYd.zc(paramInt);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4) {
      return true;
    }
    if (paramInt == 25)
    {
      paramInt = aXI();
      au.HV().fE(paramInt);
      return true;
    }
    if (paramInt == 24)
    {
      paramInt = aXI();
      au.HV().fD(paramInt);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    if (!this.oXz.bKY()) {
      this.oXz.stopRing();
    }
    if ((com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs == 1) || (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs == 2))
    {
      Object localObject = new Intent(com.tencent.mm.sdk.platformtools.ad.getContext(), VoipCSMainUI.class);
      ((Intent)localObject).putExtra("voipCSBizId", this.oXt);
      ((Intent)localObject).putExtra("voipCSAppId", this.appId);
      ((Intent)localObject).putExtra("voipCSScene", this.buF);
      ((Intent)localObject).putExtra("voipCSType", this.type);
      ((Intent)localObject).putExtra("voipCSAllowBackCamera", this.oYg);
      ((Intent)localObject).putExtra("voipCSShowOther", this.oYh);
      ((Intent)localObject).putExtra("voipCSAvatarUrl", this.eTp);
      ((Intent)localObject).putExtra("voipCSContext", this.oYi);
      ((Intent)localObject).putExtra("launch_from_appbrand", this.oYj);
      localObject = PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.ad.getContext(), 44, (Intent)localObject, 134217728);
      localObject = new Notification.Builder(com.tencent.mm.sdk.platformtools.ad.getContext()).setTicker(this.tickerText).setWhen(System.currentTimeMillis()).setContentTitle(this.title).setContentText(this.bSc).setContentIntent((PendingIntent)localObject).setOngoing(true).getNotification();
      ((Notification)localObject).icon = com.tencent.mm.bf.a.cbg();
      ((Notification)localObject).flags |= 0x20;
      au.getNotification().a(44, (Notification)localObject, false);
      if ((this.oYk != null) && (this.oYk.ciq())) {
        this.oYk.J(5000L, 5000L);
      }
    }
    for (;;)
    {
      this.oYd.bMH();
      this.oYd.bPd = true;
      return;
      au.getNotification().cancel(44);
      if (this.oYk != null) {
        this.oYk.SO();
      }
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0) || (paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      x.e("MicroMsg.voipcs.VoipCSMainUI", "[voip_cs]onRequestPermissionsResult %d data is invalid", new Object[] { Integer.valueOf(paramInt) });
    }
    do
    {
      return;
      x.d("MicroMsg.voipcs.VoipCSMainUI", "[voip_cs] onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      switch (paramInt)
      {
      default: 
        return;
      case 19: 
        if (paramArrayOfInt[0] != 0) {
          break;
        }
        bMM();
        return;
      case 82: 
        if (paramArrayOfInt[0] != 0) {
          break label151;
        }
        x.d("MicroMsg.voipcs.VoipCSMainUI", "granted record audio!");
      }
    } while (!com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.CAMERA", 19, "", ""));
    bMM();
    return;
    label151:
    h.a(this, getString(R.l.permission_microphone_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new VoipCSMainUI.6(this), new VoipCSMainUI.7(this));
    return;
    if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
    for (paramInt = R.l.permission_camera_request_again_msg;; paramInt = R.l.permission_microphone_request_again_msg)
    {
      h.a(this, getString(paramInt), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new VoipCSMainUI.8(this), new VoipCSMainUI.9(this));
      return;
    }
  }
  
  protected void onRestart()
  {
    x.i("MicroMsg.voipcs.VoipCSMainUI", "onRestart voipcs....");
    super.onRestart();
    if ((bMN()) && (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs <= 1)) {
      bMM();
    }
    if (this.oYd != null) {
      this.oYd.bPd = false;
    }
  }
  
  protected void onResume()
  {
    x.i("MicroMsg.voipcs.VoipCSMainUI", "onResume voipcs....");
    super.onResume();
    if (this.oYd != null)
    {
      this.oYd.bPd = false;
      if (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs > 1)
      {
        bMM();
        if ((this.oYh != null) && (this.oYh.equals("1"))) {
          this.oYd.bMJ();
        }
      }
    }
    if (this.oYk != null) {
      this.oYk.SO();
    }
    au.getNotification().cancel(44);
  }
  
  protected void onStop()
  {
    super.onStop();
  }
  
  public final void yZ(int paramInt)
  {
    x.d("MicroMsg.voipcs.VoipCSMainUI", "onExitVoipCS for action:" + paramInt + ",CallingStatus:" + com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs);
    if (com.tencent.mm.plugin.voip_cs.b.b.bMw().oXs == 0) {
      finish();
    }
    while (this.oYd == null) {
      return;
    }
    this.oYd.zc(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/ui/VoipCSMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */