package android.support.v7.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.c.a.a;
import android.support.v4.e.j;
import android.support.v7.view.menu.n;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

@TargetApi(11)
public final class f
  extends ActionMode
{
  final b Gv;
  final Context mContext;
  
  public f(Context paramContext, b paramb)
  {
    this.mContext = paramContext;
    this.Gv = paramb;
  }
  
  public final void finish()
  {
    this.Gv.finish();
  }
  
  public final View getCustomView()
  {
    return this.Gv.getCustomView();
  }
  
  public final Menu getMenu()
  {
    return n.a(this.mContext, (a)this.Gv.getMenu());
  }
  
  public final MenuInflater getMenuInflater()
  {
    return this.Gv.getMenuInflater();
  }
  
  public final CharSequence getSubtitle()
  {
    return this.Gv.getSubtitle();
  }
  
  public final Object getTag()
  {
    return this.Gv.hX;
  }
  
  public final CharSequence getTitle()
  {
    return this.Gv.getTitle();
  }
  
  public final boolean getTitleOptionalHint()
  {
    return this.Gv.Gs;
  }
  
  public final void invalidate()
  {
    this.Gv.invalidate();
  }
  
  public final boolean isTitleOptional()
  {
    return this.Gv.isTitleOptional();
  }
  
  public final void setCustomView(View paramView)
  {
    this.Gv.setCustomView(paramView);
  }
  
  public final void setSubtitle(int paramInt)
  {
    this.Gv.setSubtitle(paramInt);
  }
  
  public final void setSubtitle(CharSequence paramCharSequence)
  {
    this.Gv.setSubtitle(paramCharSequence);
  }
  
  public final void setTag(Object paramObject)
  {
    this.Gv.hX = paramObject;
  }
  
  public final void setTitle(int paramInt)
  {
    this.Gv.setTitle(paramInt);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.Gv.setTitle(paramCharSequence);
  }
  
  public final void setTitleOptionalHint(boolean paramBoolean)
  {
    this.Gv.setTitleOptionalHint(paramBoolean);
  }
  
  public static final class a
    implements b.a
  {
    final ActionMode.Callback Gw;
    final ArrayList<f> Gx;
    final j<Menu, Menu> Gy;
    final Context mContext;
    
    public a(Context paramContext, ActionMode.Callback paramCallback)
    {
      this.mContext = paramContext;
      this.Gw = paramCallback;
      this.Gx = new ArrayList();
      this.Gy = new j();
    }
    
    private Menu b(Menu paramMenu)
    {
      Menu localMenu2 = (Menu)this.Gy.get(paramMenu);
      Menu localMenu1 = localMenu2;
      if (localMenu2 == null)
      {
        localMenu1 = n.a(this.mContext, (a)paramMenu);
        this.Gy.put(paramMenu, localMenu1);
      }
      return localMenu1;
    }
    
    public final void a(b paramb)
    {
      this.Gw.onDestroyActionMode(b(paramb));
    }
    
    public final boolean a(b paramb, Menu paramMenu)
    {
      return this.Gw.onCreateActionMode(b(paramb), b(paramMenu));
    }
    
    public final boolean a(b paramb, MenuItem paramMenuItem)
    {
      return this.Gw.onActionItemClicked(b(paramb), n.a(this.mContext, (android.support.v4.c.a.b)paramMenuItem));
    }
    
    public final ActionMode b(b paramb)
    {
      int j = this.Gx.size();
      int i = 0;
      while (i < j)
      {
        f localf = (f)this.Gx.get(i);
        if ((localf != null) && (localf.Gv == paramb)) {
          return localf;
        }
        i += 1;
      }
      paramb = new f(this.mContext, paramb);
      this.Gx.add(paramb);
      return paramb;
    }
    
    public final boolean b(b paramb, Menu paramMenu)
    {
      return this.Gw.onPrepareActionMode(b(paramb), b(paramMenu));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */