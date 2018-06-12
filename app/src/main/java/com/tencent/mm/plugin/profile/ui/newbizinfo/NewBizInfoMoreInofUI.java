package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.aa.e;
import com.tencent.mm.aa.k;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.ac.d.b.d;
import com.tencent.mm.ac.d.b.e;
import com.tencent.mm.ac.d.b.f;
import com.tencent.mm.ac.d.b.g;
import com.tencent.mm.ac.g;
import com.tencent.mm.ac.h.a;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.c;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.profile.ui.BizInfoPayInfoIconPreference;
import com.tencent.mm.plugin.profile.ui.IconWidgetPreference;
import com.tencent.mm.protocal.c.cgc;
import com.tencent.mm.protocal.c.qt;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.statusbar.DrawStatusBarPreference;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NewBizInfoMoreInofUI
  extends DrawStatusBarPreference
  implements h.a
{
  private List<d.a> dKO;
  private d.b dKP;
  private boolean dKW = false;
  private int eLK;
  private com.tencent.mm.ui.base.preference.f eOE;
  private ab guS;
  private com.tencent.mm.ac.d lUs;
  private qt lVI;
  private String lVN;
  private boolean lVO;
  private Bundle lVQ;
  
  private void JF(String paramString)
  {
    ah.i(new NewBizInfoMoreInofUI.2(this, paramString), 2000L);
  }
  
  private void ay(int paramInt, String paramString)
  {
    if ((this.lVQ == null) || ((this.eLK != 39) && (this.eLK != 56) && (this.eLK != 35) && (this.eLK != 87) && (this.eLK != 88) && (this.eLK != 89) && (this.eLK != 85)))
    {
      x.d("MicroMsg.NewBizInfoMoreInofUI", "mExtArgs is null or the add contact action is not from biz search.");
      return;
    }
    if (this.guS == null)
    {
      x.i("MicroMsg.NewBizInfoMoreInofUI", "contact is null.");
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
      x.v("MicroMsg.NewBizInfoMoreInofUI", "report 10866: %s", new Object[] { paramString });
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
  
  private d.a bnL()
  {
    Object localObject;
    if ((this.dKO == null) || (this.dKO.size() < 0))
    {
      x.w("MicroMsg.NewBizInfoMoreInofUI", "brandInfoList is null not show location");
      localObject = null;
      return (d.a)localObject;
    }
    Iterator localIterator = this.dKO.iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        d.a locala = (d.a)localIterator.next();
        localObject = locala;
        if (locala.dKS.equals("__mp_wording__brandinfo_location")) {
          break;
        }
        if (getString(R.l.contact_info_biz_see_location).equals(locala.title)) {
          return locala;
        }
      }
    }
    x.w("MicroMsg.NewBizInfoMoreInofUI", "brandInfoList is null not show location");
    return null;
  }
  
  private static void c(g paramg)
  {
    long l = System.currentTimeMillis();
    k localk = com.tencent.mm.aa.q.KH();
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
    x.d("MicroMsg.NewBizInfoMoreInofUI", "downloadKFAvatar, %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
  }
  
  public final String MQ()
  {
    return "MicroMsg.NewBizInfoMoreInofUI";
  }
  
  public final int Ys()
  {
    return R.o.newbizinfo_more_info_pref;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    int i = 7;
    paramPreference = paramPreference.mKey;
    x.i("MicroMsg.NewBizInfoMoreInofUI", paramPreference + " item has been clicked!");
    Object localObject;
    int j;
    if ("contact_info_see_locate".endsWith(paramPreference))
    {
      paramf = bnL();
      localObject = paramf.url;
      paramPreference = new Intent();
      paramPreference.putExtra("rawUrl", (String)localObject);
      paramPreference.putExtra("useJs", true);
      paramPreference.putExtra("vertical_scroll", true);
      paramPreference.putExtra("geta8key_scene", 3);
      paramPreference.putExtra("KPublisherId", "brand_profile");
      paramPreference.putExtra("prePublishId", "brand_profile");
      if (((this.lVQ != null) && ((this.eLK == 39) || (this.eLK == 56) || (this.eLK == 35))) || (this.eLK == 87) || (this.eLK == 89) || (this.eLK == 85) || (this.eLK == 88))
      {
        x.d("MicroMsg.NewBizInfoMoreInofUI", "from biz search.");
        localObject = new Bundle();
        ((Bundle)localObject).putBoolean("KFromBizSearch", true);
        ((Bundle)localObject).putBundle("KBizSearchExtArgs", this.lVQ);
        paramPreference.putExtra("jsapiargs", (Bundle)localObject);
        if (com.tencent.mm.l.a.gd(this.guS.field_type))
        {
          i = 7;
          j = getResources().getIdentifier(paramf.dKS, "string", getPackageName());
          paramf = paramf.title;
          if (j > 0) {
            paramf = getString(j);
          }
          ay(i, paramf);
        }
      }
      else
      {
        com.tencent.mm.bg.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
      }
    }
    label496:
    do
    {
      do
      {
        do
        {
          return true;
          i = 6;
          break;
          if (!"contact_info_verifyuser".endsWith(paramPreference)) {
            break label496;
          }
          paramf = this.lUs;
        } while (paramf == null);
        localObject = paramf.bG(false);
      } while (localObject == null);
      paramPreference = null;
      if ((((d.b)localObject).Mt() != null) && (!bi.oW(((d.b)localObject).Mt().dLL))) {
        paramf = ((d.b)localObject).Mt().dLL;
      }
      for (;;)
      {
        if (!bi.oW(paramf))
        {
          paramPreference = new Intent();
          paramPreference.putExtra("rawUrl", paramf);
          paramPreference.putExtra("useJs", true);
          paramPreference.putExtra("vertical_scroll", true);
          paramPreference.putExtra("geta8key_scene", 3);
          com.tencent.mm.bg.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
        }
        com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(this.guS.field_username, 1200);
        return true;
        paramf = paramPreference;
        if (((d.b)localObject).Mu() != null)
        {
          paramf = paramPreference;
          if (!bi.oW(((d.b)localObject).Mu().dLT)) {
            paramf = ((d.b)localObject).Mu().dLT;
          }
        }
      }
      if (!"contact_info_trademark".endsWith(paramPreference)) {
        break label601;
      }
      paramf = this.lUs;
    } while ((paramf == null) || (paramf.bG(false) == null) || (bi.oW(paramf.bG(false).Mm())));
    paramPreference = new Intent();
    paramPreference.putExtra("rawUrl", paramf.bG(false).Mm());
    paramPreference.putExtra("useJs", true);
    paramPreference.putExtra("vertical_scroll", true);
    paramPreference.putExtra("geta8key_scene", 3);
    com.tencent.mm.bg.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
    return true;
    label601:
    if ("contact_info_service_phone".equals(paramPreference))
    {
      paramf = paramf.ZZ("contact_info_service_phone");
      if ((paramf != null) && (paramf.getSummary() != null) && (!bi.oW(paramf.getSummary().toString())))
      {
        paramf = paramf.getSummary().toString();
        com.tencent.mm.ui.base.h.a(this, true, paramf, "", getString(R.l.contact_info_dial), getString(R.l.app_cancel), new NewBizInfoMoreInofUI.3(this, paramf), null);
      }
    }
    if (paramPreference.startsWith("contact_info_bizinfo_external#"))
    {
      j = bi.getInt(paramPreference.replace("contact_info_bizinfo_external#", ""), -1);
      if ((j >= 0) && (j < this.dKO.size()))
      {
        paramf = (d.a)this.dKO.get(j);
        localObject = paramf.url;
        paramPreference = new Intent();
        paramPreference.putExtra("rawUrl", (String)localObject);
        paramPreference.putExtra("useJs", true);
        paramPreference.putExtra("vertical_scroll", true);
        paramPreference.putExtra("geta8key_scene", 3);
        paramPreference.putExtra("KPublisherId", "brand_profile");
        paramPreference.putExtra("prePublishId", "brand_profile");
        if (((this.lVQ != null) && ((this.eLK == 39) || (this.eLK == 56) || (this.eLK == 35))) || (this.eLK == 87) || (this.eLK == 89) || (this.eLK == 85) || (this.eLK == 88))
        {
          x.d("MicroMsg.NewBizInfoMoreInofUI", "from biz search.");
          localObject = new Bundle();
          ((Bundle)localObject).putBoolean("KFromBizSearch", true);
          ((Bundle)localObject).putBundle("KBizSearchExtArgs", this.lVQ);
          paramPreference.putExtra("jsapiargs", (Bundle)localObject);
          if (!com.tencent.mm.l.a.gd(this.guS.field_type)) {
            break label1011;
          }
        }
        for (;;)
        {
          j = getResources().getIdentifier(paramf.dKS, "string", getPackageName());
          paramf = paramf.title;
          if (j > 0) {
            paramf = getString(j);
          }
          ay(i, paramf);
          com.tencent.mm.bg.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
          return true;
          label1011:
          i = 6;
        }
      }
    }
    if (paramPreference.equals("contact_info_verifyuser_weibo"))
    {
      new com.tencent.mm.plugin.profile.ui.a.a(this).ef(this.guS.csO, this.guS.field_username);
      return true;
    }
    if (("contact_info_guarantee_info".equals(paramPreference)) && (this.dKP.Mr() != null) && (!bi.oW(this.dKP.Mr().dLQ)))
    {
      paramf = new Intent();
      paramf.putExtra("rawUrl", this.dKP.Mr().dLQ);
      paramf.putExtra("useJs", true);
      paramf.putExtra("vertical_scroll", true);
      paramf.putExtra("geta8key_scene", 3);
      com.tencent.mm.bg.d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
    }
    if ((!"contact_info_expose_btn".equals(paramPreference)) || (this.guS == null) || (bi.oW(this.guS.field_username))) {}
    for (;;)
    {
      return false;
      paramf = new Intent();
      paramf.putExtra("rawUrl", String.format("https://mp.weixin.qq.com/mp/infringement?username=%s&from=1#wechat_redirect", new Object[] { this.guS.field_username }));
      paramf.putExtra("showShare", false);
      com.tencent.mm.bg.d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
    }
  }
  
  public final void d(LinkedList<cgc> paramLinkedList)
  {
    z.MZ().b(this);
    if (this.eOE == null)
    {
      x.e("MicroMsg.NewBizInfoMoreInofUI", "onKFSceneEnd, screen is null");
      return;
    }
    if (this.guS == null)
    {
      x.e("MicroMsg.NewBizInfoMoreInofUI", "onKFSceneEnd, contact is null");
      return;
    }
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      x.w("MicroMsg.NewBizInfoMoreInofUI", "onKFSceneEnd, worker is null");
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
  
  protected final void initView()
  {
    this.eOE.bw("biz_placed_to_the_top", true);
    Object localObject2 = com.tencent.mm.ac.f.kH(this.guS.field_username);
    this.dKO = null;
    this.dKP = null;
    Object localObject1;
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
      this.dKW = this.dKP.Mj();
    }
    boolean bool;
    label377:
    Object localObject4;
    Object localObject6;
    int i;
    if (com.tencent.mm.l.a.gd(this.guS.field_type)) {
      if (this.lUs == null)
      {
        bool = true;
        if (!bool) {
          break label1207;
        }
        localObject1 = (KeyValuePreference)this.eOE.ZZ("contact_info_wechat_account");
        if (bi.oW(this.guS.wM())) {
          break label1101;
        }
        this.eOE.bw("contact_info_wechat_account", false);
        ((KeyValuePreference)localObject1).setSummary(com.tencent.mm.pluginsdk.ui.d.j.a(this, this.guS.wM()));
        if ((this.dKP == null) || (this.dKP.Mt() == null) || (bi.oW(this.dKP.Mt().dLJ))) {
          break label1353;
        }
        localObject4 = this.dKP.Mt();
        localObject6 = (KeyValuePreference)this.eOE.ZZ("contact_info_verifyuser");
        if (localObject6 == null) {
          break label1337;
        }
        ((KeyValuePreference)localObject6).csl();
        ((KeyValuePreference)localObject6).tCA = false;
        if (!bi.oW(((d.b.d)localObject4).dLK)) {
          break label1268;
        }
        i = ((d.b.d)localObject4).dLI;
        switch (i)
        {
        default: 
          x.w("MicroMsg.NewBizInfoMoreInofUI", "getVerifyStr, error type %d", new Object[] { Integer.valueOf(i) });
          localObject1 = getResources().getString(R.l.contact_info_isnot_verify_user_title);
          label527:
          ((KeyValuePreference)localObject6).tmc = ((String)localObject1);
          label534:
          if (am.a.dBt != null)
          {
            localObject1 = BackwardSupportUtil.b.e(am.a.dBt.gX(this.guS.field_verifyFlag), 2.0F);
            label561:
            if (localObject1 == null) {
              break label3170;
            }
            localObject2 = com.tencent.mm.sdk.platformtools.c.CV(R.k.new_biz_certified);
          }
          break;
        }
      }
    }
    label597:
    label1101:
    label1207:
    label1268:
    label1326:
    label1337:
    label1353:
    label1450:
    label1456:
    label1462:
    label1499:
    label1667:
    label1729:
    label1792:
    label1852:
    label1986:
    label2021:
    label2981:
    label2997:
    label3013:
    label3029:
    label3045:
    label3087:
    label3103:
    label3119:
    label3135:
    label3149:
    label3154:
    label3157:
    label3163:
    label3170:
    Object localObject3;
    for (localObject2 = new BitmapDrawable(getResources(), (Bitmap)localObject2);; localObject3 = null)
    {
      String str;
      if (localObject1 == null)
      {
        bool = true;
        x.i("MicroMsg.NewBizInfoMoreInofUI", "verify bmp is null ? %B", new Object[] { Boolean.valueOf(bool) });
        ((KeyValuePreference)localObject6).tCI = ((Drawable)localObject2);
        if (((d.b.d)localObject4).dLJ == null) {
          break label1326;
        }
        str = ((d.b.d)localObject4).dLM;
        localObject2 = com.tencent.mm.pluginsdk.ui.d.j.a(this, ((d.b.d)localObject4).dLJ.trim());
        if (bi.oW(str)) {
          break label3163;
        }
      }
      for (;;)
      {
        try
        {
          localObject1 = new SpannableString(str + " " + localObject2);
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException2)
        {
          localObject1 = localObject2;
          localObject2 = localIndexOutOfBoundsException2;
        }
        try
        {
          ((SpannableString)localObject1).setSpan(new ForegroundColorSpan(-36352), 0, str.length(), 17);
          ((KeyValuePreference)localObject6).setSummary((CharSequence)localObject1);
          if ((this.dKP == null) || (bi.oW(this.dKP.Mn()))) {
            break label1462;
          }
          localObject2 = (KeyValuePreference)this.eOE.ZZ("contact_info_trademark");
          if (localObject2 == null) {
            continue;
          }
          ((KeyValuePreference)localObject2).csl();
          ((KeyValuePreference)localObject2).tCA = false;
          if (am.a.dBt == null) {
            break label1450;
          }
          localObject1 = com.tencent.mm.sdk.platformtools.c.CV(R.k.new_biz_trademark_protection);
          if (localObject1 != null) {
            break label1456;
          }
          bool = true;
          x.i("MicroMsg.NewBizInfoMoreInofUI", "trademark bmp is null ? %B", new Object[] { Boolean.valueOf(bool) });
          if (localObject1 == null) {
            break label3157;
          }
          localObject1 = new BitmapDrawable(getResources(), (Bitmap)localObject1);
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException1)
        {
          for (;;)
          {
            int k;
            continue;
            int j = k;
          }
          localObject1 = null;
          continue;
        }
        ((KeyValuePreference)localObject2).tCI = ((Drawable)localObject1);
        ((KeyValuePreference)localObject2).setSummary(this.dKP.Mn());
        x.d("MicroMsg.NewBizInfoMoreInofUI", "trademark name : %s, url : %s.", new Object[] { this.dKP.Mn(), this.dKP.Mm() });
        if ((this.dKP != null) && (this.dKP.Mp() != null) && (this.dKP.Mp().size() > 0))
        {
          localObject1 = (KeyValuePreference)this.eOE.ZZ("contact_info_privilege");
          ((KeyValuePreference)localObject1).csl();
          ((KeyValuePreference)localObject1).lO(false);
          ((KeyValuePreference)localObject1).csk();
          localObject2 = this.dKP.Mp().iterator();
          if (!((Iterator)localObject2).hasNext()) {
            break label1499;
          }
          localObject4 = (d.b.f)((Iterator)localObject2).next();
          localObject6 = (LinearLayout)View.inflate(this, R.i.keyvalue_pref_item, null);
          ((ImageView)((LinearLayout)localObject6).findViewById(R.h.image_iv)).setImageDrawable(new com.tencent.mm.plugin.profile.ui.b.a(getResources(), ((d.b.f)localObject4).iconUrl));
          str = ((d.b.f)localObject4).description;
          getResources().getIdentifier(((d.b.f)localObject4).dLR, "string", getPackageName());
          ((TextView)((LinearLayout)localObject6).findViewById(R.h.summary)).setText(str);
          ((KeyValuePreference)localObject1).dp((View)localObject6);
          continue;
          bool = this.lUs.Me();
          break;
          if ((!ab.XT(this.guS.field_username)) && (!com.tencent.mm.model.s.hd(this.guS.field_username)))
          {
            this.eOE.bw("contact_info_wechat_account", false);
            localObject2 = bi.oV(this.guS.BM());
            ((KeyValuePreference)localObject1).setSummary(this.mController.tml.getString(R.l.app_field_username) + (String)localObject2);
            break label377;
          }
          this.eOE.bw("contact_info_wechat_account", true);
          break label377;
          this.eOE.bw("contact_info_wechat_account", true);
          break label377;
          localObject1 = getResources().getString(R.l.contact_info_verify_user_title);
          break label527;
          localObject1 = getResources().getString(R.l.contact_info_biz_new_sweibo_verify);
          break label527;
          localObject1 = getResources().getString(R.l.contact_info_biz_new_tweibo_verify);
          break label527;
          ((KeyValuePreference)localObject6).tmc = ((d.b.d)localObject4).dLK;
          break label534;
          localObject1 = null;
          break label561;
          bool = false;
          break label597;
          x.e("MicroMsg.NewBizInfoMoreInofUI", "verifySummary setSpan error: %s", new Object[] { ((IndexOutOfBoundsException)localObject2).getMessage() });
          continue;
          x.e("MicroMsg.NewBizInfoMoreInofUI", "[arthurdan.emojiSpan] Notice!!!! extInfo.verifyInfo.verifySourceDescription is null");
          continue;
          this.eOE.bw("contact_info_verifyuser", true);
          continue;
          if ((this.dKP != null) && (this.dKP.Mu() != null) && (!bi.oW(this.dKP.Mu().dLS)))
          {
            localObject1 = (KeyValuePreference)this.eOE.ZZ("contact_info_verifyuser");
            if (localObject1 == null) {
              continue;
            }
            ((KeyValuePreference)localObject1).setSummary(this.dKP.Mu().dLS);
            continue;
          }
          x.w("MicroMsg.NewBizInfoMoreInofUI", "has not verify info");
          this.eOE.bw("contact_info_verifyuser", true);
          continue;
          localObject1 = null;
          continue;
          bool = false;
          continue;
          x.w("MicroMsg.NewBizInfoMoreInofUI", "has not trademark info");
          this.eOE.bw("contact_info_trademark", true);
          continue;
        }
        this.eOE.bw("contact_info_privilege", true);
        localObject2 = getIntent().getStringExtra("Contact_BIZ_KF_WORKER_ID");
        x.d("MicroMsg.NewBizInfoMoreInofUI", "updateKF %s, %b", new Object[] { localObject2, Boolean.valueOf(this.lVO) });
        if (!this.lVO)
        {
          this.lVN = ((String)localObject2);
          if ((this.dKP == null) || (!this.dKP.MA()) || (this.guS == null)) {
            this.eOE.bw("contact_info_kf_worker", true);
          }
        }
        else
        {
          if ((this.dKP == null) || (bi.oW(this.dKP.Mz()))) {
            break label2981;
          }
          this.eOE.bw("contact_info_service_phone", false);
          localObject1 = this.eOE.ZZ("contact_info_service_phone");
          if (localObject1 != null)
          {
            ((Preference)localObject1).setSummary(this.dKP.Mz());
            ((Preference)localObject1).hIZ = getResources().getColor(R.e.link_color);
          }
          if ((this.dKP == null) || (this.dKP.Mr() == null)) {
            break label3045;
          }
          localObject1 = (BizInfoPayInfoIconPreference)this.eOE.ZZ("contact_info_reputation");
          if (this.dKP.Mr().dLN <= 0) {
            break label2997;
          }
          ((BizInfoPayInfoIconPreference)localObject1).uD(this.dKP.Mr().dLN);
          localObject1 = (BizInfoPayInfoIconPreference)this.eOE.ZZ("contact_info_guarantee_info");
          if ((this.dKP.Mr().dLP == null) || (this.dKP.Mr().dLP.size() <= 0)) {
            break label3013;
          }
          ((BizInfoPayInfoIconPreference)localObject1).bH(this.dKP.Mr().dLP);
          localObject1 = (KeyValuePreference)this.eOE.ZZ("contact_info_scope_of_business");
          if (bi.oW(this.dKP.Mr().dLO)) {
            break label3029;
          }
          ((KeyValuePreference)localObject1).setSummary(this.dKP.Mr().dLO);
          ((KeyValuePreference)localObject1).tCG = 4;
          ((KeyValuePreference)localObject1).lO(false);
          if ((!com.tencent.mm.model.s.v(this.guS)) || (this.guS.csO == null) || (this.guS.csO.equals(""))) {
            break label3087;
          }
          localObject1 = (KeyValuePreference)this.eOE.ZZ("contact_info_verifyuser_weibo");
          if (localObject1 != null)
          {
            ((KeyValuePreference)localObject1).setSummary(bi.aG(this.guS.field_weiboNickname, "") + getString(R.l.settings_show_weibo_field, new Object[] { com.tencent.mm.model.s.hV(this.guS.csO) }));
            ((Preference)localObject1).hIZ = com.tencent.mm.bp.a.g(this, R.e.link_color);
            ((KeyValuePreference)localObject1).lO(false);
          }
          if ((this.dKP == null) || (!this.dKP.Mi())) {
            break label3103;
          }
          this.eOE.ZZ("near_field_service").setSummary(R.l.weixin_connect_wifi);
          if (bnL() == null) {
            break label3119;
          }
          this.eOE.bw("contact_info_see_locate", false);
        }
        for (;;)
        {
          k = this.eOE.indexOf("contact_info_category2");
          if ((k < 0) || (this.dKO == null) || (this.dKO.size() <= 0)) {
            break label3135;
          }
          i = this.dKO.size() - 1;
          while (i >= 0)
          {
            if ((this.dKO.get(i) != null) && ((!getString(R.l.contact_info_biz_participants).equals(((d.a)this.dKO.get(i)).title)) || (this.dKW)) && ((!bi.oW(((d.a)this.dKO.get(i)).title)) || (!bi.oW(((d.a)this.dKO.get(i)).dKS))) && (!((d.a)this.dKO.get(i)).dKS.equals("__mp_wording__brandinfo_location")) && (!getString(R.l.contact_info_biz_see_location).equals(((d.a)this.dKO.get(i)).title)) && (!((d.a)this.dKO.get(i)).dKS.equals("__mp_wording__brandinfo_history_massmsg")))
            {
              localObject5 = new Preference(this);
              ((Preference)localObject5).setKey("contact_info_bizinfo_external#" + i);
              localObject1 = ((d.a)this.dKO.get(i)).title;
              j = getResources().getIdentifier(((d.a)this.dKO.get(i)).dKS, "string", getPackageName());
              if (j > 0) {
                localObject1 = getString(j);
              }
              localObject2 = localObject1;
              if (this.lUs.LX()) {
                if (!"__mp_wording__brandinfo_history_massmsg".equals(((d.a)this.dKO.get(i)).dKS))
                {
                  localObject2 = localObject1;
                  if (!((String)localObject1).equals(getString(R.l.__mp_wording__brandinfo_history_massmsg))) {}
                }
                else
                {
                  localObject2 = getString(R.l.enterprise_brand_history);
                }
              }
              ((Preference)localObject5).setTitle((CharSequence)localObject2);
              if (!bi.oW(((d.a)this.dKO.get(i)).description)) {
                ((Preference)localObject5).setSummary(((d.a)this.dKO.get(i)).description);
              }
              if (!bi.oV(((d.a)this.dKO.get(i)).dKS).equals("__mp_wording__brandinfo_feedback")) {
                break label3149;
              }
              j = this.eOE.indexOf("contact_info_scope_of_business");
              if (j <= 0) {
                break label3149;
              }
              j += 1;
              this.eOE.a((Preference)localObject5, j);
              if (bi.oV(((d.a)this.dKO.get(i)).dKS).equals("__mp_wording__brandinfo_biz_detail"))
              {
                localObject1 = new PreferenceSmallCategory(this);
                this.eOE.a((Preference)localObject1, j);
              }
            }
            i -= 1;
          }
          if (bi.oW((String)localObject2))
          {
            localObject1 = z.MX().kR(this.guS.field_username);
            if (localObject1 == null)
            {
              this.eOE.bw("contact_info_kf_worker", true);
              z.MZ().a(this);
              z.MZ().ag(this.guS.field_username, com.tencent.mm.model.q.GF());
              this.lVO = true;
              break;
            }
            x.d("MicroMsg.NewBizInfoMoreInofUI", "has default kf %s", new Object[] { ((g)localObject1).field_openId });
            this.eOE.bw("contact_info_kf_worker", false);
            localObject2 = (IconWidgetPreference)this.eOE.ZZ("contact_info_kf_worker");
            ((IconWidgetPreference)localObject2).setSummary(((g)localObject1).field_nickname);
            localObject5 = com.tencent.mm.aa.c.a(((g)localObject1).field_openId, false, -1);
            if (localObject5 == null)
            {
              c((g)localObject1);
              JF(((g)localObject1).field_openId);
              break;
            }
            ((IconWidgetPreference)localObject2).C((Bitmap)localObject5);
            break;
          }
          Object localObject5 = z.MX();
          localObject1 = ((i)localObject5).kQ((String)localObject2);
          if ((localObject1 == null) || (i.a((g)localObject1)))
          {
            z.MZ().a(this);
            z.MZ().ah(this.guS.field_username, (String)localObject2);
            this.lVO = true;
          }
          if (localObject1 != null) {
            break label3154;
          }
          x.d("MicroMsg.NewBizInfoMoreInofUI", "no such kf, get default kf");
          localObject1 = ((i)localObject5).kR(this.guS.field_username);
          if (localObject1 == null)
          {
            this.eOE.bw("contact_info_kf_worker", true);
            break;
          }
          this.eOE.bw("contact_info_kf_worker", false);
          localObject2 = (IconWidgetPreference)this.eOE.ZZ("contact_info_kf_worker");
          ((IconWidgetPreference)localObject2).setSummary(((g)localObject1).field_nickname);
          localObject5 = com.tencent.mm.aa.c.a(((g)localObject1).field_openId, false, -1);
          if (localObject5 == null)
          {
            c((g)localObject1);
            JF(((g)localObject1).field_openId);
          }
          for (;;)
          {
            x.d("MicroMsg.NewBizInfoMoreInofUI", "kf worker %s, %s", new Object[] { ((g)localObject1).field_openId, ((g)localObject1).field_nickname });
            break;
            ((IconWidgetPreference)localObject2).C((Bitmap)localObject5);
          }
          this.eOE.bw("contact_info_service_phone", true);
          break label1667;
          this.eOE.bw("contact_info_reputation", true);
          break label1729;
          this.eOE.bw("contact_info_guarantee_info", true);
          break label1792;
          this.eOE.bw("contact_info_scope_of_business", true);
          break label1852;
          this.eOE.bw("contact_info_reputation", true);
          this.eOE.bw("contact_info_guarantee_info", true);
          this.eOE.bw("contact_info_scope_of_business", true);
          break label1852;
          this.eOE.bw("contact_info_verifyuser_weibo", true);
          break label1986;
          this.eOE.bw("near_field_service", true);
          break label2021;
          this.eOE.bw("contact_info_see_locate", true);
        }
        x.d("MicroMsg.NewBizInfoMoreInofUI", "pos no more");
        return;
        localObject1 = localIndexOutOfBoundsException1;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    lF(a.lYr);
    if (Build.VERSION.SDK_INT >= 21) {
      com.tencent.mm.ui.statusbar.a.c(this.mController.contentView, getWindow().getStatusBarColor(), com.tencent.mm.ui.statusbar.d.c(getWindow()));
    }
    setMMTitle(R.l.contact_info_biz_more);
    nS(-16777216);
    com.tencent.mm.ui.s.cqp();
    cqh();
    lC(false);
    setBackBtn(new NewBizInfoMoreInofUI.1(this), R.k.actionbar_icon_dark_back);
    paramBundle = bi.oV(getIntent().getStringExtra("Contact_User"));
    String str1 = bi.oV(getIntent().getStringExtra("Contact_Alias"));
    int i = getIntent().getIntExtra("Contact_VUser_Info_Flag", 0);
    int j = getIntent().getIntExtra("Contact_KWeibo_flag", 0);
    String str2 = getIntent().getStringExtra("Contact_KWeibo");
    String str3 = getIntent().getStringExtra("Contact_KWeiboNick");
    au.HU();
    this.guS = com.tencent.mm.model.c.FR().Yg(paramBundle);
    if ((this.guS == null) || ((int)this.guS.dhP == 0) || (bi.oV(this.guS.field_username).length() <= 0))
    {
      this.guS = new ab();
      this.guS.setUsername(paramBundle);
      this.guS.du(str1);
      this.guS.eF(i);
      this.guS.dQ(str2);
      this.guS.eE(j);
      this.guS.dA(str3);
    }
    for (;;)
    {
      this.lUs = com.tencent.mm.ac.f.kH(this.guS.field_username);
      paramBundle = getIntent().getByteArrayExtra("Contact_customInfo");
      if (paramBundle == null) {
        paramBundle = null;
      }
      try
      {
        for (;;)
        {
          this.lVI = paramBundle;
          this.eLK = getIntent().getIntExtra("Contact_Scene", 9);
          this.lVQ = getIntent().getBundleExtra("Contact_Ext_Args");
          initView();
          return;
          if (i == 0) {
            break;
          }
          this.guS.eF(i);
          break;
          paramBundle = (qt)new qt().aG(paramBundle);
        }
      }
      catch (IOException paramBundle)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.NewBizInfoMoreInofUI", paramBundle, "", new Object[0]);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */