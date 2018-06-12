package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.ac.d.b.d;
import com.tencent.mm.ac.d.b.e;
import com.tencent.mm.ac.d.b.f;
import com.tencent.mm.ac.d.b.g;
import com.tencent.mm.ac.m.a;
import com.tencent.mm.ac.m.a.a;
import com.tencent.mm.ac.n;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.a.cv;
import com.tencent.mm.g.a.cv.b;
import com.tencent.mm.g.a.cz;
import com.tencent.mm.g.a.cz.b;
import com.tencent.mm.g.a.ng;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.c;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd.a;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.atx;
import com.tencent.mm.protocal.c.bej;
import com.tencent.mm.protocal.c.bls;
import com.tencent.mm.protocal.c.blt;
import com.tencent.mm.protocal.c.brs;
import com.tencent.mm.protocal.c.brt;
import com.tencent.mm.protocal.c.cgc;
import com.tencent.mm.protocal.c.hz;
import com.tencent.mm.protocal.c.qt;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class c
  implements com.tencent.mm.ab.e, com.tencent.mm.ac.h.a, n, com.tencent.mm.pluginsdk.b.a
{
  MMActivity bGc;
  private List<d.a> dKO;
  private d.b dKP;
  private boolean dKW = false;
  private String dKY;
  private SharedPreferences duR = null;
  private int eLK;
  com.tencent.mm.ui.base.preference.f eOE;
  ab guS;
  private boolean hEj;
  private CheckBoxPreference hLs;
  boolean isDeleteCancel = false;
  String juZ;
  private boolean lUD;
  private String lUI;
  com.tencent.mm.ac.d lUs;
  private com.tencent.mm.ac.a.j lVG;
  private List<WxaAttributes.WxaEntryInfo> lVH;
  private qt lVI = null;
  private boolean lVJ = false;
  private boolean lVK = false;
  boolean lVL = false;
  private int lVM = 0;
  private String lVN;
  private boolean lVO;
  com.tencent.mm.ui.widget.a.c lVP = null;
  private Bundle lVQ;
  SnsAdClick lVR = null;
  private String lVS = null;
  com.tencent.mm.ui.base.p tipDialog = null;
  
  private c(MMActivity paramMMActivity)
  {
    this.bGc = paramMMActivity;
  }
  
  public c(MMActivity paramMMActivity, String paramString, qt paramqt)
  {
    this(paramMMActivity);
    this.lUI = paramString;
  }
  
  private static boolean JE(String paramString)
  {
    boolean bool2 = false;
    try
    {
      long l1 = bi.getLong(paramString, 0L);
      boolean bool1 = bool2;
      if (l1 > 0L)
      {
        long l2 = System.currentTimeMillis() / 1000L;
        bool1 = bool2;
        if (l1 - l2 < 0L) {
          bool1 = true;
        }
      }
      return bool1;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  private void JF(final String paramString)
  {
    ah.i(new Runnable()
    {
      public final void run()
      {
        if (c.this.eOE == null) {
          x.w("MicroMsg.ContactWidgetBizInfo", "LazyGetAvatar screen is null");
        }
        IconWidgetPreference localIconWidgetPreference;
        Bitmap localBitmap;
        do
        {
          do
          {
            return;
            localIconWidgetPreference = (IconWidgetPreference)c.this.eOE.ZZ("contact_info_kf_worker");
          } while ((localIconWidgetPreference == null) || (c.this.eOE == null));
          localBitmap = com.tencent.mm.aa.c.a(paramString, false, -1);
        } while (localBitmap == null);
        x.d("MicroMsg.ContactWidgetBizInfo", "LazyGetAvatar success %s, update screen", new Object[] { paramString });
        localIconWidgetPreference.C(localBitmap);
        c.this.eOE.notifyDataSetChanged();
      }
    }, 2000L);
  }
  
  private void bnp()
  {
    auw();
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(R.o.contact_info_pref_bizinfo);
    if (this.lVL) {
      this.eOE.bw("contact_info_time_expired", true);
    }
    com.tencent.mm.ac.d locald = com.tencent.mm.ac.f.kH(this.guS.field_username);
    this.dKO = null;
    this.dKP = null;
    this.lVH = null;
    if (((locald == null) || (locald.bG(false) == null)) && (this.lVI != null))
    {
      locald = new com.tencent.mm.ac.d();
      locald.field_username = this.guS.field_username;
      locald.field_brandFlag = this.lVI.eJV;
      locald.field_brandIconURL = this.lVI.eJY;
      locald.field_brandInfo = this.lVI.eJX;
      locald.field_extInfo = this.lVI.eJW;
    }
    for (;;)
    {
      if ((locald != null) && (locald.field_brandInfo == null) && (locald.field_extInfo == null) && (this.lVI != null))
      {
        locald.field_username = this.guS.field_username;
        locald.field_brandFlag = this.lVI.eJV;
        locald.field_brandIconURL = this.lVI.eJY;
        locald.field_brandInfo = this.lVI.eJX;
        locald.field_extInfo = this.lVI.eJW;
      }
      Object localObject1 = (BizInfoHeaderPreference)this.eOE.ZZ("contact_info_header_bizinfo");
      Object localObject2;
      boolean bool;
      if ((localObject1 != null) && (!bi.oW(this.guS.field_username)))
      {
        localObject2 = this.guS;
        ((BizInfoHeaderPreference)localObject1).lUr = this.lUI;
        ((BizInfoHeaderPreference)localObject1).lUs = locald;
        ((BizInfoHeaderPreference)localObject1).onDetach();
        au.HU();
        com.tencent.mm.model.c.FR().a((m.b)localObject1);
        com.tencent.mm.aa.q.Kp().d((f.c)localObject1);
        z.Ni().a((m.a.a)localObject1);
        ((BizInfoHeaderPreference)localObject1).guS = ((ab)localObject2);
        if (bi.oV(((com.tencent.mm.g.c.ai)localObject2).field_username).length() > 0)
        {
          bool = true;
          Assert.assertTrue("initView: contact username is null", bool);
          ((BizInfoHeaderPreference)localObject1).initView();
          label378:
          this.eOE.bw("biz_placed_to_the_top", true);
          this.eOE.bw("contact_info_biz_enable", true);
          this.eOE.bw("contact_info_biz_disable", true);
          this.eOE.bw("contact_info_stick_biz", true);
          if (locald == null) {
            break label2342;
          }
          if (!locald.LZ()) {
            break label1982;
          }
          this.eOE.bw("contact_info_biz_add", true);
          this.eOE.bw("contact_info_expose_btn", true);
          this.eOE.bw("contact_is_mute", false);
          this.hEj = this.guS.BD();
          if (!locald.Ma()) {
            break label1735;
          }
          this.eOE.bw("contact_info_biz_go_chatting", true);
          localObject1 = this.eOE;
          if (com.tencent.mm.l.a.gd(this.guS.field_type)) {
            break label1729;
          }
          bool = true;
          label536:
          ((com.tencent.mm.ui.base.preference.f)localObject1).bw("contact_info_stick_biz", bool);
          localObject1 = (CheckBoxPreference)this.eOE.ZZ("contact_info_stick_biz");
          ((CheckBoxPreference)localObject1).qpJ = this.guS.BG();
          ((CheckBoxPreference)localObject1).setTitle(R.l.enterprise_chat_placetop);
          bnu();
          label589:
          ha(this.hEj);
          this.lUs = locald;
          this.dKO = locald.Mh();
          this.dKP = locald.bG(false);
          this.lVH = this.dKP.getWxaEntryInfoList();
          if (!this.dKP.Mi()) {
            break label2280;
          }
          this.eOE.ZZ("near_field_service").setSummary(R.l.weixin_connect_wifi);
          label661:
          if (this.dKP.Mo() == null) {
            break label2311;
          }
          this.lVK = true;
          if (!JE(this.dKP.Mo())) {
            break label2296;
          }
          this.lVJ = true;
          if (com.tencent.mm.l.a.gd(this.guS.field_type)) {
            break label2296;
          }
          x.w("MicroMsg.ContactWidgetBizInfo", "expireTime not null, and %s is not my contact", new Object[] { this.guS.field_username });
          bnq();
          label734:
          if ((s.hM(this.guS.field_username)) || (s.hW(this.guS.field_username))) {
            bnq();
          }
          label764:
          if ((this.dKP.Ml() != null) && (this.dKP.Ml().length() > 0)) {
            this.dKY = this.dKP.Ml();
          }
          this.dKW = this.dKP.Mj();
          if (bi.oW(this.dKP.Mz())) {
            break label2326;
          }
          this.eOE.bw("contact_info_service_phone", false);
          localObject1 = this.eOE.ZZ("contact_info_service_phone");
          if (localObject1 != null)
          {
            ((Preference)localObject1).setSummary(this.dKP.Mz());
            ((Preference)localObject1).hIZ = this.bGc.getResources().getColor(R.e.link_color);
          }
        }
      }
      Object localObject4;
      Object localObject6;
      int i;
      for (;;)
      {
        label1107:
        label1114:
        label1141:
        label1164:
        label1172:
        Object localObject7;
        if (!bi.oW(this.guS.signature))
        {
          localObject2 = (KeyValuePreference)this.eOE.ZZ("contact_info_user_desc");
          if (localObject2 != null)
          {
            if (bi.oV(this.guS.signature).trim().length() <= 0) {
              this.eOE.bw("contact_info_user_desc", true);
            }
          }
          else
          {
            if ((this.dKP == null) || (this.dKP.Mt() == null) || (bi.oW(this.dKP.Mt().dLJ))) {
              break label2710;
            }
            localObject4 = this.dKP.Mt();
            localObject6 = (KeyValuePreference)this.eOE.ZZ("contact_info_verifyuser");
            if (localObject6 == null) {
              break label2694;
            }
            ((KeyValuePreference)localObject6).csl();
            ((KeyValuePreference)localObject6).tCA = false;
            if (!bi.oW(((d.b.d)localObject4).dLK)) {
              break label2623;
            }
            i = ((d.b.d)localObject4).dLI;
            switch (i)
            {
            default: 
              x.w("MicroMsg.ContactWidgetBizInfo", "getVerifyStr, error type %d", new Object[] { Integer.valueOf(i) });
              localObject1 = this.bGc.getResources().getString(R.l.contact_info_isnot_verify_user_title);
              ((KeyValuePreference)localObject6).tmc = ((String)localObject1);
              if (am.a.dBt != null)
              {
                localObject1 = BackwardSupportUtil.b.e(am.a.dBt.gX(this.guS.field_verifyFlag), 2.0F);
                if (localObject1 == null) {
                  break label5881;
                }
                localObject2 = new BitmapDrawable(this.bGc.getResources(), (Bitmap)localObject1);
                if (localObject1 != null) {
                  break label2642;
                }
                bool = true;
                x.i("MicroMsg.ContactWidgetBizInfo", "verify bmp is null ? %B", new Object[] { Boolean.valueOf(bool) });
                ((KeyValuePreference)localObject6).tCI = ((Drawable)localObject2);
                if (((d.b.d)localObject4).dLJ == null) {
                  break label2682;
                }
                localObject7 = ((d.b.d)localObject4).dLM;
                localObject2 = com.tencent.mm.pluginsdk.ui.d.j.a(this.bGc, ((d.b.d)localObject4).dLJ.trim());
                if (bi.oW((String)localObject7)) {
                  break label5874;
                }
              }
              break;
            }
          }
        }
        for (;;)
        {
          try
          {
            localObject1 = new SpannableString((String)localObject7 + " " + localObject2);
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException2)
          {
            label1298:
            label1305:
            label1372:
            label1380:
            localObject1 = localObject2;
            localObject2 = localIndexOutOfBoundsException2;
          }
          try
          {
            ((SpannableString)localObject1).setSpan(new ForegroundColorSpan(-36352), 0, ((String)localObject7).length(), 17);
            ((KeyValuePreference)localObject6).setSummary((CharSequence)localObject1);
            if ((this.dKP == null) || (bi.oW(this.dKP.Mn()))) {
              break label2820;
            }
            localObject2 = (KeyValuePreference)this.eOE.ZZ("contact_info_trademark");
            if (localObject2 == null) {
              continue;
            }
            ((KeyValuePreference)localObject2).csl();
            ((KeyValuePreference)localObject2).tCA = false;
            if (am.a.dBt == null) {
              break label2808;
            }
            localObject1 = com.tencent.mm.sdk.platformtools.c.CV(R.k.biz_info_trademark_protection);
            if (localObject1 != null) {
              break label2814;
            }
            bool = true;
            x.i("MicroMsg.ContactWidgetBizInfo", "trademark bmp is null ? %B", new Object[] { Boolean.valueOf(bool) });
            if (localObject1 == null) {
              break label5868;
            }
            localObject1 = new BitmapDrawable(this.bGc.getResources(), (Bitmap)localObject1);
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException1)
          {
            for (;;)
            {
              continue;
              continue;
              j = k;
            }
            localObject1 = null;
          }
        }
        ((KeyValuePreference)localObject2).tCI = ((Drawable)localObject1);
        ((KeyValuePreference)localObject2).setSummary(this.dKP.Mn());
        x.d("MicroMsg.ContactWidgetBizInfo", "trademark name : %s, url : %s.", new Object[] { this.dKP.Mn(), this.dKP.Mm() });
        label1476:
        if ((this.dKP == null) || (this.dKP.Mp() == null) || (this.dKP.Mp().size() <= 0)) {
          break label2845;
        }
        localObject2 = (KeyValuePreference)this.eOE.ZZ("contact_info_privilege");
        ((KeyValuePreference)localObject2).csl();
        ((KeyValuePreference)localObject2).lO(false);
        ((KeyValuePreference)localObject2).csk();
        localObject4 = this.dKP.Mp().iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject7 = (d.b.f)((Iterator)localObject4).next();
          localObject6 = (LinearLayout)View.inflate(this.bGc, R.i.keyvalue_pref_item, null);
          ((ImageView)((LinearLayout)localObject6).findViewById(R.h.image_iv)).setImageDrawable(new com.tencent.mm.plugin.profile.ui.b.a(this.bGc.getResources(), ((d.b.f)localObject7).iconUrl));
          localObject1 = ((d.b.f)localObject7).description;
          i = this.bGc.getResources().getIdentifier(((d.b.f)localObject7).dLR, "string", this.bGc.getPackageName());
          if (i > 0) {
            localObject1 = this.bGc.getString(i);
          }
          ((TextView)((LinearLayout)localObject6).findViewById(R.h.summary)).setText((CharSequence)localObject1);
          ((KeyValuePreference)localObject2).dp((View)localObject6);
        }
        bool = false;
        break;
        x.w("MicroMsg.ContactWidgetBizInfo", "head pref is null");
        this.eOE.bw("contact_info_header_bizinfo", true);
        break label378;
        label1729:
        bool = false;
        break label536;
        label1735:
        this.eOE.bw("contact_info_subscribe_bizinfo", true);
        this.eOE.bw("contact_info_biz_go_chatting", true);
        if (locald.LQ())
        {
          this.eOE.bw("contact_info_biz_enable", true);
          this.eOE.bw("contact_info_biz_disable", false);
          this.eOE.ZZ("contact_info_biz_disable").setTitle(R.l.enterprise_contact_info_disable_sub);
          this.eOE.bw("contact_is_mute", false);
          this.eOE.bw("biz_placed_to_the_top", false);
          this.hLs = ((CheckBoxPreference)this.eOE.ZZ("biz_placed_to_the_top"));
          this.hLs.setTitle(R.l.enterprise_sub_placetop);
          bnu();
          if (!locald.Mb()) {
            break label589;
          }
          this.eOE.bw("contact_info_locate", true);
          break label589;
        }
        this.eOE.bw("contact_info_biz_enable", false);
        this.eOE.bw("contact_info_biz_disable", true);
        this.eOE.ZZ("contact_info_biz_enable").setTitle(R.l.enterprise_contact_info_enable_sub);
        this.eOE.bw("contact_is_mute", true);
        this.eOE.bw("biz_placed_to_the_top", true);
        this.eOE.bw("contact_info_locate", true);
        break label589;
        label1982:
        if (locald.LY())
        {
          this.eOE.bw("contact_info_locate", true);
          this.eOE.bw("contact_info_subscribe_bizinfo", false);
          this.eOE.bw("enterprise_contact_info_enter", false);
          this.eOE.ZZ("contact_info_biz_go_chatting").setTitle(R.l.enterprise_contact_info_enter);
          localObject1 = this.eOE;
          if (!com.tencent.mm.l.a.gd(this.guS.field_type)) {}
          for (bool = true;; bool = false)
          {
            ((com.tencent.mm.ui.base.preference.f)localObject1).bw("contact_info_stick_biz", bool);
            localObject1 = (CheckBoxPreference)this.eOE.ZZ("contact_info_stick_biz");
            ((CheckBoxPreference)localObject1).qpJ = this.guS.BG();
            ((CheckBoxPreference)localObject1).setTitle(R.l.enterprise_father_placetop);
            bnu();
            this.eOE.bw("contact_is_mute", true);
            this.hEj = this.guS.BD();
            ha(this.hEj);
            this.eOE.ZZ("contact_is_mute").setSummary(R.l.contact_info_enterprise_father_mute_tips);
            break;
          }
        }
        localObject1 = this.eOE;
        if ((s.hr(this.guS.field_username)) || (!com.tencent.mm.l.a.gd(this.guS.field_type))) {}
        for (bool = true;; bool = false)
        {
          ((com.tencent.mm.ui.base.preference.f)localObject1).bw("contact_info_stick_biz", bool);
          ((CheckBoxPreference)this.eOE.ZZ("contact_info_stick_biz")).qpJ = this.guS.BG();
          this.eOE.bw("contact_is_mute", true);
          this.hEj = false;
          break;
        }
        label2280:
        this.eOE.bw("near_field_service", true);
        break label661;
        label2296:
        this.eOE.bw("contact_info_time_expired", true);
        break label734;
        label2311:
        this.eOE.bw("contact_info_time_expired", true);
        break label764;
        label2326:
        this.eOE.bw("contact_info_service_phone", true);
        continue;
        label2342:
        this.eOE.bw("contact_info_time_expired", true);
        x.e("MicroMsg.ContactWidgetBizInfo", "get biz info from storage, but return null");
        continue;
        ((KeyValuePreference)localObject2).csl();
        ((KeyValuePreference)localObject2).tCA = false;
        ((KeyValuePreference)localObject2).tmc = this.bGc.getString(R.l.contact_info_isnot_verify_user_title);
        ((KeyValuePreference)localObject2).setSummary(com.tencent.mm.pluginsdk.ui.d.j.a(this.bGc, this.guS.signature));
        ((KeyValuePreference)localObject2).lO(false);
        if (am.a.dBt != null)
        {
          localObject1 = BackwardSupportUtil.b.e(am.a.dBt.gX(this.guS.field_verifyFlag), 2.0F);
          label2444:
          if (localObject1 != null) {
            break label2519;
          }
          bool = true;
          label2452:
          x.i("MicroMsg.ContactWidgetBizInfo", "verify bmp is null ? %B", new Object[] { Boolean.valueOf(bool) });
          if (localObject1 == null) {
            break label5887;
          }
        }
      }
      label2519:
      label2623:
      label2642:
      label2682:
      label2694:
      label2710:
      label2808:
      label2814:
      label2820:
      label2845:
      label3572:
      label3635:
      label3695:
      label3789:
      label3822:
      label3915:
      label4138:
      label4145:
      label4214:
      label4392:
      label4408:
      label4424:
      label4440:
      label4482:
      label4495:
      label4511:
      label4904:
      label4910:
      label4922:
      label4935:
      label4951:
      label4967:
      label4993:
      label5035:
      label5161:
      label5200:
      label5314:
      label5321:
      label5390:
      label5622:
      label5638:
      label5654:
      label5816:
      label5860:
      label5863:
      label5868:
      label5874:
      label5881:
      label5887:
      for (localObject1 = new BitmapDrawable(this.bGc.getResources(), (Bitmap)localObject1);; localObject1 = null)
      {
        ((KeyValuePreference)localObject2).tCI = ((Drawable)localObject1);
        ((KeyValuePreference)localObject2).tCG = 8;
        break;
        localObject1 = null;
        break label2444;
        bool = false;
        break label2452;
        x.w("MicroMsg.ContactWidgetBizInfo", "has not desc info");
        this.eOE.bw("contact_info_user_desc", true);
        if (this.lVJ) {
          break;
        }
        this.eOE.bw("contact_info_time_expired", true);
        break;
        localObject1 = this.bGc.getResources().getString(R.l.contact_info_verify_user_title);
        break label1107;
        localObject1 = this.bGc.getResources().getString(R.l.brandservice_sweibo_verify);
        break label1107;
        localObject1 = this.bGc.getResources().getString(R.l.brandservice_tweibo_verify);
        break label1107;
        ((KeyValuePreference)localObject6).tmc = ((d.b.d)localObject4).dLK;
        break label1114;
        localObject1 = null;
        break label1141;
        bool = false;
        break label1172;
        x.e("MicroMsg.ContactWidgetBizInfo", "verifySummary setSpan error: %s", new Object[] { ((IndexOutOfBoundsException)localObject2).getMessage() });
        break label1298;
        x.e("MicroMsg.ContactWidgetBizInfo", "[arthurdan.emojiSpan] Notice!!!! extInfo.verifyInfo.verifySourceDescription is null");
        break label1305;
        this.eOE.bw("contact_info_verifyuser", true);
        break label1305;
        if ((this.dKP != null) && (this.dKP.Mu() != null) && (!bi.oW(this.dKP.Mu().dLS)))
        {
          localObject1 = (KeyValuePreference)this.eOE.ZZ("contact_info_verifyuser");
          if (localObject1 == null) {
            break label1305;
          }
          ((KeyValuePreference)localObject1).setSummary(this.dKP.Mu().dLS);
          break label1305;
        }
        x.w("MicroMsg.ContactWidgetBizInfo", "has not verify info");
        this.eOE.bw("contact_info_verifyuser", true);
        break label1305;
        localObject1 = null;
        break label1372;
        bool = false;
        break label1380;
        x.w("MicroMsg.ContactWidgetBizInfo", "has not trademark info");
        this.eOE.bw("contact_info_trademark", true);
        break label1476;
        this.eOE.bw("contact_info_privilege", true);
        int k = this.eOE.indexOf("contact_info_category2");
        if ((k >= 0) && (this.dKO != null) && (this.dKO.size() > 0)) {
          i = this.dKO.size() - 1;
        }
        Object localObject5;
        int j;
        while (i >= 0)
        {
          if ((this.dKO.get(i) != null) && ((!this.bGc.getString(R.l.contact_info_biz_participants).equals(((d.a)this.dKO.get(i)).title)) || (this.dKW)) && ((!bi.oW(((d.a)this.dKO.get(i)).title)) || (!bi.oW(((d.a)this.dKO.get(i)).dKS))))
          {
            localObject5 = new Preference(this.bGc);
            ((Preference)localObject5).setKey("contact_info_bizinfo_external#" + i);
            localObject1 = ((d.a)this.dKO.get(i)).title;
            j = this.bGc.getResources().getIdentifier(((d.a)this.dKO.get(i)).dKS, "string", this.bGc.getPackageName());
            if (j > 0) {
              localObject1 = this.bGc.getString(j);
            }
            localObject2 = localObject1;
            if (this.lUs.LX()) {
              if (!"__mp_wording__brandinfo_history_massmsg".equals(((d.a)this.dKO.get(i)).dKS))
              {
                localObject2 = localObject1;
                if (!((String)localObject1).equals(this.bGc.getString(R.l.__mp_wording__brandinfo_history_massmsg))) {}
              }
              else
              {
                localObject2 = this.bGc.getString(R.l.enterprise_brand_history);
              }
            }
            ((Preference)localObject5).setTitle((CharSequence)localObject2);
            if (!bi.oW(((d.a)this.dKO.get(i)).description)) {
              ((Preference)localObject5).setSummary(((d.a)this.dKO.get(i)).description);
            }
            if (!bi.oV(((d.a)this.dKO.get(i)).dKS).equals("__mp_wording__brandinfo_feedback")) {
              break label5863;
            }
            j = this.eOE.indexOf("contact_info_scope_of_business");
            if (j <= 0) {
              break label5863;
            }
            j += 1;
            this.eOE.a((Preference)localObject5, j);
            if (bi.oV(((d.a)this.dKO.get(i)).dKS).equals("__mp_wording__brandinfo_biz_detail"))
            {
              localObject1 = new PreferenceSmallCategory(this.bGc);
              this.eOE.a((Preference)localObject1, j);
            }
          }
          i -= 1;
          continue;
          x.d("MicroMsg.ContactWidgetBizInfo", "pos no more");
        }
        if ((!this.lVJ) && (s.v(this.guS)) && (this.guS.csO != null) && (!this.guS.csO.equals("")))
        {
          localObject1 = (KeyValuePreference)this.eOE.ZZ("contact_info_verifyuser_weibo");
          if (localObject1 != null)
          {
            ((KeyValuePreference)localObject1).setSummary(bi.aG(this.guS.field_weiboNickname, "") + this.bGc.getString(R.l.settings_show_weibo_field, new Object[] { s.hV(this.guS.csO) }));
            ((Preference)localObject1).hIZ = com.tencent.mm.bp.a.g(this.bGc, R.e.link_color);
            ((KeyValuePreference)localObject1).lO(false);
          }
          if ((this.dKP == null) || (this.dKP.Mr() == null)) {
            break label4440;
          }
          localObject1 = (BizInfoPayInfoIconPreference)this.eOE.ZZ("contact_info_reputation");
          if (this.dKP.Mr().dLN <= 0) {
            break label4392;
          }
          ((BizInfoPayInfoIconPreference)localObject1).uD(this.dKP.Mr().dLN);
          localObject1 = (BizInfoPayInfoIconPreference)this.eOE.ZZ("contact_info_guarantee_info");
          if ((this.dKP.Mr().dLP == null) || (this.dKP.Mr().dLP.size() <= 0)) {
            break label4408;
          }
          ((BizInfoPayInfoIconPreference)localObject1).bH(this.dKP.Mr().dLP);
          localObject1 = (KeyValuePreference)this.eOE.ZZ("contact_info_scope_of_business");
          if (bi.oW(this.dKP.Mr().dLO)) {
            break label4424;
          }
          ((KeyValuePreference)localObject1).setSummary(this.dKP.Mr().dLO);
          ((KeyValuePreference)localObject1).tCG = 4;
          ((KeyValuePreference)localObject1).lO(false);
          if ((this.lVH == null) || (this.lVH.size() <= 0)) {
            break label4495;
          }
          this.eOE.bw("contact_info_bindwxainfo", false);
          localObject1 = (BizBindWxaInfoPreference)this.eOE.ZZ("contact_info_bindwxainfo");
          localObject2 = this.lUs;
          localObject5 = this.lVH;
          ((BizBindWxaInfoPreference)localObject1).lUg = true;
          ((BizBindWxaInfoPreference)localObject1).eXL = ((com.tencent.mm.ac.d)localObject2);
          if (((BizBindWxaInfoPreference)localObject1).gEP != null) {
            break label4482;
          }
          ((BizBindWxaInfoPreference)localObject1).gEP = new LinkedList();
          if ((localObject5 != null) && (!((List)localObject5).isEmpty())) {
            ((BizBindWxaInfoPreference)localObject1).gEP.addAll((Collection)localObject5);
          }
          ((BizBindWxaInfoPreference)localObject1).aeP();
          localObject2 = this.bGc.getIntent().getStringExtra("Contact_BIZ_KF_WORKER_ID");
          x.d("MicroMsg.ContactWidgetBizInfo", "updateKF %s, %b", new Object[] { localObject2, Boolean.valueOf(this.lVO) });
          if (!this.lVO)
          {
            this.lVN = ((String)localObject2);
            if ((this.dKP != null) && (this.dKP.MA()) && (this.guS != null)) {
              break label4511;
            }
            this.eOE.bw("contact_info_kf_worker", true);
          }
          x.d("MicroMsg.ContactWidgetBizInfo", "KIsardDevice(%b)", new Object[] { Boolean.valueOf(this.bGc.getIntent().getBooleanExtra("KIsHardDevice", false)) });
          if ((this.bGc.getIntent() == null) || (!this.bGc.getIntent().getBooleanExtra("KIsHardDevice", false))) {
            break label5200;
          }
          x.d("MicroMsg.ContactWidgetBizInfo", "Hard device biz...");
          bool = bns();
          x.d("MicroMsg.ContactWidgetBizInfo", "contact.isContact()(%b), isHardDeviceBound(%b)", new Object[] { Boolean.valueOf(com.tencent.mm.l.a.gd(this.guS.field_type)), Boolean.valueOf(bool) });
          if ((!com.tencent.mm.l.a.gd(this.guS.field_type)) || (!bool)) {
            break label5035;
          }
          if (locald == null) {
            break label4993;
          }
          localObject1 = (CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo");
          localObject2 = (CheckBoxPreference)this.eOE.ZZ("contact_info_locate");
          if (!locald.Ma()) {
            break label4922;
          }
          localObject5 = z.Nc().cA(locald.field_username);
          this.lVG = z.Nc().cz((String)localObject5);
          if (this.lVG == null) {
            break label4910;
          }
          if (this.lVG.hu(4)) {
            break label4904;
          }
          bool = true;
          ((CheckBoxPreference)localObject1).qpJ = bool;
          if (!locald.LQ()) {
            break label4951;
          }
          if ((this.dKP == null) && (locald != null)) {
            this.dKP = locald.bG(false);
          }
          if ((this.dKP == null) || (!this.dKP.Mk()) || (!com.tencent.mm.bg.d.QS("brandservice"))) {
            break label4935;
          }
          this.eOE.bw("contact_info_template_recv", false);
          if (!locald.bG(false).LU()) {
            break label4967;
          }
          ((CheckBoxPreference)localObject2).qpJ = locald.LR();
        }
        for (;;)
        {
          this.eOE.bw("contact_info_biz_read_msg_online", true);
          this.eOE.bw("contact_info_biz_add", true);
          localObject1 = this.guS.BL();
          if (localObject1 != null) {
            this.bGc.setMMTitle((String)localObject1);
          }
          if (s.hr(this.guS.field_username))
          {
            this.eOE.ZZ("contact_info_biz_go_chatting").setTitle(R.l.contact_info_send);
            this.bGc.setMMTitle(R.l.contact_info_title);
          }
          if ((!s.hM(this.guS.field_username)) && (this.lUs != null) && (!this.lUs.LZ())) {
            this.bGc.addIconOptionMenu(0, R.g.mm_title_btn_menu, new c.17(this));
          }
          return;
          this.eOE.bw("contact_info_verifyuser_weibo", true);
          break;
          this.eOE.bw("contact_info_reputation", true);
          break label3572;
          this.eOE.bw("contact_info_guarantee_info", true);
          break label3635;
          this.eOE.bw("contact_info_scope_of_business", true);
          break label3695;
          this.eOE.bw("contact_info_reputation", true);
          this.eOE.bw("contact_info_guarantee_info", true);
          this.eOE.bw("contact_info_scope_of_business", true);
          break label3695;
          ((BizBindWxaInfoPreference)localObject1).gEP.clear();
          break label3789;
          this.eOE.bw("contact_info_bindwxainfo", true);
          break label3822;
          if (bi.oW((String)localObject2))
          {
            localObject1 = z.MX().kR(this.guS.field_username);
            if (localObject1 == null)
            {
              this.eOE.bw("contact_info_kf_worker", true);
              z.MZ().a(this);
              z.MZ().ag(this.guS.field_username, com.tencent.mm.model.q.GF());
              this.lVO = true;
              break label3915;
            }
            x.d("MicroMsg.ContactWidgetBizInfo", "has default kf %s", new Object[] { ((com.tencent.mm.ac.g)localObject1).field_openId });
            this.eOE.bw("contact_info_kf_worker", false);
            localObject2 = (IconWidgetPreference)this.eOE.ZZ("contact_info_kf_worker");
            ((IconWidgetPreference)localObject2).setSummary(((com.tencent.mm.ac.g)localObject1).field_nickname);
            localObject5 = com.tencent.mm.aa.c.a(((com.tencent.mm.ac.g)localObject1).field_openId, false, -1);
            if (localObject5 == null)
            {
              c((com.tencent.mm.ac.g)localObject1);
              JF(((com.tencent.mm.ac.g)localObject1).field_openId);
              break label3915;
            }
            ((IconWidgetPreference)localObject2).C((Bitmap)localObject5);
            break label3915;
          }
          localObject5 = z.MX();
          localObject1 = ((com.tencent.mm.ac.i)localObject5).kQ((String)localObject2);
          if ((localObject1 == null) || (com.tencent.mm.ac.i.a((com.tencent.mm.ac.g)localObject1)))
          {
            z.MZ().a(this);
            z.MZ().ah(this.guS.field_username, (String)localObject2);
            this.lVO = true;
          }
          if (localObject1 != null) {
            break label5860;
          }
          x.d("MicroMsg.ContactWidgetBizInfo", "no such kf, get default kf");
          localObject1 = ((com.tencent.mm.ac.i)localObject5).kR(this.guS.field_username);
          if (localObject1 == null)
          {
            this.eOE.bw("contact_info_kf_worker", true);
            break label3915;
          }
          this.eOE.bw("contact_info_kf_worker", false);
          localObject2 = (IconWidgetPreference)this.eOE.ZZ("contact_info_kf_worker");
          ((IconWidgetPreference)localObject2).setSummary(((com.tencent.mm.ac.g)localObject1).field_nickname);
          localObject5 = com.tencent.mm.aa.c.a(((com.tencent.mm.ac.g)localObject1).field_openId, false, -1);
          if (localObject5 == null)
          {
            c((com.tencent.mm.ac.g)localObject1);
            JF(((com.tencent.mm.ac.g)localObject1).field_openId);
          }
          for (;;)
          {
            x.d("MicroMsg.ContactWidgetBizInfo", "kf worker %s, %s", new Object[] { ((com.tencent.mm.ac.g)localObject1).field_openId, ((com.tencent.mm.ac.g)localObject1).field_nickname });
            break;
            ((IconWidgetPreference)localObject2).C((Bitmap)localObject5);
          }
          bool = false;
          break label4138;
          x.w("MicroMsg.ContactWidgetBizInfo", "bizChatMyuser bizChatUserInfo is null");
          break label4145;
          ((CheckBoxPreference)localObject1).qpJ = locald.LQ();
          break label4145;
          this.eOE.bw("contact_info_template_recv", true);
          break label4214;
          this.eOE.bw("contact_info_template_recv", true);
          break label4214;
          this.eOE.bw("contact_info_locate", true);
          ((CheckBoxPreference)localObject2).qpJ = locald.LR();
          continue;
          this.eOE.bw("contact_info_subscribe_bizinfo", true);
          this.eOE.bw("contact_info_locate", true);
          this.eOE.bw("contact_info_template_recv", true);
        }
        x.w("MicroMsg.ContactWidgetBizInfo", "%s is not my hard biz contact", new Object[] { this.guS.field_username });
        bnq();
        localObject1 = this.eOE.ZZ("contact_info_biz_add");
        x.d("MicroMsg.ContactWidgetBizInfo", "isBizConferenceAccount(%b)", new Object[] { Boolean.valueOf(this.lVK) });
        if (localObject1 != null)
        {
          if (bool) {
            ((Preference)localObject1).setTitle(R.l.contact_info_biz_join);
          }
        }
        else if (uK(this.eLK))
        {
          if (locald != null) {
            break label5161;
          }
          x.e("MicroMsg.ContactWidgetBizInfo", "bizinfo is null in temp session");
        }
        for (;;)
        {
          this.bGc.showOptionMenu(false);
          return;
          ((Preference)localObject1).setTitle(R.l.contact_info_biz_bind_exdevice);
          break;
          ((CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo")).qpJ = locald.LQ();
          this.eOE.bw("contact_info_subscribe_bizinfo", false);
        }
        if (com.tencent.mm.l.a.gd(this.guS.field_type))
        {
          if (locald != null)
          {
            localObject1 = (CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo");
            localObject2 = (CheckBoxPreference)this.eOE.ZZ("contact_info_locate");
            if (locald.Ma())
            {
              ((CheckBoxPreference)localObject1).setTitle(R.l.enterprise_chat_receive_msg);
              localObject5 = z.Nc().cA(locald.field_username);
              this.lVG = z.Nc().cz((String)localObject5);
              if (this.lVG != null) {
                if (!this.lVG.hu(4))
                {
                  bool = true;
                  ((CheckBoxPreference)localObject1).qpJ = bool;
                  if (!locald.LQ()) {
                    break label5638;
                  }
                  if ((this.dKP == null) && (locald != null)) {
                    this.dKP = locald.bG(false);
                  }
                  if ((this.dKP == null) || (!this.dKP.Mk()) || (!com.tencent.mm.bg.d.QS("brandservice"))) {
                    break label5622;
                  }
                  this.eOE.bw("contact_info_template_recv", false);
                  if (!locald.bG(false).LU()) {
                    break label5654;
                  }
                  ((CheckBoxPreference)localObject2).qpJ = locald.LR();
                }
              }
            }
          }
          for (;;)
          {
            this.eOE.bw("contact_info_biz_read_msg_online", true);
            this.eOE.bw("contact_info_biz_add", true);
            localObject1 = this.guS.BL();
            if (localObject1 != null) {
              this.bGc.setMMTitle((String)localObject1);
            }
            if (s.hr(this.guS.field_username))
            {
              this.eOE.ZZ("contact_info_biz_go_chatting").setTitle(R.l.contact_info_send);
              this.bGc.setMMTitle(R.l.contact_info_title);
            }
            if ((s.hM(this.guS.field_username)) || (this.lUs == null)) {
              break;
            }
            this.bGc.addIconOptionMenu(0, R.g.mm_title_btn_menu, new c.18(this));
            return;
            bool = false;
            break label5314;
            x.w("MicroMsg.ContactWidgetBizInfo", "bizChatMyuser bizChatUserInfo is null");
            break label5321;
            if (locald.LY())
            {
              ((CheckBoxPreference)localObject1).setTitle(R.l.enterprise_brand_receive_msg);
              if (!z.Nh().kr(locald.field_username)) {}
              for (bool = true;; bool = false)
              {
                ((CheckBoxPreference)localObject1).qpJ = bool;
                break;
              }
            }
            ((CheckBoxPreference)localObject1).qpJ = locald.LQ();
            break label5321;
            this.eOE.bw("contact_info_template_recv", true);
            break label5390;
            this.eOE.bw("contact_info_template_recv", true);
            break label5390;
            this.eOE.bw("contact_info_locate", true);
            ((CheckBoxPreference)localObject2).qpJ = locald.LR();
            continue;
            this.eOE.bw("contact_info_subscribe_bizinfo", true);
            this.eOE.bw("contact_info_locate", true);
            this.eOE.bw("contact_info_template_recv", true);
          }
        }
        x.w("MicroMsg.ContactWidgetBizInfo", "%s is not my contact", new Object[] { this.guS.field_username });
        bnq();
        localObject1 = this.eOE.ZZ("contact_info_biz_add");
        if ((localObject1 != null) && (this.lVK)) {
          ((Preference)localObject1).setTitle(R.l.contact_info_biz_join);
        }
        if (uK(this.eLK))
        {
          if (locald != null) {
            break label5816;
          }
          x.e("MicroMsg.ContactWidgetBizInfo", "bizinfo is null in temp session");
        }
        for (;;)
        {
          this.bGc.showOptionMenu(false);
          return;
          ((CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo")).qpJ = locald.LQ();
          this.eOE.bw("contact_info_subscribe_bizinfo", false);
        }
        localObject1 = localIndexOutOfBoundsException1;
        break label1298;
        Object localObject3 = null;
        break label1164;
      }
    }
  }
  
  private void bnq()
  {
    if ((this.guS != null) && (com.tencent.mm.l.a.gd(this.guS.field_type)) && (!s.hr(this.guS.field_username)) && (!s.hW(this.guS.field_username)))
    {
      this.eOE.bw("contact_is_mute", false);
      this.eOE.bw("contact_info_verifyuser_weibo", true);
      this.eOE.bw("contact_info_subscribe_bizinfo", true);
      this.eOE.bw("contact_info_template_recv", true);
      this.eOE.bw("contact_info_locate", true);
      if (this.lVJ) {
        break label291;
      }
      this.eOE.bw("contact_info_time_expired", true);
      label130:
      if ((this.guS == null) || ((!s.hM(this.guS.field_username)) && (!s.hW(this.guS.field_username))) || (!com.tencent.mm.l.a.gd(this.guS.field_type))) {
        break label307;
      }
      this.eOE.bw("contact_info_biz_go_chatting", false);
    }
    for (;;)
    {
      if (s.hW(this.guS.field_username)) {
        this.eOE.bw("contact_info_user_desc", true);
      }
      return;
      this.eOE.bw("contact_is_mute", true);
      if ((this.guS != null) && (!com.tencent.mm.l.a.gd(this.guS.field_type)) && (uK(this.eLK)))
      {
        this.eOE.bw("contact_info_expose_btn", false);
        break;
      }
      this.eOE.bw("contact_info_expose_btn", true);
      break;
      label291:
      this.eOE.bw("contact_info_biz_add", true);
      break label130;
      label307:
      this.eOE.bw("contact_info_biz_go_chatting", true);
    }
  }
  
  private boolean bns()
  {
    if (this.bGc.getIntent() == null) {
      return false;
    }
    String str1 = this.bGc.getIntent().getStringExtra("device_id");
    String str2 = this.bGc.getIntent().getStringExtra("device_type");
    cz localcz = new cz();
    localcz.bKx.byN = str1;
    localcz.bKx.bKv = str2;
    com.tencent.mm.sdk.b.a.sFg.m(localcz);
    return localcz.bKy.bKz;
  }
  
  private void bnu()
  {
    x.d("MicroMsg.ContactWidgetBizInfo", "updatePlaceTop");
    if (this.duR == null) {
      this.duR = this.bGc.getSharedPreferences(this.bGc.getPackageName() + "_preferences", 0);
    }
    if (this.hLs != null)
    {
      if (this.guS == null) {
        break label108;
      }
      this.duR.edit().putBoolean("biz_placed_to_the_top", this.guS.BG()).commit();
    }
    for (;;)
    {
      this.eOE.notifyDataSetChanged();
      return;
      label108:
      this.duR.edit().putBoolean("biz_placed_to_the_top", false).commit();
    }
  }
  
  private static void c(com.tencent.mm.ac.g paramg)
  {
    long l = System.currentTimeMillis();
    com.tencent.mm.aa.k localk = com.tencent.mm.aa.q.KH();
    if (localk.kc(paramg.field_openId) == null)
    {
      com.tencent.mm.aa.j localj = new com.tencent.mm.aa.j();
      localj.username = paramg.field_openId;
      localj.dHQ = paramg.field_headImgUrl;
      localj.by(false);
      localj.csA = 3;
      localk.a(localj);
    }
    com.tencent.mm.aa.q.KJ().jP(paramg.field_openId);
    x.d("MicroMsg.ContactWidgetBizInfo", "downloadKFAvatar, %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
  }
  
  private void ha(boolean paramBoolean)
  {
    if (this.guS != null) {
      if (this.bGc != null)
      {
        if ((!paramBoolean) || (com.tencent.mm.ac.f.eZ(this.guS.field_username))) {
          break label65;
        }
        this.bGc.setTitleMuteIconVisibility(0);
      }
    }
    for (;;)
    {
      CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.eOE.ZZ("contact_is_mute");
      if (localCheckBoxPreference != null) {
        localCheckBoxPreference.qpJ = paramBoolean;
      }
      return;
      label65:
      this.bGc.setTitleMuteIconVisibility(8);
    }
  }
  
  private static boolean uK(int paramInt)
  {
    return (paramInt == 81) || (paramInt == 92) || (paramInt == 93) || (paramInt == 94);
  }
  
  public final String MQ()
  {
    return "MicroMsg.ContactWidgetBizInfo";
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    Object localObject1 = null;
    x.d("MicroMsg.ContactWidgetBizInfo", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    this.lVO = false;
    if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
      this.tipDialog.dismiss();
    }
    if (paraml == null) {
      x.e("MicroMsg.ContactWidgetBizInfo", "scene == null");
    }
    label383:
    label874:
    label897:
    label912:
    do
    {
      do
      {
        return;
        au.DF().b(paraml.getType(), this);
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          x.e("MicroMsg.ContactWidgetBizInfo", "scene.getType() = %s", new Object[] { Integer.valueOf(paraml.getType()) });
          return;
        }
        x.d("MicroMsg.ContactWidgetBizInfo", "scene.getType() = %s", new Object[] { Integer.valueOf(paraml.getType()) });
        if (paraml.getType() == 536)
        {
          au.DF().b(536, this);
          bnp();
          return;
        }
        if (paraml.getType() != 1363) {
          break;
        }
        paramString = (com.tencent.mm.plugin.profile.a.b)paraml;
        if ((paramString.diG != null) && (paramString.diG.dIE.dIL != null)) {}
        for (paramString = (blt)paramString.diG.dIE.dIL;; paramString = null)
        {
          localObject2 = (com.tencent.mm.plugin.profile.a.b)paraml;
          paraml = (l)localObject1;
          if (((com.tencent.mm.plugin.profile.a.b)localObject2).diG != null)
          {
            paraml = (l)localObject1;
            if (((com.tencent.mm.plugin.profile.a.b)localObject2).diG.dID.dIL != null) {
              paraml = (bls)((com.tencent.mm.plugin.profile.a.b)localObject2).diG.dID.dIL;
            }
          }
          if ((paramString != null) && (paramString.riQ != null) && (paramString.riQ.ret == 0) && (paramString.riN != null) && (!bi.oW(paramString.riN.riL))) {
            break label383;
          }
          if ((paramString == null) || (paramString.riQ == null)) {
            break;
          }
          x.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(paramString.riQ.ret) });
          return;
        }
        x.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd err:resp == null");
        return;
        if (paramString.riN == null)
        {
          x.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd resp.user == null");
          return;
        }
        Object localObject2 = z.Nc().cz(paramString.riN.riL);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = new com.tencent.mm.ac.a.j();
          ((com.tencent.mm.ac.a.j)localObject1).field_userId = paramString.riN.riL;
        }
        ((com.tencent.mm.ac.a.j)localObject1).field_userName = paramString.riN.hyG;
        ((com.tencent.mm.ac.a.j)localObject1).field_brandUserName = paraml.riK;
        ((com.tencent.mm.ac.a.j)localObject1).field_UserVersion = paramString.riN.ver;
        ((com.tencent.mm.ac.a.j)localObject1).field_headImageUrl = paramString.riN.riF;
        ((com.tencent.mm.ac.a.j)localObject1).field_profileUrl = paramString.riN.riT;
        ((com.tencent.mm.ac.a.j)localObject1).field_bitFlag = paramString.riN.riG;
        ((com.tencent.mm.ac.a.j)localObject1).field_addMemberUrl = paramString.riN.riJ;
        ((com.tencent.mm.ac.a.j)localObject1).field_needToUpdate = false;
      } while (z.Nc().b((com.tencent.mm.ac.a.j)localObject1));
      z.Nc().a((com.tencent.mm.ac.a.j)localObject1);
      return;
      if (paraml.getType() == 1394)
      {
        paramString = ((com.tencent.mm.plugin.profile.a.c)paraml).bnl();
        localObject1 = ((com.tencent.mm.plugin.profile.a.c)paraml).bnk();
        if ((localObject1 == null) || (((brt)localObject1).riQ == null) || (((brt)localObject1).riQ.ret != 0))
        {
          if ((localObject1 != null) && (((brt)localObject1).riQ != null))
          {
            x.w("MicroMsg.ContactWidgetBizInfo", "chuangchen onSceneEnd type:%s, err:code:%s", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(((brt)localObject1).riQ.ret) });
            return;
          }
          x.w("MicroMsg.ContactWidgetBizInfo", "chuangchen onSceneEnd type:%s, err:resp == null", new Object[] { Integer.valueOf(paraml.getType()) });
          return;
        }
        if (!paramString.spC)
        {
          paramInt1 = 1;
          if (paramInt1 == 0) {
            break label912;
          }
          paramString = this.lUs;
          paramString.field_brandFlag &= 0xFFFFFFFE;
          a(paramString, true);
          au.HU();
          if (com.tencent.mm.model.c.FW().Yq(paramString.field_username) == null)
          {
            paraml = new com.tencent.mm.storage.ai(paramString.field_username);
            paraml.ef(bi.oV(this.lUs.Mg()));
            au.HU();
            localObject1 = com.tencent.mm.model.c.FT().GE(paramString.field_username);
            if (localObject1 == null) {
              break label874;
            }
            au.HU();
            com.tencent.mm.model.c.FW().d(paraml);
            au.HU();
            com.tencent.mm.model.c.FW().ak((bd)localObject1);
          }
        }
        for (;;)
        {
          au.HU();
          if (com.tencent.mm.model.c.FW().Yq(paramString.field_enterpriseFather) != null) {
            break label897;
          }
          paramString = new com.tencent.mm.storage.ai(paramString.field_enterpriseFather);
          paramString.clx();
          au.HU();
          com.tencent.mm.model.c.FW().d(paramString);
          return;
          paramInt1 = 0;
          break;
          paraml.clx();
          au.HU();
          com.tencent.mm.model.c.FW().d(paraml);
        }
        au.HU();
        com.tencent.mm.model.c.FV().XJ(paramString.field_enterpriseFather);
        return;
        paramString = this.lUs;
        paramString.field_brandFlag |= 0x1;
        a(paramString, true);
        au.HU();
        com.tencent.mm.model.c.FW().Yp(paramString.field_username);
        au.HU();
        if (com.tencent.mm.model.c.FW().YC(paramString.field_enterpriseFather) <= 0)
        {
          au.HU();
          com.tencent.mm.model.c.FW().Yp(paramString.field_enterpriseFather);
          return;
        }
        au.HU();
        com.tencent.mm.model.c.FV().XJ(paramString.field_enterpriseFather);
        return;
      }
      if (paraml.getType() == 1343)
      {
        bnp();
        return;
      }
    } while (paraml.getType() != 1228);
    bnp();
  }
  
  public final void a(int paramInt, l paraml)
  {
    if ((this.lUs == null) || (!this.lUs.Ma())) {}
    while (paraml.getType() != 1354) {
      return;
    }
    paraml = (CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo");
    String str = z.Nc().cA(this.lUs.field_username);
    this.lVG = z.Nc().cz(str);
    if (this.lVG != null)
    {
      if (!this.lVG.hu(4)) {}
      for (boolean bool = true;; bool = false)
      {
        paraml.qpJ = bool;
        this.eOE.notifyDataSetChanged();
        return;
      }
    }
    x.w("MicroMsg.ContactWidgetBizInfo", "bizChatMyuser bizChatUserInfo is null after GetBizChatMyUserInfo");
  }
  
  final void a(com.tencent.mm.ac.d paramd, boolean paramBoolean)
  {
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo");
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)this.eOE.ZZ("contact_info_locate");
    atx localatx = new atx();
    localatx.eJV = paramd.field_brandFlag;
    localatx.hbL = this.guS.field_username;
    if (uK(this.eLK))
    {
      au.HU();
      com.tencent.mm.model.c.FQ().b(new com.tencent.mm.plugin.messenger.foundation.a.a.h.a(58, localatx));
    }
    for (;;)
    {
      z.MY().c(paramd, new String[0]);
      localCheckBoxPreference1.qpJ = paramd.LQ();
      if (localCheckBoxPreference2 != null) {
        localCheckBoxPreference2.qpJ = paramd.LR();
      }
      if (paramBoolean) {
        bnp();
      }
      return;
      au.HU();
      com.tencent.mm.model.c.FQ().b(new com.tencent.mm.plugin.messenger.foundation.a.a.h.a(47, localatx));
    }
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    boolean bool;
    if (paramab != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bi.oV(paramab.field_username).length() <= 0) {
        break label277;
      }
      bool = true;
      label28:
      Assert.assertTrue(bool);
      if (paramf == null) {
        break label283;
      }
      bool = true;
      label40:
      Assert.assertTrue(bool);
      this.eOE = paramf;
      this.guS = paramab;
      this.lUD = paramBoolean;
      this.eLK = paramInt;
      this.lVM = this.bGc.getIntent().getIntExtra("add_more_friend_search_scene", 0);
      this.lVR = ((SnsAdClick)this.bGc.getIntent().getParcelableExtra("KSnsAdTag"));
      this.lVQ = this.bGc.getIntent().getBundleExtra("Contact_Ext_Args");
      this.lVS = this.bGc.getIntent().getStringExtra("key_add_contact_report_info");
      bnp();
      paramf = this.bGc.getIntent().getStringExtra("Contact_BIZ_PopupInfoMsg");
      if (!bi.oW(paramf))
      {
        this.bGc.getIntent().putExtra("Contact_BIZ_PopupInfoMsg", "");
        com.tencent.mm.ui.base.h.a(this.bGc, paramf, "", this.bGc.getString(R.l.app_ok), null);
      }
      if (paramab != null)
      {
        z.Nk().km(paramab.field_username);
        if (com.tencent.mm.ac.f.kK(paramab.field_username))
        {
          paramf = paramab.field_username;
          if (!com.tencent.mm.ac.f.eZ(paramf)) {
            break label289;
          }
          z.Ng();
          com.tencent.mm.ac.a.h.a(paramf, this);
          paramf = com.tencent.mm.ac.f.kH(paramf).Mg();
          if (paramf != null) {
            z.Nk().km(paramf);
          }
        }
      }
    }
    label277:
    label283:
    label289:
    do
    {
      do
      {
        return true;
        bool = false;
        break;
        bool = false;
        break label28;
        bool = false;
        break label40;
      } while (!com.tencent.mm.ac.f.kM(paramf));
      z.Nh();
      com.tencent.mm.ac.c.a(paramf, this);
      z.MY();
      paramf = com.tencent.mm.ac.e.kD(paramf);
    } while (paramf == null);
    z.Nk().km(paramf);
    return true;
  }
  
  public final boolean auw()
  {
    BizInfoHeaderPreference localBizInfoHeaderPreference = (BizInfoHeaderPreference)this.eOE.ZZ("contact_info_header_bizinfo");
    if (localBizInfoHeaderPreference != null) {
      localBizInfoHeaderPreference.onDetach();
    }
    return true;
  }
  
  final void ay(int paramInt, String paramString)
  {
    if ((this.lVQ == null) || ((this.eLK != 39) && (this.eLK != 56) && (this.eLK != 35) && (this.eLK != 87) && (this.eLK != 88) && (this.eLK != 89) && (this.eLK != 85)))
    {
      x.d("MicroMsg.ContactWidgetBizInfo", "mExtArgs is null or the add contact action is not from biz search.");
      return;
    }
    if (this.guS == null)
    {
      x.i("MicroMsg.ContactWidgetBizInfo", "contact is null.");
      return;
    }
    String str2 = this.lVQ.getString("Contact_Ext_Args_Search_Id");
    String str3 = bi.oV(this.lVQ.getString("Contact_Ext_Args_Query_String"));
    int j = this.lVQ.getInt("Contact_Ext_Args_Index");
    int i;
    String str1;
    switch (this.eLK)
    {
    default: 
      i = 0;
      str1 = bi.oV(this.lVQ.getString("Contact_Ext_Extra_Params"));
      str2 = str3 + "," + paramInt + "," + bi.oV(this.guS.field_username) + "," + j + "," + System.currentTimeMillis() / 1000L + "," + str2 + "," + i;
      if (bi.oW(paramString)) {
        break;
      }
    }
    for (paramString = str2 + "," + paramString + "," + str1;; paramString = str2 + ",," + str1)
    {
      x.v("MicroMsg.ContactWidgetBizInfo", "report 10866: %s", new Object[] { paramString });
      com.tencent.mm.plugin.report.service.h.mEJ.k(10866, paramString);
      return;
      i = 1;
      break;
      i = 2;
      break;
      i = 3;
      break;
      i = 4;
      break;
      i = 5;
      break;
    }
  }
  
  final void bnr()
  {
    if ((this.bGc.getIntent() != null) && (this.bGc.getIntent().getBooleanExtra("KIsHardDevice", false)))
    {
      localObject1 = this.bGc.getIntent().getStringExtra("KHardDeviceBindTicket");
      if (!bi.oW((String)localObject1)) {
        break label152;
      }
      x.i("MicroMsg.ContactWidgetBizInfo", "bindTicket is null, means it is not switch from QRcode scan, just add contact");
    }
    label152:
    while (bns())
    {
      localObject1 = new com.tencent.mm.pluginsdk.ui.applet.a(this.bGc, new c.6(this));
      localObject2 = new LinkedList();
      ((LinkedList)localObject2).add(Integer.valueOf(this.eLK));
      if (this.dKY != null) {
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).qHZ = this.dKY;
      }
      if (!bi.oW(this.juZ)) {
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).juZ = this.juZ;
      }
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).qIf = true;
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).a(this.guS.field_username, (LinkedList)localObject2, this.lVS);
      return;
    }
    x.d("MicroMsg.ContactWidgetBizInfo", "IsHardDevice, bindTicket = %s", new Object[] { localObject1 });
    au.DF().a(536, this);
    Object localObject2 = new cv();
    ((cv)localObject2).bKm.bKo = ((String)localObject1);
    ((cv)localObject2).bKm.opType = 1;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
    Object localObject1 = ((cv)localObject2).bKn.bKq;
    localObject2 = this.bGc;
    this.bGc.getString(R.l.app_tip);
    this.tipDialog = com.tencent.mm.ui.base.h.a((Context)localObject2, this.bGc.getString(R.l.app_waiting), true, new c.5(this, (l)localObject1));
  }
  
  final void bnt()
  {
    if ((this.guS == null) || (bi.oW(this.guS.field_username))) {
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", String.format("https://mp.weixin.qq.com/mp/infringement?username=%s&from=1#wechat_redirect", new Object[] { this.guS.field_username }));
    localIntent.putExtra("showShare", false);
    com.tencent.mm.bg.d.b(this.bGc, "webview", ".ui.tools.WebViewUI", localIntent);
  }
  
  public final void d(LinkedList<cgc> paramLinkedList)
  {
    z.MZ().b(this);
    if (this.eOE == null)
    {
      x.e("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, screen is null");
      return;
    }
    if (this.guS == null)
    {
      x.e("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, contact is null");
      return;
    }
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      x.w("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, worker is null");
      return;
    }
    if (!bi.oW(this.lVN))
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        cgc localcgc = (cgc)localIterator.next();
        if ((localcgc.sAB != null) && (localcgc.sAB.equals(this.lVN)))
        {
          this.eOE.bw("contact_info_kf_worker", false);
          this.eOE.ZZ("contact_info_kf_worker").setSummary(localcgc.rTW);
          return;
        }
      }
    }
    this.eOE.bw("contact_info_kf_worker", false);
    this.eOE.ZZ("contact_info_kf_worker").setSummary(((cgc)paramLinkedList.get(0)).rTW);
  }
  
  final void gZ(boolean paramBoolean)
  {
    Object localObject = this.lUs.field_username;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      localObject = new com.tencent.mm.plugin.profile.a.c((String)localObject, paramBoolean);
      au.DF().a(1394, this);
      au.DF().a((l)localObject, 0);
      MMActivity localMMActivity = this.bGc;
      this.bGc.getString(R.l.app_tip);
      this.tipDialog = com.tencent.mm.ui.base.h.a(localMMActivity, this.bGc.getString(R.l.app_waiting), true, new c.14(this, (com.tencent.mm.plugin.profile.a.c)localObject));
      return;
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.bGc == null) {
      x.e("MicroMsg.ContactWidgetBizInfo", "null == context");
    }
    do
    {
      return;
      x.i("MicroMsg.ContactWidgetBizInfo", "onActivityResult, requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      switch (paramInt1)
      {
      default: 
        return;
      }
    } while ((paramInt2 != -1) || (paramIntent == null));
    String str1 = paramIntent.getStringExtra("be_send_card_name");
    String str2 = paramIntent.getStringExtra("received_card_name");
    boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
    paramIntent = paramIntent.getStringExtra("custom_send_text");
    com.tencent.mm.plugin.messenger.a.g.bcT().l(str1, str2, bool);
    com.tencent.mm.plugin.messenger.a.g.bcT().dF(paramIntent, str2);
    com.tencent.mm.ui.widget.snackbar.b.h(this.bGc, this.bGc.getString(R.l.finish_sent));
  }
  
  public final boolean wX(final String paramString)
  {
    int i = 4;
    boolean bool2 = true;
    boolean bool1;
    if (paramString == null) {
      bool1 = false;
    }
    Object localObject2;
    label1097:
    label1212:
    label1314:
    label1319:
    label1661:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  return bool1;
                  if (paramString.equals("contact_info_verifyuser_weibo"))
                  {
                    new com.tencent.mm.plugin.profile.ui.a.a(this.bGc).ef(this.guS.csO, this.guS.field_username);
                    return true;
                  }
                  if ("contact_info_biz_go_chatting".endsWith(paramString))
                  {
                    if (this.lVR != null)
                    {
                      paramString = new ng();
                      this.lVR.egJ = 5;
                      paramString.bYk.bYl = this.lVR;
                      com.tencent.mm.sdk.b.a.sFg.m(paramString);
                    }
                    if ((this.lUs != null) && ((this.lUs.LY()) || (this.lUs.Ma())))
                    {
                      paramString = new Intent();
                      if (this.lUs.Ma())
                      {
                        localObject1 = this.lUs.Mg();
                        if (bi.oW((String)localObject1))
                        {
                          x.w("MicroMsg.ContactWidgetBizInfo", "contact_info_biz_go_chatting fatherUserName is empty");
                          return false;
                        }
                        paramString.putExtra("enterprise_biz_name", (String)localObject1);
                        paramString.putExtra("enterprise_biz_display_name", r.gT((String)localObject1));
                        paramString.addFlags(67108864);
                        com.tencent.mm.bg.d.e(this.bGc, ".ui.conversation.EnterpriseConversationUI", paramString);
                        this.bGc.finish();
                      }
                    }
                    for (;;)
                    {
                      ay(5, null);
                      return true;
                      paramString.putExtra("enterprise_biz_name", this.guS.field_username);
                      paramString.putExtra("enterprise_biz_display_name", r.gT(this.guS.field_username));
                      break;
                      paramString = new Intent();
                      if (this.bGc.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false)) {
                        paramString.setFlags(268435456);
                      }
                      if (this.lUD)
                      {
                        paramString.putExtra("Chat_User", this.guS.field_username);
                        paramString.putExtra("Chat_Mode", 1);
                        this.bGc.setResult(-1, paramString);
                      }
                      else
                      {
                        paramString.putExtra("Chat_User", this.guS.field_username);
                        paramString.putExtra("Chat_Mode", 1);
                        paramString.putExtra("finish_direct", true);
                        com.tencent.mm.plugin.profile.a.ezn.e(paramString, this.bGc);
                      }
                    }
                  }
                  if ("contact_info_biz_add".endsWith(paramString))
                  {
                    if (!com.tencent.mm.model.gdpr.c.Jm()) {
                      bnr();
                    }
                    for (;;)
                    {
                      bool1 = bool2;
                      if (this.lVM == 0) {
                        break;
                      }
                      com.tencent.mm.plugin.report.service.h.mEJ.h(11263, new Object[] { Integer.valueOf(this.lVM), this.guS.field_username });
                      return true;
                      com.tencent.mm.model.gdpr.c.a(this.bGc, com.tencent.mm.model.gdpr.a.dEc, this.guS.field_username, new c.4(this));
                    }
                  }
                  bool1 = bool2;
                } while ("contact_info_biz_read_msg_online".endsWith(paramString));
                if ("contact_info_stick_biz".equals(paramString))
                {
                  if (((CheckBoxPreference)this.eOE.ZZ("contact_info_stick_biz")).isChecked())
                  {
                    com.tencent.mm.plugin.report.service.h.mEJ.h(13307, new Object[] { this.guS.field_username, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0) });
                    com.tencent.mm.model.i.gy(this.guS.field_username);
                    return true;
                  }
                  s.u(this.guS.field_username, true);
                  com.tencent.mm.plugin.report.service.h.mEJ.h(13307, new Object[] { this.guS.field_username, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(0) });
                  return true;
                }
                if (("contact_info_guarantee_info".equals(paramString)) && (this.dKP.Mr() != null) && (!bi.oW(this.dKP.Mr().dLQ)))
                {
                  localObject1 = new Intent();
                  ((Intent)localObject1).putExtra("rawUrl", this.dKP.Mr().dLQ);
                  ((Intent)localObject1).putExtra("useJs", true);
                  ((Intent)localObject1).putExtra("vertical_scroll", true);
                  ((Intent)localObject1).putExtra("geta8key_scene", 3);
                  com.tencent.mm.bg.d.b(this.bGc, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
                }
                if (paramString.startsWith("contact_info_bizinfo_external#"))
                {
                  int j = bi.getInt(paramString.replace("contact_info_bizinfo_external#", ""), -1);
                  if ((j >= 0) && (j < this.dKO.size()))
                  {
                    paramString = (d.a)this.dKO.get(j);
                    localObject2 = paramString.url;
                    localObject1 = new Intent();
                    ((Intent)localObject1).putExtra("rawUrl", (String)localObject2);
                    ((Intent)localObject1).putExtra("useJs", true);
                    ((Intent)localObject1).putExtra("vertical_scroll", true);
                    ((Intent)localObject1).putExtra("geta8key_scene", 3);
                    ((Intent)localObject1).putExtra("KPublisherId", "brand_profile");
                    ((Intent)localObject1).putExtra("prePublishId", "brand_profile");
                    if (((this.lVQ != null) && ((this.eLK == 39) || (this.eLK == 56) || (this.eLK == 35))) || (this.eLK == 87) || (this.eLK == 89) || (this.eLK == 85) || (this.eLK == 88))
                    {
                      x.d("MicroMsg.ContactWidgetBizInfo", "from biz search.");
                      localObject2 = new Bundle();
                      ((Bundle)localObject2).putBoolean("KFromBizSearch", true);
                      ((Bundle)localObject2).putBundle("KBizSearchExtArgs", this.lVQ);
                      ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject2);
                      if (!com.tencent.mm.l.a.gd(this.guS.field_type)) {
                        break label1097;
                      }
                    }
                    for (i = 7;; i = 6)
                    {
                      j = this.bGc.getResources().getIdentifier(paramString.dKS, "string", this.bGc.getPackageName());
                      paramString = paramString.title;
                      if (j > 0) {
                        paramString = this.bGc.getString(j);
                      }
                      ay(i, paramString);
                      com.tencent.mm.bg.d.b(this.bGc, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
                      return true;
                    }
                  }
                }
                if ((!"contact_info_subscribe_bizinfo".endsWith(paramString)) && (!"contact_info_show_brand".endsWith(paramString)) && (!"contact_info_locate".endsWith(paramString))) {
                  break;
                }
                localObject1 = this.lUs;
                bool1 = bool2;
              } while (localObject1 == null);
              if ("contact_info_subscribe_bizinfo".endsWith(paramString)) {
                if (((com.tencent.mm.ac.d)localObject1).LX()) {
                  if (localObject1 != null)
                  {
                    if (!((com.tencent.mm.ac.d)localObject1).Ma()) {
                      break label1319;
                    }
                    au.DF().a(1363, this);
                    if (!((CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo")).isChecked()) {
                      break label1314;
                    }
                    i = 0;
                    paramString = new com.tencent.mm.plugin.profile.a.b(((com.tencent.mm.ac.d)localObject1).field_username, i);
                    au.DF().a(paramString, 0);
                    localObject2 = this.bGc;
                    this.bGc.getString(R.l.app_tip);
                    this.tipDialog = com.tencent.mm.ui.base.h.a((Context)localObject2, this.bGc.getString(R.l.app_waiting), true, new DialogInterface.OnCancelListener()
                    {
                      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                      {
                        au.DF().c(paramString);
                        au.DF().b(1363, c.this);
                      }
                    });
                  }
                }
              }
              for (;;)
              {
                bool1 = bool2;
                if (((com.tencent.mm.ac.d)localObject1).Ma()) {
                  break;
                }
                bool1 = bool2;
                if (((com.tencent.mm.ac.d)localObject1).LY()) {
                  break;
                }
                a((com.tencent.mm.ac.d)localObject1, false);
                return true;
                i = 4;
                break label1212;
                if (((com.tencent.mm.ac.d)localObject1).LY())
                {
                  paramString = (CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo");
                  z.Nh();
                  localObject2 = ((com.tencent.mm.ac.d)localObject1).field_username;
                  if (!paramString.isChecked()) {}
                  for (bool1 = true;; bool1 = false)
                  {
                    paramString = com.tencent.mm.ac.c.a((String)localObject2, bool1, this);
                    localObject2 = this.bGc;
                    this.bGc.getString(R.l.app_tip);
                    this.tipDialog = com.tencent.mm.ui.base.h.a((Context)localObject2, this.bGc.getString(R.l.app_waiting), true, new c.16(this, paramString));
                    break;
                  }
                  if (((com.tencent.mm.ac.d)localObject1).LQ())
                  {
                    ((com.tencent.mm.ac.d)localObject1).field_brandFlag |= 0x1;
                    if ((this.dKP == null) && (localObject1 != null)) {
                      this.dKP = ((com.tencent.mm.ac.d)localObject1).bG(false);
                    }
                    if ((this.dKP != null) && (this.dKP.Mk()) && (com.tencent.mm.bg.d.QS("brandservice"))) {
                      this.eOE.bw("contact_info_template_recv", false);
                    }
                  }
                  for (;;)
                  {
                    paramString = com.tencent.mm.plugin.report.service.h.mEJ;
                    localObject2 = ((com.tencent.mm.ac.d)localObject1).field_username;
                    if (((com.tencent.mm.ac.d)localObject1).LQ()) {
                      i = 3;
                    }
                    paramString.h(13307, new Object[] { localObject2, Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(0) });
                    break;
                    this.eOE.bw("contact_info_template_recv", true);
                    continue;
                    ((com.tencent.mm.ac.d)localObject1).field_brandFlag &= 0xFFFFFFFE;
                    this.eOE.bw("contact_info_template_recv", true);
                  }
                  if ("contact_info_show_brand".endsWith(paramString))
                  {
                    if ((((com.tencent.mm.ac.d)localObject1).field_brandFlag & 0x2) == 0) {}
                    for (i = 1;; i = 0)
                    {
                      if (i == 0) {
                        break label1661;
                      }
                      ((com.tencent.mm.ac.d)localObject1).field_brandFlag |= 0x2;
                      break;
                    }
                    ((com.tencent.mm.ac.d)localObject1).field_brandFlag &= 0xFFFFFFFD;
                  }
                  else if ("contact_info_locate".endsWith(paramString))
                  {
                    if (((com.tencent.mm.ac.d)localObject1).LR()) {
                      ((com.tencent.mm.ac.d)localObject1).field_brandFlag &= 0xFFFFFFFB;
                    } else {
                      this.lVP = com.tencent.mm.ui.base.h.a(this.bGc, this.bGc.getString(R.l.chatting_biz_report_location_confirm, new Object[] { this.guS.BL() }), this.bGc.getString(R.l.app_tip), new c.1(this, (com.tencent.mm.ac.d)localObject1), new c.12(this, (com.tencent.mm.ac.d)localObject1));
                    }
                  }
                }
              }
              if (!"contact_info_verifyuser".endsWith(paramString)) {
                break;
              }
              paramString = this.lUs;
              bool1 = bool2;
            } while (paramString == null);
            localObject2 = paramString.bG(false);
            bool1 = bool2;
          } while (localObject2 == null);
          localObject1 = null;
          if ((((d.b)localObject2).Mt() != null) && (!bi.oW(((d.b)localObject2).Mt().dLL))) {
            paramString = ((d.b)localObject2).Mt().dLL;
          }
          for (;;)
          {
            bool1 = bool2;
            if (bi.oW(paramString)) {
              break;
            }
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("rawUrl", paramString);
            ((Intent)localObject1).putExtra("useJs", true);
            ((Intent)localObject1).putExtra("vertical_scroll", true);
            ((Intent)localObject1).putExtra("geta8key_scene", 3);
            com.tencent.mm.bg.d.b(this.bGc, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
            return true;
            paramString = (String)localObject1;
            if (((d.b)localObject2).Mu() != null)
            {
              paramString = (String)localObject1;
              if (!bi.oW(((d.b)localObject2).Mu().dLT)) {
                paramString = ((d.b)localObject2).Mu().dLT;
              }
            }
          }
          if (!"contact_info_trademark".endsWith(paramString)) {
            break;
          }
          paramString = this.lUs;
          bool1 = bool2;
        } while (paramString == null);
        bool1 = bool2;
      } while (paramString.bG(false) == null);
      bool1 = bool2;
    } while (bi.oW(paramString.bG(false).Mm()));
    Object localObject1 = new Intent();
    ((Intent)localObject1).putExtra("rawUrl", paramString.bG(false).Mm());
    ((Intent)localObject1).putExtra("useJs", true);
    ((Intent)localObject1).putExtra("vertical_scroll", true);
    ((Intent)localObject1).putExtra("geta8key_scene", 3);
    com.tencent.mm.bg.d.b(this.bGc, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
    return true;
    if ("contact_is_mute".endsWith(paramString))
    {
      if (!this.hEj)
      {
        bool1 = true;
        label2115:
        this.hEj = bool1;
        if (!this.hEj) {
          break label2581;
        }
        s.n(this.guS);
        label2135:
        ha(this.hEj);
      }
    }
    else if ("enterprise_contact_info_enter".equals(paramString))
    {
      if (this.bGc != null) {
        break label2591;
      }
      x.e("MicroMsg.ContactWidgetBizInfo", "EnterEnterprise context is null");
    }
    for (;;)
    {
      if ("contact_info_biz_disable".equals(paramString))
      {
        localObject1 = this.bGc.getString(R.l.enterprise_contact_info_disable_sub_confirm);
        localObject2 = this.bGc.getString(R.l.enterprise_contact_info_disable_sub);
        com.tencent.mm.ui.base.h.a(this.bGc, (String)localObject1, "", (String)localObject2, this.bGc.getString(R.l.app_cancel), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            c.this.gZ(false);
          }
        }, null);
      }
      if ("contact_info_biz_enable".equals(paramString)) {
        gZ(true);
      }
      if ("contact_info_template_recv".equals(paramString))
      {
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("enterprise_biz_name", this.lUs.field_username);
        com.tencent.mm.bg.d.b(this.bGc, "brandservice", ".ui.ReceiveTemplateMsgMgrUI", (Intent)localObject1);
      }
      if ("contact_info_service_phone".equals(paramString))
      {
        localObject1 = this.eOE.ZZ("contact_info_service_phone");
        if ((localObject1 != null) && (((Preference)localObject1).getSummary() != null) && (!bi.oW(((Preference)localObject1).getSummary().toString())))
        {
          localObject1 = ((Preference)localObject1).getSummary().toString();
          com.tencent.mm.ui.base.h.a(this.bGc, true, (String)localObject1, "", this.bGc.getString(R.l.contact_info_dial), this.bGc.getString(R.l.app_cancel), new c.7(this, (String)localObject1), null);
        }
      }
      if ("contact_info_expose_btn".equals(paramString)) {
        bnt();
      }
      bool1 = bool2;
      if (!paramString.equals("biz_placed_to_the_top")) {
        break;
      }
      x.d("MicroMsg.ContactWidgetBizInfo", "changePlacedTop");
      if (this.duR == null) {
        this.duR = this.bGc.getSharedPreferences(this.bGc.getPackageName() + "_preferences", 0);
      }
      bool1 = bool2;
      if (this.guS == null) {
        break;
      }
      if (!this.guS.BG()) {
        break label2662;
      }
      x.d("MicroMsg.ContactWidgetBizInfo", "unSetPlaceTop:%s", new Object[] { this.guS.field_username });
      s.u(this.guS.field_username, true);
      this.duR.edit().putBoolean("biz_placed_to_the_top", false).commit();
      return true;
      bool1 = false;
      break label2115;
      label2581:
      s.o(this.guS);
      break label2135;
      label2591:
      if (this.lUs == null)
      {
        x.e("MicroMsg.ContactWidgetBizInfo", "EnterEnterprise bizInfo is null");
      }
      else
      {
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("enterprise_biz_name", this.lUs.field_username);
        ((Intent)localObject1).addFlags(67108864);
        com.tencent.mm.bg.d.b(this.bGc, "brandservice", ".ui.EnterpriseBizContactListUI", (Intent)localObject1);
      }
    }
    label2662:
    com.tencent.mm.model.i.gy(this.guS.field_username);
    x.d("MicroMsg.ContactWidgetBizInfo", "setPlaceTop:%s", new Object[] { this.guS.field_username });
    this.duR.edit().putBoolean("biz_placed_to_the_top", true).commit();
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */