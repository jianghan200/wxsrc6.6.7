package com.tencent.mm.plugin.scanner.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.br;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.scanner.a.o.a;
import com.tencent.mm.plugin.scanner.a.o.b;
import com.tencent.mm.plugin.scanner.a.o.c;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VcardContactUI
  extends MMPreference
{
  private static ArrayList<String> mMo = new ArrayList();
  private static int mMq = 1;
  private static int mMr = 1;
  private f eOE;
  private com.tencent.mm.plugin.scanner.a.o mMn;
  private r mMp;
  
  private static void a(List<String> paramList, Intent paramIntent, int paramInt1, int paramInt2)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (paramInt2 == 1)
      {
        paramIntent.putExtra("phone", str);
        paramIntent.putExtra("phone_type", paramInt1);
      }
      else if (paramInt2 == 2)
      {
        paramIntent.putExtra("secondary_phone", str);
        paramIntent.putExtra("phone_type", paramInt1);
      }
      else if (paramInt2 == 3)
      {
        paramIntent.putExtra("tertiary_phone", str);
        paramIntent.putExtra("phone_type", paramInt1);
      }
    }
  }
  
  private void b(List<String> paramList, String paramString1, String paramString2)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        VcardContactLinkPreference localVcardContactLinkPreference = new VcardContactLinkPreference(this);
        localVcardContactLinkPreference.setKey(paramString1 + String.valueOf(str));
        if (!mMo.contains(paramString1 + String.valueOf(str))) {
          mMo.add(paramString1 + String.valueOf(str));
        }
        localVcardContactLinkPreference.setTitle(paramString2);
        localVcardContactLinkPreference.setLayoutResource(R.i.mm_preference);
        localVcardContactLinkPreference.setSummary(str);
        localVcardContactLinkPreference.lO(false);
        localVcardContactLinkPreference.tCA = true;
        localVcardContactLinkPreference.csl();
        this.eOE.a(localVcardContactLinkPreference, mMq);
      }
    }
  }
  
  private void es(String paramString1, String paramString2)
  {
    KeyValuePreference localKeyValuePreference = new KeyValuePreference(this);
    localKeyValuePreference.setTitle(paramString2);
    localKeyValuePreference.setLayoutResource(R.i.mm_preference);
    localKeyValuePreference.lO(false);
    localKeyValuePreference.setSummary(paramString1);
    localKeyValuePreference.tCA = false;
    localKeyValuePreference.csl();
    this.eOE.a(localKeyValuePreference, mMr);
  }
  
  public final int Ys()
  {
    return -1;
  }
  
  public final boolean a(f paramf, final Preference paramPreference)
  {
    Object localObject;
    if (paramPreference.mKey.equals("add_vcard_contact"))
    {
      paramf = getString(R.l.v_contact_add_new_contact);
      paramPreference = getString(R.l.v_contact_add_exist_contact);
      localObject = new h.c()
      {
        public final void ju(int paramAnonymousInt)
        {
          switch (paramAnonymousInt)
          {
          default: 
            return;
          case 0: 
            br.IE().c(10238, new Object[] { Integer.valueOf(1) });
            localIntent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
            VcardContactUI.a(VcardContactUI.this, localIntent);
            VcardContactUI.this.startActivity(localIntent);
            return;
          }
          br.IE().c(10239, new Object[] { Integer.valueOf(1) });
          Intent localIntent = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
          localIntent.setType("vnd.android.cursor.item/person");
          VcardContactUI.a(VcardContactUI.this, localIntent);
          VcardContactUI.this.startActivity(localIntent);
        }
      };
      com.tencent.mm.ui.base.h.a(this, "", new String[] { paramf, paramPreference }, "", (h.c)localObject);
      return true;
    }
    if ((paramPreference.mKey.equals("v_contact_info_photo_uri")) || (paramPreference.mKey.equals("v_contact_info_home_page")) || (paramPreference.mKey.equals("v_contact_info_logo")))
    {
      paramf = paramPreference.getSummary().toString();
      if ((paramf != null) && (paramf.length() > 0))
      {
        paramPreference = this.mMp;
        if (!paramPreference.lYo.ciq()) {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.scanner.ViewMMURL", "already running, skipped");
        }
        for (;;)
        {
          return true;
          if ((paramf == null) || (paramf.length() == 0))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.scanner.ViewMMURL", "go fail, qqNum is null");
          }
          else
          {
            paramPreference.url = paramf;
            au.HU();
            localObject = (String)c.DT().get(46, null);
            if ((localObject == null) || (((String)localObject).length() == 0))
            {
              paramPreference.b(paramf, (int)System.currentTimeMillis(), new byte[0]);
            }
            else
            {
              au.DF().a(233, paramPreference);
              paramPreference.mMA = new com.tencent.mm.modelsimple.h(paramf, null, 4, (int)System.currentTimeMillis(), new byte[0]);
              au.DF().a(paramPreference.mMA, 0);
              paramPreference.lYo.J(3000L, 3000L);
            }
          }
        }
      }
    }
    else if ((mMo.contains(paramPreference.mKey)) && (!paramPreference.mKey.toLowerCase().contains("fax")))
    {
      paramPreference = paramPreference.getSummary().toString().trim();
      if ((paramPreference != null) && (paramPreference.length() > 0))
      {
        paramf = getString(R.l.chatting_phone_use);
        paramPreference = new h.c()
        {
          public final void ju(int paramAnonymousInt)
          {
            switch (paramAnonymousInt)
            {
            default: 
              return;
            }
            Intent localIntent = new Intent("android.intent.action.DIAL");
            localIntent.setFlags(268435456);
            localIntent.setData(Uri.parse("tel:" + paramPreference));
            VcardContactUI.this.startActivity(localIntent);
          }
        };
        com.tencent.mm.ui.base.h.a(this, "", new String[] { paramf }, "", paramPreference);
        return true;
      }
    }
    else if (paramPreference.mKey.equals("v_contact_info_email"))
    {
      localObject = paramPreference.getSummary().toString();
      paramf = this.mController.tml.getString(R.l.send_mail_by_qqmail);
      paramPreference = this.mController.tml.getString(R.l.send_mail_by_default_account);
      localObject = new VcardContactUI.2(this, (String)localObject);
      com.tencent.mm.ui.base.h.a(this, "", new String[] { paramf, paramPreference }, "", (h.c)localObject);
    }
    return false;
  }
  
  protected final void initView()
  {
    this.mMp = new r(this);
    this.eOE = this.tCL;
    this.mMn = com.tencent.mm.plugin.scanner.a.o.mGG;
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        VcardContactUI.this.finish();
        return true;
      }
    });
    setMMTitle("");
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(R.o.vcard_contact_info_pref);
    Object localObject = (VcardContactUserHeaderPreference)this.eOE.ZZ("v_contact_info_header");
    if (localObject != null)
    {
      com.tencent.mm.plugin.scanner.a.o localo = this.mMn;
      if (localo != null)
      {
        if (!bi.oW(localo.mGp.acD())) {
          ((VcardContactUserHeaderPreference)localObject).mMz = localo.mGp.acD();
        }
        if (!bi.oW(localo.bgn)) {
          ((VcardContactUserHeaderPreference)localObject).bgn = localo.bgn;
        }
        if (!bi.oW(localo.mGD)) {
          ((VcardContactUserHeaderPreference)localObject).mGD = localo.mGD;
        }
        if (!bi.oW(localo.title)) {
          ((VcardContactUserHeaderPreference)localObject).title = localo.title;
        }
      }
    }
    this.eOE.aaa("c_contact_info_wx_id");
    if (!bi.oW(this.mMn.fkq))
    {
      localObject = (VcardContactLinkPreference)this.eOE.ZZ("v_contact_info_photo_uri");
      if (localObject != null)
      {
        ((VcardContactLinkPreference)localObject).setSummary(this.mMn.fkq);
        ((VcardContactLinkPreference)localObject).lO(false);
        ((KeyValuePreference)localObject).tCA = false;
        mMq += 2;
        mMr += 2;
      }
      localObject = this.mMn.mGw;
      if ((localObject != null) && (((o.a)localObject).acD().length() > 0)) {
        es(((o.a)localObject).acD(), this.mController.tml.getString(R.l.v_contact_home_address));
      }
      localObject = this.mMn.mGx;
      if ((localObject != null) && (((o.a)localObject).acD().length() > 0)) {
        es(((o.a)localObject).acD(), this.mController.tml.getString(R.l.v_contact_work_address));
      }
      localObject = this.mMn.mGu;
      if ((localObject != null) && (((o.a)localObject).acD().length() > 0)) {
        es(((o.a)localObject).acD(), this.mController.tml.getString(R.l.v_contact_address));
      }
      localObject = this.mMn.mGv;
      if ((localObject != null) && (((o.a)localObject).acD().length() > 0)) {
        es(((o.a)localObject).acD(), this.mController.tml.getString(R.l.v_contact_address));
      }
      localObject = this.mMn.mGA;
      if ((localObject != null) && (((List)localObject).size() > 0)) {
        b((List)localObject, "WorkTel", this.mController.tml.getString(R.l.v_contact_work_tel));
      }
      localObject = this.mMn.mGz;
      if ((localObject != null) && (((List)localObject).size() > 0)) {
        b((List)localObject, "HomeTel", this.mController.tml.getString(R.l.v_contact_home_tel));
      }
      localObject = this.mMn.mGB;
      if ((localObject != null) && (((List)localObject).size() > 0)) {
        b((List)localObject, "VideoTEL", this.mController.tml.getString(R.l.v_contact_video_tel));
      }
      localObject = this.mMn.mGC;
      if ((localObject != null) && (((List)localObject).size() > 0)) {
        b((List)localObject, "NormalTel", this.mController.tml.getString(R.l.v_contact_normal_tel));
      }
      localObject = this.mMn.mGy;
      if ((localObject != null) && (((List)localObject).size() > 0)) {
        b((List)localObject, "CellTel", this.mController.tml.getString(R.l.v_contact_cell_tel));
      }
      if (bi.oW(this.mMn.fkz)) {
        break label1062;
      }
      localObject = (KeyValuePreference)this.eOE.ZZ("v_contact_info_org");
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).setSummary(this.mMn.fkz);
        ((KeyValuePreference)localObject).lO(false);
        ((KeyValuePreference)localObject).tCA = true;
      }
      label693:
      if (bi.oW(this.mMn.mGE)) {
        break label1078;
      }
      localObject = (KeyValuePreference)this.eOE.ZZ("v_contact_info_agent");
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).setSummary(this.mMn.mGE);
        ((KeyValuePreference)localObject).lO(false);
        ((KeyValuePreference)localObject).tCA = true;
      }
      label747:
      if (bi.oW(this.mMn.url)) {
        break label1094;
      }
      localObject = (VcardContactLinkPreference)this.eOE.ZZ("v_contact_info_home_page");
      if (localObject != null)
      {
        ((VcardContactLinkPreference)localObject).setSummary(this.mMn.url);
        ((VcardContactLinkPreference)localObject).lO(false);
        ((KeyValuePreference)localObject).tCA = true;
      }
      label801:
      if (bi.oW(this.mMn.csD)) {
        break label1123;
      }
      localObject = (VcardContactLinkPreference)this.eOE.ZZ("v_contact_info_email");
      if (localObject != null)
      {
        ((VcardContactLinkPreference)localObject).setSummary(this.mMn.csD);
        ((VcardContactLinkPreference)localObject).lO(false);
        ((KeyValuePreference)localObject).tCA = true;
      }
      label855:
      if (bi.oW(this.mMn.mGt)) {
        break label1139;
      }
      localObject = (KeyValuePreference)this.eOE.ZZ("v_contact_info_birthday");
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).setSummary(this.mMn.mGt);
        ((KeyValuePreference)localObject).lO(false);
        ((KeyValuePreference)localObject).tCA = true;
      }
      label909:
      if (bi.oW(this.mMn.mGF)) {
        break label1168;
      }
      localObject = (KeyValuePreference)this.eOE.ZZ("v_contact_info_remark");
      if (localObject != null)
      {
        ((KeyValuePreference)localObject).setSummary(this.mMn.mGF);
        ((KeyValuePreference)localObject).lO(false);
        ((KeyValuePreference)localObject).tCA = true;
      }
    }
    for (;;)
    {
      if ((this.mMn.mGr == null) || (!this.mMn.mGr.mGJ.contains("uri"))) {
        break label1197;
      }
      localObject = (VcardContactLinkPreference)this.eOE.ZZ("v_contact_info_logo");
      ((VcardContactLinkPreference)localObject).setSummary(this.mMn.mGr.mGK);
      ((KeyValuePreference)localObject).tCA = false;
      ((VcardContactLinkPreference)localObject).lO(false);
      return;
      this.eOE.aaa("v_contact_info_photo_uri");
      this.eOE.aaa("v_category_photo_uri");
      break;
      label1062:
      this.eOE.aaa("v_contact_info_org");
      break label693;
      label1078:
      this.eOE.aaa("v_contact_info_agent");
      break label747;
      label1094:
      this.eOE.aaa("v_contact_info_home_page");
      this.eOE.aaa("v_category_home_page");
      break label801;
      label1123:
      this.eOE.aaa("v_contact_info_email");
      break label855;
      label1139:
      this.eOE.aaa("v_contact_info_birthday");
      this.eOE.aaa("v_category_birthday");
      break label909;
      label1168:
      this.eOE.aaa("v_contact_info_remark");
      this.eOE.aaa("v_category_remark");
    }
    label1197:
    this.eOE.aaa("v_contact_info_logo");
    this.eOE.aaa("v_category_logo");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/VcardContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */