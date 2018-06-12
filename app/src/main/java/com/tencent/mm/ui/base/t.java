package com.tencent.mm.ui.base;

import android.support.v4.view.u;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public abstract class t
  extends u
{
  public Queue<View> tyZ = new LinkedList();
  public HashMap<Object, Integer> tza = new HashMap();
  public SparseArray<Object> tzb = new SparseArray();
  
  public final View Ep(int paramInt)
  {
    Object localObject = this.tzb.get(paramInt);
    if (localObject != null) {
      return (View)localObject;
    }
    return null;
  }
  
  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    x.d("MicroMsg.MMViewPagerAdapter", "destroyItem position %s", new Object[] { Integer.valueOf(paramInt) });
    x.i("MicroMsg.MMViewPagerAdapter", "destroyItem object %s", new Object[] { Integer.valueOf(paramObject.hashCode()) });
    this.tyZ.add((View)paramObject);
    this.tza.remove(paramObject);
    this.tzb.remove(paramInt);
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
  
  public Object b(ViewGroup paramViewGroup, int paramInt)
  {
    long l = System.currentTimeMillis();
    Object localObject = null;
    if (this.tyZ.size() > 0) {
      localObject = (View)this.tyZ.poll();
    }
    localObject = c(paramInt, (View)localObject);
    x.i("MicroMsg.MMViewPagerAdapter", "instantiateItem object %s, parent %s position:%s", new Object[] { Integer.valueOf(localObject.hashCode()), ((View)localObject).getParent(), Integer.valueOf(paramInt) });
    this.tza.put(localObject, Integer.valueOf(paramInt));
    this.tzb.put(paramInt, localObject);
    if (((View)localObject).getParent() == null) {
      paramViewGroup.addView((View)localObject);
    }
    x.i("MicroMsg.MMViewPagerAdapter", "instantiateItem spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    return localObject;
  }
  
  public abstract Object c(int paramInt, View paramView);
  
  public int crV()
  {
    return -1;
  }
  
  public int crW()
  {
    return -1;
  }
  
  public void detach()
  {
    reset();
  }
  
  public final int k(Object paramObject)
  {
    if (this.tza.containsKey(paramObject)) {
      return ((Integer)this.tza.get(paramObject)).intValue();
    }
    return -2;
  }
  
  public abstract MultiTouchImageView qC(int paramInt);
  
  public abstract WxImageView qD(int paramInt);
  
  public final void reset()
  {
    this.tyZ.clear();
    this.tza.clear();
    this.tzb.clear();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */