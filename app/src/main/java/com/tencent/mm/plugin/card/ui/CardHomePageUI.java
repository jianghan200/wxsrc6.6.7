package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.b.k;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.ad;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.ArrayList;

public class CardHomePageUI
  extends CardBaseUI
  implements com.tencent.mm.plugin.card.base.d, j.a
{
  private int fromScene = 0;
  private boolean hAb = true;
  private boolean hAd = false;
  private String hAe = "";
  private boolean hAf = false;
  private boolean hAg = false;
  private long hAk = 0L;
  boolean hAl = false;
  private i hEC;
  private f hED;
  private f hEE;
  private f hEF;
  private boolean hEG = true;
  private boolean hEH = false;
  private TextView hEI;
  private com.tencent.mm.plugin.card.sharecard.a.b hzM;
  private boolean hzZ = false;
  private long mStartTime = 0L;
  
  private void aL()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardHomePageUI", "updateView()");
    this.hEC.ayP();
    ayK();
    this.hEE.aL();
    this.hEF.aL();
  }
  
  private void axV()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CardHomePageUI", "initLocation");
    g.Em().H(new Runnable()
    {
      public final void run()
      {
        CardHomePageUI.c(CardHomePageUI.this);
        CardHomePageUI.d(CardHomePageUI.this);
        CardHomePageUI.this.hAl = true;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CardHomePageUI", "initLocation end");
      }
    });
  }
  
  private void axY()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CardHomePageUI", "doGetLayout() >> doNetSceneGetCardsHomePageLayout()");
    Object localObject;
    if (!this.hEG)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, shouldGetHomePage is false");
      if (!com.tencent.mm.plugin.card.d.l.azR()) {
        break label209;
      }
      int i = ((Integer)g.Ei().DT().get(aa.a.sPY, Integer.valueOf(1))).intValue();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BatchGetCardMgr", "need do getCardsLayoutScene scene is " + i);
      localObject = new ad(am.axo().cXm, am.axo().cXn, i);
      g.Eh().dpP.a((com.tencent.mm.ab.l)localObject, 0);
    }
    for (;;)
    {
      am.axo().p("", "", 4);
      return;
      if (this.hAd)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
        break;
      }
      if ((this.hAb) && (!bi.oW(this.hAe))) {
        this.hAe = "";
      }
      this.hAd = true;
      this.hEG = false;
      localObject = new com.tencent.mm.plugin.card.sharecard.model.b(am.axo().cXm, am.axo().cXn, this.hAe);
      g.Eh().dpP.a((com.tencent.mm.ab.l)localObject, 0);
      break;
      label209:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardHomePageUI", "the card entrance is not open, don't do doNetSceneGetCardsLayout!");
    }
  }
  
  private void ayK()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardHomePageUI", "updateMemberCardItem()");
    Object localObject = (c)this.htl;
    if (this.hEI == null)
    {
      this.hEI = ((TextView)findViewById(a.d.member_card_show_all_tv));
      this.hEI.setOnClickListener(new CardHomePageUI.5(this));
    }
    if (((c)localObject).getCount() > 0)
    {
      this.hEI.setVisibility(0);
      this.hEI.setText(getString(a.g.card_show_all_member_card, new Object[] { Integer.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.axE()) }));
    }
    for (;;)
    {
      this.hED.hyK.setVisibility(8);
      return;
      this.hEI.setVisibility(0);
      this.hEI.setText(getString(a.g.card_show_all_member_card, new Object[] { Integer.valueOf(0) }));
      localObject = (LinearLayout)findViewById(a.d.card_home_page_header);
      if (localObject != null)
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)((LinearLayout)localObject).getLayoutParams();
        localLayoutParams.topMargin = com.tencent.mm.bp.a.fromDPToPix(this, 29);
        localLayoutParams.bottomMargin = com.tencent.mm.bp.a.fromDPToPix(this, 29);
        ((LinearLayout)localObject).setLayoutParams(localLayoutParams);
      }
    }
  }
  
  private void ayL()
  {
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    localIntent.putExtra("preferred_tab", 3);
    com.tencent.mm.bg.d.e(this, "com.tencent.mm.ui.LauncherUI", localIntent);
    finish();
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
      h.mEJ.h(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(2), Integer.valueOf(i), "", Integer.valueOf(0), str });
      return;
    }
    if (bool2)
    {
      h.mEJ.h(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(1), Integer.valueOf(i), "", Integer.valueOf(0), str });
      return;
    }
    if ((bool3) && (!bool4))
    {
      h.mEJ.h(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(3), Integer.valueOf(i), "", Integer.valueOf(0), str });
      return;
    }
    if ((bool3) && (bool4))
    {
      h.mEJ.h(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(4), Integer.valueOf(i), "", Integer.valueOf(0), str });
      return;
    }
    if (bool4)
    {
      h.mEJ.h(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(5), Integer.valueOf(i), "", Integer.valueOf(0), str });
      return;
    }
    h.mEJ.h(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(i), "", Integer.valueOf(0), str });
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    super.a(paramInt1, paramInt2, paramString, paraml);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof ad))
      {
        ayK();
        this.htr.Ij();
        this.hEF.aL();
      }
      while (!(paraml instanceof com.tencent.mm.plugin.card.sharecard.model.b)) {
        return;
      }
      paramString = (com.tencent.mm.plugin.card.sharecard.model.b)paraml;
      this.hAd = false;
      this.hAe = paramString.hym;
      this.hzM.af(paramString.hwU, this.hAb);
      if ((!com.tencent.mm.plugin.card.sharecard.a.b.axK()) || (!com.tencent.mm.plugin.card.sharecard.a.b.axL())) {
        this.hAb = false;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardHomePageUI", "NetSceneGetShareCardsLayout() >> updateView()");
      aL();
      return;
    }
    if ((paraml instanceof com.tencent.mm.plugin.card.sharecard.model.b)) {
      this.hAd = false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardHomePageUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    this.hzZ = true;
  }
  
  protected final void avD()
  {
    setMMTitle(a.g.card_home_page_title);
    addTextOptionMenu(0, getString(a.g.card_msg_center), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        com.tencent.mm.plugin.card.d.b.a(CardHomePageUI.this, true);
        h.mEJ.h(11582, new Object[] { "CardListMsgMenu", Integer.valueOf(2), Integer.valueOf(0), "", "" });
        return true;
      }
    });
    this.hzM = new com.tencent.mm.plugin.card.sharecard.a.b(this);
    this.hzM.init();
    if (this.hEC == null)
    {
      this.hEC = new i(this, this.mController.contentView);
      i locali = this.hEC;
      locali.hFD = View.inflate(locali.gKS, a.e.card_msg_tip_header, null);
      locali.hFD.setVisibility(8);
      locali.hFE = ((TextView)locali.hFD.findViewById(a.d.card_index_new_msg_tv));
      locali.hFF = ((ImageView)locali.hFD.findViewById(a.d.card_index_new_msg_img));
      locali.hFD.setOnClickListener(new i.1(locali));
      locali.ayP();
      if (locali.hFG == null)
      {
        locali.hFG = ((ViewStub)locali.hyK.findViewById(a.d.card_msg_layout_stub)).inflate();
        locali.hFG.setVisibility(8);
        locali.hFH = ((TextView)locali.hFG.findViewById(a.d.card_index_new_msg_tv));
        locali.hFI = ((ImageView)locali.hFG.findViewById(a.d.card_index_new_msg_img));
        locali.hFG.setOnClickListener(new i.2(locali));
      }
      this.hEC.hAu = true;
    }
    if (this.hED == null) {
      this.hED = new f(this, findViewById(a.d.card_member_card_item), 1, this.hzM);
    }
    if (this.hEE == null) {
      this.hEE = new f(this, findViewById(a.d.card_share_card_item), 2, this.hzM);
    }
    if (this.hEF == null) {
      this.hEF = new f(this, findViewById(a.d.card_ticket_item), 3, this.hzM);
    }
    if (this.hED != null) {
      this.hED.setOnClickListener(new CardHomePageUI.6(this));
    }
    if (this.hEE != null) {
      this.hEE.setOnClickListener(new CardHomePageUI.7(this));
    }
    if (this.hEF != null) {
      this.hEF.setOnClickListener(new CardHomePageUI.8(this));
    }
    setBackBtn(new CardHomePageUI.3(this));
  }
  
  protected final int avE()
  {
    return n.a.hwS;
  }
  
  protected final boolean avG()
  {
    return super.avG();
  }
  
  protected final boolean avH()
  {
    return true;
  }
  
  protected final void avM()
  {
    if (this.hAf)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardHomePageUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
      if (this.hEH) {
        avL();
      }
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CardHomePageUI", "onLocationFinish()");
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
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardHomePageUI", "onLocationFail()");
    axY();
  }
  
  protected final void avO()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardHomePageUI", "onMPermissionGranted locationPermissionGranted " + this.hEH);
    if (!this.hEH)
    {
      this.hEH = true;
      axV();
    }
  }
  
  protected final void avP()
  {
    ayK();
  }
  
  public final void awx()
  {
    this.hzZ = true;
  }
  
  protected final void b(com.tencent.mm.plugin.card.base.b paramb)
  {
    super.b(paramb);
  }
  
  protected final void c(com.tencent.mm.plugin.card.base.b paramb)
  {
    super.c(paramb);
  }
  
  protected final int getLayoutId()
  {
    return a.e.card_home_page_ui;
  }
  
  protected final void initView()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardHomePageUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
    this.hEH = bool;
    if (this.hEH) {
      axV();
    }
    for (;;)
    {
      super.initView();
      return;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardHomePageUI", "location permission is denied, doGetLayout");
      axY();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.fromScene = getIntent().getIntExtra("key_home_page_from_scene", 0);
    long l = System.currentTimeMillis();
    this.mStartTime = l;
    this.hAk = l;
    initView();
    paramBundle = this.hEC;
    am.axm().a(paramBundle);
    g.Eh().dpP.a(1164, this);
    g.Eh().dpP.a(984, this);
    am.axp().axD();
    am.axh();
    com.tencent.mm.plugin.card.b.b.nG(1);
    aya();
    Looper.myQueue().addIdleHandler(new CardHomePageUI.9(this));
    am.axp().a(this);
    am.axi().c(this);
  }
  
  protected void onDestroy()
  {
    if (this.hEH) {
      avL();
    }
    i locali = this.hEC;
    am.axm().b(locali);
    this.hzM.hye = null;
    g.Eh().dpP.b(1164, this);
    g.Eh().dpP.b(984, this);
    am.axp().b(this);
    am.axi().d(this);
    k.awV();
    com.tencent.mm.plugin.card.sharecard.a.b.axJ();
    long l1 = System.currentTimeMillis();
    long l2 = this.hAk;
    h.mEJ.h(13219, new Object[] { "CardHomePageUI", Integer.valueOf(this.fromScene), "", "", Long.valueOf(l1 - l2) });
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if ((this.fromScene != 1) && (this.fromScene != 2)) {
        break label32;
      }
      ayL();
    }
    for (;;)
    {
      return super.onKeyDown(paramInt, paramKeyEvent);
      label32:
      finish();
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    aya();
    this.hzZ = true;
    this.hEG = true;
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardHomePageUI", "onResume locationPermissionGranted %s, hasInitLocation %s, shouldGetLayout %s", new Object[] { Boolean.valueOf(this.hEH), Boolean.valueOf(this.hAl), Boolean.valueOf(this.hzZ) });
    if ((this.hEH) && (this.hAl) && (this.hzZ))
    {
      this.hAe = "";
      this.hAf = false;
      avK();
    }
    for (;;)
    {
      this.hzZ = false;
      aL();
      long l = System.currentTimeMillis();
      if (this.mStartTime != 0L)
      {
        int i = (int)(l - this.mStartTime);
        ArrayList localArrayList = new ArrayList();
        IDKey localIDKey1 = new IDKey();
        localIDKey1.SetID(281);
        localIDKey1.SetKey(0);
        localIDKey1.SetValue(1L);
        IDKey localIDKey2 = new IDKey();
        localIDKey2.SetID(281);
        localIDKey2.SetKey(1);
        localIDKey2.SetValue(i);
        localArrayList.add(localIDKey1);
        localArrayList.add(localIDKey2);
        h.mEJ.b(localArrayList, true);
        this.mStartTime = 0L;
      }
      g.Em().H(new CardHomePageUI.1(this));
      super.onResume();
      return;
      if (this.hzZ)
      {
        this.hAe = "";
        axY();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardHomePageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */