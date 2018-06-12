package com.tencent.mm.plugin.luckymoney.sns;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.luckymoney.b.ae;
import com.tencent.mm.plugin.luckymoney.b.ah;
import com.tencent.mm.plugin.luckymoney.b.d;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView;
import com.tencent.mm.plugin.luckymoney.ui.f;
import com.tencent.mm.plugin.luckymoney.ui.g.c;
import com.tencent.mm.plugin.wallet_core.ui.h.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.ui.MMActivity;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.util.Map;

@com.tencent.mm.ui.base.a(19)
public class SnsLuckyMoneyPrepareUI
  extends LuckyMoneyBaseUI
  implements f
{
  private al eVk = null;
  protected Dialog eXG = null;
  private ScrollView fPS;
  protected TextView hXQ = null;
  private TextView hXT;
  protected Button iqN = null;
  private d kLu;
  protected LuckyMoneyNumInputView kMf = null;
  protected LuckyMoneyTextInputView kMh = null;
  protected Button kMi = null;
  protected View kMk;
  private TextView kMn;
  private com.tencent.mm.plugin.luckymoney.ui.a kMp = new com.tencent.mm.plugin.luckymoney.ui.a();
  protected LuckyMoneyMoneyInputView kTn = null;
  private View kTo;
  private View kTp;
  private ViewGroup kTq;
  private int kTr;
  private String kTs;
  private int kTt;
  private boolean kTu;
  private String kTv;
  private int kTw;
  private com.tencent.mm.wallet_core.ui.a kTx;
  protected MyKeyboardWindow mKeyboard;
  private int mType;
  
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
  
  protected final void Wq()
  {
    if ((this.kMk != null) && (this.kMk.isShown()))
    {
      this.kMk.setVisibility(8);
      this.kTx.fI(false);
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
        this.kMi.setClickable(false);
        this.kMi.setEnabled(false);
        this.hXQ.setText(com.tencent.mm.wallet_core.ui.e.B(d2));
        return;
        if (i > 0) {
          d1 = this.kTn.getInput() / i;
        }
      }
      else
      {
        if ((d2 == 0.0D) || (d1 == 0.0D)) {
          i = 1;
        }
        for (;;)
        {
          label147:
          if (i != 0)
          {
            this.kMi.setClickable(false);
            this.kMi.setEnabled(false);
            break;
            if ((d2 > this.kLu.kKT) && (this.kLu.kKT > 0.0D))
            {
              this.kMp.tn(getString(a.i.lucky_money_total_amount_max_limit_tips, new Object[] { Math.round(this.kLu.kKT), bi.aG(this.kLu.kKW, "") }));
              i = 1;
              continue;
            }
            if (d1 <= 0.0D) {
              break label638;
            }
            if (this.mType == 0)
            {
              if ((d1 <= this.kLu.kKR) || (this.kLu.kKR <= 0.0D)) {
                break label632;
              }
              this.kMp.tn(getString(a.i.lucky_money_per_amount_max_limit_tips, new Object[] { Math.round(this.kLu.kKR), bi.aG(this.kLu.kKW, "") }));
              i = 1;
            }
          }
          for (;;)
          {
            if (i == 0)
            {
              if (this.mType == 0)
              {
                if (d1 >= this.kLu.kKS) {
                  break label629;
                }
                this.kMp.tn(getString(a.i.lucky_money_per_amount_min_limit_tips, new Object[] { com.tencent.mm.wallet_core.ui.e.A(this.kLu.kKS), bi.aG(this.kLu.kKW, "") }));
                i = 1;
                break label147;
                if ((d1 <= this.kLu.kKU) || (this.kLu.kKU <= 0.0D)) {
                  break label632;
                }
                this.kMp.tn(getString(a.i.lucky_money_per_amount_max_limit_tips, new Object[] { Math.round(this.kLu.kKU), bi.aG(this.kLu.kKW, "") }));
                this.kMf.onError();
                this.kTn.onError();
                i = 1;
                continue;
              }
              if (d1 < 0.01D)
              {
                this.kMp.tn(getString(a.i.lucky_money_per_amount_min_limit_tips, new Object[] { "0.01", bi.aG(this.kLu.kKW, "") }));
                this.kMf.onError();
                this.kTn.onError();
                i = 1;
                break label147;
                this.kMi.setClickable(true);
                this.kMi.setEnabled(true);
                break;
              }
            }
            label629:
            break label147;
            label632:
            i = 0;
          }
          label638:
          i = 0;
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
    if ((paraml instanceof ae))
    {
      if ((this.eXG != null) && (this.eXG.isShowing())) {
        this.eXG.hide();
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (ae)paraml;
        this.kTt = paramString.hUg;
        this.kTs = paramString.kLZ;
        this.kTv = paramString.kRr;
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
      com.tencent.mm.ui.base.h.bA(this, paramString);
      return true;
    }
    if ((paraml instanceof ah))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (this.kTu)
        {
          com.tencent.mm.ui.base.h.bA(this, getString(a.i.has_send));
          finish();
        }
        for (;;)
        {
          return true;
          bbq();
          this.kTp.postDelayed(new Runnable()
          {
            public final void run()
            {
              Intent localIntent = new Intent();
              localIntent.setClass(SnsLuckyMoneyPrepareUI.this.mController.tml, LuckyMoneyIndexUI.class);
              localIntent.addFlags(67108864);
              SnsLuckyMoneyPrepareUI.this.mController.tml.startActivity(localIntent);
              SnsLuckyMoneyPrepareUI.this.finish();
            }
          }, 1000L);
        }
      }
      if (paramInt2 == 402)
      {
        com.tencent.mm.ui.base.h.a(this.mController.tml, paramString, "", getString(a.i.lucky_money_send_list_title), getString(a.i.app_cancel), new SnsLuckyMoneyPrepareUI.3(this), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
        });
        return true;
      }
    }
    else if ((paraml instanceof com.tencent.mm.plugin.luckymoney.b.x))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (com.tencent.mm.plugin.luckymoney.b.x)paraml;
        com.tencent.mm.plugin.luckymoney.a.a.bat();
        this.kLu = com.tencent.mm.plugin.luckymoney.a.a.bau().baS();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LuckyMoneyPrepareUI", "update config:" + this.kLu);
        if (this.mType != 1) {
          break label617;
        }
        this.kTn.setMaxAmount(this.kLu.kKT);
        this.kTn.setMinAmount(this.kLu.kKS);
        this.kMf.setMaxNum(this.kLu.kKQ);
        if ((paramString.kRd) && (this.kTu))
        {
          paraml = (TextView)findViewById(a.f.lucky_money_prepare_has_tips);
          paraml.setOnClickListener(new SnsLuckyMoneyPrepareUI.5(this));
          com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bbh()), Integer.valueOf(8) });
          paraml.setVisibility(0);
        }
        if (bi.oW(paramString.hUy)) {
          break label634;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyPrepareUI", "Put notice :" + paramString.hUy);
        this.kMn.setText(paramString.hUy);
        if (!bi.oW(paramString.kRf)) {
          this.kMn.setOnClickListener(new SnsLuckyMoneyPrepareUI.6(this, paramString));
        }
        this.kMn.setVisibility(0);
      }
      for (;;)
      {
        paraml = new g.c();
        paraml.textColor = getResources().getColor(a.c.wallet_link_color);
        com.tencent.mm.plugin.luckymoney.ui.g.a(this, this.kTq, paramString.kRh, paraml);
        return true;
        label617:
        this.kTn.setMaxAmount(this.kLu.kKR);
        break;
        label634:
        this.kMn.setVisibility(8);
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
  
  protected final int getLayoutId()
  {
    return a.g.lucky_money_prepare_ui;
  }
  
  protected final void initView()
  {
    getResources().getDrawable(a.e.lucky_money_actionbar_bg);
    setBackBtn(new SnsLuckyMoneyPrepareUI.1(this));
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
    this.fPS = ((ScrollView)findViewById(a.f.lucky_money_sv));
    this.kMn = ((TextView)findViewById(a.f.lucky_money_prepare_notice_tips));
    Object localObject1;
    if (this.mType == 1)
    {
      this.kTn.setTitle(getString(a.i.lucky_money_total_amount_title));
      this.kTn.setShowGroupIcon(true);
      this.kTn.setOnInputValidChangerListener(this);
      this.kMf.setOnInputValidChangerListener(this);
      this.kMh.setOnInputValidChangerListener(this);
      localObject1 = (EditText)this.kTn.findViewById(a.f.lucky_money_et);
      Object localObject2 = (EditText)this.kMf.findViewById(a.f.lucky_money_et);
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText((EditText)localObject1);
      ((InputMethodManager)this.mController.tml.getSystemService("input_method")).showSoftInput((View)localObject1, 0);
      ((EditText)localObject1).setOnClickListener(new SnsLuckyMoneyPrepareUI.19(this, (EditText)localObject1, (EditText)localObject2));
      final Object localObject3 = (TextView)this.kTn.findViewById(a.f.lucky_money_amount_unit_title);
      if (localObject3 != null) {
        ((TextView)localObject3).setOnClickListener(new SnsLuckyMoneyPrepareUI.20(this, (EditText)localObject1, (EditText)localObject2));
      }
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText((EditText)localObject2);
      ((InputMethodManager)this.mController.tml.getSystemService("input_method")).showSoftInput((View)localObject2, 0);
      ((EditText)localObject2).setOnClickListener(new SnsLuckyMoneyPrepareUI.21(this, (EditText)localObject1, (EditText)localObject2));
      if (this.kLu != null)
      {
        if (this.mType != 1) {
          break label1030;
        }
        this.kTn.setMaxAmount(this.kLu.kKT);
        label447:
        this.kTn.setMinAmount(this.kLu.kKS);
      }
      if ((!this.kTu) || (getIntent().getIntExtra("key_chatroom_num", 0) > 1)) {
        break label1047;
      }
      this.kMf.setNum("1");
      label492:
      this.kMf.setMaxNum(this.kLu.kKQ);
      this.kMf.setMinNum(1);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LuckyMoneyPrepareUI", "init num=" + this.kMf.getInput());
      this.kTn.setMaxLen(12);
      if (!this.kTu) {
        break label1072;
      }
      if (getIntent().getIntExtra("key_chatroom_num", 0) <= 0) {
        break label1060;
      }
      final Object localObject4 = getString(a.i.lucky_money_group_tips_random_prefix);
      Object localObject5 = getString(a.i.lucky_money_group_tips_change_to_fixed);
      localObject1 = getString(a.i.lucky_money_group_tips_fixed_prefix);
      localObject2 = getString(a.i.lucky_money_group_tips_change_to_random);
      localObject3 = new SpannableString((String)localObject4 + (String)localObject5);
      com.tencent.mm.plugin.wallet_core.ui.h localh = new com.tencent.mm.plugin.wallet_core.ui.h(this);
      ((SpannableString)localObject3).setSpan(localh, ((String)localObject4).length(), ((String)localObject4).length() + ((String)localObject5).length(), 33);
      localObject4 = new SpannableString((String)localObject1 + (String)localObject2);
      localObject5 = new com.tencent.mm.plugin.wallet_core.ui.h(this);
      ((SpannableString)localObject4).setSpan(localObject5, ((String)localObject1).length(), ((String)localObject1).length() + ((String)localObject2).length(), 33);
      localh.pvm = new h.a()
      {
        public final void onClick(View paramAnonymousView)
        {
          int i = SnsLuckyMoneyPrepareUI.this.kMf.getInput();
          double d = SnsLuckyMoneyPrepareUI.this.kTn.getInput();
          SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this, 0);
          SnsLuckyMoneyPrepareUI.this.kTn.setType(SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this));
          SnsLuckyMoneyPrepareUI.this.kTn.setShowGroupIcon(false);
          SnsLuckyMoneyPrepareUI.this.kTn.setTitle(SnsLuckyMoneyPrepareUI.this.getString(a.i.lucky_money_unit_amount_title));
          if ((d > 0.0D) && (i > 0)) {
            SnsLuckyMoneyPrepareUI.this.kTn.setAmount(com.tencent.mm.wallet_core.ui.e.A(d / i));
          }
          SnsLuckyMoneyPrepareUI.this.kTn.setMaxAmount(SnsLuckyMoneyPrepareUI.b(SnsLuckyMoneyPrepareUI.this).kKR);
          SnsLuckyMoneyPrepareUI.c(SnsLuckyMoneyPrepareUI.this).setText(localObject4);
          com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(SnsLuckyMoneyPrepareUI.d(SnsLuckyMoneyPrepareUI.this)), Integer.valueOf(3) });
        }
      };
      ((com.tencent.mm.plugin.wallet_core.ui.h)localObject5).pvm = new h.a()
      {
        public final void onClick(View paramAnonymousView)
        {
          int i = SnsLuckyMoneyPrepareUI.this.kMf.getInput();
          double d = SnsLuckyMoneyPrepareUI.this.kTn.getInput();
          SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this, 1);
          SnsLuckyMoneyPrepareUI.this.kTn.setType(SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this));
          SnsLuckyMoneyPrepareUI.this.kTn.setTitle(SnsLuckyMoneyPrepareUI.this.getString(a.i.lucky_money_total_amount_title));
          SnsLuckyMoneyPrepareUI.this.kTn.setShowGroupIcon(true);
          if ((d > 0.0D) && (i > 0)) {
            SnsLuckyMoneyPrepareUI.this.kTn.setAmount(com.tencent.mm.wallet_core.ui.e.A(d * i));
          }
          SnsLuckyMoneyPrepareUI.this.kTn.setMaxAmount(SnsLuckyMoneyPrepareUI.b(SnsLuckyMoneyPrepareUI.this).kKT);
          SnsLuckyMoneyPrepareUI.c(SnsLuckyMoneyPrepareUI.this).setText(localObject3);
          com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(SnsLuckyMoneyPrepareUI.d(SnsLuckyMoneyPrepareUI.this)), Integer.valueOf(2) });
        }
      };
      this.hXT.setMovementMethod(LinkMovementMethod.getInstance());
      this.hXT.setText((CharSequence)localObject3);
      this.hXT.setVisibility(0);
    }
    for (;;)
    {
      this.kMi.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(SnsLuckyMoneyPrepareUI.d(SnsLuckyMoneyPrepareUI.this)), Integer.valueOf(4) });
          if (SnsLuckyMoneyPrepareUI.this.kTn.baC() != 0)
          {
            com.tencent.mm.ui.base.s.makeText(SnsLuckyMoneyPrepareUI.this.mController.tml, a.i.wallet_balance_save_input_invalid, 0).show();
            return;
          }
          int i = SnsLuckyMoneyPrepareUI.this.kMf.getInput();
          double d = SnsLuckyMoneyPrepareUI.this.kTn.getInput();
          long l2 = 0L;
          long l1;
          String str;
          if (SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this) == 1)
          {
            l1 = com.tencent.mm.wallet_core.ui.e.C(d);
            com.tencent.mm.kernel.g.Ek();
            com.tencent.mm.kernel.g.Ei().DT().set(356354, Integer.valueOf(i));
            str = SnsLuckyMoneyPrepareUI.this.kMh.getInput();
            paramAnonymousView = str;
            if (bi.oW(str)) {
              paramAnonymousView = SnsLuckyMoneyPrepareUI.this.getString(a.i.lucky_money_default_wish);
            }
            str = SnsLuckyMoneyPrepareUI.this.getIntent().getStringExtra("key_username");
            if ((!SnsLuckyMoneyPrepareUI.e(SnsLuckyMoneyPrepareUI.this)) || (bi.oW(str))) {
              break label331;
            }
          }
          label331:
          for (paramAnonymousView = new ae(i, l1, l2, SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this), paramAnonymousView, o.baX(), str, o.gS(str), q.GF(), q.GH(), SnsLuckyMoneyPrepareUI.f(SnsLuckyMoneyPrepareUI.this));; paramAnonymousView = new ae(i, l1, l2, SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this), paramAnonymousView, o.baX(), null, null, q.GF(), q.GH(), SnsLuckyMoneyPrepareUI.f(SnsLuckyMoneyPrepareUI.this)))
          {
            SnsLuckyMoneyPrepareUI.this.b(paramAnonymousView, false);
            if (SnsLuckyMoneyPrepareUI.this.eXG == null) {
              break label374;
            }
            SnsLuckyMoneyPrepareUI.this.eXG.show();
            return;
            l1 = com.tencent.mm.wallet_core.ui.e.C(i * d);
            l2 = com.tencent.mm.wallet_core.ui.e.C(d);
            com.tencent.mm.kernel.g.Ek();
            com.tencent.mm.kernel.g.Ei().DT().set(356353, Integer.valueOf(i));
            break;
          }
          label374:
          SnsLuckyMoneyPrepareUI.this.eXG = com.tencent.mm.wallet_core.ui.g.a(SnsLuckyMoneyPrepareUI.this.mController.tml, true, new SnsLuckyMoneyPrepareUI.16.1(this));
        }
      });
      this.hXQ.setText(com.tencent.mm.wallet_core.ui.e.B(0.0D));
      this.kMp.a(this.kMf);
      this.kMp.a(this.kTn);
      this.kMp.a(this.kMh);
      localObject1 = (TextView)findViewById(a.f.lucky_money_prepare_error_tips);
      this.kMp.f((TextView)localObject1);
      if ((this.kTu) && (this.mType == 1))
      {
        localObject1 = (TextView)findViewById(a.f.lucky_money_prepare_num_tips);
        ((TextView)localObject1).setText(getString(a.i.lucky_money_num_group_tips, new Object[] { Integer.valueOf(getIntent().getIntExtra("key_chatroom_num", 8)) }));
        ((TextView)localObject1).setVisibility(0);
      }
      this.eVk = new al(new SnsLuckyMoneyPrepareUI.17(this), false);
      if (this.fPS != null) {
        this.fPS.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            if (paramAnonymousMotionEvent.getAction() == 0)
            {
              SnsLuckyMoneyPrepareUI.this.Wq();
              SnsLuckyMoneyPrepareUI.this.YC();
            }
            return false;
          }
        });
      }
      this.kTn.setType(this.mType);
      if ((!this.kTu) || (getIntent().getIntExtra("key_chatroom_num", 0) != 0)) {
        break label1137;
      }
      this.kTn.requestFocus();
      return;
      this.kTn.setTitle(getString(a.i.lucky_money_unit_amount_title));
      this.kTn.setShowGroupIcon(false);
      break;
      label1030:
      this.kTn.setMaxAmount(this.kLu.kKR);
      break label447;
      label1047:
      this.kMf.setNum("");
      break label492;
      label1060:
      this.kMf.setVisibility(8);
      continue;
      label1072:
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
    label1137:
    this.kMf.requestFocus();
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
          }
          for (;;)
          {
            finish();
            break;
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyPrepareUI", "it is a duplicate msg");
          }
        }
        bbq();
        new ag().postDelayed(new SnsLuckyMoneyPrepareUI.7(this), 200L);
        this.iqN.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(SnsLuckyMoneyPrepareUI.d(SnsLuckyMoneyPrepareUI.this)), Integer.valueOf(6) });
            o.a(SnsLuckyMoneyPrepareUI.this, SnsLuckyMoneyPrepareUI.a(SnsLuckyMoneyPrepareUI.this), SnsLuckyMoneyPrepareUI.m(SnsLuckyMoneyPrepareUI.this), false);
            SnsLuckyMoneyPrepareUI.l(SnsLuckyMoneyPrepareUI.this).postDelayed(new SnsLuckyMoneyPrepareUI.8.1(this), 100L);
          }
        });
        ((ImageView)findViewById(a.f.lucky_money_prepare_close_btn)).setOnClickListener(new SnsLuckyMoneyPrepareUI.9(this));
        continue;
        if ((paramInt2 == -1) && (paramIntent != null))
        {
          localObject1 = paramIntent.getStringExtra("Select_Conv_User");
          com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(bbh()), Integer.valueOf(7), localObject1 });
          if (!bi.oW((String)localObject1)) {
            l(new ah(((String)localObject1).replaceAll(",", "|"), this.kTs, "v1.0"));
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
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mType = getIntent().getIntExtra("key_type", 1);
    this.kTr = getIntent().getIntExtra("key_way", 3);
    if (getIntent().getIntExtra("key_from", 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.kTu = bool;
      this.kTw = getIntent().getIntExtra("pay_channel", -1);
      b(new com.tencent.mm.plugin.luckymoney.b.x("v1.0", (byte)0), false);
      com.tencent.mm.plugin.luckymoney.a.a.bat();
      this.kLu = com.tencent.mm.plugin.luckymoney.a.a.bau().baS();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LuckyMoneyPrepareUI", "type=" + this.mType + ", fromAppPanel=" + this.kTu + ", config " + this.kLu);
      initView();
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
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.kMk != null) && (this.kMk.isShown()))
    {
      Wq();
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected final void z(View paramView, final int paramInt)
  {
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.tenpay_num_keyboard));
    this.kMk = findViewById(a.f.tenpay_keyboard_layout);
    View localView = findViewById(a.f.tenpay_push_down);
    final EditText localEditText = (EditText)paramView.findViewById(a.f.lucky_money_et);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.kMk == null)) {
      return;
    }
    com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText(localEditText);
    localEditText.setOnFocusChangeListener(new SnsLuckyMoneyPrepareUI.10(this, paramInt, localEditText));
    localEditText.setOnClickListener(new SnsLuckyMoneyPrepareUI.12(this, paramInt, localEditText));
    paramView = (TextView)paramView.findViewById(a.f.lucky_money_amount_unit_title);
    if (paramView != null) {
      paramView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if ((!SnsLuckyMoneyPrepareUI.this.kMk.isShown()) && (!this.eCF))
          {
            SnsLuckyMoneyPrepareUI.k(SnsLuckyMoneyPrepareUI.this);
            SnsLuckyMoneyPrepareUI.b(SnsLuckyMoneyPrepareUI.this, paramInt);
          }
          while (!this.eCF) {
            return;
          }
          SnsLuckyMoneyPrepareUI.this.Wq();
          ((InputMethodManager)SnsLuckyMoneyPrepareUI.this.mController.tml.getSystemService("input_method")).showSoftInput(localEditText, 0);
        }
      });
    }
    localView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        SnsLuckyMoneyPrepareUI.this.Wq();
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */