package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.Toast;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.af;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.openim.a.c.a;
import com.tencent.mm.openim.a.c.b;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.sns.b.h;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.TextPreference;
import com.tencent.mm.ui.base.s;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;
import org.json.JSONException;
import org.json.JSONObject;

@com.tencent.mm.sdk.platformtools.f(chx={ContactInfoUI.class})
public final class k
  implements com.tencent.mm.ab.e, h.a, com.tencent.mm.pluginsdk.b.a
{
  String bHY = null;
  private int bNv = 0;
  Activity bOb;
  int eLK;
  private com.tencent.mm.ui.base.preference.f eOE;
  ab guS;
  u hLB;
  String hMQ;
  private String juZ;
  private String kiv;
  private boolean lUD;
  private boolean lUE;
  private int lWd;
  private bqd lWj = new bqd();
  private boolean lWk;
  private String lWl = "";
  private int lWm = -1;
  private boolean lWn = false;
  private boolean lWo = false;
  private String lWp;
  private boolean lWq = false;
  private boolean lWr = false;
  private String lWs = null;
  private String lWt = null;
  private int lWu;
  String lWv;
  com.tencent.mm.sdk.b.c<com.tencent.mm.g.a.ap> lWw = new k.3(this);
  
  public k(Activity paramActivity)
  {
    this.bOb = paramActivity;
  }
  
  private void bnp()
  {
    Object localObject5 = null;
    auw();
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(R.o.contact_info_pref_normal);
    if (n.nkC != null) {
      n.nkC.a(3, this.guS.field_username, this);
    }
    com.tencent.mm.model.au.DF().a(30, this);
    com.tencent.mm.model.au.DF().a(453, this);
    this.lWv = "";
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactWidgetNormal", "isCancelMatchPhoneMD5 %s", new Object[] { this.guS.BH() });
    Object localObject1;
    Object localObject6;
    Object localObject3;
    if (!this.guS.BH())
    {
      localObject1 = this.bOb.getIntent().getStringExtra("Contact_Mobile_MD5");
      localObject6 = this.bOb.getIntent().getStringExtra("Contact_full_Mobile_MD5");
      if ((!bi.oW((String)localObject1)) || (!bi.oW((String)localObject6))) {
        break label740;
      }
      if (bi.oW(this.guS.field_username)) {
        break label4832;
      }
      localObject3 = com.tencent.mm.plugin.account.b.getAddrUploadStg().pp(this.guS.field_username);
      localObject6 = this.guS.field_username;
      if (localObject3 != null) {
        break label732;
      }
      localObject1 = "true";
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactWidgetNormal", "Contact name: %s AddrUpload IS NULL? %s", new Object[] { localObject6, localObject1 });
      localObject1 = localObject3;
    }
    for (;;)
    {
      if ((localObject1 != null) && (!bi.oW(((com.tencent.mm.plugin.account.friend.a.a)localObject1).Xh())))
      {
        this.lWv = bi.oV(((com.tencent.mm.plugin.account.friend.a.a)localObject1).Xp()).replace(" ", "");
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactWidgetNormal", "Contact name: %s mMobileByMD5: %s", new Object[] { this.guS.field_username, this.lWv });
      }
      localObject6 = (NormalUserHeaderPreference)this.eOE.ZZ("contact_info_header_normal");
      Object localObject8;
      label439:
      int j;
      if (localObject6 != null)
      {
        localObject1 = this.guS;
        i = this.eLK;
        localObject3 = this.juZ;
        localObject7 = this.lWv;
        localObject8 = this.guS.csZ;
        ((NormalUserHeaderPreference)localObject6).qGi = ((String)localObject7);
        ((NormalUserHeaderPreference)localObject6).qGj = ((String)localObject8);
        ((NormalUserHeaderPreference)localObject6).a((ab)localObject1, i, (String)localObject3);
        ((NormalUserHeaderPreference)localObject6).bo(this.guS.field_username, this.lWn);
        ((NormalUserHeaderPreference)localObject6).qPn = new k.1(this);
        if (com.tencent.mm.l.a.gd(this.guS.field_type)) {
          this.lWo = false;
        }
        ((NormalUserHeaderPreference)localObject6).bp(this.guS.field_username, this.lWo);
        if ((!ab.XR(this.guS.field_username)) || (this.guS.ctd == 0)) {
          break label1176;
        }
        j = this.eOE.indexOf("contact_info_category_1");
        localObject1 = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.openim.a.b.class)).i(this.guS.field_openImAppid, "openim_custom_info_header", b.a.eui);
        if (!TextUtils.isEmpty((CharSequence)localObject1))
        {
          localObject3 = new PreferenceTitleCategory(this.bOb);
          ((Preference)localObject3).setTitle((CharSequence)localObject1);
          this.eOE.a((Preference)localObject3, j);
        }
        localObject1 = new com.tencent.mm.openim.a.c();
        ((com.tencent.mm.openim.a.c)localObject1).oE(this.guS.cte);
        localObject1 = ((com.tencent.mm.openim.a.c)localObject1).eul.iterator();
        label578:
        if (((Iterator)localObject1).hasNext())
        {
          localObject3 = (c.a)((Iterator)localObject1).next();
          localObject7 = ((c.a)localObject3).eum.iterator();
          i = j;
        }
      }
      else
      {
        for (;;)
        {
          j = i;
          if (!((Iterator)localObject7).hasNext()) {
            break label578;
          }
          localObject8 = (c.b)((Iterator)localObject7).next();
          j = i + 1;
          k.4 local4 = new k.4(this, this.bOb, (c.b)localObject8);
          local4.tmc = ((c.a)localObject3).title;
          local4.setSummary(j.a(this.bOb, ((c.b)localObject8).oF(this.guS.field_openImAppid)));
          this.eOE.a(local4, j);
          if ((((c.b)localObject8).action == 0) || (((c.b)localObject8).action == 1))
          {
            local4.setEnabled(true);
            i = j;
            continue;
            label732:
            localObject1 = "false";
            break;
            label740:
            if ((bi.oW((String)localObject1)) && (bi.oW((String)localObject6))) {
              break label4832;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactWidgetNormal", "Contact name: %s mMobileByMD5: %s mobileFullMD5:%s", new Object[] { this.guS.field_username, localObject1, localObject6 });
            localObject3 = com.tencent.mm.plugin.account.b.getAddrUploadStg().pq((String)localObject1);
            if (localObject3 != null)
            {
              localObject1 = localObject3;
              if (!bi.oW(((com.tencent.mm.plugin.account.friend.a.a)localObject3).Xh())) {}
            }
            else
            {
              localObject1 = com.tencent.mm.plugin.account.b.getAddrUploadStg().pq((String)localObject6);
            }
            localObject6 = this.guS.field_username;
            if (localObject1 == null) {}
            for (localObject3 = "true";; localObject3 = "false")
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactWidgetNormal", "Contact name: %s AddrUpload IS NULL? %s", new Object[] { localObject6, localObject3 });
              break;
            }
            this.eOE.c((Preference)localObject6);
            break label439;
          }
          if (((c.b)localObject8).action == 2)
          {
            local4.tDk = new k.5(this, (c.b)localObject8, (c.a)localObject3);
            i = j;
          }
          else if (((c.b)localObject8).action == 3)
          {
            local4.tDk = new k.6(this, (c.b)localObject8, (c.a)localObject3);
            i = j;
          }
          else if (((c.b)localObject8).action == 4)
          {
            local4.tDk = new k.7(this, (c.b)localObject8, (c.a)localObject3);
            i = j;
          }
          else
          {
            i = j;
            if (((c.b)localObject8).action == 5)
            {
              local4.tDk = new k.8(this, (c.b)localObject8, (c.a)localObject3);
              i = j;
            }
          }
        }
      }
      int i = j + 1;
      this.eOE.a(new PreferenceSmallCategory(this.bOb), i);
      localObject1 = new KeyValuePreference(this.bOb);
      ((KeyValuePreference)localObject1).setTitle(R.l.contact_info_enterprise_from);
      localObject3 = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.openim.a.b.class)).i(this.guS.field_openImAppid, "openim_intro_desc", b.a.eui);
      ((KeyValuePreference)localObject1).setSummary(j.a(this.bOb, (CharSequence)localObject3));
      Object localObject7 = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.openim.a.b.class)).i(this.guS.field_openImAppid, "openim_intro_url", b.a.euj);
      if (!TextUtils.isEmpty((CharSequence)localObject7)) {
        ((Preference)localObject1).tDk = new k.9(this, (String)localObject7, (String)localObject3);
      }
      this.eOE.a((Preference)localObject1, i + 1);
      label1176:
      label1292:
      label1401:
      label1441:
      label1517:
      long l;
      if (!bi.oW(this.guS.getProvince()))
      {
        localObject3 = (KeyValuePreference)this.eOE.ZZ("contact_info_district");
        if (localObject3 != null)
        {
          ((KeyValuePreference)localObject3).setTitle(this.bOb.getString(R.l.contact_info_district));
          localObject7 = new StringBuilder().append(r.gV(this.guS.getProvince()));
          if (bi.oW(this.guS.getCity()))
          {
            localObject1 = "";
            ((KeyValuePreference)localObject3).setSummary((String)localObject1);
            ((KeyValuePreference)localObject3).lO(false);
            ((KeyValuePreference)localObject3).setEnabled(false);
          }
        }
        else
        {
          if ((this.guS.signature == null) || (this.guS.signature.trim().equals("")) || (com.tencent.mm.l.a.gd(this.guS.field_type))) {
            break label2337;
          }
          localObject1 = (KeyValuePreference)this.eOE.ZZ("contact_info_signature");
          if (localObject1 != null)
          {
            ((KeyValuePreference)localObject1).tCA = false;
            ((KeyValuePreference)localObject1).setTitle(this.bOb.getString(R.l.contact_info_signature));
            ((KeyValuePreference)localObject1).setSummary(j.a(this.bOb, this.guS.signature));
            ((KeyValuePreference)localObject1).lO(false);
          }
          this.eOE.ZZ("contact_info_facebook");
          this.eOE.aaa("contact_info_facebook");
          if ((this.lWj.eJS & 0x1) <= 0) {
            break label2353;
          }
          i = 1;
          if (((i & com.tencent.mm.bg.d.QS("sns")) == 0) || (ab.XP(this.guS.field_username)) || (this.guS.BA())) {
            break label2358;
          }
          localObject1 = (com.tencent.mm.ui.base.preference.g)this.eOE.ZZ("contact_info_sns");
          if ((localObject1 != null) && (n.nky != null)) {
            ((com.tencent.mm.ui.base.preference.g)localObject1).TS(this.guS.field_username);
          }
          this.eOE.aaa("contact_info_verifyuser");
          if (this.eLK == 96) {
            this.eOE.aaa("contact_info_footer_normal");
          }
          if (!com.tencent.mm.l.a.gd(this.guS.field_type)) {
            break label2492;
          }
          localObject3 = new int[7];
          localObject7 = (ContactMoreInfoPreference)this.eOE.ZZ("contact_info_more");
          if (localObject7 != null)
          {
            l = this.bOb.getIntent().getLongExtra("Contact_Uin", 0L);
            if ((l == -1L) || (new com.tencent.mm.a.o(l).longValue() <= 0L)) {
              break label2374;
            }
            ((ContactMoreInfoPreference)localObject7).uF(0);
            localObject3[0] = 0;
            label1643:
            if ((bi.oW(this.kiv)) || (bi.oW(this.lWp))) {
              break label2390;
            }
            ((ContactMoreInfoPreference)localObject7).uH(0);
            localObject3[1] = 0;
            label1674:
            localObject1 = com.tencent.mm.k.g.AT().getValue("LinkedinPluginClose");
            if ((!bi.oW((String)localObject1)) && (Integer.valueOf((String)localObject1).intValue() != 0)) {
              break label2406;
            }
            i = 1;
            label1706:
            if ((i == 0) || (bi.oW(this.guS.csV))) {
              break label2411;
            }
            ((ContactMoreInfoPreference)localObject7).uG(0);
            localObject3[2] = 0;
            label1734:
            if (!q.GF().equals(this.guS.field_username)) {
              break label2427;
            }
            com.tencent.mm.model.au.HU();
            localObject1 = (String)com.tencent.mm.model.c.DT().get(aa.a.sRy, null);
            label1769:
            if (bi.oW((String)localObject1)) {
              break label2454;
            }
          }
        }
      }
      for (;;)
      {
        boolean bool1;
        try
        {
          localObject1 = new JSONObject((String)localObject1).optString("ShopUrl");
          if (bi.oW((String)localObject1)) {
            break label2460;
          }
          ((ContactMoreInfoPreference)localObject7).uI(0);
          localObject3[3] = 0;
          if (!bi.oW(this.guS.signature)) {
            break label2476;
          }
          localObject3[4] = 8;
          if (this.guS.getSource() > 0) {
            break label2484;
          }
          localObject3[5] = 8;
          localObject3[6] = 8;
          this.eOE.bw("contact_info_more", false);
          this.eOE.aaa("contact_info_social");
          if (!com.tencent.mm.l.a.gd(this.guS.field_type)) {
            break label2991;
          }
          this.eOE.aaa("contact_info_source");
          this.eOE.bw("contact_info_invite_source", true);
          boolean bool2 = this.bOb.getIntent().getBooleanExtra("Is_RoomOwner", false);
          if ((this.eLK == 14) && (bool2) && (this.hLB != null) && (!this.guS.field_username.equals(this.hLB.field_roomowner))) {
            break label4561;
          }
          i = this.eLK;
          if (this.hLB != null) {
            break label4555;
          }
          bool1 = true;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactWidgetNormal", "[initInviteSource] addContactScene:%s isOwner:%s null == member:%s", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
          this.eOE.bw("contact_info_invite_source", true);
          localObject1 = (NormalUserFooterPreference)this.eOE.ZZ("contact_info_footer_normal");
          bool1 = this.bOb.getIntent().getBooleanExtra("User_From_Fmessage", false);
          bool2 = this.bOb.getIntent().getBooleanExtra("Contact_FMessageCard", false);
          this.bOb.getIntent().getBooleanExtra("Contact_KHideExpose", false);
          l = this.bOb.getIntent().getLongExtra("Contact_Uin", -1L);
          if ((this.eLK == 30) || (this.eLK == 45)) {
            this.lWk = false;
          }
          if ((localObject1 == null) || (!((NormalUserFooterPreference)localObject1).a(this.guS, this.juZ, this.lUD, this.lUE, this.lWk, this.eLK, this.lWd, bool2, bool1, l, this.lWl))) {
            break label4816;
          }
          ((NormalUserFooterPreference)localObject1).dHn.removeAll();
          ((NormalUserFooterPreference)localObject1).dHn.a(new k.10(this, (NormalUserHeaderPreference)localObject6), Looper.getMainLooper());
          i = this.guS.csN;
          this.eOE.aaa("clear_lbs_info");
          if (this.lWr)
          {
            this.eOE.removeAll();
            if (localObject6 != null) {
              this.eOE.a((Preference)localObject6);
            }
            if (localObject1 != null) {
              this.eOE.a((Preference)localObject1);
            }
          }
          return;
        }
        catch (JSONException localJSONException1)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ContactWidgetNormal", localJSONException1, "", new Object[0]);
        }
        localObject1 = "  " + this.guS.getCity();
        break;
        this.eOE.aaa("contact_info_district");
        break label1292;
        label2337:
        this.eOE.aaa("contact_info_signature");
        break label1401;
        label2353:
        i = 0;
        break label1441;
        label2358:
        this.eOE.aaa("contact_info_sns");
        break label1517;
        label2374:
        ((ContactMoreInfoPreference)localObject7).uF(8);
        localObject3[0] = 8;
        break label1643;
        label2390:
        ((ContactMoreInfoPreference)localObject7).uH(8);
        localObject3[1] = 8;
        break label1674;
        label2406:
        i = 0;
        break label1706;
        label2411:
        ((ContactMoreInfoPreference)localObject7).uG(8);
        localObject3[2] = 8;
        break label1734;
        label2427:
        localObject1 = this.guS.csY;
        break label1769;
        label2454:
        localObject2 = null;
        continue;
        label2460:
        ((ContactMoreInfoPreference)localObject7).uI(8);
        localObject3[3] = 8;
        continue;
        label2476:
        localObject3[4] = 0;
        continue;
        label2484:
        localObject3[5] = 0;
        continue;
        label2492:
        localObject7 = (ContactSocialInfoPreference)this.eOE.ZZ("contact_info_social");
        if (localObject7 != null)
        {
          if (bi.oW(this.lWv)) {
            break label2903;
          }
          ((ContactSocialInfoPreference)localObject7).uJ(0);
          this.lWu = 1;
          label2535:
          com.tencent.mm.model.au.HU();
          i = bi.f((Integer)com.tencent.mm.model.c.DT().get(9, null));
          l = this.bOb.getIntent().getLongExtra("Contact_Uin", 0L);
          localObject2 = this.bOb.getIntent().getStringExtra("Contact_QQNick");
          if ((l != 0L) && (i != 0))
          {
            if ((localObject2 == null) || (((String)localObject2).length() == 0))
            {
              localObject3 = com.tencent.mm.plugin.account.b.getQQListStg().bK(l);
              localObject2 = localObject3;
              if (localObject3 == null) {
                localObject2 = null;
              }
              if (localObject2 != null) {
                ((ao)localObject2).getDisplayName();
              }
            }
            if ((l == -1L) || (new com.tencent.mm.a.o(l).longValue() <= 0L)) {
              break label2913;
            }
            ((ContactSocialInfoPreference)localObject7).uF(0);
            this.lWu = 1;
          }
          label2675:
          if ((bi.oW(this.kiv)) || (bi.oW(this.lWp))) {
            break label2923;
          }
          ((ContactSocialInfoPreference)localObject7).uH(0);
          this.lWu = 1;
          label2706:
          localObject2 = com.tencent.mm.k.g.AT().getValue("LinkedinPluginClose");
          if ((!bi.oW((String)localObject2)) && (Integer.valueOf((String)localObject2).intValue() != 0)) {
            break label2933;
          }
          i = 1;
          label2738:
          if ((i == 0) || (bi.oW(this.guS.csV))) {
            break label2938;
          }
          ((ContactSocialInfoPreference)localObject7).uG(0);
          this.lWu = 1;
          label2766:
          if (!q.GF().equals(this.guS.field_username)) {
            break label2948;
          }
          com.tencent.mm.model.au.HU();
          localObject2 = (String)com.tencent.mm.model.c.DT().get(aa.a.sRy, null);
          label2801:
          if (bi.oW((String)localObject2)) {
            break label2975;
          }
        }
        label2903:
        label2913:
        label2923:
        label2933:
        label2938:
        label2948:
        label2975:
        Object localObject4;
        for (;;)
        {
          try
          {
            localObject3 = new JSONObject((String)localObject2).optString("ShopUrl");
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactWidgetNormal", "weiShopInfo:%s, shopUrl:%s", new Object[] { localObject2, localObject3 });
            if (bi.oW((String)localObject3)) {
              break label2981;
            }
            ((ContactSocialInfoPreference)localObject7).uI(0);
            this.lWu = 1;
            if (this.lWu == 0) {
              this.eOE.aaa("contact_info_social");
            }
            this.eOE.aaa("contact_info_more");
          }
          catch (JSONException localJSONException2)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ContactWidgetNormal", localJSONException2, "", new Object[0]);
          }
          ((ContactSocialInfoPreference)localObject7).uJ(8);
          break label2535;
          ((ContactSocialInfoPreference)localObject7).uF(8);
          break label2675;
          ((ContactSocialInfoPreference)localObject7).uH(8);
          break label2706;
          i = 0;
          break label2738;
          ((ContactSocialInfoPreference)localObject7).uG(8);
          break label2766;
          localObject2 = this.guS.csY;
          break label2801;
          localObject4 = null;
          continue;
          label2981:
          ((ContactSocialInfoPreference)localObject7).uI(8);
        }
        label2991:
        i = this.bOb.getIntent().getIntExtra("Contact_Source_FMessage", 0);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetNormal", "initFriendSource, contact source = " + this.guS.getSource() + ", sourceFMessage = " + i);
        if (i != 0)
        {
          localObject7 = (KeyValuePreference)this.eOE.ZZ("contact_info_source");
          if (!this.lUE)
          {
            if (localObject7 != null) {
              if (i == 10)
              {
                ((KeyValuePreference)localObject7).tCA = false;
                ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
                ((KeyValuePreference)localObject7).setSummary(this.bOb.getString(R.l.fmessage_come_from_mobile));
                ((KeyValuePreference)localObject7).lO(false);
              }
              else
              {
                this.eOE.c((Preference)localObject7);
              }
            }
          }
          else {
            switch (i)
            {
            default: 
              this.eOE.c((Preference)localObject7);
              break;
            case 1: 
              if (localObject7 == null) {
                continue;
              }
              ((KeyValuePreference)localObject7).tCA = false;
              ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject7).setSummary(R.l.contact_info_source_by_search_qq_passive);
              ((KeyValuePreference)localObject7).lO(false);
              break;
            case 3: 
              if (localObject7 == null) {
                continue;
              }
              ((KeyValuePreference)localObject7).tCA = false;
              ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject7).setSummary(R.l.contact_info_source_by_search_wechat_passive);
              ((KeyValuePreference)localObject7).lO(false);
              break;
            case 17: 
              if (localObject7 == null) {
                continue;
              }
              ((KeyValuePreference)localObject7).tCA = false;
              ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              localObject4 = r.gT(this.bOb.getIntent().getStringExtra("source_from_user_name"));
              localObject2 = localObject4;
              if (bi.oW((String)localObject4)) {
                localObject2 = this.bOb.getIntent().getStringExtra("source_from_nick_name");
              }
              if (bi.oW((String)localObject2)) {
                ((KeyValuePreference)localObject7).setSummary(R.l.contact_info_source_by_card_passive);
              }
              for (;;)
              {
                ((KeyValuePreference)localObject7).lO(false);
                break;
                ((KeyValuePreference)localObject7).setSummary(j.a(this.bOb, this.bOb.getString(R.l.contact_info_source_by_card_before_verify_passive, new Object[] { localObject2 })));
              }
            case 8: 
            case 14: 
              if (localObject7 == null) {
                continue;
              }
              ((KeyValuePreference)localObject7).tCA = false;
              ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              localObject2 = com.tencent.mm.az.d.SE().YN(this.guS.field_username);
              com.tencent.mm.model.au.HU();
              localObject4 = com.tencent.mm.model.c.FR();
              if (localObject2 == null)
              {
                localObject2 = "";
                localObject4 = ((ay)localObject4).Yg((String)localObject2);
                localObject2 = localObject5;
                if (localObject4 != null) {
                  localObject2 = ((ai)localObject4).field_nickname;
                }
                if (bi.oW((String)localObject2)) {
                  break label3660;
                }
                ((KeyValuePreference)localObject7).setSummary(this.bOb.getString(R.l.contact_info_source_by_chatroom_to_add_passive, new Object[] { localObject2 }));
              }
              for (;;)
              {
                ((KeyValuePreference)localObject7).lO(false);
                break;
                localObject2 = ((at)localObject2).field_chatroomName;
                break label3582;
                ((KeyValuePreference)localObject7).setSummary(R.l.contact_info_source_by_chatroom_passive);
              }
            case 4: 
            case 12: 
              if (localObject7 == null) {
                continue;
              }
              ((KeyValuePreference)localObject7).tCA = false;
              ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject7).setSummary(this.bOb.getString(R.l.fmessage_come_from_qq));
              ((KeyValuePreference)localObject7).lO(false);
              break;
            case 10: 
            case 13: 
              if (localObject7 == null) {
                continue;
              }
              ((KeyValuePreference)localObject7).tCA = false;
              ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject7).setSummary(R.l.contact_info_source_by_view_address_book_passive);
              ((KeyValuePreference)localObject7).lO(false);
              break;
            case 25: 
              if (localObject7 == null) {
                continue;
              }
              ((KeyValuePreference)localObject7).tCA = false;
              ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject7).setSummary(R.l.contact_info_source_by_bottle_passive);
              ((KeyValuePreference)localObject7).lO(false);
              break;
            case 30: 
              if (localObject7 == null) {
                continue;
              }
              ((KeyValuePreference)localObject7).tCA = false;
              ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject7).setSummary(R.l.contact_info_source_by_qrcode_passive);
              ((KeyValuePreference)localObject7).lO(false);
              break;
            case 58: 
            case 59: 
            case 60: 
              if (localObject7 == null) {
                continue;
              }
              ((KeyValuePreference)localObject7).tCA = false;
              ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject7).setSummary(this.bOb.getString(R.l.gcontact_from_source));
              ((KeyValuePreference)localObject7).lO(false);
              break;
            case 48: 
              if (localObject7 == null) {
                continue;
              }
              ((KeyValuePreference)localObject7).tCA = false;
              ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject7).setSummary(this.bOb.getString(R.l.contact_info_source_by_raddar));
              ((KeyValuePreference)localObject7).lO(false);
              break;
            case 15: 
              if (localObject7 == null) {
                continue;
              }
              ((KeyValuePreference)localObject7).tCA = false;
              ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject7).setSummary(R.l.contact_info_source_by_search_mobile_passive);
              ((KeyValuePreference)localObject7).lO(false);
              break;
            case 18: 
              label3582:
              label3660:
              if (localObject7 == null) {
                continue;
              }
              ((KeyValuePreference)localObject7).tCA = false;
              ((KeyValuePreference)localObject7).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject7).setSummary(R.l.contact_info_source_by_lbs_passive);
              ((KeyValuePreference)localObject7).lO(false);
              break;
            }
          }
        }
        else
        {
          localObject2 = (KeyValuePreference)this.eOE.ZZ("contact_info_source");
          if (this.lUE)
          {
            switch (this.guS.getSource())
            {
            default: 
              this.eOE.c((Preference)localObject2);
              break;
            case 18: 
              if (localObject2 == null) {
                continue;
              }
              ((KeyValuePreference)localObject2).tCA = false;
              ((KeyValuePreference)localObject2).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject2).setSummary(R.l.contact_info_source_by_lbs_passive);
              ((KeyValuePreference)localObject2).lO(false);
              break;
            case 30: 
              if (localObject2 == null) {
                continue;
              }
              ((KeyValuePreference)localObject2).tCA = false;
              ((KeyValuePreference)localObject2).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject2).setSummary(R.l.contact_info_source_by_qrcode_passive);
              ((KeyValuePreference)localObject2).lO(false);
              break;
            case 48: 
              if (localObject2 == null) {
                continue;
              }
              ((KeyValuePreference)localObject2).tCA = false;
              ((KeyValuePreference)localObject2).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject2).setSummary(this.bOb.getString(R.l.contact_info_source_by_raddar));
              ((KeyValuePreference)localObject2).lO(false);
              break;
            case 22: 
            case 23: 
            case 24: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
              if (localObject2 == null) {
                continue;
              }
              ((KeyValuePreference)localObject2).tCA = false;
              ((KeyValuePreference)localObject2).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject2).setSummary(R.l.contact_info_source_by_shake_passive);
              ((KeyValuePreference)localObject2).lO(false);
              break;
            case 34: 
              if (localObject2 == null) {
                continue;
              }
              ((KeyValuePreference)localObject2).tCA = false;
              ((KeyValuePreference)localObject2).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject2).setSummary(this.bOb.getString(R.l.contact_info_source_brandqa));
              ((KeyValuePreference)localObject2).lO(false);
              break;
            case 58: 
            case 59: 
            case 60: 
              if (localObject2 == null) {
                continue;
              }
              ((KeyValuePreference)localObject2).tCA = false;
              ((KeyValuePreference)localObject2).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject2).setSummary(this.bOb.getString(R.l.gcontact_from_source));
              ((KeyValuePreference)localObject2).lO(false);
              break;
            case 76: 
              if (localObject2 == null) {
                continue;
              }
              ((KeyValuePreference)localObject2).tCA = false;
              ((KeyValuePreference)localObject2).setTitle(this.bOb.getString(R.l.contact_info_source_title));
              ((KeyValuePreference)localObject2).setSummary(this.bOb.getString(R.l.contact_info_source_by_linkedin));
              ((KeyValuePreference)localObject2).lO(false);
              break;
            }
          }
          else
          {
            this.eOE.c((Preference)localObject2);
            continue;
            label4555:
            bool1 = false;
            continue;
            label4561:
            this.bHY = this.bOb.getIntent().getStringExtra("inviteer");
            if (bi.oW(this.bHY))
            {
              localObject2 = this.hLB.XK(this.guS.field_username);
              if (localObject2 != null) {
                break label4724;
              }
            }
            label4724:
            for (localObject2 = "";; localObject2 = bi.aG(((com.tencent.mm.i.a.a.b)localObject2).daC, ""))
            {
              this.bHY = ((String)localObject2);
              if (bi.oW(this.bHY)) {
                this.bHY = com.tencent.mm.model.m.K(this.guS.field_username, this.hMQ);
              }
              if (!bi.oW(this.bHY)) {
                break label4739;
              }
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ContactWidgetNormal", "mRoomId:%s member:%s , inviteer is null!", new Object[] { this.hMQ, this.guS.field_username });
              this.lWw.cht();
              am.a.dBr.a(this.guS.field_username, this.hMQ, new k.11(this));
              break;
            }
            label4739:
            this.bOb.getIntent().putExtra("inviteer", this.bHY);
            localObject2 = gT(this.bHY);
            if (bi.oW((String)localObject2))
            {
              am.a.dBr.a(this.guS.field_username, "", new k.2(this));
            }
            else
            {
              ee(this.bHY, (String)localObject2);
              continue;
              label4816:
              this.eOE.aaa("contact_info_footer_normal");
            }
          }
        }
      }
      label4832:
      Object localObject2 = null;
    }
  }
  
  final void JG(String paramString)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ContactWidgetNormal", "view stranger remark, username is null");
      return;
    }
    paramString = new Intent();
    paramString.putExtra("Contact_Scene", this.eLK);
    paramString.putExtra("Contact_mode_name_type", 0);
    paramString.putExtra("Contact_ModStrangerRemark", true);
    paramString.putExtra("Contact_User", this.guS.field_username);
    paramString.putExtra("Contact_Nick", this.guS.field_nickname);
    paramString.putExtra("Contact_RemarkName", this.guS.field_conRemark);
    com.tencent.mm.plugin.profile.a.ezn.o(paramString, this.bOb);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml.getType() != 30) && (paraml.getType() != 458)) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ContactWidgetNormal", "not expected scene,  type = " + paraml.getType());
    }
    label268:
    do
    {
      do
      {
        do
        {
          return;
          if ((paramInt1 != 0) || (paramInt2 != 0)) {
            break label268;
          }
          if (paraml.getType() != 30) {
            break;
          }
          paramString = (com.tencent.mm.pluginsdk.model.m)paraml;
        } while (((paramString.bOh != 1) && (paramString.bOh != 3)) || ((paramString.qyZ != null) && (!paramString.qyZ.contains(this.guS.field_username))));
        paramString = (NormalUserHeaderPreference)this.eOE.ZZ("contact_info_header_normal");
        NormalUserFooterPreference localNormalUserFooterPreference = (NormalUserFooterPreference)this.eOE.ZZ("contact_info_footer_normal");
        if ((paramString != null) && (localNormalUserFooterPreference != null) && (localNormalUserFooterPreference.lXv))
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetNormal", "happy update remark change");
          this.lWn = false;
          this.lWo = false;
          paramString.bo(this.guS.field_username, false);
          paramString.bp(this.guS.field_username, false);
          paramString.jX(this.guS.field_username);
          this.bOb.getIntent().putExtra("Contact_NeedShowChangeRemarkButton", this.lWn);
          this.bOb.getIntent().putExtra("Contact_NeedShowChangeSnsPreButton", this.lWo);
        }
      } while (paraml.getType() != 453);
      bnp();
      return;
    } while ((paramInt1 != 4) || (paramInt2 != -24) || (bi.oW(paramString)));
    Toast.makeText(this.bOb, paramString, 1).show();
  }
  
  public final void a(boolean paramBoolean1, String paramString, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong) {}
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong)
  {
    paramString = (com.tencent.mm.ui.base.preference.g)this.eOE.ZZ("contact_info_sns");
    if ((paramString != null) && (n.nky != null)) {
      paramString.TS(this.guS.field_username);
    }
    this.lWj = n.nky.b(this.guS.field_username, this.lWj);
    this.eOE.notifyDataSetChanged();
    if (paramBoolean3)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactWidgetNormal", "bg Change!");
      if (n.nkC != null) {
        n.nkC.Ly(this.guS.field_username);
      }
    }
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    int i = 0;
    boolean bool;
    if (paramab != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bi.oV(paramab.field_username).length() <= 0) {
        break label588;
      }
      bool = true;
      label31:
      Assert.assertTrue(bool);
      if (paramf == null) {
        break label594;
      }
      bool = true;
      label43:
      Assert.assertTrue(bool);
      this.eOE = paramf;
      this.guS = paramab;
      this.lUD = paramBoolean;
      this.eLK = paramInt;
      this.lUE = this.bOb.getIntent().getBooleanExtra("User_Verify", false);
      this.juZ = bi.oV(this.bOb.getIntent().getStringExtra("Verify_ticket"));
      this.lWk = this.bOb.getIntent().getBooleanExtra("Contact_IsLBSFriend", false);
      this.lWd = this.bOb.getIntent().getIntExtra("Kdel_from", -1);
      this.lWl = this.bOb.getIntent().getStringExtra("Contact_RemarkName");
      this.bNv = this.bOb.getIntent().getIntExtra("Sns_from_Scene", 0);
      this.lWn = this.bOb.getIntent().getBooleanExtra("Contact_NeedShowChangeRemarkButton", false);
      this.lWo = this.bOb.getIntent().getBooleanExtra("Contact_NeedShowChangeSnsPreButton", false);
      this.lWm = this.bOb.getIntent().getIntExtra("Contact_KSnsIFlag", -1);
      long l = this.bOb.getIntent().getLongExtra("Contact_KSnsBgId", -1L);
      paramf = bi.aG(this.bOb.getIntent().getStringExtra("Contact_KSnsBgUrl"), "");
      this.kiv = bi.aG(this.bOb.getIntent().getStringExtra("verify_gmail"), "");
      this.lWp = bi.aG(this.bOb.getIntent().getStringExtra("profileName"), bi.Xe(this.kiv));
      this.lWj.eJS = this.lWm;
      this.lWj.eJU = l;
      this.lWj.eJT = paramf;
      this.lWs = this.bOb.getIntent().getStringExtra("KLinkedInAddFriendNickName");
      this.lWt = this.bOb.getIntent().getStringExtra("KLinkedInAddFriendPubUrl");
      if (n.nky != null) {
        this.lWj = n.nky.b(paramab.field_username, this.lWj);
      }
      this.hMQ = this.bOb.getIntent().getStringExtra("room_name");
      com.tencent.mm.model.au.HU();
      this.hLB = com.tencent.mm.model.c.Ga().ih(this.hMQ);
      if (paramab.field_deleteFlag != 1) {
        break label600;
      }
    }
    label588:
    label594:
    label600:
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.lWr = paramBoolean;
      bnp();
      com.tencent.mm.model.au.HU();
      com.tencent.mm.model.c.FR().Yc(paramab.field_username);
      paramBoolean = q.GF().equals(paramab.field_username);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.ContactWidgetNormal", "get from extinfo %s", new Object[] { Integer.valueOf(this.lWj.eJS) });
      paramInt = i;
      if ((this.lWj.eJS & 0x1) > 0) {
        paramInt = 1;
      }
      if ((!paramab.BA()) && (!ab.XP(paramab.field_username)) && (paramInt != 0) && (n.nkC != null)) {
        n.nkC.a(2, paramab.field_username, paramBoolean, this.bNv);
      }
      return true;
      bool = false;
      break;
      bool = false;
      break label31;
      bool = false;
      break label43;
    }
  }
  
  public final boolean auw()
  {
    if (n.nkC != null) {
      n.nkC.a(this, 3);
    }
    com.tencent.mm.model.au.DF().b(30, this);
    com.tencent.mm.model.au.DF().b(453, this);
    Object localObject = (NormalUserHeaderPreference)this.eOE.ZZ("contact_info_header_normal");
    if (localObject != null) {
      ((NormalUserHeaderPreference)localObject).onDetach();
    }
    localObject = (NormalUserFooterPreference)this.eOE.ZZ("contact_info_footer_normal");
    if (localObject != null) {
      ((NormalUserFooterPreference)localObject).auw();
    }
    localObject = (FriendPreference)this.eOE.ZZ("contact_info_friend_qq");
    if (localObject != null) {
      ((FriendPreference)localObject).auw();
    }
    localObject = (FriendPreference)this.eOE.ZZ("contact_info_friend_mobile");
    if (localObject != null) {
      ((FriendPreference)localObject).auw();
    }
    localObject = (FriendPreference)this.eOE.ZZ("contact_info_facebook");
    if (localObject != null) {
      ((FriendPreference)localObject).auw();
    }
    this.eOE.ZZ("contact_info_sns");
    return true;
  }
  
  final void ee(String paramString1, String paramString2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactWidgetNormal", "[showInviteerView] inviteer:%s inviteerDisplayName:%s", new Object[] { paramString1, paramString2 });
    KeyValuePreference localKeyValuePreference = (KeyValuePreference)this.eOE.ZZ("contact_info_invite_source");
    TextPreference localTextPreference = (TextPreference)this.eOE.ZZ("contact_info_hint");
    this.eOE.bw("contact_info_invite_source", false);
    SpannableString localSpannableString = new SpannableString(j.a(this.bOb, this.bOb.getResources().getString(R.l.contact_info_invite_source, new Object[] { paramString2 })));
    localSpannableString.setSpan(new ForegroundColorSpan(this.bOb.getResources().getColor(R.e.green_text_color)), 0, paramString2.length(), 33);
    localKeyValuePreference.setSummary(localSpannableString);
    localKeyValuePreference.getExtras().putString("inviteer", paramString1);
    this.bOb.getIntent().putExtra("inviteer", paramString1);
    if ((this.hLB != null) && (!this.hLB.Nn().contains(this.guS.field_username)))
    {
      this.eOE.bw("contact_info_footer_normal", true);
      localTextPreference.N(j.a(this.bOb, this.bOb.getResources().getString(R.l.contact_info_not_in_room, new Object[] { gT(this.guS.field_username) })));
      return;
    }
    this.eOE.bw("contact_info_footer_normal", false);
  }
  
  final String gT(String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    if (this.hLB == null) {
      paramString = (String)localObject1;
    }
    ab localab;
    do
    {
      do
      {
        return paramString;
        com.tencent.mm.model.au.HU();
        localab = com.tencent.mm.model.c.FR().Yg(paramString);
        localObject1 = localObject2;
        if (localab != null)
        {
          localObject1 = localObject2;
          if ((int)localab.dhP > 0) {
            localObject1 = localab.field_conRemark;
          }
        }
        localObject2 = localObject1;
        if (bi.oW((String)localObject1)) {
          localObject2 = this.hLB.gT(paramString);
        }
        paramString = (String)localObject2;
      } while (!bi.oW((String)localObject2));
      paramString = (String)localObject2;
    } while (localab == null);
    return localab.BK();
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    do
    {
      return;
    } while ((paramInt2 != -1) || (paramIntent == null));
    String str1 = paramIntent.getStringExtra("be_send_card_name");
    String str2 = paramIntent.getStringExtra("received_card_name");
    boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
    paramIntent = paramIntent.getStringExtra("custom_send_text");
    com.tencent.mm.plugin.messenger.a.g.bcT().l(str1, str2, bool);
    com.tencent.mm.plugin.messenger.a.g.bcT().dF(paramIntent, str2);
    com.tencent.mm.ui.widget.snackbar.b.h(this.bOb, this.bOb.getString(R.l.finish_sent));
  }
  
  public final boolean wX(String paramString)
  {
    if (paramString.equals("contact_info_sns"))
    {
      com.tencent.mm.model.au.HU();
      if (!com.tencent.mm.model.c.isSDCardAvailable()) {
        s.gH(this.bOb);
      }
    }
    do
    {
      do
      {
        return true;
        localObject2 = this.bOb.getIntent();
        ((Intent)localObject2).putExtra("sns_source", this.bNv);
        ((Intent)localObject2).putExtra("sns_signature", this.guS.signature);
        ((Intent)localObject2).putExtra("sns_nickName", this.guS.BK());
        ((Intent)localObject2).putExtra("sns_title", this.guS.BL());
        localObject1 = localObject2;
        if (n.nkC != null) {
          localObject1 = n.nkC.e((Intent)localObject2, this.guS.field_username);
        }
        if (localObject1 == null) {
          ((MMActivity)this.bOb).finish();
        }
        long l;
        while (paramString.equals("contact_info_more"))
        {
          localObject2 = new Intent();
          ((Intent)localObject2).setClass(this.bOb, ContactMoreInfoUI.class);
          ((Intent)localObject2).putExtra("Is_RoomOwner", this.bOb.getIntent().getBooleanExtra("Is_RoomOwner", false));
          ((Intent)localObject2).putExtra("Contact_User", this.guS.field_username);
          ((Intent)localObject2).putExtra("KLinkedInAddFriendNickName", this.lWs);
          ((Intent)localObject2).putExtra("KLinkedInAddFriendPubUrl", this.lWt);
          localObject1 = this.bOb.getIntent().getStringExtra("room_name");
          paramString = (String)localObject1;
          if (localObject1 == null) {
            paramString = this.bOb.getIntent().getStringExtra("Contact_ChatRoomId");
          }
          ((Intent)localObject2).putExtra("Contact_ChatRoomId", paramString);
          ((Intent)localObject2).putExtra("verify_gmail", this.kiv);
          ((Intent)localObject2).putExtra("profileName", this.lWp);
          l = this.bOb.getIntent().getLongExtra("Contact_Uin", 0L);
          paramString = this.bOb.getIntent().getStringExtra("Contact_QQNick");
          ((Intent)localObject2).putExtra("Contact_Uin", l);
          ((Intent)localObject2).putExtra("Contact_QQNick", paramString);
          this.bOb.startActivity((Intent)localObject2);
          return true;
          com.tencent.mm.bg.d.b(this.bOb, "sns", ".ui.SnsUserUI", (Intent)localObject1);
          if ((((Intent)localObject1).getFlags() & 0x4000000) != 0) {
            ((MMActivity)this.bOb).finish();
          }
        }
        if (paramString.equals("contact_info_social"))
        {
          paramString = new Intent();
          paramString.setClass(this.bOb, ContactSocialInfoUI.class);
          paramString.putExtra("Contact_User", this.guS.field_username);
          l = this.bOb.getIntent().getLongExtra("Contact_Uin", 0L);
          localObject1 = this.bOb.getIntent().getStringExtra("Contact_QQNick");
          paramString.putExtra("Contact_Uin", l);
          paramString.putExtra("Contact_QQNick", (String)localObject1);
          paramString.putExtra("profileName", this.lWp);
          paramString.putExtra("verify_gmail", this.kiv);
          localObject1 = this.bOb.getIntent().getStringExtra("Contact_Mobile_MD5");
          localObject2 = this.bOb.getIntent().getStringExtra("Contact_full_Mobile_MD5");
          paramString.putExtra("Contact_Mobile_MD5", (String)localObject1);
          paramString.putExtra("Contact_full_Mobile_MD5", (String)localObject2);
          this.bOb.startActivity(paramString);
          return true;
        }
      } while (!paramString.equals("contact_info_invite_source"));
      paramString = ((KeyValuePreference)this.eOE.ZZ("contact_info_invite_source")).getExtras().getString("inviteer");
    } while (bi.oW(paramString));
    Object localObject1 = gT(paramString);
    Object localObject2 = new Intent();
    ((Intent)localObject2).putExtra("Contact_User", paramString);
    ((Intent)localObject2).putExtra("Contact_RemarkName", (String)localObject1);
    ((Intent)localObject2).putExtra("Contact_RoomNickname", (String)localObject1);
    ((Intent)localObject2).putExtra("Contact_RoomMember", true);
    ((Intent)localObject2).putExtra("room_name", this.hMQ);
    com.tencent.mm.model.au.HU();
    ((Intent)localObject2).putExtra("Contact_Nick", com.tencent.mm.model.c.FR().Yg(paramString).field_nickname);
    ((Intent)localObject2).putExtra("Contact_Scene", 14);
    ((Intent)localObject2).putExtra("Is_RoomOwner", true);
    ((Intent)localObject2).putExtra("Contact_ChatRoomId", this.hMQ);
    com.tencent.mm.plugin.profile.a.ezn.d((Intent)localObject2, this.bOb);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */