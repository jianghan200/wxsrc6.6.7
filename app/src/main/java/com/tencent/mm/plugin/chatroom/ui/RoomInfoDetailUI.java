package com.tencent.mm.plugin.chatroom.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.pluginsdk.ui.preference.SignaturePreference;
import com.tencent.mm.pluginsdk.wallet.e;
import com.tencent.mm.protocal.c.aua;
import com.tencent.mm.protocal.c.aub;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.e.d;

@Deprecated
public class RoomInfoDetailUI
  extends MMPreference
  implements j.a
{
  private boolean bSD;
  private f eOE;
  private String fsV;
  private ab guS;
  private boolean hLA = false;
  private String hLP;
  private SignaturePreference hLl;
  private CheckBoxPreference hLq;
  private int hNE;
  private CheckBoxPreference hNF;
  private CheckBoxPreference hNG;
  private boolean isDeleteCancel = false;
  
  private boolean BE()
  {
    au.HU();
    return (com.tencent.mm.model.c.Ga().ih(this.fsV).field_chatroomdataflag & 0x2) == 0;
  }
  
  private void aAE()
  {
    boolean bool = true;
    if (!this.bSD) {
      return;
    }
    Object localObject = getSharedPreferences(this.hLP, 0);
    if (this.hNE == 0)
    {
      setTitleMuteIconVisibility(0);
      if (this.hLq != null)
      {
        this.hLq.qpJ = true;
        ((SharedPreferences)localObject).edit().putBoolean("room_msg_notify", true).commit();
      }
      if (this.hNG != null) {
        this.hNG.qpJ = BE();
      }
      localObject = this.eOE;
      if (this.hNE != 1) {
        break label160;
      }
    }
    for (;;)
    {
      ((f)localObject).bw("room_show_msg_count", bool);
      return;
      if (this.hNE != 1) {
        break;
      }
      setTitleMuteIconVisibility(8);
      if (this.hLq == null) {
        break;
      }
      this.hLq.qpJ = false;
      ((SharedPreferences)localObject).edit().putBoolean("room_msg_notify", false).commit();
      break;
      label160:
      bool = false;
    }
  }
  
  private void aAO()
  {
    if ((this.guS != null) && (this.hLl != null))
    {
      Object localObject2 = aAx();
      Object localObject1 = localObject2;
      if (bi.oW((String)localObject2)) {
        localObject1 = q.GH();
      }
      if (!bi.oW((String)localObject1))
      {
        SignaturePreference localSignaturePreference = this.hLl;
        localObject2 = localObject1;
        if (((String)localObject1).length() <= 0) {
          localObject2 = getString(R.l.settings_signature_empty);
        }
        localSignaturePreference.setSummary(com.tencent.mm.pluginsdk.ui.d.j.a(this, (CharSequence)localObject2));
      }
    }
    else
    {
      return;
    }
    this.hLl.setSummary("");
  }
  
  private String aAx()
  {
    au.HU();
    u localu = com.tencent.mm.model.c.Ga().ih(this.fsV);
    if (localu == null) {
      return "";
    }
    return localu.field_selfDisplayName;
  }
  
  public final int Ys()
  {
    return R.o.roominfo_detail_pref;
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml) {}
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool2 = true;
    paramPreference = paramPreference.mKey;
    x.d("MicroMsg.RoomInfoDetailUI", "click key : %s", new Object[] { paramPreference });
    String str;
    if (paramPreference.equals("room_name"))
    {
      paramf = new Intent();
      paramf.setClass(this, e.d.class);
      paramf.putExtra("Contact_mode_name_type", 4);
      str = q.GF();
      paramf.putExtra("Contact_Nick", aAx());
      paramf.putExtra("Contact_User", str);
      paramf.putExtra("MMActivity.OverrideEnterAnimation", R.a.fast_faded_in);
      paramf.putExtra("MMActivity.OverrideExitAnimation", R.a.push_down_out);
      this.mController.tml.startActivityForResult(paramf, 2);
    }
    int i;
    if (paramPreference.equals("room_msg_show_username"))
    {
      au.HU();
      paramf = com.tencent.mm.model.c.Ga().ih(this.fsV);
      if (!paramf.ckP())
      {
        bool1 = true;
        paramf.ll(bool1);
        this.hLA = true;
      }
    }
    else
    {
      if (paramPreference.equals("room_msg_notify"))
      {
        if (this.hNE != 0) {
          break label738;
        }
        i = 1;
        label180:
        this.hNE = i;
        au.HU();
        com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.j(this.fsV, this.hNE));
        au.HU();
        this.guS = com.tencent.mm.model.c.FR().Yg(this.fsV);
        this.guS.eN(this.hNE);
        au.HU();
        com.tencent.mm.model.c.FR().a(this.fsV, this.guS);
        aAE();
        au.HU();
        this.guS = com.tencent.mm.model.c.FR().Yg(this.fsV);
        this.eOE.notifyDataSetChanged();
      }
      if (paramPreference.equals("room_set_chatting_background"))
      {
        paramf = new Intent();
        paramf.putExtra("isApplyToAll", false);
        paramf.putExtra("username", this.guS.field_username);
        d.b(this, "setting", ".ui.setting.SettingsChattingBackgroundUI", paramf, 1);
      }
      if (paramPreference.equals("room_clear_chatting_history"))
      {
        if (!this.bSD) {
          break label743;
        }
        paramf = getString(R.l.fmt_delcontactmsg_confirm_group);
        label376:
        str = getString(R.l.room_clear_chatting_history);
        h.c local2 = new h.c()
        {
          public final void ju(int paramAnonymousInt)
          {
            switch (paramAnonymousInt)
            {
            default: 
              return;
            }
            RoomInfoDetailUI.a(RoomInfoDetailUI.this, false);
            Object localObject = RoomInfoDetailUI.this;
            RoomInfoDetailUI.this.getString(R.l.app_tip);
            p localp = h.a((Context)localObject, RoomInfoDetailUI.this.getString(R.l.app_waiting), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                RoomInfoDetailUI.a(RoomInfoDetailUI.this, true);
              }
            });
            if (com.tencent.mm.model.l.gz(RoomInfoDetailUI.a(RoomInfoDetailUI.this).field_username)) {
              com.tencent.mm.plugin.chatroom.a.ezo.cV(RoomInfoDetailUI.a(RoomInfoDetailUI.this).field_username);
            }
            if (!RoomInfoDetailUI.b(RoomInfoDetailUI.this)) {}
            for (localObject = e.Uk(RoomInfoDetailUI.a(RoomInfoDetailUI.this).field_username);; localObject = null)
            {
              if (!bi.oW((String)localObject))
              {
                localp.dismiss();
                h.a(RoomInfoDetailUI.this, false, RoomInfoDetailUI.this.getString(R.l.wallet_clear_chatting_history_note, new Object[] { localObject }), null, RoomInfoDetailUI.this.getString(R.l.goto_conversation), RoomInfoDetailUI.this.getString(R.l.clear_chat_history), new RoomInfoDetailUI.2.2(this), new RoomInfoDetailUI.2.3(this, localp), -1, R.e.alert_btn_color_warn);
                return;
              }
              RoomInfoDetailUI.a(RoomInfoDetailUI.this, localp);
              return;
            }
          }
        };
        h.a(this, paramf, new String[] { str }, null, local2);
      }
      if (paramPreference.equals("room_placed_to_the_top"))
      {
        paramf = getSharedPreferences(this.hLP, 0);
        if (this.guS != null)
        {
          au.HU();
          if (!com.tencent.mm.model.c.FW().Yx(this.guS.field_username)) {
            break label768;
          }
          com.tencent.mm.model.s.u(this.guS.field_username, true);
          label473:
          paramf = paramf.edit();
          au.HU();
          paramf.putBoolean("room_placed_to_the_top", com.tencent.mm.model.c.FW().Yx(this.guS.field_username)).commit();
        }
      }
      if ("room_show_msg_count".equals(paramPreference))
      {
        boolean bool3 = BE();
        x.d("MicroMsg.RoomInfoDetailUI", "old value undeliver[%B], now set show msg count[%B]", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool3) });
        if (bool3) {
          break label782;
        }
        bool1 = true;
        label565:
        au.HU();
        paramf = com.tencent.mm.model.c.Ga().ih(this.fsV);
        if (!bool1) {
          break label788;
        }
        paramf.ge(0);
        label592:
        x.d("MicroMsg.RoomInfoDetailUI", "update show msg count[%B]", new Object[] { Boolean.valueOf(bool1) });
        au.HU();
        com.tencent.mm.model.c.Ga().c(paramf, new String[0]);
        paramf = q.GF();
        paramPreference = new aub();
        paramPreference.rvj = this.fsV;
        paramPreference.hbL = paramf;
        paramPreference.rXb = 2;
        if (!bool1) {
          break label796;
        }
        i = 2;
        label667:
        paramPreference.mEc = i;
        au.HU();
        com.tencent.mm.model.c.FQ().b(new h.a(49, paramPreference));
        if (this.hNG != null)
        {
          paramf = this.hNG;
          if (bool3) {
            break label801;
          }
        }
      }
    }
    label738:
    label743:
    label768:
    label782:
    label788:
    label796:
    label801:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      paramf.qpJ = bool1;
      this.eOE.notifyDataSetChanged();
      return false;
      bool1 = false;
      break;
      i = 0;
      break label180;
      paramf = getString(R.l.fmt_delcontactmsg_confirm, new Object[] { this.guS.BL() });
      break label376;
      com.tencent.mm.model.s.t(this.guS.field_username, true);
      break label473;
      bool1 = false;
      break label565;
      paramf.ge(2);
      break label592;
      i = 1;
      break label667;
    }
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.roominfo_detail_name);
    this.eOE = this.tCL;
    this.hLP = (getPackageName() + "_preferences");
    this.bSD = getIntent().getBooleanExtra("Is_Chatroom", true);
    this.fsV = getIntent().getStringExtra("RoomInfo_Id");
    if (this.fsV == null) {
      this.fsV = getIntent().getStringExtra("Single_Chat_Talker");
    }
    au.HU();
    this.guS = com.tencent.mm.model.c.FR().Yg(this.fsV);
    if (this.bSD)
    {
      this.hNE = this.guS.csI;
      this.hLl = ((SignaturePreference)this.eOE.ZZ("room_name"));
      this.hLq = ((CheckBoxPreference)this.eOE.ZZ("room_msg_notify"));
      this.hNG = ((CheckBoxPreference)this.eOE.ZZ("room_show_msg_count"));
      this.hNF = ((CheckBoxPreference)this.eOE.ZZ("room_msg_show_username"));
      this.hNG.tDr = false;
    }
    for (;;)
    {
      setBackBtn(new RoomInfoDetailUI.1(this));
      return;
      this.hNE = 1;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1) {}
    String str1;
    do
    {
      do
      {
        do
        {
          return;
          switch (paramInt1)
          {
          default: 
            return;
          }
        } while (paramInt2 != -1);
        setResult(-1);
        finish();
        return;
      } while (paramIntent == null);
      str1 = bi.aG(paramIntent.getStringExtra("Contact_Nick"), "");
    } while (bi.oW(str1));
    String str2 = q.GF();
    au.HU();
    u localu = com.tencent.mm.model.c.Ga().ih(this.fsV);
    paramIntent = localu;
    if (localu == null) {
      paramIntent = new u();
    }
    paramIntent.field_chatroomname = this.fsV;
    paramIntent.field_selfDisplayName = str1;
    au.HU();
    com.tencent.mm.model.c.Ga().c(paramIntent, new String[0]);
    paramIntent = new aua();
    paramIntent.rvj = this.fsV;
    paramIntent.hbL = str2;
    paramIntent.rqY = bi.oV(str1);
    au.HU();
    com.tencent.mm.model.c.FQ().b(new h.a(48, paramIntent));
    aAO();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onPause()
  {
    int i = 1;
    super.onPause();
    Object localObject;
    if (this.hLA)
    {
      au.HU();
      localObject = com.tencent.mm.model.c.Ga().ih(this.fsV);
      au.HU();
      com.tencent.mm.model.c.Ga().c((com.tencent.mm.sdk.e.c)localObject, new String[0]);
      String str = q.GF();
      boolean bool = ((u)localObject).ckP();
      localObject = new aub();
      ((aub)localObject).rvj = this.fsV;
      ((aub)localObject).hbL = str;
      ((aub)localObject).rXb = 1;
      if (!bool) {
        break label124;
      }
    }
    for (;;)
    {
      ((aub)localObject).mEc = i;
      au.HU();
      com.tencent.mm.model.c.FQ().b(new h.a(49, (com.tencent.mm.bk.a)localObject));
      return;
      label124:
      i = 0;
    }
  }
  
  public void onResume()
  {
    super.onResume();
    aAE();
    aAO();
    SharedPreferences localSharedPreferences;
    if ((this.guS != null) && (this.hNF != null))
    {
      au.HU();
      u localu = com.tencent.mm.model.c.Ga().ii(this.fsV);
      localSharedPreferences = getSharedPreferences(this.hLP, 0);
      if (!localu.ckP()) {
        break label99;
      }
      this.hNF.qpJ = true;
      localSharedPreferences.edit().putBoolean("room_msg_show_username", true).commit();
    }
    for (;;)
    {
      this.eOE.notifyDataSetChanged();
      return;
      label99:
      this.hNF.qpJ = false;
      localSharedPreferences.edit().putBoolean("room_msg_show_username", false).commit();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/RoomInfoDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */