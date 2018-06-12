package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.d.d;
import com.tencent.mm.plugin.card.d.f;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.ab;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.protocal.c.ky;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.statusbar.DrawStatusBarActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CardAcceptCardListUI
  extends DrawStatusBarActivity
  implements e, MMActivity.a
{
  int cae = 8;
  private String dxx = "";
  private com.tencent.mm.ui.base.p fUo = null;
  HashMap<String, Integer> hAR = new HashMap();
  private View hAX;
  private View hAY;
  private View hAZ;
  protected a hBa = null;
  private View hBb;
  private View hBc;
  private TextView hBd;
  private Button hBe;
  LinkedList<ky> hBf = new LinkedList();
  int hBg = 7;
  String hBh = "";
  String hBi = "";
  private String hBj = "";
  LinkedList<ky> hBk = new LinkedList();
  LinkedList<String> hBl = new LinkedList();
  protected ListView htk = null;
  protected RelativeLayout htm = null;
  private boolean hvg = false;
  private String hxf = "";
  private int hxg;
  private String hxh;
  private int hxi;
  private String hxj;
  public int hzB = 0;
  private String hzC = "";
  private String hzD = "";
  public ArrayList<String> hzE = new ArrayList();
  public ArrayList<String> hzF = new ArrayList();
  private Button hzu;
  
  private String axO()
  {
    if ((!TextUtils.isEmpty(this.hzC)) && (!TextUtils.isEmpty(this.hzD))) {
      return this.hzC + "," + com.tencent.mm.plugin.card.d.l.xZ(this.hzD);
    }
    if (!TextUtils.isEmpty(this.hzC)) {
      return this.hzC;
    }
    if (!TextUtils.isEmpty(this.hzD)) {
      return com.tencent.mm.plugin.card.d.l.xZ(this.hzD);
    }
    return "";
  }
  
  private ArrayList<CardInfo> ay(List<CardInfo> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0))
    {
      x.e("MicroMsg.CardAcceptCardListUI", "geCardInfoListByTpId list is empty!");
      return null;
    }
    this.hBk.clear();
    this.hBl.clear();
    this.hAR.clear();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i < paramList.size())
    {
      CardInfo localCardInfo = (CardInfo)paramList.get(i);
      if (this.hBl.contains(localCardInfo.field_card_tp_id))
      {
        int j = ((Integer)this.hAR.get(localCardInfo.field_card_tp_id)).intValue();
        this.hAR.put(localCardInfo.field_card_tp_id, Integer.valueOf(j + 1));
      }
      for (;;)
      {
        i += 1;
        break;
        localArrayList.add(localCardInfo);
        this.hAR.put(localCardInfo.field_card_tp_id, Integer.valueOf(1));
        this.hBl.add(localCardInfo.field_card_tp_id);
      }
    }
    return localArrayList;
  }
  
  private void ayc()
  {
    if (!TextUtils.isEmpty(this.hxj))
    {
      this.hBd.setText(this.hxj);
      return;
    }
    this.hBd.setText(a.g.card_share_card_private_setting);
  }
  
  private void nR(int paramInt)
  {
    x.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI finishUI() result_code:" + paramInt);
    Intent localIntent = new Intent();
    localIntent.putExtra("card_list", this.hxf);
    localIntent.putExtra("result_code", paramInt);
    setResult(0, localIntent);
    finish();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    Object localObject1;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paraml instanceof ab))
      {
        dO(false);
        paramString = (ab)paraml;
        paraml = paramString.hwU;
        this.hxg = paramString.hxg;
        this.hxh = paramString.hxh;
        this.hxi = paramString.hxi;
        this.hxj = paramString.hxj;
        x.i("MicroMsg.CardAcceptCardListUI", "accept_button_status: " + this.hxg + "  accept_button_wording: " + this.hxh);
        x.i("MicroMsg.CardAcceptCardListUI", "private_status: " + this.hxi + "  private_wording: " + this.hxj);
        paramString = f.xO(paraml);
        paraml = ay(paramString);
        if ((paramString != null) && (paramString.size() > 0))
        {
          x.i("MicroMsg.CardAcceptCardListUI", "The card info list size is " + paramString.size());
          if ((paraml != null) && (paraml.size() > 0))
          {
            localObject1 = this.hBa;
            localObject2 = this.hAR;
            if (paraml != null)
            {
              ((a)localObject1).hzT.clear();
              ((a)localObject1).hzT.addAll(paraml);
              ((a)localObject1).hAR.putAll((Map)localObject2);
            }
          }
          this.hBa.notifyDataSetChanged();
          if (((CardInfo)paramString.get(0)).avS()) {
            this.hvg = true;
          }
          this.hAY.setVisibility(0);
          if (this.hBa.getCount() <= 0) {
            break label856;
          }
          paramString = this.hBa.nQ(0);
          m.a(this, paramString);
          this.hAX.setBackgroundColor(com.tencent.mm.plugin.card.d.l.xV(paramString.awm().dxh));
          com.tencent.mm.ui.statusbar.a.c(this.mController.contentView, com.tencent.mm.plugin.card.d.l.xV(paramString.awm().dxh), true);
          this.hBb.setVisibility(0);
          paraml = new StateListDrawable();
          paramInt1 = getResources().getDimensionPixelOffset(a.b.card_member_widget_bg_round_radius);
          if (this.hxg != 1) {
            break label706;
          }
          this.hzu.setEnabled(true);
          localObject1 = com.tencent.mm.plugin.card.d.l.cm(com.tencent.mm.plugin.card.d.l.xV(paramString.awm().dxh), paramInt1);
          Object localObject2 = com.tencent.mm.plugin.card.d.l.cm(com.tencent.mm.plugin.card.d.l.bc(paramString.awm().dxh, 175), paramInt1);
          paraml.addState(new int[] { 16842919 }, (Drawable)localObject2);
          paraml.addState(new int[0], (Drawable)localObject1);
          label462:
          this.hzu.setBackgroundDrawable(paraml);
          if (!TextUtils.isEmpty(this.hxh)) {
            this.hzu.setText(this.hxh);
          }
          if (this.hxi != 1) {
            break label757;
          }
          paramInt1 = getResources().getDimensionPixelOffset(a.b.NormalPadding);
          paraml = com.tencent.mm.plugin.card.d.l.e(this, getResources().getColor(a.a.white), paramInt1);
          localObject1 = com.tencent.mm.plugin.card.d.l.cm(getResources().getColor(a.a.white), paramInt1);
          localObject2 = new StateListDrawable();
          ((StateListDrawable)localObject2).addState(new int[] { 16842919 }, (Drawable)localObject1);
          ((StateListDrawable)localObject2).addState(new int[0], paraml);
          this.hBe.setBackgroundDrawable((Drawable)localObject2);
          paramInt1 = com.tencent.mm.plugin.card.d.l.xV(paramString.awm().dxh);
          paramInt2 = getResources().getColor(a.a.white);
          paramString = new ColorStateList(new int[][] { { 16842919, 16842910 }, new int[0] }, new int[] { paramInt1, paramInt2 });
          this.hBe.setTextColor(paramString);
          this.hBc.setVisibility(0);
          if (TextUtils.isEmpty(this.hxj)) {
            break label746;
          }
          this.hBd.setText(this.hxj);
        }
      }
    }
    label706:
    label746:
    label757:
    label856:
    do
    {
      do
      {
        return;
        x.e("MicroMsg.CardAcceptCardListUI", "The card info list size is 0!");
        break;
        this.hzu.setEnabled(false);
        localObject1 = com.tencent.mm.plugin.card.d.l.cm(com.tencent.mm.plugin.card.d.l.bc(paramString.awm().dxh, 175), paramInt1);
        paraml.addState(new int[0], (Drawable)localObject1);
        break label462;
        this.hBd.setText(a.g.card_share_card_private_setting);
        return;
        this.hBc.setVisibility(8);
        paramString = (RelativeLayout.LayoutParams)this.hAY.getLayoutParams();
        paramString.topMargin = getResources().getDimensionPixelSize(a.b.SmallPadding);
        paramString.bottomMargin = getResources().getDimensionPixelSize(a.b.LargestPadding);
        this.hAY.setLayoutParams(paramString);
        this.hAY.invalidate();
        paramString = (RelativeLayout.LayoutParams)this.hBb.getLayoutParams();
        paramString.addRule(8, a.d.list_layout);
        this.hBb.setLayoutParams(paramString);
        this.hBb.invalidate();
        return;
        this.hBb.setVisibility(8);
        this.hBc.setVisibility(8);
        this.hAX.setBackgroundColor(getResources().getColor(a.a.card_bg_color));
        return;
        if ((paraml instanceof com.tencent.mm.plugin.card.model.p))
        {
          dO(false);
          localObject1 = (com.tencent.mm.plugin.card.model.p)paraml;
          if (((com.tencent.mm.plugin.card.model.p)localObject1).hwV != 0)
          {
            paraml = ((com.tencent.mm.plugin.card.model.p)localObject1).hwW;
            paramString = paraml;
            if (TextUtils.isEmpty(paraml)) {
              paramString = getString(a.g.card_add_fail);
            }
            com.tencent.mm.ui.base.h.a(this, paramString, null, false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                paramAnonymousDialogInterface.dismiss();
                CardAcceptCardListUI.a(CardAcceptCardListUI.this, 2);
              }
            });
            this.hxf = ((com.tencent.mm.plugin.card.model.p)localObject1).hwU;
            return;
          }
          com.tencent.mm.ui.base.h.bA(this, getResources().getString(a.g.card_has_accept_tips));
          paramString = new Intent();
          paramString.putExtra("card_list", ((com.tencent.mm.plugin.card.model.p)localObject1).hwU);
          setResult(-1, paramString);
          x.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for card");
          com.tencent.mm.plugin.card.d.l.azQ();
          finish();
          return;
        }
      } while (!(paraml instanceof com.tencent.mm.plugin.card.sharecard.model.g));
      dO(false);
      paramString = ((com.tencent.mm.plugin.card.sharecard.model.g)paraml).hwU;
      paramInt1 = ((com.tencent.mm.plugin.card.sharecard.model.g)paraml).hwV;
      paraml = ((com.tencent.mm.plugin.card.sharecard.model.g)paraml).hwW;
      this.hxf = paramString;
      if (paramInt1 != 0)
      {
        paramString = paraml;
        if (TextUtils.isEmpty(paraml)) {
          paramString = getString(a.g.card_share_fail);
        }
        com.tencent.mm.ui.base.h.a(this, paramString, null, false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            paramAnonymousDialogInterface.dismiss();
            CardAcceptCardListUI.a(CardAcceptCardListUI.this, 2);
          }
        });
        return;
      }
      com.tencent.mm.ui.base.h.bA(this, getResources().getString(a.g.card_accept_success_tips));
      paraml = new Intent();
      paraml.putExtra("card_list", this.hxf);
      setResult(-1, paraml);
      x.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for sharecard");
      com.tencent.mm.plugin.card.d.l.azS();
      paraml = new ShareCardInfo();
      f.a(paraml, paramString);
      com.tencent.mm.plugin.card.d.l.a(paraml);
      am.axp().auM();
      finish();
      return;
      x.e("MicroMsg.CardAcceptCardListUI", "CardAddEntranceUI onSceneEnd() netsene type" + paraml.getType() + "errType = " + paramInt1 + " errCode = " + paramInt2);
      dO(false);
      d.b(this, paramString, paramInt2);
      if ((paraml instanceof com.tencent.mm.plugin.card.model.p))
      {
        this.hxf = paramString;
        return;
      }
    } while (!(paraml instanceof com.tencent.mm.plugin.card.sharecard.model.g));
    this.hxf = "";
  }
  
  public final void b(int paramInt1, int paramInt2, Intent paramIntent)
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
      this.hzB = paramIntent.getIntExtra("Ktag_range_index", 0);
      x.i("MicroMsg.CardAcceptCardListUI", "mPrivateSelelct : %d", new Object[] { Integer.valueOf(this.hzB) });
      if (this.hzB < 2) {
        break label417;
      }
      this.hzC = paramIntent.getStringExtra("Klabel_name_list");
      this.hzD = paramIntent.getStringExtra("Kother_user_name_list");
      x.d("MicroMsg.CardAcceptCardListUI", "mPrivateSelect : %d, names : %s", new Object[] { Integer.valueOf(this.hzB), this.hzC });
      if ((TextUtils.isEmpty(this.hzC)) && (TextUtils.isEmpty(this.hzD)))
      {
        x.e("MicroMsg.CardAcceptCardListUI", "mLabelNameList by getIntent is empty");
        ayc();
        return;
      }
      paramIntent = Arrays.asList(this.hzC.split(","));
      this.hzF = com.tencent.mm.plugin.card.d.l.aB(paramIntent);
      this.hzE = com.tencent.mm.plugin.card.d.l.aA(paramIntent);
      if ((this.hzD != null) && (this.hzD.length() > 0))
      {
        paramIntent = Arrays.asList(this.hzD.split(","));
        this.hzE.addAll(paramIntent);
      }
      if (this.hzF != null) {
        x.i("MicroMsg.CardAcceptCardListUI", "mPrivateIdsList size is " + this.hzF.size());
      }
      if (this.hzE != null)
      {
        x.i("MicroMsg.CardAcceptCardListUI", "mPrivateNamesList size is " + this.hzE.size());
        paramIntent = this.hzE.iterator();
        while (paramIntent.hasNext()) {
          x.d("MicroMsg.CardAcceptCardListUI", "username : %s", new Object[] { (String)paramIntent.next() });
        }
      }
      if (TextUtils.isEmpty(this.hzC)) {
        break;
      }
      if (this.hzB == 2)
      {
        this.hBd.setText(getString(a.g.card_share_card_private_setting_share, new Object[] { axO() }));
        return;
      }
    } while (this.hzB != 3);
    this.hBd.setText(getString(a.g.card_share_card_private_setting_not_share, new Object[] { axO() }));
    return;
    ayc();
    return;
    label417:
    ayc();
  }
  
  final void dO(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.fUo = com.tencent.mm.ui.base.p.b(this, getString(a.g.loading_tips), false, 0, null);
    }
    while ((this.fUo == null) || (!this.fUo.isShowing())) {
      return;
    }
    this.fUo.dismiss();
    this.fUo = null;
  }
  
  protected final int getLayoutId()
  {
    return a.e.card_accept_card_list_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.g.card_accept_card_list_ui_title);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        x.v("MicroMsg.CardAcceptCardListUI", "setBackBtn cancel");
        CardAcceptCardListUI.a(CardAcceptCardListUI.this, 1);
        return true;
      }
    });
    this.hAX = findViewById(a.d.card_accept_card_list_ui);
    this.hAY = findViewById(a.d.top_layout);
    this.hAZ = findViewById(a.d.list_layout);
    this.hAY.setVisibility(4);
    this.htk = ((ListView)findViewById(16908298));
    this.htm = ((RelativeLayout)findViewById(a.d.content_no_data));
    this.htk.setEmptyView(this.htm);
    this.hBa = new a(this);
    this.htk.setAdapter(this.hBa);
    this.htk.setOnItemClickListener(new CardAcceptCardListUI.2(this));
    this.hBb = findViewById(a.d.card_accept_layout);
    this.hzu = ((Button)findViewById(a.d.card_accept_btn));
    this.hzu.setOnClickListener(new CardAcceptCardListUI.3(this));
    this.hzu.setEnabled(false);
    this.hBc = findViewById(a.d.card_private_setting_layout);
    this.hBd = ((TextView)findViewById(a.d.card_private_setting_tv));
    this.hBe = ((Button)findViewById(a.d.card_private_setting_btn));
    this.hBe.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        CardAcceptCardListUI.c(CardAcceptCardListUI.this);
      }
    });
    Object localObject2 = getIntent();
    if (localObject2 == null)
    {
      x.e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () intent == null");
      nR(2);
      return;
    }
    x.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI handle data");
    Object localObject3 = ((Intent)localObject2).getStringExtra("key_in_card_list");
    this.cae = ((Intent)localObject2).getIntExtra("key_from_scene", 8);
    Object localObject1 = ((Intent)localObject2).getStringExtra("key_package_name");
    localObject2 = ((Intent)localObject2).getStringExtra("key_sign");
    this.hBg = getIntent().getIntExtra("key_stastic_scene", 7);
    this.hBh = getIntent().getStringExtra("src_username");
    this.hBi = getIntent().getStringExtra("js_url");
    this.hBj = getIntent().getStringExtra("key_consumed_card_id");
    this.dxx = getIntent().getStringExtra("key_template_id");
    localObject3 = com.tencent.mm.plugin.card.d.h.aZ((String)localObject3, this.cae);
    if ((localObject3 == null) || (((List)localObject3).size() == 0))
    {
      x.e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () tempList == null || tempList.size() == 0");
      nR(2);
      return;
    }
    this.hBf.clear();
    this.hBf.addAll((Collection)localObject3);
    this.hBk.clear();
    this.hBl.clear();
    this.hAR.clear();
    localObject3 = this.hBf;
    dO(true);
    localObject1 = new ab((LinkedList)localObject3, this.cae, (String)localObject1, (String)localObject2, this.hBh, this.hBi, this.hBj, this.hBg);
    com.tencent.mm.kernel.g.Eh().dpP.a((com.tencent.mm.ab.l)localObject1, 0);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.Eh().dpP.a(690, this);
    com.tencent.mm.kernel.g.Eh().dpP.a(687, this);
    com.tencent.mm.kernel.g.Eh().dpP.a(902, this);
    initView();
  }
  
  protected void onDestroy()
  {
    com.tencent.mm.kernel.g.Eh().dpP.b(690, this);
    com.tencent.mm.kernel.g.Eh().dpP.b(687, this);
    com.tencent.mm.kernel.g.Eh().dpP.b(902, this);
    this.hBf.clear();
    a locala = this.hBa;
    locala.hzT.clear();
    locala.mContext = null;
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      x.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI onKeyDown() back cancel");
      nR(1);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardAcceptCardListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */