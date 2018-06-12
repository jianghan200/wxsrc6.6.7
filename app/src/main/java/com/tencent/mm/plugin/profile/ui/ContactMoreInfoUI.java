package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.k.e;
import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.account.b;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ContactMoreInfoUI
  extends MMActivity
  implements com.tencent.mm.plugin.fts.a.l
{
  private String cYO;
  u hLB;
  private String hMQ;
  boolean hNi = false;
  private ag handler = new ag(Looper.getMainLooper());
  private ab ipd;
  private String kiv;
  private ProfileNormalItemView lVb;
  private ProfileNormalItemView lVc;
  private ProfileNormalItemView lVd;
  private ProfileNormalItemView lVe;
  private ProfileNormalItemView lVf;
  private ProfileNormalItemView lVg;
  private ProfileNormalItemView lVh;
  private String lVi;
  private String lVj;
  private String lVk;
  private long lVl;
  private String lVm;
  String lVn = null;
  
  private boolean I(ab paramab)
  {
    if (q.GF().equals(paramab.field_username))
    {
      au.HU();
      paramab = (String)c.DT().get(aa.a.sRy, null);
      if (bi.oW(paramab)) {
        break label153;
      }
    }
    for (;;)
    {
      try
      {
        paramab = new JSONObject(paramab);
        this.lVn = paramab.optString("ShopUrl");
        paramab = paramab.optString("ShopName");
        if (bi.oW(this.lVn)) {
          break label158;
        }
        this.lVf.setVisibility(0);
        this.lVf.lXS = paramab;
        this.lVf.uO(getResources().getColor(R.e.profile_normal_item_view_summary_color));
        paramab = this.lVf;
        paramab.lXT = new ContactMoreInfoUI.2(this);
        paramab.bnH();
        return true;
      }
      catch (JSONException paramab)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ContactMoreInfoUI", paramab, "", new Object[0]);
      }
      paramab = paramab.csY;
      break;
      label153:
      paramab = null;
    }
    label158:
    this.lVf.setVisibility(8);
    return false;
  }
  
  private void bnn()
  {
    this.hNi = getIntent().getBooleanExtra("Is_RoomOwner", false);
    this.hMQ = getIntent().getStringExtra("Contact_ChatRoomId");
    this.cYO = getIntent().getStringExtra("Contact_User");
    au.HU();
    this.ipd = c.FR().Yg(this.cYO);
    this.lVi = getIntent().getStringExtra("KLinkedInAddFriendNickName");
    this.lVj = getIntent().getStringExtra("KLinkedInAddFriendPubUrl");
    this.kiv = getIntent().getStringExtra("verify_gmail");
    this.lVk = getIntent().getStringExtra("profileName");
  }
  
  public final void b(com.tencent.mm.plugin.fts.a.a.j paramj)
  {
    if (paramj.bjW == 0)
    {
      int i = ((Integer)((com.tencent.mm.plugin.fts.a.a.l)paramj.jsx.get(0)).userData).intValue();
      this.lVe.lXS = getString(R.l.contact_info_common_chatroom_number, new Object[] { Integer.valueOf(i) });
      this.lVe.lXT = new ContactMoreInfoUI.5(this, i);
    }
    for (;;)
    {
      this.lVe.bnH();
      return;
      this.lVe.lXS = getString(R.l.contact_info_common_chatroom_number, new Object[] { Integer.valueOf(0) });
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.contact_info_more_ui;
  }
  
  protected final void initView()
  {
    int j = 0;
    super.initView();
    this.lVb = ((ProfileNormalItemView)findViewById(R.h.linkedin));
    this.lVc = ((ProfileNormalItemView)findViewById(R.h.google_plus));
    this.lVd = ((ProfileNormalItemView)findViewById(R.h.qq));
    this.lVg = ((ProfileNormalItemView)findViewById(R.h.signature));
    this.lVg.uM(R.l.contact_info_signature);
    this.lVg.lSk.setSingleLine(false);
    this.lVh = ((ProfileNormalItemView)findViewById(R.h.friend_source));
    this.lVh.uM(R.l.contact_info_source_title);
    this.lVf = ((ProfileNormalItemView)findViewById(R.h.weishop));
    this.lVe = ((ProfileNormalItemView)findViewById(R.h.common_chatroom));
    setBackBtn(new ContactMoreInfoUI.1(this));
    bnn();
    au.HU();
    this.hLB = c.Ga().ih(this.hMQ);
    Object localObject1 = com.tencent.mm.k.g.AT().getValue("LinkedinPluginClose");
    boolean bool1;
    label298:
    boolean bool3;
    Object localObject2;
    boolean bool2;
    label539:
    boolean bool4;
    label800:
    boolean bool5;
    boolean bool6;
    if ((bi.oW((String)localObject1)) || (Integer.valueOf((String)localObject1).intValue() == 0))
    {
      i = 1;
      if ((i == 0) || (bi.oW(this.ipd.csV))) {
        break label928;
      }
      this.lVb.setVisibility(0);
      if (bi.oW(this.lVi)) {
        this.lVi = this.ipd.csW;
      }
      localObject1 = this.lVb;
      ((ProfileNormalItemView)localObject1).lXS = this.lVi;
      ((ProfileNormalItemView)localObject1).lXT = new ContactMoreInfoUI.3(this);
      bool1 = ((ProfileNormalItemView)localObject1).uO(getResources().getColor(R.e.profile_normal_item_view_summary_color)).bnH();
      this.lVc.setVisibility(0);
      localObject1 = this.lVc;
      ((ProfileNormalItemView)localObject1).lXS = this.kiv;
      bool3 = ((ProfileNormalItemView)localObject1).bnH();
      au.HU();
      i = bi.f((Integer)c.DT().get(9, null));
      this.lVl = getIntent().getLongExtra("Contact_Uin", 0L);
      this.lVm = getIntent().getStringExtra("Contact_QQNick");
      if ((this.lVl == 0L) || (i == 0)) {
        break label942;
      }
      if ((this.lVm == null) || (this.lVm.length() == 0))
      {
        long l = this.lVl;
        localObject2 = b.getQQListStg().bK(l);
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = null;
        }
        if (localObject1 != null) {
          this.lVm = ((ao)localObject1).getDisplayName();
        }
      }
      localObject1 = bi.oV(this.lVm);
      localObject1 = (String)localObject1 + " " + new o(this.lVl).longValue();
      this.lVd.setVisibility(0);
      localObject2 = this.lVd;
      ((ProfileNormalItemView)localObject2).lXS = ((CharSequence)localObject1);
      ((ProfileNormalItemView)localObject2).lXT = new ContactMoreInfoUI.4(this);
      bool2 = ((ProfileNormalItemView)localObject2).bnH();
      localObject1 = this.lVg;
      ((ProfileNormalItemView)localObject1).lXS = com.tencent.mm.pluginsdk.ui.d.j.a(this, this.ipd.signature);
      bool4 = ((ProfileNormalItemView)localObject1).bnH();
      switch (this.ipd.getSource())
      {
      default: 
        this.lVh.lXS = null;
        bool5 = this.lVh.bnH();
        bool6 = I(this.ipd);
        i = j;
        if (!this.ipd.field_username.equals(q.GF()))
        {
          localObject1 = this.ipd;
          if ((!ab.XR(((ai)localObject1).field_username)) && (!((ai)localObject1).field_username.equals(q.GF()))) {
            break label1478;
          }
        }
        break;
      }
    }
    label928:
    label942:
    label1478:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label1483;
      }
      this.lVe.setVisibility(8);
      i = j;
      if ((!bool4) && (!bool5) && (!bool6) && (!bool1) && (!bool3) && (!bool2) && (i == 0)) {
        finish();
      }
      return;
      i = 0;
      break;
      this.lVb.setVisibility(8);
      bool1 = false;
      break label298;
      this.lVd.setVisibility(8);
      bool2 = false;
      break label539;
      this.lVh.uN(R.l.fmessage_come_from_qq);
      break label800;
      if (this.ipd.BN() > 1000000)
      {
        this.lVh.uN(R.l.contact_info_source_by_search_qq_passive);
        break label800;
      }
      this.lVh.uN(R.l.contact_info_source_by_search_qq);
      break label800;
      if (this.ipd.BN() > 1000000)
      {
        this.lVh.uN(R.l.contact_info_source_by_search_wechat_passive);
        break label800;
      }
      this.lVh.uN(R.l.contact_info_source_by_search_wechat);
      break label800;
      if (this.ipd.BN() > 1000000)
      {
        this.lVh.uN(R.l.contact_info_source_by_card_passive);
        break label800;
      }
      this.lVh.uN(R.l.contact_info_source_by_card);
      break label800;
      if (this.ipd.BN() > 1000000)
      {
        this.lVh.uN(R.l.contact_info_source_by_lbs_passive);
        break label800;
      }
      this.lVh.uN(R.l.contact_info_source_by_lbs);
      break label800;
      if (this.ipd.BN() > 1000000)
      {
        this.lVh.uN(R.l.contact_info_source_by_qrcode_passive);
        break label800;
      }
      this.lVh.uN(R.l.contact_info_source_by_qrcode);
      break label800;
      this.lVh.uN(R.l.contact_info_source_by_raddar);
      break label800;
      if (this.ipd.BN() > 1000000)
      {
        this.lVh.uN(R.l.contact_info_source_by_chatroom_passive);
        break label800;
      }
      this.lVh.uN(R.l.contact_info_source_by_chatroom);
      break label800;
      if (this.ipd.BN() > 1000000)
      {
        this.lVh.uN(R.l.contact_info_source_by_shake_passive);
        break label800;
      }
      this.lVh.uN(R.l.contact_info_source_by_shake);
      break label800;
      this.lVh.uN(R.l.contact_info_source_brandqa);
      break label800;
      this.lVh.uN(R.l.gcontact_from_source);
      break label800;
      this.lVh.uN(R.l.contact_info_source_by_linkedin);
      break label800;
      if (this.ipd.BN() > 1000000)
      {
        this.lVh.uN(R.l.contact_info_source_by_view_address_book_passive);
        break label800;
      }
      this.lVh.uN(R.l.contact_info_source_by_view_address_book);
      break label800;
      if (this.ipd.BN() > 1000000)
      {
        this.lVh.uN(R.l.contact_info_source_by_view_address_book_passive);
        break label800;
      }
      this.lVh.uN(R.l.contact_info_source_by_view_address_book);
      break label800;
      if (this.ipd.BN() > 1000000)
      {
        this.lVh.uN(R.l.contact_info_source_by_bottle_passive);
        break label800;
      }
      this.lVh.uN(R.l.contact_info_source_by_bottle);
      break label800;
      if (this.ipd.BN() > 1000000)
      {
        this.lVh.uN(R.l.contact_info_source_by_search_mobile_passive);
        break label800;
      }
      this.lVh.uN(R.l.contact_info_source_by_search_mobile);
      break label800;
    }
    label1483:
    if (((ai)localObject1).sex == 1) {
      this.lVe.uM(R.l.contact_info_common_chatroom_male);
    }
    for (;;)
    {
      this.lVe.bnH();
      localObject2 = new i();
      ((i)localObject2).bWm = ((ai)localObject1).field_username;
      ((i)localObject2).jsv = this;
      ((i)localObject2).handler = this.handler;
      ((i)localObject2).jsn = 5;
      ((n)com.tencent.mm.kernel.g.n(n.class)).search(2, (i)localObject2);
      i = 1;
      break;
      if (((ai)localObject1).sex == 2) {
        this.lVe.uM(R.l.contact_info_common_chatroom_female);
      } else {
        this.lVe.uM(R.l.contact_info_common_chatroom_unknow);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bnn();
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */