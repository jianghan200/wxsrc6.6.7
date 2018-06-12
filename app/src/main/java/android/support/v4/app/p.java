package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class p
  extends u
{
  private ArrayList<Fragment> oA = new ArrayList();
  private final m ou;
  private q ov = null;
  private Fragment ow = null;
  private ArrayList<Fragment.SavedState> oz = new ArrayList();
  
  public p(m paramm)
  {
    this.ou = paramm;
  }
  
  public abstract Fragment V(int paramInt);
  
  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    if (paramParcelable != null)
    {
      paramParcelable = (Bundle)paramParcelable;
      paramParcelable.setClassLoader(paramClassLoader);
      paramClassLoader = paramParcelable.getParcelableArray("states");
      this.oz.clear();
      this.oA.clear();
      int i;
      if (paramClassLoader != null)
      {
        i = 0;
        while (i < paramClassLoader.length)
        {
          this.oz.add((Fragment.SavedState)paramClassLoader[i]);
          i += 1;
        }
      }
      paramClassLoader = paramParcelable.keySet().iterator();
      while (paramClassLoader.hasNext())
      {
        Object localObject = (String)paramClassLoader.next();
        if (((String)localObject).startsWith("f"))
        {
          i = Integer.parseInt(((String)localObject).substring(1));
          localObject = this.ou.c(paramParcelable, (String)localObject);
          if (localObject != null)
          {
            while (this.oA.size() <= i) {
              this.oA.add(null);
            }
            ((Fragment)localObject).setMenuVisibility(false);
            this.oA.set(i, localObject);
          }
        }
      }
    }
  }
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramObject = (Fragment)paramObject;
    if (this.ov == null) {
      this.ov = this.ou.bk();
    }
    while (this.oz.size() <= paramInt) {
      this.oz.add(null);
    }
    ArrayList localArrayList = this.oz;
    if (((Fragment)paramObject).isAdded()) {}
    for (paramViewGroup = this.ou.e((Fragment)paramObject);; paramViewGroup = null)
    {
      localArrayList.set(paramInt, paramViewGroup);
      this.oA.set(paramInt, null);
      this.ov.a((Fragment)paramObject);
      return;
    }
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).getView() == paramView;
  }
  
  public final Object b(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.oA.size() > paramInt)
    {
      localFragment = (Fragment)this.oA.get(paramInt);
      if (localFragment != null) {
        return localFragment;
      }
    }
    if (this.ov == null) {
      this.ov = this.ou.bk();
    }
    Fragment localFragment = V(paramInt);
    if (this.oz.size() > paramInt)
    {
      Fragment.SavedState localSavedState = (Fragment.SavedState)this.oz.get(paramInt);
      if (localSavedState != null) {
        localFragment.setInitialSavedState(localSavedState);
      }
    }
    while (this.oA.size() <= paramInt) {
      this.oA.add(null);
    }
    localFragment.setMenuVisibility(false);
    localFragment.setUserVisibleHint(false);
    this.oA.set(paramInt, localFragment);
    this.ov.a(paramViewGroup.getId(), localFragment);
    return localFragment;
  }
  
  public final void bo()
  {
    if (this.ov != null)
    {
      this.ov.commitAllowingStateLoss();
      this.ov = null;
      this.ou.executePendingTransactions();
    }
  }
  
  public final Parcelable bp()
  {
    Object localObject1 = null;
    Object localObject2;
    if (this.oz.size() > 0)
    {
      localObject1 = new Bundle();
      localObject2 = new Fragment.SavedState[this.oz.size()];
      this.oz.toArray((Object[])localObject2);
      ((Bundle)localObject1).putParcelableArray("states", (Parcelable[])localObject2);
    }
    int i = 0;
    while (i < this.oA.size())
    {
      Fragment localFragment = (Fragment)this.oA.get(i);
      localObject2 = localObject1;
      if (localFragment != null)
      {
        localObject2 = localObject1;
        if (localFragment.isAdded())
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new Bundle();
          }
          localObject1 = "f" + i;
          this.ou.a((Bundle)localObject2, (String)localObject1, localFragment);
        }
      }
      i += 1;
      localObject1 = localObject2;
    }
    return (Parcelable)localObject1;
  }
  
  public final void e(Object paramObject)
  {
    paramObject = (Fragment)paramObject;
    if (paramObject != this.ow)
    {
      if (this.ow != null)
      {
        this.ow.setMenuVisibility(false);
        this.ow.setUserVisibleHint(false);
      }
      if (paramObject != null)
      {
        ((Fragment)paramObject).setMenuVisibility(true);
        ((Fragment)paramObject).setUserVisibleHint(true);
      }
      this.ow = ((Fragment)paramObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/android/support/v4/app/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */