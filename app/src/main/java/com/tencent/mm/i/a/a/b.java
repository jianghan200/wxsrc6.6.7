package com.tencent.mm.i.a.a;

public final class b
  extends com.tencent.mm.bk.a
{
  public String daA;
  public int daB;
  public String daC;
  public String userName;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.userName != null) {
        paramVarArgs.g(1, this.userName);
      }
      if (this.daA != null) {
        paramVarArgs.g(2, this.daA);
      }
      paramVarArgs.fT(3, this.daB);
      if (this.daC != null) {
        paramVarArgs.g(4, this.daC);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.userName == null) {
        break label328;
      }
    }
    label328:
    for (paramInt = f.a.a.b.b.a.h(1, this.userName) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.daA != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.daA);
      }
      i += f.a.a.a.fQ(3, this.daB);
      paramInt = i;
      if (this.daC != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.daC);
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
        b localb = (b)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localb.userName = locala.vHC.readString();
          return 0;
        case 2: 
          localb.daA = locala.vHC.readString();
          return 0;
        case 3: 
          localb.daB = locala.vHC.rY();
          return 0;
        }
        localb.daC = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/i/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */