package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.view.z;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b
  implements l
{
  protected LayoutInflater Bc;
  public Context HF;
  protected LayoutInflater HG;
  private int HH;
  private int HI;
  public m HJ;
  public l.a bp;
  public f bq;
  public Context mContext;
  public int mId;
  
  public b(Context paramContext, int paramInt1, int paramInt2)
  {
    this.HF = paramContext;
    this.HG = LayoutInflater.from(paramContext);
    this.HH = paramInt1;
    this.HI = paramInt2;
  }
  
  public boolean N()
  {
    return false;
  }
  
  public View a(h paramh, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof m.a)) {}
    for (paramView = (m.a)paramView;; paramView = (m.a)this.HG.inflate(this.HI, paramViewGroup, false))
    {
      a(paramh, paramView);
      return (View)paramView;
    }
  }
  
  public void a(Context paramContext, f paramf)
  {
    this.mContext = paramContext;
    this.Bc = LayoutInflater.from(this.mContext);
    this.bq = paramf;
  }
  
  public void a(f paramf, boolean paramBoolean)
  {
    if (this.bp != null) {
      this.bp.a(paramf, paramBoolean);
    }
  }
  
  public abstract void a(h paramh, m.a parama);
  
  public boolean a(p paramp)
  {
    if (this.bp != null) {
      return this.bp.d(paramp);
    }
    return false;
  }
  
  public final boolean b(h paramh)
  {
    return false;
  }
  
  public final boolean c(h paramh)
  {
    return false;
  }
  
  public boolean c(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public m e(ViewGroup paramViewGroup)
  {
    if (this.HJ == null)
    {
      this.HJ = ((m)this.HG.inflate(this.HH, paramViewGroup, false));
      this.HJ.a(this.bq);
      n(true);
    }
    return this.HJ;
  }
  
  public boolean e(h paramh)
  {
    return true;
  }
  
  public final int getId()
  {
    return this.mId;
  }
  
  public void n(boolean paramBoolean)
  {
    ViewGroup localViewGroup = (ViewGroup)this.HJ;
    if (localViewGroup == null) {}
    label225:
    label231:
    for (;;)
    {
      return;
      int j;
      if (this.bq != null)
      {
        this.bq.dO();
        ArrayList localArrayList = this.bq.dN();
        int m = localArrayList.size();
        int k = 0;
        int i = 0;
        j = i;
        if (k < m)
        {
          h localh = (h)localArrayList.get(k);
          if (!e(localh)) {
            break label225;
          }
          View localView1 = localViewGroup.getChildAt(i);
          if ((localView1 instanceof m.a)) {}
          for (Object localObject = ((m.a)localView1).getItemData();; localObject = null)
          {
            View localView2 = a(localh, localView1, localViewGroup);
            if (localh != localObject)
            {
              localView2.setPressed(false);
              z.aa(localView2);
            }
            if (localView2 != localView1)
            {
              localObject = (ViewGroup)localView2.getParent();
              if (localObject != null) {
                ((ViewGroup)localObject).removeView(localView2);
              }
              ((ViewGroup)this.HJ).addView(localView2, i);
            }
            i += 1;
            k += 1;
            break;
          }
        }
      }
      for (;;)
      {
        if (j >= localViewGroup.getChildCount()) {
          break label231;
        }
        if (!c(localViewGroup, j))
        {
          j += 1;
          continue;
          break;
          j = 0;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */