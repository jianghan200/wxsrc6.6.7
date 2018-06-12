package com.tencent.mm.protocal.c;

public final class fc
  extends com.tencent.mm.bk.a
{
  public int paB;
  public String paC;
  public String paD;
  public String paE;
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      paramVarArgs.fT(2, this.paB);
      if (this.paC != null) {
        paramVarArgs.g(3, this.paC);
      }
      if (this.paD != null) {
        paramVarArgs.g(4, this.paD);
      }
      if (this.paE != null) {
        paramVarArgs.g(5, this.paE);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label383;
      }
    }
    label383:
    for (paramInt = f.a.a.b.b.a.h(1, this.title) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.paB);
      paramInt = i;
      if (this.paC != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.paC);
      }
      i = paramInt;
      if (this.paD != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.paD);
      }
      paramInt = i;
      if (this.paE != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.paE);
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
        fc localfc = (fc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localfc.title = locala.vHC.readString();
          return 0;
        case 2: 
          localfc.paB = locala.vHC.rY();
          return 0;
        case 3: 
          localfc.paC = locala.vHC.readString();
          return 0;
        case 4: 
          localfc.paD = locala.vHC.readString();
          return 0;
        }
        localfc.paE = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/fc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */