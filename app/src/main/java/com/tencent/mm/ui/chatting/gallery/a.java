package com.tencent.mm.ui.chatting.gallery;

import android.view.View;
import com.tencent.mm.storage.bd;

public abstract class a
{
  protected b tTx;
  
  public a(b paramb)
  {
    this.tTx = paramb;
  }
  
  public final j Fl(int paramInt)
  {
    if (this.tTx == null) {
      return null;
    }
    View localView = this.tTx.Ep(paramInt);
    if (localView == null) {
      return null;
    }
    return (j)((View)localView).getTag();
  }
  
  public final void Fm(int paramInt)
  {
    if (this.tTx == null) {}
    View localView;
    do
    {
      return;
      localView = this.tTx.Ep(paramInt);
    } while ((localView == null) || (localView.getTag() == null));
    a((j)localView.getTag(), this.tTx.ES(paramInt), paramInt);
  }
  
  public boolean a(j paramj, bd parambd, int paramInt)
  {
    return false;
  }
  
  public void detach()
  {
    this.tTx = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/gallery/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */