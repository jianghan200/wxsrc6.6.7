package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.hg;
import com.tencent.mm.plugin.luckymoney.b.ac;
import com.tencent.mm.plugin.luckymoney.b.ah;
import com.tencent.mm.plugin.luckymoney.b.ai;
import com.tencent.mm.plugin.luckymoney.b.f;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.luckymoney.b.w;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.e;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class LuckyMoneyBusiDetailUI
  extends LuckyMoneyBaseUI
{
  private View Iq;
  private TextView hVS;
  private TextView hXT;
  private boolean ikj = false;
  private View iln;
  private TextView kLF;
  private ListView kLN;
  private ImageView kLO;
  private TextView kLP;
  private View kLR;
  private View kLS;
  AbsListView.OnScrollListener kLU = new LuckyMoneyBusiDetailUI.1(this);
  private List<n> kLz = new LinkedList();
  private LuckyMoneyWishFooter kUh;
  private ImageView kUi;
  private View kUj;
  private ImageView kUk;
  private boolean kUl = true;
  private int kUm;
  private String kUn;
  private String kUo;
  private String kUp;
  private String kUq;
  private int kUr = 0;
  private Map<String, Integer> kUs = new HashMap();
  private i kUt;
  private String kUu = "";
  private boolean kUv = false;
  private TextView klp;
  private int tH = 0;
  
  private void a(f paramf)
  {
    if (paramf == null) {
      return;
    }
    boolean bool;
    label169:
    label246:
    label254:
    label322:
    label338:
    label359:
    Object localObject3;
    int i;
    label900:
    int j;
    if (paramf.kPV == 1)
    {
      bool = true;
      this.kUl = bool;
      if (this.tH == 0)
      {
        this.kUo = paramf.kPS;
        this.kUt.kLA = this.kUo;
        this.kUt.kLC = paramf.kQd;
        if (paramf != null)
        {
          localObject1 = this.mController.tml;
          if (paramf.kQd != 2) {
            break label1253;
          }
          this.kLO.setImageResource(a.e.lucky_money_busi_default_avatar);
          if (paramf.resourceId == 0) {
            break label1243;
          }
          x.i("MicroMsg.LuckyMoneyDetailUI", "busi logo load from file:" + paramf.resourceId);
          localObject2 = new hg();
          ((hg)localObject2).bQx.bQz = paramf.resourceId;
          ((hg)localObject2).bJX = new LuckyMoneyBusiDetailUI.3(this, (hg)localObject2, paramf);
          com.tencent.mm.sdk.b.a.sFg.a((b)localObject2, Looper.myLooper());
          o.a((Context)localObject1, this.kLP, paramf.kPL);
          o.a((Context)localObject1, this.klp, paramf.kLf);
          if ((paramf.ceT != 2) || (this.kUm == 3)) {
            break label1282;
          }
          this.kLF.setText(e.A(paramf.cfh / 100.0D));
          if (paramf.kPT == 1) {
            break label1271;
          }
          this.kUt.kLB = true;
          this.kLR.setVisibility(0);
          if (bi.oW(paramf.kNi)) {
            break label1334;
          }
          this.kLS.setVisibility(0);
          this.hXT.setText(paramf.kNi);
          if (paramf.kNg != 1) {
            break label1306;
          }
          if ((TextUtils.isEmpty(paramf.kNh)) || (paramf.kNh.startsWith("weixin://wxpay"))) {
            break label1294;
          }
          this.kUi.setVisibility(0);
          this.hXT.setOnClickListener(new LuckyMoneyBusiDetailUI.4(this, paramf));
          if (bi.oW(paramf.kPW)) {
            break label1354;
          }
          this.hVS.setText(paramf.kPW);
        }
        if (paramf != null)
        {
          localObject1 = paramf.kPZ;
          if ((localObject1 != null) && (((List)localObject1).size() > 0))
          {
            localObject2 = this.Iq.findViewById(a.f.busi_detail_operation_container_1);
            localObject3 = this.Iq.findViewById(a.f.busi_detail_operation_container_2);
            View localView1 = this.Iq.findViewById(a.f.busi_detail_operation_container_3);
            ViewGroup localViewGroup1 = (ViewGroup)this.Iq.findViewById(a.f.busi_detail_operation_1);
            ViewGroup localViewGroup2 = (ViewGroup)this.Iq.findViewById(a.f.busi_detail_operation_2);
            ViewGroup localViewGroup3 = (ViewGroup)this.Iq.findViewById(a.f.busi_detail_operation_3);
            View localView2 = this.Iq.findViewById(a.f.busi_detail_divider_operation_1);
            View localView3 = this.Iq.findViewById(a.f.busi_detail_divider_operation_2);
            g.c localc = new g.c();
            localc.textColor = getResources().getColor(a.c.lucky_money_goldstyle_detail_primary_text_color);
            localc.kWM = true;
            localc.resourceId = paramf.resourceId;
            localc.kWN = this.kUr;
            if (((List)localObject1).size() > 0)
            {
              g.a(this, localViewGroup1, (ai)((List)localObject1).get(0), localc);
              ((View)localObject2).setVisibility(0);
            }
            if (((List)localObject1).size() > 1)
            {
              g.a(this, localViewGroup2, (ai)((List)localObject1).get(1), localc);
              ((View)localObject3).setVisibility(0);
            }
            if (((List)localObject1).size() > 2)
            {
              g.a(this, localViewGroup3, (ai)((List)localObject1).get(2), localc);
              localView1.setVisibility(0);
            }
            if ((((View)localObject2).getVisibility() == 0) && ((((View)localObject3).getVisibility() == 0) || (localView1.getVisibility() == 0))) {
              localView2.setVisibility(0);
            }
            if ((((View)localObject3).getVisibility() == 0) && (localView1.getVisibility() == 0)) {
              localView3.setVisibility(0);
            }
            if ((((View)localObject2).getVisibility() == 0) || (((View)localObject3).getVisibility() == 0) || (localView1.getVisibility() == 0))
            {
              this.kUj.requestLayout();
              this.kUj.setVisibility(0);
            }
          }
          localObject1 = (ViewGroup)this.iln.findViewById(a.f.busi_detail_footer_operation);
          localObject2 = new g.c();
          ((g.c)localObject2).textColor = getResources().getColor(a.c.lucky_money_goldstyle_detail_primary_text_color);
          ((g.c)localObject2).textSize = getResources().getDimensionPixelSize(a.d.SmallerTextSize);
          g.a(this, (ViewGroup)localObject1, paramf.kQa, (g.c)localObject2);
        }
        com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(sj(paramf.kQd)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
      }
      if (paramf != null)
      {
        if (((paramf.ceS != 3) && (paramf.ceS != 2)) || (paramf.kPU != 1) || (this.kUl) || (paramf.kPX != 1)) {
          break label1365;
        }
        i = 1;
        if ((paramf.kPY == null) || (paramf.kPY.ddp != 1) || (bi.oW(paramf.kPY.kPw))) {
          break label1370;
        }
        j = 1;
        label933:
        localObject1 = (TextView)this.iln.findViewById(a.f.busi_detail_send_btn);
        if ((i == 0) && (j == 0)) {
          break label1375;
        }
        ((TextView)localObject1).setOnClickListener(new LuckyMoneyBusiDetailUI.5(this, paramf));
        if (j != 0)
        {
          this.kUq = paramf.kPY.kPw;
          ((TextView)localObject1).setText(paramf.kPY.kPx);
        }
        com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(sj(paramf.kQd)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
        ((TextView)localObject1).setVisibility(0);
        label1057:
        localObject2 = (TextView)this.iln.findViewById(a.f.busi_detail_record_link);
        if ((this.kUm == 1) || (this.kUm == 3) || (((TextView)localObject1).getVisibility() == 0)) {
          break label1385;
        }
        ((TextView)localObject2).setOnClickListener(new LuckyMoneyBusiDetailUI.6(this, paramf));
        ((TextView)localObject2).setVisibility(0);
      }
    }
    for (;;)
    {
      if (!this.kUv)
      {
        this.kLN.addFooterView(this.iln);
        this.kUv = true;
      }
      localObject1 = paramf.kQe;
      if (localObject1 == null) {
        break label1427;
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
      label1243:
      if (bi.oW(paramf.kPM)) {
        break label169;
      }
      label1253:
      o.a(this.kLO, paramf.kPM, paramf.kQg);
      break label169;
      label1271:
      this.kUt.kLB = false;
      break label246;
      label1282:
      this.kLR.setVisibility(8);
      break label254;
      label1294:
      this.kUi.setVisibility(8);
      break label322;
      label1306:
      x.e("MicroMsg.LuckyMoneyDetailUI", "detail.jumpChange is false");
      this.hXT.setTextColor(getResources().getColor(a.c.lucky_money_operation_text_normal_color));
      break label338;
      label1334:
      x.e("MicroMsg.LuckyMoneyDetailUI", "detail.changeWording is empty");
      this.kLS.setVisibility(8);
      break label338;
      label1354:
      this.hVS.setText(null);
      break label359;
      label1365:
      i = 0;
      break label900;
      label1370:
      j = 0;
      break label933;
      label1375:
      ((TextView)localObject1).setVisibility(8);
      break label1057;
      label1385:
      ((TextView)localObject2).setVisibility(8);
    }
    this.tH += ((List)localObject1).size();
    this.ikj = false;
    this.kUt.bw(this.kLz);
    label1427:
    Object localObject1 = paramf.kQc;
    Object localObject2 = paramf.kQf;
    this.kUk.setImageResource(a.e.lucky_money_busi_ad_img_default);
    if (bi.oW((String)localObject1))
    {
      x.i("MicroMsg.LuckyMoneyDetailUI", "renderAdImage: no adImage");
      this.kUk.setVisibility(8);
    }
    for (;;)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(13051, new Object[] { Integer.valueOf(this.kUr), Integer.valueOf(1), paramf.kQc, o.bv(paramf.kPZ), "", "", "", "", paramf.kPL, Integer.valueOf(paramf.resourceId) });
      return;
      new DisplayMetrics();
      localObject3 = ad.getContext().getResources().getDisplayMetrics();
      if (localObject3 != null)
      {
        i = (int)((((DisplayMetrics)localObject3).widthPixels - getResources().getDimensionPixelSize(a.d.lucky_money_busi_detail_list_padding) * 2 - getResources().getDimensionPixelSize(a.d.lucky_money_busi_detail_list_margin) * 2) * 0.75F);
        localObject3 = this.kUk.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject3).height = i;
        this.kUk.setLayoutParams((ViewGroup.LayoutParams)localObject3);
      }
      o.a(this.kUk, (String)localObject1, (String)localObject2, false);
      this.kUk.setVisibility(0);
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
  
  public static void fixBackgroundRepeat(View paramView)
  {
    if (paramView == null) {}
    do
    {
      return;
      paramView = paramView.getBackground();
    } while ((paramView == null) || (!(paramView instanceof BitmapDrawable)));
    paramView = (BitmapDrawable)paramView;
    paramView.mutate();
    paramView.setTileModeX(Shader.TileMode.REPEAT);
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
              return true;
            }
            paramInt1 += 1;
          }
        }
        com.tencent.mm.ui.base.h.bA(this, paramString);
        return true;
      }
    } while (!(paraml instanceof ah));
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.ui.base.h.bA(this, getString(a.i.has_send));
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
      localBundle.putString("realname_verify_process_jump_plugin", "luckymoney");
      localBundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiDetailUI");
      boolean bool = localRealnameGuideHelper.b(this, localBundle, new LuckyMoneyBusiDetailUI.2(this));
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
    return a.g.lucky_money_busi_detail_ui;
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
            l(new ah(str.replaceAll(",", "|"), this.kUn, "v1.0"));
          }
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kLN = ((ListView)findViewById(a.f.busi_detail_record_list));
    this.kUt = new i(this.mController.tml);
    this.Iq = LayoutInflater.from(this).inflate(a.g.lucky_money_busi_detail_header, null);
    this.kLN.addHeaderView(this.Iq);
    this.kLN.setAdapter(this.kUt);
    this.Iq.setOnClickListener(new LuckyMoneyBusiDetailUI.7(this));
    this.kLN.setOnScrollListener(this.kLU);
    this.kLN.setOnItemClickListener(new LuckyMoneyBusiDetailUI.8(this));
    this.iln = LayoutInflater.from(this).inflate(a.g.lucky_money_busi_detail_footer, null);
    this.kLO = ((ImageView)this.Iq.findViewById(a.f.busi_detail_avatar));
    this.kLP = ((TextView)this.Iq.findViewById(a.f.busi_detail_whose));
    this.klp = ((TextView)this.Iq.findViewById(a.f.busi_detail_wishing));
    this.kLR = this.Iq.findViewById(a.f.busi_detail_amount_area);
    this.kLF = ((TextView)this.Iq.findViewById(a.f.busi_detail_amount));
    this.kLS = this.Iq.findViewById(a.f.busi_detail_hint_layout);
    this.hXT = ((TextView)this.Iq.findViewById(a.f.busi_detail_tips));
    this.kUi = ((ImageView)this.Iq.findViewById(a.f.busi_detail_icon));
    this.hVS = ((TextView)this.Iq.findViewById(a.f.busi_detail_desc));
    this.kUj = this.Iq.findViewById(a.f.busi_detail_opertiaon_ll);
    this.kUk = ((ImageView)this.Iq.findViewById(a.f.busi_detail_adimage));
    paramBundle = (ImageView)findViewById(a.f.busi_detail_close_btn);
    this.kUh = ((LuckyMoneyWishFooter)findViewById(a.f.busi_detail_wish_footer));
    this.kUh.a(new LuckyMoneyBusiDetailUI.9(this));
    this.kUh.setOnWishSendImp(new LuckyMoneyBusiDetailUI.10(this));
    this.kUh.post(new LuckyMoneyBusiDetailUI.11(this));
    this.kUh.setOnkbdStateListener(new LuckyMoneyBusiDetailUI.12(this));
    this.kUt.kXt = new LuckyMoneyBusiDetailUI.13(this);
    i locali = this.kUt;
    locali.kXu = new i.a(locali);
    this.kUh.setMaxLength(25);
    paramBundle.setOnClickListener(new LuckyMoneyBusiDetailUI.14(this));
    fixBackgroundRepeat(findViewById(a.f.busi_detail_bottom_decoration));
    this.kUn = getIntent().getStringExtra("key_sendid");
    this.kUp = getIntent().getStringExtra("key_native_url");
    this.kUm = getIntent().getIntExtra("key_jump_from", 2);
    this.kUr = getIntent().getIntExtra("key_static_from_scene", 0);
    x.i("MicroMsg.LuckyMoneyDetailUI", "initData: sendid=%s , nativeurl=%s, jumpFrom=%d", new Object[] { this.kUn, this.kUp, Integer.valueOf(this.kUm) });
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
            return;
          }
        }
      }
      catch (Exception paramBundle)
      {
        x.w("MicroMsg.LuckyMoneyDetailUI", "initData: parse LuckyMoneyDetail fail!" + paramBundle.getLocalizedMessage());
      }
      if ((bi.oW(this.kUn)) && (!bi.oW(this.kUp))) {
        paramBundle = Uri.parse(this.kUp);
      }
      try
      {
        this.kUn = paramBundle.getQueryParameter("sendid");
        if (!bi.oW(this.kUn)) {
          bbr();
        }
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          x.w("MicroMsg.LuckyMoneyDetailUI", "initData: parse uri exp:" + paramBundle.getLocalizedMessage());
        }
        x.w("MicroMsg.LuckyMoneyDetailUI", "sendid null or nil, finish");
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.kUh != null) {
      this.kUh.bbE();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */