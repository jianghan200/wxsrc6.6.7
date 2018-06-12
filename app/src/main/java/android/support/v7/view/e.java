package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class e
  extends b
  implements f.a
{
  private ActionBarContextView FT;
  private b.a Gq;
  private WeakReference<View> Gr;
  private boolean Gu;
  private f bq;
  private Context mContext;
  private boolean mFinished;
  
  public e(Context paramContext, ActionBarContextView paramActionBarContextView, b.a parama, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.FT = paramActionBarContextView;
    this.Gq = parama;
    paramContext = new f(paramActionBarContextView.getContext());
    paramContext.Im = 1;
    this.bq = paramContext;
    this.bq.a(this);
    this.Gu = paramBoolean;
  }
  
  public final boolean a(f paramf, MenuItem paramMenuItem)
  {
    return this.Gq.a(this, paramMenuItem);
  }
  
  public final void b(f paramf)
  {
    invalidate();
    this.FT.showOverflowMenu();
  }
  
  public final void finish()
  {
    if (this.mFinished) {
      return;
    }
    this.mFinished = true;
    this.FT.sendAccessibilityEvent(32);
    this.Gq.a(this);
  }
  
  public final View getCustomView()
  {
    if (this.Gr != null) {
      return (View)this.Gr.get();
    }
    return null;
  }
  
  public final Menu getMenu()
  {
    return this.bq;
  }
  
  public final MenuInflater getMenuInflater()
  {
    return new g(this.FT.getContext());
  }
  
  public final CharSequence getSubtitle()
  {
    return this.FT.getSubtitle();
  }
  
  public final CharSequence getTitle()
  {
    return this.FT.getTitle();
  }
  
  public final void invalidate()
  {
    this.Gq.b(this, this.bq);
  }
  
  public final boolean isTitleOptional()
  {
    return this.FT.JL;
  }
  
  public final void setCustomView(View paramView)
  {
    this.FT.setCustomView(paramView);
    if (paramView != null) {}
    for (paramView = new WeakReference(paramView);; paramView = null)
    {
      this.Gr = paramView;
      return;
    }
  }
  
  public final void setSubtitle(int paramInt)
  {
    setSubtitle(this.mContext.getString(paramInt));
  }
  
  public final void setSubtitle(CharSequence paramCharSequence)
  {
    this.FT.setSubtitle(paramCharSequence);
  }
  
  public final void setTitle(int paramInt)
  {
    setTitle(this.mContext.getString(paramInt));
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.FT.setTitle(paramCharSequence);
  }
  
  public final void setTitleOptionalHint(boolean paramBoolean)
  {
    super.setTitleOptionalHint(paramBoolean);
    this.FT.setTitleOptional(paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */