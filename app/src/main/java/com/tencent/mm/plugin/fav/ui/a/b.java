package com.tencent.mm.plugin.fav.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import com.tencent.mm.g.a.jt;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.ui.d.a.b;
import com.tencent.mm.plugin.fav.ui.d.a.c;
import com.tencent.mm.plugin.fav.ui.d.d;
import com.tencent.mm.plugin.fav.ui.d.e;
import com.tencent.mm.plugin.fav.ui.d.f;
import com.tencent.mm.plugin.fav.ui.d.i;
import com.tencent.mm.plugin.fav.ui.d.j;
import com.tencent.mm.plugin.fav.ui.d.l;
import com.tencent.mm.plugin.fav.ui.d.m;
import com.tencent.mm.plugin.fav.ui.d.n;
import com.tencent.mm.plugin.fav.ui.d.o;
import com.tencent.mm.plugin.fav.ui.d.p;
import com.tencent.mm.plugin.fav.ui.d.q;
import com.tencent.mm.plugin.fav.ui.m.b;
import com.tencent.mm.plugin.fav.ui.m.i;
import com.tencent.mm.protocal.c.wn;
import com.tencent.mm.protocal.c.wy;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class b
  extends a
{
  public String bWm = "";
  private com.tencent.mm.sdk.b.c fIu = new com.tencent.mm.sdk.b.c() {};
  public int iVT;
  private boolean jbD = false;
  public List<com.tencent.mm.plugin.fav.a.g> jbE = new ArrayList();
  private List<com.tencent.mm.plugin.fav.a.g> jbF = new ArrayList();
  private List<com.tencent.mm.plugin.fav.a.g> jbG = new LinkedList();
  public List<Long> jbH = new ArrayList();
  public boolean jbI = false;
  private Map<Long, com.tencent.mm.plugin.fav.a.g> jbJ = new TreeMap();
  private List<Integer> jbK = new ArrayList();
  private List<String> jbL = new LinkedList();
  private List<String> jbM = new LinkedList();
  private SparseArray<com.tencent.mm.plugin.fav.ui.d.a> jbN = new SparseArray();
  private boolean jbO = false;
  public a.c jbP;
  public boolean jbQ = false;
  public boolean jbR = false;
  public ListView jbS;
  public int scene;
  
  public b(com.tencent.mm.plugin.fav.ui.k paramk, boolean paramBoolean)
  {
    this.type = -1;
    this.jbN.put(1, new m(paramk));
    this.jbN.put(2, new d(paramk));
    this.jbN.put(3, new q(paramk));
    this.jbN.put(4, new p(paramk));
    this.jbN.put(5, new o(paramk));
    this.jbN.put(6, new e(paramk));
    this.jbN.put(7, new com.tencent.mm.plugin.fav.ui.d.g(paramk));
    this.jbN.put(8, new com.tencent.mm.plugin.fav.ui.d.c(paramk));
    this.jbN.put(10, new i(paramk));
    this.jbN.put(12, new l(paramk));
    this.jbN.put(15, new l(paramk));
    this.jbN.put(11, new f(paramk));
    this.jbN.put(14, new j(paramk));
    this.jbN.put(16, new com.tencent.mm.plugin.fav.ui.d.k(paramk));
    this.jbN.put(17, new com.tencent.mm.plugin.fav.ui.d.b(paramk));
    this.jbN.put(18, new com.tencent.mm.plugin.fav.ui.d.h(paramk));
    this.jbN.put(-2, new n(paramk));
    if (paramBoolean != this.jbQ)
    {
      this.jbQ = paramBoolean;
      if (paramBoolean) {
        this.jbJ.clear();
      }
    }
    if (!this.jbQ) {
      aMD();
    }
    aME();
    notifyDataSetChanged();
    com.tencent.mm.sdk.b.a.sFg.c(this.fIu);
    com.tencent.mm.sdk.b.a.sFg.b(this.fIu);
  }
  
  private boolean aMF()
  {
    return (!this.jbL.isEmpty()) || (!this.jbM.isEmpty()) || (!this.jbK.isEmpty());
  }
  
  private static List<com.tencent.mm.plugin.fav.a.g> e(List<com.tencent.mm.plugin.fav.a.g> paramList, List<Long> paramList1)
  {
    int k = 0;
    ArrayList localArrayList = new ArrayList();
    if (paramList1 == null) {
      return localArrayList;
    }
    int i = k;
    long l;
    int j;
    if (paramList != null)
    {
      i = k;
      if (paramList.size() > 0)
      {
        localArrayList.addAll(paramList);
        l = ((com.tencent.mm.plugin.fav.a.g)paramList.get(paramList.size() - 1)).field_localId;
        j = 0;
      }
    }
    for (;;)
    {
      i = k;
      if (j < paramList1.size())
      {
        if (Long.valueOf(l).equals(paramList1.get(j))) {
          i = j + 1;
        }
      }
      else
      {
        j = i;
        while ((j < i + 20) && (j < paramList1.size()))
        {
          paramList = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(((Long)paramList1.get(j)).longValue());
          if (paramList != null) {
            localArrayList.add(paramList);
          }
          j += 1;
        }
      }
      j += 1;
    }
    return localArrayList;
  }
  
  private void pP(int paramInt)
  {
    int i = this.iVT;
    if (paramInt == 0) {
      this.iVT = 0;
    }
    do
    {
      return;
      if (i == 0)
      {
        this.iVT = paramInt;
        return;
      }
    } while (i == paramInt);
    this.iVT = 4;
  }
  
  public final void a(boolean paramBoolean, com.tencent.mm.plugin.fav.a.g paramg)
  {
    if (paramBoolean == this.jbI) {
      return;
    }
    this.jbI = paramBoolean;
    if (paramBoolean)
    {
      this.jbJ.clear();
      if (paramg != null)
      {
        paramg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramg.field_localId);
        if (paramg != null) {
          this.jbJ.put(Long.valueOf(paramg.field_localId), paramg);
        }
      }
    }
    notifyDataSetChanged();
  }
  
  public final void aMD()
  {
    if (aMF())
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavoriteAdapter", "searching, do not load more data");
      return;
    }
    if (com.tencent.mm.plugin.fav.a.b.aKY())
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteAdapter", "want to load more data, but now doing batchget");
      return;
    }
    if (!this.jbQ) {
      try
      {
        this.lastUpdateTime = com.tencent.mm.plugin.fav.a.b.o(this.lastUpdateTime, this.type);
        return;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.FavoriteAdapter", localException, "", new Object[0]);
        return;
      }
    }
    this.jbF = e(this.jbE, this.jbH);
    this.jbD = true;
  }
  
  public final void aME()
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavoriteAdapter", "reset data list beg");
    this.jbD = false;
    List localList = this.jbF;
    if (localList != null)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteAdapter", "before do recycle, need recycle list size[%d]", new Object[] { Integer.valueOf(localList.size()) });
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteAdapter", "after do recycle, current can reused list size[%d]", new Object[] { Integer.valueOf(this.jbG.size()) });
      localList.clear();
    }
    if (!aMF())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteAdapter", "on reset data list, last update time is %d, type is %d", new Object[] { Long.valueOf(this.lastUpdateTime), Integer.valueOf(this.type) });
      if (!this.jbQ)
      {
        this.jbF = com.tencent.mm.plugin.fav.a.b.a(this.lastUpdateTime, this.type, this.jbA, this.jbB);
        if ((this.jbF != null) && (this.lastUpdateTime == 0L) && (this.jbF.size() > 0)) {
          this.lastUpdateTime = ((com.tencent.mm.plugin.fav.a.g)this.jbF.get(this.jbF.size() - 1)).field_updateTime;
        }
      }
      for (;;)
      {
        if (this.jbF == null)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteAdapter", "reset data list fail, get null list, new empty one");
          this.jbF = new ArrayList();
        }
        if ((!this.jbQ) && (!aMF()) && (this.jbF.size() < 20) && (!((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().r(this.lastUpdateTime, this.type)))
        {
          com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavoriteAdapter", "least than page count, loadMoreData");
          aMD();
        }
        this.jbD = true;
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavoriteAdapter", "reset data list end");
        return;
        pP(0);
        this.jbH = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().aLH();
        this.jbF = e(null, this.jbH);
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteAdapter", "on reset data list, do search, searchStr:%s, tagStr:%s, searchTypes:%s", new Object[] { this.jbL, this.jbM, this.jbK });
    this.jbF = com.tencent.mm.plugin.fav.a.b.a(this.jbL, this.jbM, this.jbK, this.jbG, this.jbA, this.jbB);
    if (this.jbF == null) {}
    for (int i = 0;; i = this.jbF.size())
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(10649, new Object[] { Integer.valueOf(i) });
      break;
    }
  }
  
  public final int aMG()
  {
    return this.jbJ.size();
  }
  
  public final long aMH()
  {
    Iterator localIterator = this.jbJ.values().iterator();
    long l = 0L;
    if (localIterator.hasNext())
    {
      com.tencent.mm.plugin.fav.a.g localg = (com.tencent.mm.plugin.fav.a.g)localIterator.next();
      if (localg == null) {
        break label55;
      }
      l = localg.field_datatotalsize + l;
    }
    label55:
    for (;;)
    {
      break;
      return l;
    }
  }
  
  public final void b(List<Integer> paramList, List<String> paramList1, List<String> paramList2)
  {
    pP(0);
    this.jbK.clear();
    if (paramList != null)
    {
      this.jbK.addAll(paramList);
      if (!paramList.isEmpty()) {
        pP(2);
      }
    }
    this.jbL.clear();
    if (paramList1 != null)
    {
      this.jbL.addAll(paramList1);
      if (!paramList1.isEmpty()) {
        pP(3);
      }
    }
    this.jbM.clear();
    if (paramList2 != null)
    {
      this.jbM.addAll(paramList2);
      if (!paramList2.isEmpty()) {
        pP(1);
      }
    }
    this.jbO = true;
    aME();
    this.jbO = false;
  }
  
  public final int dD(long paramLong)
  {
    int j = 0;
    int i = 0;
    Object localObject = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramLong);
    if (localObject == null) {
      return -1;
    }
    if (this.jbJ.size() >= 30)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteAdapter", "call select item, match max select count %d", new Object[] { Integer.valueOf(30) });
      com.tencent.mm.ui.base.h.bA(ad.getContext(), ad.getContext().getResources().getString(m.i.favorite_max_selected_tips, new Object[] { Integer.valueOf(30) }));
      return -1;
    }
    this.jbJ.put(Long.valueOf(paramLong), localObject);
    if (((com.tencent.mm.plugin.fav.a.g)localObject).field_updateTime < this.lastUpdateTime)
    {
      this.lastUpdateTime = ((com.tencent.mm.plugin.fav.a.g)localObject).field_updateTime;
      aME();
      localObject = this.jbF.iterator();
      while (((Iterator)localObject).hasNext())
      {
        if (((com.tencent.mm.plugin.fav.a.g)((Iterator)localObject).next()).field_localId == paramLong)
        {
          notifyDataSetChanged();
          return i;
        }
        i += 1;
      }
      notifyDataSetChanged();
    }
    for (;;)
    {
      return -1;
      localObject = this.jbE.iterator();
      i = j;
      while (((Iterator)localObject).hasNext())
      {
        if (((com.tencent.mm.plugin.fav.a.g)((Iterator)localObject).next()).field_localId == paramLong)
        {
          notifyDataSetChanged();
          return i;
        }
        i += 1;
      }
    }
  }
  
  public final List<com.tencent.mm.plugin.fav.a.g> eU(boolean paramBoolean)
  {
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.jbJ.values().iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.fav.a.g localg = (com.tencent.mm.plugin.fav.a.g)localIterator.next();
      if (localg != null) {
        localLinkedList.add(localg);
      }
    }
    if (paramBoolean) {
      this.jbJ.clear();
    }
    return localLinkedList;
  }
  
  public final void finish()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.fIu);
  }
  
  public final int getCount()
  {
    return this.jbE.size() + 1;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    com.tencent.mm.plugin.fav.a.g localg = pQ(paramInt - 1);
    switch (localg.field_type)
    {
    case 9: 
    case 13: 
    default: 
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteAdapter", "get item view type unknown, %d", new Object[] { Integer.valueOf(localg.field_type) });
      return -2;
    }
    return localg.field_type;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramInt == 0)
    {
      paramView = new View(paramViewGroup.getContext());
      paramView.setLayoutParams(new AbsListView.LayoutParams(0, 0));
      paramView.setBackgroundResource(m.b.fav_listitem_divider_bg);
      paramView.setPadding(0, 0, 0, 0);
      paramView.setEnabled(false);
      return paramView;
    }
    com.tencent.mm.plugin.fav.a.g localg = pQ(paramInt - 1);
    com.tencent.mm.plugin.fav.ui.d.a locala = (com.tencent.mm.plugin.fav.ui.d.a)this.jbN.get(localg.field_type);
    if (locala == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteAdapter", "unknown type %d, use unknown item creator", new Object[] { Integer.valueOf(localg.field_type) });
      locala = (com.tencent.mm.plugin.fav.ui.d.a)this.jbN.get(-2);
      aMC();
      return locala.a(paramView, paramViewGroup, localg);
    }
    locala.jem.hoW = aMF();
    locala.jem.lastUpdateTime = this.lastUpdateTime;
    locala.jem.jbI = this.jbI;
    locala.jem.jbJ = this.jbJ;
    locala.jem.jeo = this.jbP;
    locala.jem.jbQ = this.jbQ;
    return locala.a(paramView, paramViewGroup, localg);
  }
  
  public final int getViewTypeCount()
  {
    return this.jbN.size() + 3;
  }
  
  public final boolean isEmpty()
  {
    return this.jbE.isEmpty();
  }
  
  public final void notifyDataSetChanged()
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavoriteAdapter", "on notify data set changed requset, can exchange tempList[%B]", new Object[] { Boolean.valueOf(this.jbD) });
    if (this.jbD)
    {
      if ((this.jbQ) && (this.jbF != null) && (this.jbE != null) && (this.jbF.size() == this.jbE.size())) {
        this.jbR = true;
      }
      List localList = this.jbE;
      this.jbE = this.jbF;
      this.jbF = localList;
      this.jbD = false;
    }
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavoriteAdapter", "on notify data set changed end");
    super.notifyDataSetChanged();
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (a.b)paramView.getTag();
    if (paramAdapterView == null) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteAdapter", "on item click, holder is null");
    }
    com.tencent.mm.plugin.fav.ui.d.a locala;
    do
    {
      return;
      if (paramAdapterView.iWQ == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteAdapter", "on item click, info is null");
        return;
      }
      if ((this.jbI) || (this.jbQ))
      {
        if ((!paramAdapterView.eCo.isChecked()) && (this.jbJ.size() >= 30))
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteAdapter", "call select item, match max select count %d", new Object[] { Integer.valueOf(30) });
          com.tencent.mm.ui.base.h.bA(ad.getContext(), ad.getContext().getResources().getString(m.i.favorite_max_selected_tips, new Object[] { Integer.valueOf(30) }));
          return;
        }
        paramView = paramAdapterView.eCo;
        if (!paramAdapterView.eCo.isChecked()) {}
        for (boolean bool = true;; bool = false)
        {
          paramView.setChecked(bool);
          return;
        }
      }
      locala = (com.tencent.mm.plugin.fav.ui.d.a)this.jbN.get(paramAdapterView.iWQ.field_type);
    } while (locala == null);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = paramAdapterView.iWQ;
    String str = ((com.tencent.mm.plugin.fav.a.g)localObject).field_id + "_" + System.currentTimeMillis() / 1000L;
    localObject = ((com.tencent.mm.plugin.fav.a.g)localObject).field_tagProto.rBX;
    if (!bi.cX((List)localObject))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        localStringBuilder.append((String)((Iterator)localObject).next()).append(";");
      }
    }
    localObject = new wn();
    ((wn)localObject).scene = this.scene;
    ((wn)localObject).iVT = this.iVT;
    if (this.jbS != null) {}
    for (((wn)localObject).index = (paramInt - this.jbS.getHeaderViewsCount());; ((wn)localObject).index = paramInt)
    {
      ((wn)localObject).bWm = this.bWm;
      ((wn)localObject).bJK = str;
      ((wn)localObject).iVW = localStringBuilder.toString();
      locala.a(paramView, (wn)localObject);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteAdapter", "item click type %s", new Object[] { Integer.valueOf(paramAdapterView.iWQ.field_type) });
      return;
    }
  }
  
  public final com.tencent.mm.plugin.fav.a.g pQ(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.jbE.size()))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FavoriteAdapter", "get item, but position error");
      return new com.tencent.mm.plugin.fav.a.g();
    }
    return (com.tencent.mm.plugin.fav.a.g)this.jbE.get(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */