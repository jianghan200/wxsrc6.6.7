package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.util.SparseArray;
import android.view.View;
import com.tencent.mm.R.i;

public final class f
{
  public static final int qvk = R.i.note_editor_text_item;
  public static final int qvl = R.i.note_editor_other_item;
  public static final int qvm = R.i.note_editor_header_item;
  public SparseArray<Integer> qvn = new SparseArray();
  
  public f()
  {
    this.qvn.put(1, Integer.valueOf(qvk));
    this.qvn.put(2, Integer.valueOf(qvl));
    this.qvn.put(4, Integer.valueOf(qvl));
    this.qvn.put(3, Integer.valueOf(qvl));
    this.qvn.put(5, Integer.valueOf(qvl));
    this.qvn.put(6, Integer.valueOf(qvl));
    this.qvn.put(0, Integer.valueOf(qvl));
    this.qvn.put(-1, Integer.valueOf(qvl));
    this.qvn.put(-3, Integer.valueOf(qvm));
    this.qvn.put(-2, Integer.valueOf(qvl));
    this.qvn.put(-4, Integer.valueOf(qvl));
  }
  
  public static a a(int paramInt, View paramView, com.tencent.mm.plugin.wenote.model.nativenote.manager.k paramk)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
      return new k(paramView, paramk);
    case 0: 
      return new l(paramView, paramk);
    case 2: 
      return new e(paramView, paramk);
    case 4: 
      return new n(paramView, paramk);
    case 3: 
      return new g(paramView, paramk);
    case 5: 
      return new c(paramView, paramk);
    case 6: 
      return new m(paramView, paramk);
    case -1: 
      return new j(paramView, paramk);
    case -3: 
      return new d(paramView, paramk);
    case -2: 
      return new b(paramView, paramk);
    }
    return new i(paramView, paramk);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */