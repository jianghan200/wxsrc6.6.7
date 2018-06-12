package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.account.a.e;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI;
import com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI;
import com.tencent.mm.plugin.account.friend.a.ad;
import com.tencent.mm.plugin.account.friend.a.t.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.aif;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.u.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import java.io.File;
import java.util.LinkedList;
import java.util.Map;

public class RegSetInfoUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private String bgn;
  private String eHp;
  private ProgressDialog eHw = null;
  private SecurityImage eIX = null;
  private com.tencent.mm.platformtools.d eRi;
  private String eSE;
  private int eTq;
  private int eTw;
  private boolean eUM = false;
  private EditText eVq;
  private View eWA;
  private TextView eWB;
  private String eWC = null;
  private boolean eWD = false;
  private com.tencent.mm.ui.base.o eWE;
  private View eWF;
  private boolean eWG = false;
  private String eWH;
  private al eWI = new al(Looper.myLooper(), new RegSetInfoUI.1(this), true);
  private EditText eWj;
  private Button eWk;
  private String eWl;
  private String eWm;
  private int eWn;
  private String eWo;
  private String eWp;
  private TextView eWq;
  private View eWr;
  private boolean eWs = false;
  private ImageView eWt;
  private int eWu = 3;
  private LinkedList<String> eWv = new LinkedList();
  private ImageView eWw;
  private ProgressBar eWx;
  private String eWy = "";
  private ImageView eWz;
  private int sceneType = 0;
  
  private void WL()
  {
    YC();
    if (Zi()) {
      h.a(this, getString(a.j.regsetinfo_reverify), "", new RegSetInfoUI.21(this), new RegSetInfoUI.22(this));
    }
    while (Zj()) {
      return;
    }
    if (this.sceneType == 0) {}
    for (int i = 1; i != 0; i = 0)
    {
      h.a(this, getString(a.j.regsetinfo_regqq_remind), "", new RegSetInfoUI.24(this), new RegSetInfoUI.25(this));
      return;
    }
    if (Zl())
    {
      h.a(this, getString(a.j.regsetinfo_regqq_remind), "", new RegSetInfoUI.26(this), new RegSetInfoUI.27(this));
      return;
    }
    com.tencent.mm.plugin.c.a.pU("R200_100");
    Intent localIntent = new Intent(this, MobileInputUI.class);
    localIntent.putExtra("mobile_input_purpose", 2);
    localIntent.addFlags(67108864);
    startActivity(localIntent);
    finish();
  }
  
  private void Zd()
  {
    int j = Zm();
    g.DF().a(126, this);
    int i;
    com.tencent.mm.modelsimple.s locals;
    if (Zh()) {
      if ((this.eWv == null) || (this.eWv.size() == 0))
      {
        i = 0;
        locals = new com.tencent.mm.modelsimple.s("", this.eWo, this.bgn, this.eWn, this.eWm, this.eWl, "", "", this.eHp, j, this.eWH, "", "", this.eWs, this.eUM);
        ((u.a)locals.dJM.KV()).qWY.rYY = i;
      }
    }
    for (;;)
    {
      locals.mX(this.eSE);
      locals.im(this.eTq);
      g.DF().a(locals, 0);
      getString(a.j.app_tip);
      this.eHw = h.a(this, getString(a.j.regbyqq_reg_waiting), true, new RegSetInfoUI.7(this, locals));
      return;
      if (this.eWv.contains(this.eWH))
      {
        i = 1;
        break;
      }
      i = 2;
      break;
      locals = new com.tencent.mm.modelsimple.s("", this.eWo, this.bgn, this.eWn, this.eWm, this.eWl, "", "", this.eHp, j, "", "", "", this.eWs, this.eUM);
    }
  }
  
  private boolean Ze()
  {
    return (this.eWw.getVisibility() == 8) || (this.eWD);
  }
  
  private void Zf()
  {
    String str = this.eVq.getText().toString().trim();
    Button localButton = this.eWk;
    if (!bi.oW(str)) {}
    for (boolean bool = true;; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }
  
  private boolean Zg()
  {
    return (this.eWu & 0x1) > 0;
  }
  
  private boolean Zh()
  {
    return (this.eWu & 0x2) > 0;
  }
  
  private boolean Zi()
  {
    return this.sceneType == 1;
  }
  
  private boolean Zj()
  {
    return this.sceneType == 2;
  }
  
  private boolean Zk()
  {
    return this.sceneType == 4;
  }
  
  private boolean Zl()
  {
    return this.sceneType == 3;
  }
  
  private int Zm()
  {
    int j = 2;
    int i;
    if (Zi()) {
      i = 4;
    }
    do
    {
      do
      {
        return i;
        i = j;
      } while (Zj());
      if (Zl()) {
        return 6;
      }
      i = j;
    } while (!Zk());
    return 1;
  }
  
  private String Zn()
  {
    if ((Zi()) || (Zk())) {
      return this.eWl;
    }
    if (Zl()) {
      return this.eWm;
    }
    return this.eWp;
  }
  
  private boolean e(int paramInt1, int paramInt2, String paramString)
  {
    Object localObject = new com.tencent.mm.platformtools.ah(paramInt1, paramInt2, paramString);
    if (this.eRi.a(this, (com.tencent.mm.platformtools.ah)localObject)) {
      return true;
    }
    if (com.tencent.mm.plugin.account.a.a.ezo.a(this.mController.tml, paramInt1, paramInt2, paramString)) {
      return true;
    }
    switch (paramInt2)
    {
    default: 
      return false;
    case -10: 
    case -7: 
      h.i(this, a.j.reg_username_exist_tip, a.j.reg_username_exist_title);
      return true;
    case -75: 
      h.i(this, a.j.alpha_version_tip_reg, a.j.reg_username_exist_title);
      return true;
    case -100: 
      com.tencent.mm.kernel.a.hold();
      localObject = this.mController.tml;
      g.Eg();
      if (TextUtils.isEmpty(com.tencent.mm.kernel.a.Dh())) {}
      for (paramString = com.tencent.mm.bp.a.af(this.mController.tml, a.j.main_err_another_place);; paramString = com.tencent.mm.kernel.a.Dh())
      {
        h.a((Context)localObject, paramString, this.mController.tml.getString(a.j.app_tip), new RegSetInfoUI.19(this), new RegSetInfoUI.20(this));
        return true;
        g.Eg();
      }
    }
    paramString = com.tencent.mm.h.a.eV(paramString);
    if (paramString != null) {
      paramString.a(this, null, null);
    }
    for (;;)
    {
      return true;
      h.b(this, getString(a.j.regsetinfo_ticket_notfound), "", true);
    }
  }
  
  private void o(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool2 = false;
    if (bi.oW(this.eWj.getText().toString().trim())) {
      paramBoolean1 = false;
    }
    ImageView localImageView = this.eWw;
    if (paramBoolean2)
    {
      i = a.e.signup_error;
      localImageView.setImageResource(i);
      localImageView = this.eWw;
      if (!paramBoolean1) {
        break label95;
      }
    }
    label95:
    for (int i = 0;; i = 8)
    {
      localImageView.setVisibility(i);
      boolean bool1 = bool2;
      if (paramBoolean1)
      {
        bool1 = bool2;
        if (paramBoolean2) {
          bool1 = true;
        }
      }
      this.eWD = bool1;
      return;
      i = a.e.signup_choose;
      break;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MiroMsg.RegSetInfoUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    String str2;
    String str1;
    int i;
    String str3;
    Object localObject1;
    Object localObject2;
    boolean bool2;
    boolean bool1;
    Object localObject3;
    if (paraml.getType() == 126)
    {
      g.DF().b(126, this);
      if (this.eHw != null)
      {
        this.eHw.dismiss();
        this.eHw = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.eWC = null;
        str2 = Zn();
        str1 = ((com.tencent.mm.modelsimple.s)paraml).Rp();
        i = ((com.tencent.mm.modelsimple.s)paraml).Rq();
        str3 = ((com.tencent.mm.modelsimple.s)paraml).Rr();
        localObject1 = null;
        localObject2 = null;
        bool2 = false;
        bool1 = false;
        Map localMap = bl.z(str3, "wording");
        if (localMap == null) {
          break label1563;
        }
        localObject3 = (String)localMap.get(".wording.switch");
        if (!bi.oW((String)localObject3)) {
          break label542;
        }
        bool1 = true;
        bool2 = bool1;
        if (!bool1) {
          break label1563;
        }
        localObject3 = (String)localMap.get(".wording.title");
        if (!bi.oW((String)localObject3)) {
          localObject1 = localObject3;
        }
        localObject3 = (String)localMap.get(".wording.desc");
        if (bi.oW((String)localObject3)) {
          break label1560;
        }
        localObject2 = localObject3;
      }
    }
    for (;;)
    {
      x.d("MiroMsg.RegSetInfoUI", "mShowStyleContactUploadWordings , %s", new Object[] { str3 });
      com.tencent.mm.kernel.a.unhold();
      com.tencent.mm.kernel.a.bt(true);
      if (this.eUM)
      {
        localObject3 = com.tencent.mm.compatible.util.e.dgs + "temp.avatar";
        str3 = com.tencent.mm.compatible.util.e.dgs + "temp.avatar.hd";
        new File((String)localObject3).renameTo(new File(str3));
        com.tencent.mm.a.e.deleteFile((String)localObject3);
        c.c(str3, 96, 96, Bitmap.CompressFormat.JPEG, 90, (String)localObject3);
        new com.tencent.mm.aa.o(this, com.tencent.mm.compatible.util.e.dgs + "temp.avatar").a(new RegSetInfoUI.8(this, paraml, str2, str1, bool1, (String)localObject1, (String)localObject2, i), new RegSetInfoUI.9(this, paraml, str2, str1, bool1, (String)localObject1, (String)localObject2, i));
        label449:
        if ((paramInt2 != -6) && (paramInt2 != 65225) && (paramInt2 != 65226)) {
          break label905;
        }
        if (this.eIX != null) {
          break label878;
        }
        this.eIX = SecurityImage.a.a(this.mController.tml, a.j.regbyqq_secimg_title, 0, ((com.tencent.mm.modelsimple.s)paraml).Rf(), ((com.tencent.mm.modelsimple.s)paraml).Re(), "", new RegSetInfoUI.10(this, paraml), null, new RegSetInfoUI.11(this), new RegSetInfoUI.13(this, paraml));
      }
      label542:
      label878:
      label905:
      do
      {
        do
        {
          do
          {
            return;
            int j = bi.WU((String)localObject3);
            if (j == 0)
            {
              bool1 = false;
              break;
            }
            if (j != 1) {
              break;
            }
            bool1 = true;
            break;
            this.eHp = ((com.tencent.mm.modelsimple.s)paraml).Rn();
            at.dBv.T("login_user_name", str2);
            if ((str1 != null) && (str1.contains("0")))
            {
              com.tencent.mm.plugin.c.a.pU("R300_100_phone");
              if (!bool1) {}
              for (localObject1 = new Intent(this, FindMContactIntroUI.class);; localObject1 = localObject3)
              {
                ((Intent)localObject1).addFlags(67108864);
                ((Intent)localObject1).putExtra("regsetinfo_ticket", this.eHp);
                ((Intent)localObject1).putExtra("regsetinfo_NextStep", str1);
                ((Intent)localObject1).putExtra("regsetinfo_NextStyle", i);
                localObject2 = com.tencent.mm.plugin.account.a.a.ezn.be(this);
                ((Intent)localObject2).addFlags(67108864);
                ((Intent)localObject2).putExtra("LauncherUI.enter_from_reg", true);
                MMWizardActivity.b(this, (Intent)localObject1, (Intent)localObject2);
                finish();
                break;
                localObject3 = new Intent(this, FindMContactAlertUI.class);
                ((Intent)localObject3).putExtra("alert_title", (String)localObject1);
                ((Intent)localObject3).putExtra("alert_message", (String)localObject2);
              }
            }
            localObject1 = com.tencent.mm.plugin.account.a.a.ezn.be(this);
            ((Intent)localObject1).addFlags(67108864);
            ((Intent)localObject1).putExtra("LauncherUI.enter_from_reg", true);
            startActivity((Intent)localObject1);
            localObject1 = new StringBuilder();
            g.Eg();
            localObject1 = ((StringBuilder)localObject1).append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_900_phone,");
            g.Eg();
            com.tencent.mm.plugin.c.a.pV(com.tencent.mm.kernel.a.gd("R200_900_phone") + ",4");
            finish();
            break label449;
            this.eIX.a(0, ((com.tencent.mm.modelsimple.s)paraml).Rf(), ((com.tencent.mm.modelsimple.s)paraml).Re(), "");
            return;
            localObject1 = com.tencent.mm.h.a.eV(paramString);
            if (localObject1 != null)
            {
              ((com.tencent.mm.h.a)localObject1).a(this, null, null);
              return;
            }
          } while (e(paramInt1, paramInt2, paramString));
          if (paraml.getType() == 429)
          {
            g.DF().b(429, this);
            if (this.eHw != null)
            {
              this.eHw.dismiss();
              this.eHw = null;
            }
            this.eWx.setVisibility(8);
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              this.eWC = null;
              paramInt1 = ((t.b)((ad)paraml).dJM.Id()).eKD.rLc;
              x.d("MiroMsg.RegSetInfoUI", "UsernameRet %d", new Object[] { Integer.valueOf(paramInt1) });
              if ((paramInt1 == -14) || (paramInt1 == -10) || (paramInt1 == -7))
              {
                paraml = ((t.b)((ad)paraml).dJM.Id()).eKD.hbG;
                paramString = com.tencent.mm.h.a.eV(paramString);
                if (paramString != null) {
                  this.eWq.setText(paramString.desc);
                }
                this.eWv.clear();
                if ((paraml != null) && (paraml.size() > 0))
                {
                  if (paraml.size() > 3) {}
                  for (paramInt1 = 3;; paramInt1 = paraml.size())
                  {
                    paramString = new String[paramInt1];
                    paramInt2 = 0;
                    while (paramInt2 < paramInt1)
                    {
                      paramString[paramInt2] = ((bhz)paraml.get(paramInt2)).siM;
                      this.eWv.add(paramString[paramInt2]);
                      paramInt2 += 1;
                    }
                  }
                  if (this.eWG)
                  {
                    if (this.eWE != null)
                    {
                      this.eWE.dismiss();
                      this.eWE = null;
                    }
                    this.eWE = p.a(this, this.eWF, paramString, new RegSetInfoUI.18(this, paramString));
                  }
                }
                o(true, true);
                return;
              }
              if (bi.oW(this.eWj.getText().toString().trim()))
              {
                o(false, false);
                return;
              }
              o(true, false);
              this.eWq.setText(getString(a.j.regsetinfo_tip));
              if (this.eWE != null)
              {
                this.eWE.dismiss();
                this.eWE = null;
              }
              this.eWj.postDelayed(new RegSetInfoUI.14(this), 50L);
              return;
            }
            if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
            {
              if (this.eIX == null)
              {
                this.eIX = SecurityImage.a.a(this.mController.tml, a.j.regbyqq_secimg_title, 0, ((ad)paraml).Rf(), ((ad)paraml).Re(), "", new RegSetInfoUI.15(this, paraml), null, new RegSetInfoUI.16(this), new RegSetInfoUI.17(this, paraml));
                return;
              }
              this.eIX.a(0, ((ad)paraml).Rf(), ((ad)paraml).Re(), "");
              return;
            }
            o(true, true);
          }
        } while (e(paramInt1, paramInt2, paramString));
        if (paramInt1 == 8)
        {
          this.eWC = getString(a.j.fmt_http_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          Toast.makeText(this, this.eWC, 0).show();
          return;
        }
      } while ((paramInt1 == 0) && (paramInt2 == 0));
      Toast.makeText(this, getString(a.j.fmt_reg_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      return;
      label1560:
      continue;
      label1563:
      localObject1 = null;
      bool1 = bool2;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.regbyqq_setinfo;
  }
  
  protected final void initView()
  {
    int j = 0;
    this.eWF = findViewById(a.f.popup_anchor);
    this.eWA = findViewById(a.f.setinfo_avatar_ly);
    this.eWt = ((ImageView)findViewById(a.f.setinfo_avatar));
    this.eVq = ((EditText)findViewById(a.f.reg_nick));
    this.eWB = ((TextView)findViewById(a.f.setinfo_tip));
    this.eWj = ((EditText)findViewById(a.f.reg_wechatid));
    this.eWq = ((TextView)findViewById(a.f.alias_tip));
    this.eWr = findViewById(a.f.regsetinfo_wid);
    this.eWw = ((ImageView)findViewById(a.f.wechaid_iv));
    this.eWx = ((ProgressBar)findViewById(a.f.progressBar));
    this.eWz = ((ImageView)findViewById(a.f.setinfo_camera));
    this.eWk = ((Button)findViewById(a.f.next_btn));
    this.eWw.setVisibility(8);
    this.eWx.setVisibility(8);
    this.eWz.setVisibility(8);
    this.eUM = false;
    this.eWD = false;
    Object localObject = this.eWA;
    int i;
    if (Zg())
    {
      i = 0;
      ((View)localObject).setVisibility(i);
      localObject = this.eWr;
      if (!Zh()) {
        break label479;
      }
      i = 0;
      label231:
      ((View)localObject).setVisibility(i);
      localObject = this.eWq;
      if (!Zh()) {
        break label485;
      }
      i = j;
      label250:
      ((TextView)localObject).setVisibility(i);
      if ((!Zg()) || (!Zh())) {
        break label491;
      }
      this.eWB.setText(getString(a.j.regsetinfo_settip4));
    }
    for (;;)
    {
      g.Em().a(new RegSetInfoUI.23(this));
      this.eVq.addTextChangedListener(new RegSetInfoUI.28(this));
      this.eWk.setOnClickListener(new RegSetInfoUI.29(this));
      this.eWj.setOnFocusChangeListener(new View.OnFocusChangeListener()
      {
        public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
        {
          if (paramAnonymousBoolean)
          {
            RegSetInfoUI.q(RegSetInfoUI.this);
            RegSetInfoUI.m(RegSetInfoUI.this).J(200L, 200L);
          }
        }
      });
      this.eWj.addTextChangedListener(new RegSetInfoUI.31(this));
      setBackBtn(new RegSetInfoUI.32(this));
      this.eVq.setOnEditorActionListener(new RegSetInfoUI.33(this));
      this.eVq.setOnKeyListener(new RegSetInfoUI.2(this));
      this.eWj.setOnEditorActionListener(new RegSetInfoUI.3(this));
      this.eWj.setOnKeyListener(new RegSetInfoUI.4(this));
      this.eWt.setOnClickListener(new RegSetInfoUI.5(this));
      localObject = new File(com.tencent.mm.compatible.util.e.dgs);
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdir();
      }
      Zf();
      return;
      i = 8;
      break;
      label479:
      i = 8;
      break label231;
      label485:
      i = 8;
      break label250;
      label491:
      if ((Zg()) && (!Zh())) {
        this.eWB.setText(getString(a.j.regsetinfo_settip2));
      } else if ((!Zg()) && (Zh())) {
        this.eWB.setText(getString(a.j.regsetinfo_settip3));
      } else {
        this.eWB.setText(getString(a.j.regsetinfo_settip1));
      }
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MiroMsg.RegSetInfoUI", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramIntent != null) && (paramInt1 == 300))
    {
      paramIntent = paramIntent.getBundleExtra("result_data");
      if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("birthdayComfirmOK"))) {
        Zd();
      }
    }
    do
    {
      return;
      paramIntent = com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramIntent);
    } while (paramIntent == null);
    this.eWt.setImageBitmap(paramIntent);
    this.eUM = true;
    this.eWz.setVisibility(0);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getString(a.j.regsetinfo_title);
    if (com.tencent.mm.protocal.d.qVQ) {
      paramBundle = getString(a.j.app_name) + getString(a.j.alpha_version_alpha);
    }
    setMMTitle(paramBundle);
    com.tencent.mm.plugin.account.a.a.ezo.vo();
    this.eWl = getIntent().getStringExtra("regsetinfo_user");
    this.eWm = getIntent().getStringExtra("regsetinfo_bind_email");
    this.eHp = getIntent().getStringExtra("regsetinfo_ticket");
    this.eWo = getIntent().getStringExtra("regsetinfo_pwd");
    this.eWp = getIntent().getStringExtra("regsetinfo_binduin");
    this.eTq = getIntent().getIntExtra("mobile_check_type", 0);
    if (!bi.oW(this.eWp)) {
      this.eWn = com.tencent.mm.a.o.cx(this.eWp);
    }
    this.sceneType = getIntent().getExtras().getInt("regsetinfo_ismobile", 0);
    this.eWs = getIntent().getExtras().getBoolean("regsetinfo_isForce", false);
    this.eWu = getIntent().getIntExtra("regsetinfo_NextControl", 3);
    this.eSE = getIntent().getStringExtra("regsession_id");
    this.eTw = getIntent().getIntExtra("key_reg_style", 1);
    initView();
    if (this.sceneType == 1)
    {
      paramBundle = new StringBuilder();
      g.Eg();
      paramBundle = paramBundle.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_900_phone,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R200_900_phone") + ",1");
      com.tencent.mm.plugin.c.a.pT("R200_900_phone");
    }
    for (;;)
    {
      this.eWG = false;
      this.eRi = new com.tencent.mm.platformtools.d();
      return;
      if (this.sceneType == 2)
      {
        paramBundle = new StringBuilder();
        g.Eg();
        paramBundle = paramBundle.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R4_QQ,");
        g.Eg();
        com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R4_QQ") + ",1");
        com.tencent.mm.plugin.c.a.pT("R4_QQ");
      }
      else if (this.sceneType == 3)
      {
        paramBundle = new StringBuilder();
        g.Eg();
        paramBundle = paramBundle.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_900_email,");
        g.Eg();
        com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R200_900_email") + ",1");
        com.tencent.mm.plugin.c.a.pT("R200_900_email");
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    StringBuilder localStringBuilder;
    if (this.sceneType == 1)
    {
      localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_900_phone,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R200_900_phone") + ",2");
    }
    for (;;)
    {
      if (this.eRi != null) {
        this.eRi.close();
      }
      return;
      if (this.sceneType == 2)
      {
        localStringBuilder = new StringBuilder();
        g.Eg();
        localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R4_QQ,");
        g.Eg();
        com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R4_QQ") + ",2");
      }
      else if (this.sceneType == 3)
      {
        localStringBuilder = new StringBuilder();
        g.Eg();
        localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_900_email,");
        g.Eg();
        com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R200_900_email") + ",2");
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      WL();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onResume()
  {
    super.onResume();
    this.eVq.postDelayed(new RegSetInfoUI.12(this), 500L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/ui/RegSetInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */