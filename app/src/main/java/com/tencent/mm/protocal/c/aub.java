package com.tencent.mm.protocal.c;

public final class aub
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public int mEc;
  public int rXb;
  public String rvj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rvj != null) {
        paramVarArgs.g(1, this.rvj);
      }
      if (this.hbL != null) {
        paramVarArgs.g(2, this.hbL);
      }
      paramVarArgs.fT(3, this.rXb);
      paramVarArgs.fT(4, this.mEc);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rvj == null) {
        break label308;
      }
    }
    label308:
    for (paramInt = f.a.a.b.b.a.h(1, this.rvj) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hbL);
      }
      return i + f.a.a.a.fQ(3, this.rXb) + f.a.a.a.fQ(4, this.mEc);
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
        aub localaub = (aub)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaub.rvj = locala.vHC.readString();
          return 0;
        case 2: 
          localaub.hbL = locala.vHC.readString();
          return 0;
        case 3: 
          localaub.rXb = locala.vHC.rY();
          return 0;
        }
        localaub.mEc = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/aub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */