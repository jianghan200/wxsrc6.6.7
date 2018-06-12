package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.selectcontact.a.d;
import com.tencent.mm.plugin.selectcontact.a.e;
import com.tencent.mm.plugin.selectcontact.a.f;
import com.tencent.mm.plugin.selectcontact.a.h;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.a;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.b;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.AlphabetScrollBar;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.tools.e;
import com.tencent.mm.ui.tools.o.b;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.List;

public abstract class MMBaseSelectContactUI
  extends MMActivity
  implements AdapterView.OnItemClickListener, MultiSelectContactView.a, MultiSelectContactView.b, MultiSelectContactView.c, VerticalScrollBar.a, l, o.b
{
  public com.tencent.mm.ui.tools.o eMS;
  public MultiSelectContactView lbw;
  private ListView mfK;
  private View neM;
  public int scene;
  private AlphabetScrollBar ujZ;
  private o uka;
  public m ukb;
  private com.tencent.mm.ui.base.o ukc;
  private View ukd;
  private View uke;
  private TextView ukf;
  private LabelContainerView ukg;
  private TextView ukh;
  private MMTagPanel uki;
  private boolean ukj = true;
  private List<String> ukk = new ArrayList();
  
  private String cyr()
  {
    if (this.eMS != null) {
      return this.eMS.getSearchContent();
    }
    if (this.lbw != null) {
      return this.lbw.getSearchContent();
    }
    return "";
  }
  
  private void cys()
  {
    boolean bool;
    if (this.eMS != null)
    {
      bool = this.eMS.czu();
      if ((!bool) || (!bi.oW(cyr()))) {
        break label102;
      }
      if ((this.ukk == null) || (this.ukk.size() <= 0)) {
        break label92;
      }
      this.ukg.setVisibility(0);
      this.uki.a(null, this.ukk);
    }
    label92:
    label102:
    while (this.ukg == null)
    {
      return;
      if (this.lbw != null)
      {
        bool = this.lbw.hasFocus();
        break;
      }
      bool = false;
      break;
      this.ukg.setVisibility(8);
      return;
    }
    this.ukg.setVisibility(8);
  }
  
  private void cyu()
  {
    x.i("MicroMsg.MMBaseSelectContactUI", "setInitStatus");
    a(this.mfK, 0);
    this.mfK.setAdapter(this.uka);
    this.uka.notifyDataSetChanged();
    if ((Wl()) && (this.ujZ != null)) {
      this.ujZ.setVisibility(0);
    }
    this.uke.setVisibility(8);
  }
  
  public final void FW(String paramString)
  {
    x.i("MicroMsg.MMBaseSelectContactUI", "onSearchTextChange: text=%s", new Object[] { paramString });
    if (bcN()) {
      cys();
    }
    if (this.ukb != null)
    {
      if (!bi.oW(paramString)) {
        this.ukb.a(paramString, bbG(), cyt());
      }
    }
    else {
      return;
    }
    this.ukb.acV();
    this.ukb.notifyDataSetChanged();
    cyu();
  }
  
  public void Gr(String paramString)
  {
    x.i("MicroMsg.MMBaseSelectContactUI", "select label=%s", new Object[] { paramString });
  }
  
  public final void WW()
  {
    cyu();
    if (bcN()) {
      cys();
    }
  }
  
  public final void WX() {}
  
  public final void WY() {}
  
  public final void WZ() {}
  
  public void Wj()
  {
    this.scene = getIntent().getIntExtra("scene", 0);
  }
  
  public abstract boolean Wk();
  
  public abstract boolean Wl();
  
  public abstract String Wm();
  
  public abstract o Wn();
  
  public abstract m Wo();
  
  public void a(ListView paramListView, int paramInt) {}
  
  public boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    return false;
  }
  
  public boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    return false;
  }
  
  public int[] bbG()
  {
    return new int[] { 131072, 131075 };
  }
  
  public void bbH()
  {
    YC();
    finish();
  }
  
  public boolean bcN()
  {
    return false;
  }
  
  public final void cdq()
  {
    if (bcN()) {
      cys();
    }
  }
  
  public final n cyp()
  {
    if (getContentLV().getHeaderViewsCount() > 0) {
      return (n)((HeaderViewListAdapter)getContentLV().getAdapter()).getWrappedAdapter();
    }
    return (n)getContentLV().getAdapter();
  }
  
  public o cyq()
  {
    return this.uka;
  }
  
  public boolean cyt()
  {
    return false;
  }
  
  public final void cyv()
  {
    if (this.eMS != null) {
      if (!bi.oW(this.eMS.getSearchContent()))
      {
        localo = this.eMS;
        if (localo.uBv != null) {
          localo.uBv.mt(true);
        }
      }
    }
    while ((this.lbw == null) || (bi.oW(this.lbw.getSearchContent())))
    {
      com.tencent.mm.ui.tools.o localo;
      return;
    }
    this.lbw.qFV.setText("");
  }
  
  public final void cyw()
  {
    if (this.eMS != null) {
      if (this.eMS.czu()) {
        this.eMS.clearFocus();
      }
    }
    while ((this.lbw == null) || (!this.lbw.hasFocus())) {
      return;
    }
    this.lbw.clearFocus();
  }
  
  public boolean cyx()
  {
    return this.ukb != null;
  }
  
  public Activity getActivity()
  {
    return this;
  }
  
  public ListView getContentLV()
  {
    return this.mfK;
  }
  
  public int getLayoutId()
  {
    return a.f.mm_select_contact_ui;
  }
  
  public void iV(int paramInt) {}
  
  public void initView()
  {
    setMMTitle(Wm());
    this.mfK = ((ListView)findViewById(a.e.select_contact_lv));
    this.uka = Wn();
    this.ukb = Wo();
    this.neM = findViewById(a.e.shadow);
    if (cyx())
    {
      this.uke = findViewById(a.e.no_result_view);
      this.ukf = ((TextView)findViewById(a.e.no_result_tv));
      this.uke.setOnTouchListener(new MMBaseSelectContactUI.1(this));
      if (!Wk()) {
        break label361;
      }
      this.eMS = new com.tencent.mm.ui.tools.o((byte)0);
      this.eMS.uBw = this;
      a(this.eMS);
    }
    for (;;)
    {
      a(this.mfK, 0);
      this.mfK.setAdapter(this.uka);
      setBackBtn(new MMBaseSelectContactUI.2(this));
      if (this.ukb != null) {
        this.ukb.a(new MMBaseSelectContactUI.3(this));
      }
      this.mfK.setOnScrollListener(new MMBaseSelectContactUI.4(this));
      this.mfK.setOnItemClickListener(this);
      if (Wl())
      {
        this.ujZ = ((AlphabetScrollBar)findViewById(a.e.select_contact_scrollbar));
        this.ujZ.setVisibility(0);
        this.ujZ.setOnScrollBarTouchListener(this);
      }
      if (bcN())
      {
        this.ukg = ((LabelContainerView)findViewById(a.e.select_contact_label_container));
        this.ukh = ((TextView)this.ukg.findViewById(16908310));
        this.ukh.setText(a.h.select_contact_by_label_panel);
        this.uki = ((MMTagPanel)this.ukg.findViewById(a.e.contact_label_panel));
        this.uki.setTagSelectedBG(a.d.tag_white_tab_selector);
        this.uki.setTagSelectedTextColorRes(com.tencent.mm.plugin.selectcontact.a.b.normal_text_color);
        this.ukg.setOnLabelContainerListener(new MMBaseSelectContactUI.5(this));
        this.uki.setCallBack(new MMBaseSelectContactUI.6(this));
      }
      return;
      label361:
      this.lbw = ((MultiSelectContactView)findViewById(a.e.contact_multiselect));
      this.lbw.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
      this.lbw.setOnSearchTextChangeListener(this);
      this.lbw.setOnSearchTextFouceChangeListener(this);
      this.lbw.setOnContactDeselectListener(this);
      this.lbw.setVisibility(0);
      this.ukd = new View(this.mController.tml);
      AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, this.lbw.getMeasuredHeight());
      this.ukd.setLayoutParams(localLayoutParams);
      this.ukd.setVisibility(4);
      this.mfK.addHeaderView(this.ukd);
      findViewById(a.e.padding_view).setVisibility(0);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.MMBaseSelectContactUI", "onCreate!");
    if (!g.Eg().Dx())
    {
      x.e("MicroMsg.MMBaseSelectContactUI", "onCreate acc not ready finish");
      x.chS();
      finish();
      return;
    }
    Wj();
    x.i("MicroMsg.MMBaseSelectContactUI", "initData done!");
    initView();
    x.i("MicroMsg.MMBaseSelectContactUI", "initView done!");
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.ujZ != null) {
      this.ujZ.tBm = null;
    }
    if (this.uka != null) {
      this.uka.finish();
    }
    if (this.ukb != null) {
      this.ukb.finish();
    }
    if (this.ukc != null) {
      this.ukc.dismiss();
    }
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = paramInt - getContentLV().getHeaderViewsCount();
    int j;
    if (i >= 0)
    {
      paramAdapterView = cyp().FM(i);
      paramView = paramAdapterView.Wg();
      ActionBarActivity localActionBarActivity = this.mController.tml;
      paramView.Wi();
      if (paramAdapterView.djH)
      {
        i = paramAdapterView.jtq;
        j = paramAdapterView.jtr;
        if (!paramAdapterView.aQi()) {
          break label243;
        }
        i = 15;
        switch (paramAdapterView.jtq)
        {
        default: 
          j = 0;
        }
      }
    }
    for (;;)
    {
      if (paramAdapterView.ump) {
        j = 1;
      }
      if (paramAdapterView.hER == 5) {
        j = 7;
      }
      paramAdapterView = String.format("%s,%d,%d,%d,%d", new Object[] { paramAdapterView.bWm, Integer.valueOf(paramAdapterView.scene), Integer.valueOf(j), Integer.valueOf(paramAdapterView.jtl), Integer.valueOf(i) });
      x.v("MicroMsg.SelectContactReportLogic", "reportClick: %s", new Object[] { paramAdapterView });
      h.mEJ.k(13234, paramAdapterView);
      if (!cyp().FN(paramInt)) {
        iV(paramInt);
      }
      return;
      label243:
      if (i == 131072) {
        switch (j)
        {
        case 8: 
        case 9: 
        case 10: 
        case 12: 
        case 13: 
        case 14: 
        default: 
          i = 0;
          break;
        case 1: 
          i = 1;
          break;
        case 2: 
          i = 2;
          break;
        case 3: 
          i = 3;
          break;
        case 4: 
          i = 4;
          break;
        case 5: 
          i = 5;
          break;
        case 6: 
          i = 6;
          break;
        case 7: 
          i = 7;
          break;
        case 11: 
          i = 8;
          break;
        case 16: 
          i = 10;
          break;
        case 17: 
        case 18: 
          i = 9;
          break;
        case 15: 
          i = 16;
          break;
        }
      }
      if (i == 131075) {
        switch (j)
        {
        default: 
          i = 0;
          break;
        case 1: 
        case 5: 
          i = 12;
          break;
        case 2: 
        case 6: 
          i = 13;
          break;
        case 3: 
        case 7: 
          i = 14;
          break;
        case 29: 
        case 30: 
        case 31: 
        case 32: 
        case 34: 
        case 35: 
        case 36: 
        case 37: 
        case 38: 
          i = 11;
          break;
        }
      }
      if (i == 65536)
      {
        i = 17;
        break;
      }
      i = 0;
      break;
      j = 2;
      continue;
      j = 3;
      continue;
      j = 4;
      continue;
      j = 5;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getKeyCode() == 4) {
      bbH();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.ukc != null) {
      this.ukc.dismiss();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if ((bcN()) && (this.ukj))
    {
      this.ukj = false;
      g.Em().H(new MMBaseSelectContactUI.7(this));
    }
  }
  
  public void pf(String paramString) {}
  
  public final boolean pj(String paramString)
  {
    return false;
  }
  
  public final void pk(String paramString)
  {
    x.i("MicroMsg.MMBaseSelectContactUI", "onSearchChange: searchText=%s", new Object[] { paramString });
    if (bcN())
    {
      if (this.eMS != null) {
        this.eMS.czv();
      }
      cys();
    }
    if (!bi.oW(paramString))
    {
      this.ukb.a(paramString, bbG(), cyt());
      return;
    }
    this.ukb.acV();
    this.ukb.notifyDataSetChanged();
    cyu();
  }
  
  public final void ys(String paramString)
  {
    int i;
    if (this.uka != null)
    {
      i = this.uka.aaJ(paramString);
      if (i != 0) {
        break label29;
      }
      this.mfK.setSelection(0);
    }
    label29:
    do
    {
      return;
      if (i <= 0) {
        break;
      }
      if (Wk())
      {
        this.mfK.setSelection(i);
        return;
      }
    } while (this.lbw == null);
    this.mfK.setSelectionFromTop(i, this.lbw.getMeasuredHeight());
    return;
    x.i("MicroMsg.MMBaseSelectContactUI", "Select unkown head selectPosition=%d | header=%s", new Object[] { Integer.valueOf(i), paramString });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/contact/MMBaseSelectContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */