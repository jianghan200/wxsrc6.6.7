package com.tencent.sqlitelint.behaviour.b;

import com.tencent.sqlitelint.SQLiteLintIssue;
import java.util.List;

public final class a
  extends com.tencent.sqlitelint.behaviour.a
{
  private final a vnV;
  
  public a(a parama)
  {
    this.vnV = parama;
  }
  
  public final void eh(List<SQLiteLintIssue> paramList)
  {
    if (this.vnV != null)
    {
      int i = 0;
      while (i < paramList.size())
      {
        this.vnV.a((SQLiteLintIssue)paramList.get(i));
        i += 1;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(SQLiteLintIssue paramSQLiteLintIssue);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/behaviour/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */