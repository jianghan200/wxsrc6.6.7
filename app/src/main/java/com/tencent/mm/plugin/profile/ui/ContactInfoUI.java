package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bl;
import com.tencent.mm.plugin.messenger.foundation.a.a.k.a;
import com.tencent.mm.protocal.c.qt;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bq;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.e.a;
import com.tencent.mm.ui.statusbar.DrawStatusBarPreference;
import java.io.IOException;
import java.util.List;

public class ContactInfoUI
  extends DrawStatusBarPreference
  implements k.a, j.a, m.b
{
  private int eLK;
  private com.tencent.mm.ui.base.preference.f eOE;
  private String fsV = "";
  private ab guS;
  private String juZ;
  private com.tencent.mm.pluginsdk.b.a lUC;
  private boolean lUD;
  private boolean lUE;
  private byte[] lUF;
  private boolean lUG = false;
  String lUH = null;
  private String lUI = "";
  private boolean lUJ = false;
  
  public final int Ys()
  {
    return R.o.contact_info_stub;
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      return;
    }
    a((String)paramObject, null);
  }
  
  public final void a(final bq parambq)
  {
    ah.A(new Runnable()
    {
      public final void run()
      {
        if ((ContactInfoUI.a(ContactInfoUI.this) != null) && (parambq != null) && (!bi.oW(ContactInfoUI.a(ContactInfoUI.this).field_username)) && (ContactInfoUI.a(ContactInfoUI.this).field_username.equals(parambq.field_encryptUsername)) && (!com.tencent.mm.model.s.hP(ContactInfoUI.a(ContactInfoUI.this).field_username)))
        {
          ContactInfoUI.a(ContactInfoUI.this).dv(parambq.field_conRemark);
          ContactInfoUI.this.getIntent().putExtra("Contact_User", ContactInfoUI.a(ContactInfoUI.this).field_username);
          if (ContactInfoUI.c(ContactInfoUI.this) != null)
          {
            ContactInfoUI.c(ContactInfoUI.this).auw();
            ContactInfoUI.d(ContactInfoUI.this).removeAll();
          }
          ContactInfoUI.this.initView();
        }
      }
    });
  }
  
  public final void a(final String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    new ag().post(new Runnable()
    {
      public final void run()
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "onNotifyChange verify:%b, contact.user:%s, notify.user:%s", new Object[] { Boolean.valueOf(ContactInfoUI.b(ContactInfoUI.this)), ContactInfoUI.a(ContactInfoUI.this).field_username, paramString });
        if ((ContactInfoUI.a(ContactInfoUI.this) != null) && (!bi.oW(ContactInfoUI.a(ContactInfoUI.this).field_username)) && ((ContactInfoUI.a(ContactInfoUI.this).field_username.equals(paramString)) || (ContactInfoUI.a(ContactInfoUI.this).field_username.equals(ab.XV(paramString)))))
        {
          if (ContactInfoUI.c(ContactInfoUI.this) != null)
          {
            ContactInfoUI.c(ContactInfoUI.this).auw();
            ContactInfoUI.d(ContactInfoUI.this).removeAll();
          }
          ContactInfoUI.this.initView();
        }
      }
    });
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", paramf + " item has been clicked!");
    if (this.lUC != null) {
      this.lUC.wX(paramf);
    }
    return false;
  }
  
  protected final String aYS()
  {
    if ((this.guS == null) || ((int)this.guS.dhP == 0) || (bi.oW(this.guS.field_username))) {
      return "";
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "getIdentityString %s", new Object[] { this.guS.field_username });
    if (com.tencent.mm.ac.f.eZ(this.guS.field_username)) {
      return "_EnterpriseChat";
    }
    if (com.tencent.mm.ac.f.kM(this.guS.field_username)) {
      return "_EnterpriseFatherBiz";
    }
    if (com.tencent.mm.ac.f.kL(this.guS.field_username)) {
      return "_EnterpriseChildBiz";
    }
    if (this.guS.ckW()) {
      return "_bizContact";
    }
    if (com.tencent.mm.model.s.fq(this.guS.field_username)) {
      return "_chatroom";
    }
    if (com.tencent.mm.model.s.gY(this.guS.field_username)) {
      return "_bottle";
    }
    if (com.tencent.mm.model.s.gZ(this.guS.field_username)) {
      return "_QQ";
    }
    if (com.tencent.mm.model.s.hO(this.guS.field_username)) {
      return "_" + this.guS.field_username;
    }
    return "";
  }
  
  protected final void initView()
  {
    this.eOE = this.tCL;
    this.eOE.removeAll();
    this.eLK = getIntent().getIntExtra("Contact_Scene", 9);
    this.juZ = getIntent().getStringExtra("Verify_ticket");
    this.lUD = getIntent().getBooleanExtra("Chat_Readonly", false);
    this.lUE = getIntent().getBooleanExtra("User_Verify", false);
    this.fsV = getIntent().getStringExtra("Contact_ChatRoomId");
    String str1 = bi.oV(getIntent().getStringExtra("Contact_User"));
    Object localObject5 = bi.oV(getIntent().getStringExtra("Contact_Alias"));
    Object localObject1 = bi.oV(getIntent().getStringExtra("Contact_Encryptusername"));
    if (str1.endsWith("@stranger")) {
      localObject1 = str1;
    }
    au.HU();
    this.guS = com.tencent.mm.model.c.FR().Yg(str1);
    if (this.guS != null) {
      this.guS.taj = str1;
    }
    com.tencent.mm.plugin.profile.a.ezo.a(this.guS);
    Object localObject7 = getIntent().getStringExtra("Contact_Nick");
    int j = getIntent().getIntExtra("Contact_Sex", 0);
    String str3 = getIntent().getStringExtra("Contact_Province");
    String str4 = getIntent().getStringExtra("Contact_City");
    String str5 = getIntent().getStringExtra("Contact_Signature");
    int k = getIntent().getIntExtra("Contact_VUser_Info_Flag", 0);
    String str6 = getIntent().getStringExtra("Contact_VUser_Info");
    Object localObject6 = getIntent().getStringExtra("Contact_Distance");
    int i1 = getIntent().getIntExtra("Contact_KWeibo_flag", 0);
    String str7 = getIntent().getStringExtra("Contact_KWeibo");
    String str8 = getIntent().getStringExtra("Contact_KWeiboNick");
    String str2 = getIntent().getStringExtra("Contact_KFacebookName");
    long l = getIntent().getLongExtra("Contact_KFacebookId", 0L);
    this.lUI = getIntent().getStringExtra("Contact_BrandIconURL");
    String str9 = getIntent().getStringExtra("Contact_RegionCode");
    this.lUF = getIntent().getByteArrayExtra("Contact_customInfo");
    int i2 = getIntent().getIntExtra("Contact_Ext_Flag", 0);
    boolean bool2 = getIntent().getBooleanExtra("force_get_contact", false);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "dkverify forceAddContact:%s  user:%s  roomid:%s ", new Object[] { Boolean.valueOf(bool2), str1, this.fsV });
    Object localObject4;
    Object localObject3;
    Object localObject8;
    label749:
    label769:
    int m;
    int n;
    label1225:
    int i;
    label1290:
    label1346:
    boolean bool1;
    if (bool2)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoUI", "initView, forceAddContact, user = " + str1);
      if ((this.guS != null) && (com.tencent.mm.l.a.gd(this.guS.field_type))) {
        am.a.dBr.R(str1, this.fsV);
      }
    }
    else
    {
      if (((this.guS == null) || ((int)this.guS.dhP == 0)) && (ab.XR(str1)))
      {
        localObject4 = bi.oV(getIntent().getStringExtra(e.a.ths));
        localObject3 = localObject4;
        if (bi.oW((String)localObject4)) {
          localObject3 = this.juZ;
        }
        com.tencent.mm.kernel.g.Eh().dpP.a(new com.tencent.mm.openim.b.b(str1, bi.oV(this.fsV), (String)localObject3), 0);
      }
      if ((this.guS != null) && ((int)this.guS.dhP > 0) && ((!com.tencent.mm.model.s.hP(this.guS.field_username)) || ((ab.XQ(this.guS.field_username)) && (!com.tencent.mm.model.s.hd(this.guS.field_username)))))
      {
        if ((!this.guS.ckZ()) || (!ab.XR(this.guS.field_username))) {
          break label2005;
        }
        localObject4 = bi.oV(getIntent().getStringExtra(e.a.ths));
        localObject3 = localObject4;
        if (bi.oW((String)localObject4)) {
          localObject3 = this.juZ;
        }
        localObject8 = com.tencent.mm.kernel.g.Eh().dpP;
        String str10 = this.guS.field_username;
        if (!com.tencent.mm.l.a.gd(this.guS.field_type)) {
          break label1993;
        }
        localObject4 = "";
        ((o)localObject8).a(new com.tencent.mm.openim.b.b(str10, (String)localObject4, (String)localObject3), 0);
      }
      m = getIntent().getIntExtra("Contact_verify_Scene", 9);
      getIntent().getIntExtra("key_add_contact_match_type", 0);
      localObject3 = getIntent().getStringExtra("key_add_contact_openim_appid");
      n = getIntent().getIntExtra("key_add_contact_custom_detail_visible", 0);
      localObject4 = getIntent().getStringExtra("key_add_contact_custom_detail");
      getIntent().getStringExtra("key_add_contact_desc_wording_id");
      getIntent().getStringExtra("key_add_contact_desc_icon");
      if ((this.guS != null) && ((int)this.guS.dhP != 0) && (bi.oV(this.guS.field_username).length() > 0)) {
        break label2243;
      }
      this.guS = new ab();
      this.guS.setUsername(str1);
      this.guS.du((String)localObject5);
      this.guS.dx((String)localObject7);
      this.guS.dy(getIntent().getStringExtra("Contact_PyInitial"));
      this.guS.dz(getIntent().getStringExtra("Contact_QuanPin"));
      this.guS.eJ(j);
      this.guS.dN(str3);
      this.guS.dO(str4);
      this.guS.dM(str5);
      this.guS.eF(k);
      this.guS.dR(str6);
      this.guS.dP((String)localObject6);
      this.guS.eP(m);
      this.guS.dQ(str7);
      this.guS.eE(i1);
      this.guS.dA(str8);
      this.guS.ar(l);
      this.guS.dH(str2);
      this.guS.dS(str9);
      this.guS.eS(i2);
      if ((!bi.oW(this.lUH)) && (this.eLK == 15))
      {
        au.HU();
        localObject5 = com.tencent.mm.model.c.FS().Hh(str1);
        localObject6 = new bq(str1);
        ((bq)localObject6).field_conRemark = ((bq)localObject5).field_conRemark;
        ((bq)localObject6).field_conDescription = ((bq)localObject5).field_conDescription;
        ((bq)localObject6).field_contactLabels = ((bq)localObject5).field_contactLabels;
        ((bq)localObject6).field_conPhone = this.lUH;
        au.HU();
        com.tencent.mm.model.c.FS().a((com.tencent.mm.sdk.e.c)localObject6);
        this.lUH = null;
      }
      this.guS.eb((String)localObject4);
      this.guS.eT(n);
      this.guS.dG((String)localObject3);
      if ((ab.XR(this.guS.field_username)) && ((this.eLK == 30) || (this.eLK == 45) || (this.eLK == 17)))
      {
        localObject3 = com.tencent.mm.plugin.report.service.h.mEJ;
        localObject4 = this.guS.field_openImAppid;
        if (this.eLK != 17) {
          break label2738;
        }
        i = 2;
        ((com.tencent.mm.plugin.report.service.h)localObject3).h(15320, new Object[] { localObject4, Integer.valueOf(i) });
      }
      if (!bi.oW((String)localObject1)) {
        this.guS.dD((String)localObject1);
      }
      if (this.guS != null) {
        break label2743;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactInfoUI", "contact = null");
      getIntent().putExtra("Contact_User", this.guS.field_username);
      if ((!bool2) && ((int)this.guS.dhP <= 0) && (this.guS.ckW()) && ((this.eLK == 17) || (this.eLK == 41)))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoUI", "come from card, getContact %s", new Object[] { this.guS.field_username });
        am.a.dBr.R(this.guS.field_username, "");
        com.tencent.mm.aa.c.jN(this.guS.field_username);
      }
      if (this.guS.csT != null) {
        break label2853;
      }
      bool1 = true;
      label1470:
      if (this.guS.csT != null) {
        break label2859;
      }
      i = 0;
      label1482:
      if (this.guS.csT != null) {
        break label2873;
      }
    }
    label1993:
    label2005:
    label2035:
    label2131:
    label2140:
    label2243:
    label2738:
    label2743:
    label2853:
    label2859:
    label2873:
    for (localObject1 = "";; localObject1 = bi.Xf(this.guS.csT))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "contact.getRemarkDesc() (%s, %s, %s)", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(i), localObject1 });
      if ((!bool2) && ((int)this.guS.dhP <= 0) && (this.eLK == 96))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "come from chatroom accessverify, getContact %s", new Object[] { this.guS.field_username });
        am.a.dBr.S(this.guS.field_username, getIntent().getStringExtra("key_add_contact_verify_ticket"));
        com.tencent.mm.aa.c.J(this.guS.field_username, 3);
      }
      if (this.guS.field_username.equals(com.tencent.mm.model.q.GF()))
      {
        au.HU();
        l = bi.getLong((String)com.tencent.mm.model.c.DT().get(65825, null), 0L);
        if (l > 0L)
        {
          this.guS.ar(l);
          localObject1 = this.guS;
          au.HU();
          ((ab)localObject1).dH((String)com.tencent.mm.model.c.DT().get(65826, null));
        }
        localObject1 = this.guS;
        au.HU();
        ((ab)localObject1).dV((String)com.tencent.mm.model.c.DT().get(286721, null));
        localObject1 = this.guS;
        au.HU();
        ((ab)localObject1).dW((String)com.tencent.mm.model.c.DT().get(286722, null));
        localObject1 = this.guS;
        au.HU();
        ((ab)localObject1).dX((String)com.tencent.mm.model.c.DT().get(286723, null));
      }
      if ((this.guS.field_username != null) && (this.guS.field_username.equals(ab.XV(com.tencent.mm.model.q.GF()))))
      {
        localObject1 = bl.IC();
        localObject3 = bi.oV(((bl)localObject1).getProvince());
        localObject4 = bi.oV(((bl)localObject1).getCity());
        if (!bi.oW((String)localObject3)) {
          this.guS.dN((String)localObject3);
        }
        if (!bi.oW((String)localObject4)) {
          this.guS.dO((String)localObject4);
        }
        if (!bi.oW(((bl)localObject1).countryCode)) {
          this.guS.dS(RegionCodeDecoder.aq(((bl)localObject1).countryCode, ((bl)localObject1).dDf, ((bl)localObject1).dDe));
        }
        i = bi.a(Integer.valueOf(((bl)localObject1).sex), 0);
        localObject1 = bi.oV(((bl)localObject1).signature);
        this.guS.eJ(i);
        this.guS.dM((String)localObject1);
      }
      if (!bi.oW(this.guS.field_username)) {
        break label2888;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactInfoUI", "username is null %s", new Object[] { str1 });
      finish();
      return;
      am.a.dBr.R(str1, "");
      break;
      localObject4 = bi.oV(this.fsV);
      break label749;
      localObject3 = com.tencent.mm.ac.f.kH(this.guS.field_username);
      if ((this.guS.ckW()) && (com.tencent.mm.ac.a.LP()))
      {
        i = 1;
        if ((localObject3 != null) && ((!((com.tencent.mm.ac.d)localObject3).LS()) || (i != 0))) {
          break label2140;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoUI", "update contact, verifyFlag %d.", new Object[] { Integer.valueOf(k) });
        localObject4 = am.a.dBr;
        localObject8 = this.guS.field_username;
        if (!com.tencent.mm.l.a.gd(this.guS.field_type)) {
          break label2131;
        }
      }
      for (localObject3 = "";; localObject3 = this.fsV)
      {
        ((am.b)localObject4).R((String)localObject8, (String)localObject3);
        com.tencent.mm.aa.c.jN(this.guS.field_username);
        break;
        i = 0;
        break label2035;
      }
      if ((!this.guS.ckZ()) || (i != 0)) {
        break label769;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoUI", "update contact, last check time=%d", new Object[] { Integer.valueOf(this.guS.csR) });
      localObject4 = am.a.dBr;
      localObject8 = this.guS.field_username;
      if (com.tencent.mm.l.a.gd(this.guS.field_type)) {}
      for (localObject3 = "";; localObject3 = this.fsV)
      {
        ((am.b)localObject4).R((String)localObject8, (String)localObject3);
        com.tencent.mm.aa.c.jN(this.guS.field_username);
        break;
      }
      if (this.guS.sex == 0) {
        this.guS.eJ(j);
      }
      if ((str3 != null) && (!str3.equals(""))) {
        this.guS.dN(str3);
      }
      if ((str4 != null) && (!str4.equals(""))) {
        this.guS.dO(str4);
      }
      if ((str9 != null) && (!str9.equals(""))) {
        this.guS.dS(str9);
      }
      if ((bi.oW(this.guS.signature)) && (str5 != null) && (!str5.equals(""))) {
        this.guS.dM(str5);
      }
      if (k != 0) {
        this.guS.eF(k);
      }
      if ((bi.oW(this.guS.csP)) && (str6 != null) && (!str6.equals(""))) {
        this.guS.dR(str6);
      }
      if ((bi.oW(this.guS.field_nickname)) && (localObject7 != null) && (!((String)localObject7).equals(""))) {
        this.guS.dx((String)localObject7);
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "searchMobilePhone:%s", new Object[] { bi.oV(this.lUH) });
      if ((!bi.oW(this.lUH)) && (this.eLK == 15))
      {
        i = 1;
        k = 1;
        localObject5 = this.guS.csZ;
        if (localObject5 != null)
        {
          localObject7 = this.guS.csZ.split(",");
          i1 = localObject7.length;
          j = 0;
          i = k;
          if (j < i1)
          {
            if (localObject7[j].equals(this.lUH)) {}
            for (i = 0;; i = 1)
            {
              j += 1;
              break;
            }
          }
        }
        if (i != 0)
        {
          this.guS.dZ((String)localObject5 + this.lUH + ",");
          this.lUH = null;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "contact PhoneList:%s", new Object[] { bi.oV(this.guS.csZ) });
        this.guS.setSource(15);
      }
      this.guS.dP((String)localObject6);
      this.guS.eP(m);
      this.guS.ar(l);
      this.guS.dH(str2);
      if (!bi.oW((String)localObject4)) {
        this.guS.eb((String)localObject4);
      }
      if (n != 0) {
        this.guS.eT(n);
      }
      if (bi.oW((String)localObject3)) {
        break label1225;
      }
      this.guS.dG((String)localObject3);
      break label1225;
      i = 1;
      break label1290;
      if (!bi.oW((String)localObject1))
      {
        au.HU();
        localObject1 = com.tencent.mm.model.c.FS().Hh((String)localObject1);
        if ((localObject1 != null) && (!bi.oW(((bq)localObject1).field_encryptUsername)))
        {
          this.guS.dv(((bq)localObject1).field_conRemark);
          break label1346;
        }
      }
      if (bi.oW(str1)) {
        break label1346;
      }
      au.HU();
      localObject1 = com.tencent.mm.model.c.FS().Hh(str1);
      if ((localObject1 == null) || (bi.oW(((bq)localObject1).field_encryptUsername))) {
        break label1346;
      }
      this.guS.dv(((bq)localObject1).field_conRemark);
      break label1346;
      bool1 = false;
      break label1470;
      i = this.guS.csT.length();
      break label1482;
    }
    label2888:
    if (com.tencent.mm.model.s.hO(this.guS.field_username))
    {
      i = R.l.settings_plugins_title;
      setMMTitle(i);
      if (com.tencent.mm.model.s.fq(this.guS.field_username)) {
        setMMTitle(R.l.contact_info_room_title);
      }
      localObject3 = this.lUI;
      if (!com.tencent.mm.model.s.hb(this.guS.field_username)) {
        break label3442;
      }
      this.lUC = com.tencent.mm.bg.d.Z(this, "sport");
      label2960:
      if (this.lUC != null)
      {
        this.lUC.a(this.eOE, this.guS, this.lUD, this.eLK);
        localObject3 = com.tencent.mm.plugin.account.b.getAddrUploadStg().pp(this.guS.field_username);
        localObject1 = "";
        if (localObject3 != null) {
          localObject1 = bi.oV(((com.tencent.mm.plugin.account.friend.a.a)localObject3).Xp()).replace(" ", "");
        }
        if ((!this.lUJ) && (com.tencent.mm.l.a.gd(this.guS.field_type)) && ((this.lUC instanceof k)))
        {
          if (!bi.oW(this.guS.csZ)) {
            break label4423;
          }
          i = 0;
          label3080:
          if (!bi.oW((String)localObject1)) {
            break label4441;
          }
          j = 0;
          label3090:
          j = i + j;
          localObject3 = com.tencent.mm.plugin.report.service.h.mEJ;
          localObject4 = this.guS.field_username;
          if (!bi.oW((String)localObject1)) {
            break label4446;
          }
          i = 0;
          label3118:
          if (j < 5) {
            break label4451;
          }
          j = 5;
        }
      }
    }
    label3442:
    label4423:
    label4441:
    label4446:
    label4451:
    for (;;)
    {
      ((com.tencent.mm.plugin.report.service.h)localObject3).h(12040, new Object[] { localObject4, Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(j) });
      this.lUJ = true;
      if ((!(this.lUC instanceof k)) && (!(this.lUC instanceof c)) && (!(this.lUC instanceof com.tencent.mm.plugin.profile.ui.newbizinfo.b)))
      {
        au.HU();
        localObject1 = (String)com.tencent.mm.model.c.DT().get(aa.a.sXd, "");
        if (((String)localObject1).contains(this.guS.field_username))
        {
          localObject1 = ((String)localObject1).replaceAll(this.guS.field_username + ",*", "");
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sXd, localObject1);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "mark plugin read, userName:%s, newVal:%s", new Object[] { this.guS.field_username, localObject1 });
          if (bi.oW((String)localObject1)) {
            com.tencent.mm.s.c.Cp().v(262158, false);
          }
        }
      }
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          if (((com.tencent.mm.model.s.hu(ContactInfoUI.a(ContactInfoUI.this).field_username)) && (!com.tencent.mm.model.q.GZ())) || ((com.tencent.mm.model.s.hm(ContactInfoUI.a(ContactInfoUI.this).field_username)) && (!com.tencent.mm.model.q.GV())) || ((com.tencent.mm.model.s.ho(ContactInfoUI.a(ContactInfoUI.this).field_username)) && (!com.tencent.mm.model.q.Hf())) || ((com.tencent.mm.model.s.hi(ContactInfoUI.a(ContactInfoUI.this).field_username)) && (!com.tencent.mm.model.q.Hh())))
          {
            paramAnonymousMenuItem = new Intent();
            paramAnonymousMenuItem.addFlags(67108864);
            com.tencent.mm.plugin.profile.a.ezn.q(paramAnonymousMenuItem, ContactInfoUI.this);
          }
          ContactInfoUI.this.finish();
          return true;
        }
      });
      com.tencent.mm.aa.q.KJ().jP(this.guS.field_username);
      if (((!com.tencent.mm.model.s.hu(this.guS.field_username)) || (!com.tencent.mm.model.q.GZ())) && ((!com.tencent.mm.model.s.hm(this.guS.field_username)) || (!com.tencent.mm.model.q.GV())) && ((!com.tencent.mm.model.s.ho(this.guS.field_username)) || (!com.tencent.mm.model.q.Hf())) && ((!com.tencent.mm.model.s.hi(this.guS.field_username)) || (!com.tencent.mm.model.q.Hh()))) {
        break label4454;
      }
      this.lUG = true;
      return;
      i = R.l.contact_info_title;
      break;
      if (com.tencent.mm.model.s.hi(this.guS.field_username))
      {
        this.lUC = com.tencent.mm.bg.d.Z(this, "qqmail");
        break label2960;
      }
      if (com.tencent.mm.model.s.hj(this.guS.field_username))
      {
        this.lUC = new e(this);
        setMMTitle(R.l.settings_plugins_title);
        break label2960;
      }
      if (com.tencent.mm.model.s.hl(this.guS.field_username))
      {
        this.lUC = com.tencent.mm.bg.d.Z(this, "bottle");
        setMMTitle(R.l.settings_plugins_title);
        break label2960;
      }
      if (com.tencent.mm.model.s.hk(this.guS.field_username))
      {
        this.lUC = com.tencent.mm.bg.d.Z(this, "tmessage");
        setMMTitle(R.l.settings_plugins_title);
        break label2960;
      }
      if (com.tencent.mm.model.s.hw(this.guS.field_username))
      {
        this.lUC = new com.tencent.mm.plugin.topstory.ui.a.a(this);
        setMMTitle(R.l.settings_plugins_title);
        break label2960;
      }
      if (com.tencent.mm.model.s.hc(this.guS.field_username))
      {
        this.lUC = new h(this);
        break label2960;
      }
      if (com.tencent.mm.model.s.hq(this.guS.field_username))
      {
        this.lUC = new m(this);
        break label2960;
      }
      if (ab.gY(this.guS.field_username))
      {
        this.lUC = new d(this);
        break label2960;
      }
      if (com.tencent.mm.model.s.hs(this.guS.field_username))
      {
        this.lUC = com.tencent.mm.bg.d.Z(this, "nearby");
        break label2960;
      }
      if (com.tencent.mm.model.s.ht(this.guS.field_username))
      {
        this.lUC = com.tencent.mm.bg.d.Z(this, "shake");
        break label2960;
      }
      if (com.tencent.mm.model.s.hu(this.guS.field_username))
      {
        this.lUC = new j(this);
        break label2960;
      }
      if (com.tencent.mm.model.s.hv(this.guS.field_username))
      {
        this.lUC = com.tencent.mm.bg.d.B(this, "readerapp", "widget_type_news");
        break label2960;
      }
      if (com.tencent.mm.model.s.hD(this.guS.field_username))
      {
        this.lUC = com.tencent.mm.bg.d.B(this, "readerapp", "widget_type_weibo");
        break label2960;
      }
      if (com.tencent.mm.model.s.hn(this.guS.field_username))
      {
        this.lUC = new f(this);
        break label2960;
      }
      if (com.tencent.mm.model.s.ho(this.guS.field_username))
      {
        this.lUC = com.tencent.mm.bg.d.Z(this, "masssend");
        break label2960;
      }
      if (com.tencent.mm.model.s.hp(this.guS.field_username))
      {
        this.lUC = new g(this);
        break label2960;
      }
      if ((this.guS.ckW()) || (getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false)))
      {
        for (;;)
        {
          try
          {
            localObject1 = this.lUF;
            if (localObject1 != null) {
              continue;
            }
            localObject1 = null;
          }
          catch (IOException localIOException)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ContactInfoUI", localIOException, "", new Object[0]);
            Object localObject2 = null;
            continue;
            if (!com.tencent.mm.ac.f.kJ((String)localObject4)) {
              continue;
            }
            bool1 = true;
            continue;
            if (localObject2 == null) {
              continue;
            }
            localObject4 = new com.tencent.mm.ac.d();
            ((com.tencent.mm.ac.d)localObject4).field_extInfo = ((qt)localObject2).eJW;
            ((com.tencent.mm.ac.d)localObject4).field_type = ((com.tencent.mm.ac.d)localObject4).bG(false).Mw();
            if (!((com.tencent.mm.ac.d)localObject4).LW()) {
              continue;
            }
            bool1 = true;
            continue;
            if (!((com.tencent.mm.ac.d)localObject4).LV()) {
              continue;
            }
            bool1 = true;
            continue;
            if (!getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false)) {
              continue;
            }
            bool1 = true;
            continue;
            if ((com.tencent.mm.ac.f.kM(this.guS.field_username)) || (com.tencent.mm.ac.f.kL(this.guS.field_username)) || ((int)this.guS.dhP > 0) || (!this.guS.ckW()) || ((this.eLK != 17) && (this.eLK != 41))) {
              continue;
            }
            bool1 = true;
            continue;
            bool1 = false;
            continue;
            localObject2 = new c(this, (String)localObject3, (qt)localObject2);
            if (bi.oW(this.juZ)) {
              continue;
            }
            ((c)localObject2).juZ = this.juZ;
            this.lUC = ((com.tencent.mm.pluginsdk.b.a)localObject2);
          }
          localObject4 = this.guS.field_username;
          if ((!ad.chZ().getBoolean("use_new_profile", true)) || (com.tencent.mm.model.s.hW((String)localObject4)) || (com.tencent.mm.model.s.hr((String)localObject4)) || (com.tencent.mm.model.s.hC((String)localObject4))) {
            continue;
          }
          if (!com.tencent.mm.ac.f.kI((String)localObject4)) {
            continue;
          }
          bool1 = true;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "username:%s, isUseNewProfileUI:%b", new Object[] { this.guS.field_username, Boolean.valueOf(bool1) });
          if (!bool1) {
            continue;
          }
          localObject1 = new com.tencent.mm.plugin.profile.ui.newbizinfo.b(this, (String)localObject3, (qt)localObject1);
          if (!bi.oW(this.juZ)) {
            ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject1).juZ = this.juZ;
          }
          this.lUC = ((com.tencent.mm.pluginsdk.b.a)localObject1);
          break;
          localObject1 = (qt)new qt().aG(this.lUF);
        }
        break label2960;
      }
      if (com.tencent.mm.model.s.hz(this.guS.field_username))
      {
        this.lUC = new n(this);
        break label2960;
      }
      if (com.tencent.mm.model.s.hA(this.guS.field_username))
      {
        this.lUC = new i(this);
        break label2960;
      }
      this.lUC = new k(this);
      break label2960;
      i = this.guS.csZ.split(",").length;
      break label3080;
      j = 1;
      break label3090;
      i = 1;
      break label3118;
    }
    label4454:
    this.lUG = false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.lUC != null) {
      this.lUC.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "onCreate MMCore.accHasReady[%b]", new Object[] { Boolean.valueOf(au.HX()) });
    this.lUH = getIntent().getStringExtra("Contact_Search_Mobile");
    if (!com.tencent.mm.kernel.g.Eg().Dx())
    {
      finish();
      return;
    }
    au.HU();
    com.tencent.mm.model.c.FR().a(this);
    au.HU();
    com.tencent.mm.model.c.FS().a(this);
    initView();
  }
  
  public void onDestroy()
  {
    int j = 0;
    if (com.tencent.mm.kernel.g.Eg().Dx())
    {
      au.HU();
      com.tencent.mm.model.c.FR().b(this);
      au.HU();
      com.tencent.mm.model.c.FS().b(this);
    }
    if (this.lUC != null) {
      this.lUC.auw();
    }
    com.tencent.mm.plugin.profile.ui.newbizinfo.b localb;
    if ((this.lUC instanceof com.tencent.mm.plugin.profile.ui.newbizinfo.b))
    {
      localb = (com.tencent.mm.plugin.profile.ui.newbizinfo.b)this.lUC;
      if ((localb.guS == null) || (localb.lUs == null) || (localb.lYt == null)) {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ContactWidgetNewBizInfo", "reportEnd fail, err");
      }
    }
    else
    {
      if (com.tencent.mm.plugin.sns.b.n.nkx != null) {
        com.tencent.mm.plugin.sns.b.n.nkx.H(this);
      }
      super.onDestroy();
      return;
    }
    localb.endTime = System.currentTimeMillis();
    String str = localb.guS.field_username;
    int k = localb.eLK;
    int m = localb.lUs.field_type;
    long l1 = localb.cYb;
    long l2 = localb.endTime;
    if (com.tencent.mm.l.a.gd(localb.guS.field_type)) {}
    for (int i = 1;; i = 0)
    {
      int n = localb.lYt.field_originalArticleCount;
      int i1 = localb.lYt.field_friendSubscribeCount;
      if (localb.lVH != null) {
        j = localb.lVH.size();
      }
      com.tencent.mm.plugin.profile.ui.newbizinfo.c.a.a(str, k, m, l1, l2, i, n, i1, j, com.tencent.mm.plugin.profile.ui.newbizinfo.c.a.bJ(localb.lYt.bnM()), com.tencent.mm.plugin.profile.ui.newbizinfo.c.a.bK(localb.lYt.bnN()));
      break;
    }
  }
  
  public void onPause()
  {
    com.tencent.mm.modelstat.d.b(4, "ContactInfoUI" + aYS(), hashCode());
    z.MY().d(this);
    super.onPause();
    au.Em().L(new Runnable()
    {
      public final void run()
      {
        au.HU();
        com.tencent.mm.model.c.DT().lm(true);
      }
    });
    if (getIntent().getBooleanExtra("key_from_wesport_right_newtips", false))
    {
      com.tencent.mm.plugin.ab.a.bji();
      com.tencent.mm.ao.d.m(com.tencent.mm.ao.b.ebo, cql());
    }
    while (!getIntent().getBooleanExtra("key_from_wesport_plugin_newtips", false)) {
      return;
    }
    com.tencent.mm.plugin.ab.a.bji();
    com.tencent.mm.ao.d.m(com.tencent.mm.ao.b.ebm, cql());
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    do
    {
      for (;;)
      {
        return;
        if (paramArrayOfInt[0] == 0)
        {
          paramArrayOfString = (NormalUserFooterPreference)this.eOE.ZZ("contact_info_footer_normal");
          if (paramArrayOfString != null) {
            paramArrayOfString.bnz();
          }
        }
        else
        {
          if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
          for (paramInt = R.l.permission_camera_request_again_msg; paramArrayOfInt[0] != 0; paramInt = R.l.permission_microphone_request_again_msg)
          {
            com.tencent.mm.ui.base.h.a(this, getString(paramInt), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new ContactInfoUI.6
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                paramAnonymousDialogInterface.dismiss();
                ContactInfoUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
              }
            }, new ContactInfoUI.6(this));
            return;
          }
        }
      }
      if (paramArrayOfInt[0] != 0) {
        break;
      }
      paramArrayOfString = (NormalUserFooterPreference)this.eOE.ZZ("contact_info_footer_normal");
    } while (paramArrayOfString == null);
    paramArrayOfString.bny();
    return;
    com.tencent.mm.ui.base.h.a(this, getString(R.l.permission_location_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new ContactInfoUI.7(this), null);
  }
  
  protected void onRestart()
  {
    super.onRestart();
    this.lUJ = false;
  }
  
  public void onResume()
  {
    com.tencent.mm.modelstat.d.b(3, "ContactInfoUI" + aYS(), hashCode());
    z.MY().c(this);
    super.onResume();
    View localView = ((ViewGroup)this.mController.contentView).getFocusedChild();
    if (localView != null)
    {
      localView.clearFocus();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactInfoUI", "try to clear focus. id:%s", new Object[] { Integer.valueOf(localView.getId()) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/ContactInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */