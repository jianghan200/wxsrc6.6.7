package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Spannable;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import java.util.ArrayList;
import java.util.Iterator;

public final class p
{
  final ArrayList<a> qtb = new ArrayList();
  
  public final void a(Object paramObject, n paramn)
  {
    this.qtb.add(new a(paramObject, paramn, false));
  }
  
  public final void a(ArrayList<Object> paramArrayList, n paramn)
  {
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      Object localObject = paramArrayList.next();
      if ((localObject instanceof f)) {
        this.qtb.add(new a(localObject, paramn, true));
      }
    }
  }
  
  public final void c(Spannable paramSpannable)
  {
    Iterator localIterator = this.qtb.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      f localf = locala.qtc;
      int m = locala.qtd.Tw;
      int i;
      if (locala.qte)
      {
        i = paramSpannable.getSpanStart(localf);
        if ((i >= 0) && (i < m)) {
          paramSpannable.setSpan(localf.caH(), i, m, 34);
        }
        paramSpannable.removeSpan(localf);
      }
      else
      {
        n localn = locala.qtd;
        int k = locala.qtd.tK;
        if ((localn.qsU) && (localn.isEmpty())) {
          i = 34;
        }
        for (;;)
        {
          int j = k;
          if (k > paramSpannable.length()) {
            j = paramSpannable.length();
          }
          paramSpannable.setSpan(localf, m, j, i);
          break;
          if ((localn.qsU) && (localn.qsT)) {
            i = 18;
          } else if (localn.qsU) {
            i = 34;
          } else {
            i = 33;
          }
        }
      }
    }
  }
  
  private static final class a
  {
    final f qtc;
    final n qtd;
    final boolean qte;
    
    a(Object paramObject, n paramn, boolean paramBoolean)
    {
      this.qtc = ((f)paramObject);
      this.qtd = paramn;
      this.qte = paramBoolean;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/spans/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */