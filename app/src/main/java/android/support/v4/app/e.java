package android.support.v4.app;

import android.os.Build.VERSION;
import android.support.v4.e.a;
import android.support.v4.e.d;
import android.support.v4.e.g;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

final class e
  extends q
  implements Runnable
{
  static final boolean mw;
  int mA;
  int mB;
  int mC;
  int mD;
  int mE;
  int mF;
  int mG;
  boolean mH;
  boolean mI = true;
  int mIndex = -1;
  boolean mJ;
  int mK;
  CharSequence mL;
  int mM;
  CharSequence mN;
  String mName;
  ArrayList<String> mO;
  ArrayList<String> mP;
  final n mx;
  a my;
  a mz;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (boolean bool = true;; bool = false)
    {
      mw = bool;
      return;
    }
  }
  
  public e(n paramn)
  {
    this.mx = paramn;
  }
  
  private b a(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2, boolean paramBoolean)
  {
    int n = 0;
    b localb = new b();
    localb.nm = new View(this.mx.mHost.mContext);
    int j = 0;
    int i = 0;
    int k = n;
    int m = i;
    if (j < paramSparseArray1.size())
    {
      if (!a(paramSparseArray1.keyAt(j), localb, paramBoolean, paramSparseArray1, paramSparseArray2)) {
        break label164;
      }
      i = 1;
    }
    label164:
    for (;;)
    {
      j += 1;
      break;
      while (k < paramSparseArray2.size())
      {
        j = paramSparseArray2.keyAt(k);
        i = m;
        if (paramSparseArray1.get(j) == null)
        {
          i = m;
          if (a(j, localb, paramBoolean, paramSparseArray1, paramSparseArray2)) {
            i = 1;
          }
        }
        k += 1;
        m = i;
      }
      paramSparseArray1 = localb;
      if (m == 0) {
        paramSparseArray1 = null;
      }
      return paramSparseArray1;
    }
  }
  
  private a<String, View> a(b paramb, Fragment paramFragment, boolean paramBoolean)
  {
    a locala2 = new a();
    a locala1 = locala2;
    if (this.mO != null)
    {
      r.a(locala2, paramFragment.getView());
      if (!paramBoolean) {
        break label74;
      }
      g.a(locala2, this.mP);
    }
    label74:
    for (locala1 = locala2; paramBoolean; locala1 = a(this.mO, this.mP, locala2))
    {
      if (paramFragment.mEnterTransitionCallback != null) {
        paramFragment = paramFragment.mEnterTransitionCallback;
      }
      a(paramb, locala1, false);
      return locala1;
    }
    if (paramFragment.mExitTransitionCallback != null) {
      paramFragment = paramFragment.mExitTransitionCallback;
    }
    b(paramb, locala1, false);
    return locala1;
  }
  
  private static a<String, View> a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, a<String, View> parama)
  {
    if (parama.isEmpty()) {
      return parama;
    }
    a locala = new a();
    int j = paramArrayList1.size();
    int i = 0;
    while (i < j)
    {
      View localView = (View)parama.get(paramArrayList1.get(i));
      if (localView != null) {
        locala.put(paramArrayList2.get(i), localView);
      }
      i += 1;
    }
    return locala;
  }
  
  private static Object a(Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList, a<String, View> parama, View paramView)
  {
    Object localObject = paramObject;
    if (paramObject != null)
    {
      paramFragment = paramFragment.getView();
      localObject = paramObject;
      if (paramObject != null)
      {
        r.a(paramArrayList, paramFragment);
        if (parama != null) {
          paramArrayList.removeAll(parama.values());
        }
        if (!paramArrayList.isEmpty()) {
          break label52;
        }
        localObject = null;
      }
    }
    return localObject;
    label52:
    paramArrayList.add(paramView);
    r.b((Transition)paramObject, paramArrayList);
    return paramObject;
  }
  
  private void a(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    paramFragment.mFragmentManager = this.mx;
    if (paramString != null)
    {
      if ((paramFragment.mTag != null) && (!paramString.equals(paramFragment.mTag))) {
        throw new IllegalStateException("Can't change tag of fragment " + paramFragment + ": was " + paramFragment.mTag + " now " + paramString);
      }
      paramFragment.mTag = paramString;
    }
    if (paramInt1 != 0)
    {
      if ((paramFragment.mFragmentId != 0) && (paramFragment.mFragmentId != paramInt1)) {
        throw new IllegalStateException("Can't change container ID of fragment " + paramFragment + ": was " + paramFragment.mFragmentId + " now " + paramInt1);
      }
      paramFragment.mFragmentId = paramInt1;
      paramFragment.mContainerId = paramInt1;
    }
    paramString = new a();
    paramString.nc = paramInt2;
    paramString.nd = paramFragment;
    a(paramString);
  }
  
  private void a(b paramb, int paramInt, Object paramObject)
  {
    if (this.mx.nL != null)
    {
      int i = 0;
      if (i < this.mx.nL.size())
      {
        Fragment localFragment = (Fragment)this.mx.nL.get(i);
        if ((localFragment.mView != null) && (localFragment.mContainer != null) && (localFragment.mContainerId == paramInt))
        {
          if (!localFragment.mHidden) {
            break label125;
          }
          if (!paramb.nk.contains(localFragment.mView))
          {
            r.a(paramObject, localFragment.mView, true);
            paramb.nk.add(localFragment.mView);
          }
        }
        for (;;)
        {
          i += 1;
          break;
          label125:
          r.a(paramObject, localFragment.mView, false);
          paramb.nk.remove(localFragment.mView);
        }
      }
    }
  }
  
  private void a(b paramb, a<String, View> parama, boolean paramBoolean)
  {
    int i;
    int j;
    label13:
    String str;
    Object localObject;
    if (this.mP == null)
    {
      i = 0;
      j = 0;
      if (j >= i) {
        return;
      }
      str = (String)this.mO.get(j);
      localObject = (View)parama.get((String)this.mP.get(j));
      if (localObject != null)
      {
        localObject = ((View)localObject).getTransitionName();
        if (!paramBoolean) {
          break label103;
        }
        a(paramb.nj, str, (String)localObject);
      }
    }
    for (;;)
    {
      j += 1;
      break label13;
      i = this.mP.size();
      break;
      label103:
      a(paramb.nj, (String)localObject, str);
    }
  }
  
  private static void a(b paramb, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    if (paramArrayList1 != null)
    {
      int i = 0;
      while (i < paramArrayList1.size())
      {
        String str1 = (String)paramArrayList1.get(i);
        String str2 = (String)paramArrayList2.get(i);
        a(paramb.nj, str1, str2);
        i += 1;
      }
    }
  }
  
  private static void a(a<String, String> parama, String paramString1, String paramString2)
  {
    int i;
    if ((paramString1 != null) && (paramString2 != null)) {
      i = 0;
    }
    while (i < parama.size())
    {
      if (paramString1.equals(parama.valueAt(i)))
      {
        parama.setValueAt(i, paramString2);
        return;
      }
      i += 1;
    }
    parama.put(paramString1, paramString2);
  }
  
  private void a(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (!this.mx.nT.onHasView()) {}
    a locala;
    do
    {
      return;
      locala = this.my;
    } while (locala == null);
    switch (locala.nc)
    {
    }
    for (;;)
    {
      locala = locala.na;
      break;
      b(paramSparseArray1, paramSparseArray2, locala.nd);
      continue;
      Object localObject1 = locala.nd;
      if (this.mx.nL != null)
      {
        int i = 0;
        if (i < this.mx.nL.size())
        {
          Fragment localFragment = (Fragment)this.mx.nL.get(i);
          Object localObject2;
          if (localObject1 != null)
          {
            localObject2 = localObject1;
            if (localFragment.mContainerId != ((Fragment)localObject1).mContainerId) {}
          }
          else
          {
            if (localFragment != localObject1) {
              break label197;
            }
            localObject2 = null;
            paramSparseArray2.remove(localFragment.mContainerId);
          }
          for (;;)
          {
            i += 1;
            localObject1 = localObject2;
            break;
            label197:
            a(paramSparseArray1, paramSparseArray2, localFragment);
            localObject2 = localObject1;
          }
        }
      }
      b(paramSparseArray1, paramSparseArray2, locala.nd);
      continue;
      a(paramSparseArray1, paramSparseArray2, locala.nd);
      continue;
      a(paramSparseArray1, paramSparseArray2, locala.nd);
      continue;
      b(paramSparseArray1, paramSparseArray2, locala.nd);
      continue;
      a(paramSparseArray1, paramSparseArray2, locala.nd);
      continue;
      b(paramSparseArray1, paramSparseArray2, locala.nd);
    }
  }
  
  private static void a(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2, Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      int i = paramFragment.mContainerId;
      if ((i != 0) && (!paramFragment.isHidden()))
      {
        if ((paramFragment.isAdded()) && (paramFragment.getView() != null) && (paramSparseArray1.get(i) == null)) {
          paramSparseArray1.put(i, paramFragment);
        }
        if (paramSparseArray2.get(i) == paramFragment) {
          paramSparseArray2.remove(i);
        }
      }
    }
  }
  
  private boolean a(final int paramInt, final b paramb, final boolean paramBoolean, final SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    final ViewGroup localViewGroup = (ViewGroup)this.mx.nT.onFindViewById(paramInt);
    if (localViewGroup == null) {
      return false;
    }
    final Object localObject4 = (Fragment)paramSparseArray2.get(paramInt);
    final Object localObject5 = (Fragment)paramSparseArray1.get(paramInt);
    Object localObject2;
    label66:
    Object localObject3;
    final ArrayList localArrayList1;
    Object localObject1;
    if (localObject4 == null)
    {
      localObject2 = null;
      if ((localObject4 != null) && (localObject5 != null)) {
        break label160;
      }
      paramSparseArray1 = null;
      if (localObject5 != null) {
        break label230;
      }
      localObject3 = null;
      localArrayList1 = new ArrayList();
      if (paramSparseArray1 == null) {
        break label941;
      }
      localObject1 = a(paramb, (Fragment)localObject5, paramBoolean);
      if (!((a)localObject1).isEmpty()) {
        break label261;
      }
      localObject1 = null;
      paramSparseArray2 = null;
    }
    for (;;)
    {
      if ((localObject2 == null) && (paramSparseArray2 == null) && (localObject3 == null))
      {
        return false;
        if (paramBoolean) {}
        for (paramSparseArray1 = ((Fragment)localObject4).getReenterTransition();; paramSparseArray1 = ((Fragment)localObject4).getEnterTransition())
        {
          localObject2 = r.f(paramSparseArray1);
          break;
        }
        label160:
        if (paramBoolean) {}
        for (paramSparseArray1 = ((Fragment)localObject5).getSharedElementReturnTransition();; paramSparseArray1 = ((Fragment)localObject4).getSharedElementEnterTransition())
        {
          if (paramSparseArray1 != null) {
            break label192;
          }
          paramSparseArray1 = null;
          break;
        }
        label192:
        paramSparseArray2 = (Transition)paramSparseArray1;
        if (paramSparseArray2 == null)
        {
          paramSparseArray1 = null;
          break label66;
        }
        paramSparseArray1 = new TransitionSet();
        paramSparseArray1.addTransition(paramSparseArray2);
        break label66;
        label230:
        if (paramBoolean) {}
        for (paramSparseArray2 = ((Fragment)localObject5).getReturnTransition();; paramSparseArray2 = ((Fragment)localObject5).getExitTransition())
        {
          localObject3 = r.f(paramSparseArray2);
          break;
        }
        label261:
        if (paramBoolean) {}
        for (paramSparseArray2 = ((Fragment)localObject5).mEnterTransitionCallback;; paramSparseArray2 = ((Fragment)localObject4).mEnterTransitionCallback)
        {
          if (paramSparseArray2 != null)
          {
            new ArrayList(((a)localObject1).keySet());
            new ArrayList(((a)localObject1).values());
          }
          localViewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              localViewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
              if (paramSparseArray1 != null)
              {
                r.a(paramSparseArray1, localArrayList1);
                localArrayList1.clear();
                a locala = e.a(e.this, paramb, paramBoolean, localObject4);
                r.a(paramSparseArray1, paramb.nm, locala, localArrayList1);
                e.a(e.this, locala, paramb);
                e.a(localObject4, localObject5, paramBoolean, locala);
              }
              return true;
            }
          });
          paramSparseArray2 = paramSparseArray1;
          break;
        }
      }
      ArrayList localArrayList2 = new ArrayList();
      Object localObject6 = a(localObject3, (Fragment)localObject5, localArrayList2, (a)localObject1, paramb.nm);
      if ((this.mP != null) && (localObject1 != null))
      {
        paramSparseArray1 = (View)((a)localObject1).get(this.mP.get(0));
        if (paramSparseArray1 != null)
        {
          if (localObject6 != null) {
            r.a(localObject6, paramSparseArray1);
          }
          if (paramSparseArray2 != null) {
            r.a(paramSparseArray2, paramSparseArray1);
          }
        }
      }
      r.b local1 = new r.b()
      {
        public final View getView()
        {
          return localObject4.getView();
        }
      };
      localObject5 = new ArrayList();
      a locala = new a();
      if (localObject4 != null) {
        if (paramBoolean) {
          paramBoolean = ((Fragment)localObject4).getAllowReturnTransitionOverlap();
        }
      }
      for (;;)
      {
        localObject3 = (Transition)localObject2;
        paramSparseArray1 = (Transition)localObject6;
        Object localObject7 = (Transition)paramSparseArray2;
        if ((localObject3 != null) && (paramSparseArray1 != null)) {}
        for (;;)
        {
          if (paramBoolean)
          {
            localObject4 = new TransitionSet();
            if (localObject3 != null) {
              ((TransitionSet)localObject4).addTransition((Transition)localObject3);
            }
            if (paramSparseArray1 != null) {
              ((TransitionSet)localObject4).addTransition(paramSparseArray1);
            }
            if (localObject7 != null) {
              ((TransitionSet)localObject4).addTransition((Transition)localObject7);
            }
            paramSparseArray1 = (SparseArray<Fragment>)localObject4;
          }
          label926:
          for (;;)
          {
            if (paramSparseArray1 != null)
            {
              localObject3 = paramb.nm;
              localObject4 = paramb.nl;
              localObject7 = paramb.nj;
              if ((localObject2 != null) || (paramSparseArray2 != null))
              {
                Transition localTransition = (Transition)localObject2;
                if (localTransition != null) {
                  localTransition.addTarget((View)localObject3);
                }
                if (paramSparseArray2 != null) {
                  r.a(paramSparseArray2, (View)localObject3, (Map)localObject1, localArrayList1);
                }
                localViewGroup.getViewTreeObserver().addOnPreDrawListener(new r.2(localViewGroup, localTransition, (View)localObject3, local1, (Map)localObject7, locala, (ArrayList)localObject5));
                if (localTransition != null) {
                  localTransition.setEpicenterCallback(new r.3((r.a)localObject4));
                }
              }
              localViewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
              {
                public final boolean onPreDraw()
                {
                  localViewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
                  e.a(e.this, paramb, paramInt, paramSparseArray1);
                  return true;
                }
              });
              r.a(paramSparseArray1, paramb.nm, true);
              a(paramb, paramInt, paramSparseArray1);
              TransitionManager.beginDelayedTransition(localViewGroup, (Transition)paramSparseArray1);
              localObject1 = paramb.nm;
              paramb = paramb.nk;
              localObject2 = (Transition)localObject2;
              localObject3 = (Transition)localObject6;
              paramSparseArray2 = (Transition)paramSparseArray2;
              localObject4 = (Transition)paramSparseArray1;
              if (localObject4 != null) {
                localViewGroup.getViewTreeObserver().addOnPreDrawListener(new r.4(localViewGroup, (Transition)localObject2, (ArrayList)localObject5, (Transition)localObject3, localArrayList2, paramSparseArray2, localArrayList1, locala, paramb, (Transition)localObject4, (View)localObject1));
              }
            }
            if (paramSparseArray1 == null) {
              break label929;
            }
            return true;
            paramBoolean = ((Fragment)localObject4).getAllowEnterTransitionOverlap();
            break;
            if ((paramSparseArray1 != null) && (localObject3 != null)) {
              paramSparseArray1 = new TransitionSet().addTransition(paramSparseArray1).addTransition((Transition)localObject3).setOrdering(1);
            }
            for (;;)
            {
              if (localObject7 == null) {
                break label926;
              }
              localObject3 = new TransitionSet();
              if (paramSparseArray1 != null) {
                ((TransitionSet)localObject3).addTransition(paramSparseArray1);
              }
              ((TransitionSet)localObject3).addTransition((Transition)localObject7);
              paramSparseArray1 = (SparseArray<Fragment>)localObject3;
              break;
              if (paramSparseArray1 == null)
              {
                paramSparseArray1 = (SparseArray<Fragment>)localObject3;
                if (localObject3 == null) {
                  paramSparseArray1 = null;
                }
              }
            }
          }
          label929:
          return false;
          paramBoolean = true;
        }
        paramBoolean = true;
      }
      label941:
      localObject1 = null;
      paramSparseArray2 = paramSparseArray1;
    }
  }
  
  private static void b(b paramb, a<String, View> parama, boolean paramBoolean)
  {
    int j = parama.size();
    int i = 0;
    if (i < j)
    {
      String str1 = (String)parama.keyAt(i);
      String str2 = ((View)parama.valueAt(i)).getTransitionName();
      if (paramBoolean) {
        a(paramb.nj, str1, str2);
      }
      for (;;)
      {
        i += 1;
        break;
        a(paramb.nj, str2, str1);
      }
    }
  }
  
  private void b(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2, Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      int i = paramFragment.mContainerId;
      if (i != 0)
      {
        if (!paramFragment.isAdded()) {
          paramSparseArray2.put(i, paramFragment);
        }
        if (paramSparseArray1.get(i) == paramFragment) {
          paramSparseArray1.remove(i);
        }
      }
      if ((paramFragment.mState <= 0) && (this.mx.nS > 0))
      {
        this.mx.h(paramFragment);
        this.mx.a(paramFragment, 1, 0, 0, false);
      }
    }
  }
  
  private int t(boolean paramBoolean)
  {
    if (this.mJ) {
      throw new IllegalStateException("commit already called");
    }
    if (n.DEBUG)
    {
      new StringBuilder("Commit: ").append(this);
      a("  ", new PrintWriter(new d("FragmentManager")));
    }
    this.mJ = true;
    if (this.mH) {}
    for (this.mIndex = this.mx.a(this);; this.mIndex = -1)
    {
      this.mx.a(this, paramBoolean);
      return this.mIndex;
    }
  }
  
  public final q G(String paramString)
  {
    if (!this.mI) {
      throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }
    this.mH = true;
    this.mName = paramString;
    return this;
  }
  
  final void Q(int paramInt)
  {
    if (!this.mH) {}
    for (;;)
    {
      return;
      if (n.DEBUG) {
        new StringBuilder("Bump nesting in ").append(this).append(" by ").append(paramInt);
      }
      for (a locala = this.my; locala != null; locala = locala.na)
      {
        Fragment localFragment;
        if (locala.nd != null)
        {
          localFragment = locala.nd;
          localFragment.mBackStackNesting += paramInt;
          if (n.DEBUG) {
            new StringBuilder("Bump nesting of ").append(locala.nd).append(" to ").append(locala.nd.mBackStackNesting);
          }
        }
        if (locala.ni != null)
        {
          int i = locala.ni.size() - 1;
          while (i >= 0)
          {
            localFragment = (Fragment)locala.ni.get(i);
            localFragment.mBackStackNesting += paramInt;
            if (n.DEBUG) {
              new StringBuilder("Bump nesting of ").append(localFragment).append(" to ").append(localFragment.mBackStackNesting);
            }
            i -= 1;
          }
        }
      }
    }
  }
  
  public final b a(boolean paramBoolean, b paramb, SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (n.DEBUG)
    {
      new StringBuilder("popFromBackStack: ").append(this);
      a("  ", new PrintWriter(new d("FragmentManager")));
    }
    b localb = paramb;
    if (mw)
    {
      localb = paramb;
      if (this.mx.nS > 0)
      {
        if (paramb != null) {
          break label220;
        }
        if (paramSparseArray1.size() == 0)
        {
          localb = paramb;
          if (paramSparseArray2.size() == 0) {}
        }
        else
        {
          localb = a(paramSparseArray1, paramSparseArray2, true);
        }
      }
    }
    label99:
    Q(-1);
    int i;
    label112:
    int j;
    label120:
    int k;
    if (localb != null)
    {
      i = 0;
      if (localb == null) {
        break label254;
      }
      j = 0;
      paramb = this.mz;
      if (paramb == null) {
        break label543;
      }
      if (localb == null) {
        break label263;
      }
      k = 0;
      label137:
      if (localb == null) {
        break label272;
      }
    }
    label220:
    label254:
    label263:
    label272:
    for (int m = 0;; m = paramb.nh) {
      switch (paramb.nc)
      {
      default: 
        throw new IllegalArgumentException("Unknown cmd: " + paramb.nc);
        localb = paramb;
        if (paramBoolean) {
          break label99;
        }
        a(paramb, this.mP, this.mO);
        localb = paramb;
        break label99;
        i = this.mG;
        break label112;
        j = this.mF;
        break label120;
        k = paramb.ng;
        break label137;
      }
    }
    paramSparseArray1 = paramb.nd;
    paramSparseArray1.mNextAnim = m;
    this.mx.a(paramSparseArray1, n.U(j), i);
    for (;;)
    {
      paramb = paramb.nb;
      break;
      paramSparseArray1 = paramb.nd;
      if (paramSparseArray1 != null)
      {
        paramSparseArray1.mNextAnim = m;
        this.mx.a(paramSparseArray1, n.U(j), i);
      }
      if (paramb.ni != null)
      {
        m = 0;
        while (m < paramb.ni.size())
        {
          paramSparseArray1 = (Fragment)paramb.ni.get(m);
          paramSparseArray1.mNextAnim = k;
          this.mx.a(paramSparseArray1, false);
          m += 1;
        }
        paramSparseArray1 = paramb.nd;
        paramSparseArray1.mNextAnim = k;
        this.mx.a(paramSparseArray1, false);
        continue;
        paramSparseArray1 = paramb.nd;
        paramSparseArray1.mNextAnim = k;
        this.mx.c(paramSparseArray1, n.U(j), i);
        continue;
        paramSparseArray1 = paramb.nd;
        paramSparseArray1.mNextAnim = m;
        this.mx.b(paramSparseArray1, n.U(j), i);
        continue;
        paramSparseArray1 = paramb.nd;
        paramSparseArray1.mNextAnim = k;
        this.mx.e(paramSparseArray1, n.U(j), i);
        continue;
        paramSparseArray1 = paramb.nd;
        paramSparseArray1.mNextAnim = k;
        this.mx.d(paramSparseArray1, n.U(j), i);
      }
    }
    label543:
    if (paramBoolean)
    {
      this.mx.a(this.mx.nS, n.U(j), i, true);
      localb = null;
    }
    if (this.mIndex >= 0)
    {
      paramb = this.mx;
      i = this.mIndex;
    }
    try
    {
      paramb.nP.set(i, null);
      if (paramb.nQ == null) {
        paramb.nQ = new ArrayList();
      }
      paramBoolean = n.DEBUG;
      paramb.nQ.add(Integer.valueOf(i));
      this.mIndex = -1;
      return localb;
    }
    finally {}
  }
  
  public final q a(int paramInt, Fragment paramFragment)
  {
    a(paramInt, paramFragment, null, 1);
    return this;
  }
  
  public final q a(int paramInt, Fragment paramFragment, String paramString)
  {
    a(paramInt, paramFragment, paramString, 1);
    return this;
  }
  
  public final q a(Fragment paramFragment)
  {
    a locala = new a();
    locala.nc = 3;
    locala.nd = paramFragment;
    a(locala);
    return this;
  }
  
  public final q a(Fragment paramFragment, String paramString)
  {
    a(0, paramFragment, paramString, 1);
    return this;
  }
  
  final void a(a parama)
  {
    if (this.my == null)
    {
      this.mz = parama;
      this.my = parama;
    }
    for (;;)
    {
      parama.ne = this.mB;
      parama.nf = this.mC;
      parama.ng = this.mD;
      parama.nh = this.mE;
      this.mA += 1;
      return;
      parama.nb = this.mz;
      this.mz.na = parama;
      this.mz = parama;
    }
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    a(paramString, paramPrintWriter, true);
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.mName);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.mIndex);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.mJ);
      if (this.mF != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.mF));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(this.mG));
      }
      if ((this.mB != 0) || (this.mC != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.mB));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.mC));
      }
      if ((this.mD != 0) || (this.mE != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.mD));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.mE));
      }
      if ((this.mK != 0) || (this.mL != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.mK));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.mL);
      }
      if ((this.mM != 0) || (this.mN != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.mM));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.mN);
      }
    }
    if (this.my != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      String str2 = paramString + "    ";
      a locala = this.my;
      int i = 0;
      while (locala != null)
      {
        String str1;
        int j;
        switch (locala.nc)
        {
        default: 
          str1 = "cmd=" + locala.nc;
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str1);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(locala.nd);
          if (paramBoolean)
          {
            if ((locala.ne != 0) || (locala.nf != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("enterAnim=#");
              paramPrintWriter.print(Integer.toHexString(locala.ne));
              paramPrintWriter.print(" exitAnim=#");
              paramPrintWriter.println(Integer.toHexString(locala.nf));
            }
            if ((locala.ng != 0) || (locala.nh != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("popEnterAnim=#");
              paramPrintWriter.print(Integer.toHexString(locala.ng));
              paramPrintWriter.print(" popExitAnim=#");
              paramPrintWriter.println(Integer.toHexString(locala.nh));
            }
          }
          if ((locala.ni == null) || (locala.ni.size() <= 0)) {
            break label804;
          }
          j = 0;
          label638:
          if (j >= locala.ni.size()) {
            break label804;
          }
          paramPrintWriter.print(str2);
          if (locala.ni.size() == 1) {
            paramPrintWriter.print("Removed: ");
          }
          break;
        }
        for (;;)
        {
          paramPrintWriter.println(locala.ni.get(j));
          j += 1;
          break label638;
          str1 = "NULL";
          break;
          str1 = "ADD";
          break;
          str1 = "REPLACE";
          break;
          str1 = "REMOVE";
          break;
          str1 = "HIDE";
          break;
          str1 = "SHOW";
          break;
          str1 = "DETACH";
          break;
          str1 = "ATTACH";
          break;
          if (j == 0) {
            paramPrintWriter.println("Removed:");
          }
          paramPrintWriter.print(str2);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(j);
          paramPrintWriter.print(": ");
        }
        label804:
        locala = locala.na;
        i += 1;
      }
    }
  }
  
  public final q b(int paramInt, Fragment paramFragment)
  {
    if (paramInt == 0) {
      throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
    a(paramInt, paramFragment, null, 2);
    return this;
  }
  
  public final q b(Fragment paramFragment)
  {
    a locala = new a();
    locala.nc = 5;
    locala.nd = paramFragment;
    a(locala);
    return this;
  }
  
  public final void b(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (!this.mx.nT.onHasView()) {}
    a locala;
    do
    {
      return;
      locala = this.mz;
    } while (locala == null);
    switch (locala.nc)
    {
    }
    for (;;)
    {
      locala = locala.nb;
      break;
      a(paramSparseArray1, paramSparseArray2, locala.nd);
      continue;
      if (locala.ni != null)
      {
        int i = locala.ni.size() - 1;
        while (i >= 0)
        {
          b(paramSparseArray1, paramSparseArray2, (Fragment)locala.ni.get(i));
          i -= 1;
        }
      }
      a(paramSparseArray1, paramSparseArray2, locala.nd);
      continue;
      b(paramSparseArray1, paramSparseArray2, locala.nd);
      continue;
      b(paramSparseArray1, paramSparseArray2, locala.nd);
      continue;
      a(paramSparseArray1, paramSparseArray2, locala.nd);
      continue;
      b(paramSparseArray1, paramSparseArray2, locala.nd);
      continue;
      a(paramSparseArray1, paramSparseArray2, locala.nd);
    }
  }
  
  public final q c(Fragment paramFragment)
  {
    a locala = new a();
    locala.nc = 6;
    locala.nd = paramFragment;
    a(locala);
    return this;
  }
  
  public final int commit()
  {
    return t(false);
  }
  
  public final int commitAllowingStateLoss()
  {
    return t(true);
  }
  
  public final q d(Fragment paramFragment)
  {
    a locala = new a();
    locala.nc = 7;
    locala.nd = paramFragment;
    a(locala);
    return this;
  }
  
  public final q l(int paramInt1, int paramInt2)
  {
    this.mB = paramInt1;
    this.mC = paramInt2;
    this.mD = 0;
    this.mE = 0;
    return this;
  }
  
  public final void run()
  {
    if (n.DEBUG) {
      new StringBuilder("Run: ").append(this);
    }
    if ((this.mH) && (this.mIndex < 0)) {
      throw new IllegalStateException("addToBackStack() called after commit()");
    }
    Q(1);
    Object localObject1;
    if ((mw) && (this.mx.nS > 0))
    {
      localObject1 = new SparseArray();
      localObject2 = new SparseArray();
      a((SparseArray)localObject1, (SparseArray)localObject2);
    }
    for (Object localObject2 = a((SparseArray)localObject1, (SparseArray)localObject2, false);; localObject2 = null)
    {
      int i;
      label111:
      int j;
      label118:
      a locala;
      int k;
      if (localObject2 != null)
      {
        i = 0;
        if (localObject2 == null) {
          break label229;
        }
        j = 0;
        locala = this.my;
        if (locala == null) {
          break label694;
        }
        if (localObject2 == null) {
          break label237;
        }
        k = 0;
        label136:
        if (localObject2 == null) {
          break label246;
        }
      }
      label229:
      label237:
      label246:
      for (int m = 0;; m = locala.nf) {
        switch (locala.nc)
        {
        default: 
          throw new IllegalArgumentException("Unknown cmd: " + locala.nc);
          i = this.mG;
          break label111;
          j = this.mF;
          break label118;
          k = locala.ne;
          break label136;
        }
      }
      localObject1 = locala.nd;
      ((Fragment)localObject1).mNextAnim = k;
      this.mx.a((Fragment)localObject1, false);
      for (;;)
      {
        locala = locala.na;
        break;
        localObject1 = locala.nd;
        int i1 = ((Fragment)localObject1).mContainerId;
        Object localObject3 = localObject1;
        if (this.mx.nL != null)
        {
          int n = this.mx.nL.size() - 1;
          localObject3 = localObject1;
          if (n >= 0)
          {
            localObject3 = (Fragment)this.mx.nL.get(n);
            if (n.DEBUG) {
              new StringBuilder("OP_REPLACE: adding=").append(localObject1).append(" old=").append(localObject3);
            }
            if (((Fragment)localObject3).mContainerId == i1) {
              if (localObject3 == localObject1)
              {
                locala.nd = null;
                localObject1 = null;
              }
            }
            for (;;)
            {
              n -= 1;
              break;
              if (locala.ni == null) {
                locala.ni = new ArrayList();
              }
              locala.ni.add(localObject3);
              ((Fragment)localObject3).mNextAnim = m;
              if (this.mH)
              {
                ((Fragment)localObject3).mBackStackNesting += 1;
                if (n.DEBUG) {
                  new StringBuilder("Bump nesting of ").append(localObject3).append(" to ").append(((Fragment)localObject3).mBackStackNesting);
                }
              }
              this.mx.a((Fragment)localObject3, j, i);
            }
          }
        }
        if (localObject3 != null)
        {
          ((Fragment)localObject3).mNextAnim = k;
          this.mx.a((Fragment)localObject3, false);
          continue;
          localObject1 = locala.nd;
          ((Fragment)localObject1).mNextAnim = m;
          this.mx.a((Fragment)localObject1, j, i);
          continue;
          localObject1 = locala.nd;
          ((Fragment)localObject1).mNextAnim = m;
          this.mx.b((Fragment)localObject1, j, i);
          continue;
          localObject1 = locala.nd;
          ((Fragment)localObject1).mNextAnim = k;
          this.mx.c((Fragment)localObject1, j, i);
          continue;
          localObject1 = locala.nd;
          ((Fragment)localObject1).mNextAnim = m;
          this.mx.d((Fragment)localObject1, j, i);
          continue;
          localObject1 = locala.nd;
          ((Fragment)localObject1).mNextAnim = k;
          this.mx.e((Fragment)localObject1, j, i);
        }
      }
      label694:
      this.mx.a(this.mx.nS, j, i, true);
      if (this.mH)
      {
        localObject1 = this.mx;
        if (((n)localObject1).nN == null) {
          ((n)localObject1).nN = new ArrayList();
        }
        ((n)localObject1).nN.add(this);
        ((n)localObject1).bn();
      }
      return;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.mIndex >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.mIndex);
    }
    if (this.mName != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.mName);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  static final class a
  {
    a na;
    a nb;
    int nc;
    Fragment nd;
    int ne;
    int nf;
    int ng;
    int nh;
    ArrayList<Fragment> ni;
  }
  
  public final class b
  {
    public a<String, String> nj = new a();
    public ArrayList<View> nk = new ArrayList();
    public r.a nl = new r.a();
    public View nm;
    
    public b() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */