package com.tencent.mm.plugin.account.bind.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.i;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMWizardActivity;

public class BindMContactStatusUI
  extends MMWizardActivity
{
  private ImageView eFS;
  private TextView eGl;
  private TextView eGm;
  private Button eGn;
  
  protected final int getLayoutId()
  {
    return a.g.bindmcontact_status;
  }
  
  protected final void initView()
  {
    this.eFS = ((ImageView)findViewById(a.f.bind_m_contact_status_state_icon));
    this.eGl = ((TextView)findViewById(a.f.bind_m_contact_status_bind_state_title));
    this.eGm = ((TextView)findViewById(a.f.bind_m_contact_status_bind_state));
    this.eGn = ((Button)findViewById(a.f.bind_m_contact_status_ok_btn));
    if (l.XC() == l.a.eKt)
    {
      this.eFS.setImageResource(a.i.mobile_binded_icon);
      String str2 = (String)g.Ei().DT().get(6, null);
      String str1;
      if (str2 != null)
      {
        str1 = str2;
        if (!str2.equals("")) {}
      }
      else
      {
        str1 = (String)g.Ei().DT().get(4097, null);
      }
      this.eGm.setText(getString(a.j.bind_mcontact_status_bind_ok));
      this.eGl.setText(getString(a.j.bind_mcontact_verify_mobile, new Object[] { str1 }));
    }
    for (;;)
    {
      this.eGn.setOnClickListener(new BindMContactStatusUI.1(this));
      return;
      this.eFS.setImageResource(a.i.mobile_unbind_icon);
      this.eGm.setText(a.j.bind_mcontact_unbind_ok);
      this.eGl.setText(a.j.bind_mcontact_unbind_ok);
      this.eGm.setVisibility(8);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.j.bind_mcontact_title_setting);
    initView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      DT(1);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/BindMContactStatusUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */