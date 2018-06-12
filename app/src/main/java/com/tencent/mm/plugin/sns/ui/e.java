package com.tencent.mm.plugin.sns.ui;

import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class e<T>
{
  private ag handler = null;
  List<Integer> nKB = new LinkedList();
  
  public e()
  {
    this.nKB.clear();
  }
  
  public abstract List<T> bBI();
  
  final void cp(List<T> paramList)
  {
    this.handler.post(new e.2(this, paramList));
  }
  
  public abstract void cq(List<T> paramList);
  
  protected final void fu(boolean paramBoolean)
  {
    int i;
    int j;
    if (paramBoolean)
    {
      i = 0;
      if (i != 1) {
        break label73;
      }
      Iterator localIterator = this.nKB.iterator();
      while (localIterator.hasNext()) {
        if (((Integer)localIterator.next()).intValue() == 1)
        {
          j = 1;
          label51:
          if (j == 0) {
            break label73;
          }
          x.e("MicroMsg.AdapterLoader", "thread is loading ui should be not load any");
        }
      }
    }
    for (;;)
    {
      return;
      i = 1;
      break;
      j = 0;
      break label51;
      label73:
      if (!paramBoolean) {
        x.d("MicroMsg.AdapterLoader", "ui load");
      }
      while (this.nKB.size() <= 1)
      {
        this.nKB.add(Integer.valueOf(i));
        if (!paramBoolean) {
          break label164;
        }
        af.bxY().post(new e.1(this, paramBoolean));
        return;
        x.d("MicroMsg.AdapterLoader", "thread load" + this.nKB.size());
      }
    }
    label164:
    cp(bBI());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */