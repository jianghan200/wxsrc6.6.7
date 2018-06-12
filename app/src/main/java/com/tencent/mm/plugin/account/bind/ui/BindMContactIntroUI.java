package com.tencent.mm.plugin.account.bind.ui;

import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.o;
import com.tencent.mm.al.b;
import com.tencent.mm.al.b.a;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.plugin.account.a.e;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.i;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.account.friend.a.y;
import com.tencent.mm.plugin.account.friend.ui.i;
import com.tencent.mm.protocal.c.or;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;

public class BindMContactIntroUI
  extends MMWizardActivity
  implements com.tencent.mm.ab.e
{
  private String bTi;
  private ImageView eFS;
  private TextView eFT;
  private TextView eFU;
  private Button eFV;
  private Button eFW;
  private l.a eFX;
  private i eFY;
  private String eFZ = null;
  private boolean eFl = false;
  private String eGa = null;
  private boolean eGb = false;
  private boolean eGc = false;
  private int eGd = 0;
  private p tipDialog = null;
  
  private void WL()
  {
    YC();
    if (this.eGc)
    {
      cancel();
      finish();
      return;
    }
    DT(1);
  }
  
  private void cg(boolean paramBoolean)
  {
    Intent localIntent = new Intent(this, BindMContactUI.class);
    localIntent.putExtra("is_bind_for_safe_device", this.eGb);
    localIntent.putExtra("is_bind_for_contact_sync", this.eGc);
    localIntent.putExtra("is_bind_for_change_mobile", paramBoolean);
    Object localObject = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
    if (!bi.oW((String)localObject))
    {
      localObject = b.j(this, (String)localObject, getString(a.j.country_code));
      if (localObject != null)
      {
        localIntent.putExtra("country_name", ((b.a)localObject).dYy);
        localIntent.putExtra("couttry_code", ((b.a)localObject).dYx);
      }
    }
    D(this, localIntent);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BindMContactIntroUI", "summerunbind onSceneEnd type: " + paraml.getType() + " errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((paraml.getType() == 132) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.tipDialog != null)
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
      }
      if (((com.tencent.mm.plugin.account.friend.a.x)paraml).Oh() == 3)
      {
        ((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).removeSelfAccount(this);
        if (bi.oW(this.eGa)) {
          break label159;
        }
        h.a(this, this.eGa, "", getString(a.j.app_i_known), new BindMContactIntroUI.26(this));
      }
    }
    label159:
    label391:
    label623:
    label965:
    label1025:
    for (;;)
    {
      return;
      D(this, new Intent(this, BindMContactStatusUI.class));
      return;
      int i;
      if (com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramString)) {
        i = 1;
      }
      for (;;)
      {
        if (i == 0) {
          break label391;
        }
        if (this.tipDialog == null) {
          break;
        }
        this.tipDialog.dismiss();
        this.tipDialog = null;
        return;
        i = 0;
        switch (paramInt2)
        {
        default: 
          break;
        case -214: 
          paramString = com.tencent.mm.h.a.eV(paramString);
          if (paramString != null) {
            paramString.a(this, null, null);
          }
          i = 1;
          break;
        case -34: 
          Toast.makeText(this, a.j.bind_mcontact_err_freq_limit, 0).show();
          i = 1;
          break;
        case -43: 
          Toast.makeText(this, a.j.bind_mcontact_err_binded, 0).show();
          i = 1;
          break;
        case -41: 
          Toast.makeText(this, a.j.bind_mcontact_err_format, 0).show();
          i = 1;
          break;
        case -35: 
          Toast.makeText(this, a.j.bind_mcontact_err_binded_by_other, 0).show();
          i = 1;
          break;
        case -36: 
          Toast.makeText(this, a.j.bind_mcontact_err_unbinded_notbinded, 0).show();
          i = 1;
        }
      }
      if (paraml.getType() == 254)
      {
        if (this.tipDialog != null)
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.eGa = ((y)paraml).XM().rsV;
          this.eFZ = ((y)paraml).XL();
          if (!bi.oW(this.eGa))
          {
            paramString = new com.tencent.mm.plugin.account.friend.a.x(this.bTi, 3, "", 0, "");
            com.tencent.mm.kernel.g.DF().a(paramString, 0);
            paraml = this.mController.tml;
            getString(a.j.app_tip);
            this.tipDialog = h.a(paraml, getString(a.j.bind_mcontact_unbinding), true, new BindMContactIntroUI.27(this, paramString));
            return;
          }
          paramString = new r(2);
          com.tencent.mm.kernel.g.DF().a(paramString, 0);
          return;
        }
        if (paramInt2 == -3)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BindMContactIntroUI", "summerunbind MMFunc_QueryHasPasswd err and set psw");
          h.a(this.mController.tml, getString(a.j.settings_unbind_tips_set_user_password), null, getString(a.j.settings_unbind_tips_unbind_btn), getString(a.j.settings_unbind_tips_cancel_btn), true, new BindMContactIntroUI.2(this), new BindMContactIntroUI.3(this));
        }
      }
      else if (paraml.getType() == 255)
      {
        if (this.tipDialog != null)
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
        }
        if (paramInt2 != 0) {
          break label965;
        }
        paramString = new com.tencent.mm.plugin.account.friend.a.x(this.bTi, 3, "", 0, "");
        com.tencent.mm.kernel.g.DF().a(paramString, 0);
        ActionBarActivity localActionBarActivity = this.mController.tml;
        getString(a.j.app_tip);
        this.tipDialog = h.a(localActionBarActivity, getString(a.j.bind_mcontact_unbinding), true, new BindMContactIntroUI.10(this, paramString));
      }
      for (;;)
      {
        if (paraml.getType() != 132) {
          break label1025;
        }
        if (this.tipDialog != null)
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
        }
        if (((com.tencent.mm.plugin.account.friend.a.x)paraml).Oh() != 3) {
          break;
        }
        if (paramInt2 != -82) {
          break label1027;
        }
        h.a(this, a.j.setting_unbind_qq_err_one_left, a.j.app_tip, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
        });
        return;
        if (paramInt2 == -81)
        {
          h.a(this, a.j.setting_unbind_qq_err_norbindqq, a.j.app_tip, new BindMContactIntroUI.4(this));
          break label623;
        }
        if (paramInt2 == -82)
        {
          h.a(this, a.j.setting_unbind_qq_err_one_left, a.j.app_tip, new BindMContactIntroUI.5(this));
          break label623;
        }
        if (paramInt2 == -83)
        {
          h.a(this, a.j.setting_unbind_qq_err_has_unbind, a.j.app_tip, new BindMContactIntroUI.6(this));
          break label623;
        }
        if (paramInt2 == -84)
        {
          h.a(this, a.j.setting_unbind_qq_err_hasbinded, a.j.app_tip, new BindMContactIntroUI.7(this));
          break label623;
        }
        if (paramInt2 == -85)
        {
          h.a(this, a.j.setting_unbind_mobile_err_bindedbyother, a.j.app_tip, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
          });
          break label623;
        }
        if (paramInt2 != -86) {
          break label623;
        }
        h.a(this, a.j.setting_unbind_qq_err_qmail, a.j.app_tip, new BindMContactIntroUI.9(this));
        break label623;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BindMContactIntroUI", "summerunbind old err_password");
        h.a(this.mController.tml, getString(a.j.settings_unbind_tips_set_user_password), null, getString(a.j.settings_unbind_tips_unbind_btn), getString(a.j.settings_unbind_tips_cancel_btn), true, new BindMContactIntroUI.11(this), new BindMContactIntroUI.13(this));
      }
    }
    label1027:
    if (paramInt2 == -83)
    {
      h.a(this, a.j.setting_unbind_qq_err_has_unbind, a.j.app_tip, new BindMContactIntroUI.15(this));
      return;
    }
    if (paramInt2 == -84)
    {
      h.a(this, a.j.setting_unbind_qq_err_hasbinded, a.j.app_tip, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
      });
      return;
    }
    if (paramInt2 == -85)
    {
      h.a(this, a.j.setting_unbind_mobile_err_bindedbyother, a.j.app_tip, new BindMContactIntroUI.17(this));
      return;
    }
    Toast.makeText(this, getString(a.j.bind_mcontact_unbind_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  protected final int getLayoutId()
  {
    return a.g.bindmcontact_intro;
  }
  
  protected final void initView()
  {
    this.eGb = getIntent().getBooleanExtra("is_bind_for_safe_device", false);
    this.eGc = getIntent().getBooleanExtra("is_bind_for_contact_sync", false);
    this.eFl = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.eGd = getIntent().getIntExtra("key_upload_scene", 0);
    this.eFX = com.tencent.mm.plugin.account.friend.a.l.XC();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BindMContactIntroUI", "state " + this.eFX);
    this.bTi = ((String)com.tencent.mm.kernel.g.Ei().DT().get(6, null));
    if ((this.bTi == null) || (this.bTi.equals(""))) {
      this.bTi = ((String)com.tencent.mm.kernel.g.Ei().DT().get(4097, null));
    }
    this.eFS = ((ImageView)findViewById(a.f.setting_bind_moblie_state_icon));
    this.eFT = ((TextView)findViewById(a.f.setting_bind_mobile_msg_title));
    this.eFU = ((TextView)findViewById(a.f.setting_bind_mobile_msg_hit));
    this.eFV = ((Button)findViewById(a.f.setting_bind_mobile_main_btn));
    this.eFW = ((Button)findViewById(a.f.setting_bind_mobile_sub_btn));
    this.eFV.setOnClickListener(new BindMContactIntroUI.1(this));
    this.eFW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        BindMContactIntroUI.b(BindMContactIntroUI.this);
      }
    });
    if (getIntent().getBooleanExtra("skip", false)) {
      addTextOptionMenu(0, getString(a.j.app_ignore_it), new BindMContactIntroUI.21(this));
    }
    for (;;)
    {
      if ((this.eFX == l.a.eKu) || (this.eFX == l.a.eKt))
      {
        String str = com.tencent.mm.k.g.AT().getValue("ShowUnbindPhone");
        int i = 2;
        if (!bi.oW(str)) {
          i = bi.WU(str);
        }
        if (i != 0) {
          addIconOptionMenu(1, a.e.mm_title_btn_menu, new BindMContactIntroUI.23(this, i));
        }
      }
      switch (BindMContactIntroUI.20.eGg[this.eFX.ordinal()])
      {
      default: 
        return;
        setBackBtn(new BindMContactIntroUI.22(this));
      }
    }
    showOptionMenu(1, false);
    this.eFS.setImageResource(a.i.mobile_unbind_icon);
    this.eFU.setVisibility(0);
    this.eFW.setVisibility(8);
    this.eFT.setText(a.j.bind_mcontact_hint_title);
    this.eFU.setText(a.j.bind_mcontact_hint);
    this.eFV.setText(a.j.bind_mcontact_bind_btn_text);
    return;
    showOptionMenu(1, false);
    this.eFS.setImageResource(a.i.mobile_unbind_icon);
    this.eFU.setVisibility(0);
    this.eFW.setVisibility(0);
    this.eFT.setText(String.format(getString(a.j.bind_mcontact_verify_mobile), new Object[] { this.bTi }));
    this.eFU.setText(a.j.bind_mcontact_unverify_mobile);
    this.eFV.setText(a.j.bind_mcontact_verify_btn_text);
    this.eFW.setText(a.j.bind_mcontact_del_btn_text);
    return;
    showOptionMenu(1, true);
    this.eFS.setImageResource(a.i.mobile_binded_icon);
    this.eFU.setVisibility(0);
    this.eFW.setVisibility(0);
    this.eFT.setText(String.format(getString(a.j.bind_mcontact_verify_mobile), new Object[] { this.bTi }));
    this.eFU.setText(a.j.bind_mcontact_change_hint);
    this.eFV.setText(a.j.bind_mcontact_upload_btn_text);
    this.eFW.setText(a.j.bind_mcontact_change_mobile_text);
    return;
    showOptionMenu(1, true);
    this.eFS.setImageResource(a.i.mobile_binded_icon);
    this.eFU.setVisibility(0);
    this.eFW.setVisibility(0);
    this.eFT.setText(String.format(getString(a.j.bind_mcontact_verify_mobile), new Object[] { this.bTi }));
    this.eFU.setText(a.j.bind_mcontact_change_hint);
    this.eFV.setText(a.j.bind_mcontact_friend_btn_text);
    this.eFW.setText(a.j.bind_mcontact_change_mobile_text);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BindMContactIntroUI", "summerunbind onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    }
    do
    {
      return;
    } while (paramInt2 != -1);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BindMContactIntroUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again mobile: " + this.bTi);
    paramIntent = new y(y.eKQ);
    com.tencent.mm.kernel.g.DF().a(paramIntent, 0);
    getString(a.j.app_tip);
    this.tipDialog = h.a(this, getString(a.j.app_loading), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface) {}
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.DF().a(132, this);
    com.tencent.mm.kernel.g.DF().a(255, this);
    com.tencent.mm.kernel.g.DF().a(254, this);
    setMMTitle(a.j.bind_mcontact_title_setting);
  }
  
  public void onDestroy()
  {
    com.tencent.mm.kernel.g.DF().b(132, this);
    com.tencent.mm.kernel.g.DF().b(255, this);
    com.tencent.mm.kernel.g.DF().b(254, this);
    if (this.eFY != null)
    {
      getContentResolver().unregisterContentObserver(this.eFY);
      this.eFY.recycle();
    }
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      WL();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i;
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0)) {
      if (paramArrayOfInt == null)
      {
        i = -1;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BindMContactIntroUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bi.cjd() });
      }
    }
    do
    {
      return;
      i = paramArrayOfInt.length;
      break;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BindMContactIntroUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      switch (paramInt)
      {
      default: 
        return;
      }
    } while ((paramArrayOfInt[0] != 0) || (this.eFY == null));
    this.eFY.Yh();
  }
  
  protected void onResume()
  {
    super.onResume();
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */