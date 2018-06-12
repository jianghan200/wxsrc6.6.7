package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class MailAddrProfileUI
  extends MMPreference
{
  private f eOE;
  private String kCs;
  private boolean mgR;
  private String name;
  
  public final int Ys()
  {
    return R.o.mail_receiver_info;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (paramPreference.mKey.equals("mail_compose_btn"))
    {
      paramf = new Intent(this, ComposeUI.class);
      paramf.putExtra("composeType", 4);
      paramf.putExtra("toList", new String[] { this.name + " " + this.kCs });
      startActivity(paramf);
      finish();
    }
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.invite_friend_title);
    this.eOE = this.tCL;
    ((KeyValuePreference)this.eOE.ZZ("mail_receiver_info_name")).setSummary(this.name);
    ((KeyValuePreference)this.eOE.ZZ("mail_receiver_info_addr")).setSummary(getIntent().getStringExtra("addr"));
    Preference localPreference = this.eOE.ZZ("mail_compose_btn");
    if (!this.mgR) {
      this.eOE.c(localPreference);
    }
    setBackBtn(new MailAddrProfileUI.1(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.name = getIntent().getStringExtra("name");
    this.kCs = getIntent().getStringExtra("addr");
    this.mgR = getIntent().getBooleanExtra("can_compose", false);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/MailAddrProfileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */