package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.c.a.b;
import android.support.v4.view.d.b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

@TargetApi(16)
final class j
  extends i
{
  j(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  final i.a a(ActionProvider paramActionProvider)
  {
    return new a(this.mContext, paramActionProvider);
  }
  
  final class a
    extends i.a
    implements ActionProvider.VisibilityListener
  {
    d.b IU;
    
    public a(Context paramContext, ActionProvider paramActionProvider)
    {
      super(paramContext, paramActionProvider);
    }
    
    public final void a(d.b paramb)
    {
      this.IU = paramb;
      this.IR.setVisibilityListener(this);
    }
    
    public final boolean isVisible()
    {
      return this.IR.isVisible();
    }
    
    public final void onActionProviderVisibilityChanged(boolean paramBoolean)
    {
      if (this.IU != null) {
        this.IU.ca();
      }
    }
    
    public final View onCreateActionView(MenuItem paramMenuItem)
    {
      return this.IR.onCreateActionView(paramMenuItem);
    }
    
    public final boolean overridesItemVisibility()
    {
      return this.IR.overridesItemVisibility();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */