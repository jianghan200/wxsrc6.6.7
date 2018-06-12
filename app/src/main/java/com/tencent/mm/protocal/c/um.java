package com.tencent.mm.protocal.c;

public final class um
  extends com.tencent.mm.bk.a
{
  public String jPe;
  public int jTt;
  public int rlz;
  public String rxc;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPe != null) {
        paramVarArgs.g(1, this.jPe);
      }
      paramVarArgs.fT(2, this.rlz);
      if (this.rxc != null) {
        paramVarArgs.g(3, this.rxc);
      }
      paramVarArgs.fT(4, this.jTt);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPe == null) {
        break label308;
      }
    }
    label308:
    for (paramInt = f.a.a.b.b.a.h(1, this.jPe) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rlz);
      paramInt = i;
      if (this.rxc != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rxc);
      }
      return paramInt + f.a.a.a.fQ(4, this.jTt);
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
        um localum = (um)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localum.jPe = locala.vHC.readString();
          return 0;
        case 2: 
          localum.rlz = locala.vHC.rY();
          return 0;
        case 3: 
          localum.rxc = locala.vHC.readString();
          return 0;
        }
        localum.jTt = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/um.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */