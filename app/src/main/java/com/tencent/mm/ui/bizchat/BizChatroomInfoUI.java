package com.tencent.mm.ui.bizchat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Looper;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.l;
import com.tencent.mm.ac.a.b;
import com.tencent.mm.ac.a.c;
import com.tencent.mm.ac.a.d.a;
import com.tencent.mm.ac.a.k;
import com.tencent.mm.ac.z;
import com.tencent.mm.ak.o;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.i;
import com.tencent.mm.pluginsdk.ui.preference.SignaturePreference;
import com.tencent.mm.protocal.c.hs;
import com.tencent.mm.protocal.c.hu;
import com.tencent.mm.protocal.c.hv;
import com.tencent.mm.protocal.c.ql;
import com.tencent.mm.protocal.c.qm;
import com.tencent.mm.protocal.c.xr;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BizChatroomInfoUI
  extends MMPreference
  implements com.tencent.mm.ab.e, com.tencent.mm.ac.n
{
  private static boolean hLS = false;
  private SharedPreferences duR = null;
  private ProgressDialog eHw = null;
  private f eOE;
  private int fromScene;
  private boolean hEj;
  private com.tencent.mm.pluginsdk.ui.d hLH = new com.tencent.mm.pluginsdk.ui.d(new AbsListView.OnScrollListener()
  {
    public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    
    public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
    {
      o.Pj().br(paramAnonymousInt);
    }
  });
  boolean hLI = false;
  private SignaturePreference hLl;
  private ContactListExpandPreference hLp;
  private CheckBoxPreference hLq;
  private CheckBoxPreference hLr;
  private CheckBoxPreference hLs;
  private boolean hLy = false;
  private int hLz;
  private long hpD;
  private String hpJ;
  private boolean isDeleteCancel = false;
  private com.tencent.mm.ac.a.j lVG = null;
  private c tDV = null;
  private d.a tEA = new BizChatroomInfoUI.3(this);
  private boolean tFA;
  private int tFB;
  private com.tencent.mm.ac.a.j tFC = null;
  private String tFx;
  private boolean tFy = false;
  private boolean tFz;
  
  private void a(hv paramhv1, hv paramhv2)
  {
    x.i("MicroMsg.BizChatroomInfoUI", "updateBizChatMemberList()");
    if (paramhv1 == null) {}
    for (String str = getString(R.l.room_del_member);; str = getString(R.l.adding_room_mem))
    {
      z.Ng();
      paramhv1 = com.tencent.mm.ac.a.h.a(this.tDV.field_brandUserName, this.tDV.field_bizChatServId, paramhv1, paramhv2, this);
      getString(R.l.app_tip);
      this.eHw = com.tencent.mm.ui.base.h.a(this, str, true, new BizChatroomInfoUI.6(this, paramhv1));
      return;
    }
  }
  
  private void aAC()
  {
    Object localObject;
    if (this.hLp != null)
    {
      if (!this.tFy) {
        break label70;
      }
      localObject = com.tencent.mm.ac.a.e.bk(this.hpD);
      if (localObject == null) {
        break label95;
      }
      this.hLz = ((List)localObject).size();
      label36:
      if (this.hLz > 1) {
        break label103;
      }
      this.hLp.kG(true).kH(false);
    }
    for (;;)
    {
      this.hLp.p(this.hpJ, (List)localObject);
      return;
      label70:
      localObject = new LinkedList();
      ((List)localObject).add(this.tDV.field_bizChatServId);
      break;
      label95:
      this.hLz = 0;
      break label36;
      label103:
      this.hLp.kG(true).kH(this.hLy);
    }
  }
  
  private void aAE()
  {
    if (this.duR == null) {
      this.duR = getSharedPreferences(getPackageName() + "_preferences", 0);
    }
    if (this.tFy)
    {
      this.hEj = this.tDV.hu(1);
      this.tFB = this.tDV.field_bitFlag;
      if (!this.hEj) {
        break label148;
      }
      setTitleMuteIconVisibility(0);
      if (this.hLq != null) {
        this.duR.edit().putBoolean("room_notify_new_msg", true).commit();
      }
    }
    for (;;)
    {
      this.eOE.notifyDataSetChanged();
      return;
      this.hEj = this.lVG.hu(1);
      this.tFB = this.lVG.field_bitFlag;
      break;
      label148:
      setTitleMuteIconVisibility(8);
      if (this.hLq != null) {
        this.duR.edit().putBoolean("room_notify_new_msg", false).commit();
      }
    }
  }
  
  private void aAG()
  {
    if (this.hLl != null)
    {
      if (aAH())
      {
        Object localObject2 = this.tDV.field_chatName;
        Object localObject1 = localObject2;
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (((String)localObject2).length() > 50) {
            localObject1 = ((String)localObject2).substring(0, 32);
          }
        }
        x.i("MicroMsg.BizChatroomInfoUI", "updateRoomName chatName:%s", new Object[] { localObject1 });
        SignaturePreference localSignaturePreference = this.hLl;
        if (localObject1 != null)
        {
          localObject2 = localObject1;
          if (((String)localObject1).length() > 0) {}
        }
        else
        {
          localObject2 = getString(R.l.settings_signature_empty);
        }
        localSignaturePreference.setSummary(com.tencent.mm.pluginsdk.ui.d.j.a(this, (CharSequence)localObject2));
      }
    }
    else {
      return;
    }
    this.hLl.setSummary(getString(R.l.room_has_no_topic));
  }
  
  private boolean aAH()
  {
    if (this.tFy) {}
    for (String str = this.tDV.field_chatName; bi.oW(str); str = this.lVG.field_userName) {
      return false;
    }
    return true;
  }
  
  private boolean aah(String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      try
      {
        JSONArray localJSONArray = new JSONArray(paramString);
        hv localhv = new hv();
        int i = 0;
        if (i < localJSONArray.length())
        {
          localObject = localJSONArray.getJSONObject(i);
          String str = ((JSONObject)localObject).getString("id");
          paramString = z.Nc().cz(str);
          if (paramString != null) {
            break label243;
          }
          paramString = new com.tencent.mm.ac.a.j();
          paramString.field_userId = str;
          paramString.field_userName = ((JSONObject)localObject).getString("nick_name");
          paramString.field_brandUserName = this.hpJ;
          paramString.field_headImageUrl = ((JSONObject)localObject).getString("head_img_url");
          paramString.field_profileUrl = ((JSONObject)localObject).getString("profile_url");
          paramString.field_UserVersion = ((JSONObject)localObject).getInt("ver");
          if (this.tFC == null) {
            break label246;
          }
          localObject = this.tFC.field_addMemberUrl;
          paramString.field_addMemberUrl = ((String)localObject);
          if (!z.Nc().b(paramString)) {
            z.Nc().a(paramString);
          }
          localObject = new hu();
          ((hu)localObject).riL = paramString.field_userId;
          localhv.riM.add(localObject);
          i += 1;
          continue;
        }
        a(localhv, null);
        return true;
      }
      catch (JSONException paramString)
      {
        x.i("MicroMsg.BizChatroomInfoUI", "parse memberJson Exception:%s", new Object[] { paramString.getMessage() });
        x.printErrStackTrace("MicroMsg.BizChatroomInfoUI", paramString, "", new Object[0]);
      }
      return false;
      label243:
      continue;
      label246:
      Object localObject = null;
    }
  }
  
  private void bnu()
  {
    x.d("MicroMsg.BizChatroomInfoUI", "updatePlaceTop()");
    if (this.duR == null) {
      this.duR = getSharedPreferences(getPackageName() + "_preferences", 0);
    }
    if (this.tFy) {
      this.tFA = this.tDV.hu(16);
    }
    for (this.tFB = this.tDV.field_bitFlag;; this.tFB = this.lVG.field_bitFlag)
    {
      if (this.hLs != null) {
        this.duR.edit().putBoolean("room_placed_to_the_top", this.tFA).commit();
      }
      this.eOE.notifyDataSetChanged();
      return;
      this.tFA = this.lVG.hu(16);
    }
  }
  
  private void csA()
  {
    x.i("MicroMsg.BizChatroomInfoUI", "dealModChatNameFail reset bizChatName");
    this.tDV.field_chatName = this.tFx;
    this.tDV.field_bitFlag = this.tFB;
    this.hEj = this.tDV.hu(1);
    this.tFz = this.tDV.hu(8);
    this.tFA = this.tDV.hu(16);
    z.Na().b(this.tDV);
    if (this.tFA) {
      z.Nb().bh(this.tDV.field_bizChatLocalId);
    }
    for (;;)
    {
      this.duR.edit().putBoolean("room_placed_to_the_top", z.Nb().bg(this.tDV.field_bizChatLocalId)).commit();
      aAG();
      aAE();
      bnu();
      csy();
      Toast.makeText(this, getString(R.l.room_change_fail), 0).show();
      return;
      if (!this.tFA) {
        z.Nb().bi(this.tDV.field_bizChatLocalId);
      }
    }
  }
  
  private void csy()
  {
    x.d("MicroMsg.BizChatroomInfoUI", "updateSaveToContact()");
    if (this.duR == null) {
      this.duR = getSharedPreferences(getPackageName() + "_preferences", 0);
    }
    if (this.tFy)
    {
      this.tFz = this.tDV.hu(8);
      this.tFB = this.tDV.field_bitFlag;
      if (!this.tFz) {
        break label153;
      }
      if (this.hLr != null) {
        this.duR.edit().putBoolean("room_save_to_contact", true).commit();
      }
    }
    for (;;)
    {
      this.eOE.notifyDataSetChanged();
      return;
      this.tFz = this.lVG.hu(8);
      this.tFB = this.lVG.field_bitFlag;
      break;
      label153:
      if (this.hLr != null) {
        this.duR.edit().putBoolean("room_save_to_contact", false).commit();
      }
    }
  }
  
  private void csz()
  {
    if (this.hLp != null)
    {
      aAG();
      updateTitle();
      aAE();
      aAC();
      csy();
      bnu();
      this.hLp.notifyChanged();
    }
    this.eOE.notifyDataSetChanged();
  }
  
  private void updateTitle()
  {
    if (this.tFy)
    {
      this.hLz = com.tencent.mm.ac.a.e.bj(this.hpD);
      if (this.hLz != 0)
      {
        setMMTitle(getString(R.l.fmt_chatting_title_group, new Object[] { getString(R.l.roominfo_name), Integer.valueOf(this.hLz) }));
        return;
      }
    }
    setMMTitle(getString(R.l.roominfo_name));
  }
  
  private void w(boolean paramBoolean, int paramInt)
  {
    this.tFB = this.tDV.field_bitFlag;
    this.tFx = this.tDV.field_chatName;
    Object localObject;
    if (this.tFy)
    {
      if (paramBoolean) {
        localObject = this.tDV;
      }
      for (((c)localObject).field_bitFlag |= paramInt;; ((c)localObject).field_bitFlag &= (paramInt ^ 0xFFFFFFFF))
      {
        x.i("MicroMsg.BizChatroomInfoUI", "dealSetMute:bitFlag %s", new Object[] { Integer.valueOf(this.tDV.field_bitFlag) });
        z.Na().b(this.tDV);
        localObject = new hs();
        ((hs)localObject).riE = this.tDV.field_bizChatServId;
        ((hs)localObject).riG = this.tDV.field_bitFlag;
        z.Ng();
        com.tencent.mm.ac.a.h.a(this.tDV.field_brandUserName, (hs)localObject, this);
        return;
        localObject = this.tDV;
      }
    }
    if (paramBoolean) {
      localObject = this.lVG;
    }
    for (((com.tencent.mm.ac.a.j)localObject).field_bitFlag |= paramInt;; ((com.tencent.mm.ac.a.j)localObject).field_bitFlag &= (paramInt ^ 0xFFFFFFFF))
    {
      z.Nc().b(this.lVG);
      this.tDV.field_bitFlag = this.lVG.field_bitFlag;
      z.Na().b(this.tDV);
      break;
      localObject = this.lVG;
    }
  }
  
  public final com.tencent.mm.ac.a.j EE(int paramInt)
  {
    if ((this.hLp.getItem(paramInt) instanceof com.tencent.mm.ac.a.j)) {
      return (com.tencent.mm.ac.a.j)this.hLp.getItem(paramInt);
    }
    return null;
  }
  
  public final int Ys()
  {
    return R.o.bizchat_roominfo_pref;
  }
  
  public final com.tencent.mm.ui.base.preference.h a(SharedPreferences paramSharedPreferences)
  {
    return new com.tencent.mm.ui.base.preference.a(this, paramSharedPreferences);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml == null)
    {
      x.e("MicroMsg.BizChatroomInfoUI", "onSceneEnd: [%d], [%d], [%s], scene is null", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      return;
    }
    x.i("MicroMsg.BizChatroomInfoUI", "onSceneEnd: [%d], [%d], [%s], sceneType[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paraml.getType()) });
    this.hLz = com.tencent.mm.ac.a.e.bj(this.hpD);
    x.d("MicroMsg.BizChatroomInfoUI", "now is " + this.hLz);
    if (this.eHw != null) {
      this.eHw.dismiss();
    }
    paramString = com.tencent.mm.h.a.eV(paramString);
    if (paramString != null)
    {
      paramString.a(this, null, null);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      x.w("MicroMsg.BizChatroomInfoUI", "willen onSceneEnd err:Network not ok");
      csA();
      return;
    }
    paraml.getType();
  }
  
  public final void a(int paramInt, l paraml)
  {
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    Object localObject;
    if (paraml.getType() == 1355)
    {
      localObject = ((com.tencent.mm.ac.a.n)paraml).Nt();
      paraml = ((com.tencent.mm.ac.a.n)paraml).Nu();
      localObject = z.Na().la(((qm)localObject).ruQ.rDx.riE);
      if (localObject == null) {
        Toast.makeText(ad.getContext(), getString(R.l.room_change_add_memberfail), 0).show();
      }
    }
    do
    {
      do
      {
        return;
        if (this.fromScene == 2)
        {
          localIntent = new Intent();
          localIntent.addFlags(67108864);
          localIntent.putExtra("biz_chat_need_to_jump_to_chatting_ui", true);
          localIntent.putExtra("Contact_User", paraml.riK);
          localIntent.putExtra("biz_chat_chat_id", ((c)localObject).field_bizChatLocalId);
          com.tencent.mm.bg.d.e(this, ".ui.bizchat.BizChatConversationUI", localIntent);
          return;
        }
        Intent localIntent = new Intent();
        localIntent.addFlags(67108864);
        localIntent.putExtra("Chat_User", paraml.riK);
        localIntent.putExtra("key_biz_chat_id", ((c)localObject).field_bizChatLocalId);
        localIntent.putExtra("finish_direct", true);
        localIntent.putExtra("key_need_send_video", false);
        localIntent.putExtra("key_is_biz_chat", true);
        com.tencent.mm.plugin.chatroom.a.ezn.e(localIntent, this);
        return;
        if (paraml.getType() != 1356) {
          break;
        }
      } while (paramInt == 0);
      csA();
      return;
    } while ((paraml.getType() != 1353) || (paramInt < 0) || (this.lVG == null));
    this.lVG = z.Nc().cz(this.lVG.field_userId);
    csz();
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool2 = true;
    boolean bool1 = true;
    paramf = paramPreference.mKey;
    if (paramf.equals("room_name"))
    {
      paramf = "";
      if (aAH()) {
        paramf = this.tDV.field_chatName;
      }
      com.tencent.mm.ui.base.h.a(this.mController.tml, getString(R.l.room_name_modify), paramf, "", 32, new BizChatroomInfoUI.9(this, paramf));
    }
    do
    {
      return false;
      if (paramf.equals("room_notify_new_msg"))
      {
        if (!this.hEj) {}
        for (bool1 = true;; bool1 = false)
        {
          this.hEj = bool1;
          w(this.hEj, 1);
          aAE();
          return false;
        }
      }
      if (paramf.equals("room_placed_to_the_top"))
      {
        if (!this.tFA) {}
        for (;;)
        {
          this.tFA = bool1;
          w(this.tFA, 16);
          if (!this.tFA) {
            break;
          }
          z.Nb().bh(this.tDV.field_bizChatLocalId);
          return false;
          bool1 = false;
        }
        z.Nb().bi(this.tDV.field_bizChatLocalId);
        return false;
      }
      if (paramf.equals("room_del_quit"))
      {
        x.d("MicroMsg.BizChatroomInfoUI", " quit " + this.hpD);
        com.tencent.mm.ui.base.h.a(this.mController.tml, getString(R.l.del_room_mem_comfirm), "", new BizChatroomInfoUI.10(this), null);
        return false;
      }
    } while (!paramf.equals("room_save_to_contact"));
    if (!this.tFz) {}
    for (bool1 = bool2;; bool1 = false)
    {
      this.tFz = bool1;
      w(this.tFz, 8);
      csy();
      return false;
    }
  }
  
  protected final void initView()
  {
    this.eOE = this.tCL;
    Object localObject = this.tDV.field_ownerUserId;
    this.hLz = this.tDV.Nn().size();
    if (bi.oW((String)localObject))
    {
      this.hLy = false;
      x.d("MicroMsg.BizChatroomInfoUI", "initBaseChatRoomView()");
      this.hLp = ((ContactListExpandPreference)this.eOE.ZZ("roominfo_contact_anchor"));
      this.hLp.a(this.eOE, this.hLp.mKey);
      this.hLl = ((SignaturePreference)this.eOE.ZZ("room_name"));
      this.hLq = ((CheckBoxPreference)this.eOE.ZZ("room_notify_new_msg"));
      this.hLs = ((CheckBoxPreference)this.eOE.ZZ("room_placed_to_the_top"));
      this.hLr = ((CheckBoxPreference)this.eOE.ZZ("room_save_to_contact"));
      localObject = this.hLp;
      boolean bool = this.tFy;
      if (((ContactListExpandPreference)localObject).qJA != null) {
        ((ContactListExpandPreference)localObject).qJA.qIM.qJb = bool;
      }
      localObject = this.hLp;
      bool = this.hLy;
      if (((ContactListExpandPreference)localObject).qJA != null) {
        ((ContactListExpandPreference)localObject).qJA.qIM.qJa = bool;
      }
      if (!this.hLy) {
        break label405;
      }
      this.hLp.kG(true).kH(true);
    }
    for (;;)
    {
      this.hLp.TL(this.tDV.field_ownerUserId);
      this.hLp.cdU();
      this.hLp.cdX();
      if (!this.tFy)
      {
        this.eOE.bw("room_save_to_contact", true);
        this.eOE.bw("room_name", true);
        this.eOE.bw("room_del_quit", true);
      }
      csy();
      bnu();
      aAE();
      if (this.hLp != null)
      {
        this.kww.setOnScrollListener(this.hLH);
        this.hLp.a(this.hLH);
        this.hLp.a(new BizChatroomInfoUI.7(this));
      }
      setBackBtn(new BizChatroomInfoUI.8(this));
      return;
      this.hLy = ((String)localObject).equals(z.Nc().cA(this.hpJ));
      break;
      label405:
      this.hLp.kG(true).kH(false);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1) {}
    for (;;)
    {
      return;
      switch (paramInt1)
      {
      default: 
        return;
      }
      paramIntent = paramIntent.getBundleExtra("result_data");
      String str;
      boolean bool;
      if (paramIntent != null)
      {
        x.i("MicroMsg.BizChatroomInfoUI", "bundle != null");
        str = paramIntent.getString("enterprise_members");
        x.i("MicroMsg.BizChatroomInfoUI", "enterprise_members:%s", new Object[] { str });
        if (this.tFy) {
          bool = aah(str);
        }
      }
      while (!bool)
      {
        Toast.makeText(this, getString(R.l.room_change_add_memberfail), 0).show();
        return;
        xr localxr = new xr();
        c localc = new c();
        if (this.tFC != null) {}
        for (paramIntent = this.tFC.field_addMemberUrl;; paramIntent = null)
        {
          localc.field_addMemberUrl = paramIntent;
          localc.field_brandUserName = this.hpJ;
          if (!com.tencent.mm.ac.a.e.a(localc, str, this.lVG.field_userId, localxr)) {
            break label241;
          }
          z.Ng();
          paramIntent = com.tencent.mm.ac.a.h.a(this.hpJ, localxr, this);
          getString(R.l.app_tip);
          this.eHw = com.tencent.mm.ui.base.h.a(this, getString(R.l.adding_room_mem), true, new BizChatroomInfoUI.5(this, paramIntent));
          bool = true;
          break;
        }
        label241:
        bool = false;
        continue;
        bool = false;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    z.Na().a(this.tEA, Looper.getMainLooper());
    this.fromScene = getIntent().getIntExtra("key_biz_chat_info_from_scene", -1);
    this.hpJ = getIntent().getStringExtra("Chat_User");
    this.hpD = getIntent().getLongExtra("key_biz_chat_id", -1L);
    this.tDV = z.Na().ak(this.hpD);
    this.tFx = this.tDV.field_chatName;
    this.tFy = com.tencent.mm.ac.a.e.lc(this.tDV.field_bizChatServId);
    if (!this.tFy) {
      this.lVG = z.Nc().cz(this.tDV.field_bizChatServId);
    }
    this.tFC = z.Nc().lm(this.hpJ);
    initView();
    if ((this.tDV == null) || (this.tDV.field_bizChatServId == null) || (this.hpJ == null)) {
      return;
    }
    if (this.tDV.isGroup())
    {
      z.Ng();
      com.tencent.mm.ac.a.h.am(this.tDV.field_bizChatServId, this.hpJ);
      return;
    }
    z.Ng();
    com.tencent.mm.ac.a.h.a(this.tDV.field_bizChatServId, this.hpJ, this);
  }
  
  public void onDestroy()
  {
    com.tencent.mm.ui.g.a.dismiss();
    com.tencent.mm.ui.g.a.dismiss();
    z.Na().a(this.tEA);
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    aAG();
    updateTitle();
    aAE();
    bnu();
    csy();
    aAC();
    this.eOE.notifyDataSetChanged();
    super.onResume();
    if (!this.hLI)
    {
      String str = getIntent().getStringExtra("need_matte_high_light_item");
      if (!bi.oW(str))
      {
        int i = this.eOE.aab(str);
        setSelection(i - 3);
        new ag().postDelayed(new BizChatroomInfoUI.4(this, i), 10L);
      }
      this.hLI = true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/bizchat/BizChatroomInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */