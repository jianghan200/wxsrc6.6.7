package com.tencent.mm.ui.chatting.e;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.tencent.mm.bg.d.a;
import com.tencent.mm.bg.d.b;
import com.tencent.mm.ui.chatting.c.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

public final class b
  implements d.b
{
  private static WeakHashMap<Fragment, HashMap<Integer, d.a>> tXP = new WeakHashMap();
  private WeakReference<a> tXQ;
  
  public b(a parama)
  {
    this.tXQ = new WeakReference(parama);
  }
  
  public static d.a b(Fragment paramFragment, int paramInt)
  {
    paramFragment = (HashMap)tXP.get(paramFragment);
    if (paramFragment != null) {
      return (d.a)paramFragment.remove(Integer.valueOf(paramInt));
    }
    return null;
  }
  
  public final void a(Intent paramIntent, int paramInt, d.a parama)
  {
    Fragment localFragment = cxF();
    if (localFragment == null) {
      return;
    }
    HashMap localHashMap2 = (HashMap)tXP.get(localFragment);
    HashMap localHashMap1 = localHashMap2;
    if (localHashMap2 == null)
    {
      localHashMap1 = new HashMap();
      tXP.put(localFragment, localHashMap1);
    }
    localHashMap1.put(Integer.valueOf(paramInt), parama);
    localFragment.startActivityForResult(paramIntent, paramInt);
  }
  
  public final Fragment cxF()
  {
    a locala = (a)this.tXQ.get();
    if (locala != null) {
      return locala.tTq;
    }
    return null;
  }
  
  public final Context getContext()
  {
    return cxF().getActivity();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */