package com.tencent.mm.plugin.card.base;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.ad;
import com.tencent.mm.plugin.card.model.af;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.r;
import com.tencent.mm.plugin.card.ui.CardDetailUI;
import com.tencent.mm.pluginsdk.ui.applet.t;
import com.tencent.mm.pluginsdk.ui.applet.t.a;
import com.tencent.mm.protocal.c.bng;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.statusbar.DrawStatusBarActivity;
import java.util.ArrayList;
import java.util.LinkedList;

public abstract class CardBaseUI
  extends DrawStatusBarActivity
  implements e, MMActivity.a
{
  private float cXm = -85.0F;
  private float cXn = -1000.0F;
  private a.a cXs = new CardBaseUI.7(this);
  public com.tencent.mm.modelgeo.c dMm;
  private boolean dMp = false;
  private p fUo = null;
  public ListView htk = null;
  public BaseAdapter htl = null;
  public RelativeLayout htm = null;
  public LinearLayout htn;
  public LinearLayout hto;
  public boolean htp = false;
  public boolean htq = true;
  public a htr = null;
  public CardInfo hts;
  
  public final void E(LinkedList<String> paramLinkedList)
  {
    dO(true);
    paramLinkedList = new r(paramLinkedList);
    com.tencent.mm.kernel.g.Eh().dpP.a(paramLinkedList, 0);
  }
  
  public void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paraml instanceof r))
      {
        dO(false);
        com.tencent.mm.ui.base.h.bA(this, getResources().getString(a.g.card_delete_success_tips));
        am.axh();
        com.tencent.mm.plugin.card.b.b.nG(4);
        this.htr.Ij();
        avP();
      }
    }
    String str1;
    do
    {
      do
      {
        return;
      } while (!(paraml instanceof af));
      dO(false);
      paramInt1 = ((af)paraml).hwV;
      paraml = ((af)paraml).hwW;
      if (paramInt1 == 10000)
      {
        paramString = paraml;
        if (TextUtils.isEmpty(paraml)) {
          paramString = getString(a.g.card_gift_failed_tips);
        }
        com.tencent.mm.plugin.card.d.d.b(this, paramString, paramInt1);
        return;
      }
      if (this.hts != null)
      {
        paramString = this.hts.awn();
        paramString.status = 3;
        this.hts.a(paramString);
        if (!am.axi().c(this.hts, new String[0])) {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardBaseUI", "update newSerial fail, cardId = %s", new Object[] { this.hts.field_card_id });
        }
      }
      this.htr.Ij();
      avP();
      return;
      dO(false);
      str1 = paramString;
      if ((paraml instanceof af))
      {
        paramInt1 = ((af)paraml).hwV;
        String str2 = ((af)paraml).hwW;
        str1 = paramString;
        if (paramInt1 == 10000)
        {
          paramString = str2;
          if (TextUtils.isEmpty(str2)) {
            paramString = getString(a.g.card_gift_failed_tips);
          }
          str1 = paramString;
        }
      }
    } while (((paraml instanceof com.tencent.mm.plugin.card.model.x)) || ((paraml instanceof ad)) || ((paraml instanceof com.tencent.mm.plugin.card.sharecard.model.b)) || (!this.htq));
    com.tencent.mm.plugin.card.d.d.b(this, str1, paramInt2);
  }
  
  public void a(b paramb)
  {
    Intent localIntent = new Intent(this, CardDetailUI.class);
    localIntent.putExtra("key_card_id", paramb.awq());
    localIntent.addFlags(131072);
    localIntent.putExtra("key_from_scene", 3);
    startActivity(localIntent);
    if (avE() == n.a.hwS) {
      com.tencent.mm.plugin.report.service.h.mEJ.h(11324, new Object[] { "ClickMemberCard", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
    }
    while (avE() != n.a.hwR) {
      return;
    }
    com.tencent.mm.plugin.report.service.h.mEJ.h(11324, new Object[] { "ClickMemberCard", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(1), "", Integer.valueOf(0), Integer.valueOf(0) });
  }
  
  public void a(CardInfo paramCardInfo)
  {
    this.hts = paramCardInfo;
    com.tencent.mm.plugin.card.d.b.a(this, 0, this);
  }
  
  public abstract void avD();
  
  public int avE()
  {
    return n.a.hwN;
  }
  
  public BaseAdapter avF()
  {
    return new com.tencent.mm.plugin.card.ui.c(this, avE());
  }
  
  public boolean avG()
  {
    return true;
  }
  
  public boolean avH()
  {
    return true;
  }
  
  public void avI() {}
  
  public final void avJ()
  {
    if (this.dMm == null) {
      this.dMm = com.tencent.mm.modelgeo.c.OB();
    }
    if (this.dMm != null) {
      this.dMm.a(this.cXs, true);
    }
  }
  
  public final void avK()
  {
    if (this.dMm != null) {
      this.dMm.a(this.cXs, true);
    }
  }
  
  public final void avL()
  {
    if (this.dMm != null) {
      this.dMm.c(this.cXs);
    }
  }
  
  public void avM() {}
  
  public void avN() {}
  
  public void avO() {}
  
  public void avP() {}
  
  public final void b(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 0) && (paramInt2 == -1)) {
      i(paramIntent.getStringExtra("Select_Conv_User"), 0, false);
    }
  }
  
  public void b(b paramb)
  {
    if (!avG()) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardBaseUI", "isItemClickable return false");
    }
    do
    {
      do
      {
        return;
        if (paramb == null)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardBaseUI", "onListItemClick  item == null");
          return;
        }
      } while ((paramb.awq().equals("PRIVATE_TICKET_TITLE")) || (paramb.awq().equals("PRIVATE_INVOICE_TITLE")));
      if (paramb.avY())
      {
        a(paramb);
        return;
      }
    } while (TextUtils.isEmpty(paramb.awm().rnM));
    com.tencent.mm.plugin.card.d.b.a(this, paramb.awm().rnM, 0);
  }
  
  public void c(b paramb)
  {
    if (!avH())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardBaseUI", "isItemClickable return false");
      return;
    }
    if (paramb == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardBaseUI", "onListItemLongClick  item == null");
      return;
    }
    ArrayList localArrayList = new ArrayList();
    if (paramb.avZ()) {
      localArrayList.add(getResources().getString(a.g.card_menu_gift_card));
    }
    localArrayList.add(getResources().getString(a.g.app_delete));
    String str = paramb.awq();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramb.awm().hwg);
    com.tencent.mm.ui.base.h.a(this, localStringBuilder.toString(), (String[])localArrayList.toArray(new String[localArrayList.size()]), null, new CardBaseUI.5(this, paramb, str));
  }
  
  public final void dO(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.fUo = p.b(this, getString(a.g.app_waiting), true, 0, null);
    }
    while ((this.fUo == null) || (!this.fUo.isShowing())) {
      return;
    }
    this.fUo.dismiss();
    this.fUo = null;
  }
  
  public int getLayoutId()
  {
    return a.e.card_index_ui;
  }
  
  public final void i(String paramString, int paramInt, boolean paramBoolean)
  {
    if (this.hts == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardBaseUI", "showGiftConfirmDialog mCardInfo == null");
      return;
    }
    if (this.hts.awm() == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardBaseUI", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramInt == 0) {
      if (!TextUtils.isEmpty(this.hts.awo().sli))
      {
        localStringBuilder.append(this.hts.awo().sli);
        com.tencent.mm.plugin.report.service.h.mEJ.h(11582, new Object[] { "OperGift", Integer.valueOf(2), Integer.valueOf(this.hts.awm().huV), this.hts.field_card_tp_id, this.hts.field_card_id, paramString });
      }
    }
    for (;;)
    {
      String str = this.hts.awm().title + "\n" + this.hts.awm().hwh;
      t.a.qJO.a(this.mController, localStringBuilder.toString(), this.hts.awm().huW, str, false, getResources().getString(a.g.app_send), new CardBaseUI.6(this, paramString, paramBoolean));
      return;
      localStringBuilder.append(getString(a.g.sns_post_to));
      break;
      if (paramInt == 1)
      {
        localStringBuilder.append(getString(a.g.card_gift_card_dialog_title, new Object[] { this.hts.awm().hwg }));
        com.tencent.mm.plugin.report.service.h.mEJ.h(11582, new Object[] { "OperGift", Integer.valueOf(3), Integer.valueOf(this.hts.awm().huV), this.hts.field_card_tp_id, this.hts.field_card_id, paramString });
      }
    }
  }
  
  public void initView()
  {
    setBackBtn(new CardBaseUI.1(this));
    this.htk = ((ListView)findViewById(16908298));
    this.htm = ((RelativeLayout)findViewById(a.d.content_no_data));
    if (this.htm != null) {
      this.htk.setEmptyView(this.htm);
    }
    this.htn = ((LinearLayout)View.inflate(getBaseContext(), a.e.card_list_header_view, null));
    this.hto = ((LinearLayout)View.inflate(getBaseContext(), a.e.card_list_footer_view, null));
    this.htk.addHeaderView(this.htn);
    this.htk.addFooterView(this.hto);
    this.htl = avF();
    this.htk.setAdapter(this.htl);
    this.htk.setOnItemClickListener(new CardBaseUI.2(this));
    this.htk.setOnItemLongClickListener(new CardBaseUI.3(this));
    com.tencent.mm.kernel.g.Eh().dpP.a(560, this);
    com.tencent.mm.kernel.g.Eh().dpP.a(692, this);
    Object localObject = this.htl;
    if ((localObject instanceof com.tencent.mm.plugin.card.ui.c)) {
      localObject = new com.tencent.mm.plugin.card.ui.d((com.tencent.mm.plugin.card.ui.c)localObject);
    }
    for (;;)
    {
      this.htr = ((a)localObject);
      this.htr.onCreate();
      avD();
      return;
      if ((localObject instanceof com.tencent.mm.plugin.card.sharecard.ui.c)) {
        localObject = new com.tencent.mm.plugin.card.sharecard.ui.d((com.tencent.mm.plugin.card.sharecard.ui.c)localObject);
      } else if ((localObject instanceof com.tencent.mm.plugin.card.sharecard.ui.g)) {
        localObject = new com.tencent.mm.plugin.card.sharecard.ui.h((com.tencent.mm.plugin.card.sharecard.ui.g)localObject);
      } else {
        localObject = new com.tencent.mm.plugin.card.ui.h((com.tencent.mm.plugin.card.ui.g)localObject);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public void onDestroy()
  {
    com.tencent.mm.kernel.g.Eh().dpP.b(560, this);
    com.tencent.mm.kernel.g.Eh().dpP.b(692, this);
    if (this.htr != null) {
      this.htr.onDestroy();
    }
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    this.htq = false;
    com.tencent.mm.kernel.g.Eh().dpP.b(652, this);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardBaseUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
    {
      avO();
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(a.g.permission_location_request_again_msg), getString(a.g.permission_tips_title), getString(a.g.jump_to_settings), getString(a.g.confirm_dialog_cancel), false, new CardBaseUI.8(this), null);
  }
  
  public void onResume()
  {
    super.onResume();
    this.htq = true;
    com.tencent.mm.kernel.g.Eh().dpP.a(652, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/base/CardBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */