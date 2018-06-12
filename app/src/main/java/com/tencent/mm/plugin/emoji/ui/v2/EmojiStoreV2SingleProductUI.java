package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.e.k;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.protocal.c.acr;
import com.tencent.mm.protocal.c.act;
import com.tencent.mm.protocal.c.bap;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.tb;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.contact.LabelContainerView;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.snackbar.b;
import com.tencent.mm.ui.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmojiStoreV2SingleProductUI
  extends MMActivity
  implements AbsListView.OnScrollListener, e
{
  private View Iq;
  private boolean acT = false;
  private String cYO;
  private ProgressDialog eEX;
  private int fdx;
  private long ihD;
  private String iiF;
  private String iiH;
  private com.tencent.mm.plugin.emoji.f.i ipA;
  private int ipa = 0;
  private MMPullDownView ipy;
  private int iqV;
  private String iqW;
  private int iqX = -1;
  private String iqY;
  private String iqZ;
  private String ira;
  private String irb;
  private String irc;
  private int ird = 0;
  private PreViewListGridView ire;
  private d irf;
  private View irg;
  private TextView irh;
  private View iri;
  private boolean irj = true;
  private acr irk;
  private byte[] irl;
  private int irm = -1;
  private String irn;
  private LabelContainerView iro;
  private TextView irp;
  private MMTagPanel irq;
  private HashMap<String, Integer> irr = new HashMap();
  private ArrayList<String> irs;
  private boolean irt = false;
  private com.tencent.mm.sdk.b.c iru = new EmojiStoreV2SingleProductUI.6(this);
  private MMPullDownView.e irv = new EmojiStoreV2SingleProductUI.7(this);
  private MMPullDownView.c irw = new MMPullDownView.c()
  {
    public final boolean aCi()
    {
      return false;
    }
  };
  private ag mHandler = new ag()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      case 1003: 
      default: 
      case 1001: 
        do
        {
          return;
        } while (EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this) == null);
        EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this).setVisibility(8);
        return;
      case 1002: 
        if (EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this) != null) {
          EmojiStoreV2SingleProductUI.a(EmojiStoreV2SingleProductUI.this).setVisibility(0);
        }
        sendEmptyMessage(1003);
        return;
      }
      EmojiStoreV2SingleProductUI.b(EmojiStoreV2SingleProductUI.this);
    }
  };
  
  private void L(LinkedList<ta> paramLinkedList)
  {
    if ((this.irf != null) && (paramLinkedList != null))
    {
      if (this.irm == -1) {
        this.irf.aQ(paramLinkedList);
      }
    }
    else {
      return;
    }
    d locald = this.irf;
    if (locald.idD == null) {
      locald.idD = new ArrayList();
    }
    locald.idD.addAll(paramLinkedList);
    locald.notifyDataSetChanged();
  }
  
  private void Wj()
  {
    if (this.irt)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "need jeep to update page.");
      return;
    }
    this.irl = null;
    switch (this.ird)
    {
    }
    for (;;)
    {
      an(this.irl);
      return;
      this.irk = com.tencent.mm.plugin.emoji.model.i.aEA().igD.ZD("0");
      if ((this.irk != null) && (this.irk.rHn != null) && (this.irf != null))
      {
        a(this.irk);
        this.irf.aQ(this.irk.rHn);
      }
      for (;;)
      {
        this.irj = true;
        com.tencent.mm.plugin.report.service.h.mEJ.h(12875, new Object[] { Integer.valueOf(0), "" });
        break;
        zM(getString(R.l.app_waiting));
      }
      showOptionMenu(1001, false);
      this.irj = false;
      com.tencent.mm.plugin.report.service.h.mEJ.h(12875, new Object[] { Integer.valueOf(1), this.iiH });
      continue;
      showOptionMenu(1001, false);
      this.irn = this.iqW;
      zN(this.irn);
      this.irj = false;
      com.tencent.mm.plugin.report.service.h.mEJ.h(12875, new Object[] { Integer.valueOf(1), "" });
      continue;
      this.irn = "";
      zN(this.iiF);
      this.irj = false;
      com.tencent.mm.plugin.report.service.h.mEJ.h(12875, new Object[] { Integer.valueOf(2), "" });
      continue;
      this.irn = "";
      showOptionMenu(1001, false);
      showOptionMenu(1002, true);
      com.tencent.mm.plugin.report.service.h.mEJ.h(12875, new Object[] { Integer.valueOf(3), "" });
    }
  }
  
  private void a(acr paramacr)
  {
    boolean bool = false;
    if ((paramacr != null) && (paramacr.rHo != null) && (paramacr.rHo.size() > 0))
    {
      if (this.irj) {
        bool = true;
      }
      showOptionMenu(1001, bool);
      if (this.irq != null)
      {
        if (this.irs == null) {
          this.irs = new ArrayList();
        }
        for (;;)
        {
          if (this.irr == null) {
            this.irr = new HashMap();
          }
          this.irr.clear();
          this.irs.add(getString(R.l.emoji_store_tag_all));
          paramacr = paramacr.rHo.iterator();
          while (paramacr.hasNext())
          {
            tb localtb = (tb)paramacr.next();
            if ((localtb != null) && (!bi.oW(localtb.rws)))
            {
              this.irs.add(localtb.rws);
              this.irr.put(localtb.rws, Integer.valueOf(localtb.rwr));
            }
          }
          this.irs.clear();
        }
        paramacr = new ArrayList();
        paramacr.add(this.irn);
        this.irq.a(paramacr, this.irs);
      }
      return;
    }
    showOptionMenu(1001, false);
  }
  
  private void aFs()
  {
    if ((this.eEX != null) && (this.eEX.isShowing())) {
      this.eEX.dismiss();
    }
  }
  
  private void aGp()
  {
    if (!this.acT)
    {
      an(this.irl);
      this.acT = true;
      this.mHandler.sendEmptyMessageDelayed(1002, 200L);
    }
  }
  
  private void aGq()
  {
    Toast.makeText(this.mController.tml, getString(R.l.emoji_unknow), 0).show();
  }
  
  private void an(byte[] paramArrayOfByte)
  {
    this.irl = null;
    switch (this.ird)
    {
    default: 
      return;
    case 1: 
      paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(1, this.ipa, this.iqV, this.iiF, this.iqX, paramArrayOfByte);
      au.DF().a(paramArrayOfByte, 0);
      return;
    case 2: 
    case 3: 
      paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(2, this.ipa, this.iqV, this.iiF, this.iqX, paramArrayOfByte);
      au.DF().a(paramArrayOfByte, 0);
      return;
    case 4: 
      paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(3, this.ipa, this.iqV, this.iiF, this.iqX, paramArrayOfByte);
      au.DF().a(paramArrayOfByte, 0);
      return;
    case 5: 
      paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(4, this.ipa, this.iqV, this.iiF, this.iqX, paramArrayOfByte);
      au.DF().a(paramArrayOfByte, 0);
      return;
    }
    paramArrayOfByte = new com.tencent.mm.plugin.emoji.f.h(5, this.ipa, this.iqV, this.iiF, this.iqX, paramArrayOfByte);
    au.DF().a(paramArrayOfByte, 0);
  }
  
  private void zM(String paramString)
  {
    if (isFinishing())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "[showLoadingDialog] acitivity is finished.");
      return;
    }
    getString(R.l.app_tip);
    this.eEX = com.tencent.mm.ui.base.h.a(this, paramString, true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        if (EmojiStoreV2SingleProductUI.p(EmojiStoreV2SingleProductUI.this) != null) {
          au.DF().c(EmojiStoreV2SingleProductUI.p(EmojiStoreV2SingleProductUI.this));
        }
      }
    });
  }
  
  private void zN(String paramString)
  {
    if ((this.irg != null) && (this.irh != null)) {
      switch (this.ird)
      {
      }
    }
    for (;;)
    {
      if (bi.oW(paramString))
      {
        this.irh.setText("");
        this.irh.setVisibility(8);
        this.irg.setVisibility(8);
      }
      return;
      if (!bi.oW(paramString))
      {
        this.irh.setText(getString(R.l.emoji_store_tag_tip, new Object[] { paramString }));
        this.irh.setVisibility(0);
        this.irg.setVisibility(0);
        continue;
        if (!bi.oW(paramString))
        {
          this.irh.setText(getString(R.l.emoji_store_search_tip, new Object[] { paramString }));
          this.irh.setVisibility(0);
          this.irg.setVisibility(0);
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    int i = paraml.getType();
    if (i == 821)
    {
      aFs();
      paramString = (com.tencent.mm.plugin.emoji.f.h)paraml;
      paraml = paramString.aEL();
      this.acT = false;
      if (this.iri != null)
      {
        this.iri.setVisibility(8);
        this.mHandler.removeMessages(1002);
        this.mHandler.sendEmptyMessageDelayed(1001, 200L);
      }
      i = paramString.eKI;
      if (((paramInt1 == 0) && (paramInt2 == 0)) || ((paramInt1 == 4) && ((paramInt2 == 2) || (paramInt2 == 3)) && ((this.irl == null) || (this.irl.length <= 0)) && (i != 3))) {
        a(paraml);
      }
      if ((paramInt1 == 0) || (paramInt1 == 4))
      {
        this.irl = paramString.iiD;
        if (paramInt2 == 0)
        {
          L(paraml.rHn);
          this.irm = 0;
        }
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          if (paramInt2 == 2)
          {
            L(paraml.rHn);
            this.irm = 2;
            return;
          }
          if (paramInt2 == 3)
          {
            this.irm = -1;
            L(paraml.rHn);
            return;
          }
          aGq();
          return;
          aGq();
          return;
        } while (i != 239);
        aFs();
        if ((paramInt2 != 0) || (paramInt1 != 0)) {
          break;
        }
        paramString = ((com.tencent.mm.plugin.emoji.f.i)paraml).aEM();
      } while ((paramString == null) || (paramString.rHp == null));
      this.ipa = paramString.rHp.rHi;
    } while (this.mHandler == null);
    this.mHandler.sendEmptyMessage(1004);
    return;
    showOptionMenu(1001, false);
    com.tencent.mm.ui.base.h.b(this.mController.tml, getString(R.l.emoji_designer_load_failed), null, true);
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "open single product ui failed.");
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.emoji_store_v2_single_product_ui;
  }
  
  protected final void initView()
  {
    if ((this.ird == 6) && (!bi.oW(this.iqY))) {
      setMMTitle(this.iqY);
    }
    for (;;)
    {
      setBackBtn(new EmojiStoreV2SingleProductUI.9(this));
      this.irf = new d(this.mController.tml);
      this.irf.isg = new EmojiStoreV2SingleProductUI.10(this);
      this.ire = ((PreViewListGridView)findViewById(R.h.list));
      this.Iq = y.gq(this.mController.tml).inflate(R.i.emoji_store_v2_mgr_header, null);
      this.irg = this.Iq.findViewById(R.h.emoji_mgr);
      this.irh = ((TextView)this.Iq.findViewById(R.h.emoji_tag));
      this.ire.addHeaderView(this.Iq);
      this.iri = y.gq(this.mController.tml).inflate(R.i.emoji_store_load_more, null);
      this.ire.addFooterView(this.iri);
      this.iri.setVisibility(8);
      this.ire.setAdapter(this.irf);
      this.ire.setOnScrollListener(this);
      this.ipy = ((MMPullDownView)findViewById(R.h.load_more_view));
      this.ipy.setTopViewVisible(false);
      this.ipy.setOnBottomLoadDataListener(this.irv);
      this.ipy.setAtBottomCallBack(this.irw);
      this.ipy.setBottomViewVisible(false);
      this.ipy.setIsBottomShowAll(false);
      this.ipy.setIsReturnSuperDispatchWhenCancel(true);
      this.iro = ((LabelContainerView)findViewById(R.h.select_contact_label_container));
      this.irp = ((TextView)this.iro.findViewById(16908310));
      this.irp.setText(R.l.label_panel_search_by);
      this.irq = ((MMTagPanel)this.iro.findViewById(R.h.contact_label_panel));
      this.irq.setTagSelectedBG(R.g.tag_green_tab_selector);
      this.irq.setTagSelectedTextColorRes(R.e.wechat_green);
      this.irn = getString(R.l.emoji_store_tag_all);
      this.iro.setOnLabelContainerListener(new EmojiStoreV2SingleProductUI.11(this));
      this.irq.setCallBack(new EmojiStoreV2SingleProductUI.12(this));
      addIconOptionMenu(1001, R.g.actionbar_emotag_icon, new EmojiStoreV2SingleProductUI.13(this));
      addIconOptionMenu(1002, R.k.ofm_send_icon, new EmojiStoreV2SingleProductUI.2(this));
      showOptionMenu(1001, false);
      showOptionMenu(1002, false);
      return;
      setMMTitle(R.l.emoji_store_product_title);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      if (paramInt2 == -1)
      {
        b.h(this, this.mController.tml.getString(R.l.finish_sent));
        continue;
        if (paramInt2 == -1)
        {
          String str1 = paramIntent.getStringExtra("Select_Conv_User");
          if (!bi.oW(str1))
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2SingleProductUI", ".." + str1);
            int i = this.iqX;
            String str2 = this.iqY;
            String str3 = this.ira;
            String str4 = this.iqZ;
            String str5 = this.irb;
            int j = this.ird;
            com.tencent.mm.plugin.emoji.model.i.aEw();
            k.a(this, str1, 27, i, str2, str3, str4, str5, j, "https://support.weixin.qq.com/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0");
          }
        }
      }
    }
  }
  
  public void onBackPressed()
  {
    if ((this.iro != null) && (this.iro.getVisibility() == 0))
    {
      this.iro.setVisibility(8);
      if (this.irj) {}
      for (boolean bool = true;; bool = false)
      {
        showOptionMenu(1001, bool);
        setMMTitle(R.l.emoji_store_product_title);
        return;
      }
    }
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.ipa = getIntent().getIntExtra("uin", 0);
    this.cYO = getIntent().getStringExtra("Select_Conv_User");
    this.ihD = getIntent().getLongExtra("searchID", 0L);
    this.iiH = getIntent().getStringExtra("id");
    paramBundle = getIntent().getStringExtra("tag_id");
    if (!bi.oW(paramBundle)) {}
    try
    {
      this.iqV = Integer.valueOf(paramBundle).intValue();
      this.iqW = getIntent().getStringExtra("tag_desc");
      this.iiF = getIntent().getStringExtra("keyword");
      this.iqX = getIntent().getIntExtra("set_id", 0);
      this.iqY = getIntent().getStringExtra("set_title");
      this.iqZ = getIntent().getStringExtra("set_iconURL");
      this.ira = getIntent().getStringExtra("set_desc");
      this.irb = getIntent().getStringExtra("headurl");
      this.irc = getIntent().getStringExtra("sns_object_data");
      this.ird = getIntent().getIntExtra("pageType", 0);
      if (!bi.oW(this.irc))
      {
        this.iqX = EmojiLogic.zw(this.irc);
        this.iqY = EmojiLogic.zx(this.irc);
        this.iqZ = EmojiLogic.zz(this.irc);
        this.ira = EmojiLogic.zy(this.irc);
        this.irb = EmojiLogic.zA(this.irc);
        this.ird = EmojiLogic.zB(this.irc);
      }
      switch (this.ird)
      {
      default: 
        this.irt = true;
        if (this.irt)
        {
          paramBundle = new Intent();
          com.tencent.mm.plugin.emoji.model.i.aEw();
          paramBundle.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0");
          paramBundle.putExtra("showShare", false);
          com.tencent.mm.bg.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramBundle);
          finish();
        }
        initView();
        if ((this.ipa == 0) && (this.ird == 2))
        {
          paramBundle = com.tencent.mm.plugin.emoji.model.i.aEA().igD.ZC(this.iiH);
          if ((paramBundle != null) && (paramBundle.rHp != null) && (paramBundle.rHp.rHi != 0) && (!bi.oW(paramBundle.rHp.jPe)))
          {
            this.ipa = paramBundle.rHp.rHi;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "uin:%s ", new Object[] { Integer.valueOf(this.ipa) });
          }
        }
        else
        {
          i = 0;
          if (i != 0) {
            break label758;
          }
          Wj();
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sPa, Boolean.valueOf(false));
          au.DF().a(821, this);
          au.DF().a(239, this);
          return;
        }
        break;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        int i;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiStoreV2SingleProductUI", bi.i(paramBundle));
        continue;
        if (!bi.oW(this.iiF))
        {
          this.ird = 5;
          this.irj = false;
          this.fdx = 2;
        }
        else if (!bi.oW(this.iiH))
        {
          this.ird = 2;
          this.fdx = 1;
        }
        else if (this.ipa != 0)
        {
          this.ird = 3;
          this.fdx = 1;
        }
        else if (this.iqV != 0)
        {
          this.fdx = 3;
          this.ird = 4;
        }
        else if (this.iqX > 0)
        {
          this.ird = 6;
          this.fdx = 4;
        }
        else
        {
          this.ird = 1;
          this.fdx = 0;
          continue;
          this.fdx = 0;
          continue;
          if (bi.oW(this.iiH))
          {
            continue;
            if (this.ipa == 0)
            {
              continue;
              if (this.iqV == 0)
              {
                continue;
                if (bi.oW(this.iiF))
                {
                  continue;
                  if (this.iqX == 0)
                  {
                    continue;
                    i = 1;
                    continue;
                    label758:
                    this.ipA = new com.tencent.mm.plugin.emoji.f.i(this.iiH);
                    au.DF().a(this.ipA, 0);
                    zM(getString(R.l.app_waiting));
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    au.DF().b(239, this);
    au.DF().b(821, this);
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    a.sFg.c(this.iru);
  }
  
  protected void onResume()
  {
    super.onResume();
    a.sFg.b(this.iru);
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1) && (this.irm == 2) && (!this.acT))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "No More List.");
      aGp();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
    }
    if ((paramInt != 0) && (this.ire != null)) {
      this.ire.aGu();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */