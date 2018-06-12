package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cie
  extends com.tencent.mm.bk.a
{
  public int sCd;
  public int sCe;
  public int sCf;
  public int score;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (this.username != null) {
        paramVarArgs.g(1, this.username);
      }
      paramVarArgs.fT(2, this.score);
      paramVarArgs.fT(3, this.sCd);
      paramVarArgs.fT(4, this.sCe);
      paramVarArgs.fT(5, this.sCf);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = f.a.a.b.b.a.h(1, this.username) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.score) + f.a.a.a.fQ(3, this.sCd) + f.a.a.a.fQ(4, this.sCe) + f.a.a.a.fQ(5, this.sCf);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.username != null) {
          break;
        }
        throw new b("Not all required fields were included: username");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cie localcie = (cie)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcie.username = locala.vHC.readString();
          return 0;
        case 2: 
          localcie.score = locala.vHC.rY();
          return 0;
        case 3: 
          localcie.sCd = locala.vHC.rY();
          return 0;
        case 4: 
          localcie.sCe = locala.vHC.rY();
          return 0;
        }
        localcie.sCf = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */