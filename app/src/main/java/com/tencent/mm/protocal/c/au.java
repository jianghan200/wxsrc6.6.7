package com.tencent.mm.protocal.c;

public final class au
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public String jPG;
  public String jPe;
  public String jSA;
  public String lRx;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPe != null) {
        paramVarArgs.g(1, this.jPe);
      }
      if (this.lRx != null) {
        paramVarArgs.g(2, this.lRx);
      }
      paramVarArgs.fT(3, this.hcE);
      if (this.jSA != null) {
        paramVarArgs.g(4, this.jSA);
      }
      if (this.jPG != null) {
        paramVarArgs.g(5, this.jPG);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPe == null) {
        break label383;
      }
    }
    label383:
    for (paramInt = f.a.a.b.b.a.h(1, this.jPe) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lRx != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.lRx);
      }
      i += f.a.a.a.fQ(3, this.hcE);
      paramInt = i;
      if (this.jSA != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jSA);
      }
      i = paramInt;
      if (this.jPG != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jPG);
      }
      return i;
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
        au localau = (au)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localau.jPe = locala.vHC.readString();
          return 0;
        case 2: 
          localau.lRx = locala.vHC.readString();
          return 0;
        case 3: 
          localau.hcE = locala.vHC.rY();
          return 0;
        case 4: 
          localau.jSA = locala.vHC.readString();
          return 0;
        }
        localau.jPG = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */