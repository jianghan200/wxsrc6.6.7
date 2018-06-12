package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class wy
  extends com.tencent.mm.bk.a
{
  public LinkedList<String> rBW = new LinkedList();
  public LinkedList<String> rBX = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.rBW);
      paramVarArgs.d(2, 1, this.rBX);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.c(1, 1, this.rBW) + 0 + f.a.a.a.c(2, 1, this.rBX);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rBW.clear();
      this.rBX.clear();
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
      wy localwy = (wy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localwy.rBW.add(locala.vHC.readString());
        return 0;
      }
      localwy.rBX.add(locala.vHC.readString());
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/wy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */