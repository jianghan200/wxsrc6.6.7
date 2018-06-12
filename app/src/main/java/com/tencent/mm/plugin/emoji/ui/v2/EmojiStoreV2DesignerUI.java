package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.am.b.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.e.k.2;
import com.tencent.mm.plugin.emoji.e.n;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.h.a;
import com.tencent.mm.plugin.emoji.model.h.b;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.g.a;
import com.tencent.mm.pluginsdk.ui.emoji.BannerEmojiView;
import com.tencent.mm.protocal.c.act;
import com.tencent.mm.protocal.c.agl;
import com.tencent.mm.protocal.c.bap;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.y;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmojiStoreV2DesignerUI
  extends MMActivity
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, com.tencent.mm.ab.e, h.a, h.b, MMPullDownView.c, MMPullDownView.e
{
  private ListView CU;
  private View Iq;
  private int fdx;
  private long ihD;
  private String ihE;
  private String ihI;
  private String iiH;
  private com.tencent.mm.sdk.b.c ikA = new EmojiStoreV2DesignerUI.1(this);
  private com.tencent.mm.plugin.emoji.f.g ikB;
  com.tencent.mm.plugin.emoji.a.f ikI;
  private int iki = -1;
  private boolean ikj;
  private byte[] ikl;
  protected final int ikp = 131074;
  private final int ikq = 131075;
  private final int ikr = 131076;
  private final String iks = "product_id";
  private final String ikt = "progress";
  private final String iku = "status";
  private com.tencent.mm.plugin.emoji.model.f ikx;
  private com.tencent.mm.plugin.emoji.model.h iky;
  private com.tencent.mm.plugin.emoji.f.i ipA;
  private com.tencent.mm.ui.base.p ipB;
  private am.b.a ipC = new EmojiStoreV2DesignerUI.8(this);
  private final int ipD = 10001;
  private final int ipE = 10002;
  private final int ipF = 10003;
  private com.tencent.mm.plugin.emoji.f.p ipG;
  private int ipa;
  private String ipb;
  private String ipc;
  private ab ipd;
  private View ipe;
  private BannerEmojiView ipf;
  private TextView ipg;
  private TextView iph;
  private View ipi;
  private View ipj;
  private TextView ipk;
  private ImageView ipl;
  private TextView ipm;
  private TextView ipn;
  View ipo;
  private List<ta> ipp = new ArrayList();
  private View ipq;
  PreViewListGridView ipr;
  private d ips;
  View ipt;
  View ipu;
  View ipv;
  TextView ipw;
  View ipx;
  private MMPullDownView ipy;
  private agl ipz;
  private ag mHandler = new ag()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      }
      String str;
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              EmojiStoreV2DesignerUI.b(EmojiStoreV2DesignerUI.this);
              return;
              EmojiStoreV2DesignerUI.this.er(false);
              return;
              EmojiStoreV2DesignerUI.c(EmojiStoreV2DesignerUI.this);
              return;
            } while ((EmojiStoreV2DesignerUI.d(EmojiStoreV2DesignerUI.this) == null) || (paramAnonymousMessage.getData() == null));
            str = paramAnonymousMessage.getData().getString("product_id");
          } while (str == null);
          i = paramAnonymousMessage.getData().getInt("progress");
          EmojiStoreV2DesignerUI.d(EmojiStoreV2DesignerUI.this).bf(str, i);
          return;
        } while ((EmojiStoreV2DesignerUI.d(EmojiStoreV2DesignerUI.this) == null) || (paramAnonymousMessage.getData() == null));
        str = paramAnonymousMessage.getData().getString("product_id");
      } while (str == null);
      int i = paramAnonymousMessage.getData().getInt("status");
      EmojiStoreV2DesignerUI.d(EmojiStoreV2DesignerUI.this).be(str, i);
    }
  };
  
  private void Wj()
  {
    setMMTitle(this.ihI);
    this.ikI = new com.tencent.mm.plugin.emoji.a.f(this.mController.tml);
    this.CU.addHeaderView(this.Iq);
    this.CU.setAdapter(this.ikI);
    this.ikI.ieo = this;
    this.ikI.idJ = n.aEg();
    this.ikI.idK = false;
    this.ipg.setText(this.ihI);
    this.ipz = com.tencent.mm.plugin.emoji.model.i.aEA().igA.ZH(String.valueOf(this.ipa));
    this.iky = new com.tencent.mm.plugin.emoji.model.h();
    this.iky.gKE = this;
    this.iky.ihz = this.ikI;
    this.iky.ihC = 6;
    this.iky.ihF = this;
    this.iky.ihI = this.ihI;
    this.iky.ihD = this.ihD;
    this.iky.ihE = this.ihE;
    if (this.ipz != null)
    {
      c(com.tencent.mm.plugin.emoji.f.p.a(this.ipz));
      LinkedList localLinkedList1 = this.ipz.rgD;
      LinkedList localLinkedList2 = this.ipz.rHC;
      aP(localLinkedList1);
    }
    updateData();
    am(this.ikl);
  }
  
  private void aGl()
  {
    if ((this.ipd != null) && ((int)this.ipd.dhP != 0))
    {
      this.ipj.setVisibility(0);
      this.ipi.setVisibility(0);
      if (!bi.oW(this.ipd.BK())) {
        this.ipk.setText(this.ipd.BK());
      }
      for (;;)
      {
        a.b.n(this.ipl, this.ipd.field_username);
        this.ipm.setEnabled(true);
        return;
        this.ipk.setText(this.ipd.field_username);
      }
    }
    this.ipj.setVisibility(8);
    this.ipi.setVisibility(8);
  }
  
  private void aP(List<ta> paramList)
  {
    int i = 1;
    String str = com.tencent.mm.k.g.AT().getValue("ShowDesignerEmoji");
    x.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "get dynamic Disgner_Emoji_Store_Show config value:%s", new Object[] { str });
    if ((!bi.oW(str)) && (bi.WU(str) == 1)) {}
    while ((paramList != null) && (paramList.size() > 0) && (i != 0))
    {
      this.ipo.setVisibility(0);
      if (this.mHandler != null) {
        this.mHandler.post(new EmojiStoreV2DesignerUI.2(this, paramList));
      }
      this.ips.aQ(paramList);
      return;
      i = 0;
    }
    this.ipo.setVisibility(8);
  }
  
  private void am(byte[] paramArrayOfByte)
  {
    this.ikj = true;
    this.ipG = new com.tencent.mm.plugin.emoji.f.p(this.ipa, paramArrayOfByte);
    au.DF().a(this.ipG, 0);
  }
  
  private void b(int paramInt, com.tencent.mm.plugin.emoji.model.f paramf)
  {
    int i = 1;
    switch (paramInt)
    {
    default: 
      paramInt = 0;
    }
    for (;;)
    {
      if ((this.ikx != null) && (paramInt != 0))
      {
        if (this.ikI != null) {
          this.ikI.b(this.ikx);
        }
        if (this.mHandler != null) {
          this.mHandler.sendEmptyMessage(10002);
        }
      }
      return;
      this.ikx = paramf;
      paramInt = i;
      continue;
      this.ikx = paramf;
      paramInt = i;
      continue;
      this.ikx = paramf;
      paramInt = i;
      continue;
      if (this.ikx == null) {
        this.ikx = new com.tencent.mm.plugin.emoji.model.f();
      }
      this.ikx.oL(paramf.ihp);
      this.ikx.aN(paramf.ihq);
      paramInt = i;
    }
  }
  
  private void c(com.tencent.mm.plugin.emoji.model.f paramf)
  {
    b(this.iki, paramf);
    this.iki = 0;
  }
  
  private void updateData()
  {
    if (this.ipz == null)
    {
      x.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "update data failed. data is null.");
      return;
    }
    er(true);
    if (!bi.oW(this.ipz.rgK))
    {
      x.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "biz name is :%s", new Object[] { this.ipz.rgK });
      au.HU();
      this.ipd = com.tencent.mm.model.c.FR().Yg(this.ipz.rgK);
      if (((this.ipd == null) || ((int)this.ipd.dhP == 0)) && (am.a.dBr != null))
      {
        x.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "getContact %s", new Object[] { this.ipz.rgK });
        am.a.dBr.a(this.ipz.rgK, "", this.ipC);
      }
      this.ipm.setText(R.l.emoji_store_weixin);
      if (bi.oW(this.ipz.jOS)) {
        break label271;
      }
      this.iph.setText(this.ipz.jOS);
      this.iph.setVisibility(0);
    }
    for (;;)
    {
      aGl();
      if ((this.ikx != null) && (this.ikx.ihq != null) && (!this.ikx.ihq.isEmpty())) {
        break label283;
      }
      this.ipn.setVisibility(8);
      return;
      x.w("MicroMsg.emoji.EmojiStoreV2DesignerUI", "mData.BizName is null");
      this.ipi.setVisibility(8);
      this.ipj.setVisibility(8);
      break;
      label271:
      this.iph.setVisibility(8);
    }
    label283:
    this.ipn.setVisibility(0);
  }
  
  public final void M(String paramString1, String paramString2, String paramString3)
  {
    N(paramString1, paramString2, paramString3);
    aFq();
  }
  
  protected final com.tencent.mm.plugin.emoji.f.g N(String paramString1, String paramString2, String paramString3)
  {
    this.ikB = new com.tencent.mm.plugin.emoji.f.g(paramString1, paramString2, paramString3);
    return this.ikB;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    switch (paraml.getType())
    {
    default: 
      x.e("MicroMsg.emoji.EmojiStoreV2DesignerUI", "unknow scene type");
    }
    do
    {
      do
      {
        return;
        paramString = (com.tencent.mm.plugin.emoji.f.g)paraml;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          bf(paramString.iiv, 0);
          return;
        }
        paraml = paramString.iiv;
        Object localObject = paramString.iix;
        String str = paramString.iiw;
        com.tencent.mm.ui.base.h.a(this, getString(R.l.emoji_store_download_failed_msg, new Object[] { str }), "", new EmojiStoreV2DesignerUI.3(this, paraml, (String)localObject, str), new EmojiStoreV2DesignerUI.4(this));
        be(paramString.iiv, -1);
        return;
        this.ikj = false;
        if ((paramInt1 == 0) || (paramInt1 == 4))
        {
          paramString = (com.tencent.mm.plugin.emoji.f.p)paraml;
          paraml = com.tencent.mm.plugin.emoji.f.p.a(paramString.aET());
          if (paramInt2 == 0)
          {
            this.ipz = paramString.aET();
            c(paraml);
          }
          for (;;)
          {
            if ((this.ikl == null) && (this.ipz != null))
            {
              com.tencent.mm.plugin.emoji.model.i.aEA().igA.a(String.valueOf(this.ipa), paramString.aET());
              this.ipp = this.ipz.rgD;
              paraml = this.ipp;
              localObject = this.ipz.rHC;
              aP(paraml);
            }
            this.ikl = paramString.iiN;
            return;
            if (paramInt2 == 2)
            {
              this.ipz = paramString.aET();
              b(this.iki, paraml);
              this.iki = 2;
            }
            else if (paramInt2 == 3)
            {
              this.ipz = paramString.aET();
              b(this.iki, paraml);
              this.iki = 1;
              x.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "get person designer failed errCode:%d", new Object[] { Integer.valueOf(paramInt2) });
            }
          }
        }
        x.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "get person designer failed");
        return;
        if ((this.ipB != null) && (this.ipB.isShowing())) {
          this.ipB.dismiss();
        }
        if ((paramInt2 != 0) || (paramInt1 != 0)) {
          break;
        }
        paramString = ((com.tencent.mm.plugin.emoji.f.i)paraml).aEM();
      } while ((paramString == null) || (paramString.rHp == null));
      this.ipa = paramString.rHp.rHi;
      this.ihI = paramString.rHp.jPe;
      this.ipb = paramString.rHp.rxm;
    } while (this.mHandler == null);
    this.mHandler.sendEmptyMessage(10003);
    return;
    showOptionMenu(0, false);
    com.tencent.mm.ui.base.h.b(this.mController.tml, getString(R.l.emoji_designer_load_failed), null, true);
    x.e("MicroMsg.emoji.EmojiStoreV2DesignerUI", "open designer failed .");
  }
  
  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    String str2 = parama.getProductId();
    if (TextUtils.isEmpty(parama.aDq())) {}
    for (String str1 = "";; str1 = parama.aDq())
    {
      x.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", new Object[] { str2, str1, Integer.valueOf(parama.aDp()) });
      parama.aDp();
      this.iky.a(parama);
      return;
    }
  }
  
  public final boolean aCg()
  {
    return true;
  }
  
  public final boolean aCi()
  {
    return false;
  }
  
  public final void aEs() {}
  
  protected final void aFq()
  {
    au.DF().a(this.ikB, 0);
  }
  
  final void be(String paramString, int paramInt)
  {
    Message localMessage = Message.obtain();
    localMessage.getData().putString("product_id", paramString);
    localMessage.getData().putInt("status", paramInt);
    localMessage.what = 131076;
    if (this.mHandler != null) {
      this.mHandler.sendMessage(localMessage);
    }
  }
  
  final void bf(String paramString, int paramInt)
  {
    Message localMessage = Message.obtain();
    localMessage.getData().putString("product_id", paramString);
    localMessage.getData().putInt("progress", paramInt);
    localMessage.what = 131075;
    if (this.mHandler != null) {
      this.mHandler.sendMessage(localMessage);
    }
  }
  
  protected final void er(boolean paramBoolean)
  {
    if (this.ipz == null) {
      x.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "update header failed. data is null.");
    }
    while ((this.ipf == null) || (bi.oW(this.ipz.rJT))) {
      return;
    }
    Object localObject = this.ipz.rJT;
    com.tencent.mm.bp.a.getDensity(this);
    localObject = EmojiLogic.a("Designer", 8, (String)localObject, true);
    if (localObject == null)
    {
      if (paramBoolean)
      {
        com.tencent.mm.ak.o.Pj().a(this.ipz.rJT, null, com.tencent.mm.plugin.emoji.e.f.g("Designer", this.ipz.rJT, new Object[] { "Designer", "BANNER" }), new EmojiStoreV2DesignerUI.15(this));
        return;
      }
      x.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "updateDesignerHeader failed");
      return;
    }
    this.ipf.setImageFilePath(((EmojiInfo)localObject).cnF());
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.emoji_store_v2_designer_ui;
  }
  
  protected final void initView()
  {
    if (!bi.oW(this.ihI)) {
      setMMTitle(this.ihI);
    }
    this.Iq = y.gq(this.mController.tml).inflate(R.i.emoji_store_v2_designer_header, null);
    this.ipe = this.Iq.findViewById(R.h.designer_header);
    this.ipf = ((BannerEmojiView)this.ipe.findViewById(R.h.emoji_bar_view));
    this.ipg = ((TextView)this.Iq.findViewById(R.h.designer_name));
    this.iph = ((TextView)this.Iq.findViewById(R.h.designer_desc));
    this.ipi = this.Iq.findViewById(R.h.designer_bar_line);
    this.ipj = this.Iq.findViewById(R.h.designer_bar_container);
    this.ipk = ((TextView)this.Iq.findViewById(R.h.designer_title));
    this.ipl = ((ImageView)this.Iq.findViewById(R.h.designer_icon));
    this.ipm = ((TextView)this.Iq.findViewById(R.h.designer_detail));
    this.ipn = ((TextView)this.Iq.findViewById(R.h.designer_works));
    this.ipo = this.Iq.findViewById(R.h.designer_product);
    this.ipq = this.Iq.findViewById(R.h.designer_product_more);
    this.ipq.setOnClickListener(new EmojiStoreV2DesignerUI.10(this));
    this.ipr = ((PreViewListGridView)this.Iq.findViewById(R.h.designer_product_list));
    this.ips = new d(this.mController.tml);
    this.ips.isg = new d.a()
    {
      public final void ms(int paramAnonymousInt)
      {
        ta localta;
        if ((EmojiStoreV2DesignerUI.f(EmojiStoreV2DesignerUI.this) != null) && (EmojiStoreV2DesignerUI.g(EmojiStoreV2DesignerUI.this) != null))
        {
          localta = EmojiStoreV2DesignerUI.g(EmojiStoreV2DesignerUI.this).oY(paramAnonymousInt);
          if (localta == null) {}
        }
        try
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("extra_object", localta.toByteArray());
          localIntent.setClass(EmojiStoreV2DesignerUI.this.mController.tml, EmojiStoreV2SingleProductDialogUI.class);
          EmojiStoreV2DesignerUI.this.startActivity(localIntent);
          EmojiStoreV2DesignerUI.this.overridePendingTransition(R.a.pop_in, R.a.pop_out);
          return;
        }
        catch (Exception localException) {}
      }
    };
    this.ipr.setAdapter(this.ips);
    this.ipt = this.Iq.findViewById(R.h.designer_product_title);
    this.ipu = this.Iq.findViewById(R.h.designer_product_title_tv);
    this.ipv = this.Iq.findViewById(R.h.designer_product_more);
    this.ipw = ((TextView)this.Iq.findViewById(R.h.designer_single_product));
    this.ipx = this.Iq.findViewById(R.h.designer_product_divider);
    this.ipy = ((MMPullDownView)findViewById(R.h.load_more_pull_view));
    this.ipy.setOnBottomLoadDataListener(this);
    this.ipy.setAtBottomCallBack(this);
    this.ipy.setBottomViewVisible(false);
    this.ipy.setIsBottomShowAll(false);
    this.CU = ((ListView)findViewById(16908298));
    this.CU.setOnItemClickListener(this);
    this.CU.setOnScrollListener(this);
    this.ipj.setOnClickListener(new EmojiStoreV2DesignerUI.12(this));
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        EmojiStoreV2DesignerUI.this.finish();
        return false;
      }
    });
    addIconOptionMenu(0, R.k.ofm_send_icon, new EmojiStoreV2DesignerUI.14(this));
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.iky.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 2002) && (paramInt2 == -1))
    {
      String str1 = paramIntent.getStringExtra("Select_Conv_User");
      if ((bi.oW(str1)) || (this.ipz == null)) {
        break label230;
      }
      x.d("MicroMsg.emoji.EmojiStoreV2DesignerUI", ".." + str1);
      String str2 = this.ihI;
      String str3 = this.ipz.jOS;
      int i = this.ipa;
      String str4 = this.ipc;
      String str5 = this.ihI;
      String str6 = this.ipz.rxm;
      String str7 = getResources().getString(R.l.app_designer_share) + str2;
      g.a locala = new g.a(this);
      locala.bZ(str1).TH(str7).BX(R.l.app_send);
      locala.TI(str6).cdP();
      locala.TK(getString(R.l.confirm_dialog_edittext_hint)).a(new k.2(str1, str5, str3, i, str4, str2, str6, this)).eIW.show();
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      label230:
      x.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "member or data is null.");
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iiH = getIntent().getStringExtra("id");
    this.ipa = getIntent().getIntExtra("uin", 0);
    this.ihI = getIntent().getStringExtra("name");
    this.ipb = getIntent().getStringExtra("headurl");
    this.ipc = getIntent().getStringExtra("rediret_url");
    this.fdx = getIntent().getIntExtra("extra_scence", 0);
    this.ihD = getIntent().getLongExtra("searchID", 0L);
    this.ihE = bi.aG(getIntent().getStringExtra("docID"), "");
    paramBundle = getIntent().getStringExtra("sns_object_data");
    if (!TextUtils.isEmpty(paramBundle))
    {
      this.ipa = EmojiLogic.zp(paramBundle);
      this.ihI = EmojiLogic.zq(paramBundle);
      this.ipc = EmojiLogic.zv(paramBundle);
    }
    initView();
    int i;
    if (!bi.oW(this.iiH))
    {
      paramBundle = com.tencent.mm.plugin.emoji.model.i.aEA().igD.ZC(this.iiH);
      if ((paramBundle != null) && (paramBundle.rHp != null) && (paramBundle.rHp.rHi != 0) && (!bi.oW(paramBundle.rHp.jPe)))
      {
        this.ipa = paramBundle.rHp.rHi;
        this.ihI = paramBundle.rHp.jPe;
        x.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "uin:%s name:%s", new Object[] { Integer.valueOf(this.ipa), this.ihI });
      }
    }
    else
    {
      i = 0;
      if (i != 0) {
        break label425;
      }
      Wj();
    }
    for (;;)
    {
      au.DF().a(239, this);
      au.DF().a(720, this);
      com.tencent.mm.sdk.b.a.sFg.b(this.ikA);
      com.tencent.mm.plugin.report.service.h.mEJ.h(12067, new Object[] { Integer.valueOf(1), "", "", "", "" });
      com.tencent.mm.plugin.report.service.h.mEJ.h(12740, new Object[] { Integer.valueOf(2), com.tencent.mm.a.o.getString(this.ipa), "", "", Integer.valueOf(this.fdx) });
      return;
      i = 1;
      break;
      label425:
      this.ipA = new com.tencent.mm.plugin.emoji.f.i(this.iiH);
      au.DF().a(this.ipA, 0);
      getString(R.l.app_tip);
      this.ipB = com.tencent.mm.ui.base.h.a(this, getString(R.l.app_waiting), true, new EmojiStoreV2DesignerUI.7(this));
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.ipG != null) {
      au.DF().c(this.ipG);
    }
    au.DF().b(239, this);
    au.DF().b(720, this);
    com.tencent.mm.sdk.b.a.sFg.c(this.ikA);
    if (this.mHandler != null)
    {
      this.mHandler.removeMessages(10002);
      this.mHandler.removeMessages(10001);
      this.mHandler = null;
    }
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject;
    if (this.ikI != null)
    {
      int i = this.CU.getHeaderViewsCount();
      paramAdapterView = this.ikI.oG(paramInt - i);
      if (paramAdapterView != null)
      {
        paramView = new Intent();
        paramView.setClass(this, EmojiStoreDetailUI.class);
        localObject = paramAdapterView.iez;
        if (localObject != null) {
          break label72;
        }
        paramAdapterView = null;
      }
    }
    for (;;)
    {
      if (paramAdapterView != null) {
        startActivity(paramAdapterView);
      }
      return;
      label72:
      paramView.putExtra("extra_id", ((ts)localObject).rem);
      paramView.putExtra("extra_name", ((ts)localObject).rwQ);
      paramView.putExtra("extra_copyright", ((ts)localObject).rxa);
      paramView.putExtra("extra_coverurl", ((ts)localObject).rwY);
      paramView.putExtra("extra_description", ((ts)localObject).rwR);
      paramView.putExtra("extra_price", ((ts)localObject).rwT);
      paramView.putExtra("extra_type", ((ts)localObject).rwU);
      paramView.putExtra("extra_flag", ((ts)localObject).rwV);
      paramView.putExtra("preceding_scence", 106);
      paramView.putExtra("download_entrance_scene", 6);
      paramView.putExtra("call_by", 1);
      paramView.putExtra("check_clickflag", false);
      paramView.putExtra("extra_status", paramAdapterView.mStatus);
      paramView.putExtra("extra_progress", paramAdapterView.pF);
      paramView.putExtra("searchID", this.ihD);
      localObject = getIntent().getStringExtra("to_talker_name");
      paramAdapterView = paramView;
      if (!bi.oW((String)localObject))
      {
        paramView.putExtra("to_talker_name", (String)localObject);
        paramAdapterView = paramView;
      }
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    au.DF().b(423, this);
  }
  
  protected void onResume()
  {
    super.onResume();
    au.DF().a(423, this);
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1))
    {
      if ((this.iki == 0) || (this.ikj)) {
        x.d("MicroMsg.emoji.EmojiStoreV2DesignerUI", "No More List.");
      }
    }
    else {
      return;
    }
    am(this.ikl);
    x.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2DesignerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */