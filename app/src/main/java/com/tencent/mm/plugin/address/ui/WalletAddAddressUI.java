package com.tencent.mm.plugin.address.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.au;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.plugin.address.d.b;
import com.tencent.mm.plugin.address.model.RcptItem;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WalletAddAddressUI
  extends MMActivity
  implements e, AddrEditView.b
{
  private String bXd = "";
  private Dialog eXG = null;
  private int eYg = 0;
  private AddrEditView eZJ;
  private AddrEditView eZK;
  private AddrEditView eZL;
  private AddrEditView eZM;
  private AddrEditView eZN;
  private b eZO = null;
  private b eZP = new b();
  
  private boolean ZB()
  {
    boolean bool2 = false;
    boolean bool1 = true;
    if (!this.eZJ.ZF()) {
      bool1 = false;
    }
    if (!this.eZL.ZF()) {
      bool1 = false;
    }
    if (!this.eZK.ZF()) {
      bool1 = false;
    }
    if (!this.eZM.ZF()) {
      bool1 = false;
    }
    if (!this.eZN.ZF()) {
      bool1 = bool2;
    }
    for (;;)
    {
      enableOptionMenu(bool1);
      return bool1;
    }
  }
  
  private void ZD()
  {
    int k = 1;
    int j = R.l.address_back_modify_tip;
    if (this.eYg == 0) {
      j = R.l.address_back_add_tip;
    }
    if (this.eZJ.ZG()) {}
    for (int i = 1;; i = 0)
    {
      if (this.eZL.ZG()) {
        i = 1;
      }
      if (this.eZK.ZG()) {
        i = 1;
      }
      if (this.eZM.ZG()) {
        i = 1;
      }
      if (this.eZN.ZG()) {
        i = k;
      }
      for (;;)
      {
        if (i != 0)
        {
          h.a(this, j, R.l.app_tip, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              WalletAddAddressUI.this.setResult(0);
              WalletAddAddressUI.this.finish();
            }
          }, null);
          return;
        }
        setResult(0);
        finish();
        return;
      }
    }
  }
  
  private void ZJ()
  {
    startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 2);
  }
  
  private void ZK()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(this.eZK.getText())) {
      localStringBuilder.append(this.eZK.getText());
    }
    if (!TextUtils.isEmpty(this.eZL.getText())) {
      localStringBuilder.append(this.eZL.getText());
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("wallet_address", localStringBuilder.toString());
    localIntent.putExtra("map_view_type", 8);
    d.b(this, "location", ".ui.RedirectUI", localIntent, 3);
  }
  
  private static void a(b paramb1, b paramb2)
  {
    if ((paramb1 != null) && (paramb2 != null))
    {
      paramb2.id = paramb1.id;
      paramb2.eXY = paramb1.eXY;
      paramb2.eXZ = paramb1.eXZ;
      paramb2.eYa = paramb1.eYa;
      paramb2.eYc = paramb1.eYc;
      paramb2.eYd = paramb1.eYd;
      paramb2.eYe = paramb1.eYe;
      paramb2.eYb = paramb1.eYb;
      paramb2.eYf = paramb1.eYf;
    }
  }
  
  public final void ZC()
  {
    ZB();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if (this.eXG != null) {
      this.eXG.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = com.tencent.mm.plugin.address.a.a.Zx().eXO;
      if (paramString.eXW.size() > 0)
      {
        a(this.eZP, this.eZO);
        paramString = (b)paramString.eXW.getFirst();
        if (paramString != null) {
          setResult(-1, com.tencent.mm.plugin.address.e.a.b(paramString));
        }
      }
      for (;;)
      {
        finish();
        return;
        setResult(0);
        continue;
        setResult(0);
      }
    }
    switch (paramInt2)
    {
    case -3101: 
    default: 
      h.a(this, R.l.address_add_fail_tips, 0, false, new WalletAddAddressUI.14(this));
      return;
    case -3100: 
      h.a(this, R.l.address_add_limit_tips, 0, false, new WalletAddAddressUI.12(this));
      return;
    }
    h.a(this, paramString, "", new WalletAddAddressUI.13(this));
  }
  
  protected final int getLayoutId()
  {
    return R.i.wallet_add_address_ui;
  }
  
  public final void initView()
  {
    com.tencent.mm.plugin.address.a.a.Zx().Zy();
    Object localObject = (MMScrollView)findViewById(R.h.wallet_sv);
    ((MMScrollView)localObject).a((ViewGroup)localObject, (View.OnFocusChangeListener)localObject);
    this.eZJ = ((AddrEditView)findViewById(R.h.address_name));
    this.eZK = ((AddrEditView)findViewById(R.h.address_country));
    this.eZL = ((AddrEditView)findViewById(R.h.address_detail_area));
    this.eZM = ((AddrEditView)findViewById(R.h.addresss_post));
    this.eZN = ((AddrEditView)findViewById(R.h.address_phone));
    this.eZJ.setOnInputValidChangeListener(this);
    this.eZK.setOnInputValidChangeListener(this);
    this.eZL.setOnInputValidChangeListener(this);
    this.eZM.setOnInputValidChangeListener(this);
    this.eZN.setOnInputValidChangeListener(this);
    this.eZJ.setInfoIvOnClickListener(new WalletAddAddressUI.1(this));
    this.eZK.setInfoIvOnClickListener(new WalletAddAddressUI.8(this));
    this.eZK.setOnClickListener(new WalletAddAddressUI.9(this));
    if (this.eYg != 0)
    {
      this.eZO = com.tencent.mm.plugin.address.a.a.Zx().jq(this.eYg);
      this.eZJ.setValStr(this.eZO.eYd);
      localObject = new StringBuilder();
      if (!TextUtils.isEmpty(this.eZO.eXY)) {
        ((StringBuilder)localObject).append(this.eZO.eXY);
      }
      if (!TextUtils.isEmpty(this.eZO.eXZ))
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(this.eZO.eXZ);
      }
      if (!TextUtils.isEmpty(this.eZO.eYa))
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(this.eZO.eYa);
      }
      this.eZK.setValStr(((StringBuilder)localObject).toString());
      this.eZL.setValStr(this.eZO.eYc);
      this.eZM.setValStr(this.eZO.eYb);
      this.eZN.setValStr(this.eZO.eYe);
    }
    setBackBtn(new WalletAddAddressUI.10(this));
    a(0, getString(R.l.app_save), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        if (!WalletAddAddressUI.e(WalletAddAddressUI.this)) {
          return true;
        }
        Object localObject;
        String str1;
        String str2;
        String str3;
        if (WalletAddAddressUI.f(WalletAddAddressUI.this) != 0)
        {
          WalletAddAddressUI.a(WalletAddAddressUI.this, com.tencent.mm.plugin.address.a.a.Zx().jq(WalletAddAddressUI.f(WalletAddAddressUI.this)));
          x.d("MicroMsg.WalletAddAddressUI", "get addr " + WalletAddAddressUI.g(WalletAddAddressUI.this).toString());
          WalletAddAddressUI.b(WalletAddAddressUI.g(WalletAddAddressUI.this), WalletAddAddressUI.h(WalletAddAddressUI.this));
          paramAnonymousMenuItem = WalletAddAddressUI.i(WalletAddAddressUI.this).getText();
          localObject = WalletAddAddressUI.j(WalletAddAddressUI.this).getText();
          str1 = WalletAddAddressUI.k(WalletAddAddressUI.this).getText();
          str2 = WalletAddAddressUI.l(WalletAddAddressUI.this).getText();
          str3 = WalletAddAddressUI.m(WalletAddAddressUI.this).getText();
          localObject = ((String)localObject).split(" ");
          if (localObject.length > 0) {
            WalletAddAddressUI.h(WalletAddAddressUI.this).eXY = localObject[0];
          }
          if (localObject.length >= 2) {
            WalletAddAddressUI.h(WalletAddAddressUI.this).eXZ = localObject[1];
          }
          if (localObject.length < 3) {
            break label320;
          }
        }
        label320:
        for (WalletAddAddressUI.h(WalletAddAddressUI.this).eYa = localObject[2];; WalletAddAddressUI.h(WalletAddAddressUI.this).eYa = "")
        {
          WalletAddAddressUI.h(WalletAddAddressUI.this).eYc = str1;
          WalletAddAddressUI.h(WalletAddAddressUI.this).eYd = paramAnonymousMenuItem;
          WalletAddAddressUI.h(WalletAddAddressUI.this).eYe = str3;
          WalletAddAddressUI.h(WalletAddAddressUI.this).eYb = str2;
          if (!bi.oW(WalletAddAddressUI.n(WalletAddAddressUI.this))) {
            WalletAddAddressUI.h(WalletAddAddressUI.this).eYf = WalletAddAddressUI.n(WalletAddAddressUI.this);
          }
          WalletAddAddressUI.o(WalletAddAddressUI.this);
          return true;
          WalletAddAddressUI.a(WalletAddAddressUI.this, new b());
          break;
        }
      }
    }, s.b.tmX);
    ZB();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    Object localObject;
    do
    {
      do
      {
        do
        {
          do
          {
            return;
          } while (paramInt2 != -1);
          localObject = paramIntent.getStringExtra("karea_result");
          if (!bi.oW((String)localObject))
          {
            x.d("MicroMsg.WalletAddAddressUI", "AREA_RESULT:" + (String)localObject);
            this.eZK.setValStr((String)localObject);
          }
          localObject = paramIntent.getStringExtra("kpost_code");
          if (!bi.oW((String)localObject))
          {
            x.d("MicroMsg.WalletAddAddressUI", "post:" + (String)localObject);
            this.eZM.setValStr((String)localObject);
          }
          this.bXd = paramIntent.getStringExtra("kwcode");
          return;
        } while (paramInt2 != -1);
        paramIntent = paramIntent.getData();
        if (paramIntent == null)
        {
          x.d("MicroMsg.WalletAddAddressUI", "uri == null");
          return;
        }
        localObject = com.tencent.mm.pluginsdk.a.d(getBaseContext(), paramIntent);
        if ((localObject != null) && (localObject.length == 2)) {
          paramIntent = localObject[0];
        }
        for (localObject = localObject[1];; localObject = null)
        {
          this.eZJ.setValStr(paramIntent);
          this.eZN.setValStr((String)localObject);
          if (!PhoneNumberUtils.isGlobalPhoneNumber((String)localObject)) {
            break;
          }
          ZB();
          return;
          h.b(this, getString(R.l.addressui_mall_recharge_pick_contact_error), "", true);
          paramIntent = null;
        }
        h.b(this, getString(R.l.addressui_mall_recharge_pick_contact_error), "", true);
        return;
        if (paramInt2 != -1) {
          break;
        }
        paramIntent = (Addr)paramIntent.getParcelableExtra("key_pick_addr");
      } while (paramIntent == null);
      x.d("MicroMsg.WalletAddAddressUI", "addr: " + paramIntent.toString());
    } while (paramIntent == null);
    if (com.tencent.mm.plugin.address.a.a.Zx().y(paramIntent.dRI, paramIntent.dRK, paramIntent.dRL))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramIntent.dRI);
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append(paramIntent.dRK);
      if (!TextUtils.isEmpty(paramIntent.dRL))
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(paramIntent.dRL);
      }
      this.eZK.setValStr(((StringBuilder)localObject).toString());
      label419:
      localObject = new StringBuilder();
      if (!TextUtils.isEmpty(paramIntent.dRM)) {
        ((StringBuilder)localObject).append(paramIntent.dRM);
      }
      if (!TextUtils.isEmpty(paramIntent.dRN)) {
        ((StringBuilder)localObject).append(paramIntent.dRN);
      }
      if (!TextUtils.isEmpty(paramIntent.dRO)) {
        ((StringBuilder)localObject).append(paramIntent.dRO);
      }
      if (!TextUtils.isEmpty(paramIntent.dRQ))
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(paramIntent.dRQ);
      }
      if ((!bi.oW(paramIntent.dRQ)) || (bi.oW(paramIntent.dRH))) {
        break label603;
      }
      this.eZL.setValStr(paramIntent.dRH);
    }
    for (;;)
    {
      paramIntent = com.tencent.mm.plugin.address.a.a.Zx().x(paramIntent.dRI, paramIntent.dRK, paramIntent.dRL);
      if (paramIntent == null) {
        break;
      }
      this.eZM.setValStr(paramIntent.eXM);
      this.bXd = paramIntent.code;
      return;
      this.eZK.setValStr("");
      break label419;
      label603:
      this.eZL.setValStr(((StringBuilder)localObject).toString());
    }
    x.i("MicroMsg.WalletAddAddressUI", "MallRecharge pay result : cancel");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    au.DF().a(415, this);
    au.DF().a(418, this);
    x.d("MicroMsg.WalletAddAddressUI", "index Oncreate");
    x.Da(0);
    this.eYg = getIntent().getIntExtra("address_id", 0);
    if (this.eYg == 0) {
      setMMTitle(R.l.address_add_title);
    }
    for (;;)
    {
      initView();
      return;
      setMMTitle(R.l.address_modify_title);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    au.DF().b(415, this);
    au.DF().b(418, this);
    com.tencent.mm.plugin.address.model.l locall = com.tencent.mm.plugin.address.a.a.Zx();
    x.i("MicroMsg.WalletAddrMgr", "clean data");
    Iterator localIterator = locall.eXQ.values().iterator();
    while (localIterator.hasNext()) {
      ((List)localIterator.next()).clear();
    }
    localIterator = locall.eXR.values().iterator();
    while (localIterator.hasNext()) {
      ((List)localIterator.next()).clear();
    }
    locall.eXP.clear();
    locall.eXQ.clear();
    locall.eXR.clear();
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
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.WalletAddAddressUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    case 48: 
      if (paramArrayOfInt[0] == 0)
      {
        ZJ();
        return;
      }
      h.a(this, getString(R.l.permission_contacts_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new WalletAddAddressUI.4(this), new WalletAddAddressUI.5(this));
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      ZK();
      return;
    }
    h.a(this, getString(R.l.permission_location_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new WalletAddAddressUI.6(this), new WalletAddAddressUI.7(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/address/ui/WalletAddAddressUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */