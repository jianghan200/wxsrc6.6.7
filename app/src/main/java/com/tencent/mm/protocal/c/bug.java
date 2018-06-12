package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class bug
  extends com.tencent.mm.bk.a
{
  public int srG;
  public int srH;
  public String srI;
  public b srJ;
  public int srK;
  public int srL;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.srG);
      paramVarArgs.fT(2, this.srH);
      if (this.srI != null) {
        paramVarArgs.g(3, this.srI);
      }
      if (this.srJ != null) {
        paramVarArgs.b(4, this.srJ);
      }
      paramVarArgs.fT(5, this.srK);
      paramVarArgs.fT(6, this.srL);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.srG) + 0 + f.a.a.a.fQ(2, this.srH);
      paramInt = i;
      if (this.srI != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.srI);
      }
      i = paramInt;
      if (this.srJ != null) {
        i = paramInt + f.a.a.a.a(4, this.srJ);
      }
      return i + f.a.a.a.fQ(5, this.srK) + f.a.a.a.fQ(6, this.srL);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
      bug localbug = (bug)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbug.srG = locala.vHC.rY();
        return 0;
      case 2: 
        localbug.srH = locala.vHC.rY();
        return 0;
      case 3: 
        localbug.srI = locala.vHC.readString();
        return 0;
      case 4: 
        localbug.srJ = locala.cJR();
        return 0;
      case 5: 
        localbug.srK = locala.vHC.rY();
        return 0;
      }
      localbug.srL = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */