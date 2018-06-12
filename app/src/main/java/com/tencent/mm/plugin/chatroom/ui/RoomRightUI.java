package com.tencent.mm.plugin.chatroom.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.l.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.ui.applet.s.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class RoomRightUI
  extends MMPreference
  implements e
{
  private ProgressDialog eHw = null;
  private f eOE;
  private String hNJ = "";
  private int hNK = 0;
  
  private void J(final LinkedList<String> paramLinkedList)
  {
    if (paramLinkedList.size() > 0) {}
    String str;
    int i;
    LinkedList localLinkedList;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      str = ad.getContext().getString(R.l.chatroom_sys_msg_invite_split);
      paramLinkedList.size();
      i = R.l.room_right_need_vertify;
      localLinkedList = new LinkedList();
      if (!au.HX()) {
        break;
      }
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext()) {
        localLinkedList.add(r.gT((String)localIterator.next()));
      }
    }
    h.a(this, getString(i, new Object[] { bi.c(localLinkedList, str) }), getString(R.l.app_tip), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        RoomRightUI.a(RoomRightUI.this, paramLinkedList);
      }
    });
  }
  
  private void aAP()
  {
    au.HU();
    int i = bi.a((Integer)c.DT().get(135175, null), 0);
    Object localObject1 = this.eOE.ZZ("settings_room_size");
    if ((localObject1 != null) && (i > 0))
    {
      ((Preference)localObject1).setSummary(getResources().getQuantityString(R.j.room_size_count, i, new Object[] { Integer.valueOf(i) }));
      ((Preference)localObject1).setEnabled(false);
    }
    Object localObject2;
    label268:
    label354:
    do
    {
      break label268;
      this.eOE.ZZ("room_right_max_tip").setTitle(getString(R.l.room_right_max_tip, new Object[] { Integer.valueOf(i) }));
      au.HU();
      int j = bi.a((Integer)c.DT().get(135176, null), 0);
      localObject1 = (RoomGrantPreference)this.eOE.ZZ("settings_room_grant");
      if ((localObject1 != null) && (j <= 0)) {
        this.eOE.c((Preference)localObject1);
      }
      Preference localPreference;
      for (;;)
      {
        localPreference = this.eOE.ZZ("room_right_tip");
        localObject2 = this.eOE.ZZ("room_right_grant_tip");
        if (j > 0) {
          break label354;
        }
        if (localPreference != null) {
          this.eOE.c(localPreference);
        }
        if (localObject2 != null) {
          this.eOE.c((Preference)localObject2);
        }
        localObject2 = this.eOE.ZZ("room_grant_to_friend");
        if (localObject2 != null) {
          this.eOE.c((Preference)localObject2);
        }
        if (localObject1 != null) {
          this.eOE.c((Preference)localObject1);
        }
        return;
        if (localObject1 == null) {
          break;
        }
        this.eOE.c((Preference)localObject1);
        break;
        if (localObject1 != null)
        {
          ((RoomGrantPreference)localObject1).setEnabled(false);
          localObject2 = getString(R.l.room_right_room_size_num, new Object[] { Integer.valueOf(j) });
          ((RoomGrantPreference)localObject1).eGB = ((String)localObject2);
          if (((RoomGrantPreference)localObject1).hND != null) {
            ((RoomGrantPreference)localObject1).hND.setText((CharSequence)localObject2);
          }
        }
      }
      localObject1 = getString(R.l.room_right_tip, new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      if (localPreference != null) {
        localPreference.setTitle((CharSequence)localObject1);
      }
      localObject1 = getString(R.l.room_right_grant_tip, new Object[] { Integer.valueOf(this.hNK) });
    } while (localObject2 == null);
    ((Preference)localObject2).setTitle((CharSequence)localObject1);
  }
  
  public final int Ys()
  {
    return R.o.room_right_ui;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RoomRightUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eHw != null) {
      this.eHw.dismiss();
    }
    if (paraml.getType() != 339) {
      return;
    }
    au.HU();
    paramString = c.FR().Yg(this.hNJ);
    if ((paramString == null) || ((int)paramString.dhP == 0)) {}
    for (paramString = this.hNJ;; paramString = paramString.BL())
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label168;
      }
      h.b(this, getString(R.l.room_grant_to_friend_ok, new Object[] { paramString }), getString(R.l.app_tip), true);
      if (this.eOE == null) {
        break;
      }
      aAP();
      this.eOE.notifyDataSetChanged();
      return;
    }
    label168:
    if (paramInt2 == 65285)
    {
      h.b(this, getString(R.l.room_grant_to_friend_error, new Object[] { paramString, Integer.valueOf(this.hNK) }), getString(R.l.app_tip), true);
      return;
    }
    if (paramInt2 == -44)
    {
      paramString = new LinkedList();
      paramString.add(this.hNJ);
      J(paramString);
      return;
    }
    if (paramInt2 == -22)
    {
      h.b(this, getString(R.l.room_grant_to_friend_error_black, new Object[] { paramString }), getString(R.l.app_tip), true);
      return;
    }
    Toast.makeText(this, "err :" + paramInt1 + " ," + paramInt2, 0).show();
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (paramPreference.mKey.equals("room_grant_to_friend"))
    {
      paramf = new Intent();
      paramf.setClassName(ad.getPackageName(), ad.getPackageName() + ".ui.contact.SelectContactUI");
      paramf.putExtra("Contact_GroupFilter_Type", "@all.contact.without.chatroom");
      paramf.putExtra("List_Type", 4);
      paramf.putExtra("select_contact_pick_result", true);
      paramPreference = new LinkedList();
      paramPreference.add("officialaccounts");
      paramf.putExtra("Block_list", bi.c(paramPreference, ","));
      paramf.putExtra("Add_SendCard", true);
      paramf.putExtra("is_multi_select", false);
      startActivityForResult(paramf, 1);
    }
    return false;
  }
  
  protected final void initView()
  {
    this.eOE = this.tCL;
    setMMTitle(R.l.settings_room_size);
    setBackBtn(new RoomRightUI.1(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RoomRightUI", "onAcvityResult requestCode: %d", new Object[] { Integer.valueOf(paramInt1) });
    if ((paramInt2 != -1) || (paramIntent == null)) {}
    do
    {
      return;
      switch (paramInt1)
      {
      default: 
        return;
      }
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RoomRightUI", "pick user %s", new Object[] { paramIntent });
    } while (bi.oW(paramIntent));
    this.hNJ = paramIntent;
    paramIntent = this.hNJ;
    au.HU();
    Object localObject = c.FR().Yg(paramIntent);
    localObject = getString(R.l.room_grant_to_conf, new Object[] { ((a)localObject).BL(), Integer.valueOf(this.hNK) });
    h.a(this.mController.tml, (String)localObject, "", new RoomRightUI.2(this, paramIntent), null);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    au.HU();
    this.hNK = bi.a((Integer)c.DT().get(135177, null), 0);
    au.DF().a(339, this);
    au.DF().a(30, this);
    au.HU();
    c.DT().set(135184, Boolean.valueOf(false));
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    au.DF().b(339, this);
    au.DF().b(30, this);
  }
  
  public void onResume()
  {
    super.onResume();
    aAP();
    this.eOE.notifyDataSetChanged();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/RoomRightUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */