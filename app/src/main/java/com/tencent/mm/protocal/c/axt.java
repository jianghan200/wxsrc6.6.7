package com.tencent.mm.protocal.c;

public final class axt
  extends com.tencent.mm.bk.a
{
  public String eup;
  public int saU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.eup != null) {
        paramVarArgs.g(1, this.eup);
      }
      paramVarArgs.fT(2, this.saU);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eup == null) {
        break label212;
      }
    }
    label212:
    for (paramInt = f.a.a.b.b.a.h(1, this.eup) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.saU);
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
        axt localaxt = (axt)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaxt.eup = locala.vHC.readString();
          return 0;
        }
        localaxt.saU = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/axt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */