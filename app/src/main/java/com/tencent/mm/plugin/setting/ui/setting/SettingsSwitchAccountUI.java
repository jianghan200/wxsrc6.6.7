package com.tencent.mm.plugin.setting.ui.setting;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.ja;
import com.tencent.mm.g.a.y;
import com.tencent.mm.kernel.g;
import com.tencent.mm.kernel.k;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bt;
import com.tencent.mm.modelsimple.ac;
import com.tencent.mm.modelsimple.p;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.plugin.account.ui.LoginPasswordUI;
import com.tencent.mm.plugin.account.ui.LoginVoiceUI;
import com.tencent.mm.plugin.account.ui.MobileInputUI;
import com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI;
import com.tencent.mm.plugin.setting.a.c;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.4;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.5;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.6;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.a;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.arm;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@com.tencent.mm.ui.base.a(19)
public class SettingsSwitchAccountUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private TextView eFH;
  private String eSe;
  private SwitchAccountGridView mPR;
  private Map<String, com.tencent.mm.plugin.setting.model.SwitchAccountModel> mPV = new HashMap();
  private boolean mSv;
  private TextView mTW;
  private View mTX;
  private View mTY;
  private TextView mTZ;
  private ValueAnimator mUa;
  private al mUb;
  private boolean mUc;
  private boolean mUd;
  private int scene;
  private TextView titleView;
  
  private static void K(Map<String, com.tencent.mm.plugin.setting.model.SwitchAccountModel> paramMap)
  {
    if (paramMap.size() == 2)
    {
      String[] arrayOfString = new String[2];
      Object localObject = paramMap.values().iterator();
      int i = 0;
      while (((Iterator)localObject).hasNext())
      {
        arrayOfString[i] = ((com.tencent.mm.plugin.setting.model.SwitchAccountModel)((Iterator)localObject).next()).username;
        i += 1;
      }
      if ((!bi.G(new String[] { arrayOfString[0], arrayOfString[1] })) && (arrayOfString[0].equals(arrayOfString[1])))
      {
        paramMap = paramMap.keySet().iterator();
        while (paramMap.hasNext())
        {
          localObject = (String)paramMap.next();
          bt.dDs.iL((String)localObject);
        }
        throw new NullPointerException(String.format("tow accounts have the same username!!! , %s, %s", new Object[] { arrayOfString[0], arrayOfString[1] }));
      }
    }
  }
  
  private void KX(String paramString)
  {
    Object localObject = (com.tencent.mm.plugin.setting.model.SwitchAccountModel)this.mPV.get(paramString);
    if ((localObject != null) && (!this.mUc))
    {
      this.mUc = true;
      localObject = new com.tencent.mm.modelsimple.q(paramString, ((com.tencent.mm.plugin.setting.model.SwitchAccountModel)localObject).username, ((com.tencent.mm.plugin.setting.model.SwitchAccountModel)localObject).mOQ, "");
      g.DF().a((com.tencent.mm.ab.l)localObject, 0);
      this.mPR.setSwitchToWxUsername(paramString);
      this.mPR.bum();
      btV();
    }
  }
  
  private void btV()
  {
    if (this.mUc)
    {
      this.mTW.setVisibility(8);
      return;
    }
    if ((this.mPV.size() <= 1) && (this.scene == 0))
    {
      this.mTW.setVisibility(8);
      this.mSv = false;
      this.mPR.setDeleteState(false);
      return;
    }
    if (!this.mSv)
    {
      this.titleView.setText(a.i.settings_switch_account_login_title);
      this.mTZ.setVisibility(8);
      this.mTW.setText(getString(a.i.settings_switch_account_delete_title));
      this.mTW.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if (!SettingsSwitchAccountUI.f(SettingsSwitchAccountUI.this))
          {
            SettingsSwitchAccountUI.b(SettingsSwitchAccountUI.this, true);
            SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).setDeleteState(SettingsSwitchAccountUI.f(SettingsSwitchAccountUI.this));
            SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).bum();
            SettingsSwitchAccountUI.e(SettingsSwitchAccountUI.this);
            if (bt.dDs.IH().size() > 1) {
              com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(3), bt.dDs.II() });
            }
          }
          else
          {
            return;
          }
          com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(3), bt.dDs.II() });
        }
      });
      return;
    }
    this.titleView.setText(a.i.settings_switch_account_delete_title);
    this.mTZ.setVisibility(0);
    if (this.mUd)
    {
      this.mTW.setText(getString(a.i.app_finish));
      this.mTW.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          SettingsSwitchAccountUI.b(SettingsSwitchAccountUI.this, false);
          SettingsSwitchAccountUI.a(SettingsSwitchAccountUI.this, false);
          SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).setDeleteState(false);
          SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).bum();
          SettingsSwitchAccountUI.e(SettingsSwitchAccountUI.this);
          if (SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).getAccountCount() == 0)
          {
            if (bt.dDs.IH().size() <= 1) {
              break label162;
            }
            com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(11), bt.dDs.II() });
          }
          for (;;)
          {
            paramAnonymousView = com.tencent.mm.plugin.account.a.a.ezn.be(SettingsSwitchAccountUI.this);
            paramAnonymousView.addFlags(67108864);
            SettingsSwitchAccountUI.this.startActivity(paramAnonymousView);
            SettingsSwitchAccountUI.this.finish();
            com.tencent.mm.ui.base.b.gF(SettingsSwitchAccountUI.this);
            SettingsSwitchAccountUI.g(SettingsSwitchAccountUI.this);
            return;
            label162:
            com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(11), bt.dDs.II() });
          }
        }
      });
      return;
    }
    this.mTW.setText(getString(a.i.app_cancel));
    this.mTW.setOnClickListener(new SettingsSwitchAccountUI.9(this));
  }
  
  private void btW()
  {
    if (com.tencent.mm.kernel.a.gI(g.Eg().dpx))
    {
      localObject = new ac(2);
      g.DF().a((com.tencent.mm.ab.l)localObject, 0);
    }
    Object localObject = new p();
    g.DF().a((com.tencent.mm.ab.l)localObject, 0);
    this.mPR.setLogoutState(true);
    this.mPR.bum();
    if (this.mUb == null)
    {
      this.mUb = new al(Looper.getMainLooper(), new SettingsSwitchAccountUI.2(this), false);
      this.mUb.J(8000L, 8000L);
    }
  }
  
  private void btX()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsSwitchAccountUI", "switch account logout");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsSwitchAccountUI", "just keep class %s", new Object[] { com.tencent.mm.plugin.setting.modelsimple.SwitchAccountModel.class.toString() });
    com.tencent.mm.plugin.setting.b.ezo.vr();
    Object localObject = new ja();
    ((ja)localObject).bSG.status = 0;
    ((ja)localObject).bSG.aAk = 0;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = new y();
    ((y)localObject).bHg.bHh = true;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    af.Wq("show_whatsnew");
    k.j(this, true);
    com.tencent.mm.platformtools.x.H(this, null);
    if (g.Eg().Dx())
    {
      localObject = com.tencent.mm.aa.c.A(com.tencent.mm.model.q.GF(), false);
      at.dBv.iy((String)localObject);
      g.Ei().DT().a(aa.a.sZO, localObject);
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsSwitchAccountUI", "last login username in sp %s", new Object[] { at.dBv.I("login_user_name", "") });
    localObject = com.tencent.mm.model.q.Ho();
    if (bi.oW((String)((Map)localObject).get("login_user_name"))) {
      ((Map)localObject).put("login_user_name", at.dBv.I("login_user_name", ""));
    }
    bt.dDs.d(com.tencent.mm.model.q.GF(), (Map)localObject);
    ad.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", true).commit();
    localObject = new Intent();
    ((Intent)localObject).addFlags(67108864);
    ((Intent)localObject).putExtra("Intro_Switch", true);
    ((Intent)localObject).putExtra("key_transit_to_switch_account", true);
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.mPV.values());
    ((Intent)localObject).putParcelableArrayListExtra("key_switch_account_users", localArrayList);
    com.tencent.mm.plugin.setting.b.ezn.q((Intent)localObject, this);
    finish();
    com.tencent.mm.ui.base.b.gG(this);
  }
  
  private void goBack()
  {
    if ((this.scene == 2) || (this.scene == 1))
    {
      Intent localIntent = com.tencent.mm.plugin.account.a.a.ezn.be(this);
      localIntent.addFlags(67108864);
      localIntent.putExtra("can_finish", true);
      startActivity(localIntent);
      finish();
      com.tencent.mm.ui.base.b.gF(this);
      this.mUc = false;
      return;
    }
    finish();
  }
  
  private static void logout()
  {
    if ((g.DF() != null) && (g.DF().dJs != null)) {
      g.DF().dJs.bD(false);
    }
    g.Eg();
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SettingsSwitchAccountUI", "dklogout User LOGOUT Now uin:%d , clear cookie", new Object[] { Integer.valueOf(com.tencent.mm.kernel.a.Df()) });
    com.tencent.mm.modelstat.c.RT().commitNow();
    r localr = new r(2);
    localr.efX = 1;
    g.DF().a(localr, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsSwitchAccountUI", "errCode %d, errMsg %s, scene %s, this %s", new Object[] { Integer.valueOf(paramInt2), paramString, paraml, this });
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (paraml.getType() == 701)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label419;
      }
      this.mTX.setVisibility(4);
      this.mTY.setVisibility(4);
      localObject1 = this.mPR;
      if (!((SwitchAccountGridView)localObject1).mWa)
      {
        if ((((SwitchAccountGridView)localObject1).mWb == null) && (!bi.oW(((SwitchAccountGridView)localObject1).mVZ)))
        {
          int i = Math.min(2, ((SwitchAccountGridView)localObject1).mWc.size());
          localObject2 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
          ((ValueAnimator)localObject2).addUpdateListener(new SwitchAccountGridView.4((SwitchAccountGridView)localObject1, i));
          ((ValueAnimator)localObject2).setDuration(200L);
          localObject3 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
          ((ValueAnimator)localObject2).addUpdateListener(new SwitchAccountGridView.5((SwitchAccountGridView)localObject1, i));
          ((ValueAnimator)localObject3).setDuration(300L);
          ((SwitchAccountGridView)localObject1).mWb = new AnimatorSet();
          ((SwitchAccountGridView)localObject1).mWb.addListener(new SwitchAccountGridView.6((SwitchAccountGridView)localObject1));
          ((SwitchAccountGridView)localObject1).mWb.playSequentially(new Animator[] { localObject2, localObject3 });
        }
        if (((SwitchAccountGridView)localObject1).mWb != null)
        {
          ((SwitchAccountGridView)localObject1).mWa = true;
          ((SwitchAccountGridView)localObject1).mWb.start();
        }
      }
      com.tencent.mm.kernel.a.unhold();
      com.tencent.mm.platformtools.x.bZ(this);
      if (bt.dDs.IH().size() > 1)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(0), bt.dDs.II() });
        this.mPR.setOnAnimatorEndListener(new SwitchAccountGridView.a()
        {
          public final void btZ()
          {
            String str = at.dBv.I("login_weixin_username", "");
            SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).setLastLoginWxUsername(str);
            SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).setSwitchToWxUsername("");
            SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).bum();
            SettingsSwitchAccountUI.h(SettingsSwitchAccountUI.this).start();
          }
        });
      }
    }
    else
    {
      label344:
      if (paraml.getType() != 255) {
        break label844;
      }
      if (((r)paraml).efY == 2)
      {
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          break label683;
        }
        btW();
      }
    }
    label419:
    label631:
    label644:
    label683:
    label844:
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(0), bt.dDs.II() });
            break;
            this.mPR.setSwitchToWxUsername("");
            this.mUc = false;
            com.tencent.mm.ui.base.h.bA(this, getString(a.i.settings_switch_account_error_tip));
            localObject1 = ((com.tencent.mm.modelsimple.q)paraml).efQ;
            if ((!bi.oW((String)localObject1)) && (this.mPV.containsKey(localObject1)))
            {
              localObject2 = new Intent();
              localObject3 = (com.tencent.mm.plugin.setting.model.SwitchAccountModel)this.mPV.get(localObject1);
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsSwitchAccountUI", "wxID %s, plugSwitch: %d", new Object[] { localObject1, Integer.valueOf(((com.tencent.mm.plugin.setting.model.SwitchAccountModel)localObject3).mOR) });
              if ((((com.tencent.mm.plugin.setting.model.SwitchAccountModel)localObject3).mOR & 0x20000) == 0) {
                break label631;
              }
              ((Intent)localObject2).setClass(this, LoginVoiceUI.class);
            }
            for (;;)
            {
              ((Intent)localObject2).putExtra("switch_login_wx_id", (String)localObject1);
              startActivity((Intent)localObject2);
              finish();
              com.tencent.mm.ui.base.b.gG(this);
              if (bt.dDs.IH().size() <= 1) {
                break label644;
              }
              com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(1), bt.dDs.II() });
              break;
              ((Intent)localObject2).setClass(this, LoginPasswordUI.class);
            }
            com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(1), bt.dDs.II() });
            break label344;
            if ((paramInt2 == -3) && (paramInt1 == 4))
            {
              if (bt.dDs.IH().size() > 1) {
                com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(7), bt.dDs.II() });
              }
              for (;;)
              {
                paramString = new Intent(this.mController.tml, RegByMobileSetPwdUI.class);
                paramString.putExtra("kintent_hint", getString(a.i.regbymobile_reg_setpwd_tip_when_logout));
                startActivityForResult(paramString, 701);
                return;
                com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(7), bt.dDs.II() });
              }
            }
          } while (!com.tencent.mm.plugin.setting.b.ezo.a(this, paramInt1, paramInt2, paramString));
          return;
        } while (paraml.getType() != 282);
        g.Eg();
      } while (!com.tencent.mm.kernel.a.Dw());
      paramString = ((arm)((p)paraml).diG.dIE.dIL).rTP;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsSwitchAccountUI", "logout return");
      if (bi.oW(paramString)) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsSwitchAccountUI", "no pwd ticket is null!");
      }
      paraml = at.dBv.I("login_weixin_username", "");
      bt.dDs.l(paraml, "last_logout_no_pwd_ticket", paramString);
    } while ((this.mUb == null) || (this.mUb.ciq()));
    this.mUb.SO();
    btX();
  }
  
  protected final int getLayoutId()
  {
    return a.g.settings_switch_account;
  }
  
  protected final void initView()
  {
    setMMTitle("");
    cqi();
    getSupportActionBar().hide();
    if (d.fR(23))
    {
      getWindow().setStatusBarColor(getResources().getColor(a.c.navpage));
      cqc();
    }
    this.scene = getIntent().getIntExtra("key_scene", 0);
    this.mTX = findViewById(a.f.switch_account_title_container);
    this.mTY = findViewById(a.f.switch_account_icon);
    this.titleView = ((TextView)findViewById(a.f.switch_account_title));
    this.mTZ = ((TextView)findViewById(a.f.switch_account_del_tip));
    this.mTW = ((TextView)findViewById(a.f.switch_account_delete_btn));
    this.eFH = ((TextView)findViewById(a.f.switch_account_cancel_btn));
    this.mPR = ((SwitchAccountGridView)findViewById(a.f.switch_account_grid));
    this.mPR.setRowCount(1);
    this.mPR.setOnClickAvatarListener(new SwitchAccountGridView.b()
    {
      public final void KY(String paramAnonymousString)
      {
        if (!bi.oW(paramAnonymousString))
        {
          if (SettingsSwitchAccountUI.a(SettingsSwitchAccountUI.this) == 0)
          {
            SettingsSwitchAccountUI.a(SettingsSwitchAccountUI.this, paramAnonymousString);
            return;
          }
          SettingsSwitchAccountUI.b(SettingsSwitchAccountUI.this, paramAnonymousString);
          return;
        }
        ad.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putString("last_switch_account_to_wx_username", "").commit();
        if (SettingsSwitchAccountUI.a(SettingsSwitchAccountUI.this) == 0)
        {
          SettingsSwitchAccountUI.btY();
          return;
        }
        paramAnonymousString = new Intent(SettingsSwitchAccountUI.this, MobileInputUI.class);
        paramAnonymousString.putExtra("mobile_input_purpose", 1);
        paramAnonymousString.putExtra("from_switch_account", true);
        SettingsSwitchAccountUI.this.startActivity(paramAnonymousString);
        com.tencent.mm.ui.base.b.gD(SettingsSwitchAccountUI.this);
      }
    });
    Object localObject1;
    label233:
    String str;
    Object localObject2;
    if (this.scene == 0)
    {
      this.eFH.setOnClickListener(new SettingsSwitchAccountUI.3(this));
      localObject1 = bt.dDs.IH();
      g.Eg();
      if (!com.tencent.mm.kernel.a.Dw()) {
        break label615;
      }
      this.eSe = ((String)g.Ei().DT().get(2, null));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsSwitchAccountUI", "scene %d， lastLoginWxUsername %s", new Object[] { Integer.valueOf(this.scene), this.eSe });
      if ((bi.oW(this.eSe)) || (((Set)localObject1).contains(this.eSe))) {
        break label633;
      }
      if ((this.scene != 2) || (bt.dDs.iN(this.eSe)))
      {
        localObject1 = at.dBv.I("login_user_name", "");
        str = at.dBv.HL();
        localObject2 = at.dBv.I("last_login_use_voice", "");
        localObject1 = new com.tencent.mm.plugin.setting.model.SwitchAccountModel(this.eSe, (String)localObject1, str, "", bi.WU((String)localObject2));
        this.mPV.put(this.eSe, localObject1);
      }
      label372:
      if (this.mPV.size() == 0)
      {
        localObject1 = new Intent(this, MobileInputUI.class);
        ((Intent)localObject1).putExtra("mobile_input_purpose", 1);
        ((Intent)localObject1).putExtra("can_finish", true);
        startActivity((Intent)localObject1);
        finish();
        com.tencent.mm.ui.base.b.gG(this);
      }
      K(this.mPV);
      this.mPR.L(this.mPV);
      if (this.scene != 1) {
        break label790;
      }
      localObject1 = ad.getContext().getSharedPreferences("switch_account_preferences", 0).getString("last_switch_account_to_wx_username", "");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsSwitchAccountUI", "switch to %s", new Object[] { localObject1 });
      if (bi.oW((String)localObject1)) {
        break label743;
      }
      g.Eg();
      if (!com.tencent.mm.kernel.a.Dw()) {
        break label735;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SettingsSwitchAccountUI", "already login ,quit");
      finish();
    }
    for (;;)
    {
      this.mPR.bum();
      btV();
      this.mPR.setOnDeleteAvatarListener(new SettingsSwitchAccountUI.4(this));
      this.mUa = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      this.mUa.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
          SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).setTranslationY(-f * SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).getHeight());
        }
      });
      this.mUa.addListener(new AnimatorListenerAdapter()
      {
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsSwitchAccountUI", "up animation end");
          paramAnonymousAnimator = com.tencent.mm.plugin.account.a.a.ezn.be(SettingsSwitchAccountUI.this);
          paramAnonymousAnimator.addFlags(67108864);
          SettingsSwitchAccountUI.this.startActivity(paramAnonymousAnimator);
          SettingsSwitchAccountUI.this.finish();
          com.tencent.mm.ui.base.b.gF(SettingsSwitchAccountUI.this);
        }
      });
      this.mUa.setDuration(500L);
      return;
      this.eFH.setVisibility(8);
      break;
      label615:
      this.eSe = at.dBv.I("login_weixin_username", "");
      break label233;
      label633:
      if (((Set)localObject1).isEmpty()) {
        break label372;
      }
      localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        str = (String)((Iterator)localObject1).next();
        localObject2 = new com.tencent.mm.plugin.setting.model.SwitchAccountModel(str, bt.dDs.getString(str, "login_user_name"), bt.dDs.getString(str, "last_avatar_path"), bt.dDs.getString(str, "last_logout_no_pwd_ticket"), bi.WU(bt.dDs.getString(str, "last_login_use_voice")));
        this.mPV.put(str, localObject2);
      }
      break label372;
      label735:
      KX((String)localObject1);
      continue;
      label743:
      this.mUc = false;
      localObject1 = new Intent(this, MobileInputUI.class);
      ((Intent)localObject1).putExtra("mobile_input_purpose", 1);
      ((Intent)localObject1).putExtra("from_switch_account", true);
      startActivity((Intent)localObject1);
      com.tencent.mm.ui.base.b.gD(this);
      continue;
      label790:
      if (this.scene == 0) {
        this.mPR.setLastLoginWxUsername(this.eSe);
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 701) && (paramInt2 == -1)) {
      btW();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    super.onResume();
    if ((this.scene == 1) || (this.scene == 2)) {
      g.DF().a(701, this);
    }
    if (this.scene == 0)
    {
      g.DF().a(281, this);
      g.DF().a(282, this);
      g.DF().a(255, this);
    }
    this.mPR.bum();
    btV();
    if ((this.scene == 1) || (this.scene == 2))
    {
      g.Eg();
      if (com.tencent.mm.kernel.a.Dw())
      {
        this.mUc = true;
        Intent localIntent = com.tencent.mm.plugin.account.a.a.ezn.be(this);
        localIntent.addFlags(67108864);
        startActivity(localIntent);
        finish();
        com.tencent.mm.ui.base.b.gF(this);
      }
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    if (this.scene == 1)
    {
      SwitchAccountGridView localSwitchAccountGridView = this.mPR;
      if (localSwitchAccountGridView.mWa)
      {
        localSwitchAccountGridView.mWa = false;
        if (localSwitchAccountGridView.mWb != null) {
          localSwitchAccountGridView.mWb.end();
        }
      }
    }
    g.DF().b(701, this);
    g.DF().b(281, this);
    g.DF().b(282, this);
    g.DF().b(255, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */