package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bwk
  extends com.tencent.mm.bk.a
{
  public int qZc;
  public LinkedList<String> ssL = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.qZc);
      paramVarArgs.d(2, 1, this.ssL);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.qZc) + 0 + f.a.a.a.c(2, 1, this.ssL);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ssL.clear();
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
      bwk localbwk = (bwk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbwk.qZc = locala.vHC.rY();
        return 0;
      }
      localbwk.ssL.add(locala.vHC.readString());
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bwk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */