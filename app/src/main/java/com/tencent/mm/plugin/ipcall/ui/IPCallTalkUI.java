package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.model.al;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ipcall.a.c.a.a;
import com.tencent.mm.plugin.ipcall.a.g;
import com.tencent.mm.plugin.ipcall.a.g.a;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class IPCallTalkUI
  extends MMActivity
  implements j.a
{
  private String eWQ;
  private String kvn;
  private String kvo;
  private String kvp;
  private String kvq;
  private int kvr;
  private int kvs;
  private j kze;
  
  private void init()
  {
    this.kze = new j(this);
    this.kze.kzP = this;
    j localj = this.kze;
    Object localObject2 = this.eWQ;
    Object localObject3 = this.kvn;
    Object localObject4 = this.kvo;
    String str1 = this.kvp;
    Object localObject1 = this.kvq;
    int i = this.kvr;
    int j = this.kvs;
    localj.kzV = localj.kzN.getIntent().getBooleanExtra("IPCallTalkUI_isFromMiniNotification", false);
    x.i("MicroMsg.TalkUIController", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername: %s, isFromMinimize: %b", new Object[] { localObject2, localObject3, localObject4, str1, localObject1, Boolean.valueOf(localj.kzV) });
    localj.kzD = ((ImageView)localj.kzN.findViewById(R.h.talk_ui_default_avatar));
    localj.eBM = ((ImageView)localj.kzN.findViewById(R.h.talk_ui_avatar_iv));
    localj.kzB = ((EditText)localj.kzN.findViewById(R.h.talk_ui_nickname_tv));
    localj.eBR = ((TextView)localj.kzN.findViewById(R.h.talk_ui_status_tv));
    localj.kzC = ((TextView)localj.kzN.findViewById(R.h.talk_ui_phone_num_tv));
    localj.kzE = ((IPCallFuncButton)localj.kzN.findViewById(R.h.talk_ui_mute_button));
    localj.kzF = ((IPCallFuncButton)localj.kzN.findViewById(R.h.talk_ui_dial_button));
    localj.kzG = ((IPCallFuncButton)localj.kzN.findViewById(R.h.talk_ui_speaker_button));
    localj.kzH = ((ImageButton)localj.kzN.findViewById(R.h.talk_ui_hangout_button));
    localj.kzK = ((ImageButton)localj.kzN.findViewById(R.h.ipcall_mini_action));
    localj.kzI = ((TextView)localj.kzN.findViewById(R.h.voip_net_status_hint));
    localj.kzJ = localj.kzN.findViewById(R.h.voip_net_status_hint_layout);
    localj.ksT = ((DialPad)localj.kzN.findViewById(R.h.dial_pad));
    if (localj.kzV)
    {
      localj.eWQ = i.aXp().koG.nickname;
      localj.kzM = i.aXp().koG.kpQ;
      localj.kvq = i.aXp().koG.bZR;
      localj.kvo = i.aXp().koG.cbH;
      localj.kvn = i.aXp().koG.kpP;
      localj.kzL = i.aXp().koG.kpS;
      x.i("MicroMsg.TalkUIController", "restoreParam nickname:%s,fianlPhoneNumber:%s,toUserName:%s,contactId:%s,phoneNumber:%s,phoneType:%d", new Object[] { localj.eWQ, localj.kzM, localj.kvq, localj.kvo, localj.kvn, Integer.valueOf(localj.kzL) });
      localj.aYt();
      localj.aYu();
      i.aXt();
      x.i("MicroMsg.TalkUIController", com.tencent.mm.plugin.ipcall.a.f.stateToString(i.aXt().mCurrentState));
      localj.rJ(i.aXt().mCurrentState);
      localObject1 = i.aXp().koG.kpQ;
      localObject2 = i.aXp().koG.kpR;
      if (!bi.oW((String)localObject2))
      {
        localj.Fj((String)localObject2);
        localj.kzC.setText(com.tencent.mm.plugin.ipcall.b.a.Ft((String)localObject2));
      }
      for (;;)
      {
        if (i.aXt().aXk())
        {
          localObject1 = localj.kzG;
          i.aXs();
          ((IPCallFuncButton)localObject1).setChecked(com.tencent.mm.plugin.ipcall.a.b.a.yJ());
          localj.kzE.setChecked(i.aXs().kqc.hEj);
        }
        return;
        if (!bi.oW((String)localObject1))
        {
          localj.Fj((String)localObject1);
          localj.kzC.setText(com.tencent.mm.plugin.ipcall.b.a.Ft((String)localObject1));
        }
      }
    }
    if (i.aXt().aXj())
    {
      com.tencent.mm.ui.base.h.a(localj.kzN, R.l.in_wechat_out_tip, R.l.app_tip, false, new j.1(localj));
      return;
    }
    localj.aYt();
    localj.eWQ = ((String)localObject2);
    localj.kvn = ((String)localObject3);
    localj.kvo = ((String)localObject4);
    localj.kvp = str1;
    localj.kvr = i;
    localj.kvs = j;
    if (!bi.oW(localj.kvn)) {
      localj.kvn = com.tencent.mm.plugin.ipcall.b.c.Fx(localj.kvn);
    }
    if (bi.oW(localj.kvp))
    {
      if (com.tencent.mm.plugin.ipcall.b.a.Fr(localj.kvn))
      {
        localObject2 = com.tencent.mm.plugin.ipcall.b.a.Fp(localj.kvn);
        if (bi.oW((String)localObject2)) {
          localj.kvn = com.tencent.mm.plugin.ipcall.b.a.Fs(localj.kvn);
        }
      }
      else
      {
        localj.kvp = com.tencent.mm.plugin.ipcall.b.c.aYB();
      }
    }
    else
    {
      x.i("MicroMsg.TalkUIController", "final mCountryCode: %s", new Object[] { localj.kvp });
      localObject2 = com.tencent.mm.plugin.ipcall.a.c.aXb();
      localObject3 = localj.kvp;
      if (!((com.tencent.mm.plugin.ipcall.a.c)localObject2).huc) {
        ((com.tencent.mm.plugin.ipcall.a.c)localObject2).fM(false);
      }
      if (!bi.oW((String)localObject3))
      {
        localObject3 = ((String)localObject3).replace("+", "");
        i.aXx().y(bi.getInt((String)localObject3, 0), bi.VF());
        ((com.tencent.mm.plugin.ipcall.a.c)localObject2).aXd();
      }
      if (bi.oW(localj.eWQ)) {
        localj.eWQ = com.tencent.mm.plugin.ipcall.b.a.aw(localj.kzN, localj.kvn);
      }
      localj.kvq = ((String)localObject1);
      if ((bi.oW(localj.kvp)) || (com.tencent.mm.plugin.ipcall.b.a.Fr(localj.kvn))) {
        break label1196;
      }
      localj.kzM = (localj.kvp + localj.kvn);
      if (localj.kzM.startsWith("+")) {}
    }
    label1196:
    for (localj.kzM = ("+" + localj.kzM);; localj.kzM = localj.kvn)
    {
      x.i("MicroMsg.TalkUIController", "final call mPhoneNumber: %s", new Object[] { localj.kzM });
      if (!com.tencent.mm.plugin.ipcall.a.c.aXb().ru(bi.getInt(localj.kvp, -1))) {
        break label1209;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.k(12058, localj.kvp);
      com.tencent.mm.ui.base.h.a(localj.kzN, localj.kzN.getString(R.l.callout_country_restriction_hint), localj.kzN.getString(R.l.callout_country_restriction_hint_title), false, new j.6(localj));
      return;
      localj.kvn = com.tencent.mm.plugin.ipcall.b.a.Fu(localj.kvn);
      localj.kvp = ((String)localObject2);
      break;
    }
    label1209:
    if (!ao.isNetworkConnected(localj.kzN))
    {
      Toast.makeText(localj.kzN, R.l.voip_net_unavailable, 1).show();
      localj.kzN.finish();
      return;
    }
    long l1 = localj.kzN.getSharedPreferences("IPCall_LastInputPref", 0).getLong("IPCall_LastInvite", -1L);
    long l2 = System.currentTimeMillis();
    if ((l1 > l2) && (l1 != -1L))
    {
      x.i("MicroMsg.TalkUIController", "onDisasterHappen");
      com.tencent.mm.ui.base.h.a(localj.kzN, localj.kzN.getString(R.l.ip_call_disaster_invalid, new Object[] { String.valueOf((l1 - l2) / 1000L + 1L) }), localj.kzN.getString(R.l.ip_call_alter_tip), localj.kzN.getString(R.l.ip_call_alter_tip_ok), false, new j.5(localj));
      return;
    }
    localj.aYu();
    String str2;
    String str3;
    int k;
    if ((!localj.kzV) || (!i.aXt().aXj()))
    {
      localj.kzL = com.tencent.mm.plugin.ipcall.b.a.du(localj.kvo, localj.kvn);
      localj.rJ(1);
      localObject2 = localj.kzO;
      localObject3 = localj.eWQ;
      localObject4 = localj.kvn;
      str1 = localj.kvq;
      str2 = localj.kzM;
      str3 = localj.kvo;
      i = localj.kzL;
      j = localj.kvr;
      k = localj.kvs;
      if (!i.aXt().aXj()) {
        break label1569;
      }
      x.i("MicroMsg.IPCallManager", "startIPCall, already start!");
      x.i("MicroMsg.TalkUIController", "startLaunchTalk, callNumber: %s", new Object[] { localj.kzM });
      localObject1 = i.aXr();
      localObject2 = localj.kvp;
      x.d("MicroMsg.IPCallReportHelper", "setCountryCode: %s", new Object[] { localObject2 });
      if (!bi.oW((String)localObject2)) {
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).countryCode = ((String)localObject2);
      }
    }
    localj.kzX = false;
    return;
    label1569:
    x.i("MicroMsg.IPCallManager", "startIPCall");
    i.aXp().kox = ((g.a)localObject2);
    i.aXq().kqC = ((a.a)localObject2);
    i.aXt().mCurrentState = -1;
    ((com.tencent.mm.plugin.ipcall.c)localObject2).aEI();
    ((com.tencent.mm.plugin.ipcall.c)localObject2).knT = ((TelephonyManager)ad.getContext().getSystemService("phone"));
    ((com.tencent.mm.plugin.ipcall.c)localObject2).knT.listen(((com.tencent.mm.plugin.ipcall.c)localObject2).knU, 32);
    com.tencent.mm.sdk.b.a.sFg.b(((com.tencent.mm.plugin.ipcall.c)localObject2).knV);
    x.d("MicroMsg.IPCallRecordStorageLogic", "recordStartCall, phoneNumber: %s, contactId: %s", new Object[] { str2, str3 });
    localObject1 = new k();
    ((k)localObject1).field_phonenumber = str2;
    if (!bi.oW(str3))
    {
      com.tencent.mm.plugin.ipcall.a.g.c localc = i.aXv().EP(str3);
      if ((localc != null) && (localc.sKx != -1L))
      {
        ((k)localObject1).field_addressId = localc.sKx;
        label1734:
        if (i == -1) {
          break label2349;
        }
        ((k)localObject1).field_phoneType = i;
        label1745:
        ((k)localObject1).field_calltime = bi.VF();
        ((k)localObject1).field_status = 1;
        if (!i.aXw().b((com.tencent.mm.sdk.e.c)localObject1)) {
          break label2358;
        }
      }
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.ipcall.c)localObject2).knR = ((k)localObject1);
      com.tencent.mm.plugin.ipcall.c.dvh.postDelayed(((com.tencent.mm.plugin.ipcall.c)localObject2).knX, 1754L);
      ((com.tencent.mm.plugin.ipcall.c)localObject2).knS = false;
      localObject1 = i.aXr();
      x.d("MicroMsg.IPCallReportHelper", "reset");
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqE = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqF = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqG = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqH = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqI = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqJ = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqK = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqL = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqM = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqN = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kpo = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kpp = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqO = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).eNQ = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqP = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqQ = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqS = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqR = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).koa = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqT = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqU = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqZ = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqY = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqV = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kqW = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).countryCode = "";
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kra = 0L;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).krb = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).krc = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).krd = 0;
      ((com.tencent.mm.plugin.ipcall.a.c.b)localObject1).kre = 0;
      i.aXt().mCurrentState = -1;
      x.d("MicroMsg.IPCallManager", "startIPCall, username: %s, phoneNumber: %s", new Object[] { str1, str2 });
      localObject1 = i.aXp();
      x.d("MicroMsg.IPCallSvrLogic", "startIPCall, toUsername: %s, toPhoneNumber: %s", new Object[] { str1, str2 });
      ((g)localObject1).bXc = false;
      ((g)localObject1).koH = false;
      ((g)localObject1).kos = 0;
      ((g)localObject1).kot = 0;
      ((g)localObject1).kou = 0;
      ((g)localObject1).kov = false;
      ((g)localObject1).kow = false;
      ((g)localObject1).koI = false;
      ((g)localObject1).koG = new com.tencent.mm.plugin.ipcall.a.a.c();
      ((g)localObject1).koG.nickname = ((String)localObject3);
      ((g)localObject1).koG.kpP = ((String)localObject4);
      ((g)localObject1).koG.cbH = str3;
      ((g)localObject1).koG.kpQ = str2;
      ((g)localObject1).koG.bZR = str1;
      ((g)localObject1).koG.kpr = ((int)System.currentTimeMillis());
      ((g)localObject1).koG.kps = j;
      ((g)localObject1).koG.kpt = k;
      ((g)localObject1).koG.kpS = i;
      ((g)localObject1).koy.a(((g)localObject1).koG);
      ((g)localObject1).koD.a(((g)localObject1).koG);
      x.i("MicroMsg.IPCallSvrLogic", "startIPCallInternal, inviteId: %d", new Object[] { Integer.valueOf(((g)localObject1).koG.kpr) });
      i.aXt().rv(1);
      localObject1 = i.aXq();
      if (!((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).kqB) {
        break label2364;
      }
      x.d("MicroMsg.IPCallEngineManager", "already start engine");
      com.tencent.mm.plugin.ipcall.c.dvh.removeCallbacks(((com.tencent.mm.plugin.ipcall.c)localObject2).knW);
      com.tencent.mm.plugin.ipcall.c.dvh.postDelayed(((com.tencent.mm.plugin.ipcall.c)localObject2).knW, 60000L);
      break;
      ((k)localObject1).field_addressId = -1L;
      break label1734;
      ((k)localObject1).field_addressId = -1L;
      break label1734;
      label2349:
      ((k)localObject1).field_phoneType = -1;
      break label1745;
      label2358:
      localObject1 = null;
    }
    label2364:
    ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).aXL();
    x.i("MicroMsg.IPCallEngineManager", "start engine");
    if (((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).kqx.lkO)
    {
      ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).kqx.iT(false);
      ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).kqx.reset();
    }
    ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).kqx.oOk = 1;
    l1 = System.currentTimeMillis();
    localObject3 = ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).kqx;
    ((v2protocal)localObject3).netType = com.tencent.mm.plugin.voip.b.a.getNetType(ad.getContext());
    if (((v2protocal)localObject3).netType == 5) {
      ((v2protocal)localObject3).netType = 4;
    }
    ((v2protocal)localObject3).oPf = new int[((v2protocal)localObject3).defaultWidth * ((v2protocal)localObject3).defaultHeight];
    au.HU();
    ((v2protocal)localObject3).oOi = com.tencent.mm.model.c.Df();
    i = m.zj();
    if ((i & 0x400) != 0)
    {
      com.tencent.mm.compatible.loader.d.y(ad.getContext(), "libvoipCodec_v7a.so");
      com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v7a.so... ");
    }
    for (;;)
    {
      j = Build.VERSION.SDK_INT;
      k = OpenGlRender.bMg();
      localObject4 = ((WindowManager)ad.getContext().getSystemService("window")).getDefaultDisplay();
      int m = ((Display)localObject4).getWidth();
      int n = ((Display)localObject4).getHeight();
      i = ((v2protocal)localObject3).init(((v2protocal)localObject3).netType, 65538, ((v2protocal)localObject3).defaultWidth << 16 | ((v2protocal)localObject3).defaultHeight, m << 16 | n, ((v2protocal)localObject3).oOi, i | j << 16 | k << 24, com.tencent.mm.compatible.util.e.duM + "app_lib/", 4);
      com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip", "protocal init ret :" + i + ",uin= " + ((v2protocal)localObject3).oOi);
      ((v2protocal)localObject3).lkO = true;
      if (i < 0) {
        ((v2protocal)localObject3).reset();
      }
      x.d("MicroMsg.IPCallEngineManager", "protocal init finish, ret: %d, used %dms", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l1) });
      if ((((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).kqx.field_capInfo != null) && (((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).kqx.exchangeCabInfo(((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).kqx.field_capInfo, ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).kqx.field_capInfo.length) < 0))
      {
        x.e("MicroMsg.IPCallEngineManager", "exchangeCabInfo failed");
        i.aXr().kqN = 24;
      }
      if (i < 0) {
        x.e("MicroMsg.IPCallEngineManager", "engine init failed!");
      }
      ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).kqx.oOk = 1;
      ((com.tencent.mm.plugin.ipcall.a.c.a)localObject1).kqB = true;
      break;
      if ((i & 0x200) != 0)
      {
        com.tencent.mm.compatible.loader.d.y(ad.getContext(), "libvoipCodec.so");
        com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec.so... ");
      }
      else
      {
        com.tencent.mm.compatible.loader.d.y(ad.getContext(), "libvoipCodec_v5.so");
        com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v5.so... ");
      }
    }
  }
  
  public final void gc(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    ah.i(new Runnable()
    {
      public final void run()
      {
        Intent localIntent = new Intent();
        IPCallTalkUI.this.setResult(-1, localIntent);
        IPCallTalkUI.this.finish();
      }
    }, 3000L);
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.ip_call_talk_ui;
  }
  
  public void onBackPressed() {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getSupportActionBar().hide();
    getWindow().addFlags(6946944);
    this.eWQ = getIntent().getStringExtra("IPCallTalkUI_nickname");
    this.kvn = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
    this.kvo = getIntent().getStringExtra("IPCallTalkUI_contactId");
    this.kvp = getIntent().getStringExtra("IPCallTalkUI_countryCode");
    this.kvq = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
    this.kvr = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
    this.kvs = getIntent().getIntExtra("IPCallTalkUI_countryType", 0);
    x.i("MicroMsg.IPCallTalkUI", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername:%s, mDialScene:%d ,mCountryType:%d", new Object[] { this.eWQ, this.kvn, this.kvo, this.kvp, this.kvq, Integer.valueOf(this.kvr), Integer.valueOf(this.kvs) });
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.RECORD_AUDIO", 80, null, null);
    x.i("MicroMsg.IPCallTalkUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd() });
    if (!bool) {
      return;
    }
    init();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    setScreenEnable(true);
    if (this.kze != null)
    {
      j localj = this.kze;
      x.i("MicroMsg.TalkUIController", "onDestroy");
      localj.kzO.knQ = null;
      i.aXs().bGc = null;
      i.aXs().kqh = null;
      i.aXs().a(null);
      Object localObject = i.aXs();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqd.kqu = null;
      localObject = ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqd;
      ((com.tencent.mm.plugin.ipcall.a.b.d)localObject).hlW.ciL();
      ((com.tencent.mm.plugin.ipcall.a.b.d)localObject).hma.ciM();
      localj.kzN = null;
      localj.kzP = null;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.kze != null)
    {
      int i;
      if (i.aXt().aXk()) {
        if (paramInt == 25)
        {
          i = i.aXs().aXI();
          if (i == -1) {
            break label79;
          }
          au.HV().fE(i);
          i = 1;
        }
      }
      while (i != 0)
      {
        return true;
        if (paramInt == 24)
        {
          i = i.aXs().aXI();
          if (i != -1)
          {
            au.HV().fD(i);
            i = 1;
            continue;
          }
        }
        label79:
        i = 0;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    x.d("MicroMsg.IPCallTalkUI", "onPause");
    super.onPause();
    if (this.kze != null) {
      x.d("MicroMsg.TalkUIController", "onPause");
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.IPCallTalkUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      init();
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_microphone_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new IPCallTalkUI.2(this), new IPCallTalkUI.3(this));
  }
  
  protected void onResume()
  {
    x.d("MicroMsg.IPCallTalkUI", "onResume");
    super.onResume();
    if (this.kze != null)
    {
      x.d("MicroMsg.TalkUIController", "onResume");
      au.getNotification().cancel(42);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallTalkUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */