package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.a.f;
import com.tencent.mm.plugin.subapp.b;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.protocal.c.bja;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.io.IOException;

public class ContactSearchUI
  extends MMActivity
  implements e
{
  private ProgressDialog eHw = null;
  private EditText otx;
  
  private static int On(String paramString)
  {
    int i = 3;
    if (bi.WE(paramString)) {
      i = 1;
    }
    do
    {
      return i;
      if (bi.WF(paramString)) {
        return 2;
      }
    } while (!bi.WG(paramString));
    return 3;
  }
  
  private void bGA()
  {
    Object localObject = this.otx.getText().toString().trim();
    if ((localObject == null) || (((String)localObject).length() <= 0))
    {
      com.tencent.mm.ui.base.h.i(this.mController.tml, R.l.verify_input_null_tip, R.l.app_tip);
      return;
    }
    x.d("MicroMsg.ContactSearchUI", "always search contact from internet!!!");
    localObject = new f((String)localObject, 1);
    au.DF().a((com.tencent.mm.ab.l)localObject, 0);
    ActionBarActivity localActionBarActivity = this.mController.tml;
    getString(R.l.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(R.l.address_searching), true, new ContactSearchUI.5(this, (f)localObject));
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.ContactSearchUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (b.ezo.b(this.mController.tml, paramInt1, paramInt2, paramString)) {}
    Intent localIntent;
    do
    {
      return;
      if ((paramInt1 == 4) && (paramInt2 == -4))
      {
        com.tencent.mm.ui.base.h.i(this.mController.tml, R.l.address_not_found, R.l.app_tip);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Toast.makeText(this, getString(R.l.fmt_search_err_no_code), 0).show();
        x.w("MicroMsg.ContactSearchUI", getString(R.l.fmt_search_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
        return;
      }
      paramString = ((f)paraml).bcS();
      if (paramString.rHb > 0)
      {
        paraml = new Intent();
        paraml.setClass(this, ContactSearchResultUI.class);
        try
        {
          paraml.putExtra("result", paramString.toByteArray());
          startActivity(paraml);
          return;
        }
        catch (IOException paramString)
        {
          x.printErrStackTrace("MicroMsg.ContactSearchUI", paramString, "", new Object[0]);
          return;
        }
      }
      paraml = ab.a(paramString.rvi);
      localIntent = new Intent();
      ((i)g.l(i.class)).a(localIntent, paramString, On(this.otx.getText().toString().trim()));
    } while (bi.oV(paraml).length() <= 0);
    if ((paramString.rTe & 0x8) > 0) {
      com.tencent.mm.plugin.report.service.h.mEJ.k(10298, paraml + "," + On(this.otx.getText().toString().trim()));
    }
    d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
  }
  
  protected final int getLayoutId()
  {
    return R.i.contact_search;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.contact_search_title);
    this.otx = ((EditText)findViewById(R.h.contact_search_account_et));
    this.otx.addTextChangedListener(new ContactSearchUI.1(this));
    this.otx.setImeOptions(3);
    this.otx.setOnEditorActionListener(new ContactSearchUI.2(this));
    addTextOptionMenu(0, getString(R.l.app_find), new ContactSearchUI.3(this));
    setBackBtn(new ContactSearchUI.4(this));
    if (getIntent().getBooleanExtra("from_webview", false))
    {
      String str = getIntent().getStringExtra("userName");
      this.otx.setText(str);
      bGA();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  protected void onPause()
  {
    au.DF().b(106, this);
    super.onPause();
  }
  
  protected void onResume()
  {
    au.DF().a(106, this);
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */