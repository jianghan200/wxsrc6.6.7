package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.q;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.hg;
import com.tencent.mm.plugin.luckymoney.b.ac;
import com.tencent.mm.plugin.luckymoney.b.ai;
import com.tencent.mm.plugin.luckymoney.b.f;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.luckymoney.b.w;
import com.tencent.mm.plugin.luckymoney.particles.c;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.y;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.KeyboardLinearLayout.a;
import com.tencent.mm.ui.MMActivity;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LuckyMoneyDetailUI
  extends LuckyMoneyBaseUI
{
  private View Iq;
  private TextView hVS;
  private TextView hXT;
  private long hmf = 0L;
  private ImageView iDX;
  private boolean ikj = false;
  private View iln;
  private TextView kLF;
  private ListView kLN;
  private ImageView kLO;
  private TextView kLP;
  private ImageView kLQ;
  private View kLR;
  private View kLS;
  AbsListView.OnScrollListener kLU = new LuckyMoneyDetailUI.1(this);
  private List<n> kLz = new LinkedList();
  private SoundPool kMT;
  private com.tencent.mm.plugin.luckymoney.particles.b kOs = new com.tencent.mm.plugin.luckymoney.particles.b()
  {
    public final com.tencent.mm.plugin.luckymoney.particles.a.b b(Random paramAnonymousRandom)
    {
      switch (paramAnonymousRandom.nextInt(8))
      {
      default: 
        return null;
      case 0: 
        if (LuckyMoneyDetailUI.e(LuckyMoneyDetailUI.this) == null) {
          LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.lucky_money_f2f_firework_ribbon_1));
        }
        return new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.e(LuckyMoneyDetailUI.this));
      case 1: 
        if (LuckyMoneyDetailUI.f(LuckyMoneyDetailUI.this) == null) {
          LuckyMoneyDetailUI.b(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.lucky_money_f2f_firework_ribbon_2));
        }
        return new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.f(LuckyMoneyDetailUI.this));
      case 2: 
        if (LuckyMoneyDetailUI.g(LuckyMoneyDetailUI.this) == null) {
          LuckyMoneyDetailUI.c(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.lucky_money_f2f_firework_ribbon_3));
        }
        return new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.g(LuckyMoneyDetailUI.this));
      case 3: 
        if (LuckyMoneyDetailUI.h(LuckyMoneyDetailUI.this) == null) {
          LuckyMoneyDetailUI.d(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.lucky_money_f2f_firework_leaf_top_1));
        }
        return new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.h(LuckyMoneyDetailUI.this));
      case 4: 
        if (LuckyMoneyDetailUI.i(LuckyMoneyDetailUI.this) == null) {
          LuckyMoneyDetailUI.e(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.lucky_money_f2f_firework_leaf_top_2));
        }
        return new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.i(LuckyMoneyDetailUI.this));
      case 5: 
        if (LuckyMoneyDetailUI.j(LuckyMoneyDetailUI.this) == null) {
          LuckyMoneyDetailUI.f(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.lucky_money_f2f_firework_leaf_top_3));
        }
        return new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.j(LuckyMoneyDetailUI.this));
      case 6: 
        if (LuckyMoneyDetailUI.k(LuckyMoneyDetailUI.this) == null) {
          LuckyMoneyDetailUI.g(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.lucky_money_f2f_firework_leaf_top_4));
        }
        return new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.k(LuckyMoneyDetailUI.this));
      }
      if (LuckyMoneyDetailUI.l(LuckyMoneyDetailUI.this) == null) {
        LuckyMoneyDetailUI.h(LuckyMoneyDetailUI.this, LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, a.e.lucky_money_f2f_firework_leaf_top_5));
      }
      return new com.tencent.mm.plugin.luckymoney.particles.a.a(LuckyMoneyDetailUI.l(LuckyMoneyDetailUI.this));
    }
  };
  private int kQd = -1;
  private CdnImageView kUV;
  private ImageView kUW;
  private View kUX;
  private ImageView kUY;
  private TextView kUZ;
  private LuckyMoneyWishFooter kUh;
  private View kUj;
  private boolean kUl = true;
  private int kUm;
  private String kUn;
  private String kUo;
  private String kUp;
  private String kUq;
  private Map<String, Integer> kUs = new HashMap();
  private i kUt;
  private String kUu = "";
  private boolean kUv = false;
  private View kVa;
  private RelativeLayout kVb;
  private int[] kVc;
  private ViewGroup kVd;
  private Bitmap kVe;
  private Bitmap kVf;
  private Bitmap kVg;
  private Bitmap kVh;
  private Bitmap kVi;
  private Bitmap kVj;
  private Bitmap kVk;
  private Bitmap kVl;
  private final int kVm = 750;
  private final int kVn = 240;
  private TextView klp;
  private int tH = 0;
  
  private void a(final f paramf)
  {
    if (paramf == null) {}
    for (;;)
    {
      return;
      boolean bool;
      Object localObject1;
      int i;
      label103:
      label140:
      Object localObject2;
      label261:
      label313:
      label409:
      label460:
      label468:
      label553:
      label569:
      label590:
      label1107:
      int j;
      if (paramf.kPV == 1)
      {
        bool = true;
        this.kUl = bool;
        if (this.tH == 0)
        {
          this.kUo = paramf.kPS;
          localObject1 = this.kUo;
          if ((paramf == null) || (paramf.kPI != 0) || (paramf.kQe == null) || (paramf.kQe.size() <= 0) || (!((n)paramf.kQe.get(0)).kPS.equals(localObject1)) || (paramf.kPT == 1)) {
            break label1417;
          }
          i = 1;
          if (i == 0) {
            break label1422;
          }
          this.kUt.kLB = false;
          this.kUZ.setVisibility(0);
          this.kVa.setVisibility(0);
          this.hVS.setVisibility(8);
          this.kUt.kLC = paramf.kQd;
          if (paramf != null)
          {
            localObject1 = this.mController.tml;
            if (paramf.kQd != 2) {
              break label1462;
            }
            this.kLO.setImageResource(a.e.lucky_money_busi_default_avatar);
            if (paramf.resourceId == 0) {
              break label1444;
            }
            x.i("MicroMsg.LuckyMoneyDetailUI", "busi logo load from file:" + paramf.resourceId);
            localObject2 = new hg();
            ((hg)localObject2).bQx.bQz = paramf.resourceId;
            ((hg)localObject2).bJX = new LuckyMoneyDetailUI.8(this, (hg)localObject2, paramf);
            com.tencent.mm.sdk.b.a.sFg.a((com.tencent.mm.sdk.b.b)localObject2, Looper.myLooper());
            com.tencent.mm.plugin.luckymoney.b.o.a((Context)localObject1, this.kLP, paramf.kPL);
            com.tencent.mm.plugin.luckymoney.b.o.a((Context)localObject1, this.klp, paramf.kLf);
            if (paramf.kPI != 1) {
              break label1480;
            }
            this.kLQ.setVisibility(0);
            this.kLQ.setImageResource(a.e.lucky_money_group_icon);
            if (!bi.oW(paramf.kQb))
            {
              com.tencent.mm.plugin.luckymoney.b.o.d(this.kUW, paramf.kQb, a.e.lucky_money_index_top_bg);
              this.kUW.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            if (bi.oW(paramf.kQc)) {
              break label1558;
            }
            x.i("MicroMsg.LuckyMoneyDetailUI", "hy: has url : %s", new Object[] { paramf.kQc });
            this.kVb.setVisibility(4);
            com.tencent.mm.plugin.luckymoney.b.o.g(this.iDX, paramf.kQc);
            com.tencent.mm.sdk.platformtools.ah.i(new LuckyMoneyDetailUI.9(this), 500L);
            if ((paramf.ceT != 2) || (this.kUm == 3)) {
              break label1589;
            }
            this.kLF.setText(com.tencent.mm.wallet_core.ui.e.A(paramf.cfh / 100.0D));
            if (paramf.kPT == 1) {
              break label1578;
            }
            this.kUt.kLB = true;
            this.kLR.setVisibility(0);
            if (bi.oW(paramf.kNi)) {
              break label1641;
            }
            this.kLS.setVisibility(0);
            this.hXT.setText(paramf.kNi);
            if (paramf.kNg != 1) {
              break label1613;
            }
            x.i("MicroMsg.LuckyMoneyDetailUI", "changeIconUrl: %s", new Object[] { paramf.kQi });
            if (bi.oW(paramf.kQi)) {
              break label1601;
            }
            this.kUV.setUrl(paramf.kQi);
            this.kUV.setVisibility(0);
            this.hXT.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                LuckyMoneyDetailUI.a(LuckyMoneyDetailUI.this, paramf);
              }
            });
            if (bi.oW(paramf.kPW)) {
              break label1661;
            }
            this.hVS.setText(paramf.kPW);
          }
          if (paramf != null)
          {
            localObject1 = paramf.kPZ;
            if ((localObject1 != null) && (((List)localObject1).size() > 0))
            {
              localObject2 = this.Iq.findViewById(a.f.lucky_money_detail_operation_container_1);
              View localView1 = this.Iq.findViewById(a.f.lucky_money_detail_operation_container_2);
              View localView2 = this.Iq.findViewById(a.f.lucky_money_detail_operation_container_3);
              ViewGroup localViewGroup1 = (ViewGroup)this.Iq.findViewById(a.f.lucky_money_detail_operation_1);
              ViewGroup localViewGroup2 = (ViewGroup)this.Iq.findViewById(a.f.lucky_money_detail_operation_2);
              ViewGroup localViewGroup3 = (ViewGroup)this.Iq.findViewById(a.f.lucky_money_detail_operation_3);
              View localView3 = this.Iq.findViewById(a.f.lucky_money_detail_divider_operation_1);
              View localView4 = this.Iq.findViewById(a.f.lucky_money_detail_divider_operation_2);
              g.c localc = new g.c();
              localc.textColor = getResources().getColor(a.c.lucky_money_goldstyle_grey_text_color);
              if (((List)localObject1).size() > 0)
              {
                g.a(this, localViewGroup1, (ai)((List)localObject1).get(0), localc);
                ((View)localObject2).setVisibility(0);
              }
              if (((List)localObject1).size() > 1)
              {
                g.a(this, localViewGroup2, (ai)((List)localObject1).get(1), localc);
                localView1.setVisibility(0);
              }
              if (((List)localObject1).size() > 2)
              {
                g.a(this, localViewGroup3, (ai)((List)localObject1).get(2), localc);
                localView2.setVisibility(0);
              }
              if ((((View)localObject2).getVisibility() == 0) && ((localView1.getVisibility() == 0) || (localView2.getVisibility() == 0))) {
                localView3.setVisibility(0);
              }
              if ((localView1.getVisibility() == 0) && (localView2.getVisibility() == 0)) {
                localView4.setVisibility(0);
              }
              if ((((View)localObject2).getVisibility() == 0) || (localView1.getVisibility() == 0) || (localView2.getVisibility() == 0))
              {
                this.kUj.requestLayout();
                this.kUj.setVisibility(0);
              }
            }
            localObject1 = (ViewGroup)this.iln.findViewById(a.f.lucky_money_detail_footer_operation);
            localObject2 = new g.c();
            ((g.c)localObject2).textColor = getResources().getColor(a.c.lucky_money_goldstyle_grey_text_color);
            ((g.c)localObject2).textSize = getResources().getDimensionPixelSize(a.d.SmallerTextSize);
            g.a(this, (ViewGroup)localObject1, paramf.kQa, (g.c)localObject2);
          }
          com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(sj(paramf.kQd)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
        }
        if (paramf != null)
        {
          if (((paramf.ceS != 3) && (paramf.ceS != 2)) || (paramf.kPU != 1) || (this.kUl) || (paramf.kPX != 1)) {
            break label1672;
          }
          i = 1;
          if ((paramf.kPY == null) || (paramf.kPY.ddp != 1) || (bi.oW(paramf.kPY.kPw))) {
            break label1677;
          }
          j = 1;
          label1140:
          localObject1 = (TextView)this.iln.findViewById(a.f.lucky_money_detail_send_btn);
          if ((i == 0) && (j == 0)) {
            break label1682;
          }
          ((TextView)localObject1).setOnClickListener(new LuckyMoneyDetailUI.11(this, paramf));
          if (j != 0)
          {
            this.kUq = paramf.kPY.kPw;
            ((TextView)localObject1).setText(paramf.kPY.kPx);
          }
          com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(sj(paramf.kQd)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
          ((TextView)localObject1).setVisibility(0);
        }
      }
      for (;;)
      {
        this.kQd = paramf.kQd;
        ((TextView)this.iln.findViewById(a.f.lucky_money_detail_record_link)).setVisibility(8);
        if (!this.kUv)
        {
          this.kLN.addFooterView(this.iln);
          this.kUv = true;
        }
        localObject1 = paramf.kQe;
        if (localObject1 == null) {
          break label1742;
        }
        i = 0;
        while (i < ((List)localObject1).size())
        {
          localObject2 = (n)((List)localObject1).get(i);
          if (!this.kUs.containsKey(((n)localObject2).kPS))
          {
            this.kLz.add(((List)localObject1).get(i));
            this.kUs.put(((n)localObject2).kPS, Integer.valueOf(1));
          }
          i += 1;
        }
        bool = false;
        break;
        label1417:
        i = 0;
        break label103;
        label1422:
        this.hVS.setVisibility(0);
        this.kUt.kLA = this.kUo;
        break label140;
        label1444:
        com.tencent.mm.plugin.luckymoney.b.o.a(this.kLO, paramf.kPM, paramf.kQg);
        break label261;
        label1462:
        com.tencent.mm.plugin.luckymoney.b.o.a(this.kLO, paramf.kPM, paramf.kQg);
        break label261;
        label1480:
        if (paramf.kPI == 2)
        {
          if (!com.tencent.mm.model.s.he(paramf.kQg))
          {
            localObject1 = new j();
            ((j)localObject1).username = paramf.kQg;
            q.KH().a((j)localObject1);
          }
          this.kLQ.setVisibility(0);
          this.kLQ.setImageResource(a.e.lucky_money_f2f_record_icon);
          break label313;
        }
        this.kLQ.setVisibility(8);
        break label313;
        label1558:
        x.i("MicroMsg.LuckyMoneyDetailUI", "hy: no bg. set bg area to gone");
        this.kVb.setVisibility(8);
        break label409;
        label1578:
        this.kUt.kLB = false;
        break label460;
        label1589:
        this.kLR.setVisibility(8);
        break label468;
        label1601:
        this.kUV.setVisibility(8);
        break label553;
        label1613:
        x.e("MicroMsg.LuckyMoneyDetailUI", "detail.jumpChange is false");
        this.hXT.setTextColor(getResources().getColor(a.c.lucky_money_operation_text_normal_color));
        break label569;
        label1641:
        x.e("MicroMsg.LuckyMoneyDetailUI", "detail.changeWording is empty");
        this.kLS.setVisibility(8);
        break label569;
        label1661:
        this.hVS.setText(null);
        break label590;
        label1672:
        i = 0;
        break label1107;
        label1677:
        j = 0;
        break label1140;
        label1682:
        ((TextView)localObject1).setVisibility(8);
      }
      this.tH += ((List)localObject1).size();
      this.ikj = false;
      if (this.kUZ.getVisibility() != 0)
      {
        this.hVS.setVisibility(0);
        this.kUt.bw(this.kLz);
      }
      label1742:
      if ((paramf.kPI == 2) && (!bi.oW(paramf.kPK)))
      {
        this.kMT = new SoundPool(2, 3, 0);
        this.kVc = new int[2];
      }
      try
      {
        this.kVc[0] = this.kMT.load(getResources().getAssets().openFd("most_lucky.m4a"), 0);
        this.kVc[1] = this.kMT.load(getResources().getAssets().openFd("whistle.m4a"), 0);
        this.kMT.setOnLoadCompleteListener(new LuckyMoneyDetailUI.6(this, paramf));
        this.Iq.postDelayed(new Runnable()
        {
          public final void run()
          {
            Object localObject = LuckyMoneyDetailUI.t(LuckyMoneyDetailUI.this);
            com.tencent.mm.plugin.luckymoney.particles.b localb = LuckyMoneyDetailUI.u(LuckyMoneyDetailUI.this);
            com.tencent.mm.plugin.luckymoney.particles.a locala = new com.tencent.mm.plugin.luckymoney.particles.a((ViewGroup)localObject);
            localObject = new c(((ViewGroup)localObject).getContext(), localb, new com.tencent.mm.plugin.luckymoney.particles.d(-100, ((ViewGroup)localObject).getHeight() / 2), (ViewGroup)localObject).I(600.0F, 150.0F).J(-1000.0F, 250.0F).al(-200.0F).am(1500.0F);
            ((c)localObject).kSA = 600.0F;
            ((c)localObject).kSB = 300.0F;
            localObject = ((c)localObject).bbb();
            ((c)localObject).kSd = com.tencent.mm.plugin.luckymoney.particles.e.bbf();
            locala.kRR = ((c)localObject).bbc().bbd();
            locala.z(100, 400L);
            localObject = LuckyMoneyDetailUI.t(LuckyMoneyDetailUI.this);
            localb = LuckyMoneyDetailUI.u(LuckyMoneyDetailUI.this);
            locala = new com.tencent.mm.plugin.luckymoney.particles.a((ViewGroup)localObject);
            localObject = new c(((ViewGroup)localObject).getContext(), localb, new com.tencent.mm.plugin.luckymoney.particles.d(((ViewGroup)localObject).getWidth() + 100, ((ViewGroup)localObject).getHeight() / 2), (ViewGroup)localObject).I(-600.0F, 150.0F).J(-1000.0F, 250.0F).al(200.0F).am(1500.0F);
            ((c)localObject).kSA = 600.0F;
            ((c)localObject).kSB = 300.0F;
            localObject = ((c)localObject).bbb();
            ((c)localObject).kSd = com.tencent.mm.plugin.luckymoney.particles.e.bbf();
            locala.kRR = ((c)localObject).bbc().bbd();
            locala.z(100, 400L);
          }
        }, 300L);
        localObject1 = new y();
        ((y)localObject1).field_mNativeUrl = this.kUp;
        ((y)localObject1).field_hbType = paramf.kPI;
        ((y)localObject1).field_receiveAmount = paramf.cfh;
        ((y)localObject1).field_receiveTime = System.currentTimeMillis();
        ((y)localObject1).field_hbStatus = paramf.ceS;
        ((y)localObject1).field_receiveStatus = paramf.ceT;
        if (((y)localObject1).field_receiveAmount <= 0L) {
          continue;
        }
        com.tencent.mm.plugin.wallet_core.model.o.bOT().a((y)localObject1);
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          x.e("MicroMsg.LuckyMoneyDetailUI", "load lucky money voice fail " + localIOException.getMessage());
        }
      }
    }
  }
  
  private void bbr()
  {
    this.ikj = true;
    if ((this.tH > 0) && (this.kLz.size() > 0) && (this.kLz.get(this.kLz.size() - 1) != null))
    {
      l(new w(this.kUn, this.tH, this.kUp, bi.getLong(((n)this.kLz.get(this.kLz.size() - 1)).kQq, 0L), "v1.0", this.kUu));
      return;
    }
    this.kUu = "";
    l(new w(this.kUn, 11, this.tH, this.kUp, "v1.0", this.kUu));
  }
  
  private void bbs()
  {
    if ((this.kUh != null) && (this.kUh.getVisibility() != 8)) {
      this.kUh.setVisibility(8);
    }
  }
  
  private static int sj(int paramInt)
  {
    if (paramInt == 2) {
      return 13;
    }
    return 7;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool = false;
    if ((paraml instanceof w)) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (w)paraml;
        paraml = paramString.kQP;
        this.kUu = paramString.kRb;
        a(paraml);
        bool = true;
      }
    }
    do
    {
      return bool;
      com.tencent.mm.ui.base.h.bA(this, paramString);
      return true;
      if ((paraml instanceof ac))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.ui.base.h.bA(this, getString(a.i.has_send));
          this.kUt.kLB = false;
          bbs();
          paramString = (ac)paraml;
          if (this.kLz != null) {
            paramInt1 = 0;
          }
          for (;;)
          {
            if (paramInt1 < this.kLz.size())
            {
              paraml = (n)this.kLz.get(paramInt1);
              if (paraml.kPS.equalsIgnoreCase(paramString.kPS))
              {
                paraml.kQE = paramString.kLf;
                this.kUt.notifyDataSetChanged();
              }
            }
            else
            {
              if (this.kUZ.getVisibility() == 0)
              {
                this.kUZ.setVisibility(8);
                this.hVS.setVisibility(0);
                this.kVa.setVisibility(8);
                this.kUt.bw(this.kLz);
              }
              return true;
            }
            paramInt1 += 1;
          }
        }
        com.tencent.mm.ui.base.h.bA(this, paramString);
        return true;
      }
    } while (!(paraml instanceof com.tencent.mm.plugin.luckymoney.b.ah));
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.ui.widget.snackbar.b.h(this, getString(a.i.has_send));
      return true;
    }
    com.tencent.mm.ui.base.h.bA(this, paramString);
    return true;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (this.kUh.getVisibility() == 0))
    {
      this.kUh.setVisibility(8);
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void finish()
  {
    if (getIntent().hasExtra("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)getIntent().getParcelableExtra("key_realname_guide_helper");
      Bundle localBundle = new Bundle();
      localBundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyDetailUI");
      localBundle.putString("realname_verify_process_jump_plugin", "luckymoney");
      boolean bool = localRealnameGuideHelper.b(this, localBundle, new LuckyMoneyDetailUI.5(this));
      getIntent().removeExtra("key_realname_guide_helper");
      if (!bool) {
        super.finish();
      }
      return;
    }
    super.finish();
  }
  
  protected final int getLayoutId()
  {
    return a.g.lucky_money_detail_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.lucky_money_detail);
    setBackBtn(new LuckyMoneyDetailUI.14(this));
    cqh();
    this.kLN = ((ListView)findViewById(a.f.lucky_money_detail_record_list));
    this.kUt = new i(this.mController.tml);
    this.Iq = LayoutInflater.from(this).inflate(a.g.lucky_money_detail_header, null);
    this.kLN.addHeaderView(this.Iq);
    this.kLN.setAdapter(this.kUt);
    this.Iq.setOnClickListener(new LuckyMoneyDetailUI.15(this));
    this.kLN.setOnScrollListener(this.kLU);
    this.kLN.setOnItemClickListener(new LuckyMoneyDetailUI.16(this));
    this.iln = LayoutInflater.from(this).inflate(a.g.lucky_money_detail_footer, null);
    this.kLO = ((ImageView)this.Iq.findViewById(a.f.lucky_money_detail_sender_avatar));
    this.kLP = ((TextView)this.Iq.findViewById(a.f.lucky_money_detail_whose));
    this.kLQ = ((ImageView)this.Iq.findViewById(a.f.lucky_money_detail_group_icon));
    this.klp = ((TextView)this.Iq.findViewById(a.f.lucky_money_detail_wishing));
    this.kLR = this.Iq.findViewById(a.f.lucky_money_detail_amount_area);
    this.kLF = ((TextView)this.Iq.findViewById(a.f.lucky_money_detail_amount));
    this.kLS = this.Iq.findViewById(a.f.lucky_money_detail_layout);
    this.hXT = ((TextView)this.Iq.findViewById(a.f.lucky_money_detail_tips));
    this.kUV = ((CdnImageView)this.Iq.findViewById(a.f.lucky_money_detail_icon));
    this.hVS = ((TextView)this.Iq.findViewById(a.f.lucky_money_detail_desc));
    this.kUW = ((ImageView)this.Iq.findViewById(a.f.lucky_money_detail_top_bg));
    this.kUj = this.Iq.findViewById(a.f.lucky_money_detail_opertiaon_ll);
    this.kUX = this.Iq.findViewById(a.f.lucky_money_detail_background_area);
    this.kUY = ((ImageView)this.Iq.findViewById(a.f.lucky_money_detail_background));
    this.kUZ = ((TextView)this.Iq.findViewById(a.f.lucky_money_detail_normal_wish));
    this.kVa = findViewById(a.f.lucky_money_detail_normal_wish_divider);
    this.kVb = ((RelativeLayout)this.Iq.findViewById(a.f.lucky_money_detail_background_area));
    this.iDX = ((ImageView)this.Iq.findViewById(a.f.lucky_money_detail_background));
    this.kUh = ((LuckyMoneyWishFooter)findViewById(a.f.lucky_money_detail_wish_footer));
    this.kVd = ((ViewGroup)findViewById(a.f.lucky_money_f2f_firework_recv_container));
    this.kUV.setUseSdcardCache(true);
    this.kUh.a(new LuckyMoneyDetailUI.17(this));
    this.kUh.setOnWishSendImp(new LuckyMoneyDetailUI.18(this));
    this.kUh.post(new LuckyMoneyDetailUI.19(this));
    this.kUh.setOnkbdStateListener(new KeyboardLinearLayout.a()
    {
      public final void qN(int paramAnonymousInt)
      {
        if ((paramAnonymousInt == -2) && (LuckyMoneyDetailUI.o(LuckyMoneyDetailUI.this).kXI)) {
          LuckyMoneyDetailUI.o(LuckyMoneyDetailUI.this).setModeClick(false);
        }
      }
    });
    this.kUt.kXt = new LuckyMoneyDetailUI.3(this);
    this.kUh.setMaxLength(25);
    this.kUZ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        LuckyMoneyDetailUI.o(LuckyMoneyDetailUI.this).setVisibility(0);
      }
    });
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
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        String str = paramIntent.getStringExtra("Select_Conv_User");
        if (!bi.oW(str)) {
          if ((this.kUq != null) && (this.kUq.startsWith("wxpay://c2cbizmessagehandler/hongbao/festivalhongbao"))) {
            x.i("MicroMsg.LuckyMoneyDetailUI", "Not expected branch since 2015 fesitval");
          } else {
            l(new com.tencent.mm.plugin.luckymoney.b.ah(str.replaceAll(",", "|"), this.kUn, "v1.0"));
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    this.kUn = getIntent().getStringExtra("key_sendid");
    this.kUp = getIntent().getStringExtra("key_native_url");
    this.kUm = getIntent().getIntExtra("key_jump_from", 2);
    x.i("MicroMsg.LuckyMoneyDetailUI", "sendid=" + bi.oV(this.kUn) + ", nativeurl=" + bi.oV(this.kUp) + ", jumpFrom=" + this.kUm);
    if (this.kUm == 2) {}
    for (;;)
    {
      try
      {
        paramBundle = getIntent().getByteArrayExtra("key_detail_info");
        if (paramBundle != null)
        {
          paramBundle = (f)new f().aG(paramBundle);
          if (paramBundle != null)
          {
            a(paramBundle);
            if (getIntent().getBooleanExtra("play_sound", false)) {
              k.I(this, a.i.lucky_cashrecivedrevised);
            }
            addTextOptionMenu(0, getString(a.i.lucky_money_check_mine_title_opt), new LuckyMoneyDetailUI.13(this));
            DN(getResources().getColor(a.c.lucky_money_goldstyle_envelop_primary_text_color));
            return;
          }
        }
      }
      catch (Exception paramBundle)
      {
        x.w("MicroMsg.LuckyMoneyDetailUI", "Parse LuckyMoneyDetail fail!" + paramBundle.getLocalizedMessage());
      }
      if ((bi.oW(this.kUn)) && (!bi.oW(this.kUp))) {
        paramBundle = Uri.parse(this.kUp);
      }
      try
      {
        this.kUn = paramBundle.getQueryParameter("sendid");
        if (!bi.oW(this.kUn))
        {
          bbr();
          continue;
        }
        x.w("MicroMsg.LuckyMoneyDetailUI", "sendid null or nil, finish");
      }
      catch (Exception paramBundle)
      {
        for (;;) {}
      }
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    boolean bool = super.onCreatePanelMenu(paramInt, paramMenu);
    paramMenu = (TextView)findViewById(a.f.action_option_text);
    if (paramMenu != null) {
      paramMenu.setTextColor(getResources().getColor(a.c.lucky_money_goldstyle_envelop_primary_text_color));
    }
    return bool;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.kUh != null) {
      this.kUh.bbE();
    }
    if (this.kMT != null)
    {
      this.kMT.release();
      int i = 0;
      while (i < this.kVc.length)
      {
        this.kMT.unload(this.kVc[i]);
        i += 1;
      }
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    com.tencent.mm.modelstat.d.h("LuckyMoneyDetailUI", this.hmf, bi.VE());
  }
  
  protected void onResume()
  {
    super.onResume();
    this.hmf = bi.VE();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */