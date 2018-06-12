package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bnk
  extends com.tencent.mm.bk.a
{
  public LinkedList<String> slr = new LinkedList();
  public LinkedList<String> sls = new LinkedList();
  public LinkedList<Integer> slt = new LinkedList();
  public LinkedList<Integer> slu = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.slr);
      paramVarArgs.d(2, 1, this.sls);
      paramVarArgs.d(3, 2, this.slt);
      paramVarArgs.d(4, 2, this.slu);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.c(1, 1, this.slr) + 0 + f.a.a.a.c(2, 1, this.sls) + f.a.a.a.c(3, 2, this.slt) + f.a.a.a.c(4, 2, this.slu);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.slr.clear();
      this.sls.clear();
      this.slt.clear();
      this.slu.clear();
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
      bnk localbnk = (bnk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbnk.slr.add(locala.vHC.readString());
        return 0;
      case 2: 
        localbnk.sls.add(locala.vHC.readString());
        return 0;
      case 3: 
        localbnk.slt.add(Integer.valueOf(locala.vHC.rY()));
        return 0;
      }
      localbnk.slu.add(Integer.valueOf(locala.vHC.rY()));
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bnk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */