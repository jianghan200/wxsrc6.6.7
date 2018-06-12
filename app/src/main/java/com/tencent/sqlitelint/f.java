package com.tencent.sqlitelint;

import android.content.Context;
import com.tencent.sqlitelint.util.SQLite3ProfileHooker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class f
  implements b
{
  final Context mContext;
  final String vnk;
  final c vnl;
  private final List<com.tencent.sqlitelint.behaviour.a> vns;
  
  f(Context paramContext, e.a parama, e.b paramb)
  {
    this.mContext = paramContext;
    com.tencent.sqlitelint.behaviour.a.c.vnS.initialize(paramContext);
    this.vnk = parama.vnk;
    this.vnl = parama.vnl;
    if (e.cGf() == e.c.vnp) {
      SQLite3ProfileHooker.cGj();
    }
    SQLiteLintNativeBridge.nativeInstall(this.vnk);
    this.vns = new ArrayList();
    this.vns.add(new com.tencent.sqlitelint.behaviour.a.b());
    if ((paramb.vnn & 0x1) > 0)
    {
      i = 1;
      if (i != 0) {
        this.vns.add(new com.tencent.sqlitelint.behaviour.alert.a(paramContext, this.vnk));
      }
      if ((paramb.vnn & 0x2) <= 0) {
        break label166;
      }
    }
    label166:
    for (int i = j;; i = 0)
    {
      if (i != 0) {
        this.vns.add(new com.tencent.sqlitelint.behaviour.b.a(e.vnj));
      }
      return;
      i = 0;
      break;
    }
  }
  
  public final void eh(List<SQLiteLintIssue> paramList)
  {
    int j = 0;
    Iterator localIterator = paramList.iterator();
    int i;
    for (;;)
    {
      i = j;
      if (!localIterator.hasNext()) {
        break;
      }
      SQLiteLintIssue localSQLiteLintIssue = (SQLiteLintIssue)localIterator.next();
      if (com.tencent.sqlitelint.behaviour.a.a.acJ(localSQLiteLintIssue.id)) {
        localSQLiteLintIssue.isNew = false;
      } else {
        localSQLiteLintIssue.isNew = true;
      }
    }
    while (i < this.vns.size())
    {
      ((com.tencent.sqlitelint.behaviour.a)this.vns.get(i)).eh(paramList);
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */