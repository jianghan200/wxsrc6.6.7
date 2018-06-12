package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewGroup;

public abstract class o
  extends u
{
  private final m ou;
  private q ov = null;
  private Fragment ow = null;
  
  public o(m paramm)
  {
    this.ou = paramm;
  }
  
  private static String b(int paramInt, long paramLong)
  {
    return "android:switcher:" + paramInt + ":" + paramLong;
  }
  
  public abstract Fragment V(int paramInt);
  
  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.ov == null) {
      this.ov = this.ou.bk();
    }
    this.ov.c((Fragment)paramObject);
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).getView() == paramView;
  }
  
  public final Object b(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.ov == null) {
      this.ov = this.ou.bk();
    }
    long l = paramInt;
    Object localObject = b(paramViewGroup.getId(), l);
    localObject = this.ou.J((String)localObject);
    if (localObject != null) {
      this.ov.d((Fragment)localObject);
    }
    for (paramViewGroup = (ViewGroup)localObject;; paramViewGroup = (ViewGroup)localObject)
    {
      if (paramViewGroup != this.ow)
      {
        paramViewGroup.setMenuVisibility(false);
        paramViewGroup.setUserVisibleHint(false);
      }
      return paramViewGroup;
      localObject = V(paramInt);
      this.ov.a(paramViewGroup.getId(), (Fragment)localObject, b(paramViewGroup.getId(), l));
    }
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
    return null;
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/android/support/v4/app/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */