package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.a.a.h;
import android.support.v7.app.b;
import android.support.v7.app.b.a;
import android.support.v7.app.b.a.1;
import android.support.v7.app.b.a.2;
import android.support.v7.app.b.a.3;
import android.support.v7.app.b.a.4;
import android.support.v7.app.b.c;
import android.support.v7.app.c;
import android.support.v7.app.c.a;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public final class e
  implements l, AdapterView.OnItemClickListener
{
  LayoutInflater Bc;
  int HI;
  ExpandedMenuView HX;
  private int HY;
  int HZ;
  a Ia;
  public l.a bp;
  f bq;
  Context mContext;
  private int mId;
  
  private e(int paramInt)
  {
    this.HI = paramInt;
    this.HZ = 0;
  }
  
  public e(Context paramContext, int paramInt)
  {
    this(paramInt);
    this.mContext = paramContext;
    this.Bc = LayoutInflater.from(this.mContext);
  }
  
  public final boolean N()
  {
    return false;
  }
  
  public final void a(Context paramContext, f paramf)
  {
    if (this.HZ != 0)
    {
      this.mContext = new ContextThemeWrapper(paramContext, this.HZ);
      this.Bc = LayoutInflater.from(this.mContext);
    }
    for (;;)
    {
      this.bq = paramf;
      if (this.Ia != null) {
        this.Ia.notifyDataSetChanged();
      }
      return;
      if (this.mContext != null)
      {
        this.mContext = paramContext;
        if (this.Bc == null) {
          this.Bc = LayoutInflater.from(this.mContext);
        }
      }
    }
  }
  
  public final void a(f paramf, boolean paramBoolean)
  {
    if (this.bp != null) {
      this.bp.a(paramf, paramBoolean);
    }
  }
  
  public final boolean a(p paramp)
  {
    if (!paramp.hasVisibleItems()) {
      return false;
    }
    g localg = new g(paramp);
    Object localObject1 = localg.bq;
    c.a locala = new c.a(((f)localObject1).mContext);
    localg.IA = new e(locala.Ec.mContext, a.h.abc_list_menu_item_layout);
    localg.IA.bp = localg;
    localg.bq.a(localg.IA);
    Object localObject2 = localg.IA.getAdapter();
    locala.Ec.Do = ((ListAdapter)localObject2);
    locala.Ec.DM = localg;
    localObject2 = ((f)localObject1).Iq;
    b.a locala1;
    b localb;
    ListView localListView;
    label406:
    label447:
    label479:
    int i;
    if (localObject2 != null)
    {
      locala.Ec.Dn = ((View)localObject2);
      locala.Ec.DK = localg;
      localObject2 = new c(locala.Ec.mContext, locala.np);
      locala1 = locala.Ec;
      localb = c.a((c)localObject2);
      if (locala1.Dn == null) {
        break label777;
      }
      localb.Dn = locala1.Dn;
      if (locala1.CT != null)
      {
        localObject1 = locala1.CT;
        localb.CT = ((CharSequence)localObject1);
        if (localb.gH != null) {
          localb.gH.setText((CharSequence)localObject1);
        }
      }
      if (locala1.DC != null) {
        localb.a(-1, locala1.DC, locala1.DD, null);
      }
      if (locala1.DE != null) {
        localb.a(-2, locala1.DE, locala1.DF, null);
      }
      if (locala1.DG != null) {
        localb.a(-3, locala1.DG, locala1.DH, null);
      }
      if ((locala1.DL != null) || (locala1.yV != null) || (locala1.Do != null))
      {
        localListView = (ListView)locala1.Bc.inflate(localb.Ds, null);
        if (!locala1.DO) {
          break label966;
        }
        if (locala1.yV != null) {
          break label938;
        }
        localObject1 = new b.a.1(locala1, locala1.mContext, localb.Dt, locala1.DL, localListView);
        localb.Do = ((ListAdapter)localObject1);
        localb.Dp = locala1.Dp;
        if (locala1.DM == null) {
          break label1082;
        }
        localListView.setOnItemClickListener(new b.a.3(locala1, localb));
        if (locala1.DT != null) {
          localListView.setOnItemSelectedListener(locala1.DT);
        }
        if (!locala1.DP) {
          break label1111;
        }
        localListView.setChoiceMode(1);
        localb.CU = localListView;
      }
      if (locala1.mView == null) {
        break label1153;
      }
      if (!locala1.Da) {
        break label1128;
      }
      localObject1 = locala1.mView;
      i = locala1.CW;
      int j = locala1.CX;
      int k = locala1.CY;
      int m = locala1.CZ;
      localb.mView = ((View)localObject1);
      localb.CV = 0;
      localb.Da = true;
      localb.CW = i;
      localb.CX = j;
      localb.CY = k;
      localb.CZ = m;
    }
    for (;;)
    {
      ((c)localObject2).setCancelable(locala.Ec.nq);
      if (locala.Ec.nq) {
        ((c)localObject2).setCanceledOnTouchOutside(true);
      }
      ((c)localObject2).setOnCancelListener(locala.Ec.DI);
      ((c)localObject2).setOnDismissListener(locala.Ec.DJ);
      if (locala.Ec.DK != null) {
        ((c)localObject2).setOnKeyListener(locala.Ec.DK);
      }
      localg.Iz = ((c)localObject2);
      localg.Iz.setOnDismissListener(localg);
      localObject1 = localg.Iz.getWindow().getAttributes();
      ((WindowManager.LayoutParams)localObject1).type = 1003;
      ((WindowManager.LayoutParams)localObject1).flags |= 0x20000;
      localg.Iz.show();
      if (this.bp != null) {
        this.bp.d(paramp);
      }
      return true;
      localObject2 = ((f)localObject1).Ip;
      locala.Ec.hh = ((Drawable)localObject2);
      localObject1 = ((f)localObject1).Io;
      locala.Ec.sn = ((CharSequence)localObject1);
      break;
      label777:
      if (locala1.sn != null) {
        localb.setTitle(locala1.sn);
      }
      if (locala1.hh != null)
      {
        localObject1 = locala1.hh;
        localb.hh = ((Drawable)localObject1);
        localb.Dl = 0;
        if (localb.ii != null)
        {
          if (localObject1 == null) {
            break label925;
          }
          localb.ii.setVisibility(0);
          localb.ii.setImageDrawable((Drawable)localObject1);
        }
      }
      for (;;)
      {
        if (locala1.Dl != 0) {
          localb.setIcon(locala1.Dl);
        }
        if (locala1.DB == 0) {
          break;
        }
        i = locala1.DB;
        localObject1 = new TypedValue();
        localb.mContext.getTheme().resolveAttribute(i, (TypedValue)localObject1, true);
        localb.setIcon(((TypedValue)localObject1).resourceId);
        break;
        label925:
        localb.ii.setVisibility(8);
      }
      label938:
      localObject1 = new b.a.2(locala1, locala1.mContext, locala1.yV, localListView, localb);
      break label406;
      label966:
      if (locala1.DP) {}
      for (i = localb.Du;; i = localb.Dv)
      {
        if (locala1.yV == null) {
          break label1041;
        }
        localObject1 = new SimpleCursorAdapter(locala1.mContext, i, locala1.yV, new String[] { locala1.DR }, new int[] { 16908308 });
        break;
      }
      label1041:
      if (locala1.Do != null)
      {
        localObject1 = locala1.Do;
        break label406;
      }
      localObject1 = new b.c(locala1.mContext, i, locala1.DL);
      break label406;
      label1082:
      if (locala1.DQ == null) {
        break label447;
      }
      localListView.setOnItemClickListener(new b.a.4(locala1, localListView, localb));
      break label447;
      label1111:
      if (!locala1.DO) {
        break label479;
      }
      localListView.setChoiceMode(2);
      break label479;
      label1128:
      localb.mView = locala1.mView;
      localb.CV = 0;
      localb.Da = false;
      continue;
      label1153:
      if (locala1.CV != 0)
      {
        i = locala1.CV;
        localb.mView = null;
        localb.CV = i;
        localb.Da = false;
      }
    }
  }
  
  public final boolean b(h paramh)
  {
    return false;
  }
  
  public final boolean c(h paramh)
  {
    return false;
  }
  
  public final m e(ViewGroup paramViewGroup)
  {
    if (this.HX == null)
    {
      this.HX = ((ExpandedMenuView)this.Bc.inflate(a.h.abc_expanded_menu_layout, paramViewGroup, false));
      if (this.Ia == null) {
        this.Ia = new a();
      }
      this.HX.setAdapter(this.Ia);
      this.HX.setOnItemClickListener(this);
    }
    return this.HX;
  }
  
  public final ListAdapter getAdapter()
  {
    if (this.Ia == null) {
      this.Ia = new a();
    }
    return this.Ia;
  }
  
  public final int getId()
  {
    return this.mId;
  }
  
  public final void n(boolean paramBoolean)
  {
    if (this.Ia != null) {
      this.Ia.notifyDataSetChanged();
    }
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.bq.a(this.Ia.aI(paramInt), this, 0);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = ((Bundle)paramParcelable).getSparseParcelableArray("android:menu:list");
    if (paramParcelable != null) {
      this.HX.restoreHierarchyState(paramParcelable);
    }
  }
  
  public final Parcelable onSaveInstanceState()
  {
    if (this.HX == null) {
      return null;
    }
    Bundle localBundle = new Bundle();
    SparseArray localSparseArray = new SparseArray();
    if (this.HX != null) {
      this.HX.saveHierarchyState(localSparseArray);
    }
    localBundle.putSparseParcelableArray("android:menu:list", localSparseArray);
    return localBundle;
  }
  
  private final class a
    extends BaseAdapter
  {
    private int Ib = -1;
    
    public a()
    {
      dF();
    }
    
    private void dF()
    {
      h localh = e.this.bq.Ix;
      if (localh != null)
      {
        ArrayList localArrayList = e.this.bq.dP();
        int j = localArrayList.size();
        int i = 0;
        while (i < j)
        {
          if ((h)localArrayList.get(i) == localh)
          {
            this.Ib = i;
            return;
          }
          i += 1;
        }
      }
      this.Ib = -1;
    }
    
    public final h aI(int paramInt)
    {
      ArrayList localArrayList = e.this.bq.dP();
      int i = e.a(e.this) + paramInt;
      paramInt = i;
      if (this.Ib >= 0)
      {
        paramInt = i;
        if (i >= this.Ib) {
          paramInt = i + 1;
        }
      }
      return (h)localArrayList.get(paramInt);
    }
    
    public final int getCount()
    {
      int i = e.this.bq.dP().size() - e.a(e.this);
      if (this.Ib < 0) {
        return i;
      }
      return i - 1;
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null) {
        paramView = e.this.Bc.inflate(e.this.HI, paramViewGroup, false);
      }
      for (;;)
      {
        ((m.a)paramView).a(aI(paramInt));
        return paramView;
      }
    }
    
    public final void notifyDataSetChanged()
    {
      dF();
      super.notifyDataSetChanged();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */