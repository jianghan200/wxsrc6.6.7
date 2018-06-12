package com.tencent.mm.plugin.sight.encode.ui;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.contact.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainSightSelectContactView
  extends FrameLayout
  implements AbsListView.OnScrollListener, d.a, l
{
  public ListView CU;
  boolean nfB = false;
  public MMFragmentActivity nfG;
  public int ngf;
  public d ngg;
  Animation ngh;
  public c ngi;
  private View ngj;
  public a ngk;
  public LinearLayout ngl;
  private View ngm;
  private int ngn = -1;
  private int ngo = -1;
  public HashSet<String> ngp;
  public HashSet<String> ngq;
  
  public MainSightSelectContactView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MainSightSelectContactView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void b(List<String> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.nfB) {}
    do
    {
      do
      {
        return;
      } while (paramList == null);
      if (paramBoolean1)
      {
        this.ngq.clear();
        this.ngp.clear();
        c.nfQ = true;
        c.nfR = false;
      }
      if (this.ngi != null)
      {
        c localc = this.ngi;
        localc.clearCache();
        localc.nfO = paramList;
        localc.notifyDataSetChanged();
      }
      if (paramBoolean2)
      {
        bww();
        return;
      }
    } while (this.ngm == null);
    this.CU.removeFooterView(this.ngm);
  }
  
  public static boolean wg(int paramInt)
  {
    return paramInt == -1;
  }
  
  public final void C(boolean paramBoolean1, boolean paramBoolean2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("@search.tencent");
    localArrayList.add("@sns.tencent");
    Object localObject = getInitData();
    if (paramBoolean1)
    {
      localArrayList.addAll(this.ngq);
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        if (!localArrayList.contains(str)) {
          localArrayList.add(str);
        }
      }
    }
    localArrayList.addAll((Collection)localObject);
    b(localArrayList, paramBoolean2, true);
  }
  
  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.ngq.contains(parama.guS.field_username);
    }
    return false;
  }
  
  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.ngp.contains(parama.guS.field_username);
    }
    return false;
  }
  
  public final void bwu()
  {
    if (this.ngl == null) {
      return;
    }
    this.ngl.getChildAt(0).setVisibility(8);
    this.ngj.setVisibility(0);
    List localList = this.ngi.nfO;
    localList.remove("@search.tencent");
    localList.remove("@sns.tencent");
    localList.remove("@draft.tencent");
    b(localList, false, true);
    this.ngk.bwm();
    if (!this.ngk.BD()) {
      this.ngk.bwn();
    }
    this.ngk.bwo();
  }
  
  public final void bwv()
  {
    if (this.ngl == null) {
      return;
    }
    this.ngl.getChildAt(0).setVisibility(0);
    this.ngj.setVisibility(8);
    C(true, false);
    this.ngk.bwl();
  }
  
  public final void bww()
  {
    this.CU.post(new Runnable()
    {
      public final void run()
      {
        if ((MainSightSelectContactView.a(MainSightSelectContactView.this) == MainSightSelectContactView.b(MainSightSelectContactView.this).getCount()) && (MainSightSelectContactView.c(MainSightSelectContactView.this).getViewHeight() >= MainSightSelectContactView.d(MainSightSelectContactView.this))) {}
        int i;
        label225:
        do
        {
          return;
          if (MainSightSelectContactView.e(MainSightSelectContactView.this) != null) {
            MainSightSelectContactView.f(MainSightSelectContactView.this).removeFooterView(MainSightSelectContactView.e(MainSightSelectContactView.this));
          }
          i = MainSightSelectContactView.d(MainSightSelectContactView.this);
          if ((MainSightSelectContactView.d(MainSightSelectContactView.this) < 0) || (MainSightSelectContactView.d(MainSightSelectContactView.this) > MainSightSelectContactView.c(MainSightSelectContactView.this).getViewHeight())) {
            i = MainSightSelectContactView.c(MainSightSelectContactView.this).getViewHeight();
          }
          MainSightSelectContactView.a(MainSightSelectContactView.this, MainSightSelectContactView.b(MainSightSelectContactView.this).getCount());
          MainSightSelectContactView.b(MainSightSelectContactView.this, i);
          int j = 0;
          int k = 0;
          for (;;)
          {
            if (j >= MainSightSelectContactView.b(MainSightSelectContactView.this).getCount()) {
              break label225;
            }
            localObject = MainSightSelectContactView.b(MainSightSelectContactView.this).getView(j, null, MainSightSelectContactView.f(MainSightSelectContactView.this));
            ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            k += ((View)localObject).getMeasuredHeight();
            if (k >= i) {
              break;
            }
            j += 1;
          }
          i -= k;
        } while (i <= 0);
        MainSightSelectContactView.a(MainSightSelectContactView.this, new View(MainSightSelectContactView.this.getContext()));
        Object localObject = new AbsListView.LayoutParams(-1, i);
        MainSightSelectContactView.e(MainSightSelectContactView.this).setLayoutParams((ViewGroup.LayoutParams)localObject);
        MainSightSelectContactView.e(MainSightSelectContactView.this).setBackgroundResource(R.e.black);
        MainSightSelectContactView.f(MainSightSelectContactView.this).addFooterView(MainSightSelectContactView.e(MainSightSelectContactView.this));
      }
    });
  }
  
  public final boolean bwx()
  {
    if (this.ngq == null) {
      return true;
    }
    return this.ngq.isEmpty();
  }
  
  public final void ce(List<String> paramList)
  {
    b(paramList, false, false);
  }
  
  public Activity getActivity()
  {
    return this.nfG;
  }
  
  public ListView getContentLV()
  {
    return this.CU;
  }
  
  public List<String> getInitData()
  {
    ArrayList localArrayList = new ArrayList();
    au.HU();
    List localList = com.tencent.mm.model.c.FW().clD();
    localList.remove(q.GF());
    localArrayList.addAll(localList);
    return localArrayList;
  }
  
  public ListView getListView()
  {
    return this.CU;
  }
  
  public LinkedList<String> getSelectedContact()
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(this.ngq);
    return localLinkedList;
  }
  
  final String jd(int paramInt)
  {
    Object localObject = this.ngi.FM(paramInt);
    if (localObject == null) {}
    do
    {
      return null;
      localObject = ((com.tencent.mm.ui.contact.a.a)localObject).guS;
    } while (localObject == null);
    return ((ai)localObject).field_username;
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.ngl == null) || (paramAbsListView == null) || (this.ngl.getHeight() <= 0) || (this.nfG == null)) {}
    do
    {
      return;
      paramInt1 = this.ngl.getHeight() - this.nfG.getSupportActionBar().getHeight();
      paramInt2 = -this.ngl.getTop();
    } while (paramInt2 < 0);
    float f = paramInt2 / paramInt1;
    this.ngk.setCameraShadowAlpha(f);
    if ((this.ngl.getTop() < 0) && (this.ngl.getTop() <= -paramInt1)) {}
    for (boolean bool = true;; bool = false)
    {
      this.ngk.hN(bool);
      return;
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 1) {
      bi.hideVKB(paramAbsListView);
    }
  }
  
  public void setEmptyBgView(View paramView)
  {
    this.ngj = paramView;
  }
  
  public void setIsMultiSelect(boolean paramBoolean)
  {
    this.ngi.nfP = paramBoolean;
  }
  
  public void setMainSightContentView(a parama)
  {
    this.ngk = parama;
  }
  
  public void setSearchView(View paramView)
  {
    d locald = this.ngg;
    locald.nfX = paramView;
    locald.nfV = ((EditText)paramView.findViewById(R.h.edittext));
    locald.nfW = ((TextView)paramView.findViewById(R.h.search_cancel_tv));
    locald.nfV.setOnFocusChangeListener(locald);
    locald.nfV.addTextChangedListener(locald);
    locald.nfW.setOnClickListener(locald);
    locald.nfZ = ((InputMethodManager)paramView.getContext().getSystemService("input_method"));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sight/encode/ui/MainSightSelectContactView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */