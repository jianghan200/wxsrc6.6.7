package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.model.q;
import com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WalletCardElementUI
  extends WalletBaseUI
  implements TextView.OnEditorActionListener, WalletFormView.a
{
  private String countryCode;
  private String dDe;
  private String dDf;
  private Button eUb;
  private String kJy;
  private String kJz;
  private Orders mCZ = null;
  private PayInfo mCn = null;
  private TextView nZV;
  private Authen pfc = new Authen();
  a pgk = null;
  private com.tencent.mm.sdk.b.c phJ = new WalletCardElementUI.6(this);
  private WalletFormView phM;
  private TextView phN;
  private TextView phO;
  private int phQ = 1;
  private Profession[] pjD;
  private ElementQuery pkA = new ElementQuery();
  private Profession pkB;
  private WalletFormView psR;
  private Bankcard psS = null;
  private TextView ptA;
  private TextView ptB;
  private TextView ptC;
  private TextView ptD;
  private TextView ptE;
  private TextView ptF;
  private TextView ptG;
  private TextView ptH;
  private WalletFormView ptI;
  private WalletFormView ptJ;
  private WalletFormView ptK;
  private WalletFormView ptL;
  private WalletFormView ptM;
  private WalletFormView ptN;
  private WalletFormView ptO;
  private WalletFormView ptP;
  private WalletFormView ptQ;
  private WalletFormView ptR;
  private WalletFormView ptS;
  private WalletFormView ptT;
  private WalletFormView ptU;
  private WalletFormView ptV;
  private WalletPhoneInputView ptW;
  private ScrollView ptX;
  private WalletFormView ptY = null;
  private WalletFormView ptZ;
  private Map<String, a.a> pua = null;
  private boolean pub = false;
  private CheckBox puc;
  private CheckBox pud;
  private String pue;
  private boolean puf;
  private boolean pug;
  private String puh;
  private WalletFormView pui;
  private List<ElementQuery> puj = new ArrayList();
  private int puk;
  private BaseAdapter pul = new BaseAdapter()
  {
    private Integer zq(int paramAnonymousInt)
    {
      return (Integer)WalletCardElementUI.d(WalletCardElementUI.this).bOF().get(paramAnonymousInt);
    }
    
    public final int getCount()
    {
      if (WalletCardElementUI.d(WalletCardElementUI.this).bOF() != null) {
        return WalletCardElementUI.d(WalletCardElementUI.this).bOF().size();
      }
      return 0;
    }
    
    public final long getItemId(int paramAnonymousInt)
    {
      return paramAnonymousInt;
    }
    
    public final View getView(int paramAnonymousInt, View paramAnonymousView, ViewGroup paramAnonymousViewGroup)
    {
      paramAnonymousView = (CheckedTextView)View.inflate(WalletCardElementUI.this, a.g.wallet_list_dialog_item_singlechoice, null);
      paramAnonymousView.setText(o.bPe().Q(WalletCardElementUI.this, zq(paramAnonymousInt).intValue()));
      if (WalletCardElementUI.k(WalletCardElementUI.this) == zq(paramAnonymousInt).intValue())
      {
        paramAnonymousView.setChecked(true);
        return paramAnonymousView;
      }
      paramAnonymousView.setChecked(false);
      return paramAnonymousView;
    }
  };
  private View.OnClickListener pum = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(11353, new Object[] { Integer.valueOf(2), Integer.valueOf(0) });
      e.e(WalletCardElementUI.this, o.bOW().aCl());
    }
  };
  
  private boolean ZB()
  {
    WalletFormView localWalletFormView = this.ptY;
    this.ptY = null;
    if (!this.ptI.dX(null))
    {
      if ((this.ptY == null) && (localWalletFormView != this.ptI)) {
        this.ptY = this.ptI;
      }
      this.ptD.setText(a.i.wallet_card_bankcard_type_err_tips);
      this.ptD.setTextColor(getResources().getColor(a.c.red));
    }
    for (boolean bool1 = false;; bool1 = true)
    {
      if (!this.psR.dX(null))
      {
        if ((this.ptY == null) && (localWalletFormView != this.psR)) {
          this.ptY = this.psR;
        }
        bool1 = false;
      }
      if (!this.ptZ.dX(this.ptB))
      {
        if ((this.ptY == null) && (localWalletFormView != this.ptZ)) {
          this.ptY = this.ptZ;
        }
        bool1 = false;
      }
      int i;
      if ((!this.phM.dX(this.phO)) && (!this.pub))
      {
        if ((this.ptY == null) && (localWalletFormView != this.phM)) {
          this.ptY = this.phM;
        }
        this.phO.setText(a.i.wallet_card_identify_err_hint);
        this.phO.setTextColor(getResources().getColor(a.c.red));
        i = 1;
        bool1 = false;
      }
      for (;;)
      {
        boolean bool2;
        if (!this.ptM.dX(this.phO)) {
          if (i != 0)
          {
            this.phO.setText(a.i.wallet_card_err_id_phone);
            this.phO.setTextColor(getResources().getColor(a.c.red));
            if ((this.ptY == null) && (localWalletFormView != this.ptM)) {
              this.ptY = this.ptM;
            }
            bool2 = false;
            label299:
            if (this.phO.getVisibility() == 4)
            {
              if (!this.pkA.pnm) {
                break label915;
              }
              this.phO.setText(getString(a.i.wallet_card_identify_first_tips));
              label334:
              this.phO.setTextColor(getResources().getColor(a.c.hint_text_color));
              this.phO.setVisibility(0);
            }
            if (this.ptK.dX(this.ptF)) {
              break label969;
            }
            if ((this.ptY == null) && (localWalletFormView != this.ptK)) {
              this.ptY = this.ptK;
            }
            i = 1;
            bool2 = false;
          }
        }
        for (;;)
        {
          if (!this.ptJ.dX(this.ptF))
          {
            if ((this.ptY == null) && (localWalletFormView != this.ptJ)) {
              this.ptY = this.ptJ;
            }
            bool1 = false;
          }
          for (;;)
          {
            if (!this.puc.isChecked()) {
              bool1 = false;
            }
            if (!this.ptP.dX(this.ptG))
            {
              if ((this.ptY == null) && (localWalletFormView != this.ptP)) {
                this.ptY = this.ptP;
              }
              bool1 = false;
            }
            if (!this.ptQ.dX(this.ptG))
            {
              if ((this.ptY == null) && (localWalletFormView != this.ptQ)) {
                this.ptY = this.ptQ;
              }
              bool1 = false;
            }
            if (!this.ptR.dX(this.ptG))
            {
              if ((this.ptY == null) && (localWalletFormView != this.ptR)) {
                this.ptY = this.ptR;
              }
              bool1 = false;
            }
            if (!this.ptS.dX(this.ptG))
            {
              if ((this.ptY == null) && (localWalletFormView != this.ptS)) {
                this.ptY = this.ptS;
              }
              bool1 = false;
            }
            if (!this.ptT.dX(this.ptG))
            {
              if ((this.ptY == null) && (localWalletFormView != this.ptT)) {
                this.ptY = this.ptT;
              }
              bool1 = false;
            }
            if (!this.ptU.dX(this.ptG))
            {
              if ((this.ptY == null) && (localWalletFormView != this.ptU)) {
                this.ptY = this.ptU;
              }
              bool1 = false;
            }
            bool2 = bool1;
            if (!this.ptV.dX(this.ptG))
            {
              if ((this.ptY == null) && (localWalletFormView != this.ptV)) {
                this.ptY = this.ptV;
              }
              bool2 = false;
            }
            bool1 = bool2;
            if (this.pug)
            {
              bool1 = bool2;
              if (!this.ptN.dX(null))
              {
                if ((this.ptY == null) && (localWalletFormView != this.ptN)) {
                  this.ptY = this.ptN;
                }
                bool1 = false;
              }
            }
            bool2 = bool1;
            if (this.puf)
            {
              bool2 = bool1;
              if (!this.ptO.dX(null))
              {
                if ((this.ptY == null) && (localWalletFormView != this.ptO)) {
                  this.ptY = this.ptO;
                }
                bool2 = false;
              }
            }
            if (!bool2) {
              break label951;
            }
            this.eUb.setEnabled(true);
            this.eUb.setClickable(true);
            if (localWalletFormView != null) {
              localWalletFormView.setImeOptions(1073741824);
            }
            return bool2;
            this.phO.setText(a.i.wallet_card_err_phone);
            this.phO.setTextColor(getResources().getColor(a.c.red));
            break;
            bool2 = bool1;
            if (i == 0) {
              break label299;
            }
            this.phO.setVisibility(0);
            bool2 = bool1;
            break label299;
            label915:
            this.phO.setText(getString(a.i.wallet_card_identify_security));
            break label334;
            bool1 = bool2;
            if (i != 0)
            {
              this.ptF.setVisibility(4);
              bool1 = bool2;
            }
          }
          label951:
          this.eUb.setEnabled(false);
          this.eUb.setClickable(false);
          return bool2;
          label969:
          i = 0;
        }
        i = 0;
      }
    }
  }
  
  private static void a(WalletFormView paramWalletFormView, int paramInt)
  {
    paramWalletFormView = paramWalletFormView.getLogicDelegate();
    if ((paramWalletFormView instanceof com.tencent.mm.wallet_core.ui.formview.a.a)) {
      ((com.tencent.mm.wallet_core.ui.formview.a.a)paramWalletFormView).Hf(paramInt);
    }
  }
  
  private static void a(WalletFormView paramWalletFormView, String paramString)
  {
    if (!bi.oW(paramString))
    {
      KeyListener localKeyListener = paramWalletFormView.getKeyListener();
      paramWalletFormView.setKeyListener(null);
      paramWalletFormView.setEnabled(false);
      paramWalletFormView.setClickable(false);
      paramWalletFormView.setText(paramString);
      paramWalletFormView.setKeyListener(localKeyListener);
      paramWalletFormView.setVisibility(0);
      return;
    }
    paramWalletFormView.setVisibility(8);
  }
  
  private static void a(boolean[] paramArrayOfBoolean, WalletFormView[] paramArrayOfWalletFormView, TextView paramTextView1, TextView paramTextView2)
  {
    a(paramArrayOfBoolean, paramArrayOfWalletFormView, paramTextView1, paramTextView2, false);
  }
  
  private static void a(boolean[] paramArrayOfBoolean, WalletFormView[] paramArrayOfWalletFormView, TextView paramTextView1, TextView paramTextView2, boolean paramBoolean)
  {
    int k = paramArrayOfBoolean.length;
    int i = 0;
    int j = 0;
    if (i < k)
    {
      if (paramArrayOfBoolean[i] != 0)
      {
        j = 1;
        paramArrayOfWalletFormView[i].setVisibility(0);
      }
      for (;;)
      {
        i += 1;
        break;
        paramArrayOfWalletFormView[i].setVisibility(8);
      }
    }
    if (j != 0)
    {
      paramTextView1.setVisibility(0);
      if (paramTextView2 != null)
      {
        if (!paramBoolean) {
          break label82;
        }
        paramTextView2.setVisibility(8);
      }
    }
    label82:
    do
    {
      return;
      paramTextView2.setVisibility(4);
      return;
      paramTextView1.setVisibility(8);
    } while (paramTextView2 == null);
    paramTextView2.setVisibility(8);
  }
  
  private void aL()
  {
    if (this.pkA == null) {
      this.pkA = new ElementQuery();
    }
    Object localObject1;
    if (this.pkA.pnN == 0)
    {
      this.ptW.bQN();
      if ((this.pkA == null) || (this.pua == null) || (!this.pua.containsKey(this.pkA.lMV))) {
        break label718;
      }
      localObject1 = (a.a)this.pua.get(this.pkA.lMV);
      if ((localObject1 == null) || (((a.a)localObject1).psy == null)) {
        break label1806;
      }
    }
    label145:
    label285:
    label419:
    label549:
    label718:
    label923:
    label958:
    label972:
    label999:
    label1057:
    label1244:
    label1336:
    label1386:
    label1403:
    label1571:
    label1588:
    label1691:
    label1702:
    label1713:
    label1784:
    label1796:
    label1806:
    for (double d = ((a.a)localObject1).psz;; d = 0.0D)
    {
      localObject1 = getString(a.i.wallet_card_bank_favor_tips, new Object[] { e.B(d) });
      this.ptH.setText((CharSequence)localObject1);
      this.ptH.setVisibility(0);
      com.tencent.mm.wallet_core.a.af(this);
      localObject1 = (Bankcard)this.sy.getParcelable("key_bankcard");
      Object localObject2;
      Object localObject3;
      TextView localTextView1;
      TextView localTextView2;
      boolean bool1;
      boolean bool2;
      if ((bQd()) && (localObject1 != null))
      {
        this.ptZ.setHint(getString(a.i.wallet_card_forgot_id_hint, new Object[] { ((Bankcard)localObject1).field_bankcardTail }));
        localObject1 = this.ptZ;
        localObject2 = this.ptA;
        localObject3 = this.ptB;
        a(new boolean[] { true }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3);
        localObject1 = this.ptI;
        localObject2 = this.ptC;
        localObject3 = this.ptD;
        a(new boolean[] { false }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3);
        if (!Bankcard.zj(this.pkA.pjA)) {
          break label972;
        }
        localObject1 = this.psR;
        localObject2 = this.ptL;
        localObject3 = this.phM;
        localTextView1 = this.phN;
        localTextView2 = this.phO;
        a(new boolean[] { 0, 0, 0 }, new WalletFormView[] { localObject1, localObject2, localObject3 }, localTextView1, localTextView2);
        this.ptM.setVisibility(8);
        ju(true);
        this.ptO.setVisibility(8);
        this.ptN.setVisibility(8);
        findViewById(a.f.wallet_card_private_info_tipmsg).setVisibility(8);
        bool1 = this.pkA.pno;
        bool2 = this.pkA.pnp;
        localObject1 = this.ptK;
        localObject2 = this.ptJ;
        localObject3 = this.ptE;
        localTextView1 = this.ptF;
        a(new boolean[] { bool1, bool2 }, new WalletFormView[] { localObject1, localObject2 }, (TextView)localObject3, localTextView1);
        if (this.ptI.getVisibility() != 0) {
          break label1784;
        }
        switch (this.pkA.pns)
        {
        default: 
          this.ptD.setVisibility(8);
          this.ptD.setTextColor(getResources().getColor(a.c.normal_color));
        }
      }
      for (;;)
      {
        if ((!bi.oW(this.pkA.pnM)) && (this.ptD.getVisibility() != 0))
        {
          x.i("MicroMsg.WalletCardElmentUI", "show pre auth word");
          this.ptD.setText(this.pkA.pnM);
          this.ptD.setVisibility(0);
        }
        if ((bi.oW(this.pkA.pnx)) || (!com.tencent.mm.model.s.he(this.pkA.pnx)) || (bQd())) {
          break label1796;
        }
        this.pud.setText(this.pkA.pny);
        this.pud.setVisibility(0);
        return;
        this.ptW.bQO();
        localObject1 = (EditText)this.ptW.findViewById(a.f.prefix_input_et);
        a(this.ptW.getPhoneNumberEt(), (EditText)localObject1, 0, false, false, true);
        break;
        this.ptH.setVisibility(8);
        break label145;
        if (!bi.oW(this.pkA.knE))
        {
          this.ptI.setText(this.pkA.knE);
          if (!this.pkA.bOu()) {
            break label923;
          }
          this.pui.setVisibility(0);
          this.pui.setText(getString(a.i.wallet_credit_card));
        }
        for (;;)
        {
          localObject1 = this.ptZ;
          localObject2 = this.ptA;
          localObject3 = this.ptB;
          a(new boolean[] { false }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3, true);
          localObject1 = this.ptI;
          localObject2 = this.ptC;
          localObject3 = this.ptD;
          a(new boolean[] { true }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3, true);
          this.ptZ.setOnInfoIvClickListener(this.pum);
          if (!o.bOW().bPw().bPk()) {
            break label958;
          }
          this.ptZ.getInfoIv().setImageResource(a.h.wallet_scan_camera);
          this.ptZ.getInfoIv().setVisibility(0);
          break;
          if (this.pkA.bOE())
          {
            this.pui.setVisibility(0);
            this.pui.setText(getString(a.i.wallet_deposit_card));
          }
        }
        this.ptZ.getInfoIv().setVisibility(4);
        break label285;
        if ((this.pkA.bOF() != null) && (this.pkA.bOF().size() > 0))
        {
          bool1 = true;
          if ((!bQd()) && (!o.bOW().bPp())) {
            break label1403;
          }
          localObject1 = o.bOW().aCl();
          if (bi.oW((String)localObject1)) {
            break label1386;
          }
          this.psR.setHint(getString(a.i.wallet_card_username_hint_forget, new Object[] { e.abZ((String)localObject1) }));
          localObject1 = this.psR;
          localObject2 = this.ptL;
          localObject3 = this.phM;
          localTextView1 = this.phN;
          localTextView2 = this.phO;
          a(new boolean[] { true, bool1, true }, new WalletFormView[] { localObject1, localObject2, localObject3 }, localTextView1, localTextView2);
          this.ptM.setVisibility(0);
          if (this.psS != null)
          {
            if (!bi.oW(this.psS.field_mobile)) {
              a(this.ptM, this.psS.field_mobile);
            }
            if (!bi.oW(this.psS.pln)) {
              a(this.ptK, this.psS.pln);
            }
            if (!bi.oW(this.psS.plS)) {
              a(this.ptJ, this.psS.plS);
            }
          }
          if (!this.pkA.pnm) {
            break label1571;
          }
          this.phO.setText("");
          if ((!bQd()) || (o.bOW().bPy() <= 0)) {
            break label1588;
          }
          this.ptL.setClickable(false);
          this.ptL.setText(o.bPe().Q(this, o.bOW().bPy()));
          this.ptL.setEnabled(false);
          a(this.phM, this.phQ);
          zp(this.phQ);
          ju(false);
          if (this.puf) {
            break label1691;
          }
          this.ptO.setVisibility(8);
          if (this.pug) {
            break label1702;
          }
          this.ptN.setVisibility(8);
        }
        for (;;)
        {
          if ((this.puf) || (this.pug)) {
            break label1713;
          }
          findViewById(a.f.wallet_card_private_info_tipmsg).setVisibility(8);
          break;
          bool1 = false;
          break label999;
          this.psR.setHint(getString(a.i.wallet_card_username_hint));
          break label1057;
          bool2 = this.pkA.pnm;
          if ((bool1) && (this.pkA.pnn)) {}
          for (bool1 = true;; bool1 = false)
          {
            boolean bool3 = this.pkA.pnn;
            localObject1 = this.psR;
            localObject2 = this.ptL;
            localObject3 = this.phM;
            localTextView1 = this.phN;
            localTextView2 = this.phO;
            a(new boolean[] { bool2, bool1, bool3 }, new WalletFormView[] { localObject1, localObject2, localObject3 }, localTextView1, localTextView2);
            this.ptM.setVisibility(0);
            x.i("MicroMsg.WalletCardElmentUI", "elemt canModifyName:" + this.pkA.pnm + " canModifyIdentity:" + this.pkA.pnn);
            break;
          }
          this.phO.setText(getString(a.i.wallet_card_identify_security));
          break label1244;
          if (this.pul.getCount() <= 1)
          {
            this.ptL.setClickable(false);
            this.ptL.setEnabled(false);
          }
          for (;;)
          {
            localObject1 = this.pkA.bOF();
            if ((localObject1 == null) || (!((List)localObject1).contains(Integer.valueOf(this.phQ)))) {
              this.phQ = 1;
            }
            this.ptL.setText(o.bPe().Q(this, this.phQ));
            break;
            this.ptL.setClickable(true);
            this.ptL.setEnabled(true);
          }
          this.ptO.setVisibility(0);
          break label1336;
          this.ptN.setVisibility(0);
        }
        findViewById(a.f.wallet_card_private_info_tipmsg).setVisibility(0);
        break label419;
        this.ptD.setText(a.i.wallet_card_cardtype_tipmsg_cn);
        this.ptD.setVisibility(0);
        break label549;
        this.ptD.setVisibility(8);
        break label549;
        this.ptD.setVisibility(8);
        break label549;
        this.ptD.setVisibility(8);
        break label549;
        this.ptD.setVisibility(8);
      }
      this.pud.setVisibility(8);
      return;
    }
  }
  
  private void bQc()
  {
    Object localObject1;
    boolean bool;
    if (ZB())
    {
      com.tencent.mm.plugin.wallet_core.e.c.bQW();
      if (!bi.oW(this.pkA.pnx))
      {
        localObject1 = this.sy;
        if ((this.pud.getVisibility() != 0) || (!this.pud.isChecked())) {
          break label885;
        }
        bool = true;
        ((Bundle)localObject1).putBoolean("key_is_follow_bank_username", bool);
        this.sy.putString("key_bank_username", this.pkA.pnx);
      }
      localObject1 = (FavorPayInfo)this.sy.getParcelable("key_favor_pay_info");
      if ((this.pkA != null) && (localObject1 != null) && (this.pgk != null) && (this.pua != null))
      {
        if (!this.pua.containsKey(this.pkA.lMV)) {
          break label890;
        }
        ((FavorPayInfo)localObject1).pnP = ((a.a)this.pua.get(this.pkA.lMV)).psy.pem;
        label162:
        this.sy.putParcelable("key_favor_pay_info", (Parcelable)localObject1);
      }
      this.pfc = new Authen();
      if (this.psS != null)
      {
        this.pfc.lMW = this.psS.plT;
        this.pfc.plp = this.psS.field_bankcardTail;
      }
      localObject1 = this.sy.getString("key_card_id");
      if (this.ptZ.getVisibility() != 0) {
        break label935;
      }
      localObject1 = this.ptZ.getText();
    }
    label516:
    label885:
    label890:
    label914:
    label925:
    label935:
    for (;;)
    {
      this.pfc.mpb = ((PayInfo)this.sy.getParcelable("key_pay_info"));
      this.pfc.plm = ((String)localObject1);
      this.pfc.lMV = this.pkA.lMV;
      this.pfc.pll = this.phQ;
      this.pfc.pli = this.sy.getString("key_pwd1");
      if (!bi.oW(this.ptK.getText())) {
        this.pfc.pln = this.ptK.getText();
      }
      this.pfc.pjw = this.ptM.getText();
      this.pfc.plr = this.ptP.getText();
      this.pfc.pls = this.ptQ.getText();
      this.pfc.country = this.pue;
      this.pfc.csK = this.kJy;
      this.pfc.csL = this.kJz;
      this.pfc.dRH = this.ptS.getText();
      this.pfc.knG = this.ptT.getText();
      this.pfc.eXM = this.ptU.getText();
      this.pfc.csD = this.ptV.getText();
      localObject1 = e.aca(this.pfc.pjw);
      this.sy.putString("key_mobile", (String)localObject1);
      Object localObject2 = this.sy;
      if (this.pkA.pjA == 2)
      {
        bool = true;
        ((Bundle)localObject2).putBoolean("key_is_oversea", bool);
        this.pfc.plk = this.phM.getText();
        this.pfc.plj = this.psR.getText();
        this.pfc.plo = this.ptJ.getText();
        localObject2 = (FavorPayInfo)this.sy.getParcelable("key_favor_pay_info");
        if (localObject2 != null)
        {
          this.pfc.plt = ((FavorPayInfo)localObject2).pnS;
          this.pfc.plu = ((FavorPayInfo)localObject2).pnP;
        }
        this.pfc.plz = ("+" + this.ptW.getCountryCode());
        x.d("MicroMsg.WalletCardElmentUI", "payInfo " + this.pfc.mpb + " elemt.bankcardTag : " + this.pkA.pjA);
        x.i("MicroMsg.WalletCardElmentUI", " elemt.bankcardTag : " + this.pkA.pjA);
        localObject2 = this.sy;
        ((Bundle)localObject2).putString("key_mobile", (String)localObject1);
        ((Bundle)localObject2).putParcelable("key_authen", this.pfc);
        ((Bundle)localObject2).putString("key_bank_phone", this.pkA.pnw);
        ((Bundle)localObject2).putString("key_country_code", this.countryCode);
        ((Bundle)localObject2).putString("key_province_code", this.dDf);
        ((Bundle)localObject2).putString("key_city_code", this.dDe);
        ((Bundle)localObject2).putParcelable("key_profession", this.pkB);
        ((Bundle)localObject2).putString("key_bind_card_type", this.pfc.lMV);
        ((Bundle)localObject2).putString("key_bind_card_show1", this.pkA.knE);
        if (2 != this.pkA.pnt) {
          break label914;
        }
      }
      for (localObject1 = getString(a.i.wallet_credit_card);; localObject1 = getString(a.i.wallet_deposit_card))
      {
        ((Bundle)localObject2).putString("key_bind_card_show2", (String)localObject1);
        if (!cDL().m(new Object[] { this.pfc, this.mCZ })) {
          break label925;
        }
        x.i("MicroMsg.WalletCardElmentUI", "process controller deal with!!!");
        return;
        bool = false;
        break;
        ((FavorPayInfo)localObject1).pnP = this.pgk.bb(((FavorPayInfo)localObject1).pnP, false);
        break label162;
        bool = false;
        break label516;
      }
      x.e("MicroMsg.WalletCardElmentUI", "error process in the tenpay!!");
      return;
    }
  }
  
  private boolean bQd()
  {
    return this.sy.getBoolean("key_is_forgot_process", false);
  }
  
  private void ju(boolean paramBoolean)
  {
    int j = 0;
    if (paramBoolean)
    {
      Object localObject = this.nZV;
      if (this.pkA.pnA)
      {
        i = 0;
        ((TextView)localObject).setVisibility(i);
        localObject = this.ptP;
        if (!this.pkA.pnA) {
          break label213;
        }
        i = 0;
        label48:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.ptQ;
        if (!this.pkA.pnB) {
          break label219;
        }
        i = 0;
        label72:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.ptR;
        if (!this.pkA.pnC) {
          break label225;
        }
        i = 0;
        label96:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.ptS;
        if (!this.pkA.pnF) {
          break label231;
        }
        i = 0;
        label120:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.ptT;
        if (!this.pkA.pnH) {
          break label237;
        }
        i = 0;
        label144:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.ptU;
        if (!this.pkA.pnG) {
          break label243;
        }
        i = 0;
        label168:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.ptV;
        if (!this.pkA.pnI) {
          break label249;
        }
      }
      label213:
      label219:
      label225:
      label231:
      label237:
      label243:
      label249:
      for (int i = j;; i = 8)
      {
        ((WalletFormView)localObject).setVisibility(i);
        this.ptG.setVisibility(4);
        return;
        i = 8;
        break;
        i = 8;
        break label48;
        i = 8;
        break label72;
        i = 8;
        break label96;
        i = 8;
        break label120;
        i = 8;
        break label144;
        i = 8;
        break label168;
      }
    }
    this.nZV.setVisibility(8);
    this.ptP.setVisibility(8);
    this.ptQ.setVisibility(8);
    this.ptR.setVisibility(8);
    this.ptS.setVisibility(8);
    this.ptT.setVisibility(8);
    this.ptU.setVisibility(8);
    this.ptV.setVisibility(8);
    this.ptG.setVisibility(8);
  }
  
  private void zp(int paramInt)
  {
    if (paramInt == 1)
    {
      d(this.phM, 1, false);
      return;
    }
    d(this.phM, 1, true);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool2 = false;
    x.i("MicroMsg.WalletCardElmentUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    boolean bool1 = bool2;
    if (paramInt1 == 0)
    {
      bool1 = bool2;
      if (paramInt2 == 0)
      {
        paramString = this.sy;
        x.d("MicroMsg.WalletCardElmentUI", "PayInfo  " + this.mCn);
        bool1 = bool2;
        if ((paraml instanceof y))
        {
          x.i("MicroMsg.WalletCardElmentUI", "query bound bank card resp, forwardProcess");
          com.tencent.mm.wallet_core.a.j(this, paramString);
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public final void fE(boolean paramBoolean)
  {
    ZB();
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_card_element_ui;
  }
  
  protected final void initView()
  {
    this.ptA = ((TextView)findViewById(a.f.wallet_card_forgot_id_tipmsg));
    this.ptZ = ((WalletFormView)findViewById(a.f.wallet_card_forgot_id));
    com.tencent.mm.wallet_core.ui.formview.a.b(this.ptZ);
    this.ptB = ((TextView)findViewById(a.f.wallet_card_forgot_id_err_tipmsg));
    this.phN = ((TextView)findViewById(a.f.wallet_card_identify_tipmsg));
    this.psR = ((WalletFormView)findViewById(a.f.name_et));
    com.tencent.mm.wallet_core.ui.formview.a.e(this, this.psR);
    this.ptL = ((WalletFormView)findViewById(a.f.wallet_cre_type));
    this.phM = ((WalletFormView)findViewById(a.f.identity_et));
    com.tencent.mm.wallet_core.ui.formview.a.d(this.phM);
    this.phO = ((TextView)findViewById(a.f.wallet_card_identify_err_hint));
    this.ptC = ((TextView)findViewById(a.f.wallet_card_bankcard_type_tipmsg));
    this.ptI = ((WalletFormView)findViewById(a.f.wallet_card_name));
    this.pui = ((WalletFormView)findViewById(a.f.wallet_card_type));
    this.ptD = ((TextView)findViewById(a.f.wallet_card_cardtype_tipmsg));
    this.ptH = ((TextView)findViewById(a.f.wallet_card_favor));
    this.ptE = ((TextView)findViewById(a.f.wallet_card_cvv_tipmsg));
    this.ptK = ((WalletFormView)findViewById(a.f.cvv_et));
    com.tencent.mm.wallet_core.ui.formview.a.b(this, this.ptK);
    this.ptJ = ((WalletFormView)findViewById(a.f.date_et));
    com.tencent.mm.wallet_core.ui.formview.a.a(this, this.ptJ);
    this.ptF = ((TextView)findViewById(a.f.wallet_card_cvv_err_tipmsg));
    this.nZV = ((TextView)findViewById(a.f.wallet_card_address_tipmsg));
    this.ptP = ((WalletFormView)findViewById(a.f.first_name_et));
    this.ptQ = ((WalletFormView)findViewById(a.f.last_name_et));
    this.ptR = ((WalletFormView)findViewById(a.f.area_et));
    this.ptS = ((WalletFormView)findViewById(a.f.address_et));
    this.ptT = ((WalletFormView)findViewById(a.f.phone_et));
    this.ptU = ((WalletFormView)findViewById(a.f.post_et));
    this.ptV = ((WalletFormView)findViewById(a.f.email_et));
    com.tencent.mm.wallet_core.ui.formview.a.e(this.ptV);
    this.ptG = ((TextView)findViewById(a.f.wallet_card_address_err_tipmsg));
    this.puc = ((CheckBox)findViewById(a.f.agree_wx_cb));
    this.pud = ((CheckBox)findViewById(a.f.agree_follow_bank_cb));
    this.eUb = ((Button)findViewById(a.f.next_btn));
    this.ptX = ((ScrollView)findViewById(a.f.wallet_sv));
    this.ptN = ((WalletFormView)findViewById(a.f.private_profession_et));
    this.ptO = ((WalletFormView)findViewById(a.f.private_address_et));
    this.ptW = ((WalletPhoneInputView)findViewById(a.f.mobile_new_et));
    this.ptM = this.ptW.getPhoneNumberEt();
    this.psR.setOnInputValidChangeListener(this);
    this.ptZ.setOnInputValidChangeListener(this);
    this.ptL.setOnInputValidChangeListener(this);
    this.phM.setOnInputValidChangeListener(this);
    this.ptM.setOnInputValidChangeListener(new WalletFormView.a()
    {
      public final void fE(boolean paramAnonymousBoolean)
      {
        if (!paramAnonymousBoolean)
        {
          WalletCardElementUI.a(WalletCardElementUI.this);
          WalletCardElementUI.this.sy.putParcelable("key_history_bankcard", null);
        }
        WalletCardElementUI.b(WalletCardElementUI.this);
      }
    });
    this.ptK.setOnInputValidChangeListener(this);
    this.ptJ.setOnInputValidChangeListener(this);
    this.ptP.setOnInputValidChangeListener(this);
    this.ptQ.setOnInputValidChangeListener(this);
    this.ptR.setOnInputValidChangeListener(this);
    this.ptS.setOnInputValidChangeListener(this);
    this.ptT.setOnInputValidChangeListener(this);
    this.ptU.setOnInputValidChangeListener(this);
    this.ptV.setOnInputValidChangeListener(this);
    this.ptN.setOnInputValidChangeListener(this);
    this.ptO.setOnInputValidChangeListener(this);
    this.psR.setOnEditorActionListener(this);
    this.ptZ.setOnEditorActionListener(this);
    this.ptL.setOnEditorActionListener(this);
    this.phM.setOnEditorActionListener(this);
    this.ptM.setOnEditorActionListener(this);
    this.ptK.setOnEditorActionListener(this);
    this.ptJ.setOnEditorActionListener(this);
    this.ptP.setOnEditorActionListener(this);
    this.ptQ.setOnEditorActionListener(this);
    this.ptR.setOnEditorActionListener(this);
    this.ptS.setOnEditorActionListener(this);
    this.ptT.setOnEditorActionListener(this);
    this.ptU.setOnEditorActionListener(this);
    this.ptV.setOnEditorActionListener(this);
    this.ptO.setOnEditorActionListener(this);
    this.ptN.setOnEditorActionListener(this);
    this.ptI.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new Bundle();
        paramAnonymousView.putInt("key_support_bankcard", WalletCardElementUI.this.sy.getInt("key_support_bankcard", 3));
        paramAnonymousView.putInt("key_bind_scene", WalletCardElementUI.this.sy.getInt("key_bind_scene", -1));
        if (!bi.oW(WalletCardElementUI.c(WalletCardElementUI.this).getText()))
        {
          paramAnonymousView.putString("key_bank_type", WalletCardElementUI.d(WalletCardElementUI.this).lMV);
          paramAnonymousView.putInt("key_bankcard_type", WalletCardElementUI.d(WalletCardElementUI.this).pnt);
        }
        WalletCardElementUI.this.Wq();
        com.tencent.mm.wallet_core.c localc = com.tencent.mm.wallet_core.a.af(WalletCardElementUI.this);
        if (localc != null) {
          localc.a(WalletCardElementUI.this, WalletBankCardSelectUI.class, paramAnonymousView, 1);
        }
      }
    });
    this.pui.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new ArrayList();
        paramAnonymousView.add(WalletCardElementUI.this.getString(a.i.wallet_deposit_card));
        paramAnonymousView.add(WalletCardElementUI.this.getString(a.i.wallet_credit_card));
        ElementQuery localElementQuery;
        if (WalletCardElementUI.e(WalletCardElementUI.this).size() == 1)
        {
          localElementQuery = (ElementQuery)WalletCardElementUI.e(WalletCardElementUI.this).get(0);
          if (!localElementQuery.bOE()) {
            break label152;
          }
          paramAnonymousView.remove(1);
        }
        for (;;)
        {
          paramAnonymousView = new com.tencent.mm.ui.widget.picker.b(WalletCardElementUI.this.mController.tml, paramAnonymousView);
          paramAnonymousView.GC(WalletCardElementUI.f(WalletCardElementUI.this));
          paramAnonymousView.uLl = new WalletCardElementUI.8.1(this, paramAnonymousView);
          paramAnonymousView.GB(com.tencent.mm.bp.a.fromDPToPix(WalletCardElementUI.this.mController.tml, 288));
          paramAnonymousView.show();
          return;
          label152:
          if (localElementQuery.bOu()) {
            paramAnonymousView.remove(0);
          }
        }
      }
    });
    this.ptL.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        WalletCardElementUI.this.showDialog(1);
      }
    });
    this.ptO.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("GetAddress", true);
        paramAnonymousView.putExtra("ShowSelectedLocation", false);
        if (!Bankcard.zj(WalletCardElementUI.d(WalletCardElementUI.this).pjA))
        {
          paramAnonymousView.putExtra("IsRealNameVerifyScene", true);
          paramAnonymousView.putExtra("IsNeedShowSearchBar", true);
        }
        d.b(WalletCardElementUI.this.mController.tml, ".ui.tools.MultiStageCitySelectUI", paramAnonymousView, 4);
      }
    });
    this.ptN.setOnClickListener(new WalletCardElementUI.11(this));
    this.puc.setChecked(true);
    this.puc.setOnCheckedChangeListener(new WalletCardElementUI.12(this));
    findViewById(a.f.agree_btn).setOnClickListener(new WalletCardElementUI.13(this));
    this.ptR.setOnClickListener(new WalletCardElementUI.14(this));
    this.eUb.setOnClickListener(new WalletCardElementUI.2(this));
    d(this.ptZ, 0, false);
    d(this.phM, 1, false);
    a(this.ptM, 0, false, true, true);
    if ((this.pkA != null) && (!bi.oW(this.pkA.pnz)))
    {
      com.tencent.mm.ui.base.h.a(this, this.pkA.pnz, null, true, null);
      this.pkA = null;
    }
    for (;;)
    {
      aL();
      ZB();
      Object localObject = com.tencent.mm.wallet_core.a.af(this);
      if ((localObject != null) && (((com.tencent.mm.wallet_core.c)localObject).cCT()))
      {
        localObject = (Orders)this.sy.getParcelable("key_orders");
        if ((localObject == null) || (((Orders)localObject).poP != 1)) {
          break;
        }
        this.pub = true;
        this.psR.setText(e.abZ(((Orders)localObject).plj));
        this.psR.setEnabled(false);
        this.psR.setFocusable(false);
        this.phQ = ((Orders)localObject).poR;
        this.ptL.setText(o.bPe().Q(this, this.phQ));
        this.ptL.setEnabled(false);
        this.phM.setText(((Orders)localObject).poQ);
        this.phM.setEnabled(false);
        this.phM.setFocusable(false);
        this.phN.setText(a.i.wallet_card_assigned_userinfo_tips);
      }
      return;
      if ((this.sy.getInt("key_bind_scene", -1) == 5) && (!this.pkA.pnO))
      {
        com.tencent.mm.ui.base.h.a(this, getString(a.i.wallet_wx_offline_no_support_micropay_dialog_content), null, true, null);
        this.pkA.knE = null;
      }
    }
    this.pub = false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.WalletCardElmentUI", "onAcvityResult requestCode:" + paramInt1);
    if (this.ptW.d(paramInt1, paramInt2, paramIntent)) {}
    while (paramInt2 != -1) {
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      ZB();
      return;
      this.pkA = null;
      this.puk = 0;
      this.puh = paramIntent.getStringExtra("bank_name");
      this.ptI.setText(this.puh);
      this.pui.setVisibility(0);
      this.pui.setText("");
      paramIntent = o.bPe().pjy;
      this.puj.clear();
      if (paramIntent != null)
      {
        paramIntent = paramIntent.iterator();
        do
        {
          do
          {
            if (!paramIntent.hasNext()) {
              break;
            }
            localObject = (ElementQuery)paramIntent.next();
          } while (!((ElementQuery)localObject).knE.equals(this.puh));
          this.puj.add(localObject);
          if ((this.sy.getInt("key_bind_scene", -1) == 5) && (!((ElementQuery)localObject).pnO)) {
            ((ElementQuery)localObject).pnz = getString(a.i.wallet_wx_offline_no_support);
          }
        } while (this.puj.size() < 2);
      }
      if (this.puj.size() == 1) {
        this.pkA = ((ElementQuery)this.puj.get(0));
      }
      this.psS = null;
      aL();
      continue;
      Object localObject = paramIntent.getStringExtra("CountryName");
      String str1 = paramIntent.getStringExtra("Country");
      this.pue = ((String)localObject + "|" + str1);
      String str2 = paramIntent.getStringExtra("ProviceName");
      String str3 = paramIntent.getStringExtra("CityName");
      if (!bi.oW(paramIntent.getStringExtra("Contact_City")))
      {
        this.kJy = (str2 + "|" + paramIntent.getStringExtra("Contact_Province"));
        this.kJz = (str3 + "|" + paramIntent.getStringExtra("Contact_City"));
        if (bi.oW((String)localObject))
        {
          this.ptR.setText(str2 + " " + str3);
          label486:
          if ((!"US".equals(str1)) && (!"CA".equals(str1)) && (!this.pkA.pnG)) {
            break label709;
          }
          this.ptU.setVisibility(0);
        }
      }
      for (;;)
      {
        x.i("MicroMsg.WalletCardElmentUI", "onActivityResult for address countryName %s,countryCode %s, provinceName %s, cityName %s, mCity %s", new Object[] { localObject, str1, str2, str3, this.kJz });
        break;
        this.ptR.setText((String)localObject + " " + str3);
        break label486;
        if (!bi.oW(paramIntent.getStringExtra("Contact_Province")))
        {
          this.kJz = (str2 + "|" + paramIntent.getStringExtra("Contact_Province"));
          this.ptR.setText((String)localObject + " " + str2);
          break label486;
        }
        this.kJz = this.pue;
        this.ptR.setText((String)localObject);
        break label486;
        label709:
        this.ptU.setVisibility(8);
      }
      paramIntent = paramIntent.getStringExtra("key_bankcard_id");
      this.ptZ.set3DesValStr(paramIntent);
      continue;
      localObject = paramIntent.getStringExtra("CountryName");
      str1 = paramIntent.getStringExtra("ProviceName");
      str2 = paramIntent.getStringExtra("CityName");
      this.countryCode = paramIntent.getStringExtra("Country");
      this.dDf = paramIntent.getStringExtra("Contact_Province");
      this.dDe = paramIntent.getStringExtra("Contact_City");
      paramIntent = new StringBuilder();
      if (!bi.oW((String)localObject)) {
        paramIntent.append((String)localObject);
      }
      if (!bi.oW(str1)) {
        paramIntent.append(" ").append(str1);
      }
      if (!bi.oW(str2)) {
        paramIntent.append(" ").append(str2);
      }
      this.ptO.setText(paramIntent.toString());
      continue;
      this.pkB = ((Profession)paramIntent.getParcelableExtra("key_select_profession"));
      this.ptN.setText(this.pkB.pkT);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    super.onCreate(paramBundle);
    this.pkA = ((ElementQuery)this.sy.getParcelable("elemt_query"));
    this.mCZ = ((Orders)this.sy.getParcelable("key_orders"));
    this.mCn = ((PayInfo)this.sy.getParcelable("key_pay_info"));
    this.phQ = o.bOW().bPy();
    this.psS = ((Bankcard)this.sy.getParcelable("key_history_bankcard"));
    this.puf = this.sy.getBoolean("key_need_area", false);
    this.pug = this.sy.getBoolean("key_need_profession", false);
    if ((this.puf) || (this.pug)) {
      setMMTitle(a.i.wallet_elment_title2);
    }
    for (;;)
    {
      paramBundle = this.sy.getParcelableArray("key_profession_list");
      if (paramBundle == null) {
        break;
      }
      this.pjD = new Profession[paramBundle.length];
      while (i < paramBundle.length)
      {
        this.pjD[i] = ((Profession)paramBundle[i]);
        i += 1;
      }
      setMMTitle(a.i.wallet_elment_title);
    }
    if (this.mCn == null) {
      this.mCn = new PayInfo();
    }
    x.d("MicroMsg.WalletCardElmentUI", "mPayInfo " + this.mCn);
    paramBundle = (FavorPayInfo)this.sy.getParcelable("key_favor_pay_info");
    if ((this.mCZ != null) && (paramBundle != null))
    {
      this.pgk = b.psB.a(this.mCZ);
      if (this.pgk == null) {
        break label344;
      }
      paramBundle = this.pgk.Pp(paramBundle.pnP);
      this.pua = this.pgk.Pl(paramBundle);
    }
    for (;;)
    {
      initView();
      this.ptX.pageScroll(33);
      com.tencent.mm.plugin.wallet_core.e.c.b(this, this.sy, 3);
      com.tencent.mm.sdk.b.a.sFg.b(this.phJ);
      return;
      label344:
      x.w("MicroMsg.WalletCardElmentUI", " get favorLogicHelper null");
    }
  }
  
  public void onDestroy()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.phJ);
    super.onDestroy();
  }
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    x.d("MicroMsg.WalletCardElmentUI", "onEditorAction actionId : " + paramInt);
    switch (paramInt)
    {
    default: 
      if (this.ptY == null) {
        bQc();
      }
      return false;
    }
    boolean bool1;
    if (this.ptY != null)
    {
      paramTextView = this.ptY;
      if (paramTextView.uZy != null)
      {
        bool1 = paramTextView.uZy.isFocusable();
        if (!bool1) {
          break label145;
        }
        paramTextView = this.ptY;
        bool1 = bool2;
        if (paramTextView.uZy != null) {
          bool1 = paramTextView.uZy.isClickable();
        }
        if ((!bool1) || (!this.ptY.cDT())) {
          break label145;
        }
        this.ptY.cDV();
      }
    }
    for (;;)
    {
      return true;
      bool1 = false;
      break;
      label145:
      this.ptY.performClick();
      continue;
      bQc();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */