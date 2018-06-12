package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.luckymoney.appbrand.a.g;
import com.tencent.mm.plugin.luckymoney.appbrand.a.h.a;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView;
import com.tencent.mm.plugin.luckymoney.ui.f;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tencent.mm.wallet_core.ui.e;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(19)
public class WxaLuckyMoneyPrepareUI
  extends WxaLuckyMoneyBaseUI
  implements c, f
{
  private TextView hXQ = null;
  private TextView hXT;
  private h.a kLx = h.a.kKZ;
  private a kMe = null;
  private LuckyMoneyNumInputView kMf = null;
  private WxaLuckyMoneyMoneyInputView kMg = null;
  private LuckyMoneyTextInputView kMh = null;
  private Button kMi = null;
  private LinearLayout kMj;
  protected View kMk;
  private TextView kMl;
  private MMScrollView kMm;
  private TextView kMn;
  private int kMo = 0;
  private com.tencent.mm.plugin.luckymoney.ui.a kMp = new com.tencent.mm.plugin.luckymoney.ui.a();
  protected MyKeyboardWindow mKeyboard;
  
  public final void Ga(String paramString)
  {
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = getString(a.i.wallet_unknown_err);
    }
    com.tencent.mm.ui.base.h.a(this, str, null, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
      }
    });
  }
  
  protected final void Wq()
  {
    if ((this.kMk != null) && (this.kMk.isShown())) {
      this.kMk.setVisibility(8);
    }
  }
  
  public final MMActivity baA()
  {
    return this;
  }
  
  public final void baB() {}
  
  public final void baD()
  {
    int i;
    double d2;
    double d1;
    if ((this.kMg.baC() != 3) && (this.kMf.baC() != 3))
    {
      i = this.kMf.getInput();
      d2 = this.kMg.getInput();
      if (this.kLx == h.a.kLa)
      {
        d2 *= i;
        d1 = this.kMg.getInput();
      }
    }
    for (;;)
    {
      boolean bool1 = this.kMp.bbv();
      Object localObject = g.kKP;
      boolean bool2;
      if (bool1)
      {
        x.i("MicroMsg.WxaLuckyMoneyPrepareUI", "has error");
        this.kMi.setClickable(false);
        this.kMi.setEnabled(false);
        localObject = ((g)localObject).kKV;
        if (bi.oW((String)localObject))
        {
          this.hXQ.setText(e.B(d2));
          return;
          if (i <= 0) {
            break label752;
          }
          d1 = this.kMg.getInput() / i;
        }
      }
      else if ((d2 == 0.0D) || (d1 == 0.0D))
      {
        bool2 = true;
      }
      for (;;)
      {
        if (bool2)
        {
          this.kMi.setClickable(false);
          this.kMi.setEnabled(false);
          break;
          if ((d2 > ((g)localObject).kKT) && (((g)localObject).kKT > 0.0D))
          {
            this.kMp.tn(getString(a.i.lucky_money_total_amount_max_limit_tips, new Object[] { Math.round(((g)localObject).kKT), bi.aG(((g)localObject).kKW, "") }));
            bool2 = true;
            continue;
          }
          if (d1 <= 0.0D) {
            break label746;
          }
          x.i("MicroMsg.WxaLuckyMoneyPrepareUI", "perAmount " + d1);
          if (this.kLx == h.a.kLa)
          {
            if ((d1 <= ((g)localObject).kKR) || (((g)localObject).kKR <= 0.0D)) {
              break label740;
            }
            this.kMp.tn(getString(a.i.lucky_money_per_amount_max_limit_tips, new Object[] { Math.round(((g)localObject).kKR), bi.aG(((g)localObject).kKW, "") }));
            bool1 = true;
          }
        }
        for (;;)
        {
          label388:
          x.i("MicroMsg.WxaLuckyMoneyPrepareUI", "furtherCheckHasErr:" + bool1 + " for max value");
          bool2 = bool1;
          if (!bool1)
          {
            if (this.kLx != h.a.kLa) {
              break label622;
            }
            bool2 = bool1;
            if (d1 < ((g)localObject).kKS)
            {
              this.kMp.tn(getString(a.i.lucky_money_per_amount_min_limit_tips, new Object[] { e.A(((g)localObject).kKS), bi.aG(((g)localObject).kKW, "") }));
              bool2 = true;
            }
          }
          for (;;)
          {
            x.i("MicroMsg.WxaLuckyMoneyPrepareUI", "furtherCheckHasErr:" + bool2 + " for min value");
            break;
            if ((d1 <= ((g)localObject).kKU) || (((g)localObject).kKU <= 0.0D)) {
              break label740;
            }
            this.kMp.tn(getString(a.i.lucky_money_per_amount_max_limit_tips, new Object[] { Math.round(((g)localObject).kKU), bi.aG(((g)localObject).kKW, "") }));
            this.kMf.onError();
            this.kMg.onError();
            bool1 = true;
            break label388;
            label622:
            bool2 = bool1;
            if (d1 < 0.01D)
            {
              this.kMp.tn(getString(a.i.lucky_money_per_amount_min_limit_tips, new Object[] { "0.01", bi.aG(((g)localObject).kKW, "") }));
              this.kMf.onError();
              this.kMg.onError();
              bool2 = true;
            }
          }
          this.kMi.setClickable(true);
          this.kMi.setEnabled(true);
          break;
          this.hXQ.setText((String)localObject + e.A(d2));
          return;
          label740:
          bool1 = false;
        }
        label746:
        bool2 = false;
      }
      label752:
      d1 = 0.0D;
      continue;
      d1 = 0.0D;
      d2 = 0.0D;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.wxa_lucky_money_prepare_ui;
  }
  
  protected final void initView()
  {
    setBackBtn(new WxaLuckyMoneyPrepareUI.10(this));
    this.kMh = ((LuckyMoneyTextInputView)findViewById(a.f.lucky_money_wish_et));
    this.kMh.setHintText(getString(a.i.lucky_money_default_wish));
    Object localObject1 = getIntent().getStringExtra("defaultWishingWord");
    x.i("MicroMsg.WxaLuckyMoneyPrepareUI", "initView defaultWishingWord = %s", new Object[] { localObject1 });
    if (!bi.oW((String)localObject1)) {
      this.kMh.setHintText((String)localObject1);
    }
    this.kMi = ((Button)findViewById(a.f.lucky_money_prepare_btn));
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.tenpay_num_keyboard));
    this.kMk = findViewById(a.f.tenpay_keyboard_layout);
    this.hXT = ((TextView)findViewById(a.f.lucky_money_prepare_amount_tips));
    this.kMf = ((LuckyMoneyNumInputView)findViewById(a.f.lucky_money_num_et));
    this.kMg = ((WxaLuckyMoneyMoneyInputView)findViewById(a.f.lucky_money_amount_et));
    this.hXQ = ((TextView)findViewById(a.f.lucky_money_prepare_total_amount));
    this.kMm = ((MMScrollView)findViewById(a.f.lucky_money_sv));
    this.kMn = ((TextView)findViewById(a.f.lucky_money_prepare_notice_tips));
    this.kMj = ((LinearLayout)findViewById(a.f.lucky_money_range_ll));
    this.kMl = ((TextView)findViewById(a.f.lucky_money_range_result));
    setMMTitle(a.i.lucky_money_to_send_title);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (this.kLx == h.a.kKZ)
    {
      this.kMg.setTitle(getString(a.i.lucky_money_total_amount_title));
      this.kMg.setShowGroupIcon(true);
      this.kMg.setOnInputValidChangerListener(this);
      this.kMg.setHint(getString(a.i.lucky_money_money_hint));
      this.kMf.setOnInputValidChangerListener(this);
      this.kMf.setHint(getString(a.i.lucky_money_num_hint));
      this.kMf.setNum("");
      this.kMh.setOnInputValidChangerListener(this);
      localObject2 = (EditText)this.kMg.findViewById(a.f.lucky_money_et);
      localObject3 = (EditText)this.kMf.findViewById(a.f.lucky_money_et);
      e.setNoSystemInputOnEditText((EditText)localObject2);
      ((InputMethodManager)this.mController.tml.getSystemService("input_method")).showSoftInput((View)localObject2, 0);
      ((EditText)localObject2).addTextChangedListener(new WxaLuckyMoneyPrepareUI.17(this));
      ((EditText)localObject2).setOnClickListener(new WxaLuckyMoneyPrepareUI.2(this, (EditText)localObject2, (EditText)localObject3));
      ((EditText)localObject2).requestFocus();
      localObject4 = (TextView)this.kMg.findViewById(a.f.lucky_money_amount_unit_title);
      if (localObject4 != null) {
        ((TextView)localObject4).setOnClickListener(new WxaLuckyMoneyPrepareUI.3(this, (EditText)localObject2, (EditText)localObject3));
      }
      e.setNoSystemInputOnEditText((EditText)localObject3);
      ((InputMethodManager)this.mController.tml.getSystemService("input_method")).showSoftInput((View)localObject3, 0);
      ((EditText)localObject3).setOnClickListener(new WxaLuckyMoneyPrepareUI.4(this, (EditText)localObject2, (EditText)localObject3));
      ((MMEditText)this.kMh.findViewById(a.f.lucky_money_text)).setOnFocusChangeListener(new WxaLuckyMoneyPrepareUI.5(this, (EditText)localObject2, (EditText)localObject3));
      localObject2 = g.kKP;
      if (this.kLx != h.a.kKZ) {
        break label1020;
      }
      this.kMg.setMaxAmount(((g)localObject2).kKT);
    }
    int i;
    for (;;)
    {
      this.kMg.setMinAmount(((g)localObject2).kKS);
      this.kMf.setMaxNum(((g)localObject2).kKQ);
      localObject2 = h.a.kKZ;
      this.kMf.setMinNum(1);
      this.kMg.setMaxLen(12);
      Object localObject5 = getString(a.i.lucky_money_f2f_random_tip_prefix);
      Object localObject6 = getString(a.i.lucky_money_group_tips_change_to_fixed);
      localObject2 = getString(a.i.lucky_money_f2f_fixed_tip_prefix);
      localObject3 = getString(a.i.lucky_money_group_tips_change_to_random);
      localObject4 = new com.tencent.mm.plugin.wallet_core.ui.h(this);
      SpannableString localSpannableString = new SpannableString((String)localObject5 + (String)localObject6);
      localSpannableString.setSpan(localObject4, ((String)localObject5).length(), ((String)localObject5).length() + ((String)localObject6).length(), 33);
      localObject5 = new SpannableString((String)localObject2 + (String)localObject3);
      localObject6 = new com.tencent.mm.plugin.wallet_core.ui.h(this);
      ((SpannableString)localObject5).setSpan(localObject6, ((String)localObject2).length(), ((String)localObject2).length() + ((String)localObject3).length(), 33);
      ((com.tencent.mm.plugin.wallet_core.ui.h)localObject4).pvm = new WxaLuckyMoneyPrepareUI.14(this, (SpannableString)localObject5);
      ((com.tencent.mm.plugin.wallet_core.ui.h)localObject6).pvm = new WxaLuckyMoneyPrepareUI.15(this, localSpannableString);
      this.hXT.setMovementMethod(LinkMovementMethod.getInstance());
      this.hXT.setText(localSpannableString);
      this.hXT.setVisibility(0);
      this.kMi.setClickable(false);
      this.kMi.setEnabled(false);
      this.kMi.setOnClickListener(new WxaLuckyMoneyPrepareUI.11(this, (String)localObject1));
      this.kMp.a(this.kMf);
      this.kMp.a(this.kMg);
      this.kMp.a(this.kMh);
      localObject1 = (TextView)findViewById(a.f.lucky_money_prepare_error_tips);
      this.kMp.f((TextView)localObject1);
      if (this.kMm != null) {
        this.kMm.setOnTouchListener(new WxaLuckyMoneyPrepareUI.12(this));
      }
      this.kMg.setType(this.kLx);
      addIconOptionMenu(0, a.e.lucky_money_help_btn, new WxaLuckyMoneyPrepareUI.13(this));
      i = getIntent().getIntExtra("range", 0);
      x.i("MicroMsg.WxaLuckyMoneyPrepareUI", "initRange range = %d", new Object[] { Integer.valueOf(i) });
      this.kMj.setVisibility(8);
      if (i != 0) {
        break label1034;
      }
      this.kMo = 0;
      return;
      this.kMg.setTitle(getString(a.i.lucky_money_unit_amount_title));
      this.kMg.setShowGroupIcon(false);
      break;
      label1020:
      this.kMg.setMaxAmount(((g)localObject2).kKR);
    }
    label1034:
    if (i == 1)
    {
      this.kMo = 1;
      return;
    }
    localObject1 = new ArrayList();
    ((ArrayList)localObject1).add(getString(a.i.wxa_lucky_money_range_friend));
    ((ArrayList)localObject1).add(getString(a.i.wxa_lucky_money_range_public));
    this.kMj.setVisibility(0);
    this.kMl.setText((CharSequence)((ArrayList)localObject1).get(this.kMo));
    this.kMj.setOnClickListener(new WxaLuckyMoneyPrepareUI.16(this, (ArrayList)localObject1));
  }
  
  public void onBackPressed()
  {
    setResult(0, new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel}}"));
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    this.kMe = new d();
    this.kMe.a(this, getIntent());
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.kMp.clear();
    if (this.kMe != null) {
      this.kMe.onDestroy();
    }
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
  
  protected final void z(View paramView, int paramInt)
  {
    this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.tenpay_num_keyboard));
    this.kMk = findViewById(a.f.tenpay_keyboard_layout);
    View localView = findViewById(a.f.tenpay_push_down);
    EditText localEditText = (EditText)paramView.findViewById(a.f.lucky_money_et);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.kMk == null)) {
      return;
    }
    e.setNoSystemInputOnEditText(localEditText);
    localEditText.setOnFocusChangeListener(new WxaLuckyMoneyPrepareUI.6(this, paramInt, localEditText));
    localEditText.setOnClickListener(new WxaLuckyMoneyPrepareUI.7(this, paramInt, localEditText));
    TextView localTextView = (TextView)paramView.findViewById(a.f.lucky_money_amount_unit_title);
    if (localTextView != null) {
      localTextView.setOnClickListener(new WxaLuckyMoneyPrepareUI.8(this, localEditText, paramView, paramInt));
    }
    localView.setOnClickListener(new WxaLuckyMoneyPrepareUI.9(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */