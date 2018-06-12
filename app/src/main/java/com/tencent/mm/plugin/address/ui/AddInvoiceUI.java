package com.tencent.mm.plugin.address.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.address.model.i;
import com.tencent.mm.protocal.c.alj;
import com.tencent.mm.protocal.c.big;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;
import java.util.LinkedList;

public class AddInvoiceUI
  extends MMActivity
  implements e, InvoiceEditView.c
{
  private int GG = 0;
  private String bXd = "";
  private TextView ePz;
  private Dialog eXG = null;
  private int eYg = 0;
  private Button eYh = null;
  private Button eYi = null;
  private TextView eYj;
  private TextView eYk;
  private TextView eYl = null;
  private InvoiceEditView eYm;
  private InvoiceEditView eYn;
  private InvoiceEditView eYo;
  private InvoiceEditView eYp;
  private InvoiceEditView eYq;
  private InvoiceEditView eYr;
  private InvoiceEditView eYs;
  private InvoiceEditView eYt;
  private com.tencent.mm.plugin.q.a.b eYu = null;
  private com.tencent.mm.plugin.q.a.b eYv = new com.tencent.mm.plugin.q.a.b();
  private boolean eYw = false;
  private boolean eYx = false;
  
  private boolean ZB()
  {
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool2 = true;
    boolean bool1;
    if (((this.eYi != null) && (this.eYi.isActivated())) || ((this.eYu != null) && (this.eYu.type != null) && (this.eYu.type.equals("0"))))
    {
      this.eYp.setVisibility(0);
      this.eYq.setVisibility(0);
      this.eYr.setVisibility(0);
      this.eYs.setVisibility(0);
      this.eYt.setVisibility(0);
      this.eYn.setVisibility(0);
      this.eYo.setVisibility(8);
      bool1 = bool2;
      if (!this.eYi.isActivated())
      {
        bool1 = bool2;
        if (!this.eYu.type.equals("0")) {
          bool1 = false;
        }
      }
      if (!this.eYn.ZF())
      {
        if (this.eYn.getText().length() > 100) {
          ac(getString(R.l.invoice_title), 100);
        }
        bool1 = false;
      }
      if ((this.eYi == null) || (!this.eYi.isActivated()) || (this.eYn.getText().length() != 0)) {
        break label890;
      }
      bool1 = false;
    }
    label888:
    label890:
    for (;;)
    {
      enableOptionMenu(bool1);
      if (!this.eYp.ZF())
      {
        if (this.eYp.getText().length() > 0)
        {
          ViewStub localViewStub = (ViewStub)findViewById(R.h.viewstub_tax_tips_vs);
          if (localViewStub != null)
          {
            localViewStub.inflate();
            this.eYj = ((TextView)findViewById(R.h.viewstub_tax_tips_tv));
          }
          if (this.eYj != null) {
            this.eYj.setVisibility(0);
          }
        }
        if (!this.eYq.ZF())
        {
          if (this.eYq.getText().length() > 100) {
            ac(getString(R.l.invoice_company_address), 100);
          }
          bool1 = false;
        }
        if (!this.eYr.ZF())
        {
          if (this.eYr.getText().length() > 100) {
            ac(getString(R.l.invoice_phone_number), 100);
          }
          bool1 = false;
        }
        if (!this.eYs.ZF())
        {
          if (this.eYs.getText().length() > 100) {
            ac(getString(R.l.invoice_bank_name), 100);
          }
          bool1 = false;
        }
        if (this.eYt.ZF()) {
          break label888;
        }
        if (this.eYt.getText().length() > 48) {
          ac(getString(R.l.invoice_bank_number), 39);
        }
      }
      do
      {
        return false;
        if (this.eYj == null) {
          break;
        }
        this.eYj.setVisibility(8);
        break;
        if (((this.eYh != null) && (this.eYh.isActivated())) || ((this.eYu != null) && (this.eYu.type != null) && (this.eYu.type.equals("1"))))
        {
          this.eYp.setVisibility(8);
          this.eYq.setVisibility(8);
          this.eYr.setVisibility(8);
          this.eYs.setVisibility(8);
          this.eYt.setVisibility(8);
          this.eYn.setVisibility(8);
          this.eYo.setVisibility(0);
          bool1 = bool3;
          if (!this.eYh.isActivated())
          {
            bool1 = bool3;
            if (!this.eYu.type.equals("1")) {
              bool1 = false;
            }
          }
          if (!this.eYo.ZF())
          {
            if (this.eYo.getText().length() > 100) {
              ac(getString(R.l.invoice_title), 100);
            }
            bool1 = false;
          }
          bool2 = bool1;
          if (this.eYh != null)
          {
            bool2 = bool1;
            if (this.eYh.isActivated())
            {
              bool2 = bool1;
              if (this.eYo.getText().length() == 0) {
                bool2 = false;
              }
            }
          }
          enableOptionMenu(bool2);
          return bool2;
        }
        this.eYp.setVisibility(0);
        this.eYq.setVisibility(0);
        this.eYr.setVisibility(0);
        this.eYs.setVisibility(0);
        this.eYt.setVisibility(0);
        this.eYo.setVisibility(8);
        this.eYn.setVisibility(0);
        this.eYo.setVisibility(8);
        bool1 = bool4;
        if (this.eYh != null)
        {
          bool1 = bool4;
          if (!this.eYh.isActivated())
          {
            bool1 = bool4;
            if (this.eYi != null)
            {
              bool1 = bool4;
              if (!this.eYi.isActivated()) {
                bool1 = false;
              }
            }
          }
        }
        if (!this.eYn.ZF()) {
          bool1 = false;
        }
        if (!this.eYp.ZF()) {
          bool1 = false;
        }
        if (!this.eYq.ZF()) {
          bool1 = false;
        }
        if (!this.eYr.ZF()) {
          bool1 = false;
        }
        if (!this.eYs.ZF()) {
          bool1 = false;
        }
      } while (!this.eYt.ZF());
      return bool1;
      return bool1;
    }
  }
  
  private void ZD()
  {
    int k = 1;
    if (((this.eYg != 0) && (this.eYu != null) && (this.eYv.type != null) && (!this.eYv.type.equals("")) && (!this.eYv.type.equals(this.eYu.type))) || ((this.eYg == 0) && (this.eYv.type != null) && (!this.eYv.type.equals("")))) {}
    for (int i = 1;; i = 0)
    {
      int j = i;
      if (this.eYh != null)
      {
        j = i;
        if (this.eYi != null)
        {
          j = i;
          if (!this.eYh.isActivated())
          {
            j = i;
            if (!this.eYi.isActivated())
            {
              j = i;
              if (this.eYu == null) {
                j = 1;
              }
            }
          }
        }
      }
      if (this.eYn.ZG()) {
        j = 1;
      }
      if (this.eYo.ZG()) {
        j = 1;
      }
      if (this.eYp.ZG()) {
        j = 1;
      }
      if (this.eYq.ZG()) {
        j = 1;
      }
      if (this.eYr.ZG()) {
        j = 1;
      }
      if (this.eYs.ZG()) {
        j = 1;
      }
      if (this.eYt.ZG()) {}
      for (i = k;; i = j)
      {
        if (i != 0)
        {
          h.a(this, false, this.mController.tml.getString(R.l.invoice_back_modify_tip), "", this.mController.tml.getString(R.l.invoice_back_modify_confirm_tip), this.mController.tml.getString(R.l.invoice_back_cancel_tip), new AddInvoiceUI.5(this), null);
          return;
        }
        setResult(0);
        finish();
        return;
      }
    }
  }
  
  private void ac(String paramString, int paramInt)
  {
    h.a(this, getString(R.l.invoice_bytes_limit_error, new Object[] { paramString, Integer.valueOf(paramInt) }), getString(R.l.app_tip), false, null);
  }
  
  public final void ZC()
  {
    ZB();
  }
  
  public final void ZE()
  {
    h.a(this, getString(R.l.invoice_title_limit_error), getString(R.l.app_tip), false, null);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    Object localObject = null;
    x.i("MicroMsg.AddInvoiceUI", "errType " + paramInt1 + ",errCode " + paramInt2 + ",errMsg " + paramString);
    if (this.eXG != null) {
      this.eXG.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paraml.getType() == 1180)
      {
        paramString = ((i)paraml).eXJ;
        if ((paramString != null) && (paramString.siW != null) && (paramString.siW.size() > 0) && (paramString.siW.get(0) != null)) {
          this.GG = ((alj)paramString.siW.get(0)).group_id;
        }
        au.DF().b(1180, this);
        paramString = new com.tencent.mm.plugin.address.model.b();
        au.DF().a(paramString, 0);
      }
      while (paraml.getType() != 1191) {
        return;
      }
      au.DF().b(1191, this);
      if (this.eYw)
      {
        x.i("MicroMsg.AddInvoiceUI", "isLaunchFromWebview true...");
        paraml = this.eYv;
        if (paraml == null)
        {
          x.e("MicroMsg.InvoiceUtil", "invoiceObj == null");
          paramString = (String)localObject;
        }
        for (;;)
        {
          setResult(-1, paramString);
          finish();
          return;
          paramString = new Intent();
          paramString.putExtra("type", paraml.type);
          if ((paraml.type != null) && (paraml.type.equals("1")))
          {
            paramString.putExtra("title", paraml.knB);
          }
          else
          {
            paramString.putExtra("title", paraml.title);
            paramString.putExtra("tax_number", paraml.knC);
            paramString.putExtra("company_address", paraml.knI);
            paramString.putExtra("telephone", paraml.knG);
            paramString.putExtra("bank_name", paraml.knE);
            paramString.putExtra("bank_account", paraml.knD);
          }
        }
      }
      if ((this.eYg == 0) && (this.GG != 0))
      {
        paramString = new Intent();
        paramString.setClass(this, QrcodeInvoiceUI.class);
        paramString.putExtra("invoice_id", this.GG);
        startActivity(paramString);
        this.GG = 0;
      }
      finish();
      return;
    }
    h.a(this, getString(R.l.invoice_save_fail), getString(R.l.app_tip), false, null);
  }
  
  protected final int getLayoutId()
  {
    return R.i.mm_add_invoice_ui;
  }
  
  public final void initView()
  {
    this.GG = 0;
    MMScrollView localMMScrollView = (MMScrollView)findViewById(R.h.invoice_sv);
    if (localMMScrollView != null) {
      localMMScrollView.a(localMMScrollView, localMMScrollView);
    }
    this.eYh = ((Button)findViewById(R.h.invoice_person_btn));
    if (this.eYh != null) {
      this.eYh.setVisibility(0);
    }
    this.eYi = ((Button)findViewById(R.h.invoice_company_btn));
    if (this.eYi != null) {
      this.eYi.setVisibility(0);
    }
    if ((this.eYg == 0) && (this.eYi != null)) {
      this.eYi.setActivated(true);
    }
    if (this.eYi != null) {
      this.eYi.setOnTouchListener(new AddInvoiceUI.1(this));
    }
    if (this.eYh != null) {
      this.eYh.setOnTouchListener(new AddInvoiceUI.2(this));
    }
    this.eYm = ((InvoiceEditView)findViewById(R.h.invoice_title_type));
    this.eYn = ((InvoiceEditView)findViewById(R.h.invoice_title));
    this.eYo = ((InvoiceEditView)findViewById(R.h.invoice_person_title));
    this.eYp = ((InvoiceEditView)findViewById(R.h.invoice_tax_number));
    this.eYq = ((InvoiceEditView)findViewById(R.h.invoice_company_address));
    this.eYr = ((InvoiceEditView)findViewById(R.h.invoice_phone_number));
    this.eYs = ((InvoiceEditView)findViewById(R.h.invoice_bank_name));
    this.eYt = ((InvoiceEditView)findViewById(R.h.invoice_bank_number));
    this.eYp.eYS = true;
    this.eYp.eYL = true;
    this.eYp.setOnInputValidChangeListener(this);
    this.eYm.setOnInputValidChangeListener(this);
    this.eYn.setOnInputValidChangeListener(this);
    this.eYo.setOnInputValidChangeListener(this);
    this.eYq.setOnInputValidChangeListener(this);
    this.eYr.setOnInputValidChangeListener(this);
    this.eYs.setOnInputValidChangeListener(this);
    this.eYt.setOnInputValidChangeListener(this);
    if (this.eYg != 0)
    {
      this.ePz = ((TextView)findViewById(R.h.tip_tv));
      this.ePz.setVisibility(8);
      this.eYk = ((TextView)findViewById(R.h.type_tv));
      this.eYu = com.tencent.mm.plugin.address.a.a.Zw().jp(this.eYg);
      if ((this.eYu == null) || (this.eYu.type == null) || (!this.eYu.type.equals("0"))) {
        break label680;
      }
      this.eYk.setText(getString(R.l.invoice_company_type_title));
      this.eYk.setVisibility(0);
      this.eYi.setVisibility(8);
      this.eYh.setVisibility(8);
      if (this.eYu != null)
      {
        this.eYm.setValStr(this.eYu.type);
        this.eYn.setValStr(this.eYu.title);
        this.eYo.setValStr(this.eYu.knB);
        this.eYp.setValStr(this.eYu.knC);
        this.eYq.setValStr(this.eYu.knI);
        this.eYr.setValStr(this.eYu.knG);
        this.eYs.setValStr(this.eYu.knE);
        this.eYt.setValStr(this.eYu.knD);
      }
    }
    if ((this.eYx) || (this.eYw))
    {
      this.eYl = ((TextView)findViewById(R.h.jsapi_tips_tv));
      if (this.eYl != null) {
        this.eYl.setVisibility(0);
      }
    }
    for (;;)
    {
      setBackBtn(new AddInvoiceUI.3(this));
      a(0, getString(R.l.app_save), new AddInvoiceUI.4(this), s.b.tmX);
      enableOptionMenu(false);
      ZB();
      return;
      label680:
      if ((this.eYu == null) || (this.eYu.type == null) || (!this.eYu.type.equals("1"))) {
        break;
      }
      this.eYk.setText(getString(R.l.invoice_personal_type_title));
      break;
      this.eYl = ((TextView)findViewById(R.h.jsapi_tips_tv));
      if (this.eYl != null) {
        this.eYl.setVisibility(8);
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    do
    {
      do
      {
        return;
      } while (paramInt2 != -1);
      String str = paramIntent.getStringExtra("karea_result");
      if (!bi.oW(str))
      {
        x.d("MicroMsg.AddInvoiceUI", "AREA_RESULT:" + str);
        this.eYr.setValStr(str);
      }
      str = paramIntent.getStringExtra("kpost_code");
      if (!bi.oW(str))
      {
        x.d("MicroMsg.AddInvoiceUI", "post:" + str);
        this.eYr.setValStr(str);
      }
      this.bXd = paramIntent.getStringExtra("kwcode");
      return;
    } while (paramInt2 == -1);
    x.i("MicroMsg.AddInvoiceUI", "MallRecharge pay result : cancel");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.eYw = paramBundle.getBooleanExtra("launch_from_webview", false);
    this.eYx = paramBundle.getBooleanExtra("launch_from_invoicelist_webview", false);
    au.DF().a(1191, this);
    x.d("MicroMsg.AddInvoiceUI", "index Oncreate");
    this.eYv = new com.tencent.mm.plugin.q.a.b();
    this.eYg = getIntent().getIntExtra("invoice_id", 0);
    if (this.eYg == 0) {
      setMMTitle(R.l.settings_add_invoice);
    }
    for (;;)
    {
      initView();
      return;
      setMMTitle(R.l.settings_modify_invoice);
    }
  }
  
  public void onDestroy()
  {
    au.DF().b(1180, this);
    au.DF().b(1191, this);
    getWindow().setSoftInputMode(3);
    super.onDestroy();
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      ZD();
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/address/ui/AddInvoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */