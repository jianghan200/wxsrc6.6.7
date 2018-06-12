package com.tencent.mm.protocal.c;

public final class ala
  extends com.tencent.mm.bk.a
{
  public String rNQ;
  public int rNR;
  public int rNS;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rNQ != null) {
        paramVarArgs.g(1, this.rNQ);
      }
      paramVarArgs.fT(2, this.rNR);
      paramVarArgs.fT(3, this.rNS);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rNQ == null) {
        break label246;
      }
    }
    label246:
    for (paramInt = f.a.a.b.b.a.h(1, this.rNQ) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.rNR) + f.a.a.a.fQ(3, this.rNS);
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
        ala localala = (ala)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localala.rNQ = locala.vHC.readString();
          return 0;
        case 2: 
          localala.rNR = locala.vHC.rY();
          return 0;
        }
        localala.rNS = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ala.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */