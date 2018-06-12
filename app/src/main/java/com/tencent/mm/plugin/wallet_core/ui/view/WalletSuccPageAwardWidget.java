package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.c.i;
import com.tencent.mm.plugin.wallet_core.c.j;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.afe;
import com.tencent.mm.protocal.c.st;
import com.tencent.mm.protocal.c.ul;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.y;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import d.a.a.b;
import d.a.a.f;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class WalletSuccPageAwardWidget
  extends FrameLayout
{
  private static final String pAL = com.tencent.mm.compatible.util.e.bnE + "wallet/images/";
  private TextView eHU;
  private TextView fAK;
  private String hTI;
  private Button hlf;
  private d.a.a.c mAh;
  private boolean mLL = true;
  private ImageView pAB;
  private ImageView pAC;
  private WalletScratchShakeView pAD;
  private WalletAwardShakeAnimView pAE;
  private d.a.a.g pAF;
  private WalletBaseUI pAG;
  private boolean pAH = false;
  private boolean pAI = false;
  private boolean pAJ = false;
  private d.a.a.a pAK = null;
  private ViewGroup pAx;
  private boolean pjf;
  private CdnImageView pwW;
  
  public WalletSuccPageAwardWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public WalletSuccPageAwardWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private static String Pz(String paramString)
  {
    if (!bi.G(new String[0]))
    {
      FileOp.mL(pAL);
      String str = pAL + com.tencent.xweb.util.c.u(paramString.getBytes());
      x.i("MicroMsg.WalletSuccPageAwardWidget", "buildImagePathByUrl, url: %s, path: %s", new Object[] { paramString, str });
      return str;
    }
    return null;
  }
  
  public static boolean a(d.a.a.c paramc)
  {
    return (paramc != null) && (((paramc.rxS != null) && (paramc.rxS.size() > 0)) || (paramc.vHe != null));
  }
  
  private static String b(d.a.a.c paramc)
  {
    if (paramc != null)
    {
      JSONObject localJSONObject1;
      Object localObject2;
      try
      {
        localJSONObject1 = new JSONObject();
        localObject1 = new JSONArray();
        if ((paramc.rxS != null) && (paramc.rxS.size() > 0))
        {
          localObject2 = paramc.rxS.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            d.a.a.g localg = (d.a.a.g)((Iterator)localObject2).next();
            JSONObject localJSONObject2 = new JSONObject();
            localJSONObject2.put("logo", localg.lRX);
            localJSONObject2.put("award_name", localg.vHo);
            localJSONObject2.put("award_description", localg.vHp);
            localJSONObject2.put("background_img", localg.vHq);
            localJSONObject2.put("award_name_color", localg.vHr);
            localJSONObject2.put("award_description_color", localg.vHs);
            ((JSONArray)localObject1).put(localJSONObject2);
          }
        }
        localJSONObject1.put("single_exposure_info_list", localObject1);
      }
      catch (Exception paramc)
      {
        return "";
      }
      localJSONObject1.put("is_query_others", paramc.vGZ);
      localJSONObject1.put("draw_lottery_params", paramc.rvZ);
      localJSONObject1.put("is_show_btn", paramc.rxT);
      Object localObject1 = new JSONObject();
      if (paramc.rxU != null)
      {
        ((JSONObject)localObject1).put("btn_words", paramc.rxU.vGR);
        ((JSONObject)localObject1).put("btn_color", paramc.rxU.vGS);
        ((JSONObject)localObject1).put("btn_op_type", paramc.rxU.vGT);
        ((JSONObject)localObject1).put("url", paramc.rxU.url);
        localObject2 = new JSONObject();
        if (paramc.rxU.vGU != null)
        {
          ((JSONObject)localObject2).put("activity_tinyapp_username", paramc.rxU.vGU.sbY);
          ((JSONObject)localObject2).put("activity_tinyapp_path", paramc.rxU.vGU.sbZ);
          ((JSONObject)localObject2).put("activity_tinyapp_version", paramc.rxU.vGU.sca);
        }
        ((JSONObject)localObject1).put("mini_app_info", localObject2);
        ((JSONObject)localObject1).put("get_lottery_params", paramc.rxU.rJm);
      }
      localJSONObject1.put("btn_info", localObject1);
      localJSONObject1.put("exposure_info_modify_params", paramc.rxR);
      localJSONObject1.put("user_opertaion_type", paramc.vHa);
      localJSONObject1.put("is_show_layer", paramc.vHb);
      localJSONObject1.put("background_img_whole", paramc.vHd);
      if (paramc.vHe != null)
      {
        localObject1 = new JSONObject();
        ((JSONObject)localObject1).put("animation_wording", paramc.vHe.vGV);
        ((JSONObject)localObject1).put("animation_wording_color", paramc.vHe.vGW);
        ((JSONObject)localObject1).put("url", paramc.vHe.url);
        ((JSONObject)localObject1).put("op_type", paramc.vHe.srY);
        ((JSONObject)localObject1).put("after_animation_wording", paramc.vHe.vGX);
        ((JSONObject)localObject1).put("after_animation_wording_color", paramc.vHe.vGY);
        localObject2 = new JSONObject();
        if (paramc.vHe.vGU != null)
        {
          ((JSONObject)localObject2).put("activity_tinyapp_username", paramc.vHe.vGU.sbY);
          ((JSONObject)localObject2).put("activity_tinyapp_path", paramc.vHe.vGU.sbZ);
          ((JSONObject)localObject2).put("activity_tinyapp_version", paramc.vHe.vGU.sca);
        }
        ((JSONObject)localObject1).put("mini_app_info", localObject2);
        localJSONObject1.put("draw_lottery_info", localObject1);
      }
      paramc = localJSONObject1.toString();
      return paramc;
    }
    return "";
  }
  
  private void bQS()
  {
    int i = 2;
    x.i("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, exposureInfo: %s, isFirstShow: %s", new Object[] { b(this.mAh), Boolean.valueOf(this.mLL) });
    if (this.mAh == null) {
      x.e("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, exposureInfo is null!");
    }
    do
    {
      return;
      x.l("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, user_operation_type: %s, single_exposure_info_list size: %s, isClickH5OrTinyApp: %s", new Object[] { Integer.valueOf(this.mAh.vHa), Integer.valueOf(this.mAh.rxS.size()), Boolean.valueOf(this.pAH) });
    } while ((this.mAh.vHa <= 0) || (this.mAh.vHa > 5) || (!a(this.mAh)));
    Object localObject;
    if (this.mAh.vHa == 4)
    {
      bQU();
      if (this.pAD.getVisibility() != 8)
      {
        this.pAD.setVisibility(8);
        this.pAD.onDestroy();
      }
      if (this.pAE.getVisibility() != 8)
      {
        this.pAE.setVisibility(8);
        this.pAE.destroy();
      }
      if ((this.mLL) || (this.pAH))
      {
        localObject = h.mEJ;
        if (!this.pAH) {
          break label1209;
        }
      }
    }
    for (;;)
    {
      ((h)localObject).h(15225, new Object[] { Integer.valueOf(3), Integer.valueOf(i) });
      this.mLL = false;
      return;
      if ((this.mAh.vHa == 1) || (this.mAh.vHa == 2) || (this.mAh.vHa == 3))
      {
        bQU();
        if (this.pAE.getVisibility() != 8)
        {
          this.pAE.setVisibility(8);
          this.pAE.destroy();
        }
        if (this.pAD.getVisibility() == 0) {
          break;
        }
        this.pAD.setVisibility(0);
        this.pAD.post(new WalletSuccPageAwardWidget.1(this));
        break;
      }
      if (this.mAh.vHa != 5) {
        break;
      }
      bQU();
      if (this.pAD.getVisibility() != 8)
      {
        this.pAD.setVisibility(8);
        this.pAD.onDestroy();
      }
      if (this.mAh.vHe != null)
      {
        x.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, op_type: %s", new Object[] { Integer.valueOf(this.mAh.vHe.srY) });
        switch (this.mAh.vHe.srY)
        {
        default: 
          this.pAE.setVisibility(8);
          this.pAE.destroy();
          break;
        case 1: 
          if (this.pAE.getVisibility() != 0)
          {
            this.pAE.setVisibility(0);
            this.pAE.post(new WalletSuccPageAwardWidget.2(this));
          }
          this.pAE.destroy();
          if (!bi.oW(this.mAh.vHe.vGV))
          {
            x.i("MicroMsg.WalletSuccPageAwardWidget", "animation_wording: %s", new Object[] { this.mAh.vHe.vGV });
            this.pAE.setShakeHintWording(this.mAh.vHe.vGV);
          }
          if (!bi.oW(this.mAh.vHe.vGW)) {}
          try
          {
            x.i("MicroMsg.WalletSuccPageAwardWidget", "animation_wording_color: %s", new Object[] { this.mAh.vHe.vGW });
            this.pAE.setShakeHintWordingColor(Color.parseColor(this.mAh.vHe.vGW));
            if (!bi.oW(this.mAh.vHe.vGX))
            {
              x.i("MicroMsg.WalletSuccPageAwardWidget", "after_animation_wording: %s", new Object[] { this.mAh.vHe.vGX });
              this.pAE.setAfterHintWording(this.mAh.vHe.vGX);
            }
            if (!bi.oW(this.mAh.vHe.vGY)) {
              x.i("MicroMsg.WalletSuccPageAwardWidget", "after_animation_wording_color: %s", new Object[] { this.mAh.vHe.vGY });
            }
          }
          catch (Exception localException1)
          {
            try
            {
              this.pAE.setAfterHintWordingColor(Color.parseColor(this.mAh.vHe.vGY));
              this.pAE.setShakeOrClickCallback(new WalletSuccPageAwardWidget.3(this));
              localObject = this.pAE;
              x.i("MicroMsg.WalletAwardShakeAnimView", "startShake");
              ((WalletAwardShakeAnimView)localObject).lAY = new com.tencent.mm.pluginsdk.i.c(((WalletAwardShakeAnimView)localObject).getContext());
              ((WalletAwardShakeAnimView)localObject).lAY.a(new WalletAwardShakeAnimView.2((WalletAwardShakeAnimView)localObject));
              ((WalletAwardShakeAnimView)localObject).hmb = bi.VG();
              ((WalletAwardShakeAnimView)localObject).setOnClickListener(new WalletAwardShakeAnimView.3((WalletAwardShakeAnimView)localObject));
              ah.M(((WalletAwardShakeAnimView)localObject).pzO);
              ah.i(((WalletAwardShakeAnimView)localObject).pzO, 3000L);
              break;
              localException1 = localException1;
              x.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", localException1, "parse animation_wording_color %s error %s", new Object[] { this.mAh.vHe.vGW, localException1.getMessage() });
            }
            catch (Exception localException2)
            {
              for (;;)
              {
                x.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", localException2, "parse after_animation_wording_color %s error %s", new Object[] { this.mAh.vHe.vGY, localException2.getMessage() });
              }
            }
          }
        case 2: 
          f localf = this.mAh.vHe.vGU;
          if (localf == null) {
            break;
          }
          x.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, jump tiny app, userName: %s, path: %s, version: %s", new Object[] { localf.sbY, localf.sbZ, Integer.valueOf(localf.sca) });
          qu localqu = new qu();
          localqu.cbq.userName = localf.sbY;
          localqu.cbq.cbs = bi.aG(localf.sbZ, "");
          localqu.cbq.scene = 1060;
          localqu.cbq.bGG = this.hTI;
          localqu.cbq.cbt = 0;
          if (localf.sca > 0) {
            localqu.cbq.cbu = localf.sca;
          }
          localqu.cbq.context = this.pAG;
          com.tencent.mm.sdk.b.a.sFg.m(localqu);
          this.pAH = true;
          break;
        case 3: 
          x.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, goto h5, url: %s", new Object[] { this.mAh.vHe.url });
          com.tencent.mm.wallet_core.ui.e.l(this.pAG, this.mAh.vHe.url, false);
          this.pAH = true;
          break;
        case 4: 
          x.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, directly show info");
          this.pAD.setVisibility(8);
          this.pAD.onDestroy();
        }
      }
      this.pAE.setVisibility(8);
      this.pAE.destroy();
      break;
      label1209:
      i = 1;
    }
  }
  
  private void bQT()
  {
    x.i("MicroMsg.WalletSuccPageAwardWidget", "showNetFailedView");
    RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)this.eHU.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams2 = (RelativeLayout.LayoutParams)this.fAK.getLayoutParams();
    localLayoutParams1.addRule(15, -1);
    localLayoutParams2.addRule(15, 0);
    this.eHU.setLayoutParams(localLayoutParams1);
    this.fAK.setLayoutParams(localLayoutParams2);
    this.eHU.setVisibility(0);
    this.fAK.setVisibility(8);
    this.eHU.setText(a.i.wallet_shake_award_net_failed);
    this.eHU.setTextColor(Color.parseColor("#353535"));
    this.fAK.setTextColor(Color.parseColor("#B2B2B2"));
    this.pAB.setVisibility(8);
    findViewById(a.f.order_info_tinyapp_splitter_1).setVisibility(0);
    findViewById(a.f.order_info_tinyapp_splitter_2).setVisibility(0);
    this.hlf.setVisibility(8);
    this.pwW.setVisibility(0);
    this.pwW.setImageResource(a.e.wallet_pay_shake_award_net_failed_logo);
    this.pAD.setVisibility(8);
    this.pAD.onDestroy();
    this.pAE.setVisibility(8);
    this.pAE.destroy();
  }
  
  private void bQU()
  {
    x.i("MicroMsg.WalletSuccPageAwardWidget", "initBaseLotteryView");
    Object localObject1 = this.mAh.rxS;
    int i;
    if (localObject1 != null)
    {
      i = ((List)localObject1).size();
      x.i("MicroMsg.WalletSuccPageAwardWidget", "singleExposureInfoList %s, size: %s", new Object[] { localObject1, Integer.valueOf(i) });
      if ((localObject1 != null) && (((List)localObject1).size() > 0))
      {
        this.pAF = ((d.a.a.g)((List)localObject1).get(0));
        x.i("MicroMsg.WalletSuccPageAwardWidget", "singleExposureInfo %s, award_name: %s, award_description: %s, logo: %s", new Object[] { Integer.valueOf(0), this.pAF.vHo, this.pAF.vHp, this.pAF.lRX });
        this.pwW.setUrl(this.pAF.lRX);
        if (!bi.oW(this.pAF.lRX)) {
          this.pwW.setVisibility(0);
        }
        if (bi.oW(this.pAF.vHo)) {
          break label1211;
        }
        this.eHU.setText(this.pAF.vHo);
        this.eHU.setVisibility(0);
      }
    }
    for (;;)
    {
      Object localObject2;
      try
      {
        if (!bi.oW(this.pAF.vHr)) {
          this.eHU.setTextColor(Color.parseColor(this.pAF.vHr));
        }
        i = 1;
        if (!bi.oW(this.pAF.vHp))
        {
          this.fAK.setText(this.pAF.vHp);
          this.fAK.setVisibility(0);
        }
      }
      catch (Exception localException1)
      {
        try
        {
          if (!bi.oW(this.pAF.vHs)) {
            this.fAK.setTextColor(Color.parseColor(this.pAF.vHs));
          }
          i = 1;
          if (i != 0)
          {
            localObject1 = (RelativeLayout.LayoutParams)this.eHU.getLayoutParams();
            localObject3 = (RelativeLayout.LayoutParams)this.fAK.getLayoutParams();
            if ((!bi.oW(this.pAF.vHo)) && (bi.oW(this.pAF.vHp)))
            {
              ((RelativeLayout.LayoutParams)localObject1).addRule(15, -1);
              ((RelativeLayout.LayoutParams)localObject3).addRule(15, 0);
              this.eHU.setLayoutParams((ViewGroup.LayoutParams)localObject1);
              this.fAK.setLayoutParams((ViewGroup.LayoutParams)localObject3);
              this.eHU.setVisibility(0);
              this.fAK.setVisibility(8);
            }
          }
          else
          {
            if (bi.oW(this.pAF.vHq)) {
              continue;
            }
            x.i("MicroMsg.WalletSuccPageAwardWidget", "background_img: %s", new Object[] { this.pAF.vHq });
            localObject1 = new c.a();
            ((c.a)localObject1).dXy = true;
            ((c.a)localObject1).dXx = true;
            ((c.a)localObject1).dXA = Pz(this.pAF.vHq);
            localObject1 = ((c.a)localObject1).Pt();
            o.Pj().a(this.pAF.vHq, null, (com.tencent.mm.ak.a.a.c)localObject1, new WalletSuccPageAwardWidget.4(this));
            i = this.mAh.rxT;
            localObject3 = this.mAh.rxU;
            if (this.mAh.rxU == null) {
              continue;
            }
            localObject1 = this.mAh.rxU.vGR;
            x.i("MicroMsg.WalletSuccPageAwardWidget", "is_show_btn: %s, btn_info: %s, btn_words: %s", new Object[] { Integer.valueOf(i), localObject3, localObject1 });
            if ((this.mAh.rxT != 0) && (this.mAh.rxU != null) && (!bi.oW(this.mAh.rxU.vGR))) {
              continue;
            }
            this.hlf.setVisibility(8);
            if (this.eHU.getVisibility() == 0)
            {
              this.eHU.setSingleLine();
              this.eHU.post(new WalletSuccPageAwardWidget.6(this));
            }
            if (this.hlf.getVisibility() != 0) {
              this.eHU.setEllipsize(TextUtils.TruncateAt.END);
            }
            if (this.mAh.vHb != 0) {
              x.i("MicroMsg.WalletSuccPageAwardWidget", "exposureInfo.is_show_layer is true: %s, direct show layer", new Object[] { Integer.valueOf(this.mAh.vHb) });
            }
            if (!bi.oW(this.mAh.vHd))
            {
              x.i("MicroMsg.WalletSuccPageAwardWidget", "background_img_whole: %s", new Object[] { this.mAh.vHd });
              if (this.pAC != null)
              {
                this.pAC.setVisibility(0);
                localObject1 = new c.a();
                ((c.a)localObject1).dXy = true;
                ((c.a)localObject1).dXx = true;
                ((c.a)localObject1).dXA = Pz(this.mAh.vHd);
                localObject1 = ((c.a)localObject1).Pt();
                o.Pj().a(this.mAh.vHd, null, (com.tencent.mm.ak.a.a.c)localObject1, new WalletSuccPageAwardWidget.7(this));
              }
            }
            return;
            i = 0;
            break;
            localException1 = localException1;
            x.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", localException1, "parse award_name_color error: %s", new Object[] { localException1.getMessage() });
          }
        }
        catch (Exception localException2)
        {
          Object localObject3;
          x.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", localException2, "parse award_description_color error: %s", new Object[] { localException2.getMessage() });
          continue;
          if ((bi.oW(this.pAF.vHo)) && (!bi.oW(this.pAF.vHp)))
          {
            localException2.addRule(15, 0);
            ((RelativeLayout.LayoutParams)localObject3).addRule(15, -1);
            this.eHU.setLayoutParams(localException2);
            this.fAK.setLayoutParams((ViewGroup.LayoutParams)localObject3);
            this.eHU.setVisibility(8);
            this.fAK.setVisibility(0);
            continue;
          }
          localException2.addRule(15, 0);
          ((RelativeLayout.LayoutParams)localObject3).addRule(15, 0);
          this.eHU.setLayoutParams(localException2);
          this.fAK.setLayoutParams((ViewGroup.LayoutParams)localObject3);
          this.eHU.setVisibility(0);
          this.fAK.setVisibility(0);
          continue;
          this.pAB.setVisibility(8);
          findViewById(a.f.order_info_tinyapp_splitter_1).setVisibility(0);
          findViewById(a.f.order_info_tinyapp_splitter_2).setVisibility(0);
          continue;
          localObject2 = "";
          continue;
          localObject2 = this.mAh.rxU;
          if (localObject2 == null) {
            continue;
          }
          x.i("MicroMsg.WalletSuccPageAwardWidget", "btn_words: %s, type: %s, color: %s, url: %s", new Object[] { ((d.a.a.a)localObject2).vGR, Integer.valueOf(((d.a.a.a)localObject2).vGT), ((d.a.a.a)localObject2).vGS, ((d.a.a.a)localObject2).url });
          this.hlf.setText(((d.a.a.a)localObject2).vGR);
          if (!bi.oW(((d.a.a.a)localObject2).vGS))
          {
            localObject3 = getContext().getResources().getDrawable(a.e.btn_solid_green);
            ((Drawable)localObject3).setColorFilter(Color.parseColor(((d.a.a.a)localObject2).vGS), PorterDuff.Mode.SRC);
            this.hlf.setBackground((Drawable)localObject3);
          }
          this.hlf.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              int i = 2;
              if ((WalletSuccPageAwardWidget.i(WalletSuccPageAwardWidget.this) != null) && (WalletSuccPageAwardWidget.i(WalletSuccPageAwardWidget.this).rxU != null))
              {
                WalletSuccPageAwardWidget.a(WalletSuccPageAwardWidget.this, WalletSuccPageAwardWidget.i(WalletSuccPageAwardWidget.this).rxU);
                x.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, type: %s", new Object[] { Integer.valueOf(WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).vGT) });
                if (WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).vGT != 1) {
                  break label201;
                }
                x.i("MicroMsg.WalletSuccPageAwardWidget", "click btn_info, type: %s, url: %s", new Object[] { Integer.valueOf(WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).vGT), WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).url });
                com.tencent.mm.wallet_core.ui.e.l(WalletSuccPageAwardWidget.k(WalletSuccPageAwardWidget.this), WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).url, false);
                WalletSuccPageAwardWidget.l(WalletSuccPageAwardWidget.this);
                WalletSuccPageAwardWidget.m(WalletSuccPageAwardWidget.this);
                paramAnonymousView = h.mEJ;
                if (!WalletSuccPageAwardWidget.e(WalletSuccPageAwardWidget.this)) {
                  break label635;
                }
              }
              for (;;)
              {
                paramAnonymousView.h(15225, new Object[] { Integer.valueOf(2), Integer.valueOf(i) });
                return;
                label201:
                if (WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).vGT == 2)
                {
                  paramAnonymousView = WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).vGU;
                  if (paramAnonymousView != null)
                  {
                    x.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, jump tiny app, userName: %s, path: %s, version: %s", new Object[] { paramAnonymousView.sbY, paramAnonymousView.sbZ, Integer.valueOf(paramAnonymousView.sca) });
                    qu localqu = new qu();
                    localqu.cbq.userName = paramAnonymousView.sbY;
                    localqu.cbq.cbs = bi.aG(paramAnonymousView.sbZ, "");
                    localqu.cbq.scene = 1060;
                    localqu.cbq.bGG = WalletSuccPageAwardWidget.n(WalletSuccPageAwardWidget.this);
                    localqu.cbq.cbt = 0;
                    if (paramAnonymousView.sca > 0) {
                      localqu.cbq.cbu = paramAnonymousView.sca;
                    }
                    localqu.cbq.context = WalletSuccPageAwardWidget.k(WalletSuccPageAwardWidget.this);
                    com.tencent.mm.sdk.b.a.sFg.m(localqu);
                    WalletSuccPageAwardWidget.l(WalletSuccPageAwardWidget.this);
                  }
                  WalletSuccPageAwardWidget.m(WalletSuccPageAwardWidget.this);
                  break;
                }
                if (WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).vGT == 3)
                {
                  x.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, do get lottery");
                  WalletSuccPageAwardWidget.o(WalletSuccPageAwardWidget.this);
                  WalletSuccPageAwardWidget.m(WalletSuccPageAwardWidget.this);
                  break;
                }
                if (WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).vGT == 5)
                {
                  x.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, do nothing");
                  break;
                }
                if (WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).vGT == 6)
                {
                  x.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, show layer");
                  WalletSuccPageAwardWidget.m(WalletSuccPageAwardWidget.this);
                  break;
                }
                if (WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).vGT == 7)
                {
                  x.i("MicroMsg.WalletSuccPageAwardWidget", "click btn, draw lottery");
                  WalletSuccPageAwardWidget.a(WalletSuccPageAwardWidget.this, 3, true);
                  WalletSuccPageAwardWidget.m(WalletSuccPageAwardWidget.this);
                  break;
                }
                if (WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).vGT == 8)
                {
                  WalletSuccPageAwardWidget.o(WalletSuccPageAwardWidget.this);
                  x.i("MicroMsg.WalletSuccPageAwardWidget", "click btn_info, type: %s, url: %s", new Object[] { Integer.valueOf(WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).vGT), WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).url });
                  WalletSuccPageAwardWidget.m(WalletSuccPageAwardWidget.this);
                  break;
                }
                if (WalletSuccPageAwardWidget.j(WalletSuccPageAwardWidget.this).vGT != 9) {
                  break;
                }
                WalletSuccPageAwardWidget.o(WalletSuccPageAwardWidget.this);
                WalletSuccPageAwardWidget.m(WalletSuccPageAwardWidget.this);
                break;
                label635:
                i = 1;
              }
            }
          });
          this.hlf.setVisibility(0);
          if ((!this.mLL) && (!this.pAH)) {
            continue;
          }
          localObject2 = h.mEJ;
          if (!this.pAH) {}
        }
      }
      for (i = 2;; i = 1)
      {
        ((h)localObject2).h(15225, new Object[] { Integer.valueOf(1), Integer.valueOf(i) });
        break;
      }
      label1211:
      i = 0;
    }
  }
  
  private void init(Context paramContext)
  {
    y.gq(paramContext).inflate(a.g.wallet_succ_page_award_widget, this, true);
    this.pAx = ((ViewGroup)findViewById(a.f.content_layout));
    this.pwW = ((CdnImageView)findViewById(a.f.logo_iv));
    this.eHU = ((TextView)findViewById(a.f.name_tv));
    this.fAK = ((TextView)findViewById(a.f.desc_tv));
    this.hlf = ((Button)findViewById(a.f.button));
    this.pAD = ((WalletScratchShakeView)findViewById(a.f.scratch_shake_view));
    this.pAB = ((ImageView)findViewById(a.f.background));
    this.pAE = ((WalletAwardShakeAnimView)findViewById(a.f.shake_view));
    this.pwW.setRoundCorner(true);
    this.pwW.setUseSdcardCache(true);
  }
  
  public final void a(WalletBaseUI paramWalletBaseUI, d.a.a.c paramc, String paramString, boolean paramBoolean, ImageView paramImageView)
  {
    boolean bool2 = true;
    String str = b(paramc);
    boolean bool1;
    if ((paramc == null) || (paramc.vHc == null))
    {
      bool1 = true;
      if (paramImageView != null) {
        break label117;
      }
    }
    for (;;)
    {
      x.i("MicroMsg.WalletSuccPageAwardWidget", "setWidgetData, exposureInfo: %s, layerInfo==null: %s, hostUIBackgroundView==null:%s, isClickH5OrTinyApp: %s, isF2F: %s", new Object[] { str, Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(this.pAH), Boolean.valueOf(paramBoolean) });
      this.pAG = paramWalletBaseUI;
      this.mAh = paramc;
      this.pjf = paramBoolean;
      this.hTI = paramString;
      this.pAC = paramImageView;
      bQS();
      return;
      bool1 = false;
      break;
      label117:
      bool2 = false;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    int i = 0;
    boolean bool = false;
    x.i("MicroMsg.WalletSuccPageAwardWidget", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paraml });
    if ((paraml instanceof i))
    {
      paramString = (i)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = paramString.pjk;
        if (paramString == null)
        {
          x.e("MicroMsg.WalletSuccPageAwardWidget", "getLottery end, response is null!!");
          bool = true;
        }
      }
    }
    label346:
    label358:
    Object localObject1;
    Object localObject2;
    label828:
    label833:
    do
    {
      return bool;
      x.i("MicroMsg.WalletSuccPageAwardWidget", "getLottery ret_code: %s, ret_msg: %s, alert_wording: %s, exposure_info: %s", new Object[] { Integer.valueOf(paramString.hwV), paramString.hwW, paramString.rFx, paramString.pqb });
      if (paramString.hwV == 0)
      {
        if (!bi.oW(paramString.rFx))
        {
          Toast.makeText(getContext(), paramString.rFx, 1).show();
          return true;
        }
        if (paramString.pqb != null)
        {
          if (this.mAh.rxU != null)
          {
            paramInt1 = this.mAh.rxU.vGT;
            this.mAh = paramString.pqb;
            if ((paramString.pqb.rxU != null) && (this.mAh.rxU != null))
            {
              x.i("MicroMsg.WalletSuccPageAwardWidget", "getLottery end, btn_op_type: %s", new Object[] { Integer.valueOf(paramString.pqb.rxU.vGT) });
              if (paramString.pqb.rxU.vGT == 4)
              {
                x.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                this.mAh.rxU.vGT = paramInt1;
              }
            }
            x.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo");
            bQS();
          }
        }
        else
        {
          if ((this.pAK != null) && (this.pAJ))
          {
            if (this.pAK.vGT != 8) {
              break label358;
            }
            x.i("MicroMsg.WalletSuccPageAwardWidget", "on getLotteryEnd, btn_op_type==GET_LOTTERY_AND_JUMP_URL, goto h5");
            com.tencent.mm.wallet_core.ui.e.l(this.pAG, this.pAK.url, false);
            this.pAH = true;
          }
          this.pAK = null;
        }
      }
      for (;;)
      {
        return true;
        paramInt1 = 0;
        break;
        if (this.pAK.vGT != 9) {
          break label346;
        }
        paramString = this.pAK.vGU;
        if (paramString == null) {
          break label346;
        }
        x.i("MicroMsg.WalletSuccPageAwardWidget", "on getLotteryEnd, btn_op_type==GET_LOTTERY_AND_JUMP_MINI_APP, jump tiny app, userName: %s, path: %s, version: %s", new Object[] { paramString.sbY, paramString.sbZ, Integer.valueOf(paramString.sca) });
        paraml = new qu();
        paraml.cbq.userName = paramString.sbY;
        paraml.cbq.cbs = bi.aG(paramString.sbZ, "");
        paraml.cbq.scene = 1060;
        paraml.cbq.bGG = this.hTI;
        paraml.cbq.cbt = 0;
        if (paramString.sca > 0) {
          paraml.cbq.cbu = paramString.sca;
        }
        paraml.cbq.context = this.pAG;
        com.tencent.mm.sdk.b.a.sFg.m(paraml);
        this.pAH = true;
        break label346;
        x.i("MicroMsg.WalletSuccPageAwardWidget", "getLotteryFailed");
        bQT();
      }
      if ((paraml instanceof j))
      {
        paramString = (j)paraml;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = paramString.pjm;
          if (paramString == null)
          {
            x.e("MicroMsg.WalletSuccPageAwardWidget", "modifyExposure end, response is null!!");
            return true;
          }
          paramInt2 = paramString.hwV;
          paraml = paramString.hwW;
          localObject1 = paramString.rxS;
          i = paramString.rxT;
          localObject2 = paramString.rxU;
          if (paramString.rxU == null) {
            break label828;
          }
          paramInt1 = paramString.rxU.vGT;
          x.i("MicroMsg.WalletSuccPageAwardWidget", "modifyExposure, ret_code: %s, ret_msg: %s, single_exposure_info_list: %s, is_show_btn: %s, btn_info: %s, btn_op_type: %s", new Object[] { Integer.valueOf(paramInt2), paraml, localObject1, Integer.valueOf(i), localObject2, Integer.valueOf(paramInt1) });
          if (paramString.hwV == 0)
          {
            this.mAh.rxS = paramString.rxS;
            this.mAh.rxT = paramString.rxT;
            if (this.mAh.rxU == null) {
              break label833;
            }
          }
        }
        for (paramInt1 = this.mAh.rxU.vGT;; paramInt1 = 0)
        {
          if (paramString.rxU != null)
          {
            this.mAh.rxU = paramString.rxU;
            if ((this.mAh.rxU != null) && (paramString.rxU.vGT == 4))
            {
              x.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
              this.mAh.rxU.vGT = paramInt1;
            }
          }
          x.i("MicroMsg.WalletSuccPageAwardWidget", "after modify, exposureInfo: %s", new Object[] { b(this.mAh) });
          bQU();
          this.pAH = false;
          return true;
          paramInt1 = 0;
          break;
        }
      }
    } while (!(paraml instanceof com.tencent.mm.plugin.wallet_core.c.g));
    paramString = (com.tencent.mm.plugin.wallet_core.c.g)paraml;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paraml = paramString.pje;
      if (paraml == null)
      {
        x.e("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, response is null!!");
        return true;
      }
      paramInt1 = paraml.hwV;
      localObject1 = paraml.hwW;
      localObject2 = paraml.pqb;
      if (paraml.pqb != null)
      {
        paramString = paraml.pqb.rxS;
        x.i("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, retcode: %s, retmsg: %s, exposure_info: %s, single_exposure_info_list: %s", new Object[] { Integer.valueOf(paramInt1), localObject1, localObject2, paramString });
        if ((paraml.pqb == null) || (paraml.pqb.rxS == null) || (paraml.pqb.rxS.size() <= 0)) {
          break label1157;
        }
        paramString = paraml.pqb;
        localObject1 = paraml.pqb.rxU;
        if (paraml.pqb.rxU == null) {
          break label1152;
        }
        paramInt1 = paraml.pqb.rxU.vGT;
        label1023:
        x.i("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, exposureInfo: %s, btninfo: %s, btn_op_type: %s", new Object[] { paramString, localObject1, Integer.valueOf(paramInt1) });
        paramInt1 = i;
        if (this.mAh.rxU != null) {
          paramInt1 = this.mAh.rxU.vGT;
        }
        this.mAh = paraml.pqb;
        if ((this.mAh.rxU != null) && (paraml.pqb.rxU != null) && (paraml.pqb.rxU.vGT == 4))
        {
          x.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
          this.mAh.rxU.vGT = paramInt1;
        }
        bQS();
      }
    }
    for (;;)
    {
      return true;
      paramString = "";
      break;
      label1152:
      paramInt1 = 0;
      break label1023;
      label1157:
      bQT();
      continue;
      bQT();
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool3 = false;
    if ((this.pAD != null) && (this.pAD.getVisibility() == 0))
    {
      boolean bool2 = bool3;
      WalletScratchShakeView localWalletScratchShakeView;
      if (this.pAD != null)
      {
        localWalletScratchShakeView = this.pAD;
        if (localWalletScratchShakeView.pzZ == null) {
          break label117;
        }
        bool1 = localWalletScratchShakeView.pzZ.F(paramMotionEvent);
        if (bool1) {}
        localWalletScratchShakeView = this.pAD;
        if (localWalletScratchShakeView.pzZ == null) {
          break label122;
        }
      }
      label117:
      label122:
      for (boolean bool1 = localWalletScratchShakeView.pzZ.pAt;; bool1 = true)
      {
        bool2 = bool3;
        if (!bool1) {
          bool2 = this.pAD.dispatchTouchEvent(paramMotionEvent);
        }
        if ((this.pAx == null) || (bool2)) {
          break label127;
        }
        return this.pAx.dispatchTouchEvent(paramMotionEvent);
        bool1 = false;
        break;
      }
    }
    label127:
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public final void init()
  {
    if (this.pAG != null)
    {
      x.i("MicroMsg.WalletSuccPageAwardWidget", "init");
      this.pAG.jr(1859);
      this.pAG.jr(2547);
      this.pAG.jr(2803);
      this.pAG.jr(2508);
      this.pAG.jr(2529);
      this.pAG.jr(2888);
    }
  }
  
  public final void onDestroy()
  {
    int i = 2;
    Object localObject;
    if (this.pAG != null)
    {
      this.pAG.js(1859);
      this.pAG.js(2547);
      this.pAG.js(2803);
      this.pAG.js(2508);
      this.pAG.js(2529);
      this.pAG.js(2888);
      x.i("MicroMsg.WalletSuccPageAwardWidget", "onDestroy, isShakeOrScratch: %s, isClickAwardButton: %s", new Object[] { Boolean.valueOf(this.pAI), Boolean.valueOf(this.pAJ) });
      if ((!this.pAI) && (!this.pAJ))
      {
        localObject = h.mEJ;
        if (!this.pAH) {
          break label219;
        }
      }
    }
    for (;;)
    {
      ((h)localObject).h(15225, new Object[] { Integer.valueOf(6), Integer.valueOf(i) });
      x.i("MicroMsg.WalletSuccPageAwardWidget", "user do nothing and quit ui, call drawlottery");
      localObject = new com.tencent.mm.plugin.wallet_core.c.g(this.mAh.rvZ, 4, this.pjf);
      this.pAG.a((l)localObject, false, false);
      if (this.pAD != null) {
        this.pAD.onDestroy();
      }
      if (this.pAE != null) {
        this.pAE.destroy();
      }
      return;
      label219:
      i = 1;
    }
  }
  
  public final void onResume()
  {
    x.i("MicroMsg.WalletSuccPageAwardWidget", "onResume, isClickH5OrTinyApp: %s, exposureInfo: %s", new Object[] { Boolean.valueOf(this.pAH), b(this.mAh) });
    if ((this.mAh.vHe != null) && (this.mAh.vHe.srY != 1))
    {
      this.pAD.setVisibility(8);
      this.pAD.onDestroy();
      this.pAE.setVisibility(8);
      this.pAE.destroy();
    }
    x.i("MicroMsg.WalletSuccPageAwardWidget", "tryDoModifyExposure, isClickH5OrTinyApp: %s", new Object[] { Boolean.valueOf(this.pAH) });
    if (this.pAH)
    {
      j localj = new j(this.mAh.rxR, this.pjf);
      this.pAG.a(localj, false, false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */