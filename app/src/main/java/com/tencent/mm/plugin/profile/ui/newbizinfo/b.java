package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.q;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ab.v;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.ac.m.a;
import com.tencent.mm.ac.m.a.a;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.a.cv;
import com.tencent.mm.g.a.cv.b;
import com.tencent.mm.g.a.cz;
import com.tencent.mm.g.a.cz.b;
import com.tencent.mm.g.a.ng;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.plugin.profile.ui.ContactInfoUI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.ig;
import com.tencent.mm.protocal.c.ih;
import com.tencent.mm.protocal.c.qt;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class b
  implements e, com.tencent.mm.pluginsdk.b.a
{
  public long cYb;
  private List<d.a> dKO;
  private d.b dKP;
  private String dKY;
  public int eLK;
  com.tencent.mm.ui.base.preference.f eOE;
  public long endTime;
  public ab guS;
  public String juZ;
  private boolean lUD;
  private String lUI;
  public com.tencent.mm.ac.d lUs;
  public List<WxaAttributes.WxaEntryInfo> lVH;
  private qt lVI;
  private int lVM = 0;
  private Bundle lVQ;
  SnsAdClick lVR = null;
  private String lVS = null;
  ContactInfoUI lYs;
  public com.tencent.mm.plugin.profile.ui.newbizinfo.b.c lYt;
  private p tipDialog = null;
  
  public b(ContactInfoUI paramContactInfoUI, String paramString, qt paramqt)
  {
    this.lYs = paramContactInfoUI;
    this.lUI = paramString;
    this.lVI = paramqt;
  }
  
  private boolean bnJ()
  {
    boolean bool = true;
    try
    {
      String str = this.dKP.Mo();
      if (bi.oW(str)) {
        return false;
      }
      long l = bi.getLong(str, 0L);
      if ((l > 0L) && (l - System.currentTimeMillis() / 1000L < 0L)) {}
      for (;;)
      {
        x.d("MicroMsg.ContactWidgetNewBizInfo", "isBizAccountTimeExpired:%b", new Object[] { Boolean.valueOf(bool) });
        return bool;
        bool = false;
      }
      return false;
    }
    catch (Exception localException) {}
  }
  
  private d.a bnK()
  {
    if ((this.dKO == null) || (this.dKO.size() < 0))
    {
      x.w("MicroMsg.ContactWidgetNewBizInfo", "brandInfoList is null not show all message");
      return null;
    }
    Iterator localIterator = this.dKO.iterator();
    while (localIterator.hasNext())
    {
      d.a locala = (d.a)localIterator.next();
      if (locala.dKS.equals("__mp_wording__brandinfo_history_massmsg")) {
        return locala;
      }
    }
    x.w("MicroMsg.ContactWidgetNewBizInfo", "brandInfoList is null not show all message");
    return null;
  }
  
  private void bnq()
  {
    if ((this.guS != null) && ((com.tencent.mm.model.s.hM(this.guS.field_username)) || (com.tencent.mm.model.s.hW(this.guS.field_username))) && (com.tencent.mm.l.a.gd(this.guS.field_type)))
    {
      this.eOE.bw("contact_info_biz_go_chatting", false);
      return;
    }
    this.eOE.bw("contact_info_biz_go_chatting", true);
  }
  
  private boolean bns()
  {
    if (this.lYs.getIntent() == null) {
      return false;
    }
    String str1 = this.lYs.getIntent().getStringExtra("device_id");
    String str2 = this.lYs.getIntent().getStringExtra("device_type");
    cz localcz = new cz();
    localcz.bKx.byN = str1;
    localcz.bKx.bKv = str2;
    com.tencent.mm.sdk.b.a.sFg.m(localcz);
    return localcz.bKy.bKz;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.ContactWidgetNewBizInfo", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
      this.tipDialog.dismiss();
    }
    if (paraml == null) {
      x.e("MicroMsg.ContactWidgetNewBizInfo", "scene == null");
    }
    do
    {
      return;
      au.DF().b(paraml.getType(), this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        x.e("MicroMsg.ContactWidgetNewBizInfo", "scene.getType() = %s", new Object[] { Integer.valueOf(paraml.getType()) });
        return;
      }
      x.d("MicroMsg.ContactWidgetNewBizInfo", "scene.getType() = %s", new Object[] { Integer.valueOf(paraml.getType()) });
    } while (paraml.getType() != 536);
    au.DF().b(536, this);
    bnp();
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    boolean bool;
    label28:
    label40:
    Object localObject1;
    Object localObject2;
    if (paramab != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bi.oV(paramab.field_username).length() <= 0) {
        break label560;
      }
      bool = true;
      Assert.assertTrue(bool);
      if (paramf == null) {
        break label566;
      }
      bool = true;
      Assert.assertTrue(bool);
      this.eOE = paramf;
      this.guS = paramab;
      this.lUD = paramBoolean;
      this.eLK = paramInt;
      this.lVR = ((SnsAdClick)this.lYs.getIntent().getParcelableExtra("KSnsAdTag"));
      this.lVS = this.lYs.getIntent().getStringExtra("key_add_contact_report_info");
      this.lVM = this.lYs.getIntent().getIntExtra("add_more_friend_search_scene", 0);
      this.lVQ = this.lYs.getIntent().getBundleExtra("Contact_Ext_Args");
      this.lYs.setMMTitle("");
      this.lYs.nS(-16777216);
      com.tencent.mm.ui.s.cqp();
      this.lYs.lC(false);
      this.lYs.lF(-1);
      if (Build.VERSION.SDK_INT >= 21) {
        com.tencent.mm.ui.statusbar.a.c(this.lYs.mController.tlX, this.lYs.getWindow().getStatusBarColor(), com.tencent.mm.ui.statusbar.d.c(this.lYs.getWindow()));
      }
      this.lYs.cqh();
      this.lYs.setBackBtn(new b.1(this), R.k.actionbar_icon_dark_back);
      paramf = this.lYs.getResources().getDrawable(R.g.mm_title_btn_menu);
      paramf.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
      this.lYs.a(0, "", paramf, new b.2(this));
      localObject1 = com.tencent.mm.plugin.profile.b.bni();
      localObject2 = this.guS.field_username;
      paramf = new com.tencent.mm.plugin.profile.ui.newbizinfo.b.c();
      paramf.field_username = ((String)localObject2);
      if (((com.tencent.mm.plugin.profile.ui.newbizinfo.d.a)localObject1).b(paramf, new String[] { "username" })) {
        break label572;
      }
      x.e("MicroMsg.ProfileInfoStorage", "profileInfo is null");
      paramf = null;
    }
    for (;;)
    {
      this.lYt = paramf;
      bnp();
      paramf = paramab.field_username;
      localObject1 = new b.a();
      ((b.a)localObject1).dIF = 2656;
      ((b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/bizattr/bizprofile";
      ((b.a)localObject1).dII = 0;
      ((b.a)localObject1).dIJ = 0;
      localObject2 = new ig();
      ((ig)localObject2).riA = paramf;
      ((b.a)localObject1).dIG = ((com.tencent.mm.bk.a)localObject2);
      ((b.a)localObject1).dIH = new ih();
      v.a(((b.a)localObject1).KT(), new b.4(this));
      paramf = this.lYs.getIntent().getStringExtra("Contact_BIZ_PopupInfoMsg");
      if (!bi.oW(paramf))
      {
        this.lYs.getIntent().putExtra("Contact_BIZ_PopupInfoMsg", "");
        com.tencent.mm.ui.base.h.a(this.lYs, paramf, "", this.lYs.getString(R.l.app_ok), null);
      }
      if (paramab != null) {
        z.Nk().km(paramab.field_username);
      }
      if ((this.guS != null) && (this.lUs != null) && (this.lYt != null)) {
        break label595;
      }
      x.w("MicroMsg.ContactWidgetNewBizInfo", "reportEnd fail, err");
      return true;
      bool = false;
      break;
      label560:
      bool = false;
      break label28;
      label566:
      bool = false;
      break label40;
      label572:
      x.i("MicroMsg.ProfileInfoStorage", "get username:%s", new Object[] { paramf.field_username });
    }
    label595:
    this.cYb = System.currentTimeMillis();
    com.tencent.mm.plugin.profile.ui.newbizinfo.c.a.a(this.guS.field_username, this.eLK, this.lUs.field_type, this.cYb);
    return true;
  }
  
  public final boolean auw()
  {
    Object localObject = (NewBizInfoHeaderPreference)this.eOE.ZZ("contact_info_header_newbizinfo");
    if (localObject != null) {
      ((NewBizInfoHeaderPreference)localObject).onDetach();
    }
    com.tencent.mm.plugin.profile.ui.newbizinfo.b.c localc1;
    boolean bool;
    if (this.lYt != null)
    {
      localObject = com.tencent.mm.plugin.profile.b.bni();
      localc1 = this.lYt;
      if (localc1 != null) {
        break label86;
      }
      x.e("MicroMsg.ProfileInfoStorage", "profileInfo is null, err");
      bool = false;
    }
    for (;;)
    {
      x.i("MicroMsg.ContactWidgetNewBizInfo", "username:%s insert db :%b", new Object[] { this.lYt.field_username, Boolean.valueOf(bool) });
      return true;
      label86:
      com.tencent.mm.plugin.profile.ui.newbizinfo.b.c localc2 = new com.tencent.mm.plugin.profile.ui.newbizinfo.b.c();
      localc2.field_username = localc1.field_username;
      bool = ((com.tencent.mm.plugin.profile.ui.newbizinfo.d.a)localObject).b(localc2, new String[0]);
      x.i("MicroMsg.ProfileInfoStorage", "insertOrUpdate username:%s", new Object[] { localc1.field_username });
      if (bool) {
        bool = ((com.tencent.mm.plugin.profile.ui.newbizinfo.d.a)localObject).c(localc1, new String[0]);
      } else {
        bool = ((com.tencent.mm.plugin.profile.ui.newbizinfo.d.a)localObject).b(localc1);
      }
    }
  }
  
  final boolean awi()
  {
    return (this.lYt != null) && (this.lYt.awi()) && (!bnJ());
  }
  
  final void ay(int paramInt, String paramString)
  {
    if ((this.lVQ == null) || ((this.eLK != 39) && (this.eLK != 56) && (this.eLK != 35) && (this.eLK != 87) && (this.eLK != 88) && (this.eLK != 89) && (this.eLK != 85)))
    {
      x.d("MicroMsg.ContactWidgetNewBizInfo", "mExtArgs is null or the add contact action is not from biz search.");
      return;
    }
    if (this.guS == null)
    {
      x.i("MicroMsg.ContactWidgetNewBizInfo", "contact is null.");
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
      x.v("MicroMsg.ContactWidgetNewBizInfo", "report 10866: %s", new Object[] { paramString });
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
  
  final void bnp()
  {
    auw();
    Object localObject2 = com.tencent.mm.ac.f.kH(this.guS.field_username);
    this.dKO = null;
    this.dKP = null;
    this.lVH = null;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((com.tencent.mm.ac.d)localObject2).bG(false) != null) {}
    }
    else
    {
      localObject1 = localObject2;
      if (this.lVI != null)
      {
        localObject1 = new com.tencent.mm.ac.d();
        ((com.tencent.mm.ac.d)localObject1).field_username = this.guS.field_username;
        ((com.tencent.mm.ac.d)localObject1).field_brandFlag = this.lVI.eJV;
        ((com.tencent.mm.ac.d)localObject1).field_brandIconURL = this.lVI.eJY;
        ((com.tencent.mm.ac.d)localObject1).field_brandInfo = this.lVI.eJX;
        ((com.tencent.mm.ac.d)localObject1).field_extInfo = this.lVI.eJW;
        ((com.tencent.mm.ac.d)localObject1).field_type = ((com.tencent.mm.ac.d)localObject1).bG(false).Mw();
      }
    }
    if ((localObject1 != null) && (((com.tencent.mm.ac.d)localObject1).field_brandInfo == null) && (((com.tencent.mm.ac.d)localObject1).field_extInfo == null) && (this.lVI != null))
    {
      ((com.tencent.mm.ac.d)localObject1).field_username = this.guS.field_username;
      ((com.tencent.mm.ac.d)localObject1).field_brandFlag = this.lVI.eJV;
      ((com.tencent.mm.ac.d)localObject1).field_brandIconURL = this.lVI.eJY;
      ((com.tencent.mm.ac.d)localObject1).field_brandInfo = this.lVI.eJX;
      ((com.tencent.mm.ac.d)localObject1).field_extInfo = this.lVI.eJW;
      ((com.tencent.mm.ac.d)localObject1).field_type = ((com.tencent.mm.ac.d)localObject1).bG(false).Mw();
    }
    if (localObject1 != null)
    {
      this.lUs = ((com.tencent.mm.ac.d)localObject1);
      this.dKO = ((com.tencent.mm.ac.d)localObject1).Mh();
      this.dKP = ((com.tencent.mm.ac.d)localObject1).bG(false);
      this.lVH = this.dKP.getWxaEntryInfoList();
      if ((this.dKP.Ml() != null) && (this.dKP.Ml().length() > 0)) {
        this.dKY = this.dKP.Ml();
      }
    }
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(R.o.contact_info_pref_newbizinfo);
    Object localObject1 = (NewBizInfoHeaderPreference)this.eOE.ZZ("contact_info_header_newbizinfo");
    if ((localObject1 != null) && (!bi.oW(this.guS.field_username)))
    {
      localObject2 = this.guS;
      Object localObject3 = this.lUI;
      com.tencent.mm.ac.d locald = this.lUs;
      ((NewBizInfoHeaderPreference)localObject1).onDetach();
      ((NewBizInfoHeaderPreference)localObject1).lUr = ((String)localObject3);
      ((NewBizInfoHeaderPreference)localObject1).lUs = locald;
      ((NewBizInfoHeaderPreference)localObject1).guS = ((ab)localObject2);
      au.HU();
      com.tencent.mm.model.c.FR().a((m.b)localObject1);
      q.Kp().d((f.c)localObject1);
      z.Ni().a((m.a.a)localObject1);
      ((NewBizInfoHeaderPreference)localObject1).initView();
      ((NewBizInfoDescPreference)this.eOE.ZZ("contact_info_desc_newbizinfo")).lYt = this.lYt;
      if (!com.tencent.mm.l.a.gd(this.guS.field_type)) {
        break label1273;
      }
      this.eOE.bw("contact_info_biz_add", true);
      this.eOE.bw("contact_info_biz_go_chatting", false);
      if (com.tencent.mm.model.s.hr(this.guS.field_username)) {
        this.eOE.ZZ("contact_info_biz_go_chatting").setTitle(R.l.contact_info_send);
      }
      label505:
      if ((this.lYt != null) && (awi())) {
        break label1339;
      }
      this.eOE.bw("contact_info_biz_loading", false);
      localObject1 = (NewBizInfoLoadingPreference)this.eOE.ZZ("contact_info_biz_loading");
      localObject2 = this.lYt;
      boolean bool = bnJ();
      ((NewBizInfoLoadingPreference)localObject1).lYt = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b.c)localObject2);
      ((NewBizInfoLoadingPreference)localObject1).lYG = bool;
      if ((((NewBizInfoLoadingPreference)localObject1).lYt == null) || (((NewBizInfoLoadingPreference)localObject1).lYt.awi())) {
        break label1301;
      }
      ((NewBizInfoLoadingPreference)localObject1).state = 2;
      label590:
      ((NewBizInfoLoadingPreference)localObject1).initView();
      label594:
      if ((this.lYt != null) && (!awi()) && (!com.tencent.mm.l.a.gd(this.guS.field_type))) {
        this.lYs.showOptionMenu(false);
      }
      if ((this.lYt == null) || (!this.lYt.bnQ())) {
        break label1444;
      }
      this.eOE.bw("contact_info_service_newbizinfo", false);
      if (this.lYt != null)
      {
        localObject1 = (NewBizInfoServicePreference)this.eOE.ZZ("contact_info_service_newbizinfo");
        localObject2 = this.lYt;
        localObject3 = this.guS;
        if (localObject2 != null)
        {
          ((NewBizInfoServicePreference)localObject1).guS = ((ab)localObject3);
          ((NewBizInfoServicePreference)localObject1).lYt = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b.c)localObject2);
          ((NewBizInfoServicePreference)localObject1).lYV = NewBizInfoServicePreference.bI(((com.tencent.mm.plugin.profile.ui.newbizinfo.b.c)localObject2).bnN());
          ((NewBizInfoServicePreference)localObject1).lYU = new NewBizInfoServicePreference.a(((NewBizInfoServicePreference)localObject1).bGc, ((NewBizInfoServicePreference)localObject1).lYV, (ab)localObject3);
          if ((((NewBizInfoServicePreference)localObject1).lYt == null) || (((NewBizInfoServicePreference)localObject1).lYt.awi())) {
            break label1355;
          }
          ((NewBizInfoServicePreference)localObject1).state = 4;
          label762:
          ((NewBizInfoServicePreference)localObject1).initView();
        }
      }
      label766:
      if ((this.lYt == null) || (!this.lYt.bnP())) {
        break label1538;
      }
      this.eOE.bw("contact_info_message_newbizinfo", false);
      localObject1 = (NewBizInfoMessagePreference)this.eOE.ZZ("contact_info_message_newbizinfo");
      localObject2 = this.lYt;
      if (localObject2 != null)
      {
        ((NewBizInfoMessagePreference)localObject1).lYt = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b.c)localObject2);
        ((NewBizInfoMessagePreference)localObject1).lYH = new NewBizInfoMessagePreference.a(((NewBizInfoMessagePreference)localObject1).bGc, ((com.tencent.mm.plugin.profile.ui.newbizinfo.b.c)localObject2).bnM());
        if ((((NewBizInfoMessagePreference)localObject1).lYt == null) || (((NewBizInfoMessagePreference)localObject1).lYt.awi())) {
          break label1460;
        }
        ((NewBizInfoMessagePreference)localObject1).state = 4;
        label867:
        ((NewBizInfoMessagePreference)localObject1).initView();
      }
      label871:
      if ((this.lYt == null) || (!this.lYt.bnO()) || (bnK() == null)) {
        break label1554;
      }
      this.eOE.bw("contact_info_all_message_newbizinfo", false);
      ((NewBizInfoAllMessagePreference)this.eOE.ZZ("contact_info_all_message_newbizinfo")).lYt = this.lYt;
      label930:
      if ((this.lYt == null) || (!awi()) || (this.lVH == null) || (this.lVH.size() <= 0)) {
        break label1582;
      }
      this.eOE.bw("contact_info_new_bindwxainfo", false);
      localObject1 = (NewBizBindWxaInfoPreference)this.eOE.ZZ("contact_info_new_bindwxainfo");
      localObject2 = this.lUs;
      localObject3 = this.lVH;
      ((NewBizBindWxaInfoPreference)localObject1).lUs = ((com.tencent.mm.ac.d)localObject2);
      if (((NewBizBindWxaInfoPreference)localObject1).gEP != null) {
        break label1570;
      }
      ((NewBizBindWxaInfoPreference)localObject1).gEP = new LinkedList();
      label1026:
      if ((localObject3 != null) && (!((List)localObject3).isEmpty())) {
        ((NewBizBindWxaInfoPreference)localObject1).gEP.addAll((Collection)localObject3);
      }
      ((NewBizBindWxaInfoPreference)localObject1).hy();
      label1057:
      x.d("MicroMsg.ContactWidgetNewBizInfo", "KIsardDevice(%b)", new Object[] { Boolean.valueOf(this.lYs.getIntent().getBooleanExtra("KIsHardDevice", false)) });
      if ((this.lYs.getIntent() == null) || (!this.lYs.getIntent().getBooleanExtra("KIsHardDevice", false))) {
        break label1606;
      }
      x.d("MicroMsg.ContactWidgetNewBizInfo", "Hard device biz...");
      bool = bns();
      x.d("MicroMsg.ContactWidgetNewBizInfo", "contact.isContact()(%b), isHardDeviceBound(%b)", new Object[] { Boolean.valueOf(com.tencent.mm.l.a.gd(this.guS.field_type)), Boolean.valueOf(bool) });
      if ((!com.tencent.mm.l.a.gd(this.guS.field_type)) || (!bool))
      {
        x.w("MicroMsg.ContactWidgetNewBizInfo", "%s is not my hard biz contact", new Object[] { this.guS.field_username });
        bnq();
        localObject1 = this.eOE.ZZ("contact_info_biz_add");
        this.eOE.bw("contact_info_biz_add", false);
        if (localObject1 != null)
        {
          if (!bool) {
            break label1598;
          }
          ((Preference)localObject1).setTitle(R.l.contact_info_biz_join);
        }
      }
    }
    for (;;)
    {
      return;
      x.w("MicroMsg.ContactWidgetNewBizInfo", "head pref is null");
      this.eOE.bw("contact_info_header_bizinfo", true);
      break;
      label1273:
      this.eOE.bw("contact_info_biz_add", false);
      this.eOE.bw("contact_info_biz_go_chatting", true);
      break label505;
      label1301:
      if (((NewBizInfoLoadingPreference)localObject1).lYG)
      {
        ((NewBizInfoLoadingPreference)localObject1).state = 3;
        break label590;
      }
      if (((NewBizInfoLoadingPreference)localObject1).lYt != null)
      {
        ((NewBizInfoLoadingPreference)localObject1).state = 0;
        break label590;
      }
      ((NewBizInfoLoadingPreference)localObject1).state = 1;
      break label590;
      label1339:
      this.eOE.bw("contact_info_biz_loading", true);
      break label594;
      label1355:
      if (((NewBizInfoServicePreference)localObject1).lYt.bnQ())
      {
        if ((((NewBizInfoServicePreference)localObject1).lYt != null) && (((NewBizInfoServicePreference)localObject1).lYV != null) && (((NewBizInfoServicePreference)localObject1).lYV.size() <= 0))
        {
          ((NewBizInfoServicePreference)localObject1).state = 2;
          break label762;
        }
        if ((((NewBizInfoServicePreference)localObject1).lYt == null) || (((NewBizInfoServicePreference)localObject1).lYV == null) || (((NewBizInfoServicePreference)localObject1).lYt.bnN().size() <= 0)) {
          break label762;
        }
        ((NewBizInfoServicePreference)localObject1).state = 3;
        break label762;
      }
      ((NewBizInfoServicePreference)localObject1).state = 0;
      break label762;
      label1444:
      this.eOE.bw("contact_info_service_newbizinfo", true);
      break label766;
      label1460:
      if (((NewBizInfoMessagePreference)localObject1).lYt.bnP())
      {
        if ((((NewBizInfoMessagePreference)localObject1).lYt != null) && (((NewBizInfoMessagePreference)localObject1).lYt.bnM().size() <= 0))
        {
          ((NewBizInfoMessagePreference)localObject1).state = 2;
          break label867;
        }
        if ((((NewBizInfoMessagePreference)localObject1).lYt == null) || (((NewBizInfoMessagePreference)localObject1).lYt.bnM().size() <= 0)) {
          break label867;
        }
        ((NewBizInfoMessagePreference)localObject1).state = 3;
        break label867;
      }
      ((NewBizInfoMessagePreference)localObject1).state = 0;
      break label867;
      label1538:
      this.eOE.bw("contact_info_message_newbizinfo", true);
      break label871;
      label1554:
      this.eOE.bw("contact_info_all_message_newbizinfo", true);
      break label930;
      label1570:
      ((NewBizBindWxaInfoPreference)localObject1).gEP.clear();
      break label1026;
      label1582:
      this.eOE.bw("contact_info_new_bindwxainfo", true);
      break label1057;
      label1598:
      ((Preference)localObject1).setTitle(R.l.contact_info_biz_bind_exdevice);
      return;
      label1606:
      if (com.tencent.mm.l.a.gd(this.guS.field_type))
      {
        this.eOE.bw("contact_info_biz_add", true);
        if (com.tencent.mm.model.s.hr(this.guS.field_username)) {
          this.eOE.ZZ("contact_info_biz_go_chatting").setTitle(R.l.contact_info_send);
        }
      }
      while (bnJ())
      {
        this.eOE.bw("contact_info_biz_loading", false);
        this.eOE.bw("contact_info_biz_add", true);
        this.eOE.bw("contact_info_biz_go_chatting", true);
        this.eOE.bw("contact_info_message_newbizinfo", true);
        this.eOE.bw("contact_info_service_newbizinfo", true);
        this.eOE.bw("contact_info_all_message_newbizinfo", true);
        this.eOE.bw("contact_info_new_bindwxainfo", true);
        return;
        x.w("MicroMsg.ContactWidgetNewBizInfo", "%s is not my contact", new Object[] { this.guS.field_username });
        bnq();
        localObject1 = this.eOE.ZZ("contact_info_biz_add");
        if (localObject1 != null) {
          ((Preference)localObject1).setTitle(R.l.contact_info_biz_join);
        }
      }
    }
  }
  
  final void bnr()
  {
    if ((this.lYs.getIntent() != null) && (this.lYs.getIntent().getBooleanExtra("KIsHardDevice", false)))
    {
      localObject1 = this.lYs.getIntent().getStringExtra("KHardDeviceBindTicket");
      if (!bi.oW((String)localObject1)) {
        break label151;
      }
      x.i("MicroMsg.ContactWidgetNewBizInfo", "bindTicket is null, means it is not switch from QRcode scan, just add contact");
    }
    label151:
    while (bns())
    {
      localObject1 = new com.tencent.mm.pluginsdk.ui.applet.a(this.lYs, new b.7(this));
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
    x.d("MicroMsg.ContactWidgetNewBizInfo", "IsHardDevice, bindTicket = %s", new Object[] { localObject1 });
    au.DF().a(536, this);
    Object localObject2 = new cv();
    ((cv)localObject2).bKm.bKo = ((String)localObject1);
    ((cv)localObject2).bKm.opType = 1;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
    Object localObject1 = ((cv)localObject2).bKn.bKq;
    localObject2 = this.lYs;
    this.lYs.getString(R.l.app_tip);
    this.tipDialog = com.tencent.mm.ui.base.h.a((Context)localObject2, this.lYs.getString(R.l.app_waiting), true, new b.6(this, (l)localObject1));
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.lYs == null) {
      x.e("MicroMsg.ContactWidgetNewBizInfo", "null == context");
    }
    do
    {
      return;
      x.i("MicroMsg.ContactWidgetNewBizInfo", "onActivityResult, requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
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
    g.bcT().l(str1, str2, bool);
    g.bcT().dF(paramIntent, str2);
    com.tencent.mm.ui.widget.snackbar.b.h(this.lYs, this.lYs.getString(R.l.finish_sent));
  }
  
  public final boolean wX(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.ContactWidgetNewBizInfo", "handleEvent key is null, return");
      return false;
    }
    x.i("MicroMsg.ContactWidgetNewBizInfo", "handleEvent key:%s", new Object[] { paramString });
    Object localObject1;
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
            x.w("MicroMsg.ContactWidgetNewBizInfo", "contact_info_biz_go_chatting fatherUserName is empty");
            return false;
          }
          paramString.putExtra("enterprise_biz_name", (String)localObject1);
          paramString.putExtra("enterprise_biz_display_name", r.gT((String)localObject1));
          paramString.addFlags(67108864);
          com.tencent.mm.bg.d.e(this.lYs, ".ui.conversation.EnterpriseConversationUI", paramString);
          this.lYs.finish();
        }
      }
      for (;;)
      {
        ay(5, null);
        com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(this.guS.field_username, 300);
        return true;
        paramString.putExtra("enterprise_biz_name", this.guS.field_username);
        paramString.putExtra("enterprise_biz_display_name", r.gT(this.guS.field_username));
        break;
        paramString = new Intent();
        if (this.lYs.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false)) {
          paramString.setFlags(268435456);
        }
        if (this.lUD)
        {
          paramString.putExtra("Chat_User", this.guS.field_username);
          paramString.putExtra("Chat_Mode", 1);
          this.lYs.setResult(-1, paramString);
        }
        else
        {
          paramString.putExtra("Chat_User", this.guS.field_username);
          paramString.putExtra("Chat_Mode", 1);
          paramString.putExtra("finish_direct", true);
          com.tencent.mm.plugin.profile.a.ezn.e(paramString, this.lYs);
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
        if (this.lVM != 0) {
          com.tencent.mm.plugin.report.service.h.mEJ.h(11263, new Object[] { Integer.valueOf(this.lVM), this.guS.field_username });
        }
        com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(this.guS.field_username, 200);
        return true;
        com.tencent.mm.model.gdpr.c.a(this.lYs, com.tencent.mm.model.gdpr.a.dEc, this.guS.field_username, new b.5(this));
      }
    }
    if ("contact_info_all_message_newbizinfo".endsWith(paramString))
    {
      paramString = bnK();
      Object localObject2 = paramString.url;
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("rawUrl", (String)localObject2);
      ((Intent)localObject1).putExtra("useJs", true);
      ((Intent)localObject1).putExtra("vertical_scroll", true);
      ((Intent)localObject1).putExtra("geta8key_scene", 3);
      ((Intent)localObject1).putExtra("KPublisherId", "brand_profile");
      ((Intent)localObject1).putExtra("prePublishId", "brand_profile");
      if (((this.lVQ != null) && ((this.eLK == 39) || (this.eLK == 56) || (this.eLK == 35))) || (this.eLK == 87) || (this.eLK == 89) || (this.eLK == 85) || (this.eLK == 88))
      {
        x.d("MicroMsg.ContactWidgetNewBizInfo", "from biz search.");
        localObject2 = new Bundle();
        ((Bundle)localObject2).putBoolean("KFromBizSearch", true);
        ((Bundle)localObject2).putBundle("KBizSearchExtArgs", this.lVQ);
        ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject2);
        if (!com.tencent.mm.l.a.gd(this.guS.field_type)) {
          break label799;
        }
      }
      label799:
      for (int i = 7;; i = 6)
      {
        int j = this.lYs.getResources().getIdentifier(paramString.dKS, "string", this.lYs.getPackageName());
        paramString = paramString.title;
        if (j > 0) {
          paramString = this.lYs.getString(j);
        }
        ay(i, paramString);
        com.tencent.mm.bg.d.b(this.lYs, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(this.guS.field_username, 400);
        return true;
      }
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */