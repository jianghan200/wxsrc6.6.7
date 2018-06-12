package com.tencent.mm.plugin.chatroom.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.m;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.aty;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class ManageChatroomUI
  extends MMPreference
{
  private SharedPreferences duR = null;
  private f eOE;
  CheckBoxPreference hMP;
  private String hMQ;
  private String hMR;
  
  public final int Ys()
  {
    return R.o.manage_room_pref;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    int i = 2;
    paramf = paramPreference.mKey;
    x.d("MicroMsg.ManageChatroomUI", "[onPreferenceTreeClick] key:%s", new Object[] { paramf });
    if (paramf.equals("room_transfer_room_ower"))
    {
      x.i("MicroMsg.ManageChatroomUI", "[selectNewRoomOwner] roomId:%s", new Object[] { this.hMQ });
      paramf = bi.c(m.gI(this.hMQ), ",");
      paramPreference = new Intent();
      paramPreference.putExtra("Block_list", q.GF());
      paramPreference.putExtra("Chatroom_member_list", paramf);
      paramPreference.putExtra("frome_scene", 2);
      paramPreference.putExtra("RoomInfo_Id", this.hMQ);
      paramPreference.putExtra("is_show_owner", false);
      paramPreference.putExtra("title", getString(R.l.room_select_new_owner));
      paramPreference.setClass(this, SelectMemberUI.class);
      startActivity(paramPreference);
    }
    while (!paramf.equals("allow_by_identity")) {
      return false;
    }
    boolean bool = this.hMP.isChecked();
    h.mEJ.a(219L, 22L, 1L, true);
    x.i("MicroMsg.ManageChatroomUI", "[selectAllowByIdentity] roomId:%s isOpen:%s", new Object[] { this.hMQ, Boolean.valueOf(bool) });
    paramf = new aty();
    paramf.rvj = bi.oV(this.hMQ);
    if (bool == true) {}
    for (;;)
    {
      paramf.mEc = i;
      paramf = new h.a(66, paramf);
      au.HU();
      c.FQ().b(paramf);
      return false;
      i = 0;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    do
    {
      return;
    } while (paramIntent == null);
    paramInt1 = paramIntent.getIntExtra("into_room_type", -1);
    x.i("MicroMsg.ManageChatroomUI", "[openVerify] roomId:%s, type:%s", new Object[] { this.hMQ, Integer.valueOf(paramInt1) });
    paramIntent = new aty();
    paramIntent.rvj = bi.oV(this.hMQ);
    paramIntent.mEc = paramInt1;
    paramIntent = new h.a(66, paramIntent);
    au.HU();
    c.FQ().b(paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.ManageChatroomUI", "[onCreate]");
    this.hMQ = getIntent().getStringExtra("RoomInfo_Id");
    this.hMR = getIntent().getStringExtra("room_owner_name");
    this.eOE = this.tCL;
    if (this.eOE == null) {
      return;
    }
    setMMTitle(R.l.manage_chatroom_title);
    this.hMP = ((CheckBoxPreference)this.eOE.ZZ("allow_by_identity"));
    this.eOE.bw("select_enable_qrcode", true);
    this.eOE.bw("select_into_room_type", true);
    setBackBtn(new ManageChatroomUI.1(this));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onResume()
  {
    boolean bool = false;
    au.HU();
    u localu = c.Ga().ih(this.hMQ);
    if ((localu != null) && (this.duR == null))
    {
      this.duR = getSharedPreferences(getPackageName() + "_preferences", 0);
      SharedPreferences.Editor localEditor = this.duR.edit();
      if (localu.ckN() == 2) {
        bool = true;
      }
      localEditor.putBoolean("allow_by_identity", bool).commit();
    }
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/ManageChatroomUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */