package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankRemitSelectArriveTimeUI
  extends MMPreference
{
  private f eOE;
  private List<EnterTimeParcel> mwp;
  private List<Preference> mwq;
  private int mwr;
  
  public final int Ys()
  {
    return a.g.bank_remit_select_arrive_time_ui;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = this.mwq.iterator();
    while (paramf.hasNext())
    {
      Preference localPreference = (Preference)paramf.next();
      if (localPreference == paramPreference) {
        localPreference.setWidgetLayoutResource(a.g.mm_preference_radio_checked);
      } else {
        localPreference.setWidgetLayoutResource(a.g.mm_preference_radio_unchecked);
      }
    }
    this.eOE.notifyDataSetChanged();
    paramf = (EnterTimeParcel)paramPreference.getExtras().getParcelable("arrive_time");
    if (paramf == null)
    {
      x.i("MicroMsg.BankRemitSelectArriveTimeUI", "is header");
      return false;
    }
    paramPreference = new Intent();
    paramPreference.putExtra("key_enter_time_scene", paramf.mun);
    setResult(-1, paramPreference);
    finish();
    return false;
  }
  
  protected final void initView()
  {
    this.eOE = this.tCL;
    if ((this.mwp != null) && (this.mwp.size() > 0))
    {
      this.mwq = new ArrayList();
      int i = 0;
      if (i < this.mwp.size())
      {
        EnterTimeParcel localEnterTimeParcel = (EnterTimeParcel)this.mwp.get(i);
        x.d("MicroMsg.BankRemitSelectArriveTimeUI", "enter scene: %d", new Object[] { Integer.valueOf(localEnterTimeParcel.mun) });
        Preference localPreference = new Preference(this);
        localPreference.setLayoutResource(a.g.bank_remit_select_arrive_preference);
        localPreference.tDr = false;
        localPreference.setKey(localEnterTimeParcel.mun);
        localPreference.setTitle(localEnterTimeParcel.muo);
        if (localEnterTimeParcel.mun == this.mwr) {
          localPreference.setWidgetLayoutResource(a.g.mm_preference_radio_checked);
        }
        for (;;)
        {
          if (localEnterTimeParcel.muq == 0)
          {
            if (!bi.oW(localEnterTimeParcel.mup)) {
              localPreference.setSummary(localEnterTimeParcel.mup);
            }
            localPreference.setEnabled(false);
          }
          localPreference.getExtras().putParcelable("arrive_time", localEnterTimeParcel);
          this.eOE.a(localPreference);
          this.mwq.add(localPreference);
          i += 1;
          break;
          localPreference.setWidgetLayoutResource(a.g.mm_preference_radio_unchecked);
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.bank_remit_common_bg)));
    paramBundle = getSupportActionBar().getCustomView();
    if (paramBundle != null)
    {
      View localView = paramBundle.findViewById(a.f.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(a.c.black));
      }
      paramBundle = paramBundle.findViewById(16908308);
      if ((paramBundle != null) && ((paramBundle instanceof TextView))) {
        ((TextView)paramBundle).setTextColor(getResources().getColor(a.c.black));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.setStatusBarColor(getResources().getColor(a.c.bank_remit_common_bg));
    }
    BankRemitBaseUI.E(this);
    this.mController.contentView.setFitsSystemWindows(true);
    setMMTitle(a.i.bank_remit_select_arrive_time_title);
    this.mwp = getIntent().getParcelableArrayListExtra("key_arrive_time_parcel_list");
    this.mwr = getIntent().getIntExtra("key_select_arrive_time", -1);
    initView();
    findViewById(16908298).setBackgroundColor(getResources().getColor(a.c.bank_remit_common_bg));
    setBackBtn(new BankRemitSelectArriveTimeUI.1(this), a.h.actionbar_icon_dark_back);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitSelectArriveTimeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */