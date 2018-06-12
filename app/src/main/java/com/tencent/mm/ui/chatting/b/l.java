package com.tencent.mm.ui.chatting.b;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.widget.AbsListView;
import com.tencent.mm.ui.chatting.b.b.j;
import java.util.HashSet;
import java.util.Iterator;

public final class l
  extends com.tencent.mm.ui.l
  implements j
{
  private HashSet<com.tencent.mm.ui.l> sNB = new HashSet();
  
  public final void a(com.tencent.mm.ui.l paraml)
  {
    if (!this.sNB.contains(paraml)) {
      this.sNB.add(paraml);
    }
  }
  
  public final void b(com.tencent.mm.ui.l paraml)
  {
    this.sNB.remove(paraml);
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Iterator localIterator = this.sNB.iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.mm.ui.l)localIterator.next()).onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Iterator localIterator = this.sNB.iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.mm.ui.l)localIterator.next()).onConfigurationChanged(paramConfiguration);
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    Iterator localIterator = this.sNB.iterator();
    while (localIterator.hasNext()) {
      if (((com.tencent.mm.ui.l)localIterator.next()).onKeyDown(paramInt, paramKeyEvent)) {
        return true;
      }
    }
    return false;
  }
  
  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    Iterator localIterator = this.sNB.iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.mm.ui.l)localIterator.next()).onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    }
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    Iterator localIterator = this.sNB.iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.mm.ui.l)localIterator.next()).onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    }
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    super.onScrollStateChanged(paramAbsListView, paramInt);
    Iterator localIterator = this.sNB.iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.mm.ui.l)localIterator.next()).onScrollStateChanged(paramAbsListView, paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */