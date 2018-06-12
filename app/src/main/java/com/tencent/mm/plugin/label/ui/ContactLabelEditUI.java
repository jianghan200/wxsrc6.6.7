package com.tencent.mm.plugin.label.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.label.b.a;
import com.tencent.mm.plugin.label.ui.widget.InputClearablePreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.protocal.c.aqf;
import com.tencent.mm.protocal.c.bq;
import com.tencent.mm.protocal.c.bxe;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s.b;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ContactLabelEditUI
  extends MMPreference
  implements com.tencent.mm.ab.e
{
  private ProgressDialog eEX;
  private String kAJ;
  private String kAK;
  private String kAL;
  private ad kAM;
  private String kAN;
  private f kAO;
  private ContactListExpandPreference kAP;
  private InputClearablePreference kAQ;
  private Preference kAR;
  private PreferenceTitleCategory kAS;
  private boolean kAT = true;
  private ArrayList<String> kAU = new ArrayList();
  private ArrayList<String> kAV = new ArrayList();
  private HashSet<String> kAW = new HashSet();
  private HashSet<String> kAX = new HashSet();
  private String kAY;
  private boolean kum = true;
  private com.tencent.mm.sdk.platformtools.ag mHandler = new ContactLabelEditUI.1(this, Looper.getMainLooper());
  
  private void FE(String paramString)
  {
    getString(R.l.app_tip);
    this.eEX = com.tencent.mm.ui.base.h.a(this, paramString, true, new ContactLabelEditUI.3(this));
  }
  
  private void FF(String paramString)
  {
    if (bi.oW(paramString)) {}
    for (boolean bool = false;; bool = true)
    {
      enableOptionMenu(bool);
      return;
    }
  }
  
  private static boolean FG(String paramString)
  {
    return !bi.oW(com.tencent.mm.plugin.label.e.aYJ().FA(paramString));
  }
  
  private void a(ad paramad)
  {
    if (!com.tencent.mm.plugin.label.e.aYJ().a(true, paramad, new String[] { "labelID" }))
    {
      x.w("MicroMsg.Label.ContactLabelEditUI", "cpan[doDeleteContactLabel] fail.");
      aYR();
      return;
    }
    setResult(-1);
    finish();
  }
  
  private void aYM()
  {
    if ((this.eEX != null) && (this.eEX.isShowing())) {
      this.eEX.dismiss();
    }
  }
  
  private void aYN()
  {
    if (this.kAP != null)
    {
      this.kAP.p(null, this.kAU);
      if ((this.kAU == null) || (this.kAU.size() <= 0)) {
        this.kAP.cdV();
      }
    }
    if (this.kAQ != null) {
      this.kAQ.setText(this.kAK);
    }
  }
  
  private void aYO()
  {
    x.i("MicroMsg.Label.ContactLabelEditUI", "cpan[savaSuccess]");
    aYM();
    if (this.kAW != null) {}
    for (int i = this.kAW.size();; i = 0)
    {
      x.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doUpdateContactList]addnum:%d", new Object[] { Integer.valueOf(i) });
      com.tencent.mm.plugin.report.service.h.mEJ.h(11220, new Object[] { q.GF(), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i) });
      if (this.kAT)
      {
        Intent localIntent = getIntent();
        localIntent.putExtra("k_sns_label_add_label", this.kAK);
        setResult(0, localIntent);
      }
      for (;;)
      {
        finish();
        return;
        setResult(0);
      }
    }
  }
  
  private void aYP()
  {
    x.i("MicroMsg.Label.ContactLabelEditUI", "cpan[saveFailed]");
    aYM();
    zK(getString(R.l.add_label_fail_msg));
  }
  
  private void aYQ()
  {
    int i;
    if (this.kAW == null)
    {
      i = 0;
      if (this.kAX != null) {
        break label221;
      }
    }
    Object localObject1;
    Iterator localIterator;
    Object localObject2;
    Object localObject3;
    String str;
    label221:
    for (int j = 0;; j = this.kAX.size())
    {
      x.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doUpdateContactList] addcount:%d,delcount:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      localObject1 = new LinkedList();
      if ((this.kAW == null) || (this.kAW.size() <= 0)) {
        break label232;
      }
      this.kAW.size();
      localIterator = this.kAW.iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        au.HU();
        localObject2 = com.tencent.mm.model.c.FR().Yg((String)localObject2);
        localObject3 = ((ai)localObject2).field_contactLabelIds;
        str = com.tencent.mm.plugin.label.c.dx((String)localObject3, this.kAL);
        x.i("MicroMsg.Label.ContactLabelEditUI", "labels:%s mixLabelIds:%s", new Object[] { localObject3, str });
        if (!str.equalsIgnoreCase((String)localObject3))
        {
          localObject3 = new bxe();
          ((bxe)localObject3).hbL = ((ai)localObject2).field_username;
          ((bxe)localObject3).rvl = str;
          ((LinkedList)localObject1).add(localObject3);
        }
      }
      i = this.kAW.size();
      break;
    }
    label232:
    if ((this.kAX != null) && (this.kAX.size() > 0))
    {
      this.kAX.size();
      localIterator = this.kAX.iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        au.HU();
        localObject3 = com.tencent.mm.model.c.FR().Yg((String)localObject2).field_contactLabelIds;
        str = com.tencent.mm.plugin.label.c.dy((String)localObject3, this.kAL);
        x.i("MicroMsg.Label.ContactLabelEditUI", "username:%s labels:%s mixLabelIds:%s", new Object[] { localObject2, localObject3, str });
        if (!str.equalsIgnoreCase((String)localObject3))
        {
          localObject3 = new bxe();
          ((bxe)localObject3).hbL = ((String)localObject2);
          ((bxe)localObject3).rvl = str;
          ((LinkedList)localObject1).add(localObject3);
        }
      }
    }
    if (((LinkedList)localObject1).size() > 0)
    {
      localObject1 = new com.tencent.mm.plugin.label.b.d((LinkedList)localObject1);
      au.DF().a((l)localObject1, 0);
      return;
    }
    aYO();
  }
  
  private void aYR()
  {
    zK(getString(R.l.del_label_failed_msg));
  }
  
  private void zK(String paramString)
  {
    com.tencent.mm.ui.base.h.a(this, paramString, "", new ContactLabelEditUI.4(this));
  }
  
  public final int Ys()
  {
    return R.o.label_edit_pref;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paraml.getType())
    {
    }
    do
    {
      do
      {
        return;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = ((a)paraml).aYL().rbV;
          if ((paramString != null) && (paramString.size() > 0))
          {
            paramString = (aqf)paramString.get(0);
            x.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd] add label pair.LabelID:%s pair.LabelName:%s", new Object[] { paramString.rSH, paramString.rSG });
            this.kAL = paramString.rSH;
            aYQ();
            return;
          }
          aYP();
          return;
        }
        aYP();
        return;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = this.kAL;
          String str = this.kAK;
          x.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doInsertOrUpdateLable]");
          try
          {
            paramInt1 = Integer.valueOf(paramString).intValue();
            if (paramInt1 != -1)
            {
              paraml = com.tencent.mm.plugin.label.e.aYJ().XY(paramString);
              paramString = paraml;
              if (paraml == null) {
                paramString = new ad();
              }
              paramString.field_labelID = paramInt1;
              paramString.field_labelName = str;
              paramString.field_labelPYFull = com.tencent.mm.platformtools.h.oI(str);
              paramString.field_labelPYShort = com.tencent.mm.platformtools.h.oJ(str);
              com.tencent.mm.plugin.label.e.aYJ().b(true, paramString, new String[] { "labelID" });
              aYQ();
              return;
            }
          }
          catch (Exception paraml)
          {
            for (;;)
            {
              x.e("MicroMsg.Label.ContactLabelEditUI", "id is not integer type:%s", new Object[] { paramString });
              paramInt1 = -1;
              continue;
              aYP();
            }
          }
        }
        aYP();
        return;
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          break;
        }
        aYO();
      } while (this.mHandler == null);
      this.mHandler.sendEmptyMessageDelayed(6002, 300L);
      return;
      aYP();
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break;
      }
      a(this.kAM);
    } while (this.mHandler == null);
    this.mHandler.sendEmptyMessageDelayed(6002, 300L);
    return;
    x.w("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd] delete fail.");
    aYR();
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if (bi.oW(paramf))
    {
      x.w("MicroMsg.Label.ContactLabelEditUI", "cpan [onPreferenceTreeClick] key is null.");
      return false;
    }
    if (paramf.equals("contact_label_delete")) {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.label_delete_confirm), "", getString(R.l.app_delete), getString(R.l.app_cancel), new ContactLabelEditUI.14(this), new ContactLabelEditUI.2(this));
    }
    x.d("MicroMsg.Label.ContactLabelEditUI", "cpan [onPreferenceTreeClick] key is %s:", new Object[] { paramf });
    return false;
  }
  
  protected final String aYS()
  {
    if (this.kAT) {
      return "_New";
    }
    return "_Edit";
  }
  
  protected final void initView()
  {
    if (bi.oW(this.kAL))
    {
      this.kAT = true;
      this.kAN = getString(R.l.pref_label_new_title);
      setMMTitle(this.kAN);
      setBackBtn(new ContactLabelEditUI.7(this));
      a(0, getString(R.l.app_save), new ContactLabelEditUI.8(this), s.b.tmX);
      this.kAO = this.tCL;
      this.kAP = ((ContactListExpandPreference)this.kAO.ZZ("contact_label_contact_list"));
      this.kAP.a(this.kAO, this.kAP.mKey);
      this.kAP.kG(true);
      this.kAP.kH(true);
      this.kAP.cdU();
      this.kAP.cdX();
      this.kAP.a(new ContactLabelEditUI.9(this));
      this.kAP.a(new ContactLabelEditUI.10(this));
      this.kAQ = ((InputClearablePreference)this.kAO.ZZ("contact_label_name"));
      InputClearablePreference localInputClearablePreference = this.kAQ;
      localInputClearablePreference.kCg = getString(R.l.label_input_tip);
      if (localInputClearablePreference.kCl != null) {
        localInputClearablePreference.kCl.setHint(localInputClearablePreference.kCg);
      }
      this.kAQ.fHW = getString(R.l.label_panel_max_tips);
      localInputClearablePreference = this.kAQ;
      localInputClearablePreference.kCh = getString(R.l.add_label_invaild_msg);
      if (localInputClearablePreference.kCn != null) {
        localInputClearablePreference.kCn.setText(localInputClearablePreference.kCh);
      }
      this.kAQ.kCi = 36;
      this.kAQ.kCk = this.kAT;
      this.kAQ.kCp = new ContactLabelEditUI.11(this);
      this.kAQ.setText(this.kAK);
      if (this.mHandler != null) {
        this.mHandler.sendEmptyMessage(6001);
      }
      if (!this.kAT) {
        break label520;
      }
      if ((this.kAU == null) || (this.kAU.size() <= 0)) {
        break label503;
      }
      this.kAP.p(null, this.kAU);
    }
    for (;;)
    {
      if (this.kww != null) {
        this.kww.setOnScrollListener(new ContactLabelEditUI.13(this));
      }
      this.kAR = this.kAO.ZZ("contact_label_delete");
      this.kAS = ((PreferenceTitleCategory)this.kAO.ZZ("contact_label_empty_category"));
      if (this.kAT)
      {
        this.kAO.c(this.kAR);
        this.kAO.c(this.kAS);
      }
      return;
      this.kAT = false;
      this.kAM = com.tencent.mm.plugin.label.e.aYJ().XY(this.kAL);
      this.kAN = getString(R.l.pref_label_edit_title);
      break;
      label503:
      this.kAP.aa(new ArrayList());
      continue;
      label520:
      au.Em().H(new ContactLabelEditUI.12(this));
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onActivityResult] requestCode:%d resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1) {}
    label262:
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
        paramIntent = paramIntent.getStringExtra("Select_Contact");
        x.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onActivityResult] %s", new Object[] { paramIntent });
      } while (bi.oW(paramIntent));
      paramIntent = bi.F(paramIntent.split(","));
      if ((paramIntent != null) && (paramIntent.size() > 0))
      {
        paramInt2 = paramIntent.size();
        paramInt1 = 0;
        if (paramInt1 < paramInt2)
        {
          String str = (String)paramIntent.get(paramInt1);
          if (!bi.oW(str))
          {
            if ((!s.he(str)) || (this.kAU.contains(str)) || (str.equals(this.kAY))) {
              break label262;
            }
            this.kAU.add(str);
            if ((this.kAV != null) && (!this.kAV.contains(paramIntent.get(paramInt1)))) {
              this.kAW.add(str);
            }
            if ((this.kAX != null) && (this.kAX.contains(str))) {
              this.kAX.remove(str);
            }
          }
          for (;;)
          {
            paramInt1 += 1;
            break;
            x.i("MicroMsg.Label.ContactLabelEditUI", "dz[getIntent] %s is no friend or is user self and just filter", new Object[] { str });
          }
        }
      }
    } while (this.mHandler == null);
    this.mHandler.sendEmptyMessage(6001);
  }
  
  public void onBackPressed()
  {
    if (((!bi.oW(this.kAK)) && (!this.kAK.equals(this.kAJ))) || ((this.kAW != null) && (this.kAW.size() > 0)) || ((this.kAX != null) && (this.kAX.size() > 0)))
    {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.save_label_msg), "", getString(R.l.btn_save), getString(R.l.btn_unsave), new ContactLabelEditUI.5(this), new ContactLabelEditUI.6(this));
      return;
    }
    setResult(0);
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kAY = q.GF();
    this.kAL = getIntent().getStringExtra("label_id");
    this.kAJ = getIntent().getStringExtra("label_name");
    this.kAK = getIntent().getStringExtra("label_name");
    paramBundle = getIntent().getStringExtra("Select_Contact");
    if (!bi.oW(paramBundle))
    {
      paramBundle = bi.F(paramBundle.split(","));
      this.kAU = new ArrayList();
      if ((paramBundle != null) && (paramBundle.size() > 0))
      {
        int j = paramBundle.size();
        int i = 0;
        if (i < j)
        {
          String str = (String)paramBundle.get(i);
          if (!bi.oW(str))
          {
            if ((!s.he(str)) || (this.kAU.contains(str)) || (str.equals(this.kAY))) {
              break label200;
            }
            this.kAU.add(str);
            this.kAW.add(str);
          }
          for (;;)
          {
            i += 1;
            break;
            label200:
            x.i("MicroMsg.Label.ContactLabelEditUI", "dz[getIntent] %s is no friend or is user self and just filter", new Object[] { str });
          }
        }
      }
    }
    au.DF().a(635, this);
    au.DF().a(637, this);
    au.DF().a(638, this);
    initView();
  }
  
  protected void onDestroy()
  {
    au.DF().b(635, this);
    au.DF().b(637, this);
    au.DF().b(638, this);
    super.onDestroy();
  }
  
  protected void onPause()
  {
    com.tencent.mm.modelstat.d.b(4, "ContactLabelEditUI" + aYS(), hashCode());
    au.DF().b(636, this);
    super.onPause();
  }
  
  protected void onResume()
  {
    com.tencent.mm.modelstat.d.b(3, "ContactLabelEditUI" + aYS(), hashCode());
    au.DF().a(636, this);
    FF(this.kAK);
    aYN();
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/label/ui/ContactLabelEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */