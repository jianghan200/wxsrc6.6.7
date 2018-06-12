package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class bxd
  extends com.tencent.mm.bk.a
{
  public String eJM;
  public String hbL;
  public String hcS;
  public String rej;
  public String rul;
  public String stJ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.stJ == null) {
        throw new b("Not all required fields were included: MatchWord");
      }
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      if (this.stJ != null) {
        paramVarArgs.g(2, this.stJ);
      }
      if (this.hcS != null) {
        paramVarArgs.g(3, this.hcS);
      }
      if (this.rul != null) {
        paramVarArgs.g(4, this.rul);
      }
      if (this.eJM != null) {
        paramVarArgs.g(5, this.eJM);
      }
      if (this.rej != null) {
        paramVarArgs.g(6, this.rej);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label522;
      }
    }
    label522:
    for (int i = f.a.a.b.b.a.h(1, this.hbL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.stJ != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.stJ);
      }
      i = paramInt;
      if (this.hcS != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hcS);
      }
      paramInt = i;
      if (this.rul != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rul);
      }
      i = paramInt;
      if (this.eJM != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.eJM);
      }
      paramInt = i;
      if (this.rej != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rej);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.hbL == null) {
          throw new b("Not all required fields were included: UserName");
        }
        if (this.stJ != null) {
          break;
        }
        throw new b("Not all required fields were included: MatchWord");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bxd localbxd = (bxd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbxd.hbL = locala.vHC.readString();
          return 0;
        case 2: 
          localbxd.stJ = locala.vHC.readString();
          return 0;
        case 3: 
          localbxd.hcS = locala.vHC.readString();
          return 0;
        case 4: 
          localbxd.rul = locala.vHC.readString();
          return 0;
        case 5: 
          localbxd.eJM = locala.vHC.readString();
          return 0;
        }
        localbxd.rej = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bxd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */