package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.card.ui.CardDetailUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.ArrayList;

public class ShareCardListUI
  extends CardBaseUI
  implements com.tencent.mm.plugin.card.base.d, j.a
{
  private boolean hAa = false;
  private boolean hAb = true;
  private boolean hAc = true;
  private boolean hAd = false;
  private String hAe = "";
  private boolean hAf = false;
  private boolean hAg = false;
  private boolean hAh = false;
  private int hAi = 0;
  private boolean hAj = false;
  private long hAk = 0L;
  boolean hAl = false;
  private long hAm = 0L;
  private final long hAn = 500L;
  private boolean hAo = false;
  private boolean hAp = false;
  private String hvN = null;
  private b.a hye = null;
  private com.tencent.mm.plugin.card.sharecard.a.b hzM;
  private f hzV;
  private e hzW;
  private i hzX;
  private boolean hzY = false;
  private boolean hzZ = true;
  private long mStartTime = 0L;
  
  private void axV()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ShareCardListUI", "initLocation");
    g.Em().H(new ShareCardListUI.1(this));
  }
  
  private void axW()
  {
    long l = System.currentTimeMillis() - this.hAm;
    if ((this.hAo) && (l < 1000L))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ShareCardListUI", "DoingUpdateView return");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ShareCardListUI", "try2UpdateView isDoingUpdateView %s,interval %s", new Object[] { Boolean.valueOf(this.hAo), Long.valueOf(l) });
    this.hAo = true;
    if (l < 500L)
    {
      ah.i(new ShareCardListUI.5(this), 500L);
      return;
    }
    if ((this.hAi == 0) || (this.hAi == 4) || ((this.hAi == 2) && ((!com.tencent.mm.plugin.card.sharecard.a.b.axI()) || (!com.tencent.mm.plugin.card.sharecard.a.b.axH()))) || ((this.hAi == 1) && ((!com.tencent.mm.plugin.card.sharecard.a.b.axI()) || (com.tencent.mm.plugin.card.sharecard.a.b.axH()))) || ((this.hAi == 3) && ((!com.tencent.mm.plugin.card.sharecard.a.b.axH()) || (com.tencent.mm.plugin.card.sharecard.a.b.axI())))) {
      this.hAi = com.tencent.mm.plugin.card.sharecard.a.b.axG();
    }
    am.axn().putValue("key_share_card_show_type", Integer.valueOf(this.hAi));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardListUI", "updateView() currentType is %s, canShowLocalCity %s, canShowOtherCity %s", new Object[] { Integer.valueOf(this.hAi), Boolean.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.axI()), Boolean.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.axH()) });
    f localf = this.hzV;
    localf.hzR.setVisibility(0);
    localf.hzQ.setImageDrawable(localf.gKS.getResources().getDrawable(a.c.card_has_card_entrance_bg));
    localf.hzR.setText(a.g.card_share_card_list_has_card_tips_title);
    localf.hzS.setText(a.g.card_share_card_list_has_card_tips);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localf.hzQ.getLayoutParams();
    localLayoutParams.topMargin = localf.gKS.getResources().getDimensionPixelOffset(a.b.card_no_card_tip_img_top_margin_for_share_card_ui);
    localf.hzQ.setLayoutParams(localLayoutParams);
    localf.hzQ.invalidate();
    if ((!com.tencent.mm.plugin.card.sharecard.a.b.axI()) && (!com.tencent.mm.plugin.card.sharecard.a.b.axH()))
    {
      this.hzW.axU();
      this.hzX.hAr.setVisibility(8);
      if (this.htk.getEmptyView() != this.htm)
      {
        this.htk.setEmptyView(this.htm);
        this.htk.invalidate();
      }
    }
    for (;;)
    {
      axX();
      this.hAm = System.currentTimeMillis();
      this.hAo = false;
      return;
      this.hzW.aL();
      this.hzX.aL();
      if ((this.hAi == 4) && (this.htk.getEmptyView() != null))
      {
        this.htk.setEmptyView(null);
        this.htk.invalidate();
      }
    }
  }
  
  private void axX()
  {
    if ((this.htl instanceof c))
    {
      c localc = (c)this.htl;
      localc.hzJ = this.hAi;
      localc.a(null, null);
    }
  }
  
  private void axY()
  {
    if ((com.tencent.mm.plugin.card.sharecard.a.b.axK()) && (com.tencent.mm.plugin.card.sharecard.a.b.axL()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardListUI", "doGetLayout() no data to load");
      this.hAc = true;
      return;
    }
    if ((!com.tencent.mm.plugin.card.sharecard.a.b.axK()) || (!com.tencent.mm.plugin.card.sharecard.a.b.axL())) {
      this.hAb = false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardListUI", "doGetLayout() >> doNetSceneGetCardsHomePageLayout()");
    axZ();
    am.axo().p("", "", 4);
  }
  
  private void axZ()
  {
    if (this.hAd)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShareCardListUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
      return;
    }
    if ((bi.oW(this.hAe)) && (!com.tencent.mm.plugin.card.sharecard.a.b.axI()) && (!com.tencent.mm.plugin.card.sharecard.a.b.axH()) && (!com.tencent.mm.plugin.card.sharecard.a.b.axI()) && (!com.tencent.mm.plugin.card.sharecard.a.b.axH()))
    {
      this.hzW.axR();
      this.htk.setEmptyView(null);
      this.htk.invalidate();
      this.hAp = true;
    }
    if ((this.hAb) && (!bi.oW(this.hAe))) {
      this.hAe = "";
    }
    this.hAd = true;
    com.tencent.mm.plugin.card.sharecard.model.b localb = new com.tencent.mm.plugin.card.sharecard.model.b(am.axo().cXm, am.axo().cXn, this.hAe);
    g.Eh().dpP.a(localb, 0);
  }
  
  private void aya()
  {
    int i = getIntent().getIntExtra("key_from_scene", 22);
    boolean bool1 = com.tencent.mm.s.c.Cp().aT(262152, 266256);
    boolean bool2 = com.tencent.mm.s.c.Cp().aU(262152, 266256);
    boolean bool3 = com.tencent.mm.s.c.Cp().a(aa.a.sPM, aa.a.sPO);
    boolean bool4 = com.tencent.mm.s.c.Cp().a(aa.a.sPN, aa.a.sPP);
    String str = bi.oV((String)g.Ei().DT().get(aa.a.sPS, null));
    if (bool1)
    {
      h.mEJ.h(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(2), Integer.valueOf(i), "", Integer.valueOf(0), str });
      return;
    }
    if (bool2)
    {
      h.mEJ.h(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(1), Integer.valueOf(i), "", Integer.valueOf(0), str });
      return;
    }
    if ((bool3) && (!bool4))
    {
      h.mEJ.h(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(3), Integer.valueOf(i), "", Integer.valueOf(0), str });
      return;
    }
    if ((bool3) && (bool4))
    {
      h.mEJ.h(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(4), Integer.valueOf(i), "", Integer.valueOf(0), str });
      return;
    }
    if (bool4)
    {
      h.mEJ.h(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(5), Integer.valueOf(i), "", Integer.valueOf(0), str });
      return;
    }
    h.mEJ.h(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(i), "", Integer.valueOf(0), str });
  }
  
  private void dP(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardListUI", "doRefreshData() >> updateView() shouldGetLayout %s fromOnresume %s", new Object[] { Boolean.valueOf(this.hzZ), Boolean.valueOf(paramBoolean) });
    if (this.hzZ)
    {
      this.hzZ = false;
      this.hAf = false;
      this.hAb = true;
      this.hAe = "";
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ShareCardListUI", "doRefreshData() >> doNetSceneGetCardsHomePageLayout()");
      if (!paramBoolean) {
        break label92;
      }
      if ((this.hAj) && (this.hAl)) {
        avK();
      }
    }
    for (;;)
    {
      axW();
      return;
      label92:
      axZ();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    boolean bool = true;
    super.a(paramInt1, paramInt2, paramString, paraml);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof com.tencent.mm.plugin.card.sharecard.model.b))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.b)paraml;
        this.hAd = false;
        this.hAe = paramString.hym;
        this.hzM.af(paramString.hwU, this.hAb);
        if ((!com.tencent.mm.plugin.card.sharecard.a.b.axK()) || (!com.tencent.mm.plugin.card.sharecard.a.b.axL())) {
          this.hAb = false;
        }
        if ((!com.tencent.mm.plugin.card.sharecard.a.b.axK()) || (!com.tencent.mm.plugin.card.sharecard.a.b.axL())) {
          break label110;
        }
      }
      for (;;)
      {
        this.hAc = bool;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardListUI", "NetSceneGetShareCardsLayout() >> updateView()");
        axW();
        return;
        label110:
        bool = false;
      }
    }
    if ((paraml instanceof com.tencent.mm.plugin.card.sharecard.model.b))
    {
      if (this.hAp)
      {
        this.hAp = false;
        this.hzW.axS();
        this.htk.setEmptyView(this.htm);
        this.htk.invalidate();
      }
      this.hAd = false;
      this.hAc = true;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardListUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  protected final void a(com.tencent.mm.plugin.card.base.b paramb)
  {
    Intent localIntent = new Intent(this, CardDetailUI.class);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardListUI", "card tp id:" + paramb.awr());
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardListUI", "card id:" + paramb.awq());
    localIntent.putExtra("key_card_id", am.axq().xA(paramb.awr()));
    localIntent.putExtra("key_card_tp_id", paramb.awr());
    localIntent.putExtra("key_is_share_card", true);
    localIntent.putExtra("key_from_scene", 3);
    startActivity(localIntent);
    com.tencent.mm.plugin.card.sharecard.a.b.xx(paramb.awr());
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ShareCardListUI", "onNotifyChange");
    this.hzZ = true;
  }
  
  protected final void avD()
  {
    setMMTitle(a.g.card_share_card_list_ui_title);
    this.hzM = new com.tencent.mm.plugin.card.sharecard.a.b(this);
    this.hye = new b.a() {};
    this.hzM.hye = this.hye;
    this.hzM.init();
    this.hAi = com.tencent.mm.plugin.card.sharecard.a.b.axG();
    Object localObject;
    if (this.hzX == null)
    {
      this.hzX = new i(this, this.mController.contentView);
      localObject = this.hzX;
      ((i)localObject).hAr = View.inflate(((i)localObject).gKS, a.e.card_share_no_local_city_item, null);
      ((i)localObject).hAs = ((TextView)((i)localObject).hAr.findViewById(a.d.card_item_category_title));
      ((i)localObject).hAt = ((TextView)((i)localObject).hAr.findViewById(a.d.card_item_subcategory_title));
      ((i)localObject).aL();
    }
    if (this.hzV == null)
    {
      this.hzV = new f(this, this.mController.contentView);
      localObject = this.hzV;
      ((f)localObject).hzQ = ((ImageView)((f)localObject).hyK.findViewById(a.d.no_card_tip_img));
      ((f)localObject).hzS = ((TextView)((f)localObject).hyK.findViewById(a.d.no_card_tip_text));
      ((f)localObject).hzR = ((TextView)((f)localObject).hyK.findViewById(a.d.no_card_tip_title));
      this.hzV.hzM = this.hzM;
    }
    if (this.hzW == null)
    {
      localObject = this.mController.contentView;
      this.hzW = new e(this);
      this.hzW.hzM = this.hzM;
      this.hzW.axQ();
      localObject = this.hzW;
      ShareCardListUI.3 local3 = new ShareCardListUI.3(this);
      if (((e)localObject).hzL != null) {
        ((e)localObject).hzL.setOnClickListener(local3);
      }
    }
    if (this.htn != null) {
      this.htn.addView(this.hzX.hAr);
    }
    if (this.hto != null) {
      this.hto.addView(this.hzW.hzL);
    }
    this.htk.setVisibility(0);
    this.htk.setOnScrollListener(new ShareCardListUI.4(this));
    if ((getIntent() != null) && (getIntent().getBooleanExtra("KEY_IS_SHOW_SHARE_CARD_ENTRANCE_TIPS", true)))
    {
      localObject = (Integer)g.Ei().DT().get(aa.a.sQe, Integer.valueOf(0));
      if ((localObject == null) || (((Integer)localObject).intValue() != 1))
      {
        g.Ei().DT().a(aa.a.sQe, Integer.valueOf(1));
        com.tencent.mm.plugin.card.d.d.c(this, a.e.card_show_share_card_entrance_tips, a.g.card_share_card_tips_title, "");
      }
    }
    for (;;)
    {
      this.hvN = getIntent().getStringExtra("KEY_CARD_TP_ID");
      this.hAe = getIntent().getStringExtra("key_layout_buff");
      if (!bi.oW(this.hAe)) {
        this.hzZ = false;
      }
      if (!bi.oW(this.hvN))
      {
        this.hzY = true;
        this.hAa = true;
      }
      return;
      localObject = (Integer)g.Ei().DT().get(aa.a.sQe, Integer.valueOf(0));
      if ((localObject != null) && (((Integer)localObject).intValue() != 1)) {
        g.Ei().DT().a(aa.a.sQe, Integer.valueOf(1));
      }
    }
  }
  
  protected final BaseAdapter avF()
  {
    return new c(this.mController.tml);
  }
  
  protected final boolean avG()
  {
    return super.avG();
  }
  
  protected final boolean avH()
  {
    return false;
  }
  
  protected final void avM()
  {
    this.hAh = true;
    if (this.hAf)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShareCardListUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
      if (this.hAj) {
        avL();
      }
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ShareCardListUI", "onLocationFinish()");
    this.hAf = true;
    axY();
    avL();
  }
  
  protected final void avN()
  {
    if ((this.hAg) || (this.hAf))
    {
      avL();
      return;
    }
    this.hAg = true;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardListUI", "onLocationFail()");
    axY();
  }
  
  protected final void avO()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardListUI", "onMPermissionGranted LocationPermissionGranted " + this.hAj);
    if (!this.hAj)
    {
      this.hAj = true;
      axV();
    }
  }
  
  public final void awx()
  {
    com.tencent.mm.plugin.card.sharecard.a.b.axF();
    this.hzZ = true;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardListUI", "onDBchange() shouldRefreshDataOnDbChange %s  mIsActive %s hasLocationInfo %s", new Object[] { Boolean.valueOf(this.hAa), Boolean.valueOf(this.htq), Boolean.valueOf(this.hAh) });
    if ((this.hAa) && (this.htq) && (this.hAh)) {
      dP(false);
    }
    for (;;)
    {
      this.hAa = false;
      return;
      axW();
    }
  }
  
  protected final void b(com.tencent.mm.plugin.card.base.b paramb)
  {
    if (paramb != null) {
      com.tencent.mm.plugin.card.sharecard.a.b.xs(paramb.awr());
    }
    super.b(paramb);
  }
  
  protected final void c(com.tencent.mm.plugin.card.base.b paramb)
  {
    super.c(paramb);
  }
  
  protected final void initView()
  {
    super.initView();
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardListUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
    this.hAj = bool;
    if (this.hAj)
    {
      axV();
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShareCardListUI", "location permission is denied, doGetLayout");
    axY();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    long l = System.currentTimeMillis();
    this.mStartTime = l;
    this.hAk = l;
    initView();
    g.Eh().dpP.a(1164, this);
    am.axp().a(this);
    aya();
    am.axq().c(this);
  }
  
  protected void onDestroy()
  {
    if (this.hAj) {
      avL();
    }
    this.hzV.hzM = null;
    this.hzW.hzM = null;
    this.hzM.hye = null;
    g.Eh().dpP.b(1164, this);
    am.axp().b(this);
    com.tencent.mm.plugin.card.sharecard.a.b.axJ();
    am.axq().d(this);
    long l = System.currentTimeMillis() - this.hAk;
    if (!TextUtils.isEmpty(this.hvN)) {
      h.mEJ.h(13219, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Long.valueOf(l) });
    }
    for (;;)
    {
      super.onDestroy();
      return;
      h.mEJ.h(13219, new Object[] { "ShareCardListUI", Integer.valueOf(1), "", "", Long.valueOf(l) });
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    aya();
    if (paramIntent != null)
    {
      this.hvN = paramIntent.getStringExtra("KEY_CARD_TP_ID");
      if (!bi.oW(this.hvN))
      {
        this.hzY = true;
        this.hAa = true;
      }
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    this.hzZ = false;
    this.hAa = true;
  }
  
  protected void onResume()
  {
    dP(true);
    long l = System.currentTimeMillis();
    if (this.mStartTime != 0L)
    {
      int i = (int)(l - this.mStartTime);
      ArrayList localArrayList = new ArrayList();
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(56);
      localIDKey1.SetValue(1L);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(57);
      localIDKey2.SetValue(i);
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      h.mEJ.b(localArrayList, true);
      this.mStartTime = 0L;
    }
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */