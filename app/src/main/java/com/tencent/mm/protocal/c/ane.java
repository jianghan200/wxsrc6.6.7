package com.tencent.mm.protocal.c;

public final class ane
  extends com.tencent.mm.bk.a
{
  public double ees;
  public String fMk;
  public int major;
  public int minor;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.fMk != null) {
        paramVarArgs.g(1, this.fMk);
      }
      paramVarArgs.fT(2, this.major);
      paramVarArgs.fT(3, this.minor);
      paramVarArgs.c(4, this.ees);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fMk == null) {
        break label284;
      }
    }
    label284:
    for (paramInt = f.a.a.b.b.a.h(1, this.fMk) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.major) + f.a.a.a.fQ(3, this.minor) + (f.a.a.b.b.a.ec(4) + 8);
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
        ane localane = (ane)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localane.fMk = locala.vHC.readString();
          return 0;
        case 2: 
          localane.major = locala.vHC.rY();
          return 0;
        case 3: 
          localane.minor = locala.vHC.rY();
          return 0;
        }
        localane.ees = locala.vHC.readDouble();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ane.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */