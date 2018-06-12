package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cem
  extends com.tencent.mm.bk.a
{
  public LinkedList<Integer> szu = new LinkedList();
  public boolean szv;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 2, this.szu);
      paramVarArgs.av(2, this.szv);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.c(1, 2, this.szu) + 0 + (f.a.a.b.b.a.ec(2) + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.szu.clear();
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
      cem localcem = (cem)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcem.szu.add(Integer.valueOf(locala.vHC.rY()));
        return 0;
      }
      localcem.szv = locala.cJQ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */