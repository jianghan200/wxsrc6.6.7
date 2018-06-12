package com.tencent.mm.plugin.address.ui;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.q.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.s.b;

public class QrcodeInvoiceUI
  extends MMActivity
{
  private Dialog eXG = null;
  private int eYg = 0;
  private TextView eYk;
  private b eYu = null;
  private Bitmap eZA;
  private o eZB = null;
  private ImageView eZC;
  private View eZD;
  private float eZE = 0.0F;
  private View.OnClickListener eZF = new QrcodeInvoiceUI.5(this);
  private View.OnClickListener eZG = new QrcodeInvoiceUI.6(this);
  private InvoiceQrcodeTextView eZt;
  private InvoiceQrcodeTextView eZu;
  private InvoiceQrcodeTextView eZv;
  private InvoiceQrcodeTextView eZw;
  private InvoiceQrcodeTextView eZx;
  private InvoiceQrcodeTextView eZy;
  private InvoiceQrcodeTextView eZz;
  
  protected final int getLayoutId()
  {
    return R.i.mm_qrcode_invoice_ui;
  }
  
  public final void initView()
  {
    findViewById(R.h.qrcode_invoice_sv);
    this.eZt = ((InvoiceQrcodeTextView)findViewById(R.h.qrcode_invoice_title));
    if (this.eZt != null) {
      this.eZt.ZI();
    }
    this.eZu = ((InvoiceQrcodeTextView)findViewById(R.h.qrcode_invoice_person_title));
    if (this.eZu != null) {
      this.eZu.ZI();
    }
    this.eZv = ((InvoiceQrcodeTextView)findViewById(R.h.qrcode_invoice_tax_number));
    if (this.eZv != null) {
      this.eZv.ZI();
    }
    this.eZw = ((InvoiceQrcodeTextView)findViewById(R.h.qrcode_invoice_company_address));
    if (this.eZw != null) {
      this.eZw.ZI();
    }
    this.eZx = ((InvoiceQrcodeTextView)findViewById(R.h.qrcode_invoice_phone_number));
    if (this.eZx != null) {
      this.eZx.ZI();
    }
    this.eZy = ((InvoiceQrcodeTextView)findViewById(R.h.qrcode_invoice_bank_name));
    if (this.eZy != null) {
      this.eZy.ZI();
    }
    this.eZz = ((InvoiceQrcodeTextView)findViewById(R.h.qrcode_invoice_bank_number));
    if (this.eZz != null) {
      this.eZz.ZI();
    }
    this.eZv.eYS = true;
    this.eZv.eYL = true;
    label422:
    label469:
    label516:
    label563:
    Object localObject;
    if (this.eYg != 0)
    {
      this.eYk = ((TextView)findViewById(R.h.qrcode_type_tv));
      this.eYu = com.tencent.mm.plugin.address.a.a.Zw().jp(this.eYg);
      if (this.eYu == null)
      {
        x.i("MicroMsg.QrcodeInvoiceUI", "invoiceSvrObj is null ,now finish..");
        finish();
      }
      if ((this.eYu != null) && (this.eYu.type != null) && (this.eYu.type.equals("0")))
      {
        this.eYk.setText(getString(R.l.invoice_company_type_title));
        this.eZu.setVisibility(8);
        if ((this.eYu.knC != null) && (!this.eYu.knC.equals("")))
        {
          this.eZv.setVisibility(0);
          this.eZv.setValStr(this.eYu.knC);
          if ((this.eYu.knI == null) || (this.eYu.knI.equals(""))) {
            break label891;
          }
          this.eZw.setVisibility(0);
          this.eZw.setValStr(this.eYu.knI);
          if ((this.eYu.knG == null) || (this.eYu.knG.equals(""))) {
            break label903;
          }
          this.eZx.setVisibility(0);
          this.eZx.setValStr(this.eYu.knG);
          if ((this.eYu.knE == null) || (this.eYu.knE.equals(""))) {
            break label915;
          }
          this.eZy.setVisibility(0);
          this.eZy.setValStr(this.eYu.knE);
          if ((this.eYu.knD == null) || (this.eYu.knD.equals(""))) {
            break label927;
          }
          this.eZz.setVisibility(0);
          this.eZz.setValStr(this.eYu.knD);
          this.eYk.setVisibility(0);
          if (this.eYu != null)
          {
            this.eZt.setValStr(this.eYu.title);
            this.eZu.setValStr(this.eYu.knB);
          }
          if (this.eZB == null)
          {
            localObject = View.inflate(this, R.i.invoice_popup_window, null);
            ((View)localObject).setOnClickListener(new QrcodeInvoiceUI.3(this));
            this.eZD = ((View)localObject).findViewById(R.h.invoice_popup_qrcode_layout);
            this.eZC = ((ImageView)((View)localObject).findViewById(R.h.invoice_popup_qrcode_iv));
            this.eZB = new o((View)localObject, -1, -1, true);
            this.eZB.setClippingEnabled(false);
            this.eZB.update();
            this.eZB.setBackgroundDrawable(new ColorDrawable(16777215));
            this.eZB.setOnDismissListener(new QrcodeInvoiceUI.4(this));
          }
          label721:
          setBackBtn(new QrcodeInvoiceUI.1(this));
          a(0, getString(R.l.app_edit), new QrcodeInvoiceUI.2(this), s.b.tmX);
          if ((this.eYu == null) || (this.eYu.knJ == null) || (this.eYu.knJ.equals(""))) {
            break label1058;
          }
          localObject = (ImageView)findViewById(R.h.invoice_qrcode_bar_area);
          if (localObject != null)
          {
            ((ImageView)localObject).setVisibility(0);
            this.eZA = com.tencent.mm.bm.a.a.b(this, this.eYu.knJ, 0, 3);
            ((ImageView)localObject).setImageBitmap(this.eZA);
            ((ImageView)localObject).setOnClickListener(this.eZG);
          }
          localObject = findViewById(R.h.invoice_qrcode_line);
          if (localObject != null) {
            ((View)localObject).setVisibility(0);
          }
          localObject = (TextView)findViewById(R.h.qrcode_bitmap_tip_tv);
          if (localObject != null) {
            ((TextView)localObject).setVisibility(0);
          }
        }
      }
    }
    label891:
    label903:
    label915:
    label927:
    label1058:
    do
    {
      return;
      this.eZv.setVisibility(8);
      break;
      this.eZw.setVisibility(8);
      break label422;
      this.eZx.setVisibility(8);
      break label469;
      this.eZy.setVisibility(8);
      break label516;
      this.eZz.setVisibility(8);
      break label563;
      if ((this.eYu == null) || (this.eYu.type == null) || (!this.eYu.type.equals("1"))) {
        break label563;
      }
      this.eYk.setText(getString(R.l.invoice_personal_type_title));
      this.eZt.setVisibility(8);
      this.eZv.setVisibility(8);
      this.eZw.setVisibility(8);
      this.eZx.setVisibility(8);
      this.eZy.setVisibility(8);
      this.eZz.setVisibility(8);
      break label563;
      x.i("MicroMsg.QrcodeInvoiceUI", "serverId is 0,now finish...");
      finish();
      break label721;
      localObject = (ImageView)findViewById(R.h.invoice_qrcode_bar_area);
      if (localObject != null) {
        ((ImageView)localObject).setVisibility(8);
      }
      localObject = findViewById(R.h.invoice_qrcode_line);
      if (localObject != null) {
        ((View)localObject).setVisibility(8);
      }
      localObject = (TextView)findViewById(R.h.qrcode_bitmap_tip_tv);
    } while (localObject == null);
    ((TextView)localObject).setVisibility(8);
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
        do
        {
          return;
        } while (paramInt2 != -1);
        String str = paramIntent.getStringExtra("karea_result");
        if (!bi.oW(str))
        {
          x.d("MicroMsg.QrcodeInvoiceUI", "AREA_RESULT:" + str);
          this.eZx.setValStr(str);
        }
        paramIntent = paramIntent.getStringExtra("kpost_code");
      } while (bi.oW(paramIntent));
      x.d("MicroMsg.QrcodeInvoiceUI", "post:" + paramIntent);
      this.eZx.setValStr(paramIntent);
      return;
    } while (paramInt2 == -1);
    x.i("MicroMsg.QrcodeInvoiceUI", "MallRecharge pay result : cancel");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.d("MicroMsg.QrcodeInvoiceUI", "index Oncreate");
    this.eYg = getIntent().getIntExtra("invoice_id", 0);
    setMMTitle(R.l.invoice_qrcode_title);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      setResult(0);
      finish();
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onResume()
  {
    getWindow().setSoftInputMode(3);
    super.onResume();
    initView();
  }
  
  public void showPopupWindow(View paramView)
  {
    if ((this.eZB != null) && (!this.eZB.isShowing()))
    {
      this.eZB.showAtLocation(paramView.getRootView(), 17, 0, 0);
      this.eZB.setFocusable(true);
      this.eZB.setTouchable(true);
      this.eZB.setBackgroundDrawable(new ColorDrawable(16777215));
      this.eZB.setOutsideTouchable(true);
      this.eZD.setVisibility(0);
      this.eZC.setOnClickListener(this.eZF);
      this.eZC.setImageBitmap(this.eZA);
      if (this.eZA == null) {
        break label126;
      }
      x.e("MicroMsg.QrcodeInvoiceUI", "updatePopWindowContent mQRCodeBmp != null");
    }
    for (;;)
    {
      this.eZB.update();
      return;
      label126:
      x.i("MicroMsg.QrcodeInvoiceUI", "updatePopWindowContent mQRCodeBmp == null");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */