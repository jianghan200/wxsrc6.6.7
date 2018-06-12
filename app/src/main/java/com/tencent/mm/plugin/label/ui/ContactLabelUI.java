package com.tencent.mm.plugin.label.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.label.b.d;
import com.tencent.mm.plugin.label.ui.widget.MMLabelPanel;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.protocal.c.bxe;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ag;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bq;
import com.tencent.mm.ui.base.MMTagPanel.a;
import com.tencent.mm.ui.base.MMTagPanelScrollView;
import com.tencent.mm.ui.s.b;
import com.tencent.mm.ui.tools.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ContactLabelUI
  extends ContactLabelBaseUI
  implements com.tencent.mm.ab.e
{
  private String cYO;
  private MMTagPanelScrollView kBF;
  private MMLabelPanel kBG;
  private TextView kBH;
  private View kBI;
  private View kBJ;
  private TextView kBK;
  private MMLabelPanel kBL;
  private ListView kBM;
  private ScrollView kBN;
  private b kBO;
  private String kBP;
  private ArrayList<String> kBQ;
  private HashSet<String> kBR = new HashSet();
  private HashSet<String> kBS = new HashSet();
  private ArrayList<String> kBT = new ArrayList();
  private int kBU = a.kBZ;
  private boolean kBV = false;
  private ArrayList<String> kBW;
  private boolean kBg = true;
  
  private void aD(String paramString, boolean paramBoolean)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.Label.ContactLabelUI", "tag is empty");
      return;
    }
    paramString = paramString.trim();
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.Label.ContactLabelUI", "new tag is empty");
      return;
    }
    ad localad = com.tencent.mm.plugin.label.e.aYJ().XX(paramString);
    if (paramBoolean) {
      if ((this.kBT == null) || (!this.kBT.contains(paramString)) || (localad == null)) {
        this.kBS.add(paramString);
      }
    }
    for (;;)
    {
      if ((this.kBR != null) && (this.kBR.contains(paramString))) {
        this.kBR.remove(paramString);
      }
      if (!aYW()) {
        break;
      }
      enableOptionMenu(true);
      return;
      if ((this.kBT == null) || (!this.kBT.contains(paramString)) || ((localad != null) && (localad.field_isTemporary))) {
        this.kBS.add(paramString);
      }
    }
  }
  
  private void aYP()
  {
    aYM();
    zK(getString(R.l.add_label_fail_msg));
  }
  
  private void aYU()
  {
    x.i("MicroMsg.Label.ContactLabelUI", "cpan[saveContact]");
    if (this.kBG != null)
    {
      x.i("MicroMsg.Label.ContactLabelUI", "cpan[saveContact] doScene");
      Object localObject2 = "";
      Object localObject3 = this.kBG.getTagList();
      Object localObject1 = localObject2;
      if (localObject3 != null)
      {
        localObject1 = localObject2;
        if (((ArrayList)localObject3).size() > 0) {
          localObject1 = com.tencent.mm.plugin.label.c.bq(com.tencent.mm.plugin.label.e.aYJ().ab((ArrayList)localObject3));
        }
      }
      localObject2 = new LinkedList();
      localObject3 = new bxe();
      ((bxe)localObject3).rvl = ((String)localObject1);
      ((bxe)localObject3).hbL = this.cYO;
      ((LinkedList)localObject2).add(localObject3);
      localObject1 = new d((LinkedList)localObject2);
      au.DF().a((l)localObject1, 0);
      if (this.kBS == null) {
        break label281;
      }
    }
    label281:
    for (int i = this.kBS.size();; i = 0)
    {
      if (this.kBQ != null) {}
      for (int j = this.kBQ.size();; j = 0)
      {
        if (this.kBR != null) {}
        for (int k = this.kBR.size();; k = 0)
        {
          j = k + this.kBG.getTagList().size() - j - i;
          if ((i > 0) || (j > 0))
          {
            x.d("MicroMsg.Label.ContactLabelUI", "cpan[saveContact]addLabelNum:%d,updateLabelNum:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            com.tencent.mm.plugin.report.service.h.mEJ.h(11220, new Object[] { q.GF(), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(0) });
          }
          return;
        }
      }
    }
  }
  
  private void aYV()
  {
    aYM();
    this.kBS.clear();
    this.kBR.clear();
    finish();
  }
  
  private boolean aYW()
  {
    if (this.kBG != null)
    {
      if ((this.kBQ != null) && (this.kBQ.size() > 0)) {
        if ((this.kBG.getTagList() != null) || (this.kBG.getTagList().size() > 0)) {}
      }
      while ((this.kBG.getTagList() != null) && (this.kBG.getTagList().size() > 0))
      {
        ArrayList localArrayList;
        do
        {
          return true;
          localArrayList = this.kBG.getTagList();
          Collections.sort(this.kBQ);
          Collections.sort(localArrayList);
        } while (!this.kBQ.equals(localArrayList));
        return false;
      }
    }
    return false;
  }
  
  private void rO(int paramInt)
  {
    this.kBU = paramInt;
    switch (ContactLabelUI.4.kBY[(this.kBU - 1)])
    {
    default: 
      return;
    case 1: 
      this.kBM.setVisibility(8);
      if ((this.kBT != null) && (this.kBT.size() > 0))
      {
        this.kBI.setVisibility(0);
        this.kBN.setVisibility(0);
      }
      for (;;)
      {
        this.kBH.setVisibility(8);
        return;
        this.kBN.setVisibility(8);
        this.kBI.setVisibility(8);
      }
    case 2: 
      this.kBN.setVisibility(8);
      this.kBM.setVisibility(0);
      this.kBI.setVisibility(8);
      this.kBH.setVisibility(8);
      return;
    case 3: 
      this.kBM.setVisibility(8);
      this.kBN.setVisibility(8);
      this.kBI.setVisibility(8);
      this.kBH.setVisibility(0);
      this.kBH.setText(R.l.label_panel_max_tips);
      return;
    }
    this.kBM.setVisibility(8);
    this.kBN.setVisibility(8);
    this.kBI.setVisibility(8);
    this.kBH.setVisibility(0);
    this.kBH.setText(R.l.label_panel_max_tips);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paraml.getType())
    {
    case 636: 
    case 637: 
    default: 
      x.w("MicroMsg.Label.ContactLabelUI", "unknow type.");
      return;
    case 635: 
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        aYU();
        return;
      }
      aYP();
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      x.i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd] success.");
      aYV();
      return;
    }
    aYP();
  }
  
  public void finish()
  {
    if (this.kBG != null) {
      this.kBG.crP();
    }
    Intent localIntent = new Intent();
    if (aYW()) {
      localIntent.putExtra("hasLableChange", true);
    }
    for (;;)
    {
      setResult(-1, localIntent);
      super.finish();
      return;
      localIntent.putExtra("hasLableChange", false);
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.contact_label_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(getString(R.l.add_label_title));
    setBackBtn(new ContactLabelUI.1(this));
    a(0, getString(R.l.app_save), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        ContactLabelUI.a(ContactLabelUI.this);
        return false;
      }
    }, s.b.tmX);
    this.kBF = ((MMTagPanelScrollView)findViewById(R.h.label_panel_scroll));
    this.kBF.setMaxLine(3);
    this.kBG = ((MMLabelPanel)findViewById(R.h.label_panel_input));
    this.kBH = ((TextView)findViewById(R.h.label_panel_tips));
    this.kBI = findViewById(R.h.label_panel_container);
    this.kBJ = findViewById(R.h.label_panel_all_title_pref);
    this.kBJ.setBackgroundDrawable(null);
    this.kBK = ((TextView)this.kBJ.findViewById(16908310));
    this.kBK.setText(R.l.label_panel_all);
    this.kBL = ((MMLabelPanel)findViewById(R.h.label_panel_all));
    this.kBM = ((ListView)findViewById(R.h.label_panel_suggest));
    this.kBN = ((ScrollView)findViewById(R.h.label_scroll_view));
    if (this.kBN != null) {
      this.kBN.setOnTouchListener(new ContactLabelUI.6(this));
    }
    this.kBG.txF = true;
    this.kBG.lL(true);
    this.kBG.setTagEditTextBG(R.g.tag_edittext_gb);
    this.kBG.setCallBack(new MMTagPanel.a()
    {
      public final void aGt()
      {
        x.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagEditTextClick]");
      }
      
      public final void i(boolean paramAnonymousBoolean, int paramAnonymousInt)
      {
        x.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagLengthMax] match:%s exceedCount:%d", new Object[] { String.valueOf(paramAnonymousBoolean), Integer.valueOf(paramAnonymousInt) });
        if (paramAnonymousBoolean)
        {
          ContactLabelUI.this.enableOptionMenu(false);
          ContactLabelUI.e(ContactLabelUI.this).setVisibility(0);
          ContactLabelUI.e(ContactLabelUI.this).setText(R.l.label_panel_max_tips);
          ContactLabelUI.e(ContactLabelUI.this).setText(String.format(ContactLabelUI.this.getString(R.l.label_panel_max_tips), new Object[] { Integer.valueOf(g.be(36, "")), Integer.valueOf(paramAnonymousInt) }));
          return;
        }
        ContactLabelUI.this.enableOptionMenu(true);
        ContactLabelUI.e(ContactLabelUI.this).setVisibility(8);
      }
      
      public final void zO(String paramAnonymousString)
      {
        x.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagUnSelected] tag:%s", new Object[] { paramAnonymousString });
        ContactLabelUI.b(ContactLabelUI.this).removeTag(paramAnonymousString);
        if (ContactLabelUI.c(ContactLabelUI.this) != null) {
          ContactLabelUI.c(ContactLabelUI.this).bv(paramAnonymousString, false);
        }
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString);
      }
      
      public final void zP(String paramAnonymousString)
      {
        x.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagSelected] tag:%s", new Object[] { paramAnonymousString });
      }
      
      public final void zQ(String paramAnonymousString)
      {
        x.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagRemove] tag:%s", new Object[] { paramAnonymousString });
        if (ContactLabelUI.c(ContactLabelUI.this) != null) {
          ContactLabelUI.c(ContactLabelUI.this).bv(paramAnonymousString, false);
        }
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString);
      }
      
      public final void zR(String paramAnonymousString)
      {
        x.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagEditTextChange] curText:%s", new Object[] { paramAnonymousString });
        ContactLabelUI.b(ContactLabelUI.this, paramAnonymousString);
      }
      
      public final void zS(String paramAnonymousString)
      {
        x.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagCreate] tag:%s", new Object[] { paramAnonymousString });
        if (bi.oW(paramAnonymousString))
        {
          x.d("MicroMsg.Label.ContactLabelUI", "tag is null.");
          return;
        }
        ContactLabelUI.b(ContactLabelUI.this).bu(paramAnonymousString, true);
        if (ContactLabelUI.c(ContactLabelUI.this) != null) {
          ContactLabelUI.c(ContactLabelUI.this).bv(paramAnonymousString, true);
        }
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString, ContactLabelUI.d(ContactLabelUI.this));
      }
    });
    this.kBL.lL(false);
    this.kBL.setCallBack(new MMTagPanel.a()
    {
      public final void aGt() {}
      
      public final void i(boolean paramAnonymousBoolean, int paramAnonymousInt) {}
      
      public final void zO(String paramAnonymousString)
      {
        x.d("MicroMsg.Label.ContactLabelUI", "cpan[All onTagUnSelected] tag:%s", new Object[] { paramAnonymousString });
        if (ContactLabelUI.b(ContactLabelUI.this) != null) {
          ContactLabelUI.b(ContactLabelUI.this).removeTag(paramAnonymousString);
        }
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString);
      }
      
      public final void zP(String paramAnonymousString)
      {
        x.d("MicroMsg.Label.ContactLabelUI", "cpan[All onTagSelected] tag:%s", new Object[] { paramAnonymousString });
        if (ContactLabelUI.b(ContactLabelUI.this) != null) {
          ContactLabelUI.b(ContactLabelUI.this).bu(paramAnonymousString, true);
        }
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString, ContactLabelUI.d(ContactLabelUI.this));
      }
      
      public final void zQ(String paramAnonymousString) {}
      
      public final void zR(String paramAnonymousString) {}
      
      public final void zS(String paramAnonymousString) {}
    });
    this.kBM.setAdapter(this.kBO);
    this.kBM.setOnItemClickListener(new ContactLabelUI.9(this));
    enableOptionMenu(false);
  }
  
  public void onBackPressed()
  {
    if (aYW())
    {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.save_label_msg), "", getString(R.l.btn_save), getString(R.l.btn_unsave), new ContactLabelUI.2(this), new ContactLabelUI.3(this));
      return;
    }
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kBP = getIntent().getStringExtra("label_id_list");
    this.kBQ = getIntent().getStringArrayListExtra("label_str_list");
    this.cYO = getIntent().getStringExtra("label_username");
    this.kBV = getIntent().getBooleanExtra("is_stranger", false);
    this.kBO = new b(this);
    initView();
    if ((!bi.oW(this.kBP)) && (this.kBQ != null) && (this.kBQ.size() > 0)) {
      this.kBG.a(this.kBQ, this.kBQ);
    }
    if (this.kBV)
    {
      this.kBW = getIntent().getStringArrayListExtra("label_str_list");
      this.kBG.a(this.kBW, this.kBW);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onPause()
  {
    au.DF().b(635, this);
    au.DF().b(638, this);
    super.onPause();
  }
  
  protected void onResume()
  {
    au.DF().a(635, this);
    au.DF().a(638, this);
    ah.A(new Runnable()
    {
      public final void run()
      {
        Object localObject2 = null;
        Object localObject1 = null;
        Object localObject3 = null;
        ContactLabelUI.g(ContactLabelUI.this).clear();
        ContactLabelUI.h(ContactLabelUI.this).clear();
        if (ContactLabelUI.b(ContactLabelUI.this) != null)
        {
          if (ContactLabelUI.d(ContactLabelUI.this))
          {
            au.HU();
            localObject2 = com.tencent.mm.model.c.FS().Hh(ContactLabelUI.i(ContactLabelUI.this));
            localObject1 = localObject3;
            if (localObject2 != null) {
              localObject1 = ((bq)localObject2).field_contactLabels;
            }
            localObject3 = localObject1;
            if (bi.oW((String)localObject1))
            {
              au.HU();
              ab localab = com.tencent.mm.model.c.FR().Yg(ContactLabelUI.i(ContactLabelUI.this));
              localObject3 = localab.field_encryptUsername;
              localObject2 = localObject1;
              if (!bi.oW((String)localObject3))
              {
                au.HU();
                localObject3 = com.tencent.mm.model.c.FS().Hh((String)localObject3);
                localObject2 = localObject1;
                if (localObject3 != null) {
                  localObject2 = ((bq)localObject3).field_contactLabels;
                }
              }
              localObject3 = localObject2;
              if (bi.oW((String)localObject2))
              {
                localObject1 = localab.field_username;
                au.HU();
                localObject1 = com.tencent.mm.model.c.FS().Hh((String)localObject1);
                localObject3 = localObject2;
                if (localObject1 != null) {
                  localObject3 = ((bq)localObject1).field_contactLabels;
                }
              }
            }
            localObject1 = (ArrayList)a.aYK().FB((String)localObject3);
            ContactLabelUI.b(ContactLabelUI.this).a((Collection)localObject1, (List)localObject1);
            ContactLabelUI.a(ContactLabelUI.this, (ArrayList)localObject1);
          }
        }
        else if (ContactLabelUI.c(ContactLabelUI.this) != null)
        {
          ContactLabelUI.b(ContactLabelUI.this, com.tencent.mm.plugin.label.e.aYJ().cld());
          if ((ContactLabelUI.j(ContactLabelUI.this) == null) || (ContactLabelUI.j(ContactLabelUI.this).size() <= 0)) {
            break label405;
          }
          ContactLabelUI.d(ContactLabelUI.this);
          ContactLabelUI.c(ContactLabelUI.this).a((Collection)localObject1, ContactLabelUI.j(ContactLabelUI.this));
          if (ContactLabelUI.k(ContactLabelUI.this))
          {
            com.tencent.mm.plugin.report.service.h.mEJ.h(11346, new Object[] { Integer.valueOf(0), Integer.valueOf(1) });
            ContactLabelUI.l(ContactLabelUI.this);
          }
        }
        for (;;)
        {
          ContactLabelUI.a(ContactLabelUI.this, ContactLabelUI.a.kBZ);
          return;
          au.HU();
          localObject3 = com.tencent.mm.model.c.FR().Yg(ContactLabelUI.i(ContactLabelUI.this));
          localObject1 = localObject2;
          if (localObject3 == null) {
            break;
          }
          localObject3 = ((ai)localObject3).field_contactLabelIds;
          localObject1 = localObject2;
          if (bi.oW((String)localObject3)) {
            break;
          }
          localObject1 = (ArrayList)a.aYK().FC((String)localObject3);
          break;
          label405:
          if (ContactLabelUI.k(ContactLabelUI.this))
          {
            com.tencent.mm.plugin.report.service.h.mEJ.h(11346, new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
            ContactLabelUI.l(ContactLabelUI.this);
          }
        }
      }
    });
    super.onResume();
  }
  
  private static enum a
  {
    public static int[] aYX()
    {
      return (int[])kCd.clone();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/label/ui/ContactLabelUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */