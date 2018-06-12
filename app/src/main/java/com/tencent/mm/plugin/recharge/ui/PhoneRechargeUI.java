package com.tencent.mm.plugin.recharge.ui;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView;
import com.tencent.mm.plugin.recharge.ui.form.MallFormView;
import com.tencent.mm.plugin.recharge.ui.form.c.b;
import com.tencent.mm.plugin.recharge.ui.form.c.b.1;
import com.tencent.mm.plugin.recharge.ui.form.c.b.2;
import com.tencent.mm.plugin.recharge.ui.form.c.b.3;
import com.tencent.mm.plugin.recharge.ui.form.c.b.4;
import com.tencent.mm.plugin.recharge.ui.form.c.b.5;
import com.tencent.mm.plugin.recharge.ui.form.d.a;
import com.tencent.mm.plugin.wallet.a.m;
import com.tencent.mm.plugin.wallet.a.n;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.y;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneRechargeUI
  extends MMActivity
  implements com.tencent.mm.ab.e, d.a
{
  private String Yy = "";
  private String desc = "";
  protected Dialog eXG = null;
  private int errCode = 0;
  private boolean lSF = false;
  private com.tencent.mm.sdk.b.c lSI = new PhoneRechargeUI.14(this);
  private String mAppId = "";
  private ArrayList<n> moR = null;
  private ArrayList<n> moS = null;
  private com.tencent.mm.plugin.wallet.a.d moT = null;
  private com.tencent.mm.plugin.wallet.a.d moU = null;
  private com.tencent.mm.plugin.wallet.a.d moV = null;
  private com.tencent.mm.plugin.wallet.a.d moW = null;
  private com.tencent.mm.plugin.wallet.a.d moX = null;
  private View mpB = null;
  private ImageView mpC = null;
  private TextView mpD = null;
  private MallFormView mpE = null;
  private TextView mpF = null;
  private TextView mpG = null;
  private GridView mpH = null;
  private GridView mpI = null;
  private TextView mpJ = null;
  private TextView mpK = null;
  private TextView mpL = null;
  private TextView mpM = null;
  private TextView mpN = null;
  private TextView mpO = null;
  private b mpP = null;
  private b mpQ = null;
  private MallFunction mpR = null;
  private String mpS = "";
  private int mpT;
  private String mpU = "";
  private String mpV = "";
  private c.b mpW = null;
  private m mpX = null;
  private boolean mpY = false;
  private List<String[]> mpZ;
  
  private void A(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1;
    int i;
    Object localObject2;
    if (this.mpX != null) {
      if (this.mpX != null)
      {
        localObject1 = (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sPE, "");
        if (!bi.oW((String)localObject1))
        {
          localObject1 = ((String)localObject1).split(";");
          if (localObject1 != null)
          {
            int j = localObject1.length;
            i = 0;
            if (i < j)
            {
              localObject2 = localObject1[i];
              if ((localObject2 != null) && (((String)localObject2).equals(String.valueOf(this.mpX.id))))
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhoneRechargeUI", "hy: found closed. ");
                i = 1;
                label106:
                if (i != 0) {
                  break label719;
                }
                this.mpB.setVisibility(0);
                this.mpD.setText(this.mpX.name);
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PhoneRechargeUI", "hy: Show banner!");
                com.tencent.mm.protocal.f.eA(6, 0);
                label145:
                this.mpP.mpv = this.moR;
                this.mpP.notifyDataSetChanged();
                this.mpQ.mpv = this.moS;
                this.mpQ.notifyDataSetChanged();
                if (paramBoolean1) {
                  break label739;
                }
                this.mpN.setVisibility(8);
                label194:
                this.mpO.setVisibility(8);
                if (paramBoolean2) {
                  addTextOptionMenu(0, this.moX.name, new PhoneRechargeUI.3(this));
                }
                localObject2 = this.mpF;
                if ((this.moR == null) || (this.moR.size() <= 0) || (bi.oW(((n)this.moR.get(0)).peu))) {
                  break label862;
                }
                localObject1 = ((n)this.moR.get(0)).peu;
                label286:
                ((TextView)localObject2).setText((CharSequence)localObject1);
                localObject2 = this.mpG;
                if ((this.moS == null) || (this.moS.size() <= 0) || (bi.oW(((n)this.moS.get(0)).peu))) {
                  break label874;
                }
                localObject1 = ((n)this.moS.get(0)).peu;
                label352:
                ((TextView)localObject2).setText((CharSequence)localObject1);
                if ((this.moW != null) && (!bi.oW(this.moW.name))) {
                  break label886;
                }
                this.mpK.setVisibility(8);
                label388:
                if ((this.moT != null) && (!bi.oW(this.moT.name)) && (!bi.oW(this.moT.url))) {
                  break label926;
                }
                this.mpJ.setVisibility(8);
                label430:
                if ((this.moU != null) && (!bi.oW(this.moU.name)) && (!bi.oW(this.moU.url))) {
                  break label966;
                }
                this.mpL.setVisibility(8);
                label472:
                if ((this.moV != null) && (!bi.oW(this.moV.name)) && (!bi.oW(this.moV.url))) {
                  break label1006;
                }
                this.mpM.setVisibility(8);
                label514:
                localObject1 = this.mpR;
                if ((((MallFunction)localObject1).prU != null) && (((MallFunction)localObject1).prU.ppS == 1) && (!bi.oW(((MallFunction)localObject1).prU.psk))) {
                  break label1046;
                }
                i = 0;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sTt, Boolean.valueOf(true));
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PhoneRechargeUI", this.mpR.prU.toString());
        localObject1 = this.mpR.prU.psk;
        localObject2 = y.gq(this).inflate(a.g.recharge_remind_dialog, null);
        com.tencent.mm.ui.base.h.a(this.mController.tml, getString(a.i.wallet_recharge_unicom_message_title), (View)localObject2, getString(a.i.wallet_recharge_unicom_message_yes), getString(a.i.wallet_recharge_unicom_message_no), new PhoneRechargeUI.8(this, (String)localObject1), new PhoneRechargeUI.9(this));
      }
      return;
      i += 1;
      break;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhoneRechargeUI", "hy: not found closed banner.");
      i = 0;
      break label106;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhoneRechargeUI", "hy: no banner before, show");
      i = 0;
      break label106;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PhoneRechargeUI", "hy: no banner");
      i = 1;
      break label106;
      label719:
      this.mpB.setVisibility(8);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PhoneRechargeUI", "hy: dismiss banner!");
      break label145;
      label739:
      localObject1 = this.moR.iterator();
      while (((Iterator)localObject1).hasNext()) {
        if (((n)((Iterator)localObject1).next()).status != 0)
        {
          i = 0;
          label776:
          if (i == 0) {
            break label845;
          }
          this.mpN.setVisibility(0);
          label788:
          localObject1 = this.moS.iterator();
          do
          {
            if (!((Iterator)localObject1).hasNext()) {
              break;
            }
          } while (((n)((Iterator)localObject1).next()).status == 0);
        }
      }
      for (i = 0;; i = 1)
      {
        if (i == 0) {
          break label860;
        }
        this.mpO.setVisibility(0);
        break;
        i = 1;
        break label776;
        label845:
        this.mpN.setVisibility(8);
        break label788;
      }
      label860:
      break label194;
      label862:
      localObject1 = getString(a.i.wallet_recharge_fee_title);
      break label286;
      label874:
      localObject1 = getString(a.i.wallet_recharge_flow_title);
      break label352;
      label886:
      this.mpK.setVisibility(0);
      this.mpK.setText(this.moW.name);
      this.mpK.setOnClickListener(new PhoneRechargeUI.4(this));
      break label388;
      label926:
      this.mpJ.setVisibility(0);
      this.mpJ.setText(this.moT.name);
      this.mpJ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if (!PhoneRechargeUI.a(PhoneRechargeUI.this, PhoneRechargeUI.k(PhoneRechargeUI.this).pdR, PhoneRechargeUI.k(PhoneRechargeUI.this).dzE))
          {
            paramAnonymousView = PhoneRechargeUI.b(PhoneRechargeUI.this, PhoneRechargeUI.k(PhoneRechargeUI.this).url);
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramAnonymousView });
            PhoneRechargeUI.c(PhoneRechargeUI.this, paramAnonymousView);
          }
        }
      });
      break label430;
      label966:
      this.mpL.setVisibility(0);
      this.mpL.setText(this.moU.name);
      this.mpL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if (!PhoneRechargeUI.a(PhoneRechargeUI.this, PhoneRechargeUI.l(PhoneRechargeUI.this).pdR, PhoneRechargeUI.l(PhoneRechargeUI.this).dzE))
          {
            paramAnonymousView = PhoneRechargeUI.b(PhoneRechargeUI.this, PhoneRechargeUI.l(PhoneRechargeUI.this).url);
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramAnonymousView });
            PhoneRechargeUI.c(PhoneRechargeUI.this, paramAnonymousView);
          }
        }
      });
      break label472;
      label1006:
      this.mpM.setVisibility(0);
      this.mpM.setText(this.moV.name);
      this.mpM.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if (!PhoneRechargeUI.a(PhoneRechargeUI.this, PhoneRechargeUI.m(PhoneRechargeUI.this).pdR, PhoneRechargeUI.m(PhoneRechargeUI.this).dzE))
          {
            paramAnonymousView = PhoneRechargeUI.b(PhoneRechargeUI.this, PhoneRechargeUI.m(PhoneRechargeUI.this).url);
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramAnonymousView });
            PhoneRechargeUI.c(PhoneRechargeUI.this, paramAnonymousView);
          }
        }
      });
      break label514;
      label1046:
      com.tencent.mm.kernel.g.Ek();
      if (!((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sTt, Boolean.valueOf(false))).booleanValue()) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
  
  private String Kn(String paramString)
  {
    Object localObject2 = "";
    Object localObject1 = localObject2;
    String str1 = paramString;
    try
    {
      if (this.mpW != null)
      {
        localObject1 = localObject2;
        str1 = paramString;
        if (this.mpW.mph != null)
        {
          localObject1 = localObject2;
          str1 = paramString;
          if (!bi.oW(this.mpW.mph.name))
          {
            str1 = paramString;
            localObject1 = this.mpW.mph.name;
          }
        }
      }
      localObject2 = localObject1;
      str1 = paramString;
      if (((String)localObject1).equals(getString(a.i.wallet_recharge_me))) {
        localObject2 = "WeChatAccountBindNumber";
      }
      str1 = paramString;
      String str2 = this.mpE.getText();
      str1 = paramString;
      localObject1 = URLEncoder.encode(URLEncoder.encode((String)localObject2, "utf-8"), "utf-8");
      str1 = paramString;
      if (!paramString.startsWith("http://"))
      {
        str1 = paramString;
        if (!paramString.startsWith("https://")) {}
      }
      else
      {
        str1 = paramString;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhoneRechargeUI", "new url");
        str1 = paramString;
        if (paramString.indexOf("%7Bphone%7D") > 0) {
          str1 = paramString;
        }
        for (paramString = paramString.replace("%7Bphone%7D", str2);; paramString = paramString.replace("{phone}", str2))
        {
          str1 = paramString;
          if (paramString.indexOf("%7Bremark%7D") <= 0) {
            break;
          }
          str1 = paramString;
          return paramString.replace("%7Bremark%7D", (CharSequence)localObject1);
          str1 = paramString;
        }
        str1 = paramString;
        return paramString.replace("{remark}", (CharSequence)localObject1);
      }
      str1 = paramString;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhoneRechargeUI", "old url");
      str1 = paramString;
      localObject2 = URLDecoder.decode(paramString, "utf-8");
      str1 = paramString;
      paramString = (String)localObject2 + String.format("?phone=%s&remark=%s", new Object[] { str2, localObject1 });
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.PhoneRechargeUI", paramString, "", new Object[0]);
    }
    return str1;
  }
  
  private void Ko(String paramString)
  {
    com.tencent.mm.ui.base.h.a(this, paramString, "", false, new PhoneRechargeUI.10(this));
  }
  
  private void bqb()
  {
    this.mAppId = "";
    bqc();
    this.errCode = 0;
    this.Yy = "";
    this.desc = "";
  }
  
  private void bqc()
  {
    this.moR = new ArrayList();
    n localn1 = new n();
    localn1.name = getString(a.i.wallet_recharge_default_item_0);
    localn1.status = 0;
    n localn2 = new n();
    localn2.name = getString(a.i.wallet_recharge_default_item_1);
    localn2.status = 0;
    n localn3 = new n();
    localn3.name = getString(a.i.wallet_recharge_default_item_2);
    localn3.status = 0;
    n localn4 = new n();
    localn4.name = getString(a.i.wallet_recharge_default_item_3);
    localn4.status = 0;
    n localn5 = new n();
    localn5.name = getString(a.i.wallet_recharge_default_item_4);
    localn5.status = 0;
    n localn6 = new n();
    localn6.name = getString(a.i.wallet_recharge_default_item_5);
    localn6.status = 0;
    this.moR.add(localn1);
    this.moR.add(localn2);
    this.moR.add(localn3);
    this.moR.add(localn4);
    this.moR.add(localn5);
    this.moR.add(localn6);
    this.moS = new ArrayList();
    localn1 = new n();
    localn1.name = getString(a.i.wallet_recharge_default_item_6);
    localn1.status = 0;
    localn2 = new n();
    localn2.name = getString(a.i.wallet_recharge_default_item_7);
    localn2.status = 0;
    localn3 = new n();
    localn3.name = getString(a.i.wallet_recharge_default_item_8);
    localn3.status = 0;
    this.moS.add(localn1);
    this.moS.add(localn2);
    this.moS.add(localn3);
  }
  
  private void bqd()
  {
    com.tencent.mm.kernel.g.DF().a(new com.tencent.mm.plugin.recharge.model.f(this.mpE.getText()), 0);
  }
  
  private void c(l paraml, boolean paramBoolean)
  {
    if ((this.eXG == null) || ((this.eXG != null) && (!this.eXG.isShowing()))) {
      if (!paramBoolean) {
        break label62;
      }
    }
    label62:
    for (this.eXG = com.tencent.mm.wallet_core.ui.g.a(this.mController.tml, true, new PhoneRechargeUI.21(this, paraml));; this.eXG = com.tencent.mm.wallet_core.ui.g.b(this.mController.tml, true, new PhoneRechargeUI.2(this, paraml)))
    {
      com.tencent.mm.kernel.g.DF().a(paraml, 0);
      return;
    }
  }
  
  private void m(l paraml)
  {
    if ((this.eXG != null) && (this.eXG.isShowing()) && (paraml.getType() != 497))
    {
      this.eXG.dismiss();
      this.eXG = null;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.recharge.model.f))
    {
      paramString = (com.tencent.mm.plugin.recharge.model.f)paraml;
      if (paramString.cmdId == 0)
      {
        if ((!bi.oW(paramString.eTa)) && (!paramString.eTa.equals(this.mpE.getText())))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhoneRechargeUI", "hy: mobiel num not match.abourt, %s, %s", new Object[] { paramString.eTa, this.mpE.getText() });
          return;
        }
        m(paraml);
        if (paramString.moQ)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PhoneRechargeUI", "hy: cgi failed.");
          Ko(paramString.Yy);
          bqb();
          return;
        }
        this.mAppId = paramString.appId;
        this.moR = paramString.moR;
        this.moT = paramString.moT;
        this.moU = paramString.moU;
        this.moV = paramString.moV;
        this.moW = paramString.moW;
        this.errCode = paramString.errCode;
        this.Yy = paramString.Yy;
        this.mpS = paramString.desc;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhoneRechargeUI", "desc: %s, mobile: %s", new Object[] { this.mpS, this.mpE.getText() });
        if (bi.oW(this.mpS))
        {
          this.desc = "";
          this.mpT = getResources().getColor(a.c.normal_text_color);
        }
        for (;;)
        {
          this.mpX = paramString.moY;
          this.moS = paramString.moS;
          if (this.moS == null) {
            break;
          }
          paramInt1 = this.moS.size() - 1;
          while (paramInt1 >= 0)
          {
            paraml = (n)this.moS.get(paramInt1);
            if (paraml.name.isEmpty()) {
              this.moS.remove(paraml);
            }
            paramInt1 -= 1;
          }
          if ((this.mpW.mph != null) && (this.mpW.mph.mov.trim().equals(this.mpE.getText())))
          {
            this.mpW.mph.mow = this.mpS;
            this.mpW.setInput(this.mpW.mph);
          }
        }
        if ((paramString.moX == null) || ((paramString.moX.name.equals(this.moX.name)) && (paramString.moX.url.equals(this.moX.url)) && (paramString.moX.pdR.equals(this.moX.pdR)) && (paramString.moX.dzE.equals(this.moX.dzE)))) {
          break label749;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhoneRechargeUI", "need to update head");
        this.moX = paramString.moX;
      }
    }
    label592:
    label749:
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2;
      if (this.mpS.equals(""))
      {
        bool2 = false;
        A(bool2, bool1);
        paraml = paramString.moZ;
        if (paraml != null)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PhoneRechargeUI", "update record history");
          com.tencent.mm.plugin.recharge.a.a.bpV().bP(paraml);
          if (this.mpW != null)
          {
            if (!paramString.mpa) {
              break label592;
            }
            this.mpW.hn(true);
          }
        }
      }
      for (;;)
      {
        this.mpE.postDelayed(new PhoneRechargeUI.11(this), 300L);
        return;
        bool2 = true;
        break;
        this.mpW.hn(false);
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhoneRechargeUI", "do delete phone number");
      return;
      if (!(paraml instanceof com.tencent.mm.plugin.recharge.model.g)) {
        break;
      }
      m(paraml);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paraml = ((com.tencent.mm.plugin.recharge.model.g)paraml).mpb;
        paraml.bVY = 6;
        paraml.qUI = 100;
        paraml.hvl = this.mpE.getText();
        if (this.mpW.mph != null) {}
        for (paramString = this.mpW.mph.name;; paramString = "")
        {
          paraml.fky = paramString;
          com.tencent.mm.pluginsdk.wallet.h.a(this, paraml, 2);
          com.tencent.mm.sdk.b.a.sFg.b(this.lSI);
          return;
        }
      }
      paraml = paramString;
      if (bi.oW(paramString)) {
        paraml = getString(a.i.wallet_unknown_err);
      }
      Ko(paraml);
      return;
    }
  }
  
  public final void bqe()
  {
    com.tencent.mm.plugin.recharge.model.f localf = new com.tencent.mm.plugin.recharge.model.f("", 1);
    com.tencent.mm.kernel.g.DF().a(localf, 0);
  }
  
  protected final int getLayoutId()
  {
    return a.g.phone_recharge_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject1 = null;
    Object localObject4 = null;
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      if (paramInt2 == -1)
      {
        this.mpY = true;
        ArrayList localArrayList = new ArrayList();
        Object localObject3 = paramIntent.getData();
        if (localObject3 == null)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PhoneRechargeUI", "hy: uri == null");
          return;
        }
        if (android.support.v4.content.a.f(this, "android.permission.READ_CONTACTS") != 0)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PhoneRechargeUI", "no contact permission");
          return;
        }
        Cursor localCursor1;
        Cursor localCursor2;
        try
        {
          localCursor1 = getContentResolver().query((Uri)localObject3, null, null, null, null);
          localObject3 = localObject1;
          if (localCursor1 == null) {
            break label510;
          }
          localObject3 = localObject1;
          if (localCursor1.getCount() <= 0) {
            break label510;
          }
          localCursor1.moveToFirst();
          int i = localCursor1.getColumnIndex("has_phone_number");
          if (i > 0)
          {
            localObject3 = localObject1;
            if (localCursor1.getInt(i) <= 0) {
              break label510;
            }
          }
          localObject1 = localCursor1.getString(localCursor1.getColumnIndex("_id"));
          localCursor2 = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + (String)localObject1, null, null);
          localObject1 = localObject4;
          if (localCursor2 != null)
          {
            localObject1 = localObject4;
            if (localCursor2.moveToFirst())
            {
              localObject1 = null;
              while (!localCursor2.isAfterLast())
              {
                i = localCursor2.getColumnIndex("data1");
                int j = localCursor2.getColumnIndex("display_name");
                localObject3 = localCursor2.getString(i);
                localObject1 = localCursor2.getString(j);
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PhoneRechargeUI", "hy: username : " + (String)localObject1);
                if (localObject3 != null)
                {
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PhoneRechargeUI", "hy: phoneNumber : " + (String)localObject3);
                  localObject3 = com.tencent.mm.plugin.recharge.model.b.pK((String)localObject3);
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PhoneRechargeUI", "hy: phoneNumber : " + (String)localObject3);
                  if ((PhoneNumberUtils.isGlobalPhoneNumber((String)localObject3)) && (((String)localObject3).length() == 11)) {
                    localArrayList.add(localObject3);
                  }
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PhoneRechargeUI", "hy: phoneResult : " + (String)localObject3);
                }
                localCursor2.moveToNext();
              }
            }
          }
        }
        catch (SecurityException localSecurityException)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PhoneRechargeUI", "hy: permission denied: %s", new Object[] { localSecurityException.toString() });
          com.tencent.mm.ui.base.h.b(this, getString(a.i.mall_recharge_read_contact_error), "", true);
        }
        localObject3 = localSecurityException;
        if (localCursor2 != null)
        {
          localCursor2.close();
          localObject3 = localSecurityException;
        }
        label510:
        if ((localCursor1 != null) && (!localCursor1.isClosed())) {
          localCursor1.close();
        }
        Object localObject2;
        if (localArrayList.size() > 1)
        {
          localObject2 = com.tencent.mm.ui.base.h.a(this, getString(a.i.wallet_recharge_pick_phone_number), localArrayList, -1, new PhoneRechargeUI.13(this, localArrayList, (String)localObject3));
          if (localObject2 != null) {
            ((com.tencent.mm.ui.widget.a.c)localObject2).setCanceledOnTouchOutside(true);
          }
        }
        else if (localArrayList.size() == 1)
        {
          this.mpW.setInput(new com.tencent.mm.plugin.recharge.model.a((String)localArrayList.get(0), (String)localObject3, 1));
          bqd();
        }
        else
        {
          com.tencent.mm.ui.base.h.b(this, getString(a.i.mall_recharge_pick_contact_error), "", true);
          continue;
          if (paramInt2 == -1)
          {
            if (!this.lSF)
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : ok");
              localObject2 = new com.tencent.mm.plugin.recharge.model.a(this.mpE.getText(), this.mpE.getTipsTv().getText().toString(), 0);
              com.tencent.mm.plugin.recharge.a.a.bpV().a((com.tencent.mm.plugin.recharge.model.a)localObject2);
              finish();
              this.lSF = true;
            }
          }
          else {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : cancel");
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.DF().a(1571, this);
    com.tencent.mm.kernel.g.DF().a(498, this);
    this.mpR = ((MallFunction)getIntent().getParcelableExtra("key_func_info"));
    if (this.mpR == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PhoneRechargeUI", "hy: function info is null");
      com.tencent.mm.ui.base.s.makeText(this, "function info is null", 1).show();
      finish();
    }
    bqc();
    setMMTitle(this.mpR.cbR);
    setBackBtn(new PhoneRechargeUI.1(this));
    this.moX = new com.tencent.mm.plugin.wallet.a.d();
    this.moX.name = getString(a.i.wallet_recharge_hardcode_head_name);
    this.moX.url = getString(a.i.wallet_recharge_hardcode_head_url);
    this.mpB = findViewById(a.f.phone_recharge_banner_rl);
    this.mpC = ((ImageView)findViewById(a.f.news_close));
    this.mpD = ((TextView)findViewById(a.f.news_wording));
    this.mpE = ((MallFormView)findViewById(a.f.recharge_content_input_view));
    com.tencent.mm.plugin.recharge.ui.form.c.b(this.mpE);
    this.mpW = new c.b(this.mpE);
    paramBundle = this.mpW;
    com.tencent.mm.sdk.platformtools.x.d(com.tencent.mm.plugin.recharge.ui.form.c.bP(), "hy: setMobileEditTv");
    Object localObject = paramBundle.mqP;
    c.b.1 local1 = new c.b.1(paramBundle);
    if (((MallFormView)localObject).mqV != null) {
      ((MallFormView)localObject).mqV.addTextChangedListener(local1);
    }
    localObject = (InstantAutoCompleteTextView)paramBundle.mqP.getContentEditText();
    paramBundle.mpg = com.tencent.mm.pluginsdk.a.cz(paramBundle.mqP.getContext());
    paramBundle.mqQ = new com.tencent.mm.plugin.recharge.ui.form.d(paramBundle.mqP, paramBundle.mpg);
    paramBundle.mqQ.mrD = new c.b.2(paramBundle);
    paramBundle.mqQ.mrE = this;
    paramBundle.hn(true);
    ((InstantAutoCompleteTextView)localObject).setShowAlways(true);
    ((InstantAutoCompleteTextView)localObject).setAdapter(paramBundle.mqQ);
    ((InstantAutoCompleteTextView)localObject).setOnItemClickListener(new c.b.3(paramBundle, (InstantAutoCompleteTextView)localObject));
    paramBundle.mqP.setOnFocusChangeListener(new c.b.4(paramBundle, (InstantAutoCompleteTextView)localObject));
    ((InstantAutoCompleteTextView)localObject).setOnClickListener(new c.b.5(paramBundle, (InstantAutoCompleteTextView)localObject));
    this.mpH = ((GridView)findViewById(a.f.recharge_phone_grid));
    this.mpJ = ((TextView)findViewById(a.f.recharge_remind));
    this.mpK = ((TextView)findViewById(a.f.recharge_weSim));
    this.mpL = ((TextView)findViewById(a.f.recharge_buy_card));
    this.mpM = ((TextView)findViewById(a.f.recharge_hall));
    this.mpF = ((TextView)findViewById(a.f.recharge_product_1_title));
    this.mpG = ((TextView)findViewById(a.f.recharge_product_2_title));
    this.mpI = ((GridView)findViewById(a.f.recharge_dataflow_grid));
    this.mpN = ((TextView)findViewById(a.f.recharge_product_1_lack_alert));
    this.mpO = ((TextView)findViewById(a.f.recharge_product_2_lack_alert));
    this.mpE.setOnInputValidChangeListener(new PhoneRechargeUI.12(this));
    this.mpE.getInfoIv().setOnClickListener(new PhoneRechargeUI.15(this));
    this.mpP = new b();
    this.mpP.mpw = new PhoneRechargeUI.16(this);
    this.mpQ = new b();
    this.mpQ.mpw = new PhoneRechargeUI.17(this);
    this.mpH.setAdapter(this.mpP);
    this.mpI.setAdapter(this.mpQ);
    this.mpC.setOnClickListener(new PhoneRechargeUI.18(this));
    this.mpD.setOnClickListener(new PhoneRechargeUI.19(this));
    this.mpE.bql();
    int i = com.tencent.mm.bp.a.fk(this) / 4 - 20;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhoneRechargeUI", "max width: %s", new Object[] { Integer.valueOf(i) });
    this.mpJ.setMaxWidth(i);
    this.mpK.setMaxWidth(i);
    this.mpL.setMaxWidth(i);
    this.mpM.setMaxWidth(i);
    this.mpT = getResources().getColor(a.c.normal_text_color);
    if ((this.mpW.mph != null) && (!bi.oW(this.mpW.mph.name))) {
      this.desc = this.mpW.mph.name;
    }
    this.mpE.getContentEditText().setHintTextColor(getResources().getColor(a.c.recharge_no_phone_hint_text_color));
    if (bi.oW(this.mpE.getText()))
    {
      c(new com.tencent.mm.plugin.recharge.model.f(""), false);
      return;
    }
    c(new com.tencent.mm.plugin.recharge.model.f(this.mpE.getText()), false);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.kernel.g.DF().b(1571, this);
    com.tencent.mm.kernel.g.DF().b(498, this);
    com.tencent.mm.sdk.b.a.sFg.c(this.lSI);
  }
  
  protected void onResume()
  {
    super.onResume();
    A(false, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */