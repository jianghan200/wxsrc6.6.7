package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.protocal.c.aju;
import com.tencent.mm.protocal.c.bby;
import com.tencent.mm.protocal.c.ccg;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public class IPCallDialUI
  extends MMActivity
  implements e, b.a
{
  private TextView eCM;
  private String eWQ;
  private DialPad ksT;
  private TextView ksU;
  private EditText ksV;
  private View ksW;
  private ImageButton ksX;
  private View ksY;
  private TextView ksZ;
  private TextView kta;
  private b kvm;
  private String kvn;
  private String kvo;
  private String kvp;
  private String kvq;
  private int kvr = 0;
  private int kvs = 0;
  private int kvt = -1;
  private LinkedList<ccg> kvu;
  com.tencent.mm.plugin.ipcall.a.d.b kvv;
  com.tencent.mm.plugin.ipcall.a.d.c kvw;
  private com.tencent.mm.sdk.b.c kvx = new IPCallDialUI.2(this);
  
  private void aYi()
  {
    x.i("MicroMsg.IPCallDialUI", "modifyCountryCodeByUsder");
    this.kvt = 2;
    if (this.kvs == 1)
    {
      this.kvs = 2;
      return;
    }
    this.kvs = 4;
  }
  
  private void init()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.RECORD_AUDIO", 80, null, null);
    x.i("MicroMsg.IPCallDialUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd() });
    if (!bool) {
      return;
    }
    setMMTitle(R.l.ip_call_dial_title);
    setVolumeControlStream(1);
    this.ksT = ((DialPad)findViewById(R.h.dial_pad));
    this.ksU = ((TextView)findViewById(R.h.country_code_tv));
    this.ksY = findViewById(R.h.country_code_icon_ll);
    this.ksV = ((EditText)findViewById(R.h.phonenumber_tv));
    this.ksW = findViewById(R.h.phonenumber_del_button);
    this.eCM = ((TextView)findViewById(R.h.dial_ui_username_tv));
    this.ksX = ((ImageButton)findViewById(R.h.dial_button));
    this.ksZ = ((TextView)findViewById(R.h.country_name_tv));
    this.kta = ((TextView)findViewById(R.h.dial_free_tv));
    this.kvm = new b(this, this.ksV, this.ksU, this.ksW, this.ksT, this.ksX, this.eCM, this.ksY, this.ksZ, this.kta);
    this.kvm.ksS = this;
    if (!bi.oW(this.kvn)) {
      this.kvm.bx(this.kvn, -1);
    }
    if (!bi.oW(this.kvp)) {
      this.kvm.EW(this.kvp);
    }
    if ((!bi.oW(this.kvn)) && (!bi.oW(this.kvp))) {
      this.kvm.aYa();
    }
    this.kvm.U(this.kvu);
  }
  
  public final void EX(String paramString)
  {
    x.i("MicroMsg.IPCallDialUI", "onModifyCountryCodeByUser:countryCode:%s,mCountryCode:%s", new Object[] { paramString, this.kvp });
    if ((this.kvt != 2) && (this.kvt != -1) && (!this.kvp.equals(paramString))) {
      aYi();
    }
  }
  
  public final void EY(String paramString)
  {
    x.i("MicroMsg.IPCallDialUI", "onModifyPhoneNumberByUser:phoneNumber:%s,mPhoneNumber:%s", new Object[] { paramString, this.kvn });
    if ((this.kvt != 2) && (this.kvt != -1) && (!this.kvn.equals(paramString))) {
      aYi();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.ipcall.a.d.b)) {
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paraml == this.kvv))
      {
        if (this.kvv.kri != null) {
          x.i("MicroMsg.IPCallDialUI", "Response Result:%d,PureNumber:%s,CountryCode:%s", new Object[] { Integer.valueOf(this.kvv.kri.rsj), this.kvv.kri.sei, this.kvv.kri.kAk });
        }
        if (this.kvt == 2) {
          break label397;
        }
        this.kvt = 1;
        this.kvs = 1;
        paramString = this.kvv;
        if ((paramString.kri == null) || (paramString.kri.rsj != 2)) {
          break label143;
        }
        paramInt1 = 1;
        if (paramInt1 == 0) {
          break label148;
        }
        x.i("MicroMsg.IPCallDialUI", "check error show error dialog");
      }
    }
    for (;;)
    {
      return;
      label143:
      paramInt1 = 0;
      break;
      label148:
      paramString = this.kvv;
      if ((paramString.kri != null) && ((paramString.kri.rsj == 1) || (paramString.kri.rsj == 0)))
      {
        paramInt1 = 1;
        if (paramInt1 != 0)
        {
          if ((this.kvv.kri == null) || (bi.oW(this.kvv.kri.kAk))) {
            break label386;
          }
          if (this.kvm != null)
          {
            x.i("MicroMsg.IPCallDialUI", "response country code:%s, old country code:%s", new Object[] { this.kvv.kri.kAk, this.kvp });
            this.kvp = this.kvv.kri.kAk;
            this.kvm.EW(this.kvv.kri.kAk);
          }
        }
      }
      for (;;)
      {
        if ((this.kvv.kri == null) || (bi.oW(this.kvv.kri.sei)) || (this.kvm == null)) {
          break label395;
        }
        x.i("MicroMsg.IPCallDialUI", "response number:%s, old number:%s", new Object[] { this.kvv.kri.sei, this.kvn });
        this.kvn = this.kvv.kri.sei;
        this.kvm.bx(this.kvv.kri.sei, -1);
        return;
        paramInt1 = 0;
        break;
        label386:
        x.i("MicroMsg.IPCallDialUI", "response country code is empty, ignore");
      }
      label395:
      continue;
      label397:
      x.i("MicroMsg.IPCallDialUI", "NetSceneIPCallCheckNumber onSceneEnd, mCheckNumberStatus = userModify, ignore");
      return;
      if ((paraml instanceof com.tencent.mm.plugin.ipcall.a.d.c))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0)) {}
        for (this.kvu = ((com.tencent.mm.plugin.ipcall.a.d.c)paraml).krk.rMv; this.kvm != null; this.kvu = null)
        {
          this.kvm.U(this.kvu);
          return;
        }
      }
    }
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.ip_call_dial_ui;
  }
  
  public final void l(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    x.i("MicroMsg.IPCallDialUI", "onDial, countryCode: %s, phoneNumber: %s, contactId: %s, nickname: %s", new Object[] { paramString1, paramString2, paramString3, paramString4 });
    if (!com.tencent.mm.plugin.ipcall.b.c.dK(this)) {
      return;
    }
    if (com.tencent.mm.plugin.ipcall.a.c.aXb().ru(bi.getInt(paramString1, -1)))
    {
      com.tencent.mm.ui.base.h.b(this, getString(R.l.callout_country_restriction_hint), getString(R.l.callout_country_restriction_hint_title), true);
      com.tencent.mm.plugin.report.service.h.mEJ.k(12058, paramString1);
      return;
    }
    com.tencent.mm.plugin.report.service.h.mEJ.h(12059, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    Intent localIntent = new Intent(this, IPCallTalkUI.class);
    localIntent.putExtra("IPCallTalkUI_contactId", paramString3);
    localIntent.putExtra("IPCallTalkUI_countryCode", paramString1);
    localIntent.putExtra("IPCallTalkUI_nickname", paramString4);
    localIntent.putExtra("IPCallTalkUI_phoneNumber", paramString2);
    localIntent.putExtra("IPCallTalkUI_dialScene", this.kvr);
    localIntent.putExtra("IPCallTalkUI_countryType", this.kvs);
    startActivityForResult(localIntent, 1001);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    b localb = this.kvm;
    x.d("MicroMsg.DialPadController", "onActivityResult");
    if ((paramInt1 == 100) && (paramInt2 == 100))
    {
      str = bi.aG(paramIntent.getStringExtra("country_name"), "");
      paramIntent = bi.aG(paramIntent.getStringExtra("couttry_code"), "");
      x.d("MicroMsg.DialPadController", "onActivityResult, countryName: %s, countryCode: %s", new Object[] { paramIntent, str });
      if ((!bi.oW(paramIntent)) && (!bi.oW(str)))
      {
        localb.ktb = str;
        localb.ktc = ("+" + paramIntent);
        localb.ksU.setText(localb.ktc);
        localb.ktd = b.dr(paramIntent.replace("+", ""), localb.ktd);
        localb.bx(localb.ktd, -1);
        localb.kth = false;
      }
    }
    while ((paramInt1 != 1001) || (paramInt2 != -1))
    {
      String str;
      return;
    }
    paramIntent.getBooleanExtra("IPCallTalkUI_TalkIsOverdue", false);
    localb.bGc.setResult(-1, paramIntent);
    localb.bGc.finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.sFg.b(this.kvx);
    au.DF().a(807, this);
    au.DF().a(746, this);
    getWindow().addFlags(131072);
    setBackBtn(new IPCallDialUI.1(this), R.k.actionbar_quit_webview_icon);
    this.eWQ = getIntent().getStringExtra("IPCallTalkUI_nickname");
    this.kvn = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
    this.kvo = getIntent().getStringExtra("IPCallTalkUI_contactId");
    this.kvp = getIntent().getStringExtra("IPCallTalkUI_countryCode");
    this.kvq = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
    this.kvr = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
    x.i("MicroMsg.IPCallDialUI", "onCreate nickName:%s, phoneNumber:%s, contactId:%s, countryCode:%s, toUserName:%s, dialScene:%d", new Object[] { this.eWQ, this.kvn, this.kvo, this.kvp, this.kvq, Integer.valueOf(this.kvr) });
    if (!bi.oW(this.kvn)) {
      this.kvn = com.tencent.mm.plugin.ipcall.b.c.Fx(this.kvn);
    }
    if (bi.oW(this.kvp))
    {
      if (com.tencent.mm.plugin.ipcall.b.a.Fr(this.kvn))
      {
        if (bi.oW(com.tencent.mm.plugin.ipcall.b.a.Fp(this.kvn))) {
          this.kvn = com.tencent.mm.plugin.ipcall.b.a.Fs(this.kvn);
        }
      }
      else {
        this.kvp = com.tencent.mm.plugin.ipcall.b.c.aYB();
      }
    }
    else
    {
      if (this.kvr == 1) {
        break label451;
      }
      this.kvt = 0;
      this.kvs = 3;
      this.kvv = new com.tencent.mm.plugin.ipcall.a.d.b(this.kvn, this.kvp, "", bi.fS(this), this.kvr);
      au.DF().a(this.kvv, 0);
    }
    for (;;)
    {
      init();
      return;
      x.i("MicroMsg.IPCallDialUI", "country code exist, directly go to talk ui.");
      this.kvs = 4;
      paramBundle = new Intent(this, IPCallTalkUI.class);
      paramBundle.putExtra("IPCallTalkUI_contactId", this.kvo);
      paramBundle.putExtra("IPCallTalkUI_countryCode", this.kvp);
      paramBundle.putExtra("IPCallTalkUI_nickname", this.eWQ);
      paramBundle.putExtra("IPCallTalkUI_phoneNumber", this.kvn);
      paramBundle.putExtra("IPCallTalkUI_dialScene", this.kvr);
      paramBundle.putExtra("IPCallTalkUI_countryType", this.kvs);
      startActivityForResult(paramBundle, 1001);
      finish();
      return;
      label451:
      this.kvt = -1;
      this.kvs = 4;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.kvm != null) {
      this.kvm.ksS = null;
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.kvx);
    au.DF().b(807, this);
    au.DF().b(746, this);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.IPCallDialUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
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
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_microphone_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new IPCallDialUI.3(this), new IPCallDialUI.4(this));
  }
  
  protected void onResume()
  {
    x.d("MicroMsg.IPCallDialUI", "onResume");
    super.onResume();
  }
  
  public void onStart()
  {
    super.onStart();
    this.kvw = new com.tencent.mm.plugin.ipcall.a.d.c();
    au.DF().a(this.kvw, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallDialUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */