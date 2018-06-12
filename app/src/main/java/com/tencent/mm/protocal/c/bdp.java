package com.tencent.mm.protocal.c;

public final class bdp
  extends com.tencent.mm.bk.a
{
  public String iwF;
  public String ryU;
  public int sfQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.iwF != null) {
        paramVarArgs.g(1, this.iwF);
      }
      paramVarArgs.fT(2, this.sfQ);
      if (this.ryU != null) {
        paramVarArgs.g(3, this.ryU);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.iwF == null) {
        break label273;
      }
    }
    label273:
    for (paramInt = f.a.a.b.b.a.h(1, this.iwF) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.sfQ);
      paramInt = i;
      if (this.ryU != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.ryU);
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
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bdp localbdp = (bdp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbdp.iwF = locala.vHC.readString();
          return 0;
        case 2: 
          localbdp.sfQ = locala.vHC.rY();
          return 0;
        }
        localbdp.ryU = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bdp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */