package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.v;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;
import com.tencent.mm.ui.widget.listview.AnimatedExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SnsLabelUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  public static int[] nXt = { i.j.sns_label_public, i.j.sns_label_private, i.j.sns_label_include, i.j.sns_label_exclude };
  private boolean nXA = false;
  private boolean nXB = false;
  private boolean nXC = false;
  private int nXD;
  private p nXE;
  private String nXF;
  private int nXG;
  private ArrayList<String> nXH;
  private ArrayList<String> nXI;
  private ArrayList<Long> nXJ;
  private ArrayList<String[]> nXK;
  private AnimatedExpandableListView nXs;
  private ArrayList<String> nXu;
  private String nXv;
  private String nXw;
  aq nXx;
  private int nXy = 0;
  private boolean nXz;
  
  private static int bDA()
  {
    g.Ek();
    return ((Integer)g.Ei().DT().get(335874, Integer.valueOf(0))).intValue();
  }
  
  private void bDB()
  {
    com.tencent.mm.plugin.report.service.h.mEJ.h(11455, new Object[] { "", "", Integer.valueOf(this.nXG), Integer.valueOf(0) });
    g.Ek();
    int i = ((Integer)g.Ei().DT().get(335874, Integer.valueOf(0))).intValue();
    g.Ek();
    g.Ei().DT().set(335874, Integer.valueOf(i + 1));
    this.nXI = null;
    this.nXC = false;
    this.nXB = false;
    if ((this.nXE != null) && (this.nXE.isShowing())) {
      this.nXE.dismiss();
    }
    if (this.nXA)
    {
      this.nXA = false;
      return;
    }
    i = i.j.sns_label_transform_failed_once;
    if (bDA() > 1) {
      i = i.j.sns_label_transform_failed_again;
    }
    com.tencent.mm.ui.base.h.a(this, i, i.j.app_ok, new SnsLabelUI.2(this));
  }
  
  private void bDy()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("Ktag_range_index", this.nXy);
    if ((this.nXy == 2) || (this.nXy == 3))
    {
      localIntent.putExtra("Klabel_name_list", this.nXv);
      localIntent.putExtra("Kother_user_name_list", this.nXw);
    }
    setResult(-1, localIntent);
    finish();
  }
  
  private void cs(List<String[]> paramList)
  {
    if ((this.nXI == null) || (this.nXI.size() == 0)) {
      return;
    }
    Iterator localIterator = this.nXI.iterator();
    paramList = paramList.iterator();
    ArrayList localArrayList1 = new ArrayList(this.nXI.size());
    ArrayList localArrayList2 = new ArrayList(this.nXI.size());
    while (localIterator.hasNext())
    {
      localArrayList1.add(a.aYK().FA((String)localIterator.next()));
      localArrayList2.add(bi.c(Arrays.asList((Object[])paramList.next()), ","));
      this.nXB = true;
    }
    a.aYK().g(localArrayList1, localArrayList2);
  }
  
  private void goBack()
  {
    int j = 0;
    int k = this.nXx.nXR;
    int i;
    if (this.nXx.nXR != this.nXy) {
      if (((k == 2) && ((this.nXx.nXT.size() != 0) || (this.nXx.nXV.size() != 0))) || ((k == 3) && ((this.nXx.nXU.size() != 0) || (this.nXx.nXW.size() != 0)))) {
        i = 1;
      }
    }
    while (i != 0)
    {
      com.tencent.mm.ui.base.h.a(this, true, getString(i.j.sns_label_goback_tip), "", getString(i.j.sns_label_goback_save), getString(i.j.sns_label_goback_notsave), new SnsLabelUI.8(this), new SnsLabelUI.9(this));
      return;
      if (k != 1)
      {
        i = j;
        if (k != 0) {}
      }
      else
      {
        i = 1;
        continue;
        if ((k != 2) || (this.nXx.nXT.size() == 0) || ((bi.c(this.nXx.nXT, ",").equals(this.nXv)) && (bi.c(this.nXx.nXV, ",").equals(this.nXw))))
        {
          i = j;
          if (k != 3) {
            continue;
          }
          i = j;
          if (this.nXx.nXU.size() == 0) {
            continue;
          }
          if (bi.c(this.nXx.nXU, ",").equals(this.nXv))
          {
            i = j;
            if (bi.c(this.nXx.nXW, ",").equals(this.nXw)) {
              continue;
            }
          }
        }
        i = 1;
      }
    }
    bDy();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsLabelUI", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!this.nXB) {}
    do
    {
      return;
      switch (paraml.getType())
      {
      default: 
        return;
      }
    } while ((paramInt1 == 0) && (paramInt2 == 0));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsLabelUI", "dz: error at delete tag list!");
    return;
    Object localObject;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      localObject = af.byu().getCursor();
      this.nXG = ((Cursor)localObject).getCount();
      if (this.nXG > 0)
      {
        ((Cursor)localObject).moveToFirst();
        t localt = new t();
        paramInt1 = ((Cursor)localObject).getCount();
        this.nXI = new ArrayList(paramInt1);
        this.nXH = new ArrayList(paramInt1);
        this.nXK = new ArrayList(paramInt1);
        this.nXJ = new ArrayList(paramInt1);
        if (!((Cursor)localObject).isAfterLast())
        {
          localt.d((Cursor)localObject);
          if ((localt.field_memberList != null) && (localt.field_memberList.length() != 0))
          {
            this.nXK.add(localt.field_memberList.split(","));
            paraml = localt.field_tagName;
            ArrayList localArrayList = this.nXI;
            paramString = a.aYK().aYH();
            if (paramString == null)
            {
              paramString = paraml;
              label298:
              localArrayList.add(paramString);
              this.nXH.add(paraml);
              this.nXJ.add(Long.valueOf(localt.field_tagId));
            }
          }
          for (;;)
          {
            ((Cursor)localObject).moveToNext();
            break;
            if (!paramString.contains(paraml))
            {
              paramString = paraml;
              break label298;
            }
            paramString = String.format(getString(i.j.sns_label_from_tag_suffix), new Object[] { paraml });
            break label298;
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SnsLabelUI", "dz:snstaginfo memberlist is null.");
          }
        }
        ((Cursor)localObject).close();
        if (this.nXH.size() != 0) {
          break label504;
        }
        paramInt1 = 0;
        if (paramInt1 != 0) {}
      }
      else if (this.nXC)
      {
        this.nXx.nXR = this.nXD;
        this.nXs.Gw(this.nXD);
        g.Ek();
        g.Ei().DT().set(335873, Boolean.valueOf(false));
      }
      ((Cursor)localObject).close();
      if (this.nXA)
      {
        this.nXB = true;
        a.aYK().bp(this.nXI);
      }
    }
    for (;;)
    {
      this.nXC = false;
      return;
      label504:
      paramInt1 = 1;
      break;
      this.nXB = false;
      continue;
      bDB();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsLabelUI", "dz: error at get sns tag list!");
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      cs(this.nXK);
      return;
    }
    bDB();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsLabelUI", "dz: error at add contact label!");
    return;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.nXH.iterator();
      paraml = this.nXJ.iterator();
      while (paramString.hasNext())
      {
        long l = ((Long)paraml.next()).longValue();
        localObject = (String)paramString.next();
        if (l != 0L)
        {
          g.Ek();
          g.Eh().dpP.a(new com.tencent.mm.plugin.sns.model.x(l, (String)localObject), 0);
        }
      }
      g.Ek();
      g.Ei().DT().set(335874, Integer.valueOf(0));
      this.nXu = ((ArrayList)a.aYK().aYF());
      com.tencent.mm.plugin.report.service.h.mEJ.h(11455, new Object[] { "", "", Integer.valueOf(this.nXG), Integer.valueOf(this.nXI.size()) });
      this.nXs.postDelayed(new SnsLabelUI.10(this), 600L);
      g.Ek();
      g.Ei().DT().set(335873, Boolean.valueOf(false));
      return;
    }
    bDB();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsLabelUI", "dz: error at modify label list!");
  }
  
  final void bDz()
  {
    Intent localIntent = new Intent();
    if (this.nXx.nXR == 2)
    {
      this.nXv = bi.c(this.nXx.nXT, ",");
      this.nXw = bi.c(this.nXx.nXV, ",");
      localIntent.putExtra("Klabel_name_list", this.nXv);
      localIntent.putExtra("Kother_user_name_list", this.nXw);
    }
    for (;;)
    {
      localIntent.putExtra("Ktag_range_index", this.nXx.nXR);
      setResult(-1, localIntent);
      finish();
      return;
      if (this.nXx.nXR == 3)
      {
        this.nXv = bi.c(this.nXx.nXU, ",");
        this.nXw = bi.c(this.nXx.nXW, ",");
        localIntent.putExtra("Klabel_name_list", this.nXv);
        localIntent.putExtra("Kother_user_name_list", this.nXw);
      }
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      goBack();
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_label;
  }
  
  protected final void initView()
  {
    boolean bool = getIntent().getBooleanExtra("KLabel_is_filter_private", false);
    this.nXs = ((AnimatedExpandableListView)findViewById(i.f.sns_label_exlist));
    this.nXu = ((ArrayList)a.aYK().aYF());
    this.nXx.nXS = bool;
    this.nXx.O(this.nXu);
    AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, -2);
    localLayoutParams.height = getResources().getDimensionPixelSize(i.d.LargerPadding);
    View localView = new View(this);
    localView.setLayoutParams(localLayoutParams);
    this.nXs.addHeaderView(localView);
    this.nXs.setAdapter(this.nXx);
    if (this.nXx.nXR == 2) {
      this.nXs.expandGroup(2);
    }
    for (;;)
    {
      this.nXs.setOnGroupClickListener(new SnsLabelUI.1(this));
      this.nXs.setOnChildClickListener(new SnsLabelUI.3(this));
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          SnsLabelUI.h(SnsLabelUI.this);
          return true;
        }
      });
      a(0, getString(i.j.sns_label_finish), new SnsLabelUI.5(this), s.b.tmX);
      return;
      if (this.nXx.nXR == 3) {
        this.nXs.expandGroup(3);
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt2 == -1) && (paramInt1 == 4003))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsLabelUI", "the Activity completed");
      localObject = paramIntent.getStringExtra("Select_Contacts_To_Create_New_Label");
      if (!bi.oW((String)localObject))
      {
        paramIntent = new Intent();
        paramIntent.putExtra("Select_Contact", (String)localObject);
        d.b(this.mController.tml, "label", ".ui.ContactLabelEditUI", paramIntent, 4002);
      }
    }
    do
    {
      do
      {
        return;
        paramIntent = paramIntent.getStringExtra("Select_Contact");
        this.nXw = new String(paramIntent);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", new Object[] { paramIntent });
        if (this.nXD == 2)
        {
          this.nXx.nXV.clear();
          if (!bi.oW(paramIntent))
          {
            paramIntent = bi.F(paramIntent.split(","));
            this.nXx.nXV.addAll(paramIntent);
            this.nXx.nXR = this.nXD;
          }
        }
        for (;;)
        {
          this.nXx.notifyDataSetChanged();
          this.nXs.expandGroup(this.nXD);
          return;
          if (this.nXD == 3)
          {
            this.nXx.nXW.clear();
            if (!bi.oW(paramIntent))
            {
              paramIntent = bi.F(paramIntent.split(","));
              this.nXx.nXW.addAll(paramIntent);
              this.nXx.nXR = this.nXD;
            }
          }
        }
        if ((paramInt2 != -1) || (paramInt1 != 4001)) {
          break;
        }
        paramIntent = paramIntent.getStringExtra("Select_Contact");
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", new Object[] { paramIntent });
      } while (bi.oW(paramIntent));
      localObject = new Intent();
      ((Intent)localObject).putExtra("Select_Contact", paramIntent);
      d.b(this, "label", ".ui.ContactLabelEditUI", (Intent)localObject, 4002);
      return;
    } while ((paramInt2 != 0) || (paramInt1 != 4002) || (paramIntent == null));
    Object localObject = paramIntent.getStringExtra("k_sns_label_add_label");
    this.nXF = paramIntent.getStringExtra("k_sns_label_add_label");
    this.nXs.postDelayed(new SnsLabelUI.7(this, (String)localObject), 300L);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(i.j.sns_tag_title);
    g.Ek();
    g.Eh().dpP.a(292, this);
    g.Ek();
    g.Eh().dpP.a(635, this);
    g.Ek();
    g.Eh().dpP.a(638, this);
    g.Ek();
    g.Eh().dpP.a(290, this);
    this.nXx = new aq(this);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      this.nXy = 0;
      this.nXx.style = 0;
      this.nXv = null;
      this.nXw = null;
      this.nXx.nXR = this.nXy;
      if (this.nXx.style == 1) {
        findViewById(i.f.sns_label_layout).setBackgroundResource(i.c.black);
      }
      if (this.nXy != 2) {
        break label387;
      }
      if (!TextUtils.isEmpty(this.nXv)) {
        this.nXx.nXT = bi.F(this.nXv.split(","));
      }
      if (!TextUtils.isEmpty(this.nXw)) {
        this.nXx.nXV = bi.F(this.nXw.split(","));
      }
    }
    for (;;)
    {
      g.Ek();
      this.nXz = ((Boolean)g.Ei().DT().get(335873, Boolean.valueOf(true))).booleanValue();
      if (this.nXz)
      {
        this.nXB = true;
        this.nXC = true;
        if (bDA() > 0) {
          this.nXA = true;
        }
        g.Ek();
        g.Eh().dpP.a(new v(1), 0);
      }
      initView();
      return;
      this.nXy = paramBundle.getIntExtra("KLabel_range_index", 0);
      this.nXx.style = paramBundle.getIntExtra("k_sns_label_ui_style", 0);
      this.nXv = paramBundle.getStringExtra("Klabel_name_list");
      this.nXw = paramBundle.getStringExtra("Kother_user_name_list");
      if (TextUtils.isEmpty(paramBundle.getStringExtra("k_sns_label_ui_title"))) {
        break;
      }
      setMMTitle(paramBundle.getStringExtra("k_sns_label_ui_title"));
      break;
      label387:
      if (this.nXy == 3)
      {
        if (!TextUtils.isEmpty(this.nXv)) {
          this.nXx.nXU = bi.F(this.nXv.split(","));
        }
        if (!TextUtils.isEmpty(this.nXw)) {
          this.nXx.nXW = bi.F(this.nXw.split(","));
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    g.Ek();
    g.Eh().dpP.b(292, this);
    g.Ek();
    g.Eh().dpP.b(635, this);
    g.Ek();
    g.Eh().dpP.b(638, this);
    g.Ek();
    g.Eh().dpP.b(290, this);
    super.onDestroy();
  }
  
  public void onResume()
  {
    if ((this.nXx != null) && (this.nXF == null))
    {
      this.nXu = ((ArrayList)a.aYK().aYF());
      this.nXx.O(this.nXu);
      if (((this.nXu == null) || (this.nXu.size() == 0)) && ((this.nXw == null) || (this.nXw.length() == 0)) && (this.nXx.nXR != 0) && (this.nXx.nXR != 1)) {
        this.nXx.nXR = 0;
      }
      this.nXx.notifyDataSetChanged();
    }
    this.nXF = null;
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsLabelUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */