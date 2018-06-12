package com.tencent.mm.plugin.recharge.ui;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.mm.plugin.recharge.model.d;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.aew;
import com.tencent.mm.protocal.c.xi;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.ListViewInScrollView;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RechargeUI
  extends MMActivity
  implements com.tencent.mm.ab.e, y.a, MallEditText.b
{
  private Button eWk = null;
  protected Dialog eXG = null;
  private boolean lSF = false;
  private com.tencent.mm.sdk.b.c lSI = new RechargeUI.10(this);
  private MallFunction mpR = null;
  private String mqA;
  public String mqB;
  private String mqC;
  public String mqD;
  private TextView mqh = null;
  private TextView mqi = null;
  private TextView mqj = null;
  private TextView mqk = null;
  private FrameLayout mql = null;
  private ImageView mqm = null;
  private ImageView mqn = null;
  private LinearLayout mqo = null;
  private a mqp = null;
  private a mqq = null;
  private MallEditText mqr;
  private TextView mqs;
  private int mqt;
  private MallRechargeProduct mqu = null;
  private String mqv = null;
  private MallNews mqw = null;
  private boolean mqx = false;
  private boolean mqy = true;
  private Map<String, Integer> mqz = new HashMap();
  
  private boolean ZB()
  {
    MallEditText localMallEditText = this.mqr;
    if (localMallEditText.getVisibility() == 0) {
      if (bi.oW(localMallEditText.getText()))
      {
        x.d("MicroMsg.MallEditText", "View:" + localMallEditText.eYG + ", editType:" + localMallEditText.eYH + " checkInputValid : empty ");
        i = 0;
        if (i != 0) {
          break label294;
        }
      }
    }
    label294:
    for (int i = 0;; i = 1)
    {
      if ((i != 0) && (this.mqu != null) && (this.mqu.isValid()))
      {
        if ((bqh()) && (this.mqu.moG)) {
          n(new d(this.mqu.moF, this.mpR.moy, this.mqu.bKk, this.mqu.appId, bqf(), bqg()));
        }
        YC();
        this.eWk.setEnabled(true);
        this.eWk.setClickable(true);
        x.d("MicroMsg.MallRechargeUI", "checkInfo : true");
        return true;
        if (!localMallEditText.eYL)
        {
          x.d("MicroMsg.MallEditText", "View:" + localMallEditText.eYG + ", editType:" + localMallEditText.eYH + " checkInputValid : illegal ");
          i = 0;
          break;
        }
        i = 1;
        break;
      }
      if ((!this.mqx) && (i == 0) && (this.mqu != null)) {
        this.mqu.isValid();
      }
      this.eWk.setEnabled(false);
      this.eWk.setClickable(false);
      x.d("MicroMsg.MallRechargeUI", "checkInfo : false");
      return false;
    }
  }
  
  private void aL()
  {
    x.d("MicroMsg.MallRechargeUI", "mCheckedProduct " + this.mqu);
    Object localObject;
    if (this.mqu != null)
    {
      this.mqs.setText(this.mqu.ioy);
      TextView localTextView = this.mqj;
      localObject = this.mqu;
      if (!((MallRechargeProduct)localObject).isValid())
      {
        localObject = getString(a.i.mall_recharge_out_of_stock);
        localTextView.setText((CharSequence)localObject);
      }
    }
    else
    {
      if ((this.mqw == null) || (this.mpR.prU == null) || (!this.mqw.equals(this.mpR.prU)) || ("1".equals(this.mqw.psa))) {
        break label373;
      }
      this.mql.setVisibility(8);
      x.d("MicroMsg.MallRechargeUI", "dismiss banner!, news->" + this.mqw.toString());
      label162:
      this.mqi.setVisibility(4);
      if (!ZB()) {
        break label475;
      }
      if ((this.mqu != null) && (!bqh()))
      {
        this.mqh.setText(this.mqu.moz);
        this.mqh.setTextColor(getResources().getColor(a.c.hint_text_color));
      }
      label222:
      localObject = getString(a.i.mall_recharge_balance);
      if (!TextUtils.isEmpty(this.mqB)) {
        localObject = this.mqB;
      }
      if (!bi.oW(this.mqA)) {
        addTextOptionMenu(0, (String)localObject, new RechargeUI.18(this));
      }
      if (bi.oW(this.mqC)) {
        break label488;
      }
      this.mqk.setVisibility(0);
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(this.mqD)) {
        this.mqk.setText(this.mqD);
      }
      return;
      if ((((MallRechargeProduct)localObject).moA != ((MallRechargeProduct)localObject).moB) || ((bqh()) && (this.mqu.moG)))
      {
        localObject = "";
        break;
      }
      localObject = String.format(getString(a.i.mall_recharge_price), new Object[] { Float.valueOf(((MallRechargeProduct)localObject).moA) });
      break;
      label373:
      if ((this.mpR.prU != null) && (!bi.oW(this.mpR.prU.psf)))
      {
        this.mqv = this.mpR.prU.psf;
        localObject = y.a(new com.tencent.mm.plugin.recharge.b.a(this.mqv));
        this.mqm.setImageBitmap((Bitmap)localObject);
        this.mql.setVisibility(0);
        x.d("MicroMsg.MallRechargeUI", "Show banner!");
        break label162;
      }
      this.mql.setVisibility(8);
      x.d("MicroMsg.MallRechargeUI", "dismiss banner!");
      break label162;
      label475:
      this.mqh.setText("");
      break label222;
      label488:
      this.mqk.setVisibility(8);
    }
  }
  
  private void bR(List<MallRechargeProduct> paramList)
  {
    if (paramList != null)
    {
      ArrayList localArrayList = new ArrayList();
      int k = 0;
      int j;
      for (int i = 0; k < paramList.size(); i = j)
      {
        MallRechargeProduct localMallRechargeProduct = (MallRechargeProduct)paramList.get(k);
        j = i;
        if (localMallRechargeProduct.moF == 2)
        {
          j = i;
          if (this.mqu != null)
          {
            j = i;
            if (localMallRechargeProduct.bKk.equals(this.mqu.bKk))
            {
              localMallRechargeProduct.isDefault = true;
              j = 1;
            }
          }
          localArrayList.add(localMallRechargeProduct);
        }
        k += 1;
      }
      if ((i == 0) && (localArrayList.size() > 0)) {
        ((MallRechargeProduct)localArrayList.get(0)).isDefault = true;
      }
      this.mqq.bS(localArrayList);
      return;
    }
    this.mqq.bS(new ArrayList());
  }
  
  private String bqf()
  {
    return "mobile=" + com.tencent.mm.plugin.recharge.model.b.pK(this.mqr.getText());
  }
  
  private String bqg()
  {
    return com.tencent.mm.plugin.recharge.model.b.pK(this.mqr.getText());
  }
  
  private boolean bqh()
  {
    String str = p(this.mqu.moF, this.mqu.bKk, bqg());
    return !this.mqz.containsKey(str);
  }
  
  private static List<MallRechargeProduct> d(int paramInt, List<MallRechargeProduct> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramList != null)
    {
      int i = 0;
      int k;
      for (int j = 0; i < paramList.size(); j = k)
      {
        MallRechargeProduct localMallRechargeProduct = (MallRechargeProduct)paramList.get(i);
        k = j;
        if (localMallRechargeProduct.moF == paramInt)
        {
          localArrayList.add(localMallRechargeProduct);
          k = j;
          if (localMallRechargeProduct.isDefault)
          {
            if (j != 0) {
              localMallRechargeProduct.isDefault = false;
            }
            k = 1;
          }
        }
        i += 1;
      }
      if ((j == 0) && (localArrayList.size() > 0)) {
        ((MallRechargeProduct)localArrayList.get(0)).isDefault = true;
      }
    }
    return localArrayList;
  }
  
  private void n(l paraml)
  {
    if ((paraml.getType() == 497) || (paraml.getType() == 1555))
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.a(paraml, 0);
      return;
    }
    if (!this.mqy)
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.a(paraml, 0);
      return;
    }
    if ((this.eXG == null) || ((this.eXG != null) && (!this.eXG.isShowing()))) {
      this.eXG = com.tencent.mm.wallet_core.ui.g.a(this.mController.tml, true, new RechargeUI.3(this, paraml));
    }
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(paraml, 0);
  }
  
  private static String p(int paramInt, String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt);
    localStringBuilder.append("-");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("-");
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  public final void YC()
  {
    x.d("MicroMsg.MallRechargeUI", "hideVKB");
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null) {}
    Object localObject;
    do
    {
      do
      {
        return;
        localObject = getCurrentFocus();
      } while (localObject == null);
      localObject = ((View)localObject).getWindowToken();
    } while (localObject == null);
    localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.MallRechargeUI", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((this.eXG != null) && (this.eXG.isShowing()) && (paraml.getType() != 497))
    {
      this.eXG.dismiss();
      this.eXG = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paraml instanceof com.tencent.mm.plugin.recharge.model.e))
      {
        paraml = (com.tencent.mm.plugin.recharge.model.e)paraml;
        paramString = paraml.moL;
        if (paramString != null)
        {
          this.mqu = a.bQ(paramString);
          x.d("MicroMsg.MallRechargeUI", "mCheckedProduct again" + this.mqu);
        }
        this.mqA = paraml.moM;
        this.mqB = paraml.moN;
        this.mqC = paraml.moO;
        this.mqD = paraml.moP;
        x.d("MicroMsg.MallRechargeUI", "mProductList " + paramString);
        aL();
        paraml = d(0, paramString);
        paramString = d(2, paramString);
        if (paraml.size() > paramString.size())
        {
          paramInt1 = paraml.size();
          this.mqt = paramInt1;
          this.mqp.bS(paraml);
          this.mqq.bS(paramString);
        }
      }
    }
    label666:
    label709:
    while ((paraml instanceof com.tencent.mm.plugin.recharge.model.c))
    {
      do
      {
        do
        {
          for (;;)
          {
            return;
            paramInt1 = paramString.size();
          }
          if ((paraml instanceof d))
          {
            x.d("MicroMsg.MallRechargeUI", "checkProduct: " + this.mqu);
            paraml = (d)paraml;
            if ((this.mqu != null) && (this.mqu.bKk != null) && (paraml.moI != null) && (((this.mqu.bKk.equals(paraml.moI.bKk)) && (bqg().equals(paraml.eNQ))) || (paraml.moF != 2)))
            {
              MallRechargeProduct.a(paraml.moI, this.mqu);
              this.mqu.isDefault = true;
              String str = p(paraml.moF, paraml.moI.bKk, paraml.eNQ);
              this.mqz.put(str, Integer.valueOf(1));
              aL();
              this.mqi.setText(paramString);
              this.mqi.setVisibility(0);
              this.mqi.setTextColor(getResources().getColor(a.c.grey));
            }
            if (paraml.moF == 2)
            {
              if ((this.mqu == null) || (!this.mqu.bKk.equals(paraml.moK)) || (!bqg().equals(paraml.eNQ))) {
                break label709;
              }
              if ((((aew)paraml.diG.dIE.dIL).rDj == 0) && (this.mqu.bKk.equals(paraml.moI.bKk))) {
                break label666;
              }
              this.eWk.setEnabled(false);
              this.eWk.setClickable(false);
              this.mqi.setText(((aew)paraml.diG.dIE.dIL).rDk);
              this.mqi.setVisibility(0);
              this.mqi.setTextColor(getResources().getColor(a.c.red));
            }
            for (;;)
            {
              bR(paraml.moJ);
              x.d("MicroMsg.MallRechargeUI", "NetSceneGetLatestPayProductInfo  mCheckedProduct " + this.mqu);
              return;
              n(new com.tencent.mm.plugin.recharge.model.c(this.mqu.moy, bqg(), this.mqu.ioy, this.mqu.appId, bqf()));
              continue;
              this.eWk.setEnabled(true);
              this.eWk.setClickable(true);
              this.mqi.setText(null);
            }
          }
          if ((paraml instanceof com.tencent.mm.plugin.recharge.model.g))
          {
            paramString = ((com.tencent.mm.plugin.recharge.model.g)paraml).mpb;
            paramString.bVY = 6;
            paramString.qUI = 100;
            com.tencent.mm.pluginsdk.wallet.h.a(this, paramString, 2);
            com.tencent.mm.sdk.b.a.sFg.b(this.lSI);
            return;
          }
        } while (!(paraml instanceof com.tencent.mm.plugin.recharge.model.c));
        paramString = (com.tencent.mm.plugin.recharge.model.c)paraml;
        if ((this.mqu == null) || (!this.mqu.ioy.equals(paramString.ioy)) || (!bqg().equals(paramString.bTi))) {
          break;
        }
      } while (((xi)paramString.diG.dIE.dIL).rDj == 0);
      this.eWk.setEnabled(false);
      this.eWk.setClickable(false);
      this.mqi.setText(((xi)paramString.diG.dIE.dIL).rDk);
      this.mqi.setVisibility(0);
      this.mqi.setTextColor(getResources().getColor(a.c.red));
      return;
      this.eWk.setEnabled(true);
      this.eWk.setClickable(true);
      this.mqi.setText(null);
      return;
    }
    if ((paraml instanceof d))
    {
      if (paramInt2 == 100)
      {
        this.eWk.setEnabled(true);
        this.eWk.setClickable(true);
      }
      for (;;)
      {
        bR(((d)paraml).moJ);
        this.mqi.setText(paramString);
        this.mqi.setVisibility(0);
        this.mqi.setTextColor(getResources().getColor(a.c.red));
        this.mqh.setText(((d)paraml).moz);
        this.mqh.setTextColor(getResources().getColor(a.c.red));
        return;
        this.eWk.setEnabled(false);
        this.eWk.setClickable(false);
      }
    }
    paraml = paramString;
    if (bi.oW(paramString)) {
      paraml = getString(a.i.wallet_unknown_err);
    }
    com.tencent.mm.ui.base.h.a(this, paraml, null, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
  }
  
  public final void bqa()
  {
    if ((bi.oW(this.mqr.getText())) || (this.mqr.ZF()))
    {
      this.mqr.setInfoTvImageResource(a.e.recharge_phone_contact);
      return;
    }
    this.mqr.setInfoTvImageResource(a.e.list_clear);
  }
  
  public final void fE(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.mqz.clear();
      this.mqh.setText("");
      this.mqi.setVisibility(4);
    }
    ZB();
  }
  
  protected final int getLayoutId()
  {
    return a.g.recharge_recharge_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(this.mpR.cbR);
    x.v("MicroMsg.MallRechargeUI", "initView");
    setBackBtn(new RechargeUI.1(this));
    this.mqh = ((TextView)findViewById(a.f.mall_product_desc));
    this.mqi = ((TextView)findViewById(a.f.mall_recharge_err_msg));
    this.mqj = ((TextView)findViewById(a.f.mall_sell_price));
    this.eWk = ((Button)findViewById(a.f.next_btn));
    this.mqo = ((LinearLayout)findViewById(a.f.mall_input_ll));
    this.mqk = ((TextView)findViewById(a.f.mall_recharge_phone_recharge_card));
    this.mqk.setOnClickListener(new RechargeUI.11(this));
    this.eWk.setOnClickListener(new RechargeUI.12(this));
    this.mqr = ((MallEditText)findViewById(a.f.mall_mobile_et));
    this.mqr.setInfoTvOnClickListener(new RechargeUI.13(this));
    this.mqs = ((TextView)findViewById(a.f.mall_product_name));
    Object localObject = getIntent().getParcelableArrayListExtra("key_product_list");
    List localList = d(0, (List)localObject);
    localObject = d(2, (List)localObject);
    if (localList.size() > ((List)localObject).size()) {}
    for (int i = localList.size();; i = ((List)localObject).size())
    {
      this.mqt = i;
      this.mqp = new a((byte)0);
      this.mqp.bS(localList);
      this.mqq = new a((byte)0);
      this.mqq.bS((List)localObject);
      this.mqo.setOnClickListener(new RechargeUI.14(this));
      this.mql = ((FrameLayout)findViewById(a.f.mall_recharge_banner));
      this.mqm = ((ImageView)findViewById(a.f.mall_recharge_banner_iv));
      this.mqn = ((ImageView)findViewById(a.f.mall_recharge_banner_close_iv));
      this.mqn.setOnClickListener(new RechargeUI.15(this));
      this.mql.setOnClickListener(new RechargeUI.16(this));
      this.mqr.setOnInputValidChangeListener(this);
      this.mqr.setOnClickListener(new RechargeUI.17(this));
      bqa();
      y.a(this);
      aL();
      return;
    }
  }
  
  public final void m(String paramString, final Bitmap paramBitmap)
  {
    if (this.mqv == null) {}
    while (!paramString.equals(this.mqv)) {
      return;
    }
    this.mqm.post(new Runnable()
    {
      public final void run()
      {
        RechargeUI.o(RechargeUI.this).setImageBitmap(paramBitmap);
      }
    });
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Cursor localCursor1;
    Object localObject2;
    label364:
    label387:
    String str2;
    switch (paramInt1)
    {
    default: 
    case 1: 
      do
      {
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
        return;
      } while (paramInt2 != -1);
      localObject1 = paramIntent.getData();
      if (localObject1 == null)
      {
        x.e("MicroMsg.MallRechargeUI", "uri == null");
        return;
      }
      if (!com.tencent.mm.pluginsdk.permission.a.bj(this, "android.permission.READ_CONTACTS"))
      {
        x.e("MicroMsg.MallRechargeUI", "no contact permission");
        return;
      }
      localCursor1 = getContentResolver().query((Uri)localObject1, null, null, null, null);
      if ((localCursor1 != null) && (localCursor1.getCount() > 0))
      {
        localCursor1.moveToFirst();
        int i = localCursor1.getColumnIndex("has_phone_number");
        if ((i <= 0) || (localCursor1.getInt(i) > 0))
        {
          localObject1 = localCursor1.getString(localCursor1.getColumnIndex("_id"));
          Cursor localCursor2 = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + (String)localObject1, null, null);
          if (localCursor2.moveToFirst())
          {
            str1 = null;
            localObject1 = null;
            for (;;)
            {
              localObject2 = localObject1;
              if (localCursor2.isAfterLast()) {
                break;
              }
              i = localCursor2.getColumnIndex("data1");
              int j = localCursor2.getColumnIndex("display_name");
              localObject2 = localCursor2.getString(i);
              str1 = localCursor2.getString(j);
              x.d("MicroMsg.MallRechargeUI", "username : " + str1);
              if (localObject2 == null) {
                break label589;
              }
              x.d("MicroMsg.MallRechargeUI", "phoneNumber : " + (String)localObject2);
              localObject2 = com.tencent.mm.plugin.recharge.model.b.pK((String)localObject2);
              x.d("MicroMsg.MallRechargeUI", "phoneNumber : " + (String)localObject2);
              if (!PhoneNumberUtils.isGlobalPhoneNumber((String)localObject2)) {
                break label586;
              }
              localObject1 = localObject2;
              x.d("MicroMsg.MallRechargeUI", "phoneResult : " + (String)localObject1);
              localCursor2.moveToNext();
            }
          }
          String str1 = null;
          localObject2 = null;
          localObject1 = localObject2;
          str2 = str1;
          if (!localCursor2.isClosed())
          {
            localCursor2.close();
            str2 = str1;
          }
        }
      }
      break;
    }
    for (Object localObject1 = localObject2;; localObject1 = null)
    {
      if ((localCursor1 != null) && (!localCursor1.isClosed())) {
        localCursor1.close();
      }
      if (PhoneNumberUtils.isGlobalPhoneNumber((String)localObject1))
      {
        this.mqz.clear();
        this.mqr.setInput(new com.tencent.mm.plugin.recharge.model.a((String)localObject1, str2, 1));
        this.mqh.setText("");
        this.mqi.setVisibility(4);
        ZB();
        break;
      }
      showDialog(2);
      break;
      if (paramInt2 == -1)
      {
        if (this.lSF) {
          break;
        }
        x.i("MicroMsg.MallRechargeUI", "MallRecharge pay result : ok");
        com.tencent.mm.plugin.recharge.a.a.bpV().a(this.mqr.getInputRecord());
        finish();
        this.lSF = true;
        break;
      }
      x.i("MicroMsg.MallRechargeUI", "MallRecharge pay result : cancel");
      break;
      label586:
      break label364;
      label589:
      break label387;
      str2 = null;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.mpR = ((MallFunction)paramBundle.getParcelableExtra("key_func_info"));
    ArrayList localArrayList = paramBundle.getParcelableArrayListExtra("key_product_list");
    if (!paramBundle.getBooleanExtra("key_is_hide_progress", false)) {}
    for (boolean bool = true;; bool = false)
    {
      this.mqy = bool;
      if (this.mpR != null) {
        break;
      }
      x.e("MicroMsg.MallRechargeUI", "function info is null");
      com.tencent.mm.ui.base.s.makeText(this, "function info is null", 1).show();
      return;
    }
    if (localArrayList == null)
    {
      x.d("MicroMsg.MallRechargeUI", "function info : " + this.mpR.cbR);
      n(new com.tencent.mm.plugin.recharge.model.e(this.mpR.moy));
    }
    for (;;)
    {
      x.i("MicroMsg.MallRechargeUI", "onCreate()");
      this.mqw = com.tencent.mm.plugin.wallet_core.model.mall.c.bPK().Pf(this.mpR.moy);
      initView();
      return;
      this.mqu = a.bQ(localArrayList);
    }
  }
  
  public void onDestroy()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.lSI);
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(496, this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(497, this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(498, this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(1555, this);
  }
  
  protected void onResume()
  {
    super.onResume();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(496, this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(497, this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(498, this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(1555, this);
  }
  
  public final void showVKB()
  {
    x.d("MicroMsg.MallRechargeUI", "showVKB");
    this.mqr.setInfoTvImageResource(a.e.list_clear);
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null) {}
    View localView;
    do
    {
      return;
      localView = getCurrentFocus();
    } while ((localView == null) || (localView.getWindowToken() == null));
    localInputMethodManager.showSoftInput(localView, 2);
  }
  
  private final class a
    extends BaseAdapter
  {
    private List<MallRechargeProduct> moJ = null;
    
    private a() {}
    
    public final void bS(List<MallRechargeProduct> paramList)
    {
      this.moJ = paramList;
      notifyDataSetChanged();
    }
    
    public final int getCount()
    {
      if (this.moJ == null) {
        return 0;
      }
      return this.moJ.size();
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramView = (CheckedTextView)View.inflate(RechargeUI.this, a.g.recharge_list_dialog_item_singlechoice, null);
      paramViewGroup = vj(paramInt);
      paramView.setText(paramViewGroup.ioy);
      paramView.setEnabled(paramViewGroup.isValid());
      if (paramViewGroup.isDefault)
      {
        paramView.setChecked(true);
        return paramView;
      }
      paramView.setChecked(false);
      return paramView;
    }
    
    public final boolean isEnabled(int paramInt)
    {
      if (!vj(paramInt).isValid()) {
        return false;
      }
      return super.isEnabled(paramInt);
    }
    
    public final void vi(int paramInt)
    {
      int i = 0;
      while (i < this.moJ.size())
      {
        ((MallRechargeProduct)this.moJ.get(i)).isDefault = false;
        i += 1;
      }
      ((MallRechargeProduct)this.moJ.get(paramInt)).isDefault = true;
    }
    
    public final MallRechargeProduct vj(int paramInt)
    {
      return (MallRechargeProduct)this.moJ.get(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/recharge/ui/RechargeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */