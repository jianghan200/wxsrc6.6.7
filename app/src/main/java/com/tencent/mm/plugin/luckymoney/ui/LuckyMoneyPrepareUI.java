package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.pl;
import com.tencent.mm.plugin.luckymoney.b.ae;
import com.tencent.mm.plugin.luckymoney.b.ai;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.luckymoney.b.v;
import com.tencent.mm.plugin.luckymoney.b.y;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.snackbar.b;
import com.tencent.mm.wallet_core.c.u;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.util.Map;

@com.tencent.mm.ui.base.a(19)
public class LuckyMoneyPrepareUI
  extends LuckyMoneyBaseUI
  implements f
{
  private al eVk = null;
  private Dialog eXG = null;
  private TextView hXQ = null;
  private TextView hXT;
  private int hop;
  private Button iqN = null;
  private com.tencent.mm.plugin.luckymoney.b.d kLu;
  private LuckyMoneyNumInputView kMf = null;
  private LuckyMoneyTextInputView kMh = null;
  private Button kMi = null;
  protected View kMk;
  private MMScrollView kMm;
  private TextView kMn;
  private a kMp = new a();
  private LuckyMoneyMoneyInputView kTn = null;
  private View kTo;
  private View kTp;
  private ViewGroup kTq;
  private int kTr;
  private String kTs;
  private int kTt;
  private boolean kTu;
  private String kTv;
  private int kTw;
  private String kUn;
  private int kWP = 1;
  private String kWQ = com.tencent.mm.wallet_core.ui.e.abX("CNY");
  private String kWR = null;
  private RealnameGuideHelper kWS;
  private String kWT;
  private com.tencent.mm.ui.widget.c kWU;
  private boolean kWV = false;
  private com.tencent.mm.sdk.b.c<pl> kWW = new LuckyMoneyPrepareUI.12(this);
  protected MyKeyboardWindow mKeyboard;
  private int mType;
  
  private void Gg(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "do business callback");
    b(new v(this.kUn, paramString, this.kWT), false);
  }
  
  private int bbh()
  {
    if (this.kTu)
    {
      if (getIntent().getIntExtra("key_chatroom_num", 0) > 0) {
        return 2;
      }
      return 1;
    }
    return 3;
  }
  
  private void c(double paramDouble, String paramString)
  {
    if (bi.oW(paramString))
    {
      this.hXQ.setText(com.tencent.mm.wallet_core.ui.e.B(paramDouble));
      return;
    }
    this.hXQ.setText(paramString + com.tencent.mm.wallet_core.ui.e.A(paramDouble));
  }
  
  private void dD(String paramString1, String paramString2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "initH5LuckyMoneyView  currencyWording=" + paramString1);
    TextView localTextView = (TextView)findViewById(a.f.lucky_money_amount_unit_title);
    if (!bi.oW(paramString1)) {
      localTextView.setText(paramString1);
    }
    while (!bi.oW(paramString2))
    {
      c(0.0D, paramString2);
      return;
      localTextView.setText(getString(a.i.lucky_money_amount_unit_title));
    }
    c(0.0D, com.tencent.mm.wallet_core.ui.e.abX("CNY"));
  }
  
  protected final void Wq()
  {
    if ((this.kMk != null) && (this.kMk.isShown())) {
      this.kMk.setVisibility(8);
    }
  }
  
  public final void baD()
  {
    com.tencent.mm.plugin.luckymoney.a.a.bat();
    this.kLu = com.tencent.mm.plugin.luckymoney.a.a.bau().baS();
    int i;
    double d2;
    double d1;
    if ((this.kTn.baC() != 3) && (this.kMf.baC() != 3))
    {
      i = this.kMf.getInput();
      d2 = this.kTn.getInput();
      if (this.mType == 0)
      {
        d2 *= i;
        d1 = this.kTn.getInput();
      }
    }
    for (;;)
    {
      if (this.kMp.bbv())
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "has error");
        this.kMi.setClickable(false);
        this.kMi.setEnabled(false);
        c(d2, this.kWQ);
        return;
        if (i > 0) {
          d1 = this.kTn.getInput() / i;
        }
      }
      else
      {
        boolean bool2;
        if ((d2 == 0.0D) || (d1 == 0.0D)) {
          bool2 = true;
        }
        for (;;)
        {
          boolean bool1;
          if (bool2)
          {
            this.kMi.setClickable(false);
            this.kMi.setEnabled(false);
            break;
            if ((d2 > this.kLu.kKT) && (this.kLu.kKT > 0.0D))
            {
              this.kMp.tn(getString(a.i.lucky_money_total_amount_max_limit_tips, new Object[] { Math.round(this.kLu.kKT), bi.aG(this.kLu.kKW, "") }));
              bool2 = true;
              continue;
            }
            if (d1 <= 0.0D) {
              break label733;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "perAmount " + d1);
            if (this.mType == 0)
            {
              if ((d1 <= this.kLu.kKR) || (this.kLu.kKR <= 0.0D)) {
                break label727;
              }
              this.kMp.tn(getString(a.i.lucky_money_per_amount_max_limit_tips, new Object[] { Math.round(this.kLu.kKR), bi.aG(this.kLu.kKW, "") }));
              bool1 = true;
            }
          }
          for (;;)
          {
            label389:
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "furtherCheckHasErr:" + bool1 + " for max value");
            bool2 = bool1;
            if (!bool1)
            {
              if (this.mType != 0) {
                break label636;
              }
              bool2 = bool1;
              if (d1 < this.kLu.kKS)
              {
                this.kMp.tn(getString(a.i.lucky_money_per_amount_min_limit_tips, new Object[] { com.tencent.mm.wallet_core.ui.e.A(this.kLu.kKS), bi.aG(this.kLu.kKW, "") }));
                bool2 = true;
              }
            }
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "furtherCheckHasErr:" + bool2 + " for min value");
              break;
              if ((d1 <= this.kLu.kKU) || (this.kLu.kKU <= 0.0D)) {
                break label727;
              }
              this.kMp.tn(getString(a.i.lucky_money_per_amount_max_limit_tips, new Object[] { Math.round(this.kLu.kKU), bi.aG(this.kLu.kKW, "") }));
              this.kMf.onError();
              this.kTn.onError();
              bool1 = true;
              break label389;
              label636:
              bool2 = bool1;
              if (d1 < 0.01D)
              {
                this.kMp.tn(getString(a.i.lucky_money_per_amount_min_limit_tips, new Object[] { "0.01", bi.aG(this.kLu.kKW, "") }));
                this.kMf.onError();
                this.kTn.onError();
                bool2 = true;
              }
            }
            this.kMi.setClickable(true);
            this.kMi.setEnabled(true);
            break;
            label727:
            bool1 = false;
          }
          label733:
          bool2 = false;
        }
      }
      d1 = 0.0D;
      continue;
      d1 = 0.0D;
      d2 = 0.0D;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " scenetype:" + paraml.getType());
    if ((paraml instanceof ae))
    {
      if ((this.eXG != null) && (this.eXG.isShowing())) {
        this.eXG.dismiss();
      }
      if (this.kWV)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "has show alert return");
        return true;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (ae)paraml;
        this.kTt = paramString.hUg;
        this.kTs = paramString.kLZ;
        this.kTv = paramString.kRr;
        this.kUn = paramString.kLZ;
        this.kWT = paramString.kRx;
        paraml = new PayInfo();
        paraml.bOd = paramString.kRq;
        paraml.bVY = 37;
        paraml.bVU = this.kTw;
        com.tencent.mm.pluginsdk.wallet.h.a(this, paraml, 1);
        return true;
      }
      if (paramInt2 == 401)
      {
        this.kMi.setEnabled(false);
        this.kMi.setClickable(false);
        this.eVk.J(5000L, 5000L);
        com.tencent.mm.ui.base.h.bA(this, paramString);
        return true;
      }
      paraml = paramString;
      if (TextUtils.isEmpty(paramString)) {
        paraml = getString(a.i.wallet_unknown_err);
      }
      com.tencent.mm.ui.base.h.a(this, paraml, null, false, new LuckyMoneyPrepareUI.10(this));
      return true;
    }
    if ((paraml instanceof com.tencent.mm.plugin.luckymoney.b.ah))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (this.kTu)
        {
          b.h(this, getString(a.i.has_send));
          com.tencent.mm.sdk.platformtools.ah.i(new LuckyMoneyPrepareUI.13(this), 1800L);
        }
        for (;;)
        {
          return true;
          bbq();
          this.kTp.setVisibility(0);
          this.kTp.postDelayed(new LuckyMoneyPrepareUI.14(this), 1000L);
        }
      }
      if (paramInt2 == 402)
      {
        com.tencent.mm.ui.base.h.a(this.mController.tml, paramString, "", getString(a.i.lucky_money_send_list_title), getString(a.i.app_cancel), new LuckyMoneyPrepareUI.15(this), new LuckyMoneyPrepareUI.16(this));
        return true;
      }
    }
    else
    {
      if ((paraml instanceof com.tencent.mm.plugin.luckymoney.b.x))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "NetSceneLuckyMoneyGetConfig resp,errType=" + paramInt1 + ";errCode=" + paramInt2 + ";errMsg=" + paramString);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = (com.tencent.mm.plugin.luckymoney.b.x)paraml;
          com.tencent.mm.plugin.luckymoney.a.a.bat();
          this.kLu = com.tencent.mm.plugin.luckymoney.a.a.bau().baS();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "update config:" + this.kLu);
          if (this.mType != 1) {
            break label886;
          }
          this.kTn.setMaxAmount(this.kLu.kKT);
          this.kTn.setMinAmount(this.kLu.kKS);
          this.kMf.setMaxNum(this.kLu.kKQ);
          this.kWQ = paramString.kKV;
          this.kWP = paramString.hUw;
          this.kWR = paramString.kLf;
          if ((!bi.oW(this.kWR)) && (this.kMh != null)) {
            com.tencent.mm.sdk.platformtools.ah.A(new LuckyMoneyPrepareUI.17(this));
          }
          if ((paramString.kRd) && (this.kTu))
          {
            paraml = (TextView)findViewById(a.f.lucky_money_prepare_has_tips);
            paraml.setOnClickListener(new LuckyMoneyPrepareUI.18(this));
            com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bbh()), Integer.valueOf(8) });
            paraml.setVisibility(0);
          }
          if (bi.oW(paramString.hUy)) {
            break label903;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "Put notice :" + paramString.hUy);
          this.kMn.setText(paramString.hUy);
          if (!bi.oW(paramString.kRf)) {
            this.kMn.setOnClickListener(new LuckyMoneyPrepareUI.19(this, paramString));
          }
          this.kMn.setVisibility(0);
          label805:
          paraml = new g.c();
          if ((paramString.kRh == null) || (bi.oW(paramString.kRh.content))) {
            break label915;
          }
        }
        label886:
        label903:
        label915:
        for (paraml.textColor = getResources().getColor(a.c.wallet_link_color);; paraml.textColor = getResources().getColor(a.c.hint_text_color))
        {
          g.a(this, this.kTq, paramString.kRh, paraml);
          dD(paramString.kKW, paramString.kKV);
          c(0.0D, this.kWQ);
          return true;
          this.kTn.setMaxAmount(this.kLu.kKR);
          break;
          this.kMn.setVisibility(8);
          break label805;
        }
      }
      if ((paraml instanceof y))
      {
        js(1645);
        if ((this.eXG != null) && (this.eXG.isShowing())) {
          this.eXG.hide();
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = ((y)paraml).hUK;
          if (!bi.oW(paramString))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "payUrl is not null");
            paraml = new Intent();
            paraml.putExtra("rawUrl", paramString);
            paraml.putExtra("showShare", false);
            com.tencent.mm.bg.d.b(this, "webview", ".ui.tools.WebViewUI", paraml, 3);
          }
          for (;;)
          {
            return true;
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyPrepareUI", "payUrl is null");
          }
        }
      }
      else if ((paraml instanceof com.tencent.mm.plugin.luckymoney.f2f.a.c))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (this.eXG != null) {
            this.eXG.dismiss();
          }
          this.kUn = ((com.tencent.mm.plugin.luckymoney.f2f.a.c)paraml).kLZ;
          this.kWT = ((com.tencent.mm.plugin.luckymoney.f2f.a.c)paraml).kNn;
          paramString = new PayInfo();
          paramString.bOd = ((com.tencent.mm.plugin.luckymoney.f2f.a.c)paraml).bOd;
          paramString.bVY = 37;
          u.j(37, paramString.bOd, paramInt2);
          com.tencent.mm.pluginsdk.wallet.h.a(this, paramString, 4);
        }
        for (;;)
        {
          return true;
          u.j(37, "", paramInt2);
          if (!bi.oW(paramString)) {
            com.tencent.mm.ui.base.h.b(this, paramString, getString(a.i.lucky_money_app_tip), true);
          }
          this.eXG.dismiss();
        }
      }
    }
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (this.kTo.getVisibility() == 0))
    {
      this.kTo.setVisibility(8);
      bbp();
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void finish()
  {
    if (this.kWS != null)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("key_realname_guide_helper", this.kWS);
      com.tencent.mm.bg.d.b(this, "wallet_core", ".id_verify.RealnameDialogActivity", localIntent);
    }
    super.finish();
  }
  
  protected final int getLayoutId()
  {
    return a.g.lucky_money_prepare_ui;
  }
  
  protected final void initView()
  {
    setBackBtn(new LuckyMoneyPrepareUI.1(this));
    this.kTo = findViewById(a.f.lucky_money_prepare_ready_ll);
    this.kTp = findViewById(a.f.lucky_money_prepare_sent_area);
    this.iqN = ((Button)findViewById(a.f.lucky_money_prepare_send_btn));
    this.kMh = ((LuckyMoneyTextInputView)findViewById(a.f.lucky_money_wish_et));
    this.kMh.setHintText(getString(a.i.lucky_money_default_wish));
    this.kMi = ((Button)findViewById(a.f.lucky_money_prepare_btn));
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.tenpay_num_keyboard));
    this.kMk = findViewById(a.f.tenpay_keyboard_layout);
    this.hXT = ((TextView)findViewById(a.f.lucky_money_prepare_amount_tips));
    this.kMf = ((LuckyMoneyNumInputView)findViewById(a.f.lucky_money_num_et));
    this.kTn = ((LuckyMoneyMoneyInputView)findViewById(a.f.lucky_money_amount_et));
    this.hXQ = ((TextView)findViewById(a.f.lucky_money_prepare_total_amount));
    this.kTq = ((ViewGroup)findViewById(a.f.lucky_money_prepare_opertaion));
    this.kMm = ((MMScrollView)findViewById(a.f.lucky_money_sv));
    this.kMn = ((TextView)findViewById(a.f.lucky_money_prepare_notice_tips));
    final Object localObject1;
    final Object localObject2;
    Object localObject3;
    label531:
    label605:
    int i;
    if (this.mType == 1)
    {
      setMMTitle(a.i.lucky_money_group);
      this.kTn.setTitle(getString(a.i.lucky_money_total_amount_title));
      this.kTn.setShowGroupIcon(true);
      this.kTn.setOnInputValidChangerListener(this);
      this.kTn.setHint(getString(a.i.lucky_money_money_hint));
      this.kMf.setOnInputValidChangerListener(this);
      this.kMf.setHint(getString(a.i.lucky_money_num_hint));
      this.kMh.setOnInputValidChangerListener(this);
      localObject1 = (EditText)this.kTn.findViewById(a.f.lucky_money_et);
      localObject2 = (EditText)this.kMf.findViewById(a.f.lucky_money_et);
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText((EditText)localObject1);
      ((InputMethodManager)this.mController.tml.getSystemService("input_method")).showSoftInput((View)localObject1, 0);
      ((EditText)localObject1).addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          if (paramAnonymousEditable.toString().startsWith(".")) {
            paramAnonymousEditable.insert(0, "0");
          }
          String str = paramAnonymousEditable.toString();
          int i = str.indexOf(".");
          int j = str.length();
          if ((i >= 0) && (j - i > 3)) {
            paramAnonymousEditable.delete(i + 3, j);
          }
          for (;;)
          {
            localObject1.setContentDescription(paramAnonymousEditable.toString());
            return;
            if (i > 6) {
              paramAnonymousEditable.delete(6, i);
            } else if ((i == -1) && (j > 6)) {
              paramAnonymousEditable.delete(6, j);
            }
          }
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      });
      ((EditText)localObject2).addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          localObject2.setContentDescription(paramAnonymousEditable.toString());
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      });
      ((EditText)localObject1).setOnClickListener(new LuckyMoneyPrepareUI.6(this, (EditText)localObject1, (EditText)localObject2));
      ((EditText)localObject1).requestFocus();
      localObject3 = (TextView)this.kTn.findViewById(a.f.lucky_money_amount_unit_title);
      if (localObject3 != null) {
        ((TextView)localObject3).setOnClickListener(new LuckyMoneyPrepareUI.7(this, (EditText)localObject1, (EditText)localObject2));
      }
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText((EditText)localObject2);
      ((InputMethodManager)this.mController.tml.getSystemService("input_method")).showSoftInput((View)localObject2, 0);
      ((EditText)localObject2).setOnClickListener(new LuckyMoneyPrepareUI.8(this, (EditText)localObject1, (EditText)localObject2));
      ((MMEditText)this.kMh.findViewById(a.f.lucky_money_text)).setOnFocusChangeListener(new LuckyMoneyPrepareUI.9(this, (EditText)localObject1, (EditText)localObject2));
      if (this.kLu != null)
      {
        if (this.mType != 1) {
          break label902;
        }
        this.kTn.setMaxAmount(this.kLu.kKT);
        this.kTn.setMinAmount(this.kLu.kKS);
        if (this.kLu.hUw != 1) {
          dD(this.kLu.kKW, this.kLu.kKV);
        }
      }
      if ((!this.kTu) || (getIntent().getIntExtra("key_chatroom_num", 0) > 1)) {
        break label919;
      }
      this.kMf.setNum("1");
      this.kMf.setMaxNum(this.kLu.kKQ);
      this.kMf.setMinNum(1);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LuckyMoneyPrepareUI", "init num=" + this.kMf.getInput());
      this.kTn.setMaxLen(12);
      if ((!this.kTu) && (this.hop != 2)) {
        break label1300;
      }
      setMMTitle(a.i.lucky_money_to_send_title);
      i = getIntent().getIntExtra("key_chatroom_num", 0);
      if ((!this.kTu) || (i != 0)) {
        break label932;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "single hb");
      this.kMf.setVisibility(8);
    }
    for (;;)
    {
      this.kMi.setOnClickListener(new LuckyMoneyPrepareUI.28(this));
      this.kMp.a(this.kMf);
      this.kMp.a(this.kTn);
      this.kMp.a(this.kMh);
      localObject1 = (TextView)findViewById(a.f.lucky_money_prepare_error_tips);
      this.kMp.f((TextView)localObject1);
      this.eVk = new al(new LuckyMoneyPrepareUI.29(this), false);
      if (this.kMm != null) {
        this.kMm.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            if (paramAnonymousMotionEvent.getAction() == 0)
            {
              LuckyMoneyPrepareUI.this.Wq();
              LuckyMoneyPrepareUI.this.YC();
            }
            return false;
          }
        });
      }
      this.kTn.setType(this.mType);
      if (this.kWP != 1) {
        break label1365;
      }
      addIconOptionMenu(0, a.e.mm_title_btn_menu, new LuckyMoneyPrepareUI.31(this));
      return;
      setMMTitle(a.i.lucky_money_normal);
      this.kTn.setTitle(getString(a.i.lucky_money_unit_amount_title));
      this.kTn.setShowGroupIcon(false);
      break;
      label902:
      this.kTn.setMaxAmount(this.kLu.kKR);
      break label531;
      label919:
      this.kMf.setNum("");
      break label605;
      label932:
      localObject2 = getString(a.i.lucky_money_f2f_random_tip_prefix);
      Object localObject4 = getString(a.i.lucky_money_group_tips_change_to_fixed);
      localObject1 = getString(a.i.lucky_money_f2f_fixed_tip_prefix);
      localObject3 = getString(a.i.lucky_money_group_tips_change_to_random);
      Object localObject5;
      if ((this.kTu) && (i > 0))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "group hb,%d people", new Object[] { Integer.valueOf(i) });
        localObject2 = getString(a.i.lucky_money_group_tips_random_prefix);
        localObject1 = getString(a.i.lucky_money_group_tips_fixed_prefix);
        localObject5 = (TextView)findViewById(a.f.lucky_money_prepare_num_tips);
        ((TextView)localObject5).setText(getString(a.i.lucky_money_num_group_tips, new Object[] { Integer.valueOf(getIntent().getIntExtra("key_chatroom_num", 8)) }));
        ((TextView)localObject5).setVisibility(0);
      }
      for (;;)
      {
        localObject5 = new com.tencent.mm.plugin.wallet_core.ui.h(this);
        SpannableString localSpannableString = new SpannableString((String)localObject2 + (String)localObject4);
        localSpannableString.setSpan(localObject5, ((String)localObject2).length(), ((String)localObject2).length() + ((String)localObject4).length(), 33);
        localObject2 = new SpannableString((String)localObject1 + (String)localObject3);
        localObject4 = new com.tencent.mm.plugin.wallet_core.ui.h(this);
        ((SpannableString)localObject2).setSpan(localObject4, ((String)localObject1).length(), ((String)localObject1).length() + ((String)localObject3).length(), 33);
        ((com.tencent.mm.plugin.wallet_core.ui.h)localObject5).pvm = new LuckyMoneyPrepareUI.11(this, (SpannableString)localObject2);
        ((com.tencent.mm.plugin.wallet_core.ui.h)localObject4).pvm = new LuckyMoneyPrepareUI.22(this, localSpannableString);
        this.hXT.setMovementMethod(LinkMovementMethod.getInstance());
        if (a.a.cqX().cqW()) {
          this.hXT.setOnClickListener(new LuckyMoneyPrepareUI.27(this, localSpannableString, (com.tencent.mm.plugin.wallet_core.ui.h)localObject5, (com.tencent.mm.plugin.wallet_core.ui.h)localObject4));
        }
        this.hXT.setText(localSpannableString);
        this.hXT.setVisibility(0);
        break;
        if (this.hop == 2)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "f2f hb");
          this.kMh.setVisibility(8);
        }
      }
      label1300:
      if (this.mType == 1)
      {
        this.hXT.setText(this.kLu.kPE);
        this.hXT.setVisibility(0);
      }
      else if (this.mType == 0)
      {
        this.hXT.setText(this.kLu.kPF);
        this.hXT.setVisibility(0);
      }
    }
    label1365:
    addIconOptionMenu(0, a.e.lucky_money_help_btn, new LuckyMoneyPrepareUI.32(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      if ((paramIntent != null) && (paramIntent.hasExtra("key_realname_guide_helper"))) {
        this.kWS = ((RealnameGuideHelper)paramIntent.getParcelableExtra("key_realname_guide_helper"));
      }
      if (paramInt2 == -1)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bbh()), Integer.valueOf(5) });
        Object localObject1 = getIntent().getStringExtra("key_username");
        if ((this.kTu) && (!bi.oW((String)localObject1)))
        {
          com.tencent.mm.ui.base.h.bA(this, getString(a.i.has_send));
          Object localObject2 = bl.z(this.kTv, "msg");
          if (localObject2 == null)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyPrepareUI", "luckymoneyPrepareUI onActivityResult values is null");
            finish();
            return;
          }
          localObject2 = (String)((Map)localObject2).get(".msg.appmsg.wcpayinfo.paymsgid");
          if (com.tencent.mm.plugin.luckymoney.a.a.bat().baw().Gb((String)localObject2))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "insert a local msg for luckymoney");
            if (!o.C(this.kTv, (String)localObject1, 1))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyPrepareUI", "LuckyMoneyUtil.sendLocalMsg fail!");
              com.tencent.mm.plugin.luckymoney.a.a.bat().baw().Gc((String)localObject2);
            }
            label262:
            finish();
          }
        }
        for (;;)
        {
          localObject1 = "";
          if (paramIntent != null) {
            localObject1 = paramIntent.getStringExtra("key_trans_id");
          }
          Gg((String)localObject1);
          break;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyPrepareUI", "it is a duplicate msg");
          break label262;
          bbq();
          localObject1 = findViewById(a.f.lucky_money_prepare_ready_packet_ll);
          this.kTo.setVisibility(0);
          o.a((View)localObject1, null);
          this.iqN.setOnClickListener(new LuckyMoneyPrepareUI.20(this));
          ((ImageView)findViewById(a.f.lucky_money_prepare_close_btn)).setOnClickListener(new LuckyMoneyPrepareUI.21(this));
        }
        if ((paramInt2 == -1) && (paramIntent != null))
        {
          localObject1 = paramIntent.getStringExtra("Select_Conv_User");
          com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bbh()), Integer.valueOf(7), localObject1 });
          if (!bi.oW((String)localObject1)) {
            l(new com.tencent.mm.plugin.luckymoney.b.ah(((String)localObject1).replaceAll(",", "|"), this.kTs, "v1.0"));
          } else {
            finish();
          }
        }
        else if (paramInt2 == 0)
        {
          localObject1 = new Intent();
          ((Intent)localObject1).setClass(this.mController.tml, LuckyMoneyMyRecordUI.class);
          ((Intent)localObject1).putExtra("key_type", 1);
          startActivity((Intent)localObject1);
          continue;
          if ((paramIntent != null) && (paramIntent.hasExtra("result_data")))
          {
            localObject1 = paramIntent.getBundleExtra("result_data");
            if (localObject1 != null)
            {
              int i = bi.getInt(((Bundle)localObject1).getString("payState", "2"), 0);
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult REQUEST_CODE_H5_PAY payState is " + i + ";STATE_H5_PAY_SUCC=0");
              if (i == 0) {
                finish();
              }
            }
            else
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult REQUEST_CODE_H5_PAY bundle is null");
              continue;
              if (paramInt2 == -1)
              {
                localObject1 = "";
                if (paramIntent != null) {
                  localObject1 = paramIntent.getStringExtra("key_trans_id");
                }
                Gg((String)localObject1);
              }
              finish();
            }
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("key_type", 1);
    this.kTr = getIntent().getIntExtra("key_way", 3);
    this.hop = getIntent().getIntExtra("key_from", 0);
    if (this.hop == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.kTu = bool;
      this.kTw = getIntent().getIntExtra("pay_channel", -1);
      b(new com.tencent.mm.plugin.luckymoney.b.x("v1.0", (byte)0), true);
      com.tencent.mm.plugin.luckymoney.a.a.bat();
      this.kLu = com.tencent.mm.plugin.luckymoney.a.a.bau().baS();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "mInWay:" + this.kTr + "mChannel:" + this.kTw);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "type=" + this.mType + ", fromAppPanel=" + this.kTu + ", config " + this.kLu);
      initView();
      com.tencent.mm.sdk.b.a.sFg.a(this.kWW);
      com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bbh()), Integer.valueOf(1) });
      return;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.kMp.clear();
    this.eVk.ciq();
    if ((this.eXG != null) && (this.eXG.isShowing())) {
      this.eXG.dismiss();
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.kWW);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.kMk != null) && (this.kMk.isShown()))
    {
      this.kMk.setVisibility(8);
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    super.onResume();
    jr(1970);
  }
  
  protected void onStop()
  {
    super.onStop();
    js(1970);
  }
  
  protected final void z(View paramView, int paramInt)
  {
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.tenpay_num_keyboard));
    this.kMk = findViewById(a.f.tenpay_keyboard_layout);
    View localView = findViewById(a.f.tenpay_push_down);
    EditText localEditText = (EditText)paramView.findViewById(a.f.lucky_money_et);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.kMk == null)) {
      return;
    }
    com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText(localEditText);
    localEditText.setOnFocusChangeListener(new LuckyMoneyPrepareUI.23(this, paramInt, localEditText));
    localEditText.setOnClickListener(new LuckyMoneyPrepareUI.24(this, paramInt, localEditText));
    TextView localTextView = (TextView)paramView.findViewById(a.f.lucky_money_amount_unit_title);
    if (localTextView != null) {
      localTextView.setOnClickListener(new LuckyMoneyPrepareUI.25(this, localEditText, paramView, paramInt));
    }
    localView.setOnClickListener(new LuckyMoneyPrepareUI.26(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */