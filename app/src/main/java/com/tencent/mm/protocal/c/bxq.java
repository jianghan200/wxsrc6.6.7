package com.tencent.mm.protocal.c;

public final class bxq
  extends com.tencent.mm.bk.a
{
  public String rQC;
  public int stR;
  public int state;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rQC != null) {
        paramVarArgs.g(1, this.rQC);
      }
      paramVarArgs.fT(2, this.state);
      paramVarArgs.fT(3, this.stR);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rQC == null) {
        break label246;
      }
    }
    label246:
    for (paramInt = f.a.a.b.b.a.h(1, this.rQC) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.state) + f.a.a.a.fQ(3, this.stR);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bxq localbxq = (bxq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbxq.rQC = locala.vHC.readString();
          return 0;
        case 2: 
          localbxq.state = locala.vHC.rY();
          return 0;
        }
        localbxq.stR = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bxq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */