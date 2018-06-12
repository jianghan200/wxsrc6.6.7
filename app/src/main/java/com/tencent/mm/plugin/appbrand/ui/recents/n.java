package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.t;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.List;

final class n
  extends RecyclerView.a
{
  private LayoutInflater Bc;
  final SparseArray<o> gBb = new SparseArray();
  private final ArrayList<?> gBc;
  
  n(ArrayList<?> paramArrayList)
  {
    this.gBc = paramArrayList;
  }
  
  public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
  {
    o localo = (o)this.gBb.get(paramInt);
    if (localo == null) {
      return null;
    }
    Context localContext = paramViewGroup.getContext();
    if (this.Bc == null) {
      this.Bc = LayoutInflater.from(localContext);
    }
    return localo.a(this.Bc, paramViewGroup);
  }
  
  public final void a(RecyclerView.t paramt, int paramInt)
  {
    o localo = (o)this.gBb.get(getItemViewType(paramInt));
    if (localo != null) {
      localo.b(paramt, lM(paramInt));
    }
  }
  
  public final void a(RecyclerView.t paramt, int paramInt, List paramList)
  {
    o localo = (o)this.gBb.get(getItemViewType(paramInt));
    if (localo == null) {
      super.a(paramt, paramInt, paramList);
    }
    do
    {
      return;
      if (paramList.size() <= 0) {
        break;
      }
      lM(paramInt);
    } while (localo.a(paramt, paramList.get(0)));
    localo.b(paramt, lM(paramInt));
  }
  
  public final int getItemCount()
  {
    if (this.gBc == null) {
      return 0;
    }
    return this.gBc.size();
  }
  
  public final long getItemId(int paramInt)
  {
    Object localObject = lM(paramInt);
    o localo = (o)this.gBb.get(getItemViewType(paramInt));
    if ((localObject == null) || (localo == null)) {
      return 0L;
    }
    return localo.bn(localObject);
  }
  
  public final int getItemViewType(int paramInt)
  {
    Object localObject = lM(paramInt);
    if (localObject == null) {
      return 0;
    }
    return localObject.getClass().hashCode();
  }
  
  final boolean isEmpty()
  {
    return (this.gBc == null) || (bi.cX(this.gBc));
  }
  
  final Object lM(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > getItemCount())) {
      return null;
    }
    return this.gBc.get(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */