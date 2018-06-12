package com.tencent.mm.plugin.backup.h;

import java.util.LinkedList;

public final class j
  extends com.tencent.mm.bk.a
{
  public LinkedList<String> hbH = new LinkedList();
  public LinkedList<Long> hbI = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.hbH);
      paramVarArgs.d(2, 3, this.hbI);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.c(1, 1, this.hbH) + 0 + f.a.a.a.c(2, 3, this.hbI);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.hbH.clear();
      this.hbI.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      j localj = (j)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localj.hbH.add(locala.vHC.readString());
        return 0;
      }
      localj.hbI.add(Long.valueOf(locala.vHC.rZ()));
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/h/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */