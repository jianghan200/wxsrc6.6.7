package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.g.a.lg;
import com.tencent.mm.g.a.lg.b;
import com.tencent.mm.g.a.nd;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.r;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.protocal.c.azw;
import com.tencent.mm.protocal.c.btk;
import com.tencent.mm.protocal.c.oh;
import com.tencent.mm.protocal.c.ot;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.a;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;

@com.tencent.mm.ui.base.a(3)
public class WalletCheckPwdUI
  extends WalletBaseUI
{
  private String bOd;
  private int bQK = 0;
  private TextView eBT;
  private String eTo;
  private ScrollView fPS;
  public EditHintPasswdView kkY;
  private boolean puU = false;
  private LinearLayout puV;
  private ImageView puW;
  private TextView puX;
  private TextView puY;
  private TextView puZ;
  private boolean pva = false;
  private boolean pvb = false;
  private String pvc;
  private int pvd = 0;
  private int pve;
  private String pvf;
  private String pvg;
  private Animation pvh;
  
  private void a(azw paramazw)
  {
    if ((paramazw != null) && (!bi.oW(paramazw.title))) {
      this.puY.setText(paramazw.title);
    }
    if ((paramazw != null) && (!bi.oW(paramazw.scE))) {
      this.puZ.setText(paramazw.scE);
    }
    bQf();
  }
  
  private void bQe()
  {
    x.i("Micromsg.WalletCheckPwdUI", "change mode: %s", new Object[] { Integer.valueOf(this.bQK) });
    if (this.bQK == 1)
    {
      this.puV.setVisibility(0);
      this.kkY.setVisibility(8);
      this.eBT.setText(a.i.wallet_check_mode_pwd);
      Wq();
      if (!bi.oW(this.pvg))
      {
        this.puZ.setText(this.pvg);
        return;
      }
      this.puZ.setText(a.i.wallet_check_pwd_main_content_fp);
      return;
    }
    this.puV.setVisibility(8);
    this.kkY.bqn();
    this.kkY.setVisibility(0);
    this.eBT.setText(a.i.wallet_check_mode_fp);
    cDJ();
    if (!bi.oW(this.pvf))
    {
      this.puZ.setText(this.pvf);
      return;
    }
    this.puZ.setText(a.i.wallet_check_pwd_main_content);
  }
  
  private void bQf()
  {
    c localc = cDK();
    if (localc != null)
    {
      if (!"UnbindProcess".equals(localc.aNK())) {
        break label42;
      }
      this.puY.setText(a.i.wallet_index_ui_unbind_bankcard_title);
      this.puZ.setText(a.i.wallet_check_pwd_tip);
    }
    label42:
    do
    {
      return;
      if ((localc instanceof com.tencent.mm.plugin.wallet_core.b.b))
      {
        this.puY.setText(a.i.wallet_index_ui_bind_card_pref);
        this.puZ.setText(a.i.wallet_check_pwd_tip);
        return;
      }
      if ("ModifyPwdProcess".equals(localc.aNK()))
      {
        this.puY.setText(a.i.wallet_modify_password_title);
        this.puZ.setText(a.i.wallet_check_pwd_tip);
        return;
      }
    } while (!"OfflineProcess".equals(localc.aNK()));
    this.puY.setText(a.i.wallet_check_pwd_open_offline);
    this.puZ.setText(a.i.wallet_check_pwd_tip);
  }
  
  private void bQg()
  {
    com.tencent.mm.plugin.soter.c.a.bFf();
    final lg locallg = new lg();
    locallg.bVz.bQa = this.bOd;
    locallg.bVz.bVB = 1;
    locallg.bVz.bVD = new Runnable()
    {
      public final void run()
      {
        x.i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback");
        lg.b localb = locallg.bVA;
        if (localb == null) {
          x.i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback, result == null");
        }
        boolean bool1;
        label349:
        label355:
        do
        {
          return;
          int i = localb.errCode;
          x.v("Micromsg.WalletCheckPwdUI", "alvinluo errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(i), localb.Yy });
          if (i == 0)
          {
            x.i("Micromsg.WalletCheckPwdUI", "hy: payInfo soterAuthReq: %s", new Object[] { localb.bVE });
            WalletCheckPwdUI.i(WalletCheckPwdUI.this).setVisibility(8);
            WalletCheckPwdUI.b(WalletCheckPwdUI.this, localb.bVE);
            com.tencent.mm.plugin.soter.c.a.xP(0);
            return;
          }
          x.i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
          int j = (int)(System.currentTimeMillis() / 1000L);
          int k = j - WalletCheckPwdUI.j(WalletCheckPwdUI.this);
          if (k > 1)
          {
            WalletCheckPwdUI.b(WalletCheckPwdUI.this, j);
            WalletCheckPwdUI.k(WalletCheckPwdUI.this);
          }
          if ((i == 2) || (i == 10308))
          {
            bool1 = true;
            if (localb.bVF != 2) {
              break label349;
            }
          }
          for (boolean bool2 = true;; bool2 = false)
          {
            x.v("Micromsg.WalletCheckPwdUI", "alvinluo shouldDirectlyFail: %b, mIdentifyFail: %d, errCode: %d, isSoter: %b", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(WalletCheckPwdUI.l(WalletCheckPwdUI.this)), Integer.valueOf(i), Boolean.valueOf(bool2) });
            if (((!bool2) && ((WalletCheckPwdUI.l(WalletCheckPwdUI.this) >= 3) || (k <= 1))) || (bool1)) {
              break label355;
            }
            x.v("Micromsg.WalletCheckPwdUI", "alvinluo fingerprint pay");
            if (WalletCheckPwdUI.m(WalletCheckPwdUI.this) == null) {
              WalletCheckPwdUI.a(WalletCheckPwdUI.this, com.tencent.mm.ui.c.a.gz(WalletCheckPwdUI.this.mController.tml));
            }
            WalletCheckPwdUI.i(WalletCheckPwdUI.this).setVisibility(0);
            WalletCheckPwdUI.i(WalletCheckPwdUI.this).startAnimation(WalletCheckPwdUI.m(WalletCheckPwdUI.this));
            WalletCheckPwdUI.m(WalletCheckPwdUI.this).setFillAfter(true);
            com.tencent.mm.plugin.soter.c.a.xP(1);
            return;
            bool1 = false;
            break;
          }
        } while ((WalletCheckPwdUI.l(WalletCheckPwdUI.this) < 3) && (!bool1));
        x.v("Micromsg.WalletCheckPwdUI", "alvinluo change to pwd pay");
        WalletCheckPwdUI.bQi();
        WalletCheckPwdUI.a(WalletCheckPwdUI.this, 0);
        WalletCheckPwdUI.g(WalletCheckPwdUI.this);
        WalletCheckPwdUI.n(WalletCheckPwdUI.this).setVisibility(8);
        com.tencent.mm.plugin.soter.c.a.xP(2);
      }
    };
    com.tencent.mm.sdk.b.a.sFg.a(locallg, Looper.getMainLooper());
  }
  
  private static void bQh()
  {
    x.i("Micromsg.WalletCheckPwdUI", "hy: send release FPManager");
    nd localnd = new nd();
    com.tencent.mm.sdk.b.a.sFg.m(localnd);
  }
  
  public boolean bND()
  {
    boolean bool = false;
    if (this.sy.getInt("key_pay_flag", 0) != 0) {
      bool = true;
    }
    return bool;
  }
  
  protected final void baT()
  {
    x.d("Micromsg.WalletCheckPwdUI", "check pwd ");
    this.uYO.baT();
  }
  
  public final boolean bbR()
  {
    return this.puU;
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.d("Micromsg.WalletCheckPwdUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof r))
      {
        paramString = this.sy;
        paramString.putString("key_pwd1", this.kkY.getText());
        com.tencent.mm.wallet_core.a.j(this, paramString);
        if (this.kkY != null) {
          this.kkY.bqn();
        }
        finish();
      }
      label473:
      do
      {
        return true;
        if ((paraml instanceof y))
        {
          h.bA(this, getString(a.i.wallet_check_pwd_unbind_success_tip));
          paramString = com.tencent.mm.wallet_core.a.af(this);
          if (paramString != null) {
            paramString.jfZ.putInt("key_process_result_code", -1);
          }
          com.tencent.mm.wallet_core.a.j(this, paramString.jfZ);
          if (this.kkY != null) {
            this.kkY.bqn();
          }
          finish();
          return true;
        }
        if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.a))
        {
          f.Ul(((com.tencent.mm.plugin.wallet_core.c.a)paraml).bOj());
          this.pvc = ((com.tencent.mm.plugin.wallet_core.c.a)paraml).blM();
          setResult(-1);
          a(((oh)((com.tencent.mm.plugin.wallet_core.c.a)paraml).diG.dIE.dIL).rsE);
          ux(0);
          return true;
        }
        if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.b))
        {
          paramString = (com.tencent.mm.plugin.wallet_core.c.b)paraml;
          this.pvc = paramString.piY.token;
          this.bOd = paramString.piY.qUU;
          f.Ul(paramString.piY.qUU);
          if (paramString.piY.rsE != null)
          {
            this.pvf = paramString.piY.rsE.scE;
            this.pvg = paramString.piY.rsE.scF;
          }
          setResult(-1);
          a(paramString.piY.rsE);
          paramString = paramString.piY.rsY;
          if ((paramString != null) && (paramString.rkW != null))
          {
            paraml = (k)g.l(k.class);
            if ((paramString.srh == 1) && (paraml.aNi()) && (paraml.aNh()) && (!paraml.aNc()))
            {
              x.i("Micromsg.WalletCheckPwdUI", "can use touch pay");
              this.bQK = 1;
              if (paramString.rkW != null) {
                com.tencent.mm.plugin.wallet_core.model.s.pqR.jgX = paramString.rkW.cfV();
              }
              paraml = com.tencent.mm.plugin.wallet_core.model.s.pqR;
              if (paramString.rkX != 1) {
                break label473;
              }
            }
          }
          for (boolean bool = true;; bool = false)
          {
            paraml.jgY = bool;
            bQg();
            this.eBT.setVisibility(0);
            bQe();
            ux(0);
            return true;
          }
        }
      } while (!(paraml instanceof com.tencent.mm.plugin.wallet_core.c.s));
      paramString = (com.tencent.mm.plugin.wallet_core.c.s)paraml;
      if (paramString.bOk())
      {
        x.i("Micromsg.WalletCheckPwdUI", "need free sms");
        paraml = new Bundle();
        paraml.putString("key_pwd1", this.eTo);
        paraml.putString("key_jsapi_token", this.pvc);
        paraml.putString("key_relation_key", paramString.pjx);
        paraml.putString("key_mobile", paramString.pjw);
        com.tencent.mm.wallet_core.a.a(this, l.class, paraml, new c.a()
        {
          public final Intent n(int paramAnonymousInt, Bundle paramAnonymousBundle)
          {
            Intent localIntent = new Intent();
            localIntent.putExtra("token", paramAnonymousBundle.getString("key_jsapi_token"));
            localIntent.putExtra("key_process_result_code", paramAnonymousInt);
            localIntent.setClass(WalletCheckPwdUI.this.mController.tml, WalletCheckPwdUI.class);
            localIntent.addFlags(536870912);
            localIntent.putExtra("key_process_is_stay", false);
            return localIntent;
          }
        });
        return true;
      }
      paramString = new Intent();
      paramString.putExtra("token", ((com.tencent.mm.plugin.wallet_core.c.s)paraml).pju);
      setResult(-1, paramString);
      finish();
      return true;
    }
    if (this.kkY != null) {
      this.kkY.bqn();
    }
    if (((paraml instanceof com.tencent.mm.plugin.wallet_core.c.a)) || ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.b)))
    {
      x.i("Micromsg.WalletCheckPwdUI", "check jsapi fail");
      paramString = com.tencent.mm.wallet_core.a.af(this);
      if ((paramString != null) && (paramString.aNK().equals("UnbindProcess")))
      {
        setResult(1);
        paramString.jfZ.putInt("key_process_result_code", 1);
        com.tencent.mm.wallet_core.a.j(this, paramString.jfZ);
        return true;
      }
      setResult(0);
      finish();
      return true;
    }
    return false;
  }
  
  public int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_check_pwd;
  }
  
  protected final void initView()
  {
    bi.K(cDM());
    this.kkY = ((EditHintPasswdView)findViewById(a.f.input_et));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.kkY);
    this.kkY.setOnInputValidListener(new WalletCheckPwdUI.3(this));
    this.fPS = ((ScrollView)findViewById(a.f.wcp_root_view));
    this.puV = ((LinearLayout)findViewById(a.f.finger_print_layout));
    this.puW = ((ImageView)findViewById(a.f.finger_print_icon));
    this.puY = ((TextView)findViewById(a.f.wallet_pwd_title));
    this.puZ = ((TextView)findViewById(a.f.wallet_pwd_content));
    this.puX = ((TextView)findViewById(a.f.finger_print_tips));
    this.eBT = ((TextView)findViewById(a.f.wcp_bottom_link_tv));
    this.eBT.setOnClickListener(new WalletCheckPwdUI.4(this));
    this.kTx = new WalletCheckPwdUI.5(this);
    d(this.kkY, 0, false);
    cDJ();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = -1;
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    cqh();
    paramBundle = getIntent();
    Object localObject;
    if ((paramBundle != null) && (getIntent().hasExtra("scene")))
    {
      i = paramBundle.getIntExtra("scene", -1);
      if (i != 1) {
        break label489;
      }
      this.pva = true;
      x.d("Micromsg.WalletCheckPwdUI", "check pwd jsapi");
      ux(4);
      paramBundle = null;
      if (!this.pvb) {
        break label277;
      }
      localObject = com.tencent.mm.wallet_core.a.af(this);
      if (localObject != null) {
        paramBundle = ((c)localObject).jfZ;
      }
      localObject = paramBundle;
      if (paramBundle != null) {
        break label313;
      }
      x.d("Micromsg.WalletCheckPwdUI", "func[doCheckPayNetscene] process.getContextData null");
      setResult(1);
      finish();
    }
    for (;;)
    {
      initView();
      bQf();
      setBackBtn(new WalletCheckPwdUI.1(this));
      findViewById(a.f.close_button).setOnClickListener(new WalletCheckPwdUI.2(this));
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle = getWindow();
        paramBundle.addFlags(Integer.MIN_VALUE);
        paramBundle.setStatusBarColor(getResources().getColor(a.c.white));
        if (Build.VERSION.SDK_INT >= 23) {
          paramBundle.getDecorView().setSystemUiVisibility(8192);
        }
      }
      this.mController.contentView.setFitsSystemWindows(true);
      return;
      paramBundle = com.tencent.mm.wallet_core.a.af(this);
      if (paramBundle == null) {
        break;
      }
      i = paramBundle.jfZ.getInt("scene", -1);
      if ((i == 1) && ("UnbindProcess".equals(paramBundle.aNK()))) {}
      for (boolean bool = true;; bool = false)
      {
        this.pvb = bool;
        break;
      }
      label277:
      if (getIntent() == null)
      {
        x.d("Micromsg.WalletCheckPwdUI", "func[doCheckPayNetscene] intent null");
        setResult(0);
        finish();
      }
      else
      {
        localObject = getIntent().getExtras();
        label313:
        paramBundle = ((Bundle)localObject).getString("appId");
        String str1 = ((Bundle)localObject).getString("timeStamp");
        String str2 = ((Bundle)localObject).getString("nonceStr");
        String str3 = ((Bundle)localObject).getString("packageExt");
        String str4 = ((Bundle)localObject).getString("signtype");
        String str5 = ((Bundle)localObject).getString("paySignature");
        String str6 = ((Bundle)localObject).getString("url");
        i = ((Bundle)localObject).getInt("pay_channel", 0);
        if (this.pvb) {
          x.i("Micromsg.WalletCheckPwdUI", "appId is null? " + bi.oW(paramBundle));
        }
        for (paramBundle = new com.tencent.mm.plugin.wallet_core.c.a(paramBundle, str1, str2, str3, str4, str5, str6, 10, "verifyWCPayPassword", i);; paramBundle = new com.tencent.mm.plugin.wallet_core.c.b(paramBundle, str1, str2, str3, str4, str5, str6, "verifyWCPayPassword", i))
        {
          a(paramBundle, true, false);
          break;
        }
        label489:
        ux(0);
        this.sy.getBoolean("key_is_expired_bankcard", false);
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    bQh();
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((this.kMk != null) && (this.kMk.isShown()))
    {
      this.kMk.setVisibility(8);
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    js(580);
  }
  
  public void onResume()
  {
    if (this.kkY != null) {
      this.kkY.bqn();
    }
    jr(580);
    super.onResume();
  }
  
  public final void rj(int paramInt)
  {
    if (this.puU) {
      finish();
    }
    while (this.kkY == null) {
      return;
    }
    this.kkY.bqn();
  }
  
  public final void ux(int paramInt)
  {
    this.mController.contentView.setVisibility(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */