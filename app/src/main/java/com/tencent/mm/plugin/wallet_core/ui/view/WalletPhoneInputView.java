package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.mm.al.b;
import com.tencent.mm.al.b.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WalletPhoneInputView
  extends LinearLayout
{
  private int mMode = 0;
  private WalletFormView pzR;
  private WalletFormView pzS;
  private TenpaySecureEditText pzT;
  private Map<String, b.a> pzU;
  private String pzV = "";
  private String pzW = "";
  private boolean pzX = true;
  
  public WalletPhoneInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
    b(paramContext, paramAttributeSet, -1);
  }
  
  public WalletPhoneInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
    b(paramContext, paramAttributeSet, paramInt);
  }
  
  private void b(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.WalletPhoneInputViewAttrs, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(a.k.WalletPhoneInputViewAttrs_phoneHint, 0);
    if (paramInt != 0)
    {
      String str = paramContext.getString(paramInt);
      this.pzS.setHint(str);
    }
    paramInt = paramAttributeSet.getResourceId(a.k.WalletPhoneInputViewAttrs_phoneTitle, 0);
    if (paramInt != 0)
    {
      paramContext = paramContext.getString(paramInt);
      this.pzS.setTitleText(paramContext);
    }
  }
  
  private void bQK()
  {
    this.pzR.setText(this.pzV);
    this.pzT.setText(this.pzW);
  }
  
  private void bQL()
  {
    b.a locala = (b.a)this.pzU.get("86");
    this.pzW = locala.dYx;
    this.pzV = locala.dYy;
    bQK();
  }
  
  private void init(Context paramContext)
  {
    inflate(paramContext, a.g.wallet_phone_input_view_layout, this);
    this.pzR = ((WalletFormView)findViewById(a.f.phone_area_code_et));
    this.pzS = ((WalletFormView)findViewById(a.f.phone_number_et));
    this.pzR.setOnClickListener(new WalletPhoneInputView.1(this));
    this.pzT = ((TenpaySecureEditText)this.pzS.findViewById(a.f.prefix_input_et));
    this.pzT.setFixedHeaderText("+");
    if ((getContext() instanceof MMActivity))
    {
      this.pzS.setOnInfoIvClickListener(new WalletPhoneInputView.2(this));
      this.pzS.setLogicDelegate(new WalletPhoneInputView.3(this));
    }
    paramContext = b.E(getContext(), getContext().getString(a.i.country_code));
    this.pzU = new HashMap();
    paramContext = paramContext.iterator();
    while (paramContext.hasNext())
    {
      b.a locala = (b.a)paramContext.next();
      this.pzU.put(locala.dYx, locala);
    }
  }
  
  public final boolean bQM()
  {
    return this.mMode == 0;
  }
  
  public final void bQN()
  {
    this.mMode = 0;
    bQL();
    this.pzR.setVisibility(8);
    this.pzT.setVisibility(8);
  }
  
  public final void bQO()
  {
    this.mMode = 1;
    bQL();
    this.pzR.setVisibility(0);
    this.pzT.setVisibility(0);
    this.pzT.addTextChangedListener(new WalletPhoneInputView.4(this));
    this.pzT.setOnFocusChangeListener(new WalletPhoneInputView.5(this));
  }
  
  public final boolean d(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 65521)
    {
      String str;
      if (paramInt2 == 100)
      {
        str = paramIntent.getStringExtra("country_name");
        paramIntent = paramIntent.getStringExtra("couttry_code");
        x.i("MicroMsg.WalletPhoneInputView", "countryName: %s, countryCode: %s", new Object[] { this.pzV, this.pzW });
        if ((bi.oW(str)) || (bi.oW(paramIntent))) {
          x.i("MicroMsg.WalletPhoneInputView", "cancel pick");
        }
      }
      else
      {
        return true;
      }
      this.pzV = str;
      this.pzW = paramIntent;
      this.pzX = false;
      bQK();
      this.pzT.clearFocus();
      return true;
    }
    return false;
  }
  
  public String getCountryCode()
  {
    if (bQM()) {
      return "86";
    }
    return this.pzT.getText().toString();
  }
  
  public WalletFormView getPhoneNumberEt()
  {
    return this.pzS;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */