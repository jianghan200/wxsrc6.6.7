package com.tencent.mm.protocal.c;

public final class buq
  extends com.tencent.mm.bk.a
{
  public String content;
  public int hUm;
  public String slj;
  public int sln;
  public String slo;
  public int state;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.slo != null) {
        paramVarArgs.g(1, this.slo);
      }
      paramVarArgs.fT(2, this.hUm);
      if (this.content != null) {
        paramVarArgs.g(3, this.content);
      }
      if (this.slj != null) {
        paramVarArgs.g(4, this.slj);
      }
      paramVarArgs.fT(5, this.sln);
      paramVarArgs.fT(6, this.state);
      return 0;
    }
    if (paramInt == 1) {
      if (this.slo == null) {
        break label402;
      }
    }
    label402:
    for (paramInt = f.a.a.b.b.a.h(1, this.slo) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.content != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.content);
      }
      i = paramInt;
      if (this.slj != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.slj);
      }
      return i + f.a.a.a.fQ(5, this.sln) + f.a.a.a.fQ(6, this.state);
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
        buq localbuq = (buq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbuq.slo = locala.vHC.readString();
          return 0;
        case 2: 
          localbuq.hUm = locala.vHC.rY();
          return 0;
        case 3: 
          localbuq.content = locala.vHC.readString();
          return 0;
        case 4: 
          localbuq.slj = locala.vHC.readString();
          return 0;
        case 5: 
          localbuq.sln = locala.vHC.rY();
          return 0;
        }
        localbuq.state = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/buq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */