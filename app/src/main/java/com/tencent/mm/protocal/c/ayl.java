package com.tencent.mm.protocal.c;

public final class ayl
  extends com.tencent.mm.bk.a
{
  public String cac;
  public String hwJ;
  public int sbp;
  public int sbq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.cac != null) {
        paramVarArgs.g(1, this.cac);
      }
      if (this.hwJ != null) {
        paramVarArgs.g(2, this.hwJ);
      }
      paramVarArgs.fT(3, this.sbp);
      paramVarArgs.fT(4, this.sbq);
      return 0;
    }
    if (paramInt == 1) {
      if (this.cac == null) {
        break label308;
      }
    }
    label308:
    for (paramInt = f.a.a.b.b.a.h(1, this.cac) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hwJ != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hwJ);
      }
      return i + f.a.a.a.fQ(3, this.sbp) + f.a.a.a.fQ(4, this.sbq);
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
        ayl localayl = (ayl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localayl.cac = locala.vHC.readString();
          return 0;
        case 2: 
          localayl.hwJ = locala.vHC.readString();
          return 0;
        case 3: 
          localayl.sbp = locala.vHC.rY();
          return 0;
        }
        localayl.sbq = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ayl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */