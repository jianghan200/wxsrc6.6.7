package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.s.d;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.widget.a;
import com.tencent.mm.protocal.c.ej;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.a.c;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.y;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.lang.reflect.Method;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.ui.x
{
  private MMFormVerifyCodeInputView eRn;
  private TextView fAK;
  private ej gxF;
  private TextView gxG;
  private TextView gxH;
  AppBrandIDCardUI.a gxe;
  private LinearLayout gxf;
  private View gxg;
  private Button gxj;
  private ek gxx;
  private com.tencent.mm.ui.b mActionBarHelper;
  private MyKeyboardWindow mKeyboard;
  
  protected final void dealContentView(View paramView)
  {
    if ((this.gxe == null) || (this.gxe.anM() == null))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "idCardUILogic or idCardUILogic.getIDCardShowInfo() is null, err");
      return;
    }
    if ((this.gxe.anM().reO == null) || (this.gxe.anM().reO.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "sms.get(0) is null, err, return");
      return;
    }
    this.gxf = ((LinearLayout)paramView.findViewById(s.g.app_brand_idcard_verify_sms_layout));
    this.fAK = ((TextView)paramView.findViewById(s.g.app_brand_idcard_verify_sms_desc));
    this.gxG = ((TextView)paramView.findViewById(s.g.app_brand_idcard_verify_sms_phone_number));
    this.gxH = ((TextView)paramView.findViewById(s.g.app_brand_idcard_verify_sms_switch_phone));
    this.gxj = ((Button)paramView.findViewById(s.g.app_brand_idcard_show_confirm));
    this.eRn = ((MMFormVerifyCodeInputView)paramView.findViewById(s.g.app_brand_idcard_verify_sms_edit));
    this.mKeyboard = ((MyKeyboardWindow)paramView.findViewById(s.g.app_brand_idcard_verify_sms_input));
    this.gxg = y.gq(getContext()).inflate(s.h.actionbar_custom_area, null);
    this.gxg.setBackgroundColor(getResources().getColor(s.d.action_bar_color));
    this.mActionBarHelper = new com.tencent.mm.ui.b(this.gxg);
    paramView = new LinearLayout.LayoutParams(-1, a.cM(getActivity()));
    this.gxf.addView(this.gxg, 0, paramView);
    this.gxx = this.gxe.anM();
    this.mActionBarHelper.setTitle(this.gxx.title);
    this.mActionBarHelper.b(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        if (b.a(b.this) != null) {
          b.a(b.this).back();
        }
      }
    });
    this.fAK.setText(this.gxx.desc);
    this.gxF = ((ej)this.gxx.reO.get(0));
    this.gxG.setText(((ej)this.gxx.reO.get(0)).reN);
    if (this.gxx.reO.size() > 1)
    {
      this.gxH.setVisibility(0);
      this.gxH.setOnClickListener(new b.2(this));
      label380:
      this.eRn.setVisibility(0);
      this.eRn.setSendSmsBtnClickListener(new b.3(this));
      this.eRn.addTextChangedListener(new b.4(this));
      paramView = this.eRn.getContentEditText();
      if (paramView != null)
      {
        if (Build.VERSION.SDK_INT < 21) {
          break label559;
        }
        paramView.setShowSoftInputOnFocus(false);
      }
      label443:
      if ((this.eRn.getText() == null) || (this.eRn.getText().toString().length() <= 0)) {
        break label755;
      }
      this.gxj.setEnabled(true);
    }
    for (;;)
    {
      this.gxj.setVisibility(0);
      this.gxj.setOnClickListener(new b.5(this));
      this.mKeyboard.setXMode(0);
      this.mKeyboard.setInputEditText(this.eRn.getContentEditText());
      if (Build.VERSION.SDK_INT < 14) {
        break;
      }
      paramView = new c();
      this.mKeyboard.setAccessibilityDelegate(paramView);
      return;
      this.gxH.setVisibility(8);
      break label380;
      try
      {
        label559:
        Method localMethod1 = EditText.class.getMethod("setShowSoftInputOnFocus", new Class[] { Boolean.TYPE });
        localMethod1.setAccessible(true);
        localMethod1.invoke(paramView, new Object[] { Boolean.valueOf(false) });
        localMethod1.setAccessible(false);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "setNoSystemInputOnEditText, setShowSoftInputOnFocus no such method, api level = %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
        try
        {
          Method localMethod2 = EditText.class.getMethod("setSoftInputShownOnFocus", new Class[] { Boolean.TYPE });
          localMethod2.setAccessible(true);
          localMethod2.invoke(paramView, new Object[] { Boolean.valueOf(false) });
          localMethod2.setAccessible(false);
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "setNoSystemInputOnEditText, reflect method [setSoftInputShownOnFocus], exp = %s", new Object[] { bi.i(localException) });
        }
        if ((paramView.getContext() == null) || (!(paramView.getContext() instanceof MMActivity))) {
          break label443;
        }
        ((MMActivity)paramView.getContext()).hideVKB(paramView);
      }
      catch (Exception paramView)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "setNoSystemInputOnEditText, reflect method [setShowSoftInputOnFocus], exp = %s", new Object[] { bi.i(paramView) });
      }
      break label443;
      label755:
      this.gxj.setEnabled(false);
    }
  }
  
  protected final int getLayoutId()
  {
    return s.h.app_brand_idcard_verify_sms_ui;
  }
  
  public final boolean noActionBar()
  {
    return true;
  }
  
  public final void onResume()
  {
    super.onResume();
    if (isSupportNavigationSwipeBack())
    {
      getContentView().setVisibility(0);
      getSwipeBackLayout().setEnableGesture(true);
    }
  }
  
  public final void onSwipeBack()
  {
    if (this.gxe != null)
    {
      this.gxe.onSwipeBack();
      getContentView().setVisibility(8);
      if (isSupportNavigationSwipeBack()) {
        getSwipeBackLayout().setEnableGesture(false);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/autofill/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */